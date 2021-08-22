/*******************************************************************************
 * Copyright (c) 2016 Raymond Augé and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Raymond Augé <raymond.auge@liferay.com> - Bug 497271
 *******************************************************************************/
package org.eclipse.equinox.http.servlet.internal.multipart;

import javax.servlet.ServletContext;
import org.eclipse.equinox.http.servlet.dto.ExtendedServletDTO;

public interface MultipartSupportFactory {

	MultipartSupport newInstance(ExtendedServletDTO servletDTO, ServletContext servletContext);

}