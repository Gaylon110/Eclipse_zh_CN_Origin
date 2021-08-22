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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getInstantiationOperation <em>Instantiation Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getInstantiationMethod()
 * @model
 * @generated
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface InstantiationMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getInstantiationMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getInstantiationMethod_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Instantiation Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Operation</em>' reference.
	 * @see #setInstantiationOperation(EOperation)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getInstantiationMethod_InstantiationOperation()
	 * @model
	 * @generated
	 */
	EOperation getInstantiationOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getInstantiationOperation <em>Instantiation Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation Operation</em>' reference.
	 * @see #getInstantiationOperation()
	 * @generated
	 */
	void setInstantiationOperation(EOperation value);

} // InstantiationMethod
