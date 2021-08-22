/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 *    Nicolas Bros (Mia-Software) - Bug 377788 - [Table] ClassCastException when opening a table from the same model browser twice
 *    Vincent Lorenzo (CEA-LIST) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

public class AggregatedFacetImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl {

	private final EObject container;
	
	public AggregatedFacetImpl(final EObject container) {
		super();
		this.container = container;
	}

	@Override
	public String getName() {
		return getFacet().getName();
	}

	@Override
	public EList<EStructuralFeature> getFacetElements() {
		final EList<EStructuralFeature> result = new BasicEList<EStructuralFeature>();
		for (EStructuralFeature eStructuralFeature : this.getFacet()
				.getFacetElements()) {
			// NOPMD: the goal of this loop is to create instance of
			// AggregatedEStructuralFeatureImpl.
			final AggregatedEStructuralFeatureImpl proxy = new AggregatedEStructuralFeatureImpl(// NOPMD by gdupe on 29/03/12 16:24
					this, eStructuralFeature);
			result.add(proxy);
		}
		return result;
	}

	@Override
	public EList<FacetOperation> getFacetOperations() {
		final EList<FacetOperation> result = new BasicEList<FacetOperation>();
		for (FacetOperation facetOperation : this.getFacet()
				.getFacetOperations()) {
			// NOPMD: the goal of this loop is to create instance of
			// AggregatedOperationImpl.
			final AggregatedOperationImpl aggregatedFacetElement = new AggregatedOperationImpl(// NOPMD by gdupe on 29/03/12 16:24
					this, facetOperation);
			result.add(aggregatedFacetElement);
		}
		return result;
	}

	@Override
	public EList<EObject> eContents() {
		final List<EObject> list = new ArrayList<EObject>();
		for (EStructuralFeature structuralFeature : getFacetElements()) {
			list.add(structuralFeature);
		}
		for (FacetOperation operation : getFacetOperations()) {
			list.add(operation);
		}
		final Object[] array = list.toArray();
		// note: we must return a subclass of InternalEList because EMF casts to it
		return new EcoreEList.UnmodifiableEList<EObject>(this,
				EFacetPackage.eINSTANCE.getFacet_FacetElements(), array.length, array);
	}

	@Override
	public EList<Facet> getExtendedFacets() {
		return getFacet().getExtendedFacets();
	}

	@Override
	public EClass getExtendedMetaclass() {
		return getFacet().getExtendedMetaclass();
	}

	@Override
	public EObject eContainer() {
		return this.container;
	}

	@Override
	public EObject eResolveProxy(final InternalEObject proxy) {
		return getFacet();
	}

	@Override
	public Resource eResource() {
		return getFacet().eResource();
	}
	
	@Override
	public String getDocumentation() {
		return getFacet().getDocumentation();
	}

} //AggregatedFacetImpl
