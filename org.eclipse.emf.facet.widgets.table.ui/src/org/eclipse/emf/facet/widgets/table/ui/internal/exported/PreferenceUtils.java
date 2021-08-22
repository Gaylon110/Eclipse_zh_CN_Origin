/*****************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import org.eclipse.emf.facet.widgets.table.ui.internal.widget.preferences.PreferenceConstants;

public final class PreferenceUtils {

	private PreferenceUtils() {
		//Must not be used
	}
	
	public static void setMustPutOnTheTopTheLocalCustom(final boolean putOnTheTop) {
		PreferenceConstants.setMustPutOnTheTopTheLocalCustom(putOnTheTop);
	}
	
	public static void setAskToPutOnTheTopTheLocalCustomization(final boolean askNexTime) {
		PreferenceConstants.setAskToPutOnTheTopTheLocalCustomization(askNexTime);
	}

	public static boolean isMustPutOnTheTopTheLocalCustom() {
		return PreferenceConstants.isMustPutOnTheTopTheLocalCustom();
	}
	
	public static boolean isAskToPutOnTheTopTheLocalCustomization() {
		return PreferenceConstants.isAskToPutOnTheTopTheLocalCustomization();
	}
}
