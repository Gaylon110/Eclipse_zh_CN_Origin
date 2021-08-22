/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 377866 - selection customization
 *******************************************************************************/
package org.eclipse.emf.facet.efacet.examples.library.core.internal.queries;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Writer;
import org.eclipse.emf.facet.query.java.core.IJavaQuery2;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class WriterSelection implements IJavaQuery2<Writer, List<? extends Object>> {

	public List<? extends Object> evaluate(final Writer writer, final IParameterValueList2 parameterValues, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		List<? extends Object> result;

		if (parameterValues.size() != 1) {
			throw new DerivedTypedElementException("the selection query expects one argument"); //$NON-NLS-1$
		}
		final Object param1 = parameterValues.get(0).getValue();
		if (!(param1 instanceof ETypedElement)) {
			throw new DerivedTypedElementException("the selection query expects an ETypedElement argument"); //$NON-NLS-1$
		}
		final ETypedElement feature = (ETypedElement) param1;

		// when the name is selected, return the Writer as selection
		if (feature == LibraryPackage.eINSTANCE.getWriter_Name()) {
			result = Collections.<EObject> singletonList(writer);
		} else {
			// otherwise, return the default selection
			// FIXME: we'd like to call "super" here, but super invocation is not implemented for Facets
			result = defaultSelection(writer, feature, facetManager);
		}

		return result;
	}

	// @SuppressWarnings("unchecked") : facet manager is not type safe
	@SuppressWarnings("unchecked")
	private static List<Object> defaultSelection(final EObject source, final ETypedElement feature, final IFacetManager facetManager)
			throws DerivedTypedElementException {
		final List<Object> result;
		try {
			final Object featureResult = facetManager.getOrInvoke(source, feature, null);
			if (feature.isMany()) {
				result = (List<Object>) featureResult;
			} else {
				result = Collections.singletonList(featureResult);
			}
		} catch (FacetManagerException e) {
			throw new DerivedTypedElementException(e);
		}
		return result;
	}
}
