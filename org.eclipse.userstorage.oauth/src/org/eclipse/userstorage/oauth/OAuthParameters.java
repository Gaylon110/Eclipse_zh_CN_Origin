/*
 * Copyright (c) 2010 The Eclipse Foundation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eike Stepper - initial API and implementation
 *     Yatta Solutions - Generalization and move to USS API
 */
package org.eclipse.userstorage.oauth;

import org.eclipse.userstorage.internal.util.StringUtil;

import org.eclipse.core.runtime.Platform;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Random;

/**
 * @author Carsten Reckord
 * @author Eike Stepper
 */
public abstract class OAuthParameters
{
  public static final String PROP_SERVICE = ".oauth.service";

  public static final String PROP_EXPECTED_CALLBACK = ".oauth.expected.callback";

  public static final String PROP_SCOPES = ".oauth.scopes";

  public static final String PROP_CLIENT_ID = ".oauth.client.id";

  public static final String PROP_CLIENT_SECRET = ".oauth.client.secret";

  public static final String PROP_CLIENT_KEY = ".oauth.client.key";

  public static final String DEFAULT_SERVICE = "https://accounts.eclipse.org/";

  public static final String DEFAULT_EXPECTED_CALLBACK = "http://localhost/";

  private static final String[] DEFAULT_SCOPES = { "profile", "uss_retrieve", "uss_update" };

  private final BundleContext bundleContext;

  protected OAuthParameters()
  {
    bundleContext = Platform.isRunning() ? FrameworkUtil.getBundle(getClass()).getBundleContext() : null;
  }

  protected abstract String getServiceName();

  String getDecryptedClientID()
  {
    return getDecryptedValue(getServiceName() + PROP_CLIENT_ID, getDefaultClientId());
  }

  protected abstract String getDefaultClientId();

  String getDecryptedClientSecret()
  {
    return getDecryptedValue(getServiceName() + PROP_CLIENT_SECRET, getDefaultClientSecret());
  }

  protected abstract String getDefaultClientSecret();

  public URI getService()
  {
    String serviceAddress = getProperty(getServiceName() + PROP_SERVICE, getDefaultService());
    return URI.create(serviceAddress);
  }

  protected String getDefaultService()
  {
    return DEFAULT_SERVICE;
  }

  public URI getExpectedCallback()
  {
    String expectedCallbackAddress = getProperty(getServiceName() + PROP_EXPECTED_CALLBACK, getDefaultExpectedCallback());
    return URI.create(expectedCallbackAddress);
  }

  protected String getDefaultExpectedCallback()
  {
    return DEFAULT_EXPECTED_CALLBACK;
  }

  public String[] getScopes()
  {
    String scopesStr = getProperty(getServiceName() + PROP_SCOPES, null);
    return scopesStr != null ? initScopes(scopesStr) : getDefaultScopes();
  }

  protected String[] getDefaultScopes()
  {
    return DEFAULT_SCOPES;
  }

  protected abstract String getDefaultClientKey();

  private String getDecryptedValue(String propName, String defaultValue)
  {
    try
    {
      String property = getProperty(propName);
      if (!isEmpty(property))
      {
        String key = getProperty(getServiceName() + PROP_CLIENT_KEY);
        if (!isEmpty(key))
        {
          return decrypt(property, key);
        }

        return property;
      }
    }
    catch (Throwable ex)
    {
      //$FALL-THROUGH$
    }

    return decrypt(defaultValue, getDefaultClientKey());
  }

  private static boolean isEmpty(String s)
  {
    return s == null || s.length() == 0;
  }

  protected final String getProperty(String propName)
  {
    return getProperty(propName, null);
  }

  protected String getProperty(String propName, String defaultValue)
  {
    String value = bundleContext == null ? System.getProperty(propName) : bundleContext.getProperty(propName);
    if (value == null)
    {
      value = defaultValue;
    }
    return value;
  }

  private static String decrypt(String str, String key)
  {
    byte[] keyBytes = hexToBytes(key);
    byte[] bytes = hexToBytes(str);
    byte[] result = new byte[bytes.length - 1];

    int j = bytes[result.length] - Byte.MIN_VALUE;
    crypt(bytes, result, keyBytes, result.length, j);
    try
    {
      return new String(result, StringUtil.UTF8);
    }
    catch (UnsupportedEncodingException e)
    {
      throw new IllegalArgumentException(e);
    }
  }

  private static byte[] hexToBytes(String hexStr)
  {
    int hexStrLen = hexStr.length();
    if ((hexStrLen & 1) == 1)
    {
      hexStr = '0' + hexStr;
      hexStrLen++;
    }
    byte[] out = new byte[hexStrLen / 2];

    // Safe to assume the string is even length
    byte b1, b2;
    for (int i = 0; i < hexStrLen; i += 2)
    {
      b1 = (byte)Character.digit(hexStr.charAt(i), 16);
      b2 = (byte)Character.digit(hexStr.charAt(i + 1), 16);
      if (b1 < 0 || b2 < 0)
      {
        throw new NumberFormatException(hexStr);
      }

      out[i / 2] = (byte)(b1 << 4 | b2 & 0xff);
    }
    return out;
  }

  private static String bytesToHex(byte[] bs)
  {
    StringBuilder builder = new StringBuilder(bs.length * 2);

    for (byte element : bs)
    {
      builder.append(Character.forDigit(element >>> 4 & 0xf, 16));
      builder.append(Character.forDigit(element & 0xf, 16));
    }
    return builder.toString();
  }

  private static byte[] encrypt(String str, byte[] key, Random random) throws UnsupportedEncodingException
  {
    byte[] bytes = str.getBytes("UTF-8");
    byte[] result = new byte[bytes.length + 1];

    int j = random.nextInt(key.length);
    result[bytes.length] = (byte)(j + Byte.MIN_VALUE);
    crypt(bytes, result, key, bytes.length, j);
    return result;
  }

  private static void crypt(byte[] bytes, byte[] result, byte[] key, int length, int j)
  {
    for (int i = 0; i < length; i++)
    {
      result[i] = (byte)(bytes[i] ^ key[j++ % key.length]);
    }
  }

  private static String[] initScopes(String property)
  {
    try
    {
      if (!isEmpty(property))
      {
        return property.split(","); //$NON-NLS-1$
      }
    }
    catch (Throwable ex)
    {
      //$FALL-THROUGH$
    }

    return DEFAULT_SCOPES;
  }

  /**
   * Run to create encrypted client parameters for your client
   */
  public static void main(String[] args) throws Exception
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Client ID: ");
    String clientID = reader.readLine();

    System.out.print("Client Secret: ");
    String clientSecret = reader.readLine();

    int keyLength = Math.max(clientID.length(), clientSecret.length());
    byte[] key = new byte[keyLength];

    Random random = new Random(System.currentTimeMillis());
    random.nextBytes(key);

    clientID = bytesToHex(encrypt(clientID, key, random));
    clientSecret = bytesToHex(encrypt(clientSecret, key, random));
    String clientKey = bytesToHex(key);

    System.out.println();
    System.out.println("private static final String CLIENT_ID = \"" + clientID + "\";");
    System.out.println("private static final String CLIENT_SECRET = \"" + clientSecret + "\";");
    System.out.println("private static final String CLIENT_KEY = \"" + clientKey + "\";");
    System.out.println();

  }

}
