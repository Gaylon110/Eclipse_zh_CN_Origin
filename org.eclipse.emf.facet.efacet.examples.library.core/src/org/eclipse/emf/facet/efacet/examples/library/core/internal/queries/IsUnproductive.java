/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 371367 - Hierarchical FacetSets
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.examples.library.core.internal.queries;

import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsUnproductive implements IJavaQuery2<Writer, Boolean> {

	public static final int UNPRODUCTIVENESS_THRESHOLD = 2;

	public Boolean evaluate(final Writer writer, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		int nBooksWritten = new NumberOfBooksWritten().evaluate(writer, null, facetManager).intValue();
		return Boolean.valueOf(nBooksWritten <= IsUnproductive.UNPRODUCTIVENESS_THRESHOLD);
	}
}
