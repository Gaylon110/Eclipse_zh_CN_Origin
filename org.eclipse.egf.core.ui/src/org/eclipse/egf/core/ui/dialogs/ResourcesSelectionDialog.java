/**
 * 
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 * 
 */

package org.eclipse.egf.core.ui.dialogs;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

/**
 * @author xiaoru chen
 * 
 */
public class ResourcesSelectionDialog extends FilteredResourcesSelectionDialog {

    private final String fileExtension;

    public ResourcesSelectionDialog(Shell shell, boolean multi, IContainer container, int typesMask, String fileExtension) {
        super(shell, multi, container, typesMask);
        this.fileExtension = fileExtension == null ? "" : fileExtension.toLowerCase(); //$NON-NLS-1$
    }

    @Override
    protected ItemsFilter createFilter() {
        return new ResourceExtensionFilter();
    }

    /**
     * Filters resources using pattern and showDerived flag. It overrides
     * ItemsFilter.
     */
    protected class ResourceExtensionFilter extends ResourceFilter {

        @Override
        public boolean matchItem(Object item) {
            boolean match = super.matchItem(item);
            if (!match || ("".equals(fileExtension) && match)) { //$NON-NLS-1$
                return match;
            }
            String currentExtension = ((IResource) item).getFileExtension();
            return (!(currentExtension == null) && fileExtension.equals(currentExtension.toLowerCase()));
        }

    }

}
