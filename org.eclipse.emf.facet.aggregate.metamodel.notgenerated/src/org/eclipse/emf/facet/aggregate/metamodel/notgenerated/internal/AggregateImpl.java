/** 
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Nicolas Bros (Mia-Software) - Bug 377788 - [Table] ClassCastException when opening a table from the same model browser twice
 *    Gregoire Dupe (Mia-Software) - Bug 373255 - Add tooltips providing a documentation for the selected elements in the Select ETypedElement Dialog
 */
package org.eclipse.emf.facet.aggregate.metamodel.notgenerated.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

public class AggregateImpl
		extends
		org.eclipse.emf.facet.aggregate.metamodel.v0_2_0.aggregate.impl.AggregateImpl {

	private EList<FacetSet> localFacetSets = null;

	@Override
	public EList<FacetSet> getFacetSets() {
		if (this.localFacetSets == null) {
			init();
		}
		return this.localFacetSets;
	}

	protected void init() {
		this.localFacetSets = new BasicEList<FacetSet>();
		for (FacetSet facetSet : this.getAggregatedFacetSets()) {
			this.localFacetSets.add(Utils.createFacetSetProxy(facetSet, this));
		}
		this.eAdapters().add(new Adapter() {

			public void notifyChanged(final Notification notification) {
				init();
			}

			public Notifier getTarget() {
				return null;
			}

			public void setTarget(final Notifier newTarget) {
				// Nothing to do
			}

			public boolean isAdapterForType(final Object type) {
				return false;
			}

		});
	}

	@Override
	public EList<EObject> eContents() {
		final Object[] array = getFacetSets().toArray();
		// note: we must return a subclass of InternalEList because EMF casts to it
		return new EcoreEList.UnmodifiableEList<EObject>(this,
				EcorePackage.eINSTANCE.getEPackage_ESubpackages(), array.length, array);
	}

} // AggregateImpl
