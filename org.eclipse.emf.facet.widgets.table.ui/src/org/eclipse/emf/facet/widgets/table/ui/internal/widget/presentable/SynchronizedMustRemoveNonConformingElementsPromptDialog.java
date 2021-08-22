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

import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.SynchronizedComposite;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IMustRemoveNonConformingElementsDialog;
import org.eclipse.swt.widgets.Shell;

public class SynchronizedMustRemoveNonConformingElementsPromptDialog extends
		SynchronizedComposite<Shell> implements IMustRemoveNonConformingElementsDialog {

	private final IMustRemoveNonConformingElementsDialog dialog;

	public SynchronizedMustRemoveNonConformingElementsPromptDialog(
			final IMustRemoveNonConformingElementsDialog dialog) {
		super(dialog.getShell());
		this.dialog = dialog;
	}

	public void open() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedMustRemoveNonConformingElementsPromptDialog.this.dialog.open();
			}
		});
	}

	public void pressYes() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedMustRemoveNonConformingElementsPromptDialog.this.dialog.pressYes();
			}
		});
	}

	public void pressNo() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedMustRemoveNonConformingElementsPromptDialog.this.dialog.pressNo();
			}
		});
	}

	public void addCloseListener(final java.lang.Runnable runnable) {
		this.dialog.addCloseListener(runnable);
	}

	public Boolean getMustRemoveNonConformingElements() {
		return this.dialog.getMustRemoveNonConformingElements();
	}

	public Shell getShell() {
		throw new UnsupportedOperationException();
	}

}
