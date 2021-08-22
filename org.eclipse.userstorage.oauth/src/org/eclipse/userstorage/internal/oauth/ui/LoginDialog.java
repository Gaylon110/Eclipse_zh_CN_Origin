/*
 * Copyright (c) 2015 Manumitting Technologies Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc. - initial API and implementation
 */
package org.eclipse.userstorage.internal.oauth.ui;

import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationAdapter;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * A browser dialog for driving the OAuth authorization and authentication process.
 */
public class LoginDialog extends TrayDialog
{
  private static final boolean DEBUG = Boolean.getBoolean("org.eclipse.userstorage.session.debug");

  private static void debug(String message)
  {
    if (DEBUG)
    {
      System.out.println("<LoginDialog> " + message);
    }
  }

  private String title;

  private URI startURI;

  private URI stopURI;

  private Browser browser;

  private String instructions;

  private URI finalURI;

  private LocationListener locationListener = new LocationAdapter()
  {
    @Override
    public void changing(LocationEvent event)
    {
      try
      {
        debug("Visiting: " + event.location);
        URI next = new URI(event.location);
        if (isStopURI(next))
        {
          event.doit = false;
          finalURI = new URI(event.location);
          doClose(OK);
        }
        else if (isValidURI(next))
        {
          event.doit = true;
        }
        else
        {
          event.doit = false;
          ErrorDialog.openError(getShell(), "OAuth Flow Error", "The remote directed to an invalid URL: " + event.location, null);
        }
      }
      catch (URISyntaxException ex)
      {
        ErrorDialog.openError(getShell(), "OAuth Error", "The remote directed to an invalid URL: " + event.location, null);
      }
    }
  };

  public LoginDialog(Shell parentShell)
  {
    super(parentShell);
    setHelpAvailable(false);
  }

  @Override
  protected boolean isResizable()
  {
    return true;
  }

  /** Close the this dialog instance and set the result code to {@code rc} */
  protected void doClose(int rc)
  {
    setReturnCode(rc);
    Shell shell = getShell();
    if (shell == null || shell.isDisposed())
    {
      return;
    }
    // punt to ensure any other events are run
    shell.getDisplay().asyncExec(new Runnable()
    {
      @Override
      public void run()
      {
        close();
      }
    });
  }

  /**
   * Verify that the URI is an acceptable URI to transition to during the authentication
   * and authorization process.  For example, could check that we only transition to URIs from particular
   * domains.
   */
  protected boolean isValidURI(URI next)
  {
    return true;
  }

  /**
   * Return true if the URI indicates the end of the OAuth flow
   */
  protected boolean isStopURI(URI next)
  {
    return next.toASCIIString().startsWith(getStopURI().toASCIIString());
  }

  /** Returns the final location that was received on success */
  public URI getFinalURI()
  {
    return finalURI;
  }

  @Override
  protected void configureShell(Shell newShell)
  {
    super.configureShell(newShell);
    if (title != null)
    {
      newShell.setText(title);
    }
  }

  @Override
  protected Control createDialogArea(Composite parent)
  {
    Composite composite = (Composite)super.createDialogArea(parent);

    String instructions = getInstructions();
    if (instructions != null && !instructions.isEmpty())
    {
      Label message = new Label(composite, SWT.NONE);
      message.setText(instructions);
    }
    browser = new Browser(composite, SWT.BORDER);
    browser.addLocationListener(locationListener);
    browser.setUrl(getStartURI().toASCIIString());
    GridDataFactory.fillDefaults().grab(true, true).hint(800, 600).applyTo(browser);

    return composite;
  }

  @Override
  protected void createButtonsForButtonBar(Composite parent)
  {
    createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
  }

  public void setTitle(String dialogTitle)
  {
    title = dialogTitle;
  }

  public URI getStartURI()
  {
    return startURI;
  }

  public void setStartURI(URI uri)
  {
    startURI = uri;
  }

  public URI getStopURI()
  {
    return stopURI;
  }

  public void setStopURI(URI uri)
  {
    stopURI = uri;
  }

  public String getInstructions()
  {
    return instructions;
  }

  public void setInstructions(String instructions)
  {
    this.instructions = instructions;
  }

  public String getTitle()
  {
    return title;
  }
}
