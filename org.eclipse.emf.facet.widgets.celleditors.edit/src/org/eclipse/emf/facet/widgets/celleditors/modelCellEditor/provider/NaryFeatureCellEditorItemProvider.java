/**
 * Copyright (c) 2010 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 */
package org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.ModelCellEditorPackage;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.NaryFeatureCellEditor;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.NaryFeatureCellEditor}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class NaryFeatureCellEditorItemProvider extends AbstractModelCellEditorItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NaryFeatureCellEditorItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNaryFeatureCellEditorImplPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nary Feature Cell Editor Impl
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNaryFeatureCellEditorImplPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_NaryFeatureCellEditor_naryFeatureCellEditorImpl_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_NaryFeatureCellEditor_naryFeatureCellEditorImpl_feature",
								"_UI_NaryFeatureCellEditor_type"),
						ModelCellEditorPackage.Literals.NARY_FEATURE_CELL_EDITOR__NARY_FEATURE_CELL_EDITOR_IMPL,
						true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NaryFeatureCellEditor.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/NaryFeatureCellEditor"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		String label = ((NaryFeatureCellEditor) object).getCellId();
		return label == null || label.length() == 0 ? getString("_UI_NaryFeatureCellEditor_type")
				: getString("_UI_NaryFeatureCellEditor_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NaryFeatureCellEditor.class)) {
		case ModelCellEditorPackage.NARY_FEATURE_CELL_EDITOR__NARY_FEATURE_CELL_EDITOR_IMPL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(),
					false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors,
			final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
