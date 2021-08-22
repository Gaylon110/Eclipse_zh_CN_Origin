/**
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *     Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 */
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception;

/**
 * This exception is raised when something is wrong with a query, and there is not a more specific
 * sub-class to describe the error (e.g. {@link QueryExecutionException} )
 */
public class CannotExecuteCommandException extends RuntimeException {

	private static final long serialVersionUID = 3957985996784140022L;

	public CannotExecuteCommandException(final String message) {
		super(message);
	}

	public CannotExecuteCommandException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public CannotExecuteCommandException(final Throwable cause) {
		super(cause);
	}

}
