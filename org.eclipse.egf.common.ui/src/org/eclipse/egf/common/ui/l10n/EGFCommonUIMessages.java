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
package org.eclipse.egf.common.ui.l10n;

import org.eclipse.osgi.util.NLS;

public class EGFCommonUIMessages {

    private static final String BUNDLE_NAME = "org.eclipse.egf.common.ui.l10n.messages"; //$NON-NLS-1$

    private EGFCommonUIMessages() {
        // Do not instantiate
    }

    static {
        // load message values from bundle file
        NLS.initializeMessages(BUNDLE_NAME, EGFCommonUIMessages.class);
    }

    public static String ThrowableHandler_Title;

    public static String Unexpected_Error;

    public static String CopyEObjectQualifiedName_name;

    public static String CopyEObjectMetaClassQualifiedName_name;

    public static String CopyEObjectStaticMetaClassQualifiedName_name;

    public static String CopyQualifiedNameAction_ErrorDescription;

    public static String CopyQualifiedNameAction_ErrorTitle;

    public static String AbstractExampleWizard_Unzipping;

}
