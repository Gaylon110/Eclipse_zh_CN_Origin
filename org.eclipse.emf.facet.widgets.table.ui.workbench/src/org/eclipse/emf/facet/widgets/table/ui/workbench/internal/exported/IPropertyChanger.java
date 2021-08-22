/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 375516 - [Table] dirty state not updated
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.exported;

import org.eclipse.ui.IPropertyListener;

public interface IPropertyChanger {
	void addPropertyChangeListener(IPropertyListener listener);
	void removePropertyChangeListener(IPropertyListener listener);
}
