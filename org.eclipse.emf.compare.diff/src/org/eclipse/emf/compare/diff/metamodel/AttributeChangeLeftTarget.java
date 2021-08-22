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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attribute Change Left Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A "LeftTarget" element change describes a difference involving the left element/resource. In the case of AttributeChanges, these describe differences within multi-valued attributes. Specifically, the addition of a value or the remote removal of a value (for three way comparisons).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.AttributeChangeLeftTarget#getLeftTarget <em>Left Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChangeLeftTarget()
 * @model
 * @generated
 */
public interface AttributeChangeLeftTarget extends AttributeChange {
	/**
	 * Returns the value of the '<em><b>Left Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Target</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Target</em>' attribute.
	 * @see #setLeftTarget(Object)
	 * @see org.eclipse.emf.compare.diff.metamodel.DiffPackage#getAttributeChangeLeftTarget_LeftTarget()
	 * @model
	 * @generated
	 */
	Object getLeftTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.compare.diff.metamodel.AttributeChangeLeftTarget#getLeftTarget <em>Left Target</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Target</em>' attribute.
	 * @see #getLeftTarget()
	 * @generated
	 */
	void setLeftTarget(Object value);

} // AttributeChangeLeftTarget
