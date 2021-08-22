/*******************************************************************************
 * Copyright (c) 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    David Couvrand (Soft-Maint) - Bug 424992 - [Table] Change Look&Feel from beveled to MS Excel-like
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.cell.decorator;

import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.painter.cell.CellPainterWrapper;
import net.sourceforge.nattable.painter.cell.ICellPainter;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.ColorUtils;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

public class LightCornerBorderDecorator extends CellPainterWrapper {

	private static final int PT_CORN_SIZE = 6;
	private static final int DIM_DECAY = 4;
	private static final int CORN_DIM_RATIO = 3;
	private static final int CORN_DIM_DECAY = 2;
	private static final int IDX0 = 0;
	private static final int IDX1 = 1;
	private static final int IDX2 = 2;
	private static final int IDX3 = 3;
	private static final int IDX4 = 4;
	private static final int IDX5 = 5;

	public LightCornerBorderDecorator(final ICellPainter interiorPainter) {
		super(interiorPainter);
	}

	@Override
	public void paintCell(final LayerCell cell, final GC gc,
			final Rectangle rectangle, final IConfigRegistry configRegistry) {
		final Rectangle interiorBounds = new Rectangle(rectangle.x,
				rectangle.y, rectangle.width, rectangle.height);

		super.paintCell(cell, gc, interiorBounds, configRegistry);

		// Save GC settings
		final Color originalForeground = gc.getForeground();
		final Color originalBackground = gc.getBackground();

		gc.setForeground(ColorUtils.getHeaderBorderColor());
		gc.setBackground(ColorUtils.getCornerColor());
		gc.drawLine(rectangle.x + rectangle.width - 1, rectangle.y, rectangle.x
				+ rectangle.width - 1,
				rectangle.y + rectangle.height);
		gc.drawLine(rectangle.x, rectangle.y + rectangle.height - 1,
				rectangle.x + rectangle.width - 1, rectangle.y
						+ rectangle.height - 1);
		final int[] pointArray = new int[PT_CORN_SIZE];
		pointArray[IDX0] = rectangle.x + (rectangle.width / CORN_DIM_RATIO)
				- CORN_DIM_DECAY;
		pointArray[IDX1] = rectangle.y + rectangle.height - DIM_DECAY;
		pointArray[IDX2] = rectangle.x + rectangle.width - DIM_DECAY;
		pointArray[IDX3] = rectangle.y + (rectangle.height / CORN_DIM_RATIO)
				- CORN_DIM_DECAY;
		pointArray[IDX4] = rectangle.x + rectangle.width - DIM_DECAY;
		pointArray[IDX5] = rectangle.y + rectangle.height - DIM_DECAY;
		gc.fillPolygon(pointArray);

		// Restore GC settings
		gc.setForeground(originalForeground);
		gc.setBackground(originalBackground);
	}

}
