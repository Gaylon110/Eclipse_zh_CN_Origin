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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.sync.generated.SynchronizedTableViewFactory;
import org.eclipse.emf.facet.widgets.table.ui.workbench.internal.view.TableViewFactory;
import org.eclipse.swt.widgets.Display;

/**
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITableViewFactory {

	ITableViewFactory DEFAULT = new SynchronizedTableViewFactory(
			new TableViewFactory(), Display.getDefault());

	ITableView openOn(final URI uri) throws TableViewException;

}
