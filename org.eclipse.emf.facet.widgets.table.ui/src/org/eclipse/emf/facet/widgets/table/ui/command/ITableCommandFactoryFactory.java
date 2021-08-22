/*******************************************************************************
 * Copyright (c) 2012, 2017 Mia-Software, and Soft-Maint
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 387008 - [Table] Papyrus needs methods provided by TableInstanceCommandFactory
 *     Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.command;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.efacet.core.IFacetManager;
import org.eclipse.emf.facet.widgets.celleditors.ICommandFactory;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.widget.command.TableCommandFactoryFactory;

/**
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITableCommandFactoryFactory {

	ITableCommandFactoryFactory DEFAULT = new TableCommandFactoryFactory();

	@Deprecated
	ITableCommandFactory createTableCommandFactory(final Table table,
			final EditingDomain editingDomain,
			final ICommandFactory commandFactory,
			final IFacetManager facetManager);

	/**
	 * @since 1.2
	 */
	ITableCommandFactory createTableCommandFactory(final Table table,
			final EditingDomain editingDomain,
			final ICommandFactory commandFactory);
}
