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
package org.eclipse.egf.model.fcore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.fcore.Viewpoint#getViewpointContainer <em>Viewpoint Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.fcore.FcorePackage#getViewpoint()
 * @model abstract="true"
 * @generated
 */
public interface Viewpoint extends ModelElement {

    /**
     * Returns the value of the '<em><b>Viewpoint Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.fcore.ViewpointContainer#getViewpoints <em>Viewpoints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Viewpoint Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Viewpoint Container</em>' container reference.
     * @see #setViewpointContainer(ViewpointContainer)
     * @see org.eclipse.egf.model.fcore.FcorePackage#getViewpoint_ViewpointContainer()
     * @see org.eclipse.egf.model.fcore.ViewpointContainer#getViewpoints
     * @model opposite="viewpoints" resolveProxies="false" required="true" transient="false"
     * @generated
     */
    ViewpointContainer getViewpointContainer();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.fcore.Viewpoint#getViewpointContainer <em>Viewpoint Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Viewpoint Container</em>' container reference.
     * @see #getViewpointContainer()
     * @generated
     */
    void setViewpointContainer(ViewpointContainer value);

} // Viewpoint
