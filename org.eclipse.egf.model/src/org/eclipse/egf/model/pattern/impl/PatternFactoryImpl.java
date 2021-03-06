/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.eclipse.egf.model.pattern.impl;

import java.util.Map;

import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.model.pattern.BackCall;
import org.eclipse.egf.model.pattern.BasicQuery;
import org.eclipse.egf.model.pattern.CustomQuery;
import org.eclipse.egf.model.pattern.MethodCall;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternCall;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternElement;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.PatternInjectedCall;
import org.eclipse.egf.model.pattern.PatternLibrary;
import org.eclipse.egf.model.pattern.PatternMethod;
import org.eclipse.egf.model.pattern.PatternPackage;
import org.eclipse.egf.model.pattern.PatternParameter;
import org.eclipse.egf.model.pattern.PatternVariable;
import org.eclipse.egf.model.pattern.PatternViewpoint;
import org.eclipse.egf.model.pattern.StringQuery;
import org.eclipse.egf.model.pattern.Substitution;
import org.eclipse.egf.model.pattern.SuperCall;
import org.eclipse.egf.model.pattern.TypePatternCallBackHandler;
import org.eclipse.egf.model.pattern.TypePatternDomainVisitor;
import org.eclipse.egf.model.pattern.TypePatternExecutionReporter;
import org.eclipse.egf.model.pattern.TypePatternList;
import org.eclipse.egf.model.pattern.TypePatternSubstitution;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternFactoryImpl extends EFactoryImpl implements PatternFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static PatternFactory init() {
        try {
            PatternFactory thePatternFactory = (PatternFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/egf/1.0.0/pattern"); //$NON-NLS-1$ 
            if (thePatternFactory != null) {
                return thePatternFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new PatternFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case PatternPackage.PATTERN_LIBRARY:
            return createPatternLibrary();
        case PatternPackage.PATTERN:
            return createPattern();
        case PatternPackage.PATTERN_METHOD:
            return createPatternMethod();
        case PatternPackage.PATTERN_PARAMETER:
            return createPatternParameter();
        case PatternPackage.PATTERN_VIEWPOINT:
            return createPatternViewpoint();
        case PatternPackage.PATTERN_CALL:
            return createPatternCall();
        case PatternPackage.SUPER_CALL:
            return createSuperCall();
        case PatternPackage.PARAMERTER2_PARAMETER_MAP:
            return (EObject) createParamerter2ParameterMap();
        case PatternPackage.METHOD_CALL:
            return createMethodCall();
        case PatternPackage.PATTERN_VARIABLE:
            return createPatternVariable();
        case PatternPackage.PATTERN_INJECTED_CALL:
            return createPatternInjectedCall();
        case PatternPackage.BASIC_QUERY:
            return createBasicQuery();
        case PatternPackage.STRING_QUERY:
            return createStringQuery();
        case PatternPackage.CUSTOM_QUERY:
            return createCustomQuery();
        case PatternPackage.STRING2_PATTERN_LIST:
            return (EObject) createString2PatternList();
        case PatternPackage.STRING2_STRING:
            return (EObject) createString2String();
        case PatternPackage.BACK_CALL:
            return createBackCall();
        case PatternPackage.SUBSTITUTION:
            return createSubstitution();
        case PatternPackage.TYPE_PATTERN_EXECUTION_REPORTER:
            return createTypePatternExecutionReporter();
        case PatternPackage.TYPE_PATTERN_CALL_BACK_HANDLER:
            return createTypePatternCallBackHandler();
        case PatternPackage.TYPE_PATTERN_DOMAIN_VISITOR:
            return createTypePatternDomainVisitor();
        case PatternPackage.TYPE_PATTERN_LIST:
            return createTypePatternList();
        case PatternPackage.TYPE_PATTERN_SUBSTITUTION:
            return createTypePatternSubstitution();
        case PatternPackage.TYPE_PATTERN_OUTPUT_PROCESSOR:
            return createTypePatternOutputProcessor();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case PatternPackage.PATTERN_CONTEXT:
            return createPatternContextFromString(eDataType, initialValue);
        case PatternPackage.PATTERN_EXCEPTION:
            return createPatternExceptionFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case PatternPackage.PATTERN_CONTEXT:
            return convertPatternContextToString(eDataType, instanceValue);
        case PatternPackage.PATTERN_EXCEPTION:
            return convertPatternExceptionToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pattern createPattern() {
        PatternImpl pattern = new PatternImpl();
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternMethod createPatternMethod() {
        PatternMethodImpl patternMethod = new PatternMethodImpl();
        return patternMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternParameter createPatternParameter() {
        PatternParameterImpl patternParameter = new PatternParameterImpl();
        return patternParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public PatternLibrary createPatternLibrary() {
        PatternLibraryImpl patternLibrary = new PatternLibraryImpl();
        patternLibrary.setName("default_package"); //$NON-NLS-1$
        return patternLibrary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternViewpoint createPatternViewpoint() {
        PatternViewpointImpl patternViewpoint = new PatternViewpointImpl();
        return patternViewpoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternCall createPatternCall() {
        PatternCallImpl patternCall = new PatternCallImpl();
        return patternCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SuperCall createSuperCall() {
        SuperCallImpl superCall = new SuperCallImpl();
        return superCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<InjectedContext, InjectedContext> createParamerter2ParameterMap() {
        Paramerter2ParameterMapImpl paramerter2ParameterMap = new Paramerter2ParameterMapImpl();
        return paramerter2ParameterMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MethodCall createMethodCall() {
        MethodCallImpl methodCall = new MethodCallImpl();
        return methodCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternVariable createPatternVariable() {
        PatternVariableImpl patternVariable = new PatternVariableImpl();
        return patternVariable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternInjectedCall createPatternInjectedCall() {
        PatternInjectedCallImpl patternInjectedCall = new PatternInjectedCallImpl();
        return patternInjectedCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicQuery createBasicQuery() {
        BasicQueryImpl basicQuery = new BasicQueryImpl();
        return basicQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringQuery createStringQuery() {
        StringQueryImpl stringQuery = new StringQueryImpl();
        return stringQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomQuery createCustomQuery() {
        CustomQueryImpl customQuery = new CustomQueryImpl();
        return customQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, EList<PatternElement>> createString2PatternList() {
        String2PatternListImpl string2PatternList = new String2PatternListImpl();
        return string2PatternList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<String, String> createString2String() {
        String2StringImpl string2String = new String2StringImpl();
        return string2String;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternExecutionReporter createTypePatternExecutionReporter() {
        TypePatternExecutionReporterImpl typePatternExecutionReporter = new TypePatternExecutionReporterImpl();
        return typePatternExecutionReporter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BackCall createBackCall() {
        BackCallImpl backCall = new BackCallImpl();
        return backCall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternCallBackHandler createTypePatternCallBackHandler() {
        TypePatternCallBackHandlerImpl typePatternCallBackHandler = new TypePatternCallBackHandlerImpl();
        return typePatternCallBackHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternDomainVisitor createTypePatternDomainVisitor() {
        TypePatternDomainVisitorImpl typePatternDomainVisitor = new TypePatternDomainVisitorImpl();
        return typePatternDomainVisitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternList createTypePatternList() {
        TypePatternListImpl typePatternList = new TypePatternListImpl();
        return typePatternList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternSubstitution createTypePatternSubstitution() {
        TypePatternSubstitutionImpl typePatternSubstitution = new TypePatternSubstitutionImpl();
        return typePatternSubstitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypePatternOutputProcessor createTypePatternOutputProcessor() {
        TypePatternOutputProcessorImpl typePatternOutputProcessor = new TypePatternOutputProcessorImpl();
        return typePatternOutputProcessor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substitution createSubstitution() {
        SubstitutionImpl substitution = new SubstitutionImpl();
        return substitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternContext createPatternContext(String literal) {
        return (PatternContext) super.createFromString(PatternPackage.Literals.PATTERN_CONTEXT, literal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternContext createPatternContextFromString(EDataType eDataType, String initialValue) {
        return (PatternContext) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternContext(PatternContext instanceValue) {
        return super.convertToString(PatternPackage.Literals.PATTERN_CONTEXT, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternContextToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternException createPatternException(String literal) {
        return (PatternException) super.createFromString(PatternPackage.Literals.PATTERN_EXCEPTION, literal);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternException createPatternExceptionFromString(EDataType eDataType, String initialValue) {
        return (PatternException) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternException(PatternException instanceValue) {
        return super.convertToString(PatternPackage.Literals.PATTERN_EXCEPTION, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPatternExceptionToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternPackage getPatternPackage() {
        return (PatternPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static PatternPackage getPackage() {
        return PatternPackage.eINSTANCE;
    }

} // PatternFactoryImpl
