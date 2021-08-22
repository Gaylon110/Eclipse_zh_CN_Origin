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

import org.eclipse.userstorage.internal.oauth.UIFacade;
import org.eclipse.userstorage.ui.internal.UIUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.net.URI;
import java.text.MessageFormat;

/**
 * A UI facade that uses an internal in-app browser for interacting with the user.
 */
public class SWTInternalBrowserFacade extends UIFacade
{
  protected IShellProvider shell;

  public SWTInternalBrowserFacade()
  {
  }

  public SWTInternalBrowserFacade(Shell shell)
  {
    setShell(shell);
  }

  @Override
  public URI obtainAuthCode(final String providerName, final URI startURI, final URI stopURI)
  {
    final URI[] authCodeURI = new URI[1];
    syncExec(new Runnable()
    {
      @Override
      public void run()
      {
        LoginDialog login = new LoginDialog(getShell());
        login.setTitle(MessageFormat.format("Authorizing with {0}", providerName));
        login.setStartURI(startURI);
        login.setStopURI(stopURI);
        authCodeURI[0] = login.open() == InputDialog.OK ? login.getFinalURI() : null;
      }
    });
    return authCodeURI[0];
  }

  @Override
  public void showError(final String title, final String description, final IStatus status)
  {
    asyncExec(new Runnable()
    {
      @Override
      public void run()
      {
        ErrorDialog.openError(getShell(), title, description, status);
      }
    });
  }

  public void setShell(IShellProvider shell)
  {
    this.shell = shell;
  }

  public void setShell(Shell shell)
  {
    this.shell = new SameShellProvider(shell);
  }

  protected Shell getShell()
  {
    if (shell != null)
    {
      return shell.getShell();
    }
    return UIUtil.getShell();
  }

  protected void asyncExec(Runnable runnable)
  {
    getDisplay().asyncExec(runnable);
  }

  protected void syncExec(Runnable runnable)
  {
    getDisplay().syncExec(runnable);
  }

  private Display getDisplay()
  {
    Shell shell = getShell();
    if (shell != null)
    {
      return shell.getDisplay();
    }
    if (Display.getCurrent() != null)
    {
      return Display.getCurrent();
    }
    return Display.getDefault();
  }
}
