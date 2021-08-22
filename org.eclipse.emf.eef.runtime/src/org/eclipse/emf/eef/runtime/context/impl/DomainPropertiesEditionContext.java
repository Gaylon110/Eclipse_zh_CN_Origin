/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.context.impl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class DomainPropertiesEditionContext extends EObjectPropertiesEditionContext {

	/**
	 * The domain where edit the EObject
	 */
	protected EditingDomain editingDomain;

	/**
	 * @param parentContext
	 *            the parent context
	 * @param editionComponent
	 *            editingComponent holding the EObject editing
	 * @param domain
	 *            domain where to perform commands
	 * @param adapterFactory
	 *            adapterFactory to use to get editing providers
	 * @param eObject
	 *            eObject to edit
	 */
	public DomainPropertiesEditionContext(PropertiesEditingContext parentContext,
			IPropertiesEditionComponent editionComponent, EditingDomain domain,
			AdapterFactory adapterFactory, EObject eObject) {
		super(parentContext, editionComponent, eObject, adapterFactory);
		this.editingDomain = domain;
	}

	/**
	 * @return the editingDomain
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext#getResourceSet()
	 */
	public ResourceSet getResourceSet() {
		if (editingDomain != null && editingDomain.getResourceSet() != null)
			return editingDomain.getResourceSet();
		return super.getResourceSet();
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext#createPropertiesEditingComponent(java.lang.String)
	 */
	public IPropertiesEditionComponent createPropertiesEditingComponent(String mode) {
		IPropertiesEditionComponent propertiesEditingComponent = super.createPropertiesEditingComponent(mode);
		if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
			propertiesEditingComponent.setLiveEditingDomain(editingDomain);
		}
		return propertiesEditingComponent;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext#createPropertiesEditingComponent(java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionComponent createPropertiesEditingComponent(String mode, String part) {
		IPropertiesEditionComponent propertiesEditingComponent = super.createPropertiesEditingComponent(mode, part);
		if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
			propertiesEditingComponent.setLiveEditingDomain(editingDomain);
		}
		return propertiesEditingComponent;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext#createPropertiesEditingComponent(java.lang.String, java.lang.String, java.lang.Class)
	 */
	public IPropertiesEditionComponent createPropertiesEditingComponent(String mode, String part, Class<?> refinement) {
		IPropertiesEditionComponent propertiesEditingComponent = super.createPropertiesEditingComponent(mode, part, refinement);
		if (IPropertiesEditionComponent.LIVE_MODE.equals(mode)) {
			propertiesEditingComponent.setLiveEditingDomain(editingDomain);
		}
		return propertiesEditingComponent;
	}
	
}
