/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Jonathan Pepin (Soft-Maint) - Bug 518402 - Add test to open table view
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported;

public class TableViewException extends Exception {

	private static final long serialVersionUID = 6864511604874497487L;

	public TableViewException() {
		super();
	}

	public TableViewException(final String message) {
		super(message);
	}

	public TableViewException(final Throwable cause) {
		super(cause);
	}

	public TableViewException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
