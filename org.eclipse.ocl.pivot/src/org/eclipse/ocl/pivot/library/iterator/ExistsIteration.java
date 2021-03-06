/*******************************************************************************
 * Copyright (c) 2010, 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.pivot.library.iterator;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.EvaluationHaltedException;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.evaluation.IterationManager;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.AbstractIteration;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * ExistsIteration realises the Collection::exists() library iteration.
 */
public class ExistsIteration extends AbstractIteration
{
	public static final @NonNull ExistsIteration INSTANCE = new ExistsIteration();

	/** @deprecated use Executor */
	@Deprecated
	@Override
	public @NonNull Object createAccumulatorValue(@NonNull Evaluator evaluator, @NonNull TypeId accumulatorTypeId, @NonNull TypeId bodyTypeId) {
		return createAccumulatorValue(ValueUtil.getExecutor(evaluator), accumulatorTypeId, bodyTypeId);
	}
	
	/**
	 * @since 1.1
	 */
	@Override
	public @NonNull Object createAccumulatorValue(@NonNull Executor executor, @NonNull TypeId accumulatorTypeId, @NonNull TypeId bodyTypeId) {
		return new MutableObject(Boolean.FALSE);
	}

	@Override
	protected @Nullable Object resolveTerminalValue(@NonNull IterationManager iterationManager) {
		MutableObject accumulatorValue = (MutableObject) iterationManager.getAccumulatorValue();
		assert accumulatorValue != null;
		Object object = accumulatorValue.get();
		if ((object == null) || (object == Boolean.FALSE)) {
			return object;
		}
		throw (InvalidValueException)object;
	}

	@Override
    protected @Nullable Object updateAccumulator(@NonNull IterationManager iterationManager) {
		try {
			Object bodyVal = iterationManager.evaluateBody();
			if (bodyVal == Boolean.TRUE) {
				return Boolean.TRUE;							// Abort after a find
			}
			else if (bodyVal == Boolean.FALSE) {
				return CARRY_ON;						// Carry on for nothing found
			}
			else if (bodyVal == null) {
				MutableObject accumulatorValue = (MutableObject) iterationManager.getAccumulatorValue();
				assert accumulatorValue != null;
				if (accumulatorValue.get() == Boolean.FALSE) {
					accumulatorValue.set(null);
				}
				return CARRY_ON;						// Carry on for nothing found
			}
			else {
				throw new InvalidValueException(PivotMessages.NonBooleanBody, "exists"); 	// Non boolean body is invalid //$NON-NLS-1$
			}
		}
		catch (EvaluationHaltedException e) {
			throw e;
		}
		catch (InvalidValueException e) {
			MutableObject accumulatorValue = (MutableObject) iterationManager.getAccumulatorValue();
			assert accumulatorValue != null;
			accumulatorValue.set(e);
			return CARRY_ON;							// Carry on for nothing found
		}
		catch (Exception e) {
			MutableObject accumulatorValue = (MutableObject) iterationManager.getAccumulatorValue();
			assert accumulatorValue != null;
			accumulatorValue.set(ValueUtil.createInvalidValue(e));
			return CARRY_ON;							// Carry on for nothing found
		}
	}
}
