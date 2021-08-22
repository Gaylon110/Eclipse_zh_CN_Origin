/** 
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.Aggregate;

public class AggregateFactoryImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregateFactoryImpl {

	private final AggregatePackageImpl packageImpl;

	public AggregateFactoryImpl(final AggregatePackageImpl epackage) {
		super();
		this.packageImpl = epackage;
	}

	@Override
	public EPackage getEPackage() {
		return this.packageImpl;
	}

	@Override
	public Aggregate createAggregate() {
		return new AggregateImpl();
	}


} //AggregateFactoryImpl
