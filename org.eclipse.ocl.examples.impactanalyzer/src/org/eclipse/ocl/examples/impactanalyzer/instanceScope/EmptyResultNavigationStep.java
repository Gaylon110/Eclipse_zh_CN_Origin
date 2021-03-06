/*******************************************************************************
 * Copyright (c) 2009, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer.instanceScope;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.examples.impactanalyzer.util.AnnotatedEObject;

public class EmptyResultNavigationStep extends AbsoluteNavigationStep {

	public EmptyResultNavigationStep(OCLExpression debugInfo) {
		super(null, debugInfo);
		setAlwaysEmpty();
	}

	@Override
	public String contentToString(Map<NavigationStep, Integer> visited, int indent) {
		return "<empty>";
	}

	@Override
	protected Set<AnnotatedEObject> navigate(AnnotatedEObject fromObject,
			TracebackCache cache, Notification changeEvent) {
		return Collections.emptySet();
	}
}
