/*******************************************************************************
 * Copyright (c) 2006, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 *******************************************************************************/
package org.eclipse.ocl.types.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.types.SetType;
import org.eclipse.ocl.types.TypesPackage;
import org.eclipse.ocl.types.operations.SetTypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SetTypeImpl<C, O>
		extends CollectionTypeImpl<C, O>
		implements SetType<C, O> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTypeImpl() {
		super();
	}

	protected SetTypeImpl(C elementType) {
		super(elementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setElementType(C newElementType) {
		super.setElementType(newElementType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkCollectionTypeName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SetTypeOperations.checkCollectionTypeName(this, diagnostics,
			context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public CollectionKind getKind() {
		return CollectionKind.SET_LITERAL;
	}

} //SetTypeImpl
