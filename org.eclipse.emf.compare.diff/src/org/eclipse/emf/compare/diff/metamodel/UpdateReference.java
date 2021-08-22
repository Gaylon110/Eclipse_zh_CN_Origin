/*******************************************************************************
 * Copyright (c) 2006, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.diff.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Update Reference</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Differences of this kind represent modifications of the value of single-valued references.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.UpdateReference#getLeftTarget <em>Left Target</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.UpdateReference#getRightTarget <em>Right Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getUpdateReference()
 * @model
 * @generated
 */

public interface UpdateReference extends ReferenceChange {

	/**
	 * Returns the value of the '<em><b>Left Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Target</em>' reference.
	 * @see #setLeftTarget(EObject)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getUpdateReference_LeftTarget()
	 * @model
	 * @generated
	 */
	EObject getLeftTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.UpdateReference#getLeftTarget <em>Left Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Target</em>' reference.
	 * @see #getLeftTarget()
	 * @generated
	 */
	void setLeftTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Right Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Target</em>' reference.
	 * @see #setRightTarget(EObject)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getUpdateReference_RightTarget()
	 * @model
	 * @generated
	 */
	EObject getRightTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.UpdateReference#getRightTarget <em>Right Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Target</em>' reference.
	 * @see #getRightTarget()
	 * @generated
	 */
	void setRightTarget(EObject value);
	// This class doesn't need any Overriding to be functional
} // UpdateReference
