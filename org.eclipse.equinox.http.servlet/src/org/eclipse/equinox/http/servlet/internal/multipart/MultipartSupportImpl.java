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

import java.io.*;
import java.security.AccessControlContext;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.eclipse.equinox.http.servlet.dto.ExtendedServletDTO;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class MultipartSupportImpl implements MultipartSupport {

	public MultipartSupportImpl(ExtendedServletDTO servletDTO, ServletContext servletContext) {
		this.servletDTO = servletDTO;

		// Must return non-null File. See Servlet 3.1 §4.8.1
		File baseStorage = (File)servletContext.getAttribute(ServletContext.TEMPDIR);

		if (servletDTO.multipartLocation.length() > 0) {
			File storage = new File(servletDTO.multipartLocation);

			if (!storage.isAbsolute()) {
				storage = new File(baseStorage, storage.getPath());
			}

			baseStorage = storage;
		}

		checkPermission(baseStorage, servletContext);

		baseStorage.mkdirs();

		DiskFileItemFactory factory = new DiskFileItemFactory();

		factory.setRepository(baseStorage);

		if (servletDTO.multipartFileSizeThreshold > 0) {
			factory.setSizeThreshold(servletDTO.multipartFileSizeThreshold);
		}

		upload = new ServletFileUpload(factory);

		if (servletDTO.multipartMaxFileSize > -1L) {
			upload.setFileSizeMax(servletDTO.multipartMaxFileSize);
		}

		if (servletDTO.multipartMaxRequestSize > -1L) {
			upload.setSizeMax(servletDTO.multipartMaxRequestSize);
		}
	}

	private void checkPermission(File baseStorage, ServletContext servletContext) {
		BundleContext bundleContext = (BundleContext)servletContext.getAttribute("osgi-bundlecontext"); //$NON-NLS-1$
		Bundle bundle = bundleContext.getBundle();
		AccessControlContext accessControlContext = bundle.adapt(AccessControlContext.class);
		if (accessControlContext == null) return;
		accessControlContext.checkPermission(new FilePermission(baseStorage.getAbsolutePath(), "read,write")); //$NON-NLS-1$
	}

	public Map<String, Part> parseRequest(HttpServletRequest request) throws IOException, ServletException {
		if (upload == null) {
			throw new IllegalStateException("Servlet was not configured for multipart!"); //$NON-NLS-1$
		}

		if (!servletDTO.multipartEnabled) {
			throw new IllegalStateException("No multipart config on " + servletDTO); //$NON-NLS-1$
		}

		if (!ServletFileUpload.isMultipartContent(request)) {
			throw new ServletException("Not a multipart request!"); //$NON-NLS-1$
		}

		Map<String, Part> parts = new HashMap<String, Part>();

		try {
			for (Object item : upload.parseRequest(request)) {
				DiskFileItem diskFileItem = (DiskFileItem)item;

				parts.put(diskFileItem.getFieldName(), new MultipartSupportPart(diskFileItem));
			}
		}
		catch (FileUploadException fnfe) {
			throw new IOException(fnfe);
		}

		return parts;
	}

	private final ExtendedServletDTO servletDTO;
	private final ServletFileUpload upload;


}