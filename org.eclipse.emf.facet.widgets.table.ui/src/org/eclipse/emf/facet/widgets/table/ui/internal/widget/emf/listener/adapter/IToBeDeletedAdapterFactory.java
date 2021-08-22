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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;

/**
 * This is the interface of the adapter factory providing adapters used to mark rows that are planed to be
 * deleted by a trigger command.
 */
public interface IToBeDeletedAdapterFactory extends AdapterFactory {
	
	/**
	 * Instance of ToBeDeletedAdapterFactory
	 */
	public static IToBeDeletedAdapterFactory 
	  INSTANCE = 
	  	new ToBeDeletedAdapterFactory();
	
	/**
	 * This method returns true if this factory is a factory for the given type {@link Object}, else false
	 */
	public boolean isFactoryForType(final Object type);
	
	/**
	 * Creates a new instance of Adapter for the given {@link Notifier}
	 */
	public Adapter createAdapter(final Notifier target);

}
