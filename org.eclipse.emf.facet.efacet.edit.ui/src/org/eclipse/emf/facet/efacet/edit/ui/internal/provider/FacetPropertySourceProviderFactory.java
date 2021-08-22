/*******************************************************************************
 * Copyright (c) 2015, 2016 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *     Jonathan Pepin (Soft-Maint) - Bug 509459 - PropertySourceProvider dependency on implementation instead of interface
 *******************************************************************************/

package org.eclipse.emf.facet.efacet.edit.ui.internal.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.edit.ui.IFacetPropertySourceProviderFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

public class FacetPropertySourceProviderFactory implements
		IFacetPropertySourceProviderFactory {

	public IPropertySourceProvider createPropertySourceProvider(
			final AdapterFactory adapterFactory,
			final EditingDomain editingDomain,
			final ILabelProvider labelProvider, final IFacetManager facetManager) {
		return new FacetPropertiesSourceProvider(adapterFactory, editingDomain,
				labelProvider, facetManager);
	}

}
