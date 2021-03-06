/**
 *    Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 *    All rights reserved. This program and the accompanying materials
 *    are made available under the terms of the Eclipse Public License v1.0
 *    which accompanies this distribution, and is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *   
 *    Contributors:
 *        Thales Corporate Services S.A.S - initial API and implementation
 *
 * $Id$
 */

package org.eclipse.egf.portfolio.eclipse.build.buildstep.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.egf.portfolio.eclipse.build.buildcore.provider.StepItemProvider;

import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildStep;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildstepFactory;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildstepPackage;
import org.eclipse.egf.portfolio.eclipse.build.buildstep.CLEAN_TYPE;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

/**
 * This is the item provider adapter for a {@link org.eclipse.egf.portfolio.eclipse.build.buildstep.BuildStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildStepItemProvider
    extends StepItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "   Copyright (c) 2009-2010 Thales Corporate Services S.A.S.\r\n   All rights reserved. This program and the accompanying materials\r\n   are made available under the terms of the Eclipse Public License v1.0\r\n   which accompanies this distribution, and is available at\r\n   http://www.eclipse.org/legal/epl-v10.html\r\n  \r\n   Contributors:\r\n       Thales Corporate Services S.A.S - initial API and implementation";

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BuildStepItemProvider(AdapterFactory adapterFactory) {
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

            addAllPlatformsPropertyDescriptor(object);
            addNoBuildersInvocationPropertyDescriptor(object);
            addSkipComponentsRegexPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the All Platforms feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAllPlatformsPropertyDescriptor(Object object) {

        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BuildStep_allPlatforms_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BuildStep_allPlatforms_feature", "_UI_BuildStep_type"),
                 BuildstepPackage.Literals.BUILD_STEP__ALL_PLATFORMS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));

    }

    /**
     * This adds a property descriptor for the No Builders Invocation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNoBuildersInvocationPropertyDescriptor(Object object) {

        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BuildStep_noBuildersInvocation_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BuildStep_noBuildersInvocation_feature", "_UI_BuildStep_type"),
                 BuildstepPackage.Literals.BUILD_STEP__NO_BUILDERS_INVOCATION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));

    }

    /**
     * This adds a property descriptor for the Skip Components Regex feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSkipComponentsRegexPropertyDescriptor(Object object) {

        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_BuildStep_skipComponentsRegex_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_BuildStep_skipComponentsRegex_feature", "_UI_BuildStep_type"),
                 BuildstepPackage.Literals.BUILD_STEP__SKIP_COMPONENTS_REGEX,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));

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
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS);
            childrenFeatures.add(BuildstepPackage.Literals.BUILD_STEP__COMPONENTS);
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
     * This returns BuildStep.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/BuildStep"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {

        String label = ((BuildStep)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_BuildStep_type") :
            getString("_UI_BuildStep_type") + " " + label;

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

        switch (notification.getFeatureID(BuildStep.class)) {
            case BuildstepPackage.BUILD_STEP__ALL_PLATFORMS:
            case BuildstepPackage.BUILD_STEP__NO_BUILDERS_INVOCATION:
            case BuildstepPackage.BUILD_STEP__SKIP_COMPONENTS_REGEX:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case BuildstepPackage.BUILD_STEP__BUILD_LOCATIONS:
            case BuildstepPackage.BUILD_STEP__COMPONENTS:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);


        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createBuildLocationContainer()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createLocalBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createTargetPlatformBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createUpdateSiteBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createResultStepBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createInstallStepBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.ABSTRACT_BUILD_LOCATION_CONTAINER__BUILD_LOCATIONS,
                 BuildstepFactory.eINSTANCE.createRunningPlatformBuildLocation()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.BUILD_STEP__COMPONENTS,
                 BuildstepFactory.eINSTANCE.createPlugin()));




        newChildDescriptors.add
            (createChildParameter
                (BuildstepPackage.Literals.BUILD_STEP__COMPONENTS,
                 BuildstepFactory.eINSTANCE.createFeature()));


    }


}
