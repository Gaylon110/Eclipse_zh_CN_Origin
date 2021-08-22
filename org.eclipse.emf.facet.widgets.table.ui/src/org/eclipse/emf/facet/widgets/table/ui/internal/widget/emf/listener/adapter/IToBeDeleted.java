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

/**
 * This is the interface of the adapters used to mark rows that are planed to be
 * deleted by a trigger command.
 * 
 * @since 0.1.1
 */
public interface IToBeDeleted {

	/**
	 * Check if a row is planed to be deleted by a trigger command.
	 * @return
	 */
	public boolean isPlannedToBeDeleted();

	/**
	 * mark a row as planed to be deleted by a trigger command.
	 */
	public void setHasToBeDeleted();

}
