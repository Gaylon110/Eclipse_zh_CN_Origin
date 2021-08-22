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
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Nicolas Bros (Mia-Software) - Bug 378475 - unit test failures after table refactoring
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.tableconfiguration.TableConfiguration;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor.NatTableEditorFactory;

public interface ITableEditorFactory {

	ITableEditorFactory DEFAULT = NatTableEditorFactory.getInstance();

	void openOn(List<EObject> elements, EditingDomain editingDomain,
			String description, TableConfiguration configuration,
			EObject context, Object parameter);

	void openOn(Table tableInstance, EditingDomain editingDomain);
}
