/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.swt.widgets.Display;

public class TableChangedListener extends AdapterImpl {

	private static final boolean DEBUG = TableWidget.DEBUG_EVENTS;
	private final Runnable runnable;
	private final Table table;

	public TableChangedListener(final Table table, final Runnable runnable) {
		super();
		this.table = table;
		this.runnable = runnable;
		table.eAdapters().add(this);
		addListenerOnResource();
	}

	private void addListenerOnResource() {
		final Resource resource = this.table.eResource();
		resource.setTrackingModification(true);
		resource.eAdapters().add(this);
	}

	@Override
	public void notifyChanged(final Notification msg) {
		final int eventType = msg.getEventType();
		if (eventType != Notification.REMOVING_ADAPTER
				&& eventType != Notification.RESOLVE) {
			DebugUtils.debug(DEBUG, "tableInstanceAdapter called"); //$NON-NLS-1$
			Display.getDefault().asyncExec(this.runnable);
		}
	}

	public void dispose() {
		this.table.eAdapters().remove(this);
		final Resource resource = this.table.eResource();
		resource.eAdapters().remove(this);
	}

}
