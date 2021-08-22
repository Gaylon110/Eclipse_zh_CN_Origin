/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA-LIST) - bug 337326 - Show/Hide Column : Sort the columns by name
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * A Content Provider which allows to sort the provided elements
 * 
 * 
 * 
 */
class SortedColumnContentProvider implements IStructuredContentProvider {
	/** boolean to know if the returned content should be sorted or not */
	private boolean isSorted = true;
	/** the initial content */
	private List<Column> initialList = new ArrayList<Column>();
	/** the comparator used to sort the element */
	private Comparator<Column> comparator = null;

	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		if (newInput instanceof List) {
			for (Object object : (List<?>) newInput) {
				if (object instanceof Column) {
					Column column = (Column) object;
					this.initialList.add(column);
				}
			}
		}
	}

	public void dispose() {
		// Nothing
	}

	public Object[] getElements(final Object inputElement) {
		if (this.isSorted && this.comparator != null) {
			List<Column> sortedList = new ArrayList<Column>();
			sortedList.addAll(this.initialList);
			Collections.sort(sortedList, this.comparator);
			return sortedList.toArray();
		}
		return this.initialList.toArray();
	}

	/**
	 * Setter for {@link #comparator}
	 * 
	 * @param comparator
	 *            the comparator used to sort the element
	 */
	public void setComparator(final Comparator<Column> comparator) {
		this.comparator = comparator;
	}

	/**
	 * Setter for {@link #isSorted}
	 * 
	 * @param newValue
	 * 
	 */
	public void setIsSorted(final boolean newValue) {
		this.isSorted = newValue;
	}
}