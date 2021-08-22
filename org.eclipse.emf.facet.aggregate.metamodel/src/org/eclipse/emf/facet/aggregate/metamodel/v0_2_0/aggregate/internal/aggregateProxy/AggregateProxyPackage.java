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
 *    Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 *    Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomPackage;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.EFacetPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregateProxyFactory
 * @model kind="package"
 * @generated
 */
public interface AggregateProxyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aggregateProxy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/facet/aggregate/0.2.incubation/aggregate/internal/aggregateProxy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aggregateProxy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AggregateProxyPackage eINSTANCE = org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl <em>Aggregated Facet Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacetSet()
	 * @generated
	 */
	int AGGREGATED_FACET_SET = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__EANNOTATIONS = EFacetPackage.FACET_SET__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__NAME = EFacetPackage.FACET_SET__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__NS_URI = EFacetPackage.FACET_SET__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__NS_PREFIX = EFacetPackage.FACET_SET__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__EFACTORY_INSTANCE = EFacetPackage.FACET_SET__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__ECLASSIFIERS = EFacetPackage.FACET_SET__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__ESUBPACKAGES = EFacetPackage.FACET_SET__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__ESUPER_PACKAGE = EFacetPackage.FACET_SET__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__DOCUMENTATION = EFacetPackage.FACET_SET__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__CATEGORIES = EFacetPackage.FACET_SET__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Facet Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET__FACET_SET = EFacetPackage.FACET_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregated Facet Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_SET_FEATURE_COUNT = EFacetPackage.FACET_SET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl <em>Aggregated Facet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacet()
	 * @generated
	 */
	int AGGREGATED_FACET = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__EANNOTATIONS = EFacetPackage.FACET__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__NAME = EFacetPackage.FACET__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__INSTANCE_CLASS_NAME = EFacetPackage.FACET__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__INSTANCE_CLASS = EFacetPackage.FACET__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__DEFAULT_VALUE = EFacetPackage.FACET__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__INSTANCE_TYPE_NAME = EFacetPackage.FACET__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__EPACKAGE = EFacetPackage.FACET__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__ETYPE_PARAMETERS = EFacetPackage.FACET__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__DOCUMENTATION = EFacetPackage.FACET__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extended Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__EXTENDED_METACLASS = EFacetPackage.FACET__EXTENDED_METACLASS;

	/**
	 * The feature id for the '<em><b>Facet Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__FACET_ELEMENTS = EFacetPackage.FACET__FACET_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Facet Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__FACET_OPERATIONS = EFacetPackage.FACET__FACET_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Conformance Typed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__CONFORMANCE_TYPED_ELEMENT = EFacetPackage.FACET__CONFORMANCE_TYPED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Extended Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__EXTENDED_FACETS = EFacetPackage.FACET__EXTENDED_FACETS;

	/**
	 * The feature id for the '<em><b>Facet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET__FACET = EFacetPackage.FACET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregated Facet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_FEATURE_COUNT = EFacetPackage.FACET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetElementImpl <em>Aggregated Facet Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetElementImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacetElement()
	 * @generated
	 */
	int AGGREGATED_FACET_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_ELEMENT__DOCUMENTATION = EFacetPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Facet Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_ELEMENT__FACET_ELEMENT = EFacetPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregated Facet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_FACET_ELEMENT_FEATURE_COUNT = EFacetPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl <em>Aggregated EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedEStructuralFeature()
	 * @generated
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__EANNOTATIONS = EcorePackage.ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__NAME = EcorePackage.ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__ORDERED = EcorePackage.ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__UNIQUE = EcorePackage.ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__LOWER_BOUND = EcorePackage.ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__UPPER_BOUND = EcorePackage.ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__MANY = EcorePackage.ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__REQUIRED = EcorePackage.ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__ETYPE = EcorePackage.ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__EGENERIC_TYPE = EcorePackage.ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__CHANGEABLE = EcorePackage.ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__VOLATILE = EcorePackage.ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__TRANSIENT = EcorePackage.ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__DEFAULT_VALUE = EcorePackage.ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__UNSETTABLE = EcorePackage.ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__DERIVED = EcorePackage.ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__DOCUMENTATION = EcorePackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facet Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__FACET_ELEMENT = EcorePackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE = EcorePackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregated EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_ESTRUCTURAL_FEATURE_FEATURE_COUNT = EcorePackage.ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl <em>Aggregated Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedOperation()
	 * @generated
	 */
	int AGGREGATED_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__EANNOTATIONS = EFacetPackage.FACET_OPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__NAME = EFacetPackage.FACET_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__ORDERED = EFacetPackage.FACET_OPERATION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__UNIQUE = EFacetPackage.FACET_OPERATION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__LOWER_BOUND = EFacetPackage.FACET_OPERATION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__UPPER_BOUND = EFacetPackage.FACET_OPERATION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__MANY = EFacetPackage.FACET_OPERATION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__REQUIRED = EFacetPackage.FACET_OPERATION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__ETYPE = EFacetPackage.FACET_OPERATION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__EGENERIC_TYPE = EFacetPackage.FACET_OPERATION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__ECONTAINING_CLASS = EFacetPackage.FACET_OPERATION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__ETYPE_PARAMETERS = EFacetPackage.FACET_OPERATION__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__EPARAMETERS = EFacetPackage.FACET_OPERATION__EPARAMETERS;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__EEXCEPTIONS = EFacetPackage.FACET_OPERATION__EEXCEPTIONS;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__EGENERIC_EXCEPTIONS = EFacetPackage.FACET_OPERATION__EGENERIC_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__DOCUMENTATION = EFacetPackage.FACET_OPERATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__CATEGORIES = EFacetPackage.FACET_OPERATION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__QUERY = EFacetPackage.FACET_OPERATION__QUERY;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__OVERRIDE = EFacetPackage.FACET_OPERATION__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Facet Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__FACET_ELEMENT = EFacetPackage.FACET_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facet Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION__FACET_OPERATION = EFacetPackage.FACET_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregated Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_OPERATION_FEATURE_COUNT = EFacetPackage.FACET_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl <em>Aggregated Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedCustomization()
	 * @generated
	 */
	int AGGREGATED_CUSTOMIZATION = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__EANNOTATIONS = CustomPackage.CUSTOMIZATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__NAME = CustomPackage.CUSTOMIZATION__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__NS_URI = CustomPackage.CUSTOMIZATION__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__NS_PREFIX = CustomPackage.CUSTOMIZATION__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__EFACTORY_INSTANCE = CustomPackage.CUSTOMIZATION__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__ECLASSIFIERS = CustomPackage.CUSTOMIZATION__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__ESUBPACKAGES = CustomPackage.CUSTOMIZATION__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__ESUPER_PACKAGE = CustomPackage.CUSTOMIZATION__ESUPER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__DOCUMENTATION = CustomPackage.CUSTOMIZATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__CATEGORIES = CustomPackage.CUSTOMIZATION__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Must Be Loaded By Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__MUST_BE_LOADED_BY_DEFAULT = CustomPackage.CUSTOMIZATION__MUST_BE_LOADED_BY_DEFAULT;

	/**
	 * The feature id for the '<em><b>Facet Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__FACET_SET = CustomPackage.CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION__CUSTOMIZATION = CustomPackage.CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregated Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_CUSTOMIZATION_FEATURE_COUNT = CustomPackage.CUSTOMIZATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet <em>Aggregated Facet Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Facet Set</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet
	 * @generated
	 */
	EClass getAggregatedFacetSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet#getFacetSet <em>Facet Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facet Set</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetSet#getFacetSet()
	 * @see #getAggregatedFacetSet()
	 * @generated
	 */
	EReference getAggregatedFacetSet_FacetSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet <em>Aggregated Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Facet</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet
	 * @generated
	 */
	EClass getAggregatedFacet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet#getFacet <em>Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facet</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet#getFacet()
	 * @see #getAggregatedFacet()
	 * @generated
	 */
	EReference getAggregatedFacet_Facet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement <em>Aggregated Facet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Facet Element</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement
	 * @generated
	 */
	EClass getAggregatedFacetElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement#getFacetElement <em>Facet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facet Element</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacetElement#getFacetElement()
	 * @see #getAggregatedFacetElement()
	 * @generated
	 */
	EReference getAggregatedFacetElement_FacetElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature <em>Aggregated EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated EStructural Feature</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature
	 * @generated
	 */
	EClass getAggregatedEStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedEStructuralFeature#getEStructuralFeature()
	 * @see #getAggregatedEStructuralFeature()
	 * @generated
	 */
	EReference getAggregatedEStructuralFeature_EStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation <em>Aggregated Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Operation</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation
	 * @generated
	 */
	EClass getAggregatedOperation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation#getFacetOperation <em>Facet Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facet Operation</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedOperation#getFacetOperation()
	 * @see #getAggregatedOperation()
	 * @generated
	 */
	EReference getAggregatedOperation_FacetOperation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization <em>Aggregated Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Customization</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization
	 * @generated
	 */
	EClass getAggregatedCustomization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization#getCustomization <em>Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customization</em>'.
	 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedCustomization#getCustomization()
	 * @see #getAggregatedCustomization()
	 * @generated
	 */
	EReference getAggregatedCustomization_Customization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AggregateProxyFactory getAggregateProxyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl <em>Aggregated Facet Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacetSet()
		 * @generated
		 */
		EClass AGGREGATED_FACET_SET = eINSTANCE.getAggregatedFacetSet();

		/**
		 * The meta object literal for the '<em><b>Facet Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_FACET_SET__FACET_SET = eINSTANCE.getAggregatedFacetSet_FacetSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl <em>Aggregated Facet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacet()
		 * @generated
		 */
		EClass AGGREGATED_FACET = eINSTANCE.getAggregatedFacet();

		/**
		 * The meta object literal for the '<em><b>Facet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_FACET__FACET = eINSTANCE.getAggregatedFacet_Facet();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetElementImpl <em>Aggregated Facet Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetElementImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedFacetElement()
		 * @generated
		 */
		EClass AGGREGATED_FACET_ELEMENT = eINSTANCE.getAggregatedFacetElement();

		/**
		 * The meta object literal for the '<em><b>Facet Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_FACET_ELEMENT__FACET_ELEMENT = eINSTANCE.getAggregatedFacetElement_FacetElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl <em>Aggregated EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedEStructuralFeatureImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedEStructuralFeature()
		 * @generated
		 */
		EClass AGGREGATED_ESTRUCTURAL_FEATURE = eINSTANCE.getAggregatedEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_ESTRUCTURAL_FEATURE__ESTRUCTURAL_FEATURE = eINSTANCE.getAggregatedEStructuralFeature_EStructuralFeature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl <em>Aggregated Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedOperationImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedOperation()
		 * @generated
		 */
		EClass AGGREGATED_OPERATION = eINSTANCE.getAggregatedOperation();

		/**
		 * The meta object literal for the '<em><b>Facet Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_OPERATION__FACET_OPERATION = eINSTANCE.getAggregatedOperation_FacetOperation();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl <em>Aggregated Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedCustomizationImpl
		 * @see org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregateProxyPackageImpl#getAggregatedCustomization()
		 * @generated
		 */
		EClass AGGREGATED_CUSTOMIZATION = eINSTANCE.getAggregatedCustomization();

		/**
		 * The meta object literal for the '<em><b>Customization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_CUSTOMIZATION__CUSTOMIZATION = eINSTANCE.getAggregatedCustomization_Customization();

	}

} //AggregateProxyPackage
