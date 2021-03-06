/*******************************************************************************
 * Copyright (c) 2014 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     R.Dvorak and others - QVTo debugger framework
 *     E.D.Willink - revised API for OCL debugger framework
 *******************************************************************************/
package org.eclipse.ocl.examples.debug.vm.request;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.debug.vm.data.VMSuspension;

public class VMResumeRequest extends VMRequest
{
	private static final long serialVersionUID = -1713629869107116532L;

	public final @NonNull VMSuspension suspension;
	
	public VMResumeRequest(@NonNull VMSuspension suspension) {
		super();
		this.suspension = suspension;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(getClass().getSimpleName());
		s.append("(");
		suspension.toString(s);
		s.append(")");
		return s.toString();
	}
}