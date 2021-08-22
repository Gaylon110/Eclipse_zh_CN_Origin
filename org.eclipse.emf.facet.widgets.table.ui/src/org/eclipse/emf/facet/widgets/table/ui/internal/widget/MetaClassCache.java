/*******************************************************************************
 * Copyright (c) 2017 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jonathan Pepin (Soft-Maint) - Bug 512179 - Table widget refactoring.
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.facet.widgets.table.metamodel.v0_2_0.table.Table;
import org.eclipse.emf.facet.widgets.table.ui.internal.exported.TableWidgetUtils;

public class MetaClassCache {

	private Set<EClass> metaclasses;
	private final Table table;

	public MetaClassCache(final Table table) {
		this.table = table;
	}

	/**
	 * This method maintain the metaclass list up to date, in order not to
	 * evaluate its value every time we need it
	 */
	public void updateMetaClasses() {
		this.metaclasses = new HashSet<EClass>();
		for (EObject eObject : TableWidgetUtils.getElements(this.table)) {
			this.metaclasses.add(eObject.eClass());
		}
	}

	/**
	 * @return whether the given feature is common to all the given metaclasses
	 */
	public boolean isCommon(final EStructuralFeature feature) {
		boolean result = true;
		for (final EClass metaclass : this.metaclasses) {
			if (!metaclass.getEAllStructuralFeatures().contains(feature)) {
				result = false;
				break;
			}
		}
		return result;
	}

}
