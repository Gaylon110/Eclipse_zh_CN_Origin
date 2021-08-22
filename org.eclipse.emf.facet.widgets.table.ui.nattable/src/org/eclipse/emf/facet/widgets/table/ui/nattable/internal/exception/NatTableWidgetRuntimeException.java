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
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.exception;

public class NatTableWidgetRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 1134897406847867599L;

	public NatTableWidgetRuntimeException() {
		super();
	}

	public NatTableWidgetRuntimeException(final String message) {
		super(message);
	}

	public NatTableWidgetRuntimeException(final Throwable cause) {
		super(cause);
	}

	public NatTableWidgetRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
