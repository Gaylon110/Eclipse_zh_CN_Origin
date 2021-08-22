/*******************************************************************************
 * Copyright (c) 2007, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.pde.internal.core;

import java.util.*;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.*;
import org.eclipse.osgi.service.resolver.*;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;

public class BundleValidationOperation implements IWorkspaceRunnable {

	private static StateObjectFactory FACTORY;

	private IPluginModelBase[] fModels;
	private Dictionary<?, ?>[] fProperties;
	private State fState;

	public BundleValidationOperation(IPluginModelBase[] models) {
		this(models, new Dictionary[] {TargetPlatformHelper.getTargetEnvironment()});
	}

	public BundleValidationOperation(IPluginModelBase[] models, Dictionary<?, ?>[] properties) {
		fModels = models;
		fProperties = properties;
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		if (FACTORY == null) {
			FACTORY = Platform.getPlatformAdmin().getFactory();
		}
		SubMonitor subMonitor = SubMonitor.convert(monitor, fModels.length + 1);
		fState = FACTORY.createState(true);
		for (IPluginModelBase fModel : fModels) {
			BundleDescription bundle = fModel.getBundleDescription();
			if (bundle != null) {
				fState.addBundle(FACTORY.createBundleDescription(bundle));
			}
			subMonitor.split(1);
		}
		fState.setPlatformProperties(fProperties);
		fState.resolve(false);
		subMonitor.split(1);
	}

	public Map<Object, Object[]> getResolverErrors() {
		Set<String> alreadyDuplicated = new HashSet<>();
		Map<Object, Object[]> map = new HashMap<>();
		BundleDescription[] bundles = fState.getBundles();
		for (BundleDescription bundle : bundles) {
			if (!bundle.isResolved()) {
				map.put(bundle, fState.getResolverErrors(bundle));
			} else if (bundle.isSingleton() && !alreadyDuplicated.contains(bundle.getSymbolicName())) {
				BundleDescription[] dups = fState.getBundles(bundle.getSymbolicName());
				if (dups.length > 1) {
					// more than 1 singleton present
					alreadyDuplicated.add(bundle.getSymbolicName());
					MultiStatus status = new MultiStatus(PDECore.PLUGIN_ID, 0, NLS.bind(PDECoreMessages.BundleValidationOperation_multiple_singletons, new String[] {Integer.toString(dups.length), bundle.getSymbolicName()}), null);
					for (BundleDescription dup : dups) {
						status.add(new Status(IStatus.ERROR, PDECore.PLUGIN_ID, dup.getLocation()));
					}
					map.put(bundle, new Object[] {status});
				}
			}
		}
		return map;
	}

	public State getState() {
		return fState;
	}

	public boolean hasErrors() {
		if (fState.getHighestBundleId() > -1) {
			BundleDescription[] bundles = fState.getBundles();
			for (BundleDescription bundle : bundles) {
				if (!bundle.isResolved()) {
					return true;
				} else if (bundle.isSingleton()) {
					BundleDescription[] dups = fState.getBundles(bundle.getSymbolicName());
					if (dups.length > 1) {
						// more than one singleton
						return true;
					}
				}
			}
		}
		return false;
	}

}
