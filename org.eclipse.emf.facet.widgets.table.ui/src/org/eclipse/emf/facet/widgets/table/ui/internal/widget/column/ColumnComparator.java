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
 *  Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *  Vincent Lorenzo (CEA-LIST) - Bug 337326 - Show/Hide Column : Sort the columns by name
 *  Vincent Lorenzo (CEA-LIST) - Bug 337408 - Add an action to sort columns by name
 *  Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.column;

import java.util.Comparator;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetInternalUtils;

/**
 * Comparator used to sort the columns of the table by alphabetic order :
 * [Label] [Metaclass] and others columns beginning with '[' are in first.
 * /eContainer comes after these columns, and the others columns are sorted by
 * name.
 * 
 */
public class ColumnComparator implements Comparator<Column> {
	/** indicates if the columns are sorted from A to Z or from Z to A */
	private boolean inversedOrder = false;

	/**
	 * Setter for {@link #inversedOrder}
	 * 
	 * @param value
	 *            the new value for {@link #inversedOrder}
	 */
	public void setInversedOrder(final boolean value) {
		this.inversedOrder = value;
	}

	/**
	 * 
	 * Compare returns :
	 * <ul>
	 * <li>"-number" when the elements are in alphabetic order. the "number"
	 * indicates the number of elements between the 2 compared elements</li>
	 * <li>"0" when they are equals</li>
	 * <li>"+number" when the element are not in alphabetic order</li>
	 * </ul>
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public int compare(final Column columnDescription1, final Column columnDescription2) {
		String name1 = TableWidgetInternalUtils.getColumnName(columnDescription1);
		String name2 = TableWidgetInternalUtils.getColumnName(columnDescription2);

		// remove all / for name1
		StringBuffer buffer1 = new StringBuffer(name1);
		while (buffer1.indexOf("/") != -1) { //$NON-NLS-1$ 
			buffer1 = buffer1.deleteCharAt(buffer1.indexOf("/")); //$NON-NLS-1$
		}
		name1 = buffer1.toString();
		
		// remove all / for name2
		StringBuffer buffer2 = new StringBuffer(name2);
		while (buffer2.indexOf("/") != -1) { //$NON-NLS-1$ 
			buffer2 = buffer2.deleteCharAt(buffer2.indexOf("/")); //$NON-NLS-1$
		}
		name2 = buffer2.toString();
		int answer = name1.compareToIgnoreCase(name2);

		if (this.inversedOrder) {
			answer =  answer * (-1);
		}
		return answer;
	}
}
