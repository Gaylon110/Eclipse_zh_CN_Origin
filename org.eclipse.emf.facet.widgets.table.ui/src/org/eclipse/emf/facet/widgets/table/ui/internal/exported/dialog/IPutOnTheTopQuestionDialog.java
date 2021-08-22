/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.exported.dialog;

public interface IPutOnTheTopQuestionDialog {
	/**
	 * Press the button "Yes"
	 */
	void pressYes();

	/**
	 * @return <code>true</code> if the checkbox is checked
	 */
	boolean isAskTheUserNextTime();

	/**
	 * @return the answer of the user
	 */
	boolean isPutOnTheTop();

	/**
	 * Press the button "No"
	 */
	void pressNo();

	/**
	 * check the checkbox
	 */
	void check();
}
