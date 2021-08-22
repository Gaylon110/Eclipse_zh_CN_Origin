/*******************************************************************************
 * Copyright (c) 2012 Mia-Software
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *   Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.dataprovider;

import java.util.List;

import net.sourceforge.nattable.data.IDataProvider;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;

public class ColumnHeaderDataProvider implements IDataProvider {
	private final List<Column> columns;

	public ColumnHeaderDataProvider(final NatTableWidget natTableWidget) {
		this.columns = natTableWidget.getController().getTable().getColumns();
	}

	public int getRowCount() {
		return 1;
	}

	public int getColumnCount() {
		return this.columns.size();
	}

	public Object getDataValue(final int columnIndex, final int rowIndex) {
		Object result = null;
		if (columnIndex >= 0) {
			result = this.columns.get(columnIndex);
		}
		return result;
	}

	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {
		//Nothing to do.
	}
}