/**
 *  Copyright (c) 2012 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 */
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.presentable;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialogInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IMustRemoveNonConformingElementsDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SynchronizedPresentabilityETypedElementSelectionDialog
		extends
		SynchronizedObject<IAllowedContentsETypedElementSelectionDialogInternal>
		implements IAllowedContentsETypedElementSelectionDialogInternal {

	public SynchronizedPresentabilityETypedElementSelectionDialog(
			final IAllowedContentsETypedElementSelectionDialogInternal object,
			final Display display) {
		super(object, display);
	}

	public IMustRemoveNonConformingElementsDialog pressOk() {
		return this
				.safeSyncExec(new AbstractExceptionFreeRunnable<IMustRemoveNonConformingElementsDialog>() {
					@Override
					public IMustRemoveNonConformingElementsDialog safeRun() {
						return SynchronizedPresentabilityETypedElementSelectionDialog.this
								.getSynchronizedObject().pressOk();
					}
				});
	}

	public void pressCancel() {
		this.voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedPresentabilityETypedElementSelectionDialog.this
						.getSynchronizedObject().pressCancel();
			}
		});
	}

	public void select(final ETypedElement typedElement) {
		this.voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedPresentabilityETypedElementSelectionDialog.this
						.getSynchronizedObject().select(typedElement);
			}
		});
	}

	public ETypedElement getSelectedETypedElement() {
		return this
				.safeSyncExec(new AbstractExceptionFreeRunnable<ETypedElement>() {
					@Override
					public ETypedElement safeRun() {
						return SynchronizedPresentabilityETypedElementSelectionDialog.this
								.getSynchronizedObject()
								.getSelectedETypedElement();
					}
				});
	}

	public int getReturnCode() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Integer>() {
			@Override
			public Integer safeRun() {
				return Integer
						.valueOf(SynchronizedPresentabilityETypedElementSelectionDialog.this
								.getSynchronizedObject().getReturnCode());
			}
		}).intValue();
	}

	public boolean getMustRemoveNonConformingElements() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			public Boolean safeRun() {
				return Boolean
						.valueOf(SynchronizedPresentabilityETypedElementSelectionDialog.this
								.getSynchronizedObject()
								.getMustRemoveNonConformingElements());
			}
		}).booleanValue();
	}

	public Shell getShell() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Shell>() {
			@Override
			public Shell safeRun() {
				return SynchronizedPresentabilityETypedElementSelectionDialog.this
						.getSynchronizedObject().getShell();
			}
		});
	}

	public void open() {
		this.voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedPresentabilityETypedElementSelectionDialog.this
						.getSynchronizedObject().pressCancel();
			}
		});
	}

}
