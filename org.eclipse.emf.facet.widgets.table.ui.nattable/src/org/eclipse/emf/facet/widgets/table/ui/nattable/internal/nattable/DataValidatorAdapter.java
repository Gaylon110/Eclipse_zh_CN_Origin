/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Bros (Mia-Software) - Bug 332437 - NatTable : pluggable cell editors
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.nattable.internal.nattable;

import net.sourceforge.nattable.data.validate.IDataValidator;

import org.eclipse.emf.facet.widgets.celleditors.IModelCellEditorValidator;

public class DataValidatorAdapter implements IDataValidator {

	private final IModelCellEditorValidator modelCellEditorValidator;

	public DataValidatorAdapter(final IModelCellEditorValidator modelCellEditorValidator) {
		this.modelCellEditorValidator = modelCellEditorValidator;
	}

	public boolean validate(final int columnIndex, final int rowIndex, final Object newValue) {
		return this.modelCellEditorValidator.isValid(newValue);
	}
}
