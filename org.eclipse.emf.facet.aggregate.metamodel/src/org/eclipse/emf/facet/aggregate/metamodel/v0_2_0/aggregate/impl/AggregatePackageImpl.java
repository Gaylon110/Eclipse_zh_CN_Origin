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
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.Aggregate;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregateFactory;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomPackage;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregatePackageImpl extends EPackageImpl implements AggregatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateEClass = null;

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
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	public AggregatePackageImpl() {
		super(eNS_URI, AggregateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AggregatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AggregatePackage init() {
		if (isInited) return (AggregatePackage)EPackage.Registry.INSTANCE.getEPackage(AggregatePackage.eNS_URI);

		// Obtain or create and register package
		AggregatePackageImpl theAggregatePackage = (AggregatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AggregatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AggregatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CustomPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AggregateProxyPackageImpl theAggregateProxyPackage = (AggregateProxyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AggregateProxyPackage.eNS_URI) instanceof AggregateProxyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AggregateProxyPackage.eNS_URI) : AggregateProxyPackage.eINSTANCE);

		// Create package meta-data objects
		theAggregatePackage.createPackageContents();
		theAggregateProxyPackage.createPackageContents();

		// Initialize created meta-data
		theAggregatePackage.initializePackageContents();
		theAggregateProxyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAggregatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AggregatePackage.eNS_URI, theAggregatePackage);
		return theAggregatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregate() {
		return aggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregate_AggregatedFacetSets() {
		return (EReference)aggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateFactory getAggregateFactory() {
		return (AggregateFactory)getEFactoryInstance();
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
		aggregateEClass = createEClass(AGGREGATE);
		createEReference(aggregateEClass, AGGREGATE__AGGREGATED_FACET_SETS);
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
		AggregateProxyPackage theAggregateProxyPackage = (AggregateProxyPackage)EPackage.Registry.INSTANCE.getEPackage(AggregateProxyPackage.eNS_URI);
		EFacetPackage theEFacetPackage = (EFacetPackage)EPackage.Registry.INSTANCE.getEPackage(EFacetPackage.eNS_URI);
		CustomPackage theCustomPackage = (CustomPackage)EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAggregateProxyPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aggregateEClass.getESuperTypes().add(theEFacetPackage.getFacetSet());
		aggregateEClass.getESuperTypes().add(theCustomPackage.getCustomization());

		// Initialize classes and features; add operations and parameters
		initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregate_AggregatedFacetSets(), theEFacetPackage.getFacetSet(), null, "aggregatedFacetSets", null, 0, -1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(aggregateEClass, theEFacetPackage.getFacetSet(), "getFacetSets", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";			
		addAnnotation
		  (aggregateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.aggregatedFacetSets"
		   });
	}

} //AggregatePackageImpl
