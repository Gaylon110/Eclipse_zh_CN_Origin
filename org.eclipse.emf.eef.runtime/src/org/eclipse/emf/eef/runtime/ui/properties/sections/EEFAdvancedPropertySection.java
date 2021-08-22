/*******************************************************************************
 * Copyright (c) 2008, 2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.properties.sections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class EEFAdvancedPropertySection extends AdvancedPropertySection implements IPropertySourceProvider {

	private AdapterFactory adapterFactory;

	public EEFAdvancedPropertySection() {
		super();
	}

	public AdapterFactory getAdapterFactory() {
		if (adapterFactory == null) {
			if (page != null) {
				adapterFactory = EEFRuntimePlugin.getDefault().getAdapterFactory();
			}
		}
		return adapterFactory;
	}

	public IPropertySource getPropertySource(Object object) {
		if (getAdapterFactory() != null) {
			IItemPropertySource item = (IItemPropertySource)getAdapterFactory().adapt(object,
					IItemPropertySource.class);
			if (item != null)
				return new PropertySource(object, item);
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (page != null)
			page.setPropertySourceProvider(this);
	}

}
