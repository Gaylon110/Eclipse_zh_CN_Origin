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
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.IDelegatedTableEditorFactory;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class DelegatedTableEditorFactory implements
		IDelegatedTableEditorFactory {

	public boolean canHandle(final IEditorInput input) {
		boolean canHandle = false;
		if (input instanceof TableEditorInput) {
			canHandle = true;
		} else if (input instanceof FileEditorInput) {
			canHandle = canHandle((FileEditorInput) input);
		}
		return canHandle;
	}

	private static boolean canHandle(final FileEditorInput input) {
		boolean canHandle = false;
		final URI uri = URI.createPlatformResourceURI(input.getFile()
				.getFullPath().toString(), true);
		if (uri != null) {
			final ResourceSet rSet = new ResourceSetImpl();
			final Resource resource = rSet.getResource(uri,true);
			try {
				resource.load(Collections.EMPTY_MAP);
				for (EObject eObject : resource.getContents()) {
					if (eObject instanceof Table) {
						canHandle = true;
						break;
					}
				}
			} catch (IOException e) {
				Logger.logWarning(e, Activator.getDefault());
				canHandle = false;
			}
		}
		return canHandle;
	}

	public EditorPart createEditor() {
		return new DelegatedTableEditor();
	}

}
