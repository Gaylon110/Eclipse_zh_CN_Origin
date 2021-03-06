/**
 * Copyright (c) 2012 Mia-Software.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.emf.facet.query.ocl.sdk.ui.dialog;

import org.eclipse.emf.facet.efacet.sdk.ui.internal.exported.dialog.query.IQueryDialogFactory;

public interface IOclDialogFactory extends IQueryDialogFactory {

	void setExpression(final String expression);

}