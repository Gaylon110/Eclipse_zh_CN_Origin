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
package org.eclipse.egf.core.platform.pde;

import org.eclipse.egf.common.helper.URIHelper;
import org.eclipse.emf.common.util.URI;

public abstract class PlatformExtensionPointURI extends PlatformExtensionPoint implements IPlatformExtensionPointURI {

    protected URI _uri;

    public PlatformExtensionPointURI(IPlatformBundle bundle, String uri) {
        super(bundle, uri);
        _uri = URIHelper.getPlatformPluginURI(bundle.getBundleId(), URI.decode(getId()), false);
    }

    public PlatformExtensionPointURI(IPlatformBundle bundle, String uri, String uniqueIdentifier, int handleId) {
        super(bundle, uri, uniqueIdentifier, handleId);
        _uri = URIHelper.getPlatformPluginURI(bundle.getBundleId(), URI.decode(getId()), false);
    }

    public URI getURI() {
        return _uri;
    }

    @Override
    public String toString() {
        return URIHelper.toString(getURI());
    }

}
