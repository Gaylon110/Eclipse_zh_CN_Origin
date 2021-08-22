/*******************************************************************************
 * Copyright (c) 2008, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.equinox.internal.transforms;

import java.io.IOException;
import org.eclipse.osgi.internal.framework.EquinoxContainer;
import org.eclipse.osgi.internal.hookregistry.*;
import org.eclipse.osgi.internal.log.EquinoxLogServices;
import org.eclipse.osgi.storage.BundleInfo.Generation;
import org.eclipse.osgi.storage.bundlefile.BundleFile;
import org.eclipse.osgi.storage.bundlefile.BundleFileWrapper;
import org.osgi.framework.*;

/**
 * The framework extension that is capable of applying transforms to bundle content.
 */
public class TransformerHook implements BundleFileWrapperFactoryHook, HookConfigurator, ActivatorHookFactory, BundleActivator {
	private volatile TransformerList transformers;
	private volatile TransformInstanceListData templates;
	private EquinoxLogServices logServices;

	/**
	 * @throws IOException  
	 */
	public BundleFileWrapper wrapBundleFile(BundleFile bundleFile, Generation generation, boolean base) {
		if (transformers == null || templates == null)
			return null;
		return new TransformedBundleFile(this, generation, bundleFile);
	}

	public void addHooks(HookRegistry hookRegistry) {
		hookRegistry.addActivatorHookFactory(this);
		hookRegistry.addBundleFileWrapperFactoryHook(this);
		logServices = hookRegistry.getContainer().getLogServices();
	}

	public void start(BundleContext context) throws BundleException {
		try {
			this.transformers = new TransformerList(context, logServices);
		} catch (InvalidSyntaxException e) {
			throw new BundleException("Problem registering service tracker: transformers", e); //$NON-NLS-1$
		}
		try {
			this.templates = new TransformInstanceListData(context, logServices);
		} catch (InvalidSyntaxException e) {
			transformers.close();
			transformers = null;
			throw new BundleException("Problem registering service tracker: templates", e); //$NON-NLS-1$
		}

	}

	public void stop(BundleContext context) {
		transformers.close();
		templates.close();
	}

	void log(int severity, String msg, Throwable t) {
		if (logServices == null) {
			System.err.println(msg);
			t.printStackTrace();
			return;
		}
		logServices.log(EquinoxContainer.NAME, severity, msg, t);
	}

	public BundleActivator createActivator() {
		return this;
	}

	public String[] getTransformTypes() {
		TransformInstanceListData current = templates;
		return current == null ? new String[0] : current.getTransformTypes();
	}

	public StreamTransformer getTransformer(String type) {
		TransformerList current = transformers;
		return current == null ? null : current.getTransformer(type);
	}

	public TransformTuple[] getTransformsFor(String type) {
		TransformInstanceListData current = templates;
		return current == null ? null : current.getTransformsFor(type);
	}

	public boolean hasTransformers() {
		TransformerList current = transformers;
		return current == null ? false : current.hasTransformers();
	}

	public boolean hasTransformsFor(Bundle bundle) {
		TransformInstanceListData current = templates;
		return current == null ? false : current.hasTransformsFor(bundle);
	}
}
