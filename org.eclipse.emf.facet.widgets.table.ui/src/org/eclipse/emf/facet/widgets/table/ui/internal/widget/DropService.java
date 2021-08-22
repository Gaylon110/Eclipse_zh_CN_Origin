/*******************************************************************************
 * Copyright (c) 2010, 2017 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors imported from org.eclipse.emf.facet.widgets.table.ui.internal.TableWidget:
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
 *    Nicolas Guyomar (Mia-Software) - Bug 345554 - SWTBot regression on build 303
 *    Nicolas Guyomar (Mia-Software) - Bug 344925 - Undo/Redo after the action Show Columns
 *    Nicolas Guyomar (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Nicolas Guyomar (Mia-Software) - Bug 344921 - Undo/Redo just after the creation of the table
 *    Nicolas Guyomar (Mia-Software) - Bug 346465 - [EMF Facet Table] Remove line does not remove obsolete column
 *    Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *    Vincent Lorenzo (CEA-LIST) - Bug 352822 - CellEditor EEnum is not available for FacetAttribute
 *    Nicolas Bros (Mia-Software) - Bug 352822 - CellEditor EEnum is not available for FacetAttribute
 *    Vincent Lorenzo (CEA-LIST) - Bug 351931 - Use local cell editor in table
 *    Vincent Lorenzo (CEA-LIST) - Bug 352580 - Facets are loaded to late
 *    Gregoire Dupe (Mia-Software) - Bug 354224 - mutually exclusive Facets
 *    Nicolas Guyomar (Mia-Software) - Bug 342154 - EMF Facet API should be covered with Unit tests
 *    Nicolas Bros (Mia-Software) - Bug 357593 - [Table] Table take focus after each refresh
 *    Grégoire Dupé (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 371367 - Hierarchical FacetSets
 *    Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *    Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 376158 - [Table] Unexpected columns when customizations are loaded
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377754 - [Table] right click deselects elements
 *    Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Nicolas Bros (Mia-Software) - Bug 378649 - [Table] Errors with non-applicable features
 *    Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *    Olivier Remaud (Soft-Maint) - Bug 378499 - optimizing table opening
 *    Nicolas Bros (Mia-Software) - Bug 379436 - [Table] read-only resources should not be editable
 *    Nicolas Bros (Mia-Software) - Bug 379535 - [Table] remove "open table" action
 *    Nicolas Bros (Mia-Software) - Bug 379542 - [Table] cannot add non-Facet columns
 *    Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *    Nicolas Bros (Mia-Software) - Bug 380236 - [Table] table is not properly disposed
 *    Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Gregoire Dupe (Mia-Software) - Bug 387024 - [Table] Column order is not correctly "saved"
 *    Gregoire Dupe (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 *    Gregoire Dupe (Mia-Software) - Bug 377870 - [EFacet] ETypedElementDialog doesn't show all available ETypedElement (library example problem?)
 *    Gregoire Dupe (Mia-Software) - Bug 391442 - Select ETypedElement Dialog doesn't used the subpackages (subEFacetSet)
 *    Gregoire Dupe (Mia-Software) - Bug 415887 - FacetManager cleaned after displaying a TableWidget
 *    Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *    Grégoire Dupé (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Thomas Cicognani (Soft-Maint) - Bug 468160 -  Empty table displays a message
 *    Grégoire Dupé (Mia-Software) - Bug 474288 - IndexOutOfBoundsException in TableWidgetController.createNewElement (1150)
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 518014 - NullPointerException in DropService.canBeDropped
 *    Jonathan Pepin (Soft-Maint) - Bug 518250 - Element dragged over the table must be presentable
 *    Grégoire Dupé (Mia-Software) - Bug 518250 - Element dragged over the table must be presentable
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.TableCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.presentable.PresentableService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.utils.EditingDomainUtils;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;

public class DropService {

	private final PresentableService presentableS;
	private final TableCommandFactory tableCmdFactory;
	private final EditingDomain editingdomain;

	public DropService(final PresentableService presentableS,
			final EditingDomain editingDomain,
			final TableCommandFactory tableCmdFactory) {
		this.presentableS = presentableS;
		this.tableCmdFactory = tableCmdFactory;
		this.editingdomain = editingDomain;
	}

	public final void drop(final IStructuredSelection selection,
			final Object element, final EStructuralFeature feature) {
		final Command cmd = this.tableCmdFactory.createDropCommand(selection,
				element, feature);
		EditingDomainUtils.executeCommand(cmd, this.editingdomain);
	}

	public void drop(final IStructuredSelection selection) {
		final List<EObject> list = new ArrayList<EObject>();
		final Iterator<?> iterator = selection.iterator();
		while (iterator.hasNext()) {
			final Object selectedElement = iterator.next();
			if (selectedElement instanceof EObject) {
				final EObject selectedEObject = (EObject) selectedElement;
				if (!this.presentableS.acceptsElement(selectedEObject)) {
					final String uri = EditingDomainUtils
							.getStringURI(selectedEObject.eClass());
					MessageDialog.openWarning(
							Display.getDefault().getActiveShell(),
							Messages.wrongEObjectType,
							Messages.wrongEObjectTypeLong + uri);
					return;
				}
				list.add(selectedEObject);
			}
		}
		// Update the Table
		addRows(list);
	}

	public final boolean canBeDropped(final IStructuredSelection selection,
			final Row row, final Column column) {
		boolean result = false;
		if (row == null && column == null) {
			result = this.presentableS.acceptsElement(selection);
		} else if (row != null && column instanceof FeatureColumn) {
			final EObject element = row.getElement();
			final FeatureColumn featureColumn = (FeatureColumn) column;
			final ETypedElement typedElement = featureColumn.getFeature();
			final EClassifier eType = typedElement.getEType();
			if (eType instanceof EClass
					&& typedElement instanceof EStructuralFeature) {
				final EClass eClass = (EClass) eType;
				final EStructuralFeature feature = (EStructuralFeature) typedElement;
				result = canBeDroppedOnFeature(selection, element, feature,
						eClass);
			}
		}
		return result;
	}

	private boolean canBeDroppedOnFeature(final IStructuredSelection selection,
			final EObject element, final EStructuralFeature feature,
			final EClass eClass) {
		boolean result = false;
		final EClass eltEClass = element.eClass();
		final boolean haveFeature = eltEClass.getEAllStructuralFeatures()
				.contains(feature);
		if (haveFeature && selection != null) {
			int nElements = 0;
			for (Object object : selection.toList()) {
				nElements++;
				if ((nElements > 1 && !feature.isMany())
						|| !eClass.isInstance(object)) {
					result = false;
					break;
				}
			}
			if (result && !selection.isEmpty()) {
				final Command cmd = this.tableCmdFactory
						.createDropCommand(selection, element, feature);
				result = cmd.canExecute();
			}
		}
		return result;
	}

	/**
	 * This method takes a list of {@link EObject} and add it to the widget list
	 * if their are not already in it.
	 *
	 * @param newElements
	 *            The list of EObject elements to be added to the table
	 */
	public final void addRows(final List<? extends EObject> newElements) {
		final Command cmd = this.tableCmdFactory
				.createAddRowsCommand(newElements);
		EditingDomainUtils.executeCommand(cmd, this.editingdomain);
	}
}
