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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage
 * @generated
 */
public interface AggregateProxyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AggregateProxyFactory eINSTANCE = org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aggregated Facet Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Facet Set</em>'.
	 * @generated
	 */
	AggregatedFacetSet createAggregatedFacetSet();

	/**
	 * Returns a new object of class '<em>Aggregated Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Facet</em>'.
	 * @generated
	 */
	AggregatedFacet createAggregatedFacet();

	/**
	 * Returns a new object of class '<em>Aggregated Facet Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Facet Element</em>'.
	 * @generated
	 */
	AggregatedFacetElement createAggregatedFacetElement();

	/**
	 * Returns a new object of class '<em>Aggregated EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated EStructural Feature</em>'.
	 * @generated
	 */
	AggregatedEStructuralFeature createAggregatedEStructuralFeature();

	/**
	 * Returns a new object of class '<em>Aggregated Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Operation</em>'.
	 * @generated
	 */
	AggregatedOperation createAggregatedOperation();

	/**
	 * Returns a new object of class '<em>Aggregated Customization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregated Customization</em>'.
	 * @generated
	 */
	AggregatedCustomization createAggregatedCustomization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AggregateProxyPackage getAggregateProxyPackage();

} //AggregateProxyFactory
