/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *   Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *   Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *   Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *   Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *   Thomas Cicognani (Soft-Maint) - Bug 468160 -  Empty table displays a message
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("PMD")
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.facet.widgets.table.ui.internal.messages"; //$NON-NLS-1$
	public static String BodyDataProvider_cannotUnset;
	public static String BodyDataProvider_featureIsComposite;
	public static String BodyDataProvider_featureIsNotUnsettable;
	public static String BodyDataProvider_moveElement;
	public static String BodyDataProvider_valueWillBeMoved;
	public static String BodyDataProvider_valueWillBeMovedAndPreviousLost;
	public static String NatTableDropListener_compositeFeature;
	public static String NatTableDropListener_moveElement;
	public static String NatTableDropListener_valueWillBeMoved;
	public static String NatTableDropListener_valueWillBeMovedAndPreviousLost;
	public static String wrongEObjectType;
	public static String wrongEObjectTypeLong;
	public static String NatTableWidget_error;
	public static String NatTableWidget_instantiationMethodSelectionTitle;
	public static String NatTableWidget_label;
	public static String NatTableWidget_metaclass;
	public static String NatTableWidget_queryContext;
	public static String removeNonPresentableElements;
	public static String removeNonPresentableElementsTitle;
	public static String NatTableWidget_selectColumnToShowHide;
	public static String TableCommandFactory_row_sort_description;
	public static String TableCommandFactory_row_sort_label;
	public static String TableInstanceCommandFactory_addFacetColumn;
	public static String TableInstanceCommandFactory_customizationLoad;
	public static String TableInstanceCommandFactory_removeUselessColumn;
	public static String TableInstanceCommandFactory_setFacet;
	public static String NatTableWidget_setPresentabilityQuery;
	public static String TableLabelProvider_NA;
	public static String TableLabelProvider_none;
	public static String TableLabelProvider_null;
	public static String TableUtils_FailToLoadFacetsLongMsg;
	public static String TableUtils_FailToLoadFacetsShortMsg;
	public static String TableWidgetController_DeleteUselessRows;
	public static String TableWidgetController_Remove_columns_after_facetSet_setting_long;
	public static String TableWidgetController_Remove_columns_after_facetSet_setting_short;
	public static String TableWidgetController_RemoveUselessRowsAndColumns;
	public static String TableWidgetController_EmptyTable;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
