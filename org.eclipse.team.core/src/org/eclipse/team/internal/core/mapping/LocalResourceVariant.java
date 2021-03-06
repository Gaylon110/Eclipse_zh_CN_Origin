/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.team.internal.core.mapping;

import java.util.Date;

import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.core.variants.IResourceVariant;

public class LocalResourceVariant implements IResourceVariant {
	private final IResource resource;

	public LocalResourceVariant(IResource resource) {
		this.resource = resource;
	}

	public byte[] asBytes() {
		return getContentIdentifier().getBytes();
	}

	public String getContentIdentifier() {
		return new Date(resource.getLocalTimeStamp()).toString();
	}

	public IStorage getStorage(IProgressMonitor monitor) throws TeamException {
		if (resource.getType() == IResource.FILE) {
			return (IFile)resource;
		}
		return null;
	}

	public boolean isContainer() {
		return resource.getType() != IResource.FILE;
	}

	public String getName() {
		return resource.getName();
	}
}