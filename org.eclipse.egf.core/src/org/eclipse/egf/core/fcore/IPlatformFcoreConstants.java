/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 **/
package org.eclipse.egf.core.fcore;

import org.eclipse.egf.common.constant.EGFCommonConstants;
import org.eclipse.egf.core.EGFCorePlugin;

/**
 * Defines all constants related to Fcore extension point declaration.
 */
public interface IPlatformFcoreConstants {

    /**
     * Define a constant for the Fcore extension-point id.
     */
    public static final String FCORE_EXTENSION_POINT_ID = "fcore"; //$NON-NLS-1$

    /**
     * Define a constant for the Fcore extension-point id as a fully
     * qualified id.
     */
    public static final String FULLY_QUALIFIED_EXTENSION_POINT_ID = EGFCorePlugin.getDefault().getPluginID() + EGFCommonConstants.DOT_STRING + FCORE_EXTENSION_POINT_ID;

    /**
     * Define a constant for the Fcore extension-point child.
     */
    static final String FCORE_EXTENSION_CHILD = FCORE_EXTENSION_POINT_ID;

    /**
     * Define a constant for the 'id' attribute.
     */
    public static final String FCORE_ATT_ID = "id"; //$NON-NLS-1$

    /**
     * Define a constant for the Fcore file extension.
     */
    public static final String FCORE_FILE_EXTENSION = "fcore"; //$NON-NLS-1$  

}
