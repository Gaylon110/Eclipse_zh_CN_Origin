/**
 *  Copyright (c) 2015 Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *       Thomas Cicognani (Soft-Maint) - Bug 471649 - Improve customization editor labels
 */
package org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.provider;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.provider.messages"; //$NON-NLS-1$
	public static String EClassCustomizationItemProvider_Custom_of;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
