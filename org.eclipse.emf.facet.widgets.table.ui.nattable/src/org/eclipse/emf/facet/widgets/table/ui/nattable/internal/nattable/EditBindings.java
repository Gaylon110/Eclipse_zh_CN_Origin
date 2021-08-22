/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Nicolas Guyomar (Mia-Software) - Bug 336482 - KeyBinding to edit element in Table : F2 
 *   Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.config.AbstractUiBindingConfiguration;
import net.sourceforge.nattable.ui.binding.UiBindingRegistry;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.action.MouseEditAction;

class EditBindings extends AbstractUiBindingConfiguration {
	
	private NatTableWidget natTableWidget;

	public EditBindings(final NatTableWidget natTableWidget) {
		this.natTableWidget = natTableWidget;
	}

	public void configureUiBindings(final UiBindingRegistry uiBindingRegistry) {
		uiBindingRegistry.registerDoubleClickBinding(new ModelCellEditorMouseEventMatcher(),
				new MouseEditAction(this.natTableWidget));
	}
}