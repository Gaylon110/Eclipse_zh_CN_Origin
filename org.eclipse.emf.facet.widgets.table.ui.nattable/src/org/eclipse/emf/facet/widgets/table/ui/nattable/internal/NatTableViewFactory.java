/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Grégoire Dupé (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetView;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetViewFactory;
import org.eclipse.swt.widgets.Composite;

public class NatTableViewFactory implements ITableWidgetViewFactory {

	public ITableWidgetView createTableView(final Composite parent,
			final ITableWidget contoller) {
		return new NatTableWidget(parent, (ITableWidgetInternal) contoller);
	}

}
