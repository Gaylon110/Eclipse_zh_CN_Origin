/*******************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Softwate) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Grégoire Dupé (Mia-Software) - Bug 480901 - A default result displayer should be provided.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("PMD")
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.facet.widgets.table.ui.workbench.internal.messages"; //$NON-NLS-1$
	public static String ETypedElementResultDisplayer_TableNameResults;
	public static String ETypedElementResultDisplayer_TableResultDisplayer;
	public static String ViewInTableHandler_0;
	public static String ViewInTableHandler_1;
	public static String NatTableEditorFactory_aQuery;
	public static String NatTableEditorFactory_queryResult;
	public static String NatTableEditorFactory_queryResults;
	public static String NatTableEditorFactory_resultsForQuery;
	public static String TableEditorInput_modelTable;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
