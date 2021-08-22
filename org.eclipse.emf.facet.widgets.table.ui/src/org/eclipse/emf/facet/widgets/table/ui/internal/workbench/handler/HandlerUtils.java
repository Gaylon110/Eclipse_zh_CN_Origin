/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
 package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public final class HandlerUtils {

	private static final String DEBUG_ID = Activator.getDefault().getBundle()
			.getSymbolicName()
			+ "/debug/" + HandlerUtils.class.getSimpleName(); //$NON-NLS-1$
	private static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& Boolean.TRUE
					.toString()
					.equalsIgnoreCase(
							Platform.getDebugOption(HandlerUtils.DEBUG_ID));

	private HandlerUtils() {
		// Must no be used
	}

	public static ITableWidgetProvider getActiveTableWidgetProvider() {
		ITableWidgetProvider tableWidget = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				IWorkbenchPart activePart = page.getActivePart();
				if (activePart != null) {
					tableWidget = (ITableWidgetProvider) activePart
							.getAdapter(ITableWidgetProvider.class);
				}
			}
		}
		return tableWidget;
	}

}
