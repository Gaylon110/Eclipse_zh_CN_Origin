/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *   Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Nicolas Bros (Mia-Software) - Bug 377754 - [Table] right click deselects elements
 *   Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.config.AbstractUiBindingConfiguration;
import net.sourceforge.nattable.coordinate.PositionCoordinate;
import net.sourceforge.nattable.grid.GridRegion;
import net.sourceforge.nattable.layer.LabelStack;
import net.sourceforge.nattable.selection.action.SelectCellAction;
import net.sourceforge.nattable.selection.command.ClearAllSelectionsCommand;
import net.sourceforge.nattable.ui.action.IMouseAction;
import net.sourceforge.nattable.ui.binding.UiBindingRegistry;
import net.sourceforge.nattable.ui.matcher.IMouseEventMatcher;
import net.sourceforge.nattable.ui.matcher.MouseEventMatcher;
import net.sourceforge.nattable.viewport.action.ViewportSelectRowAction;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.action.SelectColumnAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;

public class UIBindings extends AbstractUiBindingConfiguration {

	private final NatTableWidget natTableWidget;

	public UIBindings(final NatTableWidget natTableWidget) {
		this.natTableWidget = natTableWidget;
	}

	public void configureUiBindings(final UiBindingRegistry uiBindingRegistry) {
		// select cell under cursor before showing context menu		
		uiBindingRegistry.registerFirstMouseDownBinding(new MouseEventMatcher(SWT.NONE,
				GridRegion.BODY, MouseEventMatcher.RIGHT_BUTTON) {
			@Override
			public boolean matches(final NatTable natTable, final MouseEvent event,
					final LabelStack regionLabels) {
				return super.matches(natTable, event, regionLabels) && !isAlreadyInSelection(event);
			}
		}, new SelectCellAction());
		
		// select the whole column when a right click occurs on the table HEADER
		uiBindingRegistry.registerFirstMouseDownBinding(new MouseEventMatcher(SWT.NONE,
				GridRegion.COLUMN_HEADER, MouseEventMatcher.RIGHT_BUTTON) {
			@Override
			public boolean matches(final NatTable natTable, final MouseEvent event,
					final LabelStack regionLabels) {
				return super.matches(natTable, event, regionLabels) && !areColumnsSelected();
			}
		}, new SelectColumnAction());

		// deselect all when clicking in empty space
		uiBindingRegistry.registerFirstMouseDownBinding(new IMouseEventMatcher() {
			public boolean matches(final NatTable natTable, final MouseEvent event,
					final LabelStack regionLabels) {
				return (regionLabels == null);
			}
		}, new IMouseAction() {
			public void run(final NatTable natTable, final MouseEvent event) {
				natTable.doCommand(new ClearAllSelectionsCommand());
				natTable.redraw();
				UIBindings.this.natTableWidget.tableSelectionChanged();
			}
		});

		// cell whole row when right-clicking in the row header
		uiBindingRegistry.registerSingleClickBinding(new MouseEventMatcher(SWT.NONE,
				GridRegion.ROW_HEADER, MouseEventMatcher.RIGHT_BUTTON),
				new ViewportSelectRowAction(false, false));
				
	}

	protected boolean areColumnsSelected() {
		if (this.natTableWidget.getSelectedColumns() != null) {
			return this.natTableWidget.getSelectedColumns().size() > 1;
		}
		return false;
	}

	protected boolean isAlreadyInSelection(final MouseEvent event) {
		PositionCoordinate cellPosition = this.natTableWidget.getCellPositionAt(event.x, event.y);
		return this.natTableWidget.getSelectedCellsPositionCoordinates().contains(cellPosition);
	}

}
