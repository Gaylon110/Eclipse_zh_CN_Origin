/**
 *  Copyright (c) 2011 CEA LIST.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 345730 - Deleting an element in the model breaks the table
 *      Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 */
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.emf.listener.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

/**
 * This is the adapter factory providing adapters used to mark rows that are
 * planed to be deleted by a trigger command.
 * 
 * @since 0.1.1
 */
public class ToBeDeletedAdapterFactory extends AdapterFactoryImpl implements
		IToBeDeletedAdapterFactory {

	@Override
	public boolean isFactoryForType(final Object type) {
		return type == IToBeDeleted.class;
	}

	@Override
	public Adapter createAdapter(final Notifier target) {
		return new ToBeDeletedAdapter();
	}

}
