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

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedEStructuralFeature()
 * @model
 * @generated
 */
public interface AggregatedEStructuralFeature extends EStructuralFeature, AggregatedFacetElement {
	/**
	 * Returns the value of the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature</em>' reference.
	 * @see #setEStructuralFeature(EStructuralFeature)
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedEStructuralFeature_EStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

} // AggregatedEStructuralFeature
