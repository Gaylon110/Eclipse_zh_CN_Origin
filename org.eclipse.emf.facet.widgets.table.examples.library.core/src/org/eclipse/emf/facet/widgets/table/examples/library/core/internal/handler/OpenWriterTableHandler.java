/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Grégoire Dupé (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 */
package org.eclipse.emf.facet.widgets.table.examples.library.core.internal.handler;

import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Library;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.Activator;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.EditingUtil;
import org.eclipse.emf.facet.widgets.table.examples.library.core.internal.view.WriterView;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class OpenWriterTableHandler implements IHandler {

	public void addHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}

	public void dispose() {
		// Nothing to do
	}

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		IViewPart view = null;
		final IWorkbenchPage activePage = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		try {
			view = activePage.showView(WriterView.VIEW_ID);
		} catch (PartInitException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return view;
	}

	public boolean isEnabled() {
		boolean result = false;
		final List<EObject> eObjects = EditingUtil.getEObjectsInSelection();
		if (eObjects.size() == 1 && eObjects.get(0) instanceof Library) {
			result = true;
		}
		return result;
	}

	public boolean isHandled() {
		return isEnabled();
	}

	public void removeHandlerListener(final IHandlerListener handlerListener) {
		// Nothing to do
	}
}
