/**
 * Copyright (c) 2010, 2001 CEA LIST.
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
 *    Gregoire Dupe (Mia-Software) - Bug 340572 - Wrong multiplicity in TableInstance.facets
 *    Nicolas Guyomar (Mia-Software) - Bug 340941 - Need new row and column types in the table
 *    Gregoire Dupe (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage
 * @generated
 */
public interface TableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableFactory eINSTANCE = org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Navigation Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Table</em>'.
	 * @generated
	 */
	NavigationTable createNavigationTable();

	/**
	 * Returns a new object of class '<em>Source Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Column</em>'.
	 * @generated
	 */
	SourceColumn createSourceColumn();

	/**
	 * Returns a new object of class '<em>Feature Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Column</em>'.
	 * @generated
	 */
	FeatureColumn createFeatureColumn();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Primitive Type Query Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type Query Row</em>'.
	 * @generated
	 */
	PrimitiveTypeQueryRow createPrimitiveTypeQueryRow();

	/**
	 * Returns a new object of class '<em>EObject Query Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Query Row</em>'.
	 * @generated
	 */
	EObjectQueryRow createEObjectQueryRow();

	/**
	 * Returns a new object of class '<em>Value Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Column</em>'.
	 * @generated
	 */
	ValueColumn createValueColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TablePackage getTablePackage();

} //TableFactory
