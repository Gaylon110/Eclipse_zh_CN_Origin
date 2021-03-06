/*******************************************************************************
 * Copyright (c) 2013, 2016 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *	E.D.Willink (CEA LIST) - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.emf.validation.validity.ui.providers;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.emf.validation.validity.RootNode;
import org.eclipse.ocl.examples.emf.validation.validity.RootValidatableNode;
import org.eclipse.ocl.examples.emf.validation.validity.manager.ValidityManager;
import org.eclipse.ocl.pivot.utilities.ClassUtil;

public class ValidatableNodeContentProvider extends AbstractNodeContentProvider
{
	public ValidatableNodeContentProvider(@NonNull ValidityManager validityManager) {
		super(validityManager);
	}

	@Override
	protected @NonNull List<@NonNull RootValidatableNode> getRootNodes(@NonNull RootNode rootNode) {
		return ClassUtil.nullFree(rootNode.getValidatableNodes());
	}
}
