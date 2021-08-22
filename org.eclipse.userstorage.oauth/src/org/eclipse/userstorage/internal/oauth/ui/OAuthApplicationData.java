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
package org.eclipse.userstorage.internal.oauth.ui;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Describes application metadata for OAuth, usually intended for rendering information to the UI.
 */
public class OAuthApplicationData
{
  public static Collection<OAuthApplicationData> load(IExtensionRegistry registry)
  {
    final String OAUTH_APPLICATION_DESCRIPTIONS_XP = "org.eclipse.userstorage.oauth.clients";

    Collection<OAuthApplicationData> data = new ArrayList<OAuthApplicationData>();
    for (IConfigurationElement element : registry.getConfigurationElementsFor(OAUTH_APPLICATION_DESCRIPTIONS_XP))
    {
      if ("client".equals(element.getName()) && element.getAttribute("id") != null)
      {
        OAuthApplicationData d = new OAuthApplicationData();
        d.clientId = element.getAttribute("id");
        d.authURI = element.getAttribute("authURI");
        d.applicationName = element.getAttribute("name");
        if (element.getAttribute("icon") != null)
        {
          d.imageURI = "platform:/plugin/" + element.getNamespaceIdentifier() + "/" + element.getAttribute("icon");
        }
        data.add(d);
      }
    }
    return data;
  }

  private String authURI;

  private String clientId;

  private String applicationName;

  private String imageURI;

  public String getAuthURI()
  {
    return authURI;
  }

  public String getClientId()
  {
    return clientId;
  }

  public String getApplicationName()
  {
    return applicationName;
  }

  public String getImageURI()
  {
    return imageURI;
  }

}
