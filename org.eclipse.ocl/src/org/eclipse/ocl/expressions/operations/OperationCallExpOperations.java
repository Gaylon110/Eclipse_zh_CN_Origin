/*******************************************************************************
 * Copyright (c) 2009, 2016 IBM Corporation, Zeligsoft Inc., Open Canarias S.L., and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   IBM - Initial API and implementation
 *   Adolfo Sanchez-Barbudo Herrera - 231515 Fix NPE in checkArgumentCount
 *   Zeligsoft - Bug 207365
 *   Adolfo Sanchez-Barbudo Herrera - Bug 236247
 *******************************************************************************/
package org.eclipse.ocl.expressions.operations;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.Environment;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;

import org.eclipse.ocl.expressions.util.ExpressionsValidator;
import org.eclipse.ocl.internal.l10n.OCLMessages;
import org.eclipse.ocl.util.OCLUtil;
import org.eclipse.ocl.util.TypeUtil;
import org.eclipse.ocl.utilities.UMLReflection;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operation Call Exp</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.expressions.OperationCallExp#checkArgumentsConform(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Arguments Conform</em>}</li>
 *   <li>{@link org.eclipse.ocl.expressions.OperationCallExp#checkArgumentCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Argument Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallExpOperations
		extends OCLExpressionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallExpOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * arguments->forall (a | a.type.conformsTo
	 * (self.refParams->at (arguments->indexOf (a)).type))
	 * @param operationCallExp The receiving '<em><b>Operation Call Exp</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static <C, O> boolean checkArgumentsConform(
			OperationCallExp<C, O> operationCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		String message = null;
		Environment<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> env = OCLUtil
			.getValidationEnvironment(operationCallExp, context);

		if (env != null) {
			OCLExpression<C> source = operationCallExp.getSource();
			O oper = operationCallExp.getReferredOperation();
			List<OCLExpression<C>> args = operationCallExp.getArgument();

			if ((oper != null) && (source != null)) {
				UMLReflection<?, C, O, ?, ?, ?, ?, ?, ?, ?> uml = env
					.getUMLReflection();

				// Check argument conformance.
				List<?> parms = uml.getParameters(oper);

				// if the wrong number of parameters, the other constraint
				// on argument count will complain
				if (parms.size() == args.size()) {
					// We check the arguments of the operationCallExp against
					// the parameters of the referred operation
					if (!TypeUtil.matchArgs(env, source.getType(), parms,
						args)) {
						result = false;
						message = OCLMessages.bind(
							OCLMessages.IllegalOperation_ERROR_,
							operationCallExp.toString());

					}
				}
			}
		}

		if (!result) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					ExpressionsValidator.DIAGNOSTIC_SOURCE,
					ExpressionsValidator.OPERATION_CALL_EXP__ARGUMENTS_CONFORM,
					message, new Object[]{operationCallExp}));
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * arguments->size() = refParams->size()
	 * @param operationCallExp The receiving '<em><b>Operation Call Exp</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated NOT
	 */
	public static <C, O> boolean checkArgumentCount(
			OperationCallExp<C, O> operationCallExp,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		Environment<?, C, O, ?, ?, ?, ?, ?, ?, ?, ?, ?> env = OCLUtil
			.getValidationEnvironment(operationCallExp, context);

		if (env != null) {
			O oper = operationCallExp.getReferredOperation();
			if (oper != null) {
				List<OCLExpression<C>> args = operationCallExp.getArgument();
				List<?> parms = env.getUMLReflection().getParameters(oper);
				result = args.size() == parms.size();
			}
		}

		if (!result) {
			if (diagnostics != null) {
				// TODO: Specific message
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR,
					ExpressionsValidator.DIAGNOSTIC_SOURCE,
					ExpressionsValidator.OPERATION_CALL_EXP__ARGUMENT_COUNT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic", new Object[]{ //$NON-NLS-1$
							"checkArgumentCount", //$NON-NLS-1$
							org.eclipse.emf.ecore.util.EObjectValidator
								.getObjectLabel(operationCallExp, context)}),
					new Object[]{operationCallExp}));
			}
		}
		return result;
	}

} // OperationCallExpOperations