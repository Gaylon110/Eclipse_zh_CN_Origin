/**
 * Copyright (c) 2015 Soft-Maint, and Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Jonathan Pepin (Soft-Maint) - Bug 463905 - Support of parsing OCL expressions with Facet references
 * 	Jonathan Pepin (Soft-Maint) - Bug 466282 - NullPointer on EFacetOCLEnvironment.initFacetManager
 * 	Grégoire Dupé (Mia-Software) - Bug 463905 - Support of parsing OCL expressions with Facet references
 */
package org.eclipse.emf.facet.util.efacet.ocl.core.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.utilities.UMLReflection;

public class EFacetOCLEnvironmentFactory extends EcoreEnvironmentFactory {

	private final IFacetManager facetManager;

	public EFacetOCLEnvironmentFactory(final IFacetManager facetManager) {
		super();
		this.facetManager = facetManager;
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject>
		createEnvironment() {
		final EFacetOCLEnvironment result = new EFacetOCLEnvironment(
				getEPackageRegistry(), this, this.facetManager);
		return result;
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject>
		createEnvironment(
			final Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject>
				parent) {
		
		if (!(parent instanceof EFacetOCLEnvironment)) {
			throw new IllegalArgumentException(
					"Parent environment must be my environment: " + parent); //$NON-NLS-1$
		}
		final EFacetOCLEnvironment result = new EFacetOCLEnvironment(
				(EFacetOCLEnvironment) parent, this);
		return result;
	}

	@Override
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject>
		createEvaluationEnvironment() {
		return new EFacetOCLEvaluationEnvironment();
	}

	@Override
	public EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject>
		createEvaluationEnvironment(
			final EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject>
				parent) {
		return new EFacetOCLEvaluationEnvironment(parent);
	}

	@Override
	public Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> createInstanceContext(
			final Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> parent,
			final Object context) {
		Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> result = null;
		if (parent instanceof EFacetOCLEnvironment) {
			final EFacetOCLEnvironment typedParent = (EFacetOCLEnvironment) parent;
			result = new EFacetOCLEnvironment(typedParent, this);
			// in case it corresponds to an OCL primitive type
			final UMLReflection<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint> uml = parent
					.getUMLReflection();
			
			final Variable<EClassifier, EParameter> self = parent.getOCLFactory()
					.createVariable();
			
			uml.setName(self, Environment.SELF_VARIABLE_NAME);
			uml.setType(self, uml.asOCLType(getClassifier(context)));
			
			result.addElement(self.getName(), self, true);
			result.setSelfVariable(self);
		} else {
			throw new IllegalArgumentException(
					"Parent environment must be my environment: " + parent); //$NON-NLS-1$
		}
		return result;
	}
	
}
