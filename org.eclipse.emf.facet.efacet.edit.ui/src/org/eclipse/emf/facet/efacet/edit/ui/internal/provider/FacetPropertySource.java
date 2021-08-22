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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.facet.efacet.core.FacetUtils;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.efacet.core.exception.FacetManagerException;
import org.eclipse.emf.facet.efacet.edit.ui.internal.Activator;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class FacetPropertySource extends PropertySource {

	private final EditingDomain editingDomain;

	private final Map<String, IItemPropertyDescriptor> itemPropDescs =
			new HashMap<String, IItemPropertyDescriptor>();

	private final ILabelProvider labelProvider;
	private final IFacetManager facetManager;

	public FacetPropertySource(final EObject eObject,
			final IItemPropertySource parentItemPropSrc,
			final EditingDomain editingDomain,
			final ILabelProvider labelProvider, final IFacetManager facetManager) {
		super(eObject, parentItemPropSrc);
		this.editingDomain = editingDomain;
		this.labelProvider = labelProvider;
		this.facetManager = facetManager;
	}

	/**
	 * Get all property descriptors from EMF and Facet structural features
	 */
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		final List<IPropertyDescriptor> propDescriptors = new ArrayList<IPropertyDescriptor>();
		// super - emf native properties
		propDescriptors.addAll(Arrays.asList(super.getPropertyDescriptors()));
		// create personalized facet properties
		propDescriptors.addAll(createFacetPropertiesDescriptor());
		return propDescriptors.toArray(
				new IPropertyDescriptor[propDescriptors.size()]);
	}

	private List<IPropertyDescriptor> createFacetPropertiesDescriptor() {
		final List<IPropertyDescriptor> result = new ArrayList<IPropertyDescriptor>();
		final EObject eObject = (EObject) this.object;
		try {
			final Set<EStructuralFeature> features = FacetUtils
					.getETypedElements(eObject, EStructuralFeature.class,
							this.facetManager);
			for (final EStructuralFeature feature : features) {
				final IPropertyDescriptor propDecriptor = createPropertyDecriptor(
						eObject, feature);
				result.add(propDecriptor);
			}
		} catch (final FacetManagerException e) {
			final String eObjectName = this.labelProvider.getText(eObject);
			final IPropertyDescriptor propDescriptor = new TextPropertyDescriptor(
					eObjectName, "!!! Failed, cf log !!!"); //$NON-NLS-1$
			result.add(propDescriptor);
			final String msg = String.format(
					"Can't create FacetItemPropertyDescriptors for the object %s.", //$NON-NLS-1$
					eObjectName);
			Logger.logError(e, msg, Activator.getDefault());
		}
		return result;
	}

	private IPropertyDescriptor createPropertyDecriptor(final EObject eObject,
			final EStructuralFeature feature) {
		IPropertyDescriptor result = null;
		try {
			final Object value = this.facetManager.getOrInvoke(
					eObject, feature, Object.class);
			final FacetItemPropertyDescriptor itemPropDesc = new FacetItemPropertyDescriptor(
					eObject, feature, value, this.editingDomain,
					this.labelProvider, this.facetManager);
			this.itemPropDescs.put(feature.getName(), itemPropDesc);
			result = new PropertyDescriptor(value, itemPropDesc);
		} catch (FacetManagerException e) {
			result = new TextPropertyDescriptor(
					feature.getName(), "!!! Failed, cf log !!!"); //$NON-NLS-1$
			final String msg = String.format(
					"Can't create FacetItemPropertyDescriptor for the facet feature %s.", //$NON-NLS-1$
					feature.getName());
			Logger.logError(e, msg, Activator.getDefault());
		}
		return result;
	}

	@Override
	public Object getPropertyValue(final Object propertyId) {
		Object result = null;
		if (this.itemPropDescs.containsKey(propertyId)) {
			result = this.itemPropDescs.get(propertyId).getPropertyValue(
					propertyId);
		} else {
			// get from parent
			result = super.getPropertyValue(propertyId);
		}
		return result;
	}

	@Override
	public void setPropertyValue(final Object propertyId, final Object value) {
		if (this.itemPropDescs.containsKey(propertyId)) {
			this.itemPropDescs.get(propertyId).setPropertyValue(propertyId,
					value);
		} else {
			// set to parent
			super.setPropertyValue(propertyId, value);
		}
	}

}
