/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink.resource;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * This interface extends EMF's {@link Resource} interface and can be used to fine-tune the behavior of EclipseLink
 * resources when loading or saving contents from or to a relational database.
 */
public interface EclipseLinkResource extends Resource {

	/**
	 * Returns the map of options that, in addition to the overriding options specified during load, are used to to
	 * control load behavior.
	 */
	Map<Object, Object> getDefaultLoadOptions();

	/**
	 * Returns the map of options that, in addition to the overriding options specified during save, are used to to
	 * control save behavior.
	 */
	Map<Object, Object> getDefaultSaveOptions();
}
