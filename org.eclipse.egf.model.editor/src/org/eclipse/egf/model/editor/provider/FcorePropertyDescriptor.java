/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.eclipse.egf.model.editor.provider;

import org.eclipse.egf.core.ui.EGFCoreUIPlugin;
import org.eclipse.egf.core.ui.contributor.PropertyEditorContributor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Xavier Maysonnave
 * 
 */
public class FcorePropertyDescriptor extends PropertyDescriptor {

    public FcorePropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
        super(object, itemPropertyDescriptor);
    }

    /**
     * This returns the cell editor that will be used to edit the value of this property.
     * This default implementation determines the type of cell editor from the nature of the structural feature.
     */
    @Override
    public CellEditor createPropertyEditor(Composite composite) {
        if (itemPropertyDescriptor.canSetProperty(object) == false) {
            return null;
        }
        // Contribution
        PropertyEditorContributor propertyEditorContributor = EGFCoreUIPlugin.selectPropertyEditor(object, itemPropertyDescriptor);
        if (propertyEditorContributor != null) {
            return propertyEditorContributor.createPropertyEditor(composite, object, itemPropertyDescriptor);
        }
        return super.createPropertyEditor(composite);
    }

}
