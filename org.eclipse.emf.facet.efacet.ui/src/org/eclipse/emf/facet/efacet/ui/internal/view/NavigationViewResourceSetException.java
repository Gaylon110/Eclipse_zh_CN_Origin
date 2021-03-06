 /*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 480654 - IllegalStateException in NavigationView.addEObjects (611)
 *******************************************************************************/ 
package org.eclipse.emf.facet.efacet.ui.internal.view;

public class NavigationViewResourceSetException extends Exception {

	private static final long serialVersionUID = -2247657462989799934L;

	public NavigationViewResourceSetException() {
		super();
	}

	public NavigationViewResourceSetException(final String message) {
		super(message);
	}

	public NavigationViewResourceSetException(final Throwable cause) {
		super(cause);
	}

	public NavigationViewResourceSetException(final String message,
			final Throwable cause) {
		super(message, cause);
	}

}
