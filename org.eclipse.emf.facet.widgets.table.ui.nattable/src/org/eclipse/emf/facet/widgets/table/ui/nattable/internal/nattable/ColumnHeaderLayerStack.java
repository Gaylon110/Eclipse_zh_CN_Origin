/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 352485 - [Table] Default height of cells is too small, leading to text truncations
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.data.IDataProvider;
import net.sourceforge.nattable.grid.layer.ColumnHeaderLayer;
import net.sourceforge.nattable.layer.AbstractLayerTransform;
import net.sourceforge.nattable.layer.DataLayer;
import net.sourceforge.nattable.sort.ISortModel;
import net.sourceforge.nattable.sort.SortDirectionEnum;
import net.sourceforge.nattable.sort.SortHeaderLayer;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.DefaultSizeUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget.BodyLayerStack;

public class ColumnHeaderLayerStack extends AbstractLayerTransform {

	private final DataLayer dataLayer;

	public ColumnHeaderLayerStack(final IDataProvider dataProvider, final BodyLayerStack bodyLayer, final ITableWidgetInternal tableController) {
		this.dataLayer = new DataLayer(dataProvider, DefaultSizeUtils.getDefaultCellWidth(), DefaultSizeUtils.getDefaultCellHeight());
		final ColumnHeaderLayer colHeaderLayer = new ColumnHeaderLayer(this.dataLayer, bodyLayer,
				bodyLayer.getSelectionLayer());

		final ISortModel sortModel = new ISortModel() {
			private int sortedColumn = -1;
			private SortDirectionEnum fSortDirection = SortDirectionEnum.NONE;

			public void sort(final int columnIndex, final SortDirectionEnum sortDirection,
					final boolean accumulate) {
				this.sortedColumn = columnIndex;
				this.fSortDirection = sortDirection;
				
				final Column column = tableController.getColumns().get(columnIndex);
				tableController.sortRows(column, sortDirection(sortDirection));
			}

			public boolean isColumnIndexSorted(final int columnIndex) {
				return columnIndex == this.sortedColumn
						&& this.fSortDirection != SortDirectionEnum.NONE;
			}

			public int getSortOrder(final int columnIndex) {
				// we only ever sort one column at a time
				return 0;
			}

			public SortDirectionEnum getSortDirection(final int columnIndex) {
				if (columnIndex == this.sortedColumn) {
					return this.fSortDirection;
				}
				return SortDirectionEnum.NONE;
			}

			public void clear() {
				this.sortedColumn = -1;
				this.fSortDirection = SortDirectionEnum.NONE;
			}
		};

		final SortHeaderLayer<ISortModel> sortHeaderLayer = new SortHeaderLayer<ISortModel>(
				colHeaderLayer, sortModel, true);

		setUnderlyingLayer(sortHeaderLayer);
	}

	protected static ColumnSortDirection sortDirection(final SortDirectionEnum sortDirection) {
		ColumnSortDirection result;
		switch (sortDirection) {
		case ASC:
			result = ColumnSortDirection.ASCENDING;
			break;
		case DESC:
			result = ColumnSortDirection.DESCENDING;
			break;
		case NONE:
			result = ColumnSortDirection.UNSORTED;
			break;
		default:
			throw new IllegalStateException("unknown sort literal"); //$NON-NLS-1$
		}
		return result;
	}

	public DataLayer getDataLayer() {
		return this.dataLayer;
	}
}