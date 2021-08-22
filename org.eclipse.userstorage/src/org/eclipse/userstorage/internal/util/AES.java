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
package org.eclipse.userstorage.internal.util;

import org.eclipse.equinox.internal.security.storage.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/**
 * Simple 128-bit encryption using AES.  Although not considered very strong,
 * it avoids JCE configuration issues.  Intended for encrypting not very
 * sensitive items.
 */
public class AES
{
  private static final byte[] SALT = { (byte)207, (byte)57, (byte)209, (byte)193, (byte)247, (byte)184, (byte)106, (byte)53, };

  private static final int PASSWORD_BITS_SIZE = 128;

  private static final int ITERATIONS = 1000;

  private static final int IV_BYTES_SIZE = 16;

  /**
   * Encrypt the given payload using AES into a Base64-encoded form.
   * @throws GeneralSecurityException if there are any algorithmic problems
   */
  public static String encrypt(String payload, char[] password) throws GeneralSecurityException
  {
    SecretKey secret = prepareKey(password);

    Cipher pbeCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    pbeCipher.init(Cipher.ENCRYPT_MODE, secret);
    AlgorithmParameters params = pbeCipher.getParameters();
    byte[] iv = params.getParameterSpec(IvParameterSpec.class).getIV();
    if (iv.length != IV_BYTES_SIZE)
    {
      throw new AssertionError("IV size != " + IV_BYTES_SIZE);
    }

    byte[] unencrypted = payload.getBytes(Charset.forName(StringUtil.UTF8));
    byte[] encrypted = pbeCipher.doFinal(unencrypted);
    // prepend the IV to the beginning
    ByteBuffer data = ByteBuffer.allocate(iv.length + encrypted.length);
    data.put(iv);
    data.put(encrypted);
    return Base64.encode(data.array());
  }

  /**
   * Decrypt the Base64-encoded encrypted data using AES.
   * @throws GeneralSecurityException if there are any algorithmic problems
   */
  public static String decrypt(String encryptedForm, char[] password) throws GeneralSecurityException
  {
    SecretKey secret = prepareKey(password);

    byte[] decoded = Base64.decode(encryptedForm);
    assert decoded.length > IV_BYTES_SIZE;

    IvParameterSpec iv = new IvParameterSpec(decoded, 0, IV_BYTES_SIZE);
    Cipher pbeCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    pbeCipher.init(Cipher.DECRYPT_MODE, secret, iv);

    byte[] deciphered = pbeCipher.doFinal(decoded, IV_BYTES_SIZE, decoded.length - IV_BYTES_SIZE);

    return new String(deciphered, Charset.forName(StringUtil.UTF8));
  }

  private static SecretKey prepareKey(char[] password) throws NoSuchAlgorithmException, InvalidKeySpecException
  {
    SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
    KeySpec spec = new PBEKeySpec(password, SALT, ITERATIONS, PASSWORD_BITS_SIZE);
    SecretKey tmp = factory.generateSecret(spec);
    SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
    return secret;
  }
}
