/*******************************************************************************
 * Copyright (c) 2010 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.helper;

import java.util.List;

/**
 * @since 3.1
 */
public interface OCLSyntaxHelper
{
	List<Choice> getSyntaxHelp(ConstraintKind constraintType, String txt);
}
