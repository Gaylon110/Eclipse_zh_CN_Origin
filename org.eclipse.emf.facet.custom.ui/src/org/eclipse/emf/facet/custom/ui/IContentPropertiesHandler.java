/**
 *  Copyright (c) 2012, 2014 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning 
 *      Gregoire Dupe (Mia-Software) - Bug 441570 - Children custom property
 */
package org.eclipse.emf.facet.custom.ui;

import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

/**
 * 
 * @since 0.2
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IContentPropertiesHandler {
	FacetOperation getIsVisible();
	/**
	 * @since 1.0
	 */
	FacetOperation getChildren();
}
