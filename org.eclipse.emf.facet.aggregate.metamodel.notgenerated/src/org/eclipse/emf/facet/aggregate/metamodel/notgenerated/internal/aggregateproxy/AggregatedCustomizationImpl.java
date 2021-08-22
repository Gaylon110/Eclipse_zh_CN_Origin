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
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;


public class AggregatedCustomizationImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy.AggregatedFacetSetImpl
		implements AggregatedCustomization {

	public AggregatedCustomizationImpl(final EObject container) {
		super(container);
	}

	public boolean isMustBeLoadedByDefault() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setMustBeLoadedByDefault(final boolean value) {
		// TODO Auto-generated method stub

	}

	public Customization getCustomization() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCustomization(final Customization value) {
		// TODO Auto-generated method stub

	}

}
