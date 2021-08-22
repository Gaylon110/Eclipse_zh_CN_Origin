/*****************************************************************************
 * Copyright (c) 2011-2012 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *    Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

import org.eclipse.swt.widgets.Shell;

/**
 * 
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IMustRemoveNonConformingElementsDialog {
	void open();

	void pressYes();

	void pressNo();

	/** Add a listener that will be modified when the dialog closes */
	void addCloseListener(Runnable runnable);

	/**
	 * Get the user choice
	 * 
	 * @return whether the user chose to remove the non-conforming elements or <code>null</code> if the dialog has been
	 *         cancelled
	 */
	Boolean getMustRemoveNonConformingElements();

	Shell getShell();
}
