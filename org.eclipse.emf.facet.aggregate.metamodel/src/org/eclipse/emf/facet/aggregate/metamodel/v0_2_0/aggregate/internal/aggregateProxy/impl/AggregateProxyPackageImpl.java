/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregatePackageImpl;

import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyFactory;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation;

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomPackage;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregateProxyPackageImpl extends EPackageImpl implements AggregateProxyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedFacetSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedFacetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedFacetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedEStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedCustomizationEClass = null;

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
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AggregateProxyPackageImpl() {
		super(eNS_URI, AggregateProxyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AggregateProxyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AggregateProxyPackage init() {
		if (isInited) return (AggregateProxyPackage)EPackage.Registry.INSTANCE.getEPackage(AggregateProxyPackage.eNS_URI);

		// Obtain or create and register package
		AggregateProxyPackageImpl theAggregateProxyPackage = (AggregateProxyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AggregateProxyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AggregateProxyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CustomPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AggregatePackageImpl theAggregatePackage = (AggregatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AggregatePackage.eNS_URI) instanceof AggregatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AggregatePackage.eNS_URI) : AggregatePackage.eINSTANCE);

		// Create package meta-data objects
		theAggregateProxyPackage.createPackageContents();
		theAggregatePackage.createPackageContents();

		// Initialize created meta-data
		theAggregateProxyPackage.initializePackageContents();
		theAggregatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAggregateProxyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AggregateProxyPackage.eNS_URI, theAggregateProxyPackage);
		return theAggregateProxyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedFacetSet() {
		return aggregatedFacetSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedFacetSet_FacetSet() {
		return (EReference)aggregatedFacetSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedFacet() {
		return aggregatedFacetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedFacet_Facet() {
		return (EReference)aggregatedFacetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedFacetElement() {
		return aggregatedFacetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedFacetElement_FacetElement() {
		return (EReference)aggregatedFacetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedEStructuralFeature() {
		return aggregatedEStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedEStructuralFeature_EStructuralFeature() {
		return (EReference)aggregatedEStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedOperation() {
		return aggregatedOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedOperation_FacetOperation() {
		return (EReference)aggregatedOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedCustomization() {
		return aggregatedCustomizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedCustomization_Customization() {
		return (EReference)aggregatedCustomizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateProxyFactory getAggregateProxyFactory() {
		return (AggregateProxyFactory)getEFactoryInstance();
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
		aggregatedFacetSetEClass = createEClass(AGGREGATED_FACET_SET);
		createEReference(aggregatedFacetSetEClass, AGGREGATED_FACET_SET__FACET_SET);

		aggregatedFacetEClass = createEClass(AGGREGATED_FACET);
		createEReference(aggregatedFacetEClass, AGGREGATED_FACET__FACET);

		aggregatedFacetElementEClass = createEClass(AGGREGATED_FACET_ELEMENT);
		createEReference(aggregatedFacetElementEClass, AGGREGATED_FACET_ELEMENT__FACET_ELEMENT);

		aggregatedEStructuralFeatureEClass = createEClass(AGGREGATED_ESTRUCTURAL_FEATURE);
		createEReference(aggregatedEStructuralFeatureEClass, AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE);

		aggregatedOperationEClass = createEClass(AGGREGATED_OPERATION);
		createEReference(aggregatedOperationEClass, AGGREGATED_OPERATION__FACET_OPERATION);

		aggregatedCustomizationEClass = createEClass(AGGREGATED_CUSTOMIZATION);
		createEReference(aggregatedCustomizationEClass, AGGREGATED_CUSTOMIZATION__CUSTOMIZATION);
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
		EFacetPackage theEFacetPackage = (EFacetPackage)EPackage.Registry.INSTANCE.getEPackage(EFacetPackage.eNS_URI);
		CustomPackage theCustomPackage = (CustomPackage)EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aggregatedFacetSetEClass.getESuperTypes().add(theEFacetPackage.getFacetSet());
		aggregatedFacetEClass.getESuperTypes().add(theEFacetPackage.getFacet());
		aggregatedFacetElementEClass.getESuperTypes().add(theEFacetPackage.getDocumentedElement());
		aggregatedEStructuralFeatureEClass.getESuperTypes().add(ecorePackage.getEStructuralFeature());
		aggregatedEStructuralFeatureEClass.getESuperTypes().add(this.getAggregatedFacetElement());
		aggregatedOperationEClass.getESuperTypes().add(theEFacetPackage.getFacetOperation());
		aggregatedOperationEClass.getESuperTypes().add(this.getAggregatedFacetElement());
		aggregatedCustomizationEClass.getESuperTypes().add(theCustomPackage.getCustomization());
		aggregatedCustomizationEClass.getESuperTypes().add(this.getAggregatedFacetSet());

		// Initialize classes and features; add operations and parameters
		initEClass(aggregatedFacetSetEClass, AggregatedFacetSet.class, "AggregatedFacetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedFacetSet_FacetSet(), theEFacetPackage.getFacetSet(), null, "facetSet", null, 0, 1, AggregatedFacetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedFacetEClass, AggregatedFacet.class, "AggregatedFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedFacet_Facet(), theEFacetPackage.getFacet(), null, "facet", null, 0, 1, AggregatedFacet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedFacetElementEClass, AggregatedFacetElement.class, "AggregatedFacetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedFacetElement_FacetElement(), theEFacetPackage.getFacetElement(), null, "facetElement", null, 0, 1, AggregatedFacetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedEStructuralFeatureEClass, AggregatedEStructuralFeature.class, "AggregatedEStructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedEStructuralFeature_EStructuralFeature(), ecorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, AggregatedEStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedOperationEClass, AggregatedOperation.class, "AggregatedOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedOperation_FacetOperation(), theEFacetPackage.getFacetOperation(), null, "facetOperation", null, 0, 1, AggregatedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedCustomizationEClass, AggregatedCustomization.class, "AggregatedCustomization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedCustomization_Customization(), theCustomPackage.getCustomization(), null, "customization", null, 0, 1, AggregatedCustomization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AggregateProxyPackageImpl
