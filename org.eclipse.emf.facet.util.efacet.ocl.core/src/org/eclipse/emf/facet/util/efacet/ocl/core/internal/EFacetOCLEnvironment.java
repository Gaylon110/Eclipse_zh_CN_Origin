/**
 * Copyright (c) 2015, 2016 Soft-Maint, and Mia-Software.
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
 * 	Jonathan Pepin (Soft-Maint) - Bug 509337 - Problem to navigate through multiple facet references
 * 	Jonathan Pepin (Soft-Maint) - Bug 509359 - OCL Environment not detect facet nested in facetset and extended facet
 * 	Jonathan Pepin (Soft-Maint) - Bug 509342 - Add OCL evaluation of facet attribute
 */
package org.eclipse.emf.facet.util.efacet.ocl.core.internal;

import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetAttribute;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetReference;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.ocl.EnvironmentFactory;
import org.eclipse.ocl.ecore.AnyType;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.SendSignalAction;

public class EFacetOCLEnvironment extends EcoreEnvironment {

	private static final boolean DEBUG_STATUS = DebugUtils.getDebugStatus(Activator.getDefault());
	public static final String ANNOT_ENVIRONMENT = "EFacetOCLEnvironment"; //$NON-NLS-1$

	private final IFacetManager facetManager;

	public EFacetOCLEnvironment(final EPackage.Registry registry,
			final EnvironmentFactory<
			EPackage, EClassifier, EOperation, EStructuralFeature,
			EEnumLiteral, EParameter,
			EObject, CallOperationAction, SendSignalAction, Constraint,
			EClass, EObject> factory,
			final IFacetManager facetManager) {
		super(registry);
		this.facetManager = facetManager;
		setFactory(factory);
	}

	public EFacetOCLEnvironment(final EFacetOCLEnvironment parent,
			final EnvironmentFactory<
			EPackage, EClassifier, EOperation, EStructuralFeature,
			EEnumLiteral, EParameter,
			EObject, CallOperationAction, SendSignalAction, Constraint,
			EClass, EObject> factory) {
		super(parent);
		this.facetManager = parent.facetManager;
		setFactory(factory);
	}

	/**
	 * Override the Ecore environment to add structural feature from loaded
	 * Face Set on the current classifier in the OCL scope
	 */
	@Override
	public List<EStructuralFeature> getAdditionalAttributes(
			final EClassifier classifier) {
		if (!(classifier instanceof AnyType) && this.facetManager != null) {
			for (FacetSet facetSet : this.facetManager.getManagedFacetSets()) {
				final List<Facet> allFacet = FacetUtils.getAllFacet(facetSet);
				for (Facet facet : allFacet) {
					getAdditionalFacetAttributes(facet, classifier);
				}
			}
		}
		// call super
		return super.getAdditionalAttributes(classifier);
	}

	private void getAdditionalFacetAttributes(final Facet facet,
			final EClassifier classifier) {
		final EClassifier facetClassifier = FacetUtils.getExtendedMetaclass(facet);
		if (facetClassifier.equals(classifier) || facetClassifier.getInstanceClass() == EObject.class) {
			for (ETypedElement etypeElt : facet.getFacetElements()) {
				createAdditionalFacetAttribute(etypeElt, classifier);
			}
			for (Facet extfacet : facet.getExtendedFacets()) {
				getAdditionalFacetAttributes(extfacet, classifier);
			}
		}
	}

	/**
	 * Create new OCL Property from the Facet Element
	 * @param etypeElt
	 * @param classifier
	 */
	private void createAdditionalFacetAttribute(final ETypedElement etypeElt,
			final EClassifier classifier) {
		EStructuralFeature property = null;
		final String name = etypeElt.getName();
		if (etypeElt instanceof FacetReference) {
			property = EcoreFactory.eINSTANCE.createEReference();
			if (DEBUG_STATUS) {
				DebugUtils.debug("Create reference from Facet: " + name); //$NON-NLS-1$
			}
		} else if (etypeElt instanceof FacetAttribute) {
			property = EcoreFactory.eINSTANCE.createEAttribute();
			if (DEBUG_STATUS) {
				DebugUtils.debug("Create attribute from Facet: " + name); //$NON-NLS-1$
			}
		}
		if (property != null) {
			property.setName(name);
			property.setLowerBound(etypeElt.getLowerBound());
			property.setUpperBound(etypeElt.getUpperBound());
			property.setEType(etypeElt.getEType());
			property.getEAnnotations().add(createAnnotationEnvironment());
			addHelperProperty(classifier, property);
			if (DEBUG_STATUS) {
				DebugUtils.debug("Add additional ocl property: " + property); //$NON-NLS-1$
			}
		}
	}

	/**
	 *  Annotation will recognized in the evaluation environment
	 *  it declare the property is from EFacet OCL Environment 
	 *
	 */
	private static EAnnotation createAnnotationEnvironment() {
		final EAnnotation annotation = EcoreFactory.eINSTANCE
				.createEAnnotation();
		annotation.setSource(ANNOT_ENVIRONMENT);

		return annotation;
	}
}
