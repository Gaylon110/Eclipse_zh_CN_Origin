/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *     Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

public interface IAllowedContentsETypedElementSelectionDialogInternal extends IAllowedContentsETypedElementSelectionDialog {

	/** @return the selected ETypedElement or <code>null</code> if no ETypedElement has been selected. */
	ETypedElement getSelectedETypedElement();

	/** @return {@link Window#OK} if the user clicked OK, or {@link Window#CANCEL} if the user cancelled the dialog */
	int getReturnCode();

	/** @return whether the user chose to remove the non-conforming elements */
	boolean getMustRemoveNonConformingElements();

	/** @return a shell to which the dialog is linked */
	Shell getShell();
	
	// The operation 'open' is required because if the factory method (or the
	// new)
	// blocks algorithm execution. We will not be able to execute parallel
	// operations (interacting with the dialog) while the dialog is not closed.
	// To be able to execute parallel
	// operations we have write to methods on to create the instance and an
	// other one to open the dialog (in a other thread).
	void open();
}
