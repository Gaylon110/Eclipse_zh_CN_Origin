/*
 * Copyright (c) 2017 Manumitting Technologies Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Manumitting Technologies Inc - initial API and implementation
 */
package org.eclipse.userstorage.ui.internal;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.services.IServiceLocator;

/**
 * A simple handler that opens a pulldown menu associated with a tool item.
 * Required as Eclipse only opens the drop-down menu when clicking on a tool item's
 * drop-down indicator.
 * <ul>
 * <li> As is the norm for a {@code <command style="pulldown">} items, must
 *    set the {@code id} attribute to the id of a menu contribution to show.</li>
 * <li> Must provide an {@code intoolbar} parameter to any value, required to
 *    prevent the command from appearing within the Quick Access.</li>
 * </ul>
 * <pre>
 * &lt;extension point=&quot;org.eclipse.ui.menus&quot;&gt;
 *   &lt;menuContribution allPopups=&quot;false&quot;
 *       locationURI=&quot;toolbar:org.eclipse.ui.main.toolbar?after=additions&quot;&gt;
 *     &lt;toolbar id=&quot;my.toolbar&quot;&gt;
 *       &lt;command
 *           commandId=&quot;org.eclipse.userstorage.ui.showPullDown&quot;
 *           id=&quot;<b>org.eclipse.userstorage.ui.accounts</b>&quot;
 *           tooltip=&quot;Linked Accounts&quot;
 *           icon=&quot;icons/UserAccount.png&quot;
 *           style=&quot;pulldown&quot; /&gt;
 *     &lt;/toolbar&gt;
 *   &lt;/menuContribution&gt;
 *   &lt;menuContribution allPopups=&quot;false&quot;
 *         locationURI=&quot;menu:<b>org.eclipse.userstorage.ui.accounts</b>&quot;&gt;
 *     &lt;!-- menu definition --&gt;
 *   &lt;/menuContribution&gt;
 * &lt;/extension&gt;
 * </pre>
 */
public class ShowPullDownMenu extends AbstractHandler
{
  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException
  {
    final IMenuService menuService = getService(event, IMenuService.class);

    PopupMenu popup = new PopupMenu();
    popup.configure(menuService, event);
    popup.show();
    return null;
  }

  /* @NonNull */
  private <T> T getService(ExecutionEvent event, Class<T> clazz) throws ExecutionException
  {
    T service;
    IServiceLocator locator = HandlerUtil.getActiveSite(event);
    if (locator != null && (service = locator.getService(clazz)) != null)
    {
      return service;
    }
    locator = HandlerUtil.getActiveWorkbenchWindow(event);
    if (locator != null && (service = locator.getService(clazz)) != null)
    {
      return service;
    }
    throw new ExecutionException("Unable to locate service " + clazz);
  }

  private static class PopupMenu
  {
    private IMenuService menuService;

    private String menuId;

    private Control parent;

    private Point location;

    /** Configure the popup menu id and location. */
    private void configure(IMenuService menuService, ExecutionEvent event) throws ExecutionException
    {
      this.menuService = menuService;

      // Support use of this command in org.eclipse.ui.menus's
      // <command style=pulldown> and find the command id from the
      // corresponding ContributionItem
      if (!(event.getTrigger() instanceof Event) || ((Event)event.getTrigger()).type != SWT.Selection
          || !(((Event)event.getTrigger()).widget instanceof ToolItem))
      {
        throw new ExecutionException("Unable to determine menu id");
      }
      ToolItem toolItem = (ToolItem)((Event)event.getTrigger()).widget;
      if (!(toolItem.getData() instanceof ContributionItem))
      {
        throw new ExecutionException("Unable to determine menu id");
      }
      menuId = ((ContributionItem)toolItem.getData()).getId();

      // place menu near the drop-down indicator on right-side
      parent = toolItem.getParent();
      Rectangle itemBounds = toolItem.getBounds(); // relative to toolbar
      location = parent.toDisplay(new Point(itemBounds.x, itemBounds.y + itemBounds.height));
    }

    private void show()
    {
      final MenuManager menuManager = new MenuManager();
      Menu menu = menuManager.createContextMenu(parent);
      menuManager.addMenuListener(new IMenuListener2()
      {
        @Override
        public void menuAboutToHide(IMenuManager manager)
        {
          parent.getDisplay().asyncExec(new Runnable()
          {
            @Override
            public void run()
            {
              menuService.releaseContributions(menuManager);
              menuManager.dispose();
            }
          });
        }

        @Override
        public void menuAboutToShow(IMenuManager manager)
        {
          menuService.populateContributionManager(menuManager, "menu:" + menuId);
        }
      });
      menu.setLocation(location);
      menu.setVisible(true);
    }
  }
}
