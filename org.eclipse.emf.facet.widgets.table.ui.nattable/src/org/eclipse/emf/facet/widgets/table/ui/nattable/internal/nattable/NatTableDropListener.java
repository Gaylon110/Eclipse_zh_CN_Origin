/*******************************************************************************
 * Copyright (c) 2010, 2017 CEA LIST, and Soft-Maint.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *    Nicolas Bros (Mia-Software) - Bug 331757 - drag & drop EObjects to table cells
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377754 - [Table] right click deselects elements
 *    Jonathan Pepin (Soft-Maint) - Bug 518250 - Element dragged over the table must be presentable
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.graphics.Point;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.coordinate.PositionCoordinate;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.selection.SelectionLayer;

/** The class which handle drag and drop events on the table */
public class NatTableDropListener implements DropTargetListener {

	private final NatTable natTable;
	private final NatTableWidget natTableWidget;

	public NatTableDropListener(final NatTable fNatTable, final NatTableWidget natTableWidget) {
		this.natTable = fNatTable;
		this.natTableWidget = natTableWidget;
	}

	public void dragEnter(final DropTargetEvent event) {
		// this.natTable.forceFocus();
	}

	public void dragLeave(final DropTargetEvent event) {
		// Nothing for now

	}

	public void dragOperationChanged(final DropTargetEvent event) {
		// Nothing for now
	}

	public void dragOver(final DropTargetEvent event) {
		LocalTransfer localTransfer = LocalTransfer.getInstance();
		Object data = localTransfer.nativeToJava(event.currentDataType);
		IStructuredSelection structuredSelection = null;
		if (data instanceof IStructuredSelection) {
			structuredSelection = (IStructuredSelection) data;
		}
		final Point point = this.natTableWidget.toControl(event.x, event.y);
		final IGridElement gridElement = getSelectedGridElementAndSelect(point);
		Column column = null;
		Row row = null;
		if (gridElement != null) {
			column = gridElement.getColumn();
			row = gridElement.getRow();
		}
		if (this.natTableWidget.getController()
				.canBeDropped(structuredSelection, row, column)) {
			event.detail = DND.DROP_COPY;
		} else {
			event.detail = DND.DROP_NONE;
		}
	}

	protected IGridElement getSelectedGridElementAndSelect(final Point point) {
		IGridElement result = null;
		final List<PositionCoordinate> selectedCellsPos = this.natTableWidget
				.getSelectedCellsPositionCoordinates();
		final PositionCoordinate cellPosition = this.natTableWidget
				.getCellPositionAt(point.x, point.y);
		final SelectionLayer selectionLayer = this.natTableWidget.getBodyLayer()
				.getSelectionLayer();
		if (cellPosition == null) {
			if (selectedCellsPos.size() != 0) {
				selectionLayer.clear();
				this.natTable.redraw();
			}
		} else {
			result = getGridElement(cellPosition);
			if (selectedCellsPos.size() != 1
					|| !selectedCellsPos.get(0).equals(cellPosition)) {
				final int columnPos = cellPosition.getColumnPosition();
				final int rowPos = cellPosition.getRowPosition();
				selectionLayer.selectCell(columnPos, rowPos, false, false);
				this.natTable.redraw();
			}
		}
		return result;
	}

	public void drop(final DropTargetEvent event) {
		Point point = this.natTableWidget.toControl(event.x, event.y);
		PositionCoordinate cellPosition = this.natTableWidget.getCellPositionAt(point.x, point.y);
		if (event.data instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) event.data;
			if (cellPosition == null) {
				this.natTableWidget.getController().drop(structuredSelection);
			} else {
				IGridElement gridElement = getGridElement(cellPosition);
				if (gridElement != null) {
					dropOnGridElement(structuredSelection, gridElement);
				}
			}
		}
	}

	private IGridElement getGridElement(final PositionCoordinate cellPosition) {
		IGridElement result = null;
		final LayerCell cell = this.natTableWidget.getCellAt(
				cellPosition.getColumnPosition(),
				cellPosition.getRowPosition());
		if (cell != null) {
			Object dataValue = cell.getDataValue();
			if (dataValue instanceof IGridElement) {
				result = (IGridElement) dataValue;
			}
		}
		return result;
	}

	private void dropOnGridElement(final StructuredSelection structuredSelection,
			final IGridElement gridElement) {
		Column column = gridElement.getColumn();
		if (column instanceof FeatureColumn) {
			FeatureColumn featureColumn = (FeatureColumn) column;
			if (featureColumn.getFeature() instanceof EStructuralFeature) {
				EStructuralFeature structuralFeature = (EStructuralFeature) featureColumn
						.getFeature();
				dropOnFeature(structuredSelection, gridElement.getElement(),
						structuralFeature);
			} else {
				Logger.logError(
						"unhandled case:" + column.eClass().getName(), Activator.getDefault()); //$NON-NLS-1$
			}
		} else {
			Logger.logError(
					"unhandled case:" + column.eClass().getName(), Activator.getDefault()); //$NON-NLS-1$
		}
	}

	private void dropOnFeature(final StructuredSelection structuredSelection, final Object element,
			final EStructuralFeature feature) {
		if (!confirmMove((EObject) element, feature)) {
			return;
		}
		this.natTableWidget.getController().drop(structuredSelection, element, feature);
	}

	private boolean confirmMove(final EObject eObject, final EStructuralFeature feature) {
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.isContainment()) {
				Object list = eObject.eGet(feature);
				boolean empty = (list == null || list instanceof List && ((List<?>) list).isEmpty());
				String message;
				if (!empty && !feature.isMany()) {
					message = Messages.NatTableDropListener_valueWillBeMovedAndPreviousLost;
				} else {
					message = Messages.NatTableDropListener_valueWillBeMoved;
				}
				String fullMessage = Messages.NatTableDropListener_compositeFeature + message;

				return MessageDialog.openConfirm(null, Messages.NatTableDropListener_moveElement,
						fullMessage);
			}
		}
		return true;
	}

	public void dropAccept(final DropTargetEvent event) {
		//
	}

}
