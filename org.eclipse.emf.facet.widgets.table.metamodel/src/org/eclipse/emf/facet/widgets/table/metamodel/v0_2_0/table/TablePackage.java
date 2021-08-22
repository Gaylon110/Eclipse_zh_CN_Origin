/**
 * Copyright (c) 2010, 2001 CEA LIST.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Gregoire Dupe (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Gregoire Dupe (Mia-Software) - Bug 339918 - To be able to have facet columns and to be able to have a local customization
 *    Gregoire Dupe (Mia-Software) - Bug 340571 - To be able have more than one localCustomization
 *    Gregoire Dupe (Mia-Software) - Bug 340572 - Wrong multiplicity in TableInstance.facets
 *    Nicolas Guyomar (Mia-Software) - Bug 340941 - Need new row and column types in the table
 *    Gregoire Dupe (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "table";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/facet/widgets/table/0.2.0.incubation/table";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "table";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablePackage eINSTANCE = org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Table Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Customizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CUSTOMIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Facet Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FACET_SETS = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Hide Empty Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__HIDE_EMPTY_COLUMNS = 5;

	/**
	 * The feature id for the '<em><b>Only Show Common Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ONLY_SHOW_COMMON_COLUMNS = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 8;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ROWS = 9;

	/**
	 * The feature id for the '<em><b>Local Customizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LOCAL_CUSTOMIZATIONS = 10;

	/**
	 * The feature id for the '<em><b>Can Be Presented In The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CAN_BE_PRESENTED_IN_THE_TABLE = 11;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationTableImpl <em>Navigation Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationTableImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getNavigationTable()
	 * @generated
	 */
	int NAVIGATION_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Table Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__TABLE_CONFIGURATION = TABLE__TABLE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Customizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__CUSTOMIZATIONS = TABLE__CUSTOMIZATIONS;

	/**
	 * The feature id for the '<em><b>Facet Sets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__FACET_SETS = TABLE__FACET_SETS;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__CONTEXT = TABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__PARAMETER = TABLE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Hide Empty Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__HIDE_EMPTY_COLUMNS = TABLE__HIDE_EMPTY_COLUMNS;

	/**
	 * The feature id for the '<em><b>Only Show Common Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__ONLY_SHOW_COMMON_COLUMNS = TABLE__ONLY_SHOW_COMMON_COLUMNS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__DESCRIPTION = TABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__COLUMNS = TABLE__COLUMNS;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__ROWS = TABLE__ROWS;

	/**
	 * The feature id for the '<em><b>Local Customizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__LOCAL_CUSTOMIZATIONS = TABLE__LOCAL_CUSTOMIZATIONS;

	/**
	 * The feature id for the '<em><b>Can Be Presented In The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__CAN_BE_PRESENTED_IN_THE_TABLE = TABLE__CAN_BE_PRESENTED_IN_THE_TABLE;

	/**
	 * The feature id for the '<em><b>Query Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE__QUERY_RESULTS = TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ColumnImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__WIDTH = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.SourceColumnImpl <em>Source Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.SourceColumnImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getSourceColumn()
	 * @generated
	 */
	int SOURCE_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__WIDTH = COLUMN__WIDTH;

	/**
	 * The feature id for the '<em><b>Is Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN__IS_HIDDEN = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.FeatureColumnImpl <em>Feature Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.FeatureColumnImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getFeatureColumn()
	 * @generated
	 */
	int FEATURE_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLUMN__WIDTH = COLUMN__WIDTH;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLUMN__FEATURE = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.RowImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getRow()
	 * @generated
	 */
	int ROW = 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationRowImpl <em>Navigation Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationRowImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getNavigationRow()
	 * @generated
	 */
	int NAVIGATION_ROW = 6;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ROW__ELEMENT = ROW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ROW__HEIGHT = ROW__HEIGHT;

	/**
	 * The feature id for the '<em><b>Query Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ROW__QUERY_RESULT = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.PrimitiveTypeQueryRowImpl <em>Primitive Type Query Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.PrimitiveTypeQueryRowImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getPrimitiveTypeQueryRow()
	 * @generated
	 */
	int PRIMITIVE_TYPE_QUERY_ROW = 7;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_QUERY_ROW__ELEMENT = NAVIGATION_ROW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_QUERY_ROW__HEIGHT = NAVIGATION_ROW__HEIGHT;

	/**
	 * The feature id for the '<em><b>Query Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_QUERY_ROW__QUERY_RESULT = NAVIGATION_ROW__QUERY_RESULT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_QUERY_ROW__VALUE = NAVIGATION_ROW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type Query Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_QUERY_ROW_FEATURE_COUNT = NAVIGATION_ROW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.EObjectQueryRowImpl <em>EObject Query Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.EObjectQueryRowImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getEObjectQueryRow()
	 * @generated
	 */
	int EOBJECT_QUERY_ROW = 8;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_QUERY_ROW__ELEMENT = NAVIGATION_ROW__ELEMENT;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_QUERY_ROW__HEIGHT = NAVIGATION_ROW__HEIGHT;

	/**
	 * The feature id for the '<em><b>Query Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_QUERY_ROW__QUERY_RESULT = NAVIGATION_ROW__QUERY_RESULT;

	/**
	 * The number of structural features of the '<em>EObject Query Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_QUERY_ROW_FEATURE_COUNT = NAVIGATION_ROW_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ValueColumnImpl <em>Value Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ValueColumnImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getValueColumn()
	 * @generated
	 */
	int VALUE_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLUMN__WIDTH = COLUMN__WIDTH;

	/**
	 * The number of structural features of the '<em>Value Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getTableConfiguration <em>Table Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Configuration</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getTableConfiguration()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCustomizations <em>Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Customizations</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCustomizations()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Customizations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getFacetSets <em>Facet Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facet Sets</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getFacetSets()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_FacetSets();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getContext()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getParameter()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isHideEmptyColumns <em>Hide Empty Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Empty Columns</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isHideEmptyColumns()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_HideEmptyColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isOnlyShowCommonColumns <em>Only Show Common Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Show Common Columns</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isOnlyShowCommonColumns()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_OnlyShowCommonColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getDescription()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getRows()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getLocalCustomizations <em>Local Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Customizations</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getLocalCustomizations()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_LocalCustomizations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Can Be Presented In The Table</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCanBePresentedInTheTable()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_CanBePresentedInTheTable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable <em>Navigation Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Table</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable
	 * @generated
	 */
	EClass getNavigationTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable#getQueryResults <em>Query Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query Results</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable#getQueryResults()
	 * @see #getNavigationTable()
	 * @generated
	 */
	EReference getNavigationTable_QueryResults();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column#getWidth()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn <em>Source Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Column</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn
	 * @generated
	 */
	EClass getSourceColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn#isIsHidden <em>Is Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hidden</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn#isIsHidden()
	 * @see #getSourceColumn()
	 * @generated
	 */
	EAttribute getSourceColumn_IsHidden();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn <em>Feature Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Column</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn
	 * @generated
	 */
	EClass getFeatureColumn();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn#getFeature()
	 * @see #getFeatureColumn()
	 * @generated
	 */
	EReference getFeatureColumn_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row#getElement()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row#getHeight()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Height();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow <em>Navigation Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Row</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow
	 * @generated
	 */
	EClass getNavigationRow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow#getQueryResult <em>Query Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query Result</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow#getQueryResult()
	 * @see #getNavigationRow()
	 * @generated
	 */
	EReference getNavigationRow_QueryResult();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow <em>Primitive Type Query Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Query Row</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow
	 * @generated
	 */
	EClass getPrimitiveTypeQueryRow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow#getValue()
	 * @see #getPrimitiveTypeQueryRow()
	 * @generated
	 */
	EAttribute getPrimitiveTypeQueryRow_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.EObjectQueryRow <em>EObject Query Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Query Row</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.EObjectQueryRow
	 * @generated
	 */
	EClass getEObjectQueryRow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.ValueColumn <em>Value Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Column</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.ValueColumn
	 * @generated
	 */
	EClass getValueColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableFactory getTableFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_CONFIGURATION = eINSTANCE.getTable_TableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Customizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CUSTOMIZATIONS = eINSTANCE.getTable_Customizations();

		/**
		 * The meta object literal for the '<em><b>Facet Sets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FACET_SETS = eINSTANCE.getTable_FacetSets();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONTEXT = eINSTANCE.getTable_Context();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__PARAMETER = eINSTANCE.getTable_Parameter();

		/**
		 * The meta object literal for the '<em><b>Hide Empty Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__HIDE_EMPTY_COLUMNS = eINSTANCE.getTable_HideEmptyColumns();

		/**
		 * The meta object literal for the '<em><b>Only Show Common Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ONLY_SHOW_COMMON_COLUMNS = eINSTANCE.getTable_OnlyShowCommonColumns();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__DESCRIPTION = eINSTANCE.getTable_Description();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ROWS = eINSTANCE.getTable_Rows();

		/**
		 * The meta object literal for the '<em><b>Local Customizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__LOCAL_CUSTOMIZATIONS = eINSTANCE.getTable_LocalCustomizations();

		/**
		 * The meta object literal for the '<em><b>Can Be Presented In The Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CAN_BE_PRESENTED_IN_THE_TABLE = eINSTANCE.getTable_CanBePresentedInTheTable();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationTableImpl <em>Navigation Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationTableImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getNavigationTable()
		 * @generated
		 */
		EClass NAVIGATION_TABLE = eINSTANCE.getNavigationTable();

		/**
		 * The meta object literal for the '<em><b>Query Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_TABLE__QUERY_RESULTS = eINSTANCE.getNavigationTable_QueryResults();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ColumnImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__WIDTH = eINSTANCE.getColumn_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.SourceColumnImpl <em>Source Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.SourceColumnImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getSourceColumn()
		 * @generated
		 */
		EClass SOURCE_COLUMN = eINSTANCE.getSourceColumn();

		/**
		 * The meta object literal for the '<em><b>Is Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_COLUMN__IS_HIDDEN = eINSTANCE.getSourceColumn_IsHidden();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.FeatureColumnImpl <em>Feature Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.FeatureColumnImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getFeatureColumn()
		 * @generated
		 */
		EClass FEATURE_COLUMN = eINSTANCE.getFeatureColumn();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLUMN__FEATURE = eINSTANCE.getFeatureColumn_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.RowImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__ELEMENT = eINSTANCE.getRow_Element();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__HEIGHT = eINSTANCE.getRow_Height();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationRowImpl <em>Navigation Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.NavigationRowImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getNavigationRow()
		 * @generated
		 */
		EClass NAVIGATION_ROW = eINSTANCE.getNavigationRow();

		/**
		 * The meta object literal for the '<em><b>Query Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_ROW__QUERY_RESULT = eINSTANCE.getNavigationRow_QueryResult();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.PrimitiveTypeQueryRowImpl <em>Primitive Type Query Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.PrimitiveTypeQueryRowImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getPrimitiveTypeQueryRow()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_QUERY_ROW = eINSTANCE.getPrimitiveTypeQueryRow();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE_QUERY_ROW__VALUE = eINSTANCE.getPrimitiveTypeQueryRow_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.EObjectQueryRowImpl <em>EObject Query Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.EObjectQueryRowImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getEObjectQueryRow()
		 * @generated
		 */
		EClass EOBJECT_QUERY_ROW = eINSTANCE.getEObjectQueryRow();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ValueColumnImpl <em>Value Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.ValueColumnImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TablePackageImpl#getValueColumn()
		 * @generated
		 */
		EClass VALUE_COLUMN = eINSTANCE.getValueColumn();

	}

} //TablePackage
