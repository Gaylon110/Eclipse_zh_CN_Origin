/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.notify;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditionEvent implements IPropertiesEditionEvent {

	/**
	 * Describe an event that just change the view state
	 */
	public static final int CHANGE = 0;

	/**
	 * Describe an event that change the model
	 */
	public static final int COMMIT = 1;

	/**
	 * A value has been set
	 */
	public static final int SET = 1;

	/**
	 * A value has been unset
	 */
	public static final int UNSET = 2;

	/**
	 * A value has been added
	 */
	public static final int ADD = 3;

	/**
	 * A value has been removed
	 */
	public static final int REMOVE = 4;

	/**
	 * A value has been moved
	 */
	public static final int MOVE = 7;

	/**
	 * The selection of a ElementEditor has changed
	 */
	public static final int SELECTION_CHANGED = 8;

	/**
	 * A value has been edited
	 */
	public static final int EDIT = 9;

	/**
	 * The focus of a ElementEditor has changed
	 */
	public static final int FOCUS_CHANGED = 10;
	
	/**
	 * The focus of a ElementEditor has changed
	 */
	public static final int FOCUS_LOST = 11;
	
	/**
	 * The focus of a ElementEditor has changed
	 */
	public static final int FOCUS_GAINED = 12;

	protected String affectedEditor;

	protected Object oldValue;

	protected Object newValue;

	protected List<IPropertiesEditionListener> holders;

	protected int kind;

	protected int state;

	protected int newIndex;

	/**
	 * @param holdedNotification
	 * @param holder
	 */
	public PropertiesEditionEvent(IPropertiesEditionListener holder, String affectedEditor, int state,
			int kind, Object oldValue, Object newValue) {
		this.affectedEditor = affectedEditor;
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.state = state;
		this.kind = kind;
		holders = new ArrayList<IPropertiesEditionListener>();
		holders.add(holder);
	}

	/**
	 * @param holdedNotification
	 * @param holder
	 */
	public PropertiesEditionEvent(IPropertiesEditionListener holder, String affectedEditor, int state,
			int kind, Object newValue, int newIndex) {
		this(holder, affectedEditor, state, kind, null, newValue);
		this.newIndex = newIndex;
	}

	/**
	 * @param newHolder
	 */
	public void addHolder(IPropertiesEditionListener newHolder) {
		holders.add(newHolder);
	}

	/**
	 * @param toTest
	 * @return
	 */
	public boolean hold(IPropertiesEditionListener toTest) {
		return holders.contains(toTest);
	}

	/**
	 * @return the changedEditor
	 */
	public Object getAffectedEditor() {
		return affectedEditor;
	}

	/**
	 * @return the oldValue
	 */
	public Object getOldValue() {
		return oldValue;
	}

	/**
	 * @return the newValue
	 */
	public Object getNewValue() {
		return newValue;
	}

	/**
	 * @return the newIndex
	 */
	public int getNewIndex() {
		return newIndex;
	}

	/**
	 * @return the holders
	 */
	public List<IPropertiesEditionListener> getHolders() {
		return holders;
	}

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @return the kind
	 */
	public int getKind() {
		return kind;
	}

}
