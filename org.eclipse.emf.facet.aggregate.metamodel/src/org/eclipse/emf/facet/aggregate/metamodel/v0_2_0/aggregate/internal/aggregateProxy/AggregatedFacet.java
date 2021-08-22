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

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet#getFacet <em>Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacet()
 * @model
 * @generated
 */
public interface AggregatedFacet extends Facet {
	/**
	 * Returns the value of the '<em><b>Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet</em>' reference.
	 * @see #setFacet(Facet)
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacet_Facet()
	 * @model
	 * @generated
	 */
	Facet getFacet();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet#getFacet <em>Facet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet</em>' reference.
	 * @see #getFacet()
	 * @generated
	 */
	void setFacet(Facet value);

} // AggregatedFacet
