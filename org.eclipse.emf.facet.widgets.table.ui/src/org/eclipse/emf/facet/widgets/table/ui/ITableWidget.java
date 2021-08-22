/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
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
 *    Gregoire Dupe (Mia-Software) - Bug 387573 - [Table] Add the method ITableWidget.selectRows(List<EObject> to select, boolean clear) to the API
 *******************************************************************************/

package org.eclipse.emf.facet.widgets.table.ui;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetAttribute;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetReference;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.widgets.table.ui.command.ITableCommandFactory;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * This interface defines every public action a user can perform on the EMF
 * Facet table widget
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 * @since 0.3
 */
public interface ITableWidget extends ISelectionProvider {

	/**
	 * Add a new row in the table for each given element.
	 * 
	 * @param newElements
	 *            the list of elements to add to the table
	 */
	void addRows(List<? extends EObject> newElements);

	/**
	 * Set the facets in order to apply them on the table. If
	 * {@link FacetReference} or {@link FacetAttribute} are contained by those
	 * facets, new columns {@link FacetReferenceColumn} and
	 * {@link FacetAttributeColumn} are added to the table.
	 * 
	 * @param facets the list of facets to be applied on the table.
	 */
	void setFacetSets(List<? extends FacetSet> facetSets);
	
	List<EObject> getSelectedRowEObjects();
	
	ITableCommandFactory getTableCommandFactory();

	/**
	 * This method allows to select the rows representing the EObjects in the
	 * table
	 * 
	 * @param elementsToSelect
	 *            the elements to select
	 * @param clearTheSelection
	 *            indicates if the current selection should be cleared
	 */
	void selectRows(List<EObject> elementsToSelect, boolean clearTheSelection);
}
