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
 *   Gregoire Dupe (Mia-Software) - Bug 370802 - Declare columns order in the tableConfiguration file 
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomPackage;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.ModelCellEditorPackage;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableconfigurationPackageImpl extends EPackageImpl implements TableconfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationMethodEClass = null;

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
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TableconfigurationPackageImpl() {
		super(eNS_URI, TableconfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TableconfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TableconfigurationPackage init() {
		if (isInited) return (TableconfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(TableconfigurationPackage.eNS_URI);

		// Obtain or create and register package
		TableconfigurationPackageImpl theTableconfigurationPackage = (TableconfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TableconfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TableconfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelCellEditorPackage.eINSTANCE.eClass();
		CustomPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTableconfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theTableconfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTableconfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TableconfigurationPackage.eNS_URI, theTableconfigurationPackage);
		return theTableconfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableConfiguration() {
		return tableConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_DefaultLocalCustomizations() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_CanBePresentedInTheTable() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_ForcedCellEditors() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_DefaultFacets() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_DefaultCustomizations() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_InstantiationMethod() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConfiguration_DefaultColumns() {
		return (EReference)tableConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationMethod() {
		return instantiationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantiationMethod_Name() {
		return (EAttribute)instantiationMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantiationMethod_Description() {
		return (EAttribute)instantiationMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationMethod_InstantiationOperation() {
		return (EReference)instantiationMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableconfigurationFactory getTableconfigurationFactory() {
		return (TableconfigurationFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tableConfigurationEClass = createEClass(TABLE_CONFIGURATION);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__FORCED_CELL_EDITORS);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__DEFAULT_FACETS);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__INSTANTIATION_METHOD);
		createEReference(tableConfigurationEClass, TABLE_CONFIGURATION__DEFAULT_COLUMNS);

		instantiationMethodEClass = createEClass(INSTANTIATION_METHOD);
		createEAttribute(instantiationMethodEClass, INSTANTIATION_METHOD__NAME);
		createEAttribute(instantiationMethodEClass, INSTANTIATION_METHOD__DESCRIPTION);
		createEReference(instantiationMethodEClass, INSTANTIATION_METHOD__INSTANTIATION_OPERATION);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CustomPackage theCustomPackage = (CustomPackage)EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI);
		EFacetPackage theEFacetPackage = (EFacetPackage)EPackage.Registry.INSTANCE.getEPackage(EFacetPackage.eNS_URI);
		ModelCellEditorPackage theModelCellEditorPackage = (ModelCellEditorPackage)EPackage.Registry.INSTANCE.getEPackage(ModelCellEditorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tableConfigurationEClass, TableConfiguration.class, "TableConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTableConfiguration_DefaultLocalCustomizations(), theCustomPackage.getCustomization(), null, "defaultLocalCustomizations", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_CanBePresentedInTheTable(), theEFacetPackage.getFacetElement(), null, "canBePresentedInTheTable", null, 0, 1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_ForcedCellEditors(), theModelCellEditorPackage.getAbstractModelCellEditor(), null, "forcedCellEditors", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_DefaultFacets(), theEFacetPackage.getFacet(), null, "defaultFacets", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_DefaultCustomizations(), theCustomPackage.getCustomization(), null, "defaultCustomizations", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_InstantiationMethod(), this.getInstantiationMethod(), null, "instantiationMethod", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getTableConfiguration_DefaultColumns(), theEcorePackage.getETypedElement(), null, "defaultColumns", null, 0, -1, TableConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(instantiationMethodEClass, InstantiationMethod.class, "InstantiationMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInstantiationMethod_Name(), theEcorePackage.getEString(), "name", null, 0, 1, InstantiationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInstantiationMethod_Description(), theEcorePackage.getEString(), "description", null, 0, 1, InstantiationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInstantiationMethod_InstantiationOperation(), ecorePackage.getEOperation(), null, "instantiationOperation", null, 0, 1, InstantiationMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //TableconfigurationPackageImpl
