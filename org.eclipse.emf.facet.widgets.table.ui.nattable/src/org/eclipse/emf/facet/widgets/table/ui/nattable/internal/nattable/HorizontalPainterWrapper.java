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
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.painter.cell.ICellPainter;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

public class HorizontalPainterWrapper implements ICellPainter {
	private final List<ICellPainter> painters = new LinkedList<ICellPainter>();

	public HorizontalPainterWrapper(final Collection<ICellPainter> cellPainters) {
		this.painters.addAll(cellPainters);
	}

	public HorizontalPainterWrapper(final ICellPainter[] iCellPainters) {
		this.painters.addAll(Arrays.asList(iCellPainters));
	}

	public int getPreferredWidth(final LayerCell cell, final GC gc,
			final IConfigRegistry configRegistry) {
		int width = 0;
		for (ICellPainter painter : this.painters) {
			width += painter.getPreferredWidth(cell, gc, configRegistry);
		}
		return width;
	}

	public int getPreferredHeight(final LayerCell cell, final GC gc,
			final IConfigRegistry configRegistry) {
		int height = 0;
		for (ICellPainter painter : this.painters) {
			height += painter.getPreferredHeight(cell, gc, configRegistry);
		}
		return height;
	}

	public void paintCell(final LayerCell cell, final GC gc, final Rectangle bounds,
			final IConfigRegistry configRegistry) {
		Rectangle remainingBounds = new Rectangle(bounds.x, bounds.y, bounds.width, bounds.height);
		for (Iterator<ICellPainter> iter = this.painters.iterator(); iter.hasNext();) {
			ICellPainter painter = iter.next();
			int width = painter.getPreferredWidth(cell, gc, configRegistry);
			int w;
			if (iter.hasNext()) {
				w = width;
			} else {
				w = remainingBounds.width;
			}
			Rectangle interiorBounds = new Rectangle(remainingBounds.x, remainingBounds.y, w,
					remainingBounds.height);
			painter.paintCell(cell, gc, interiorBounds, configRegistry);
			remainingBounds.x += width;
			remainingBounds.width -= width;
			if (bounds.x + bounds.width < remainingBounds.x) {
				break;
			}
		}
	}
}