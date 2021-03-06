/*******************************************************************************
 * Copyright (c) 2011, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.evaluation.IterationManager.IterationManagerExtension;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.CollectionValue;

public abstract class AbstractIterationManager implements IterationManagerExtension
{
	/**
	 * @since 1.1
	 */
	protected final @NonNull Executor executor;
	/** @deprecated use executor */
	@Deprecated
	protected final @NonNull Evaluator evaluator;


	/** @deprecated use Executor */
	@Deprecated
	public AbstractIterationManager(@NonNull Evaluator evaluator) {
		this(ValueUtil.getExecutor(evaluator));
	}

	/**
	 * @since 1.1
	 */
	protected AbstractIterationManager(@NonNull Executor executor) {
		this.executor = executor;
		this.evaluator = executor;
	}

	@Override
	public @NonNull IterationManager createNestedIterationManager(@NonNull CollectionValue value) {
		throw new UnsupportedOperationException();	// Only required for single iterator managers
	}

	@Override
	public void dispose() {}

	@Override
	public @Nullable Object get() {
		throw new UnsupportedOperationException();	// Only required for single iterator managers
	}
	
	/** @deprecated use getExecutor() */
	@Deprecated
	@Override
	public @NonNull Evaluator getEvaluator() {
		return executor;
	}
	
	/**
	 * @since 1.1
	 */
	@Override
	public @NonNull Executor getExecutor() {
		return executor;
	}

	@Override
	public @NonNull StandardLibrary getStandardLibrary() {
		return executor.getStandardLibrary();
	}
}