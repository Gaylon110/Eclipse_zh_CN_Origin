/*******************************************************************************
 * Copyright (c) 2005, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 243976
 *******************************************************************************/
package org.eclipse.ocl.cst;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.DefCS#getDefExpressionCS <em>Def Expression CS</em>}</li>
 *   <li>{@link org.eclipse.ocl.cst.DefCS#isStatic <em>Static</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getDefCS()
 * @model
 * @generated
 */
public interface DefCS
		extends InvOrDefCS {

	/**
	 * Returns the value of the '<em><b>Def Expression CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Expression CS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Expression CS</em>' containment reference.
	 * @see #setDefExpressionCS(DefExpressionCS)
	 * @see org.eclipse.ocl.cst.CSTPackage#getDefCS_DefExpressionCS()
	 * @model containment="true"
	 * @generated
	 */
	DefExpressionCS getDefExpressionCS();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.cst.DefCS#getDefExpressionCS <em>Def Expression CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Expression CS</em>' containment reference.
	 * @see #getDefExpressionCS()
	 * @generated
	 */
	void setDefExpressionCS(DefExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(boolean)
	 * @see org.eclipse.ocl.cst.CSTPackage#getDefCS_Static()
	 * @model default="false"
	 * @generated
	 */
	boolean isStatic();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.cst.DefCS#isStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 3.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #isStatic()
	 * @generated
	 */
	void setStatic(boolean value);

} // DefCS
