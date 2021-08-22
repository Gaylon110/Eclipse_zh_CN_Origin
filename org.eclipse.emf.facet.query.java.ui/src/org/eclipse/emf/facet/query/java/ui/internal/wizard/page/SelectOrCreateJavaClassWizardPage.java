/**
 * Copyright (c) 2011 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Nicolas Guyomar (Mia-Software) - Bug 349556 - EMF Facet Java Query wizard
 */
package org.eclipse.emf.facet.query.java.ui.internal.wizard.page;

import org.eclipse.emf.facet.query.java.ui.internal.Messages;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class SelectOrCreateJavaClassWizardPage extends WizardPage {

	private Button selectButton;

	public SelectOrCreateJavaClassWizardPage() {
		super("Whatever"); //$NON-NLS-1$		
		setTitle(Messages.Choose_an_operation);
		setDescription(Messages.Choose_an_operation_desc);
	}

	public void createControl(final Composite parent) {

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));

		Button createButton = new Button(container, SWT.RADIO);
		createButton.setText(Messages.Create_new_java_class);
		createButton.addSelectionListener(this.selectionListener);

		this.selectButton = new Button(container, SWT.RADIO);
		this.selectButton.setText(Messages.Select_existing_java_class);
		this.selectButton.addSelectionListener(this.selectionListener);

		setControl(container);

	}

	public boolean canFinish() {
		return this.selectButton.getSelection();
	}

	private SelectionListener selectionListener = new SelectionListener() {

		@SuppressWarnings("synthetic-access")
		public void widgetSelected(final SelectionEvent e) {
			getContainer().updateButtons();
		}

		public void widgetDefaultSelected(final SelectionEvent e) {
			// Nothing
		}

	};

	@Override
	public IWizardPage getNextPage() {
		if (this.selectButton != null) {
			if (this.selectButton.getSelection()) {
				return null;
			}
			return super.getNextPage();
		}
		return null;
	}

}
