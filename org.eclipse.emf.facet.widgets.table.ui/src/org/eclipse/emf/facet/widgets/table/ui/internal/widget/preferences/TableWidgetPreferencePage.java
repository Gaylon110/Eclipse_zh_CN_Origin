/*****************************************************************************
 * Copyright (c) 2011 CEA LIST.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Vincent Lorenzo (CEA LIST) vincent.lorenzo@cea.fr - Initial API and implementation
 *   Vincent Lorenzo (CEA LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *   Vincent Lorenzo (CEA-LIST) - Bug 341238 - We need to be able to specify which column have to be hidden/visible using the customization mechanism
 *   Gregoire Dupe (Mia-Software) - Bug 366804 - [Restructuring] Table widget upgrade
 *****************************************************************************/
package org.eclipse.emf.facet.widgets.table.ui.internal.widget.preferences;

import org.eclipse.emf.facet.widgets.table.ui.internal.Activator;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * The Preference Page for the NatTable widget
 * 
 * 
 * 
 */
public class TableWidgetPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public static final String DISPLAYED_MESSAGE_1 = "When you select the hidden columns, the information is stored in a local uiCustom file."; //$NON-NLS-1$ // TODO those string should be externalized
	public static final String DISPLAYED_MESSAGE_2 = "This file needs to be on the top of the custom stack to be correctly applied."; //$NON-NLS-1$ // TODO those string should be externalized
	public static final String DISPLAYED_QUESTION = "Set the local custom file at the top of the custom stack ?"; //$NON-NLS-1$ // TODO those string should be externalized
	public static final String DONT_DISPLAY_NEXT_TIME = "Don't display this warning the next time and save the answer."; //$NON-NLS-1$ // TODO those string should be externalized

	public static final String YES = "Yes"; //$NON-NLS-1$ // TODO those string should be externalized

	public static final String NO = "No"; //$NON-NLS-1$ // TODO those string should be externalized

	public static final String YES_VALUE = "Yes"; //$NON-NLS-1$

	public static final String NO_VALUE = "No"; //$NON-NLS-1$

	
	public void init(final IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected Control createContents(final org.eclipse.swt.widgets.Composite composite) {
		Control parent = super.createContents(composite);
		final Group group = new Group((Composite) parent, 2);
		group.setLayout(new GridLayout(2, false));
		group.setText("Select Columns To Hide Action"); //$NON-NLS-1$ // TODO those string should be externalized
		Label lbl = new Label(group, SWT.NONE);
		lbl.setText(TableWidgetPreferencePage.DISPLAYED_MESSAGE_1 + "\n" + TableWidgetPreferencePage.DISPLAYED_MESSAGE_2); //$NON-NLS-1$

		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, false);
		gridData.horizontalSpan = 2;

		lbl.setLayoutData(gridData);
		final BooleanFieldEditor editor = new BooleanFieldEditor(
				PreferenceConstants.MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM, new String(), group);
		editor.setPreferenceStore(getPreferenceStore());
		editor.setLabelText(TableWidgetPreferencePage.DONT_DISPLAY_NEXT_TIME);
		editor.setPage(this);
		editor.load();
		editor.fillIntoGrid(group, 2);
		addField(editor);

		String[][] nameAndValue = new String[][] {
				{ TableWidgetPreferencePage.YES, TableWidgetPreferencePage.YES_VALUE },
				{ TableWidgetPreferencePage.NO, TableWidgetPreferencePage.NO_VALUE } };
		final ComboFieldEditor comboEditor = new ComboFieldEditor(
				PreferenceConstants.MUST_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM,
				TableWidgetPreferencePage.DISPLAYED_QUESTION, nameAndValue, group);

		comboEditor.setPreferenceStore(getPreferenceStore());
		comboEditor.setPage(this);
		comboEditor.fillIntoGrid(group, 2);
		comboEditor.load();
		addField(comboEditor);

		editor.setPropertyChangeListener(new IPropertyChangeListener() {

			// the comboEditor is available only when the dialog should not be
			// display
			public void propertyChange(final PropertyChangeEvent event) {
				Object source = event.getSource();
				if (source == editor) {
					comboEditor.setEnabled((Boolean) event.getNewValue(), group);
				}
			}

		});

		boolean value = Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.MUST_NOT_ASK_THE_USER_TO_PUT_ON_THE_TOP_THE_LOCAL_CUSTOM);
		comboEditor.setEnabled(value, group);
		return parent;
	}

	@Override
	protected void createFieldEditors() {
		// nothing to do
	}

}
