/*******************************************************************************
 * Copyright (c) 2016, 2017 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Grégoire Dupé (Mia-Software) - Bug 506320 - [Table] The table widget should provide the drag support
 *     Grégoire Dupe (Mia-Software) - Bug 516054 - [Table] The "drag event" does not contains the selection
 *     Jonathan Pepin (Soft-Maint) - Bug 518304 - Conflict between the column/row resize and the drag and drop
 *    Jonathan Pepin (Soft-Maint) - Bug 518636 - Drag and drop compatible with LocalSelectionTransfer
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.grid.GridRegion;

public final class TableDragSourceListener implements DragSourceListener {

	private ISelection selection;
	private final ITableWidgetInternal tableWidgetController;
	private final NatTable natTable;

	public TableDragSourceListener(
			final ITableWidgetInternal tableWidgetController,
			final NatTable natTable) {
		this.tableWidgetController = tableWidgetController;
		this.natTable = natTable;
	}

	public void dragStart(final DragSourceEvent event) {
		this.selection = this.tableWidgetController.getSelection();
		if (this.selection.isEmpty()
				|| !this.natTable.getRegionLabelsByXY(event.x, event.y)
						.hasLabel(GridRegion.BODY)) {
			event.doit = false;
		} else {
			event.doit = true;
		}
	}

	public void dragSetData(final DragSourceEvent event) {
		if (this.selection instanceof IStructuredSelection) {
			if (LocalTransfer.getInstance().isSupportedType(event.dataType)) {
				event.data = this.selection;
			} else if (LocalSelectionTransfer.getTransfer()
					.isSupportedType(event.dataType)) {
				LocalSelectionTransfer.getTransfer()
						.setSelection(this.selection);
				event.data = this.selection;
			}
		} else {
			event.doit = false;
		}
	}

	public void dragFinished(final DragSourceEvent event) {
		this.selection = null;
	}
}
