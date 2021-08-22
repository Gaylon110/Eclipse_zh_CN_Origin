/**
 *  Copyright (c) 2011 CEA LIST.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *      Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 */
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.adapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * This is adapters used to mark rows that are planed to be deleted by a trigger
 * command.
 * 
 * @since 0.1.1
 */
public class ToBeDeletedAdapter extends AdapterImpl implements IToBeDeleted {

	private boolean isPlannedToBeDeleted = false;

	public boolean isPlannedToBeDeleted() {
		return this.isPlannedToBeDeleted;
	}

	@Override
	public boolean isAdapterForType(final Object type) {
		return type == IToBeDeleted.class;
	}

	public void setHasToBeDeleted() {
		this.isPlannedToBeDeleted = true;

	}

	/**
	 * If the row are recreated by an undo we have to remove the toBeDeleted
	 * marker.
	 */
	@Override
	public void notifyChanged(final Notification msg) {
		if (msg.getEventType() == Notification.SET) {
			if (msg.getNewValue() != null) {
				this.isPlannedToBeDeleted = false;
			}
		}
	}

}
