/**
 * Copyright (c) 2010 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table - initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 339918 - To be able to have facet columns and to be able to have a local customization
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework 
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl#getInstantiationOperation <em>Instantiation Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationMethodImpl extends EObjectImpl implements InstantiationMethod {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstantiationOperation() <em>Instantiation Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiationOperation()
	 * @generated
	 * @ordered
	 */
	protected EOperation instantiationOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableconfigurationPackage.Literals.INSTANTIATION_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableconfigurationPackage.INSTANTIATION_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableconfigurationPackage.INSTANTIATION_METHOD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstantiationOperation() {
		if (instantiationOperation != null && instantiationOperation.eIsProxy()) {
			InternalEObject oldInstantiationOperation = (InternalEObject)instantiationOperation;
			instantiationOperation = (EOperation)eResolveProxy(oldInstantiationOperation);
			if (instantiationOperation != oldInstantiationOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION, oldInstantiationOperation, instantiationOperation));
			}
		}
		return instantiationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetInstantiationOperation() {
		return instantiationOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiationOperation(EOperation newInstantiationOperation) {
		EOperation oldInstantiationOperation = instantiationOperation;
		instantiationOperation = newInstantiationOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION, oldInstantiationOperation, instantiationOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableconfigurationPackage.INSTANTIATION_METHOD__NAME:
				return getName();
			case TableconfigurationPackage.INSTANTIATION_METHOD__DESCRIPTION:
				return getDescription();
			case TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION:
				if (resolve) return getInstantiationOperation();
				return basicGetInstantiationOperation();
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
			case TableconfigurationPackage.INSTANTIATION_METHOD__NAME:
				setName((String)newValue);
				return;
			case TableconfigurationPackage.INSTANTIATION_METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION:
				setInstantiationOperation((EOperation)newValue);
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
			case TableconfigurationPackage.INSTANTIATION_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TableconfigurationPackage.INSTANTIATION_METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION:
				setInstantiationOperation((EOperation)null);
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
			case TableconfigurationPackage.INSTANTIATION_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TableconfigurationPackage.INSTANTIATION_METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TableconfigurationPackage.INSTANTIATION_METHOD__INSTANTIATION_OPERATION:
				return instantiationOperation != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InstantiationMethodImpl
