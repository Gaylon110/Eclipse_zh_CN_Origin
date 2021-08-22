/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Facet Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet#getFacetSet <em>Facet Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacetSet()
 * @model
 * @generated
 */
public interface AggregatedFacetSet extends FacetSet {
	/**
	 * Returns the value of the '<em><b>Facet Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Set</em>' reference.
	 * @see #setFacetSet(FacetSet)
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacetSet_FacetSet()
	 * @model
	 * @generated
	 */
	FacetSet getFacetSet();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet#getFacetSet <em>Facet Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet Set</em>' reference.
	 * @see #getFacetSet()
	 * @generated
	 */
	void setFacetSet(FacetSet value);

} // AggregatedFacetSet
