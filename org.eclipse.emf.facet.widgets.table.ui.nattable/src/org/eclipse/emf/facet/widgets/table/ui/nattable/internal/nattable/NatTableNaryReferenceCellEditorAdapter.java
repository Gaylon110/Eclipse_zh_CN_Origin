/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import net.sourceforge.nattable.data.convert.IDisplayConverter;
import net.sourceforge.nattable.data.validate.IDataValidator;
import net.sourceforge.nattable.edit.ICellEditHandler;
import net.sourceforge.nattable.edit.editor.ICellEditor;
import net.sourceforge.nattable.style.IStyle;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditor;
import org.eclipse.emf.facet.widgets.celleditors.INaryFeatureCellEditor;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/** Adapts an {@link IModelCellEditor} to an {@link ICellEditor} */
public class NatTableNaryReferenceCellEditorAdapter implements ICellEditor {

	private final INaryFeatureCellEditor cellEditor;
	private final List<Column> columnDescriptions;
	private Control control;
	private Composite fParent;
	private final EditingDomain editingDomain;

	public NatTableNaryReferenceCellEditorAdapter(final INaryFeatureCellEditor cellEditor,
			final List<Column> columnDescriptions, final EditingDomain editingDomain) {
		this.cellEditor = cellEditor;
		this.columnDescriptions = columnDescriptions;
		this.editingDomain = editingDomain;
	}

	public Control activateCell(final Composite parent, final Object originalCanonicalValue,
			final Character initialEditValue, final IDisplayConverter displayConverter,
			final IStyle cellStyle, final IDataValidator dataValidator,
			final ICellEditHandler editHandler, final int colIndex, final int rowIndex) {

		this.fParent = parent;

		Column columnDescription = this.columnDescriptions.get(colIndex);
		if (!(columnDescription instanceof FeatureColumn)) {
			// error (when called for multi-cell editing)
			this.control = new Composite(parent, SWT.NONE);
			return this.control;
		}
		FeatureColumn featureColumn = (FeatureColumn) columnDescription;
		ETypedElement feature = featureColumn.getFeature();

		IGridElement gridElement = (IGridElement) originalCanonicalValue;
		Object element = gridElement.getElement();
		if (element instanceof EObject && feature instanceof EStructuralFeature) {
			EObject eObject = (EObject) element;
			this.control = this.cellEditor.activateCell(parent,
					(EStructuralFeature) feature, eObject,
					this.editingDomain);
			return this.control;
		}
		throw new IllegalArgumentException("not an EObject"); //$NON-NLS-1$
	}

	public void setCanonicalValue(final Object canonicalValue) {
		// no reason to set the value after creation
		throw new UnsupportedOperationException();
	}

	public Object getCanonicalValue() {
		// should never be called
		throw new UnsupportedOperationException(
				"commit should be disabled and editing domain used directly"); //$NON-NLS-1$
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
