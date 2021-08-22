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
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.column;

import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IPutOnTheTopQuestionDialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

public class PutOnTheTopQuestionDialog extends MessageDialogWithToggle implements IPutOnTheTopQuestionDialog {

	public PutOnTheTopQuestionDialog(final Shell parentShell, final String dialogTitle,
			final Image image, final String message, final int dialogImageType,
			final String[] dialogButtonLabels, final int defaultIndex, final String toggleMessage,
			final boolean toggleState) {
		super(parentShell, dialogTitle, image, message, dialogImageType, dialogButtonLabels,
				defaultIndex, toggleMessage, toggleState);
	}

	@Override
	public int open() {
		int returnCode = super.open();
		if (returnCode != IDialogConstants.YES_ID && returnCode != IDialogConstants.NO_ID) {
			return open();
		}
		return returnCode;
	}

	public void pressYes() {
		buttonPressed(IDialogConstants.YES_ID);
	}

	public boolean isAskTheUserNextTime() {
		return !getToggleState();
	}

	public boolean isPutOnTheTop() {
		return getReturnCode() == IDialogConstants.YES_ID;
	}

	public void pressNo() {
		buttonPressed(IDialogConstants.NO_ID);
	}

	public void check() {
		setToggleState(true);
	}

}
