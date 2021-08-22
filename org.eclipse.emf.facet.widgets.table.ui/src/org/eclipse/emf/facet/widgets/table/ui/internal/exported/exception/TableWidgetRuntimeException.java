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
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception;

public class TableWidgetRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 425103098151980437L;

	public TableWidgetRuntimeException() {
		super();
	}

	public TableWidgetRuntimeException(final String message) {
		super(message);
	}

	public TableWidgetRuntimeException(final Throwable cause) {
		super(cause);
	}

	public TableWidgetRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
