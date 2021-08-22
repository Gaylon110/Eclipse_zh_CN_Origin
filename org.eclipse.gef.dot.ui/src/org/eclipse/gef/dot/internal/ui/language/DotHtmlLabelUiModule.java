/*******************************************************************************
 * Copyright (c) 2017 itemis AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthias Wienand (itemis AG) - initial API and implementation
 *     Tamas Miklossy   (itemis AG) - improve support for html-label highlighting
 *     
 *******************************************************************************/
package org.eclipse.gef.dot.internal.ui.language;

import org.eclipse.gef.dot.internal.ui.language.highlighting.DotHtmlLabelSemanticHighlightingCalculator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DotHtmlLabelUiModule extends
		org.eclipse.gef.dot.internal.ui.language.AbstractDotHtmlLabelUiModule {
	public DotHtmlLabelUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return DotHtmlLabelSemanticHighlightingCalculator.class;
	}
}
