/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy.AggregatedCustomizationImpl;
import org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy.AggregatedFacetSetImpl;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

public final class Utils {

	private Utils() {
		// Must not be used
	}

	public static AggregatedFacetSet createFacetSetProxy(
			final FacetSet facetSet,
			final EObject container) {
		AggregatedFacetSet facetSetProxy;
		if (facetSet instanceof Customization) {
			// Customization customization = (Customization) facetSet;
			facetSetProxy = new AggregatedCustomizationImpl(container);
		} else {
			facetSetProxy = new AggregatedFacetSetImpl(container);
		}
		facetSetProxy.setFacetSet(facetSet);
		return facetSetProxy;
	}

}
