/*******************************************************************************
 * Copyright (c) 2010, 2017 CEA LIST, Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.TableWidget:
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
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 371367 - Hierarchical FacetSets
 *    Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *    Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 376158 - [Table] Unexpected columns when customizations are loaded
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377754 - [Table] right click deselects elements
 *    Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 378649 - [Table] Errors with non-applicable features
 *    Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Nicolas Bros (Mia-Software) - Bug 379436 - [Table] read-only resources should not be editable
 *    Nicolas Bros (Mia-Software) - Bug 379535 - [Table] remove "open table" action
 *    Nicolas Bros (Mia-Software) - Bug 379542 - [Table] cannot add non-Facet columns
 *    Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *    Nicolas Bros (Mia-Software) - Bug 380236 - [Table] table is not properly disposed
 *    Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Gregoire Dupe (Mia-Software) - Bug 387024 - [Table] Column order is not correctly "saved"
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    Gregoire Dupe (Mia-Software) - Bug 377870 - [EFacet] ETypedElementDialog doesn't show all available ETypedElement (library example problem?)
 *    Gregoire Dupe (Mia-Software) - Bug 391442 - Select ETypedElement Dialog doesn't used the subpackages (subEFacetSet)
 *    Gregoire Dupe (Mia-Software) - Bug 415887 - FacetManager cleaned after displaying a TableWidget
 *    Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *    Grégoire Dupé (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Thomas Cicognani (Soft-Maint) - Bug 468160 -  Empty table displays a message
 *    Grégoire Dupé (Mia-Software) - Bug 474288 - IndexOutOfBoundsException in TableWidgetController.createNewElement (1150)
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils:
 *    Nicolas Guyomar (Mia-Software) - Bug 340738 - Utility method to create a coherent tableInstance
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Vincent Lorenzo (CEA-LIST) - Bug 341328 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 378649 - [Table] Errors with non-applicable features
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.emf.facet.custom.ui.ISelectionPropertiesHandler;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.FacetsUtils;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

public class GridElementManager {

	private final IFacetManager facetManager;
	private final ICustomizationManager customManager;
	private final ISelectionPropertiesHandler selectionPropH;

	public GridElementManager(final IFacetManager facetManager,
			final ICustomizationManager customManager,
			final ISelectionPropertiesHandler selectionPropH) {
		this.facetManager = facetManager;
		this.customManager = customManager;
		this.selectionPropH = selectionPropH;
	}

	public Collection<? extends Object> resolveSelection(
			final IGridElement gridElement) {
		Collection<?> result = Collections.emptyList();
		final EObject element = gridElement.getRow().getElement();
		if (element != null && isApplicable(gridElement, this.facetManager)) {
			try {
				final ETypedElement feature = ((FeatureColumn) gridElement
						.getColumn()).getFeature();
				final FacetOperation selectionProperty = this.selectionPropH
						.getSelectionProperty();
				result = this.customManager.getCustomValueOf(element, feature,
						selectionProperty, List.class);
			} catch (CustomizationException e) {
				Logger.logWarning(e, "Error in table selection customization", //$NON-NLS-1$
						Activator.getDefault());
			}
		}
		return result;
	}

	/** @return the selected grid elements */
	private static List<IGridElement> getSelectedGridElements(
			final List<Object> rawSelection) {
		final List<IGridElement> gridElements = new ArrayList<IGridElement>();
		for (final Object object : rawSelection) {
			if (object instanceof IGridElement) {
				gridElements.add((IGridElement) object);
			}
		}
		return gridElements;
	}

	public boolean isSelectedCellEditable(final List<Object> rawSelection) {
		final List<IGridElement> gridElements = getSelectedGridElements(
				rawSelection);
		// cannot edit zero or more than one cell
		return gridElements.size() == 1
				&& isGridElementEditable(gridElements.get(0));
	}

	private boolean isGridElementEditable(final IGridElement gridElement) {
		boolean editable = false;
		final EObject eObject = gridElement.getRow().getElement();
		final Column column = gridElement.getColumn();
		final URI uri = eObject.eResource().getURI();
		if ((uri.isPlatformResource() || uri.isFile())
				&& column instanceof FeatureColumn) {
			final FeatureColumn featureColumn = (FeatureColumn) column;
			final ETypedElement feature = featureColumn.getFeature();
			if (feature instanceof EStructuralFeature
					&& ((EStructuralFeature) feature).isChangeable()) {
				if (feature instanceof DerivedTypedElement) {
					try {
						final DerivedTypedElement derivedTypedElt = (DerivedTypedElement) feature;
						editable = this.facetManager.isConforming(eObject,
								(Facet) derivedTypedElt.eContainer());
					} catch (final Exception e) {
						Logger.logWarning(e,
								"Failed to check Facet conformance", //$NON-NLS-1$
								Activator.getDefault());
					}
				} else {
					final List<EStructuralFeature> features = eObject.eClass()
							.getEAllStructuralFeatures();
					editable = features.contains(feature);
				}
			}
		}
		return editable;
	}

	@SuppressWarnings("null")
	// @SuppressWarnings("null") cannot in null state, checked by constant
	public ISelection computeSelection(final List<Object> gridSelection) {
		final ArrayList<Object> result = new ArrayList<Object>();
		StringBuffer debugBuffer = null;
		if (TableWidget.DEBUG_SELECTION) {
			debugBuffer = new StringBuffer();
		}
		for (Object selectedElement : gridSelection) {
			if (selectedElement instanceof IGridElement) {
				final IGridElement gridElement = (IGridElement) selectedElement;
				final Collection<? extends Object> resolvedSelection = resolveSelection(
						gridElement);
				for (Object object : resolvedSelection) {
					if (object != null) {
						result.add(object);
						if (TableWidget.DEBUG_SELECTION) {
							debugBuffer
									.append(System
											.getProperty("line.separator")) //$NON-NLS-1$
									.append("    ") //$NON-NLS-1$
									.append(object);
						}
					}
				}
			}
		}
		if (TableWidget.DEBUG_SELECTION) {
			DebugUtils.debug(debugBuffer.toString());
		}
		return new StructuredSelection(result);
	}

	public Set<EObject> getSelectedEObjects(
			final List<Object> rawSelection) {
		final Set<EObject> result = new HashSet<EObject>();
		for (Object selectedElement : rawSelection) {
			if (selectedElement instanceof IGridElement) {
				final IGridElement gridElement = (IGridElement) selectedElement;
				try {
					final Object value = getValueOf(gridElement);
					if (value instanceof EObject) {
						final EObject eObject = (EObject) value;
						result.add(eObject);
					}
				} catch (FacetManagerException e) {
					Logger.logError(
							"Error getting the value of a grid element to delete", //$NON-NLS-1$
							Activator.getDefault());
				}
			}
		}
		return result;
	}

	private Object getValueOf(final IGridElement gridElement)
			throws FacetManagerException {
		return getValueOf(gridElement, this.facetManager);
	}

	public static Object getValueOf(final IGridElement gridElement,
			final IFacetManager context) throws FacetManagerException {
		Object value = null;
		if (gridElement.getColumn() instanceof FeatureColumn) {
			final EObject element = gridElement.getRow().getElement();
			if (element != null) {
				final FeatureColumn featureColumn = (FeatureColumn) gridElement
						.getColumn();
				final ETypedElement eTypedElement = featureColumn.getFeature();
				if (FacetsUtils.hasStructuralFeature(element,
						eTypedElement, context)) {
					value = context.getOrInvoke(element, eTypedElement,
							Object.class);
				} else {
					// not applicable
					return "�"; //$NON-NLS-1$
				}
			}
		}
		return value;
	}

	public static boolean isApplicable(final IGridElement gridElement,
			final IFacetManager context) {
		boolean result = false;
		if (gridElement.getColumn() instanceof FeatureColumn) {
			final EObject element = gridElement.getRow().getElement();
			if (element != null) {
				final FeatureColumn featureColumn = (FeatureColumn) gridElement
						.getColumn();
				final ETypedElement eTypedElement = featureColumn.getFeature();
				try {
					if (FacetsUtils.hasStructuralFeature(element,
							eTypedElement, context)) {
						result = true;
					}
				} catch (FacetManagerException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		}
		return result;
	}
}
