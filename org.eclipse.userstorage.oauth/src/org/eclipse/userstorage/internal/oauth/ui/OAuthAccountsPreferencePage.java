package org.eclipse.userstorage.internal.oauth.ui;

import org.eclipse.userstorage.internal.oauth.OAuthCredentialsPersistence;
import org.eclipse.userstorage.internal.oauth.OAuthCredentialsPersistence.LinkedAccount;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OAuthAccountsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{
  static final String PAGE_ID = "org.eclipse.userstorage.ui.oauth.credentials";

  private IWorkbench workbench;

  private Collection<OAuthApplicationData> appData;

  private OAuthCredentialsPersistence persister;

  private List<LinkedAccount> accounts = new ArrayList<LinkedAccount>();

  private List<LinkedAccount> toRemove = new ArrayList<LinkedAccount>();

  private Map<ImageDescriptor, Image> images = new HashMap<ImageDescriptor, Image>();

  private Table table;

  private Button discardButton;

  public OAuthAccountsPreferencePage()
  {
    super("Linked Accounts");
    setDescription("Connected accounts for the Eclipse User Storage Service");

  }

  @Override
  public void init(IWorkbench workbench)
  {
    this.workbench = workbench;
    IExtensionRegistry registry = workbench.getService(IExtensionRegistry.class);
    persister = OAuthCredentialsPersistence.standard();
    appData = OAuthApplicationData.load(registry);
  }

  @Override
  protected Control createContents(Composite parent)
  {
    Composite container = new Composite(parent, SWT.NONE);

    Composite tableComposite = new Composite(container, SWT.NONE);
    tableComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
    TableColumnLayout layout = new TableColumnLayout();
    tableComposite.setLayout(layout);

    final TableViewer tableViewer = new TableViewer(tableComposite, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
    table = tableViewer.getTable();
    table.setHeaderVisible(true);

    TableViewerColumn tvcApplication = new TableViewerColumn(tableViewer, SWT.NONE);
    TableColumn tableColumn = tvcApplication.getColumn();
    layout.setColumnData(tableColumn, new ColumnWeightData(1, ColumnWeightData.MINIMUM_WIDTH, true));
    tvcApplication.getColumn().setText("Application");
    tvcApplication.setLabelProvider(new CellLabelProvider()
    {
      @Override
      public void update(ViewerCell cell)
      {
        LinkedAccount account = (LinkedAccount)cell.getElement();

        cell.setImage(getImage(getApplicationIcon(account)));
        cell.setText(getApplicationName(account));
      }
    });

    TableViewerColumn tvcUser = new TableViewerColumn(tableViewer, SWT.NONE);
    TableColumn tableColumn_1 = tvcUser.getColumn();
    layout.setColumnData(tableColumn_1, new ColumnWeightData(1, ColumnWeightData.MINIMUM_WIDTH, true));
    tvcUser.getColumn().setText("User");
    tvcUser.setLabelProvider(new CellLabelProvider()
    {
      @Override
      public void update(ViewerCell cell)
      {
        LinkedAccount account = (LinkedAccount)cell.getElement();
        cell.setText(account.email);
      }
    });

    discardButton = new Button(container, SWT.PUSH);
    discardButton.setText("Discard");
    discardButton.addSelectionListener(new SelectionAdapter()
    {
      @Override
      public void widgetSelected(SelectionEvent e)
      {
        for (Object o : ((IStructuredSelection)tableViewer.getSelection()).toArray())
        {
          accounts.remove(o);
          toRemove.add((LinkedAccount)o);
        }
        tableViewer.refresh();
      }
    });

    tableViewer.addSelectionChangedListener(new ISelectionChangedListener()
    {
      @Override
      public void selectionChanged(SelectionChangedEvent event)
      {
        discardButton.setEnabled(!event.getSelection().isEmpty());
      }
    });
    tableViewer.setContentProvider(ArrayContentProvider.getInstance());

    accounts.addAll(Arrays.asList(persister.getLinkedAccounts()));
    tableViewer.setInput(accounts);
    discardButton.setEnabled(false); // since no accounts are selected
    GridLayoutFactory.fillDefaults().numColumns(2).generateLayout(container);

    applyDialogFont(container);
    return container;
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

  private ImageDescriptor getApplicationIcon(LinkedAccount account)
  {
    OAuthApplicationData app = lookup(account);
    if (app == null)
    {
      return null;
    }
    String uri = app.getImageURI();
    try
    {
      return uri == null ? null : ImageDescriptor.createFromURL(new URL(uri));
    }
    catch (MalformedURLException ex)
    {
      ex.printStackTrace();
      return null;
    }
  }

  protected Image getImage(ImageDescriptor icon)
  {
    if (icon == null)
    {
      return null;
    }
    Image img = images.get(icon);
    if (img == null)
    {
      images.put(icon, img = icon.createImage());
    }
    return img;
  }

  @Override
  protected void performApply()
  {
    persister.removeLinkedAccounts(toRemove);
  }

  @Override
  public void dispose()
  {
    super.dispose();
    if (images != null)
    {
      for (Image img : images.values())
      {
        img.dispose();
      }
      images = null;
    }
  }

}
