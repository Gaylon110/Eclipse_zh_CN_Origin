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

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Row dedicated to the display of queryResult
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow#getQueryResult <em>Query Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getNavigationRow()
 * @model abstract="true"
 * @generated
 */
public interface NavigationRow extends Row {
	/**
	 * Returns the value of the '<em><b>Query Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Result</em>' reference.
	 * @see #setQueryResult(ETypedElementResult)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getNavigationRow_QueryResult()
	 * @model
	 * @generated
	 */
	ETypedElementResult getQueryResult();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow#getQueryResult <em>Query Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Result</em>' reference.
	 * @see #getQueryResult()
	 * @generated
	 */
	void setQueryResult(ETypedElementResult value);

} // NavigationRow
