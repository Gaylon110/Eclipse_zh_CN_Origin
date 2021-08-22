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
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetOperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl#getFacetElement <em>Facet Element</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl#getFacetOperation <em>Facet Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedOperationImpl extends FacetOperationImpl implements AggregatedOperation {
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
	 * The cached value of the '{@link #getFacetOperation() <em>Facet Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetOperation()
	 * @generated
	 * @ordered
	 */
	protected FacetOperation facetOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT, oldFacetElement, facetElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT, oldFacetElement, facetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetOperation getFacetOperation() {
		if (facetOperation != null && facetOperation.eIsProxy()) {
			InternalEObject oldFacetOperation = (InternalEObject)facetOperation;
			facetOperation = (FacetOperation)eResolveProxy(oldFacetOperation);
			if (facetOperation != oldFacetOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION, oldFacetOperation, facetOperation));
			}
		}
		return facetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetOperation basicGetFacetOperation() {
		return facetOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetOperation(FacetOperation newFacetOperation) {
		FacetOperation oldFacetOperation = facetOperation;
		facetOperation = newFacetOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION, oldFacetOperation, facetOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT:
				if (resolve) return getFacetElement();
				return basicGetFacetElement();
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION:
				if (resolve) return getFacetOperation();
				return basicGetFacetOperation();
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
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT:
				setFacetElement((FacetElement)newValue);
				return;
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION:
				setFacetOperation((FacetOperation)newValue);
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
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT:
				setFacetElement((FacetElement)null);
				return;
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION:
				setFacetOperation((FacetOperation)null);
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
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT:
				return facetElement != null;
			case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_OPERATION:
				return facetOperation != null;
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
		if (baseClass == AggregatedFacetElement.class) {
			switch (derivedFeatureID) {
				case AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT: return AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT;
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
		if (baseClass == AggregatedFacetElement.class) {
			switch (baseFeatureID) {
				case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT: return AggregateProxyPackage.AGGREGATED_OPERATION__FACET_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AggregatedOperationImpl
