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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultLocalCustomizations <em>Default Local Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getForcedCellEditors <em>Forced Cell Editors</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultFacets <em>Default Facets</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultCustomizations <em>Default Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getInstantiationMethod <em>Instantiation Method</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getDefaultColumns <em>Default Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration()
 * @model
 * @generated
 * 
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface TableConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Local Customizations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.custom.metamodel.custom.Customization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Local Customizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Local Customizations</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_DefaultLocalCustomizations()
	 * @model
	 * @generated
	 */
	EList<Customization> getDefaultLocalCustomizations();

	/**
	 * Returns the value of the '<em><b>Can Be Presented In The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Be Presented In The Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Presented In The Table</em>' reference.
	 * @see #setCanBePresentedInTheTable(FacetElement)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_CanBePresentedInTheTable()
	 * @model
	 * @generated
	 */
	FacetElement getCanBePresentedInTheTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Presented In The Table</em>' reference.
	 * @see #getCanBePresentedInTheTable()
	 * @generated
	 */
	void setCanBePresentedInTheTable(FacetElement value);

	/**
	 * Returns the value of the '<em><b>Forced Cell Editors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Cell Editors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Cell Editors</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_ForcedCellEditors()
	 * @model
	 * @generated
	 */
	EList<AbstractModelCellEditor> getForcedCellEditors();

	/**
	 * Returns the value of the '<em><b>Default Facets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Facets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Facets</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_DefaultFacets()
	 * @model
	 * @generated
	 */
	EList<Facet> getDefaultFacets();

	/**
	 * Returns the value of the '<em><b>Default Customizations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.custom.metamodel.custom.Customization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Customizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Customizations</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_DefaultCustomizations()
	 * @model
	 * @generated
	 */
	EList<Customization> getDefaultCustomizations();

	/**
	 * Returns the value of the '<em><b>Instantiation Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation Method</em>' containment reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_InstantiationMethod()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstantiationMethod> getInstantiationMethod();

	/**
	 * Returns the value of the '<em><b>Default Columns</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the columns declared here will be created in the table instance when no column exists, even if the table contains no row. The additional reference?s type must be ETypedElement otherwise we will not be able to managed the operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Columns</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage#getTableConfiguration_DefaultColumns()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getDefaultColumns();

} // TableConfiguration
