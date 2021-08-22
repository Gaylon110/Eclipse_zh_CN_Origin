/*
 * Copyright (c) 2016 Manumitting Technologies Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc. - initial API and implementation
 */
package org.eclipse.userstorage.internal.oauth;

import org.eclipse.userstorage.oauth.OAuthCredentialsProvider;

import org.eclipse.core.runtime.IStatus;

import java.net.URI;

/**
 * UI for handling interactions for {@link OAuthCredentialsProvider OAuth Providers}.
 */
public abstract class UIFacade
{
  protected UIFacade()
  {
  }

  /**
   * Prompt the user through the process of authorizing using the {@code startURI}.
   * Returns a URI with the authorization code which should have {@code stopURI} as a prefix.
   */
  public abstract URI obtainAuthCode(final String providerName, final URI startURI, final URI stopURI);

  /** Show an error message to the user.  Expected to be asynchronous. */
  public abstract void showError(String title, String description, IStatus status);
}
