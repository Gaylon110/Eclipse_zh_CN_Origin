/*******************************************************************************
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.library.AbstractSimpleBinaryOperation;
import org.eclipse.ocl.pivot.values.MapValue;

/**
 * MapExcludesValueOperation realises the Map::excludesValue(value) library operation.
 */
public class MapExcludesValueOperation extends AbstractSimpleBinaryOperation
{
	public static final @NonNull MapExcludesValueOperation INSTANCE = new MapExcludesValueOperation();

	@Override
	public @Nullable Object evaluate(@Nullable Object left, @Nullable Object right) {
		MapValue mapValue = asMapValue(left);
		return mapValue.excludesValue(right);
	}
}
