/*******************************************************************************
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.delegate;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.utilities.ClassUtil;

/**
 * DelegateResourceAdapter extends a Resource to load and unload DelegateDomains
 * for each package with a delegate annotation, when the resource is loaded and
 * unloaded.
 */
public class DelegateResourceAdapter extends AdapterImpl
{
	public static @NonNull DelegateResourceAdapter getAdapter(@NonNull Resource resource) {
		DelegateResourceAdapter adapter = (DelegateResourceAdapter) EcoreUtil.getAdapter(resource.eAdapters(), DelegateResourceAdapter.class);
		if (adapter == null) {
			adapter = new DelegateResourceAdapter();
			resource.eAdapters().add(adapter);
		}
		return adapter;
	}

	@Override
	public Resource getTarget() {
		return (Resource) super.getTarget();
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type == DelegateResourceAdapter.class;
	}

	@Override
	public void notifyChanged(Notification notification) {
	    int featureID = notification.getFeatureID(Resource.class);
	    int eventType = notification.getEventType();
	    if (featureID == Resource.RESOURCE__IS_LOADED) 
	    {
		    if (eventType == Notification.SET) 
		    {
		    	Resource resource = getTarget();
				EList<EObject> contents = ClassUtil.nonNullEMF(resource.getContents());
		    	if (notification.getNewBooleanValue()) {
					EPackage.Registry packageRegistry = resource.getResourceSet().getPackageRegistry();
					installPackages(ClassUtil.nonNullEMF(packageRegistry), contents);
		    	}
	    	}
	    }
	    else if (featureID == Resource.RESOURCE__CONTENTS) 
	    {
	    	if (eventType == Notification.REMOVE) {
	    		EObject oldValue = (EObject) ClassUtil.nonNullEMF(notification.getOldValue());
				unloadDelegate(oldValue);
	    	}
	    	else if (eventType == Notification.REMOVE_MANY) {
	    		@SuppressWarnings("unchecked")
				List<? extends EObject> oldValues = ClassUtil.nonNullEMF((List<? extends EObject>) notification.getOldValue());
				unloadDelegates(oldValues);
	    	}
	    }
	}

	protected void installPackages(EPackage.@NonNull Registry packageRegistry, @NonNull List<? extends EObject> contents) {
		for (EObject eObject : contents) {
			if (eObject instanceof EPackage) {
				EPackage ePackage = (EPackage)eObject;
				packageRegistry.put(ePackage.getNsURI(), ePackage);
				installPackages(packageRegistry, ClassUtil.nonNullEMF(ePackage.getESubpackages()));
			}
		}
	}

	@Override
	public void setTarget(Notifier newTarget) {
		Resource resource = (Resource)newTarget;
		super.setTarget(resource);
	}

	protected void unloadDelegate(@NonNull EObject eObject) {
		if (eObject instanceof EPackage) {
			EPackage ePackage = (EPackage)eObject;
			DelegateEPackageAdapter adapter = DelegateEPackageAdapter.findAdapter(ePackage);
			if (adapter != null) {
				adapter.unloadDelegates();
			}
			unloadDelegates(ClassUtil.nonNullEMF(ePackage.getESubpackages()));
		}
	}

	protected void unloadDelegates(@NonNull List<? extends EObject> contents) {
		for (EObject eObject : contents) {
			if (eObject != null) {
				unloadDelegate(eObject);
			}
		}		
	}
}
