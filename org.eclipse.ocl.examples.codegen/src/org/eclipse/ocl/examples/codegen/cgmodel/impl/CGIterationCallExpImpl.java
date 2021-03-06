/*******************************************************************************
 * Copyright (c) 2013, 2017 CEA LIST and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink(CEA LIST) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.codegen.cgmodel.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.codegen.cgmodel.CGElement;
import org.eclipse.ocl.examples.codegen.cgmodel.CGIterationCallExp;
import org.eclipse.ocl.examples.codegen.cgmodel.CGIterator;
import org.eclipse.ocl.examples.codegen.cgmodel.CGModelPackage;
import org.eclipse.ocl.examples.codegen.cgmodel.CGValuedElement;
import org.eclipse.ocl.examples.codegen.cse.AbstractPlace;
import org.eclipse.ocl.examples.codegen.cse.InnerStackPlace;
import org.eclipse.ocl.examples.codegen.utilities.EquivalenceUtil;
import org.eclipse.ocl.pivot.Iteration;
import org.eclipse.ocl.pivot.utilities.ClassUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CG Iteration Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.examples.codegen.cgmodel.impl.CGIterationCallExpImpl#getReferredIteration <em>Referred Iteration</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.codegen.cgmodel.impl.CGIterationCallExpImpl#getIterators <em>Iterators</em>}</li>
 *   <li>{@link org.eclipse.ocl.examples.codegen.cgmodel.impl.CGIterationCallExpImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CGIterationCallExpImpl extends CGCallExpImpl implements CGIterationCallExp {
	/**
	 * The default value of the '{@link #getReferredIteration() <em>Referred Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredIteration()
	 * @generated
	 * @ordered
	 */
	protected static final Iteration REFERRED_ITERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferredIteration() <em>Referred Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredIteration()
	 * @generated
	 * @ordered
	 */
	protected Iteration referredIteration = REFERRED_ITERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIterators() <em>Iterators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterators()
	 * @generated
	 * @ordered
	 */
	protected EList<CGIterator> iterators;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected CGValuedElement body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CGIterationCallExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CGModelPackage.Literals.CG_ITERATION_CALL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iteration getReferredIteration() {
		return referredIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredIteration(Iteration newReferredIteration) {
		Iteration oldReferredIteration = referredIteration;
		referredIteration = newReferredIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CGModelPackage.CG_ITERATION_CALL_EXP__REFERRED_ITERATION, oldReferredIteration, referredIteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("null")
	public @NonNull List<CGIterator> getIterators() {
		if (iterators == null) {
			iterators = new EObjectContainmentEList<CGIterator>(CGIterator.class, this, CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS);
		}
		return iterators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CGValuedElement getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(CGValuedElement newBody, NotificationChain msgs) {
		CGValuedElement oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CGModelPackage.CG_ITERATION_CALL_EXP__BODY, oldBody, newBody);
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
	public void setBody(CGValuedElement newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CGModelPackage.CG_ITERATION_CALL_EXP__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CGModelPackage.CG_ITERATION_CALL_EXP__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CGModelPackage.CG_ITERATION_CALL_EXP__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS:
				return ((InternalEList<?>)getIterators()).basicRemove(otherEnd, msgs);
			case CGModelPackage.CG_ITERATION_CALL_EXP__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CGModelPackage.CG_ITERATION_CALL_EXP__REFERRED_ITERATION:
				return getReferredIteration();
			case CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS:
				return getIterators();
			case CGModelPackage.CG_ITERATION_CALL_EXP__BODY:
				return getBody();
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
			case CGModelPackage.CG_ITERATION_CALL_EXP__REFERRED_ITERATION:
				setReferredIteration((Iteration)newValue);
				return;
			case CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS:
				getIterators().clear();
				getIterators().addAll((Collection<? extends CGIterator>)newValue);
				return;
			case CGModelPackage.CG_ITERATION_CALL_EXP__BODY:
				setBody((CGValuedElement)newValue);
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
			case CGModelPackage.CG_ITERATION_CALL_EXP__REFERRED_ITERATION:
				setReferredIteration(REFERRED_ITERATION_EDEFAULT);
				return;
			case CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS:
				getIterators().clear();
				return;
			case CGModelPackage.CG_ITERATION_CALL_EXP__BODY:
				setBody((CGValuedElement)null);
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
			case CGModelPackage.CG_ITERATION_CALL_EXP__REFERRED_ITERATION:
				return REFERRED_ITERATION_EDEFAULT == null ? referredIteration != null : !REFERRED_ITERATION_EDEFAULT.equals(referredIteration);
			case CGModelPackage.CG_ITERATION_CALL_EXP__ITERATORS:
				return iterators != null && !iterators.isEmpty();
			case CGModelPackage.CG_ITERATION_CALL_EXP__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public @Nullable AbstractPlace getPlace(@NonNull Map<@Nullable CGElement, @NonNull AbstractPlace> element2place) {
		return InnerStackPlace.createInnerStackPlace(element2place, this);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public @Nullable Boolean isEquivalentToInternal(@NonNull CGValuedElement thatValue) {
		return (getClass() == thatValue.getClass()) ? EquivalenceUtil.isEquivalent(this, (CGIterationCallExp)thatValue) : null;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public boolean isNonInvalid() {
		if (referredIteration == null) {
			return false;
		}
		if (referredIteration.isIsValidating()) {
			if (referredIteration.isIsInvalidating()) {
				// e.g AND, forAll - nonInvalid if all inputs nonInvalid
			}
			else {
				return true;				// e.g oclIsInvalid
			}
		}
		else {
			if (referredIteration.isIsInvalidating()) {
				return false;				// e.g divide-by-zero
			}
			else {
				// normal use case - nonInvalid if all inputs nonInvalid
			}
		}
		if (!source.isNonNull() || !source.isNonInvalid()) {
			return false;
		}
			for (@NonNull CGValuedElement iterator : ClassUtil.nullFree(getIterators())) {
			if (!iterator.isNonNull() || !iterator.isNonInvalid()) {
				return false;
			}
		}
		if ((body == null) || !body.isNonNull() || !body.isNonInvalid()) {
			return false;
		}
		return true;
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public boolean isNonNull() {
		return (referredIteration != null) && referredIteration.isIsRequired();
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	public boolean isNull() {
		return false;
	}

} //CGIterationCallExpImpl
