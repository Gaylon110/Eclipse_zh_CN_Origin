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
package org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getTableConfiguration <em>Table Configuration</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getCustomizations <em>Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getFacetSets <em>Facet Sets</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#isHideEmptyColumns <em>Hide Empty Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#isOnlyShowCommonColumns <em>Only Show Common Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getLocalCustomizations <em>Local Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.impl.TableImpl#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends EObjectImpl implements Table {
	/**
	 * The cached value of the '{@link #getTableConfiguration() <em>Table Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableConfiguration()
	 * @generated
	 * @ordered
	 */
	protected TableConfiguration tableConfiguration;

	/**
	 * The cached value of the '{@link #getCustomizations() <em>Customizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Customization> customizations;

	/**
	 * The cached value of the '{@link #getFacetSets() <em>Facet Sets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacetSets()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetSet> facetSets;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EObject context;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final Object PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Object parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideEmptyColumns() <em>Hide Empty Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideEmptyColumns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_EMPTY_COLUMNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideEmptyColumns() <em>Hide Empty Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideEmptyColumns()
	 * @generated
	 * @ordered
	 */
	protected boolean hideEmptyColumns = HIDE_EMPTY_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnlyShowCommonColumns() <em>Only Show Common Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyShowCommonColumns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_SHOW_COMMON_COLUMNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyShowCommonColumns() <em>Only Show Common Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyShowCommonColumns()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyShowCommonColumns = ONLY_SHOW_COMMON_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The cached value of the '{@link #getLocalCustomizations() <em>Local Customizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Customization> localCustomizations;

	/**
	 * The cached value of the '{@link #getCanBePresentedInTheTable() <em>Can Be Presented In The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBePresentedInTheTable()
	 * @generated
	 * @ordered
	 */
	protected ETypedElement canBePresentedInTheTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableConfiguration getTableConfiguration() {
		if (tableConfiguration != null && tableConfiguration.eIsProxy()) {
			InternalEObject oldTableConfiguration = (InternalEObject)tableConfiguration;
			tableConfiguration = (TableConfiguration)eResolveProxy(oldTableConfiguration);
			if (tableConfiguration != oldTableConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.TABLE__TABLE_CONFIGURATION, oldTableConfiguration, tableConfiguration));
			}
		}
		return tableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableConfiguration basicGetTableConfiguration() {
		return tableConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableConfiguration(TableConfiguration newTableConfiguration) {
		TableConfiguration oldTableConfiguration = tableConfiguration;
		tableConfiguration = newTableConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__TABLE_CONFIGURATION, oldTableConfiguration, tableConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customization> getCustomizations() {
		if (customizations == null) {
			customizations = new EObjectResolvingEList<Customization>(Customization.class, this, TablePackage.TABLE__CUSTOMIZATIONS);
		}
		return customizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetSet> getFacetSets() {
		if (facetSets == null) {
			facetSets = new EObjectResolvingEList<FacetSet>(FacetSet.class, this, TablePackage.TABLE__FACET_SETS);
		}
		return facetSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.TABLE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(EObject newContext) {
		EObject oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Object newParameter) {
		Object oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideEmptyColumns() {
		return hideEmptyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideEmptyColumns(boolean newHideEmptyColumns) {
		boolean oldHideEmptyColumns = hideEmptyColumns;
		hideEmptyColumns = newHideEmptyColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__HIDE_EMPTY_COLUMNS, oldHideEmptyColumns, hideEmptyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyShowCommonColumns() {
		return onlyShowCommonColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyShowCommonColumns(boolean newOnlyShowCommonColumns) {
		boolean oldOnlyShowCommonColumns = onlyShowCommonColumns;
		onlyShowCommonColumns = newOnlyShowCommonColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__ONLY_SHOW_COMMON_COLUMNS, oldOnlyShowCommonColumns, onlyShowCommonColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, TablePackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, TablePackage.TABLE__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customization> getLocalCustomizations() {
		if (localCustomizations == null) {
			localCustomizations = new EObjectContainmentEList<Customization>(Customization.class, this, TablePackage.TABLE__LOCAL_CUSTOMIZATIONS);
		}
		return localCustomizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement getCanBePresentedInTheTable() {
		if (canBePresentedInTheTable != null && canBePresentedInTheTable.eIsProxy()) {
			InternalEObject oldCanBePresentedInTheTable = (InternalEObject)canBePresentedInTheTable;
			canBePresentedInTheTable = (ETypedElement)eResolveProxy(oldCanBePresentedInTheTable);
			if (canBePresentedInTheTable != oldCanBePresentedInTheTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE, oldCanBePresentedInTheTable, canBePresentedInTheTable));
			}
		}
		return canBePresentedInTheTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement basicGetCanBePresentedInTheTable() {
		return canBePresentedInTheTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBePresentedInTheTable(ETypedElement newCanBePresentedInTheTable) {
		ETypedElement oldCanBePresentedInTheTable = canBePresentedInTheTable;
		canBePresentedInTheTable = newCanBePresentedInTheTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE, oldCanBePresentedInTheTable, canBePresentedInTheTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE__LOCAL_CUSTOMIZATIONS:
				return ((InternalEList<?>)getLocalCustomizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.TABLE__TABLE_CONFIGURATION:
				if (resolve) return getTableConfiguration();
				return basicGetTableConfiguration();
			case TablePackage.TABLE__CUSTOMIZATIONS:
				return getCustomizations();
			case TablePackage.TABLE__FACET_SETS:
				return getFacetSets();
			case TablePackage.TABLE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case TablePackage.TABLE__PARAMETER:
				return getParameter();
			case TablePackage.TABLE__HIDE_EMPTY_COLUMNS:
				return isHideEmptyColumns();
			case TablePackage.TABLE__ONLY_SHOW_COMMON_COLUMNS:
				return isOnlyShowCommonColumns();
			case TablePackage.TABLE__DESCRIPTION:
				return getDescription();
			case TablePackage.TABLE__COLUMNS:
				return getColumns();
			case TablePackage.TABLE__ROWS:
				return getRows();
			case TablePackage.TABLE__LOCAL_CUSTOMIZATIONS:
				return getLocalCustomizations();
			case TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE:
				if (resolve) return getCanBePresentedInTheTable();
				return basicGetCanBePresentedInTheTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablePackage.TABLE__TABLE_CONFIGURATION:
				setTableConfiguration((TableConfiguration)newValue);
				return;
			case TablePackage.TABLE__CUSTOMIZATIONS:
				getCustomizations().clear();
				getCustomizations().addAll((Collection<? extends Customization>)newValue);
				return;
			case TablePackage.TABLE__FACET_SETS:
				getFacetSets().clear();
				getFacetSets().addAll((Collection<? extends FacetSet>)newValue);
				return;
			case TablePackage.TABLE__CONTEXT:
				setContext((EObject)newValue);
				return;
			case TablePackage.TABLE__PARAMETER:
				setParameter(newValue);
				return;
			case TablePackage.TABLE__HIDE_EMPTY_COLUMNS:
				setHideEmptyColumns((Boolean)newValue);
				return;
			case TablePackage.TABLE__ONLY_SHOW_COMMON_COLUMNS:
				setOnlyShowCommonColumns((Boolean)newValue);
				return;
			case TablePackage.TABLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TablePackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case TablePackage.TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case TablePackage.TABLE__LOCAL_CUSTOMIZATIONS:
				getLocalCustomizations().clear();
				getLocalCustomizations().addAll((Collection<? extends Customization>)newValue);
				return;
			case TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE:
				setCanBePresentedInTheTable((ETypedElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TablePackage.TABLE__TABLE_CONFIGURATION:
				setTableConfiguration((TableConfiguration)null);
				return;
			case TablePackage.TABLE__CUSTOMIZATIONS:
				getCustomizations().clear();
				return;
			case TablePackage.TABLE__FACET_SETS:
				getFacetSets().clear();
				return;
			case TablePackage.TABLE__CONTEXT:
				setContext((EObject)null);
				return;
			case TablePackage.TABLE__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case TablePackage.TABLE__HIDE_EMPTY_COLUMNS:
				setHideEmptyColumns(HIDE_EMPTY_COLUMNS_EDEFAULT);
				return;
			case TablePackage.TABLE__ONLY_SHOW_COMMON_COLUMNS:
				setOnlyShowCommonColumns(ONLY_SHOW_COMMON_COLUMNS_EDEFAULT);
				return;
			case TablePackage.TABLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TablePackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case TablePackage.TABLE__ROWS:
				getRows().clear();
				return;
			case TablePackage.TABLE__LOCAL_CUSTOMIZATIONS:
				getLocalCustomizations().clear();
				return;
			case TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE:
				setCanBePresentedInTheTable((ETypedElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TablePackage.TABLE__TABLE_CONFIGURATION:
				return tableConfiguration != null;
			case TablePackage.TABLE__CUSTOMIZATIONS:
				return customizations != null && !customizations.isEmpty();
			case TablePackage.TABLE__FACET_SETS:
				return facetSets != null && !facetSets.isEmpty();
			case TablePackage.TABLE__CONTEXT:
				return context != null;
			case TablePackage.TABLE__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case TablePackage.TABLE__HIDE_EMPTY_COLUMNS:
				return hideEmptyColumns != HIDE_EMPTY_COLUMNS_EDEFAULT;
			case TablePackage.TABLE__ONLY_SHOW_COMMON_COLUMNS:
				return onlyShowCommonColumns != ONLY_SHOW_COMMON_COLUMNS_EDEFAULT;
			case TablePackage.TABLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TablePackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case TablePackage.TABLE__ROWS:
				return rows != null && !rows.isEmpty();
			case TablePackage.TABLE__LOCAL_CUSTOMIZATIONS:
				return localCustomizations != null && !localCustomizations.isEmpty();
			case TablePackage.TABLE__CAN_BE_PRESENTED_IN_THE_TABLE:
				return canBePresentedInTheTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (parameter: ");
		result.append(parameter);
		result.append(", hideEmptyColumns: ");
		result.append(hideEmptyColumns);
		result.append(", onlyShowCommonColumns: ");
		result.append(onlyShowCommonColumns);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TableImpl
