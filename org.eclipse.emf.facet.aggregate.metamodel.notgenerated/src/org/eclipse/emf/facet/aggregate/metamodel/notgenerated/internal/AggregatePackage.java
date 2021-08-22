/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 390296 - NPE when AggregateProxyPackage is initialized before AggregatePackage
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal;



@SuppressWarnings("PMD.AvoidConstantsInterface")
// @SuppressWarnings("PMD.AvoidConstantsInterface") PMD say :
// "An Interface should be used only to model a behavior".
// Here we do not have any other choice. We have to provide an EPackage
// interface which can be used by EMF.
// Be careful: checkstyle has been disable for this file to avoid the same
// warning
public interface AggregatePackage
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage {


	@SuppressWarnings("PMD.VariableNamingConventions")
	// @SuppressWarnings("PMD.VariableNamingConventions") PMD say :
	// "Variables that are final and static should be in all caps."
	// We cannot conform to this rule because "eINSTANCE" is an EMF expected
	// name.
	// Be careful: checkstyle has been disable for this file to avoid the same
	// warning
	org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage eINSTANCE = org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.AggregatePackageImpl
			.init();

} // AggregatePackage
