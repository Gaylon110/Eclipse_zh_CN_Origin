/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;

public class BrutalListSetCommand implements Command {

	private final Table table;
	private final EReference eReference;
	private final List<? extends EObject> eObjects;
	private List<? extends EObject> oldValue;
	private final String label;
	private final String description;

	/**
	 * @param eReference
	 *            The attribute 'upperBound' of the eReference must be greater
	 *            than 1.
	 */
	public BrutalListSetCommand(final Table table, final EReference eReference,
			final List<? extends EObject> eObjects, final String label,
			final String description) {
		this.table = table;
		this.eReference = eReference;
		if (eReference.getUpperBound() > 1) {
			throw new IllegalArgumentException(
					"The attribute 'upperBound' of the eReference must be greater than 1."); //$NON-NLS-1$
		}
		this.eObjects = eObjects;
		this.label = label;
		this.description = description;
	}

	public boolean canExecute() {
		return true;
	}

	public void execute() {
		@SuppressWarnings("unchecked")
		// @SuppressWarnings("unchecked") class cast should not append because
		// we check the eReference multiplicity in the constructor
		final List<? extends EObject> currentValue = (List<EObject>) this.table
				.eGet(this.eReference);
		this.oldValue = new ArrayList<EObject>(currentValue);
		this.table.eSet(this.eReference, this.eObjects);
	}

	public boolean canUndo() {
		return true;
	}

	public void undo() {
		this.table.eSet(this.eReference, this.oldValue);
	}

	public void redo() {
		this.table.eSet(this.eReference, this.eObjects);
	}

	public Collection<?> getResult() {
		return this.eObjects;
	}

	public Collection<?> getAffectedObjects() {
		return Collections.singletonList(this.table);
	}

	public String getLabel() {
		return this.label;
	}

	public String getDescription() {
		return this.description;
	}

	public void dispose() {
		// Nothing to do
	}

	public Command chain(final Command command) {
		return this;
	}

}
