/*
 * Copyright (c) 2015 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *    Manumitting Technologies Inc - refactoring and implementation
 */
package org.eclipse.userstorage.internal;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.util.JSONUtil;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.Credentials;
import org.eclipse.userstorage.spi.ICredentialsProvider;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A session that is based around user/password authentication
 */
public class CredentialedSession extends Session
{
  private String sessionID;

  private String csrfToken;

  public CredentialedSession(IStorageService service, ICredentialsProvider credentialsProvider)
  {
    super(service, credentialsProvider);
  }

  @Override
  protected URI getServiceURI()
  {
    return StringUtil.newURI(service.getServiceURI(), "api/blob/");
  }

  @Override
  public void reset()
  {
    sessionID = null;
    csrfToken = null;
    super.reset();
  }

  @Override
  protected Credentials authenticate(Credentials credentials, boolean reauthentication) throws IOException
  {
    if (sessionID == null)
    {
      reset();

      HttpEntity responseEntity = null;

      try
      {
        credentials = provideCredentials(credentials, reauthentication);

        Map<String, Object> arguments = new LinkedHashMap<String, Object>();
        arguments.put("username", credentials.getUsername());
        arguments.put("password", credentials.getPassword());

        URI uri = StringUtil.newURI(service.getServiceURI(), "api/user/login");

        Request request = configureRequest(Request.Post(uri), uri);
        InputStream body = JSONUtil.build(arguments);
        request.bodyStream(body);

        HttpResponse response = sendRequest(request, uri);
        responseEntity = response.getEntity();

        getStatusCode("POST", uri, response, OK);

        Map<String, Object> object = JSONUtil.parse(responseEntity.getContent(), null);

        sessionID = (String)object.get("sessid");
        if (sessionID == null)
        {
          throw new IOException("No session ID");
        }

        csrfToken = (String)object.get("token");
      }
      catch (IOException ex)
      {
        reset();
        debugResponseEntity(responseEntity);
        throw ex;
      }
    }

    acquireCSRFToken(credentials);
    return credentials;
  }

  protected final void acquireCSRFToken(Credentials credentials) throws IOException
  {
    if (csrfToken == null)
    {
      HttpEntity responseEntity = null;

      try
      {
        URI uri = StringUtil.newURI(service.getServiceURI(), "api/user/token");

        Request request = configureRequest(Request.Post(uri), uri);
        HttpResponse response = sendRequest(request, uri);
        responseEntity = response.getEntity();

        Map<String, Object> object = JSONUtil.parse(responseEntity.getContent(), null);

        csrfToken = (String)object.get("token");
        if (csrfToken == null)
        {
          throw new IOException("No CSRF token");
        }
      }
      catch (IOException ex)
      {
        csrfToken = null;

        debugResponseEntity(responseEntity);

        throw ex;
      }
    }
  }

  @Override
  protected Request configureRequest(Request request, URI uri)
  {
    if (csrfToken != null)
    {
      request.setHeader(CSRF_TOKEN, csrfToken);
    }
    return super.configureRequest(request, uri);
  }
}
