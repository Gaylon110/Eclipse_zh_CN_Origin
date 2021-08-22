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
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.sync.generated;

import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.IRunnable;
import org.eclipse.emf.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedTableViewFactory extends
		SynchronizedObject<org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableViewFactory>
		implements
		org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableViewFactory {

	public SynchronizedTableViewFactory(
			final org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableViewFactory object,
			final Display display) {
		super(object, display);
	}

	public final org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableView openOn(
			final org.eclipse.emf.common.util.URI parm0)
			throws org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.TableViewException {
		return syncExecWithResult(
				new IRunnable<org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableView, org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.TableViewException>() {
					public org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.ITableView run()
							throws org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported.TableViewException {
						return SynchronizedTableViewFactory.this
								.getSynchronizedObject().openOn(parm0);
					}
				});
	}

}
