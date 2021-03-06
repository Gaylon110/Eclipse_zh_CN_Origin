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
 * $Id: EAVValueHolder.java,v 1.5 2009/09/14 21:40:13 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.eav;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * The base class of the value stored in an EAV schema. The value in an EAV schema is both the type (the
 * EStructuralFeature) and its value. The following different types of values can be identified:
 * <ul>
 * <li>EAttribute: a single primitive value</li>
 * <li>EReference: a single reference to another object, containment or non-containment</li>
 * <li>MultiEAttribute: a multi-occurrence EAttribute</li>
 * <li>MultiEReference: a multi-occurrence EReference</li>
 * </ul>
 * In addition there is the FeatureMap and Map support which needs to be handled. In EMF both are lists with
 * EAttributes.
 * 
 * The above structure is reflected in the EAVValueHolder class hierarchy.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */

// NOTES:
// the container reference is stored in the eobject itself!

public abstract class EAVValueHolder {

	protected static Integer NOT_NULL_VALUE = new Integer(1);

	public static EAVValueHolder create(EObject owner, EStructuralFeature eFeature) {
		final EAVValueHolder valueHolder;
		if (eFeature instanceof EReference) {
			final EReference eReference = (EReference) eFeature;
			if (eReference.isMany()) {
				if (eReference.isContainment()) {
					valueHolder = new EAVMultiContainmentEReferenceValueHolder();
				} else {
					valueHolder = new EAVMultiNonContainmentEReferenceValueHolder();
				}
			} else {
				if (eReference.isContainment()) {
					valueHolder = new EAVSingleContainmentEReferenceValueHolder();
				} else {
					valueHolder = new EAVSingleNonContainmentEReferenceValueHolder();
				}
			}
		} else {
			if (FeatureMapUtil.isFeatureMap(eFeature)) {
				valueHolder = new EAVFeatureMapValueHolder();
			} else if (eFeature.isMany()) {
				valueHolder = new EAVMultiEAttributeValueHolder();
			} else {
				valueHolder = new EAVSingleEAttributeValueHolder();
			}
		}
		valueHolder.setEStructuralFeature(eFeature);
		valueHolder.setOwner(owner);
		return valueHolder;
	}

	private long id;
	private int version;
	private EStructuralFeature eStructuralFeature;
	private boolean valueIsSet;
	private EObject owner;

	// the mandatoryValue is used as follows.
	// it is defined as mandatory in the hibernate mapping
	// if !eStructuralFeature.isRequired then it is always set to the NOT_NULL_VALUE
	// if eStructuralFeature.isRequired then it is set if the value of the EStructuralFeature
	// is set.
	// in this way the mandatory value check is executed by hibernate on the basis
	// of eStructuralFeature.isRequired
	private Integer mandatoryValue = null;

	public abstract void set(Object value);

	public abstract Object get(InternalEObject owner);

	public abstract void setValueInOwner(InternalEObject owner);

	public abstract Object getValue();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}

	// extra getter and setter because hibernate gets confused with the other
	// getter/setter and the uppercase 2 characters
	public EStructuralFeature getFeature() {
		return eStructuralFeature;
	}

	public void setFeature(EStructuralFeature eStructuralFeature) {
		// setEStructuralFeature is overridden by subclasses
		setEStructuralFeature(eStructuralFeature);
	}

	public boolean isValueIsSet() {
		return valueIsSet;
	}

	public void setValueIsSet(boolean valueIsSet) {
		this.valueIsSet = valueIsSet;
	}

	public Integer getMandatoryValue() {
		// if not required then the not-value is set always
		if (!getEStructuralFeature().isRequired() || getEStructuralFeature().isUnsettable()) {
			return NOT_NULL_VALUE;
		}
		return mandatoryValue;
	}

	public void setMandatoryValue(Integer mandatoryValue) {
		this.mandatoryValue = mandatoryValue;
	}

	public EObject getOwner() {
		return owner;
	}

	public void setOwner(EObject owner) {
		this.owner = owner;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof EAVValueHolder)) {
			return false;
		}
		final EAVValueHolder eavHolder = (EAVValueHolder) obj;
		if (eavHolder.getEStructuralFeature() != getEStructuralFeature()) {
			return false;
		}
		// handles null
		if (getValue() == eavHolder.getValue()) {
			return true;
		}
		if (getValue() == null) {
			return false;
		}
		if (eavHolder.getValue() == null) {
			return false;
		}
		return getValue().equals(eavHolder.getValue());
	}

	@Override
	public int hashCode() {
		if (getValue() == null) {
			return getEStructuralFeature().hashCode();
		}
		return getEStructuralFeature().hashCode() ^ getValue().hashCode();
	}
}