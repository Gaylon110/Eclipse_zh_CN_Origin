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
package org.eclipse.egf.model.types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.types.TypeBoolean#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.types.TypesPackage#getTypeBoolean()
 * @model
 * @generated
 */
public interface TypeBoolean extends TypeObject {

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Boolean)
     * @see org.eclipse.egf.model.types.TypesPackage#getTypeBoolean_Value()
     * @model
     * @generated
     */
    Boolean getValue();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.types.TypeBoolean#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Boolean value);

} // TypeBoolean
