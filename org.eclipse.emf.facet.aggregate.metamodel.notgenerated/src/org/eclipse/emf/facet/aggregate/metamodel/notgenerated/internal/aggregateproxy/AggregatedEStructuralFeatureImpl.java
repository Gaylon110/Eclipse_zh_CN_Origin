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
 *    Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DocumentedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;

public class AggregatedEStructuralFeatureImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl {

	private final Facet container;

	public AggregatedEStructuralFeatureImpl(final Facet container,
			final EStructuralFeature structuralFeature) {
		super();
		if (structuralFeature == null) {
			throw new IllegalArgumentException(
					"The parameter 'structuralFeature' must not be null."); //$NON-NLS-1$
		}
		this.container = container;
		setEStructuralFeature(structuralFeature);
	}

	@Override
	public String getName() {
		return getEStructuralFeature().getName();
	}

	@Override
	public boolean equals(final Object obj) {
		return super.equals(obj) || getEStructuralFeature().equals(obj)
				|| obj.equals(getEStructuralFeature());
	}

	@Override
	public int hashCode() {
		return getEStructuralFeature().hashCode();
	}

	@Override
	public EObject eContainer() {
		return this.container;
	}

	@Override
	public EClassifier getEType() {
		return getEStructuralFeature().getEType();
	}

	@Override
	public EObject eResolveProxy(final InternalEObject proxy) {
		return getEStructuralFeature();
	}

	@Override
	public Resource eResource() {
		return getEStructuralFeature().eResource();
	}

	public Facet getContainer() {
		return this.container;
	}

	@Override
	public String getDocumentation() {
		String result = ""; //$NON-NLS-1$
		if (getEStructuralFeature() instanceof DocumentedElement) {
			final DocumentedElement documentedElt = (DocumentedElement) getEStructuralFeature();
			result = documentedElt.getDocumentation();
		}
		return result;
	}

} //AggregatedEStructuralFeatureImpl
