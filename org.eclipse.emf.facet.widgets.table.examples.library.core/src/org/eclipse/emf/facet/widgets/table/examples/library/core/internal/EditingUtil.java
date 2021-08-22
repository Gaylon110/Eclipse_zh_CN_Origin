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
 *      Grégoire Dupé (Mia-Software) - Bug 388422 - [Table] Queries for InstanciationMethod needs to have 2 parameters
 */
package org.eclipse.emf.facet.widgets.table.examples.library.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public final class EditingUtil {

	private EditingUtil() {
		// Hidden constructor.
	}

	/**
	 * Return the current editing domain.
	 * 
	 * @return the current editing domain.
	 */
	public static IEditingDomainProvider getEditingDomainProvider() {
		// Retrieve the editor
		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IEditorPart editor = null;
		if (window != null) {
			final IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				editor = page.getActiveEditor();
			}
		}
		IEditingDomainProvider edProvider = null;
		// Retrieve the editing domain
		if (editor != null) {
			if (editor instanceof IEditingDomainProvider) {
				edProvider = (IEditingDomainProvider) editor;
			} else {
				edProvider = (IEditingDomainProvider) editor
						.getAdapter(IEditingDomainProvider.class);
			}
		}
		return edProvider;
	}

	private static IStructuredSelection getActiveSelection() {
		IStructuredSelection result = null;
		ISelection selection = null;
		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			final IWorkbenchPage page = window.getActivePage();
			if (page != null) {
				selection = page.getSelection();
			}
		}
		if (selection instanceof IStructuredSelection) {
			result = (IStructuredSelection) selection;
		}
		return result;
	}

	public static List<EObject> getEObjectsInSelection() {
		final IStructuredSelection selection = getActiveSelection();
		final List<EObject> result = new ArrayList<EObject>();
		if (selection != null) {
			final Iterator<?> iterator = selection.iterator();
			while (iterator.hasNext()) {
				final Object selectedElement = iterator.next();
				if (selectedElement instanceof EObject) {
					final EObject eObject = (EObject) selectedElement;
					result.add(eObject);
				}
			}
		}
		return result;
	}
}
