/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *    Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/

package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

import java.util.List;

import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Column;

public interface IColumnsToHideDialog {
	
	/**
	 * 
	 * @return the dialog to put the question to the user
	 */
	IPutOnTheTopQuestionDialog getPutOnTheTopQuestionDialog();

	/**
	 * press the ok button
	 */
	void pressOk();

	/**
	 * 
	 * @return the list of the select columns
	 */
	List<Column> getSelectedColumns();

	/**
	 * 
	 * @return the boolean to know if the question should be displayed the next
	 *         time
	 */
	boolean isMustAskTheUserNextTime();

	/**
	 * 
	 * @return the boolean to know if the local custom should be put on the top
	 */
	boolean isPutOnTheTop();

	/**
	 * select all the items in the viewer
	 */
	void selectAll();

	/**
	 * deselect all the items in the viewer
	 */
	void deselectAll();

}
