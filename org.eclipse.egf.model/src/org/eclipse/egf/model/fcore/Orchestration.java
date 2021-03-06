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

import org.eclipse.egf.model.types.Type;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.fcore.Orchestration#getFactoryComponent <em>Factory Component</em>}</li>
 *   <li>{@link org.eclipse.egf.model.fcore.Orchestration#getOrchestrationParameterContainer <em>Orchestration Parameter Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.fcore.FcorePackage#getOrchestration()
 * @model abstract="true"
 * @generated
 */
public interface Orchestration extends ModelElement {

    /**
     * Returns the value of the '<em><b>Factory Component</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.fcore.FactoryComponent#getOrchestration <em>Orchestration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Factory Component</em>' container reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Factory Component</em>' container reference.
     * @see #setFactoryComponent(FactoryComponent)
     * @see org.eclipse.egf.model.fcore.FcorePackage#getOrchestration_FactoryComponent()
     * @see org.eclipse.egf.model.fcore.FactoryComponent#getOrchestration
     * @model opposite="orchestration" resolveProxies="false" required="true" transient="false"
     * @generated
     */
    FactoryComponent getFactoryComponent();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.fcore.Orchestration#getFactoryComponent <em>Factory Component</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Factory Component</em>' container reference.
     * @see #getFactoryComponent()
     * @generated
     */
    void setFactoryComponent(FactoryComponent value);

    /**
     * Returns the value of the '<em><b>Orchestration Parameter Container</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.fcore.OrchestrationParameterContainer#getOrchestration <em>Orchestration</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Orchestration Parameter Container</em>' containment reference isn't
     * clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orchestration Parameter Container</em>' containment reference.
     * @see #setOrchestrationParameterContainer(OrchestrationParameterContainer)
     * @see org.eclipse.egf.model.fcore.FcorePackage#getOrchestration_OrchestrationParameterContainer()
     * @see org.eclipse.egf.model.fcore.OrchestrationParameterContainer#getOrchestration
     * @model opposite="orchestration" containment="true"
     * @generated
     */
    OrchestrationParameterContainer getOrchestrationParameterContainer();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.fcore.Orchestration#getOrchestrationParameterContainer <em>Orchestration Parameter Container</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Orchestration Parameter Container</em>' containment reference.
     * @see #getOrchestrationParameterContainer()
     * @generated
     */
    void setOrchestrationParameterContainer(OrchestrationParameterContainer value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    <T extends Invocation> EList<T> getInvocations();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<OrchestrationParameter> getOrchestrationParameters();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EList<OrchestrationParameter> getOrchestrationParameters(Type type);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<InvocationContract> getInvocationContracts();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EList<InvocationContract> getInvocationContracts(Type type);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EList<InvocationContract> getInvocationContracts(ContractMode mode);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    EList<InvocationContract> getInvocationContracts(Type type, ContractMode mode);

} // Orchestration
