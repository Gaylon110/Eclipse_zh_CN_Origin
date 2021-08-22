/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Jonathan Pepin (Soft-Maint) - Bug 518402 - Add test to open table view
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported;

import org.eclipse.emf.facet.widgets.table.ui.internal.exported.ITableWidget;

/**
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITableView {

	ITableWidget getTableWidget();
}
