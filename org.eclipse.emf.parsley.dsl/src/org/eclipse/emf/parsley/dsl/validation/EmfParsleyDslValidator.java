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
package org.eclipse.emf.parsley.dsl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.parsley.dsl.model.EmfFeatureAccess;
import org.eclipse.emf.parsley.dsl.model.FieldSpecification;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.PartSpecification;
import org.eclipse.emf.parsley.dsl.model.PartsSpecifications;
import org.eclipse.emf.parsley.dsl.model.ProviderBinding;
import org.eclipse.emf.parsley.dsl.model.TypeBinding;
import org.eclipse.emf.parsley.dsl.model.ValueBinding;
import org.eclipse.emf.parsley.dsl.model.ViewSpecification;
import org.eclipse.emf.parsley.dsl.model.WithExtendsClause;
import org.eclipse.emf.parsley.dsl.typing.EmfParsleyDslTypeSystem;
import org.eclipse.emf.parsley.dsl.util.EmfParsleyDslGuiceModuleHelper;
import org.eclipse.emf.parsley.dsl.validation.AbstractEmfParsleyDslValidator;
import org.eclipse.emf.parsley.dsl.validation.EmfParsleyDslExpectedSuperTypes;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typesystem.override.IResolvedOperation;
import org.eclipse.xtext.xbase.typesystem.override.ResolvedFeatures;
import org.eclipse.xtext.xbase.typesystem.util.Multimaps2;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class EmfParsleyDslValidator extends AbstractEmfParsleyDslValidator {
  public final static String TYPE_MISMATCH = "org.eclipse.emf.parsley.dsl.TypeMismatch";
  
  public final static String CYCLIC_INHERITANCE = "org.eclipse.emf.parsley.dsl.CyclicInheritance";
  
  public final static String FINAL_FIELD_NOT_INITIALIZED = "org.eclipse.emf.parsley.dsl.FinalFieldNotInitialized";
  
  public final static String TOO_LITTLE_TYPE_INFORMATION = "org.eclipse.emf.parsley.dsl.TooLittleTypeInformation";
  
  public final static String DUPLICATE_BINDING = "org.eclipse.emf.parsley.dsl.DuplicateBinding";
  
  public final static String DUPLICATE_ELEMENT = "org.eclipse.emf.parsley.dsl.DuplicateElement";
  
  public final static String NON_COMPLIANT_BINDING = "org.eclipse.emf.parsley.dsl.NonCompliantBinding";
  
  @Inject
  private EmfParsleyDslTypeSystem typeSystem;
  
  @Inject
  @Extension
  private EmfParsleyDslExpectedSuperTypes _emfParsleyDslExpectedSuperTypes;
  
  @Inject
  @Extension
  private EmfParsleyDslGuiceModuleHelper _emfParsleyDslGuiceModuleHelper;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  private ResourceDescriptionsProvider rdp;
  
  @Inject
  private IContainer.Manager cm;
  
  private final ModelPackage modelPackage = ModelPackage.eINSTANCE;
  
  @Check(CheckType.NORMAL)
  public void checkDuplicateViewSpecificationAcrossFiles(final ViewSpecification viewSpecification) {
    final Iterable<IEObjectDescription> descriptions = this.getVisibleEObjectDescriptions(viewSpecification, 
      ModelPackage.Literals.VIEW_SPECIFICATION);
    for (final IEObjectDescription desc : descriptions) {
      if (((Objects.equal(desc.getQualifiedName().toString(), viewSpecification.getId()) && 
        (!Objects.equal(desc.getEObjectOrProxy(), viewSpecification))) && 
        (!Objects.equal(desc.getEObjectURI().trimFragment(), viewSpecification.eResource().getURI())))) {
        String _id = viewSpecification.getId();
        String _plus = ("The part id " + _id);
        String _plus_1 = (_plus + " is already defined");
        this.error(_plus_1, 
          this.modelPackage.getViewSpecification_Id(), 
          EmfParsleyDslValidator.DUPLICATE_ELEMENT);
        return;
      }
    }
  }
  
  private Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = new Function1<IContainer, Iterable<IEObjectDescription>>() {
      @Override
      public Iterable<IEObjectDescription> apply(final IContainer container) {
        return container.getExportedObjectsByType(type);
      }
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }
  
  private List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      final IResourceDescription rd = index.getResourceDescription(o.eResource().getURI());
      _xblockexpression = this.cm.getVisibleContainers(rd, index);
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkViewSpecification(final ViewSpecification viewSpecification) {
    this.checkType(viewSpecification, 
      viewSpecification.getType(), this._emfParsleyDslExpectedSuperTypes.getExpectedSupertype(viewSpecification), 
      ModelPackage.Literals.VIEW_SPECIFICATION__TYPE);
  }
  
  @Check
  public void checkEmfFeatureAccess(final EmfFeatureAccess emfFeatureAccess) {
    this.checkType(emfFeatureAccess, 
      emfFeatureAccess.getParameterType(), this._emfParsleyDslExpectedSuperTypes.getExpectedSupertype(emfFeatureAccess), 
      ModelPackage.Literals.EMF_FEATURE_ACCESS__PARAMETER_TYPE);
  }
  
  @Check
  public void checkExtendsClause(final WithExtendsClause withExtendsClause) {
    if (((withExtendsClause.getExtendsClause() != null) && (!this.hasCycleInHierarchy(withExtendsClause)))) {
      this.checkType(withExtendsClause.getExtendsClause(), 
        withExtendsClause.getExtendsClause().getSuperType(), this._emfParsleyDslExpectedSuperTypes.getExpectedSupertype(withExtendsClause), 
        ModelPackage.Literals.EXTENDS_CLAUSE__SUPER_TYPE);
    }
  }
  
  @Check
  public void checkFieldInitialization(final FieldSpecification f) {
    if (((!f.isWriteable()) && (f.getRight() == null))) {
      String _name = f.getName();
      String _plus = ("The blank final field " + _name);
      String _plus_1 = (_plus + " may not have been initialized");
      this.error(_plus_1, 
        ModelPackage.Literals.FIELD_SPECIFICATION__NAME, 
        EmfParsleyDslValidator.FINAL_FIELD_NOT_INITIALIZED);
    }
    if (((f.getType() == null) && (f.getRight() == null))) {
      String _name_1 = f.getName();
      String _plus_2 = ("The field " + _name_1);
      String _plus_3 = (_plus_2 + " needs an explicit type since there is no initialization expression to infer the type from.");
      this.error(_plus_3, f, ModelPackage.Literals.FIELD_SPECIFICATION__NAME, 
        EmfParsleyDslValidator.TOO_LITTLE_TYPE_INFORMATION);
    }
  }
  
  @Check
  public void checkModule(final Module module) {
    final JvmGenericType guiceModuleClass = this._emfParsleyDslGuiceModuleHelper.getModuleInferredType(module);
    if ((guiceModuleClass == null)) {
      return;
    }
    final PartsSpecifications partsSpecifications = module.getPartsSpecifications();
    if ((partsSpecifications != null)) {
      this.checkDuplicateViewSpecifications(partsSpecifications.getParts());
    }
    final Iterable<JvmOperation> methods = guiceModuleClass.getDeclaredOperations();
    boolean _isEmpty = IterableExtensions.isEmpty(methods);
    if (_isEmpty) {
      return;
    }
    this.checkDuplicateBindings(methods);
    this.checkCorrectValueBindings(guiceModuleClass, methods, module);
    Iterable<JvmGenericType> _allWithExtendsClauseInferredJavaTypes = this._emfParsleyDslGuiceModuleHelper.getAllWithExtendsClauseInferredJavaTypes(module);
    for (final JvmGenericType t : _allWithExtendsClauseInferredJavaTypes) {
      this.checkDuplicateSpecifications(t);
    }
  }
  
  private void checkDuplicateBindings(final Iterable<JvmOperation> methods) {
    final ListMultimap<String, JvmOperation> map = this.<String, JvmOperation>duplicatesMultimap();
    for (final JvmOperation m : methods) {
      map.put(m.getSimpleName(), m);
    }
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation d) {
        final EObject source = IterableExtensions.<EObject>head(EmfParsleyDslValidator.this._iJvmModelAssociations.getSourceElements(d));
        EmfParsleyDslValidator.this.error(
          EmfParsleyDslValidator.this.duplicateBindingMessage(source, d), source, 
          EmfParsleyDslValidator.this.duplicateBindingFeature(source), 
          EmfParsleyDslValidator.DUPLICATE_BINDING);
      }
    };
    this.<JvmOperation>checkDuplicates(map, _function);
  }
  
  /**
   * Since for fields we generate getter/setter, checking duplicate Java methods
   * will automatically check for duplicate fields as well.
   */
  private void checkDuplicateSpecifications(final JvmGenericType inferredType) {
    final ResolvedFeatures inferredFeatures = this._emfParsleyDslGuiceModuleHelper.getJavaResolvedFeatures(inferredType);
    final List<IResolvedOperation> methods = inferredFeatures.getDeclaredOperations();
    final ListMultimap<String, JvmOperation> map = this.<String, JvmOperation>duplicatesMultimap();
    final HashSet<EObject> errorSourceSeen = CollectionLiterals.<EObject>newHashSet();
    for (final IResolvedOperation m : methods) {
      map.put(this._emfParsleyDslGuiceModuleHelper.getJavaMethodResolvedErasedSignature(m), m.getDeclaration());
    }
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation d) {
        final EObject source = IterableExtensions.<EObject>head(EmfParsleyDslValidator.this._iJvmModelAssociations.getSourceElements(d));
        boolean _add = errorSourceSeen.add(source);
        if (_add) {
          EmfParsleyDslValidator.this.error(
            "Duplicate element", source, 
            null, 
            EmfParsleyDslValidator.DUPLICATE_ELEMENT);
        }
      }
    };
    this.<JvmOperation>checkDuplicates(map, _function);
  }
  
  private void checkDuplicateViewSpecifications(final List<PartSpecification> parts) {
    final ListMultimap<String, EObject> map = this.<String, EObject>duplicatesMultimap();
    Iterable<ViewSpecification> _filter = Iterables.<ViewSpecification>filter(parts, ViewSpecification.class);
    for (final ViewSpecification p : _filter) {
      map.put(p.getId(), p);
    }
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      @Override
      public void apply(final EObject d) {
        EmfParsleyDslValidator.this.error(
          "Duplicate element", d, 
          EmfParsleyDslValidator.this.modelPackage.getViewSpecification_Id(), 
          EmfParsleyDslValidator.DUPLICATE_ELEMENT);
      }
    };
    this.<EObject>checkDuplicates(map, _function);
  }
  
  private <T extends Object> void checkDuplicates(final ListMultimap<String, T> map, final Procedure1<? super T> errorReporter) {
    Set<Map.Entry<String, Collection<T>>> _entrySet = map.asMap().entrySet();
    for (final Map.Entry<String, Collection<T>> entry : _entrySet) {
      {
        final Collection<T> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final T d : duplicates) {
            errorReporter.apply(d);
          }
        }
      }
    }
  }
  
  public void checkCorrectValueBindings(final JvmGenericType guiceModuleClass, final Iterable<JvmOperation> methods, final Module module) {
    final Iterable<JvmOperation> superClassValueBindings = this._emfParsleyDslGuiceModuleHelper.getAllGuiceValueBindingsMethodsInSuperclass(guiceModuleClass);
    for (final JvmOperation superBinding : superClassValueBindings) {
      {
        final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
          @Override
          public Boolean apply(final JvmOperation it) {
            String _simpleName = it.getSimpleName();
            String _simpleName_1 = superBinding.getSimpleName();
            return Boolean.valueOf(Objects.equal(_simpleName, _simpleName_1));
          }
        };
        final JvmOperation matching = IterableExtensions.<JvmOperation>findFirst(methods, _function);
        if (((matching != null) && (!this.typeSystem.isConformant(module, superBinding.getReturnType(), matching.getReturnType())))) {
          String _simpleName = matching.getReturnType().getSimpleName();
          String _plus = ("Incorrect value binding: " + _simpleName);
          String _plus_1 = (_plus + 
            " is not compliant with inherited binding\'s type ");
          String _simpleName_1 = superBinding.getReturnType().getSimpleName();
          String _plus_2 = (_plus_1 + _simpleName_1);
          this.error(_plus_2, 
            IterableExtensions.<EObject>head(this._iJvmModelAssociations.getSourceElements(matching)), 
            this.modelPackage.getValueBinding_TypeDecl(), 
            EmfParsleyDslValidator.NON_COMPLIANT_BINDING);
        }
      }
    }
  }
  
  protected void checkType(final EObject context, final JvmTypeReference actualType, final Class<?> expectedType, final EStructuralFeature feature) {
    if ((actualType != null)) {
      boolean _isConformant = this.typeSystem.isConformant(context, expectedType, actualType);
      boolean _not = (!_isConformant);
      if (_not) {
        String _simpleName = actualType.getSimpleName();
        String _plus = ("Type mismatch: cannot convert from " + _simpleName);
        String _plus_1 = (_plus + 
          " to ");
        String _simpleName_1 = expectedType.getSimpleName();
        String _plus_2 = (_plus_1 + _simpleName_1);
        this.error(_plus_2, context, feature, 
          EmfParsleyDslValidator.TYPE_MISMATCH);
      }
    }
  }
  
  protected boolean hasCycleInHierarchy(final WithExtendsClause withExtendsClause) {
    JvmTypeReference _superType = withExtendsClause.getExtendsClause().getSuperType();
    JvmType _type = null;
    if (_superType!=null) {
      _type=_superType.getType();
    }
    final JvmType superType = _type;
    if ((superType instanceof JvmGenericType)) {
      boolean _hasCycleInHierarchy = this.hasCycleInHierarchy(((JvmGenericType)superType), CollectionLiterals.<JvmGenericType>newHashSet());
      if (_hasCycleInHierarchy) {
        String _simpleName = ((JvmGenericType)superType).getSimpleName();
        String _plus = ("The inheritance hierarchy of " + _simpleName);
        String _plus_1 = (_plus + " contains cycles");
        this.error(_plus_1, 
          withExtendsClause.getExtendsClause(), 
          ModelPackage.Literals.EXTENDS_CLAUSE__SUPER_TYPE, 
          EmfParsleyDslValidator.CYCLIC_INHERITANCE);
        return true;
      }
    }
    return false;
  }
  
  protected boolean hasCycleInHierarchy(final JvmGenericType type, final Set<JvmGenericType> processedSuperTypes) {
    boolean _contains = processedSuperTypes.contains(type);
    if (_contains) {
      return true;
    }
    processedSuperTypes.add(type);
    final Function1<JvmTypeReference, JvmType> _function = new Function1<JvmTypeReference, JvmType>() {
      @Override
      public JvmType apply(final JvmTypeReference it) {
        return it.getType();
      }
    };
    Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(ListExtensions.<JvmTypeReference, JvmType>map(type.getSuperTypes(), _function), JvmGenericType.class);
    for (final JvmGenericType genericType : _filter) {
      boolean _hasCycleInHierarchy = this.hasCycleInHierarchy(genericType, processedSuperTypes);
      if (_hasCycleInHierarchy) {
        return true;
      }
    }
    processedSuperTypes.remove(type);
    return false;
  }
  
  private <K extends Object, T extends Object> ListMultimap<K, T> duplicatesMultimap() {
    return Multimaps2.<K, T>newLinkedHashListMultimap();
  }
  
  private String duplicateBindingMessage(final EObject source, final JvmOperation method) {
    String _switchResult = null;
    boolean _matched = false;
    if (source instanceof TypeBinding) {
      _matched=true;
      _switchResult = method.getReturnType().getSimpleName();
    }
    if (!_matched) {
      if (source instanceof ProviderBinding) {
        _matched=true;
        _switchResult = method.getReturnType().getSimpleName();
      }
    }
    if (!_matched) {
      if (source instanceof ValueBinding) {
        _matched=true;
        _switchResult = ((ValueBinding)source).getId();
      }
    }
    if (!_matched) {
      _switchResult = method.getReturnType().getSimpleName();
    }
    return ("Duplicate binding for: " + _switchResult);
  }
  
  private EStructuralFeature duplicateBindingFeature(final EObject e) {
    EStructuralFeature _switchResult = null;
    boolean _matched = false;
    if (e instanceof TypeBinding) {
      _matched=true;
      _switchResult = this.modelPackage.getTypeBinding_TypeToBind();
    }
    if (!_matched) {
      if (e instanceof ProviderBinding) {
        _matched=true;
        _switchResult = this.modelPackage.getProviderBinding_Type();
      }
    }
    if (!_matched) {
      if (e instanceof ValueBinding) {
        _matched=true;
        _switchResult = this.modelPackage.getValueBinding_Id();
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
}
