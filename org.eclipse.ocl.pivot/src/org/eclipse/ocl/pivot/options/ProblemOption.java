/*******************************************************************************
 * Copyright (c) 2010, 2015 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.options;

import org.eclipse.ocl.pivot.utilities.Option;


/**
 * Options for problem-reporting in parsing OCL constraints.  These options
 * determine the severity of usage of constructs that deviate from the OCL
 * Specification.
 * 
 * @author Christian W. Damus (cdamus)
 */
public enum ProblemOption implements Option<ProblemHandler.Severity> {
	/**
	 * Severity of using the non-spec <tt>closure</tt> iterator.
	 * The default severity is <tt>WARNING</tt>.
	 */
	CLOSURE_ITERATOR("iterators.closure", ProblemHandler.Severity.WARNING), //$NON-NLS-1$
	
	/**
	 * Severity of using the non-spec <tt>toUpper()</tt> and <tt>toLower()</tt>
	 * operations on <tt>String</tt>s.
	 * The default severity is <tt>WARNING</tt>.
	 */
	STRING_CASE_CONVERSION("string.caseconv", ProblemHandler.Severity.WARNING), //$NON-NLS-1$
	
	/**
	 * Severity of using the non-spec <tt>''</tt> escape sequence for single-quotes
	 * in string literals.
	 * The default severity is <tt>WARNING</tt>.
	 */
	STRING_SINGLE_QUOTE_ESCAPE("string.escapes.squote", ProblemHandler.Severity.WARNING), //$NON-NLS-1$
	
	/**
	 * Severity of using the non-spec <tt>"..."</tt> escape sequence for
	 * element names consisting of multiple OCL tokens.
	 * The default severity is <tt>WARNING</tt>.
	 */
	ELEMENT_NAME_QUOTE_ESCAPE("string.escapes.element", ProblemHandler.Severity.WARNING), //$NON-NLS-1$
    
    /**
     * Severity of the ambiguity when an unnavigable but named associend has the
     * same name as the implicit name of an unnamed association end.
     * The default severity is <tt>ERROR</tt>.
     */
    AMBIGUOUS_ASSOCIATION_ENDS("ambiguous.association.ends", ProblemHandler.Severity.ERROR), //$NON-NLS-1$
    
    /**
     * Severity of the problem to report when declaring (using the concrete
     * syntax) an operation or property context in a classifier that inherits
     * the feature (rather than declaring a redefinition of the feature as
     * the context).  This is allowed by the MDT OCL implementation but is not,
     * strictly speaking, well-formed OCL.
     * The default severity is <tt>WARNING</tt>.
     */
    INHERITED_FEATURE_CONTEXT("inherited.feature.context", ProblemHandler.Severity.WARNING), //$NON-NLS-1$
	
	/**
	 * Severity of making use of an operation name conceptually as
	 * in 7.4.8 .
	 * The default severity is <tt>OK</tt>.
	 */
	CONCEPTUAL_OPERATION_NAME("conceptual.operation.name", ProblemHandler.Severity.ERROR); //$NON-NLS-1$
	
	private final String key;
	private final ProblemHandler.Severity defaultValue;
	
	ProblemOption(String key, ProblemHandler.Severity defaultValue) {
		this.key = key;
		this.defaultValue = defaultValue;
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public ProblemHandler.Severity getDefaultValue() {
		return defaultValue;
	}
}
