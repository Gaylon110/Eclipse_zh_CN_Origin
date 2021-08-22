/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import net.sourceforge.nattable.command.LayerCommandUtil;
import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.coordinate.ColumnPositionCoordinate;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.painter.cell.ImagePainter;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget.BodyLayerStack;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

public class HeaderImagePainter extends ImagePainter {

	private final BodyLayerStack bodyLayer;
	private final List<Column> columns;
	private final ILabelProvider labelProvider;

	public HeaderImagePainter(final BodyLayerStack bodyLayer,
			final List<Column> columns, final ILabelProvider labelProvider) {
		super(null, false);
		this.bodyLayer = bodyLayer;
		this.columns = columns;
		this.labelProvider = labelProvider;
	}

	@Override
	protected Image getImage(final LayerCell cell, final IConfigRegistry configRegistry) {
		ColumnPositionCoordinate converted = LayerCommandUtil.convertColumnPositionToTargetContext(
				new ColumnPositionCoordinate(cell.getLayer(), cell.getColumnPosition()),
				this.bodyLayer.getBodyDataLayer());

		if (converted != null && converted.columnPosition >= 0
				&& converted.columnPosition < this.columns.size()) {
			return getColumnImage(this.columns.get(converted.columnPosition));
		}
		return null;
	}

	private Image getColumnImage(final Column column) {
		if (column instanceof FeatureColumn) {
			FeatureColumn referenceColumn = (FeatureColumn) column;
			final ETypedElement reference = referenceColumn.getFeature();
			return this.labelProvider.getImage(reference);
		}
		return null;
	}
}
