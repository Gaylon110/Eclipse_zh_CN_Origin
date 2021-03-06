/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EAVMultiContainmentEReferenceValueHolder.java,v 1.6 2009/09/12 13:49:39 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.util.StoreUtil;

/**
 * Stores a multi containment EReference value.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EAVMultiContainmentEReferenceValueHolder extends EAVMultiValueHolder {

	private List<EAVSingleContainmentEReferenceValueHolder> referenceValues;
	private Object ecoreObjectList = null;

	@SuppressWarnings("unchecked")
	public void set(Object value) {
		// set to null first, if there is at least one value then it is set to a value
		setMandatoryValue(null);
		final List<?> values = (List<Object>) value;
		referenceValues = new ArrayList<EAVSingleContainmentEReferenceValueHolder>();
		for (Object o : values) {
			referenceValues.add((EAVSingleContainmentEReferenceValueHolder) getElement(o));
			setMandatoryValue(NOT_NULL_VALUE);
		}
	}

	public Object getElement(Object value) {
		EAVSingleContainmentEReferenceValueHolder valueHolder = new EAVSingleContainmentEReferenceValueHolder();
		valueHolder.setEStructuralFeature(getEStructuralFeature());
		valueHolder.set(value);
		valueHolder.setOwner(getOwner());
		return valueHolder;
	}

	@SuppressWarnings("unchecked")
	public Object get(InternalEObject owner) {
		if (ecoreObjectList != null) {
			return ecoreObjectList;
		}
		if (StoreUtil.isMap(getEStructuralFeature())) {
			final EClass entryEClass = (EClass) getEStructuralFeature().getEType();
			Class<?> entryClass = entryEClass.getInstanceClass();
			if (entryClass == null) {
				entryClass = Map.Entry.class;
			}

			final int featureID = owner.eClass().getFeatureID(getEStructuralFeature());
			ecoreObjectList = new EAVDelegatingEMap<Object, Object>(entryEClass, entryClass, owner, featureID);
			((EAVDelegatingEMap) ecoreObjectList).setPersistentList(referenceValues);
		} else {
			// final DelegatingLateLoadingList<Object> lateLoadingList = new DelegatingLateLoadingList<Object>();
			// lateLoadingList.setPersistentList((List<?>) referenceValues);
			final EAVDelegatingEcoreEList<Object> ecoreList = new EAVDelegatingEcoreEList<Object>(
					(InternalEObject) owner);
			ecoreList.setEStructuralFeature(getEStructuralFeature());
			ecoreList.setPersistentList(referenceValues);
			ecoreObjectList = ecoreList;
		}
		return ecoreObjectList;
	}

	public Object getValue() {
		return getReferenceValues();
	}

	public List<EAVSingleContainmentEReferenceValueHolder> getReferenceValues() {
		return referenceValues;
	}

	public void setReferenceValues(List<EAVSingleContainmentEReferenceValueHolder> referenceValues) {
		this.referenceValues = referenceValues;
	}
}