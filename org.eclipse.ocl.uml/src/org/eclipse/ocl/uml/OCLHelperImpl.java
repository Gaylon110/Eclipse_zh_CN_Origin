/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *******************************************************************************/

package org.eclipse.ocl.uml;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.helper.Choice;
import org.eclipse.ocl.helper.ConstraintKind;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;


/**
 * Implementation of the {@link OCL.Helper} convenience interface.
 * 
 * @author Christian W. Damus (cdamus)
 */
class OCLHelperImpl implements OCL.Helper {
    private final OCLHelper<Classifier, Operation, Property, Constraint> delegate;

    OCLHelperImpl(OCLHelper<Classifier, Operation, Property, Constraint> delegate) {
        this.delegate = delegate;
    }

    public OCL getOCL() {
        return (OCL) delegate.getOCL();
    }
    
    public Environment<?, Classifier, Operation, Property, ?, ?, ?, ?, ?, Constraint, ?, ?> getEnvironment() {
        return delegate.getEnvironment();
    }
    
    public Constraint createConstraint(ConstraintKind kind, String expression)
        throws ParserException {
        return delegate.createConstraint(kind, expression);
    }
    
    public Constraint createBodyCondition(String expression)
        throws ParserException {
        return delegate.createBodyCondition(expression);
    }

    public Constraint createDerivedValueExpression(String expression)
        throws ParserException {
        return delegate.createDerivedValueExpression(expression);
    }

    public Constraint createInitialValueExpression(String expression)
        throws ParserException {
        return delegate.createInitialValueExpression(expression);
    }

    public Constraint createInvariant(String expression)
        throws ParserException {
        return delegate.createInvariant(expression);
    }

    public Constraint createPostcondition(String expression)
        throws ParserException {
        return delegate.createPostcondition(expression);
    }

    public Constraint createPrecondition(String expression)
        throws ParserException {
        return delegate.createPrecondition(expression);
    }

    public OCLExpression createQuery(String expression)
        throws ParserException {
        return (OCLExpression) delegate.createQuery(expression);
    }

    public Property defineAttribute(String defExpression)
        throws ParserException {
        return delegate.defineAttribute(defExpression);
    }

    public Operation defineOperation(String defExpression)
        throws ParserException {
        return delegate.defineOperation(defExpression);
    }

    public Property getContextAttribute() {
        return delegate.getContextAttribute();
    }

    public Classifier getContextClassifier() {
        return delegate.getContextClassifier();
    }

    public Operation getContextOperation() {
        return delegate.getContextOperation();
    }

    public List<Choice> getSyntaxHelp(ConstraintKind constraintType, String txt) {
        return delegate.getSyntaxHelp(constraintType, txt);
    }

    public boolean isValidating() {
        return delegate.isValidating();
    }

    public void setContext(Classifier context) {
        delegate.setContext(context);
    }

    public void setAttributeContext(Classifier context, Property property) {
        delegate.setAttributeContext(context, property);
    }

    public void setOperationContext(Classifier context, Operation operation) {
        delegate.setOperationContext(context, operation);
    }
    
    public void setInstanceContext(Object instance) {
        delegate.setInstanceContext(instance);
    }
    
    public void setInstanceOperationContext(Object instance, Operation operation) {
        delegate.setInstanceOperationContext(instance, operation);
    }

    public void setInstanceAttributeContext(Object instance, Property property) {
        delegate.setInstanceAttributeContext(instance, property);
    }
    
    public void setValidating(boolean validating) {
        delegate.setValidating(validating);
    }
    
    public Diagnostic getProblems() {
    	return delegate.getProblems();
    }
}
