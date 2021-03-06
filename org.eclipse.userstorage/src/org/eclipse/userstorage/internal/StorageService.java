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
import org.eclipse.userstorage.internal.util.StringUtil;
import org.eclipse.userstorage.spi.Credentials;
import org.eclipse.userstorage.spi.ICredentialsProvider;

import org.eclipse.equinox.security.storage.ISecurePreferences;
import org.eclipse.equinox.security.storage.StorageException;

import java.net.URI;
import java.util.concurrent.Semaphore;

/**
 * @author Eike Stepper
 */
public class StorageService implements IStorageService
{
  private static final String TERMS_OF_USE_AGREED_KEY = "termsOfUseAgreed";

  private static final boolean QUIET_SECURE_STORAGE_EXCEPTION = Boolean.getBoolean("org.eclipse.userstorage.quietSecureStorageException");

  private final Semaphore authenticationSemaphore = new Semaphore(1);

  private final String serviceLabel;

  private final URI serviceURI;

  private final URI createAccountURI;

  private final URI editAccountURI;

  private final URI recoverPasswordURI;

  private final String termsOfUseLink;

  private ICredentialsProvider credentialsProvider;

  public StorageService(String serviceLabel, URI serviceURI, URI createAccountURI, URI editAccountURI, URI recoverPasswordURI, String termsOfUseLink)
  {
    if (StringUtil.isEmpty(serviceLabel))
    {
      throw new IllegalArgumentException("Service label is null or empty");
    }

    if (serviceURI == null)
    {
      throw new IllegalArgumentException("Service URI is null");
    }

    this.serviceLabel = serviceLabel;
    this.serviceURI = serviceURI;
    this.createAccountURI = createAccountURI;
    this.editAccountURI = editAccountURI;
    this.recoverPasswordURI = recoverPasswordURI;
    this.termsOfUseLink = termsOfUseLink;
  }

  @Override
  public String getServiceLabel()
  {
    return serviceLabel;
  }

  @Override
  public URI getServiceURI()
  {
    return serviceURI;
  }

  @Override
  public URI getCreateAccountURI()
  {
    return createAccountURI;
  }

  @Override
  public URI getEditAccountURI()
  {
    return editAccountURI;
  }

  @Override
  public URI getRecoverPasswordURI()
  {
    return recoverPasswordURI;
  }

  @Override
  public String getTermsOfUseLink()
  {
    return termsOfUseLink;
  }

  @Override
  public Semaphore getAuthenticationSemaphore()
  {
    return authenticationSemaphore;
  }

  public Credentials getCredentials()
  {
    if (credentialsProvider == null)
    {
      return null;
    }
    return credentialsProvider.getCredentials(this);
  }

  public boolean setCredentials(Credentials credentials)
  {
    if (credentialsProvider == null)
    {
      return false;
    }
    return credentialsProvider.updateCredentials(this, credentials);
  }

  public boolean isTermsOfUseAgreed()
  {
    try
    {
      ISecurePreferences securePreferences = getSecurePreferences();
      if (securePreferences != null)
      {
        String value = securePreferences.get(TERMS_OF_USE_AGREED_KEY, null);
        if ("true".equalsIgnoreCase(value))
        {
          return true;
        }
      }
    }
    catch (Exception ex)
    {
      logSecureStorageProblem(ex);
    }

    return false;
  }

  public void setTermsOfUseAgreed(boolean agreed)
  {
    try
    {
      ISecurePreferences securePreferences = getSecurePreferences();
      if (securePreferences != null)
      {
        if (agreed)
        {
          securePreferences.putBoolean(TERMS_OF_USE_AGREED_KEY, true, false);
        }
        else
        {
          securePreferences.remove(TERMS_OF_USE_AGREED_KEY);
        }

        securePreferences.flush();
      }
    }
    catch (Exception ex)
    {
      logSecureStorageProblem(ex);
    }
  }

  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + (serviceURI == null ? 0 : serviceURI.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }

    if (obj == null)
    {
      return false;
    }

    if (getClass() != obj.getClass())
    {
      return false;
    }

    StorageService other = (StorageService)obj;
    if (serviceURI == null)
    {
      if (other.serviceURI != null)
      {
        return false;
      }
    }
    else if (!serviceURI.equals(other.serviceURI))
    {
      return false;
    }

    return true;
  }

  @Override
  public int compareTo(IStorageService o)
  {
    return serviceLabel.compareTo(o.getServiceLabel());
  }

  @Override
  public String toString()
  {
    return serviceLabel;
  }

  public ISecurePreferences getSecurePreferences()
  {
    ISecurePreferences securePreferences = Activator.getSecurePreferences();
    if (securePreferences != null)
    {
      String serviceNode = StringUtil.encodeURI(serviceURI);
      return securePreferences.node(serviceNode);
    }

    return null;
  }

  ICredentialsProvider getCredentialsProvider()
  {
    if (credentialsProvider == null)
    {
      // FIXME: we should specify a default on the service definition
      String property = System.getProperty(StorageProperties.CREDENTIALS_PROVIDER, null);
      if (property != null)
      {
        try
        {
          @SuppressWarnings("unchecked")
          Class<ICredentialsProvider> c = (Class<ICredentialsProvider>)Class.forName(property);
          credentialsProvider = c.newInstance();
        }
        catch (Throwable ex)
        {
          Activator.log(ex);
        }
      }

      if (credentialsProvider == null)
      {
        credentialsProvider = Activator.getCredentialsProvider();
      }
    }

    return credentialsProvider;
  }

  private static void logSecureStorageProblem(Exception ex)
  {
    if (QUIET_SECURE_STORAGE_EXCEPTION && ex instanceof StorageException)
    {
      return;
    }

    Activator.log(ex);
  }

  /**
   * @author Eike Stepper
   */
  public static final class DynamicService extends StorageService implements IStorageService.Dynamic
  {
    public DynamicService(String serviceLabel, URI serviceURI, URI createAccountURI, URI editAccountURI, URI recoverPasswordURI, String termsOfUseLink)
    {
      super(serviceLabel, serviceURI, createAccountURI, editAccountURI, recoverPasswordURI, termsOfUseLink);
    }

    @Override
    public void remove()
    {
      StorageServiceRegistry.INSTANCE.removeService(this);

      ISecurePreferences securePreferences = getSecurePreferences();
      if (securePreferences != null)
      {
        try
        {
          ISecurePreferences parent = securePreferences.parent();
          securePreferences.removeNode();
          parent.flush();
        }
        catch (Exception ex)
        {
          Activator.log(ex);
        }
      }
    }
  }
}
