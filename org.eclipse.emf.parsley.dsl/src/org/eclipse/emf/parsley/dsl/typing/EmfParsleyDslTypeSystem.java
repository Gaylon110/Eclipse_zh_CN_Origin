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
package org.eclipse.emf.parsley.dsl.typing;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;

@SuppressWarnings("all")
public class EmfParsleyDslTypeSystem {
  @Inject
  private CommonTypeComputationServices services;
  
  public boolean isConformant(final EObject context, final Class<?> expected, final JvmTypeReference actual) {
    boolean _xblockexpression = false;
    {
      final LightweightTypeReference actualType = this.toLightweightTypeReference(actual, context);
      _xblockexpression = actualType.isSubtypeOf(expected);
    }
    return _xblockexpression;
  }
  
  public boolean isConformant(final EObject context, final JvmTypeReference expected, final JvmTypeReference actual) {
    boolean _xblockexpression = false;
    {
      final LightweightTypeReference actualType = this.toLightweightTypeReference(actual, context);
      final LightweightTypeReference expectedType = this.toLightweightTypeReference(expected, context);
      _xblockexpression = expectedType.isAssignableFrom(actualType);
    }
    return _xblockexpression;
  }
  
  public LightweightTypeReference toLightweightTypeReference(final JvmTypeReference typeRef, final EObject context) {
    return this.newTypeReferenceOwner(context).toLightweightTypeReference(typeRef);
  }
  
  protected StandardTypeReferenceOwner newTypeReferenceOwner(final EObject context) {
    return new StandardTypeReferenceOwner(this.services, context);
  }
}
