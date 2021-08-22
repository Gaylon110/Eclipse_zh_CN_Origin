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
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.Aggregate#getAggregatedFacetSets <em>Aggregated Facet Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage#getAggregate()
 * @model
 * @generated
 */
//@SuppressWarnings("all") : generated code
@SuppressWarnings("all")
public interface Aggregate extends FacetSet, Customization {
	/**
	 * Returns the value of the '<em><b>Aggregated Facet Sets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Facet Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Facet Sets</em>' reference list.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage#getAggregate_AggregatedFacetSets()
	 * @model
	 * @generated
	 */
	EList<FacetSet> getAggregatedFacetSets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.aggregatedFacetSets'"
	 * @generated
	 */
	EList<FacetSet> getFacetSets();

} // Aggregate
