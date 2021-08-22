/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.query;

import org.eclipse.core.runtime.IStatus;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class QueryResult {
	
	public IStatus evaluationStatus;
	public Object evaluationResult;
	
	
	/**
	 * Constructor
	 * @param evaluationStatus
	 * @param evaluationResult
	 */
	public QueryResult(IStatus evaluationStatus, Object evaluationResult) {
		this.evaluationStatus = evaluationStatus;
		this.evaluationResult = evaluationResult;
	}
	

}
