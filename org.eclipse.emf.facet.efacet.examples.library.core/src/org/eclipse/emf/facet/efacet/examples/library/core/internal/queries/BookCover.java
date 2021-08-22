/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 375388 - Cell editor for IImage
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.examples.library.core.internal.queries;

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

public class BookCover implements IJavaQuery2<Book, IImage> {

	private static final String IMG_PATH = "icons/cover.jpg"; //$NON-NLS-1$
	private static Image image;

	private static Image getImage() {
		if (BookCover.image == null) {
			BookCover.image = ImageDescriptor.createFromURL(
					FileLocator.find(Activator.getDefault().getBundle(),
							new Path(BookCover.IMG_PATH), null)).createImage();
		}
		return BookCover.image;
	}

	public IImage evaluate(final Book book, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		return ImageUtils.wrap(BookCover.getImage());
	}
}
