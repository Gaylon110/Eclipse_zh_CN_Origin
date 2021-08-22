/*******************************************************************************
 * Copyright (c) 2009-2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial implementation
 *    Grégoire Dupé (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 375054 - Add validation warning for overlay on EClass
 *******************************************************************************/
package org.eclipse.emf.facet.common.sdk.ui.internal.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.facet.common.sdk.core.internal.exported.utils.ProjectUtils;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * This operation creates a new project with EMF Facet, Java and Plug-in natures. It initializes the Classpath and plug-in
 * configuration files with default values.
 * 
 */
public class NewProjectCreationOperation extends WorkspaceModifyOperation {
	private final IPath projectLocation;
	private final IProject project;

	public NewProjectCreationOperation(final IPath projectLocation, final IProject projectToCreate) {
		this.projectLocation = projectLocation;
		this.project = projectToCreate;
	}

	@Override
	protected void execute(final IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		ProjectUtils.createEmfFacetProject(this.project, this.projectLocation, monitor);
	}
}
