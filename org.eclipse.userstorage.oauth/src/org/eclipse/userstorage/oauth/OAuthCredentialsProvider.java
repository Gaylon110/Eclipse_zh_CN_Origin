/*
 * Copyright (c) 2016 Manumitting Technologies Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc. - initial API and implementation
 */
package org.eclipse.userstorage.oauth;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Session;
import org.eclipse.userstorage.internal.oauth.OAuthSession;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.AbstractCredentialsProvider;

import org.apache.http.client.fluent.Executor;

import java.net.URI;

/**
 * Base class for OAuth providers.
 */
public abstract class OAuthCredentialsProvider extends AbstractCredentialsProvider
{
  protected final Executor executor = createExecutor();

  private final String clientId;

  /** The client secret, stored in a mildly enciphered form. */
  private final byte[] encipheredClientSecret;

  private final String[] scopes;

  private final URI callback;

  private final URI authServiceBaseURI;

  protected String stateCode;

  /**
   * @param authService if null then use the service's serviceURI
   * @param clientId the OAuth identifier assigned to the application
   * @param clientSecret the OAuth secret assigned to the application
   * @param scopes the OAuth scopes requested by this application
   * @param expectedCallback the expected callback URL to indicate success/failure
   */
  protected OAuthCredentialsProvider(URI authService, String clientId, String clientSecret, String[] scopes, URI expectedCallback)
  {
    authServiceBaseURI = authService;
    this.clientId = clientId;
    encipheredClientSecret = StringUtil.encrypt(clientSecret);
    this.scopes = scopes;
    callback = expectedCallback;
    stateCode = Double.toString(Math.random());
  }

  /**
   * @param parameters the parameters object encapsulating the oauth service details, client id and client secret
   */
  protected OAuthCredentialsProvider(OAuthParameters parameters)
  {
    this(parameters.getService(), parameters.getDecryptedClientID(), parameters.getDecryptedClientSecret(), parameters.getScopes(),
        parameters.getExpectedCallback());
  }

  protected Executor createExecutor()
  {
    return Executor.newInstance();
  }

  protected URI getAuthorizationServiceBaseURI(IStorageService service)
  {
    return authServiceBaseURI == null ? service.getServiceURI() : authServiceBaseURI;
  }

  protected String getClientId()
  {
    return clientId;
  }

  protected String getClientSecret()
  {
    return StringUtil.decrypt(encipheredClientSecret);
  }

  protected char[] getClientSecretAsChars()
  {
    return StringUtil.decryptAsChars(encipheredClientSecret);
  }

  protected String[] getScopes()
  {
    return scopes;
  }

  protected URI getRegisteredCallback()
  {
    return callback;
  }

  @Override
  public Session openSession(IStorageService service)
  {
    return new OAuthSession(service, this);
  }

  /** Intended for testing purposes only. */
  public void setStateCode(String stateCode)
  {
    this.stateCode = stateCode;
  }
}
