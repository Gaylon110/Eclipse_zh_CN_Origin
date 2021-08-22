/*******************************************************************************
 * Copyright (c) 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 480901 - A default result displayer should be provided.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.metamodel.v0_2_0.efacet.runtime.ETypedElementResult;
import org.eclipse.emf.facet.efacet.ui.IETypedElementResultDisplayer;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.view.TableView;
import org.eclipse.jface.dialogs.MessageDialog;

public class ETypedElementResultDisplayer implements IETypedElementResultDisplayer {

	public String getName() {
		return Messages.ETypedElementResultDisplayer_TableResultDisplayer;
	}

	public void displayETypedElementResults(
			final List<ETypedElementResult> result,
			final EditingDomain editingDomain) {
		try {
			final ResourceSet resourceSet = editingDomain.getResourceSet();
			final String uriStr = String.format("platform:/meta/%s/%s-%s.xmi", //$NON-NLS-1$
					Activator.getDefault().getBundle().getSymbolicName(),
					this.getClass().getSimpleName(),
					Long.toString(System.currentTimeMillis()));
			final URI uri = URI.createURI(uriStr);
			final Resource resource = resourceSet.createResource(uri);
			final List<EObject> eObjects = getEObjects(result);
			resource.getContents().addAll(eObjects);
			TableView.openOn(eObjects, editingDomain,
					Messages.ETypedElementResultDisplayer_TableNameResults,
					null, null, null);
		} catch (Exception e) {
			MessageDialog.openWarning(null, Messages.ViewInTableHandler_0,
					Messages.ViewInTableHandler_1);
			Logger.logError(e, Activator.getDefault());
		}
	}

	private static List<EObject> getEObjects(
			final List<ETypedElementResult> results) {
		final List<EObject> eObjects = new ArrayList<EObject>();
		for (ETypedElementResult result : results) {
			eObjects.add(result);
		}
		return eObjects;
	}



}
