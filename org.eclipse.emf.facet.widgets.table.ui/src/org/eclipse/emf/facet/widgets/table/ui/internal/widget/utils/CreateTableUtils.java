/*******************************************************************************
 * Copyright (c) 2011, 2017 CEA LIST, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 340738 - Utility method to create a coherent tableInstance
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Vincent Lorenzo (CEA-LIST) - Bug 341328 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 364325 - [Restructuring] The user must be able to navigate into a model using the Facet.
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 378649 - [Table] Errors with non-applicable features
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    Vincent Lorenzo (CEA-LIST) - Bug 391412 - [Table] The allowed contents is done set during the table creation
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.InternalTableUtils:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *    Nicolas Guyomar (Mia-Software) - Bug 331442 - To be able to add and remove lines (model elements) from the table
 *    Nicolas Bros (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332226 - To be able to create or delete model element from the table
 *    Nicolas Bros (Mia-Software) - Bug 332438 - NatTable : table type
 *    Nicolas Bros (Mia-Software) - Bug 332440 - NatTable : force cell editors
 *    Nicolas Bros (Mia-Software) - Bug 331675 - NatTable : copy cells as text
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332010 - view Facet customizations on NatTable
 *    Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333015 - To be able to hide columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333029 - To be able to save the size of the lines and the columns
 *    Nicolas Guyomar (Mia-Software) - Bug 333414 - The user must be able to save the column order
 *    Nicolas Guyomar (Mia-Software) - Bug 335154 - Sort Column By Type : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335155 - Hide Empty Column : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335156 - Only Show Common column : Cannot modify resource set without a write transaction
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 337322 - [TableConfiguration] Customization declared in the file tableconfiguration is not loaded
 *    Nicolas Guyomar (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *    Nicolas Bros (Mia-Software) - Bug 338536 - Problem with the refresh of the table : the scrollbar returns to this initial position
 *    Nicolas Guyomar (Mia-Software) - Bug 337454 - We can't delete a query Column
 *    Nicolas Guyomar (Mia-Software) - Bug 337395 - Unused columns should be destroyed
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning
 *    Nicolas Guyomar (Mia-Software) - Bug 339922 - INatTableWidget method isCellSelected should use the plural
 *    Nicolas Guyomar (Mia-Software) - Bug 340681 - Facet column implementation
 *    Vincent Lorenzo (CEA-LIST) - Bug 337326 - Show/Hide Column : Sort the columns by name
 *    Nicolas Guyomar (Mia-Software) - Bug 340940 - To be able to view facet attributes and facet references in a table
 *    Vincent Lorenzo (CEA-LIST) - Bug 337408 - Add an action to sort columns by name
 *    Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Gregoire Dupe (Mia-Software) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 343411 - [Table] Create new elements does not support IJavaModelQuery anymore
 *    Gregoire Dupe (Mia-Software) - Bug 343811 - EMF Facet Regression : Created elements in a table are not serialized
 *    Vincent Lorenzo (CEA-LIST) - Bug 344125 - The API should provide a method selectRows(List<EObject> elementsToSelect)
 *    Nicolas Guyomar (Mia-Software) - Bug 344274 - SWT BOT fail on Hudson
 *    Nicolas Guyomar (Mia-Software) - Bug 344475 - To be able to select a cell by EStructuralFeature in the table
 *    Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *    Nicolas Guyomar (Mia-Software) - Bug 344413 - Facet Columns are never created when we begin with an empty table
 *    Gregoire Dupe (Mia-Software) - Bug 343859 - The local customizations are not applied when we reopen a table
 *    Nicolas Guyomar (Mia-Software) - Bug 344670 - Problems with the columns creation : very slow + scrollbar blinked
 *    Vincent Lorenzo (CEA LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Nicolas Guyomar (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns
 *    Gregoire Dupe (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns - Regression fix
 *    Nicolas Guyomar (Mia-Software) - Bug 345665 - Columns are duplicated when you drop many elements in the same time
 *    Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *    Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Gregoire Dupe (Mia-Software) - Bug 354224 - mutually exclusive Facets
 *    Grégoire Dupé (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *    Gregoire Dupe (Mia-Software) - Bug 380293 - [Table] Columns declared in tableconfiguration are never created when we create an empty table
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    David Couvrand (Soft-Maint) - Bug 417604 - [Table] Columns creation order
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 514489 - Order problem on header columns
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.CustomFactory;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.NavigationTable;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.PrimitiveTypeQueryRow;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.CustomizationUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.FacetsUtils;

/**
 * @since 0.3
 */
public final class CreateTableUtils {

	private CreateTableUtils() {
		// Prevent instantiation
	}

	private static void applyDefaultSettings(
			final TableConfiguration tableConfig, final Table table) {
		if (tableConfig != null) {
			applyDefaultFacets(tableConfig, table);
			applyDefaultCustom(tableConfig, table);
			applyDefaultLocalCustom(tableConfig, table);
			table.setCanBePresentedInTheTable(tableConfig.getCanBePresentedInTheTable());
			// Default columns (provided by the table configuration) are created
			// by
			// org.eclipse.emf.facet.widgets.table.ui.internal.CreateTableUtils.createColumns(Table)
		}
	}

	private static void applyDefaultLocalCustom(
			final TableConfiguration tableConfig, final Table table) {
		for (Customization custom : tableConfig.getDefaultLocalCustomizations()) {
			if (!table.getLocalCustomizations().contains(custom)) {
				table.getLocalCustomizations().add(custom);
			}
		}
	}

	private static void applyDefaultCustom(
			final TableConfiguration tableConfig, final Table table) {
		for (Customization custom : tableConfig.getDefaultCustomizations()) {
			if (!table.getCustomizations().contains(custom)) {
				table.getCustomizations().add(custom);
			}
		}
	}

	private static void applyDefaultFacets(
			final TableConfiguration tableConfig, final Table table) {
		for (Facet facet : tableConfig.getDefaultFacets()) {
			try {
				// TODO Update the meta-model to use "unique" EList.
				if (!table.getFacetSets().contains(facet.eContainer())) {
					table.getFacetSets().add((FacetSet) facet.eContainer());
				}
			} catch (Exception e) {
				// TODO should be externalized
				final String msg = String.format(
						"The referenced facet: %s could not be loaded", facet); //$NON-NLS-1$
				Logger.logError(msg, Activator.getDefault());
			}
		}
	}

	public static void createColumns(final Table table) {
		if (table instanceof NavigationTable) {
			table.getColumns().add(TableFactory.eINSTANCE.createSourceColumn());
			for (Row row : table.getRows()) {
				if (row instanceof PrimitiveTypeQueryRow) {
					table.getColumns().add(
							TableFactory.eINSTANCE.createValueColumn());
					break;
				}
			}
		}
		final List<ETypedElement> features = new ArrayList<ETypedElement>();
		if (table.getTableConfiguration() != null) {
			features.addAll(table.getTableConfiguration().getDefaultColumns());
		}
		for (EStructuralFeature feature : getAllStructuralFeatures(table)) {
			if (!features.contains(feature)) {
				features.add(feature);
			}
		}
		for (final ETypedElement typedElt : features) {
			final FeatureColumn fColumn = TableFactory.eINSTANCE
					.createFeatureColumn();
			fColumn.setFeature(typedElt);
			table.getColumns().add(fColumn);
		}
	}

	public static Table createTableInstance(
			final List<? extends EObject> elements, final String description,
			final TableConfiguration tableConfig, final EObject context,
			final Object parameter) {
		final Table table = TableFactory.eINSTANCE.createTable();
		table.setTableConfiguration(tableConfig);
		table.setContext(context);
		table.setParameter(parameter);
		table.setDescription(description);
		final Set<EObject> added = new HashSet<EObject>();
		for (EObject eObject : elements) {
			if (!added.contains(eObject)) {
				final Row row = TableFactory.eINSTANCE.createRow();
				row.setElement(eObject);
				table.getRows().add(row);
				added.add(eObject);
			}
		}
		applyDefaultSettings(tableConfig, table);
		createColumns(table);
		createLocalCustoms(table);
		return table;
	}

	private static void createLocalCustoms(final Table table) {
		// we create the localCustomization if they don't exists
		// we store the nsURI which have been already added in the local
		// customization
		final Set<EPackage> alreadyDone = new HashSet<EPackage>();
		final Set<EStructuralFeature> allFeatures = getAllStructuralFeatures(
				table);
		for (EStructuralFeature structuralFeature : allFeatures) {
			final EObject sfContainerL1 = structuralFeature.eContainer();
			EObject sfContainerL2 = null;
			if (sfContainerL1 != null) {
				sfContainerL2 = sfContainerL1.eContainer();
			}
			if (sfContainerL2 instanceof EPackage) {
				final EPackage ePackage = (EPackage) sfContainerL2;
				if (!alreadyDone.contains(ePackage)
						&& CustomizationUtils
								.findCustomizationExtendingEPackage(
										table.getLocalCustomizations(),
										ePackage) == null) {
					// we create this localCustomization
					final Customization customizaion = CustomFactory.eINSTANCE
							.createCustomization();
					table.getLocalCustomizations().add(customizaion);
					alreadyDone.add(ePackage);
				}
			}
		}
		// we create localCustomization for FacetColumn
		for (FacetSet container : table.getFacetSets()) {
			if (!alreadyDone.contains(container)
					&& CustomizationUtils.findCustomizationExtendingEPackage(
							table.getLocalCustomizations(), container) == null) {
				// we create this localCustomization
				final Customization metamodelView = CustomFactory.eINSTANCE
						.createCustomization();
				table.getLocalCustomizations().add(metamodelView);
				alreadyDone.add(container);

			}
		}
		// we add all the local customization to the customization, at the
		// beginning of the list
		table.getCustomizations().addAll(0, table.getLocalCustomizations());
	}

	private static Set<EStructuralFeature> getAllStructuralFeatures(
			final Table table) {
		final IFacetManager facetMgr = FacetsUtils
				.getFacetManagerWithGetOrCreateResourceSet(table);
		facetMgr.getManagedFacetSets().addAll(0, table.getFacetSets());
		final List<EObject> elements = TableWidgetUtils.getElements(table);
		final Set<EStructuralFeature> result = new LinkedHashSet<EStructuralFeature>();
		final List<IStatus> statusList = new ArrayList<IStatus>();
		for (EObject eObject : elements) {
			try {
				result.addAll(
						FacetUtils.getAllStructrualFeatures(eObject,
						facetMgr));
			} catch (Exception e) {
				final IStatus status = createStatus(eObject, e);
				statusList.add(status);
			}
		}
		DialogUtils.openErrorDialogWithLogStatus(statusList);
		return result;
	}

	private static IStatus createStatus(final EObject eObject,
			final Exception exc) {
		final String msg = String.format(
				"An exception has occurred while retrieving structural features of: %s", //$NON-NLS-1$
				eObject);
		final IStatus status = new Status(IStatus.ERROR,
				Activator.getDefault().getBundle().getSymbolicName(), msg, exc);
		return status;
	}


}
