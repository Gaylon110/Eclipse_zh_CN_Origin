/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software, and Soft-Maint.
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
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Nicolas Bros (Mia-Software) - Bug 375516 - [Table] dirty state not updated
 *    Gregoire Dupe (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Jonathan Pepin (Soft-Maint) - Bug 463907 - Command for load and save Facet serialization
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerProvider;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.IPropertyChanger;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class DelegatedTableEditor extends EditorPart implements ISelectionProvider,
		IEditingDomainProvider, IPropertyChanger {

	private TableEditorInput tableEditorInput;
	private ITableWidget tableWidget;
	private EditingDomain editingDomain;
	private final List<IPropertyListener> propertyListeners = new ArrayList<IPropertyListener>();

	private final CommandStackListener commandListener = new CommandStackListener() {
		public void commandStackChanged(final EventObject event) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					firePropertyChange(IEditorPart.PROP_DIRTY);
				}
			});
		}
	};

	@Override
	protected void firePropertyChange(final int propertyId) {
		super.firePropertyChange(propertyId);
		for (IPropertyListener listener : this.propertyListeners) {
			listener.propertyChanged(this, propertyId);
		}
	}

	@SuppressWarnings("rawtypes")
	// @SuppressWarnings("rawtypes") : We cannot change the method signature because of the override
	@Override
	public Object getAdapter(final Class adapter) {
		Object result = null;
		if (adapter.isInstance(this)){
			result = this;
		} else if (adapter == ITableWidgetProvider.class) {
			result = new ITableWidgetProvider() {
				public ITableWidget getTableWidget() {
					return DelegatedTableEditor.this.getTableWidget();
				}
			};
		} else if (adapter == IFacetManagerProvider.class){
			final ITableWidgetInternal intenalTable = ((ITableWidgetInternal) DelegatedTableEditor.this.tableWidget);
			final IFacetManager facetMgr = intenalTable.getFacetContext();
			result = new IFacetManagerProvider() {
				public IFacetManager getFacetManager() {
					return facetMgr;
				}
			};
		}
		return result;
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		if (input instanceof TableEditorInput) {
			this.tableEditorInput = (TableEditorInput) input;
			this.editingDomain = this.tableEditorInput.getEditingDomain();
			initializeEditingDomain();
			setSite(site);
			setInput(this.tableEditorInput);
			setPartName(this.tableEditorInput.getName());
		} else if (input instanceof FileEditorInput) {
			initializeEditingDomain();
			final FileEditorInput fileEditorInput = (FileEditorInput) input;
			final URI uri = URI.createPlatformResourceURI(fileEditorInput.getFile().getFullPath().toString(), true);
			if (uri != null) {
				Resource resource = null;
				if (getEditingDomain() == null)
				{
					final ResourceSet rSet = new ResourceSetImpl();
					resource = rSet.createResource(uri);
				} else {
					resource = getEditingDomain().loadResource(uri.toString());
				}
				Table tableInstance = null;
				for (final EObject eObject : resource.getContents()) {
					if (eObject instanceof Table) {
						tableInstance = (Table) eObject;
						// One instance of tableInstance per .table file
						break;
					}
				}
				this.tableEditorInput = new TableEditorInput(tableInstance, getEditingDomain());
				setSite(site);
				setInput(this.tableEditorInput);
				setPartName(fileEditorInput.getName());
			}

		} else {
			throw new PartInitException("Input should be of type TableEditorInput or a .table file"); //$NON-NLS-1$
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		final MenuManager menuMgr = new MenuManager("#PopUp", TableEditor.getEditorId()); //$NON-NLS-1$
		menuMgr.setRemoveAllWhenShown(true);

		final Composite editorComposite = new Composite(parent, SWT.NONE);
		final GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		gridLayout.marginWidth = 2;
		editorComposite.setLayout(gridLayout);

		final Label label = new Label(editorComposite, SWT.NONE);
		label.setText(this.tableEditorInput.getDescription());

		this.tableWidget = ITableWidgetFactory.INSTANCE.createTableWidget(editorComposite,
				this, this.tableEditorInput.getTableInstance(), menuMgr);
		final GridData tableGridData = new GridData();
		tableGridData.grabExcessHorizontalSpace = true;
		tableGridData.grabExcessVerticalSpace = true;
		tableGridData.horizontalAlignment = SWT.FILL;
		tableGridData.verticalAlignment = SWT.FILL;
		this.tableWidget.getComposite().setLayoutData(tableGridData);

		getSite().setSelectionProvider(this.tableWidget);
		getSite().registerContextMenu(menuMgr, this.tableWidget);
	}

	@Override
	public void setFocus() {
		this.tableWidget.getComposite().setFocus();
	}

	@SuppressWarnings("restriction")
	// @SuppressWarnings("restriction") : TODO We have to wait the fix of the bug 349797 to fix this warning.
	@Override
	public boolean isDirty() {
		// TODO We have to wait the fix of the bug 349797 to fix this warning.
		return ((ITableWidgetInternal) this.tableWidget).usesTmpResource()
				|| ((BasicCommandStack) this.editingDomain.getCommandStack()).isSaveNeeded();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void doSave(final IProgressMonitor monitor) {
		this.tableWidget.save();
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	@Override
	public void doSaveAs() {
		this.tableWidget.saveAs();
		firePropertyChange(IEditorPart.PROP_DIRTY);
	}

	/** Override to open with a subclassed factory */
	protected NatTableEditorFactory getFactory() {
		return NatTableEditorFactory.getInstance();
	}

	public void addSelectionChangedListener(final ISelectionChangedListener listener) {
		this.tableWidget.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.tableWidget.getSelection();
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.tableWidget.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.tableWidget.setSelection(selection);
	}

	// public INatTableWidget getNatTableWidget() {
	// return this.natTableWidget;
	// }

	/**
	 * This sets up the editing domain for the model editor
	 */
	protected void initializeEditingDomain() {
		if (this.editingDomain == null) {
			final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			final BasicCommandStack commandStack = new BasicCommandStack();
			this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack,
					new HashMap<Resource, Boolean>());
		}
		this.editingDomain.getCommandStack().removeCommandStackListener(this.commandListener);
		this.editingDomain.getCommandStack().addCommandStackListener(this.commandListener);
	}

	public IWorkbenchPart getPart() {
		return this;
	}

	ITableWidget getTableWidget() {
		return this.tableWidget;
	}

	public void addPropertyChangeListener(final IPropertyListener listener) {
		if (!this.propertyListeners.contains(listener)) {
			this.propertyListeners.add(listener);
		}
	}

	public void removePropertyChangeListener(final IPropertyListener listener) {
		this.propertyListeners.remove(listener);
	}
}
