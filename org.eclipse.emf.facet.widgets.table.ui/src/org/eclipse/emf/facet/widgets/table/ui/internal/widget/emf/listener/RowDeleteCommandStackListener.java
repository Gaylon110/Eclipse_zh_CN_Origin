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

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.emf.core.EmfDebugUtils;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.CannotExecuteCommandException;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.MultiModelQueryException;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.MultiModelQueryRuntimeException;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.TableCommandFactory;

/**
 * This class listen to the command stack to detect deletion of model elements
 * presented in the table. If this happen the corresponding rows have also to be
 * deleted, but if an undo is called it must undo the deletion of observed model
 * elements and of the deletion of the rows corresponding rows.
 *
 * When a model element deletion is found we begin by undoing it and then we
 * execute a compound command containing the detected (and undone command) and
 * command delete the corresponding rows.
 *
 * @since 0.1.1
 */
public class RowDeleteCommandStackListener implements CommandStackListener {

	protected static final String DEBUG_OPTION = "org.eclipse.emf.facet.widgets.table.ui/debug/RowDeleteCommandStackListener"; //$NON-NLS-1$
	protected static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(RowDeleteCommandStackListener.DEBUG_OPTION));

	private Table tableInstance;
	private EditingDomain editingDomain;
	private boolean enable = true;
	private ICommandFactory commandFactory;

	public RowDeleteCommandStackListener(final Table tableInstance,
			final EditingDomain editingDomain) {
		this.tableInstance = tableInstance;
		this.editingDomain = editingDomain;
		this.commandFactory = ICommandFactoriesRegistry.INSTANCE
				.getCommandFactoryFor(this.editingDomain);
	}

	//This method is synchronized to be sure that there isn't any concurrent access on this.enable
	public synchronized void commandStackChanged(final EventObject event) {
		if (this.enable) {
			DebugUtils.debug(RowDeleteCommandStackListener.DEBUG, "(" + System.identityHashCode(event) + ")"); //$NON-NLS-1$ //$NON-NLS-2$
			Object source = event.getSource();
			if (source instanceof CommandStack) {
				CommandStack commandStack = (CommandStack) source;
				Command mostRecentCommand = commandStack.getMostRecentCommand();
				// This test avoids to modify the command created by this class,
				// if they are undone.
				if (!(mostRecentCommand instanceof MostRecentAndDeleteCompoundCommand)) {
					try {
						// Creation of the compound command containing the
						// undone command plus the row delete commands
						Command mostRecentAndDeleteCompoundCommand = createMostRecentAndDeleteCompoundCommand(
								event, mostRecentCommand);
						if (mostRecentAndDeleteCompoundCommand != null) {
							this.enable = false;
							DebugUtils.debug(RowDeleteCommandStackListener.DEBUG, "(" + System.identityHashCode(event) + "): Exec undo"); //$NON-NLS-1$ //$NON-NLS-2$
							if (RowDeleteCommandStackListener.DEBUG) {
								DebugUtils.debug("(" + System.identityHashCode(event) + "): Exec redo+delete"); //$NON-NLS-1$ //$NON-NLS-2$
							}
							// Undo of the caught command
							this.editingDomain.getCommandStack().undo();
							if (RowDeleteCommandStackListener.DEBUG) {
								if (!mostRecentAndDeleteCompoundCommand
										.canExecute()) {
									DebugUtils.debug("(" + System.identityHashCode(event) + "): Cannot execute redo+delete" + EmfDebugUtils.debugCommand(mostRecentAndDeleteCompoundCommand) + '\n'); //$NON-NLS-1$ //$NON-NLS-2$
									// throw an exception to be sure to know gets wrong
									throw new CannotExecuteCommandException(
											"Cannot execute redo+delete"); //$NON-NLS-1$
								}
								DebugUtils.debug("(" + System.identityHashCode(event) + "): Exec redo+delete"); //$NON-NLS-1$ //$NON-NLS-2$
							}
							// Execution of the compound command containing the
							// undone command plus the row delete commands
							this.editingDomain.getCommandStack().execute(
									mostRecentAndDeleteCompoundCommand);
							if (this.editingDomain.getCommandStack().getMostRecentCommand() != mostRecentAndDeleteCompoundCommand) {
								// throw an exception to be sure to know gets wrong
								throw new CannotExecuteCommandException("Somethig was wrong in the redo+delete. Did you have installed/enabled the org.eclipse.emf.facet.widgets.table.metamodel.edit plugin ?"); //$NON-NLS-1$
							}

						}
					} catch (CannotExecuteCommandException e) {
						throw e;
					} catch (MultiModelQueryException e) {
						throw new MultiModelQueryRuntimeException(e);
					} finally {
						this.enable = true;
					}
				}
			}
		}
	}

	/**
	 * The methods a compound command containing the undone command
	 * (triggeredCommand) plus the row delete commands
	 * 
	 * @param event
	 *            just used to the debug log
	 * @param triggeredCommand
	 * @return
	 * @throws MultiModelQueryException 
	 */
	private Command createMostRecentAndDeleteCompoundCommand(final EventObject event,
			final Command triggeredCommand) throws MultiModelQueryException {
		MostRecentAndDeleteCompoundCommand result = null;
		if (triggeredCommand instanceof DeleteCommand) {
			DebugUtils.debug(RowDeleteCommandStackListener.DEBUG, "(" + System.identityHashCode(event) + "): DeleteCommand found "); //$NON-NLS-1$ //$NON-NLS-2$
			// get the rows which have to be deleted
			List<Row> toBeRemovedRows = TableInstanceListenerUtils
					.getRowsRepresentingADeletedEObject(this.tableInstance.getRows());
			if (!toBeRemovedRows.isEmpty()) {
				// Create command to delete the rows
				Command removeRowCommand = new RowDeleteCommand(this.editingDomain, toBeRemovedRows);
				final TableCommandFactory cmdFactory = new TableCommandFactory(
						this.tableInstance, this.editingDomain,
						this.commandFactory);
				final Command removeColumnCmd = cmdFactory
						.createRemoveUselessColumnsCommand(toBeRemovedRows, null);
				// Add the model element deletion, the row deletion and the column deletion in a same
				// command
				List<Command> commandList = new ArrayList<Command>();
				commandList.add(triggeredCommand);
				commandList.add(removeRowCommand);
				if (removeColumnCmd != null) {
					commandList.add(removeColumnCmd);
				}
				result = new MostRecentAndDeleteCompoundCommand(commandList);
				if (RowDeleteCommandStackListener.DEBUG) {
					DebugUtils.debug("(" + System.identityHashCode(event) + "): canExecute=" + result.canExecute()); //$NON-NLS-1$ //$NON-NLS-2$
				}
			} else {
				// If no row has to be deleted, we encapsulate the triggered
				// command in a MostRecentAndDeleteCompoundCommand.
				List<Command> commandList = new ArrayList<Command>();
				commandList.add(triggeredCommand);
				result = new MostRecentAndDeleteCompoundCommand(commandList);
			}
		} else if (triggeredCommand instanceof CompoundCommand) {
			// If a compound command is trigger, we try to find into it a
			// DeleteComand
			DebugUtils.debug(RowDeleteCommandStackListener.DEBUG, "(" + System.identityHashCode(event) + "): CompoundCommand found (" + System.identityHashCode(triggeredCommand) + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			CompoundCommand compoundCommand = (CompoundCommand) triggeredCommand;
			MostRecentAndDeleteCompoundCommand resultCompoundCommand = new MostRecentAndDeleteCompoundCommand();
			for (Command command : compoundCommand.getCommandList()) {
				resultCompoundCommand.append(createMostRecentAndDeleteCompoundCommand(event,
						command));
			}
			if (!resultCompoundCommand.isEmpty()) {
				result = resultCompoundCommand;
			}
		}
		return result;
	}

	/**
	 * This class is used to be able to test if this listener is notified of the
	 * undone of a command created by this listener.
	 */
	class MostRecentAndDeleteCompoundCommand extends CompoundCommand {
		public MostRecentAndDeleteCompoundCommand() {
			super();
		}

		public MostRecentAndDeleteCompoundCommand(final List<Command> commandList) {
			super(commandList);
		}
	}

}
