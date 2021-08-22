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
 *    Fabien Treguer (Soft-Maint) - Bug 422829 - [Table] Row height too small when Windows dpi settings are increased
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.data.IDataProvider;
import net.sourceforge.nattable.grid.layer.RowHeaderLayer;
import net.sourceforge.nattable.layer.AbstractLayerTransform;
import net.sourceforge.nattable.layer.DataLayer;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.DefaultSizeUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget.BodyLayerStack;

public class RowHeaderLayerStack extends AbstractLayerTransform {

	public RowHeaderLayerStack(final IDataProvider dataProvider, final BodyLayerStack bodyLayer) {
		DataLayer dataLayer = new DataLayer(dataProvider, DefaultSizeUtils.getRowHeaderWidth(dataProvider.getRowCount()),
				DefaultSizeUtils.getDefaultCellHeight());
		RowHeaderLayer rowHeaderLayer = new RowHeaderLayer(dataLayer, bodyLayer,
				bodyLayer.getSelectionLayer());
		setUnderlyingLayer(rowHeaderLayer);
	}
}