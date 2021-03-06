/*******************************************************************************
 * Copyright (c) 2014, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     R.Dvorak and others - QVTo debugger framework
 *     E.D.Willink - revised API for OCL debugger framework
 *******************************************************************************/
package org.eclipse.ocl.examples.debug.evaluator;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.examples.debug.vm.evaluator.VMEvaluationEnvironment;

public interface OCLVMEvaluationEnvironment extends VMEvaluationEnvironment
{
	@NonNull OCLVMEvaluationEnvironment createClonedEvaluationEnvironment();
	@Nullable OCLVMEvaluationEnvironment getVMParentEvaluationEnvironment();
	@NonNull OCLVMRootEvaluationEnvironment getVMRootEvaluationEnvironment();
}
