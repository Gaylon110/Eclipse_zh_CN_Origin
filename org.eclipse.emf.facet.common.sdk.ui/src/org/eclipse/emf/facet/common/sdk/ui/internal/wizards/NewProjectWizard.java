/*******************************************************************************
 * Copyright (c) 2009, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 375054 - Add validation warning for overlay on EClass
 *******************************************************************************/
package org.eclipse.emf.facet.common.sdk.ui.internal.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.facet.common.sdk.ui.internal.Activator;
import org.eclipse.emf.facet.common.sdk.ui.internal.Messages;
import org.eclipse.emf.facet.util.core.Logger;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.part.ISetSelectionTarget;

/** This wizard proposes to create a basic new EMF Facet project. */
public class NewProjectWizard extends Wizard implements INewWizard {

	private static final String NEW_PROJECT_CREATION_PAGE_NAME = "NewProjectCreationPage"; //$NON-NLS-1$
	private IWorkbench workbench;
	private IProject project;
	private String projectName;
	private IPath projectLocation;

	public void init(final IWorkbench pWorkbench, final IStructuredSelection selection) {
		this.workbench = pWorkbench;
		setWindowTitle(Messages.NewProjectWizard_emfFacetProject);
	}

	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}

	public void setProject(final IProject project) {
		this.project = project;
	}
	
	public void setProjectLocation(final IPath projectLocation) {
		this.projectLocation = projectLocation;
	}

	@Override
	public void addPages() {
		final WizardNewProjectCreationPage newProjectCreationPage = new WizardNewProjectCreationPage(
				NewProjectWizard.NEW_PROJECT_CREATION_PAGE_NAME) {
			@Override
			protected boolean validatePage() {
				setProjectLocation(getLocationPath());
				final String projName = getProjectName();
				setProjectName(projName);
				if (projName != null && projName.length() > 0) {
					setProject(ResourcesPlugin.getWorkspace().getRoot().getProject(projName));
				}
				return super.validatePage() && NewProjectWizard.this.canFinish();
			}
		};

		newProjectCreationPage.setInitialProjectName(this.projectName);
		newProjectCreationPage.setTitle(Messages.NewProjectWizard_emfFacetProject);
		newProjectCreationPage.setDescription(Messages.NewProjectWizard_emfFacetProject_description);
		addPage(newProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		final WorkspaceModifyOperation operation = new NewProjectCreationOperation(this.projectLocation, this.project);

		try {
			getContainer().run(false, false, operation);
		} catch (final Exception e) {
			Logger.logError(e, Activator.getDefault());
			return false;
		}

		if (this.project != null) {
			final IWorkbenchPage page = this.workbench.getActiveWorkbenchWindow().getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(this.project);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}
		}

		return true;
	}

	@Override
	public boolean canFinish() {
		return (this.projectName != null) && (this.projectName.length() > 0)
				&& (this.project != null) && (!this.project.exists());
	}

}
