/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 331900 - customizable NatTable
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.config.AbstractRegistryConfiguration;
import net.sourceforge.nattable.config.CellConfigAttributes;
import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.painter.cell.ICellPainter;
import net.sourceforge.nattable.style.BorderStyle;
import net.sourceforge.nattable.style.CellStyleAttributes;
import net.sourceforge.nattable.style.HorizontalAlignmentEnum;
import net.sourceforge.nattable.style.Style;
import net.sourceforge.nattable.style.VerticalAlignmentEnum;
import net.sourceforge.nattable.util.GUIHelper;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget.BodyLayerStack;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.CustomizedCellPainter;
import org.eclipse.swt.graphics.Color;

public class StyleConfiguration extends AbstractRegistryConfiguration {

	private final Color bgColor = GUIHelper.COLOR_WHITE;
	private final Color fgColor = GUIHelper.COLOR_BLACK;
	// public Font font =
	// NatTableEditor.this.tableEditorInput.getBrowserConfiguration()
	// .getAppearanceConfiguration().getCustomFont();
	private final HorizontalAlignmentEnum hAlign = HorizontalAlignmentEnum.LEFT;
	private final VerticalAlignmentEnum vAlign = VerticalAlignmentEnum.MIDDLE;
	private final BorderStyle borderStyle = null;

	// private final BodyLayerStack bodyLayerStack;
	// private final TableLabelProvider tableLabelProvider;

	public StyleConfiguration(final BodyLayerStack bodyLayerStack, final NatTableWidget natTableWidget) {

		// this.cellPainter = new HorizontalPainterWrapper(new ICellPainter[] {
		// new CellImagePainter(this.tableLabelProvider, this.bodyLayerStack),
		// new CellTextPainter(bodyLayerStack, tableLabelProvider,
		// customizationEngine,
		// natTableWidget) });
		
		
		this.cellPainter = new CustomizedCellPainter(natTableWidget
				.getController().getTableLabelProvider(), natTableWidget);
	}

	// public ICellPainter cellPainter = new LineBorderDecorator(new
	// TextPainter());
	private final ICellPainter cellPainter;

	public void configureRegistry(final IConfigRegistry configRegistry) {
		configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER, this.cellPainter);

		Style cellStyle = new Style();
		cellStyle.setAttributeValue(CellStyleAttributes.BACKGROUND_COLOR, this.bgColor);
		cellStyle.setAttributeValue(CellStyleAttributes.FOREGROUND_COLOR, this.fgColor);
		// cellStyle.setAttributeValue(CellStyleAttributes.FONT, this.font);
		cellStyle.setAttributeValue(CellStyleAttributes.HORIZONTAL_ALIGNMENT, this.hAlign);
		cellStyle.setAttributeValue(CellStyleAttributes.VERTICAL_ALIGNMENT, this.vAlign);
		cellStyle.setAttributeValue(CellStyleAttributes.BORDER_STYLE, this.borderStyle);

		configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_STYLE, cellStyle);

		// configRegistry.registerConfigAttribute(CellConfigAttributes.DISPLAY_CONVERTER,
		// new IDisplayConverter() {
		//
		// public Object displayToCanonicalValue(final Object displayValue)
		// {
		// return null;
		// }
		//
		// public Object canonicalToDisplayValue(final Object
		// canonicalValue) {
		// // FIXME
		// if (canonicalValue instanceof TableElement) {
		// TableElement tableElement = (TableElement) canonicalValue;
		// return
		// NatTableEditor.this.tableEditorLabelProvider.getColumnText(
		// tableElement, 0);
		// }
		//
		// if (canonicalValue == null) {
		//								return ""; //$NON-NLS-1$
		// }
		// return canonicalValue.toString();
		// }
		// });
	}
}