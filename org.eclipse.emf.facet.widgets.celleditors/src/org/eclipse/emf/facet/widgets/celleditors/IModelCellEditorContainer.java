/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.celleditors;

import org.eclipse.emf.facet.widgets.celleditors.modelCellEditor.AbstractModelCellEditor;

public interface IModelCellEditorContainer<T extends AbstractModelCellEditor> {

	public String getBundleName();

	public void setBundleName(String bundleName);

	public AbstractModelCellEditor getModelCellEditor();
	
	public void setModelCellEditor(AbstractModelCellEditor modelCellEditor);
}
