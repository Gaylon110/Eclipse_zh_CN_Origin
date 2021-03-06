/*******************************************************************************
 * Copyright (c) 2009, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer.instanceScope.traceback;

import java.util.Stack;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.ecore.CollectionLiteralExp;
import org.eclipse.ocl.ecore.EcorePackage;
import org.eclipse.ocl.ecore.IfExp;
import org.eclipse.ocl.ecore.IterateExp;
import org.eclipse.ocl.ecore.IteratorExp;
import org.eclipse.ocl.ecore.LetExp;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OperationCallExp;
import org.eclipse.ocl.ecore.OppositePropertyCallExp;
import org.eclipse.ocl.ecore.PropertyCallExp;
import org.eclipse.ocl.ecore.TupleLiteralExp;
import org.eclipse.ocl.ecore.VariableExp;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.eclipse.ocl.examples.impactanalyzer.impl.OperationBodyToCallMapper;
import org.eclipse.ocl.examples.impactanalyzer.instanceScope.AbstractPathCache;
import org.eclipse.ocl.examples.impactanalyzer.instanceScope.InstanceScopeAnalysis;
import org.eclipse.ocl.examples.impactanalyzer.instanceScope.unusedEvaluation.UnusedEvaluationRequestFactory;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;


public class TracebackStepCache extends AbstractPathCache<TracebackStep> {
    private final UnusedEvaluationRequestFactory unusedEvaluationRequestFactory;

    public TracebackStepCache(OppositeEndFinder oppositeEndFinder) {
        super(oppositeEndFinder);
        unusedEvaluationRequestFactory = new UnusedEvaluationRequestFactory();
    }
    
    protected TracebackStepCache(OppositeEndFinder oppositeEndFinder, UnusedEvaluationRequestFactory unusedEvaluationRequestFactory, InstanceScopeAnalysis instanceScopeAnalysis) {
        super(oppositeEndFinder);
        this.unusedEvaluationRequestFactory = unusedEvaluationRequestFactory;
    }

    @Override
    protected TracebackStep createStep(OCLExpression sourceExpression, EClass context,
            OperationBodyToCallMapper operationBodyToCallMapper, Stack<String> tupleLiteralNamesToLookFor, OCLFactory oclFactory) {
        TracebackStep result;
        switch (sourceExpression.eClass().getClassifierID()) {
        case EcorePackage.COLLECTION_LITERAL_EXP:
            result = new CollectionLiteralTracebackStep((CollectionLiteralExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.IF_EXP:
            result = new IfTracebackStep((IfExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.ITERATE_EXP:
            result = new IterateTracebackStep((IterateExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.ITERATOR_EXP:
            result = new IteratorTracebackStep((IteratorExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.LET_EXP:
            result = new LetTracebackStep((LetExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.OPERATION_CALL_EXP:
            result = new OperationCallTracebackStep((OperationCallExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.PROPERTY_CALL_EXP:
            result = new PropertyCallTracebackStep((PropertyCallExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.OPPOSITE_PROPERTY_CALL_EXP:
            result = new OppositePropertyCallTracebackStep((OppositePropertyCallExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.TUPLE_LITERAL_EXP:
            result = new TupleLiteralTracebackStep((TupleLiteralExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.VARIABLE_EXP:
            result = new VariableTracebackStep((VariableExp) sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        case EcorePackage.INTEGER_LITERAL_EXP:
        case EcorePackage.UNLIMITED_NATURAL_LITERAL_EXP:
        case EcorePackage.STRING_LITERAL_EXP:
        case EcorePackage.REAL_LITERAL_EXP:
        case EcorePackage.ENUM_LITERAL_EXP:
        case EcorePackage.BOOLEAN_LITERAL_EXP:
        case EcorePackage.NULL_LITERAL_EXP:
        case EcorePackage.INVALID_LITERAL_EXP:
        case EcorePackage.TYPE_EXP: // the target element isn't assumed to originate from the meta-model
            result = new EmptyTracebackStep(sourceExpression, context, operationBodyToCallMapper, tupleLiteralNamesToLookFor, this, unusedEvaluationRequestFactory, oclFactory);
            break;
        default:
            throw new RuntimeException("Unknown OCL expression type "+sourceExpression.eClass().getName()+" of expression "+
                    sourceExpression);
        }
        return result;
    }

    public UnusedEvaluationRequestFactory getUnusedEvaluationRequestFactory() {
        return unusedEvaluationRequestFactory;
    }

}
