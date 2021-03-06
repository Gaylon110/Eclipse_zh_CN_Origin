/*******************************************************************************
 * Copyright (c) 2007, 2013 Innoopract Informationssysteme GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Innoopract Informationssysteme GmbH - initial API and implementation
 *    EclipseSource - ongoing development
 ******************************************************************************/
package org.eclipse.rap.tools.launch.internal.tab;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.pde.ui.launcher.OSGiLauncherTabGroup;
import org.eclipse.rap.tools.launch.internal.Activator;


// TODO [rh] Could be replaced with org.eclipse.debug.ui.launchConfigurationTabs
//      extension point introduced in 3.3
public final class RAPLaunchTabGroup extends OSGiLauncherTabGroup {

  private static final String NEW_LINE = "\n"; //$NON-NLS-1$
  private static final String ATTR_VM_ARGUMENTS
    = IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS;
  private static final String JETTY_LOG_LEVEL
    = "-Dorg.eclipse.equinox.http.jetty.log.stderr.threshold=info"; //$NON-NLS-1$

  public void createTabs( ILaunchConfigurationDialog dialog, String mode ) {
    super.createTabs( dialog, mode );
    // Prepend existing tabs from OSGi launch with 'Main' tab
    setTabs( insertTab( getTabs(), 0, new MainTab() ) );
  }

  private static ILaunchConfigurationTab[] insertTab( ILaunchConfigurationTab[] tabs,
                                                      int position,
                                                      ILaunchConfigurationTab newTab )
  {
    ILaunchConfigurationTab[] result = new ILaunchConfigurationTab[ tabs.length + 1 ];
    int offset = 0;
    for( int i = 0; i < result.length; i++ ) {
      if( i == position ) {
        result[ i ] = newTab;
        offset = -1;
      } else {
        result[ i ] = tabs[ i + offset ];
      }
    }
    return result;
  }

  public void setDefaults( ILaunchConfigurationWorkingCopy config ) {
    super.setDefaults( config );
    String vmArguments = ""; //$NON-NLS-1$
    try {
      vmArguments = config.getAttribute( ATTR_VM_ARGUMENTS, "" ); //$NON-NLS-1$
    } catch( CoreException e ) {
      Activator.getDefault().getLog().log( e.getStatus() );
    }
    vmArguments = appendJettyLogLevel( vmArguments );
    config.setAttribute( ATTR_VM_ARGUMENTS, vmArguments );
  }

  private static String appendJettyLogLevel( String vmArguments ) {
    String result = vmArguments;
    if( result.length() > 0 ) {
      result += NEW_LINE;
    }
    result += JETTY_LOG_LEVEL;
    return result;
  }

}
