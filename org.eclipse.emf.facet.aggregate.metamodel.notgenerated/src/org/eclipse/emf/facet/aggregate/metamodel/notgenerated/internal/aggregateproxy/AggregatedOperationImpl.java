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
 *    Vincent Lorenzo (CEA-LIST) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

public class AggregatedOperationImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl {

	private final Facet container;
	
	public AggregatedOperationImpl(final Facet container,
			final FacetOperation facetOperation) {
		super();
		if (facetOperation == null) {
			throw new IllegalArgumentException(
					"The parameter 'facetOperation' must not be null."); //$NON-NLS-1$
		}
		this.container = container;
		setFacetOperation(facetOperation);
	}
	
	@Override
	public String getName() {
		return getFacetOperation().getName();
	}

	@Override
	public boolean equals(final Object obj) {
		return super.equals(obj) || getFacetOperation().equals(obj)
				|| obj.equals(getFacetOperation());
	}

	@Override
	public int hashCode() {
		return getFacetOperation().hashCode();
	}

	@Override
	public EObject eContainer() {
		return this.container;
	}

	@Override
	public EClassifier getEType() {
		return getFacetOperation().getEType();
	}

	@Override
	public Resource eResource() {
		return getFacetOperation().eResource();
	}

	public Facet getContainer() {
		return this.container;
	}
	
	@Override
	public String getDocumentation() {
		return getFacetOperation().getDocumentation();
	}

} //AggregatedEStructuralFeatureImpl
