/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Nicolas Bros (Mia-Software) - Bug 377614 - [Table] getSelection should return all the elements underlying the selected cells
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;

/** @deprecated must be replaced by {@link IGridElement} */
@Deprecated
public interface IPositionCoordinate<T extends Object> {

	T getNativeObject();

	int getColumnPosition();

	int getRowPosition();

	void set(int rowPosition, int columnPosition);

}
