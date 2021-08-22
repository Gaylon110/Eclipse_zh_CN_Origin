/*******************************************************************************
 * Copyright (c) 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.diff.metamodel.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DiffPackage;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comparison Snapshot</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.impl.ComparisonResourceSnapshotImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.impl.ComparisonResourceSnapshotImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.metamodel.impl.ComparisonResourceSnapshotImpl#getMatch <em>Match</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonResourceSnapshotImpl extends EObjectImpl implements ComparisonResourceSnapshot {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiff() <em>Diff</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected DiffModel diff;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected MatchModel match;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonResourceSnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.COMPARISON_RESOURCE_SNAPSHOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModel getDiff() {
		return diff;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiff(DiffModel newDiff, NotificationChain msgs) {
		DiffModel oldDiff = diff;
		diff = newDiff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF, oldDiff, newDiff);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiff(DiffModel newDiff) {
		if (newDiff != diff) {
			NotificationChain msgs = null;
			if (diff != null)
				msgs = ((InternalEObject)diff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF, null, msgs);
			if (newDiff != null)
				msgs = ((InternalEObject)newDiff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF, null, msgs);
			msgs = basicSetDiff(newDiff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF, newDiff, newDiff));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MatchModel getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(MatchModel newMatch, NotificationChain msgs) {
		MatchModel oldMatch = match;
		match = newMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH, oldMatch, newMatch);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(MatchModel newMatch) {
		if (newMatch != match) {
			NotificationChain msgs = null;
			if (match != null)
				msgs = ((InternalEObject)match).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH, null, msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH, null, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF:
				return basicSetDiff(null, msgs);
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH:
				return basicSetMatch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DATE:
				return getDate();
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF:
				return getDiff();
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH:
				return getMatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DATE:
				setDate((Date)newValue);
				return;
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF:
				setDiff((DiffModel)newValue);
				return;
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH:
				setMatch((MatchModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF:
				setDiff((DiffModel)null);
				return;
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH:
				setMatch((MatchModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__DIFF:
				return diff != null;
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT__MATCH:
				return match != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (date: "); //$NON-NLS-1$
		result.append(date);
		result.append(')');
		return result.toString();
	}

} // ComparisonResourceSnapshotImpl
