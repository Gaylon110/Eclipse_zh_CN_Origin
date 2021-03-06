/*******************************************************************************
 * Copyright (c) 2009, 2011 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.expressions.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.ExpressionsPackage;
import org.eclipse.ocl.expressions.MessageExp;

import org.eclipse.ocl.types.TypesFactory;

import org.eclipse.ocl.utilities.UtilitiesPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.ocl.expressions.MessageExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MessageExpItemProvider
		extends OCLExpressionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExpItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPropertyStartPositionPropertyDescriptor(object);
			addPropertyEndPositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Property Start Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyStartPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_CallingASTNode_propertyStartPosition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_CallingASTNode_propertyStartPosition_feature", "_UI_CallingASTNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UtilitiesPackage.Literals.CALLING_AST_NODE__PROPERTY_START_POSITION,
				true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property End Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyEndPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_CallingASTNode_propertyEndPosition_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_CallingASTNode_propertyEndPosition_feature", "_UI_CallingASTNode_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UtilitiesPackage.Literals.CALLING_AST_NODE__PROPERTY_END_POSITION,
				true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
				.add(ExpressionsPackage.Literals.MESSAGE_EXP__TARGET);
			childrenFeatures
				.add(ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT);
			childrenFeatures
				.add(ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION);
			childrenFeatures
				.add(ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MessageExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
			getResourceLocator().getImage("full/obj16/MessageExp")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		MessageExp<?, ?, ?> messageExp = (MessageExp<?, ?, ?>) object;
		return getString("_UI_MessageExp_type") + " " + messageExp.getStartPosition(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MessageExp.class)) {
			case ExpressionsPackage.MESSAGE_EXP__PROPERTY_START_POSITION :
			case ExpressionsPackage.MESSAGE_EXP__PROPERTY_END_POSITION :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case ExpressionsPackage.MESSAGE_EXP__TARGET :
			case ExpressionsPackage.MESSAGE_EXP__ARGUMENT :
			case ExpressionsPackage.MESSAGE_EXP__CALLED_OPERATION :
			case ExpressionsPackage.MESSAGE_EXP__SENT_SIGNAL :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createAssociationClassCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createMessageExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createStateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createUnspecifiedValueExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__TARGET,
			ExpressionsFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createAssociationClassCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createMessageExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createStateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createUnspecifiedValueExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT,
			ExpressionsFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createAssociationClassCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createCollectionItem()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createCollectionRange()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createMessageExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createStateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createTupleLiteralPart()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createUnspecifiedValueExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			ExpressionsFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createCollectionType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createInvalidType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createOrderedSetType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createSetType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createTemplateParameterType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createTupleType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createTypeType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION,
			TypesFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createAssociationClassCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createCollectionItem()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createCollectionRange()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createUnlimitedNaturalLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createMessageExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createStateExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createTupleLiteralPart()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createUnspecifiedValueExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			ExpressionsFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createCollectionType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createElementType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createInvalidType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createMessageType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createOrderedSetType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createSetType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createTemplateParameterType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createTupleType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createTypeType()));

		newChildDescriptors.add(createChildParameter(
			ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL,
			TypesFactory.eINSTANCE.createVoidType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ExpressionsPackage.Literals.MESSAGE_EXP__TARGET
			|| childFeature == ExpressionsPackage.Literals.MESSAGE_EXP__ARGUMENT
			|| childFeature == ExpressionsPackage.Literals.MESSAGE_EXP__CALLED_OPERATION
			|| childFeature == ExpressionsPackage.Literals.MESSAGE_EXP__SENT_SIGNAL;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
