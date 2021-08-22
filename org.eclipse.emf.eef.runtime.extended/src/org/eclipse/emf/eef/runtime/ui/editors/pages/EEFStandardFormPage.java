/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.editors.pages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.context.impl.DomainPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.ui.editor.InteractiveEEFEditor;
import org.eclipse.emf.eef.runtime.ui.layout.EEFFormLayoutFactory;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionContentProvider;
import org.eclipse.emf.eef.runtime.ui.viewers.PropertiesEditionViewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFStandardFormPage extends AbstractEEFEditorPage {

	/**
	 * The page ID
	 */
	public static final String PAGE_ID = "EEF-std-form-page"; //$NON-NLS-1$

	/**
	 * The form toolkit to use
	 */
	private FormToolkit toolkit;

	/**
	 * The folder for the tab
	 */
	protected PropertiesEditionViewer viewer;

	/**
	 * @param editor
	 *            editor including this page
	 * @param name
	 *            page name
	 */
	public EEFStandardFormPage(FormEditor editor, String name) {
		super(editor, PAGE_ID, name);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	protected void createFormContent(IManagedForm managedForm) {
		super.createFormContent(managedForm);
		form = managedForm.getForm();
		toolkit = managedForm.getToolkit();
		toolkit.decorateFormHeading(form.getForm());
		form.getBody().setLayout(EEFFormLayoutFactory.createDetailsGridLayout(false, 1));
		this.viewer = new PropertiesEditionViewer(form.getBody(), null, SWT.NONE, 1);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setDynamicTabHeader(true);
		viewer.setToolkit(getManagedForm().getToolkit());
		viewer.setContentProvider(new PropertiesEditionContentProvider(adapterFactory,
				IPropertiesEditionComponent.LIVE_MODE, editingDomain));
		refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.AbstractEEFEditorPage#refreshFormContents()
	 */
	protected void refreshFormContents() {
		if (viewer != null && input instanceof EObject) {
			viewer.setInput(new DomainPropertiesEditionContext(null, null, editingDomain, adapterFactory,
					(EObject)input));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.EEFEditorPage#getModelViewer()
	 */
	public StructuredViewer getModelViewer() {
		return viewer;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.editors.pages.EEFEditorPage#getPropertiesViewer()
	 */
	public PropertiesEditionViewer getPropertiesViewer() {
		return viewer;
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormPage#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		getPropertiesViewer().addPropertiesListener(new IPropertiesEditionListener() {

			public void firePropertiesChanged(IPropertiesEditionEvent event) {
				if (event.getState() == PropertiesEditionEvent.FOCUS_CHANGED
						&& event.getKind() == PropertiesEditionEvent.FOCUS_GAINED) {
					// de-activate global actions
					if (getEditor() instanceof InteractiveEEFEditor) {
						((InteractiveEEFEditor)getEditor()).deactivateCCPActions();
					}
				} else if (event.getState() == PropertiesEditionEvent.FOCUS_CHANGED
						&& event.getKind() == PropertiesEditionEvent.FOCUS_LOST) {
					// re-activate global actions
					if (getEditor() instanceof InteractiveEEFEditor) {
						((InteractiveEEFEditor)getEditor()).activateCCPActions();
					}
				}
			}
		});
	}
}
