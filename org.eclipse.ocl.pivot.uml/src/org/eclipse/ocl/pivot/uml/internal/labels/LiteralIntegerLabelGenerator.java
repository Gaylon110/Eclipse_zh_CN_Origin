/*******************************************************************************
 * Copyright (c) 2014 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink (CEA LIST) - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.uml.internal.labels;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.labels.AbstractLabelGenerator;
import org.eclipse.uml2.uml.LiteralInteger;

public class LiteralIntegerLabelGenerator extends AbstractLabelGenerator<LiteralInteger>
{
	public static void initialize(Registry registry) {
		registry.install(LiteralInteger.class, new LiteralIntegerLabelGenerator());		
	}
	
	public LiteralIntegerLabelGenerator() {
		super(LiteralInteger.class);
	}

	@Override
	public void buildLabelFor(@NonNull Builder labelBuilder, @NonNull LiteralInteger object) {
		int value = object.getValue();
		labelBuilder.appendString(Integer.toString(value));
	}
}