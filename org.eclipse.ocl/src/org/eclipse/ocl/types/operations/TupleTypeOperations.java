/*******************************************************************************
 * Copyright (c) 2008, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 *******************************************************************************/
package org.eclipse.ocl.types.operations;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.types.TupleType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tuple Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.utilities.PredefinedType#getName() <em>Get Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.utilities.PredefinedType#oclOperations() <em>Ocl Operations</em>}</li>
 *   <li>{@link org.eclipse.ocl.types.TupleType#checkTupleTypeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Tuple Type Name</em>}</li>
 *   <li>{@link org.eclipse.ocl.types.TupleType#checkPartNamesUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Part Names Unique</em>}</li>
 *   <li>{@link org.eclipse.ocl.types.TupleType#checkFeaturesOnlyProperties(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Features Only Properties</em>}</li>
 *   <li>{@link org.eclipse.ocl.types.TupleType#oclProperties() <em>Ocl Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TupleTypeOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleTypeOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 1.3
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static <O, P> String getName(TupleType<O, P> tupleType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * @since 1.3
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static <O, P> EList<O> oclOperations(TupleType<O, P> tupleType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name =
	 * 'Tuple('.concat (
	 * Sequence{1..allProperties()->size()}->iterate (pn; s: String = '' |
	 * let p: Property = allProperties()->at (pn) in (
	 * s.concat (
	 * (if (pn>1) then ',' else '' endif)
	 * .concat (p.name).concat (': ')
	 * .concat (p.type.name)
	 * )
	 * )
	 * )
	 * ).concat (')')
	 * @param tupleType The receiving '<em><b>Tuple Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static <O, P> boolean checkTupleTypeName(TupleType<O, P> tupleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * @param tupleType The receiving '<em><b>Tuple Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static <O, P> boolean checkPartNamesUnique(TupleType<O, P> tupleType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * feature->forAll (f | f.oclIsTypeOf(Property))
	 * @param tupleType The receiving '<em><b>Tuple Type</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static <O, P> boolean checkFeaturesOnlyProperties(
			TupleType<O, P> tupleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static <O, P> EList<P> oclProperties(TupleType<O, P> tupleType) {
		return tupleType.oclProperties();
	}

} // TupleTypeOperations