/*******************************************************************************
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.extended.editor.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface FilterPropertiesEditionPart {

	/**
	 * @return the filteredPart
	 * 
	 */
	public EObject getFilteredPart();

	/**
	 * Init the filteredPart
	 * @param settings the combo setting
	 */
	public void initFilteredPart(EObjectFlatComboSettings settings);

	/**
	 * Defines a new filteredPart
	 * @param newValue the new filteredPart to set
	 * 
	 */
	public void setFilteredPart(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFilteredPartButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the filteredPart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFilteredPart(ViewerFilter filter);

	/**
	 * Adds the given filter to the filteredPart edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFilteredPart(ViewerFilter filter);


	/**
	 * @return the contextualComponent
	 * 
	 */
	public EObject getContextualComponent();

	/**
	 * Init the contextualComponent
	 * @param settings the combo setting
	 */
	public void initContextualComponent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new contextualComponent
	 * @param newValue the new contextualComponent to set
	 * 
	 */
	public void setContextualComponent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setContextualComponentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the contextualComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContextualComponent(ViewerFilter filter);

	/**
	 * Adds the given filter to the contextualComponent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContextualComponent(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
