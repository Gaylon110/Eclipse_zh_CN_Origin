/*******************************************************************************
 * Copyright (c) 2010, 2017 CEA LIST, and Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331675 - NatTable : copy cells as text - initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *   Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *   Grégoire Dupé (Mia-Software) - Bug 516034 - [Table] The copy action should add the selection into the clipboard
 *   Grégoire Dupé (Mia-Software) - Bug 516157 - [Table] The "copy to clipboard" action doesn't use the customization
 *   Grégoire Dupé (Mia-Software) - Bug 516399 - [Table] Copy of non-contiguous selection
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.handler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;

import net.sourceforge.nattable.coordinate.PositionCoordinate;
import net.sourceforge.nattable.copy.command.CopyDataCommandHandler;
import net.sourceforge.nattable.copy.command.CopyDataToClipboardCommand;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.selection.SelectionLayer;

public class CopyToClipboardCommandHandler extends CopyDataCommandHandler {

	private static final String NEW_LINE = System.getProperty("line.separator"); //$NON-NLS-1$
	private final NatTableWidget widget;
	private final SelectionLayer selectionLayer;

	public CopyToClipboardCommandHandler(final SelectionLayer selectionLayer,
			final NatTableWidget widget) {
		super(selectionLayer);
		this.selectionLayer = selectionLayer;
		this.widget = widget;
	}

	@Override
	public boolean doCommand(final CopyDataToClipboardCommand command) {
		final LayerCell[][] copiedCells = assembleCopiedDataStructure();
		serializeToClipboard(command, copiedCells);
		return true;
	}

	private void serializeToClipboard(final CopyDataToClipboardCommand command,
			final LayerCell[][] copiedCells) {
		final String textData = createTextData(command, copiedCells);
		final ISelection localData = createLocalData();
		if (textData.length() > 0 || !localData.isEmpty()) {
			final Object[] data = new Object[] {
					textData,
					localData };
			final Transfer[] dataTypes = new Transfer[] {
					TextTransfer.getInstance(),
					LocalTransfer.getInstance() };
			final Clipboard clipboard = command.getClipboard();
			clipboard.setContents(data, dataTypes);
		}
	}

	protected String createTextData(final CopyDataToClipboardCommand command,
			final LayerCell[][] copiedCells) {
		String result;
		try {
			result = getContigusCellText(command, copiedCells);
		} catch (Exception e) {
			result = getNonContigusCellText();
		}
		return result;
	}

	protected String getContigusCellText(
			final CopyDataToClipboardCommand command,
			final LayerCell[][] copiedCells) {
		final String cellDelimeter = command.getCellDelimeter();
		final StringBuilder textData = new StringBuilder();
		int currentRow = 0;
		for (LayerCell[] cells : copiedCells) {
			if (currentRow == 0) {
				final String header = createHeaderText(cellDelimeter, cells);
				textData.append(header);
			}
			boolean first = true;
			for (LayerCell cell : cells) {
				if (first) {
					first = false;
				} else {
					textData.append(cellDelimeter);
				}
				if (cell != null) {
					textData.append(createCellText(cell));
				}
			}
			if (++currentRow < copiedCells.length) {
				textData.append(NEW_LINE);
			}
		}
		return textData.toString();
	}

	protected String getNonContigusCellText() {
		final StringBuilder result = new StringBuilder();
		final PositionCoordinate[] selectedCells = this.selectionLayer
				.getSelectedCells();
		for (PositionCoordinate positionCoordinate : selectedCells) {
			final int columnPosition = positionCoordinate
					.getColumnPosition();
			final int rowPosition = positionCoordinate.getRowPosition();
			final Table table = this.widget.getController().getTable();
			final Row row = table.getRows().get(rowPosition);
			final Column column = table.getColumns().get(columnPosition);
			if (column instanceof FeatureColumn) {
				final FeatureColumn featureColumn = (FeatureColumn) column;
				final ETypedElement feature = featureColumn.getFeature();
				final Object valueStr = getCellValueStr(row, feature);
				result.append(valueStr);
				result.append(NEW_LINE);
			}
		}
		return result.toString();
	}

	protected String getCellValueStr(final Row row,
			final ETypedElement feature) {
		String result;
		try {
			final Object value = getCellValue(feature, row.getElement());
			result = getLabelProvider().getText(value);
		} catch (FacetManagerException e1) {
			result = "!!! ERRORR, cf. log !!!"; //$NON-NLS-1$
			Logger.logError(e1, Activator.getDefault());
		}
		return result;
	}

	protected String createCellText(final LayerCell cell) {
		String result = ""; //$NON-NLS-1$
		final Object dataValue = cell.getDataValue();
		if (dataValue instanceof IGridElement) {
			final IGridElement gridElement = (IGridElement) dataValue;
			final ETypedElement columnFeature = ((FeatureColumn) gridElement
					.getColumn()).getFeature();
			final Row row = gridElement.getRow();
			result = getCellValueStr(row, columnFeature);
		}
		return result;
	}

	protected Object getCellValue(final ETypedElement columnFeature,
			final EObject element) throws FacetManagerException {
		final ITableWidgetInternal controller = this.widget.getController();
		final IFacetManager facetContext = controller.getFacetContext();
		return facetContext.getOrInvoke(element, columnFeature, Object.class);
	}

	protected ICustomizedLabelProvider getLabelProvider() {
		final ITableWidgetInternal controller = this.widget.getController();
		return controller.getTableLabelProvider();
	}

	protected String createHeaderText(final String cellDelimeter,
			final LayerCell[] cells) {
		final StringBuilder result = new StringBuilder();
		final String[] columnNames = this.widget.getColumnNames();
		boolean first = true;
		for (LayerCell cell : cells) {
			if (first) {
				first = false;
			} else {
				result.append(cellDelimeter);
			}
			final int originColumnPosition = cell.getOriginColumnPosition();
			final int converted = this.widget
					.convertColumnPositionSelectionToData(
							originColumnPosition);
			result.append(columnNames[converted]);
		}
		result.append(NEW_LINE);
		return result.toString();
	}

	private ISelection createLocalData() {
		final ITableWidgetInternal controller = this.widget.getController();
		return controller.getSelection();
	}
}