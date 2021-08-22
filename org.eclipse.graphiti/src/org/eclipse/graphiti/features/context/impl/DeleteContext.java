/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.features.context.impl;

import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMultiDeleteInfo;
import org.eclipse.graphiti.internal.features.context.impl.base.PictogramElementContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * The Class DeleteContext.
 */
public class DeleteContext extends PictogramElementContext implements IDeleteContext {

	private IMultiDeleteInfo multiDeleteInfo = null;

	/**
	 * Creates a new {@link DeleteContext}.
	 * 
	 * @param pictogramElement
	 *            the pictogram element
	 */
	public DeleteContext(PictogramElement pictogramElement) {
		super();
		setPictogramElement(pictogramElement);
	}

	/**
	 * @since 0.8
	 */
	public void setMultiDeleteInfo(IMultiDeleteInfo multiDeleteInfo) {
		this.multiDeleteInfo = multiDeleteInfo;
	}

	/**
	 * @since 0.8
	 */
	public IMultiDeleteInfo getMultiDeleteInfo() {
		return multiDeleteInfo;
	}
}
