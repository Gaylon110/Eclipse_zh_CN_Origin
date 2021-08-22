/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.presentable;

import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialog;
import org.eclipse.emf.facet.util.ui.internal.exported.dialog.IQuestionDialogFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IMustRemoveNonConformingElementsDialog;
import org.eclipse.swt.widgets.Shell;

public class MustRemoveNonConformingElementsPromptDialog implements IMustRemoveNonConformingElementsDialog {

	private final IQuestionDialog delegate;

	public MustRemoveNonConformingElementsPromptDialog(final Shell parent) {
		this.delegate = IQuestionDialogFactory.INSTANCE.createQuestionDialog(parent, 
				Messages.removeNonPresentableElementsTitle,
				Messages.removeNonPresentableElements);
	}

	public Boolean getMustRemoveNonConformingElements() {
		return this.delegate.getResult();
	}

	public void open() {
		this.delegate.open();
	}

	public void pressYes() {
		this.delegate.pressYes();
	}

	public void pressNo() {
		this.delegate.pressNo();
	}

	public void addCloseListener(final Runnable runnable) {
		this.delegate.addCloseListener(runnable);
	}

	public Shell getShell() {
		return this.delegate.getShell();
	}
}
