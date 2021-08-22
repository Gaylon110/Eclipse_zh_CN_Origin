/*******************************************************************************
 * Copyright (c) 2010, 2013 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 332215 - customizable NatTable column headers
 *    Nicolas Guyomar (Mia-Software) - Bug 332924 - To be able to save the table
 *    Nicolas Guyomar (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 332998 - To be able to add a column and fill it with the result of a query
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *    Gregoire Dupe (Mia-Software) - Bug 352485 - [Table] Default height of cells is too small, leading to text truncations
 *    Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *    Gregoire Dupe (Mia-Software) - Bug 373391 - [Table] Customizations not applied on column headers
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Gregoire Dupe (Mia-Software) - Bug 424122 - [Table] Images, fonts and colors are not shared between the instances of table
 *    David Couvrand (Soft-Maint) - Bug 424992 - [Table] Change Look&Feel from beveled to MS Excel-like
 *    Grégoire Dupé (Mia-Software) - Bug 424992 - [Table] Change Look&Feel from beveled to MS Excel-like
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import java.util.List;

import net.sourceforge.nattable.config.CellConfigAttributes;
import net.sourceforge.nattable.config.IConfigRegistry;
import net.sourceforge.nattable.grid.GridRegion;
import net.sourceforge.nattable.layer.config.DefaultColumnHeaderStyleConfiguration;
import net.sourceforge.nattable.painter.cell.BackgroundPainter;
import net.sourceforge.nattable.painter.cell.ICellPainter;
import net.sourceforge.nattable.painter.cell.TextPainter;
import net.sourceforge.nattable.sort.config.DefaultSortConfiguration;
import net.sourceforge.nattable.sort.painter.SortableHeaderTextPainter;
import net.sourceforge.nattable.style.DisplayMode;

import org.eclipse.emf.facet.custom.ui.ICustomizedLabelProvider;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.ColorUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.DefaultSizeUtils;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget.BodyLayerStack;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.CustomizedCellPainter;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.cell.decorator.LightColumnBorderDecorator;
import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable.painter.cell.decorator.LightCornerBorderDecorator;

/**
 * Extends the default column header style configuration to add custom painters
 * for the column headers. This has to be added to the table using the
 * addConfiguration() method.
 * 
 * @see StyledGridExample
 */
public class StyledColumnHeaderConfiguration extends DefaultColumnHeaderStyleConfiguration {

	private final BodyLayerStack bodyLayer;
	private final List<Column> columnDescriptions;

	private final ICustomizedLabelProvider labelProvider;
	private final NatTableWidget natTableWidget;
	private final ICellPainter painter;

	public StyledColumnHeaderConfiguration(final BodyLayerStack bodyLayer,
			final List<Column> columnDescriptions,
			final ICustomizedLabelProvider labelProvider,
			final NatTableWidget natTableWidget) {
		this.font = DefaultSizeUtils.getHeaderFont();
		this.bodyLayer = bodyLayer;
		this.columnDescriptions = columnDescriptions;
		this.labelProvider = labelProvider;
		this.natTableWidget = natTableWidget;
		this.bgColor = ColorUtils.getHeaderBackgoundColor();
		this.painter = createCellPainter();
	}

	@Override
	public void configureRegistry(final IConfigRegistry configRegistry) {
		super.configureRegistry(configRegistry);
		final BackgroundPainter bgPainter = new BackgroundPainter();
		final LightCornerBorderDecorator cornerDecorator = new LightCornerBorderDecorator(
				bgPainter);
		configRegistry.registerConfigAttribute(
				CellConfigAttributes.CELL_PAINTER, cornerDecorator,
				DisplayMode.NORMAL, GridRegion.CORNER);
		addNormalModeStyling(configRegistry);
		addSelectedModeStyling(configRegistry);
	}

	private void addSelectedModeStyling(final IConfigRegistry configRegistry) {
		// If sorting is enabled we still want the sort icon to be drawn.
		final SortableHeaderTextPainter selectedHeaderPainter = new SortableHeaderTextPainter(
				this.painter, false);
		configRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER,
				selectedHeaderPainter, DisplayMode.SELECT, GridRegion.COLUMN_HEADER);
	}

	private ICellPainter createCellPainter() {
		final TextPainter txtPainter = new CustomizedCellPainter(
				this.labelProvider, this.natTableWidget);
		final HeaderImagePainter headerImagePainter = new HeaderImagePainter(
				this.bodyLayer, this.columnDescriptions, this.labelProvider);
		final ICellPainter[] cellPainters = new ICellPainter[] {
				headerImagePainter, txtPainter };
		final HorizontalPainterWrapper hPainter = new HorizontalPainterWrapper(
				cellPainters);
		final BackgroundPainter backgndPainter = new BackgroundPainter(hPainter);
		return new LightColumnBorderDecorator(backgndPainter);
	}

	private void addNormalModeStyling(final IConfigRegistry configurationRegistry) {
		final SortableHeaderTextPainter headerPainter = new SortableHeaderTextPainter(
				this.painter, false);
		configurationRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER,
				headerPainter, DisplayMode.NORMAL, GridRegion.COLUMN_HEADER);
		configurationRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER,
				headerPainter, DisplayMode.NORMAL, DefaultSortConfiguration.SORT_DOWN_CONFIG_TYPE);
		configurationRegistry.registerConfigAttribute(CellConfigAttributes.CELL_PAINTER,
				headerPainter, DisplayMode.NORMAL, DefaultSortConfiguration.SORT_UP_CONFIG_TYPE);
	}

}