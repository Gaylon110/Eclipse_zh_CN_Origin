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
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Facet Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl#getFacetSet <em>Facet Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedFacetSetImpl extends FacetSetImpl implements AggregatedFacetSet {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacetSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_FACET_SET;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET, oldFacetSet, facetSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET, oldFacetSet, facetSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET:
				if (resolve) return getFacetSet();
				return basicGetFacetSet();
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
			case AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET:
				setFacetSet((FacetSet)newValue);
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
			case AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET:
				setFacetSet((FacetSet)null);
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
			case AggregateProxyPackage.AGGREGATED_FACET_SET__FACET_SET:
				return facetSet != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregatedFacetSetImpl
