/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.internal.labels;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.labels.AbstractLabelGenerator;

public final class StringLabelGenerator extends AbstractLabelGenerator<String>
{
	public static void initialize(@NonNull Registry registry) {
		registry.install(String.class, new StringLabelGenerator());
	}
	
	public StringLabelGenerator() {
		super(String.class);
	}

	@Override
	public void buildLabelFor(@NonNull Builder labelBuilder, @NonNull String object) {
		labelBuilder.appendString(object);
	}
}