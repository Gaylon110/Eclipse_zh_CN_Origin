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
package org.eclipse.userstorage.ui.internal;

import org.eclipse.userstorage.IStorageService;
import org.eclipse.userstorage.internal.Activator;
import org.eclipse.userstorage.internal.CredentialedSession;
import org.eclipse.userstorage.internal.Session;
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.AbstractCredentialsProvider;
import org.eclipse.userstorage.spi.Credentials;

import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.StorageException;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Eike Stepper
 */
public final class DialogCredentialsProvider extends AbstractCredentialsProvider
{
  public static final DialogCredentialsProvider INSTANCE = new DialogCredentialsProvider();

  private static final String USERNAME_KEY = "username";

  private static final String PASSWORD_KEY = "password";

  @Override
  public Credentials provideCredentials(final IStorageService service, final boolean reauthentication)
  {
    final Credentials[] credentials = { null };

    try
    {
      final Shell shell = UIUtil.getShell();
      shell.getDisplay().syncExec(new Runnable()
      {
        @Override
        public void run()
        {
          CredentialsDialog dialog = new CredentialsDialog(shell, service, reauthentication);
          if (dialog.open() == CredentialsDialog.OK)
          {
            credentials[0] = dialog.getCredentials();
          }
        }
      });
    }
    catch (Throwable ex)
    {
      Activator.log(ex);
    }

    return credentials[0];
  }

  @Override
  public Credentials getCredentials(IStorageService service)
  {
    try
    {
      ISecurePreferences securePreferences = Activator.getSecurePreferences();
      if (securePreferences == null)
      {
        return null;
      }
      String serviceNode = StringUtil.encodeURI(service.getServiceURI());
      securePreferences = securePreferences.node(serviceNode);
      if (securePreferences != null)
      {
        String username = securePreferences.get(USERNAME_KEY, null);
        String password = securePreferences.get(PASSWORD_KEY, null);

        if (StringUtil.isEmpty(username))
        {
          username = null;
        }

        if (StringUtil.isEmpty(password))
        {
          password = null;
        }

        if (username != null || password != null)
        {
          return new Credentials(username, password);
        }
      }
    }
    catch (StorageException ex)
    {
      logSecureStorageProblem(ex);
    }
    return null;
  }

  @Override
  public boolean updateCredentials(IStorageService service, Credentials credentials)
  {
    try
    {
      ISecurePreferences securePreferences = Activator.getSecurePreferences();
      if (securePreferences == null)
      {
        return false;
      }
      String serviceNode = StringUtil.encodeURI(service.getServiceURI());
      securePreferences = securePreferences.node(serviceNode);
      if (securePreferences == null)
      {
        return false;
      }
      String username = credentials == null ? null : credentials.getUsername();
      if (StringUtil.isEmpty(username))
      {
        securePreferences.remove(USERNAME_KEY);
      }
      else
      {
        securePreferences.put(USERNAME_KEY, username, false);
      }

      String password = credentials == null ? null : credentials.getPassword();
      if (StringUtil.isEmpty(password))
      {
        securePreferences.remove(PASSWORD_KEY);
      }
      else
      {
        securePreferences.put(PASSWORD_KEY, password, true);
      }

      securePreferences.flush();
      return true;
    }
    catch (Exception ex)
    {
      logSecureStorageProblem(ex);
      return false;
    }
  }

  private static void logSecureStorageProblem(Exception ex)
  {
    /*
     * if (QUIET_SECURE_STORAGE_EXCEPTION && ex instanceof StorageException) { return; }
     */

    Activator.log(ex);
  }

  @Override
  public Session openSession(IStorageService service)
  {
    return new CredentialedSession(service, this);
  }
}
