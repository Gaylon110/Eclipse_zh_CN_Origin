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

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OppositePropertyCallExp;
import org.eclipse.ocl.examples.impactanalyzer.impl.OperationBodyToCallMapper;
import org.eclipse.ocl.examples.impactanalyzer.instanceScope.unusedEvaluation.UnusedEvaluationRequestFactory;
import org.eclipse.ocl.examples.impactanalyzer.instanceScope.unusedEvaluation.UnusedEvaluationRequestSet;
import org.eclipse.ocl.examples.impactanalyzer.util.AnnotatedEObject;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;
import org.eclipse.ocl.examples.impactanalyzer.util.OperationCallExpKeyedSet;


public class OppositePropertyCallTracebackStep extends AbstractTracebackStep<OppositePropertyCallExp> implements TracebackStep {

    private final TracebackStepAndScopeChange nextStep;
    private final boolean isMany;
    private final EReference reference;

    public OppositePropertyCallTracebackStep(OppositePropertyCallExp sourceExpression, EClass context,
            OperationBodyToCallMapper operationBodyToCallMapper, Stack<String> tupleLiteralNamesToLookFor,
            TracebackStepCache tracebackStepCache, UnusedEvaluationRequestFactory unusedEvaluationRequestFactory, OCLFactory oclFactory) {
        super(sourceExpression, tupleLiteralNamesToLookFor, tracebackStepCache.getOppositeEndFinder(), operationBodyToCallMapper, unusedEvaluationRequestFactory, oclFactory);
        OCLExpression source = (OCLExpression) sourceExpression.getSource();
        reference = (EReference) sourceExpression.getReferredOppositeProperty();
        nextStep = createTracebackStepAndScopeChange(sourceExpression, source, context, operationBodyToCallMapper,
                tupleLiteralNamesToLookFor, tracebackStepCache);
        isMany = sourceExpression.getReferredOppositeProperty().isMany();
    }

    @Override
    protected OperationCallExpKeyedSet performSubsequentTraceback(AnnotatedEObject source,
            UnusedEvaluationRequestSet pendingUnusedEvalRequests, org.eclipse.ocl.examples.impactanalyzer.instanceScope.traceback.TracebackCache tracebackCache, Notification changeEvent) {
        OperationCallExpKeyedSet result;
        List<OperationCallExpKeyedSet> resultList = new LinkedList<OperationCallExpKeyedSet>();
        Object o = source.eGet(reference);
        if (isMany) {
            if (o instanceof EList<?>) {
                @SuppressWarnings("unchecked")
                EList<EObject> refObjects = (EList<EObject>) o;
                for (EObject obj : refObjects) {
                    resultList.add(nextStep.traceback(annotateEObject(source, obj), pendingUnusedEvalRequests, tracebackCache, changeEvent));
                }
                result = tracebackCache.getOperationCallExpKeyedSetFactory().createOperationCallExpKeyedSet(resultList);
            } else {
                result = tracebackCache.getOperationCallExpKeyedSetFactory().emptySet();
            }
        } else {
            AnnotatedEObject oSingle = annotateEObject(source, (EObject) source.eGet(reference));
            if (oSingle != null) {
                result = nextStep.traceback(oSingle, pendingUnusedEvalRequests, tracebackCache, changeEvent);
            } else {
                result = tracebackCache.getOperationCallExpKeyedSetFactory().emptySet();
            }
        }
        return result;
    }

}
