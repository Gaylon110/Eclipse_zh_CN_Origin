/*******************************************************************************
 * Copyright (c) 2010, 2016 SAP AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Axel Uhl - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.ecore.utilities;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OppositePropertyCallExp;
import org.eclipse.ocl.ecore.SendSignalAction;


/**
 * Mixes in the {@link VisitorExtension} interface and provides a default implementation for
 * {@link OppositePropertyCallExp}.
 * 
 * @since 3.1
 */
public class AbstractVisitor<T>
		extends
		org.eclipse.ocl.utilities.AbstractVisitor<
		T, EClassifier, EOperation, EStructuralFeature,
		EEnumLiteral, EParameter, EObject,
		CallOperationAction, SendSignalAction, Constraint>
		implements VisitorExtension<T> {
    /**
     * Initializes me.
     */
	protected AbstractVisitor() {
		super();
	}
	
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param result my initial result value
	 */
	protected AbstractVisitor(T result) {
		super(result);
	}
	
	/**
	 * Visits the opposite property-call source. No qualifiers are visited as
	 * these calls are not expected for UML but only for Ecore. Returns the
	 * result of
	 * {@link #handleOppositePropertyCallExp(OppositePropertyCallExp, Object)}.
	 * 
	 * @since 3.1
	 */
	public T visitOppositePropertyCallExp(OppositePropertyCallExp callExp) {
        T sourceResult = safeVisit(callExp.getSource());
        return handleOppositePropertyCallExp(callExp, sourceResult);
	}
    
    /**
     * Visits the specified opposite property call with the results of visiting
     * its source and qualifiers (if any).  Note that in the case of a opposite property
     * call expression as a qualifier of an association class call, the
     * opposite property call does not have a source and, therefore, the
     * <code>sourceResult</code> will be <code>null</code> in that case.
     * 
     * @param callExp the opposite property call expression
     * @param sourceResult the result of visiting the expression's source
     * @return the accumulated {@link #result}, by default
     * 
     * @see #visitOppositePropertyCallExp(OppositePropertyCallExp)
     * @since 3.1
     */
    protected T handleOppositePropertyCallExp(OppositePropertyCallExp callExp,
            T sourceResult) {
        return result;
    }
    
}
