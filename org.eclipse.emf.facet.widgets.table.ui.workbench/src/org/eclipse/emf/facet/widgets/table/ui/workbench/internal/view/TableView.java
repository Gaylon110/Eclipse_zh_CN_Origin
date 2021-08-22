/*******************************************************************************
 * Copyright (c) 2010, 2017 CEA LIST, Mia-Software, and Soft-Maint.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *    Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table
 *    Nicolas Bros (Mia-Software) - Bug 331520 - view query result in NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *    Nicolas Bros (Mia-Software) - Bug 331675 - NatTable : copy cells as text 
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332010 - view Facet customizations on NatTable
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333414 - The user must be able to save the column order
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation 
 *    Nicolas Guyomar (Mia-Software) - Bug 340738 - Utility method to create a coherent tableInstance
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    Grégoire Dupé (Mia-Software) - Bug 470036 - The message "The table is empty" doesn't disappear
 *    Jonathan Pepin (Soft-Maint) - Bug 518402 - Add test to open table view
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.TableUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableView;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.TableViewException;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class TableView extends ViewPart implements IEditingDomainProvider,
		ISelectionProvider, ISelectionChangedListener, ITableView {

	/** The VIEW_ID of the view as specified by the extension */
	public static final String VIEW_ID = "org.eclipse.emf.facet.widgets.table.ui.workbench.view.TableView"; //$NON-NLS-1$

	/**
	 * The selection listeners for implementing ISelectionProvider of this table view; The table view itself listens to
	 * the current table view controller.
	 */
	private final Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	private ITableWidget tableWidget;
	private EditingDomain editingDomain;
	private Composite partControlParent;
	private MenuManager menuMgr;
	private static int secondaryID = 0;

	public static void openOn(final List<EObject> elements,
			final EditingDomain editingDomain, final String description,
			final TableConfiguration configuration, final EObject context,
			final Object parameter) throws TableViewException {
		final Table tableInstance = TableUtils
				.createTableInstance(elements, description, configuration,
						context, parameter);
		openOn(tableInstance, editingDomain);
	}

	public static void openOnQueryResult(final List<ETypedElementResult> result,
			final EditingDomain editingDomain,
			final TableConfiguration configuration, final EObject context,
			final Object parameter) throws TableViewException {
		final NavigationTable table = TableWidgetUtils
				.createQueryTableInstance(result, configuration, context,
						parameter);
		openOn(table, editingDomain);
	}

	public static ITableView openOn(final Table tableInstance,
			final EditingDomain editingDomain) throws TableViewException {
		try {
			final IWorkbenchWindow activeWindow = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			final IWorkbenchPage activePage = activeWindow.getActivePage();
			final IViewPart viewPart = activePage.showView(TableView.VIEW_ID,
					Integer.toString(TableView.secondaryID++),
					IWorkbenchPage.VIEW_ACTIVATE);
			if (!(viewPart instanceof TableView)) {
				final String msg = String.format(
						"The view %s must be an instance of TableView.", //$NON-NLS-1$
						TableView.VIEW_ID);
				throw new IllegalStateException(msg);
			}
			final TableView tableView = (TableView) viewPart;
			tableView.setEditingDomain(editingDomain);
			tableView.setInput(tableInstance);
			return tableView;
		} catch (Exception e) {
			final String msg = String.format(
					"Can't open a TableView for the table %s.", //$NON-NLS-1$
					EcoreUtil.getURI(tableInstance));
			throw new TableViewException(msg, e);
		}
	}

	private void setInput(final Table tableInstance) {
		if (this.tableWidget != null) {
			final Control composite = this.tableWidget.getComposite();
			composite.dispose();
		}
		this.tableWidget = ITableWidgetFactory.INSTANCE.createTableWidget(this.partControlParent, this, tableInstance, this.menuMgr);
		this.tableWidget.addSelectionChangedListener(this);
		this.partControlParent.layout();
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.partControlParent = parent;
		this.menuMgr = new MenuManager("#PopUp", TableView.VIEW_ID); //$NON-NLS-1$
		this.menuMgr.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		this.menuMgr.setRemoveAllWhenShown(true);

		setInput(null);
		getSite().registerContextMenu(this.menuMgr, this);
		parent.setLayout(new FillLayout());
		getSite().setSelectionProvider(this);
		parent.layout();
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus() {
		if (this.tableWidget != null
				&& !this.tableWidget.getComposite().isDisposed()) {
			this.tableWidget.getComposite().setFocus();
		}
	}

	@SuppressWarnings("rawtypes")
	// We cannot change the method signature because of the override
	@Override
	public Object getAdapter(final Class adapter) {
		Object result = null;
		if (adapter == ITableWidgetProvider.class) {
			result = new ITableWidgetProvider() {
				public ITableWidget getTableWidget() {
					return TableView.this.getTableWidget();
				}
			};
		}
		return result;
	}

	public ITableWidget getTableWidget() {
		return this.tableWidget;
	}

	/**
	 * Return the editing table contained in the tableInput
	 */
	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	protected void setEditingDomain(final EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public IWorkbenchPart getPart() {
		return this;
	}

	public final void addSelectionChangedListener(final ISelectionChangedListener listener) {
		if (!this.selectionChangedListeners.contains(listener)) {
			this.selectionChangedListeners.add(listener);
		}
	}

	public final void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.selectionChangedListeners.remove(listener);
	}

	public ISelection getSelection() {
		return this.tableWidget.getSelection();
	}

	public void setSelection(final ISelection selection) {
		this.tableWidget.setSelection(selection);
	}

	public void selectionChanged(final SelectionChangedEvent event) {
		final ArrayList<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>(this.selectionChangedListeners);
		for (ISelectionChangedListener listener : listeners) {
			listener.selectionChanged(event);
		}
	}
}