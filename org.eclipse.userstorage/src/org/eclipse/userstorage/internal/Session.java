/*
 * Copyright (c) 2015 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.userstorage.internal;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.util.IOUtil;
import org.eclipse.userstorage.internal.util.JSONUtil;
import org.eclipse.userstorage.internal.util.ProxyUtil;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.Credentials;
import org.eclipse.userstorage.spi.ICredentialsProvider;
import org.eclipse.userstorage.util.ConflictException;
import org.eclipse.userstorage.util.NotFoundException;
import org.eclipse.userstorage.util.ProtocolException;

import org.eclipse.core.runtime.OperationCanceledException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/**
 * @author Eike Stepper
 */
public abstract class Session implements Headers, Codes
{
  public static final String APPLICATION_JSON = "application/json";

  public static final String USER_AGENT_ID = "uss/1.0.0"; // "uss/1.0.0" or use bundle version if running in OSGi...

  public static final String USER_AGENT_PROPERTY = Session.class.getName() + ".userAgent";

  public static final String NOT_FOUND_ETAG = "not_found";

  private static final int AUTHENTICATION_ATTEMPTS = 3;

  private static final boolean DEBUG = Boolean.getBoolean("org.eclipse.userstorage.session.debug");

  /**
   * It's important that the cookie store is <b>not</b> declared as a static field!
   * Otherwise session cookies could be left over even if the sessionID is set to null and
   * re-authentication would re-send old session cookies, which would make the server reply with "401: CSRF Validation Failed".
   */
  private final CookieStore cookieStore;

  private final Executor executor;

  protected final ICredentialsProvider credentialsProvider;

  protected final IStorageService service;

  protected Session(IStorageService service, ICredentialsProvider credentialsProvider)
  {
    this.service = service;
    this.credentialsProvider = credentialsProvider;
    cookieStore = new org.apache.http.impl.client.BasicCookieStore();
    executor = Executor.newInstance().cookieStore(cookieStore);
  }

  public IStorageService getService()
  {
    return service;
  }

  public void reset()
  {
    // Make sure no old session cookies are sent.
    // Otherwise the server would reply with "401: CSRF Validation Failed".
    cookieStore.clear();
  }

  public Map<String, Map<String, Object>> retrieveProperties(final String applicationToken, int pageSize, int page) throws IOException
  {
    if (pageSize < 1 || pageSize > 100)
    {
      throw new IllegalArgumentException("pageSize=" + pageSize);
    }

    if (page < 1)
    {
      throw new IllegalArgumentException("page=" + page);
    }

    URI uri = StringUtil.newURI(getServiceURI(), applicationToken + "?pagesize=" + pageSize + "&page=" + page);

    return new RequestTemplate<Map<String, Map<String, Object>>>(uri)
    {
      @Override
      protected Request prepareRequest() throws IOException
      {
        return configureRequest(Request.Get(uri), uri);
      }

      @Override
      protected Map<String, Map<String, Object>> handleResponse(HttpResponse response, HttpEntity responseEntity) throws IOException
      {
        getStatusCode("GET", uri, response, OK);
        List<Object> array = JSONUtil.parse(responseEntity.getContent(), null);

        Map<String, Map<String, Object>> result = new HashMap<String, Map<String, Object>>();

        for (Object element : array)
        {
          @SuppressWarnings("unchecked")
          Map<String, Object> map = (Map<String, Object>)element;

          Object appToken = map.remove("application_token");
          if (!applicationToken.equals(appToken))
          {
            StatusLine statusLine = response.getStatusLine();
            String protocolVersion = statusLine == null ? "HTTP" : getProtocolVersion(statusLine);
            throw new ProtocolException("GET", uri, protocolVersion, BAD_RESPONSE, "Bad Response : Wrong application token: " + appToken);
          }

          map.remove("url");

          String key = (String)map.remove("key");
          result.put(key, map);
        }

        return result;
      }
    }.send();
  }

  /** Return the expected USS server endpoint. */
  protected abstract URI getServiceURI();

  public InputStream retrieveBlob(String applicationToken, String key, final Map<String, String> properties, final boolean useETag) throws IOException
  {
    URI uri = StringUtil.newURI(getServiceURI(), applicationToken + "/" + key);

    return new RequestTemplate<InputStream>(uri)
    {
      @Override
      protected Request prepareRequest() throws IOException
      {
        Request request = configureRequest(Request.Get(uri), uri);

        if (useETag)
        {
          String eTag = properties.get(Blob.ETAG);

          if (DEBUG)
          {
            System.out.println("Retrieving etag = " + eTag);
          }

          if (!StringUtil.isEmpty(eTag))
          {
            request.setHeader(IF_NONE_MATCH, "\"" + eTag + "\"");
          }
        }

        return request;
      }

      @Override
      protected InputStream handleResponse(HttpResponse response, HttpEntity responseEntity) throws IOException
      {
        int statusCode = getStatusCode("GET", uri, response, OK, NOT_MODIFIED, NOT_FOUND);

        String eTag = getETag(response);
        if (eTag != null)
        {
          if (DEBUG)
          {
            System.out.println("Retrieved etag = " + eTag);
          }

          properties.put(Blob.ETAG, eTag);
        }

        if (statusCode == OK)
        {
          Map<String, Object> object = JSONUtil.parse(responseEntity.getContent(), "value");
          InputStream stream = (InputStream)object.remove("value");

          for (Map.Entry<String, Object> entry : object.entrySet())
          {
            Object value = entry.getValue();
            properties.put(entry.getKey(), String.valueOf(value));
          }

          return stream;
        }

        if (statusCode == NOT_MODIFIED)
        {
          return Blob.NOT_MODIFIED;
        }

        // Blob wasn't found.
        properties.clear();

        StatusLine statusLine = response.getStatusLine();
        throw new NotFoundException("GET", uri, getProtocolVersion(statusLine), statusLine.getReasonPhrase());
      }
    }.send();
  }

  public boolean updateBlob(String applicationToken, String key, final Map<String, String> properties, final InputStream in)
      throws IOException, ConflictException
  {
    URI uri = StringUtil.newURI(getServiceURI(), applicationToken + "/" + key);

    return new RequestTemplate<Boolean>(uri)
    {
      @Override
      protected Request prepareRequest() throws IOException
      {
        Request request = configureRequest(Request.Put(uri), uri);

        String eTag = properties.get(Blob.ETAG);

        if (DEBUG)
        {
          System.out.println("Updating etag = " + eTag);
        }

        if (!StringUtil.isEmpty(eTag))
        {
          request.setHeader(IF_MATCH, "\"" + eTag + "\"");
        }

        body = JSONUtil.build(Collections.singletonMap("value", in));
        request.bodyStream(body);
        return request;
      }

      @Override
      protected Boolean handleResponse(HttpResponse response, HttpEntity responseEntity) throws IOException
      {
        String eTag = getETag(response);

        int statusCode = getStatusCode("PUT", uri, response, OK, CREATED, CONFLICT);

        if (statusCode == CONFLICT)
        {
          StatusLine statusLine = response.getStatusLine();
          throw new ConflictException("PUT", uri, getProtocolVersion(statusLine), statusLine.getReasonPhrase(), eTag);
        }

        if (eTag == null)
        {
          throw new ProtocolException("PUT", uri, getProtocolVersion(response.getStatusLine()), BAD_RESPONSE, "Bad Response : No ETag");
        }

        if (DEBUG)
        {
          System.out.println("Updated etag = " + eTag);
        }

        properties.put(Blob.ETAG, eTag);
        return statusCode == CREATED;
      }
    }.send();
  }

  public boolean deleteBlob(String applicationToken, String key, final Map<String, String> properties) throws IOException, ConflictException
  {
    URI uri = StringUtil.newURI(getServiceURI(), applicationToken + "/" + key);

    boolean deleted = new RequestTemplate<Boolean>(uri)
    {
      @Override
      protected Request prepareRequest() throws IOException
      {
        Request request = configureRequest(Request.Delete(uri), uri);

        String eTag = properties.get(Blob.ETAG);
        if (!StringUtil.isEmpty(eTag))
        {
          request.setHeader(IF_MATCH, "\"" + eTag + "\"");
        }

        return request;
      }

      @Override
      protected Boolean handleResponse(HttpResponse response, HttpEntity responseEntity) throws IOException
      {
        int statusCode = getStatusCode("DELETE", uri, response, NO_CONTENT, CONFLICT, NOT_FOUND);
        String eTag = getETag(response);

        if (statusCode == CONFLICT)
        {
          StatusLine statusLine = response.getStatusLine();
          throw new ConflictException("DELETE", uri, getProtocolVersion(statusLine), statusLine.getReasonPhrase(), eTag);
        }

        properties.put(Blob.ETAG, "<deleted_etag>");
        return statusCode == NO_CONTENT;
      }
    }.send();

    return deleted;
  }

  public static void debugRequest(Request request)
  {
    if (!DEBUG)
    {
      return;
    }
    System.out.println(formatRequest(request));
  }

  public static String formatRequest(Request request)
  {
    try
    {
      StringBuilder builder = new StringBuilder();
      builder.append(request);
      builder.append('\n');

      Field f1 = Request.class.getDeclaredField("request");
      f1.setAccessible(true);
      Object o1 = f1.get(request);

      Field f2 = Class.forName("org.apache.http.message.AbstractHttpMessage").getDeclaredField("headergroup");
      f2.setAccessible(true);
      Object o2 = f2.get(o1);

      Field f3 = o2.getClass().getDeclaredField("headers");
      f3.setAccessible(true);
      @SuppressWarnings("unchecked")
      List<Header> o3 = (List<Header>)f3.get(o2);

      for (Header header : o3)
      {
        builder.append(header);
        builder.append('\n');
      }
      return builder.toString();
    }
    catch (Throwable ex)
    {
      ex.printStackTrace();
      return ex.toString();
    }
  }

  public static void debugResponse(HttpResponse response, long totalTime)
  {
    if (!DEBUG)
    {
      return;
    }
    System.out.print(formatResponse(response, totalTime));
  }

  public static String formatResponse(HttpResponse response, long totalTime)
  {
    try
    {
      StringBuilder builder = new StringBuilder();
      builder.append(response.getStatusLine());
      builder.append('\n');

      for (Header header : response.getAllHeaders())
      {
        builder.append(header);
        builder.append('\n');
      }

      if (totalTime > 0)
      {
        builder.append("X-Round-Trip: ");
        builder.append(totalTime);
        builder.append(" millis");
        builder.append('\n');
      }

      builder.append('\n');
      return builder.toString();
    }
    catch (Throwable ex)
    {
      ex.printStackTrace();
      return ex.toString();
    }
  }

  public static void debugResponseEntity(HttpEntity responseEntity) throws IOException
  {
    if (DEBUG && responseEntity != null)
    {
      responseEntity.writeTo(System.out);
      System.out.println();
      System.out.println();
    }
  }

  private static String getETag(HttpResponse response)
  {
    Header[] headers = response.getHeaders(Headers.ETAG);
    if (headers != null && headers.length != 0)
    {
      String eTag = headers[0].getValue();
      if (!StringUtil.isEmpty(eTag))
      {
        // Remove the quotes.
        return eTag.substring(1, eTag.length() - 1);
      }
    }

    return null;
  }

  /**
   * @author Eike Stepper
   */
  private abstract class RequestTemplate<T>
  {
    protected final URI uri;

    protected InputStream body;

    public RequestTemplate(URI uri)
    {
      this.uri = uri;
    }

    public final synchronized T send() throws IOException
    {
      int authenticationAttempts = AUTHENTICATION_ATTEMPTS;
      boolean reauthentication = false;

      // Load stored credentials
      Credentials credentials = credentialsProvider.getCredentials(service);
      if (credentials != null)
      {
        if (!credentialsProvider.isValid(credentials))
        {
          credentials = null;
        }
        else
        {
          // The first attempt will be made with the stored credentials, so increase authenticationAttempts to 4 to prompt 3 times.
          ++authenticationAttempts;
        }
      }

      boolean authenticated = false;
      for (;;)
      {
        body = null;
        HttpEntity responseEntity = null;

        try
        {
          authenticated = false;
          credentials = authenticate(credentials, reauthentication);
          authenticated = true;

          Request request = prepareRequest(); // may setup <body>
          request = credentialsProvider.configureRequest(request, uri, credentials);
          HttpResponse response = sendRequest(request, uri);

          IOUtil.closeSilent(body);
          body = null;

          responseEntity = response.getEntity();
          return handleResponse(response, responseEntity);
        }
        catch (IOException ex)
        {
          debugResponseEntity(responseEntity);

          if (ex instanceof ProtocolException)
          {
            ProtocolException protocolException = (ProtocolException)ex;
            if (protocolException.getStatusCode() == AUTHORIZATION_REQUIRED)
            {
              if (authenticated)
              {
                // This means that the initial authenticate() call was skipped because we already have a session,
                // but this session is no longer valid on the server.
                // So call reset() to force a full reauthentication with initial credentials.
                reset();
                continue;
              }

              if (--authenticationAttempts > 0)
              {
                reauthentication = true;
                credentials = null;
                continue;
              }
            }
          }

          throw ex;
        }
        finally
        {
          IOUtil.closeSilent(body);
          body = null;
        }
      }
    }

    protected abstract Request prepareRequest() throws IOException;

    protected abstract T handleResponse(HttpResponse response, HttpEntity responseEntity) throws IOException;
  }

  /**
   * Attempt to authenticate with the remote side; return the updated credentials
   * @returns the update credentials
   * @throws ProtocolException if unable to authenticate
   */
  abstract protected Credentials authenticate(Credentials credentials, boolean reauthentication) throws IOException;

  /**
   * A wrapper around {@link ICredentialsProvider#provideCredentials(IStorageService, boolean)}
   * that operates under a lock to prevent the possibility of multiple storage accesses to the
   * same service from popping up authorization dialogs.
   * @see ICredentialsProvider#provideCredentials(IStorageService, boolean)
   */
  protected final Credentials provideCredentials(Credentials credentials, boolean reauthentication) throws OperationCanceledException
  {
    if (credentials == null)
    {
      Semaphore semaphore = service.getAuthenticationSemaphore();

      try
      {
        semaphore.acquire();

        credentials = credentialsProvider.provideCredentials(service, reauthentication);
      }
      catch (InterruptedException ex)
      {
        //$FALL-THROUGH$
      }
      finally
      {
        semaphore.release();
      }
    }

    if (credentials == null)
    {
      throw new OperationCanceledException("No credentials provided");
    }

    return credentials;
  }

  protected Request configureRequest(Request request, URI uri)
  {
    String userAgent = System.getProperty(USER_AGENT_PROPERTY, USER_AGENT_ID);

    return request //
        .viaProxy(ProxyUtil.getProxyHost(uri)) //
        .staleConnectionCheck(true) //
        .connectTimeout(StorageProperties.getProperty(StorageProperties.CONNECT_TIMEOUT, 3000)) //
        .socketTimeout(StorageProperties.getProperty(StorageProperties.SOCKET_TIMEOUT, 10000)) //
        .addHeader(USER_AGENT, userAgent) //
        .addHeader(CONTENT_TYPE, APPLICATION_JSON) //
        .addHeader(ACCEPT, APPLICATION_JSON);
  }

  protected HttpResponse sendRequest(Request request, URI uri) throws IOException
  {
    long start = System.currentTimeMillis();
    debugRequest(request);

    Response result = ProxyUtil.proxyAuthentication(executor, uri).execute(request);
    HttpResponse response = result.returnResponse();

    debugResponse(response, System.currentTimeMillis() - start);

    return response;
  }

  protected final int getStatusCode(String method, URI uri, HttpResponse response, int... expectedStatusCodes) throws ProtocolException
  {
    StatusLine statusLine = response.getStatusLine();
    if (statusLine == null)
    {
      throw new ProtocolException(method, uri, getProtocolVersion(statusLine), BAD_RESPONSE, "Bad Response : No status line returned");
    }

    int statusCode = statusLine.getStatusCode();
    if (statusCode == AUTHORIZATION_REQUIRED)
    {
      reset();
    }

    for (int i = 0; i < expectedStatusCodes.length; i++)
    {
      int expectedStatusCode = expectedStatusCodes[i];
      if (statusCode == expectedStatusCode)
      {
        return statusCode;
      }
    }

    throw new ProtocolException(method, uri, getProtocolVersion(statusLine), statusCode, statusLine.getReasonPhrase());
  }

  protected final String getProtocolVersion(StatusLine statusLine)
  {
    if (statusLine != null)
    {
      ProtocolVersion protocolVersion = statusLine.getProtocolVersion();
      if (protocolVersion != null)
      {
        return protocolVersion.toString();
      }
    }

    return "HTTP";
  }

  public void close()
  {
    reset();
  }
}

/**
 * @author Eike Stepper
 */
interface Headers
{
  public static final String USER_AGENT = "User-Agent";

  public static final String CONTENT_TYPE = "Content-Type";

  public static final String ACCEPT = "Accept";

  public static final String CSRF_TOKEN = "X-CSRF-Token";

  public static final String ETAG = "ETag";

  public static final String IF_MATCH = "If-Match";

  public static final String IF_NONE_MATCH = "If-None-Match";
}

/**
 * @author Eike Stepper
 */
interface Codes
{
  public static final int OK = 200;

  public static final int CREATED = 201;

  public static final int NO_CONTENT = 204;

  public static final int NOT_MODIFIED = 304;

  public static final int BAD_REQUEST = 400;

  public static final int AUTHORIZATION_REQUIRED = 401;

  public static final int FORBIDDEN = 403;

  public static final int NOT_FOUND = 404;

  public static final int NOT_ACCEPTABLE = 406;

  public static final int CONFLICT = 409;

  public static final int BAD_RESPONSE = 444;
}
