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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetElement;
import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getDefaultLocalCustomizations <em>Default Local Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getCanBePresentedInTheTable <em>Can Be Presented In The Table</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getForcedCellEditors <em>Forced Cell Editors</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getDefaultFacets <em>Default Facets</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getDefaultCustomizations <em>Default Customizations</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getInstantiationMethod <em>Instantiation Method</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.impl.TableConfigurationImpl#getDefaultColumns <em>Default Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableConfigurationImpl extends EObjectImpl implements TableConfiguration {
	/**
	 * The cached value of the '{@link #getDefaultLocalCustomizations() <em>Default Local Customizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocalCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Customization> defaultLocalCustomizations;

	/**
	 * The cached value of the '{@link #getCanBePresentedInTheTable() <em>Can Be Presented In The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBePresentedInTheTable()
	 * @generated
	 * @ordered
	 */
	protected FacetElement canBePresentedInTheTable;

	/**
	 * The cached value of the '{@link #getForcedCellEditors() <em>Forced Cell Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForcedCellEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractModelCellEditor> forcedCellEditors;

	/**
	 * The cached value of the '{@link #getDefaultFacets() <em>Default Facets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFacets()
	 * @generated
	 * @ordered
	 */
	protected EList<Facet> defaultFacets;

	/**
	 * The cached value of the '{@link #getDefaultCustomizations() <em>Default Customizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCustomizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Customization> defaultCustomizations;

	/**
	 * The cached value of the '{@link #getInstantiationMethod() <em>Instantiation Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiationMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<InstantiationMethod> instantiationMethod;

	/**
	 * The cached value of the '{@link #getDefaultColumns() <em>Default Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypedElement> defaultColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableconfigurationPackage.Literals.TABLE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customization> getDefaultLocalCustomizations() {
		if (defaultLocalCustomizations == null) {
			defaultLocalCustomizations = new EObjectResolvingEList<Customization>(Customization.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS);
		}
		return defaultLocalCustomizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetElement getCanBePresentedInTheTable() {
		if (canBePresentedInTheTable != null && canBePresentedInTheTable.eIsProxy()) {
			InternalEObject oldCanBePresentedInTheTable = (InternalEObject)canBePresentedInTheTable;
			canBePresentedInTheTable = (FacetElement)eResolveProxy(oldCanBePresentedInTheTable);
			if (canBePresentedInTheTable != oldCanBePresentedInTheTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE, oldCanBePresentedInTheTable, canBePresentedInTheTable));
			}
		}
		return canBePresentedInTheTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetElement basicGetCanBePresentedInTheTable() {
		return canBePresentedInTheTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanBePresentedInTheTable(FacetElement newCanBePresentedInTheTable) {
		FacetElement oldCanBePresentedInTheTable = canBePresentedInTheTable;
		canBePresentedInTheTable = newCanBePresentedInTheTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE, oldCanBePresentedInTheTable, canBePresentedInTheTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModelCellEditor> getForcedCellEditors() {
		if (forcedCellEditors == null) {
			forcedCellEditors = new EObjectResolvingEList<AbstractModelCellEditor>(AbstractModelCellEditor.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__FORCED_CELL_EDITORS);
		}
		return forcedCellEditors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Facet> getDefaultFacets() {
		if (defaultFacets == null) {
			defaultFacets = new EObjectResolvingEList<Facet>(Facet.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_FACETS);
		}
		return defaultFacets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Customization> getDefaultCustomizations() {
		if (defaultCustomizations == null) {
			defaultCustomizations = new EObjectResolvingEList<Customization>(Customization.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS);
		}
		return defaultCustomizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstantiationMethod> getInstantiationMethod() {
		if (instantiationMethod == null) {
			instantiationMethod = new EObjectContainmentEList<InstantiationMethod>(InstantiationMethod.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD);
		}
		return instantiationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypedElement> getDefaultColumns() {
		if (defaultColumns == null) {
			defaultColumns = new EObjectResolvingEList<ETypedElement>(ETypedElement.class, this, TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_COLUMNS);
		}
		return defaultColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD:
				return ((InternalEList<?>)getInstantiationMethod()).basicRemove(otherEnd, msgs);
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
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS:
				return getDefaultLocalCustomizations();
			case TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE:
				if (resolve) return getCanBePresentedInTheTable();
				return basicGetCanBePresentedInTheTable();
			case TableconfigurationPackage.TABLE_CONFIGURATION__FORCED_CELL_EDITORS:
				return getForcedCellEditors();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_FACETS:
				return getDefaultFacets();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS:
				return getDefaultCustomizations();
			case TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD:
				return getInstantiationMethod();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_COLUMNS:
				return getDefaultColumns();
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
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS:
				getDefaultLocalCustomizations().clear();
				getDefaultLocalCustomizations().addAll((Collection<? extends Customization>)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE:
				setCanBePresentedInTheTable((FacetElement)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__FORCED_CELL_EDITORS:
				getForcedCellEditors().clear();
				getForcedCellEditors().addAll((Collection<? extends AbstractModelCellEditor>)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_FACETS:
				getDefaultFacets().clear();
				getDefaultFacets().addAll((Collection<? extends Facet>)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS:
				getDefaultCustomizations().clear();
				getDefaultCustomizations().addAll((Collection<? extends Customization>)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD:
				getInstantiationMethod().clear();
				getInstantiationMethod().addAll((Collection<? extends InstantiationMethod>)newValue);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_COLUMNS:
				getDefaultColumns().clear();
				getDefaultColumns().addAll((Collection<? extends ETypedElement>)newValue);
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
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS:
				getDefaultLocalCustomizations().clear();
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE:
				setCanBePresentedInTheTable((FacetElement)null);
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__FORCED_CELL_EDITORS:
				getForcedCellEditors().clear();
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_FACETS:
				getDefaultFacets().clear();
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS:
				getDefaultCustomizations().clear();
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD:
				getInstantiationMethod().clear();
				return;
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_COLUMNS:
				getDefaultColumns().clear();
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
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_LOCAL_CUSTOMIZATIONS:
				return defaultLocalCustomizations != null && !defaultLocalCustomizations.isEmpty();
			case TableconfigurationPackage.TABLE_CONFIGURATION__CAN_BE_PRESENTED_IN_THE_TABLE:
				return canBePresentedInTheTable != null;
			case TableconfigurationPackage.TABLE_CONFIGURATION__FORCED_CELL_EDITORS:
				return forcedCellEditors != null && !forcedCellEditors.isEmpty();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_FACETS:
				return defaultFacets != null && !defaultFacets.isEmpty();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_CUSTOMIZATIONS:
				return defaultCustomizations != null && !defaultCustomizations.isEmpty();
			case TableconfigurationPackage.TABLE_CONFIGURATION__INSTANTIATION_METHOD:
				return instantiationMethod != null && !instantiationMethod.isEmpty();
			case TableconfigurationPackage.TABLE_CONFIGURATION__DEFAULT_COLUMNS:
				return defaultColumns != null && !defaultColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableConfigurationImpl
