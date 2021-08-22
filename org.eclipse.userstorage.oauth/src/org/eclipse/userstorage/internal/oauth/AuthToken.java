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

import org.eclipse.userstorage.internal.util.IOUtil;
import org.eclipse.userstorage.internal.util.JSONUtil;
import org.eclipse.userstorage.internal.util.StringUtil;

import org.apache.http.client.utils.DateUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Represents the <em>authorization token</em> returned from an OAuth server.
 * This object knows how to serialize and deserialize itself.
 * It also knows about its staleness.
 */
public class AuthToken
{
  // {
  // "access_token":"06f965eefeac977ea132fff0afcc396639ada8d6",
  // "expires_in":"3600",
  // "token_type":"Bearer",
  // "scope":"uss_retrieve",
  // "refresh_token":"83f14719ffcf3f5b82825f4bda93c2e5f3e896cc"
  // }

  /** The actual access token itself */
  private static String ACCESS_TOKEN = "access_token";

  /** The type of access token, expected to be "Bearer" */
  private static String TOKEN_TYPE = "token_type";

  /** The scopes that had been authorized */
  private static String SCOPE = "scope";

  /** A token to provide to obtain a new access token */
  private static String REFRESH_TOKEN = "refresh_token";

  /** Expiry time of the token in seconds */
  private static String EXPIRES_IN = "expires_in";

  /** A private field to encode the absolute expiry date */
  private static String EXPIRES = "_expires_";

  private Map<String, String> details;

  private Date expiryDate;

  private AuthToken(Map<String, String> details, Date expiryDate)
  {
    this.details = details;
    this.expiryDate = expiryDate;
  }

  public AuthToken(String jsonRepresentation, Date responseDate)
  {
    try
    {
      Object o = JSONUtil.parse(IOUtil.streamUTF(jsonRepresentation), null);
      if (!(o instanceof Map<?, ?>))
      {
        throw new IllegalArgumentException("not a valid auth token object");
      }
      details = (Map<String, String>)o;
    }
    catch (IOException e)
    {
      throw new IllegalArgumentException("not a valid auth token object");
    }
    if (!details.containsKey(ACCESS_TOKEN))
    {
      throw new IllegalArgumentException("does not appear to be a valid auth token object");
    }
    if (details.containsKey(EXPIRES_IN))
    {
      long expiry = Long.parseLong(details.remove(EXPIRES_IN)); // seconds
      expiryDate = new Date(responseDate.getTime() + expiry * 1000);
      details.put(EXPIRES, DateUtils.formatDate(expiryDate));
    }
  }

  /**
   * Reconstitute an AuthToken object from the given serialized string
   * @throws IllegalArgumentException if not a serialized token
   */
  public static AuthToken deserialize(String serializedForm) throws IllegalArgumentException
  {
    if (serializedForm == null)
    {
      throw new IllegalArgumentException("no token");
    }
    try
    {
      Object o = JSONUtil.parse(IOUtil.streamUTF(serializedForm), null);
      if (!(o instanceof Map<?, ?>))
      {
        throw new IllegalArgumentException("not a JSON object");
      }
      Map<String, String> details = (Map<String, String>)o;
      if (details.containsKey(EXPIRES_IN) || !details.containsKey(ACCESS_TOKEN))
      {
        throw new IllegalArgumentException("does not appear to be a valid auth token object");
      }
      Date expiryDate = null;
      if (details.containsKey(EXPIRES))
      {
        expiryDate = DateUtils.parseDate(details.get(EXPIRES));
      }
      return new AuthToken(details, expiryDate);

    }
    catch (IOException e)
    {
      throw new IllegalArgumentException(e);
    }
  }

  public String getAccessToken()
  {
    return details.get(ACCESS_TOKEN);
  }

  public String getRefreshToken()
  {
    return details.get(REFRESH_TOKEN);
  }

  public String getTokenType()
  {
    return details.get(TOKEN_TYPE);
  }

  public Set<String> getScopes()
  {
    Set<String> result = new HashSet<String>();
    String scopes = details.get(SCOPE);
    if (scopes != null)
    {
      for (String s : scopes.split(" "))
      {
        result.add(s);
      }
    }
    return result;
  }

  public boolean isExpired()
  {
    return expiryDate != null && expiryDate.compareTo(new Date()) <= 0;
  }

  /**
   * Return a serialized form of the auth token.
   * @throws IOException if an error occurred while serializing the form
   */
  public String serialize() throws IOException
  {
    InputStream inputStream = JSONUtil.build(details);
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    byte[] buffer = new byte[1024];
    int length;
    while ((length = inputStream.read(buffer, 0, buffer.length)) != -1)
    {
      result.write(buffer, 0, length);
    }
    return result.toString(StringUtil.UTF8);
  }
}
