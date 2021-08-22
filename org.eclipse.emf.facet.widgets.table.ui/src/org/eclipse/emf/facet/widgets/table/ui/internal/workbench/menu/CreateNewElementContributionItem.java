/*******************************************************************************
 * Copyright (c) 2010, 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *   Nicolas Guyomar (Mia-Software) - Bug 337442 - [NatTableWidget] CreateNewElement action is not available
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.menu;

import java.util.List;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class CreateNewElementContributionItem extends ContributionItem {

	private static final int NUMBER_OF_METHOD = 5;

	@Override
	public void fill(final Menu menu, final int index) {
		final IWorkbenchPart activePart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart();
		if (activePart != null) {
			final ITableWidgetProvider widgetProvider = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (widgetProvider != null) {
				final ITableWidget widget = widgetProvider.getTableWidget();
				createMenuItems(menu, widget);
			}
		}
	}

	private static void createMenuItems(final Menu menu,
			final ITableWidget widget) {
		if (widget.getInstantiationMethodHistory() != null
				&& !widget.getInstantiationMethodHistory().isEmpty()) {
			final List<InstantiationMethod> fullList = widget
					.getInstantiationMethodHistory();
			final int nbMethodToShow = Math.min(
					CreateNewElementContributionItem.NUMBER_OF_METHOD,
					fullList.size());
			final List<InstantiationMethod> methodsToShow = fullList.subList(0,
					nbMethodToShow
			);
			for (final InstantiationMethod meth : methodsToShow) {
				final MenuItem menuItem = new MenuItem(menu, SWT.CHECK); // NOPMD by gdupe on 10/09/12 17:52
				// NOPMD We must create one instance of MenuItem per method to
				// show.
				menuItem.setText(meth.getName());
				// NOPMD We must create one instance of SelectionAdapter per
				// menuItem.
				menuItem.addSelectionListener(new SelectionAdapter() { // NOPMD by gdupe on 10/09/12 17:52
					@Override
					public void widgetSelected(
							final SelectionEvent event) {
						menuItemSelected(menu, event, meth, widget);
					}
				});
			}
		}
	}

	public static void menuItemSelected(final Menu menu,
			final SelectionEvent event,
			final InstantiationMethod meth, final ITableWidget widget) {
		for (MenuItem menuItem2 : menu.getItems()) {
			menuItem2.setSelection(false);
		}
		final MenuItem localMenuItem = (MenuItem) event.widget;
		localMenuItem.setSelection(true);
		widget.createNewElement(meth);
	}
}
