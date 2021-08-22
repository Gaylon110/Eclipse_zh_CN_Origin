/*******************************************************************************
 * Copyright (c) 2012, 2017 CEA-LIST, Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.TableCommandFactory
 *		Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *		Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *		Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *		Gregoire Dupe (Mia-Software) - Bug 376158 - [Table] Unexpected columns when customizations are loaded
 *		Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *		Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *		Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *		Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *		Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 *		Grégoire Dupé (Mia-Software) - Bug 440618 - Table sort action unusable
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
 *		Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.column;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.emf.facet.util.emf.core.command.EmfCommandUtils;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.SourceColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.BasicCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.CommandList;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.CustomizationUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.LocalCustomCommandFactory;

public class ColumnsCommandFactory {

	private final Table table;
	private final BasicCommandFactory basicCmdFactory;
	private final LocalCustomCommandFactory locCustCmdFactory;

	public ColumnsCommandFactory(final Table table,
			final BasicCommandFactory basicCmdFactory) {
		this.table = table;
		this.basicCmdFactory = basicCmdFactory;
		this.locCustCmdFactory = new LocalCustomCommandFactory(table,
				basicCmdFactory);
	}

	public Command createAddColumnCommand(
			final List<ETypedElement> eTypedElements,
			final Command signFacetSetCmd) {
		final List<Command> commandList = new CommandList();
		commandList.add(signFacetSetCmd);
		final Command addColumn = createAddColumn(eTypedElements);
		commandList.add(addColumn);
		return EmfCommandUtils.createResult(commandList,
				"Add columns and facetSets"); //$NON-NLS-1$
	}

	private Command createAddColumn(final List<ETypedElement> eTypedElements) {
		final List<Command> commandList = new CommandList();
		for (ETypedElement eTypedElement : eTypedElements) {
			final Command addColumn = createAddColumn(eTypedElement);
			commandList.add(addColumn);
		}
		return EmfCommandUtils.createResult(commandList, "Add columns"); //$NON-NLS-1$
	}

	private Command createAddColumn(final ETypedElement eTypedElement) {
		ETypedElement signature = eTypedElement;
		if (eTypedElement instanceof FacetOperation) {
			final FacetOperation facetOperation = (FacetOperation) eTypedElement;
			signature = FacetUtils.getSignature(facetOperation);
		}
		Column existingColumn = null;
		for (Column column : this.table.getColumns()) {
			if (column instanceof FeatureColumn) {
				final FeatureColumn featureColumn = (FeatureColumn) column;
				if (featureColumn.getFeature().equals(signature)) {
					existingColumn = column;
					break;
				}
			}
		}
		final List<Command> commandList = new CommandList();
		if (existingColumn == null) {
			final FeatureColumn column = TableFactory.eINSTANCE
					.createFeatureColumn();
			final Command setColumn = this.basicCmdFactory.createAddCommand(
					this.table, TablePackage.eINSTANCE.getTable_Columns(),
					column);
			commandList.add(setColumn);
			final Command setETypedElement = this.basicCmdFactory
					.createSetCommand(column,
							TablePackage.eINSTANCE.getFeatureColumn_Feature(),
							signature);
			commandList.add(setETypedElement);
		}
		return EmfCommandUtils.createResult(commandList, "Add column"); //$NON-NLS-1$
	}

	public Command createRemoveColumnsCommand(
			final List<ETypedElement> elements) {
		final List<Command> commandList = new ArrayList<Command>();
		if (elements != null && !elements.isEmpty()) {
			for (Column column : this.table.getColumns()) {
				if (column instanceof FeatureColumn && elements
						.contains(((FeatureColumn) column).getFeature())) {
					final FeatureColumn featureColumn = (FeatureColumn) column;
					final Command rmCommand = createRemoveColumnCommand(
							featureColumn);
					commandList.add(rmCommand);
				}
			}

		}
		final String msg = String.format("Remove %s columms", //$NON-NLS-1$
				Integer.valueOf(commandList.size()));
		return EmfCommandUtils.createResult(commandList, msg);
	}

	private Command createRemoveColumnCommand(
			final FeatureColumn featureColumn) {
		return this.basicCmdFactory.createRemoveCommand(this.table,
				TablePackage.eINSTANCE.getTable_Columns(), featureColumn);
	}

	public Command createShowHideColumnCommand(final List<Column> columnToShow,
			final List<Column> visibleColumns, final boolean putOnTheTop) {
		// we build the list of the columns to show/hide
		final List<Column> columnsToShow = new ArrayList<Column>();
		final List<Column> columnsToHide = new ArrayList<Column>();
		final List<Column> columns = this.table.getColumns();
		for (Column c : columns) {
			final boolean mustBeHidden = !columnToShow.contains(c);
			if (mustBeHidden == visibleColumns.contains(c)) {
				if (mustBeHidden) {
					columnsToHide.add(c);
				} else {
					columnsToShow.add(c);
				}
			}
		}
		final List<Command> commandList = new CommandList();
		final List<Command> columnToShowCmds = createColumnToShowCommands(
				columnsToShow);
		commandList.addAll(columnToShowCmds);
		final HashSet<FeatureColumn> fColumnsToHide = new HashSet<FeatureColumn>();
		for (Column current : columnsToHide) {
			if (current instanceof FeatureColumn) {
				fColumnsToHide.add((FeatureColumn) current);
			} else {
				final Command cmd = this.basicCmdFactory.createSetCommand(
						current,
						TablePackage.eINSTANCE.getSourceColumn_IsHidden(),
						Boolean.TRUE);
				commandList.add(cmd);
			}
		}
		final Command tmp = createHideColumnCommand(fColumnsToHide);
		if (tmp != null) {
			commandList.add(tmp);
		}
		if (putOnTheTop) {
			final Command cmd = this.locCustCmdFactory
					.createPutLocalCustomizationOnTheTopCommand();
			if (cmd.canExecute()) {
				commandList.add(cmd);
			}
		}
		return EmfCommandUtils.createResult(commandList, "Show/hide column"); //$NON-NLS-1$
	}

	/**
	 *
	 * @param column
	 *            a column
	 * @param isHidden
	 *            the new feature value for this column
	 * @param customizedFeatureName
	 *            the customized feature name
	 * @return
	 */
	public Command createHideColumnCommand(
			final Collection<FeatureColumn> featureColumns) {
		final IContentPropertiesHandler contentPropH = CustomizationUtils
				.getContentPropertiesHandler(this.table);
		final FacetOperation isVisibleProperty = contentPropH.getIsVisible();
		final HashSet<ETypedElement> featuresToHide = new HashSet<ETypedElement>();
		for (FeatureColumn column : featureColumns) {
			featuresToHide.add(column.getFeature());
		}
		return this.locCustCmdFactory.createCustomPropertyCommand(
				"Show/hide column", //$NON-NLS-1$
				isVisibleProperty, featuresToHide);
	}

	private List<Command> createColumnToShowCommands(
			final List<Column> columnsToShow) {
		final List<Command> commandList = new CommandList();
		for (Column current : columnsToShow) {
			if (current instanceof SourceColumn) {
				final Command cmd = this.basicCmdFactory.createSetCommand(
						current,
						TablePackage.eINSTANCE.getSourceColumn_IsHidden(),
						Boolean.FALSE);
				if (cmd.canExecute()) {
					commandList.add(cmd);
				}
			}
		}
		return commandList;
	}

	/**
	 * Hide columns which don't contain any elements
	 *
	 * @return
	 */
	public final Command createSetHideEmptyColumnsCommand(
			final boolean hideEmptyColumns) {
		return this.basicCmdFactory.createSetCommand(this.table,
				TablePackage.eINSTANCE.getTable_HideEmptyColumns(),
				Boolean.valueOf(hideEmptyColumns));
	}

	/**
	 * Whether to show columns which are specific to a few elements (false), or
	 * only columns which are common to all the elements (true)
	 */
	public final Command createSetOnlyShowCommonColumnsCommand(
			final boolean value) {
		return this.basicCmdFactory.createSetCommand(this.table,
				TablePackage.eINSTANCE.getTable_OnlyShowCommonColumns(),
				Boolean.valueOf(value));
	}

	/**
	 * Sort columns by type of link (attributes first, then references, then
	 * derived references, ...)
	 */
	public final Command createSortColumnsByTypeCommand() {
		int[] order = new int[this.table.getColumns().size()];
		int idx = 0;
		for (int j = 0; j < this.table.getColumns().size(); j++) {
			final Column columnDescription = this.table.getColumns().get(j);
			if (columnDescription instanceof SourceColumn
					|| (columnDescription instanceof FeatureColumn
							&& ((FeatureColumn) columnDescription)
									.getFeature() instanceof EAttribute)) {
				order[idx++] = j;
			}
		}
		// positions of references
		final List<Integer> links = getPositionOfReferences();
		for (Integer linkPos : links) {
			order[idx++] = linkPos.intValue();
		}
		return createSortColumnsCommand(order);
	}

	private List<Integer> getPositionOfReferences() {
		final List<Integer> links = new ArrayList<Integer>();
		for (int j = 0; j < this.table.getColumns().size(); j++) {
			final Column columnDescription = this.table.getColumns().get(j);
			if (columnDescription instanceof FeatureColumn
					&& ((FeatureColumn) columnDescription)
							.getFeature() instanceof EReference) {
				links.add(Integer.valueOf(j));
			}
		}
		return links;
	}

	private Command createSortColumnsCommand(final int[] order) {
		final CompoundCommand compoundCommand = new CompoundCommand();
		for (int index = 0; index < order.length; index++) {
			final int pos = order[index];
			final EObject element = this.table.getColumns().get(pos);
			final Command command = this.basicCmdFactory.createMoveCommand(
					this.table, TablePackage.eINSTANCE.getTable_Columns(),
					element, index);
			compoundCommand.append(command);
		}
		return compoundCommand;
	}

	/**
	 * Sort columns by name following this order :
	 * <ul>
	 * <li>the columns beginning by '['</li>
	 * <li>the column "/eContainer"</li>
	 * <li>the other columns, ignoring the '/'</li>
	 * </ul>
	 *
	 * @return
	 */
	public final Command createSortColumnByNameAtoZCommand() {
		return createSortColumnByLexicalOrderCommand(false);
	}

	/**
	 * Sort columns by name from Z to A following this order :
	 * <ul>
	 * <li>in first the columns which name doesn't contain '/' 'except
	 * "/eContainer" and the column beginning by '['
	 * <li>the the column "/eContainer"</li>
	 * <li>the column beginning by '['</li>
	 * </ul>
	 *
	 * @return
	 */
	public final Command createSortColumnByNameZtoACommand() {
		return createSortColumnByLexicalOrderCommand(true);
	}

	private final Command createSortColumnByLexicalOrderCommand(
			final boolean inverseOrder) {
		final List<Column> columns = new ArrayList<Column>(
				this.table.getColumns());
		final ColumnComparator comparator = new ColumnComparator();
		comparator.setInversedOrder(inverseOrder);
		Collections.sort(columns, comparator);
		return this.basicCmdFactory.createSetCommand(this.table,
				TablePackage.eINSTANCE.getTable_Columns(), columns);

	}

}
