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

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Customization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization#getCustomization <em>Customization</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedCustomization()
 * @model
 * @generated
 */
public interface AggregatedCustomization extends Customization, AggregatedFacetSet {
	/**
	 * Returns the value of the '<em><b>Customization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customization</em>' reference.
	 * @see #setCustomization(Customization)
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedCustomization_Customization()
	 * @model
	 * @generated
	 */
	Customization getCustomization();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization#getCustomization <em>Customization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customization</em>' reference.
	 * @see #getCustomization()
	 * @generated
	 */
	void setCustomization(Customization value);

} // AggregatedCustomization
