/*******************************************************************************
 * Copyright (c) 2015, 2017 Soft-Maint, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Thomas Cicognani (Soft-Maint) - Bug 468160 -  Empty table displays a message
 *   Grégoire Dupé (Mia-Software) - Bug 470036 - The message "The table is empty" doesn't disappear
 *   Thomas Cicognani (Mia-Software) - Bug 500761 - Wrong selection after opening an EmptyView (TableWidget)
 *   Thomas Cicognani (Mia-Software) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IPositionCoordinate;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class EmptyWidgetComposite extends Composite implements ITableWidgetView {

	private final Label emptyLabel;

	public EmptyWidgetComposite(final Composite parent) {
		super(parent, SWT.NONE);
		this.emptyLabel = new Label(parent, SWT.NONE);
		this.emptyLabel.setText(Messages.TableWidgetController_EmptyTable);
		setFocus();
	}

	public void fullRedraw() {
		// Nothing to do
	}

	public List<Object> getGridSelection() {
		return new ArrayList<Object>();
	}

	@Deprecated
	@SuppressWarnings("rawtypes")
	// @SuppressWarnings("rawtypes") gdupe> Required by the overridden method
	public IPositionCoordinate[] getSelectedCells2() {
		return new IPositionCoordinate[0];
	}

	@Deprecated
	@SuppressWarnings("rawtypes")
	// @SuppressWarnings("rawtypes") gdupe> Required by the overridden method
	public List<IPositionCoordinate> getSelectedCellsPositions() {
		return new ArrayList<IPositionCoordinate>();
	}

	public boolean isCellSelected() {
		return false;
	}

	public List<Column> getSelectedColumns() {
		return new ArrayList<Column>();
	}

	public void copySelectionToClipboard() {
		// Nothing to do
	}

	public void selectAll() {
		// Nothing to do
	}

	public void selectDefaultLabelCell(final EObject eObject) {
		// Nothing to do
	}

	public void selectCell(final EObject eObject,
			final EStructuralFeature structuralFeature) {
		// Nothing to do
	}

	public void editSelectedCell() {
		// Nothing to do
	}

	public List<Column> getVisibleColumnsUsingTheLayer() {
		return new ArrayList<Column>();
	}

	public void selectRows(final List<EObject> elementsToSelect,
			final boolean clearTheSelection) {
		// Nothing to do
	}

	public boolean isCellsDeletable() {
		return false;
	}

	public Composite asComposite() {
		return this;
	}
	
	@Override
	public void dispose() {
		this.emptyLabel.dispose();
		super.dispose();
	}

}
