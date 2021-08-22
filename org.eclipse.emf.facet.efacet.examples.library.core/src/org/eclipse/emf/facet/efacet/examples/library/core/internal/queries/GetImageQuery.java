/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 376941 - [EFacet] Facet operation arguments in Facet model
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.examples.library.core.internal.queries;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.facet.custom.metamodel.custompt.IImage;
import org.eclipse.emf.facet.custom.ui.ImageUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.examples.library.core.internal.Activator;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

public class GetImageQuery implements IJavaQuery2<Book, IImage> {

	private static final Map<String, Image> IMAGES = new HashMap<String, Image>();

	private static Image getImage(final String path) {
		Image image = GetImageQuery.IMAGES.get(path);

		if (image == null) {
			image = ImageDescriptor.createFromURL(
					FileLocator.find(Activator.getDefault().getBundle(),
							new Path(path), null)).createImage();
			GetImageQuery.IMAGES.put(path, image);
		}
		return image;
	}

	public IImage evaluate(final Book book, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if (parameterValues.size() != 1) {
			throw new DerivedTypedElementException(GetImageQuery.class.getSimpleName() + " expects one argument"); //$NON-NLS-1$
		}
		return ImageUtils.wrap(GetImageQuery.getImage((String) parameterValues.get(0).getValue()));
	}
}
