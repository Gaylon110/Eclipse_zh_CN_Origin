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
package org.eclipse.emf.parsley.dsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.dsl.generator.EmfParsleyDslOutputConfigurationProvider;
import org.eclipse.emf.parsley.dsl.jvmmodel.EmfParsleyDslGeneratorUtils;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.PartSpecification;
import org.eclipse.emf.parsley.dsl.model.ViewSpecification;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EmfParsleyDslPluginXmlGenerator implements IGenerator {
  @Inject
  @Extension
  private EmfParsleyDslGeneratorUtils _emfParsleyDslGeneratorUtils;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<Module> _filter = Iterables.<Module>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Module.class);
    for (final Module module : _filter) {
      {
        final CharSequence contents = this.generatePluginXml(module);
        int _length = contents.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          String _replace = this._iQualifiedNameProvider.getFullyQualifiedName(module).toString().replace(".", "/");
          String _plus = (_replace + "/");
          String _plus_1 = (_plus + EmfParsleyDslOutputConfigurationProvider.PLUGIN_XML_GEN_FILE);
          fsa.generateFile(_plus_1, contents);
        }
      }
    }
  }
  
  public CharSequence generatePluginXml(final Module module) {
    CharSequence _xifexpression = null;
    boolean _shouldGenerateExtensions = this._emfParsleyDslGeneratorUtils.shouldGenerateExtensions(module);
    boolean _not = (!_shouldGenerateExtensions);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<extension");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("point=\"org.eclipse.ui.views\">");
      _builder_1.newLine();
      _builder_1.append("   ");
      final Function1<PartSpecification, CharSequence> _function = new Function1<PartSpecification, CharSequence>() {
        @Override
        public CharSequence apply(final PartSpecification it) {
          return EmfParsleyDslPluginXmlGenerator.this.generateExtensionPoint(it);
        }
      };
      String _join = IterableExtensions.join(ListExtensions.<PartSpecification, CharSequence>map(module.getPartsSpecifications().getParts(), _function), "");
      _builder_1.append(_join, "   ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("</extension>");
      _builder_1.newLine();
      _xifexpression = this.generatePluginXml(_builder_1);
    }
    return _xifexpression;
  }
  
  public CharSequence generateExtensionPoint(final PartSpecification partSpecification) {
    CharSequence _xifexpression = null;
    if ((partSpecification instanceof ViewSpecification)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<view");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("category=\"");
      String _xifexpression_1 = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(((ViewSpecification)partSpecification).getCategory());
      if (_isNullOrEmpty) {
        _xifexpression_1 = "org.eclipse.emf.parsley";
      } else {
        _xifexpression_1 = ((ViewSpecification)partSpecification).getCategory();
      }
      _builder.append(_xifexpression_1, "      ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("class=\"");
      String _executableExtensionFactoryQN = this._emfParsleyDslGeneratorUtils.executableExtensionFactoryQN(partSpecification);
      _builder.append(_executableExtensionFactoryQN, "      ");
      _builder.append(":");
      String _identifier = ((ViewSpecification)partSpecification).getType().getIdentifier();
      _builder.append(_identifier, "      ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("id=\"");
      String _id = ((ViewSpecification)partSpecification).getId();
      _builder.append(_id, "      ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("name=\"");
      String _viewName = ((ViewSpecification)partSpecification).getViewName();
      _builder.append(_viewName, "      ");
      _builder.append("\"");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("restorable=\"true\">");
      _builder.newLine();
      _builder.append("</view>");
      _builder.newLine();
      _xifexpression = _builder;
    }
    return _xifexpression;
  }
  
  public CharSequence generatePluginXml(final CharSequence contents) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?eclipse version=\"3.4\"?>");
    _builder.newLine();
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("   ");
    _builder.append(contents, "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("</plugin>");
    _builder.newLine();
    return _builder;
  }
}
