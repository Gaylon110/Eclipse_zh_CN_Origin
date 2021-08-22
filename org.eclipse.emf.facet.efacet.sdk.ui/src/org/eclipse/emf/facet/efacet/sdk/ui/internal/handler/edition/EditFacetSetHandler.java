/**
 * Copyright (c) 2012, 2015 Mia-Software, and Soft-Maint.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 *   	Jonathan Pepin (Soft-Maint) - Bug 463896 - ClassCastException on isEnabled in org.eclipse.emf.facet.efacet.sdk.ui/src/org/eclipse/emf/facet/efacet/sdk/ui/internal/handler/edition/EditFacetSetHandler
 */
package org.eclipse.emf.facet.efacet.sdk.ui.internal.handler.edition;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.emf.facet.efacet.sdk.ui.dialog.IFacetDialogFactory;
import org.eclipse.emf.facet.util.ui.internal.exported.handler.HandlerUtils;
import org.eclipse.emf.facet.util.ui.internal.exported.util.handler.AbstractSelectionExpectedTypeHandler;
import org.eclipse.jface.viewers.IStructuredSelection;

public class EditFacetSetHandler extends AbstractSelectionExpectedTypeHandler {

	@Override
	public boolean isEnabled() {
		boolean isEnabled = false;
		final IStructuredSelection selection = HandlerUtils
				.getStructuredSelection();
		if (selection != null) {
			final Object firstElement = HandlerUtils
					.getStructuredSelection().getFirstElement();
			if (firstElement instanceof FacetSet) {
				final FacetSet facetSet = (FacetSet) firstElement;
				isEnabled = facetSet.eContainer() != null;				
			}
		}
		return isEnabled && super.isEnabled();
	}

	@Override
	protected Class<?> getSelectionExpectedType() {
		return FacetSet.class;
	}

	public Object execute(final ExecutionEvent event) {
		return IFacetDialogFactory.INSTANCE.openEditFacetSetDialog();
	}
}
