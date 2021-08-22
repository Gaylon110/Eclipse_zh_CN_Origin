/*******************************************************************************
 * Copyright (c) 2005, 2016 Cognos Incorporated, IBM Corporation and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cognos Incorporated - initial API and implementation
 *     IBM Corporation - bug fixes and enhancements
 *     Raymond Augé - bug fixes and enhancements
 *******************************************************************************/
package org.eclipse.equinox.http.servlet.internal.registration;

import java.io.IOException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import org.eclipse.equinox.http.servlet.dto.ExtendedServletDTO;
import org.eclipse.equinox.http.servlet.internal.context.ContextController;
import org.eclipse.equinox.http.servlet.internal.context.ContextController.ServiceHolder;
import org.eclipse.equinox.http.servlet.internal.multipart.MultipartSupport;
import org.eclipse.equinox.http.servlet.internal.multipart.MultipartSupportFactory;
import org.eclipse.equinox.http.servlet.internal.servlet.Match;
import org.osgi.service.http.context.ServletContextHelper;
import org.osgi.service.http.runtime.dto.ErrorPageDTO;

//This class wraps the servlet object registered in the HttpService.registerServlet call, to manage the context classloader when handleRequests are being asked.
public class ServletRegistration extends EndpointRegistration<ExtendedServletDTO> {

	private static MultipartSupportFactory factory;

	static {
		ServiceLoader<MultipartSupportFactory> loader = ServiceLoader.load(MultipartSupportFactory.class);

		Iterator<MultipartSupportFactory> iterator = loader.iterator();

		while (iterator.hasNext()) {
			try {
				factory = iterator.next();
				break;
			}
			catch (Throwable t) {
				// ignore, it means our optional imports are missing.
			}
		}
	}

	public ServletRegistration(
		ServiceHolder<Servlet> servletHolder, ExtendedServletDTO servletDTO, ErrorPageDTO errorPageDTO,
		ServletContextHelper servletContextHelper,
		ContextController contextController, ServletContext servletContext, ClassLoader legacyTCCL) {

		super(servletHolder, servletDTO, servletContextHelper, contextController, legacyTCCL);

		this.errorPageDTO = errorPageDTO;

		if (servletDTO.multipartEnabled) {
			if (factory == null) {
				throw new IllegalStateException(
					"Multipart support not enabled due to missing, optional commons-fileupload dependency!"); //$NON-NLS-1$
			}
			multipartSupport = factory.newInstance(servletDTO, servletContext);
		}
		else {
			multipartSupport = null;
		}
	}

	public ErrorPageDTO getErrorPageDTO() {
		return errorPageDTO;
	}

	@Override
	public String getName() {
		return getD().name;
	}

	@Override
	public String[] getPatterns() {
		return getD().patterns;
	}

	@Override
	public long getServiceId() {
		return getD().serviceId;
	}

	@Override
	public String match(
		String name, String servletPath, String pathInfo, String extension,
		Match match) {

		if ((errorPageDTO != null) && (name != null)) {
			for (long errorCode : errorPageDTO.errorCodes) {
				if (String.valueOf(errorCode).equals(name)) {
					return name;
				}
			}

			for (String exception : errorPageDTO.exceptions) {
				if (exception.equals(name)) {
					return name;
				}
			}
		}

		return super.match(name, servletPath, pathInfo, extension, match);
	}

	public Map<String, Part> parseRequest(HttpServletRequest request) throws IOException, ServletException {
		if (multipartSupport == null) {
			throw new IOException("Servlet not configured for multipart!"); //$NON-NLS-1$
		}

		return multipartSupport.parseRequest(request);
	}

	private final ErrorPageDTO errorPageDTO;
	private final MultipartSupport multipartSupport;

}
