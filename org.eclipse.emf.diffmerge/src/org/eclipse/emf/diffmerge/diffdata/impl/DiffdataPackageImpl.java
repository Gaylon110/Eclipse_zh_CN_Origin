/*********************************************************************
 * Copyright (c) 2010-2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.eclipse.emf.diffmerge.diffdata.impl;

import java.util.Map;

import org.eclipse.emf.diffmerge.api.IComparison;
import org.eclipse.emf.diffmerge.api.IComparison.Editable;
import org.eclipse.emf.diffmerge.api.IDiffPolicy;
import org.eclipse.emf.diffmerge.api.IMapping;
import org.eclipse.emf.diffmerge.api.IMatch;
import org.eclipse.emf.diffmerge.api.IMatchPolicy;
import org.eclipse.emf.diffmerge.api.IMergePolicy;
import org.eclipse.emf.diffmerge.api.Role;
import org.eclipse.emf.diffmerge.api.diff.IAttributeValuePresence;
import org.eclipse.emf.diffmerge.api.diff.IElementPresence;
import org.eclipse.emf.diffmerge.api.diff.IElementRelativePresence;
import org.eclipse.emf.diffmerge.api.diff.IMergeableDifference;
import org.eclipse.emf.diffmerge.api.diff.IReferenceValuePresence;
import org.eclipse.emf.diffmerge.api.diff.IValuePresence;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.diffdata.DiffdataFactory;
import org.eclipse.emf.diffmerge.diffdata.DiffdataPackage;
import org.eclipse.emf.diffmerge.diffdata.EAttributeValuePresence;
import org.eclipse.emf.diffmerge.diffdata.EComparison;
import org.eclipse.emf.diffmerge.diffdata.EElementPresence;
import org.eclipse.emf.diffmerge.diffdata.EElementRelativePresence;
import org.eclipse.emf.diffmerge.diffdata.EIdentified;
import org.eclipse.emf.diffmerge.diffdata.EMapping;
import org.eclipse.emf.diffmerge.diffdata.EMatch;
import org.eclipse.emf.diffmerge.diffdata.EMergeableDifference;
import org.eclipse.emf.diffmerge.diffdata.EReferenceValuePresence;
import org.eclipse.emf.diffmerge.diffdata.EValuePresence;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffdataPackageImpl extends EPackageImpl
    implements DiffdataPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eIdentifiedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eMergeableDifferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eElementRelativePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eElementPresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeToValueToDifferenceEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueToDifferenceEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceToElementToDifferenceEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementToDifferenceEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iEditableComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iEditableMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iEditableMatchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iMergeableDifferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iEditableMergeableDifferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iElementRelativePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iElementPresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iAttributeValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iReferenceValuePresenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iEditableModelScopeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iMatchPolicyEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iDiffPolicyEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iMergePolicyEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType roleEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.diffmerge.diffdata.DiffdataPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DiffdataPackageImpl() {
    super(eNS_URI, DiffdataFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DiffdataPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DiffdataPackage init() {
    if (isInited)
      return (DiffdataPackage) EPackage.Registry.INSTANCE
          .getEPackage(DiffdataPackage.eNS_URI);

    // Obtain or create and register package
    DiffdataPackageImpl theDiffdataPackage = (DiffdataPackageImpl) (EPackage.Registry.INSTANCE
        .get(eNS_URI) instanceof DiffdataPackageImpl
            ? EPackage.Registry.INSTANCE.get(eNS_URI)
            : new DiffdataPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDiffdataPackage.createPackageContents();

    // Initialize created meta-data
    theDiffdataPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDiffdataPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DiffdataPackage.eNS_URI, theDiffdataPackage);
    return theDiffdataPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEIdentified() {
    return eIdentifiedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEIdentified_Id() {
    return (EAttribute) eIdentifiedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEComparison() {
    return eComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_AncestorScope() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_ReferenceScope() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_TargetScope() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_LastMatchPolicy() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_LastDiffPolicy() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEComparison_LastMergePolicy() {
    return (EAttribute) eComparisonEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEComparison_Mapping() {
    return (EReference) eComparisonEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMapping() {
    return eMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMapping_ModifiableContents() {
    return (EReference) eMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMapping_ReferenceCompletedMatches() {
    return (EReference) eMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMapping_TargetCompletedMatches() {
    return (EReference) eMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMatch() {
    return eMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMatch_MatchID() {
    return (EAttribute) eMatchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_Ancestor() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_Reference() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_Target() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_ModifiableRelatedDifferences() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_ModifiableAttributeMap() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_ModifiableReferenceMap() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_ElementPresenceDifference() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_ReferenceOwnershipDifference() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMatch_TargetOwnershipDifference() {
    return (EReference) eMatchEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEMergeableDifference() {
    return eMergeableDifferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMergeableDifference_Comparison() {
    return (EReference) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMergeableDifference_AlignedWithAncestor() {
    return (EAttribute) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMergeableDifference_Conflicting() {
    return (EAttribute) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMergeableDifference_Ignored() {
    return (EAttribute) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMergeableDifference_MergeDestination() {
    return (EAttribute) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEMergeableDifference_PossibleMergeDestinations() {
    return (EAttribute) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMergeableDifference_ExplicitDependenciesForTarget() {
    return (EReference) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMergeableDifference_ExplicitDependenciesForReference() {
    return (EReference) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMergeableDifference_ImplicitDependenciesForTarget() {
    return (EReference) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEMergeableDifference_ImplicitDependenciesForReference() {
    return (EReference) eMergeableDifferenceEClass.getEStructuralFeatures()
        .get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEElementRelativePresence() {
    return eElementRelativePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEElementRelativePresence_ElementMatch() {
    return (EReference) eElementRelativePresenceEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEElementRelativePresence_PresenceRole() {
    return (EAttribute) eElementRelativePresenceEClass.getEStructuralFeatures()
        .get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEElementPresence() {
    return eElementPresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEElementPresence_OwnerMatch() {
    return (EReference) eElementPresenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEValuePresence() {
    return eValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEValuePresence_Feature() {
    return (EReference) eValuePresenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEValuePresence_Order() {
    return (EAttribute) eValuePresenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEAttributeValuePresence() {
    return eAttributeValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEAttributeValuePresence_Value() {
    return (EAttribute) eAttributeValuePresenceEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEReferenceValuePresence() {
    return eReferenceValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceValuePresence_Value() {
    return (EReference) eReferenceValuePresenceEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceValuePresence_ValueMatch() {
    return (EReference) eReferenceValuePresenceEClass.getEStructuralFeatures()
        .get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeToValueToDifferenceEntry() {
    return attributeToValueToDifferenceEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeToValueToDifferenceEntry_Key() {
    return (EReference) attributeToValueToDifferenceEntryEClass
        .getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeToValueToDifferenceEntry_Value() {
    return (EReference) attributeToValueToDifferenceEntryEClass
        .getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueToDifferenceEntry() {
    return valueToDifferenceEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueToDifferenceEntry_Key() {
    return (EAttribute) valueToDifferenceEntryEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueToDifferenceEntry_Value() {
    return (EReference) valueToDifferenceEntryEClass.getEStructuralFeatures()
        .get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceToElementToDifferenceEntry() {
    return referenceToElementToDifferenceEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceToElementToDifferenceEntry_Key() {
    return (EReference) referenceToElementToDifferenceEntryEClass
        .getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceToElementToDifferenceEntry_Value() {
    return (EReference) referenceToElementToDifferenceEntryEClass
        .getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementToDifferenceEntry() {
    return elementToDifferenceEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementToDifferenceEntry_Key() {
    return (EReference) elementToDifferenceEntryEClass.getEStructuralFeatures()
        .get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementToDifferenceEntry_Value() {
    return (EReference) elementToDifferenceEntryEClass.getEStructuralFeatures()
        .get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIComparison() {
    return iComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIEditableComparison() {
    return iEditableComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMapping() {
    return iMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIEditableMapping() {
    return iEditableMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMatch() {
    return iMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIEditableMatch() {
    return iEditableMatchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIMergeableDifference() {
    return iMergeableDifferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIEditableMergeableDifference() {
    return iEditableMergeableDifferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIElementRelativePresence() {
    return iElementRelativePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIElementPresence() {
    return iElementPresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIValuePresence() {
    return iValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIAttributeValuePresence() {
    return iAttributeValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIReferenceValuePresence() {
    return iReferenceValuePresenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIEditableModelScope() {
    return iEditableModelScopeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIMatchPolicy() {
    return iMatchPolicyEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIDiffPolicy() {
    return iDiffPolicyEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIMergePolicy() {
    return iMergePolicyEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getRole() {
    return roleEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DiffdataFactory getDiffdataFactory() {
    return (DiffdataFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    eIdentifiedEClass = createEClass(EIDENTIFIED);
    createEAttribute(eIdentifiedEClass, EIDENTIFIED__ID);

    eComparisonEClass = createEClass(ECOMPARISON);
    createEAttribute(eComparisonEClass, ECOMPARISON__ANCESTOR_SCOPE);
    createEAttribute(eComparisonEClass, ECOMPARISON__REFERENCE_SCOPE);
    createEAttribute(eComparisonEClass, ECOMPARISON__TARGET_SCOPE);
    createEAttribute(eComparisonEClass, ECOMPARISON__LAST_MATCH_POLICY);
    createEAttribute(eComparisonEClass, ECOMPARISON__LAST_DIFF_POLICY);
    createEAttribute(eComparisonEClass, ECOMPARISON__LAST_MERGE_POLICY);
    createEReference(eComparisonEClass, ECOMPARISON__MAPPING);

    eMappingEClass = createEClass(EMAPPING);
    createEReference(eMappingEClass, EMAPPING__MODIFIABLE_CONTENTS);
    createEReference(eMappingEClass, EMAPPING__REFERENCE_COMPLETED_MATCHES);
    createEReference(eMappingEClass, EMAPPING__TARGET_COMPLETED_MATCHES);

    eMatchEClass = createEClass(EMATCH);
    createEAttribute(eMatchEClass, EMATCH__MATCH_ID);
    createEReference(eMatchEClass, EMATCH__ANCESTOR);
    createEReference(eMatchEClass, EMATCH__REFERENCE);
    createEReference(eMatchEClass, EMATCH__TARGET);
    createEReference(eMatchEClass, EMATCH__MODIFIABLE_RELATED_DIFFERENCES);
    createEReference(eMatchEClass, EMATCH__MODIFIABLE_ATTRIBUTE_MAP);
    createEReference(eMatchEClass, EMATCH__MODIFIABLE_REFERENCE_MAP);
    createEReference(eMatchEClass, EMATCH__ELEMENT_PRESENCE_DIFFERENCE);
    createEReference(eMatchEClass, EMATCH__REFERENCE_OWNERSHIP_DIFFERENCE);
    createEReference(eMatchEClass, EMATCH__TARGET_OWNERSHIP_DIFFERENCE);

    eMergeableDifferenceEClass = createEClass(EMERGEABLE_DIFFERENCE);
    createEReference(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__COMPARISON);
    createEAttribute(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__ALIGNED_WITH_ANCESTOR);
    createEAttribute(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__CONFLICTING);
    createEAttribute(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__IGNORED);
    createEAttribute(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__MERGE_DESTINATION);
    createEAttribute(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__POSSIBLE_MERGE_DESTINATIONS);
    createEReference(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__EXPLICIT_DEPENDENCIES_FOR_TARGET);
    createEReference(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__EXPLICIT_DEPENDENCIES_FOR_REFERENCE);
    createEReference(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__IMPLICIT_DEPENDENCIES_FOR_TARGET);
    createEReference(eMergeableDifferenceEClass,
        EMERGEABLE_DIFFERENCE__IMPLICIT_DEPENDENCIES_FOR_REFERENCE);

    eElementRelativePresenceEClass = createEClass(EELEMENT_RELATIVE_PRESENCE);
    createEReference(eElementRelativePresenceEClass,
        EELEMENT_RELATIVE_PRESENCE__ELEMENT_MATCH);
    createEAttribute(eElementRelativePresenceEClass,
        EELEMENT_RELATIVE_PRESENCE__PRESENCE_ROLE);

    eElementPresenceEClass = createEClass(EELEMENT_PRESENCE);
    createEReference(eElementPresenceEClass, EELEMENT_PRESENCE__OWNER_MATCH);

    eValuePresenceEClass = createEClass(EVALUE_PRESENCE);
    createEReference(eValuePresenceEClass, EVALUE_PRESENCE__FEATURE);
    createEAttribute(eValuePresenceEClass, EVALUE_PRESENCE__ORDER);

    eAttributeValuePresenceEClass = createEClass(EATTRIBUTE_VALUE_PRESENCE);
    createEAttribute(eAttributeValuePresenceEClass,
        EATTRIBUTE_VALUE_PRESENCE__VALUE);

    eReferenceValuePresenceEClass = createEClass(EREFERENCE_VALUE_PRESENCE);
    createEReference(eReferenceValuePresenceEClass,
        EREFERENCE_VALUE_PRESENCE__VALUE);
    createEReference(eReferenceValuePresenceEClass,
        EREFERENCE_VALUE_PRESENCE__VALUE_MATCH);

    attributeToValueToDifferenceEntryEClass = createEClass(
        ATTRIBUTE_TO_VALUE_TO_DIFFERENCE_ENTRY);
    createEReference(attributeToValueToDifferenceEntryEClass,
        ATTRIBUTE_TO_VALUE_TO_DIFFERENCE_ENTRY__KEY);
    createEReference(attributeToValueToDifferenceEntryEClass,
        ATTRIBUTE_TO_VALUE_TO_DIFFERENCE_ENTRY__VALUE);

    valueToDifferenceEntryEClass = createEClass(VALUE_TO_DIFFERENCE_ENTRY);
    createEAttribute(valueToDifferenceEntryEClass,
        VALUE_TO_DIFFERENCE_ENTRY__KEY);
    createEReference(valueToDifferenceEntryEClass,
        VALUE_TO_DIFFERENCE_ENTRY__VALUE);

    referenceToElementToDifferenceEntryEClass = createEClass(
        REFERENCE_TO_ELEMENT_TO_DIFFERENCE_ENTRY);
    createEReference(referenceToElementToDifferenceEntryEClass,
        REFERENCE_TO_ELEMENT_TO_DIFFERENCE_ENTRY__KEY);
    createEReference(referenceToElementToDifferenceEntryEClass,
        REFERENCE_TO_ELEMENT_TO_DIFFERENCE_ENTRY__VALUE);

    elementToDifferenceEntryEClass = createEClass(ELEMENT_TO_DIFFERENCE_ENTRY);
    createEReference(elementToDifferenceEntryEClass,
        ELEMENT_TO_DIFFERENCE_ENTRY__KEY);
    createEReference(elementToDifferenceEntryEClass,
        ELEMENT_TO_DIFFERENCE_ENTRY__VALUE);

    iComparisonEClass = createEClass(ICOMPARISON);

    iEditableComparisonEClass = createEClass(IEDITABLE_COMPARISON);

    iMappingEClass = createEClass(IMAPPING);

    iEditableMappingEClass = createEClass(IEDITABLE_MAPPING);

    iMatchEClass = createEClass(IMATCH);

    iEditableMatchEClass = createEClass(IEDITABLE_MATCH);

    iMergeableDifferenceEClass = createEClass(IMERGEABLE_DIFFERENCE);

    iEditableMergeableDifferenceEClass = createEClass(
        IEDITABLE_MERGEABLE_DIFFERENCE);

    iElementRelativePresenceEClass = createEClass(IELEMENT_RELATIVE_PRESENCE);

    iElementPresenceEClass = createEClass(IELEMENT_PRESENCE);

    iValuePresenceEClass = createEClass(IVALUE_PRESENCE);

    iAttributeValuePresenceEClass = createEClass(IATTRIBUTE_VALUE_PRESENCE);

    iReferenceValuePresenceEClass = createEClass(IREFERENCE_VALUE_PRESENCE);

    // Create data types
    iEditableModelScopeEDataType = createEDataType(IEDITABLE_MODEL_SCOPE);
    iMatchPolicyEDataType = createEDataType(IMATCH_POLICY);
    iDiffPolicyEDataType = createEDataType(IDIFF_POLICY);
    iMergePolicyEDataType = createEDataType(IMERGE_POLICY);
    roleEDataType = createEDataType(ROLE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
        .getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    eComparisonEClass.getESuperTypes().add(this.getEIdentified());
    eComparisonEClass.getESuperTypes().add(this.getIEditableComparison());
    eMappingEClass.getESuperTypes().add(this.getEIdentified());
    eMappingEClass.getESuperTypes().add(this.getIEditableMapping());
    eMatchEClass.getESuperTypes().add(this.getEIdentified());
    eMatchEClass.getESuperTypes().add(this.getIEditableMatch());
    eMergeableDifferenceEClass.getESuperTypes().add(this.getEIdentified());
    eMergeableDifferenceEClass.getESuperTypes()
        .add(this.getIEditableMergeableDifference());
    eElementRelativePresenceEClass.getESuperTypes()
        .add(this.getEMergeableDifference());
    eElementRelativePresenceEClass.getESuperTypes()
        .add(this.getIElementRelativePresence());
    eElementPresenceEClass.getESuperTypes()
        .add(this.getEElementRelativePresence());
    eElementPresenceEClass.getESuperTypes().add(this.getIElementPresence());
    eValuePresenceEClass.getESuperTypes()
        .add(this.getEElementRelativePresence());
    eValuePresenceEClass.getESuperTypes().add(this.getIValuePresence());
    eAttributeValuePresenceEClass.getESuperTypes()
        .add(this.getEValuePresence());
    eAttributeValuePresenceEClass.getESuperTypes()
        .add(this.getIAttributeValuePresence());
    eReferenceValuePresenceEClass.getESuperTypes()
        .add(this.getEValuePresence());
    eReferenceValuePresenceEClass.getESuperTypes()
        .add(this.getIReferenceValuePresence());

    // Initialize classes and features; add operations and parameters
    initEClass(eIdentifiedEClass, EIdentified.class, "EIdentified", IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEIdentified_Id(), theEcorePackage.getEString(), "id", //$NON-NLS-1$
        null, 0, 1, EIdentified.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(eComparisonEClass, EComparison.class, "EComparison", //$NON-NLS-1$
        !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEComparison_AncestorScope(),
        this.getIEditableModelScope(), "ancestorScope", null, 0, 1, //$NON-NLS-1$
        EComparison.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEComparison_ReferenceScope(),
        this.getIEditableModelScope(), "referenceScope", null, 1, 1, //$NON-NLS-1$
        EComparison.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEComparison_TargetScope(), this.getIEditableModelScope(),
        "targetScope", null, 1, 1, EComparison.class, IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEComparison_LastMatchPolicy(), this.getIMatchPolicy(),
        "lastMatchPolicy", null, 0, 1, EComparison.class, IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEComparison_LastDiffPolicy(), this.getIDiffPolicy(),
        "lastDiffPolicy", null, 0, 1, EComparison.class, IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEComparison_LastMergePolicy(), this.getIMergePolicy(),
        "lastMergePolicy", null, 0, 1, EComparison.class, IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getEComparison_Mapping(), this.getEMapping(), null,
        "mapping", null, 1, 1, EComparison.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eMappingEClass, EMapping.class, "EMapping", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEMapping_ModifiableContents(), this.getEMatch(), null,
        "modifiableContents", null, 0, -1, EMapping.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMapping_ReferenceCompletedMatches(), this.getIMatch(),
        null, "referenceCompletedMatches", null, 0, -1, EMapping.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getEMapping_TargetCompletedMatches(), this.getIMatch(), null,
        "targetCompletedMatches", null, 0, -1, EMapping.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(eMappingEClass, this.getEComparison(), "getComparison", 0, 1, //$NON-NLS-1$
        IS_UNIQUE, IS_ORDERED);

    initEClass(eMatchEClass, EMatch.class, "EMatch", !IS_ABSTRACT, //$NON-NLS-1$
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEMatch_MatchID(), theEcorePackage.getEJavaObject(),
        "matchID", null, 0, 1, EMatch.class, IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getEMatch_Ancestor(), ecorePackage.getEObject(), null,
        "ancestor", null, 0, 1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_Reference(), ecorePackage.getEObject(), null,
        "reference", null, 0, 1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_Target(), ecorePackage.getEObject(), null,
        "target", null, 0, 1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_ModifiableRelatedDifferences(),
        this.getEMergeableDifference(), null, "modifiableRelatedDifferences", //$NON-NLS-1$
        null, 0, -1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_ModifiableAttributeMap(),
        this.getAttributeToValueToDifferenceEntry(), null,
        "modifiableAttributeMap", null, 0, -1, EMatch.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_ModifiableReferenceMap(),
        this.getReferenceToElementToDifferenceEntry(), null,
        "modifiableReferenceMap", null, 0, -1, EMatch.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_ElementPresenceDifference(),
        this.getIElementPresence(), null, "elementPresenceDifference", null, 0, //$NON-NLS-1$
        1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_ReferenceOwnershipDifference(),
        this.getIReferenceValuePresence(), null, "referenceOwnershipDifference", //$NON-NLS-1$
        null, 0, 1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getEMatch_TargetOwnershipDifference(),
        this.getIReferenceValuePresence(), null, "targetOwnershipDifference", //$NON-NLS-1$
        null, 0, 1, EMatch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    addEOperation(eMatchEClass, this.getEMapping(), "getMapping", 0, 1, //$NON-NLS-1$
        IS_UNIQUE, IS_ORDERED);

    initEClass(eMergeableDifferenceEClass, EMergeableDifference.class,
        "EMergeableDifference", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEMergeableDifference_Comparison(), this.getEComparison(),
        null, "comparison", null, 1, 1, EMergeableDifference.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMergeableDifference_AlignedWithAncestor(),
        theEcorePackage.getEBoolean(), "alignedWithAncestor", "true", 1, 1, //$NON-NLS-1$//$NON-NLS-2$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMergeableDifference_Conflicting(),
        theEcorePackage.getEBoolean(), "conflicting", "false", 1, 1, //$NON-NLS-1$//$NON-NLS-2$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMergeableDifference_Ignored(),
        theEcorePackage.getEBoolean(), "ignored", null, 1, 1, //$NON-NLS-1$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMergeableDifference_MergeDestination(), this.getRole(),
        "mergeDestination", null, 0, 1, EMergeableDifference.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEMergeableDifference_PossibleMergeDestinations(),
        this.getRole(), "possibleMergeDestinations", null, 0, -1, //$NON-NLS-1$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMergeableDifference_ExplicitDependenciesForTarget(),
        this.getIMergeableDifference(), null, "explicitDependenciesForTarget", //$NON-NLS-1$
        null, 0, -1, EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMergeableDifference_ExplicitDependenciesForReference(),
        this.getIMergeableDifference(), null,
        "explicitDependenciesForReference", null, 0, -1, //$NON-NLS-1$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getEMergeableDifference_ImplicitDependenciesForTarget(),
        this.getIMergeableDifference(), null, "implicitDependenciesForTarget", //$NON-NLS-1$
        null, 0, -1, EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEMergeableDifference_ImplicitDependenciesForReference(),
        this.getIMergeableDifference(), null,
        "implicitDependenciesForReference", null, 0, -1, //$NON-NLS-1$
        EMergeableDifference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(eElementRelativePresenceEClass, EElementRelativePresence.class,
        "EElementRelativePresence", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEElementRelativePresence_ElementMatch(), this.getEMatch(),
        null, "elementMatch", null, 1, 1, EElementRelativePresence.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEElementRelativePresence_PresenceRole(), this.getRole(),
        "presenceRole", null, 1, 1, EElementRelativePresence.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eElementPresenceEClass, EElementPresence.class,
        "EElementPresence", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEElementPresence_OwnerMatch(), this.getEMatch(), null,
        "ownerMatch", null, 1, 1, EElementPresence.class, !IS_TRANSIENT, //$NON-NLS-1$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eValuePresenceEClass, EValuePresence.class, "EValuePresence", //$NON-NLS-1$
        IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEValuePresence_Feature(),
        theEcorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, //$NON-NLS-1$
        EValuePresence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEValuePresence_Order(), theEcorePackage.getEBoolean(),
        "order", "false", 1, 1, EValuePresence.class, !IS_TRANSIENT, //$NON-NLS-1$//$NON-NLS-2$
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(eAttributeValuePresenceEClass, EAttributeValuePresence.class,
        "EAttributeValuePresence", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEAttributeValuePresence_Value(),
        theEcorePackage.getEJavaObject(), "value", null, 1, 1, //$NON-NLS-1$
        EAttributeValuePresence.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(eReferenceValuePresenceEClass, EReferenceValuePresence.class,
        "EReferenceValuePresence", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEReferenceValuePresence_Value(),
        theEcorePackage.getEObject(), null, "value", null, 1, 1, //$NON-NLS-1$
        EReferenceValuePresence.class, !IS_TRANSIENT, !IS_VOLATILE,
        IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEReferenceValuePresence_ValueMatch(), this.getEMatch(),
        null, "valueMatch", null, 0, 1, EReferenceValuePresence.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeToValueToDifferenceEntryEClass, Map.Entry.class,
        "AttributeToValueToDifferenceEntry", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeToValueToDifferenceEntry_Key(),
        theEcorePackage.getEAttribute(), null, "key", null, 1, 1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeToValueToDifferenceEntry_Value(),
        this.getValueToDifferenceEntry(), null, "value", null, 0, -1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(valueToDifferenceEntryEClass, Map.Entry.class,
        "ValueToDifferenceEntry", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueToDifferenceEntry_Key(),
        theEcorePackage.getEJavaObject(), "key", null, 1, 1, Map.Entry.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueToDifferenceEntry_Value(),
        this.getIAttributeValuePresence(), null, "value", null, 1, 1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(referenceToElementToDifferenceEntryEClass, Map.Entry.class,
        "ReferenceToElementToDifferenceEntry", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceToElementToDifferenceEntry_Key(),
        theEcorePackage.getEReference(), null, "key", null, 1, 1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceToElementToDifferenceEntry_Value(),
        this.getElementToDifferenceEntry(), null, "value", null, 0, -1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(elementToDifferenceEntryEClass, Map.Entry.class,
        "ElementToDifferenceEntry", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementToDifferenceEntry_Key(),
        theEcorePackage.getEObject(), null, "key", null, 1, 1, Map.Entry.class, //$NON-NLS-1$
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getElementToDifferenceEntry_Value(),
        this.getIReferenceValuePresence(), null, "value", null, 1, 1, //$NON-NLS-1$
        Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(iComparisonEClass, IComparison.class, "IComparison", IS_ABSTRACT, //$NON-NLS-1$
        IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iEditableComparisonEClass, Editable.class, "IEditableComparison", //$NON-NLS-1$
        IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iMappingEClass, IMapping.class, "IMapping", IS_ABSTRACT, //$NON-NLS-1$
        IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iEditableMappingEClass,
        org.eclipse.emf.diffmerge.api.IMapping.Editable.class,
        "IEditableMapping", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iMatchEClass, IMatch.class, "IMatch", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iEditableMatchEClass,
        org.eclipse.emf.diffmerge.api.IMatch.Editable.class, "IEditableMatch", //$NON-NLS-1$
        IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iMergeableDifferenceEClass, IMergeableDifference.class,
        "IMergeableDifference", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iEditableMergeableDifferenceEClass,
        org.eclipse.emf.diffmerge.api.diff.IMergeableDifference.Editable.class,
        "IEditableMergeableDifference", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iElementRelativePresenceEClass, IElementRelativePresence.class,
        "IElementRelativePresence", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iElementPresenceEClass, IElementPresence.class,
        "IElementPresence", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iValuePresenceEClass, IValuePresence.class, "IValuePresence", //$NON-NLS-1$
        IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iAttributeValuePresenceEClass, IAttributeValuePresence.class,
        "IAttributeValuePresence", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    initEClass(iReferenceValuePresenceEClass, IReferenceValuePresence.class,
        "IReferenceValuePresence", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    // Initialize data types
    initEDataType(iEditableModelScopeEDataType, IEditableModelScope.class,
        "IEditableModelScope", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
    initEDataType(iMatchPolicyEDataType, IMatchPolicy.class, "IMatchPolicy", //$NON-NLS-1$
        IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iDiffPolicyEDataType, IDiffPolicy.class, "IDiffPolicy", //$NON-NLS-1$
        IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iMergePolicyEDataType, IMergePolicy.class, "IMergePolicy", //$NON-NLS-1$
        IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(roleEDataType, Role.class, "Role", IS_SERIALIZABLE, //$NON-NLS-1$
        !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //DiffdataPackageImpl
