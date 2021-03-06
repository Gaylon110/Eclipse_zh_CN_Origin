/*******************************************************************************
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Comment;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ElementExtension;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.TemplateParameter;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.TemplateSignature;
import org.eclipse.ocl.pivot.TemplateableElement;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateSignatureImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.eclipse.ocl.pivot.internal.TemplateSignatureImpl#getOwningElement <em>Owning Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateSignatureImpl
		extends ElementImpl
		implements TemplateSignature {

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameters;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PivotPackage.Literals.TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("null")
	public @NonNull List<TemplateParameter> getOwnedParameters()
	{
		if (ownedParameters == null)
		{
			ownedParameters = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS, PivotPackage.TEMPLATE_PARAMETER__OWNING_SIGNATURE);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateableElement getOwningElement() {
		if (eContainerFeatureID() != PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT) return null;
		return (TemplateableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningElement(TemplateableElement newOwningElement, NotificationChain msgs)
	{
		msgs = eBasicSetContainer((InternalEObject)newOwningElement, PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningElement(TemplateableElement newOwningElement)
	{
		if (newOwningElement != eInternalContainer() || (eContainerFeatureID() != PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT && newOwningElement != null))
		{
			if (EcoreUtil.isAncestor(this, newOwningElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningElement != null)
				msgs = ((InternalEObject)newOwningElement).eInverseAdd(this, PivotPackage.TEMPLATEABLE_ELEMENT__OWNED_SIGNATURE, TemplateableElement.class, msgs);
			msgs = basicSetOwningElement(newOwningElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT, newOwningElement, newOwningElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatingComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComments()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedExtensions()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameters()).basicAdd(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningElement((TemplateableElement)otherEnd, msgs);
		}
		return eDynamicInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				return ((InternalEList<?>)getAnnotatingComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_ANNOTATIONS:
				return ((InternalEList<?>)getOwnedAnnotations()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				return ((InternalEList<?>)getOwnedExtensions()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				return basicSetOwningElement(null, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID())
		{
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				return eInternalContainer().eInverseRemove(this, PivotPackage.TEMPLATEABLE_ELEMENT__OWNED_SIGNATURE, TemplateableElement.class, msgs);
		}
		return eDynamicBasicRemoveFromContainer(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				return getAnnotatingComments();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_ANNOTATIONS:
				return getOwnedAnnotations();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				return getOwnedComments();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				return getOwnedExtensions();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				return getOwnedParameters();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				return getOwningElement();
		}
		return eDynamicGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				getAnnotatingComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				getOwnedAnnotations().addAll((Collection<? extends Element>)newValue);
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				getOwnedExtensions().addAll((Collection<? extends ElementExtension>)newValue);
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				setOwningElement((TemplateableElement)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				getAnnotatingComments().clear();
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_ANNOTATIONS:
				getOwnedAnnotations().clear();
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				getOwnedComments().clear();
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				getOwnedExtensions().clear();
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				setOwningElement((TemplateableElement)null);
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
			case PivotPackage.TEMPLATE_SIGNATURE__ANNOTATING_COMMENTS:
				return annotatingComments != null && !annotatingComments.isEmpty();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_ANNOTATIONS:
				return ownedAnnotations != null && !ownedAnnotations.isEmpty();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_EXTENSIONS:
				return ownedExtensions != null && !ownedExtensions.isEmpty();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case PivotPackage.TEMPLATE_SIGNATURE__OWNING_ELEMENT:
				return getOwningElement() != null;
		}
		return eDynamicIsSet(featureID);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitTemplateSignature(this);
	}

	public static @NonNull TemplateParameters getTypeParameters(@Nullable TemplateSignature templateSignature) {
		if (templateSignature == null) {
			return TemplateParameters.EMPTY_LIST;
		}
		List<@NonNull TemplateParameter> templateParameters = ClassUtil.nullFree(templateSignature.getOwnedParameters());
		int iMax = templateParameters.size();
		@NonNull TemplateParameter[] typeParameters = new @NonNull TemplateParameter[iMax];
		for (int i = 0; i < iMax; i++) {
			typeParameters[i] = templateParameters.get(i);
		}
		return TypeUtil.createTemplateParameters(typeParameters);
	}
} //TemplateSignatureImpl
