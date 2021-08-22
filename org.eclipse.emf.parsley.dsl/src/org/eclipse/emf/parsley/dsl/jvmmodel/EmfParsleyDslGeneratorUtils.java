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

import com.google.inject.Inject;
import java.beans.Introspector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.parsley.dsl.model.Module;
import org.eclipse.emf.parsley.dsl.model.PartSpecification;
import org.eclipse.emf.parsley.dsl.model.PartsSpecifications;
import org.eclipse.emf.parsley.generator.common.EmfParsleyProjectFilesGenerator;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * @author Lorenzo Bettini
 */
@SuppressWarnings("all")
public class EmfParsleyDslGeneratorUtils {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private EmfParsleyProjectFilesGenerator projectFilesGenerator;
  
  public String getPropertyNameForGetterSetterMethod(final String opName) {
    if (((opName.startsWith("get") && (opName.length() > 3)) && Character.isUpperCase(opName.charAt(3)))) {
      return Introspector.decapitalize(opName.substring(3));
    }
    if (((opName.startsWith("is") && (opName.length() > 2)) && Character.isUpperCase(opName.charAt(2)))) {
      return Introspector.decapitalize(opName.substring(2));
    }
    return opName;
  }
  
  public String executableExtensionFactoryQN(final Module element) {
    String _string = this._iQualifiedNameProvider.getFullyQualifiedName(element).toString();
    String _plus = (_string + ".");
    CharSequence _extFactoryName = this.projectFilesGenerator.extFactoryName(this._iQualifiedNameProvider.getFullyQualifiedName(element).toString());
    return (_plus + _extFactoryName);
  }
  
  public String executableExtensionFactoryQN(final PartSpecification element) {
    return this.executableExtensionFactoryQN(EcoreUtil2.<Module>getContainerOfType(element, Module.class));
  }
  
  public boolean shouldGenerateExtensions(final Module module) {
    PartsSpecifications _partsSpecifications = null;
    if (module!=null) {
      _partsSpecifications=module.getPartsSpecifications();
    }
    EList<PartSpecification> _parts = null;
    if (_partsSpecifications!=null) {
      _parts=_partsSpecifications.getParts();
    }
    final EList<PartSpecification> partSpecs = _parts;
    return ((partSpecs != null) && (!partSpecs.isEmpty()));
  }
}
