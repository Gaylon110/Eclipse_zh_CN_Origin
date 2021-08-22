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
 * 	Grégoire Dupé (Mia-Software) - Bug 463905 - Support of parsing OCL expressions with Facet references
 * 	Jonathan Pepin (Soft-Maint) - Bug 509359 - OCL Environment not detect facet nested in facetset and extended facet
 * 	Jonathan Pepin (Soft-Maint) - Bug 509747 - During Facet OCL Evalutation an IllegalArgumentException override the normal behaviour
 */
package org.eclipse.emf.facet.util.efacet.ocl.core.internal;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.EvaluationHaltedException;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;

public class EFacetOCLEvaluationEnvironment extends EcoreEvaluationEnvironment {

	public EFacetOCLEvaluationEnvironment() {
		super();
	}

	public EFacetOCLEvaluationEnvironment(
			final EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
		super(parent);
	}

	@Override
	public Object navigateProperty(final EStructuralFeature property,
			final List<?> qualifiers, final Object target) {
		Object result = null;
		if (property.getEAnnotation(EFacetOCLEnvironment.ANNOT_ENVIRONMENT) == null) {
			result = super.navigateProperty(property, qualifiers, target);
		} else {
			if (target instanceof EObject) {
				final EObject eObject = (EObject) target;
				final String referenceName = property.getName();
				result = navigateFacetProperty(eObject, referenceName);
			}
		}
		return result;
	}

	private static Object navigateFacetProperty(final EObject eObject,
			final String referenceName) {
		Object result = null;
		final Resource eResource = eObject.eResource();
		final ResourceSet resourceSet = eResource.getResourceSet();
		final IFacetManager facetManager = IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(resourceSet);
		ETypedElement query = null;
		final List<FacetSet> managedFacetSets = facetManager.getManagedFacetSets();
		final Iterator<FacetSet> facetSetsItr = managedFacetSets.iterator();
		// navigate on all managed facetSets
		while (query == null && facetSetsItr.hasNext()) {
			final FacetSet facetSet = facetSetsItr.next();
			final List<Facet> allFacet = FacetUtils.getAllFacet(facetSet);
			// navigate on all facets
			query = navigateNestedFacetsProperty(facetManager, allFacet, eObject, referenceName);
		}
		try {
			result = facetManager.getOrInvoke(eObject, query, Object.class);
		} catch (FacetManagerException e) {
			throw new EvaluationHaltedException("FacetManager is not loaded:", e); //$NON-NLS-1$
		}
		return result;
	}

	/**
	 * recursive method on all nested extended facets
	 */
	private static ETypedElement navigateNestedFacetsProperty(
			final IFacetManager facetManager, final List<Facet> facets,
			final EObject eObject,
			final String referenceName) {
		ETypedElement query = null;
		final Iterator<Facet> facetsItr = facets.iterator();
		while (query == null && facetsItr.hasNext()) {
			final Facet facet = facetsItr.next();
			query = getTypedElement(facetManager, facet, eObject,
					referenceName);
			if (query == null) {
				final List<Facet> extFacets = facet
						.getExtendedFacets();
				// navigate on all extended facets
				query = navigateNestedFacetsProperty(facetManager, extFacets,
						eObject, referenceName);
			}
		}
		return query;
	}

	private static ETypedElement getTypedElement(final IFacetManager facetManager,
			final Facet facet, final EObject eObject, final String referenceName) {
		ETypedElement query = null;
		try {
			if (facetManager.isConforming(eObject, facet)) {
				for (ETypedElement etypeElt : facet.getFacetElements()) {
					if (etypeElt.getName().equals(referenceName)) {
						query = etypeElt;
						break;
					}
				}
			}
		} catch (FacetManagerException e) {
			Logger.logError(e.getMessage(), Activator.getDefault());
		}
		return query;
	}

}
