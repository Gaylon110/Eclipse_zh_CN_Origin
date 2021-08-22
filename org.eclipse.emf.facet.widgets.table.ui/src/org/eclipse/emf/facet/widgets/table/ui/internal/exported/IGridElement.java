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
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

import java.util.List;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Row;

/**
 * @since 0.2
 * @author gdupe
 */
public interface IGridElement {

	Row getRow();

	Column getColumn();

	/** @deprecated use {@link IGridElement#getRow()} and then {@link Row#getElement()} */
	@Deprecated
	Object getElement();

	List<Object> getSelection();
}
