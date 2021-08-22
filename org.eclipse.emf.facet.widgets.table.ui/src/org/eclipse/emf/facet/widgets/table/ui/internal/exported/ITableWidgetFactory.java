/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	  Gregoire Dupe (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.TableWidgetFactory;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Composite;

/**
 * This interface allows the user to create an EMF Facet ITableWidget.
 */
public interface ITableWidgetFactory {

	ITableWidgetFactory INSTANCE = new TableWidgetFactory();

	/**
	 * This method instantiates a new {@link ITableWidget} initialized with the given parameters.
	 * 
	 * @param parent
	 *            the SWT Composite in which the table will be created
	 * @param edProvider
	 *            provides an editing domain for enabling editing in the table
	 * @param tableInstance
	 *            an instance of the {@link Table} model element, that represents the table's data model which contains
	 *            all the needed information to open a table
	 * @param menuMgr
	 *            a menu manager used for creating the table's context menu
	 * 
	 * @return a new {@link ITableWidget} instance
	 */
	ITableWidget createTableWidget(Composite parent,
			IEditingDomainProvider edProvider, Table tableInstance,
			MenuManager menuMgr);

}
