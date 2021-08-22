/*****************************************************************************
 * Copyright (c) 2011, 2017 CEA LIST, and Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA-LIST) - Bug 337326 - Show/Hide Column : Sort the columns by name
 *   Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *   Gregoire Dupe (Mia-Software) - Bug 516157 - [Table] The "copy to clipboard" action doesn't use the customization
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.ValueColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.workbench.expression.TableTester;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

public final class TableWidgetInternalUtils {

	private TableWidgetInternalUtils() {
		// Must not be used
	}

	public static String getColumnName(final Column column) {
		return getLabel(column, new StucturalFeatureLabelProvider());
	}

	protected static final class StucturalFeatureLabelProvider
			implements ILabelProvider {
		public void removeListener(final ILabelProviderListener listener) {
			// Nothing to do
		}

		public boolean isLabelProperty(final Object element,
				final String property) {
			return false;
		}

		public void dispose() {
			// Nothing to do
		}

		public void addListener(final ILabelProviderListener listener) {
			// Nothing to do
		}

		public String getText(final Object element) {
			String result = element.toString();
			if (element instanceof EStructuralFeature) {
				final EStructuralFeature structuralFeature = (EStructuralFeature) element;
				result = structuralFeature.getName();
			}
			return result;
		}

		public Image getImage(final Object element) {
			return null;
		}
	}

	public static String getLabel(final Column column,
			final ILabelProvider labelProvider) {
		String columnName;
		if (column instanceof SourceColumn) {
			columnName = Messages.NatTableWidget_queryContext;
		} else if (column instanceof FeatureColumn) {
			final FeatureColumn featureColumn = (FeatureColumn) column;
			final ETypedElement eTypedElement = featureColumn.getFeature();
			if (eTypedElement instanceof EStructuralFeature) {
				final EStructuralFeature structuralFeature = (EStructuralFeature) eTypedElement;
				columnName = labelProvider.getText(structuralFeature);
			} else {
				columnName = eTypedElement.getName();
			}

		} else if (column instanceof ValueColumn) {
			// TODO should be externalized
			columnName = "Value"; //$NON-NLS-1$
		} else {
			Logger.logWarning("Unhandled column description type", //$NON-NLS-1$
					Activator.getDefault());
			columnName = ""; //$NON-NLS-1$
		}
		return columnName;
	}

	public static String getLabel(final Column column,
			final ITableWidgetInternal tableWidgetCtrler) {
		final ICustomizedLabelProvider labelProvider = tableWidgetCtrler
				.getTableLabelProvider();
		return getLabel(column, labelProvider);
	}

	public static ETypedElement getPresentabilityQuery(final Table tableInstance) {
		ETypedElement presentabilityQuery = null;
		// dynamic presentability query
		presentabilityQuery = tableInstance.getCanBePresentedInTheTable();
		if (presentabilityQuery == null) {
			// static presentability query
			TableConfiguration tableConfiguration = tableInstance.getTableConfiguration();
			if (tableConfiguration != null) {
				presentabilityQuery = tableConfiguration.getCanBePresentedInTheTable();
			}
		}
		return presentabilityQuery;
	}

	/**
	 * Test if the provided {@link IWorkbenchPart} is an {@link IEditorPart} and
	 * has an adaptor for {@link INatTableWidgetProvider}
	 *
	 * @param part
	 *            the part to test
	 * @return <code>true</code> if the {@link IEditorPart}provides an
	 *         adaptor for {@link INatTableWidgetProvider}
	 */
	public static boolean testIsTableEditor(final IWorkbenchPart part) {
		return TableTester.testIsTableEditor(part);
	}
}
