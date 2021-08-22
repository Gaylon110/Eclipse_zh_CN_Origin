/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Gregoire Dupe (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *  Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

/**
 * 
 * @since 0.2
 * 
 */
public interface ICanBePresentedQueryDialog {

	/** Programmatically emulate a press on the OK button */
	IMustRemoveNonConformingElementsDialog pressOk();

	/** Programmatically emulate a press on the cancel button */
	void pressCancel();

	/**
	 * 
	 * @return the selected query or <code>null</code> if no query has been
	 *         selected.
	 */
	ETypedElement getSelectedQuery();

	/**
	 * @return {@link Window#OK} if the user clicked OK, or
	 *         {@link Window#CANCEL} if the user cancelled the dialog
	 */
	int getReturnCode();

	/** @return whether the user chose to remove the non-conforming elements */
	boolean getMustRemoveNonConformingElements();

	/** Programmatically select the given query in the dialog */
	void select(ETypedElement query);

	/** Add a listener that will be notified when the dialog is closed */
	void addListener(Runnable runnable);

	/** Open the dialog */
	void open();

	/** @return a shell to which the dialog is linked */
	Shell getShell();
}
