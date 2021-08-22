/** 
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 390296 - NPE when AggregateProxyPackage is initialized before AggregatePackage
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregateFactory;

public class AggregatePackageImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregatePackageImpl
		implements
		org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.AggregatePackage {

	private final AggregateFactory factory = new AggregateFactoryImpl(this);

	@Override
	public AggregateFactory getAggregateFactory() {
		return this.factory;
	}

	@Override
	public EFactory getEFactoryInstance() {
		return this.factory;
	}

	@SuppressWarnings("static-access")
	// @SuppressWarnings("static-access") Access to AggregatePackage.eNS_URI is
	// an EMF pattern
	public static org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.AggregatePackage init() {
		EPackage.Registry.INSTANCE.put(AggregatePackage.eNS_URI, new AggregatePackageImpl());
		return org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregatePackageImpl
				.init();
	}

} // AggregatePackageImpl
