/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import net.sourceforge.nattable.data.convert.IDisplayConverter;
import net.sourceforge.nattable.data.validate.IDataValidator;
import net.sourceforge.nattable.edit.ICellEditHandler;
import net.sourceforge.nattable.edit.editor.ICellEditor;
import net.sourceforge.nattable.style.IStyle;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactoriesRegistry;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditHandler;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.INaryEAttributeCellEditor;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.exception.NatTableWidgetRuntimeException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** Adapts an {@link IModelCellEditor} to an {@link ICellEditor} */
public class NatTableNaryEAttributeCellEditorAdapter<T extends Object> implements ICellEditor {

	private final INaryEAttributeCellEditor<T> cellEditor;
	private final List<Column> columns;
	private Control control;
	private Composite composite;
	private IFacetManager facetManager;
	private EditingDomain editingDomain;

	public NatTableNaryEAttributeCellEditorAdapter(final INaryEAttributeCellEditor<T> cellEditor,
			final List<Column> columns, final IFacetManager facetContext, final EditingDomain editingDomain) {
		this.cellEditor = cellEditor;
		this.columns = columns;
		this.facetManager = facetContext;
		this.editingDomain = editingDomain;
	}

	public Control activateCell(final Composite parent, final Object originalCanonicalValue,
			final Character initialEditValue, final IDisplayConverter displayConverter,
			final IStyle cellStyle, final IDataValidator dataValidator,
			final ICellEditHandler editHandler, final int colIndex, final int rowIndex) {

		this.composite = parent;

		Column column = this.columns.get(colIndex);
		if (!(column instanceof FeatureColumn)) {
			// error (when called for multi-cell editing)
			this.control = new Composite(parent, SWT.NONE);
			return this.control;
		}
		FeatureColumn featureColumn = (FeatureColumn) column;
		final ETypedElement feature = featureColumn.getFeature();

		IGridElement gridElement = (IGridElement) originalCanonicalValue;
		Object element = gridElement.getElement();
		if (element instanceof EObject) {
			final EObject eObject = (EObject) element;
			try {
				if (feature.eContainer() instanceof Facet) {
					IModelCellEditHandler modelCellEditHandler = new IModelCellEditHandler() {
						public void commit() {
							List<T> value = NatTableNaryEAttributeCellEditorAdapter.this.cellEditor
									.getValue();
							if (feature instanceof EStructuralFeature) {
								EStructuralFeature structuralFeature = (EStructuralFeature) feature;
								try {
									NatTableNaryEAttributeCellEditorAdapter.this.facetManager
											.set(eObject,
													structuralFeature,
													value,
													NatTableNaryEAttributeCellEditorAdapter.this.editingDomain);
								} catch (Exception e) {
									throw new NatTableWidgetRuntimeException(e);
								}
							}
						}
					};
					@SuppressWarnings("unchecked")
					// unchecked: We can not check that the method
					// FacetContext.get(EObject, EStructuralFeature) returns a
					// List of T.
					List<T> values = (List<T>) this.facetManager
							.getOrInvokeMultiValued(eObject, feature,
									Object.class);
					if (feature instanceof EStructuralFeature) {
						EStructuralFeature structuralFeature = (EStructuralFeature) feature;
						this.control = this.cellEditor.activateCell(parent,
								values, modelCellEditHandler, eObject,
								structuralFeature);
					} else {
						throw new IllegalStateException();
					}

				} else {
					IModelCellEditHandler modelCellEditHandler = new IModelCellEditHandler() {
						public void commit() {
							List<T> value = NatTableNaryEAttributeCellEditorAdapter.this.cellEditor
									.getValue();
							ICommandFactory commandFactory = ICommandFactoriesRegistry.INSTANCE
									.getCommandFactoryFor(NatTableNaryEAttributeCellEditorAdapter.this.editingDomain);

							Command setCommand = commandFactory.createSetCommand(
									NatTableNaryEAttributeCellEditorAdapter.this.editingDomain,
									eObject, feature, value);
							NatTableNaryEAttributeCellEditorAdapter.this.editingDomain
									.getCommandStack().execute(setCommand);
						}
					};
					@SuppressWarnings("unchecked")
					//unchecked: We can not check that the eGet returns a List of T.
					List<T> values = (List<T>) this.facetManager
							.getOrInvokeMultiValued(eObject, feature,
									Object.class);
					if (values instanceof EStructuralFeature) {
						EStructuralFeature structuralFeature = (EStructuralFeature) values;
						this.control = this.cellEditor.activateCell(parent,
								values, modelCellEditHandler, eObject,
								structuralFeature);
					} else {
						throw new IllegalStateException();
					}

				}
			} catch (Exception e) {
				throw new NatTableWidgetRuntimeException(e);
			}
			return this.control;
		}
		throw new IllegalArgumentException("not an EObject"); //$NON-NLS-1$
	}

	public void setCanonicalValue(final Object canonicalValue) {
		// no reason to set the value after creation
		throw new UnsupportedOperationException();
	}

	public Object getCanonicalValue() {
		return this.cellEditor.getValue();
	}

	public void close() {
		if (this.composite != null && !this.composite.isDisposed()) {
			this.composite.forceFocus();
		}
		if (this.control != null && !this.control.isDisposed()) {
			this.control.dispose();
		}
	}

	public boolean isClosed() {
		return this.control == null || this.control.isDisposed();
	}

}
