/**
 *  Copyright (c) 2011, 2017 CEA LIST, and Soft-Maint
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *      Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *      Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *      Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *      Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 */
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.TableCommandFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

/**
 * This class is a trigger that have to called before the commit a transaction
 * editing domain. This class trigger the deletion of model elements presented
 * in the table. If this happen the corresponding rows have also to be deleted,
 * but if an undo is called it must undo the deletion of observed model elements
 * and of the deletion of the rows corresponding rows.
 *
 * When a model element deletion is found the trigger method return a command to
 * delete the corresponding rows.
 *
 * @since 0.1.1
 */
public class RowDeleteTriggerListener extends TriggerListener {

	protected static final String DEBUG_OPTION = "org.eclipse.emf.facet.widgets.table.ui/debug/RowDeleteTriggerListener"; //$NON-NLS-1$
	protected static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(RowDeleteTriggerListener.DEBUG_OPTION));
	private Table tableInstance;

	public RowDeleteTriggerListener(final Table tableInstance) {
		super();
		this.tableInstance = tableInstance;
	}

	@Override
	protected Command trigger(final TransactionalEditingDomain transactionalEditingDomain,
			final Notification notification) {
		if (RowDeleteTriggerListener.DEBUG) {
			System.out.println("RowDeleteTriggerListener.trigger(): notification=" + notification); //$NON-NLS-1$ // NOPMD by gdupe on 12/12/11 17:03  // Regular Eclipse Debugging
		}
		CompoundCommand command = null;
		if (RowDeleteTriggerListener.DEBUG && notification.getEventType() == Notification.REMOVE) {
			System.out // NOPMD by gdupe on 12/12/11 17:03 // Regular Eclipse Debugging
					.println("RowDeleteTriggerListener.trigger(): set notification.feature=" + notification.getFeature()); //$NON-NLS-1$
			System.out // NOPMD by gdupe on 12/12/11 17:03 // Regular Eclipse Debugging
					.println("RowDeleteTriggerListener.trigger(): set notification.oldvalue=" + notification.getOldValue()); //$NON-NLS-1$
			System.out // NOPMD by gdupe on 12/12/11 17:02 // Regular Eclipse Debugging
					.println("RowDeleteTriggerListener.trigger(): set notification.notifier.type=" + notification.getNotifier().getClass().getSimpleName()); //$NON-NLS-1$
		}
		if (notification.getEventType() == Notification.REMOVE) {
			// get the rows which have to be deleted
			List<Row> rowObservingADeletedEObject = TableInstanceListenerUtils
					.getRowsRepresentingADeletedEObject(this.tableInstance.getRows());
			if (RowDeleteTriggerListener.DEBUG) {
				System.out // NOPMD by gdupe on 12/12/11 17:02
						.println("RowDeleteTriggerListener.trigger(): rowObservingADeletedEObject=" + rowObservingADeletedEObject); //$NON-NLS-1$
			}
			if (!rowObservingADeletedEObject.isEmpty()) {
				command = new CompoundCommand();
				ICommandFactory basicCmdFactory = ICommandFactoriesRegistry.INSTANCE.getCommandFactoryFor(transactionalEditingDomain);
				Command removeColumnCommand;
				Command removeRowCommand = new RowDeleteCommand(transactionalEditingDomain,
						rowObservingADeletedEObject);
				command.append(removeRowCommand);
				final TableCommandFactory tableCmdFactory = new TableCommandFactory(
						this.tableInstance, transactionalEditingDomain,
						basicCmdFactory);
				removeColumnCommand = tableCmdFactory
						.createRemoveUselessColumnsCommand(
								rowObservingADeletedEObject, null);
				if (removeColumnCommand != null) {
					command.append(removeColumnCommand);
				}
				if (!command.canExecute()) {
					throw new RuntimeException("Unexpected unexecutable command"); //$NON-NLS-1$
				}
			}
		}
		return command;
	}

	private class RowDeleteCommand extends DeleteCommand {
		public RowDeleteCommand(final EditingDomain domain, final Collection<?> collection) {
			super(domain, collection);
		}
	}

}