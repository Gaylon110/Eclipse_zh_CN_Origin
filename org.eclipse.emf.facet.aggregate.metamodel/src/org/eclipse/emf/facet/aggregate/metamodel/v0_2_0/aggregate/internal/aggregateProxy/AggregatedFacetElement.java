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
 *     Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DocumentedElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Facet Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement#getFacetElement <em>Facet Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacetElement()
 * @model
 * @generated
 */
public interface AggregatedFacetElement extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Facet Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Element</em>' reference.
	 * @see #setFacetElement(FacetElement)
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#getAggregatedFacetElement_FacetElement()
	 * @model
	 * @generated
	 */
	FacetElement getFacetElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement#getFacetElement <em>Facet Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facet Element</em>' reference.
	 * @see #getFacetElement()
	 * @generated
	 */
	void setFacetElement(FacetElement value);

} // AggregatedFacetElement
