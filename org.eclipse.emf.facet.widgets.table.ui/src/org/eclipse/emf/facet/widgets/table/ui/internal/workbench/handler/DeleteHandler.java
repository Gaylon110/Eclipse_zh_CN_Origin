/*******************************************************************************
 * Copyright (c) 2010, 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *    Nicolas Guyomar (Mia-Software) - Bug 339922 - INatTableWidget method isCellSelected should use the plural
 *    Nicolas Guyomar (Mia-Software) - Bug 340886 - NPE in handlers
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class DeleteHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ITableWidgetProvider widgetProvider = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (widgetProvider != null) {
				widgetProvider.getTableWidget().deleteSelection();
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
