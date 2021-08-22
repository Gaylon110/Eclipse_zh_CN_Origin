/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.preferences;

import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;

public final class PreferenceConstants {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());  
	
	private PreferenceConstants() {
		// constants class: no need to instantiate
	}

	static final String MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM = "nattable_editor_select_column_to_hide"; //$NON-NLS-1$

	static final String MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM = "answer_nattable_editor_select_column_to_hide"; //$NON-NLS-1$
	
	public static boolean isMustPutOnTheTopTheLocalCustom() {
		return Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM);
	}

	public static boolean isAskToPutOnTheTopTheLocalCustomization() {
		return !Activator
				.getDefault()
				.getPreferenceStore()
				.getBoolean(
						PreferenceConstants.MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM);
	}
	
	public static void setMustPutOnTheTopTheLocalCustom(final boolean putOnTheTop) {
		PreferenceConstants.debug("MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM switched to: " + putOnTheTop); //$NON-NLS-1$
		Activator.getDefault().getPreferenceStore().setValue(PreferenceConstants.MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM, putOnTheTop);
	}

	public static void setAskToPutOnTheTopTheLocalCustomization(final boolean askNexTime) {
		PreferenceConstants.debug("MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM switched to: " + askNexTime); //$NON-NLS-1$
		Activator.getDefault().getPreferenceStore().setValue(PreferenceConstants.MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM, !askNexTime);
	}
	
	private static void debug(final String message) {
		if (PreferenceConstants.DEBUG) {
			DebugUtils.debug(message, 1);
		}
	}
}
