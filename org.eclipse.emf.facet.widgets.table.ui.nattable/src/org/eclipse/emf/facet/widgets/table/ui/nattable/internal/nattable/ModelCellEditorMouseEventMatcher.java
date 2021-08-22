/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.grid.GridRegion;
import net.sourceforge.nattable.layer.LabelStack;
import net.sourceforge.nattable.ui.matcher.IMouseEventMatcher;

import org.eclipse.swt.events.MouseEvent;

public class ModelCellEditorMouseEventMatcher implements IMouseEventMatcher {

	public ModelCellEditorMouseEventMatcher() {
	}

	public boolean matches(final NatTable natTable, final MouseEvent event,
			final LabelStack regionLabels) {
		if (regionLabels != null && regionLabels.hasLabel(GridRegion.BODY)) {
			// LayerCell cell =
			// natTable.getCellByPosition(natTable.getColumnPositionByX(event.x),
			// natTable.getRowPositionByY(event.y));
			// ICellEditor cellEditor =
			// natTable.getConfigRegistry().getConfigAttribute(
			// EditConfigAttributes.CELL_EDITOR, cell.getDisplayMode(),
			// cell.getConfigLabels().getLabels());
			// if (cellEditor instanceof NatTableCellEditorAdapter) {
			// return true;
			// }
			return true;
		}
		return false;
	}
}