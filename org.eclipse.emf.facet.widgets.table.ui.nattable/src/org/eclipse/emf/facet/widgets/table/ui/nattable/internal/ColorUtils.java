/*******************************************************************************
 * Copyright (c) 2014 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Software) - Bug 424992 - [Table] Change Look&Feel from beveled to MS Excel-like
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal;

import net.sourceforge.nattable.util.GUIHelper;

import org.eclipse.swt.graphics.Color;

public final class ColorUtils {

	private static final int BKGND_RED = 231;
	private static final int BKGND_GREEN = 231;
	private static final int BKGND_BLUE = 239;
	private static final int BORDER_RED = 171;
	private static final int BORDER_GREEN = 167;
	private static final int BORDER_BLUE = 166;
	
	private ColorUtils() {
		// Must not be used
	}
	
	public static Color getHeaderBackgoundColor() {
		return GUIHelper.getColor(BKGND_RED, BKGND_GREEN, BKGND_BLUE);
	}
	
	public static Color getHeaderBorderColor() {
		return GUIHelper.getColor(BORDER_RED, BORDER_GREEN, BORDER_BLUE);
	}

	public static Color getCornerColor() {
		return GUIHelper.COLOR_GRAY;
	}
}
