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
package org.eclipse.emf.parsley.dsl.scoping;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.parsley.util.DatabindingUtil;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;

@SuppressWarnings("all")
public class EmfParsleyDslImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {
  @Override
  protected List<Class<?>> getExtensionClasses() {
    List<Class<?>> _extensionClasses = super.getExtensionClasses();
    return IterableExtensions.<Class<?>>toList(Iterables.<Class<?>>concat(_extensionClasses, Collections.<Class<?>>unmodifiableList(CollectionLiterals.<Class<?>>newArrayList(Widget.class, DatabindingUtil.class))));
  }
}
