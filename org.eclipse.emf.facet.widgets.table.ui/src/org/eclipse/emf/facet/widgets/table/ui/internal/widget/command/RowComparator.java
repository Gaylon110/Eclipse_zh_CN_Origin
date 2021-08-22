/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 380126 - [Table] Row sort too long
 *    Gr�goire Dup� (Mia-Software) - Bug 440618 - Table sort action unusable
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.command;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.custom.core.ICustomizationManager;
import org.eclipse.emf.facet.custom.core.ICustomizationManagerFactory;
import org.eclipse.emf.facet.custom.core.exception.CustomizationException;
import org.eclipse.emf.facet.custom.ui.internal.exported.ILabelPropertiesHandler;
import org.eclipse.emf.facet.custom.ui.internal.exported.ILabelPropertiesHandlerFactory;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ColumnSortDirection;

public class RowComparator implements Comparator<Row> {

	private final ETypedElement eTypedElement;
	private final ColumnSortDirection direction;
	private final IFacetManager facetManager;
	private final ICustomizationManager customManager;
	private final FacetOperation labelProperty;
	private long duration = 0;
	private final Map<EObject, Object> map = new HashMap<EObject, Object>();

	public RowComparator(final ETypedElement eTypedElement,
			final ColumnSortDirection direction,
			final IFacetManager facetManager,
			final ICustomizationManager customManager) {
		this.eTypedElement = eTypedElement;
		this.direction = direction;
		this.facetManager = facetManager;
		this.customManager = customManager;
		final ILabelPropertiesHandler propHandler = ILabelPropertiesHandlerFactory.DEFAULT.createLabelPropertiesHandler(this.customManager);
		this.labelProperty = propHandler.getLabelProperty();
	}

	public int compare(final Row row1, final Row row2) {
		final long begin = System.currentTimeMillis();
		final Object value1 = getValue(row1);
		final Object value2 = getValue(row2);
		final int result = compareValues(value1, value2);
		final long end = System.currentTimeMillis();
		this.duration = this.duration + (end - begin);
		return result;
	}

	private Object getValue(final Row row) {
		final EObject eObject = row.getElement();
		Object value = this.map.get(eObject);
		if (value == null) {
			try {
				value = this.facetManager.getOrInvoke(eObject,
						this.eTypedElement, Object.class);
				if (value instanceof EObject) {
					value = this.customManager.getCustomValueOf((EObject) value,
							this.labelProperty, String.class);
				}
				this.map.put(eObject, value);
			} catch (Exception e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return value;
	}

	protected final int compareValues(final Object element1,
			final Object element2) {
		int result;
		if (element1 == null) {
			result = -1;
		} else if (element1 instanceof Comparable<?>) {
			@SuppressWarnings("unchecked")
			// @SuppressWarnings("unchecked") : The parameter type checking is
			// not useful because we use Object
			final Comparable<Object> comparable = (Comparable<Object>) element1;
			result = comparable.compareTo(element2);
		} else {
			if (element2 == null) {
				result = 1;
			} else {
				result = element1.toString().compareTo(element2.toString());
			}
		}
		if (this.direction == ColumnSortDirection.DESCENDING) {
			result = -result;
		}
		return result;
	}

	public long getDuration() {
		return this.duration;
	}

}
