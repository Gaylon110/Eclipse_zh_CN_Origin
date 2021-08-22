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

import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class ConcatenateNameWithPrefixQuery implements IJavaQuery2<Writer, String> {

	public String evaluate(final Writer writer, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		if (parameterValues.size() != 1) {
			throw new DerivedTypedElementException(ConcatenateNameWithPrefixQuery.class.getSimpleName() + " expects one argument"); //$NON-NLS-1$
		}
		return ((String) parameterValues.get(0).getValue()) + writer.getName();
	}
}
