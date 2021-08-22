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
package org.eclipse.userstorage.internal.oauth;

import org.eclipse.userstorage.internal.util.StringUtil;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;

import org.osgi.framework.FrameworkUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * Manages persisting and retrieving OAuth credentials.
 */
public class OAuthCredentialsPersistence
{
  private static final String PROPERTY_PERSISTENCE = "org.eclipse.userstorage.oauth.persistence";

  private static final String KEY_SEPARATOR = "/";

  private static final String KEY_TOKEN = "token:";

  private static final String KEY_EMAIL = "email:";

  public static OAuthCredentialsPersistence standard()
  {
    if (System.getProperty(PROPERTY_PERSISTENCE) != null && !Boolean.getBoolean(PROPERTY_PERSISTENCE))
    {
      return null;
    }

    return new OAuthCredentialsPersistence(getPersistenceFile());
  }

  private static File getPersistenceFile()
  {
    IPath path = Platform.getStateLocation(FrameworkUtil.getBundle(OAuthCredentialsPersistence.class));
    return path.append(PROPERTY_PERSISTENCE).toFile();
  }

  public class LinkedAccount
  {
    public String clientId;

    public String authURI;

    public String email;

    public LinkedAccount(String clientId, String authURI, String email)
    {
      this.authURI = authURI;
      this.clientId = clientId;
      this.email = email;
    }
  }

  /** The location where the credentials are persisted. */
  private File location;

  public OAuthCredentialsPersistence(File location)
  {
    this.location = location;
  }

  public LinkedAccount[] getLinkedAccounts()
  {
    if (!location.exists())
    {
      return new LinkedAccount[0];
    }
    Map<String, String> tokens = new HashMap<String, String>();
    Map<String, String> emails = new HashMap<String, String>();
    Properties properties = load();

    for (Entry<Object, Object> entry : properties.entrySet())
    {
      String key = (String)entry.getKey();
      String value = (String)entry.getValue();
      if (key.startsWith(KEY_TOKEN))
      {
        tokens.put(key.substring(KEY_TOKEN.length()), value);
      }
      if (key.startsWith(KEY_EMAIL))
      {
        emails.put(key.substring(KEY_EMAIL.length()), value);
      }
    }
    List<LinkedAccount> accounts = new ArrayList<LinkedAccount>();
    for (Entry<String, String> entry : tokens.entrySet())
    {
      String[] components = entry.getKey().split(KEY_SEPARATOR);
      accounts.add(new LinkedAccount(StringUtil.decodeURI(components[0]), StringUtil.decodeURI(components[1]), emails.get(entry.getKey())));
    }
    return accounts.toArray(new LinkedAccount[accounts.size()]);
  }

  public void removeLinkedAccounts(List<LinkedAccount> toRemove)
  {
    for (LinkedAccount account : toRemove)
    {
      removeAccountToken(account.clientId, account.authURI);
    }
  }

  public String getAccountToken(String clientId, String authURI)
  {
    if (!location.exists())
    {
      return null;
    }
    Properties properties = load();
    return (String)properties.get(KEY_TOKEN + StringUtil.encodeURI(clientId) + KEY_SEPARATOR + StringUtil.encodeURI(authURI));
  }

  public void putAccountToken(String clientId, String authURI, String token, String email)
  {
    Properties properties = load();

    properties.put(KEY_TOKEN + StringUtil.encodeURI(clientId) + KEY_SEPARATOR + StringUtil.encodeURI(authURI), token);
    if (email != null && email.length() > 0)
    {
      properties.put(KEY_EMAIL + StringUtil.encodeURI(clientId) + KEY_SEPARATOR + StringUtil.encodeURI(authURI), email);
    }

    save(properties);
  }

  public boolean removeAccountToken(String clientId, String authURI)
  {
    if (!location.exists())
    {
      return false;
    }
    Properties properties = load();

    Object found = properties.remove(KEY_TOKEN + StringUtil.encodeURI(clientId) + KEY_SEPARATOR + StringUtil.encodeURI(authURI));
    properties.remove(KEY_EMAIL + StringUtil.encodeURI(clientId) + KEY_SEPARATOR + StringUtil.encodeURI(authURI));

    save(properties);
    return found != null;
  }

  private Properties load()
  {
    Properties properties = new Properties();
    if (location.exists())
    {
      InputStream input = null;
      try
      {
        input = new FileInputStream(location);
        properties.loadFromXML(input);
      }
      catch (IOException e)
      {
        // ignore
      }
      finally
      {
        try
        {
          if (input != null)
          {
            input.close();
          }
        }
        catch (IOException e)
        {
          // ignore
        }
      }
    }
    return properties;
  }

  private void save(Properties properties)
  {
    OutputStream output = null;
    try
    {
      output = new FileOutputStream(location);
      properties.storeToXML(output, "credentials");
      output.close();
    }
    catch (IOException e)
    {
      // ignore
    }
    finally
    {
      try
      {
        if (output != null)
        {
          output.close();
        }
      }
      catch (IOException e)
      {
        // ignore
      }
    }
  }
}
