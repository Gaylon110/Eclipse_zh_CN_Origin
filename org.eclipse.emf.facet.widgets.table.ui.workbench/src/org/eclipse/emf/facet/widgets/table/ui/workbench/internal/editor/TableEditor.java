/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table
 *    Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 335154 - Sort Column By Type : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Gregoire Dupe (Mia-software) - Bug 343859 - The local customizations are not applied when we reopen a table
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Grégoire Dupé (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 375516 - [Table] dirty state not updated
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.IDelegatedTableEditorFactory;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.IPropertyChanger;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

public class TableEditor extends EditorPart implements ISelectionProvider,
		IEditingDomainProvider, IPropertyListener {

	private final static String EDITOR_ID = "org.eclipse.emf.facet.widgets.table.ui.workbench.editor.TableEditor"; //$NON-NLS-1$
	private EditorPart delegate;

	// @SuppressWarnings("rawtypes") : the overridden method is not generic
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(final Class adapter) {
		return this.delegate.getAdapter(adapter);
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input)
			throws PartInitException {
		boolean initialized = false;
		for (final IDelegatedTableEditorFactory editorFactory : DelegatedTableEditorRegistry.INSTANCE.getFactories()) {
			if (editorFactory.canHandle(input)) {
				this.delegate = editorFactory.createEditor();
				this.delegate.init(site, input);
				setSite(this.delegate.getSite());
				setInput(this.delegate.getEditorInput());
				setPartName(this.delegate.getPartName());
				if (this.delegate instanceof IPropertyChanger) {
					final IPropertyChanger propertyChanger = (IPropertyChanger) this.delegate;
					propertyChanger.addPropertyChangeListener(this);
				}
				initialized = true;
				break;
			}
		}
		if (!initialized) {
			throw new PartInitException("Cound not find an editor factory that handles the given input"); //$NON-NLS-1$
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.delegate.createPartControl(parent);
	}

	@Override
	public void setFocus() {
		this.delegate.setFocus();
	}

	@Override
	public boolean isDirty() {
		return this.delegate.isDirty();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return this.delegate.isSaveAsAllowed();
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		this.delegate.doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		this.delegate.doSaveAs();
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		if (this.delegate instanceof ISelectionProvider) {
			final ISelectionProvider selectionProvider = (ISelectionProvider) this.delegate;
			selectionProvider.addSelectionChangedListener(listener);
		}
	}

	public ISelection getSelection() {
		ISelection result = null;
		if (this.delegate instanceof ISelectionProvider) {
			final ISelectionProvider selectionProvider = (ISelectionProvider) this.delegate;
			result = selectionProvider.getSelection();
		}
		return result;
	}

	public EditingDomain getEditingDomain() {
		EditingDomain result = null;
		if (this.delegate instanceof IEditingDomainProvider) {
			final IEditingDomainProvider edProvider = (IEditingDomainProvider) this.delegate;
			result = edProvider.getEditingDomain();
		}
		return result;
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		if (this.delegate instanceof ISelectionProvider) {
			final ISelectionProvider selectionProvider = (ISelectionProvider) this.delegate;
			selectionProvider.removeSelectionChangedListener(listener);
		}
	}

	public void setSelection(final ISelection selection) {
		if (this.delegate instanceof ISelectionProvider) {
			final ISelectionProvider selectionProvider = (ISelectionProvider) this.delegate;
			selectionProvider.setSelection(selection);
		}
	}

	@Override
	public IWorkbenchPartSite getSite() {
		IWorkbenchPartSite result = null;
		if (this.delegate != null) {
			result = this.delegate.getSite();
		}
		return result;
	}
	
	@Override
	public IEditorSite getEditorSite() {
		return this.delegate.getEditorSite();
	}
	
	@Override
	public IEditorInput getEditorInput() {
		return this.delegate.getEditorInput();
	}
	
	@Override
	public String getTitle() {
		String result = ""; //$NON-NLS-1$
		if (this.delegate != null) {
			result = this.delegate.getTitle();
		}
		return result;
	}

	/**
	 * @return the editorId
	 */
	public static String getEditorId() {
		return TableEditor.EDITOR_ID;
	}

	public void propertyChanged(final Object source, final int propertyId) {
		// pass on the event from our delegate
		firePropertyChange(propertyId);
	}

	@Override
	public void dispose() {
		super.dispose();
		if (this.delegate instanceof IPropertyChanger) {
			final IPropertyChanger propertyChanger = (IPropertyChanger) this.delegate;
			propertyChanger.removePropertyChangeListener(this);
		}
	}
}
