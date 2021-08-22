/*******************************************************************************
 * Copyright (c) 2014 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gregoire Dupe (Mia-Software) - Bug 440618 - Table sort action unusable
 *   Thomas Cicognani (Soft-Maint) - Bug 453713 - Table sort doesn't work on Eclipse 4
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.workbench.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetProvider;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class SortByColumnHandler extends AbstractHandler {

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
		if (activePart != null) {
			final ITableWidgetProvider widgetPart = (ITableWidgetProvider) activePart
					.getAdapter(ITableWidgetProvider.class);
			if (widgetPart != null) {
				final ITableWidgetInternal tableWidget = (ITableWidgetInternal) widgetPart
						.getTableWidget();
				final List<Column> columns = tableWidget.getSelectedColumns();
				// TODO A bit too ugly...
				final String cmdId = event.getCommand().getId();
				ColumnSortDirection direction;
				if ("org.eclipse.emf.facet.widgets.table.descendingSortByColumn".equals(cmdId)) { //$NON-NLS-1$
					direction = ColumnSortDirection.DESCENDING;
				} else if ("org.eclipse.emf.facet.widgets.table.ascendingSortByColumn".equals(cmdId)) { //$NON-NLS-1$
					direction = ColumnSortDirection.ASCENDING;
				} else {
					final String message = String.format(
							"Unexpectid command id : %s", cmdId); //$NON-NLS-1$
					throw new IllegalStateException(message);
				}
				for (Column column : columns) {
					tableWidget.sortRows(column, direction);
				}
			}
		}
		return null;
	}

	@Override
	public void setEnabled(final Object evaluationContext) {
		boolean result = false;
		if (evaluationContext instanceof IEvaluationContext) {
			final IEvaluationContext context = (IEvaluationContext) evaluationContext;
			final Object activePart = context.getVariable(ISources.ACTIVE_PART_NAME);
			if (activePart instanceof IWorkbenchPart) {
				final IWorkbenchPart workbenchPart = (IWorkbenchPart) activePart;
				final ITableWidgetProvider twProvider = (ITableWidgetProvider) workbenchPart
						.getAdapter(ITableWidgetProvider.class);
				if (twProvider != null) {
					final ITableWidgetInternal tableWidget = (ITableWidgetInternal) twProvider
							.getTableWidget();
					if (tableWidget != null && tableWidget.isColumnSelected()) {
						result = true;
					}
				}
			}
		}
		setBaseEnabled(result);
	}
	
	@Override
	public boolean isHandled() {
		return isEnabled();
	}
}
