/*******************************************************************************
 * Copyright (c) 2015, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.xtext.base.ui;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class BaseEditor extends XtextEditor
{
	public BaseEditor() {
		super();
	}

	/**
	 * @deprecated no longer used - retained for API compatibility
	 */
	@Deprecated
	@SuppressWarnings("null")
	public @NonNull TextViewer getTextViewer() {
		return (TextViewer) getSourceViewer();
	}

	/**
	 * @deprecated no longer used - does nothing - retained for API compatibility
	 */
	@Deprecated
	protected void scheduleDeferredSetTextJob() {}
}
