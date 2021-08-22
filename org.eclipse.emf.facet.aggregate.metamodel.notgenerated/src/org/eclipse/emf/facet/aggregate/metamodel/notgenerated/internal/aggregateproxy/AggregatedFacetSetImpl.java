/**
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372626 - Aggregates
 *    Gregoire Dupe (Mia-Software) - Bug 375087 - [Table] ITableWidget.addColumn(List<ETypedElement>, List<FacetSet>)
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Nicolas Bros (Mia-Software) - Bug 377788 - [Table] ClassCastException when opening a table from the same model browser twice
 *    Vincent Lorenzo (CEA-LIST) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.aggregateproxy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal.Utils;
import org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.AggregatedFacet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;


public class AggregatedFacetSetImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.internal.aggregateProxy.impl.AggregatedFacetSetImpl {

	private final EObject container;
	private EList<EClassifier> localEClassifiers;
	private EList<EPackage> localESubpackages;
	
	public AggregatedFacetSetImpl(final EObject container) {
		super();
		this.container = container;
	}

	@Override
	public String getName() {
		return getFacetSet().getName();
	}

	@Override
	public EList<EClassifier> getEClassifiers() {
		if (this.localEClassifiers == null) {
			initEClassifiers();
		}
		return this.localEClassifiers;
	}

	private void initEClassifiers() {
		this.localEClassifiers = new BasicEList<EClassifier>();
		for (EClassifier eClassifier : this.getFacetSet().getEClassifiers()) {
			if (eClassifier instanceof Facet) {
				final Facet facet = (Facet) eClassifier;
				// NOPMD: the goal of this loop is to create instance of
				// AggregatedFacetImpl.
				final AggregatedFacet aFacet = new AggregatedFacetImpl(this); // NOPMD by gdupe on 29/03/12 16:27
				aFacet.setFacet(facet);
				this.localEClassifiers.add(aFacet);
			}
		}
	}

	@Override
	public EList<EPackage> getESubpackages() {
		if (this.localESubpackages == null) {
			initESubpackages();
		}
		return this.localESubpackages;
	}

	private void initESubpackages() {
		this.localESubpackages = new BasicEList<EPackage>();
		for (EPackage ePackage : this.getFacetSet().getESubpackages()) {
			if (ePackage instanceof FacetSet) {
				final FacetSet subFacetSet = (FacetSet) ePackage;
				this.localESubpackages.add(Utils.createFacetSetProxy(
						subFacetSet, this));
			}
		}
	}

	@Override
	public EList<EObject> eContents() {
		final List<EObject> list = new ArrayList<EObject>();
		for (EPackage ePackage : getESubpackages()) {
			list.add(ePackage);
		}
		for (EClassifier eClassifier : getEClassifiers()) {
			list.add(eClassifier);
		}
		
		final Object[] array = list.toArray();
		// note: we must return a subclass of InternalEList because EMF casts to it
		return new EcoreEList.UnmodifiableEList<EObject>(this, 
				EcorePackage.eINSTANCE.getEPackage_ESubpackages(), array.length, array);
	}

	@Override
	public EObject eContainer() {
		return this.container;
	}

	@Override
	public Resource eResource() {
		return getFacetSet().eResource();
	}

	@Override
	public String getDocumentation() {
		return getFacetSet().getDocumentation();
	}
} //AggregatedFacetSetImpl
