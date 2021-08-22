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
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.EClassCustomization;
import org.eclipse.emf.facet.custom.ui.internal.exported.ICustomizationCommandFactory;
import org.eclipse.emf.facet.custom.ui.internal.exported.ICustomizationCommandFactoryFactory;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.query.IsOneOfQuery;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.query.QueryFactory;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.query.QueryPackage;
import org.eclipse.emf.facet.util.emf.core.command.EmfCommandUtils;
import org.eclipse.emf.facet.util.emf.core.command.ICommandFactoryResult;
import org.eclipse.emf.facet.util.emf.core.command.ICommandFactoryResultFactory;
import org.eclipse.emf.facet.util.emf.core.internal.exported.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.TableWidgetRuntimeException;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.BasicCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.CommandList;

public class LocalCustomCommandFactory {

	private final Table table;
	private final BasicCommandFactory basicCmdFactory;
	private final ICustomizationCommandFactory customCmdFactory;

	public LocalCustomCommandFactory(final Table table,
			final BasicCommandFactory basicCmdFactory) {
		this.table = table;
		this.basicCmdFactory = basicCmdFactory;
		final ICommandFactory cmdFactory = basicCmdFactory.getCmdFactory();
		final EditingDomain editingDomain = basicCmdFactory.getEditingDomain();
		this.customCmdFactory = ICustomizationCommandFactoryFactory.DEFAULT
				.createCustomizationCommandFactory(editingDomain, cmdFactory);
	}

	public Command createAddLocalCustomCommand(final EPackage ePackage) {
		final List<Command> cmdList = new CommandList();
		final ICommandFactoryResult<Customization> cmdFactoryResult = createCreateLocalCustom(
				ePackage);
		final Customization newCustom = cmdFactoryResult.getResult();
		cmdList.add(cmdFactoryResult.getCommand());
		final List<Customization> customs = new ArrayList<Customization>();
		customs.addAll(this.table.getCustomizations());
		// we look for the index of the new local custom
		final List<Customization> localCustoms = this.table
				.getLocalCustomizations();
		int index = 0;
		for (Customization custom : customs) {
			if (localCustoms.contains(custom)) {
				break;
			}
			index++;
		}
		customs.add(index, newCustom);
		final Command setCustomCmd = this.basicCmdFactory.createSetCommand(
				this.table, TablePackage.eINSTANCE.getTable_Customizations(),
				customs);
		cmdList.add(setCustomCmd);
		final String msg = String.format(
				"Add of a new customization for the ePackage '%s'", //$NON-NLS-1$
				ePackage.getName());
		return EmfCommandUtils.createResult(cmdList, msg);
	}

	public Command createCustomPropertyCommand(final String label,
			final FacetOperation customProperty,
			final Set<ETypedElement> features) {
		final List<Command> commandList = new CommandList();
		// final CompoundCommand resultCmd = new CompoundCommand(label);
		// 1 we look for the corresponding customization
		final List<Customization> localCustoms = this.table
				.getLocalCustomizations();
		Customization customization = null;
		if (!localCustoms.isEmpty()) {
			customization = localCustoms.get(0);
		}
		// If the wanted customization does not exist then we create it.
		if (customization == null) {
			final ICommandFactoryResult<Customization> cmdFactoryResult = createCreateLocalCustom(
					EcorePackage.eINSTANCE);
			customization = cmdFactoryResult.getResult();
			commandList.add(cmdFactoryResult.getCommand());
		}
		Facet typeCustomization = findFacetByExtendedMetaclass(
						FacetUtils.getFacets(customization),
						EcorePackage.eINSTANCE.getETypedElement());
		IsOneOfQuery conformanceQuery;
		if (typeCustomization == null) {
			conformanceQuery = QueryFactory.eINSTANCE.createIsOneOfQuery();
			final ICommandFactoryResult<EClassCustomization> crtClassCustom = this.customCmdFactory
					.createEClassCustomization(customization,
							EcorePackage.eINSTANCE.getETypedElement(),
							conformanceQuery);
			typeCustomization = crtClassCustom.getResult();
			commandList.add(crtClassCustom.getCommand());
		} else {
			if (!(typeCustomization instanceof EClassCustomization)) {
				throw new TableWidgetRuntimeException(
						"Unexpected type for the variable 'featureContainer'"); //$NON-NLS-1$
			}
			final DerivedTypedElement conformanceTE = (DerivedTypedElement) typeCustomization
					.getConformanceTypedElement();
			conformanceQuery = (IsOneOfQuery) conformanceTE.getQuery();
		}
		final Command initQuery = this.basicCmdFactory.createSetCommand(
				conformanceQuery,
				QueryPackage.eINSTANCE.getIsOneOfQuery_ExpectedEObjects(),
				new ArrayList<ETypedElement>(features));
		commandList.add(initQuery);
		final Query query = QueryFactory.eINSTANCE.createFalseLiteralQuery();
		final ICommandFactoryResult<Facet> propConfigCmd = this.customCmdFactory
				.setPropertyConfig(typeCustomization, null, customProperty,
						query);
		commandList.add(propConfigCmd.getCommand());
		return EmfCommandUtils.createResult(commandList, label); // $NON-NLS-1$
	}

	private ICommandFactoryResult<Customization> createCreateLocalCustom(
			final EPackage ePackage) {
		final List<Command> cmdList = new CommandList();
		final String name = String.format("Column hiding customization for %s", //$NON-NLS-1$
				ePackage.getName());
		final ICommandFactoryResult<Customization> cmdFactoryResult = this.customCmdFactory
				.createCustomization(name);
		final Customization customization = cmdFactoryResult.getResult();
		cmdList.add(cmdFactoryResult.getCommand());
		final Command addToLocalCmd = this.basicCmdFactory.createAddCommand(
				this.table,
				TablePackage.eINSTANCE.getTable_LocalCustomizations(),
				customization);
		cmdList.add(addToLocalCmd);
		final Command addAllCmd = this.basicCmdFactory.createAddCommand(
				this.table, TablePackage.eINSTANCE.getTable_Customizations(),
				customization);
		cmdList.add(addAllCmd);
		final Command cmd = EmfCommandUtils.createResult(cmdList,
				"Create a local custom."); //$NON-NLS-1$
		return ICommandFactoryResultFactory.DEFAULT
				.createCommandFactoryResult(cmd, customization);
	}

	public Command createPutLocalCustomizationOnTheTopCommand() {
		Command cmd = null;
		final List<Customization> localCustoms = this.table
				.getLocalCustomizations();
		final List<Customization> customizations = new ArrayList<Customization>();
		customizations.addAll(this.table.getCustomizations());
		customizations.removeAll(localCustoms);
		customizations.addAll(0, localCustoms);
		/*
		 * jpepin: if computed new customization collection is same as existing
		 * no change and return null
		 */
		if (!customizations.equals(this.table.getCustomizations())) {
			cmd = this.basicCmdFactory.createSetCommand(this.table,
					TablePackage.eINSTANCE.getTable_Customizations(),
					customizations);
		}
		return cmd;
	}

	public Command createPutLocalCustomizationOnTheBottomCommand() {
		final List<Customization> locals = this.table.getLocalCustomizations();
		final List<Customization> customizations = new ArrayList<Customization>();
		customizations.addAll(this.table.getCustomizations());
		customizations.removeAll(locals);
		customizations.addAll(customizations.size(), locals);
		return this.basicCmdFactory.createSetCommand(this.table,
				TablePackage.eINSTANCE.getTable_Customizations(),
				customizations);
	}

	/**
	 * Returns the first {@link Facet} among the given list of facets that
	 * extends the given EClass.
	 */
	private static Facet findFacetByExtendedMetaclass(
			final Collection<Facet> facets, final EClass extendedMetaClass) {
		Facet result = null;
		for (Facet facet : facets) {
			final Facet candidate = facet;
			if (candidate.getExtendedMetaclass() == extendedMetaClass) {
				result = candidate;
				break;
			}
		}
		return result;
	}
}
