/*
 * Copyright (c) 2005, 2013 IBM Corporation, CEA, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *   Kenn Hussey - 286329
 *   Christian W. Damus (CEA) - 326915
 *
 */
package org.eclipse.uml2.uml.editor.actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.editor.UMLEditorPlugin;
import org.eclipse.uml2.uml.editor.dialogs.AbstractChoicesDialogDelegate;
import org.eclipse.uml2.uml.editor.dialogs.ChoicesDialog;

public class UnapplyProfileAction
		extends UMLCommandAction {

	public UnapplyProfileAction() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {

		if (collection.size() == 1
			&& collection.iterator().next() instanceof org.eclipse.uml2.uml.Package) {

			return IdentityCommand.INSTANCE;
		}

		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {

		if (command != UnexecutableCommand.INSTANCE) {
			final org.eclipse.uml2.uml.Package package_ = (org.eclipse.uml2.uml.Package) collection
				.iterator().next();

			final List<Profile> choiceOfValues = new ArrayList<Profile>(
				package_.getAppliedProfiles());

			Collections.<Profile> sort(choiceOfValues,
				new TextComparator<Profile>());

			String label = UMLEditorPlugin.INSTANCE.getString(
				"_UI_UnapplyProfileActionCommand_label", //$NON-NLS-1$
				new Object[]{getLabelProvider().getText(package_)});

			final ChoicesDialog<Profile> dialog = new ChoicesDialog<Profile>(
				workbenchPart.getSite().getShell(), package_, label,
				new AbstractChoicesDialogDelegate<Profile>(Profile.class) {

					@Override
					public String getChoicesLabelText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_AppliedProfiles_label"); //$NON-NLS-1$
					}

					@Override
					public String getValuesLabelText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_ProfilesToUnapply_label"); //$NON-NLS-1$
					}

					@Override
					public String getAddButtonText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_Unapply_label"); //$NON-NLS-1$
					}

					@Override
					public String getRemoveButtonText() {
						return UMLEditorPlugin.INSTANCE
							.getString("_UI_Apply_label"); //$NON-NLS-1$
					}

					public Collection<Profile> getChoiceOfValues() {
						return choiceOfValues;
					}

					public ILabelProvider getLabelProvider() {
						return UnapplyProfileAction.this.getLabelProvider();
					}

					@Override
					public boolean allowsReordering() {
						return false;
					}
				});
			dialog.open();

			if ((dialog.getReturnCode() == Window.OK)
				&& !dialog.getResult().isEmpty()) {
				editingDomain.getCommandStack().execute(
					new RefreshingChangeCommand(editingDomain, new Runnable() {

						public void run() {

							for (Profile result : dialog.getResult()) {
								package_.unapplyProfile(result);
							}
						}
					}, label));
			}
		}
	}

}