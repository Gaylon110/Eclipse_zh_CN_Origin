/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.action;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.selection.action.AbstractMouseSelectionAction;
import net.sourceforge.nattable.viewport.command.ViewportSelectColumnCommand;

import org.eclipse.swt.events.MouseEvent;

public class SelectColumnAction extends AbstractMouseSelectionAction {

	@Override
	public void run(final NatTable natTable, final MouseEvent event) {
    	super.run(natTable, event);
        natTable.doCommand(new ViewportSelectColumnCommand(natTable, getGridColumnPosition(), isWithShiftMask(), isWithControlMask()));
    }
}
