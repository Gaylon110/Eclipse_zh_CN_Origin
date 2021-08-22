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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet;

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.impl.CustomizationImpl;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Customization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl#getFacetSet <em>Facet Set</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl#getCustomization <em>Customization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedCustomizationImpl extends CustomizationImpl implements AggregatedCustomization {
	/**
	 * The cached value of the '{@link #getFacetSet() <em>Facet Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetSet()
	 * @generated
	 * @ordered
	 */
	protected FacetSet facetSet;

	/**
	 * The cached value of the '{@link #getCustomization() <em>Customization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomization()
	 * @generated
	 * @ordered
	 */
	protected Customization customization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedCustomizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_CUSTOMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSet getFacetSet() {
		if (facetSet != null && facetSet.eIsProxy()) {
			InternalEObject oldFacetSet = (InternalEObject)facetSet;
			facetSet = (FacetSet)eResolveProxy(oldFacetSet);
			if (facetSet != oldFacetSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET, oldFacetSet, facetSet));
			}
		}
		return facetSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetSet basicGetFacetSet() {
		return facetSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetSet(FacetSet newFacetSet) {
		FacetSet oldFacetSet = facetSet;
		facetSet = newFacetSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET, oldFacetSet, facetSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customization getCustomization() {
		if (customization != null && customization.eIsProxy()) {
			InternalEObject oldCustomization = (InternalEObject)customization;
			customization = (Customization)eResolveProxy(oldCustomization);
			if (customization != oldCustomization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION, oldCustomization, customization));
			}
		}
		return customization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customization basicGetCustomization() {
		return customization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomization(Customization newCustomization) {
		Customization oldCustomization = customization;
		customization = newCustomization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION, oldCustomization, customization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET:
				if (resolve) return getFacetSet();
				return basicGetFacetSet();
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION:
				if (resolve) return getCustomization();
				return basicGetCustomization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET:
				setFacetSet((FacetSet)newValue);
				return;
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION:
				setCustomization((Customization)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET:
				setFacetSet((FacetSet)null);
				return;
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION:
				setCustomization((Customization)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET:
				return facetSet != null;
			case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__CUSTOMIZATION:
				return customization != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AggregatedFacetSet.class) {
			switch (derivedFeatureID) {
				case AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET: return AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AggregatedFacetSet.class) {
			switch (baseFeatureID) {
				case AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET: return AggregateProxyPackage.AGGREGATED_CUSTOMIZATION__FACET_SET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AggregatedCustomizationImpl
