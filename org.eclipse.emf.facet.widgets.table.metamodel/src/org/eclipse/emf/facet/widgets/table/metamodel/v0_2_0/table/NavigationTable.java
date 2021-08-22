/**
 * Copyright (c) 2010, 2011, 2012 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Gregoire Dupe (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Gregoire Dupe (Mia-Software) - Bug 339918 - To be able to have facet columns and to be able to have a local customization
 *    Gregoire Dupe (Mia-Software) - Bug 340571 - To be able have more than one localCustomization
 *    Gregoire Dupe (Mia-Software) - Bug 340572 - Wrong multiplicity in Table.facets
 *    Nicolas Guyomar (Mia-Software) - Bug 340941 - Need new row and column types in the table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Table Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A query customized TableInstance, with a reference to some ModelQueryResult
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable#getQueryResults <em>Query Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getNavigationTable()
 * @model
 * @generated
 */
public interface NavigationTable extends Table {
	/**
	 * Returns the value of the '<em><b>Query Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Results</em>' containment reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getNavigationTable_QueryResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypedElementResult> getQueryResults();

} // NavigationTable
