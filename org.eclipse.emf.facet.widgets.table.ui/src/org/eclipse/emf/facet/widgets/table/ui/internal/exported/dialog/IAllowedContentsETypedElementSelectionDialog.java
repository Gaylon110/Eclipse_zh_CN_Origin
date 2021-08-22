/*****************************************************************************
 * Copyright (c) 2012 CEA LIST.
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

import org.eclipse.emf.ecore.ETypedElement;

/**
 * A dialog to let a user select a boolean ETypedElement whose value will determine which elements are allowed to appear
 * in a table.
 * 
 * @since 0.2
 */
public interface IAllowedContentsETypedElementSelectionDialog {

	/**
	 * Programmatically emulate a press on the OK button
	 * 
	 * @return the dialog that asks whether to remove non-allowed elements, or <code>null</code> if it wasn't opened
	 */
	IMustRemoveNonConformingElementsDialog pressOk();

	/** Programmatically emulate a press on the cancel button */
	void pressCancel();
	
	/** Programmatically select the given ETypedElement in the dialog; <code>null</code> to clear the selection */
	void select(ETypedElement typedElement);
}
