/*******************************************************************************
 * Copyright (c) 2011, 2017 Mia-Software, and Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 345554 - SWTBot regression on build 303
 *    Grégoire Dupé (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *    Gregoire Dupe (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Thomas Cicognani (Soft-Maint) - Bug 512179 - Table widget refactoring
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 518250 - Element dragged over the table must be presentable
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.custom.ui.ISelectionPropertiesHandler;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IColumnsToHideDialog;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * @since 0.2
 * @author Gregoire Dupe
 */
public interface ITableWidgetInternal extends
		org.eclipse.emf.facet.widgets.table.ui.ITableWidget,
		org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget {

	IColumnsToHideDialog openColumnsToHideDialog();

	ICustomizedLabelProvider getTableLabelProvider();

	/**
	 * This methods has to used to load a set of customization.
	 *
	 * @param customizationsToLoad
	 *            an ordered list of customization. The first customization in
	 *            the list has the highest priority. All other customization
	 *            will be unloaded.
	 * @param mustLoadAdditionalFacets
	 */
	void loadCustomizations(
			List<Customization> customizationsToLoad,
			boolean mustLoadAdditionalFacets);

	/**
	 * Wait for the refresh job to finish
	 */
	void waitForRefreshJob();

	/** @deprecated should be renamed */
	@Deprecated
	IFacetManager getFacetContext();
	boolean usesTmpResource();
	EditingDomain getEditingDomain();
	List<IPositionCoordinate> getSelectedCellsPositions();
	void setColumnWidth(Column column, int width);
	void setRowHeight(Row row, int height);
	void moveColumn(Column element, int newPosition);
	boolean isDataEditable();
	ICustomizationManager getCustomizationEngine();
	void tableSelectionChanged();
	MenuManager getMenuManager();
	void notifyActions(); //May have to be removed.
	List<Column> getColumns();

	boolean isNonCommonColumns(Column column);
	boolean isEmptyColumn(Column column);
	Row findRow(EObject eObject);
	boolean getListenReorderEvent();
	boolean canBeDropped(IStructuredSelection structuredSelection, Row row,
			Column column);
	void drop(StructuredSelection structuredSelection, Object element,
			EStructuralFeature feature);
	void drop(StructuredSelection structuredSelection);
	IContentPropertiesHandler getCustomPropertiesHandler();

	/** Undo the last modification in the table */
	void undo();

	/** Redo the last undone modification in the table */
	void redo();

	/** Sort the given column in the given direction for all rows */
	void sortRows(Column column, ColumnSortDirection direction);

	/**
	 * Return the raw selection from the widget:
	 * <ul>
	 * <li>{@link IGridElement} for a single selected cell
	 * <li>{@link Row} for a fully selected row
	 * <li>{@link Column} for a fully selected column
	 * </ul>
	 *
	 * @return a list of {@link IGridElement}s, {@link Row}s and {@link Column}s
	 */
	List<Object> getRawSelection();

	void removeColumns(List<ETypedElement> elements);

	ISelectionPropertiesHandler getSelectionPropertiesHandler();

	List<Column> getSelectedColumns();
}
