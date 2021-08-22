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
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl#getFacet <em>Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedFacetImpl extends FacetImpl implements AggregatedFacet {
	/**
	 * The cached value of the '{@link #getFacet() <em>Facet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacet()
	 * @generated
	 * @ordered
	 */
	protected Facet facet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_FACET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet getFacet() {
		if (facet != null && facet.eIsProxy()) {
			InternalEObject oldFacet = (InternalEObject)facet;
			facet = (Facet)eResolveProxy(oldFacet);
			if (facet != oldFacet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_FACET__FACET, oldFacet, facet));
			}
		}
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facet basicGetFacet() {
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacet(Facet newFacet) {
		Facet oldFacet = facet;
		facet = newFacet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_FACET__FACET, oldFacet, facet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_FACET__FACET:
				if (resolve) return getFacet();
				return basicGetFacet();
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
			case AggregateProxyPackage.AGGREGATED_FACET__FACET:
				setFacet((Facet)newValue);
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
			case AggregateProxyPackage.AGGREGATED_FACET__FACET:
				setFacet((Facet)null);
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
			case AggregateProxyPackage.AGGREGATED_FACET__FACET:
				return facet != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregatedFacetImpl
