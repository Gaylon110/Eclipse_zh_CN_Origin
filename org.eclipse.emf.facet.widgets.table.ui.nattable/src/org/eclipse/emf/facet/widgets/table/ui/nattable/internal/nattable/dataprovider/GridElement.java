/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *   Thomas Cicognani (Soft-Maint) - Bug 438994 - Optimization of selection in TableWidget
 *   Thomas Cicognani (Soft-Maint) - Bug 440652 - Search function doesn't work on table
 *   Gregoire Dupe (Mia-Software) - Bug 440652 - Search function doesn't work on table
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.dataprovider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.IFacetManagerFactory;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.FeatureColumn;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IGridElement;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetInternal;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.Activator;

class GridElement implements IGridElement {
	private Row row;
	private final Column column;
	private final ITableWidgetInternal controller;
	private List<Object> selection;

	public GridElement(final Row row, final Column column) {
		this(row, column, null);
	}

	public GridElement(final Row row, final Column column, final ITableWidgetInternal controller) {
		this.row = row;
		this.column = column;
		this.controller = controller;
	}
	
	public Object getElement() {
		Object result = null;
		if (this.row != null) {
			result = this.row.getElement();
		}
		return result;
	}

	public Column getColumn() {
		return this.column;
	}

	public Row getRow() {
		return this.row;
	}

	public List<Object> getSelection() {
		List<Object> result = this.selection;
		if (result == null) {
			result = new ArrayList<Object>();
			EObject element = this.row.getElement();
			if (element != null
					&& TableWidgetUtils.isApplicable(this,
							this.controller.getFacetContext())) {
				try {
					result = this.controller
							.getCustomizationEngine()
							.getCustomValueOf(
									element,
									((FeatureColumn) this.column).getFeature(),
									this.controller.getSelectionPropertiesHandler()
											.getSelectionProperty(), List.class);
				} catch (CustomizationException e) {
					Logger.logWarning(
							e,
							"Error in table selection customization", Activator.getDefault()); //$NON-NLS-1$
				}
			}
			this.selection = result;
		}
		return result;
	}
	
	@Override
	public String toString() {
		/*
		 * Displays the cell content. It can cause some problems in debug mode
		 * because developer can think it's a string. However this feature is
		 * usefull, especially in search mode (CTRL+F)
		 */
		String string = ""; //$NON-NLS-1$
		final EObject element = this.row.getElement();
		if (this.column instanceof FeatureColumn) {
			final FeatureColumn featureColumn = (FeatureColumn) this.column;
			final ETypedElement typedElement = featureColumn.getFeature();
			if (typedElement instanceof EStructuralFeature) {
				final EStructuralFeature structuralFeature = (EStructuralFeature) typedElement;
				try {
					final ResourceSet resourceSet = this.controller
							.getCustomizationEngine().getResourceSet();
					final IFacetManager facetManager = this.controller
							.getFacetContext();
					final Object value = facetManager.getOrInvoke(element,
							structuralFeature, Object.class);
					final ICustomizedLabelProvider labelProvider = this.controller
							.getTableLabelProvider();
					string = labelProvider.getText(value);
				} catch (FacetManagerException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		}
		return string;
	}
}
