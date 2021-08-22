/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 356795 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.Bug344413Test.testBug344413
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade 
 ******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.exception;

/**
 * This runtime exception is thrown when EMF has not be able resolved a proxy EObject. 
 * @author Gregoire Dupe
 *
 */
public class UnresolvedProxyException extends RuntimeException {

	private static final long serialVersionUID = -8244743869220608742L;

	public UnresolvedProxyException() {
	}

	public UnresolvedProxyException(final String message) {
		super(message);
	}

	public UnresolvedProxyException(final Throwable cause) {
		super(cause);
	}

	public UnresolvedProxyException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
