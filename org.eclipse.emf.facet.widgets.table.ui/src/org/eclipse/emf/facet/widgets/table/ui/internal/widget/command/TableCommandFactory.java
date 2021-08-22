/*******************************************************************************
 * Copyright (c) 2012, 2017 CEA-LIST, Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *		Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *		Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *		Gregoire Dupe (Mia-Software) - Bug 376158 - [Table] Unexpected columns when customizations are loaded
 *		Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *		Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.TableInstanceCommandFactory (Bug 387008):
 *		Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *		Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *		Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table
 *		Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *		Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *		Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *		Nicolas Bros (Mia-Software) - Bug 332440 - NatTable : force cell editors
 *		Nicolas Bros (Mia-Software) - Bug 331675 - NatTable : copy cells as text
 *		Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *		Nicolas Bros (Mia-Software) - Bug 332010 - view Facet customizations on NatTable
 *		Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *		Nicolas Guyomar (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *		Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *		Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *		Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *		Gregoire Dupe (Mia-Software) - Bug 333015 - To be able to hide columns
 *		Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *		Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *		Nicolas Guyomar (Mia-Software) - Bug 333414 - The user must be able to save the column order
 *		Nicolas Guyomar (Mia-Software) - Bug 335154 - Sort Column By Type : Cannot modify resource set without a write transaction
 *		Nicolas Guyomar (Mia-Software) - Bug 335155 - Hide Empty Column : Cannot modify resource set without a write transaction
 *		Nicolas Guyomar (Mia-Software) - Bug 335156 - Only Show Common column : Cannot modify resource set without a write transaction
 *		Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *		Nicolas Guyomar (Mia-Software) - Bug 337322 - [TableConfiguration] Customization declared in the file tableconfiguration is not loaded
 *		Nicolas Guyomar (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *		Nicolas Bros (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *		Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *		Nicolas Guyomar (Mia-Software) - Bug 337395 - Unused columns should be destroyed
 *		Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning
 *		Nicolas Guyomar (Mia-Software) - Bug 339922 - INatTableWidget method isCellSelected should use the plural
 *		Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *		Vincent Lorenzo (CEA-LIST) - Bug 337326 - Show/Hide Column : Sort the columns by name
 *		Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *		Vincent Lorenzo (CEA-LIST) - Bug 337408 - Add an action to sort columns by name
 *		Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2
 *		Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *		Gregoire Dupe (Mia-Software) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *		Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *		Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *		Nicolas Guyomar (Mia-Software) - Bug 343411 - [Table] Create new elements does not support IJavaModelQuery anymore
 *		Gregoire Dupe (Mia-Software) - Bug 343811 - EMF Facet Regression : Created elements in a table are not serialized
 *		Vincent Lorenzo (CEA-LIST) - Bug 344125 - The API should provide a method selectRows(List<EObject> elementsToSelect)
 *		Nicolas Guyomar (Mia-Software) - Bug 344274 - SWT BOT fail on Hudson
 *		Nicolas Guyomar (Mia-Software) - Bug 344475 - To be able to select a cell by EStructuralFeature in the table
 *		Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *		Nicolas Guyomar (Mia-Software) - Bug 344413 - Facet Columns are never created when we begin with an empty table
 *		Gregoire Dupe (Mia-Software) - Bug 343859 - The local customizations are not applied when we reopen a table
 *		Nicolas Guyomar (Mia-Software) - Bug 344670 - Problems with the columns creation : very slow + scrollbar blinked
 *		Vincent Lorenzo (CEA LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *		Nicolas Guyomar (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns
 *		Gregoire Dupe (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns - Regression fix
 *		Nicolas Guyomar (Mia-Software) - Bug 345665 - Columns are duplicated when you drop many elements in the same time
 *		Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *		Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *		Gregoire Dupe (Mia-Software) - Bug 354224 - mutually exclusive Facets
 *		Grégoire Dupé (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *		Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *		Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *		Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *		Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *		Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *		Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *		Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *		Gregoire Dupe (Mia-Software) - Bug 376158 - [Table] Unexpected columns when customizations are loaded
 *		Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *		Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *		Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 * Contributors:
 *		Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *		Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *		Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 *		Grégoire Dupé (Mia-Software) - Bug 440618 - Table sort action unusable
 *		Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.emf.core.command.EmfCommandUtils;
import org.eclipse.emf.facet.util.emf.core.internal.exported.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.emf.facet.widgets.table.ui.command.ITableCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.TableWidgetRuntimeException;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.CustomizationUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.FacetAndCustomCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.LocalCustomCommandFactory;
import org.eclipse.jface.viewers.IStructuredSelection;

public class TableCommandFactory implements ITableCommandFactory {

	private static final boolean DEBUG = DebugUtils
			.getDebugStatus(Activator.getDefault());

	private static final boolean DEBUG_RM_ROWCOLS = DebugUtils
			.getDebugStatus(Activator.getDefault(),
					"removeUselessRowsAndColumns"); //$NON-NLS-1$

	private final Table table;
	private final BasicCommandFactory basicCmdFactory;
	private final LocalCustomCommandFactory locCustCmdFactory;
	private final FacetAndCustomCommandFactory fctCustCmdFactory;


	public TableCommandFactory(final Table table,
			final EditingDomain editingDomain,
			final ICommandFactory commandFactory) {
		this.table = table;
		this.basicCmdFactory = new BasicCommandFactory(
				commandFactory, editingDomain);
		this.fctCustCmdFactory = new FacetAndCustomCommandFactory(table,
				this.basicCmdFactory);
		this.locCustCmdFactory = new LocalCustomCommandFactory(table,
				this.basicCmdFactory);
	}

	public Command createSortRowCommand(final FeatureColumn featureColumn,
			final ColumnSortDirection direction,
			final IFacetManager facetManager,
			final ICustomizationManager customManager) {
		final List<Row> rows = new ArrayList<Row>(this.table.getRows());
		final ETypedElement eTypedElement = featureColumn.getFeature();
		final RowComparator comparator = new RowComparator(eTypedElement,
				direction, facetManager, customManager);
		Collections.sort(rows, comparator);
		final String description = String.format(
				Messages.TableCommandFactory_row_sort_description,
				eTypedElement.getName());
		return new BrutalListSetCommand(this.table,
				TablePackage.eINSTANCE.getTable_Rows(), rows,
				Messages.TableCommandFactory_row_sort_label, description);
	}

	public Command createRemoveRowByEObjectCommand(
			final Collection<? extends EObject> eObjectRows) {
		final List<Row> rowsToRemove = new ArrayList<Row>();
		for (Row row : this.table.getRows()) {
			if (eObjectRows.contains(row.getElement())) {
				rowsToRemove.add(row);
			}
		}
		return createRemoveRowsCommand(rowsToRemove);
	}

	public Command createRemoveUselessColumnsCommand(
			final Collection<Row> rowsToRemove,
			final List<FacetSet> nextLoadedFS) {
		final List<Command> commandList = new CommandList();
		final List<Row> rowsToKeep = new ArrayList<Row>(this.table.getRows());
		rowsToKeep.removeAll(rowsToRemove);
		List<FacetSet> facetSets;
		if (nextLoadedFS == null) {
			facetSets = this.table.getFacetSets();
		} else {
			facetSets = nextLoadedFS;
		}
		final List<FeatureColumn> columns = CommandFactoryUtils
				.columnsToRemove(this.table, facetSets, rowsToKeep);
		for (FeatureColumn column : columns) {
			DebugUtils.debug(TableCommandFactory.DEBUG,
					"column to remove: " //$NON-NLS-1$
					+ EcoreUtil.getURI(column.getFeature()));
			final Command rmColumnCmd = this.basicCmdFactory
					.createRemoveCommand(this.table,
							TablePackage.eINSTANCE.getTable_Columns(), column);
			commandList.add(rmColumnCmd);
		}
		if (TableCommandFactory.DEBUG) {
			DebugUtils.debug("Columns to be removed: " + commandList.size()); //$NON-NLS-1$
		}
		return EmfCommandUtils.createResult(commandList,
				Messages.TableInstanceCommandFactory_removeUselessColumn);
	}

	public Command createRemoveRowsCommand(final Collection<Row> rows) {
		final List<Command> cmdList = new CommandList();
		for (Row row : rows) {
			final Command removeRowCommand = this.basicCmdFactory
					.createRemoveCommand(this.table,
							TablePackage.eINSTANCE.getTable_Rows(), row);
			cmdList.add(removeRowCommand);
		}
		final Command updateColumnCmd = createRemoveUselessColumnsCommand(
				rows, null);
		cmdList.add(updateColumnCmd);
		final String msg = String.format("Remove %s row(s)", //$NON-NLS-1$
				Integer.valueOf(cmdList.size()));
		return EmfCommandUtils.createResult(cmdList, msg);
	}

	public Command createAddRowsCommand(
			final Collection<? extends EObject> eObjects) {
		final List<Command> cmdList = new CommandList();
		int nbRows = 0;
		// the EPackage for which the MetamodelView has already been created
		final Set<EPackage> alreadyDone = new HashSet<EPackage>();
		final List<EStructuralFeature> processedSF = new ArrayList<EStructuralFeature>();
		final List<EObject> tableContent = TableWidgetUtils
				.getElements(this.table);
		for (EObject eObject : eObjects) {
			if (!tableContent.contains(eObject)) {
				final Row row = TableFactory.eINSTANCE.createRow();
				final Command setToRowCmd = this.basicCmdFactory
						.createSetCommand(row,
								TablePackage.eINSTANCE.getRow_Element(),
								eObject);
				cmdList.add(setToRowCmd);
				final Command addRowCmd = this.basicCmdFactory.createAddCommand(
						this.table, TablePackage.eINSTANCE.getTable_Rows(),
						row);
				cmdList.add(addRowCmd);
				nbRows++;
				for (EStructuralFeature eStructuralFeature : eObject.eClass()
						.getEAllStructuralFeatures()) {
					if (!processedSF.contains(eStructuralFeature)) {
						processedSF.add(eStructuralFeature);
						final Command createAddColumn = createAddColumn(
								alreadyDone, eStructuralFeature);
						cmdList.add(createAddColumn);
					}
				}
			}
		}
		final String msg = String.format("Add of %s rows", //$NON-NLS-1$
				Integer.valueOf(nbRows));
		return EmfCommandUtils.createResult(cmdList, msg);
	}

	private Command createAddColumn(final Set<EPackage> alreadyDone,
			final EStructuralFeature structuralFeature) {
		final List<Command> cmdList = new CommandList();
		if (!CommandFactoryUtils.isColumnAlreadyDeclared(this.table,
				structuralFeature)) {
			final FeatureColumn referenceColumn = TableFactory.eINSTANCE
					.createFeatureColumn();
			referenceColumn.setFeature(structuralFeature);
			final Command cmd = this.basicCmdFactory.createAddCommand(
					this.table, TablePackage.eINSTANCE.getTable_Columns(),
					referenceColumn);
			cmdList.add(cmd);
			// we add the local customization file
			final List<Customization> localCustoms = this.table
					.getLocalCustomizations();
			final EClass eClass = structuralFeature.getEContainingClass();
			if (eClass != null) {
				final EPackage ePackage = eClass.getEPackage();
				final Customization customExtPackage = CustomizationUtils
						.findCustomizationExtendingEPackage(localCustoms,
								ePackage);
				if (!alreadyDone.contains(ePackage) && customExtPackage == null) {
					final Command localCustomCmd = this.locCustCmdFactory
							.createAddLocalCustomCommand(ePackage);
					if (localCustomCmd.canExecute()) {
						cmdList.add(localCustomCmd);
					}
					alreadyDone.add(ePackage);
				}
			}
		}
		final String msg = String.format("Add a column for %s::%s", //$NON-NLS-1$
				structuralFeature.getEContainingClass().getName(),
				structuralFeature.getName());
		return EmfCommandUtils.createResult(cmdList, msg);
	}

	public Command createSetFacetSetsCommand(
			final List<? extends FacetSet> facetSets) {
		return this.fctCustCmdFactory
				.createSetLoadedFacetSetsCommand(facetSets, true);
	}

	/**
	 *
	 * @param natTableWidget
	 * @return
	 * @throws CoreException
	 *             can be caused by query error in the facet framework
	 */
	public Command createDeleteSelectedElementsCommand(
			final Set<EObject> toDelete) throws CoreException {
		final CommandList commandList = new CommandList();
		for (EObject eObjectToDelete : toDelete) {
			final Command deleteCommand = this.basicCmdFactory
					.createDeleteCommand(eObjectToDelete);
			commandList.add(deleteCommand);
		}
		final Command command = EmfCommandUtils.createResult(commandList,
				"delete selected"); //$NON-NLS-1$
		DebugUtils.debug(TableCommandFactory.DEBUG,
				"compoundCommand.canExecute()=" + command.canExecute()); //$NON-NLS-1$
		return command;
	}

	public Command createDropCommand(final IStructuredSelection selection,
			final Object element, final EStructuralFeature feature) {
		final CommandList commandList = new CommandList();
		if (feature.isMany()) {
			for (Object object : selection.toList()) {
				final Command addCommand = this.basicCmdFactory
						.createAddCommand(element, feature, object);
				commandList.add(addCommand);
			}
		} else {
			if (selection.toList().size() == 1) {
				final Object firstElement = selection.getFirstElement();
				final Command addCommand = this.basicCmdFactory
						.createSetCommand(element, feature, firstElement);
				commandList.add(addCommand);
			}
		}
		return EmfCommandUtils.createResult(commandList, "drop"); //$NON-NLS-1$
	}

	/**
	 * This method retruns an EMF command deleting the a collection of EObject
	 *
	 * @param label
	 *            This label will be visible in the menu 'Edit'.
	 * @param eObjects
	 * @param controller
	 * @return
	 */
	private Command delete(final String label,
			final Collection<? extends EObject> eObjects) {
		final List<Command> cmdList = new ArrayList<Command>();
		for (EObject eObject : eObjects) {
			final Command command = this.basicCmdFactory
					.createDeleteCommand(eObject);
			cmdList.add(command);
		}
		Command result = null;
		if (!cmdList.isEmpty()) {
			result = EmfCommandUtils.createResult(cmdList, label);
		}
		return result;
	}

	/**
	 * This method create a command deleting use less row and columns.
	 *
	 * @param controller
	 * @return null if no action has to be performed.
	 */
	public final Command createRemoveUselessRowsAndColumnsCommand() {
		final List<Command> cmdList = new ArrayList<Command>();
		final List<Row> rowsToRemove = findUselessRow();
		if (DEBUG_RM_ROWCOLS) {
			DebugUtils.debug("Rows to be removed: " + rowsToRemove.size()); //$NON-NLS-1$
		}
		final Command deleteRows = delete(
				Messages.TableWidgetController_DeleteUselessRows, rowsToRemove);
		if (deleteRows != null) {
			cmdList.add(deleteRows);
		}
		final Command removeColumnCmd = createRemoveUselessColumnsCommand(
				rowsToRemove, null);
		if (removeColumnCmd != null) {
			if (!removeColumnCmd.canExecute()) {
				throw new TableWidgetRuntimeException(
						"Command cannot be executed"); //$NON-NLS-1$
			}
			cmdList.add(removeColumnCmd);
		}
		Command command = null;
		if (!cmdList.isEmpty()) {
			command = EmfCommandUtils.createResult(cmdList,
					Messages.TableWidgetController_RemoveUselessRowsAndColumns);
		}
		return command;
	}

	public FacetAndCustomCommandFactory getFacetAndCustomCommandFactory() {
		return this.fctCustCmdFactory;
	}

	public LocalCustomCommandFactory getLocalCustomCommandFactory() {
		return this.locCustCmdFactory;
	}

	/**
	 * This methods the row referring a deleted or detached element.
	 */
	private List<Row> findUselessRow() {
		final List<Row> rowsToRemove = new ArrayList<Row>();
		for (Row row : this.table.getRows()) {
			if (row.getElement() == null
					|| row.getElement().eResource() == null) {
				rowsToRemove.add(row);
			}
		}
		return rowsToRemove;
	}
}
