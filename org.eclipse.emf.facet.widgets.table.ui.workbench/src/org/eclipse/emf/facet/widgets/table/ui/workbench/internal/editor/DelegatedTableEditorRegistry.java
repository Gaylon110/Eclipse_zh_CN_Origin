/**
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	  Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 */
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.IDelegatedTableEditorFactory;

public class DelegatedTableEditorRegistry {

	private static final String EXT_POINT_ID = "org.eclipse.emf.facet.widgets.table.ui.workbench.internal.delegatedTableEditorFactory"; //$NON-NLS-1$

	/**
	 * The singleton instance of this {@link CatalogSetManager}.
	 */
	public static final DelegatedTableEditorRegistry INSTANCE = new DelegatedTableEditorRegistry();

	private static final String CLASS = "class"; //$NON-NLS-1$

	private final List<IDelegatedTableEditorFactory> factories = new ArrayList<IDelegatedTableEditorFactory>();

	public DelegatedTableEditorRegistry() {
		initRegisteredEntries();
	}

	private void initRegisteredEntries() {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IExtensionPoint extPoint = registry
				.getExtensionPoint(DelegatedTableEditorRegistry.EXT_POINT_ID);
		if (extPoint != null) {
			for (IExtension ext : extPoint.getExtensions()) {
				for (IConfigurationElement configElt : ext
						.getConfigurationElements()) {
					IDelegatedTableEditorFactory factory;
					try {
						factory = (IDelegatedTableEditorFactory) configElt
								.createExecutableExtension(DelegatedTableEditorRegistry.CLASS);
						this.factories.add(factory);
					} catch (CoreException e) {
						Logger.logError(e, Activator.getDefault());
					}
				}
			}
		}
	}

	public List<IDelegatedTableEditorFactory> getFactories() {
		return this.factories;
	}

}
