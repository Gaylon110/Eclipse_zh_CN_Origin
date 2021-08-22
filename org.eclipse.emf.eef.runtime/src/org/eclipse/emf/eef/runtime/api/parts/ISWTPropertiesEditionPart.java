/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.api.parts;

import org.eclipse.swt.widgets.Composite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public interface ISWTPropertiesEditionPart {

	/**
	 * Create the figure in the specified element.
	 * 
	 * @param parent
	 *            the parent
	 * @return the created view
	 */
	public abstract Composite createFigure(Composite parent);

	/**
	 * Create all elements of the figure. This method is the stateless way to populate another composite.
	 * 
	 * @param parent
	 *            the parent
	 */
	public abstract void createControls(Composite parent);

}
