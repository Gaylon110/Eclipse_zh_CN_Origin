/*******************************************************************************
 * Copyright (c) 2012-2013 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Johannes Faltermeier - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.emfstore.internal.server.storage;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.FileURIHandlerImpl;

/**
 * Handler for serverspace file URIs. Adds functionality for also deleting project folder.
 *
 * @author jfaltermeier
 *
 */
public class ServerSpaceFileURIHandler extends FileURIHandlerImpl {

	private final HashSet<String> extensions;

	/**
	 * Constructor for {@link ServerSpaceFileURIHandler}.
	 *
	 * @param extensions set of all file extensions this handler should handle.
	 */
	public ServerSpaceFileURIHandler(HashSet<String> extensions) {
		this.extensions = extensions;
	}

	@Override
	public boolean canHandle(URI uri) {
		final String extension = "." + uri.fileExtension();
		return extensions.contains(extension);
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		// TODO options?
		final File file = new File(uri.toFileString());
		final File parent = file.getParentFile();
		file.delete();

		if (parent != null && parent.exists() && parent.listFiles().length == 0) {
			FileUtils.deleteDirectory(parent);
		}
	}
}
