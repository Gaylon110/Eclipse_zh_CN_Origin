/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
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
 *   Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("PMD")
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.facet.widgets.table.ui.nattable.internal.messages"; //$NON-NLS-1$
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
	public static String NatTableWidget_instantiationMethodSelectionTitle;
	public static String NatTableWidget_label;
	public static String NatTableWidget_metaclass;
	public static String NatTableWidget_queryContext;
	public static String NatTableWidget_selectColumnToShowHide;
	public static String TableLabelProvider_NA;
	public static String TableLabelProvider_none;
	public static String TableLabelProvider_null;
	public static String CustomizedCellPainter_error_msg;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
