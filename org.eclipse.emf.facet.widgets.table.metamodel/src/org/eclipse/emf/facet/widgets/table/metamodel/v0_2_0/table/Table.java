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
 *    Gregoire Dupe (Mia-Software) - Bug 340572 - Wrong multiplicity in Table.facets
 *    Nicolas Guyomar (Mia-Software) - Bug 340941 - Need new row and column types in the table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getTableConfiguration <em>Table Configuration</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCustomizations <em>Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getFacetSets <em>Facet Sets</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isHideEmptyColumns <em>Hide Empty Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isOnlyShowCommonColumns <em>Only Show Common Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getLocalCustomizations <em>Local Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Configuration</em>' reference.
	 * @see #setTableConfiguration(TableConfiguration)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_TableConfiguration()
	 * @model
	 * @generated
	 */
	TableConfiguration getTableConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getTableConfiguration <em>Table Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Configuration</em>' reference.
	 * @see #getTableConfiguration()
	 * @generated
	 */
	void setTableConfiguration(TableConfiguration value);

	/**
	 * Returns the value of the '<em><b>Customizations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customizations</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Customizations()
	 * @model
	 * @generated
	 */
	EList<Customization> getCustomizations();

	/**
	 * Returns the value of the '<em><b>Facet Sets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facet Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facet Sets</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_FacetSets()
	 * @model
	 * @generated
	 */
	EList<FacetSet> getFacetSets();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Context is the parameter given to the instantiationMethod's query to be the instantiated element's container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(EObject)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Context()
	 * @model
	 * @generated
	 */
	EObject getContext();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(EObject value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameterValues parameter contains a value that you can retrieve using the key InstantiationMethodParameters.getEditingDomainParameter().getName().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(Object)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Parameter()
	 * @model
	 * @generated
	 */
	Object getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Object value);

	/**
	 * Returns the value of the '<em><b>Hide Empty Columns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to hide columns which don't contain any elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hide Empty Columns</em>' attribute.
	 * @see #setHideEmptyColumns(boolean)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_HideEmptyColumns()
	 * @model default="false"
	 * @generated
	 */
	boolean isHideEmptyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isHideEmptyColumns <em>Hide Empty Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Empty Columns</em>' attribute.
	 * @see #isHideEmptyColumns()
	 * @generated
	 */
	void setHideEmptyColumns(boolean value);

	/**
	 * Returns the value of the '<em><b>Only Show Common Columns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whether to show columns which are specific to a few elements (false), or only columns which are common to all the elements (true).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Only Show Common Columns</em>' attribute.
	 * @see #setOnlyShowCommonColumns(boolean)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_OnlyShowCommonColumns()
	 * @model default="false"
	 * @generated
	 */
	boolean isOnlyShowCommonColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#isOnlyShowCommonColumns <em>Only Show Common Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Show Common Columns</em>' attribute.
	 * @see #isOnlyShowCommonColumns()
	 * @generated
	 */
	void setOnlyShowCommonColumns(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the tableInstance (content, purpose, uses  ... )
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_Elements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */

	/**
	 * Returns the value of the '<em><b>Local Customizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Customizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Customizations</em>' containment reference list.
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_LocalCustomizations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Customization> getLocalCustomizations();

	/**
	 * Returns the value of the '<em><b>Can Be Presented In The Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A query that determines which elements are allowed in the table
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Be Presented In The Table</em>' reference.
	 * @see #setCanBePresentedInTheTable(ETypedElement)
	 * @see org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage#getTable_CanBePresentedInTheTable()
	 * @model
	 * @generated
	 */
	ETypedElement getCanBePresentedInTheTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Presented In The Table</em>' reference.
	 * @see #getCanBePresentedInTheTable()
	 * @generated
	 */
	void setCanBePresentedInTheTable(ETypedElement value);

} // Table
