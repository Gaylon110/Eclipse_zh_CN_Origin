/*******************************************************************************
 * Copyright (c) 2010, 2011, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *    Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - The user must be able to save which EMF objects are contained in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333414 - The user must be able to save the column order
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation 
 *    Nicolas Guyomar (Mia-Software) - Bug 340738 - Utility method to create a coherent tableInstance
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Grégoire Dupé (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.TableUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableEditorFactory;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class NatTableEditorFactory implements ITableEditorFactory {

	private static NatTableEditorFactory instance;

	protected NatTableEditorFactory() {
		// singleton
	}

	public static NatTableEditorFactory getInstance() {
		if (NatTableEditorFactory.instance == null) {
			NatTableEditorFactory.instance = new NatTableEditorFactory();
		}
		return NatTableEditorFactory.instance;
	}

	/**
	 * Open a new table view editor on the given list of elements.
	 * 
	 * @param browserConfiguration
	 *            the main editor configuration
	 * @param elements
	 *            the elements to show as rows in the table
	 * @param description
	 *            a descriptive String of what will be displayed in the table
	 *            view editor
	 */
	public void openOn(final List<EObject> elements, final EditingDomain editingDomain,
			final String description, final TableConfiguration tableConfig,
			final EObject context, final Object parameter) {
		final Table tableInstance = TableUtils.createTableInstance(elements,
				description, tableConfig, context, parameter);
		openOn(tableInstance, editingDomain);
	}

	public void openOn(final Table input, final EditingDomain editingDomain) {
		if (input instanceof NavigationTable) {
			this.openOnQueryResult(null, (NavigationTable) input);
		} else {
			final TableEditorInput tableEditorInput = new TableEditorInput(input, editingDomain);
			openOn(tableEditorInput);
		}
	}

	private static void openOn(final TableEditorInput input) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				final IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage();
				try {
					IDE.openEditor(activePage, input, TableEditor.getEditorId(), true);
				} catch (final PartInitException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		});
	}

	/**
	 * Open a new table view editor on the given query result.
	 * 
	 * @param result
	 *            the results of a query to display in the table
	 * @param modelQuery
	 *            the query that was evaluated
	 */
	public void openOnQueryResult(final List<ETypedElementResult> result, final ETypedElement modelQuery) {
		NavigationTable queryTableInstance = TableWidgetUtils.createQueryTableInstance(result, null, null, null);
		openOnQueryResult(modelQuery, queryTableInstance);
	}

	private void openOnQueryResult(final ETypedElement modelQuery, final NavigationTable queryTableInstance) {

		final String description;
		final String queryName;
		int nElements = 0;
		for (ETypedElementResult mqr : queryTableInstance.getQueryResults()) {
			if (FacetUtils.getResultValue(mqr) instanceof Collection<?>) {
				Collection<?> collection = (Collection<?>) FacetUtils.getResultValue(mqr);
				nElements += collection.size();
			}
		}

		if (modelQuery == null) {
			if (nElements > 1) {
				description = NLS.bind(Messages.NatTableEditorFactory_queryResults, Integer.valueOf(
						nElements));
			} else {
				description = NLS.bind(Messages.NatTableEditorFactory_queryResult, Integer.valueOf(nElements));
			}
			queryName = Messages.NatTableEditorFactory_aQuery;
		} else {
			queryName = modelQuery.getName();
			description = NLS.bind(
					Messages.NatTableEditorFactory_resultsForQuery, queryName,
					Integer.valueOf(nElements));
		}

		queryTableInstance.setDescription(description);

		final TableEditorInput input = new TableEditorInput(queryTableInstance, null) {
			@Override
			public String getName() {
				return queryName;
			}
		};

		openOn(input);
	}
}
