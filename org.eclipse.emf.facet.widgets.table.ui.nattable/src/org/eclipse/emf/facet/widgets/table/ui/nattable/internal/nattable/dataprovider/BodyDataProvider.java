/*******************************************************************************
 * Copyright (c) 2010, 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning
 *   Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *   Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 352608 - [Table] marker at the end of the truncated displayed text
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *   Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *   Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *   Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *   Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *   Jonathan Pepin (Soft-Maint) - Bug 458270 - NullPointer on BodyDataProvier.setDataValue
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.dataprovider;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.nattable.data.IDataProvider;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationRow;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.exception.NatTableWidgetRuntimeException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;

public class BodyDataProvider implements IDataProvider {
	private final int columnCount;
	private List<Row> elements;
	private final List<Column> columns;
	private final Shell shell;
	private final EditingDomain editingDomain;
	private final IFacetManager facetManager;
	private final ITableWidgetInternal controller;
	private final IGridElement[][] cache; 
	
	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator.getDefault());

	public BodyDataProvider(final NatTableWidget natTableWidget) {
		this.controller = natTableWidget.getController();
		this.columns = this.controller.getTable().getColumns();
		this.shell = natTableWidget.getShell();
		this.editingDomain = this.controller.getEditingDomain();
		this.elements = new ArrayList<Row>(this.controller.getTable().getRows());
		this.columnCount = this.controller.getTable().getColumns().size();
		this.facetManager = this.controller.getFacetContext();
		this.cache = new IGridElement[this.columnCount][this.elements.size()];
	}

	public Row getRow(final int row) {
		return this.elements.get(row);
	}

	public int getRowCount() {
		return this.elements.size();
	}

	public int getColumnCount() {
		return this.columnCount;
	}

	public Object getDataValue(final int columnIndex, final int rowIndex) {
		IGridElement result = this.cache[columnIndex][rowIndex];
		if (result == null && checkOutOfBounds(columnIndex)) {
			final Column column = this.columns.get(columnIndex);
			final Row row = this.elements.get(rowIndex);
			if (row instanceof NavigationRow) {
				final NavigationRow tableElementWithContext = (NavigationRow) row;
				result = new GridElementWithContext(row,
						tableElementWithContext.getQueryResult().getSource(),
						column);
			} else {
				result = new GridElement(row, column, this.controller);
			}
			this.cache[columnIndex][rowIndex] = result;

			if (DEBUG) {
				final String message = String
						.format("Caching IGridElement: columnIndex=%d, rowIndex=%d", //$NON-NLS-1$
								Integer.valueOf(columnIndex),
								Integer.valueOf(rowIndex));
				DebugUtils.debug(message);
			}
		}
		return result;
	}

	private boolean checkOutOfBounds(final int columnIndex) {
		final boolean result = columnIndex >= this.columns.size();
		if (result) {
			final String message = String.format(
					"wrong column index: %d (%d columns)", //$NON-NLS-1$
					Integer.valueOf(columnIndex),
					Integer.valueOf(this.columns.size()));
			Logger.logError(message, Activator.getDefault());
		}
		return !result;
	}

	public void setDataValue(final int columnIndex, final int rowIndex, final Object newValue) {
		final Column column = this.columns.get(columnIndex);
		final Object element = this.elements.get(rowIndex).getElement();
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;

			ETypedElement feature;
			if (column instanceof FeatureColumn) {
				feature = ((FeatureColumn) column).getFeature();
			} else {
				throw new NatTableWidgetRuntimeException("Cannot edit in column of type " + column.eClass().getName()); //$NON-NLS-1$
			}

			if (feature instanceof EStructuralFeature) {
				final EStructuralFeature structuralFeature = (EStructuralFeature) feature;
				if (!structuralFeature.isChangeable()) {
					throw new NatTableWidgetRuntimeException(
							"Feature is not changeable: " + feature.getName()); //$NON-NLS-1$
				}
				if (newValue == null && !structuralFeature.isUnsettable()) {
					MessageDialog
							.openWarning(
									this.shell,
									Messages.BodyDataProvider_cannotUnset,
									NLS.bind(
											Messages.BodyDataProvider_featureIsNotUnsettable,
											feature.getName()));
					return;
				}
			} else if (feature instanceof EOperation) {
				throw new NatTableWidgetRuntimeException(
						"An operation can not be assigned"); //$NON-NLS-1$
			}


			Object prevValue = null;
			try {
				prevValue = this.facetManager.getOrInvoke(eObject, feature,
						Object.class);
			} catch (Exception e) {
				throw new NatTableWidgetRuntimeException(e);
			}
			if (prevValue == newValue) {
				return;
			}

			if (feature instanceof EReference && ((EReference) feature).isContainment()) {
				Object object = eObject.eGet((EReference) feature);
				boolean empty = (object == null || object instanceof List
						&& ((List<?>) object).isEmpty());
				String message;
				if (empty) {
					message = Messages.BodyDataProvider_valueWillBeMoved;
				} else {
					message = Messages.BodyDataProvider_valueWillBeMovedAndPreviousLost;
				}
				String fullMessage = Messages.BodyDataProvider_featureIsComposite + message;

				if (!MessageDialog.openConfirm(this.shell, Messages.BodyDataProvider_moveElement,
						fullMessage)) {
					return;
				}
			}

			if (feature.eContainer() instanceof Facet) {
				try {
					if (feature instanceof EStructuralFeature) {
						EStructuralFeature structuralFeature = (EStructuralFeature) feature;
						this.facetManager.set(eObject, structuralFeature,
								newValue, this.editingDomain);
					}
				} catch (Exception e) {
					throw new NatTableWidgetRuntimeException(e);
				}
			} else {
				ICommandFactory commandFactory = ICommandFactoriesRegistry.INSTANCE
						.getCommandFactoryFor(this.editingDomain);
				Command setCommand = commandFactory.createSetCommand(this.editingDomain, eObject,
						feature, newValue);
				this.editingDomain.getCommandStack().execute(setCommand);
			}
		}

		// not editable
	}
}