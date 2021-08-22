/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	  Gregoire Dupe (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Gr�goire Dup� (Mia-Software) - Bug 365808 - [Unit Test Failure][0.2/4.2][0.2/3.8] org.eclipse.emf.facet.widgets.nattable.tests.NatTableAPITests
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 387005 - [Table] ITableWidget doesn't provide a method to get the selected Rows
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidgetViewFactory;
import org.eclipse.osgi.util.NLS;

public class TableWidgetViewFactoryRegistry {

	private static final String CLASS = "class"; //$NON-NLS-1$
	private static final String VIEW_IMPL = "org.eclipse.emf.facet.widgets.table.ui.internal.viewimpl"; //$NON-NLS-1$
	private final List<ITableWidgetViewFactory> factories = new ArrayList<ITableWidgetViewFactory>();

	public TableWidgetViewFactoryRegistry() {
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IExtensionPoint extensionPoint = registry
				.getExtensionPoint(TableWidgetViewFactoryRegistry.VIEW_IMPL);
		for (IExtension ext : extensionPoint.getExtensions()) {
			for (IConfigurationElement configElt : ext
					.getConfigurationElements()) {
				try {
					final ITableWidgetViewFactory factory = (ITableWidgetViewFactory) configElt
							.createExecutableExtension(TableWidgetViewFactoryRegistry.CLASS);
					this.factories.add(factory);
				} catch (CoreException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		}
		if (this.factories.size() == 0) {
			Logger.logError(
					"No table view factory registered.", Activator.getDefault()); //$NON-NLS-1$
		} else if (this.factories.size() > 1) {
			Logger.logError(
					NLS.bind(
							"More than one table view factory has been registered, {0} will be used.", //$NON-NLS-1$
							this.factories.get(0).getClass().getName()),
					Activator.getDefault()); 
		}
	}
	
	public ITableWidgetViewFactory getDefaut() {
		return this.factories.get(0);
	}

}
