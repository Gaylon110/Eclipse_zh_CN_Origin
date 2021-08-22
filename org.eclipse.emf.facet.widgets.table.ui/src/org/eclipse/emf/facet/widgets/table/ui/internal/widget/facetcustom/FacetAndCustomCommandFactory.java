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
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.emf.core.command.EmfCommandUtils;
import org.eclipse.emf.facet.util.emf.core.internal.exported.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.TableWidgetRuntimeException;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.BasicCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.CommandFactoryUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.CommandList;

public class FacetAndCustomCommandFactory {

	private final Table table;
	private final BasicCommandFactory basicCmdFactory;

	public FacetAndCustomCommandFactory(final Table table,
			final BasicCommandFactory basicCmdFactory) {
		this.table = table;
		this.basicCmdFactory = basicCmdFactory;
	}

	public FacetAndCustomCommandFactory(final Table table,
			final ICommandFactory cmdFactory,
			final EditingDomain editingDomain) {
		this.table = table;
		this.basicCmdFactory = new BasicCommandFactory(cmdFactory,
				editingDomain);
	}

	/**
	 * @param facetSets
	 *            must not contains more than one reference to a same FacetSet
	 */
	public Command createSetLoadedFacetSetsCommand(
			final List<FacetSet> facetSets) {
		return this.createSetLoadedFacetSetsCommand(facetSets, true);
	}

	/**
	 * @param facetSets
	 *            must not contains more than one reference to a same FacetSet
	 * @param manageCustoms
	 * @param customCmdFactory
	 */
	public Command createSetLoadedFacetSetsCommand(
			final List<? extends FacetSet> facetSets,
			final boolean manageCustoms) {
		// It is expected that the column points to the override feature (the
		// signature)
		final List<Command> commandList = new CommandList();
		final List<FeatureColumn> columnsToRemove = CommandFactoryUtils
				.columnsToRemove(this.table, facetSets, this.table.getRows());
		for (Column columnToRemove : columnsToRemove) {
			final Command removeColumnCmd = createRemoveColumnCommand(
					columnToRemove);
			commandList.add(removeColumnCmd);
		}
		if (!this.table.getFacetSets().equals(facetSets)) {
			final Command setCommand = this.basicCmdFactory.createSetCommand(
					this.table, TablePackage.eINSTANCE.getTable_FacetSets(),
					facetSets);
			commandList.add(setCommand);
		}
		// If some added facetSet are also customizations they have to be
		// loaded. This
		// is required by this aggregate.
		final List<Customization> addedCustoms = new LinkedList<Customization>();
		for (FacetSet facetSet : facetSets) {
			if (facetSet instanceof Customization) {
				final Customization custom = (Customization) facetSet;
				addedCustoms.add(custom);
			}
		}
		if (manageCustoms) {
			// If some removed facetSet are also customizations they have to be
			// unloaded. This
			// is required by this aggregate.
			final List<Customization> removedCustoms = getRemovedCustoms(
					facetSets);
			if (!(addedCustoms.isEmpty() && removedCustoms.isEmpty())) {
				final List<Customization> customizations = new ArrayList<Customization>();
				customizations.addAll(this.table.getCustomizations());
				customizations.removeAll(removedCustoms);
				customizations.addAll(addedCustoms);
				final Command loadCustom = createCoreSetCustomizationsCommand(
						customizations);
				commandList.add(loadCustom);
			}
		}
		return EmfCommandUtils.createResult(commandList,
				"Set loaded facetSets"); //$NON-NLS-1$
	}

	public Command createRemoveColumnCommand(final Column column) {
		final List<Command> commandList = new ArrayList<Command>();
		if (this.table.getColumns().contains(column)) {
			final Command command = this.basicCmdFactory.createRemoveCommand(
					this.table, TablePackage.eINSTANCE.getTable_Columns(),
					column);
			// This compoundCommand is only used to hold debug informations.
			commandList.add(command);
		}
		return EmfCommandUtils.createResult(commandList, "Remove column"); //$NON-NLS-1$
	}

	public Command createSignatureFacetSetCommand(
			final List<ETypedElement> eTypedElements,
			final List<FacetSet> facetSets) {
		final Set<FacetSet> newFacetSets = new LinkedHashSet<FacetSet>();
		newFacetSets.addAll(facetSets);
		newFacetSets.addAll(this.table.getFacetSets());
		for (ETypedElement eTypedElement : eTypedElements) {
			final FacetSet signatureFS = getSignatureFacetSet(eTypedElement);
			if (signatureFS != null) {
				newFacetSets.add(signatureFS);
			}
		}
		return createSetLoadedFacetSetsCommand(
				new ArrayList<FacetSet>(newFacetSets));
	}

	private static FacetSet getSignatureFacetSet(
			final ETypedElement eTypedElement) {
		FacetSet result = null;
		if (eTypedElement instanceof DerivedTypedElement) {
			final DerivedTypedElement derivedTE = (DerivedTypedElement) eTypedElement;
			DerivedTypedElement signatureTE;
			try {
				signatureTE = FacetUtils.getTopOverrideFeature(derivedTE);
			} catch (FacetManagerException e) {
				throw new TableWidgetRuntimeException(e);
			}
			if (derivedTE.getOverride() != null && signatureTE != null) {
				final FacetSet signatureFS = FacetUtils
						.getFacetSet(signatureTE);
				result = signatureFS;
			}
		}
		return result;
	}

	private List<Customization> getRemovedCustoms(
			final List<? extends FacetSet> facetSets) {
		final List<FacetSet> removedFacetSet = new ArrayList<FacetSet>();
		removedFacetSet.addAll(this.table.getFacetSets());
		removedFacetSet.removeAll(facetSets);
		final List<Customization> removedCustoms = new LinkedList<Customization>();
		for (FacetSet facetSet : removedFacetSet) {
			if (facetSet instanceof Customization) {
				final Customization custom = (Customization) facetSet;
				removedCustoms.add(custom);
			}
		}
		return removedCustoms;
	}

	public Command createSetCustomizationCommand(
			final List<Customization> customizations) {
		final List<Command> commandList = new CommandList();
		final Set<FacetSet> referredFS = CustomizationUtils
				.findFacetsCustomizedBy(customizations);
		final List<FacetSet> alreadyLoaded = this.table.getFacetSets();
		final List<Customization> removedCustoms = new ArrayList<Customization>();
		removedCustoms.addAll(this.table.getCustomizations());
		removedCustoms.removeAll(customizations);
		final List<FacetSet> facetSets = new ArrayList<FacetSet>();
		facetSets.addAll(customizations);
		// This "remove" avoid to have a same object in twice in the list.
		facetSets.removeAll(alreadyLoaded);
		facetSets.addAll(alreadyLoaded);
		// This "remove" avoid to have a same object in twice in the list.
		facetSets.removeAll(referredFS);
		facetSets.addAll(referredFS);
		facetSets.removeAll(removedCustoms);
		final Command facetLoad = createSetLoadedFacetSetsCommand(facetSets,
				false);
		commandList.add(facetLoad);
		final Command customLoad = createCoreSetCustomizationsCommand(
				customizations);
		commandList.add(customLoad);
		return EmfCommandUtils.createResult(commandList,
				"Load cutomizations and associated facet sets"); //$NON-NLS-1$
	}

	public Command createCoreSetCustomizationsCommand(
			final List<Customization> customizations) {
		final List<Customization> sortedCustoms = new ArrayList<Customization>();
		sortedCustoms.addAll(this.table.getLocalCustomizations());
		for (Customization customization : customizations) {
			if (!sortedCustoms.contains(customization)) {
				sortedCustoms.add(customization);
			}
		}
		final List<Command> commandList = new CommandList();
		if (!this.table.getCustomizations().equals(sortedCustoms)) {
			final Command command = this.basicCmdFactory.createSetCommand(
					this.table,
					TablePackage.eINSTANCE.getTable_Customizations(),
					sortedCustoms);
			commandList.add(command);
		}
		return EmfCommandUtils.createResult(commandList,
				"Set loaded cutomizations"); //$NON-NLS-1$
	}

}
