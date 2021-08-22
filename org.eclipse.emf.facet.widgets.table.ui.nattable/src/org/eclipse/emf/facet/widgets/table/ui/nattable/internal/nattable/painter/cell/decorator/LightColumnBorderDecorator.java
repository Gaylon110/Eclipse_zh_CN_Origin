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

public class LightColumnBorderDecorator extends CellPainterWrapper {


	private static final int DIM_DECAY = 4;

	public LightColumnBorderDecorator(final ICellPainter interiorPainter) {
		super(interiorPainter);
	}

	@Override
	public int getPreferredWidth(final LayerCell cell, final GC gc,
			final IConfigRegistry configRegistry) {
		return super.getPreferredWidth(cell, gc, configRegistry) + DIM_DECAY;
	}

	@Override
	public int getPreferredHeight(final LayerCell cell, final GC gc,
			final IConfigRegistry configRegistry) {
		return super.getPreferredHeight(cell, gc, configRegistry) + DIM_DECAY;
	}

	@Override
	public void paintCell(final LayerCell cell, final GC gc,
			final Rectangle rectangle, final IConfigRegistry configRegistry) {
		final Rectangle interiorBounds = new Rectangle(rectangle.x,
				rectangle.y, rectangle.width, rectangle.height);

		super.paintCell(cell, gc, interiorBounds, configRegistry);

		// Save GC settings
		final Color originalForeground = gc.getForeground();

		gc.setForeground(ColorUtils.getHeaderBorderColor());
		gc.drawLine(rectangle.x, rectangle.y + rectangle.height - 1,
				rectangle.x + rectangle.width - 1, rectangle.y
						+ rectangle.height - 1);
		gc.drawLine(rectangle.x + rectangle.width - 1, rectangle.y, rectangle.x
				+ rectangle.width - 1, rectangle.y + rectangle.height - 1);
		// Restore GC settings
		gc.setForeground(originalForeground);
	}

}
