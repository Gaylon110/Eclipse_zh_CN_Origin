/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.wizard.project

import org.eclipse.jface.fieldassist.ControlDecoration
import org.eclipse.jface.fieldassist.FieldDecorationRegistry
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Group
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.xtext.ui.internal.Activator
import org.eclipse.xtext.xtext.wizard.BuildSystem
import org.eclipse.xtext.xtext.wizard.SourceLayout

import static org.eclipse.xtext.xtext.ui.wizard.project.Messages.*
import static org.osgi.framework.Bundle.*

class AdvancedNewProjectPage extends WizardPage {

	Button createUiProject
	Button createSDKProject
	Button createP2Project
	Button createIdeaProject
	Button createWebProject
	Button createIdeProject
	Button createTestProject
	Combo preferredBuildSystem
	Combo sourceLayout
	Group createUiProjectSubGroup

	StatusWidget statusWidget
	
	boolean autoSelectIdeProject
	boolean autoSelectSDKProject

	new(String pageName) {
		super(pageName)
		title = Messages.AdvancedNewProjectPage_WindowTitle
		description = Messages.AdvancedNewProjectPage_Description
	}

	override createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE) => [
			layoutData = new GridData(SWT.FILL, SWT.FILL, true, true)
			layout = new GridLayout(1, false)
			
			Group [
				text = Messages.AdvancedNewProjectPage_LabelFacets
				createUiProject = CheckBox [
					text = AdvancedNewProjectPage_projEclipse
				]
				createUiProjectSubGroup = Group [
					createSDKProject = CheckBox [
						text = AdvancedNewProjectPage_projEclipseSDKFeature
					]
					createP2Project = CheckBox [
						text = AdvancedNewProjectPage_projEclipseP2
					]
				]
				createIdeaProject = CheckBox [
					text = AdvancedNewProjectPage_projIdea
					enabled = true
				]
				createWebProject = CheckBox [
					text = AdvancedNewProjectPage_projWeb
					enabled = true
				]
				createIdeProject = CheckBox [
					text = AdvancedNewProjectPage_projIde
					enabled = false
					it.InfoDecoration(AdvancedNewProjectPage_projIde_description)
				]
				createTestProject = CheckBox [
					text = Messages.WizardNewXtextProjectCreationPage_TestingSupport
				]
			]
			Group [
				text = AdvancedNewProjectPage_prefBuildSys
				preferredBuildSystem = DropDown[
					enabled = true
					items = BuildSystem.values.map[toString]
				]
			]
			Group [
				text = AdvancedNewProjectPage_srcLayout
				sourceLayout = DropDown[
					enabled = true
					items = SourceLayout.values.map[toString]
				]

			]
			statusWidget = new StatusWidget(it, SWT.NONE) => [
				layoutData = new GridData(SWT.FILL, SWT.TOP, true, false)
			]
		]

		val selectionControl = new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				validate(e)
			}
		}
		val uiButtons = #[createUiProject,createIdeaProject,createWebProject]
		val selectionControlUi = new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				if ((e.source as Button).selection) {
					if (!createIdeProject.selection) {
						autoSelectIdeProject = true
					}
					createIdeProject.selection = true
					createIdeProject.enabled = false
				} else {
					if (uiButtons.forall[!selection]) {
						createIdeProject.enabled = true
					}
					// auto deselect SDK and p2 project when Eclipse plug-in is deselected
					if (e.source == createUiProject) {
						createSDKProject.selection = false
						createP2Project.selection = false
					}
				}
				validate(e)
			}
		}
		val selectionControlUpdateSite = new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				if ((e.source as Button).selection) {
					if (!createSDKProject.selection) {
						autoSelectSDKProject = true
					}
					createSDKProject.selection = true
					createSDKProject.enabled = false
				} else {
					createSDKProject.enabled = true
				}
				validate(e)
			}
		}

		createUiProject.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				validate(e)
				val uiProjectSelected = createUiProject.selection
				createUiProjectSubGroup.enabled = uiProjectSelected
				createSDKProject.enabled = uiProjectSelected
				createP2Project.enabled = uiProjectSelected
			}
		})
		sourceLayout.addSelectionListener(selectionControl)
		createTestProject.addSelectionListener(selectionControl)
		preferredBuildSystem.addSelectionListener(selectionControl)
		createUiProject.addSelectionListener(selectionControlUi)
		createIdeaProject.addSelectionListener(selectionControlUi)
		createWebProject.addSelectionListener(selectionControlUi)
		createIdeProject.addSelectionListener(selectionControl)
		createSDKProject.addSelectionListener(selectionControl)
		createP2Project.addSelectionListener(selectionControlUpdateSite)
		setDefaults

		PlatformUI.getWorkbench().getHelpSystem().setHelp(shell, "org.eclipse.xtext.xtext.ui.newProject_Advanced")
	}

	def void validate(SelectionEvent e) {
		statusWidget.clearStatus
		checkWidgets(e)
		pageComplete = statusWidget.severtity !== ERROR
	}

	def checkWidgets(SelectionEvent e) {

		if (preferredBuildSystem.isSelected(BuildSystem.MAVEN) && !isBundleResolved("org.eclipse.m2e.maven.runtime")) {
			reportIssue(WARNING, AdvancedNewProjectPage_noM2e)
		}
		if (preferredBuildSystem.isSelected(BuildSystem.GRADLE) && !isBundleResolved("org.eclipse.buildship.core")) {
			reportIssue(WARNING, AdvancedNewProjectPage_noBuildship)
		}
		if (preferredBuildSystem.isSelected(BuildSystem.GRADLE) && createUiProject.selection) {
			reportIssue(WARNING,
				AdvancedNewProjectPage_eclipseAndGradleWarn)
		}
		if (preferredBuildSystem.isSelected(BuildSystem.MAVEN) && createIdeaProject.selection) {
			reportIssue(WARNING,
				AdvancedNewProjectPage_ideaAndMavenWarn)
		}
		if (preferredBuildSystem.isSelected(BuildSystem.NONE) && createIdeaProject.selection) {
			reportIssue(INFORMATION,
				AdvancedNewProjectPage_ideaReqGradleInfo)
		}
		if (createUiProject.selection && createP2Project.selection && !createSDKProject.selection) {
			addIssue(INFORMATION,
				AdvancedNewProjectPage_p2AndSdkInfo)
		}

		val source = e?.source
		if (createUiProject.selection && !sourceLayout.isSelected(SourceLayout.PLAIN)) {
			if (createUiProject === source) {
				reportIssue(ERROR, '''
				'?createUiProject.text?' requires ?SourceLayout.PLAIN? source layout.
				Please <a>select '?SourceLayout.PLAIN?'</a> source layout.''', [
					sourceLayout.select(SourceLayout.PLAIN)
				])
			} else {
				reportIssue(ERROR, '''
				?SourceLayout.MAVEN? source layout is not supported by the '?createUiProject.text?' project.
				Please <a>deselect '?createUiProject.text?'</a>.''', [
					createUiProject.selection = false
				])
			}
		}

		if (preferredBuildSystem.isSelected(BuildSystem.NONE) && sourceLayout.isSelected(SourceLayout.MAVEN)) {
			if (preferredBuildSystem === source) {
				reportIssue(ERROR, '''
				Maven/Gradle source layout is not supported without a build system.
				Please <a>select '?SourceLayout.PLAIN?'</a> source layout.''', [
					sourceLayout.select(SourceLayout.PLAIN)
				])
			} else {
				reportIssue(ERROR, '''
				Maven/Gradle source layout is only supported when using Maven or Gradle build system.
				You need to choose Maven or Gradle build system.
				Select <a>Gradle</a> build.''', [
					preferredBuildSystem.select(BuildSystem.GRADLE)
				])
			}
		}

		if (createWebProject.selection && preferredBuildSystem.isSelected(BuildSystem.NONE)) {
			if (preferredBuildSystem === source) {
				reportIssue(ERROR, '''
				The '?createWebProject.text?' project can not be build without a build system.
				Please <a>deselect '?createWebProject.text?'</a>.''', [
					createWebProject.selection = false
				])
			} else {
				reportIssue(ERROR, '''
				To build the '?createWebProject.text?' project, you need to choose Maven or Gradle build system.
				Select <a>Gradle</a> build.''', [
					preferredBuildSystem.select(BuildSystem.GRADLE)
				])
			}
		}

		if (autoSelectIdeProject) {
			autoSelectIdeProject = false
			reportIssue(INFORMATION, ''''?createIdeProject.text?' project was automatically selected as option '?(source as Button).text?' requires it.''')
		}
		if (autoSelectSDKProject) {
			autoSelectSDKProject = false
			reportIssue(INFORMATION, ''''?createSDKProject.text?' was automatically selected as option '?(source as Button).text?' requires it.''')
		}
	}

	def protected select(Combo combo, Enum<?> enu) {
		combo.select(combo.items.indexed.findFirst[value == enu.toString].key)
	}

	def protected boolean isSelected(Combo combo, Enum<?> enu) {
		return enu.toString == combo.text
	}

	def protected <T extends Control> reportIssue(int severity, String text) {
		reportIssue(severity, text, [])
	}

	def protected <T extends Control> reportIssue(int severity, String text, ()=>void fix) {
		statusWidget.setStatus(severity, text, fix, [
			validate(null)
		])
	}

	def protected <T extends Control> addIssue(int severity, String text) {
		statusWidget.addStatus(severity, text)
	}

	def protected boolean isBundleResolved(String bundleId) {
		val bundle = Activator.instance.bundle.bundleContext.bundles.findFirst[bundleId == it.symbolicName]
		return bundle !== null && (bundle.state.bitwiseAnd(RESOLVED.bitwiseOr(STARTING).bitwiseOr(ACTIVE)) !== 0)
	}

	def protected Group(Composite parent, (Group)=>void config) {
		new Group(parent, SWT.NONE) => [
			font = parent.font
			layoutData = new GridData(SWT.FILL, SWT.TOP, true, false)
			layout = new GridLayout(1, false)
			config.apply(it)
		]
	}

	def protected CheckBox(Composite composite, (Button)=>void config) {
		new Button(composite, SWT.CHECK) => [
			font = parent.font
			layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false)
			config.apply(it)
		]
	}

	def protected DropDown(Composite parent, (Combo)=>void config) {
		new Combo(parent, SWT.READ_ONLY) => [
			font = parent.font
			layoutData = new GridData(GridData.FILL_HORIZONTAL)
			config.apply(it)
		]
	}
	
	def protected InfoDecoration(Control control, String text) {
		val infoField = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
		new ControlDecoration(control, SWT.TOP + SWT.RIGHT) => [
			image = infoField.image
			descriptionText = text
			showHover = true
		]
		val gridData = new GridData(SWT.NONE, SWT.CENTER, true, false)
		control.layoutData = gridData
	}

	def protected setDefaults() {
		createUiProject.selection = true
		createIdeProject.selection = true
		createTestProject.selection = true
		createIdeaProject.selection = false
		createWebProject.selection = false
		createSDKProject.selection = false
		createP2Project.selection = false
		preferredBuildSystem.select(BuildSystem.values.head)
		sourceLayout.select(SourceLayout.values.head)
	}

	def boolean isCreateUiProject() {
		createUiProject.selection
	}

	def boolean isCreateTestProject() {
		createTestProject.selection
	}

	def boolean isCreateIdeProject() {
		createIdeProject.selection
	}

	def boolean isCreateIntellijProject() {
		createIdeaProject.selection
	}

	def boolean isCreateWebProject() {
		createWebProject.selection
	}

	def boolean isCreateSdkProject() {
		createUiProject.selection && createSDKProject.selection
	}

	def boolean isCreateP2Project() {
		createUiProject.selection && createP2Project.selection
	}

	def BuildSystem getPreferredBuildSystem() {
		BuildSystem.values.get(preferredBuildSystem.selectionIndex)
	}

	def SourceLayout getSourceLayout() {
		SourceLayout.values.get(sourceLayout.selectionIndex)
	}

}