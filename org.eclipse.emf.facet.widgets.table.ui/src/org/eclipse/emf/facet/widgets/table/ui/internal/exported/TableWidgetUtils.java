/*******************************************************************************
 * Copyright (c) 2011, 2017 CEA LIST, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 340738 - Utility method to create a coherent tableInstance
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Vincent Lorenzo (CEA-LIST) - Bug 341328 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 378649 - [Table] Errors with non-applicable features
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.EObjectQueryRow;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.GridElementManager;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.utils.CreateTableUtils;

public final class TableWidgetUtils {

	private TableWidgetUtils() {
		// Prevent instantiation
	}

	public static NavigationTable createQueryTableInstance(final List<ETypedElementResult> results,
			final TableConfiguration tableConfiguration, final EObject context, final Object parameter) {
		NavigationTable queryTableInstance = TableFactory.eINSTANCE
				.createNavigationTable();
		queryTableInstance.getQueryResults().addAll(results);
		queryTableInstance.setTableConfiguration(tableConfiguration);
		queryTableInstance.setContext(context);
		queryTableInstance.setParameter(parameter);
		for (ETypedElementResult result : results) {
			Object resultValue = FacetUtils.getResultValue(result);
			if (resultValue instanceof Collection<?>) {
				Collection<?> collection = (Collection<?>) resultValue;
				for (Object object : collection) {
					createQueryRow(queryTableInstance, result, object);
				}
			} else {
				createQueryRow(queryTableInstance, result, resultValue);
			}
		}
		CreateTableUtils.createColumns(queryTableInstance);
		return queryTableInstance;
	}

	private static void createQueryRow(final NavigationTable queryTableInstance,
			final ETypedElementResult result, final Object object) {
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			if (!TableWidgetUtils.getElements(queryTableInstance).contains(
					eObject)) {
				EObjectQueryRow row = TableFactory.eINSTANCE.createEObjectQueryRow();
				row.setElement(eObject);
				row.setQueryResult(result);
				queryTableInstance.getRows().add(row);
			}
		} else {
			PrimitiveTypeQueryRow row = TableFactory.eINSTANCE
					.createPrimitiveTypeQueryRow();
			row.setElement(result);
			row.setQueryResult(result);
			row.setValue(object);
			queryTableInstance.getRows().add(row);
		}
	}

	public static List<EObject> getElements(final Table table) {
		final List<EObject> result = new ArrayList<EObject>();
		for (Row row : table.getRows()) {
			result.add(row.getElement());
		}
		return result;
	}

	public static Object getValueOf(final IGridElement gridElement,
			final IFacetManager context) throws FacetManagerException {
		return GridElementManager.getValueOf(gridElement, context);
	}

	public static boolean isApplicable(final IGridElement gridElement,
			final IFacetManager context) {
		return GridElementManager.isApplicable(gridElement, context);
	}

}
