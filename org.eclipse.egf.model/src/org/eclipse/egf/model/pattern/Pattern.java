/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.eclipse.egf.model.pattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getNature <em>Nature</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getContainer <em>Container</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getSuperPattern <em>Super Pattern</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getHeaderMethod <em>Header Method</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getConditionMethod <em>Condition Method</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getInitMethod <em>Init Method</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getFooterMethod <em>Footer Method</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.egf.model.pattern.Pattern#getOrchestration <em>Orchestration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueName HeaderMethod FooterMethod'"
 * @generated
 */
public interface Pattern extends PatternElement {

    /**
     * Returns the value of the '<em><b>Header Method</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header Method</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Header Method</em>' reference.
     * @see #setHeaderMethod(PatternMethod)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_HeaderMethod()
     * @model resolveProxies="false" required="true"
     * @generated
     */
    PatternMethod getHeaderMethod();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getHeaderMethod <em>Header Method</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Header Method</em>' reference.
     * @see #getHeaderMethod()
     * @generated
     */
    void setHeaderMethod(PatternMethod value);

    /**
     * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.egf.model.pattern.PatternMethod}.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.pattern.PatternMethod#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Methods</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Methods</em>' containment reference list.
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Methods()
     * @see org.eclipse.egf.model.pattern.PatternMethod#getPattern
     * @model opposite="pattern" containment="true"
     * @generated
     */
    EList<PatternMethod> getMethods();

    /**
     * Returns the value of the '<em><b>Super Pattern</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Pattern</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Pattern</em>' reference.
     * @see #setSuperPattern(Pattern)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_SuperPattern()
     * @model
     * @generated
     */
    Pattern getSuperPattern();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getSuperPattern <em>Super Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Pattern</em>' reference.
     * @see #getSuperPattern()
     * @generated
     */
    void setSuperPattern(Pattern value);

    /**
     * Returns the value of the '<em><b>Footer Method</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Footer Method</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Footer Method</em>' reference.
     * @see #setFooterMethod(PatternMethod)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_FooterMethod()
     * @model resolveProxies="false" required="true"
     * @generated
     */
    PatternMethod getFooterMethod();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getFooterMethod <em>Footer Method</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Footer Method</em>' reference.
     * @see #getFooterMethod()
     * @generated
     */
    void setFooterMethod(PatternMethod value);

    /**
     * Returns the value of the '<em><b>Orchestration</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.egf.model.pattern.Call}.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.pattern.Call#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Orchestration</em>' reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Orchestration</em>' containment reference list.
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Orchestration()
     * @see org.eclipse.egf.model.pattern.Call#getPattern
     * @model opposite="pattern" containment="true"
     * @generated
     */
    EList<Call> getOrchestration();

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.egf.model.pattern.PatternParameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<PatternParameter> getParameters();

    /**
     * Returns the value of the '<em><b>Nature</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nature</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nature</em>' containment reference.
     * @see #setNature(PatternNature)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Nature()
     * @model containment="true" required="true"
     * @generated
     */
    PatternNature getNature();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getNature <em>Nature</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nature</em>' containment reference.
     * @see #getNature()
     * @generated
     */
    void setNature(PatternNature value);

    /**
     * Returns the value of the '<em><b>Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.egf.model.pattern.PatternLibrary#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Container</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Container</em>' container reference.
     * @see #setContainer(PatternLibrary)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Container()
     * @see org.eclipse.egf.model.pattern.PatternLibrary#getElements
     * @model opposite="elements" resolveProxies="false" transient="false"
     * @generated
     */
    PatternLibrary getContainer();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getContainer <em>Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Container</em>' container reference.
     * @see #getContainer()
     * @generated
     */
    void setContainer(PatternLibrary value);

    /**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.egf.model.pattern.PatternVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variables</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_Variables()
     * @model containment="true"
     * @generated
     */
    EList<PatternVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Init Method</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Init Method</em>' reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Method</em>' reference.
     * @see #setInitMethod(PatternMethod)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_InitMethod()
     * @model resolveProxies="false" required="true"
     * @generated
     */
    PatternMethod getInitMethod();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getInitMethod <em>Init Method</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Method</em>' reference.
     * @see #getInitMethod()
     * @generated
     */
    void setInitMethod(PatternMethod value);

    /**
     * Returns the value of the '<em><b>Condition Method</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Condition Method</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Condition Method</em>' reference.
     * @see #setConditionMethod(PatternMethod)
     * @see org.eclipse.egf.model.pattern.PatternPackage#getPattern_ConditionMethod()
     * @model resolveProxies="false"
     * @generated
     */
    PatternMethod getConditionMethod();

    /**
     * Sets the value of the '{@link org.eclipse.egf.model.pattern.Pattern#getConditionMethod <em>Condition Method</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition Method</em>' reference.
     * @see #getConditionMethod()
     * @generated
     */
    void setConditionMethod(PatternMethod value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    PatternMethod getMethod(String name);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<PatternParameter> getAllParameters();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<PatternVariable> getAllVariables();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    EList<PatternMethod> getAllMethods();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model nameRequired="true"
     * @generated
     */
    PatternParameter getParameter(String name);

} // Pattern
