/*******************************************************************************
 * Copyright (c) 2006, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 241426
 *******************************************************************************/
package org.eclipse.ocl.ecore.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.EClassifierImpl;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.VoidType;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Void Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VoidTypeImpl
		extends EClassifierImpl
		implements VoidType {

	private EList<EOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcorePackage.Literals.VOID_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return SINGLETON_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EOperation> oclOperations() {
		if (operations == null) {
			VoidType prototype = (VoidType) OCLStandardLibraryImpl.INSTANCE
				.getOclVoid();

			if (prototype == this) {
				// I *am* the standard library type!
				operations = OCLStandardLibraryImpl.getExistingOperations(this);
			} else {
				// the prototype defines my operations for me
				operations = prototype.oclOperations();
			}
		}

		return operations;
	}

} //VoidTypeImpl
