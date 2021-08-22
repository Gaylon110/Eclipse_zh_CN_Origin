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
 *    Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.Aggregate;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomPackage;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.impl.FacetSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregateImpl#isMustBeLoadedByDefault <em>Must Be Loaded By Default</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregateImpl#getAggregatedFacetSets <em>Aggregated Facet Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateImpl extends FacetSetImpl implements Aggregate {
	/**
	 * The default value of the '{@link #isMustBeLoadedByDefault() <em>Must Be Loaded By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustBeLoadedByDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_BE_LOADED_BY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustBeLoadedByDefault() <em>Must Be Loaded By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustBeLoadedByDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean mustBeLoadedByDefault = MUST_BE_LOADED_BY_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAggregatedFacetSets() <em>Aggregated Facet Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedFacetSets()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> aggregatedFacetSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregatePackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustBeLoadedByDefault() {
		return mustBeLoadedByDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustBeLoadedByDefault(boolean newMustBeLoadedByDefault) {
		boolean oldMustBeLoadedByDefault = mustBeLoadedByDefault;
		mustBeLoadedByDefault = newMustBeLoadedByDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT, oldMustBeLoadedByDefault, mustBeLoadedByDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetSet> getAggregatedFacetSets() {
		if (aggregatedFacetSets == null) {
			aggregatedFacetSets = new EObjectResolvingEList<FacetSet>(FacetSet.class, this, AggregatePackage.AGGREGATE__AGGREGATED_FACET_SETS);
		}
		return aggregatedFacetSets;
	}

	/**
	 * The cached invocation delegate for the '{@link #getFacetSets() <em>Get Facet Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetSets()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_FACET_SETS__EINVOCATION_DELEGATE = ((EOperation.Internal)AggregatePackage.Literals.AGGREGATE.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<FacetSet> getFacetSets() {
		try {
			return (EList<FacetSet>)GET_FACET_SETS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT:
				return isMustBeLoadedByDefault();
			case AggregatePackage.AGGREGATE__AGGREGATED_FACET_SETS:
				return getAggregatedFacetSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT:
				setMustBeLoadedByDefault((Boolean)newValue);
				return;
			case AggregatePackage.AGGREGATE__AGGREGATED_FACET_SETS:
				getAggregatedFacetSets().clear();
				getAggregatedFacetSets().addAll((Collection<? extends FacetSet>)newValue);
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
			case AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT:
				setMustBeLoadedByDefault(MUST_BE_LOADED_BY_DEFAULT_EDEFAULT);
				return;
			case AggregatePackage.AGGREGATE__AGGREGATED_FACET_SETS:
				getAggregatedFacetSets().clear();
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
			case AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT:
				return mustBeLoadedByDefault != MUST_BE_LOADED_BY_DEFAULT_EDEFAULT;
			case AggregatePackage.AGGREGATE__AGGREGATED_FACET_SETS:
				return aggregatedFacetSets != null && !aggregatedFacetSets.isEmpty();
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
		if (baseClass == Customization.class) {
			switch (derivedFeatureID) {
				case AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT: return CustomPackage.CUSTOMIZATION__MUST_BE_LOADED_BY_DEFAULT;
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
		if (baseClass == Customization.class) {
			switch (baseFeatureID) {
				case CustomPackage.CUSTOMIZATION__MUST_BE_LOADED_BY_DEFAULT: return AggregatePackage.AGGREGATE__MUST_BE_LOADED_BY_DEFAULT;
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
		result.append(" (mustBeLoadedByDefault: ");
		result.append(mustBeLoadedByDefault);
		result.append(')');
		return result.toString();
	}

} //AggregateImpl
