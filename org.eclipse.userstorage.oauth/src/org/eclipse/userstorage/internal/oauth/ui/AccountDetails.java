package org.eclipse.userstorage.internal.oauth.ui;

import org.eclipse.userstorage.internal.oauth.OAuthCredentialsPersistence;
import org.eclipse.userstorage.internal.oauth.OAuthCredentialsPersistence.LinkedAccount;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Display a dynamic menu area with a USS sign-out item
 * and a list of items showing currently-logged in apps.
 */
public class AccountDetails extends ContributionItem implements IWorkbenchContribution
{
  private OAuthCredentialsPersistence persister;

  private Collection<OAuthApplicationData> appData;

  private IServiceLocator serviceLocator;

  @Override
  public void initialize(IServiceLocator serviceLocator)
  {
    this.serviceLocator = serviceLocator;
    IExtensionRegistry registry = serviceLocator.getService(IExtensionRegistry.class);
    persister = OAuthCredentialsPersistence.standard();
    appData = OAuthApplicationData.load(registry);
  }

  @Override
  public void fill(final Menu menu, int index)
  {
    List<LinkedAccount> eclipseAccounts = getEclipseAccounts();
    if (!eclipseAccounts.isEmpty())
    {
      MenuItem item = new MenuItem(menu, SWT.PUSH, index++);
      item.setText("Authorized Applications");
      item.addSelectionListener(new SelectionListener()
      {
        @Override
        public void widgetSelected(SelectionEvent e)
        {
          PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(menu.getShell(), OAuthAccountsPreferencePage.PAGE_ID, null, null);
          dialog.open();
        }

        @Override
        public void widgetDefaultSelected(SelectionEvent e)
        {
          widgetSelected(e);
        }
      });

      for (LinkedAccount account : eclipseAccounts)
      {
        MenuItem accountItem = new MenuItem(menu, SWT.PUSH, index++);
        accountItem.setText("  " + getApplicationName(account));
        accountItem.setToolTipText(account.email);
        accountItem.setEnabled(false);
      }
    }

    MenuItem item = new MenuItem(menu, SWT.PUSH, index++);
    item.setText("Sign Out");
    item.setToolTipText("Discard all USS logins");
    if (eclipseAccounts.isEmpty())
    {
      item.setEnabled(false);
      new MenuItem(menu, SWT.SEPARATOR, index++);
      return;
    }
    item.addSelectionListener(new SelectionListener()
    {
      @Override
      public void widgetSelected(SelectionEvent e)
      {
        signOut();
      }

      @Override
      public void widgetDefaultSelected(SelectionEvent e)
      {
        signOut();
      }
    });
  }

  @Override
  public boolean isDynamic()
  {
    return true;
  }

  private void signOut()
  {
    persister.removeLinkedAccounts(getEclipseAccounts());
  }

  private List<LinkedAccount> getEclipseAccounts()
  {
    List<LinkedAccount> eclipseAccounts = new ArrayList<LinkedAccount>();
    for (LinkedAccount account : persister.getLinkedAccounts())
    {
      if ("https://accounts.eclipse.org/".equals(account.authURI))
      {
        eclipseAccounts.add(account);
      }
    }
    return eclipseAccounts;
  }

  private OAuthApplicationData lookup(LinkedAccount account)
  {
    for (OAuthApplicationData app : appData)
    {
      if (account.clientId.equals(app.getClientId()) && account.authURI.equals(app.getAuthURI()))
      {
        return app;
      }
    }
    return null;
  }

  private String getApplicationName(LinkedAccount account)
  {
    OAuthApplicationData app = lookup(account);
    return app != null ? app.getApplicationName() : account.authURI + " - " + account.clientId;
  }
}
