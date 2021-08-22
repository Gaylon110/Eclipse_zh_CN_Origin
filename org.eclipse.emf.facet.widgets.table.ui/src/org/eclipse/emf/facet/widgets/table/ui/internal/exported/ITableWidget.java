/*******************************************************************************
 * Copyright (c) 2011, 2017 CEA LIST, and Soft-Maint
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	  Gregoire Dupe (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *    Nicolas Guyomar (Mia-Software) - Bug 339922 - ITableWidget method isCellSelected should use the plural
 *    Vincent Lorenzo (CEA-LIST) - bug 337408 - Add an action to sort columns by name - Adapted code from ITableWidget						  Adapted Code from ITableWidget
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Vincent Lorenzo (CEA-LIST) - Bug 344125 - The API should provide a method selectRows(List<EObject> elementsToSelect)
 *    Nicolas Guyomar (Mia-Software) - Bug 344475 - To be able to select a cell by EStructuralFeature in the table
 *    Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 379535 - [Table] remove "open table" action
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/

package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetAttribute;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetReference;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.ui.internal.exported.dialog.IETypedElementSelectionDialog;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialog;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.actions.ActionDelegate;

/**
 * This interface defines every public action a user can perform on the EMF
 * Facet table widget
 *
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITableWidget extends ISelectionProvider {

	/**
	 * This method calls the last launched {@link InstantiationMethod} and adds
	 * the result to the table if any.
	 *
	 * If no {@link InstantiationMethod} is saved, then a selection popup is
	 * opened for the user to choose one via
	 * {@link ITableWidget#selectInstantiationMethodToLaunch()}
	 */
	void createNewElement();

	/**
	 * This method calls the given {@link InstantiationMethod} and adds the
	 * result to the table if any.
	 *
	 * @param instantiationMethod
	 *            an {@link InstantiationMethod}
	 */
	void createNewElement(InstantiationMethod method);

	/**
	 * Open a dialog to choose the default instantiationMethod to perform when
	 * clicking on the "Create" button.
	 */
	void selectInstantiationMethodToLaunch();

	/**
	 * Performs the usual save action.
	 */
	void save();

	/**
	 * Open a "Save As" dialog to serialize the table.
	 */
	void saveAs();

	/**
	 * This method performs to usual "copy to clipboard" action.
	 */
	void copySelectionToClipboard();

	/**
	 * Delete the selected elements from their respective models and remove the
	 * corresponding line in the table.
	 */
	void deleteSelection();

	/**
	 * Open a selection popup to select which columns to show/hide.
	 */
	void selectColumnsToHide();

	/**
	 * Whether to hide columns which don't contain any elements.
	 *
	 * @param hideEmptyColumns
	 *            <code>true</code> to hide columns which don't contain any
	 *            elements.
	 */
	void setHideEmptyColumns(boolean hideEmptyColumns);

	/**
	 * Whether to show columns which are specific to a few elements (false), or
	 * only columns which are common to all the elements (true).
	 *
	 * @param onlyShowCommonColumns
	 *            Whether to show columns which are specific to a few elements
	 *            (false), or only columns which are common to all the elements
	 *            (true)
	 */
	void setOnlyShowCommonColumns(boolean onlyCommonColumns);

	/**
	 * Whether to sort columns by type of link (attributes first, then
	 * references, then derived references, ...).
	 *
	 * @param sortColumnsByType
	 *            {@link Boolean} to sort columns by type of link
	 */
	void sortColumnsByType();

	/**
	 * Remove the selected lines from the table. The actual elements are not
	 * deleted. See {@link ITableWidget#deleteSelection()} for that case.
	 */
	void removeLine();

	/**
	 * Perform the usual "Select All" action on the table's cells
	 */
	void selectAll();

	/**
	 * This method returns the {@link TableConfiguration} attached to the table.
	 *
	 * @return the {@link TableConfiguration} attached to the table.
	 */
	TableConfiguration getTableConfiguration();

	/**
	 * @return The history of launched instantiation methods.
	 */
	List<InstantiationMethod> getInstantiationMethodHistory();

	/**
	 * This method returns the {@link Table} attached to the table.
	 *
	 * @return returns the {@link Table} attached to the table.
	 */
	Table getTable();

	/**
	 * Return whether there is at least a cell selected in the table
	 *
	 * @return Whether there is at least a cell selected in the table
	 */
	boolean isCellSelected();

	/**
	 * Return whether there is at least a column selected in the table
	 *
	 * @return whether there is at least a column selected in the table
	 */
	boolean isColumnSelected();

	/**
	 * @return the widget composite itself.
	 */
	Control getComposite();

	/**
	 * Add a new row in the table for each given element.
	 *
	 * @param newElements
	 *            the list of elements to add to the table
	 */
	void addRows(List<? extends EObject> newElements);

	/**
	 * Unregister an {@link ActionDelegate}
	 *
	 * @param action
	 *            the action to be unregistered
	 */
	void unregisterActionDelegate(IActionDelegate action);

	void openLoadCustomizationDialog();

	void openLoadFacetSetsDialog();

	/**
	 * Sort the Columns by alphabetic order.
	 */
	void sortColumnByNameAtoZ();

	/**
	 * Sort the Columns by reverse alphabetical order.
	 */
	void sortColumnByNameZtoA();

	/**
	 * Set the facets in order to apply them on the table. If
	 * {@link FacetReference} or {@link FacetAttribute} are contained by those
	 * facets, new columns {@link FacetReferenceColumn} and
	 * {@link FacetAttributeColumn} are added to the table.
	 *
	 * @param facets the list of facets to be applied on the table.
	 */
	void setFacetSets(List<? extends FacetSet> facetSets) throws CoreException;

	/**
	 * This method selects the cell corresponding to the given {@link EObject} at
	 * the column representing the given {@link EStructuralFeature}
	 */
	void selectCell(EObject eObject, EStructuralFeature structuralFeature);

	/**
	 * Edit the selected cell.
	 */
	void editSelectedCell();

	/**
	 *
	 * @param selectedColumns
	 *            the columns to hide
	 * @param putOnTheTop
	 *            indicates if the localCustom files should be put on the top of
	 *            the stack
	 */
	void showHideColumns(List<Column> selectedColumns, boolean putOnTheTop);

	/**
	 * Indicates if one of the local customization is not at the top of the
	 * stack
	 *
	 * @return
	 */
	boolean isOneOfTheLocalCustomizationsNotOnTheTop();

	/**
	 * This method does not change the state of the widget.
	 * @param setAtTheTop
	 *            indicates if we need to set the local customization at the top
	 *            of the stack to get the visibility
	 * @return the visible columns
	 */
	List<Column> getVisibleColumns(boolean setAtTheTop);

	/**
	 * The method to put the local customization on the top
	 */
	void putLocalCustomizationOnTheTop();

	/**
	 * The method to put the local customization on the bottom
	 */
	void putLocalCustomizationOnTheBottom();

	/**
	 * Return true if the selected cell is editable
	 * Return false if several cells are selected
	 */
	boolean isSelectedCellEditable();

	/**
	 * This method allows to select the rows representing the EObjects in the table
	 *
	 * @param elementsToSelect
	 *            the elements to select
	 * @param clearTheSelection
	 *          indicates if the current selection should be cleared
	 */
	void selectRows(List<EObject> elementsToSelect, boolean clearTheSelection);

	/**
	 * This method can be used to set a "canBePresentedInTheTable" query. A
	 * "canBePresentedInTheTable" query is used to know whether a model element
	 * can be presented in the table. For instance, this query is used to know
	 * if the table must accept a model element form a drag and drop.
	 *
	 * @param presentabilityQuery
	 *            the new "canBePresentedInTheTable" query. This query must
	 *            return a boolean and have {@link EObject} as scope.
	 * @param removeNonConformingElements
	 *            if <code>true</code>, the model elements already present in
	 *            the table and that do not conform to the new
	 *            "canBePresentedInTheTable" query will be removed
	 * @return the query that indicates whether a model element is allowed to
	 *         appear in the table (it is one of the queries contained in the
	 *         list returned by getApplicableCanBePresentedQueries)
	 */
	void setCanBePresentedInTheTable(ETypedElement query, boolean removeNonConformingElements);

	/**
	 * This methods return the currently used "canBePresentedInTheTable" query
	 * @return an element contained in the list returned by getApplicableCanBePresentedQueries();
	 */
	ETypedElement getCanBePresentedInTheTable();

	/**
	 * Open a dialog to select the query "canBePresentedInTheTable"
	 * @return a dialog instance
	 */
	IAllowedContentsETypedElementSelectionDialog openCanBePresentedInTheTableDialog();

	/**
	 * This method returns the sub-set of the registered queries which can be
	 * used as "canBePresentedInTheTable" queries.
	 *
	 * @return an immutable list of model queries
	 */
	List<ETypedElement> getApplicableCanBePresentedQueries();

	/**
	 * Sets the FacetSets loaded in the table. Loaded FacetSets are used for resolving overrides.
	 *
	 * @param facetSets
	 *            the FacetSets that will be loaded
	 */
	void setLoadedFacetSets(List<FacetSet> facetSets);

	/** Open a dialog to add columns (in the form of {@link ETypedElement}s) */
	IETypedElementSelectionDialog<Object> openAddColumnsDialog();

	/**
	 * Add columns to the table.
	 *
	 * @param eTypedElements
	 *            the typed elements for which to add columns
	 * @param facetSets
	 *            the FacetSets that contain the given ETypedElements to add. This is used to resolve ambiguities in the
	 *            case of several aggregates referencing the same derived typed elements.
	 */
	void addColumns(List<ETypedElement> eTypedElements, List<FacetSet> facetSets);
}
