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
package org.eclipse.userstorage.spi;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Session;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.util.NoServiceException;

import org.apache.http.client.fluent.Request;

import java.net.URI;

/**
 * Provides a base class for credentials providers.
 * @since 1.1
 */
public abstract class AbstractCredentialsProvider implements ICredentialsProvider
{
  @Override
  public boolean hasCredentials(IStorageService service)
  {
    return false;
  }

  @Override
  public Credentials getCredentials(IStorageService service)
  {
    return null;
  }

  @Override
  public boolean updateCredentials(IStorageService service, Credentials credentials)
  {
    return false;
  }

  @Override
  public boolean isValid(Credentials credentials)
  {
    return !StringUtil.isEmpty(credentials.getUsername()) && !StringUtil.isEmpty(credentials.getPassword());
  }

  @Override
  public Request configureRequest(Request request, URI uri, Credentials credentials)
  {
    return request;
  }

  public Session openSession(IStorageService service) throws NoServiceException
  {
    throw new NoServiceException();
  }

}
