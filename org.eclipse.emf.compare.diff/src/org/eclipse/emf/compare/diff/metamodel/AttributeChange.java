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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attribute Change</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Superclass of elements describing difference between the values of a given attribute.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getLeftElement <em>Left Element</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getRightElement <em>Right Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChange()
 * @model
 * @generated
 */
public interface AttributeChange extends DiffElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EAttribute)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChange_Attribute()
	 * @model
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Returns the value of the '<em><b>Left Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Element</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Element</em>' reference.
	 * @see #setLeftElement(EObject)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChange_LeftElement()
	 * @model
	 * @generated
	 */
	EObject getLeftElement();

	/**
	 * Returns the value of the '<em><b>Right Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Element</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Element</em>' reference.
	 * @see #setRightElement(EObject)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChange_RightElement()
	 * @model
	 * @generated
	 */
	EObject getRightElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getLeftElement <em>Left Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Element</em>' reference.
	 * @see #getLeftElement()
	 * @generated
	 */
	void setLeftElement(EObject value);

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.AttributeChange#getRightElement <em>Right Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Element</em>' reference.
	 * @see #getRightElement()
	 * @generated
	 */
	void setRightElement(EObject value);

} // AttributeChange
