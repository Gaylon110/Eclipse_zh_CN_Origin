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
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregateProxyFactoryImpl extends EFactoryImpl implements AggregateProxyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregateProxyFactory init() {
		try {
			AggregateProxyFactory theAggregateProxyFactory = (AggregateProxyFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/facet/aggregate/0.2.incubation/aggregate/internal/aggregateProxy"); 
			if (theAggregateProxyFactory != null) {
				return theAggregateProxyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AggregateProxyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateProxyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AggregateProxyPackage.AGGREGATED_FACET_SET: return createAggregatedFacetSet();
			case AggregateProxyPackage.AGGREGATED_FACET: return createAggregatedFacet();
			case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT: return createAggregatedFacetElement();
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE: return createAggregatedEStructuralFeature();
			case AggregateProxyPackage.AGGREGATED_OPERATION: return createAggregatedOperation();
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION: return createAggregatedCustomization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacetSet createAggregatedFacetSet() {
		AggregatedFacetSetImpl aggregatedFacetSet = new AggregatedFacetSetImpl();
		return aggregatedFacetSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacet createAggregatedFacet() {
		AggregatedFacetImpl aggregatedFacet = new AggregatedFacetImpl();
		return aggregatedFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacetElement createAggregatedFacetElement() {
		AggregatedFacetElementImpl aggregatedFacetElement = new AggregatedFacetElementImpl();
		return aggregatedFacetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedEStructuralFeature createAggregatedEStructuralFeature() {
		AggregatedEStructuralFeatureImpl aggregatedEStructuralFeature = new AggregatedEStructuralFeatureImpl();
		return aggregatedEStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedOperation createAggregatedOperation() {
		AggregatedOperationImpl aggregatedOperation = new AggregatedOperationImpl();
		return aggregatedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedCustomization createAggregatedCustomization() {
		AggregatedCustomizationImpl aggregatedCustomization = new AggregatedCustomizationImpl();
		return aggregatedCustomization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateProxyPackage getAggregateProxyPackage() {
		return (AggregateProxyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AggregateProxyPackage getPackage() {
		return AggregateProxyPackage.eINSTANCE;
	}

} //AggregateProxyFactoryImpl
