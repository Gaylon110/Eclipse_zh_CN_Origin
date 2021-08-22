/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ui.editor.reconciler;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.util.CancelIndicator;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 * @since 2.7
 */
@SuppressWarnings("all")
public class CancelIndicatorBasedProgressMonitor implements IProgressMonitor {
  @Delegate
  private final IProgressMonitor doDelegate = new NullProgressMonitor();
  
  private final CancelIndicator cancelIndicator;
  
  @FinalFieldsConstructor
  public CancelIndicatorBasedProgressMonitor(final CancelIndicator cancelIndicator) {
    super();
    this.cancelIndicator = cancelIndicator;
  }
  
  @Override
  public boolean isCanceled() {
    return this.cancelIndicator.isCanceled();
  }
  
  public void beginTask(final String arg0, final int arg1) {
    this.doDelegate.beginTask(arg0, arg1);
  }
  
  public void done() {
    this.doDelegate.done();
  }
  
  public void internalWorked(final double arg0) {
    this.doDelegate.internalWorked(arg0);
  }
  
  public void setCanceled(final boolean arg0) {
    this.doDelegate.setCanceled(arg0);
  }
  
  public void setTaskName(final String arg0) {
    this.doDelegate.setTaskName(arg0);
  }
  
  public void subTask(final String arg0) {
    this.doDelegate.subTask(arg0);
  }
  
  public void worked(final int arg0) {
    this.doDelegate.worked(arg0);
  }
}
