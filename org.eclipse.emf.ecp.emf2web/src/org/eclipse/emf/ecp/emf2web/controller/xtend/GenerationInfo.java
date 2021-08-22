/**
 * Copyright (c) 2011-2015 EclipseSource Muenchen GmbH and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Stefan Dirix - initial API and implementation
 */
package org.eclipse.emf.ecp.emf2web.controller.xtend;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecp.emf2web.exporter.SchemaWrapper;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Stefan Dirix <sdirix@eclipsesource.com>
 */
@Accessors
@SuppressWarnings("all")
public class GenerationInfo {
  public final static String MODEL_TYPE = "Model";
  
  public final static String VIEW_TYPE = "View";
  
  public final static String MODEL_AND_VIEW_TYPE = "Model and View";
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final String type;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final EClass eClass;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final VView view;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final String nameProposal;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final SchemaWrapper wrapper;
  
  @Accessors
  private String generatedString;
  
  @Accessors
  private URI location;
  
  @Accessors
  private boolean wrap;
  
  private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
  
  public void addPropertyChangeListener(final PropertyChangeListener listener) {
    this.changeSupport.addPropertyChangeListener(listener);
  }
  
  public void removePropertyChangeListener(final PropertyChangeListener listener) {
    this.changeSupport.removePropertyChangeListener(listener);
  }
  
  protected void firePropertyChange(final String propertyName, final Object oldValue, final Object newValue) {
    this.changeSupport.firePropertyChange(propertyName, oldValue, newValue);
  }
  
  public void setGeneratedString(final String generatedString) {
    this.changeSupport.firePropertyChange("generatedString", this.generatedString, this.generatedString = generatedString);
  }
  
  public void setLocation(final URI location) {
    this.changeSupport.firePropertyChange("location", this.location, this.location = location);
  }
  
  public void setWrap(final boolean wrap) {
    this.changeSupport.firePropertyChange("wrap", this.wrap, this.wrap = wrap);
  }
  
  public GenerationInfo(final String type, final EClass eClass, final VView view, final String nameProposal, final SchemaWrapper wrapper) {
    super();
    this.type = type;
    this.eClass = eClass;
    this.view = view;
    this.nameProposal = nameProposal;
    this.wrapper = wrapper;
  }
  
  @Pure
  public String getType() {
    return this.type;
  }
  
  @Pure
  public EClass getEClass() {
    return this.eClass;
  }
  
  @Pure
  public VView getView() {
    return this.view;
  }
  
  @Pure
  public String getNameProposal() {
    return this.nameProposal;
  }
  
  @Pure
  public SchemaWrapper getWrapper() {
    return this.wrapper;
  }
  
  @Pure
  public String getGeneratedString() {
    return this.generatedString;
  }
  
  @Pure
  public URI getLocation() {
    return this.location;
  }
  
  @Pure
  public boolean isWrap() {
    return this.wrap;
  }
  
  @Pure
  public PropertyChangeSupport getChangeSupport() {
    return this.changeSupport;
  }
}
