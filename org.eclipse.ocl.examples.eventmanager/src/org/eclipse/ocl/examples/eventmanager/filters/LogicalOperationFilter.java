/*******************************************************************************
 * Copyright (c) 2009, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.eventmanager.filters;

import java.util.Set;

import org.eclipse.ocl.examples.eventmanager.EventFilter;


/**
 * A {@link LogicalOperationFilter} applies one logical operator to a set of
 * {@link AbstractEventFilter}s
 * 
 * @author Philipp Berger, Axel Uhl
 * 
 */
public interface LogicalOperationFilter {
    /**
     * Returns a read-only collection containing the filters
     */
    Set<EventFilter> getOperands();
}
