/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 514435 - Ui freeze on close tablewidget with a loop nullpointer exception
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.swt.widgets.Display;

public class ModelChangedListener extends AdapterImpl {

	private static final boolean DEBUG = TableWidget.DEBUG_RESOURCE_LISTENER;
	private final Runnable runnable;
	private final Set<Resource> listenedResources = new HashSet<Resource>();

	public ModelChangedListener(final Table table, final Runnable runnable) {
		super();
		this.runnable = runnable;
		final EList<Row> rows = table.getRows();
		addChangeListener(rows);
		addListenerOnTable(table);
	}

	private final void addChangeListener(final List<Row> rows) {
		final Set<Resource> resources = new HashSet<Resource>();
		for (Row row : rows) {
			final Resource resource = row.eResource();
			resources.add(resource);
		}
		for (Resource resource : resources) {
			addAdapterToResource(resource);
		}
	}

	private void addAdapterToResource(final Resource resource) {
		resource.setTrackingModification(true);
		if (!resource.eAdapters().contains(this)) {
			resource.eAdapters().add(this);
			this.listenedResources.add(resource);
		}
	}

	private final void addListenerOnTable(final Table table) {
		final AdapterImpl tableListener = new AdapterImpl() {
			@SuppressWarnings("unchecked")
			/*
			 * @SuppressWarnings("unchecked"): jpepin> The cast to "(List<Row>)"
			 * is checked by the feature condition
			 */
			@Override
			public void notifyChanged(final Notification notif) {
				final Object feature = notif.getFeature();
				if (feature != null
						&& feature.equals(TablePackage.eINSTANCE.getTable_Rows())
						&& notif.getOldValue() instanceof List
						&& notif.getNewValue() instanceof List) {
					final List<Row> oldRows = (List<Row>) notif.getOldValue();
					final List<Row> newRows = (List<Row>) notif.getNewValue();
					onRowChanged(oldRows, newRows);
				}
			}
		};
		table.eAdapters().add(tableListener);
	}

	protected final void onRowChanged(final List<Row> oldRows,
			final List<Row> newRows) {
		final List<Row> addedRows = computeDiffRows(newRows, oldRows);
		addChangeListener(addedRows);
	}

	protected static List<Row> computeDiffRows(final List<Row> rows1,
			final List<Row> rows2) {
		final ArrayList<Row> diffRows = new ArrayList<Row>(rows1);
		diffRows.removeAll(rows2);
		return diffRows;
	}

	@Override
	public void notifyChanged(final Notification notif) {
		final int eventType = notif.getEventType();
		final boolean refModelChanged = eventType != Notification.REMOVING_ADAPTER
				&& eventType != Notification.RESOLVE;
		if (DEBUG) {
			DebugUtils.debug("notification=" + notif); //$NON-NLS-1$
			DebugUtils.debug("referenceModelChanged=" + refModelChanged); //$NON-NLS-1$
		}
		if (refModelChanged) {
			if (DEBUG) {
				DebugUtils.debug(DEBUG,
						"One of the model refered by the table has changed."); //$NON-NLS-1$
			}
			Display.getDefault().asyncExec(this.runnable);
		}
	}

	public void dispose() {
		for (Resource resource : this.listenedResources) {
			resource.eAdapters().remove(this);
		}
	}
}
