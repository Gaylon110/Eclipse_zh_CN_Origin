/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Jonathan Pepin (Soft-Maint) - Bug 518402 - Add test to open table view
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.view;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableView;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableViewFactory;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.TableViewException;

public class TableViewFactory implements ITableViewFactory {

	public ITableView openOn(final URI uri) throws TableViewException {
		final ResourceSetImpl resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.getResource(uri, true);
		final EObject firstElement = resource.getContents().get(0);
		if (!(firstElement instanceof Table)) {
			throw new TableViewException(String.format(
					"The resource '%s' must contain an instance of 'Table' as first root.", //$NON-NLS-1$
					uri));
		}
		final Table table = (Table) firstElement;
		return TableView.openOn(table, null);
	}

}
