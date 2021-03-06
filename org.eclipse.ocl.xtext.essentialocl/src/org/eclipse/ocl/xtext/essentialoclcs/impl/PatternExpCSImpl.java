/*******************************************************************************
 * Copyright (c) 2014, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.essentialoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.PatternExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.util.EssentialOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.xtext.essentialoclcs.impl.PatternExpCSImpl#getOwnedPatternType <em>Owned Pattern Type</em>}</li>
 *   <li>{@link org.eclipse.ocl.xtext.essentialoclcs.impl.PatternExpCSImpl#getPatternVariableName <em>Pattern Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternExpCSImpl extends ExpCSImpl implements PatternExpCS
{
	/**
	 * The cached value of the '{@link #getOwnedPatternType() <em>Owned Pattern Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPatternType()
	 * @generated
	 * @ordered
	 */
	protected TypeRefCS ownedPatternType;

	/**
	 * The default value of the '{@link #getPatternVariableName() <em>Pattern Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternVariableName() <em>Pattern Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternVariableName()
	 * @generated
	 * @ordered
	 */
	protected String patternVariableName = PATTERN_VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternExpCSImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return EssentialOCLCSPackage.Literals.PATTERN_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatternVariableName()
	{
		return patternVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternVariableName(String newPatternVariableName)
	{
		String oldPatternVariableName = patternVariableName;
		patternVariableName = newPatternVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialOCLCSPackage.PATTERN_EXP_CS__PATTERN_VARIABLE_NAME, oldPatternVariableName, patternVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeRefCS getOwnedPatternType()
	{
		return ownedPatternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPatternType(TypeRefCS newOwnedPatternType, NotificationChain msgs)
	{
		TypeRefCS oldOwnedPatternType = ownedPatternType;
		ownedPatternType = newOwnedPatternType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE, oldOwnedPatternType, newOwnedPatternType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedPatternType(TypeRefCS newOwnedPatternType)
	{
		if (newOwnedPatternType != ownedPatternType)
		{
			NotificationChain msgs = null;
			if (ownedPatternType != null)
				msgs = ((InternalEObject)ownedPatternType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE, null, msgs);
			if (newOwnedPatternType != null)
				msgs = ((InternalEObject)newOwnedPatternType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE, null, msgs);
			msgs = basicSetOwnedPatternType(newOwnedPatternType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE, newOwnedPatternType, newOwnedPatternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE:
				return basicSetOwnedPatternType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE:
				return getOwnedPatternType();
			case EssentialOCLCSPackage.PATTERN_EXP_CS__PATTERN_VARIABLE_NAME:
				return getPatternVariableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE:
				setOwnedPatternType((TypeRefCS)newValue);
				return;
			case EssentialOCLCSPackage.PATTERN_EXP_CS__PATTERN_VARIABLE_NAME:
				setPatternVariableName((String)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE:
				setOwnedPatternType((TypeRefCS)null);
				return;
			case EssentialOCLCSPackage.PATTERN_EXP_CS__PATTERN_VARIABLE_NAME:
				setPatternVariableName(PATTERN_VARIABLE_NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case EssentialOCLCSPackage.PATTERN_EXP_CS__OWNED_PATTERN_TYPE:
				return ownedPatternType != null;
			case EssentialOCLCSPackage.PATTERN_EXP_CS__PATTERN_VARIABLE_NAME:
				return PATTERN_VARIABLE_NAME_EDEFAULT == null ? patternVariableName != null : !PATTERN_VARIABLE_NAME_EDEFAULT.equals(patternVariableName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(@NonNull BaseCSVisitor<R> visitor) {
		return (R) ((EssentialOCLCSVisitor<?>)visitor).visitPatternExpCS(this);
	}

} //PatternExpCSImpl
