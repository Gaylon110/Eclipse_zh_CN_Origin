/*******************************************************************************
 * Copyright (c) 2010, 2017 Mia-Software, CEA-LIST, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *    Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table
 *    Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *    Nicolas Bros (Mia-Software) - Bug 332440 - NatTable : force cell editors
 *    Nicolas Bros (Mia-Software) - Bug 331675 - NatTable : copy cells as text
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332010 - view Facet customizations on NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333414 - The user must be able to save the column order
 *    Nicolas Guyomar (Mia-Software) - Bug 335154 - Sort Column By Type : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335155 - Hide Empty Column : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335156 - Only Show Common column : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 337322 - [TableConfiguration] Customization declared in the file tableconfiguration is not loaded
 *    Nicolas Guyomar (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *    Nicolas Bros (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *    Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *    Nicolas Guyomar (Mia-Software) - Bug 337395 - Unused columns should be destroyed
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning
 *    Nicolas Guyomar (Mia-Software) - Bug 339922 - INatTableWidget method isCellSelected should use the plural
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Vincent Lorenzo (CEA-LIST) - Bug 337326 - Show/Hide Column : Sort the columns by name
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Vincent Lorenzo (CEA-LIST) - Bug 337408 - Add an action to sort columns by name
 *    Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Gregoire Dupe (Mia-Software) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 343411 - [Table] Create new elements does not support IJavaModelQuery anymore
 *    Gregoire Dupe (Mia-Software) - Bug 343811 - EMF Facet Regression : Created elements in a table are not serialized
 *    Vincent Lorenzo (CEA-LIST) - Bug 344125 - The API should provide a method selectRows(List<EObject> elementsToSelect)
 *    Nicolas Guyomar (Mia-Software) - Bug 344274 - SWT BOT fail on Hudson
 *    Nicolas Guyomar (Mia-Software) - Bug 344475 - To be able to select a cell by EStructuralFeature in the table
 *    Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *    Nicolas Guyomar (Mia-Software) - Bug 344413 - Facet Columns are never created when we begin with an empty table
 *    Gregoire Dupe (Mia-Software) - Bug 343859 - The local customizations are not applied when we reopen a table
 *    Nicolas Guyomar (Mia-Software) - Bug 344670 - Problems with the columns creation : very slow + scrollbar blinked
 *    Nicolas Guyomar (Mia-Software) - Bug 345554 - SWTBot regression on build 303
 *    Nicolas Guyomar (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns
 *    Nicolas Guyomar (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *    Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Vincent Lorenzo (CEA-LIST) - Bug 352822 - CellEditor EEnum is not available for FacetAttribute
 *    Nicolas Bros (Mia-Software) - Bug 352822 - CellEditor EEnum is not available for FacetAttribute
 *    Vincent Lorenzo (CEA-LIST) - Bug 351931 - Use local cell editor in table
 *    Vincent Lorenzo (CEA-LIST) - Bug 352580 - Facets are loaded to late
 *    Gregoire Dupe (Mia-Software) - Bug 354224 - mutually exclusive Facets
 *    Nicolas Guyomar (Mia-Software) - Bug 342154 - EMF Facet API should be covered with Unit tests
 *    Nicolas Bros (Mia-Software) - Bug 357593 - [Table] Table take focus after each refresh
 *    Grégoire Dupé (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 352485 - [Table] Default height of cells is too small, leading to text truncations
 *    Gregoire Dupe (Mia-Software) - Bug 352608 - [Table] marker at the end of the truncated displayed text
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 377483 - [Table] cell editors don't open
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377754 - [Table] right click deselects elements
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *    Nicolas Bros (Mia-Software) - Bug 378271 - [Table] Select Columns To Hide is broken
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Nicolas Bros (Mia-Software) - Bug 379436 - [Table] read-only resources should not be editable
 *    Gregoire Dupe (Mia-Software) - Bug 380293 - [Table] Columns declared in tableconfiguration are never created when we create an empty table
 *    Thomas Cicognani (Soft-Maint) - Bug 418990 - Add MouseListener on TableView
 *    Thomas Cicognani (Soft-Maint) - Bug 419007 - Remove MouseListener on TableView
 *    Fabien Treguer (Soft-Maint) - Bug 422829 - [Table] Row height too small when Windows dpi settings are increased
 *    Thomas Cicognani (Soft-Maint) - Bug 424987 - MouseListener is deleted after refreshing a NatTableWidget
 *    Olivier Remaud (Soft-Maint) - Bug 429244 - Slow response of EMF Facet table when opening and resizing
 *    Gregoire Dupe (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Gregoire Dupe (Mia-Software) - Bug 506320 - [Table] The table widget should provide the drag support
 *    Thomas Cicognani (Mia-Software) - Bug 511850 - NatTableWidget: each opening creates a thread which is never deleted
 *    Thomas Cicognani (Mia-Software) - Bug 512179 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 516157 - [Table] The "copy to clipboard" action doesn't use the customization
 *    Jonathan Pepin (Soft-Maint) - Bug 517305 - Table widget refactoring #2
 *    Jonathan Pepin (Soft-Maint) - Bug 518636 - Drag and drop compatible with LocalSelectionTransfer
 *******************************************************************************/

package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.celleditors.CellEditorsUtils;
import org.eclipse.emf.facet.widgets.celleditors.ICellEditorsRegistry;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditorContainer;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditorValidator;
import org.eclipse.emf.facet.widgets.celleditors.INaryEAttributeCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.INaryEReferenceCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.INaryFeatureCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.internal.CellEditorsRegistry;
import org.eclipse.emf.facet.widgets.celleditors.internal.ModelCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.internal.ModelCellEditorContainer;
import org.eclipse.emf.facet.widgets.celleditors.internal.core.EEnumCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.BasicCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.NaryFeatureCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.UnaryReferenceCellEditor;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IPositionCoordinate;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetView;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetInternalUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.ColumnHeaderLayerStack;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.DataValidatorAdapter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.GridLayerConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.NatTableCellEditorAdapter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.NatTableDropListener;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.NatTableNaryEAttributeCellEditorAdapter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.NatTableNaryEReferenceCellEditorAdapter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.NatTableNaryReferenceCellEditorAdapter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.RowHeaderLayerStack;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.StyleConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.StyledColumnHeaderConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.StyledRowHeaderConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.dataprovider.BodyDataProvider;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.dataprovider.ColumnHeaderDataProvider;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.handler.CopyToClipboardCommandHandler;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.wrapper.PositionCoordinateWrapper;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;

import net.sourceforge.nattable.NatTable;
import net.sourceforge.nattable.command.LayerCommandUtil;
import net.sourceforge.nattable.config.AbstractRegistryConfiguration;
import net.sourceforge.nattable.config.DefaultNatTableStyleConfiguration;
import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.config.IEditableRule;
import net.sourceforge.nattable.coordinate.ColumnPositionCoordinate;
import net.sourceforge.nattable.coordinate.PositionCoordinate;
import net.sourceforge.nattable.coordinate.Range;
import net.sourceforge.nattable.copy.command.CopyDataToClipboardCommand;
import net.sourceforge.nattable.data.IDataProvider;
import net.sourceforge.nattable.data.validate.IDataValidator;
import net.sourceforge.nattable.edit.EditConfigAttributes;
import net.sourceforge.nattable.edit.event.InlineCellEditEvent;
import net.sourceforge.nattable.grid.command.AutoResizeColumnCommandHandler;
import net.sourceforge.nattable.grid.data.DefaultCornerDataProvider;
import net.sourceforge.nattable.grid.data.DefaultRowHeaderDataProvider;
import net.sourceforge.nattable.grid.layer.CornerLayer;
import net.sourceforge.nattable.grid.layer.GridLayer;
import net.sourceforge.nattable.hideshow.ColumnHideShowLayer;
import net.sourceforge.nattable.layer.AbstractLayerTransform;
import net.sourceforge.nattable.layer.DataLayer;
import net.sourceforge.nattable.layer.ILayerListener;
import net.sourceforge.nattable.layer.cell.ColumnOverrideLabelAccumulator;
import net.sourceforge.nattable.layer.cell.LayerCell;
import net.sourceforge.nattable.layer.event.ILayerEvent;
import net.sourceforge.nattable.reorder.ColumnReorderLayer;
import net.sourceforge.nattable.reorder.event.ColumnReorderEvent;
import net.sourceforge.nattable.resize.event.ColumnResizeEvent;
import net.sourceforge.nattable.resize.event.RowResizeEvent;
import net.sourceforge.nattable.selection.SelectionLayer;
import net.sourceforge.nattable.selection.command.SelectAllCommand;
import net.sourceforge.nattable.selection.command.SelectRowsCommand;
import net.sourceforge.nattable.selection.config.DefaultSelectionStyleConfiguration;
import net.sourceforge.nattable.selection.event.CellSelectionEvent;
import net.sourceforge.nattable.selection.event.ColumnSelectionEvent;
import net.sourceforge.nattable.selection.event.RowSelectionEvent;
import net.sourceforge.nattable.style.BorderStyle;
import net.sourceforge.nattable.style.BorderStyle.LineStyleEnum;
import net.sourceforge.nattable.style.DisplayMode;
import net.sourceforge.nattable.style.HorizontalAlignmentEnum;
import net.sourceforge.nattable.style.VerticalAlignmentEnum;
import net.sourceforge.nattable.util.GUIHelper;
import net.sourceforge.nattable.viewport.ViewportLayer;

public class NatTableWidget extends Composite implements ITableWidgetView {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());

	private static final Color BG_COLOR = GUIHelper.getColor(217, 232, 251);
	private static final String ENUM_CELLEDITOR_LABEL = "enum_celleditor"; //$NON-NLS-1$

	/** The NatTable widget */
	private NatTable natTable;

	/** Layers */
	private BodyDataProvider fBodyDataProvider;
	private BodyLayerStack bodyLayerStack;
	private GridLayer gridLayer;

	private boolean listenColumn = true;

	private final ITableWidgetInternal tableWidgetController;

	/** The current selection (see {@link NatTableWidget#getGridSelection()}) */
	private List<Object> gridSelection = Collections.emptyList();

	private final List<MouseListener> mouseListeners = new ArrayList<MouseListener>();

	private final Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(),
			LocalSelectionTransfer.getTransfer() };

	/**
	 *
	 * @param parent
	 *            This composite parent
	 * @param editingDomainProvider
	 *            An editing provider
	 * @param tableInstanceParam
	 *            The {@link Table} which contains all the needed
	 *            information to open a table
	 * @param menuMgr
	 * @throws CoreException
	 */
	public NatTableWidget(final Composite parent,
			final ITableWidgetInternal tableWidgetController) {
		super(parent, SWT.NONE);
		this.tableWidgetController = tableWidgetController;
		setLayout(new FillLayout());
	}

	public void fullRedraw() {
		if (this.natTable == null || !this.natTable.isDisposed()) {
			internalFullRedraw();
		}
	}

	@Override
	public void addMouseListener(final MouseListener listener) {
		this.natTable.addMouseListener(listener);
		this.mouseListeners.add(listener);
	}

	@Override
	public void removeMouseListener(final MouseListener listener) {
		this.natTable.removeMouseListener(listener);
		this.mouseListeners.remove(listener);
	}

	protected void internalFullRedraw() {
		DebugUtils.debug(NatTableWidget.DEBUG, "Start"); //$NON-NLS-1$
		boolean reset = false;
		boolean takeFocus = true;
		int horizontalScrollbarPos = 0;
		int verticalScrollbarPos = 0;
		PositionCoordinate[] selectedCells = null;
		if (this.natTable != null && !this.natTable.isDisposed()) {
			horizontalScrollbarPos = this.natTable.getHorizontalBar().getSelection();
			verticalScrollbarPos = this.natTable.getVerticalBar().getSelection();
			SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
			selectedCells = selectionLayer.getSelectedCells();
			reset = true;
			takeFocus = this.natTable.isFocusControl();
		}
		Control[] children = getChildren();
		// if already built, dispose the previous control and rebuild the table
		for (Control childControl : children) {
			childControl.dispose();
		}
		this.fBodyDataProvider = new BodyDataProvider(this);
		IDataProvider colHeaderDataProvider = new ColumnHeaderDataProvider(this);
		DefaultRowHeaderDataProvider rowHeaderDataProvider = new DefaultRowHeaderDataProvider(
				this.fBodyDataProvider);
		this.bodyLayerStack = new BodyLayerStack(this.fBodyDataProvider);
		ColumnHeaderLayerStack columnHeaderLayer = new ColumnHeaderLayerStack(colHeaderDataProvider,
				this.bodyLayerStack, this.tableWidgetController);
		RowHeaderLayerStack rowHeaderLayer = new RowHeaderLayerStack(rowHeaderDataProvider, this.bodyLayerStack);
		DefaultCornerDataProvider cornerDataProvider = new DefaultCornerDataProvider(
				colHeaderDataProvider, rowHeaderDataProvider);
		CornerLayer cornerLayer = new CornerLayer(new DataLayer(cornerDataProvider),
				rowHeaderLayer, columnHeaderLayer);
		this.gridLayer = new GridLayer(this.bodyLayerStack, columnHeaderLayer,
				rowHeaderLayer, cornerLayer, false);
		this.gridLayer.registerCommandHandler(new AutoResizeColumnCommandHandler(this.gridLayer));
		this.gridLayer.addConfiguration(new GridLayerConfiguration(this.gridLayer, this));
		// NOTE: Register the accumulator on the body data layer.
		// This ensures that the labels are bound to the column index and are
		// unaffected by column order.
		DataLayer bodyDataLayer = this.bodyLayerStack.getBodyDataLayer();
		final ColumnOverrideLabelAccumulator columnLabelAccumulator = new ColumnOverrideLabelAccumulator(
				bodyDataLayer);
		bodyDataLayer.setConfigLabelAccumulator(columnLabelAccumulator);
		this.natTable = new NatTable(this, this.gridLayer, false);
		/*
		 * Add Mouse Listeners to the new NatTable because old Mouse Listeners
		 * are deleted
		 */
		for (MouseListener mouseListener : this.mouseListeners) {
			this.natTable.addMouseListener(mouseListener);
		}
		addCustomStyling();
		this.natTable.addConfiguration(new StyleConfiguration(this.bodyLayerStack, this));
		if (this.tableWidgetController.isDataEditable()) {
			this.natTable.addConfiguration(editableGridConfiguration(columnLabelAccumulator,
					this.fBodyDataProvider));
		}
		this.natTable.configure();
		initializeColumnAndRowSize();
		addDragAndDropSupport();
		addDataLayerListener();
		addColumnReorderLayerListener();
		updateHiddenColumns();
		setupContextMenu();
		addSelectionListener();
		layout();
		if (reset && !this.natTable.isDisposed()) {
			this.natTable.getHorizontalBar().setSelection(horizontalScrollbarPos);
			this.natTable.getHorizontalBar().notifyListeners(SWT.Selection, new Event());
			this.natTable.getVerticalBar().setSelection(verticalScrollbarPos);
			this.natTable.getVerticalBar().notifyListeners(SWT.Selection, new Event());
			if (selectedCells != null) {
				this.bodyLayerStack.getSelectionLayer().clear();
				for (PositionCoordinate coordinate : selectedCells) {
					this.bodyLayerStack.getSelectionLayer().selectCell(coordinate.columnPosition,
							coordinate.rowPosition, false, true);
				}
			}
		}
		tableSelectionChanged();
		this.tableWidgetController.notifyActions(); // Notify the listeners that the table has been redrawn
		if (takeFocus) {
			this.natTable.setFocus();
		}
		DebugUtils.debug(NatTableWidget.DEBUG, "End"); //$NON-NLS-1$
	}

	private void initializeColumnAndRowSize() {
		final DataLayer bodyDataLayer = this.bodyLayerStack.getBodyDataLayer();

		bodyDataLayer.setDefaultRowHeight(DefaultSizeUtils.getCellHeight(-1));
		bodyDataLayer.setRowsResizableByDefault(true);

		bodyDataLayer.setDefaultColumnWidth(DefaultSizeUtils.getCellWidth(-1));
		bodyDataLayer.setColumnsResizableByDefault(true);

		final Table table = this.tableWidgetController.getTable();
		for (int i = 0; i < bodyDataLayer.getColumnCount(); i++) {
			final EList<Column> columns = table.getColumns();
			final Column column = columns.get(i);
			int actualWidth = column.getWidth();
			if (actualWidth != -1) {
				final int cellWidth = DefaultSizeUtils.getCellWidth(actualWidth);
				bodyDataLayer.setColumnWidthByPosition(i, cellWidth);
			}
		}
		for (int i = 0; i < bodyDataLayer.getRowCount(); i++) {
			final EList<Row> rows = table.getRows();
			final Row row = rows.get(i);
			int actualHeight = row.getHeight();
			if (actualHeight != -1) {
				final int cellHeight = DefaultSizeUtils.getCellHeight(actualHeight);
				bodyDataLayer.setRowHeightByPosition(i, cellHeight);
			}
		}
	}

	/**
	 * Enable the table to receive dropped elements
	 */
	private void addDragAndDropSupport() {
		addDropSupport();
		addDragSupport();
	}

	private void addDropSupport() {
		int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT;
		DropTarget target = new DropTarget(this.natTable, operations);
		target.setTransfer(this.transfers);
		NatTableDropListener dropListener = new NatTableDropListener(this.natTable, this);
		target.addDropListener(dropListener);
	}

	private void addDragSupport() {
		final int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
		final DragSource source = new DragSource(this.natTable, operations);
		source.setTransfer(this.transfers);
		final TableDragSourceListener listener = new TableDragSourceListener(
				this.tableWidgetController, this.natTable);
		source.addDragListener(listener);
	}

	private void addColumnReorderLayerListener() {
		this.bodyLayerStack.getColumnReorderLayer().addLayerListener(new ILayerListener() {
			public void handleLayerEvent(final ILayerEvent event) {
				synchronized (this) {
					if (NatTableWidget.this.tableWidgetController.getListenReorderEvent()) {
						synchronized (this) {
							NatTableWidget.this.listenColumn = false;
						}
						if (event instanceof ColumnReorderEvent) {
							ColumnReorderEvent columnReorderEvent = (ColumnReorderEvent) event;
							int start = -1;
							int end = columnReorderEvent.getBeforeToColumnPosition();
							for (Range range : columnReorderEvent
									.getBeforeFromColumnPositionRanges()) {
								start = range.start;
								break;
							}
							if (start != -1) {
								// This solve an index difference between moving
								// a column from right to left and moving a
								// column from left to right
								if (start >= 0 && start < end) {
									end--;
								}
								Column element = NatTableWidget.this.tableWidgetController.getTable().getColumns()
										.get(start);
								if (element != null) {
									NatTableWidget.this.tableWidgetController.moveColumn(element, end);
								}
							}
						}
						synchronized (this) {
							NatTableWidget.this.listenColumn = true;
						}
					}
				}
			}
		});
	}

	/**
	 * Add Layer Listener to the layer to catch ColumnResizeEvent and
	 * RowResizeEvent in order to update the model when UI changes are commited
	 *
	 * @param dataLayer
	 *            the layer to watch
	 */
	private void addDataLayerListener() {
		this.bodyLayerStack.getBodyDataLayer().addLayerListener(new ILayerListener() {

			public void handleLayerEvent(final ILayerEvent event) {
				synchronized (this) {
					if (NatTableWidget.this.listenColumn) {
						synchronized (this) {
							NatTableWidget.this.listenColumn = false;
						}
						if (event instanceof ColumnResizeEvent) {
							ColumnResizeEvent columnResizeEvent = (ColumnResizeEvent) event;
							Collection<Range> rangeList = columnResizeEvent
									.getColumnPositionRanges();
							for (Range r : rangeList) {
								if (r.start != -1) {

									int width = NatTableWidget.this.bodyLayerStack
											.getColumnReorderLayer().getColumnWidthByPosition(
													r.start);

									Column column = NatTableWidget.this.tableWidgetController.getTable()
											.getColumns().get(r.start);
									NatTableWidget.this.tableWidgetController.setColumnWidth(column, width);
								}
							}

						} else if (event instanceof RowResizeEvent) {
							RowResizeEvent rowResizeEvent = (RowResizeEvent) event;
							Collection<Range> rangeList = rowResizeEvent.getRowPositionRanges();
							for (Range r : rangeList) {
								if (r.start != -1) {
									int height = NatTableWidget.this.getBodyLayer()
											.getViewportLayer().getRowHeightByPosition(r.start);
									Row row = NatTableWidget.this.tableWidgetController.getTable().getRows()
											.get(r.start);
									NatTableWidget.this.tableWidgetController.setRowHeight(row, height);
								}
							}
						}
						synchronized (this) {
							NatTableWidget.this.listenColumn = true;
						}
					}
				}
			}
		});
	}

	private void addSelectionListener() {
		this.natTable.addLayerListener(new ILayerListener() {
			public void handleLayerEvent(final ILayerEvent event) {
				if (event instanceof CellSelectionEvent || event instanceof RowSelectionEvent || event instanceof ColumnSelectionEvent) {
					tableSelectionChanged();
				}
			}
		});
	}

	public void tableSelectionChanged() {
		computeGridSelection();
		this.tableWidgetController.tableSelectionChanged();
	}

	protected void computeGridSelection() {
		if (this.bodyLayerStack == null) {
			throw new IllegalStateException("body layer stack must not be null"); //$NON-NLS-1$
		}
		List<Object> result = new ArrayList<Object>();

		Table table = this.tableWidgetController.getTable();
		EList<Row> rows = table.getRows();
		EList<Column> columns = table.getColumns();

		SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
		int[] fullySelectedRows = selectionLayer.getFullySelectedRowPositions();
		int[] fullySelectedColumns = selectionLayer.getFullySelectedColumnPositions();

		// fully selected rows
		int nRows = rows.size();
		for (int i : fullySelectedRows) {
			if (i < nRows) {
				Row row = rows.get(i);
				result.add(row);
			} else {
				Logger.logError("Wrong row offset : " + i + " (" + nRows + " rows)", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}

		// fully selected columns
		int nColumns = columns.size();
		for (int i : fullySelectedColumns) {
			if (i >= 0 && i < nColumns) {
				Column column = columns.get(i);
				result.add(column);
			} else {
				Logger.logError("Wrong column offset : " + i + " (" + nColumns + " columns)", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}

		PositionCoordinate[] selectedCells = selectionLayer.getSelectedCells();
		for (PositionCoordinate positionCoordinate : selectedCells) {
			LayerCell cell = selectionLayer.getCellByPosition(
					positionCoordinate.getColumnPosition(),
					positionCoordinate.getRowPosition());
			if (cell != null) {
				Object dataValue = cell.getDataValue();
				if (dataValue instanceof IGridElement) {
					IGridElement gridElement = (IGridElement) dataValue;
					result.add(gridElement);
				}
			}
		}
		this.gridSelection = Collections.unmodifiableList(result);
	}

	/**
	 * This method returns a list of selected elements in the grid:
	 * <ul>
	 * <li>{@link IGridElement} for a single selected cell
	 * <li>{@link Row} for a fully selected row
	 * <li>{@link Column}for a fully selected column
	 * </ul>
	 *
	 * @return a list of {@link IGridElement}, {@link Row} and {@link Column}
	 */
	public List<Object> getGridSelection() {
		return this.gridSelection;
	}

	/**
	 *
	 * @return a list of integer representing the selected rows
	 */
	private List<Integer> getSelectedRows() {
		List<Integer> rowsIndex = new ArrayList<Integer>();
		if (this.bodyLayerStack != null) {
			SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
			int[] selectedRows = selectionLayer.getFullySelectedRowPositions();
			for (int index : selectedRows) {
				rowsIndex.add(Integer.valueOf(index));
			}
		}
		return rowsIndex;
	}

	private List<LayerCell> getSelectedCells() {
		List<LayerCell> selectedCells = new ArrayList<LayerCell>();
		SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
		PositionCoordinate[] selectedPositions = selectionLayer.getSelectedCells();
		for (PositionCoordinate positionCoordinate : selectedPositions) {
			LayerCell cell = selectionLayer.getCellByPosition(
					positionCoordinate.getColumnPosition(), positionCoordinate.getRowPosition());
			if (cell != null) {
				selectedCells.add(cell);
			}
		}
		return selectedCells;
	}

	public IPositionCoordinate[] getSelectedCells2() {
		PositionCoordinate[] pc = this.getBodyLayer().getSelectionLayer().getSelectedCells();
		IPositionCoordinate[] result = new IPositionCoordinate[pc.length];
		for (int i = 0; i < pc.length; i++) {
			result[i] = new PositionCoordinateWrapper(pc[i]);
		}
		return result;
	}

	public List<IPositionCoordinate> getSelectedCellsPositions() {
		return Arrays.asList(getSelectedCells2());
	}

	public List<PositionCoordinate> getSelectedCellsPositionCoordinates() {
		return Collections.unmodifiableList(Arrays.asList(
				getBodyLayer().getSelectionLayer().getSelectedCells()));
	}

	/** Convert column position from data layer to column hide/show layer */
	private int convertColumnPositionDataToHideShow(final int column) {
		// we can only convert from upper to lower layer
		// y = f(x) : test f(x) for each x, in order to find x for y = column
		for (int i = 0; i < this.fBodyDataProvider.getColumnCount(); i++) {
			ColumnPositionCoordinate converted = LayerCommandUtil
					.convertColumnPositionToTargetContext(new ColumnPositionCoordinate(
							this.bodyLayerStack.getColumnHideShowLayer(), i), this.bodyLayerStack
							.getBodyDataLayer());
			if (converted != null && converted.getColumnPosition() == column) {
				return i;
			}
		}
		return -1;
	}

	/** Convert column position from data layer to column reorder layer */
	private int convertColumnPositionDataToReorder(final int column) {
		// we can only convert from upper to lower layer
		// y = f(x) : test f(x) for each x, in order to find x for y = column
		for (int i = 0; i < this.fBodyDataProvider.getColumnCount(); i++) {
			ColumnPositionCoordinate converted = LayerCommandUtil
					.convertColumnPositionToTargetContext(new ColumnPositionCoordinate(
							this.bodyLayerStack.getColumnReorderLayer(), i), this.bodyLayerStack
							.getBodyDataLayer());
			if (converted.getColumnPosition() == column) {
				return i;
			}
		}
		throw new IllegalStateException("column index not found"); //$NON-NLS-1$
	}

	/** Convert column position from selection layer to data layer */
	public int convertColumnPositionSelectionToData(final int column) {
		ColumnPositionCoordinate columnPositionCoordinate = LayerCommandUtil
				.convertColumnPositionToTargetContext(new ColumnPositionCoordinate(getBodyLayer()
						.getSelectionLayer(), column), getBodyLayer().getBodyDataLayer());
		return columnPositionCoordinate.getColumnPosition();
	}

	public int convertCellPositionToDataLayer(final LayerCell cell) {
		ColumnPositionCoordinate columnPositionCoordinate = LayerCommandUtil
				.convertColumnPositionToTargetContext(new ColumnPositionCoordinate(cell.getLayer(),
						cell.getColumnPosition()), getBodyLayer().getBodyDataLayer());
		return columnPositionCoordinate.getColumnPosition();
	}

	private void addCustomStyling() {
		// Setup NatTable default styling

		// NOTE: Getting the colors and fonts from the GUIHelper ensures that
		// they are disposed properly (required by SWT)
		DefaultNatTableStyleConfiguration natTableConfiguration = new DefaultNatTableStyleConfiguration();
		// natTableConfiguration.bgColor = GUIHelper.getColor(249, 172, 7);
		// natTableConfiguration.fgColor = GUIHelper.getColor(30, 76, 19);
		natTableConfiguration.hAlign = HorizontalAlignmentEnum.LEFT;
		natTableConfiguration.vAlign = VerticalAlignmentEnum.TOP;

		// A custom painter can be plugged in to paint the cells differently
		// natTableConfiguration.cellPainter = new PaddingDecorator(new
		// TextPainter(), 1);
		// natTableConfiguration.cellPainter = new CellImagePainter(); //new
		// CellPainterDecorator(new TextPainter(), CellEdgeEnum.LEFT, new
		// CellImagePainter());
		// natTableConfiguration.cellPainter = new TextPainter();

		// Setup even odd row colors - row colors override the NatTable default
		// colors
		// DefaultRowStyleConfiguration rowStyleConfiguration = new
		// DefaultRowStyleConfiguration();
		// rowStyleConfiguration.oddRowBgColor = GUIHelper.getColor(254, 251,
		// 243);
		// rowStyleConfiguration.evenRowBgColor = GUIHelper.COLOR_WHITE;

		// Setup selection styling
		DefaultSelectionStyleConfiguration selectionStyle = new DefaultSelectionStyleConfiguration();
		// selectionStyle.selectionFont =
		// this.tableEditorInput.getBrowserConfiguration()
		// .getAppearanceConfiguration().getCustomFont();
		selectionStyle.selectionBgColor = NatTableWidget.BG_COLOR;
		selectionStyle.selectionFgColor = GUIHelper.COLOR_BLACK;
		selectionStyle.anchorBorderStyle = new BorderStyle(1, GUIHelper.COLOR_DARK_GRAY,
				LineStyleEnum.SOLID);
		// was (65, 113, 43);
		selectionStyle.anchorBgColor = NatTableWidget.BG_COLOR;
		selectionStyle.anchorFgColor = GUIHelper.COLOR_BLACK;
		selectionStyle.selectedHeaderFgColor = GUIHelper.COLOR_BLACK;

		// Add all style configurations to NatTable
		this.natTable.addConfiguration(natTableConfiguration);
		// natTable.addConfiguration(rowStyleConfiguration);
		this.natTable.addConfiguration(selectionStyle);

		// Column/Row header style and custom painters
		this.natTable.addConfiguration(new StyledRowHeaderConfiguration());
		this.natTable.addConfiguration(new StyledColumnHeaderConfiguration(this.bodyLayerStack,
				this.tableWidgetController.getTable().getColumns(), 
				this.tableWidgetController.getTableLabelProvider(),
				this));
	}

	/**
	 * Create a configuration for editability
	 *
	 * @param columnLabelAccumulator
	 * @param dataProvider
	 * @return
	 */
	private AbstractRegistryConfiguration editableGridConfiguration(
			final ColumnOverrideLabelAccumulator columnLabelAccumulator,
			final IDataProvider dataProvider) {
		return new AbstractRegistryConfiguration() {
			public void configureRegistry(final IConfigRegistry configRegistry) {
				// not editable if no editing domain was provided
				if (NatTableWidget.this.tableWidgetController.getEditingDomain() != null) {
					for (int nColumn = 0; nColumn < NatTableWidget.this.tableWidgetController.getTable().getColumns()
							.size(); nColumn++) {
						Column columnDescription = NatTableWidget.this.tableWidgetController.getTable().getColumns()
								.get(nColumn);
						// EEnum is hardcoded
						if (columnDescription instanceof FeatureColumn) {
							FeatureColumn attributeColumn = (FeatureColumn) columnDescription;
							if (attributeColumn.getFeature().getEType() instanceof EEnum) {
								registerEnumCellEditor(configRegistry, (EEnum) attributeColumn
										.getFeature().getEType(), columnLabelAccumulator, nColumn,
										columnDescription);
							} else {
								registerCellEditorForColumn(columnLabelAccumulator, nColumn,
										columnDescription);
							}
						} else {
							registerCellEditorForColumn(columnLabelAccumulator, nColumn,
									columnDescription);
						}
					}
					registerLocalCellEditors(configRegistry);
					List<IModelCellEditorContainer<? extends AbstractModelCellEditor>> allCellEditorContainers = ICellEditorsRegistry.INSTANCE
							.getAllCellEditors();
					for (IModelCellEditorContainer<? extends AbstractModelCellEditor> modelCellEditorContainer : allCellEditorContainers) {
						registerCellEditor(modelCellEditorContainer, configRegistry);
					}
				}
			}
		};
	}

	/**
	 * Register the cell editors which are forced in the tableconfiguration, but
	 * not declared in the plugin.xml
	 */
	private void registerLocalCellEditors(final IConfigRegistry configRegistry) {
		final TableConfiguration tableConfiguration = this.tableWidgetController.getTableConfiguration();
		if (tableConfiguration != null) {
			final EList<AbstractModelCellEditor> forcedCellEditors = tableConfiguration
					.getForcedCellEditors();

			for (final AbstractModelCellEditor modelCellEditor : forcedCellEditors) {
				// we register the editor only if it is not in the
				// ICellEditorsRegistry (<=> declared in the plugin.xml file)
				if (!isInCellEditorRegistry(modelCellEditor)) {
					final String bundleName = CellEditorsUtils.getBundleNameFor(modelCellEditor, this.tableWidgetController.getTableConfiguration().eResource().getResourceSet());
					ModelCellEditorContainer<?> modelCellEditorContainer = null;
					if (modelCellEditor instanceof BasicCellEditor) {
						BasicCellEditor basicCellEditor = (BasicCellEditor) modelCellEditor;
						modelCellEditorContainer = new ModelCellEditorContainer<BasicCellEditor>();
						modelCellEditorContainer.setBundleName(bundleName);
						modelCellEditorContainer.setModelCellEditor(basicCellEditor);
					} else if (modelCellEditor instanceof UnaryReferenceCellEditor) {
						UnaryReferenceCellEditor unaryReferenceCellEditor = (UnaryReferenceCellEditor) modelCellEditor;
						modelCellEditorContainer = new ModelCellEditorContainer<UnaryReferenceCellEditor>();
						modelCellEditorContainer.setBundleName(bundleName);
						modelCellEditorContainer.setModelCellEditor(unaryReferenceCellEditor);
					} else if (modelCellEditor instanceof NaryFeatureCellEditor) {
						NaryFeatureCellEditor naryFeatureCellEditor = (NaryFeatureCellEditor) modelCellEditor;
						modelCellEditorContainer = new ModelCellEditorContainer<NaryFeatureCellEditor>();
						modelCellEditorContainer.setBundleName(bundleName);
						modelCellEditorContainer.setModelCellEditor(naryFeatureCellEditor);
					} else {
						Logger.logError("Not handled: " //$NON-NLS-1$
								+ modelCellEditor.getClass().getSimpleName(),
								Activator.getDefault());
					}
					registerCellEditor(modelCellEditorContainer, configRegistry);
				}
			}
		}
	}

	/**
	 *
	 * @param cellEditor
	 *            a cell editor
	 * @return <code>true</code> if the editor is registered in the
	 *         {@link ICellEditorsRegistry} (that is to say that this editor is
	 *         declared in the plugin.xml)
	 */
	private static boolean isInCellEditorRegistry(final AbstractModelCellEditor cellEditor) {
		List<IModelCellEditorContainer<? extends AbstractModelCellEditor>> allCellEditorContainers = ICellEditorsRegistry.INSTANCE
				.getAllCellEditors();
		for (IModelCellEditorContainer<? extends AbstractModelCellEditor> currentEditorContainer : allCellEditorContainers) {
			if (cellEditor.getCellId().equals(
					currentEditorContainer.getModelCellEditor().getCellId())) {
				return true;
			}
		}
		return false;
	}

	private void registerCellEditorForColumn(
			final ColumnOverrideLabelAccumulator columnLabelAccumulator, final int nColumn,
			final Column column) {
		if (column instanceof FeatureColumn) {

			FeatureColumn featureColumn = (FeatureColumn) column;

			ETypedElement feature = featureColumn.getFeature();

			if (feature instanceof EStructuralFeature) {
				EStructuralFeature structuralFeature = (EStructuralFeature) feature;
				if (!structuralFeature.isChangeable()) {
					return;
				}
			}


			TableConfiguration tableConfiguration = this.tableWidgetController.getTableConfiguration();
			EList<AbstractModelCellEditor> forcedCellEditors = null;
			if (tableConfiguration != null) {
				forcedCellEditors = tableConfiguration.getForcedCellEditors();
			}

			ModelCellEditor selectedCellEditor = ((CellEditorsRegistry) ICellEditorsRegistry.INSTANCE)
					.getCellEditorWrapperFor(feature.getEType(), feature.isMany(),
							forcedCellEditors);

			if (selectedCellEditor != null) {
				// register cell editor for this column
				columnLabelAccumulator.registerColumnOverrides(nColumn,
						selectedCellEditor.getCellID());
			} else {
				Logger.logWarning(
						"No cell editor defined for type: " + EcoreUtil.getURI(feature.getEType()) + " (column " + nColumn + ")", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						Activator.getDefault());
			}
		}
	}

	/**
	 * Registers a cell editor in the config registry
	 *
	 * @param configRegistry
	 * @param eType
	 * @param columnLabelAccumulator
	 * @param allCellEditorContainers
	 * @param nColumn
	 * @param columnDescription
	 */
	private void registerEnumCellEditor(final IConfigRegistry configRegistry, final EEnum eType,
			final ColumnOverrideLabelAccumulator columnLabelAccumulator, final int nColumn,
			final Column columnDescription) {
		columnLabelAccumulator.registerColumnOverrides(nColumn,
				NatTableWidget.ENUM_CELLEDITOR_LABEL);
		configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR,
				new NatTableCellEditorAdapter(new EEnumCellEditor(),
						NatTableWidget.this.tableWidgetController.getTable().getColumns(), this.tableWidgetController.getFacetContext()), DisplayMode.NORMAL,
				NatTableWidget.ENUM_CELLEDITOR_LABEL);
		configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
				IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT,
				NatTableWidget.ENUM_CELLEDITOR_LABEL);
	}

	private void registerCellEditor(
			final IModelCellEditorContainer<? extends AbstractModelCellEditor> modelCellEditorContainer,
			final IConfigRegistry configRegistry) {

		ModelCellEditor cellEditor = new ModelCellEditor(modelCellEditorContainer.getBundleName(),
				modelCellEditorContainer.getModelCellEditor());
		Object cellEditorImplementation = cellEditor.getCellEditorImplementation();

		if (cellEditorImplementation instanceof IModelCellEditor) {
			IModelCellEditor modelCellEditorImpl = (IModelCellEditor) cellEditorImplementation;

			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR,
					new NatTableCellEditorAdapter(modelCellEditorImpl,
							NatTableWidget.this.tableWidgetController.getTable().getColumns(), this.tableWidgetController.getFacetContext()), DisplayMode.NORMAL,
					cellEditor.getCellID());
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT, cellEditor.getCellID());
		} else if (cellEditorImplementation instanceof INaryFeatureCellEditor) {
			INaryFeatureCellEditor modelCellEditorImpl = (INaryFeatureCellEditor) cellEditorImplementation;

			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR,
					new NatTableNaryReferenceCellEditorAdapter(modelCellEditorImpl,
							NatTableWidget.this.tableWidgetController.getTable().getColumns(), this.tableWidgetController.getEditingDomain()),
					DisplayMode.NORMAL, cellEditor.getCellID());
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT, cellEditor.getCellID());
			// disable automatic commit for INaryReferenceCellEditor
			configRegistry.registerConfigAttribute(EditConfigAttributes.DATA_VALIDATOR,
					IDataValidator.NEVER_VALID, DisplayMode.EDIT, cellEditor.getCellID());
		} else if (cellEditorImplementation instanceof INaryEAttributeCellEditor<?>) {
			INaryEAttributeCellEditor<Object> modelCellEditorImpl = (INaryEAttributeCellEditor<Object>) cellEditorImplementation;
			NatTableNaryEAttributeCellEditorAdapter<Object> cellEditorAdapter = new NatTableNaryEAttributeCellEditorAdapter<Object>(
					modelCellEditorImpl, NatTableWidget.this.tableWidgetController.getTable().getColumns(),
					this.tableWidgetController.getFacetContext(), this.tableWidgetController.getEditingDomain());
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR,
					cellEditorAdapter, DisplayMode.NORMAL, cellEditor.getCellID());
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT, cellEditor.getCellID());
			// disable automatic commit for INaryEReferenceCellEditor
			configRegistry.registerConfigAttribute(EditConfigAttributes.DATA_VALIDATOR,
					IDataValidator.NEVER_VALID, DisplayMode.EDIT, cellEditor.getCellID());

		} else if (cellEditorImplementation instanceof INaryEReferenceCellEditor<?>) {
			INaryEReferenceCellEditor<?> modelCellEditorImpl = (INaryEReferenceCellEditor<?>) cellEditorImplementation;
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITOR,
					new NatTableNaryEReferenceCellEditorAdapter(modelCellEditorImpl,
							NatTableWidget.this.tableWidgetController.getTable().getColumns(), this.tableWidgetController.getFacetContext(), this.tableWidgetController.getEditingDomain()),
					DisplayMode.NORMAL, cellEditor.getCellID());
			configRegistry.registerConfigAttribute(EditConfigAttributes.CELL_EDITABLE_RULE,
					IEditableRule.ALWAYS_EDITABLE, DisplayMode.EDIT, cellEditor.getCellID());
			// disable automatic commit for INaryEReferenceCellEditor
			configRegistry.registerConfigAttribute(EditConfigAttributes.DATA_VALIDATOR,
					IDataValidator.NEVER_VALID, DisplayMode.EDIT, cellEditor.getCellID());

		} else {
			Logger.logError("Model cell editor implementation must be an instance of " //$NON-NLS-1$
					+ IModelCellEditor.class.getSimpleName() + " or " //$NON-NLS-1$
					+ INaryFeatureCellEditor.class.getSimpleName(), Activator.getDefault());
			return;
		}

		if (cellEditorImplementation instanceof IModelCellEditorValidator) {
			IModelCellEditorValidator modelCellEditorValidator = (IModelCellEditorValidator) cellEditorImplementation;
			configRegistry.registerConfigAttribute(EditConfigAttributes.DATA_VALIDATOR,
					new DataValidatorAdapter(modelCellEditorValidator), DisplayMode.EDIT,
					cellEditor.getCellID());
		}
	}

	public class BodyLayerStack extends AbstractLayerTransform {

		private final SelectionLayer selectionLayer;
		private final DataLayer bodyDataLayer;
		private final ViewportLayer viewportLayer;
		private final ColumnHideShowLayer columnHideShowLayer;
		private final ColumnReorderLayer columnReorderLayer;

		public BodyLayerStack(final IDataProvider dataProvider) {
			this.bodyDataLayer = new DataLayer(dataProvider);
			this.columnReorderLayer = new ColumnReorderLayer(this.bodyDataLayer);
			this.columnHideShowLayer = new ColumnHideShowLayer(this.columnReorderLayer);
			this.selectionLayer = new SelectionLayer(this.columnHideShowLayer);
			this.viewportLayer = new ViewportLayer(this.selectionLayer);
			setUnderlyingLayer(this.viewportLayer);
		}

		public SelectionLayer getSelectionLayer() {
			return this.selectionLayer;
		}

		public DataLayer getBodyDataLayer() {
			return this.bodyDataLayer;
		}

		public ViewportLayer getViewportLayer() {
			return this.viewportLayer;
		}

		public ColumnHideShowLayer getColumnHideShowLayer() {
			return this.columnHideShowLayer;
		}

		public ColumnReorderLayer getColumnReorderLayer() {
			return this.columnReorderLayer;
		}
	}

	public class ElementsDescription {
		private boolean containsEObjects;
		private boolean containsPrimitiveTypes;
		private boolean containsContexts;

		public boolean getContainsEObjects() {
			return this.containsEObjects;
		}

		public boolean getContainsPrimitiveTypes() {
			return this.containsPrimitiveTypes;
		}

		public boolean getContainsContexts() {
			return this.containsContexts;
		}

		public void setContainsContexts(final boolean containsContexts) {
			this.containsContexts = containsContexts;
		}

		protected void setContainsEObjects(final boolean containsEObjects) {
			this.containsEObjects = containsEObjects;
		}

		protected void setContainsPrimitiveTypes(final boolean containsPrimitiveTypes) {
			this.containsPrimitiveTypes = containsPrimitiveTypes;
		}
	}

	@Override
	public boolean setFocus() {
		return this.natTable.setFocus();
	}

	private void updateHiddenColumns() {
		this.bodyLayerStack.getColumnHideShowLayer().showAllColumns();
		List<Integer> columnsToHide = new ArrayList<Integer>();
		List<EObject> tableContents = TableWidgetUtils
				.getElements(this.tableWidgetController.getTable());
		try {
			this.natTable.setRedraw(false);
			int nColumn = 0;
			for (final Column column : this.tableWidgetController.getTable().getColumns()) {
				boolean isHidden = false;
				boolean isEmpty = this.tableWidgetController.getTable().isHideEmptyColumns() && this.tableWidgetController.isEmptyColumn(column);
				boolean isNonCommon = this.tableWidgetController.getTable().isOnlyShowCommonColumns()
						&& this.tableWidgetController.isNonCommonColumns(column);

				if (column instanceof FeatureColumn) {
					ETypedElement columnFeature = ((FeatureColumn) column)
							.getFeature();
					try {
						isHidden = !this.tableWidgetController.getCustomizationEngine().getCustomValueOf(columnFeature,
								this.tableWidgetController.getCustomPropertiesHandler().getIsVisible(), Boolean.class).booleanValue();
					} catch (CustomizationException e) {
						Logger.logError(e, "Error getting column visibility", Activator.getDefault()); //$NON-NLS-1$
					}
				} else if (column instanceof SourceColumn) {
					final SourceColumn sourceColumn = (SourceColumn) column;
					isHidden = sourceColumn.isIsHidden();
				} else {
					throw new IllegalStateException("Unknown column type"); //$NON-NLS-1$
				}

				if (isHidden || isNonCommon || isEmpty) {
					int converted = convertColumnPositionDataToHideShow(nColumn);
					// if not already hidden
					if (converted != -1) {
						columnsToHide.add(Integer.valueOf(converted));
					}
				}
				nColumn++;
			}
		} finally {
			this.natTable.setRedraw(true);
		}
		this.bodyLayerStack.getColumnHideShowLayer().hideColumnPositions(columnsToHide);
	}

	private boolean getHiddenAttributeColumnStatus(final FeatureColumn c,
			final Set<EClass> featureOwners) throws CustomizationException {
		ETypedElement feature = c.getFeature();
		return this.tableWidgetController
				.getCustomizationEngine()
				.getCustomValueOf(
						feature,
						this.tableWidgetController.getCustomPropertiesHandler()
								.getIsVisible(), Boolean.class).booleanValue();
	}

	/**
	 * @return true if there is a cell selected
	 */
	public boolean isCellSelected() {
		return this.bodyLayerStack.getSelectionLayer().getSelectedCells().length > 0;
	}

	public List<Column> getSelectedColumns() {
		SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
		List<Column> listColumn = new ArrayList<Column>();
		List<LayerCell> selectedCells = getSelectedCells();
		for (int colPos : selectionLayer.getSelectedColumns()) {
			if (isColumnSelected(colPos, selectedCells)) {
				int pos = this.bodyLayerStack.getSelectionLayer().getColumnIndexByPosition(colPos);
				if (this.tableWidgetController.getTable().getColumns().get(pos) != null) {
					Column localColumn = this.tableWidgetController.getTable().getColumns().get(pos);
					listColumn.add(localColumn);
				}
			} else {
				// It mean that we have at least one column which is not fully
				// selected
				return null;
			}
		}
		return listColumn;
	}

	private boolean isColumnSelected(final int colPos, final List<LayerCell> selectedCells) {
		for (int rowPos = 0; rowPos < this.bodyLayerStack.getRowCount(); rowPos++) {
			LayerCell localCell = this.bodyLayerStack.getSelectionLayer().getCellByPosition(colPos, rowPos);
			if (localCell != null && !selectedCells.contains(localCell)) {
				return false;
			}
		}
		return true;
	}

	private void setupContextMenu() {
		if (this.tableWidgetController.getMenuManager() != null) {
			Menu menu = this.tableWidgetController.getMenuManager().createContextMenu(this.natTable);
			this.natTable.setMenu(menu);
		}
	}

	public BodyLayerStack getBodyLayer() {
		return this.bodyLayerStack;
	}

	/** This method perform to usual "copy to clipboard" action. */
	public void copySelectionToClipboard() {
		new CopyToClipboardCommandHandler(this.bodyLayerStack.getSelectionLayer(), this)
				.doCommand(new CopyDataToClipboardCommand(new Clipboard(Display.getDefault()),
						"\t", "\n")); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Return the position of a cell in grid coordinates, from a pixel location
	 * relative to the table control.
	 */
	public PositionCoordinate getCellPositionAt(final int x, final int y) {
		int column = this.natTable.getColumnPositionByX(x);
		int row = this.natTable.getRowPositionByY(y);

		PositionCoordinate convertedPosition = LayerCommandUtil.convertPositionToTargetContext(
				new PositionCoordinate(this.gridLayer, column, row),
				this.bodyLayerStack.getSelectionLayer());

		return convertedPosition;
	}

	/** Return a cell from grid coordinates */
	public LayerCell getCellAt(final int column, final int row) {
		return this.bodyLayerStack.getSelectionLayer().getCellByPosition(column, row);
	}

	/** Perform the usual "Select All" action on the table's cells */
	public void selectAll() {
		this.natTable.doCommand(new SelectAllCommand());
		this.natTable.redraw();
		tableSelectionChanged();
	}

	public void selectDefaultLabelCell(final EObject eObject) {
		throw new UnsupportedOperationException("the default label column doesn't exist anymore"); //$NON-NLS-1$
		//FIXME
		/*
		// Check that the given eObject is in the table
		int rowIndex = getRowIndexByEObject(eObject);
		if (rowIndex == -1) {
			return;
		}
		// Look for the DefaultLabel column index
		int columnIndex = -1;
		for (int i = 0; i < this.tableWidgetControler.getTableInstance().getColumns().size(); i++) {
			if (this.tableWidgetControler.getTableInstance().getColumns().get(i) instanceof DefaultLabelColumn) {
				columnIndex = i;
				break;
			}
		}
		if (columnIndex == -1) {
			return;
		}
		SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
		selectionLayer.selectCell(columnIndex, rowIndex, false, false);
		*/
	}

	public void selectCell(final EObject eObject, final EStructuralFeature eStructuralFeature) {
		// Check that the given eObject is in the table
		int rowIndex = getRowIndexByEObject(eObject);
		if (rowIndex == -1) {
			return;
		}
		// Look for the column with the eStructuralFeature
		int columnIndex = -1;
		for (int i = 0; i < this.tableWidgetController.getTable().getColumns().size(); i++) {
			Column column = this.tableWidgetController.getTable().getColumns().get(i);
			if (column instanceof FeatureColumn) {
				FeatureColumn featureColumn = (FeatureColumn) column;
				if (featureColumn.getFeature() == eStructuralFeature) {
					columnIndex = i;
					break;
				}
			}
		}
		if (columnIndex == -1) {
			return;
		}
		SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
		selectionLayer.selectCell(columnIndex, rowIndex, false, false);
		tableSelectionChanged();
	}

	private int getRowIndexByEObject(final EObject eObject) {
		int rowIndex = -1;
		EList<Row> rows = this.tableWidgetController.getTable().getRows();
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).getElement().equals(eObject)) {
				rowIndex = i;
				break;
			}
		}
		return rowIndex;
	}

	public void editSelectedCell() {
		List<LayerCell> cells = getSelectedCells();
		if (cells != null && !cells.isEmpty()) {
			LayerCell cell = cells.get(0);
			SelectionLayer selectionLayer = this.bodyLayerStack.getSelectionLayer();
			selectionLayer.fireLayerEvent(new InlineCellEditEvent(selectionLayer,
					new PositionCoordinate(selectionLayer, cell.getColumnPosition(), cell
							.getRowPosition()), this.natTable, this.natTable.getConfigRegistry(),
					null));
		}
	}

	public List<Column> getVisibleColumnsUsingTheLayer() {
		List<Column> notHiddenColumns = new ArrayList<Column>();
		ColumnHideShowLayer layer = this.bodyLayerStack.getColumnHideShowLayer();
		EList<Column> allColumns = this.tableWidgetController.getTable().getColumns();
			for (int i = 0; i < allColumns.size(); i++) {
				if (!layer.isColumnIndexHidden(i)) {
					notHiddenColumns.add(allColumns.get(i));
				}
			}
		return notHiddenColumns;
	}

	public Point getCellPositionRelativeToDisplay(final int columnPosition, final int rowPosition) {
		Rectangle rect = this.bodyLayerStack.getSelectionLayer().getBoundsByPosition(
				columnPosition, rowPosition);
		return new Point(rect.x, rect.y);
	}

	/**
	 *
	 * @see org.eclipse.emf.facet.widgets.nattable.INatTableWidget2#selectRows(java.util.List)
	 *
	 * @param elementsToSelect
	 * @param clearTheSelection
	 */
	public void selectRows(final List<EObject> elementsToSelect, final boolean clearTheSelection) {
		int columnPosition = 0;
		List<Row> allRows = this.tableWidgetController.getTable().getRows();
		List<Integer> rowsToSelect = new ArrayList<Integer>();
		for (int i = 0; i < elementsToSelect.size(); i++) {
			Row row = this.tableWidgetController.findRow(elementsToSelect.get(i));
			if (row != null) {
				rowsToSelect.add(Integer.valueOf(allRows.indexOf(row)));
			}
		}
		int[] rowPositions = new int[rowsToSelect.size()];
		for (int i = 0; i < rowsToSelect.size(); i++) {
			rowPositions[i] = rowsToSelect.get(i).intValue();
		}

		SelectionLayer layer = this.bodyLayerStack.getSelectionLayer();
		if (clearTheSelection) {
			layer.clear(); // we remove the previous selection
		}
		if (rowPositions.length != 0) {
			this.natTable.doCommand(new SelectRowsCommand(this.bodyLayerStack.getSelectionLayer(),
					columnPosition, rowPositions, false, true));
		}
		this.natTable.redraw();
		tableSelectionChanged();
	}

	@Override
	public void setRedraw(final boolean redraw) {
		this.natTable.setRedraw(redraw);
	}

	@Override
	public void redraw() {
		if (NatTableWidget.DEBUG) {
			DebugUtils.debug(""); //$NON-NLS-1$
		}
		//super.redraw();
		this.natTable.redraw();
	}


	public final String[] getColumnNames() {
		final EList<Column> columns = getColumns();
		final String[] result = new String[columns.size()];
		for (int i = 0; i < columns.size(); i++) {
			final Column column = columns.get(i);
			result[i] = TableWidgetInternalUtils.getLabel(column,
					this.tableWidgetController);
		}
		if (NatTableWidget.DEBUG) {
			DebugUtils.debug("nbColumn=" + columns.size()); //$NON-NLS-1$
			DebugUtils.debug("columnNames.length=" + result.length); //$NON-NLS-1$
		}
		return result;
	}

	protected EList<Column> getColumns() {
		final Table table = this.tableWidgetController.getTable();
		return table.getColumns();
	}

	public ITableWidgetInternal getController() {
		return this.tableWidgetController;
	}

	public Composite asComposite() {
		return this;
	}

	@Override
	public void dispose() {
		if (this.natTable != null) {
			this.natTable.dispose();
		}
		super.dispose();
	}

}
