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
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration;

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
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationFactory
 * @model kind="package"
 * @generated
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface TableconfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tableconfiguration"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/facet/widgets/table/0.2.0.incubation/tableconfiguration"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tableconfiguration"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableconfigurationPackage eINSTANCE = org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl <em>Table Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationPackageImpl#getTableConfiguration()
	 * @generated
	 */
	int TABLE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Default Local Customizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS = 0;

	/**
	 * The feature id for the '<em><b>Can Be Presented In The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Forced Cell Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__FORCED_CELL_EDITORS = 2;

	/**
	 * The feature id for the '<em><b>Default Facets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__DEFAULT_FACETS = 3;

	/**
	 * The feature id for the '<em><b>Default Customizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS = 4;

	/**
	 * The feature id for the '<em><b>Instantiation Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__INSTANTIATION_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Default Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION__DEFAULT_COLUMNS = 6;

	/**
	 * The number of structural features of the '<em>Table Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONFIGURATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl <em>Instantiation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationPackageImpl#getInstantiationMethod()
	 * @generated
	 */
	int INSTANTIATION_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_METHOD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Instantiation Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_METHOD__INSTANTIATION_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Instantiation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_METHOD_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration <em>Table Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Configuration</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration
	 * @generated
	 */
	EClass getTableConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultLocalCustomizations <em>Default Local Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Local Customizations</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultLocalCustomizations()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_DefaultLocalCustomizations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Can Be Presented In The Table</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getCanBePresentedInTheTable()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_CanBePresentedInTheTable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getForcedCellEditors <em>Forced Cell Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forced Cell Editors</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getForcedCellEditors()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_ForcedCellEditors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultFacets <em>Default Facets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Facets</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultFacets()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_DefaultFacets();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultCustomizations <em>Default Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Customizations</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultCustomizations()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_DefaultCustomizations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getInstantiationMethod <em>Instantiation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instantiation Method</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getInstantiationMethod()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_InstantiationMethod();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultColumns <em>Default Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Default Columns</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultColumns()
	 * @see #getTableConfiguration()
	 * @generated
	 */
	EReference getTableConfiguration_DefaultColumns();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod <em>Instantiation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Method</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod
	 * @generated
	 */
	EClass getInstantiationMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getName()
	 * @see #getInstantiationMethod()
	 * @generated
	 */
	EAttribute getInstantiationMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getDescription()
	 * @see #getInstantiationMethod()
	 * @generated
	 */
	EAttribute getInstantiationMethod_Description();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getInstantiationOperation <em>Instantiation Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiation Operation</em>'.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod#getInstantiationOperation()
	 * @see #getInstantiationMethod()
	 * @generated
	 */
	EReference getInstantiationMethod_InstantiationOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableconfigurationFactory getTableconfigurationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl <em>Table Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationPackageImpl#getTableConfiguration()
		 * @generated
		 */
		EClass TABLE_CONFIGURATION = eINSTANCE.getTableConfiguration();

		/**
		 * The meta object literal for the '<em><b>Default Local Customizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS = eINSTANCE.getTableConfiguration_DefaultLocalCustomizations();

		/**
		 * The meta object literal for the '<em><b>Can Be Presented In The Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE = eINSTANCE.getTableConfiguration_CanBePresentedInTheTable();

		/**
		 * The meta object literal for the '<em><b>Forced Cell Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__FORCED_CELL_EDITORS = eINSTANCE.getTableConfiguration_ForcedCellEditors();

		/**
		 * The meta object literal for the '<em><b>Default Facets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__DEFAULT_FACETS = eINSTANCE.getTableConfiguration_DefaultFacets();

		/**
		 * The meta object literal for the '<em><b>Default Customizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS = eINSTANCE.getTableConfiguration_DefaultCustomizations();

		/**
		 * The meta object literal for the '<em><b>Instantiation Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__INSTANTIATION_METHOD = eINSTANCE.getTableConfiguration_InstantiationMethod();

		/**
		 * The meta object literal for the '<em><b>Default Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONFIGURATION__DEFAULT_COLUMNS = eINSTANCE.getTableConfiguration_DefaultColumns();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl <em>Instantiation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.InstantiationMethodImpl
		 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableconfigurationPackageImpl#getInstantiationMethod()
		 * @generated
		 */
		EClass INSTANTIATION_METHOD = eINSTANCE.getInstantiationMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION_METHOD__NAME = eINSTANCE.getInstantiationMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION_METHOD__DESCRIPTION = eINSTANCE.getInstantiationMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Instantiation Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_METHOD__INSTANTIATION_OPERATION = eINSTANCE.getInstantiationMethod_InstantiationOperation();

	}

} //TableconfigurationPackage
