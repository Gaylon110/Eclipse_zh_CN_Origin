/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.ui.action;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.provider.AbstractLabelProviderFactory;
import org.eclipse.amalgam.explorer.contextual.core.ui.action.ExplorerHistory.ExplorerNavigationHistoryEntry;
import org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

/**
 */
public class ExplorerContextualHistoryAction extends Action implements IMenuCreator, IWorkbenchAction {
  public static final String FORWARD_ACTION_ID = "forward"; //$NON-NLS-1$
  public static final String BACKWARD_ACTION_ID = "backward"; //$NON-NLS-1$
  private boolean _forward;
  private IExplorerContextualViewPart _explorerContextualViewPart;
  private ExplorerHistory _explorerHistory;

  /**
   * Action for History Item.
   */
  protected class HistoryItemAction extends Action {
    protected ExplorerNavigationHistoryEntry _navigationEntry;

    /**
     * Constructor.
     * @param navigationEntry_p
     * @param text_p
     * @param imageDescriptor_p
     */
    public HistoryItemAction(ExplorerNavigationHistoryEntry navigationEntry_p, String text_p, ImageDescriptor imageDescriptor_p) {
      super(text_p, imageDescriptor_p);
      // object related to the clicked item.
      _navigationEntry = navigationEntry_p;
    }

    /**
     * @see org.eclipse.jface.action.Action#run()
     */
    @SuppressWarnings("synthetic-access")
    @Override
    public void run() {
      _explorerHistory.setDoUpdate(false);
      try {
        // update history model.
        _explorerHistory.goTo(_navigationEntry);
        // update Contextual Explorer.
        _explorerContextualViewPart.setInput(_navigationEntry.getRealObject());
        _explorerHistory.notifyActionListeners();
      } finally {
        // Make sure to re-enable the explorer history.
        _explorerHistory.setDoUpdate(true);
      }
    }
  }

  /**
   * Constructor.
   * @param explorerContextualView_p_p
   */
  public ExplorerContextualHistoryAction(IWorkbenchWindow window_p, IExplorerContextualViewPart explorerContextualView_p, boolean forward_p) {
    _explorerContextualViewPart = explorerContextualView_p;
    ISharedImages sharedImages = window_p.getWorkbench().getSharedImages();
    if (forward_p) {
      setText("&Forward"); //$NON-NLS-1$
      setToolTipText("Forward"); //$NON-NLS-1$
      setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
      setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD_DISABLED));
      setId(FORWARD_ACTION_ID);
    } else {
      setText("&Back"); //$NON-NLS-1$
      setToolTipText("Back"); //$NON-NLS-1$
      setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
      setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_BACK_DISABLED));
      setId(BACKWARD_ACTION_ID);
    }

    _explorerHistory = explorerContextualView_p.getHistory();
    _explorerHistory.addActionAsListener(this);
    _forward = forward_p;
    setMenuCreator(this);
    setEnabled(false);
  }

  /**
   * Create History action for given object.
   * @param index_p
   * @param entry_p
   * @return
   */
  private HistoryItemAction createHistoryAction(ExplorerNavigationHistoryEntry navigationEntry_p) {
    // Precondition :
    if (!navigationEntry_p.isValid()) {
      return null;
    }
    Object realObject = navigationEntry_p.getRealObject();
    ILabelProvider labelProvider = AbstractLabelProviderFactory.getInstance().getCurrentLabelProvider();
    Image image = labelProvider.getImage(realObject);
    ImageDescriptor imgDescriptor = null;
    if (image != null) {
      imgDescriptor = ImageDescriptor.createFromImage(image);
    }
    HistoryItemAction goToAction = new HistoryItemAction(navigationEntry_p, labelProvider.getText(realObject), imgDescriptor);
    return goToAction;
  }

  /**
   * Get available history entries according forward or backward navigation.
   * @return
   */
  private List<ExplorerNavigationHistoryEntry> getAvailableNavigationEntries() {
    List<ExplorerNavigationHistoryEntry> historyEntries = null;
    if (_forward) {
      historyEntries = _explorerHistory.getForwardNavigationEntries();
    } else {
      historyEntries = _explorerHistory.getBackwardNavigationEntries();
      Collections.reverse(historyEntries);
    }
    return historyEntries;
  }

  /**
   * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Control)
   */
  public Menu getMenu(Control parent_p) {
    MenuManager menuManager = new MenuManager();
    final Menu menu = menuManager.createContextMenu(parent_p);
    menuManager.addMenuListener(new IMenuListener() {
      /**
       * {@inheritDoc}
       */
      @SuppressWarnings("synthetic-access")
      public void menuAboutToShow(IMenuManager manager_p) {
        // Retrieve entries for the menu.
        List<ExplorerNavigationHistoryEntry> navigationEntries = getAvailableNavigationEntries();
        // Populate the menu with entries.
        for (ExplorerNavigationHistoryEntry entry : navigationEntries) {
          HistoryItemAction historyEntryAction = createHistoryAction(entry);
          if (null != historyEntryAction) {
            manager_p.add(historyEntryAction);
          }
        }
      }
    });
    // Add a listener to automatically dispose the menu when it becomes hidden.
    final Display display = menu.getDisplay();
    menu.addListener(SWT.Hide, new Listener() {
      public void handleEvent(Event event) {
        if (!display.isDisposed()) {
          display.asyncExec(new Runnable() {
            public void run() {
              if (!menu.isDisposed()) {
                menu.dispose();
              }
            }
          });
        }
      }
    });
    return menu;
  }

  /**
   * @see org.eclipse.jface.action.IMenuCreator#getMenu(org.eclipse.swt.widgets.Menu)
   */
  public Menu getMenu(Menu parent_p) {
    // Not applicable.
    return null;
  }

  /**
   * @see org.eclipse.jface.action.Action#run()
   */
  @Override
  public void run() {
    Iterator<ExplorerNavigationHistoryEntry> availableHistoryEntries = getAvailableNavigationEntries().iterator();
    if (availableHistoryEntries.hasNext()) {
      // Create an action to go to the first available entry.
      HistoryItemAction historyAction = createHistoryAction(availableHistoryEntries.next());
      while (null == historyAction) {
        historyAction = createHistoryAction(availableHistoryEntries.next());
      }
      if (null != historyAction) {
        historyAction.run();
      }
    }
  }

  /**
   * Update control state.
   */
  public void updateControlState() {
    boolean enabled = false;
    if (_forward) {
      if (_explorerHistory.getForwardNavigationEntries().size() > 0) {
        enabled = true;
      }
    } else {
      if (_explorerHistory.getBackwardNavigationEntries().size() > 0) {
        enabled = true;
      }
    }
    setEnabled(enabled);
  }

  /**
   * {@inheritDoc}
   */
  public void dispose() {
    // Do nothing.
  }
}
