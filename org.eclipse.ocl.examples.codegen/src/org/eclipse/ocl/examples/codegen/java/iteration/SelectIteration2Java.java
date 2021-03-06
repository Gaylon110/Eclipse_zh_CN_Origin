/*******************************************************************************
 * Copyright (c) 2013, 2014 CEA LIST and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink(CEA LIST) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.examples.codegen.java.iteration;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.codegen.cgmodel.CGIterator;
import org.eclipse.ocl.examples.codegen.cgmodel.CGValuedElement;
import org.eclipse.ocl.examples.codegen.cgmodel.CGBuiltInIterationCallExp;
import org.eclipse.ocl.examples.codegen.java.JavaStream;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

public class SelectIteration2Java extends AbstractAccumulation2Java
{
	public static final @NonNull SelectIteration2Java INSTANCE = new SelectIteration2Java();
	
	@Override
	public boolean appendUpdate(@NonNull JavaStream js, @NonNull CGBuiltInIterationCallExp cgIterationCallExp) {
		CGValuedElement cgBody = getBody(cgIterationCallExp);
		if (cgBody.getASTypeId() == TypeId.BOOLEAN) { 
			CGIterator cgAccumulator = getAccumulator(cgIterationCallExp);
			CGIterator cgIterator = getIterator(cgIterationCallExp);
			js.append("if (");
			js.appendValueName(cgBody);
			js.append(" == ");
			js.appendClassReference(ValueUtil.class);
			js.append(".TRUE_VALUE) {\n");
			js.pushIndentation(null);
				js.appendValueName(cgAccumulator);
				js.append(".add(");
				js.appendValueName(cgIterator);
				js.append(");\n");
			js.popIndentation();
			js.append("}\n");
			return true;
		}
		else {
			return js.appendThrowInvalidValueException(PivotMessages.NonBooleanBody, "select");
		}
	}
}