/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *   Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *   Nicolas Guyomar (Mia-Software) - Bug 340886 - NPE in handlers
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExportCommandHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			ITableWidgetProvider natTableWidgetPart = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (natTableWidgetPart != null) {
				natTableWidgetPart.getTableWidget().saveAs();
			}
		}
		return null;
	}
	
	@Override
	public boolean isEnabled() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				IWorkbenchPart activePart = page.getActivePart();
				if (activePart != null) {
					final ITableWidgetProvider natTableWidgetPart = (ITableWidgetProvider) activePart
							.getAdapter(ITableWidgetProvider.class);
					if (natTableWidgetPart != null) {
						if (natTableWidgetPart.getTableWidget().getTable() instanceof NavigationTable) {
							return false;
						}
					}
				}
			}
		}
		return super.isEnabled();
	}
}
