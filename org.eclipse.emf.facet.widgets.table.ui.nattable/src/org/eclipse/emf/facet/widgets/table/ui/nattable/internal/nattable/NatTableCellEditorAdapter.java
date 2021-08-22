/*******************************************************************************
 * Copyright (c) 2010, 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *   Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import net.sourceforge.nattable.data.convert.IDisplayConverter;
import net.sourceforge.nattable.data.validate.IDataValidator;
import net.sourceforge.nattable.edit.ICellEditHandler;
import net.sourceforge.nattable.edit.editor.ICellEditor;
import net.sourceforge.nattable.selection.SelectionLayer.MoveDirectionEnum;
import net.sourceforge.nattable.style.IStyle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditHandler;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** Adapts an {@link IModelCellEditor} to an {@link ICellEditor} */
public class NatTableCellEditorAdapter implements ICellEditor {

	private final IModelCellEditor modelCellEditor;
	private final List<Column> columns;
	private Control control;
	private Composite fParent;
	private Object element;
	private IFacetManager facetManager;

	public NatTableCellEditorAdapter(final IModelCellEditor modelCellEditor,
			final List<Column> columns, final IFacetManager facetContext) {
		this.modelCellEditor = modelCellEditor;
		this.columns = columns;
		this.facetManager = facetContext;
	}

	public Control activateCell(final Composite parent, final Object originalCanonicalValue,
			final Character initialEditValue, final IDisplayConverter displayConverter,
			final IStyle cellStyle, final IDataValidator dataValidator,
			final ICellEditHandler editHandler, final int colIndex, final int rowIndex) {

		this.fParent = parent;

		IModelCellEditHandler modelCellEditHandler = new IModelCellEditHandler() {
			public void commit() {
				editHandler.commit(MoveDirectionEnum.NONE, true);
			}
		};

		Column column = this.columns.get(colIndex);
		if (column instanceof FeatureColumn) {
			FeatureColumn featureColumn = (FeatureColumn) column;
			ETypedElement feature = featureColumn.getFeature();
			IGridElement gridElement = (IGridElement) originalCanonicalValue;
			this.element = gridElement.getElement();
			if (this.element instanceof EObject) {
				EObject eObject = (EObject) this.element;
				Object value = null;
				if (feature.eContainer() instanceof Facet) {
					try {
						value = this.facetManager.getOrInvoke(eObject, feature,
								Object.class);
					} catch (Exception e) {
						Logger.logError(e, Activator.getDefault());
					}
				} else {
					try {
						value = this.facetManager.getOrInvoke(eObject, feature,
								Object.class);
					} catch (FacetManagerException e) {
						Logger.logError(e, Activator.getDefault());
						value = "!!! Error, cf log !!!";
					}
				}
				if (feature instanceof EStructuralFeature) {
					EStructuralFeature structuralFeature = (EStructuralFeature) feature;
					this.control = this.modelCellEditor.activateCell(parent,
							value, modelCellEditHandler, structuralFeature,
							eObject);
					return this.control;
				} else {
					throw new IllegalStateException(
							"Only EStructuralFeature value cells are editable"); //$NON-NLS-1$
				}
			}
			throw new IllegalArgumentException("not an EObject"); //$NON-NLS-1$
		}
		// error (when called for multi-cell editing)
		this.control = new Composite(parent, SWT.NONE);
		return this.control;
	}

	public void setCanonicalValue(final Object canonicalValue) {
		// no reason to set the value after creation
		throw new UnsupportedOperationException();
	}

	public Object getCanonicalValue() {
		return this.modelCellEditor.getValue();
	}

	public void close() {
		if (this.fParent != null && !this.fParent.isDisposed()) {
			this.fParent.forceFocus();
		}
		if (this.control != null && !this.control.isDisposed()) {
			this.control.dispose();
		}
	}

	public boolean isClosed() {
		return this.control == null || this.control.isDisposed();
	}

}
