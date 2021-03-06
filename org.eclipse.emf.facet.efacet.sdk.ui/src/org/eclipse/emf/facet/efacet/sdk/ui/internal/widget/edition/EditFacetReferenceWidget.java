/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.emf.facet.efacet.sdk.ui.internal.widget.edition;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.Facet;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetReference;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.extensible.Query;
import org.eclipse.emf.facet.efacet.sdk.ui.internal.widget.component.properties.name.GetReferenceNameWidget;
import org.eclipse.emf.facet.efacet.sdk.ui.internal.widget.creation.AbstractEStructuralFeatureWidget;
import org.eclipse.emf.facet.util.ui.internal.exported.PropertyElement2;
import org.eclipse.emf.facet.util.ui.internal.exported.util.widget.component.properties.name.AbstractGetElementNameWidget;
import org.eclipse.swt.widgets.Composite;

/**
 * Widget for the edition of a {@link FacetReference}.
 */
public class EditFacetReferenceWidget extends
		AbstractEStructuralFeatureWidget<FacetReference> {

	/**
	 * Constructor.
	 * 
	 * @param parent
	 *            the parent of this composite.
	 * @param properties
	 *            the properties.
	 * @param initialFacetRef
	 *            the {@link FacetReference} to edit.
	 * @param facet
	 */
	public EditFacetReferenceWidget(final Composite parent,
			final FacetReference initialFacetRef,
			final EditingDomain editingDomain,
			final PropertyElement2<Facet> facetProperty,
			final PropertyElement2<String> nameProperty,
			final PropertyElement2<Integer> lowerBdProperty,
			final PropertyElement2<Integer> upperBdProperty,
			final PropertyElement2<EClassifier> typeProperty,
			final PropertyElement2<Boolean> orderedProperty,
			final PropertyElement2<Boolean> uniqueProperty,
			final PropertyElement2<Query> queryProperty,
			final PropertyElement2<Boolean> volatileProperty,
			final PropertyElement2<Boolean> changeProperty,
			final PropertyElement2<Boolean> derivedProperty,
			final PropertyElement2<Boolean> transientProperty) {
		super(initialFacetRef, parent, editingDomain, facetProperty,
				nameProperty, lowerBdProperty, upperBdProperty, typeProperty,
				orderedProperty, uniqueProperty, queryProperty,
				volatileProperty, changeProperty, derivedProperty,
				transientProperty);
	}

	@Override
	protected AbstractGetElementNameWidget createGetElementNameSubWidgetComposite() {
		return new GetReferenceNameWidget(this, this.getElementNameProperty());
	}

	@Override
	protected Class<? extends EClassifier> getETypeSelectionOption() {
		return EClass.class;
	}

	@Override
	public void onDialogValidation() {
		// Nothing.
	}

}
