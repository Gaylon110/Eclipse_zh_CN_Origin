/** 
 * Copyright (c) 2015 Soft-Maint, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 470962 - Add shortcuts to activate customs
 *    Gregoire Dupe (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.emf.facet.ecore.ui.internal.custom.hidederivedreferences;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.DerivedTypedElementException;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.DerivedTypedElement;
import org.eclipse.emf.facet.query.java.core.IJavaQuery3;
import org.eclipse.emf.facet.query.java.core.IParameterValueList2;

public class IsVisibleQuery implements IJavaQuery3<EObject, Boolean> {
	public Boolean evaluate(final EObject source,
			final IParameterValueList2 parameterValues,
			final IFacetManager facetManager, final DerivedTypedElement feature)
			throws DerivedTypedElementException {
		boolean result = false;
		if (parameterValues.size() == 0) {
			throw new DerivedTypedElementException(
					"parameterValues must not be empty"); //$NON-NLS-1$
		}

		final Object paramValue = parameterValues.get(0).getValue();
		if (paramValue instanceof EStructuralFeature) {
			final EStructuralFeature eStructFeature = (EStructuralFeature) paramValue;
			/*
			 * tcicognani> NOPMD because the fix doesn't allow people to
			 * understand the program well (sometimes optimization is not good).
			 * And I didn't add @SuppressWarning("PMD.BooleanInversion") because
			 * I can't on this line.
			 */
			result = !eStructFeature.isDerived(); // NOPMD
		} else if (paramValue == null) {
			result = true;
		} else {
			final String message = String
					.format("Unexpected parameter type (%s instead of EStructuralFeature)", //$NON-NLS-1$
							paramValue.getClass().getName());
			throw new DerivedTypedElementException(message);
		}

		try {
			/*
			 * The object is visible if this custom says it is AND if the
			 * previous/super customs say it is
			 */
			result = result
					&& facetManager.getSuperValueOf(feature, source,
							parameterValues, Boolean.class).booleanValue();
		} catch (Exception e) {
			throw new DerivedTypedElementException(e);
		}

		return Boolean.valueOf(result);
	}
}
