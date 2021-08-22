/**
 * Copyright (c) 2010 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table - initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 339918 - To be able to have facet columns and to be able to have a local customization
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage
 * @generated
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface TableconfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableconfigurationFactory eINSTANCE = org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Configuration</em>'.
	 * @generated
	 */
	TableConfiguration createTableConfiguration();

	/**
	 * Returns a new object of class '<em>Instantiation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instantiation Method</em>'.
	 * @generated
	 */
	InstantiationMethod createInstantiationMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TableconfigurationPackage getTableconfigurationPackage();

} //TableconfigurationFactory
