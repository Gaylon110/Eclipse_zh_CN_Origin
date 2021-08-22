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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsInProlificnessInterval implements IJavaQuery2<Writer, Boolean> {

	public Boolean evaluate(final Writer writer, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		Assert.isTrue(parameterValues.size() == 2);
		int lowerBound = ((Integer) parameterValues.get(0).getValue()).intValue();
		int upperBound = ((Integer) parameterValues.get(1).getValue()).intValue();
		int nBooksWritten = (new NumberOfBooksWritten().evaluate(writer, null, facetManager)).intValue();
		return Boolean.valueOf(nBooksWritten >= lowerBound && nBooksWritten <= upperBound);
	}
}
