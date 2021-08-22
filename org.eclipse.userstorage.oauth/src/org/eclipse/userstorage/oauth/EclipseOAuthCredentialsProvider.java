/*
 * Copyright (c) 2016 Manumitting Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc - initial API and implementation
 */
package org.eclipse.userstorage.oauth;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Activator;
import org.eclipse.userstorage.internal.Session;
import org.eclipse.userstorage.internal.oauth.AuthToken;
import org.eclipse.userstorage.internal.oauth.OAuthCredentialsPersistence;
import org.eclipse.userstorage.internal.oauth.UIFacade;
import org.eclipse.userstorage.internal.oauth.ui.SWTInternalBrowserFacade;
import org.eclipse.userstorage.internal.util.AES;
import org.eclipse.userstorage.internal.util.IOUtil;
import org.eclipse.userstorage.internal.util.JSONUtil;
import org.eclipse.userstorage.internal.util.ProxyUtil;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.Credentials;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.window.IShellProvider;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.client.utils.DateUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A crendentials provider that authenticates and authorizes using the
 * Eclipse OAuth provider.
 *
 * <p>Normal flow:</p>
 * <ul>
 * <li> REQUEST AUTHORIZATION: GET <tt>https://accounts.eclipse.org/oauth2/authorize?response_type=code&amp;client_id=_XXX_&amp;client_secret=_XXX_&amp;scope=_XXX_%20_XXX_%20_XXX_&amp;redirect_uri=_XXX_&amp;state=_XXX_</tt> </li>
 * <li> This may redirect a bit: <tt>302 Found</tt> <tt>https://accounts.eclipse.org/user/login?destination=oauth2/authorize</tt> </li>
 * <li> LOGIN SUCCESS <tt><em>http://localhost/</em>?code=a74a9f4ec60fa71121ddeb0219d8d9bcee9bf139&amp;state=_XXX_</tt> </li>
 * <li> REQUEST AUTHORIZATION: POST <tt>https://accounts.eclipse.org/oauth2/token</tt> with body <tt>grant_type=authorization_code&amp;client_id=_XXX_&amp;client_secret=_XXX_&amp;redirect_uri=_XXX_&amp;code=_XXX_</tt></li>
 * <li> Should respond with <tt>200 OK</tt> and body is a JSON auth token. Or may respond with a 4XX if the code is invalid.</li>
 * </ul>
 * <p>Error flow:</p>
 * <ul>
 * <li> <tt>https://accounts.eclipse.org/oauth2/authorize?response_type=code&amp;client_id=_XXX_&amp;client_secret=_XXX_&amp;scope=_XXX_%20_XXX_%20_XXX_&amp;redirect_uri=_XXX_&amp;state=_XXX_</tt>
 * <li> <tt><em>http://localhost/</em>?error=access_denied&amp;error_description=The+user+denied+access+to+your+application&amp;state=_XXX_</tt></li>
 * </ul>
 * <p>Refresh flow:</p>
 * <ul>
 * <li> REQUEST AUTHORIZATION: POST <tt>https://accounts.eclipse.org/oauth2/token</tt> with body <tt>grant_type=refresh_token&amp;client_id=_XXX_&amp;client_secret=_XXX_&amp;redirect_uri=_XXX_&amp;refresh_token=_XXX_</tt></li>
 * <li> Should respond with 200 OK and body is a JSON auth token.  Or may respond with a 4XX if the refresh token has expired or has been repudiated.</li>
 * </ul>
 */
public final class EclipseOAuthCredentialsProvider extends OAuthCredentialsProvider
{
  private static final String CONSENT_REQUIRED_ERROR_ID = "consent_required";

  private static final String AUTHORIZATION = "Authorization";

  private static final boolean DEBUG = Boolean.getBoolean("org.eclipse.userstorage.session.debug");

  private static final String PLUGIN_ID = "org.eclipse.userstorage.oauth";

  private static void debug(String message)
  {
    if (DEBUG)
    {
      System.out.println("<EclipseOAuthCredentialsProvider> " + message);
    }
  }

  private static void log(int statusCode, String message, Throwable exception)
  {
    Activator.log(new Status(statusCode, PLUGIN_ID, message, exception));
  }

  private OAuthCredentialsPersistence persister;

  UIFacade uiFacade; // package protected for testing purposes

  private boolean interactive = true;

  /**
   * @param clientId the OAuth identifier assigned to the application
   * @param clientSecret the OAuth secret assigned to the application
   * @param scopes the OAuth scopes requested by this application
   * @param expectedCallback the expected callback URL to indicate success/failure
   */
  public EclipseOAuthCredentialsProvider(String clientId, String clientSecret, String[] scopes, URI expectedCallback) throws URISyntaxException
  {
    this(null, clientId, clientSecret, scopes, expectedCallback);
  }

  /**
   * @param authService if null then use the service's serviceURI
   * @param clientId the OAuth identifier assigned to the application
   * @param clientSecret the OAuth secret assigned to the application
   * @param scopes the OAuth scopes requested by this application
   * @param expectedCallback the expected callback URL to indicate success/failure
   */
  public EclipseOAuthCredentialsProvider(URI authService, String clientId, String clientSecret, String[] scopes, URI expectedCallback)
  {
    super(authService, clientId, clientSecret, scopes, expectedCallback);
    persister = OAuthCredentialsPersistence.standard();
    uiFacade = new SWTInternalBrowserFacade();
  }

  /**
   * @param parameters the parameters object encapsulating the oauth service details, client id and client secret
   */
  public EclipseOAuthCredentialsProvider(OAuthParameters parameters)
  {
    super(parameters);
    persister = OAuthCredentialsPersistence.standard();
    uiFacade = new SWTInternalBrowserFacade();
  }

  public void setShell(IShellProvider provider)
  {
    if (uiFacade instanceof SWTInternalBrowserFacade)
    {
      ((SWTInternalBrowserFacade)uiFacade).setShell(provider);
    }
  }

  @Override
  public Credentials provideCredentials(IStorageService service, boolean reauthentication)
  {
    try
    {
      if (!reauthentication)
      {
        // Try the refresh token
        AuthToken authToken = refreshAuthToken(service);
        if (authToken != null)
        {
          debug("Returning cached credentials");
          return asCredentials(service, authToken);
        }
      }
      if (!isInteractive())
      {
        debug("Non-interactive login process failed");
        return null;
      }

      /* Start the full process */
      debug("Starting OAuth authorization process");
      String providerName = service.getServiceLabel();
      URI authURI = getAuthorizationURI(service);
      URI callbackURI = getRegisteredCallback();
      URI authCodeURI = uiFacade.obtainAuthCode(providerName, authURI, callbackURI);

      if (authCodeURI == null)
      {
        debug("User Cancelled login process");
        return null;
      }
      List<NameValuePair> params = new URIBuilder(authCodeURI).getQueryParams();
      String errorValue = findValue(params, "error");
      if (errorValue != null)
      {
        if (CONSENT_REQUIRED_ERROR_ID.equals(errorValue))
        {
          debug("User cancelled authorization");
          return null;
        }
        debug("Remote reported OAuth Error: " + authCodeURI.getRawQuery());
        uiFacade.showError("OAuth Error", "An error occurred retrieving during the authorization process.",
            new Status(IStatus.ERROR, PLUGIN_ID, "Error returned: " + authCodeURI.getRawQuery()));
        return null;
      }
      debug("Login success: retrieving access token...");
      AuthToken authToken = requestAuthToken(service, authCodeURI);
      if (authToken == null)
      {
        debug("Failed to turn Access Code -> Auth Token");
        uiFacade.showError("OAuth Error", "Unable to retrieve Authorization Code",
            new Status(IStatus.ERROR, PLUGIN_ID, "Unable to turn authorization code to an authoriation token"));
        return null;
      }
      return asCredentials(service, authToken);
    }
    catch (IOException ex)
    {
      log(IStatus.WARNING, "Unable to fetch credential", ex);
      return null;
    }
    catch (URISyntaxException ex)
    {
      log(IStatus.WARNING, "Invalid parameters", ex);
      return null;
    }
  }

  private String findValue(List<NameValuePair> queryParameters, String key)
  {
    for (NameValuePair pair : queryParameters)
    {
      if (key.equals(pair.getName()))
      {
        return pair.getValue();
      }
    }
    return null;
  }

  @Override
  public Request configureRequest(Request request, URI uri, Credentials credentials)
  {
    AuthToken token = AuthToken.deserialize(credentials.getPassword());
    return request.addHeader(AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken());
  }

  @Override
  public boolean isValid(Credentials credentials)
  {
    if (!super.isValid(credentials))
    {
      return false;
    }
    try
    {
      AuthToken token = AuthToken.deserialize(credentials.getPassword());
      return token != null && !token.isExpired() && hasRequiredScopes(token.getScopes());
    }
    catch (IllegalArgumentException e)
    {
      return false;
    }
  }

  /** Verify that we have the set of required scopes */
  private boolean hasRequiredScopes(Set<String> authorizedScopes)
  {
    for (String scope : getScopes())
    {
      if (!authorizedScopes.contains(scope))
      {
        return false;
      }
    }
    return true;
  }

  @Override
  public Credentials getCredentials(IStorageService service)
  {
    AuthToken authToken = retrieveStoredAuthToken(service);
    if (authToken == null || authToken.isExpired())
    {
      return null;
    }
    return asCredentials(service, authToken);
  }

  @Override
  public boolean hasCredentials(IStorageService service)
  {
    AuthToken authToken = retrieveStoredAuthToken(service);
    return authToken != null && !authToken.isExpired();
  }

  private AuthToken requestAuthToken(IStorageService service, URI uri) throws URISyntaxException, IOException
  {
    Pattern codePattern = Pattern.compile(".*[?&]code=([^&]+).*");
    Matcher m = codePattern.matcher(uri.toASCIIString());
    if (!m.matches())
    {
      debug("OAuth Access Code URI doesn't have an access code!");
      return null;
    }
    String accessCode = m.group(1);

    //@formatter:off
    URI authorizationURI = new URIBuilder(getAuthorizationServiceBaseURI(service))
        .setPath("/oauth2/token")
        .build();
    Request request = Request.Post(authorizationURI)
        .bodyForm(
            new BasicNameValuePair("grant_type", "authorization_code"),
            new BasicNameValuePair("client_id", getClientId()),
            new BasicNameValuePair("client_secret", getClientSecret()),
            new BasicNameValuePair("redirect_uri", getRegisteredCallback().toASCIIString()),
            new BasicNameValuePair("code", accessCode));
    //@formatter:on

    Response result = ProxyUtil.proxyAuthentication(executor, authorizationURI).execute(request);
    HttpResponse response = result.returnResponse();
    if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
    {
      log(IStatus.ERROR, "Authorization/authentication failed: " + response, null);
      return null;
    }
    String jsonRep = EntityUtils.toString(response.getEntity());
    Date date = DateUtils.parseDate(response.getFirstHeader("Date").getValue());

    AuthToken authToken = new AuthToken(jsonRep, date);
    String email = retrieveUserDetails(service, authToken);

    persistAuthToken(service, authToken, email);
    return authToken;
  }

  private String retrieveUserDetails(IStorageService service, AuthToken token)
  {
    URI refreshURI;
    if (!contains(getScopes(), "profile"))
    {
      return null;
    }
    try
    {
      refreshURI = new URIBuilder(service.getServiceURI()).setPath("/account/profile").build();
      //@formatter:off
      Request request = Request.Get(refreshURI)
          .addHeader(Session.ACCEPT, ContentType.APPLICATION_JSON.getMimeType())
          .addHeader(Session.CONTENT_TYPE, ContentType.APPLICATION_JSON.getMimeType())
          .addHeader(Session.USER_AGENT, Session.USER_AGENT_ID)
          .addHeader(AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken());
      //@formatter:on
      Response result = ProxyUtil.proxyAuthentication(executor, refreshURI).execute(request);
      HttpResponse response = result.returnResponse();
      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
      {
        return null;
      }
      String jsonRep = EntityUtils.toString(response.getEntity());
      Object o = JSONUtil.parse(IOUtil.streamUTF(jsonRep), null);
      if (!(o instanceof List<?> && ((List<?>)o).get(0) instanceof Map<?, ?>))
      {
        throw new IllegalArgumentException("not a valid profile object");
      }
      return (String)((Map<?, ?>)((List<?>)o).get(0)).get("mail");
    }
    catch (URISyntaxException ex)
    {
      log(IStatus.WARNING, "Unable to construct remote URI", ex);
    }
    catch (ClientProtocolException ex)
    {
      log(IStatus.WARNING, "Unable to request user profile information", ex);
    }
    catch (IOException ex)
    {
      log(IStatus.WARNING, "Unable to parse user profile information", ex);
    }
    return null;
  }

  private boolean contains(String[] scopes, String scope)
  {
    for (String s : scopes)
    {
      if (s.equals(scope))
      {
        return true;
      }
    }
    return false;
  }

  private AuthToken refreshAuthToken(IStorageService service)
  {
    // check to see if we have previously-saved credentials.
    AuthToken authToken = retrieveStoredAuthToken(service);
    if (authToken == null)
    {
      return null;
    }
    if (authToken.getRefreshToken() == null)
    {
      discardStoredAuthToken(service);
      return null;
    }
    try
    {
      //@formatter:off
      URI refreshURI = new URIBuilder(getAuthorizationServiceBaseURI(service))
          .setPath("/oauth2/token")
          .build();
      Request request = Request.Post(refreshURI)
          //.addHeader("Content-Type", ContentType.APPLICATION_FORM_URLENCODED.getMimeType())
          .bodyForm(
              new BasicNameValuePair("grant_type", "refresh_token"),
              new BasicNameValuePair("refresh_token", authToken.getRefreshToken()),
              new BasicNameValuePair("client_id", getClientId()),
              new BasicNameValuePair("client_secret", getClientSecret()));
      //@formatter:on

      Response result = ProxyUtil.proxyAuthentication(executor, refreshURI).execute(request);
      HttpResponse response = result.returnResponse();
      if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
      {
        log(IStatus.WARNING, "Authorization/authentication failed when refreshing auth token: " + response, null);
        discardStoredAuthToken(service);
        return null;
      }
      String jsonRep = EntityUtils.toString(response.getEntity());
      Date date = DateUtils.parseDate(response.getFirstHeader("Date").getValue());

      authToken = new AuthToken(jsonRep, date);
      String email = retrieveUserDetails(service, authToken);
      persistAuthToken(service, authToken, email);
      return authToken;
    }
    catch (IOException ex)
    {
      log(IStatus.ERROR, "Unparseable response", ex);
      return null;
    }
    catch (URISyntaxException ex)
    {
      log(IStatus.ERROR, "Invalid URI", ex);
      return null;
    }
  }

  private AuthToken retrieveStoredAuthToken(IStorageService service)
  {
    try
    {
      String encryptedForm = persister.getAccountToken(getClientId(), getAuthorizationServiceBaseURI(service).toString());
      if (encryptedForm == null)
      {
        return null;
      }

      String serializedForm = AES.decrypt(encryptedForm, getClientSecretAsChars());
      return AuthToken.deserialize(serializedForm);
    }
    catch (IllegalArgumentException e)
    {
      log(IStatus.WARNING, "Unable to deserialize stored token", e);
      return null;
    }
    catch (GeneralSecurityException e)
    {
      log(IStatus.WARNING, "Unable to decrypt stored token", e);
      return null;
    }
  }

  private void discardStoredAuthToken(IStorageService service)
  {
    persister.removeAccountToken(getClientId(), getAuthorizationServiceBaseURI(service).toString());
  }

  private void persistAuthToken(IStorageService service, AuthToken authToken, String email)
  {
    try
    {
      String serializedForm = authToken.serialize();
      String encryptedForm = AES.encrypt(serializedForm, getClientSecretAsChars());
      persister.putAccountToken(getClientId(), getAuthorizationServiceBaseURI(service).toString(), encryptedForm, email);
    }
    catch (GeneralSecurityException e)
    {
      log(IStatus.ERROR, "Unable to encrypt auth token for storage", e);
    }
    catch (IOException e)
    {
      log(IStatus.ERROR, "Unable to serialize auth token for storage", e);
    }
  }

  private Credentials asCredentials(IStorageService service, AuthToken authToken)
  {
    try
    {
      return new Credentials(service.getServiceURI() + "|" + getClientId(), authToken.serialize());
    }
    catch (IOException e)
    {
      log(IStatus.WARNING, "Unable to serialize auth token", e);
      return null;
    }
  }

  /**
   * Generate the URI that starts the User Authorization flow
   */
  protected URI getAuthorizationURI(IStorageService service) throws URISyntaxException
  {
    //@formatter:off
    return new URIBuilder(getAuthorizationServiceBaseURI(service))
  		.setPath("/oauth2/authorize")
  		.addParameter("response_type", "code")
  		.addParameter("client_id", getClientId())
      .addParameter("client_secret", getClientSecret())
      .addParameter("scope", StringUtil.join(" ", getScopes()))
      .addParameter("redirect_uri", getRegisteredCallback().toASCIIString())
      .addParameter("state", stateCode)
      .build();
    //@formatter:on
  }

  public boolean isInteractive()
  {
    return interactive;
  }

  public void setInteractive(boolean interactive)
  {
    this.interactive = interactive;
  }
}
