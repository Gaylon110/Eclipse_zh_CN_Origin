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
package org.eclipse.userstorage.internal.util;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

/**
 * @author Eike Stepper
 */
public final class StringUtil
{
  public static final String EMPTY = ""; //$NON-NLS-1$

  public static final String UTF8 = "UTF-8"; //$NON-NLS-1$

  private static final byte[] NO_BYTES = {};

  private static final byte[] KEY = new byte[256];

  private static Random random;

  private StringUtil()
  {
  }

  public static boolean isEmpty(String str)
  {
    return str == null || str.length() == 0;
  }

  public static String safe(String str)
  {
    return safe(str, EMPTY);
  }

  public static String safe(String str, String def)
  {
    if (str == null)
    {
      return def;
    }

    return str;
  }

  public static String charToHex(char ch)
  {
    return Integer.toHexString(ch).toUpperCase(Locale.ENGLISH);
  }

  public static char hexToChar(String s) throws NumberFormatException
  {
    return (char)Integer.parseInt(s, 16);
  }

  public static byte[] toUTF(String str) throws RuntimeException
  {
    if (str == null)
    {
      return null;
    }

    if (str.length() == 0)
    {
      return NO_BYTES;
    }

    try
    {
      return str.getBytes(UTF8);
    }
    catch (UnsupportedEncodingException ex)
    {
      throw new RuntimeException(ex);
    }
  }

  public static String fromUTF(byte[] bytes) throws RuntimeException
  {
    if (bytes == null)
    {
      return null;
    }

    if (bytes.length == 0)
    {
      return EMPTY;
    }

    try
    {
      return new String(bytes, UTF8);
    }
    catch (UnsupportedEncodingException ex)
    {
      throw new RuntimeException(ex);
    }
  }

  public static URI newURI(String uri) throws RuntimeException
  {
    if (isEmpty(uri))
    {
      return null;
    }

    try
    {
      return new URI(uri);
    }
    catch (URISyntaxException ex)
    {
      throw new RuntimeException(ex);
    }
  }

  public static URI newURI(URI uri, String path) throws RuntimeException
  {
    if (isEmpty(path))
    {
      return uri;
    }

    String result = uri.toString();
    if (!result.endsWith("/"))
    {
      result += "/";
    }

    if (path.startsWith("/"))
    {
      result += path.substring(1);
    }
    else
    {
      result += path;
    }

    return newURI(result);
  }

  public static String encodeURI(URI uri)
  {
    return encodeURI(uri.toString());
  }

  public static String decodeURI(String encoded)
  {
    try
    {
      return URLDecoder.decode(encoded, UTF8);
    }
    catch (UnsupportedEncodingException ex)
    {
      // UTF-8 should always be available.
      return encoded;
    }
  }

  public static String encodeURI(String uri)
  {
    try
    {
      uri = URLEncoder.encode(uri, UTF8);
    }
    catch (UnsupportedEncodingException ex)
    {
      // UTF-8 should always be available.
    }

    return uri;
  }

  public static byte[] encrypt(String str) throws RuntimeException
  {
    if (str == null)
    {
      return null;
    }

    if (str.length() == 0)
    {
      return NO_BYTES;
    }

    byte[] bytes = toUTF(str);
    byte[] result = new byte[bytes.length + 1];

    synchronized (KEY)
    {
      if (random == null)
      {
        random = new Random(System.currentTimeMillis());
        random.nextBytes(KEY);
      }
    }

    int j = random.nextInt(KEY.length);
    result[bytes.length] = (byte)(j + Byte.MIN_VALUE);
    crypt(bytes, result, bytes.length, j);
    return result;
  }

  public static String decrypt(byte[] bytes) throws RuntimeException
  {
    if (bytes == null)
    {
      return null;
    }

    if (bytes.length == 0)
    {
      return EMPTY;
    }

    byte[] result = new byte[bytes.length - 1];
    int j = bytes[result.length] - Byte.MIN_VALUE;
    crypt(bytes, result, result.length, j);
    return fromUTF(result);
  }

  private static void crypt(byte[] bytes, byte[] result, int length, int j)
  {
    for (int i = 0; i < length; i++)
    {
      result[i] = (byte)(bytes[i] ^ KEY[j++ % KEY.length]);
    }
  }

  public static String join(String joiner, String... values)
  {
    if (values.length < 0)
    {
      return "";
    }
    else if (values.length == 1)
    {
      return values[0];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < values.length; i++)
    {
      sb.append(values[i]);
      if (i + 1 < values.length)
      {
        sb.append(joiner);
      }
    }
    return sb.toString();
  }

  public static char[] decryptAsChars(byte[] bytes)
  {
    if (bytes == null)
    {
      return null;
    }

    if (bytes.length == 0)
    {
      return new char[0];
    }

    byte[] result = new byte[bytes.length - 1];
    int j = bytes[result.length] - Byte.MIN_VALUE;
    crypt(bytes, result, result.length, j);
    return Charset.forName(UTF8).decode(ByteBuffer.wrap(result)).array();
  }
}
