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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * The preference initializer for the nattable editor
 * 
 * 
 * 
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setValue(PreferenceConstants.MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM, true);
		store.setValue(PreferenceConstants.MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM, "Yes"); //$NON-NLS-1$ //TODO those string should be externalized
	}

}
