/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.impl.notify;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;

/**
 * @author <a href="mailto:stephane.bouchet@obeo.fr">Stephane Bouchet</a>
 */
public class PropertiesValidationEditionEvent implements IPropertiesEditionEvent {

	private IPropertiesEditionEvent event;

	private Diagnostic diagnostic;

	/**
	 * @return the diagnostic
	 */
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}

	public PropertiesValidationEditionEvent(IPropertiesEditionEvent event, Diagnostic diag) {
		this.event = event;
		this.diagnostic = diag;
	}

	/**
	 * @param newHolder
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#addHolder(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener)
	 */
	public void addHolder(IPropertiesEditionListener newHolder) {
		event.addHolder(newHolder);
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getAffectedEditor()
	 */
	public Object getAffectedEditor() {
		return event.getAffectedEditor();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getHolders()
	 */
	public List<IPropertiesEditionListener> getHolders() {
		return event.getHolders();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getKind()
	 */
	public int getKind() {
		return event.getKind();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getNewIndex()
	 */
	public int getNewIndex() {
		return event.getNewIndex();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getNewValue()
	 */
	public Object getNewValue() {
		return event.getNewValue();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getOldValue()
	 */
	public Object getOldValue() {
		return event.getOldValue();
	}

	/**
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#getState()
	 */
	public int getState() {
		return event.getState();
	}

	/**
	 * @param toTest
	 * @return
	 * @see org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent#hold(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener)
	 */
	public boolean hold(IPropertiesEditionListener toTest) {
		return event.hold(toTest);
	}

}
