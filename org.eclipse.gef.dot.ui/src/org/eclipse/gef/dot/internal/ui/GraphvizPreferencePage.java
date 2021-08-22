/********************************************************************************************
 * Copyright (c) 2014, 2016 Fabian Steeg (hbz), and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Fabian Steeg (hbz) - initial API & implementation
 *     Tamas Miklossy (itemis AG) - Refactoring of preferences (bug #446639)
 *                                - Exporting *.dot files in different formats (bug #446647)
 *
 *********************************************************************************************/
package org.eclipse.gef.dot.internal.ui;

import java.io.File;
import java.util.Arrays;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.gef.dot.internal.DotExecutableUtils;
import org.eclipse.gef.dot.internal.ui.language.internal.DotActivator;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.service.prefs.Preferences;

/**
 * Store and access the path to the 'dot' executable in the preference store.
 * The path can be set by the user, using a file selection dialog. The selected
 * location is stored in the bundle's preferences and available from there after
 * the initial setting.
 */
public class GraphvizPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	private static final String DOT_SELECT_SHORT = DotUiMessages.GraphvizPreference_0;
	private static final String DOT_SELECT_LONG = DotUiMessages.GraphvizPreference_1;
	private static final String INVALID_DOT_EXECUTABLE = DotUiMessages.GraphvizPreference_2;
	private static final String INVALID_GRAPHVIZ_CONF = DotUiMessages.GraphvizPreference_3;
	private static final String GRAPHVIZ_CONF_HINT = DotUiMessages.GraphvizPreference_4;
	private static final String DOT_EXPORT_FORMAT = DotUiMessages.GraphvizPreference_5;
	private static final String DOT_EXPORT_FORMAT_HINT = DotUiMessages.GraphvizPreference_6;

	public static final String DOT_PATH_PREF_KEY = "dotpath"; //$NON-NLS-1$
	public static final String DOT_EXPORTFORMAT_PREF_KEY = "dotexportformat"; //$NON-NLS-1$

	private static final String DOT_EXPORTFORMAT_DEFAULT = "pdf"; //$NON-NLS-1$

	private DotExportRadioGroupFieldEditor radioGroupFieldEditor;

	public GraphvizPreferencePage() {
		super(GRID);
	}

	public static boolean isGraphvizConfigured() {
		return getDotExecutablePath().length() != 0;
	}

	public static void showGraphvizConfigurationDialog() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		new GraphvizConfigurationDialog(shell).open();
	}

	public static String getDotExecutablePath() {
		return dotUiPrefs().get(DOT_PATH_PREF_KEY, "");//$NON-NLS-1$
	}

	public static String getDotExportFormat() {
		return dotUiPrefs().get(DOT_EXPORTFORMAT_PREF_KEY, ""); //$NON-NLS-1$
	}

	private static boolean isValidDotExecutable(String path) {
		if (path == null || path.isEmpty()) {
			return false;
		}
		File file = new File(path);
		return file.getName().equals("dot") || file.getName().equals("dot.exe"); //$NON-NLS-1$//$NON-NLS-2$
	}

	// TODO: move to activator
	protected static Preferences dotUiPrefs() {
		return ConfigurationScope.INSTANCE.getNode(
				DotActivator.getInstance().getBundle().getSymbolicName());
	}

	// TODO: move to activator
	protected static IPreferenceStore dotUiPrefStore() {
		return new ScopedPreferenceStore(ConfigurationScope.INSTANCE,
				DotActivator.getInstance().getBundle().getSymbolicName());
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(dotUiPrefStore());
		setDescription(DOT_SELECT_LONG);
	}

	@Override
	protected void createFieldEditors() {
		// this method will be invoked if the user clicks on the Graphviz
		// Preference Page for the first time

		FileFieldEditor fileFieldEditor = new FileFieldEditor(DOT_PATH_PREF_KEY,
				DOT_SELECT_SHORT, true, FileFieldEditor.VALIDATE_ON_KEY_STROKE,
				getFieldEditorParent()) {

			{
				setErrorMessage(INVALID_DOT_EXECUTABLE);
			}

			@Override
			public boolean isValid() {
				boolean isValid = super.isValid();
				String currentValue = getStringValue();
				if (!currentValue.isEmpty()) {
					isValid = isValid && isValidDotExecutable(currentValue);
				}
				return isValid;
			}

			@Override
			protected void refreshValidState() {
				super.refreshValidState();
				if (!isValid()) {
					showErrorMessage(getErrorMessage());
				}
				checkState();
			}

			@Override
			public boolean doCheckState() {
				String currentValue = getStringValue();
				if (!currentValue.isEmpty()) {
					return isValidDotExecutable(currentValue);
				}
				return super.doCheckState();
			}

			@Override
			public String changePressed() {
				// this method will be invoked if the user clicks on the
				// "Browse" button of the fileFieldEditor of the DOT Executable
				// path
				String dotExecutablePath = super.changePressed();
				if (dotExecutablePath == null) {
					// If the returned value is null, the currently displayed
					// value remains.
					return null;
				}
				adaptDotExportUI(dotExecutablePath);
				return dotExecutablePath;
			}
		};
		addField(fileFieldEditor);

		getPreferenceStore()
				.addPropertyChangeListener(new IPropertyChangeListener() {

					@Override
					public void propertyChange(PropertyChangeEvent event) {
						// this method will be invoked if the user clicks on the
						// Apply/OK button of the Preference Page
						if (event.getProperty().equals(DOT_PATH_PREF_KEY)) {
							String dotExecutablePath = (String) event
									.getNewValue();
							adaptDotExportUI(dotExecutablePath);
						}
					}
				});

		String dotExecutablePath = getDotExecutablePath();
		addDotExportUI(dotExecutablePath);
	}

	private String[] getSupportedExportFormats(String dotExecutablePath) {
		String[] supportedExportFormats = null;

		supportedExportFormats = DotExecutableUtils
				.getSupportedExportFormats(dotExecutablePath);
		return supportedExportFormats;
	}

	private String getDefaultExportFormat(String[] supportedExportFormats) {
		if (supportedExportFormats == null) {
			return null;
		}
		return Arrays.asList(supportedExportFormats)
				.contains(DOT_EXPORTFORMAT_DEFAULT) ? DOT_EXPORTFORMAT_DEFAULT
						: supportedExportFormats[0];
	}

	private String[][] getLabelsAndValues(String[] supportedExportFormats) {
		String[][] labelsAndValues = null;

		if (supportedExportFormats != null) {
			labelsAndValues = new String[supportedExportFormats.length][2];
			for (int i = 0; i < supportedExportFormats.length; i++) {
				labelsAndValues[i] = new String[] { supportedExportFormats[i],
						supportedExportFormats[i] };
			}
		}
		return labelsAndValues;
	}

	private void adaptDotExportUI(String dotExecutablePath) {
		if (isValidDotExecutable(dotExecutablePath)) {
			if (radioGroupFieldEditor == null) {
				addDotExportUI(dotExecutablePath);
			} else {
				updateDotExportUI(dotExecutablePath);
			}
		} else {
			removeDotExportUI();
		}
	}

	private void addDotExportUI(String dotExecutablePath) {
		String[] supportedExportFormats = null;
		if (!dotExecutablePath.isEmpty()) {
			supportedExportFormats = getSupportedExportFormats(
					dotExecutablePath);
		}
		String[][] labelsAndValues = getLabelsAndValues(supportedExportFormats);

		radioGroupFieldEditor = new DotExportRadioGroupFieldEditor(
				DOT_EXPORTFORMAT_PREF_KEY, DOT_EXPORT_FORMAT,
				DOT_EXPORT_FORMAT_HINT, 5, labelsAndValues,
				getFieldEditorParent());

		if (getDotExportFormat().isEmpty()) {
			String defaultExportFormat = getDefaultExportFormat(
					supportedExportFormats);
			if (defaultExportFormat != null) {
				dotUiPrefs().put(DOT_EXPORTFORMAT_PREF_KEY,
						defaultExportFormat);
			}
		}
		addField(radioGroupFieldEditor);
	}

	private void updateDotExportUI(String dotExecutablePath) {
		String[] supportedExportFormats = getSupportedExportFormats(
				dotExecutablePath);
		String defaultExportFormat = getDefaultExportFormat(
				supportedExportFormats);
		String[][] labelsAndValues = getLabelsAndValues(supportedExportFormats);

		dotUiPrefs().put(DOT_EXPORTFORMAT_PREF_KEY, defaultExportFormat);

		radioGroupFieldEditor.update(labelsAndValues);
	}

	private void removeDotExportUI() {
		if (radioGroupFieldEditor != null) {
			radioGroupFieldEditor.clear();
			dotUiPrefs().remove(DOT_EXPORTFORMAT_PREF_KEY);
		}
	}

	@Override
	protected void performDefaults() {
		// this method will be invoked if the user clicks on the "Restore
		// Defaults" button
		super.performDefaults();
		removeDotExportUI();
	}

	public static class GraphvizConfigurationDialog extends MessageDialog {

		public GraphvizConfigurationDialog(Shell parentShell) {
			super(parentShell, INVALID_GRAPHVIZ_CONF, null, GRAPHVIZ_CONF_HINT,
					WARNING, new String[] { IDialogConstants.CANCEL_LABEL }, 0);
		}

		@Override
		protected Control createMessageArea(Composite composite) {
			// prevent creation of messageLabel by super implementation
			String linkText = message;
			message = null;
			super.createMessageArea(composite);
			message = linkText;

			Link messageLink = new Link(composite, SWT.WRAP);
			messageLink.setText(message);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER)
					.grab(true, false).applyTo(messageLink);
			messageLink.addListener(SWT.Selection, new Listener() {
				@Override
				public void handleEvent(Event event) {
					Shell shell = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell();
					PreferenceDialog pref = PreferencesUtil
							.createPreferenceDialogOn(shell,
									"org.eclipse.gef.dot.internal.ui.GraphvizPreferencePage", //$NON-NLS-1$
									null, null);
					if (pref != null) {
						close();
						pref.open();
					}
				}
			});
			return composite;
		}

	}

}