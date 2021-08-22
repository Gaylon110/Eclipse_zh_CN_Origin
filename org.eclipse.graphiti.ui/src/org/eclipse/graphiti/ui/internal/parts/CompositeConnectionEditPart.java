/**
 * <copyright>
 * 
 * Copyright (c) 2012, 2012 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Benjamin Schmeling - initial API, implementation and documentation for Bug 367483
 * 
 * </copyright>
 */
package org.eclipse.graphiti.ui.internal.parts;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.requests.SelectionRequest;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.ui.internal.config.IConfigurationProviderInternal;
import org.eclipse.graphiti.ui.internal.partfactory.PictogramsEditPartFactory;

public class CompositeConnectionEditPart extends ConnectionEditPart {

	private Collection<org.eclipse.gef.ConnectionEditPart> editParts = new HashSet<org.eclipse.gef.ConnectionEditPart>();
	/*
	 * Stores the child connection edit part that has been selected. The
	 * selection lead to the complete composite connection (including all child
	 * connections to be selected)
	 */
	private ConnectionEditPart originallySelectedChild = null;

	public CompositeConnectionEditPart(IConfigurationProviderInternal configurationProvider, CompositeConnection connection,
			PictogramsEditPartFactory factory, EditPart contextParent) {
		super(configurationProvider, connection, contextParent);

		for (Connection con : ((CompositeConnection) getConnection()).getChildren()) {
			org.eclipse.gef.ConnectionEditPart editPart = (org.eclipse.gef.ConnectionEditPart) getConfigurationProvider()
					.getEditPartFactory().createEditPart(this, con);
			this.getEditParts().add(editPart);
		}
	}

	@Override
	public void setSource(EditPart editPart) {
		super.setSource(editPart);
		for (org.eclipse.gef.ConnectionEditPart editPartChild : this.getEditParts()) {
			editPartChild.setSource(editPart);
		}
	}

	@Override
	public void setTarget(EditPart editPart) {
		super.setTarget(editPart);
		for (org.eclipse.gef.ConnectionEditPart editPartChild : this.getEditParts()) {
			editPartChild.setTarget(editPart);
		}
	}

	@Override
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof SelectionRequest) {
			// The CompositeConnectionEditPart itself has been selected --> the
			// child selection info must be removed
			((CompositeConnectionEditPart) this).setOriginallySelectedChild(null);
		}
		return super.getTargetEditPart(request);
	}

	@Override
	public void setSelected(int value) {
		for (org.eclipse.gef.ConnectionEditPart editPartChild : this.getEditParts()) {
			editPartChild.setSelected(value);
		}
		super.setSelected(value);
	}

	public Collection<org.eclipse.gef.ConnectionEditPart> getEditParts() {
		return editParts;
	}

	/**
	 * Returns the child connection that has been selected originally. The
	 * complete selection has been enhanced to be the complete composite
	 * connection (including all child connections), but the originally selected
	 * child will be added to the custom context in case the user needs the info
	 * which part of the composite connection has been clicked.
	 * 
	 * @return the {@link ConnectionEditPart} that has been selected originally
	 */
	public ConnectionEditPart getOriginallySelectedChild() {
		return originallySelectedChild;
	}

	/**
	 * Sets the child connection that has been selected originally.
	 * 
	 * @see #getOriginallySelectedChild()
	 * 
	 * @param originallySelectedChild
	 *            the {@link ConnectionEditPart} that was selected originally
	 */
	public void setOriginallySelectedChild(ConnectionEditPart originallySelectedChild) {
		this.originallySelectedChild = originallySelectedChild;
	}

	@Override
	public void forceVisualRefresh() {
		super.forceVisualRefresh();
		Collection<org.eclipse.gef.ConnectionEditPart> connectionEditParts = getEditParts();
		for (org.eclipse.gef.ConnectionEditPart connectionEditPart : connectionEditParts) {
			if (connectionEditPart instanceof IConnectionEditPart) {
				((IConnectionEditPart) connectionEditPart).forceVisualRefresh();
			}
		}
	}
}
