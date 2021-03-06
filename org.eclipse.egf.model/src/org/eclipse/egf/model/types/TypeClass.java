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
 * A representation of the model object '<em><b>Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.types.TypeClass#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.types.TypesPackage#getTypeClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MandatoryValue'"
 * @generated
 */
public interface TypeClass extends TypeAbstractClass {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see org.eclipse.egf.model.types.TypesPackage#getTypeClass_Type()
     * @model unsettable="true" transient="true" changeable="false" derived="true"
     * @generated
     */
    @SuppressWarnings("unchecked")
    Class<?> getType();

    /**
     * Returns whether the value of the '{@link org.eclipse.egf.model.types.TypeClass#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #getType()
     * @generated
     */
    boolean isSetType();

} // TypeClass
