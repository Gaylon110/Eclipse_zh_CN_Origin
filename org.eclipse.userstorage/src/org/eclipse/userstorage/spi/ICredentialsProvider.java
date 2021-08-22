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
package org.eclipse.userstorage.spi;

import org.eclipse.userstorage.IStorage;
import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Activator;

import org.apache.http.client.fluent.Request;

import java.net.URI;

/**
 * Provides the user's credentials for a given {@link IStorage storage} or {@link IStorageService storage service}.
 *
 * It is expected that implementations will extend {@link AbstractCredentialsProvider}.
 *
 * @author Eike Stepper
 * @noimplement
 */
public interface ICredentialsProvider
{
  public static final ICredentialsProvider CANCEL = Activator.CANCEL_CREDENTIALS_PROVIDER;

  /**
   * Attempt to retrieve the credentials from the provided service from local storage.
   * Note that the credentials may be out of date.
   * <p>
   * This call may result in UI interactions with the user, such as to unlock
   * a secure keystore.
   * <p>
   * This call should not result in any network interactions.
   *
   * @return the credentials or {@code null} if unable to retrieve
   * @since 1.1
   */
  public Credentials getCredentials(IStorageService service);

  /**
   * Attempt to retrieve the credentials from the provided service from local storage.
   * Note that the credentials may be out of date.
   * <p>
   * This call will never result in UI interactions with the user.
   * <p>
   * This call should not result in any network interactions.
   *
   * @return true if there appears to be a credential or {@code false} otherwise
   * @since 1.1
   */
  public boolean hasCredentials(IStorageService service);

  /**
   * Obtains the user's credentials for the given {@link IStorageService storage service}.
   * <p>
   * This call may trigger UI interactions with the user.
   * <p>
   * This call may trigger network interactions with the remote service.
   *
   * @param service the storage service for which to provide the user's credentials, must not be <code>null</code>.<p>
   * @param reauthentication <code>true</code> if this method has been called before (and returned wrong credentials), <code>false</code> if this call is the first.
   * @return the user's credentials for the given storage service,
   *         or <code>null</code> as an indication to cancel the authentication process.<p>
   */
  public Credentials provideCredentials(IStorageService service, boolean reauthentication);

  /**
   * Check the validity of the provided credentials pair.
   * @since 1.1
   */
  public boolean isValid(Credentials credentials);

  /**
   * Update the saved credential for given {@link IStorageService storage service},
   * if possible.  Some credential providers do not support updating credentials
   * programmatically.
   * @return true if the credential was updated
   * @since 1.1
   */
  public boolean updateCredentials(IStorageService service, Credentials credential);

  /**
   * Configure the outgoing HTTP request as required by the remote server
   * @since 1.1
   */
  public Request configureRequest(Request request, URI uri, Credentials credentials);
}
