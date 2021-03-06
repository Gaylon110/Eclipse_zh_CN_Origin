/**
 * Copyright (c) 2010, 2016 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.ocl.pivot.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.PrimitiveCompletePackage;
import org.eclipse.ocl.pivot.internal.complete.CompleteClassInternal;
import org.eclipse.ocl.pivot.util.Visitor;
import org.eclipse.ocl.pivot.utilities.PivotConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Complete Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrimitiveCompletePackageImpl extends CompletePackageImpl implements PrimitiveCompletePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return PivotPackage.Literals.PRIMITIVE_COMPLETE_PACKAGE;
	}

	protected PrimitiveCompletePackageImpl()
	{
		super();
		init("$primitives$", "prim", PivotConstants.PRIMITIVES_URI);
	}

	@Override
	public <R> R accept(@NonNull Visitor<R> visitor) {
		return visitor.visitPrimitiveCompletePackage(this);
	}

	@Override
	public @NonNull CompleteClassInternal getCompleteClass(final org.eclipse.ocl.pivot.@NonNull Class primitiveType) {
		String name = primitiveType.getName();
		CompleteClassInternal completeClass = getOwnedCompleteClass(name);
		if (completeClass == null) {
			completeClass = (CompleteClassInternal)PivotFactory.eINSTANCE.createCompleteClass();
			completeClass.setName(name);
			getOwnedCompleteClasses().add(completeClass);
			completeClass.getPartialClasses().add(primitiveType);
//			didAddClass(completeClass, primitiveType);
		}
		return completeClass;
	}
} //PrimitiveCompletePackageImpl
