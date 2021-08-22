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

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.WithExtendsClause;
import org.eclipse.emf.parsley.dsl.typing.EmfParsleyDslTypeSystem;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.typesystem.override.IResolvedOperation;
import org.eclipse.xtext.xbase.typesystem.override.OverrideHelper;
import org.eclipse.xtext.xbase.typesystem.override.ResolvedFeatures;

@SuppressWarnings("all")
public class EmfParsleyDslGuiceModuleHelper {
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private OverrideHelper _overrideHelper;
  
  @Inject
  @Extension
  private EmfParsleyDslTypeSystem _emfParsleyDslTypeSystem;
  
  public JvmGenericType getModuleInferredType(final Module module) {
    return IterableExtensions.<JvmGenericType>head(this.getInferredJavaTypes(module));
  }
  
  public Iterable<JvmGenericType> getInferredJavaTypes(final EObject o) {
    return Iterables.<JvmGenericType>filter(this._iJvmModelAssociations.getJvmElements(o), JvmGenericType.class);
  }
  
  public Iterable<JvmOperation> getAllGuiceValueBindingsMethodsInSuperclass(final Module module) {
    return this.getAllGuiceValueBindingsMethodsInSuperclass(this.getModuleInferredType(module));
  }
  
  public Iterable<JvmOperation> getAllGuiceTypeBindingsMethodsInSuperclass(final Module module) {
    final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
      @Override
      public Boolean apply(final JvmOperation it) {
        return Boolean.valueOf((it.getSimpleName().startsWith("bind") && 
          (IterableExtensions.<JvmTypeReference>head(((JvmParameterizedTypeReference) it.getReturnType()).getArguments()) != null)));
      }
    };
    return IterableExtensions.<JvmOperation>filter(this.superTypeJvmOperations(module), _function);
  }
  
  public Iterable<JvmOperation> getAllGuiceProviderBindingsMethodsInSuperclass(final Module module) {
    final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
      @Override
      public Boolean apply(final JvmOperation it) {
        return Boolean.valueOf(it.getSimpleName().startsWith("provide"));
      }
    };
    return IterableExtensions.<JvmOperation>filter(this.superTypeJvmOperations(module), _function);
  }
  
  public Iterable<JvmOperation> getAllGuiceValueBindingsMethodsInSuperclass(final JvmGenericType type) {
    final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
      @Override
      public Boolean apply(final JvmOperation it) {
        return Boolean.valueOf(it.getSimpleName().startsWith("value"));
      }
    };
    return IterableExtensions.<JvmOperation>filter(this.superTypeJvmOperations(type), _function);
  }
  
  public Iterable<JvmGenericType> getAllWithExtendsClauseInferredJavaTypes(final Module module) {
    final Function1<WithExtendsClause, Iterable<JvmGenericType>> _function = new Function1<WithExtendsClause, Iterable<JvmGenericType>>() {
      @Override
      public Iterable<JvmGenericType> apply(final WithExtendsClause it) {
        return EmfParsleyDslGuiceModuleHelper.this.getInferredJavaTypes(it);
      }
    };
    return Iterables.<JvmGenericType>concat(IterableExtensions.<WithExtendsClause, Iterable<JvmGenericType>>map(this.getAllWithExtendsClause(module), _function));
  }
  
  public Iterable<WithExtendsClause> getAllWithExtendsClause(final Module module) {
    return Iterables.<WithExtendsClause>filter(module.eContents(), WithExtendsClause.class);
  }
  
  public ResolvedFeatures getJavaResolvedFeatures(final JvmGenericType type) {
    return this._overrideHelper.getResolvedFeatures(type);
  }
  
  public String getJavaMethodResolvedErasedSignature(final IResolvedOperation op) {
    return op.getResolvedErasureSignature();
  }
  
  public boolean containsConstructorAcceptingPluginParameter(final EObject context, final JvmTypeReference typeRef) {
    final JvmType type = typeRef.getType();
    if ((type instanceof JvmGenericType)) {
      final Function1<JvmConstructor, Boolean> _function = new Function1<JvmConstructor, Boolean>() {
        @Override
        public Boolean apply(final JvmConstructor it) {
          return Boolean.valueOf(((it.getParameters().size() == 1) && 
            EmfParsleyDslGuiceModuleHelper.this._emfParsleyDslTypeSystem.isConformant(context, AbstractUIPlugin.class, IterableExtensions.<JvmFormalParameter>head(it.getParameters()).getParameterType())));
        }
      };
      return IterableExtensions.<JvmConstructor>exists(((JvmGenericType)type).getDeclaredConstructors(), _function);
    }
    return false;
  }
  
  private Iterable<JvmOperation> superTypeJvmOperations(final Module module) {
    return this.superTypeJvmOperations(this.getModuleInferredType(module));
  }
  
  private Iterable<JvmOperation> superTypeJvmOperations(final JvmGenericType type) {
    if ((type == null)) {
      return CollectionLiterals.<JvmOperation>emptyList();
    }
    JvmType _type = IterableExtensions.<JvmTypeReference>head(type.getSuperTypes()).getType();
    return Iterables.<JvmOperation>filter(((JvmGenericType) _type).getAllFeatures(), JvmOperation.class);
  }
}
