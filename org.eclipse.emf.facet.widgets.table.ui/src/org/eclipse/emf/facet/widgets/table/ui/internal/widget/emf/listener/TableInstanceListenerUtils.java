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
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.adapter.IToBeDeleted;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.adapter.IToBeDeletedAdapterFactory;

/**
 * This utility class shares common behaviors between
 * RowDeleteCommandStackListener and RowDeleteTriggerListener
 * 
 * @since 0.1.1
 */
public final class TableInstanceListenerUtils {
	private TableInstanceListenerUtils() {
		// Must not be used.
	}

	/**
	 * This methods returns the rows which have to be deleted by a trigger
	 * listening to the deletion of the model elements presented in the table.
	 * 
	 * The triggers create commands which are not executed immediately. We the
	 * need to know if a not yet executed command plan to delete the row. To
	 * solve, this problem IToBeDeleted adapters are used.
	 * 
	 * @param rows
	 *            all the rows of a table.
	 * @return the list of the rows pointing to a deleted element and which are
	 *         not been already mark as "toBeDeleted".
	 */
	static List<Row> getRowsRepresentingADeletedEObject(final List<Row> rows) {
		List<Row> rowObservingADeletedEObject = new ArrayList<Row>();
		for (Row row : rows) {
			IToBeDeleted toDeDeleted = (IToBeDeleted) IToBeDeletedAdapterFactory.INSTANCE.adapt(
					row, IToBeDeleted.class);
			if (!toDeDeleted.isPlannedToBeDeleted()) {
				if (row.getElement() == null) {
					rowObservingADeletedEObject.add(row);
					toDeDeleted.setHasToBeDeleted();
				}
			}
		}
		return rowObservingADeletedEObject;
	}

}
