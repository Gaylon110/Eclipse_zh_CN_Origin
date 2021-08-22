/*******************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 335020 - Nattable widget should use the Eclipse framework
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported;


/**
 * This interface has to be implemented by each EMF Facet AbstractTableWidget
 * container so that the default handler to execute table native commands will
 * work.
 */
public interface ITableWidgetProvider {

	/**
	 * @return the widget provided by the container.
	 */
	ITableWidget getTableWidget();

}
