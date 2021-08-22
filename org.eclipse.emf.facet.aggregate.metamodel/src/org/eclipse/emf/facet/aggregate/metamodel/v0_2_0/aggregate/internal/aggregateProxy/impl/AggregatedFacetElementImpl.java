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
 *    Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.impl.DocumentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Facet Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetElementImpl#getFacetElement <em>Facet Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedFacetElementImpl extends DocumentedElementImpl implements AggregatedFacetElement {
	/**
	 * The cached value of the '{@link #getFacetElement() <em>Facet Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetElement()
	 * @generated
	 * @ordered
	 */
	protected FacetElement facetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedFacetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_FACET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetElement getFacetElement() {
		if (facetElement != null && facetElement.eIsProxy()) {
			InternalEObject oldFacetElement = (InternalEObject)facetElement;
			facetElement = (FacetElement)eResolveProxy(oldFacetElement);
			if (facetElement != oldFacetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT, oldFacetElement, facetElement));
			}
		}
		return facetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetElement basicGetFacetElement() {
		return facetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetElement(FacetElement newFacetElement) {
		FacetElement oldFacetElement = facetElement;
		facetElement = newFacetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT, oldFacetElement, facetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT:
				if (resolve) return getFacetElement();
				return basicGetFacetElement();
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
			case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT:
				setFacetElement((FacetElement)newValue);
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
			case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT:
				setFacetElement((FacetElement)null);
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
			case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT:
				return facetElement != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregatedFacetElementImpl
