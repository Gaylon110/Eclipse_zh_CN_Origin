/*******************************************************************************
 * Copyright (c) 2012 CEA LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 366367 - To be able to change the "CanBePresentedInTheTable" query
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported;

import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor.TableEditor;

public final class TableEditorConstants {
	
	private TableEditorConstants() {
		// must not be instantiated
	}
	
	public static String getEditorID() {
		return TableEditor.getEditorId();
	}
}
