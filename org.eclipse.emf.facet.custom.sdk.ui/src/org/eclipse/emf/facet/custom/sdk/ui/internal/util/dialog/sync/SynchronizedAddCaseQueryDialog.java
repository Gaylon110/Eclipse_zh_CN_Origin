/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.emf.facet.custom.sdk.ui.internal.util.dialog.sync;

import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IDialog;
import org.eclipse.emf.facet.util.ui.internal.exported.util.dialog.SynchronizedAbstractDialog;
import org.eclipse.swt.widgets.Display;

/**
 * Synchronized class for safe run.
 */
public class SynchronizedAddCaseQueryDialog extends
		SynchronizedAbstractDialog<IDialog> {

	/**
	 * Constructor.
	 * 
	 * @param object
	 *            the to synchronized.
	 * @param display
	 *            the display.
	 */
	public SynchronizedAddCaseQueryDialog(final IDialog object,
			final Display display) {
		super(object, display);
	}
}
