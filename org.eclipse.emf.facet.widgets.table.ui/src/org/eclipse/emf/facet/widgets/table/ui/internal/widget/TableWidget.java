/*******************************************************************************
 * Copyright (c) 2010, 2017 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
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
 *    Thomas Cicognani (Mia-Software) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 518250 - Element dragged over the table must be presentable
 *    Jonathan Pepin (Soft-Maint) - Bug 518402 - Add test to open table view
 *******************************************************************************/

package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.emf.facet.custom.ui.IContentPropertiesHandlerFactory;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProviderFactory;
import org.eclipse.emf.facet.custom.ui.ISelectionPropertiesHandler;
import org.eclipse.emf.facet.custom.ui.ISelectionPropertiesHandlerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.ui.internal.exported.dialog.IETypedElementSelectionDialog;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.emf.core.CommandFactory;
import org.eclipse.emf.facet.util.emf.core.command.ILockableUndoCommand;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TableFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.TablePackage;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.command.ITableCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IPositionCoordinate;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetView;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetViewFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialog;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IColumnsToHideDialog;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.TableWidgetRuntimeException;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.column.ColumnsAddService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.column.ColumnsHideService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.column.SortService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.BasicCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.TableCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.RowDeleteCommandStackListener;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.RowDeleteTriggerListener;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.CustomizationUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.FacetAndCustomService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.FacetsUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.facetcustom.LocalCustomCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.instantiation.InstantiationMethodService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.presentable.PresentableService;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.utils.EditingDomainUtils;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.utils.ResourceUtils;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;

public class TableWidget implements ITableWidgetInternal {

	//////////////// Debugging constants (begin)//////////////////

	protected static final boolean DEBUG_EVENTS = DebugUtils
			.getDebugStatus(Activator.getDefault(), "events"); //$NON-NLS-1$
	protected static final boolean DEBUG_RESOURCE_LISTENER = DebugUtils
			.getDebugStatus(Activator.getDefault(), "resource_listener"); //$NON-NLS-1$
	private static final boolean DEBUG_SET_FACET = DebugUtils
			.getDebugStatus(Activator.getDefault(), "setFacet"); //$NON-NLS-1$
	protected static final boolean DEBUG_SELECTION = DebugUtils
			.getDebugStatus(Activator.getDefault(), "selection"); //$NON-NLS-1$
	protected static final boolean DEBUG_SORT = DebugUtils
			.getDebugStatus(Activator.getDefault(), "sort"); //$NON-NLS-1$

	//////////////// Debugging constants (end) //////////////////

	private static final int REFRESH_JOB_DELAY = 100;

	/** The Input */
	private final Table tableInstance;
	/** The label provider */
	private ICustomizedLabelProvider tableLabelProvider;

	private final Collection<ISelectionChangedListener> fSelectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	private final ModelChangedListener modelChangedLstnr;
	private final TableChangedListener tableChangedLstnr;
	private final ICustomizationManager customizationEngine;
	/** All the metaclasses of the elements */
	private final MetaClassCache metaClassCache;
	private final Resource resource;
	private final MenuManager menuMgr;
	/** Whether to enable editability of the table's data */
	private final boolean dataEditable;
	private final EditingDomain editingDomain;
	/** The command factory used to create every command for the widget*/
	private final transient ICommandFactory commandFactory;
	private final ITableWidgetView composite;
	private final IFacetManager facetManager;
	private final List<IActionDelegate> actionList = new ArrayList<IActionDelegate>();
	private final IContentPropertiesHandler contentPropertiesHandler;
	private final ISelectionPropertiesHandler selectionPropertiesHandler;
	private final GridElementManager gridElementManager;
	private boolean disposed;
	private ISelection tableSelection;
	private final Composite parent;
	private final LocalCustomCommandFactory localCustoCmdFactory;
	private final TableCommandFactory tableCmdFactory;
	private final PresentableService presentableSrvc;
	private final SortService sortSrvc;
	private final FacetAndCustomService facetAndCustomSrvc;
	private final ColumnsAddService columnsAddSrvc;
	private final ColumnsHideService columnsHideSrvc;
	private final DropService dropSrvc;
	private final InstantiationMethodService initMethodSrvc;

	/** Allows optimized refreshes of the table */
	// TODO : should be externalized
	private final Job refreshJob = new Job("Refresh EMF Facet Table") { //$NON-NLS-1$
		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					DebugUtils.debug(TableWidget.DEBUG_EVENTS, "Refresh job execution."); //$NON-NLS-1$
					if (!isDisposed()) {
						TableWidget.this.reset();
					}
				}
			});
			return Status.OK_STATUS;
		}
	};

	/**
	 *
	 * @param parent
	 *            This composite parent
	 * @param editingDomainProvider
	 *            An editing provider
	 * @param tableInstanceParam
	 *            The {@link Table} which contains all the needed
	 *            information to open a table
	 * @param menuMgr
	 */
	public TableWidget(final Composite parent,
			final IEditingDomainProvider editingDomainProvider,
			final Table tableInstanceParam, final MenuManager menuMgr,
			final ITableWidgetViewFactory compositeFactory) {
		this.parent = parent;
		if (tableInstanceParam == null || tableInstanceParam.getRows().isEmpty()) {
			// No result ==> Display a message instead an empty table
			this.composite = new EmptyWidgetComposite(parent);
		} else {
			this.composite = compositeFactory.createTableView(parent, this);
		}
		this.menuMgr = menuMgr;
		this.editingDomain = EditingDomainUtils
				.initEditingDomain(editingDomainProvider);
		this.dataEditable = !EditingDomainUtils
				.isEditingDomainProviderNotInitialized(editingDomainProvider);
		this.tableInstance = initTable(tableInstanceParam);
		this.resource = initResource();
		this.commandFactory = ICommandFactoriesRegistry.INSTANCE
				.getCommandFactoryFor(this.editingDomain);
		this.facetManager = IFacetManagerFactory.DEFAULT
				.getOrCreateDefaultFacetManager(this.resource.getResourceSet());
		this.customizationEngine = ICustomizationManagerFactory.DEFAULT
				.createICustomizationManager(this.facetManager);
		this.contentPropertiesHandler = IContentPropertiesHandlerFactory.DEFAULT
				.createIContentPropertiesHandler(this.customizationEngine);
		this.tableCmdFactory = new TableCommandFactory(this.tableInstance,
				this.editingDomain, this.commandFactory);
		final BasicCommandFactory basicCmdFactory = new BasicCommandFactory(
				this.commandFactory, this.editingDomain);
		this.localCustoCmdFactory = new LocalCustomCommandFactory(
				this.tableInstance, basicCmdFactory);
		this.facetAndCustomSrvc = new FacetAndCustomService(this.tableInstance,
				basicCmdFactory);
		this.columnsAddSrvc = new ColumnsAddService(this.tableInstance,
				basicCmdFactory);
		this.columnsHideSrvc = new ColumnsHideService(this.tableInstance,
				basicCmdFactory);
		this.presentableSrvc = new PresentableService(this.tableInstance,
				basicCmdFactory, this.tableCmdFactory);
		this.sortSrvc = new SortService(this.tableInstance, basicCmdFactory);
		this.dropSrvc = new DropService(this.presentableSrvc,
				this.editingDomain, this.tableCmdFactory);
		this.initMethodSrvc = new InstantiationMethodService(
				this.tableInstance, this.tableCmdFactory, this.editingDomain);
		this.selectionPropertiesHandler = ISelectionPropertiesHandlerFactory.DEFAULT
				.createSelectionPropertiesHandler(this.customizationEngine);
		this.gridElementManager = new GridElementManager(this.facetManager,
				this.customizationEngine, this.selectionPropertiesHandler);
		this.metaClassCache = new MetaClassCache(this.tableInstance);
		reset();
		this.composite.asComposite().addDisposeListener(new DisposeListener() {
			public void widgetDisposed(final DisposeEvent event) {
				onWidgetDisposed();
			}
		});
		this.tableChangedLstnr = initTableChangedListener();
		this.modelChangedLstnr = initModelChangedListener();
		initListeningStrategy();
	}

	private final Table initTable(final Table tableInstanceParam) {
		Table result = null;
		if (tableInstanceParam == null) {
			result = TableFactory.eINSTANCE.createTable();
			final Resource newResource = ResourceUtils
					.createDefaultResource(this.editingDomain);
			newResource.getContents().add(result);
		} else {
			result = tableInstanceParam;
		}
		return result;
	}

	private final Resource initResource() {
		Resource result = null;
		if (this.tableInstance.eResource() == null) {
			result = ResourceUtils.createDefaultResource(this.editingDomain);
			final Command setResourceContentCommand = CommandFactory
					.createSetResourceContentsCommand(result,
							this.tableInstance);
			if (setResourceContentCommand instanceof ILockableUndoCommand) {
				final ILockableUndoCommand lockableUndoCommand = (ILockableUndoCommand) setResourceContentCommand;
				lockableUndoCommand.enableCanUndo(false);
			}
			this.editingDomain.getCommandStack()
					.execute(setResourceContentCommand);
			result.getContents().add(this.tableInstance);
		} else {
			result = this.tableInstance.eResource();
		}
		return result;
	}

	private void initListeningStrategy() {
		// Depending of the editing domain nature, we use a differente model
		// listening strategy.
		if (this.editingDomain instanceof TransactionalEditingDomain) {
			final TransactionalEditingDomain transactionalEditingDomain = (TransactionalEditingDomain) this.editingDomain;
			final RowDeleteTriggerListener listener = new RowDeleteTriggerListener(
					this.tableInstance);
			transactionalEditingDomain.addResourceSetListener(listener);
		} else {
			final RowDeleteCommandStackListener listener = new RowDeleteCommandStackListener(
					this.tableInstance, this.editingDomain);
			EditingDomainUtils.addCommandStackListener(this.editingDomain,
					listener);
		}
	}

	private final TableChangedListener initTableChangedListener() {
		return new TableChangedListener(this.tableInstance, new Runnable() {
			public void run() {
				refreshDelayed();
			}
		});
	}

	private final ModelChangedListener initModelChangedListener() {
		return new ModelChangedListener(this.tableInstance, new Runnable() {
			public void run() {
				refreshDelayed();
			}
		});
	}

	/**
	 * This method should not be executed twice at the same time
	 */
	private final synchronized void reset() {
		final boolean canReset = this.sortSrvc.isCanReset();
		if (canReset) {
			DebugUtils.debug(TableWidget.DEBUG_EVENTS, "Start"); //$NON-NLS-1$
			this.metaClassCache.updateMetaClasses();
			this.tableLabelProvider = ICustomizedLabelProviderFactory.DEFAULT
					.createCustomizedLabelProvider(this.customizationEngine);
			FacetsUtils.loadManagedFacetSetsInTable(this.tableInstance,
					this.facetManager);
			if (this.tableInstance.getCustomizations() != null) {
				CustomizationUtils
						.loadCustomizationsInTable(this.tableInstance);
			}
			// End Bug 415887
			// FIXME removeUselessRowsAndColumns() should be called there. It
			// should
			// called only at the table opennning.
			removeUselessRowsAndColumns();
			// FIXME (end)
			fullRedraw();
			DebugUtils.debug(TableWidget.DEBUG_EVENTS, "End"); //$NON-NLS-1$
		}
	}

	protected final void onWidgetDisposed() {
		this.disposed = true;
		this.fSelectionChangedListeners.clear();
		this.modelChangedLstnr.dispose();
		this.tableChangedLstnr.dispose();
		this.refreshJob.cancel();
	}

	private static Object getStructuralFeatureValue(final EObject eObject,
			final EStructuralFeature structuralFeature) {
		return eObject.eGet(structuralFeature);
	}

	private static boolean hasStructuralFeature(final EObject eObject,
			final EStructuralFeature structuralFeature) {
		final EClass eClass = eObject.eClass();
		return eClass.getEAllStructuralFeatures().contains(structuralFeature);
	}

	public final void tableSelectionChanged() {
		updateSelection();
		final SelectionChangedEvent event = new SelectionChangedEvent(this, getSelection());
		final List<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>(
				this.fSelectionChangedListeners);
		for (ISelectionChangedListener listener : listeners) {
			listener.selectionChanged(event);
		}
	}

	private void updateSelection() {
		checkNotDisposed();
		final List<Object> rawSelection = this.getRawSelection();
		this.tableSelection = this.gridElementManager
				.computeSelection(rawSelection);
	}

	public final void setSelection(final ISelection selection) {
		// The selection can not be set through the API
	}

	/**
	 * Add a {@link ISelectionChangedListener} to the widget.
	 */
	public final void addSelectionChangedListener(final ISelectionChangedListener listener) {
		if (!this.fSelectionChangedListeners.contains(listener)) {
			this.fSelectionChangedListeners.add(listener);
		}
	}

	/**
	 * Remove a {@link ISelectionChangedListener} from the widget.
	 */
	public final void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		this.fSelectionChangedListeners.remove(listener);
	}

	/**
	 * Sort columns by type of link (attributes first, then references, then
	 * derived references, ...)
	 */
	public final void sortColumnsByType() {
		this.sortSrvc.sortColumnsByType();
	}

	/** Hide columns which don't contain any elements */
	public final void setHideEmptyColumns(final boolean hideEmptyColumns) {
		final Command cmd = this.sortSrvc.getColumnsCmdFactory()
				.createSetHideEmptyColumnsCommand(hideEmptyColumns);
		this.editingDomain.getCommandStack().execute(cmd);
	}

	public final boolean isEmptyColumn(final Column column) {
		boolean result = false;
		if (column instanceof FeatureColumn) {
			FeatureColumn featureColumn = (FeatureColumn) column;
			if (featureColumn.getFeature() instanceof EReference) {
				result = isEmpty((EReference) featureColumn.getFeature());
			}
		}
		return result;
	}

	/**
	 * Open a selection popup to select which columns to show/hide.
	 */
	public final void selectColumnsToHide() {
		openColumnsToHideDialog();
	}

	public final IColumnsToHideDialog openColumnsToHideDialog() {
		return this.columnsHideSrvc.openColumnsToHideDialog();
	}

	public final void showHideColumns(final List<Column> columnToShow,
			final boolean putOnTheTop) {
		this.columnsHideSrvc.showHideColumns(columnToShow, putOnTheTop);
	}

	public final boolean isOneOfTheLocalCustomizationsNotOnTheTop() {
		return CustomizationUtils
				.isOneOfTheLocalCustomizationsNotOnTheTop(this.tableInstance);
	}

	public void putLocalCustomizationOnTheTop() {
		final Command cmd = this.localCustoCmdFactory
				.createPutLocalCustomizationOnTheTopCommand();
		executeCommand(cmd);
	}

	/** Whether no element has this reference set */
	private boolean isEmpty(final EStructuralFeature reference) {
		for (EObject eObject : TableWidgetUtils.getElements(this.tableInstance)) {
			if (hasStructuralFeature(eObject, reference)) {
				final Object value = getStructuralFeatureValue(eObject, reference);
				if (reference.isMany() && value instanceof List<?>) {
					final List<?> list = (List<?>) value;
					if (!list.isEmpty()) {
						return false;
					}
				} else {
					if (value != null) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Whether to show columns which are specific to a few elements (false), or
	 * only columns which are common to all the elements (true)
	 */
	public final void setOnlyShowCommonColumns(
			final boolean onlyShowCommonColumns) {
		final Command cmd = this.sortSrvc.getColumnsCmdFactory()
				.createSetOnlyShowCommonColumnsCommand(onlyShowCommonColumns);
		executeCommand(cmd);
	}

	/**
	 * @return true if there is at least a column selected
	 */
	public final boolean isColumnSelected() {
		List<Column> columns = getSelectedColumns();
		if (columns != null) {
			return columns.size() > 0;
		}
		return false;
	}

	/**
	 * remove the selected line from the table
	 */
	public final void removeLine() {
		//TODO This method has to be deprecated and replaced by removeLine2
		try {
			removeLine2();
		} catch (CoreException e) {
			throw new TableWidgetRuntimeException(e);
		}
	}

	private Collection<Row> getSelectedRow() {
		final List<Integer> selectedRowIndex = getSelecedRowIndexes();
		final List<Row> selectedEObjects = new ArrayList<Row>();
		for (Integer index : selectedRowIndex) {
			selectedEObjects.add(this.tableInstance.getRows().get(
					index.intValue()));
		}
		return selectedEObjects;
	}

	public List<EObject> getSelectedRowEObjects() {
		final List<Integer> selectedRowIndex = getSelecedRowIndexes();
		final List<EObject> selectedEObjects = new ArrayList<EObject>();
		for (Integer index : selectedRowIndex) {
			selectedEObjects.add(this.tableInstance.getRows().get(
					index.intValue()).getElement());
		}
		return selectedEObjects;
	}

	private List<Integer> getSelecedRowIndexes() {
		final List<Integer> selectedRowIndex = new ArrayList<Integer>();
		final IPositionCoordinate[] selectedCells = this.getSelectedCells2();
		for (IPositionCoordinate positionCoordinate : selectedCells) {
			if (!selectedRowIndex.contains(positionCoordinate.getRowPosition())) {
				selectedRowIndex.add(positionCoordinate.getRowPosition());
			}
		}
		return selectedRowIndex;
	}

	/**
	 * remove the selected line from the table
	 * @throws CoreException may be caused by query exception in the facet framework
	 */
	private final void removeLine2() throws CoreException {
		final Collection<Row> rows = getSelectedRow();
		final Command cmd = this.tableCmdFactory.createRemoveRowsCommand(rows);
		executeCommand(cmd);
	}

	/**
	 * Delete the selected elements from their containing resource
	 */
	public final void deleteSelection() {
		try {
			final List<Object> rawSelection = getRawSelection();
			final Set<EObject> selectedEObjects = this.gridElementManager
					.getSelectedEObjects(rawSelection);
			final Command cmd = this.tableCmdFactory
					.createDeleteSelectedElementsCommand(selectedEObjects);
			executeCommand(cmd);
		} catch (CoreException e) {
			throw new TableWidgetRuntimeException(e);
		}
	}

	public final List<InstantiationMethod> getInstantiationMethodHistory() {
		return this.initMethodSrvc.getInstantiationMethodHistory();
	}

	public final void selectInstantiationMethodToLaunch() {
		this.initMethodSrvc.selectInstantiationMethodToLaunch();
	}

	public final void createNewElement() {
		this.initMethodSrvc.createNewElement();
	}

	public final void createNewElement(
			final InstantiationMethod instantiationMethod) {
		this.initMethodSrvc.createNewElement(instantiationMethod);
	}

	// legacy method for old nattable implem
	public final boolean isNonCommonColumns(final Column column) {
		boolean common = true;
		if (column instanceof FeatureColumn) {
			FeatureColumn featureColumn = (FeatureColumn) column;
			if (featureColumn.getFeature() instanceof EStructuralFeature) {
				EStructuralFeature structuralFeature = (EStructuralFeature) featureColumn
						.getFeature();
				common = this.metaClassCache.isCommon(structuralFeature);
			}
		}
		return !common;
	}

	public final List<Column> getColumns() {
		return Collections.unmodifiableList(this.tableInstance.getColumns());
	}

	public ICustomizationManager getCustomizationEngine() {
		return this.customizationEngine;
	}

	public final IFacetManager getFacetContext() {
		return this.facetManager;
	}

	public final void setFacetSets(final List<? extends FacetSet> facetSets) {
		if (TableWidget.DEBUG_SET_FACET) {
			DebugUtils.debug("nbFacetSets=", String.valueOf(facetSets.size())); //$NON-NLS-1$
			for (FacetSet facetSet : facetSets) {
				DebugUtils.debug("facetSetName=", facetSet.getName()); //$NON-NLS-1$
			}
		}
		this.setLoadedFacetSets(new ArrayList<FacetSet>(facetSets));
		if (TableWidget.DEBUG_SET_FACET) {
			this.columnsHideSrvc.debugNbColumns();
		}
	}

	public final TableConfiguration getTableConfiguration() {
		return getTable().getTableConfiguration();
	}

	public final Table getTable() {
		return this.tableInstance;
	}

	public final EObject getContext() {
		return getTable().getContext();
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
		executeCommand(cmd);
	}

	public final void openLoadCustomizationDialog() {
		this.facetAndCustomSrvc.openLoadCustomizationDialog();
	}

	public final void openLoadFacetSetsDialog() {
		this.facetAndCustomSrvc.openLoadFacetSetsDialog();
	}

	protected Shell getShell() {
		return this.parent.getShell();
	}

	/**
	 * Open a "Save As" dialog to serialize the table
	 */
	public final void saveAs() {
		EditingDomainUtils.saveAs(this.editingDomain, this.resource);
	}

	/**
	 * Performs the usual save action.
	 */
	public final void save() {
		EditingDomainUtils.save(this.editingDomain, this.resource);
	}

	public final boolean isDataEditable() {
		return this.dataEditable;
	}

	public final void drop(final StructuredSelection structuredSelection,
			final Object element, final EStructuralFeature feature) {
		this.dropSrvc.drop(structuredSelection, element, feature);
	}

	public void drop(final StructuredSelection structuredSelection) {
		this.dropSrvc.drop(structuredSelection);
	}

	public final boolean canBeDropped(
			final IStructuredSelection structuredSelection, final Row row,
			final Column column) {
		return this.dropSrvc.canBeDropped(structuredSelection, row, column);
	}

	public final Control getComposite() {
		return this.composite.asComposite();
	}

	public final void unregisterActionDelegate(final IActionDelegate action) {
		this.actionList.remove(action);
	}

	public final void notifyActions() {
		for (IActionDelegate action : this.actionList) {
			action.selectionChanged(null, null);
		}
	}

	public final void sortColumnByNameAtoZ() {
		this.sortSrvc.sortColumnByNameAtoZ();
	}

	public final void sortColumnByNameZtoA() {
		this.sortSrvc.sortColumnByNameZtoA();
	}

	public final List<Column> getVisibleColumns(final boolean setAtTheTop) {
		return this.columnsHideSrvc.getVisibleColumns(setAtTheTop);
	}

	public final void putLocalCustomizationOnTheBottom() {
		final Command cmd = this.localCustoCmdFactory
				.createPutLocalCustomizationOnTheBottomCommand();
		executeCommand(cmd);
	}

	/**
	 *
	 * @param eObject
	 *            an eObject
	 * @return
	 * the row representing the eObject or <code>null</code> if not found
	 */
	public final Row findRow(final EObject eObject) {
		for (Row row : this.tableInstance.getRows()) {
			if (row.getElement().equals(eObject)) {
				return row;
			}
		}
		return null;
	}

	protected final void refreshDelayed() {
		DebugUtils.debug(TableWidget.DEBUG_RESOURCE_LISTENER);
		// If refreshTreeDelayed is called again before the job delay passed,
		// then cancel the job and re-schedule a new one.
		this.refreshJob.cancel();
		this.refreshJob.setPriority(Job.DECORATE);
		this.refreshJob.schedule(TableWidget.REFRESH_JOB_DELAY);
	}

	public final EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	public final ICommandFactory getCommandFactory() {
		return this.commandFactory;
	}

	public final void waitForRefreshJob() {
		boolean wait = true;
		while (wait) {
			try {
				if (this.refreshJob != null) {
					this.refreshJob.join();
				}
			wait = false;
			} catch (InterruptedException e) {
				wait = true;
			}
		}
	}

	/**
	 * If a table element has been deleted from outside the table, then we need
	 * to remove the inconsistent row from its model.
	 */
	private final void removeUselessRowsAndColumns() {
		final Command cmd = this.tableCmdFactory
				.createRemoveUselessRowsAndColumnsCommand();
		executeCommand(cmd);
	}

	public final boolean usesTmpResource() {
		return ResourceUtils.usesTmpResource(this.tableInstance);
	}

	public final MenuManager getMenuManager() {
		return this.menuMgr;
	}

	public ICustomizedLabelProvider getTableLabelProvider() {
		return this.tableLabelProvider;
	}

	public void setColumnWidth(final Column column, final int width) {
		Command cmd = this.getCommandFactory()
				.createSetCommand(this.getEditingDomain(),
						column, TablePackage.eINSTANCE
								.getColumn_Width(), width);
		this.getEditingDomain().getCommandStack().execute(cmd);
	}

	public void setRowHeight(final Row row, final int height) {
		Command cmd = this.getCommandFactory().createSetCommand(
				this.getEditingDomain(), row,
				TablePackage.eINSTANCE.getRow_Height(), height);
		this.getEditingDomain().getCommandStack()
				.execute(cmd);
	}

	public void moveColumn(final Column element, final int newPosition) {
		Command command = this.getCommandFactory().createMoveCommand(
				this.getEditingDomain(),
				this.getTable(),
				TablePackage.eINSTANCE
.getTable_Columns(), element,
						newPosition);
		this.getEditingDomain().getCommandStack().execute(command);
	}

	public List<Column> getSelectedColumns() {
		return this.composite.getSelectedColumns();
	}

	public IPositionCoordinate[] getSelectedCells2() {
		return this.composite.getSelectedCells2();
	}

	public List<IPositionCoordinate> getSelectedCellsPositions() {
		return Arrays.asList(getSelectedCells2());
	}

	public void copySelectionToClipboard() {
		this.composite.copySelectionToClipboard();
	}

	public void selectAll() {
		this.composite.selectAll();
	}

	public boolean isCellSelected() {
		return this.composite.isCellSelected();
	}

	public void selectCell(final EObject eObject, final EStructuralFeature structuralFeature) {
		this.composite.selectCell(eObject, structuralFeature);
	}

	public void editSelectedCell() {
		if (isSelectedCellEditable()) {
			this.composite.editSelectedCell();
		}
	}

	public boolean isSelectedCellEditable() {
		final List<Object> rawSelection = getRawSelection();
		return this.gridElementManager.isSelectedCellEditable(rawSelection);
	}

	public void selectRows(final List<EObject> elementsToSelect,
			final boolean clearTheSelection) {
		this.composite.selectRows(elementsToSelect, clearTheSelection);
	}

	public ISelection getSelection() {
		if (this.tableSelection == null) {
			updateSelection();
		}
		return this.tableSelection;
	}

	/** This is a sanity check to avoid dealing with a disposed widget */
	private void checkNotDisposed() {
		if (this.disposed) {
			throw new IllegalStateException("the widget is disposed"); //$NON-NLS-1$
		}
	}

	private void fullRedraw() {
		checkNotDisposed();
		this.composite.fullRedraw();
	}

	public boolean getListenReorderEvent() {
		return this.sortSrvc.isListenReorderEvent();
	}

	public final void loadCustomizations(
			final List<Customization> customizationsToLoad,
			final boolean mustLoadAdditionalFacets) {
		final Command cmd = this.facetAndCustomSrvc.getFctCustCmdFactory()
				.createSetCustomizationCommand(customizationsToLoad);
		executeCommand(cmd);
	}

	private void executeCommand(final Command command) {
		EditingDomainUtils.executeCommand(command, this.editingDomain);
	}

	public IContentPropertiesHandler getCustomPropertiesHandler() {
		return this.contentPropertiesHandler;
	}

	public void setCanBePresentedInTheTable(
			final ETypedElement presentabilityQuery,
			final boolean removeNonConformingElements) {
		this.presentableSrvc.setCanBePresentedInTheTable(presentabilityQuery,
				removeNonConformingElements);
	}

	public ETypedElement getCanBePresentedInTheTable() {
		return this.presentableSrvc.getPresentabilityQuery();
	}

	public IAllowedContentsETypedElementSelectionDialog openCanBePresentedInTheTableDialog() {
		return this.presentableSrvc.openCanBePresentedInTheTableDialog(getShell());
	}

	public List<ETypedElement> getApplicableCanBePresentedQueries() {
		return this.presentableSrvc.getApplicableCanBePresentedQueries();
	}

	public void undo() {
		this.editingDomain.getCommandStack().undo();
	}

	public void redo() {
		this.editingDomain.getCommandStack().redo();
	}

	public void setLoadedFacetSets(final List<FacetSet> facetSets) {
		final Command cmd = this.facetAndCustomSrvc.getFctCustCmdFactory()
				.createSetLoadedFacetSetsCommand(facetSets);
		this.executeCommand(cmd);
	}

	public IETypedElementSelectionDialog<Object> openAddColumnsDialog() {
		return this.columnsAddSrvc.openAddColumnsDialog();
	}

	public final void addColumns(final List<ETypedElement> eTypedElements,
			final List<FacetSet> facetSets) {
		this.columnsAddSrvc.addColumns(eTypedElements, facetSets);
	}

	public void sortRows(final Column column,
			final ColumnSortDirection direction) {
		if (column instanceof FeatureColumn) {
			final long begin = System.currentTimeMillis();
			final FeatureColumn featureColumn = (FeatureColumn) column;
			final Command cmd = this.tableCmdFactory.createSortRowCommand(
					featureColumn, direction, this.facetManager,
					this.customizationEngine);
			final long createCmd = System.currentTimeMillis();
			executeCommand(cmd);
			final long end = System.currentTimeMillis();
			if (TableWidget.DEBUG_SORT) {
				DebugUtils.debug("sort and createCmd =" + (createCmd - begin)); //$NON-NLS-1$
				DebugUtils.debug("exec =" + (end - createCmd)); //$NON-NLS-1$
				DebugUtils.debug("total =" + (end - begin)); //$NON-NLS-1$
			}
		}
	}

	public List<Object> getRawSelection() {
		return this.composite.getGridSelection();
	}

	/** @return the selected grid elements */
	protected List<IGridElement> getSelectedGridElements() {
		final List<Object> selection = getRawSelection();
		final List<IGridElement> gridElements = new ArrayList<IGridElement>();
		for (final Object object : selection) {
			if (object instanceof IGridElement) {
				gridElements.add((IGridElement) object);
			}
		}
		return gridElements;
	}

	public boolean isDisposed() {
		return this.disposed;
	}

	public void removeColumns(final List<ETypedElement> elements) {
		final Command cmd = this.sortSrvc.getColumnsCmdFactory()
				.createRemoveColumnsCommand(elements);
		executeCommand(cmd);
	}

	public ITableCommandFactory getTableCommandFactory() {
		return this.tableCmdFactory;
	}

	public ISelectionPropertiesHandler getSelectionPropertiesHandler() {
		return this.selectionPropertiesHandler;
	}

}
