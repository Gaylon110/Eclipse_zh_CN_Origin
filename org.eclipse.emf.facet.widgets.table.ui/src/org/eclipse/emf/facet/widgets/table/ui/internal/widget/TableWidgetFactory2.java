/*******************************************************************************
 * Copyright (c) 2011, 2017 CEA LIST, and Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	  Gregoire Dupe (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Gr�goire Dup� (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Thomas Cicognani (Mia-Software) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class TableWidgetFactory2 implements
		org.eclipse.emf.facet.widgets.table.ui.ITableWidgetFactory {

	private final TableWidgetViewFactoryRegistry vFactoryRegistry = new TableWidgetViewFactoryRegistry();

	public ITableWidget createTableWidget(final Composite parent,
			final IEditingDomainProvider edProvider, final Table tableInstance,
			final MenuManager menuMgr) {
		final ITableWidgetInternal tableWidget = new TableWidget(parent,
				edProvider, tableInstance, menuMgr,
				this.vFactoryRegistry.getDefaut());
		final Display display = parent.getDisplay();
		return new SynchronizedTableWidgetController(tableWidget, display);
	}

}
