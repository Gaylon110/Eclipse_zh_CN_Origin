/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Messages;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.view.TableView;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class ViewInTableHandler extends AbstractHandler {

	private static final String DESCRIPTION = ""; //$NON-NLS-1$

	public Object execute(final ExecutionEvent event) throws ExecutionException {
		try {
			final IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();
			EditingDomain editingDomain = null;
			if (editor instanceof IEditingDomainProvider) {
					final IEditingDomainProvider edProvider = (IEditingDomainProvider) editor;
					editingDomain = edProvider.getEditingDomain();
			}
			final ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
			if (!(selection instanceof IStructuredSelection)){
				throw new Exception("Unexpected selection"); //$NON-NLS-1$
			}
			final List<EObject> eObjects = getEObjects((IStructuredSelection)selection);
			TableView.openOn(eObjects, editingDomain, DESCRIPTION, null, null, null);
		} catch (Exception e) {
			MessageDialog.openWarning(null,Messages.ViewInTableHandler_0,Messages.ViewInTableHandler_1);
			Logger.logError(e, Activator.getDefault());
		}
		return null;
	}

	private static List<EObject> getEObjects(final IStructuredSelection selection){
		final List<EObject> result = new ArrayList<EObject>();
		final Iterator<?> iterator = selection.iterator();
		while (iterator.hasNext()) {
			final Object selectedElement = iterator.next();
			if (selectedElement instanceof EObject) {
				final EObject eObject = (EObject) selectedElement;
				result.add(eObject);
			} else {
				Logger.logWarning(
						"Cannot open table editor: selected objects are not all model elements", Activator.getDefault()); //$NON-NLS-1$
			}
		}
		return result;
	}
	
}
