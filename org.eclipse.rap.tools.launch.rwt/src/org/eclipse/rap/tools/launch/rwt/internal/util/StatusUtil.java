/*******************************************************************************
 * Copyright (c) 2011, 2013 Rüdiger Herrmann and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rüdiger Herrmann - initial API and implementation
 *    EclipseSource - ongoing development
 ******************************************************************************/
package org.eclipse.rap.tools.launch.rwt.internal.util;

import org.eclipse.core.runtime.*;
import org.eclipse.rap.tools.launch.rwt.internal.RWTLaunchActivator;
import org.eclipse.ui.statushandlers.StatusManager;


public class StatusUtil {

  public static void log( Throwable throwable ) {
    String pluginId = RWTLaunchActivator.getPluginId();
    String message = throwable.getMessage();
    IStatus status = new Status( IStatus.ERROR, pluginId, message, throwable );
    StatusManager.getManager().handle( status, StatusManager.LOG );
  }

  public static void showCoreException( CoreException exception ) {
    StatusManager.getManager().handle( exception, RWTLaunchActivator.getPluginId() );
    IStatus status = exception.getStatus();
    StatusManager.getManager().handle( status, StatusManager.SHOW );
  }

  private StatusUtil() {
    // prevent instantiation
  }

}
