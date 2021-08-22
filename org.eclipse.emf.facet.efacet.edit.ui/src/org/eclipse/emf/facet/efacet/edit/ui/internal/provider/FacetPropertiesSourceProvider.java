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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

public class FacetPropertiesSourceProvider implements IPropertySourceProvider {

	private final AdapterFactory adapterFactory;
	private final EditingDomain editingDomain;
	private final ILabelProvider labelProvider;
	private final IFacetManager facetManager;

	public FacetPropertiesSourceProvider(final AdapterFactory adapterFactory,
			final EditingDomain editingDomain,
			final ILabelProvider labelProvider, final IFacetManager facetManager) {
		this.adapterFactory = adapterFactory;
		this.editingDomain = editingDomain;
		this.labelProvider = labelProvider;
		this.facetManager = facetManager;
	}

	public IPropertySource getPropertySource(final Object object) {
		IPropertySource result = null;
		if (object instanceof IPropertySource) {
			result = (IPropertySource) object;
		} else {
			IItemPropertySource itemPropSrc = null;
			if (!(object instanceof EObject && ((EObject) object).eClass() == null)) {
				itemPropSrc = (IItemPropertySource) this.adapterFactory.adapt(
						object, IItemPropertySource.class);
			}
			if (itemPropSrc != null) {
				result = createPropertySource(object, itemPropSrc);
			}
		}
		return result;
	}

	protected IPropertySource createPropertySource(final Object object,
			final IItemPropertySource itemPropSrc) {
		IPropertySource result = null;
		if (object instanceof EObject && this.facetManager != null) {
			final EObject eObject = (EObject) object;
			result = new FacetPropertySource(eObject, itemPropSrc,
					this.editingDomain, this.labelProvider, this.facetManager);
		}
		if (result == null) {
			result = new PropertySource(object, itemPropSrc);
		}
		return result;
	}

}
