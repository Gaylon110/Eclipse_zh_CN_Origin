/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Nicolas Bros (Mia-Software) - Bug 379436 - [Table] read-only resources should not be editable
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.action;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.selection.command.SelectCellCommand;
import net.sourceforge.nattable.ui.action.IMouseAction;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;

public class MouseEditAction implements IMouseAction {

	private NatTableWidget natTableWidget;

	public MouseEditAction(final NatTableWidget natTableWidget) {
		this.natTableWidget = natTableWidget;
	}

	public void run(final NatTable natTable, final MouseEvent event) {
		int columnPosition = natTable.getColumnPositionByX(event.x);
		int rowPosition = natTable.getRowPositionByY(event.y);

		boolean withShiftMask = (event.stateMask & SWT.SHIFT) != 0;
		boolean withCtrlMask = (event.stateMask & SWT.CTRL) != 0;

		natTable.doCommand(new SelectCellCommand(natTable, columnPosition, rowPosition, withShiftMask, withCtrlMask));

		this.natTableWidget.getController().editSelectedCell();
	}
}