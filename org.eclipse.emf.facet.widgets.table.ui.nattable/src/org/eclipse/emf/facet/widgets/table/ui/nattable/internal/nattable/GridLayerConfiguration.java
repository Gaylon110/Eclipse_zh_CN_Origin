/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 331203 - table model editor - initial API and implementation
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Nicolas Guyomar (Mia-Software) - Bug 342028 - Field can be edited even if they are marked as N/A
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.config.AggregateConfiguration;
import net.sourceforge.nattable.edit.config.DefaultEditConfiguration;
import net.sourceforge.nattable.grid.GridRegion;
import net.sourceforge.nattable.grid.cell.AlternatingRowConfigLabelAccumulator;
import net.sourceforge.nattable.grid.layer.GridLayer;
import net.sourceforge.nattable.grid.layer.config.DefaultRowStyleConfiguration;

import org.eclipse.emf.facet.widgets.table.ui.nattable.internal.NatTableWidget;

public class GridLayerConfiguration extends AggregateConfiguration {

	public GridLayerConfiguration(final GridLayer gridLayer, final NatTableWidget natTableWidget) {
		addConfiguration(new EditBindings(natTableWidget));
		addConfiguration(new UIBindings(natTableWidget));
		addConfiguration(new DefaultEditConfiguration());
		addConfiguration(new DefaultRowStyleConfiguration());
		gridLayer.setConfigLabelAccumulatorForRegion(GridRegion.BODY,
				new AlternatingRowConfigLabelAccumulator());
	}
}