/*******************************************************************************
 * Copyright (c) 2010 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Nicolas Guyomar (Mia-Software) - Bug 332924 - The user must be able to save which EMF objects are contained in a table - initial API and implementation
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *   Gregoire Dupe (Mia-Software) - Bug 367613 - Table widget refactoring
 *******************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.workbench.internal.editor;
import java.util.EventObject;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.EditorActionBarContributor;


public class NatTableEditorActionBarContribution extends EditorActionBarContributor {

	private final UndoAction undoAction;
	private final RedoAction redoAction;
	private final CommandStackListener cmdStackListener;

	public NatTableEditorActionBarContribution() {
		final ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		this.undoAction = new UndoAction();
		this.undoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		this.redoAction = new RedoAction();
		this.redoAction.setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		this.cmdStackListener = new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				getUndoAction().update();
				getRedoAction().update();
			}
		};
	}

	@Override
	public void init(final IActionBars actionBars) {
		super.init(actionBars);
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), this.undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), this.redoAction);
	}

	@Override
	public void setActiveEditor(final IEditorPart targetEditor) {
		if (targetEditor instanceof DelegatedTableEditor || targetEditor instanceof TableEditor) {
			final IEditingDomainProvider tableEditor = (IEditingDomainProvider) targetEditor;
			final EditingDomain editingDomain = tableEditor.getEditingDomain();
			this.undoAction.setEditingDomain(editingDomain);
			this.redoAction.setEditingDomain(editingDomain);
			this.undoAction.update();
			this.redoAction.update();
			final CommandStack commandStack = tableEditor.getEditingDomain().getCommandStack();
			commandStack.removeCommandStackListener(this.cmdStackListener);
			commandStack.addCommandStackListener(this.cmdStackListener);
		}
	}

	protected UndoAction getUndoAction() {
		return this.undoAction;
	}

	protected RedoAction getRedoAction() {
		return this.redoAction;
	}
	
}
