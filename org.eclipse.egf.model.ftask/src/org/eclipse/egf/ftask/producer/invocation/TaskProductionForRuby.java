/**
 * 
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 * 
 */

package org.eclipse.egf.ftask.producer.invocation;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;

/**
 * @author xiaoru chen
 * 
 */
public class TaskProductionForRuby implements ITaskProduction {

    public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
        // Be override by ruby class
    }

    public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
        // Be override by ruby class
    }

    public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
        // Be override by ruby class
    }

}
