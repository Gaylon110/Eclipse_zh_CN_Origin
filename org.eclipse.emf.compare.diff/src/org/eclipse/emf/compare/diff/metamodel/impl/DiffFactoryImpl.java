/*******************************************************************************
 * Copyright (c) 2006, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.compare.diff.metamodel.impl;

import org.eclipse.emf.compare.diff.merge.IMerger;
import org.eclipse.emf.compare.diff.metamodel.*;
import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.AttributeChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.AttributeChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSetSnapshot;
import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.ConflictingDiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.DiffPackage;
import org.eclipse.emf.compare.diff.metamodel.DiffResourceSet;
import org.eclipse.emf.compare.diff.metamodel.DifferenceKind;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChange;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.MoveModelElement;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChange;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.metamodel.ResourceDependencyChange;
import org.eclipse.emf.compare.diff.metamodel.ResourceDependencyChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ResourceDependencyChangeRightTarget;
import org.eclipse.emf.compare.diff.metamodel.ResourceDiff;
import org.eclipse.emf.compare.diff.metamodel.UpdateAttribute;
import org.eclipse.emf.compare.diff.metamodel.UpdateContainmentFeature;
import org.eclipse.emf.compare.diff.metamodel.UpdateModelElement;
import org.eclipse.emf.compare.diff.metamodel.UpdateReference;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class DiffFactoryImpl extends EFactoryImpl implements DiffFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiffPackage getPackage() {
		return DiffPackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static DiffFactory init() {
		try {
			DiffFactory theDiffFactory = (DiffFactory)EPackage.Registry.INSTANCE
					.getEFactory("http://www.eclipse.org/emf/compare/diff/1.1"); //$NON-NLS-1$ 
			if (theDiffFactory != null) {
				return theDiffFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiffFactoryImpl();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unused")
	public String convertDifferenceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiffPackage.DIFFERENCE_KIND:
				return convertDifferenceKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException(
						"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiffPackage.DIFF_MODEL:
				return createDiffModel();
			case DiffPackage.DIFF_RESOURCE_SET:
				return createDiffResourceSet();
			case DiffPackage.CONFLICTING_DIFF_ELEMENT:
				return createConflictingDiffElement();
			case DiffPackage.DIFF_GROUP:
				return createDiffGroup();
			case DiffPackage.COMPARISON_RESOURCE_SNAPSHOT:
				return createComparisonResourceSnapshot();
			case DiffPackage.COMPARISON_RESOURCE_SET_SNAPSHOT:
				return createComparisonResourceSetSnapshot();
			case DiffPackage.MODEL_ELEMENT_CHANGE:
				return createModelElementChange();
			case DiffPackage.MODEL_ELEMENT_CHANGE_LEFT_TARGET:
				return createModelElementChangeLeftTarget();
			case DiffPackage.MODEL_ELEMENT_CHANGE_RIGHT_TARGET:
				return createModelElementChangeRightTarget();
			case DiffPackage.UPDATE_MODEL_ELEMENT:
				return createUpdateModelElement();
			case DiffPackage.MOVE_MODEL_ELEMENT:
				return createMoveModelElement();
			case DiffPackage.UPDATE_CONTAINMENT_FEATURE:
				return createUpdateContainmentFeature();
			case DiffPackage.ATTRIBUTE_CHANGE:
				return createAttributeChange();
			case DiffPackage.ATTRIBUTE_CHANGE_LEFT_TARGET:
				return createAttributeChangeLeftTarget();
			case DiffPackage.ATTRIBUTE_CHANGE_RIGHT_TARGET:
				return createAttributeChangeRightTarget();
			case DiffPackage.UPDATE_ATTRIBUTE:
				return createUpdateAttribute();
			case DiffPackage.REFERENCE_CHANGE:
				return createReferenceChange();
			case DiffPackage.REFERENCE_CHANGE_LEFT_TARGET:
				return createReferenceChangeLeftTarget();
			case DiffPackage.REFERENCE_CHANGE_RIGHT_TARGET:
				return createReferenceChangeRightTarget();
			case DiffPackage.UPDATE_REFERENCE:
				return createUpdateReference();
			case DiffPackage.REFERENCE_ORDER_CHANGE:
				return createReferenceOrderChange();
			case DiffPackage.RESOURCE_DIFF:
				return createResourceDiff();
			case DiffPackage.RESOURCE_DEPENDENCY_CHANGE:
				return createResourceDependencyChange();
			case DiffPackage.RESOURCE_DEPENDENCY_CHANGE_LEFT_TARGET:
				return createResourceDependencyChangeLeftTarget();
			case DiffPackage.RESOURCE_DEPENDENCY_CHANGE_RIGHT_TARGET:
				return createResourceDependencyChangeRightTarget();
			default:
				throw new IllegalArgumentException(
						"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeChange createAttributeChange() {
		AttributeChangeImpl attributeChange = new AttributeChangeImpl();
		return attributeChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeChangeLeftTarget createAttributeChangeLeftTarget() {
		AttributeChangeLeftTargetImpl attributeChangeLeftTarget = new AttributeChangeLeftTargetImpl();
		return attributeChangeLeftTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeChangeRightTarget createAttributeChangeRightTarget() {
		AttributeChangeRightTargetImpl attributeChangeRightTarget = new AttributeChangeRightTargetImpl();
		return attributeChangeRightTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConflictingDiffElement createConflictingDiffElement() {
		ConflictingDiffElementImpl conflictingDiffElement = new ConflictingDiffElementImpl();
		return conflictingDiffElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DifferenceKind createDifferenceKindFromString(EDataType eDataType, String initialValue) {
		DifferenceKind result = DifferenceKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffGroup createDiffGroup() {
		DiffGroupImpl diffGroup = new DiffGroupImpl();
		return diffGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonResourceSnapshot createComparisonResourceSnapshot() {
		ComparisonResourceSnapshotImpl comparisonResourceSnapshot = new ComparisonResourceSnapshotImpl();
		return comparisonResourceSnapshot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonResourceSetSnapshot createComparisonResourceSetSnapshot() {
		ComparisonResourceSetSnapshotImpl comparisonResourceSetSnapshot = new ComparisonResourceSetSnapshotImpl();
		return comparisonResourceSetSnapshot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModel createDiffModel() {
		DiffModelImpl diffModel = new DiffModelImpl();
		return diffModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffResourceSet createDiffResourceSet() {
		DiffResourceSetImpl diffResourceSet = new DiffResourceSetImpl();
		return diffResourceSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiffPackage.DIFFERENCE_KIND:
				return createDifferenceKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException(
						"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementChange createModelElementChange() {
		ModelElementChangeImpl modelElementChange = new ModelElementChangeImpl();
		return modelElementChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementChangeLeftTarget createModelElementChangeLeftTarget() {
		ModelElementChangeLeftTargetImpl modelElementChangeLeftTarget = new ModelElementChangeLeftTargetImpl();
		return modelElementChangeLeftTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementChangeRightTarget createModelElementChangeRightTarget() {
		ModelElementChangeRightTargetImpl modelElementChangeRightTarget = new ModelElementChangeRightTargetImpl();
		return modelElementChangeRightTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MoveModelElement createMoveModelElement() {
		MoveModelElementImpl moveModelElement = new MoveModelElementImpl();
		return moveModelElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateContainmentFeature createUpdateContainmentFeature() {
		UpdateContainmentFeatureImpl updateContainmentFeature = new UpdateContainmentFeatureImpl();
		return updateContainmentFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceChange createReferenceChange() {
		ReferenceChangeImpl referenceChange = new ReferenceChangeImpl();
		return referenceChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceChangeLeftTarget createReferenceChangeLeftTarget() {
		ReferenceChangeLeftTargetImpl referenceChangeLeftTarget = new ReferenceChangeLeftTargetImpl();
		return referenceChangeLeftTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceChangeRightTarget createReferenceChangeRightTarget() {
		ReferenceChangeRightTargetImpl referenceChangeRightTarget = new ReferenceChangeRightTargetImpl();
		return referenceChangeRightTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDiff createResourceDiff() {
		ResourceDiffImpl resourceDiff = new ResourceDiffImpl();
		return resourceDiff;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDependencyChange createResourceDependencyChange() {
		ResourceDependencyChangeImpl resourceDependencyChange = new ResourceDependencyChangeImpl();
		return resourceDependencyChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDependencyChangeLeftTarget createResourceDependencyChangeLeftTarget() {
		ResourceDependencyChangeLeftTargetImpl resourceDependencyChangeLeftTarget = new ResourceDependencyChangeLeftTargetImpl();
		return resourceDependencyChangeLeftTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDependencyChangeRightTarget createResourceDependencyChangeRightTarget() {
		ResourceDependencyChangeRightTargetImpl resourceDependencyChangeRightTarget = new ResourceDependencyChangeRightTargetImpl();
		return resourceDependencyChangeRightTarget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttribute createUpdateAttribute() {
		UpdateAttributeImpl updateAttribute = new UpdateAttributeImpl();
		return updateAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateModelElement createUpdateModelElement() {
		UpdateModelElementImpl updateModelElement = new UpdateModelElementImpl();
		return updateModelElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateReference createUpdateReference() {
		UpdateReferenceImpl updateReference = new UpdateReferenceImpl();
		return updateReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOrderChange createReferenceOrderChange() {
		ReferenceOrderChangeImpl referenceOrderChange = new ReferenceOrderChangeImpl();
		return referenceOrderChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DiffPackage getDiffPackage() {
		return (DiffPackage)getEPackage();
	}

} // DiffFactoryImpl
