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
package org.eclipse.egf.model.mapping;

import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.mapping.MappingViewpoint#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.mapping.MappingPackage#getMappingViewpoint()
 * @model
 * @generated
 */
public interface MappingViewpoint extends Viewpoint {

    /**
     * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.egf.model.mapping.MappingDomain}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mappings</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mappings</em>' containment reference list.
     * @see org.eclipse.egf.model.mapping.MappingPackage#getMappingViewpoint_Mappings()
     * @model containment="true"
     * @generated
     */
    EList<MappingDomain> getMappings();

} // MappingViewpoint
