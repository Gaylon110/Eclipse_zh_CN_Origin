/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade 
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class EditHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			ITableWidgetProvider natTableWidgetPart = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (natTableWidgetPart != null) {
				ITableWidget widget = natTableWidgetPart.getTableWidget();
				widget.editSelectedCell();
			}
		}
		return null;
	}
}
