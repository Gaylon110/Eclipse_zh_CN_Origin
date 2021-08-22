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
package org.eclipse.emf.parsley.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.composite.DialogControlFactory;
import org.eclipse.emf.parsley.composite.FormControlFactory;
import org.eclipse.emf.parsley.composite.ProposalCreator;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.dsl.jvmmodel.EmfParsleyDslGeneratorUtils;
import org.eclipse.emf.parsley.dsl.model.AbstractControlFactory;
import org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel;
import org.eclipse.emf.parsley.dsl.model.AbstractFeatureProvider;
import org.eclipse.emf.parsley.dsl.model.Binding;
import org.eclipse.emf.parsley.dsl.model.BindingsSpecification;
import org.eclipse.emf.parsley.dsl.model.ContentProviderChildren;
import org.eclipse.emf.parsley.dsl.model.ContentProviderElements;
import org.eclipse.emf.parsley.dsl.model.ControlFactorySpecification;
import org.eclipse.emf.parsley.dsl.model.ControlFactorySpecifications;
import org.eclipse.emf.parsley.dsl.model.ExtendsClause;
import org.eclipse.emf.parsley.dsl.model.FeatureAssociatedExpression;
import org.eclipse.emf.parsley.dsl.model.FeatureLabels;
import org.eclipse.emf.parsley.dsl.model.FeatureSpecification;
import org.eclipse.emf.parsley.dsl.model.FeatureSpecifications;
import org.eclipse.emf.parsley.dsl.model.FeatureTexts;
import org.eclipse.emf.parsley.dsl.model.FieldSpecification;
import org.eclipse.emf.parsley.dsl.model.LabelProvider;
import org.eclipse.emf.parsley.dsl.model.MenuBuilder;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.PolymorphicSpecification;
import org.eclipse.emf.parsley.dsl.model.ProviderBinding;
import org.eclipse.emf.parsley.dsl.model.SimpleMethodSpecification;
import org.eclipse.emf.parsley.dsl.model.TableLabelProvider;
import org.eclipse.emf.parsley.dsl.model.TypeBinding;
import org.eclipse.emf.parsley.dsl.model.ValueBinding;
import org.eclipse.emf.parsley.dsl.model.ViewerContentProvider;
import org.eclipse.emf.parsley.dsl.model.WithExpressions;
import org.eclipse.emf.parsley.dsl.model.WithExtendsClause;
import org.eclipse.emf.parsley.dsl.model.WithFeatureAssociatedExpressions;
import org.eclipse.emf.parsley.dsl.model.WithFields;
import org.eclipse.emf.parsley.dsl.typing.EmfParsleyDslTypeSystem;
import org.eclipse.emf.parsley.dsl.util.EmfParsleyDslGuiceModuleHelper;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.edit.ui.provider.TableViewerContentProvider;
import org.eclipse.emf.parsley.generator.common.EmfParsleyProjectFilesGeneratorUtil;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.emf.parsley.runtime.ui.AbstractGuiceAwareExecutableExtensionFactory;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;
import org.eclipse.emf.parsley.ui.provider.DialogFeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;
import org.eclipse.emf.parsley.ui.provider.FormFeatureCaptionProvider;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.emf.parsley.ui.provider.ViewerLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class EmfParsleyDslJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private TypesFactory _typesFactory;
  
  @Inject
  @Extension
  private EmfParsleyDslGeneratorUtils _emfParsleyDslGeneratorUtils;
  
  @Inject
  @Extension
  private EmfParsleyDslTypeSystem _emfParsleyDslTypeSystem;
  
  @Inject
  @Extension
  private EmfParsleyDslGuiceModuleHelper _emfParsleyDslGuiceModuleHelper;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass as the last argument.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  protected void _infer(final Module element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    boolean _isEmpty = element.getName().isEmpty();
    if (_isEmpty) {
      return;
    }
    final JvmGenericType moduleClass = this._jvmTypesBuilder.toClass(element, this.moduleQN(element));
    final JvmGenericType labelProviderClass = this.inferLabelProvider(element, acceptor);
    final JvmGenericType tableLabelProviderClass = this.inferTableLabelProvider(element, acceptor);
    final JvmGenericType featureCaptionProviderClass = this.inferFeatureCaptionProvider(element, acceptor);
    final JvmGenericType formFeatureCaptionProviderClass = this.inferFormFeatureCaptionProvider(element, acceptor);
    final JvmGenericType dialogFeatureCaptionProviderClass = this.inferDialogFeatureCaptionProvider(element, acceptor);
    final JvmGenericType featureProviderClass = this.inferFeatureProvider(element, acceptor);
    final JvmGenericType tableFeatureProviderClass = this.inferTableFeatureProvider(element, acceptor);
    final JvmGenericType formControlFactoryClass = this.inferFormControlFactory(element, acceptor);
    final JvmGenericType dialogControlFactoryClass = this.inferDialogControlFactory(element, acceptor);
    final JvmGenericType viewerContentProviderClass = this.inferViewerContentProvider(element, acceptor);
    final JvmGenericType tableViewerContentProviderClass = this.inferTableViewerContentProvider(element, acceptor);
    final JvmGenericType proposalCreatorClass = this.inferProposalCreator(element, acceptor);
    final JvmGenericType menuBuilderClass = this.inferMenuBuilder(element, acceptor);
    final JvmGenericType configuratorClass = this.inferConfigurator(element, acceptor);
    final JvmGenericType resourceManagerClass = this.inferResourceManager(element, acceptor);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element));
        EmfParsleyDslJvmModelInferrer.this.setSuperClassType(moduleClass, element, EmfParsleyGuiceModule.class);
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          @Override
          public void apply(final JvmConstructor it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "plugin", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(AbstractUIPlugin.class));
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final ExtendsClause extendsClause = element.getExtendsClause();
            if ((((extendsClause != null) && 
              (!EmfParsleyDslJvmModelInferrer.this._emfParsleyDslTypeSystem.isConformant(element, EmfParsleyGuiceModule.class, extendsClause.getSuperType()))) && 
              (!EmfParsleyDslJvmModelInferrer.this._emfParsleyDslGuiceModuleHelper.containsConstructorAcceptingPluginParameter(element, extendsClause.getSuperType())))) {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("// not used");
                }
              };
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
            } else {
              StringConcatenationClient _client_1 = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("super(plugin);");
                }
              };
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client_1);
            }
          }
        };
        JvmConstructor _constructor = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toConstructor(element, _function);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
        final BindingsSpecification bindingsSpecification = element.getBindingsSpecification();
        BindingsSpecification _bindingsSpecification = element.getBindingsSpecification();
        boolean _tripleNotEquals = (_bindingsSpecification != null);
        if (_tripleNotEquals) {
          EmfParsleyDslJvmModelInferrer.this.handleBindingsSpecification(it, bindingsSpecification);
        }
        if ((labelProviderClass != null)) {
          EList<JvmMember> _members_1 = it.getMembers();
          JvmOperation _genBindMethod = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getLabelProvider(), labelProviderClass, ILabelProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _genBindMethod);
        }
        if ((tableLabelProviderClass != null)) {
          EList<JvmMember> _members_2 = it.getMembers();
          JvmOperation _genBindMethod_1 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getTableLabelProvider(), tableLabelProviderClass, TableColumnLabelProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _genBindMethod_1);
        }
        if ((featureCaptionProviderClass != null)) {
          EList<JvmMember> _members_3 = it.getMembers();
          JvmOperation _genBindMethod_2 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getFeatureCaptionProvider(), featureCaptionProviderClass, FeatureCaptionProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _genBindMethod_2);
        }
        if ((formFeatureCaptionProviderClass != null)) {
          EList<JvmMember> _members_4 = it.getMembers();
          JvmOperation _genBindMethod_3 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getFormFeatureCaptionProvider(), formFeatureCaptionProviderClass, FormFeatureCaptionProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _genBindMethod_3);
        }
        if ((dialogFeatureCaptionProviderClass != null)) {
          EList<JvmMember> _members_5 = it.getMembers();
          JvmOperation _genBindMethod_4 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getDialogFeatureCaptionProvider(), dialogFeatureCaptionProviderClass, DialogFeatureCaptionProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _genBindMethod_4);
        }
        if ((featureProviderClass != null)) {
          EList<JvmMember> _members_6 = it.getMembers();
          JvmOperation _genBindMethod_5 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getFeaturesProvider(), featureProviderClass, FeaturesProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _genBindMethod_5);
        }
        if ((tableFeatureProviderClass != null)) {
          EList<JvmMember> _members_7 = it.getMembers();
          JvmOperation _genBindMethod_6 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getTableFeaturesProvider(), tableFeatureProviderClass, TableFeaturesProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _genBindMethod_6);
        }
        if ((formControlFactoryClass != null)) {
          EList<JvmMember> _members_8 = it.getMembers();
          JvmOperation _genBindMethod_7 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getFormControlFactory(), formControlFactoryClass, FormControlFactory.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_8, _genBindMethod_7);
        }
        if ((dialogControlFactoryClass != null)) {
          EList<JvmMember> _members_9 = it.getMembers();
          JvmOperation _genBindMethod_8 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getDialogControlFactory(), dialogControlFactoryClass, DialogControlFactory.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_9, _genBindMethod_8);
        }
        if ((viewerContentProviderClass != null)) {
          EList<JvmMember> _members_10 = it.getMembers();
          JvmOperation _genBindMethod_9 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getViewerContentProvider(), viewerContentProviderClass, IContentProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_10, _genBindMethod_9);
        }
        if ((tableViewerContentProviderClass != null)) {
          EList<JvmMember> _members_11 = it.getMembers();
          JvmOperation _genBindMethod_10 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getTableViewerContentProvider(), tableViewerContentProviderClass, TableViewerContentProvider.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _genBindMethod_10);
        }
        if ((proposalCreatorClass != null)) {
          EList<JvmMember> _members_12 = it.getMembers();
          JvmOperation _genBindMethod_11 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getProposalCreator(), proposalCreatorClass, ProposalCreator.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _genBindMethod_11);
        }
        if ((menuBuilderClass != null)) {
          EList<JvmMember> _members_13 = it.getMembers();
          JvmOperation _genBindMethod_12 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getMenuBuilder(), menuBuilderClass, EditingMenuBuilder.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_13, _genBindMethod_12);
        }
        if ((configuratorClass != null)) {
          EList<JvmMember> _members_14 = it.getMembers();
          JvmOperation _genBindMethod_13 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getConfigurator(), configuratorClass, Configurator.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_14, _genBindMethod_13);
        }
        if ((resourceManagerClass != null)) {
          EList<JvmMember> _members_15 = it.getMembers();
          JvmOperation _genBindMethod_14 = EmfParsleyDslJvmModelInferrer.this.genBindMethod(element.getResourceManager(), resourceManagerClass, ResourceManager.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_15, _genBindMethod_14);
        }
      }
    };
    acceptor.<JvmGenericType>accept(moduleClass, _function);
    final JvmGenericType injectorProviderClass = this._jvmTypesBuilder.toClass(element, this.injectorProviderQN(element));
    final Procedure1<JvmGenericType> _function_1 = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<JvmMember> _members = it.getMembers();
        JvmField _field = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toField(element, "injector", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Injector.class));
        final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          @Override
          public void apply(final JvmField it) {
            it.setStatic(true);
            it.setVisibility(JvmVisibility.PRIVATE);
          }
        };
        JvmField _doubleArrow = ObjectExtensions.<JvmField>operator_doubleArrow(_field, _function);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members, _doubleArrow);
        EList<JvmMember> _members_1 = it.getMembers();
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            it.setSynchronized(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (injector == null) {");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("injector = ");
                _builder.append(Guice.class, "  ");
                _builder.append(".createInjector(");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("new ");
                _builder.append(moduleClass, "    ");
                _builder.append("(");
                _builder.append(PluginUtil.class, "    ");
                _builder.append(".getPlugin(");
                _builder.newLineIfNotEmpty();
                _builder.append("      ");
                _builder.append(PluginUtil.class, "      ");
                _builder.append(".getBundle(");
                _builder.append(injectorProviderClass, "      ");
                _builder.append(".class))));");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return injector;");
                _builder.newLine();
              }
            };
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getInjector", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Injector.class), _function_1);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
      }
    };
    acceptor.<JvmGenericType>accept(injectorProviderClass, _function_1);
    boolean _shouldGenerateExtensions = this._emfParsleyDslGeneratorUtils.shouldGenerateExtensions(element);
    if (_shouldGenerateExtensions) {
      final Procedure1<JvmGenericType> _function_2 = new Procedure1<JvmGenericType>() {
        @Override
        public void apply(final JvmGenericType it) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          JvmTypeReference _typeRef = EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(AbstractGuiceAwareExecutableExtensionFactory.class);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              EmfParsleyDslJvmModelInferrer.this.addOverrideAnnotation(it);
              EList<JvmTypeReference> _exceptions = it.getExceptions();
              JvmTypeReference _typeRef = EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Exception.class);
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeRef);
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("return ");
                  _builder.append(injectorProviderClass);
                  _builder.append(".getInjector();");
                  _builder.newLineIfNotEmpty();
                }
              };
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
            }
          };
          JvmOperation _method = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "getInjector", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Injector.class), _function);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        }
      };
      acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(element, this._emfParsleyDslGeneratorUtils.executableExtensionFactoryQN(element)), _function_2);
    }
  }
  
  private boolean setSuperClassType(final JvmGenericType e, final WithExtendsClause dslElement, final Class<?> defaultSuperClass) {
    boolean _xifexpression = false;
    ExtendsClause _extendsClause = dslElement.getExtendsClause();
    boolean _tripleNotEquals = (_extendsClause != null);
    if (_tripleNotEquals) {
      EList<JvmTypeReference> _superTypes = e.getSuperTypes();
      JvmTypeReference _cloneWithProxies = this._jvmTypesBuilder.cloneWithProxies(dslElement.getExtendsClause().getSuperType());
      _xifexpression = this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
    } else {
      EList<JvmTypeReference> _superTypes_1 = e.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(defaultSuperClass);
      _xifexpression = this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _typeRef);
    }
    return _xifexpression;
  }
  
  private void setSuperClassTypeAndFields(final JvmGenericType e, final WithFields dslElement, final Class<?> defaultSuperClass) {
    this.setSuperClassType(e, dslElement, defaultSuperClass);
    this.processFields(e, dslElement);
  }
  
  private void processFields(final JvmGenericType it, final WithFields dslElement) {
    EList<FieldSpecification> _fields = dslElement.getFields();
    for (final FieldSpecification f : _fields) {
      {
        JvmTypeReference _elvis = null;
        JvmTypeReference _type = f.getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          XExpression _right = f.getRight();
          JvmTypeReference _inferredType = null;
          if (_right!=null) {
            _inferredType=this._jvmTypesBuilder.inferredType(_right);
          }
          _elvis = _inferredType;
        }
        final JvmTypeReference type = _elvis;
        final String name = f.getName();
        final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          @Override
          public void apply(final JvmField it) {
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, f.getRight());
            boolean _isWriteable = f.isWriteable();
            boolean _not = (!_isWriteable);
            it.setFinal(_not);
            it.setVisibility(JvmVisibility.PRIVATE);
            EmfParsleyDslJvmModelInferrer.this.translateAnnotations(it, f.getAnnotations());
            boolean _isExtension = f.isExtension();
            if (_isExtension) {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotationRef = EmfParsleyDslJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Extension.class);
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
            }
          }
        };
        final JvmField field = this._jvmTypesBuilder.toField(f, name, type, _function);
        EList<JvmMember> _members = it.getMembers();
        this._jvmTypesBuilder.<JvmField>operator_add(_members, field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmOperation _getter = this._jvmTypesBuilder.toGetter(f, name, type);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
        boolean _isWriteable = f.isWriteable();
        if (_isWriteable) {
          EList<JvmMember> _members_2 = it.getMembers();
          JvmOperation _setter = this._jvmTypesBuilder.toSetter(f, name, type);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _setter);
        }
      }
    }
  }
  
  private void translateAnnotations(final JvmAnnotationTarget target, final List<XAnnotation> annotations) {
    final Function1<XAnnotation, Boolean> _function = new Function1<XAnnotation, Boolean>() {
      @Override
      public Boolean apply(final XAnnotation it) {
        JvmType _annotationType = it.getAnnotationType();
        return Boolean.valueOf((_annotationType != null));
      }
    };
    this._jvmTypesBuilder.addAnnotations(target, IterableExtensions.<XAnnotation>filter(IterableExtensions.<XAnnotation>filterNull(annotations), _function));
  }
  
  private String moduleQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".EmfParsleyGuiceModule");
  }
  
  private String injectorProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".InjectorProvider");
  }
  
  private String labelProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.LabelProvider");
  }
  
  private String tableLabelProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.TableLabelProvider");
  }
  
  private String featureCaptionProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.FeatureCaptionProvider");
  }
  
  private String formFeatureCaptionProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.FormFeatureCaptionProvider");
  }
  
  private String dialogFeatureCaptionProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.DialogFeatureCaptionProvider");
  }
  
  private String featuresProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.FeaturesProvider");
  }
  
  private String tableFeaturesProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".ui.provider.TableFeaturesProvider");
  }
  
  private String formControlFactoryQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".binding.FormControlFactory");
  }
  
  private String dialogControlFactoryQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".binding.DialogControlFactory");
  }
  
  private String viewerContentProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".edit.ui.provider.ViewerContentProvider");
  }
  
  private String tableViewerContentProviderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".edit.ui.provider.TableViewerContentProvider");
  }
  
  private String proposalCreatorQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".binding.ProposalCreator");
  }
  
  private String menuBuilderQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".edit.action.MenuBuilder");
  }
  
  private String configuratorQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".config.Configurator");
  }
  
  private String resourceManagerQN(final Module element) {
    return this.fromModuleToJavaFullyQualifiedName(element, ".resource.ResourceManager");
  }
  
  private String fromModuleToJavaFullyQualifiedName(final Module element, final String templateString) {
    String _xblockexpression = null;
    {
      final String fqn = this._iQualifiedNameProvider.getFullyQualifiedName(element).toString();
      final String prefix = EmfParsleyProjectFilesGeneratorUtil.buildClassNameFromProject(fqn);
      final int lastDot = templateString.lastIndexOf(".");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(fqn);
      String _substring = templateString.substring(0, (lastDot + 1));
      _builder.append(_substring);
      _builder.append(prefix);
      String _substring_1 = templateString.substring((lastDot + 1));
      _builder.append(_substring_1);
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  private JvmGenericType inferLabelProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    LabelProvider _labelProvider = element.getLabelProvider();
    boolean _tripleEquals = (_labelProvider == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final LabelProvider labelProvider = element.getLabelProvider();
        final JvmGenericType labelProviderClass = this._jvmTypesBuilder.toClass(labelProvider, this.labelProviderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, labelProvider, ViewerLabelProvider.class);
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
              @Override
              public void apply(final JvmConstructor it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(labelProvider, "delegate", 
                  EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(AdapterFactoryLabelProvider.class));
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  @Override
                  public void apply(final ITreeAppendable it) {
                    it.append("super(delegate);");
                  }
                };
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _annotationRef = EmfParsleyDslJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Inject.class);
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
              }
            };
            JvmConstructor _constructor = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toConstructor(labelProvider, _function);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, labelProvider.getTexts(), "text", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, labelProvider.getImages(), "image", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, labelProvider.getFonts(), "font", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Font.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, labelProvider.getForegrounds(), "foreground", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, labelProvider.getBackgrounds(), "background", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class));
          }
        };
        acceptor.<JvmGenericType>accept(labelProviderClass, _function);
        _xblockexpression = labelProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferTableLabelProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    TableLabelProvider _tableLabelProvider = element.getTableLabelProvider();
    boolean _tripleEquals = (_tableLabelProvider == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final TableLabelProvider tableLabelProvider = element.getTableLabelProvider();
        final JvmGenericType tableLabelProviderClass = this._jvmTypesBuilder.toClass(tableLabelProvider, this.tableLabelProviderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, tableLabelProvider, TableColumnLabelProvider.class);
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForFeatureAssociatedExpression(it, tableLabelProvider.getFeatureTexts(), "text_", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class), EmfParsleyDslJvmModelInferrer.this.getParameterCreatorForFeatureAssociatedExpression());
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForFeatureAssociatedExpression(it, tableLabelProvider.getFeatureImages(), "image_", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Object.class), EmfParsleyDslJvmModelInferrer.this.getParameterCreatorForFeatureAssociatedExpression());
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForFeatureAssociatedExpression(it, tableLabelProvider.getFeatureFonts(), "font_", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Font.class), EmfParsleyDslJvmModelInferrer.this.getParameterCreatorForFeatureAssociatedExpression());
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForFeatureAssociatedExpression(it, tableLabelProvider.getFeatureForegrounds(), "foreground_", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class), EmfParsleyDslJvmModelInferrer.this.getParameterCreatorForFeatureAssociatedExpression());
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForFeatureAssociatedExpression(it, tableLabelProvider.getFeatureBackgrounds(), "background_", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class), EmfParsleyDslJvmModelInferrer.this.getParameterCreatorForFeatureAssociatedExpression());
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, tableLabelProvider.getRowFonts(), "rowFont", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Font.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, tableLabelProvider.getRowForegrounds(), "rowForeground", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, tableLabelProvider.getRowBackgrounds(), "rowBackground", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Color.class));
          }
        };
        acceptor.<JvmGenericType>accept(tableLabelProviderClass, _function);
        _xblockexpression = tableLabelProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferFeatureCaptionProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    org.eclipse.emf.parsley.dsl.model.FeatureCaptionProvider _featureCaptionProvider = element.getFeatureCaptionProvider();
    boolean _tripleEquals = (_featureCaptionProvider == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final org.eclipse.emf.parsley.dsl.model.FeatureCaptionProvider featureCaptionProvider = element.getFeatureCaptionProvider();
        final JvmGenericType propertyDescriptionProviderClass = this._jvmTypesBuilder.toClass(featureCaptionProvider, this.featureCaptionProviderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, featureCaptionProvider, FeatureCaptionProvider.class);
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForTextCaptionSpecifications(it, featureCaptionProvider.getFeatureTexts());
          }
        };
        acceptor.<JvmGenericType>accept(propertyDescriptionProviderClass, _function);
        _xblockexpression = propertyDescriptionProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferFormFeatureCaptionProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferDialogFeatureCaptionProviderWithLabel(element.getFormFeatureCaptionProvider(), 
      this.formFeatureCaptionProviderQN(element), FormFeatureCaptionProvider.class, acceptor);
  }
  
  private JvmGenericType inferDialogFeatureCaptionProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferDialogFeatureCaptionProviderWithLabel(element.getDialogFeatureCaptionProvider(), 
      this.dialogFeatureCaptionProviderQN(element), DialogFeatureCaptionProvider.class, acceptor);
  }
  
  private JvmGenericType inferDialogFeatureCaptionProviderWithLabel(final AbstractFeatureCaptionProviderWithLabel element, final String name, final Class<?> superClass, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    if ((element == null)) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final JvmGenericType descriptionProviderClass = this._jvmTypesBuilder.toClass(element, name);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, element, superClass);
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForTextCaptionSpecifications(it, element.getFeatureTexts());
            EmfParsleyDslJvmModelInferrer.this.inferMethodsForLabelCaptionSpecifications(it, element.getFeatureLabels());
          }
        };
        acceptor.<JvmGenericType>accept(descriptionProviderClass, _function);
        _xblockexpression = descriptionProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private Procedure2<? super JvmOperation, ? super FeatureAssociatedExpression> getParameterCreatorForFeatureAssociatedExpression() {
    final Procedure2<JvmOperation, FeatureAssociatedExpression> _function = new Procedure2<JvmOperation, FeatureAssociatedExpression>() {
      @Override
      public void apply(final JvmOperation it, final FeatureAssociatedExpression spec) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
          "it", spec.getParameterType());
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      }
    };
    return _function;
  }
  
  private void inferMethodsForTextCaptionSpecifications(final JvmGenericType it, final FeatureTexts texts) {
    final Procedure2<JvmOperation, FeatureAssociatedExpression> _function = new Procedure2<JvmOperation, FeatureAssociatedExpression>() {
      @Override
      public void apply(final JvmOperation it, final FeatureAssociatedExpression spec) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
          "it", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EStructuralFeature.class));
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      }
    };
    this.inferMethodsForFeatureAssociatedExpression(it, texts, "text_", this._typeReferenceBuilder.typeRef(String.class), _function);
  }
  
  private void inferMethodsForLabelCaptionSpecifications(final JvmGenericType it, final FeatureLabels labels) {
    final Procedure2<JvmOperation, FeatureAssociatedExpression> _function = new Procedure2<JvmOperation, FeatureAssociatedExpression>() {
      @Override
      public void apply(final JvmOperation it, final FeatureAssociatedExpression spec) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
          "parent", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Composite.class));
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmFormalParameter _parameter_1 = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
          "it", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EStructuralFeature.class));
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
      }
    };
    this.inferMethodsForFeatureAssociatedExpression(it, labels, "label_", this._typeReferenceBuilder.typeRef(Label.class), _function);
  }
  
  private void inferMethodsForFeatureAssociatedExpression(final JvmGenericType it, final WithFeatureAssociatedExpressions withFeatureAssociatedExpressions, final String prefix, final JvmTypeReference returnType, final Procedure2<? super JvmOperation, ? super FeatureAssociatedExpression> parameterCreator) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<FeatureAssociatedExpression> _specifications = withFeatureAssociatedExpressions.getSpecifications();
        for (final FeatureAssociatedExpression spec : _specifications) {
          EmfParsleyDslJvmModelInferrer.this.featureAssociatedExpressionToMethod(it, spec, prefix, returnType, parameterCreator);
        }
      }
    };
    this.<WithFeatureAssociatedExpressions>nullSafeAccess(it, withFeatureAssociatedExpressions, _function);
  }
  
  private boolean featureAssociatedExpressionToMethod(final JvmGenericType it, final FeatureAssociatedExpression spec, final String prefix, final JvmTypeReference returnType, final Procedure2<? super JvmOperation, ? super FeatureAssociatedExpression> parameterCreator) {
    boolean _xifexpression = false;
    JvmMember _feature = spec.getFeature();
    String _simpleName = null;
    if (_feature!=null) {
      _simpleName=_feature.getSimpleName();
    }
    boolean _tripleNotEquals = (_simpleName != null);
    if (_tripleNotEquals) {
      EList<JvmMember> _members = it.getMembers();
      String _simpleName_1 = spec.getParameterType().getSimpleName();
      String _plus = (prefix + _simpleName_1);
      String _plus_1 = (_plus + "_");
      String _propertyNameForGetterSetterMethod = this._emfParsleyDslGeneratorUtils.getPropertyNameForGetterSetterMethod(spec.getFeature().getSimpleName());
      String _plus_2 = (_plus_1 + _propertyNameForGetterSetterMethod);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        @Override
        public void apply(final JvmOperation it) {
          parameterCreator.apply(it, spec);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, spec.getExpression());
        }
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(spec, _plus_2, returnType, _function);
      _xifexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferFeatureProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferFeatureProviderCommon(element.getFeaturesProvider(), 
      this.featuresProviderQN(element), FeaturesProvider.class, acceptor);
  }
  
  private JvmGenericType inferTableFeatureProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferFeatureProviderCommon(element.getTableFeaturesProvider(), this.tableFeaturesProviderQN(element), TableFeaturesProvider.class, acceptor);
  }
  
  private JvmGenericType inferFeatureProviderCommon(final AbstractFeatureProvider element, final String name, final Class<?> superClass, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    if ((element == null)) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final JvmGenericType featureProviderClass = this._jvmTypesBuilder.toClass(element, name);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, element, superClass);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(element));
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              @Override
              public void apply(final JvmOperation m) {
                EmfParsleyDslJvmModelInferrer.this.addOverrideAnnotation(m);
                EList<JvmFormalParameter> _parameters = m.getParameters();
                JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(element, "stringMap", 
                  EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EClassToEStructuralFeatureAsStringsMap.class));
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  @Override
                  public void apply(final ITreeAppendable a) {
                    a.append("super.buildStringMap(stringMap);").newLine();
                    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
                      @Override
                      public void apply(final JvmGenericType it) {
                        EList<FeatureSpecification> _featureSpecifications = element.getFeatures().getFeatureSpecifications();
                        for (final FeatureSpecification featureSpecification : _featureSpecifications) {
                          {
                            ITreeAppendable _newLine = a.newLine();
                            StringConcatenation _builder = new StringConcatenation();
                            _builder.append("stringMap.mapTo(\"");
                            String _identifier = featureSpecification.getParameterType().getIdentifier();
                            _builder.append(_identifier);
                            _builder.append("\",");
                            _newLine.append(_builder).increaseIndentation().newLine();
                            final Function1<JvmMember, String> _function = new Function1<JvmMember, String>() {
                              @Override
                              public String apply(final JvmMember feature) {
                                String _propertyNameForGetterSetterMethod = EmfParsleyDslJvmModelInferrer.this._emfParsleyDslGeneratorUtils.getPropertyNameForGetterSetterMethod(feature.getSimpleName());
                                String _plus = ("\"" + _propertyNameForGetterSetterMethod);
                                return (_plus + "\"");
                              }
                            };
                            final List<String> fs = ListExtensions.<JvmMember, String>map(featureSpecification.getFeatures(), _function);
                            a.append(IterableExtensions.join(fs, ", "));
                            a.append(");").decreaseIndentation();
                          }
                        }
                      }
                    };
                    EmfParsleyDslJvmModelInferrer.this.<FeatureSpecifications>nullSafeAccess(it, element.getFeatures(), _function);
                  }
                };
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(m, _function);
              }
            };
            JvmOperation _method = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toMethod(element, "buildStringMap", EmfParsleyDslJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, element), _function);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        };
        acceptor.<JvmGenericType>accept(featureProviderClass, _function);
        _xblockexpression = featureProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferFormControlFactory(final Module e, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferControlFactory(e.getFormControlFactory(), this.formControlFactoryQN(e), FormControlFactory.class, acceptor);
  }
  
  private JvmGenericType inferDialogControlFactory(final Module e, final IJvmDeclaredTypeAcceptor acceptor) {
    return this.inferControlFactory(e.getDialogControlFactory(), this.dialogControlFactoryQN(e), DialogControlFactory.class, acceptor);
  }
  
  private JvmGenericType inferControlFactory(final AbstractControlFactory e, final String name, final Class<?> superClass, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    if ((e == null)) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final JvmGenericType controlFactoryClass = this._jvmTypesBuilder.toClass(e, name);
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, e, superClass);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(e));
            final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
              @Override
              public void apply(final JvmGenericType it) {
                EmfParsleyDslJvmModelInferrer.this.inferMethodsForControlFactory(e, it, e.getControls().getSpecifications());
              }
            };
            EmfParsleyDslJvmModelInferrer.this.<ControlFactorySpecifications>nullSafeAccess(it, e.getControls(), _function);
          }
        };
        acceptor.<JvmGenericType>accept(controlFactoryClass, _function);
        _xblockexpression = controlFactoryClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private void inferMethodsForControlFactory(final AbstractControlFactory e, final JvmGenericType it, final Iterable<ControlFactorySpecification> specifications) {
    for (final ControlFactorySpecification spec : specifications) {
      JvmMember _feature = spec.getFeature();
      String _simpleName = null;
      if (_feature!=null) {
        _simpleName=_feature.getSimpleName();
      }
      boolean _tripleNotEquals = (_simpleName != null);
      if (_tripleNotEquals) {
        XExpression _target = spec.getTarget();
        boolean _tripleEquals = (_target == null);
        if (_tripleEquals) {
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                "it", spec.getParameterType());
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, spec.getExpression());
            }
          };
          JvmOperation _control_EClass_EStructuralFeature = this.control_EClass_EStructuralFeature(spec, _function);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _control_EClass_EStructuralFeature);
        } else {
          final String createControlMethodName = this.methodNameForFormFeatureSpecification(spec, "createControl_");
          final String createTargetMethodName = this.methodNameForFormFeatureSpecification(spec, "createTarget_");
          EList<JvmMember> _members_1 = it.getMembers();
          final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                "observableValue", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(IObservableValue.class));
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EList<JvmFormalParameter> _parameters_1 = it.getParameters();
              JvmFormalParameter _parameter_1 = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                "feature", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EStructuralFeature.class));
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                @Override
                public void apply(final ITreeAppendable it) {
                  it.append(EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Control.class).getType());
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append(" ");
                  _builder.append("control = ");
                  _builder.append(createControlMethodName, " ");
                  _builder.append("();");
                  it.append(_builder).newLine();
                  StringConcatenation _builder_1 = new StringConcatenation();
                  _builder_1.append("bindValue(");
                  _builder_1.newLine();
                  _builder_1.append("\t");
                  _builder_1.append("feature,");
                  _builder_1.newLine();
                  _builder_1.append("\t");
                  _builder_1.append(createTargetMethodName, "\t");
                  _builder_1.append("(control),");
                  _builder_1.newLineIfNotEmpty();
                  _builder_1.append("\t");
                  _builder_1.append("observableValue);");
                  it.append(_builder_1).newLine();
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("return control;");
                  it.append(_builder_2);
                }
              };
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
          JvmOperation _control_EClass_EStructuralFeature_1 = this.control_EClass_EStructuralFeature(spec, _function_1);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _control_EClass_EStructuralFeature_1);
          EList<JvmMember> _members_2 = it.getMembers();
          final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              it.setVisibility(JvmVisibility.PROTECTED);
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, spec.getExpression());
            }
          };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(spec, createControlMethodName, 
            this._typeReferenceBuilder.typeRef(Control.class), _function_2);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
          EList<JvmMember> _members_3 = it.getMembers();
          final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              it.setVisibility(JvmVisibility.PROTECTED);
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                "it", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Control.class));
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, spec.getTarget());
            }
          };
          JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(spec, createTargetMethodName, 
            this._typeReferenceBuilder.typeRef(IObservableValue.class), _function_3);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
        }
      }
    }
  }
  
  private JvmGenericType inferViewerContentProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    ViewerContentProvider _viewerContentProvider = element.getViewerContentProvider();
    boolean _tripleEquals = (_viewerContentProvider == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final ViewerContentProvider viewerContentProvider = element.getViewerContentProvider();
        final JvmGenericType viewerContentProviderClass = this._jvmTypesBuilder.toClass(viewerContentProvider, this.viewerContentProviderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, viewerContentProvider, org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider.class);
            EList<JvmMember> _members = it.getMembers();
            JvmConstructor _constructorWithInjectedAdapterFactory = EmfParsleyDslJvmModelInferrer.this.toConstructorWithInjectedAdapterFactory(viewerContentProvider);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructorWithInjectedAdapterFactory);
            EmfParsleyDslJvmModelInferrer.this.inferContentProviderElements(it, viewerContentProvider.getElements());
            EmfParsleyDslJvmModelInferrer.this.inferContentProviderChildren(it, viewerContentProvider.getChildren());
          }
        };
        acceptor.<JvmGenericType>accept(viewerContentProviderClass, _function);
        _xblockexpression = viewerContentProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferTableViewerContentProvider(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    org.eclipse.emf.parsley.dsl.model.TableViewerContentProvider _tableViewerContentProvider = element.getTableViewerContentProvider();
    boolean _tripleEquals = (_tableViewerContentProvider == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final org.eclipse.emf.parsley.dsl.model.TableViewerContentProvider viewerContentProvider = element.getTableViewerContentProvider();
        final JvmGenericType viewerContentProviderClass = this._jvmTypesBuilder.toClass(viewerContentProvider, this.tableViewerContentProviderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, viewerContentProvider, TableViewerContentProvider.class);
            EList<JvmMember> _members = it.getMembers();
            JvmConstructor _constructorWithInjectedAdapterFactory = EmfParsleyDslJvmModelInferrer.this.toConstructorWithInjectedAdapterFactory(viewerContentProvider);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructorWithInjectedAdapterFactory);
            EmfParsleyDslJvmModelInferrer.this.inferContentProviderElements(it, viewerContentProvider.getElements());
          }
        };
        acceptor.<JvmGenericType>accept(viewerContentProviderClass, _function);
        _xblockexpression = viewerContentProviderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private void inferContentProviderElements(final JvmGenericType it, final ContentProviderElements elements) {
    this.specificationsToMethods(it, elements, "elements", this._typeReferenceBuilder.typeRef(Object.class));
  }
  
  private void inferContentProviderChildren(final JvmGenericType it, final ContentProviderChildren children) {
    this.specificationsToMethods(it, children, "children", this._typeReferenceBuilder.typeRef(Object.class));
  }
  
  private <T extends Object> void nullSafeAccess(final JvmGenericType it, final T parent, final Procedure1<? super JvmGenericType> acceptor) {
    if ((parent != null)) {
      acceptor.apply(it);
    }
  }
  
  private JvmConstructor toConstructorWithInjectedAdapterFactory(final EObject e) {
    final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
      @Override
      public void apply(final JvmConstructor it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(e, "adapterFactory", 
          EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(AdapterFactory.class));
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            it.append("super(adapterFactory);");
          }
        };
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
        EList<JvmAnnotationReference> _annotations = it.getAnnotations();
        JvmAnnotationReference _annotationRef = EmfParsleyDslJvmModelInferrer.this._annotationTypesBuilder.annotationRef(Inject.class);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
      }
    };
    return this._jvmTypesBuilder.toConstructor(e, _function);
  }
  
  private JvmGenericType inferProposalCreator(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    org.eclipse.emf.parsley.dsl.model.ProposalCreator _proposalCreator = element.getProposalCreator();
    boolean _tripleEquals = (_proposalCreator == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final org.eclipse.emf.parsley.dsl.model.ProposalCreator proposalCreator = element.getProposalCreator();
        final JvmGenericType proposalCreatorClass = this._jvmTypesBuilder.toClass(proposalCreator, this.proposalCreatorQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, proposalCreator, ProposalCreator.class);
            EList<FeatureAssociatedExpression> _proposalsSpecifications = proposalCreator.getProposalsSpecifications();
            for (final FeatureAssociatedExpression specification : _proposalsSpecifications) {
              final Procedure2<JvmOperation, FeatureAssociatedExpression> _function = new Procedure2<JvmOperation, FeatureAssociatedExpression>() {
                @Override
                public void apply(final JvmOperation it, final FeatureAssociatedExpression spec) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                    "it", spec.getParameterType());
                  EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                  JvmFormalParameter _parameter_1 = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(spec, 
                    "feature", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EStructuralFeature.class));
                  EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
                }
              };
              EmfParsleyDslJvmModelInferrer.this.featureAssociatedExpressionToMethod(it, specification, "proposals_", EmfParsleyDslJvmModelInferrer.this._typeReferences.createTypeRef(EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(List.class).getType(), EmfParsleyDslJvmModelInferrer.this._typeReferences.wildCard()), _function);
            }
          }
        };
        acceptor.<JvmGenericType>accept(proposalCreatorClass, _function);
        _xblockexpression = proposalCreatorClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferMenuBuilder(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    MenuBuilder _menuBuilder = element.getMenuBuilder();
    boolean _tripleEquals = (_menuBuilder == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final MenuBuilder menuBuilder = element.getMenuBuilder();
        final JvmGenericType menuBuilderClass = this._jvmTypesBuilder.toClass(menuBuilder, this.menuBuilderQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, menuBuilder, EditingMenuBuilder.class);
            final JvmTypeReference returnType = EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(List.class, EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(IMenuContributionSpecification.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, menuBuilder.getMenus(), "menuContributions", returnType);
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, menuBuilder.getEmfMenus(), "emfMenuContributions", returnType);
          }
        };
        acceptor.<JvmGenericType>accept(menuBuilderClass, _function);
        _xblockexpression = menuBuilderClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferConfigurator(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    org.eclipse.emf.parsley.dsl.model.Configurator _configurator = element.getConfigurator();
    boolean _tripleEquals = (_configurator == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final org.eclipse.emf.parsley.dsl.model.Configurator configurator = element.getConfigurator();
        final JvmGenericType configuratorClass = this._jvmTypesBuilder.toClass(configurator, this.configuratorQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, configurator, Configurator.class);
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, configurator.getResourceURI(), "resourceURI", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(URI.class));
            EmfParsleyDslJvmModelInferrer.this.specificationsToMethods(it, configurator.getEClassSpec(), "eClass", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(EClass.class));
          }
        };
        acceptor.<JvmGenericType>accept(configuratorClass, _function);
        _xblockexpression = configuratorClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private JvmGenericType inferResourceManager(final Module element, final IJvmDeclaredTypeAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    org.eclipse.emf.parsley.dsl.model.ResourceManager _resourceManager = element.getResourceManager();
    boolean _tripleEquals = (_resourceManager == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      JvmGenericType _xblockexpression = null;
      {
        final org.eclipse.emf.parsley.dsl.model.ResourceManager resourceManager = element.getResourceManager();
        final JvmGenericType resourceManagerClass = this._jvmTypesBuilder.toClass(resourceManager, this.resourceManagerQN(element));
        final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          @Override
          public void apply(final JvmGenericType it) {
            EmfParsleyDslJvmModelInferrer.this.setSuperClassTypeAndFields(it, resourceManager, ResourceManager.class);
            EmfParsleyDslJvmModelInferrer.this.resourceManagerElementToMethod(it, resourceManager.getInitializeBody(), "initialize", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Void.TYPE), null);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              @Override
              public void apply(final JvmOperation it) {
                EList<JvmTypeReference> _exceptions = it.getExceptions();
                JvmTypeReference _typeRef = EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(IOException.class);
                EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeRef);
              }
            };
            EmfParsleyDslJvmModelInferrer.this.resourceManagerElementToMethod(it, resourceManager.getSaveBody(), "save", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Boolean.TYPE), _function);
          }
        };
        acceptor.<JvmGenericType>accept(resourceManagerClass, _function);
        _xblockexpression = resourceManagerClass;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private boolean resourceManagerElementToMethod(final JvmDeclaredType it, final SimpleMethodSpecification m, final String methodName, final JvmTypeReference returnType, final Procedure1<? super JvmOperation> additionalSetup) {
    boolean _xifexpression = false;
    if ((m != null)) {
      boolean _xblockexpression = false;
      {
        final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          @Override
          public void apply(final JvmOperation it) {
            EmfParsleyDslJvmModelInferrer.this.addOverrideAnnotation(it);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.toParameter(m, "it", EmfParsleyDslJvmModelInferrer.this._typeReferenceBuilder.typeRef(Resource.class));
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, m.getBody());
          }
        };
        final JvmOperation method = this._jvmTypesBuilder.toMethod(m, methodName, returnType, _function);
        if (additionalSetup!=null) {
          additionalSetup.apply(method);
        }
        EList<JvmMember> _members = it.getMembers();
        _xblockexpression = this._jvmTypesBuilder.<JvmOperation>operator_add(_members, method);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private void specificationsToMethods(final JvmGenericType it, final WithExpressions e, final String methodName, final JvmTypeReference returnType) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        EList<PolymorphicSpecification> _specifications = e.getSpecifications();
        for (final PolymorphicSpecification specification : _specifications) {
          EList<JvmMember> _members = it.getMembers();
          JvmOperation _specificationToMethod = EmfParsleyDslJvmModelInferrer.this.specificationToMethod(specification, methodName, returnType);
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _specificationToMethod);
        }
      }
    };
    this.<WithExpressions>nullSafeAccess(it, e, _function);
  }
  
  private JvmOperation specificationToMethod(final PolymorphicSpecification specification, final String methodName, final JvmTypeReference returnType) {
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmFormalParameter _specificationParameter = EmfParsleyDslJvmModelInferrer.this.specificationParameter(specification);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _specificationParameter);
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, specification.getExpression());
      }
    };
    return this._jvmTypesBuilder.toMethod(specification, methodName, returnType, _function);
  }
  
  private JvmFormalParameter specificationParameter(final PolymorphicSpecification specification) {
    String _xifexpression = null;
    String _name = specification.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      _xifexpression = specification.getName();
    } else {
      _xifexpression = "it";
    }
    return this._jvmTypesBuilder.toParameter(specification, _xifexpression, specification.getParameterType());
  }
  
  private JvmOperation control_EClass_EStructuralFeature(final ControlFactorySpecification spec, final Procedure1<? super JvmOperation> init) {
    return this._jvmTypesBuilder.toMethod(spec, this.methodNameForFormFeatureSpecification(spec, "control_"), 
      this._typeReferenceBuilder.typeRef(Control.class), init);
  }
  
  private String methodNameForFormFeatureSpecification(final ControlFactorySpecification spec, final String prefix) {
    String _simpleName = spec.getParameterType().getSimpleName();
    String _plus = (prefix + _simpleName);
    String _plus_1 = (_plus + "_");
    String _propertyNameForGetterSetterMethod = this._emfParsleyDslGeneratorUtils.getPropertyNameForGetterSetterMethod(spec.getFeature().getSimpleName());
    return (_plus_1 + _propertyNameForGetterSetterMethod);
  }
  
  private JvmOperation genBindMethod(final EObject element, final JvmGenericType type, final Class<?> clazz) {
    final IAcceptor<JvmExecutable> _function = new IAcceptor<JvmExecutable>() {
      @Override
      public void accept(final JvmExecutable it) {
        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
          @Override
          public void apply(final ITreeAppendable it) {
            it.append("return ");
            it.append(type);
            it.append(".class;");
          }
        };
        EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
      }
    };
    return this.genBindMethod(element, this._typeReferenceBuilder.typeRef(clazz), true, _function);
  }
  
  private void handleBindingsSpecification(final JvmGenericType it, final BindingsSpecification bindingsSpecification) {
    EList<Binding> _bindings = bindingsSpecification.getBindings();
    for (final Binding binding : _bindings) {
      {
        JvmOperation method = null;
        if ((binding instanceof TypeBinding)) {
          method = this.genBindMethod(it, ((TypeBinding)binding));
        } else {
          if ((binding instanceof ProviderBinding)) {
            method = this.genProvideMethod(it, ((ProviderBinding)binding));
          } else {
            if ((binding instanceof ValueBinding)) {
              method = this.genValueMethod(it, ((ValueBinding)binding));
            }
          }
        }
        if ((method != null)) {
          EList<JvmMember> _members = it.getMembers();
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members, method);
        }
      }
    }
  }
  
  private JvmOperation genBindMethod(final JvmGenericType it, final TypeBinding typeBinding) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _typeToBind = typeBinding.getTypeToBind();
      boolean _tripleEquals = (_typeToBind == null);
      if (_tripleEquals) {
        return null;
      }
      final IAcceptor<JvmExecutable> _function = new IAcceptor<JvmExecutable>() {
        @Override
        public void accept(final JvmExecutable it) {
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, typeBinding.getTo());
        }
      };
      _xblockexpression = this.genBindMethod(it, typeBinding, this._typeReferenceBuilder.typeRef(typeBinding.getTypeToBind().getType()), _function);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genProvideMethod(final JvmGenericType it, final ProviderBinding binding) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _type = binding.getType();
      boolean _tripleEquals = (_type == null);
      if (_tripleEquals) {
        return null;
      }
      final IAcceptor<JvmExecutable> _function = new IAcceptor<JvmExecutable>() {
        @Override
        public void accept(final JvmExecutable it) {
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, binding.getTo());
        }
      };
      _xblockexpression = this.genProvideMethod(it, binding, this._typeReferenceBuilder.typeRef(binding.getType().getType()), _function);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genValueMethod(final JvmGenericType it, final ValueBinding binding) {
    JvmOperation _xblockexpression = null;
    {
      if (((binding.getTypeDecl() == null) || (binding.getId() == null))) {
        return null;
      }
      final IAcceptor<JvmExecutable> _function = new IAcceptor<JvmExecutable>() {
        @Override
        public void accept(final JvmExecutable it) {
          EmfParsleyDslJvmModelInferrer.this._jvmTypesBuilder.setBody(it, binding.getTo());
        }
      };
      _xblockexpression = this.genValueMethod(it, binding, binding.getId(), binding.getTypeDecl(), _function);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genBindMethod(final EObject element, final JvmTypeReference typeRefToBind, final boolean shouldOverride, final IAcceptor<JvmExecutable> acceptor) {
    String _simpleName = typeRefToBind.getSimpleName();
    String _plus = ("bind" + _simpleName);
    return this.genMethodForGuiceModuleWithWildcard(element, _plus, 
      this._jvmTypesBuilder.cloneWithProxies(typeRefToBind), shouldOverride, acceptor);
  }
  
  private JvmOperation genBindMethod(final JvmGenericType it, final EObject element, final JvmTypeReference typeRefToBind, final IAcceptor<JvmExecutable> acceptor) {
    JvmOperation _xblockexpression = null;
    {
      String _simpleName = typeRefToBind.getSimpleName();
      final String methodName = ("bind" + _simpleName);
      _xblockexpression = this.genMethodForGuiceModuleWithWildcard(element, methodName, 
        this._jvmTypesBuilder.cloneWithProxies(typeRefToBind), this.shouldOverride(it, methodName), acceptor);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genProvideMethod(final JvmGenericType it, final EObject element, final JvmTypeReference typeRefToBind, final IAcceptor<JvmExecutable> acceptor) {
    JvmOperation _xblockexpression = null;
    {
      String _simpleName = typeRefToBind.getSimpleName();
      final String methodName = ("provide" + _simpleName);
      _xblockexpression = this.genMethodForGuiceModuleWithWildcard(element, methodName, 
        this._typeReferenceBuilder.typeRef(Provider.class, this._jvmTypesBuilder.cloneWithProxies(typeRefToBind)), this.shouldOverride(it, methodName), acceptor);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genValueMethod(final JvmGenericType it, final EObject element, final String name, final JvmTypeReference typeRefToBind, final IAcceptor<JvmExecutable> acceptor) {
    JvmOperation _xblockexpression = null;
    {
      final String methodName = ("value" + name);
      _xblockexpression = this.genMethodForGuiceModule(element, methodName, this._jvmTypesBuilder.cloneWithProxies(typeRefToBind), this.shouldOverride(it, methodName), acceptor);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genMethodForGuiceModuleWithWildcard(final EObject element, final String methodName, final JvmTypeReference typeRefToBind, final boolean shouldOverride, final IAcceptor<JvmExecutable> acceptor) {
    JvmOperation _xblockexpression = null;
    {
      final JvmWildcardTypeReference wildCard = this._typesFactory.createJvmWildcardTypeReference();
      final JvmUpperBound upperBound = this._typesFactory.createJvmUpperBound();
      upperBound.setTypeReference(this._jvmTypesBuilder.cloneWithProxies(typeRefToBind));
      EList<JvmTypeConstraint> _constraints = wildCard.getConstraints();
      this._jvmTypesBuilder.<JvmUpperBound>operator_add(_constraints, upperBound);
      _xblockexpression = this.genMethodForGuiceModule(element, methodName, this._typeReferenceBuilder.typeRef(Class.class, wildCard), shouldOverride, acceptor);
    }
    return _xblockexpression;
  }
  
  private JvmOperation genMethodForGuiceModule(final EObject element, final String methodName, final JvmTypeReference typeRefToBind, final boolean shouldOverride, final IAcceptor<JvmExecutable> acceptor) {
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      @Override
      public void apply(final JvmOperation it) {
        if (shouldOverride) {
          EmfParsleyDslJvmModelInferrer.this.addOverrideAnnotation(it);
        }
        acceptor.accept(it);
      }
    };
    return this._jvmTypesBuilder.toMethod(element, methodName, typeRefToBind, _function);
  }
  
  private boolean shouldOverride(final JvmGenericType it, final String methodName) {
    final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
      @Override
      public Boolean apply(final JvmOperation it) {
        String _simpleName = it.getSimpleName();
        return Boolean.valueOf(Objects.equal(_simpleName, methodName));
      }
    };
    return IterableExtensions.<JvmOperation>exists(Iterables.<JvmOperation>filter(it.getAllFeatures(), JvmOperation.class), _function);
  }
  
  private boolean addOverrideAnnotation(final JvmOperation it) {
    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
    JvmAnnotationReference _annotationRef = this._annotationTypesBuilder.annotationRef(Override.class);
    return this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotationRef);
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Module) {
      _infer((Module)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
