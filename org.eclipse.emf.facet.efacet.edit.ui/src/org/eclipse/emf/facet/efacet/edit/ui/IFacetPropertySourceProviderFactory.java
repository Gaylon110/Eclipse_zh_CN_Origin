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

package org.eclipse.emf.facet.efacet.edit.ui;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.edit.ui.internal.provider.FacetPropertiesSourceProvider;
import org.eclipse.emf.facet.efacet.edit.ui.internal.provider.FacetPropertySourceProviderFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * Factory for {@link FacetPropertiesSourceProvider}.
 *
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFacetPropertySourceProviderFactory {

	IFacetPropertySourceProviderFactory DEFAULT = new FacetPropertySourceProviderFactory();

	IPropertySourceProvider createPropertySourceProvider(
			AdapterFactory adapterFactory,
			EditingDomain editingDomain,
			ILabelProvider labelProvider, IFacetManager facetManager);

}
