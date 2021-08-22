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
 *   Nicolas Guyomar (Mia-Software) - Bug 337442 - [NatTableWidget] CreateNewElement action is not available
 *   Nicolas Guyomar (Mia-Software) - Bug 340886 - NPE in handlers
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class CreateNewElementHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ITableWidgetProvider widgetProvider = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (widgetProvider != null) {
				widgetProvider.getTableWidget().createNewElement();
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
