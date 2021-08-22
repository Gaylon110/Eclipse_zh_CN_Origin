/*******************************************************************************
 * Copyright (c) 2011, 2017 Mia-Software, and Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 367700 - [Unit Test Failure][0.2/3.8] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.swtbot.NatTableUITests.testOpenLoadCustomizationDialog
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 374903 - [Table] ITableWidget.setLoadedFacetSets
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *    Nicolas Bros (Mia-Software) - Bug 377773 - [Table] sorting doesn't work on all columns
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 378701 - [Unit Test Failure] org.eclipse.emf.facet.widgets.table.tests.internal.v0_2.notuithread.Bug354224Test*
 *    Nicolas Bros (Mia-Software) - Bug 379535 - [Table] remove "open table" action
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *    Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *    Gregoire Dupe (Mia-Software) - Bug 440618 - Table sort action unusable
 *    Thomas Cicognani (Soft-Maint) - Bug 512179 - Table widget refactoring
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *    Jonathan Pepin (Soft-Maint) - Bug 518250 - Element dragged over the table must be presentable
 *******************************************************************************/
 package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.emf.facet.custom.ui.IContentPropertiesHandler;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.custom.ui.ISelectionPropertiesHandler;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.ui.internal.exported.dialog.IETypedElementSelectionDialog;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.InstantiationMethod;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.command.ITableCommandFactory;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IPositionCoordinate;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IAllowedContentsETypedElementSelectionDialog;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog.IColumnsToHideDialog;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception.SyncException;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionDelegate;

/**
 * @since 0.2
 * @author gdupe
 *
 */
public class SynchronizedTableWidgetController implements ITableWidgetInternal {

	private final ITableWidgetInternal nattableWidget;
	private final Thread widgetThread;
	private final Display display;
	
	public SynchronizedTableWidgetController(
			final ITableWidgetInternal nattableWidget, final Display display) {
		this.display = display;
		this.nattableWidget = nattableWidget;
		this.widgetThread = display.getThread();
	}

	private interface Runnable<T, E extends Exception> {
		T run() throws E;
	}

	private <T, E extends Exception> T syncExecWithResult(final Runnable<T, E> runnable) throws E {
		T result;
		if (this.widgetThread == Thread.currentThread()) {
			result = runnable.run();
		} else {
			final Exception[] exceptionHandler = new Exception[1];
			final Object[] resultHandler = new Object[1];
			this.display.syncExec(new java.lang.Runnable() {
				public void run() {
					try {
						resultHandler[0] = runnable.run();
					} catch (final Exception e) {
						exceptionHandler[0] = e;
					}

				}
			});
			if (exceptionHandler[0] != null) {
				@SuppressWarnings("unchecked")
				// @SuppressWarnings("unchecked") This cast is safe because
				// "exceptionHandler" contains an exception thrown by "runnable"
				// and
				// "runnable" throws by definition a instance of E
				final E castException = (E) exceptionHandler[0];
				throw castException;
			}
			@SuppressWarnings("unchecked")
			// @SuppressWarnings("unchecked") This cast is safe because
			// "resultHandler" contains a value returned by "runnable" and
			// "runnable" returns by definition a instance of T
			final T tmpResult = (T) resultHandler[0];
			result = tmpResult;
		}
		return result;
	}

	private abstract class AbstractVoidRunnable<E extends Exception> implements
			SynchronizedTableWidgetController.Runnable<Object, E> {
		
		protected abstract void voidRun() throws E;

		public Object run() throws E {
			this.voidRun();
			return null;
		}
	}

	private <E extends Exception> void voidSyncExec(final AbstractVoidRunnable<E> runnable) throws E {
		this.syncExecWithResult(runnable);
	}

	private abstract class AbstractExceptionFreeRunnable<T> implements
	SynchronizedTableWidgetController.Runnable<T, Exception> {
		
		protected abstract T safeRun();

		public T run() {
			return this.safeRun();
		}
	}

	private <T> T safeSyncExec(final AbstractExceptionFreeRunnable<T> runnable) {
		try {
			return this.syncExecWithResult(runnable);
		} catch (final Exception e) {
			throw new SyncException(e);
		}
	}

	private abstract class AbstractVoidExceptionFreeRunnable implements
	SynchronizedTableWidgetController.Runnable<Object, Exception> {
		protected abstract void voidSafeRun();

		public Object run() {
			voidSafeRun();
			return null;
		}
	}

	private void voidExceptionFreeRunnable(final AbstractVoidExceptionFreeRunnable runnable) {
		try {
			this.syncExecWithResult(runnable);
		} catch (final Exception e) {
			throw new SyncException(e);
		}
	}

	public void addSelectionChangedListener(final ISelectionChangedListener listener) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().addSelectionChangedListener(listener);
			}
		});
	}

	public ISelection getSelection() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<ISelection>() {
			@Override
			protected ISelection safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getSelection();
			}
		});
	}

	public void removeSelectionChangedListener(final ISelectionChangedListener listener) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
				.removeSelectionChangedListener(listener);
			}
		});
	}

	public void setSelection(final ISelection selection) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().setSelection(selection);
			}
		});
	}

	public void createNewElement() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().createNewElement();
			}
		});
	}

	public void createNewElement(final InstantiationMethod instantiationMethod) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
				.createNewElement(instantiationMethod);
			}
		});
	}

	public void selectInstantiationMethodToLaunch() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().selectInstantiationMethodToLaunch();
			}
		});
	}

	public void save() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().save();
			}
		});
	}

	public void saveAs() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().saveAs();
			}
		});

	}

	public void copySelectionToClipboard() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().copySelectionToClipboard();
			}
		});
	}

	public void deleteSelection() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().deleteSelection();
			}
		});
	}

	public void selectColumnsToHide() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().selectColumnsToHide();
			}
		});
	}

	public void setHideEmptyColumns(final boolean hideEmptyColumns) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
				.setHideEmptyColumns(hideEmptyColumns);
			}
		});
	}

	public void setOnlyShowCommonColumns(final boolean showCommonColumns) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
				.setOnlyShowCommonColumns(showCommonColumns);
			}
		});
	}

	public void sortColumnsByType() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().sortColumnsByType();
			}
		});
	}

	public void removeLine() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().removeLine();
			}
		});

	}

	public void selectAll() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().selectAll();
			}
		});
	}

	public TableConfiguration getTableConfiguration() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<TableConfiguration>() {
			@Override
			protected TableConfiguration safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getTableConfiguration();
			}
		});
	}

	public List<InstantiationMethod> getInstantiationMethodHistory() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<List<InstantiationMethod>>() {
			@Override
			protected List<InstantiationMethod> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getInstantiationMethodHistory();
			}
		});
	}

	public Table getTable() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Table>() {
			@Override
			protected Table safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getTable();
			}
		});
	}

	public boolean isCellSelected() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isCellSelected();
			}
		});
	}

	public boolean isColumnSelected() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isColumnSelected();
			}
		});
	}

	public Control getComposite() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Control>() {
			@Override
			protected Control safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getComposite();
			}
		});
	}

	public void addRows(final List<? extends EObject> newElements) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().addRows(newElements);
			}
		});

	}

	public void unregisterActionDelegate(final IActionDelegate action) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().unregisterActionDelegate(action);
			}
		});

	}

	public void openLoadCustomizationDialog() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().openLoadCustomizationDialog();
			}
		});

	}

	public void openLoadFacetSetsDialog() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().openLoadFacetSetsDialog();
			}
		});

	}

	public void sortColumnByNameAtoZ() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().sortColumnByNameAtoZ();
			}
		});

	}

	public void sortColumnByNameZtoA() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().sortColumnByNameZtoA();
			}
		});

	}

	public void setFacetSets(final List<? extends FacetSet> facetSets) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.setFacetSets(facetSets);
			}
		});
	}

	public void selectCell(final EObject eObject, final EStructuralFeature structuralFeature) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().selectCell(eObject,
						structuralFeature);
			}
		});

	}

	public void editSelectedCell() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().editSelectedCell();
			}
		});
	}

	public void showHideColumns(final List<Column> selectedColumns, final boolean putOnTheTop) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().showHideColumns(selectedColumns,
						putOnTheTop);
			}
		});
	}

	public boolean isOneOfTheLocalCustomizationsNotOnTheTop() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isOneOfTheLocalCustomizationsNotOnTheTop();
			}
		});
	}

	public List<Column> getVisibleColumns(final boolean setAtTheTop) {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<List<Column>>() {
			@Override
			protected List<Column> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getVisibleColumns(setAtTheTop);
			}
		});
	}

	public void putLocalCustomizationOnTheTop() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().putLocalCustomizationOnTheTop();
			}
		});
	}

	public void putLocalCustomizationOnTheBottom() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().putLocalCustomizationOnTheBottom();
			}
		});
	}

	public boolean isSelectedCellEditable() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isSelectedCellEditable();
			}
		});
	}

	public void selectRows(final List<EObject> elementsToSelect, final boolean clearTheSelection) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().selectRows(elementsToSelect,
						clearTheSelection);
			}
		});
	}

	public IColumnsToHideDialog openColumnsToHideDialog() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<IColumnsToHideDialog>() {
			@Override
			protected IColumnsToHideDialog safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().openColumnsToHideDialog();
			}
		});
	}

	public ICustomizedLabelProvider getTableLabelProvider() {
		return this
				.safeSyncExec(new AbstractExceptionFreeRunnable<ICustomizedLabelProvider>() {
			@Override
					protected ICustomizedLabelProvider safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getTableLabelProvider();
			}
		});
	}

	public void waitForRefreshJob() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().waitForRefreshJob();
			}
		});
	}

	public IFacetManager getFacetContext() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<IFacetManager>() {
			@Override
			protected IFacetManager safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getFacetContext();
			}
		});
	}

	public boolean usesTmpResource() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().usesTmpResource();
			}
		});
	}

	public List<IPositionCoordinate> getSelectedCellsPositions() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<List<IPositionCoordinate>>() {
			@Override
			protected List<IPositionCoordinate> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget()
						.getSelectedCellsPositions();
			}
		});
	}

	/**
	 * @return the nattableWidget
	 */
	public ITableWidgetInternal getNattableWidget() {
		return this.nattableWidget;
	}
	
	public Display getDisplay() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Display>() {
			@Override
			protected Display safeRun() {
				return SynchronizedTableWidgetController.this.display;
			}
		});
	}

	public void setCanBePresentedInTheTable(final ETypedElement query,
			final boolean removeNonConformElements) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.setCanBePresentedInTheTable(query,
								removeNonConformElements);
			}
		});
		
	}

	public ETypedElement getCanBePresentedInTheTable() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<ETypedElement>() {
			@Override
			protected ETypedElement safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getCanBePresentedInTheTable();
			}
		});
	}

	public EditingDomain getEditingDomain() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<EditingDomain>() {
			@Override
			protected EditingDomain safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getEditingDomain();
			}
		});
	}

	public IAllowedContentsETypedElementSelectionDialog openCanBePresentedInTheTableDialog() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<IAllowedContentsETypedElementSelectionDialog>() {
			@Override
			protected IAllowedContentsETypedElementSelectionDialog safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().openCanBePresentedInTheTableDialog();
			}
		});
	}

	public List<ETypedElement> getApplicableCanBePresentedQueries() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<List<ETypedElement>>() {
			@Override
			protected List<ETypedElement> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getApplicableCanBePresentedQueries();
			}
		});
	}

	public void setColumnWidth(final Column column, final int width) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.setColumnWidth(column, width);
			}
		});
	}

	public void setRowHeight(final Row row, final int height) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.setRowHeight(row, height);
			}
		});
	}

	public void moveColumn(final Column element, final int newPosition) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.moveColumn(element, newPosition);
			}
		});
	}

	public boolean isDataEditable() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isDataEditable();
			}
		});
	}

	public ICustomizationManager getCustomizationEngine() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<ICustomizationManager>() {
			@Override
			protected ICustomizationManager safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getCustomizationEngine();
			}
		});
	}

	public void tableSelectionChanged() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.tableSelectionChanged();
			}
		});
	}

	public MenuManager getMenuManager() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<MenuManager>() {
			@Override
			protected MenuManager safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getMenuManager();
			}
		});
	}

	public void notifyActions() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.notifyActions();
			}
		});
	}

	public List<Column> getColumns() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<List<Column>>() {
			@Override
			protected List<Column> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getColumns();
			}
		});
	}

	public boolean isNonCommonColumns(final Column column) {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isNonCommonColumns(column);
			}
		});
	}

	public boolean isEmptyColumn(final Column column) {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().isEmptyColumn(column);
			}
		});
	}

	public Row findRow(final EObject eObject) {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Row>() {
			@Override
			protected Row safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().findRow(eObject);
			}
		});
	}

	public boolean getListenReorderEvent() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getListenReorderEvent();
			}
		});
	}

	public boolean canBeDropped(final IStructuredSelection structuredSelection,
			final Row row, final Column column) {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<Boolean>() {
			@Override
			protected Boolean safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().canBeDropped(structuredSelection, row, column);
			}
		});
	}

	public void drop(final StructuredSelection structuredSelection, final Object element, final EStructuralFeature feature) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.drop(structuredSelection, element, feature);
			}
		});

	}

	public void drop(final StructuredSelection structuredSelection) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.drop(structuredSelection);
			}
		});
	}

	public void loadCustomizations(
			final List<Customization> customizationsToLoad,
			final boolean mustLoadAdditionalFacets) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.loadCustomizations(customizationsToLoad, mustLoadAdditionalFacets);
			}
		});
	}

	public IContentPropertiesHandler getCustomPropertiesHandler() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<IContentPropertiesHandler>() {
			@Override
			protected IContentPropertiesHandler safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getCustomPropertiesHandler();
			}
		});
	}

	public void undo() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().undo();
			}
		});
	}

	public void redo() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().redo();
			}
		});
	}

	public void setLoadedFacetSets(final List<FacetSet> facetSets) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.setLoadedFacetSets(facetSets);
			}
		});

	}

	public IETypedElementSelectionDialog openAddColumnsDialog() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected IETypedElementSelectionDialog safeRun() {
				return SynchronizedTableWidgetController.this
						.getNattableWidget().openAddColumnsDialog();
			}
		});
	}

	public void sortRows(final Column column, final ColumnSortDirection direction) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().sortRows(column, direction);
			}
		});
	}

	public List<Object> getRawSelection() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected List<Object> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getRawSelection();
			}
		});
	}

	public void addColumns(final List<ETypedElement> eTypedElements, final List<FacetSet> facetSets) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget().addColumns(eTypedElements, facetSets);
			}
		});
	}

	public void removeColumns(final List<ETypedElement> elements) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			protected void voidSafeRun() {
				SynchronizedTableWidgetController.this.getNattableWidget()
						.removeColumns(elements);
			}
		});
	}

	public List<EObject> getSelectedRowEObjects() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected List<EObject> safeRun() {
				return SynchronizedTableWidgetController.this.getNattableWidget().getSelectedRowEObjects();
			}
		});
	}

	public ITableCommandFactory getTableCommandFactory() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected ITableCommandFactory safeRun() {
				return SynchronizedTableWidgetController.this
						.getNattableWidget().getTableCommandFactory();
			}
		});
	}

	public ISelectionPropertiesHandler getSelectionPropertiesHandler() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected ISelectionPropertiesHandler safeRun() {
				return SynchronizedTableWidgetController.this
						.getNattableWidget().getSelectionPropertiesHandler();
			}
		});
	}

	public List<Column> getSelectedColumns() {
		return safeSyncExec(new AbstractExceptionFreeRunnable() {
			@Override
			protected List<Column> safeRun() {
				return SynchronizedTableWidgetController.this
						.getNattableWidget().getSelectedColumns();
			}
		});
	}

}
