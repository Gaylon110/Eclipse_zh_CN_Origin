/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 352485 - [Table] Default height of cells is too small, leading to text truncations
 *    Grégoire Dupé (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 *    David Couvrand (Soft-Maint) - Bug 424992 - [Table] Change Look&Feel from beveled to MS Excel-like
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.layer.config.DefaultRowHeaderStyleConfiguration;
import net.sourceforge.nattable.painter.cell.BackgroundPainter;
import net.sourceforge.nattable.painter.cell.TextPainter;
import net.sourceforge.nattable.style.BorderStyle;
import net.sourceforge.nattable.style.BorderStyle.LineStyleEnum;
import net.sourceforge.nattable.util.GUIHelper;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.ColorUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.DefaultSizeUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.cell.decorator.LightRowBorderDecorator;

/**
 * Customize the default row header style. This has to be added back to the
 * table.
 */
public class StyledRowHeaderConfiguration extends DefaultRowHeaderStyleConfiguration {

	public StyledRowHeaderConfiguration() {
		this.font = DefaultSizeUtils.getHeaderFont();
		this.bgColor = ColorUtils.getHeaderBackgoundColor();
		final TextPainter txtPainter = new TextPainter(false, false);
		final BackgroundPainter backgroundPainter = new BackgroundPainter(
				txtPainter);
		this.cellPainter = new LightRowBorderDecorator(backgroundPainter);
		this.borderStyle = new BorderStyle(1, GUIHelper.COLOR_WIDGET_DARK_SHADOW,
				LineStyleEnum.DASHDOT);
	}
}
