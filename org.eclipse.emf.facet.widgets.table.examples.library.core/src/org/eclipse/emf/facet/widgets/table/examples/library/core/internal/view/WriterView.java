/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Grégoire Dupé (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 */
package org.eclipse.emf.facet.widgets.table.examples.library.core.internal.view;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Library;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.Activator;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.EditingUtil;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.Messages;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.ITableWidget;
import org.eclipse.emf.facet.widgets.table.ui.ITableWidgetFactory;
import org.eclipse.emf.facet.widgets.table.ui.TableUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

public class WriterView extends ViewPart implements ISelectionProvider,
		ITableWidgetProvider {

	public static final String VIEW_ID = "org.eclipse.emf.facet.widgets.table.examples.library.core.writer.view"; //$NON-NLS-1$
	private static final String CONFIG_PATH = "/resources/writers.tableconfiguration"; //$NON-NLS-1$
	private ITableWidget tableWidget;

	@Override
	public void createPartControl(final Composite parent) {
		final List<EObject> eObjects = EditingUtil.getEObjectsInSelection();
		final Library library = (Library) eObjects.get(0);
		final ResourceSet resourceSet = library.eResource().getResourceSet();
		final URI uri = URI.createPlatformPluginURI('/'
				+ Activator.getDefault().getBundle().getSymbolicName()
				+ CONFIG_PATH, false);
		final Resource resource = resourceSet.getResource(uri, true);
		final TableConfiguration config = (TableConfiguration) resource
				.getContents().get(0);
		final MenuManager menuMgr = new MenuManager("#PopUp", VIEW_ID); //$NON-NLS-1$
		menuMgr.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
		menuMgr.setRemoveAllWhenShown(true);
		final Table table = TableUtils.createTableInstance(
				library.getWriters(), Messages.WriterView_TableDescription,
				config, library, null);
		final IEditingDomainProvider edProvide = EditingUtil
				.getEditingDomainProvider();
		this.tableWidget = ITableWidgetFactory.INSTANCE.createTableWidget(
				parent, edProvide, table, menuMgr);
		getSite().registerContextMenu(menuMgr, this);
		getSite().setSelectionProvider(this);
		parent.setLayout(new FillLayout());
		parent.layout();
	}

	public void addSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tableWidget.addSelectionChangedListener(listener);
	}

	public ISelection getSelection() {
		return this.tableWidget.getSelection();
	}

	public void removeSelectionChangedListener(
			final ISelectionChangedListener listener) {
		this.tableWidget.removeSelectionChangedListener(listener);
	}

	public void setSelection(final ISelection selection) {
		this.tableWidget.setSelection(selection);
	}

	public org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget getTableWidget() {
		return (org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget) this.tableWidget;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") final Class adapter) {
		// @SuppressWarnings("rawtypes") No choice this is an inherited method.
		Object result = null;
		if (adapter.isInstance(this)) {
			result = this;
		} else if (adapter.isInstance(this.tableWidget)) {
			result = this.tableWidget;
		}
		return result;
	}

	@Override
	public void setFocus() {
		// Noting to do
	}

}
