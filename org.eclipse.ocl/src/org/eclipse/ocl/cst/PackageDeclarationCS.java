/*******************************************************************************
 * Copyright (c) 2005, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bugs 243976, 251349
 *******************************************************************************/
package org.eclipse.ocl.cst;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.cst.PackageDeclarationCS#getPathNameCS <em>Path Name CS</em>}</li>
 *   <li>{@link org.eclipse.ocl.cst.PackageDeclarationCS#getContextDecls <em>Context Decls</em>}</li>
 *   <li>{@link org.eclipse.ocl.cst.PackageDeclarationCS#getPackageDeclarationCS <em>Package Declaration CS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ocl.cst.CSTPackage#getPackageDeclarationCS()
 * @model
 * @generated
 */
public interface PackageDeclarationCS
		extends CSTNode {

	/**
	 * Returns the value of the '<em><b>Path Name CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name CS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name CS</em>' containment reference.
	 * @see #setPathNameCS(PathNameCS)
	 * @see org.eclipse.ocl.cst.CSTPackage#getPackageDeclarationCS_PathNameCS()
	 * @model containment="true"
	 * @generated
	 */
	PathNameCS getPathNameCS();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.cst.PackageDeclarationCS#getPathNameCS <em>Path Name CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name CS</em>' containment reference.
	 * @see #getPathNameCS()
	 * @generated
	 */
	void setPathNameCS(PathNameCS value);

	/**
	 * Returns the value of the '<em><b>Context Decls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.cst.ContextDeclCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Decls</em>' containment reference list.
	 * @see org.eclipse.ocl.cst.CSTPackage#getPackageDeclarationCS_ContextDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextDeclCS> getContextDecls();

	/**
	 * Returns the value of the '<em><b>Package Declaration CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Declaration CS</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Declaration CS</em>' reference.
	 * @see #setPackageDeclarationCS(PackageDeclarationCS)
	 * @see org.eclipse.ocl.cst.CSTPackage#getPackageDeclarationCS_PackageDeclarationCS()
	 * @model
	 * @generated
	 */
	PackageDeclarationCS getPackageDeclarationCS();

	/**
	 * Sets the value of the '{@link org.eclipse.ocl.cst.PackageDeclarationCS#getPackageDeclarationCS <em>Package Declaration CS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Declaration CS</em>' reference.
	 * @see #getPackageDeclarationCS()
	 * @generated
	 */
	void setPackageDeclarationCS(PackageDeclarationCS value);

} // PackageDeclarationCS
