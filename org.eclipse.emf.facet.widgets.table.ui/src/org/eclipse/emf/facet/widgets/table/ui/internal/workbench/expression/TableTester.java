/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr  - Bug 335020 - Nattable widget should use the Eclipse framework - Initial API and implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework - Remove Eclipse/Checkstyle warnings and added documentation
 *   Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 378178 - NPE on shutdown with Facets installed
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.expression;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler.HandlerUtils;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * This tester is used to know if the current part is a
 * {@link INatTableWidgetProvider}
 * 
 * In the plugin.xml this tester is said working on selection. It's a trick to
 * force the refresh of the command which used it (Papyrus compatibility) ! In
 * reality, the interesting thing is to know if the current editor provides an
 * adapter} for {@link INatTableWidgetProvider}.
 * 
 */
public class TableTester extends PropertyTester {
	

	private static final String DEBUG_ID = Activator.getDefault().getBundle()
			.getSymbolicName()
			+ "/debug/" + HandlerUtils.class.getSimpleName(); //$NON-NLS-1$
	private static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& Boolean.TRUE
					.toString()
					.equalsIgnoreCase(
							Platform.getDebugOption(TableTester.DEBUG_ID));

	/** the properties to test */
	public static final String IS_TABLE = "isTable"; //$NON-NLS-1$

	public static final String IS_TABLE_EDITOR = "isTableEditor"; //$NON-NLS-1$
	
	public static final String IS_TABLE_VIEW = "isTableView"; //$NON-NLS-1$

	/**
	 * 
	 * @see org.eclipse.core.expressions.IPropertyTester#test(java.lang.Object,
	 *      java.lang.String, java.lang.Object[], java.lang.Object)
	 * 
	 * @return the result of the test on the given parameters
	 */
	public boolean test(final Object receiver, final String property, final Object[] args,
			final Object expectedValue) {
		boolean answer = false;
		if (TableTester.IS_TABLE.equals(property) && expectedValue instanceof Boolean) {
			answer = testIsTable();
		}
		if (TableTester.IS_TABLE_EDITOR.equals(property) && expectedValue instanceof Boolean
				&& receiver instanceof IWorkbenchPart) {
			answer = testIsTableEditor((IWorkbenchPart) receiver);
		}
		if (TableTester.IS_TABLE_VIEW.equals(property) && expectedValue instanceof Boolean
				&& receiver instanceof IWorkbenchPart) {
			answer = testIsTableView((IWorkbenchPart) receiver);
		}
		final Boolean expectedBoolean = (Boolean) expectedValue;
		DebugUtils.debug(TableTester.DEBUG, property + '=' + answer);
		return expectedBoolean.booleanValue() == answer;
	}

	/**
	 * @return true is the part is a {@link IViewPart} but not an instance of
	 *         {@link NavigationTable}
	 */
	private static boolean testIsTableView(final IWorkbenchPart part) {
		boolean result = false;
		if (part instanceof IViewPart) {
			Object adapter = part.getAdapter(ITableWidgetProvider.class);
			if (adapter != null) {
				ITableWidgetProvider natTableWidgetProvider = (ITableWidgetProvider) adapter;
				Table tableInstance = natTableWidgetProvider.getTableWidget().getTable();
				if (!(tableInstance instanceof NavigationTable)) {
					result = true;
				}
			}
		}
		return result;
	}

	/**
	 * Test if the provided {@link IWorkbenchPart} is an {@link IEditorPart} and
	 * has an adaptor for {@link INatTableWidgetProvider}
	 * 
	 * @param part
	 *            the part to test
	 * @return <code>true</code> if the {@link IEditorPart}provides an
	 *         adaptor for {@link INatTableWidgetProvider}
	 */
	public static boolean testIsTableEditor(final IWorkbenchPart part) {
		boolean result = false;
		if (part instanceof IEditorPart) {
			Object adapter = part.getAdapter(ITableWidgetProvider.class);
			result = adapter != null;
		}
		return result;
	}

	/**
	 * 
	 * @param receiver
	 * @return <code>true</code> if the current editor can be adapted to
	 *         {@link INatTableWidgetProvider}
	 */
	private static boolean testIsTable() {
		boolean result = false;
		final IWorkbenchPart activePart = getActivePart();
		if (activePart != null) {
			Object adapter = activePart.getAdapter(ITableWidgetProvider.class);
			result = adapter != null;
		}
		return result;
	}

	@SuppressWarnings("PMD.AvoidDeeplyNestedIfStmts")
	// @SuppressWarnings("PMD.AvoidDeeplyNestedIfStmts") To split this method
	// will be less readable than the currente state
	private static IWorkbenchPart getActivePart() {
		IWorkbenchPart activePart = null;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench != null) {
			final IWorkbenchWindow window = workbench
					.getActiveWorkbenchWindow();
			if (window != null) {
				final IWorkbenchPage page = window.getActivePage();
				if (page != null) {
					activePart = page.getActivePart();
				}
			}
		}
		return activePart;
	}
	
}
