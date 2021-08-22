/**
 * Copyright (c) 2015 Mia-Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Grégoire Dupé (Mia-Software) - Bug 463905 - Support of parsing OCL expressions with Facet references
 */
package org.eclipse.emf.facet.util.efacet.ocl.core.internal;

import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.util.efacet.ocl.core.IEFacetOCLEnvironmentFactoryFactory;
import org.eclipse.ocl.EnvironmentFactory;

public class EFacetOCLEnvironmentFactoryFactory implements
		IEFacetOCLEnvironmentFactoryFactory {

	@SuppressWarnings("rawtypes")
	//@SuppressWarnings("rawtypes") gdupe> No better solution found :-(
	public EnvironmentFactory createEFacetOCLEnvironmentFactory(
			final IFacetManager facetManager) {
		return new EFacetOCLEnvironmentFactory(facetManager);
	}

}
