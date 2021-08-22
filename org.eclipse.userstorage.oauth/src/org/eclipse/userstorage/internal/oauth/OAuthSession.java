/*
 * Copyright (c) 2016 Manumitting Technologies Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc - initial API and implementation
 */
package org.eclipse.userstorage.internal.oauth;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Session;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.oauth.OAuthCredentialsProvider;
import org.eclipse.userstorage.spi.Credentials;

import java.io.IOException;
import java.net.URI;

/**
 */
public class OAuthSession extends Session
{
  public OAuthSession(IStorageService service, OAuthCredentialsProvider credentialsProvider)
  {
    super(service, credentialsProvider);
  }

  @Override
  protected URI getServiceURI()
  {
    return StringUtil.newURI(service.getServiceURI(), "uss/blob/");
  }

  @Override
  protected Credentials authenticate(Credentials credentials, boolean reauthentication) throws IOException
  {
    if (credentials != null && credentialsProvider.isValid(credentials))
    {
      return credentials;
    }
    credentials = provideCredentials(credentials, reauthentication);
    return credentials;
  }

  @Override
  public void reset()
  {
    super.reset();
  }

}
