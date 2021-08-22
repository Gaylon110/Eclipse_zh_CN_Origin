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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

/**
 * This exception class is used to aggregate an set of ModelQueryExceptions
 */
public class MultiModelQueryException extends CoreException {

	private static final long serialVersionUID = 4576739821162232328L;

	public MultiModelQueryException(final IStatus status) {
		super(status);
	}

}
