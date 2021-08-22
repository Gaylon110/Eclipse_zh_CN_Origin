/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.util.emf.core.internal.exported.ICommandFactory;

public class BasicCommandFactory {

	private final EditingDomain editingDomain;
	private final ICommandFactory cmdFactory;

	public BasicCommandFactory(final ICommandFactory cmdFactory,
			final EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		this.cmdFactory = cmdFactory;
	}

	public Command createSetCommand(final Object owner, final Object feature,
			final Object value) {
		return this.cmdFactory.createSetCommand(this.editingDomain, owner,
				feature, value);

	}

	public Command createSetCommand(final Object owner, final Object feature,
			final Object value, final int index) {
		return this.cmdFactory.createSetCommand(this.editingDomain, owner,
				feature, value, index);

	}

	public Command createMoveCommand(final Object owner, final Object feature,
			final Object value, final int index) {
		return this.cmdFactory.createMoveCommand(this.editingDomain, owner,
				feature, value, index);
	}

	public Command createAddCommand(final Object owner, final Object feature,
			final Object value) {
		return this.cmdFactory.createAddCommand(this.editingDomain, owner,
				feature, value);

	}

	public Command createRemoveCommand(final Object owner, final Object feature,
			final Object value) {
		return this.cmdFactory.createRemoveCommand(this.editingDomain, owner,
				feature, value);

	}

	public Command createDeleteCommand(final Object object) {
		return this.cmdFactory.createDeleteCommand(this.editingDomain, object);

	}

	public ICommandFactory getCmdFactory() {
		return this.cmdFactory;
	}

	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}
}
