/*******************************************************************************
 * Copyright (c) 2007, 2016 IBM Corporation, Zeligsoft Inc., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 207365
 *******************************************************************************/
package org.eclipse.ocl.uml;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ocl.uml.UMLPackage#getOCLExpression()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OclExpression'"
 *        extendedMetaData="name='OclExpression'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_type'"
 * @generated
 */
public interface OCLExpression
		extends TypedElement,
		org.eclipse.ocl.expressions.OCLExpression<Classifier> {
} // OCLExpression
