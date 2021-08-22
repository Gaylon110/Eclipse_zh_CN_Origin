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
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.wrapper;

import net.sourceforge.nattable.coordinate.PositionCoordinate;

import org.eclipse.emf.facet.widgets.table.ui.internal.exported.IPositionCoordinate;

public class PositionCoordinateWrapper implements IPositionCoordinate<PositionCoordinate> {
	
	private final PositionCoordinate position;

	public PositionCoordinateWrapper(final PositionCoordinate position) {
		this.position = position;
	}

	public PositionCoordinate getNativeObject() {
		return this.position;
	}

	public int getColumnPosition() {
		return this.position.getColumnPosition();
	}

	public int getRowPosition() {
		return this.position.getRowPosition();
	}

	public void set(final int rowPosition, final int columnPosition) {
		this.position.set(rowPosition, columnPosition);
	}

}
