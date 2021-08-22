/**
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 */
package org.eclipse.emf.parsley.dsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.dsl.model.EmfFeatureAccess;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class EmfParsleyDslModelUtil {
  public static EmfFeatureAccess containingEmfFeatureAccess(final EObject o) {
    return EcoreUtil2.<EmfFeatureAccess>getContainerOfType(o, EmfFeatureAccess.class);
  }
  
  public static Module containingModule(final EObject o) {
    return EcoreUtil2.<Module>getContainerOfType(o, Module.class);
  }
}
