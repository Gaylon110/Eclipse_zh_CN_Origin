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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DocumentedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl#getFacetElement <em>Facet Element</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregatedEStructuralFeatureImpl extends EStructuralFeatureImpl implements AggregatedEStructuralFeature {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	 * The cached value of the '{@link #getEStructuralFeature() <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEStructuralFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature eStructuralFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregatedEStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregateProxyPackage.Literals.AGGREGATED_ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION, oldDocumentation, documentation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT, oldFacetElement, facetElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT, oldFacetElement, facetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		if (eStructuralFeature != null && eStructuralFeature.eIsProxy()) {
			InternalEObject oldEStructuralFeature = (InternalEObject)eStructuralFeature;
			eStructuralFeature = (EStructuralFeature)eResolveProxy(oldEStructuralFeature);
			if (eStructuralFeature != oldEStructuralFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE, oldEStructuralFeature, eStructuralFeature));
			}
		}
		return eStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetEStructuralFeature() {
		return eStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		EStructuralFeature oldEStructuralFeature = eStructuralFeature;
		eStructuralFeature = newEStructuralFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE, oldEStructuralFeature, eStructuralFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION:
				return getDocumentation();
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT:
				if (resolve) return getFacetElement();
				return basicGetFacetElement();
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				if (resolve) return getEStructuralFeature();
				return basicGetEStructuralFeature();
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
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT:
				setFacetElement((FacetElement)newValue);
				return;
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				setEStructuralFeature((EStructuralFeature)newValue);
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
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT:
				setFacetElement((FacetElement)null);
				return;
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				setEStructuralFeature((EStructuralFeature)null);
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
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT:
				return facetElement != null;
			case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE:
				return eStructuralFeature != null;
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
		if (baseClass == DocumentedElement.class) {
			switch (derivedFeatureID) {
				case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION: return EFacetPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == AggregatedFacetElement.class) {
			switch (derivedFeatureID) {
				case AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT: return AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT;
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
		if (baseClass == DocumentedElement.class) {
			switch (baseFeatureID) {
				case EFacetPackage.DOCUMENTED_ELEMENT__DOCUMENTATION: return AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION;
				default: return -1;
			}
		}
		if (baseClass == AggregatedFacetElement.class) {
			switch (baseFeatureID) {
				case AggregateProxyPackage.AGGREGATED_FACET_ELEMENT__FACET_ELEMENT: return AggregateProxyPackage.AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //AggregatedEStructuralFeatureImpl
