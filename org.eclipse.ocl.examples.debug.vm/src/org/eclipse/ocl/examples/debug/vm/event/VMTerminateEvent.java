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
package org.eclipse.ocl.examples.debug.vm.event;

public class VMTerminateEvent extends VMEvent
{
	private static final long serialVersionUID = -3633050443752075260L;

	private int fExitCode;

	public VMTerminateEvent(int exitCode) {
		fExitCode = exitCode;
	}
	
	public int getExitCode() {
		return fExitCode;
	}
	
	public String toString() {
		return getClass().getSimpleName() + "(" + fExitCode + ")";
	}
}