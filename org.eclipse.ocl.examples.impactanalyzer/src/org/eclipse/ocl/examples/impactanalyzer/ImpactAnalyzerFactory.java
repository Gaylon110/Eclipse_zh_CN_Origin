/*******************************************************************************
 * Copyright (c) 2009, 2014 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.OppositePropertyCallExp;
import org.eclipse.ocl.ecore.opposites.DefaultOppositeEndFinder;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.eclipse.ocl.examples.eventmanager.EventManager;
import org.eclipse.ocl.examples.impactanalyzer.configuration.ActivationOption;
import org.eclipse.ocl.examples.impactanalyzer.configuration.OptimizationActivation;
import org.eclipse.ocl.examples.impactanalyzer.impl.ImpactAnalyzerFactoryImpl;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;

/**
 * Used to create {@link ImpactAnalyzer} and {@link DerivedPropertyNotifier}
 * objects. A default factory can be obtained using the {@link #INSTANCE} field.
 * 
 * @author Axel Uhl
 */
public interface ImpactAnalyzerFactory {
    static final ImpactAnalyzerFactory INSTANCE = new ImpactAnalyzerFactoryImpl();

    /**
     * Constructs an impact analyzer for the expression specified. The expression's context type is inferred from any occurrence
     * of <code>self</code> in the expression. If no <code>self</code> occurrence can be found, an exception will be thrown. The
     * configuration is taken from the default {@link OptimizationActivation#getOption()}.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type and its subtypes or not. (Creation here means that the object is added to a resource in the
     *            {@link ResourceSet} observed by the {@link EventManager} used for handling change events.) Registering for
     *            element creation on the context type is useful for invariants / constraints because when a new element is
     *            created, validating the constraint may be useful. For other use cases, registering for element creation may not
     *            be so useful. For example, when a type inferencer defines its rules using OCL, it only wants to receive
     *            <em>update</em> events after the element has been fully initialized from those OCL expressions. In those cases,
     *            some framework may be responsible for the initial evaluation of those OCL expressions on new element, and
     *            therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, boolean notifyOnNewContextElements, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified with an explicit context type specification. Use this factory
     * method if <code>expression</code> does not contain any reference to <code>self</code>. The configuration is taken from the
     * default {@link OptimizationActivation#getOption()}.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type and its subtypes or not. (Creation here means that the object is added to a resource in the
     *            {@link ResourceSet} observed by the {@link EventManager} used for handling change events.) Registering for
     *            element creation on the context type is useful for invariants / constraints because when a new element is
     *            created, validating the constraint may be useful. For other use cases, registering for element creation may not
     *            be so useful. For example, when a type inferencer defines its rules using OCL, it only wants to receive
     *            <em>update</em> events after the element has been fully initialized from those OCL expressions. In those cases,
     *            some framework may be responsible for the initial evaluation of those OCL expressions on new element, and
     *            therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, EClass context, boolean notifyOnNewContextElements, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified with an explicit context type specification. Use this factory
     * method if <code>expression</code> does not contain any reference to <code>self</code>. The configuration is taken from the
     * default {@link OptimizationActivation#getOption()}.
     * @param oppositeEndFinder
     *            used to perform {@link OppositePropertyCallExp} when evaluating (parts of) <code>expression</code> and for
     *            evaluating <code>allInstances()</code> calls
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, EClass context, boolean notifyOnNewContextElements,
            OppositeEndFinder oppositeEndFinder, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified. The expression's context type is inferred from any occurrence
     * of <code>self</code> in the expression. If no <code>self</code> occurrence can be found, an exception will be thrown. The
     * configuration is taken from the default {@link OptimizationActivation#getOption()}.
     * @param oppositeEndFinder
     *            used to perform {@link OppositePropertyCallExp} when evaluating (parts of) <code>expression</code> and for
     *            evaluating <code>allInstances()</code> calls
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, boolean notifyOnNewContextElements,
            OppositeEndFinder oppositeEndFinder, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified. The expression's context type is inferred from any occurrence
     * of <code>self</code> in the expression. If no <code>self</code> occurrence can be found, an exception will be thrown.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, boolean notifyOnNewContextElements,
            OppositeEndFinder oppositeEndFinder, ActivationOption configuration, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified with an explicit context type specification. Use this factory
     * method if <code>expression</code> does not contain any reference to <code>self</code>.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, EClass context, boolean notifyOnNewContextElements,
            OppositeEndFinder oppositeEndFinder, ActivationOption configuration, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified with an explicit context type specification. Use this factory
     * method if <code>expression</code> does not contain any reference to <code>self</code>.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, EClass context, boolean notifyOnNewContextElements,
            ActivationOption configuration, OCLFactory oclFactory);

    /**
     * Constructs an impact analyzer for the expression specified. The expression's context type is inferred from any occurrence
     * of <code>self</code> in the expression. If no <code>self</code> occurrence can be found, an exception will be thrown.
     * @param notifyOnNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    ImpactAnalyzer createImpactAnalyzer(OCLExpression expression, boolean notifyOnNewContextElements,
            ActivationOption configuration, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for derived properties which efficiently, based on
	 * an {@link ImpactAnalyzer}, constructs and emits {@link Notification}s for
	 * derived, OCL-specified {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * This variant uses a {@link DefaultOppositeEndFinder default opposite end
	 * finder} for resolving and navigating {@link OppositePropertyCallExp}
	 * expressions. The configuration is taken from the default
	 * {@link OptimizationActivation#getOption()}.
	 * 
	 * @param property
	 *            the {@link EStructuralFeature#isDerived() derived} property
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EStructuralFeature property, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for derived properties which efficiently, based on
	 * an {@link ImpactAnalyzer}, constructs and emits {@link Notification}s for
	 * derived, OCL-specified {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * This variant uses a {@link DefaultOppositeEndFinder default opposite end
	 * finder} for resolving and navigating {@link OppositePropertyCallExp}
	 * expressions.
	 * 
	 * @param property
	 *            the {@link EStructuralFeature#isDerived() derived} property
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EStructuralFeature property, ActivationOption configuration, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for derived properties which efficiently, based on
	 * an {@link ImpactAnalyzer}, constructs and emits {@link Notification}s for
	 * derived, OCL-specified {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * The configuration is taken from the default
	 * {@link OptimizationActivation#getOption()}.
	 * 
	 * @param property
	 *            the {@link EStructuralFeature#isDerived() derived} property
	 * @param oppositeEndFinder
	 *            used to perform {@link OppositePropertyCallExp} when
	 *            evaluating (parts of) <code>expression</code> and for
	 *            evaluating <code>allInstances()</code> calls
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EStructuralFeature property, OppositeEndFinder oppositeEndFinder, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for derived properties which efficiently, based on
	 * an {@link ImpactAnalyzer}, constructs and emits {@link Notification}s for
	 * derived, OCL-specified {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * @param property
	 *            the {@link EStructuralFeature#isDerived() derived} property
	 * @param oppositeEndFinder
	 *            used to perform {@link OppositePropertyCallExp} when
	 *            evaluating (parts of) <code>expression</code> and for
	 *            evaluating <code>allInstances()</code> calls
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EStructuralFeature property, OppositeEndFinder oppositeEndFinder,
			ActivationOption configuration, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for all derived properties in <code>pkg</code>
	 * which efficiently, based on an {@link ImpactAnalyzer}, constructs and
	 * emits {@link Notification}s for derived, OCL-specified
	 * {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * This variant uses a {@link DefaultOppositeEndFinder default opposite end
	 * finder} for resolving and navigating {@link OppositePropertyCallExp}
	 * expressions. The configuration is taken from the default
	 * {@link OptimizationActivation#getOption()}.
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EPackage pkg, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for all derived properties in <code>pkg</code>
	 * which efficiently, based on an {@link ImpactAnalyzer}, constructs and
	 * emits {@link Notification}s for derived, OCL-specified
	 * {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * This variant uses a {@link DefaultOppositeEndFinder default opposite end
	 * finder} for resolving and navigating {@link OppositePropertyCallExp}
	 * expressions.
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EPackage pkg, ActivationOption configuration, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for all derived properties in <code>pkg</code>
	 * which efficiently, based on an {@link ImpactAnalyzer}, constructs and
	 * emits {@link Notification}s for derived, OCL-specified
	 * {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * The configuration is taken from the default
	 * {@link OptimizationActivation#getOption()}.
	 * 
	 * @param oppositeEndFinder
	 *            used to perform {@link OppositePropertyCallExp} when
	 *            evaluating (parts of) <code>expression</code> and for
	 *            evaluating <code>allInstances()</code> calls
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EPackage pkg, OppositeEndFinder oppositeEndFinder, OCLFactory oclFactory);

	/**
	 * Constructs a notifier for all derived properties in <code>pkg</code>
	 * which efficiently, based on an {@link ImpactAnalyzer}, constructs and
	 * emits {@link Notification}s for derived, OCL-specified
	 * {@link EStructuralFeature properties}.
	 * <p>
	 * 
	 * @param oppositeEndFinder
	 *            used to perform {@link OppositePropertyCallExp} when
	 *            evaluating (parts of) <code>expression</code> and for
	 *            evaluating <code>allInstances()</code> calls
	 */
	DerivedPropertyNotifier createDerivedPropertyNotifier(
			EPackage pkg, OppositeEndFinder oppositeEndFinder,
			ActivationOption configuration, OCLFactory oclFactory);
}
