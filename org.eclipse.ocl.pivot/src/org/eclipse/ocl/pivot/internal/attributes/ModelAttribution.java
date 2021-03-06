/*******************************************************************************
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.attributes;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Import;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.Namespace;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.internal.scoping.AbstractAttribution;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;

public class ModelAttribution extends AbstractAttribution
{
	public static final ModelAttribution INSTANCE = new ModelAttribution();

	@Override
	public ScopeView computeLookup(@NonNull EObject target, @NonNull EnvironmentView environmentView, @NonNull ScopeView scopeView) {
		Model targetModel = (Model)target;
		environmentView.addAllPackages(targetModel);
		if (environmentView.accepts(PivotPackage.Literals.NAMESPACE)) {
			for (Import anImport : targetModel.getOwnedImports()) {
				Namespace namespace = anImport.getImportedNamespace();
				if ((namespace != null) && !namespace.eIsProxy()) {
					String importName = anImport.getName();
					if (importName != null) {
						environmentView.addElement(importName, namespace);
					}
					else if (namespace instanceof Model) {
						environmentView.addAllPackages((Model)namespace);
					}
					else {
						environmentView.addNamedElement(namespace);
					}
				}
			}
			if (!environmentView.hasFinalResult()) {
				environmentView.addRootPackages();
				if (!environmentView.hasFinalResult()) {
					String name = environmentView.getName();
					if ((name != null) && name.contains("#")) {
						Resource eResource = targetModel.eResource();
						if (eResource != null) {
							URI baseURI = eResource.getURI();
				           	if (baseURI != null) {
				           		environmentView.addImportedElement(baseURI);
				           	}
						}
					}
				}
			}
		}
		return scopeView.getParent();
	}
}
