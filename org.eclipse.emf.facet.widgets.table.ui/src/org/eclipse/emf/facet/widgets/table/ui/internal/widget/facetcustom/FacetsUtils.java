/*******************************************************************************
 * Copyright (c) 2010, 2017 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.InternalTableUtils:
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
 *    Vincent Lorenzo (CEA LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns
 *    Gregoire Dupe (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns - Regression fix
 *    Nicolas Guyomar (Mia-Software) - Bug 345665 - Columns are duplicated when you drop many elements in the same time
 *    Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *    Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Gregoire Dupe (Mia-Software) - Bug 354224 - mutually exclusive Facets
 *    Gr�goire Dup� (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *    Gregoire Dupe (Mia-Software) - Bug 380293 - [Table] Columns declared in tableconfiguration are never created when we create an empty table
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    David Couvrand (Soft-Maint) - Bug 417604 - [Table] Columns creation order
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManager;
import org.eclipse.emf.facet.efacet.core.IFacetSetCatalogManagerFactory;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.emf.core.ModelUtils;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;

public final class FacetsUtils {

	private FacetsUtils() {
		// Must not be used.
	}

	public static Set<FacetSet> getAllKnownFacetSets(final Table table) {
		final Set<FacetSet> result = new HashSet<FacetSet>();
		final ResourceSet resourceSet = getResourceSet(table);
		final Collection<FacetSet> facetSets = getRegisteredFacetSets(
				resourceSet);
		result.addAll(facetSets);
		result.addAll(table.getFacetSets());
		return result;
	}

	private static Collection<FacetSet> getRegisteredFacetSets(
			final ResourceSet resourceSet) {
		final IFacetSetCatalogManager catalogMgr = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(resourceSet);
		return catalogMgr.getRegisteredFacetSets();
	}

	public static List<FacetSet> getKnownFacetSets(final Table table) {
		final List<FacetSet> result = new ArrayList<FacetSet>();
		final List<FacetSet> tableFS = table.getFacetSets();
		final ResourceSet resourceSet = getResourceSet(table);
		final Collection<FacetSet> registeredFS = getRegisteredFacetSets(
				resourceSet);
		result.addAll(tableFS);
		result.addAll(registeredFS);
		return result;
	}

	public static List<ETypedElement> getAllKnownETypedElements(
			final Table table) {
		final Set<EClassifier> classifiers = getAllKnownEClassifiers(table);
		final List<ETypedElement> typedElements = new ArrayList<ETypedElement>();
		for (EClassifier eClassifier : classifiers) {
			typedElements.addAll(getContainedETypedElements(eClassifier));
		}
		return typedElements;
	}

	private static Collection<ETypedElement> getContainedETypedElements(
			final EObject eObject) {
		final List<ETypedElement> typedElements = new ArrayList<ETypedElement>();
		final TreeIterator<EObject> eAllContents = eObject.eAllContents();
		while (eAllContents.hasNext()) {
			final EObject element = eAllContents.next();
			if (element instanceof ETypedElement) {
				final ETypedElement eTypedElement = (ETypedElement) element;
				typedElements.add(eTypedElement);
			}
		}
		return typedElements;
	}

	private static Set<EClassifier> getAllKnownEClassifiers(final Table table) {
		final HashSet<EClassifier> eClassifiers = new HashSet<EClassifier>();
		final ResourceSet resourceSet = getResourceSet(table);
		final IFacetSetCatalogManager facetMgr = IFacetSetCatalogManagerFactory.DEFAULT
				.getOrCreateFacetSetCatalogManager(resourceSet);
		final Collection<FacetSet> registeredFS = facetMgr
				.getRegisteredFacetSets();
		for (FacetSet facetSet : registeredFS) {
			eClassifiers.addAll(FacetUtils.getAllFacet(facetSet));
		}
		for (FacetSet facetSet : table.getFacetSets()) {
			eClassifiers.addAll(FacetUtils.getAllFacet(facetSet));
		}
		for (EObject eObject : TableWidgetUtils.getElements(table)) {
			eClassifiers.add(eObject.eClass());
		}
		return eClassifiers;
	}

	private static ResourceSet getResourceSet(final Table table) {
		final Resource resource = table.eResource();
		return resource.getResourceSet();
	}

	public static boolean hasStructuralFeature(final EObject eObject,
			final ETypedElement structuralFeature, final IFacetManager context)
			throws FacetManagerException {
		boolean result = false;
		final EClass eClass = eObject.eClass();
		if (eClass.getEAllStructuralFeatures().contains(structuralFeature)) {
			result = true;
		} else {
			if (structuralFeature instanceof DerivedTypedElement) {
				final DerivedTypedElement derivedTypedElt = (DerivedTypedElement) structuralFeature;
				final EObject eContainer = derivedTypedElt.eContainer();
				if (eContainer instanceof Facet) {
					final Facet facet = (Facet) eContainer;
					result = context.isConforming(eObject, facet);
				}
			}
		}
		return result;
	}

	public static void loadManagedFacetSetsInTable(final Table table,
			final IFacetManager facetManager) {
		/*
		 * Begin Bug 415887 - FacetManager cleaned after displaying a
		 * TableWidget
		 */
		/*
		 * gdupe> The reset of the FacetSet manager handled by the resoureSet is
		 * realy supect. That's why I choosed to disable it. However, when in
		 * doubt, I do not remove the facet manger cleaning when it isn't
		 * handled by the resourceSet.
		 */
		final IFacetManager commonFacetMngr = getFacetManager(table);
		if (!facetManager.equals(commonFacetMngr)) {
			facetManager.getManagedFacetSets().clear();
			facetManager.getManagedFacetSets().addAll(table.getFacetSets());
		}
	}

	public static IFacetManager getFacetManager(final EObject eObject) {
		final ResourceSet resourceSet = eObject.eResource().getResourceSet();
		return IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(resourceSet);
	}

	public static IFacetManager getFacetManagerWithGetOrCreateResourceSet(
			final EObject eObject) {
		final ResourceSet resourceSet = ModelUtils
				.getOrCreateResourceSet(eObject);
		return IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(resourceSet);
	}

}
