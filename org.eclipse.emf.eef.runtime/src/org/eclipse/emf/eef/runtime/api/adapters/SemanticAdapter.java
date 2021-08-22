/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.api.adapters;

import org.eclipse.emf.ecore.EObject;

/**
 * Interface that allows to defines a way to access to the semantic object to edit with editing component.
 * 
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface SemanticAdapter {

	/**
	 * returns the semantic object to edit.
	 * 
	 * @return the semantic element to edit
	 */
	EObject getEObject();
}
