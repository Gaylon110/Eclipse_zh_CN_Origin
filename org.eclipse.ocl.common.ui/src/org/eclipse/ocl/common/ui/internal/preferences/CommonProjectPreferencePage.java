/*******************************************************************************
 * Copyright (c) 2012, 2013 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl.common.ui.internal.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.common.internal.options.CodeGenerationMode;
import org.eclipse.ocl.common.internal.options.CommonOptions;
import org.eclipse.ocl.common.ui.internal.messages.CommonUIMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * The Project/Property preference page for common to all Bindings.
 */
public class CommonProjectPreferencePage extends AbstractProjectPreferencePage
{
	static final String delegateExtensionPoints[] = {
//		EcorePlugin.CONVERSION_DELEGATE_PPID, -- not available in EMF 2.7
		EcorePlugin.INVOCATION_DELEGATE_PPID,
		EcorePlugin.QUERY_DELEGATE_PPID,
		EcorePlugin.SETTING_DELEGATE_PPID,
		EcorePlugin.VALIDATION_DELEGATE_PPID
	};

	protected static final String[][] CODE_GENERATION_MODES = new String[][] {
		{ CommonUIMessages.CodeGenerationMode_Delegated, CodeGenerationMode.DELEGATED.toString() },
		{ CommonUIMessages.CodeGenerationMode_Compiled, CodeGenerationMode.GENERATED.toString()  }
	};

	private static String[][] DEFAULT_DELEGATION_MODES = null;
	
	private static String[][] getDelegateURIs() {
		Set<String> uris = new HashSet<String>();
		IExtensionRegistry pluginRegistry = Platform.getExtensionRegistry();
		String pluginID = EcorePlugin.getPlugin().getBundle().getSymbolicName();
		for (String extensionPointID : delegateExtensionPoints) {
			IExtensionPoint point = pluginRegistry.getExtensionPoint(pluginID, extensionPointID);
			if (point != null) {
				IConfigurationElement[] elements = point.getConfigurationElements();
				for (int i = 0; i < elements.length; i++) {
					String uri = elements[i].getAttribute("uri"); //$NON-NLS-1$
					if ((uri != null) && !OCLConstants.OCL_DELEGATE_URI.equals(uri)) {
						uris.add(uri);
					}
				}
			}
		}
		List<String> uriList = new ArrayList<String>(uris);
		Collections.sort(uriList);
		DEFAULT_DELEGATION_MODES = new String[uriList.size()][2];
		for (int i = 0; i < uris.size(); i++) {
			DEFAULT_DELEGATION_MODES[i][0] = uriList.get(i);
			DEFAULT_DELEGATION_MODES[i][1] = uriList.get(i);
		}
		return DEFAULT_DELEGATION_MODES;
	}
	
	
	public CommonProjectPreferencePage() {
		super(OCLConstants.PLUGIN_ID, CommonUIMessages.Common_PageTitle);
	}

	@Override
	protected AbstractProjectPreferencePage createClonePage() {
		return new CommonProjectPreferencePage();
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	@Override
	protected void createFieldEditors(Composite fieldEditorParent, List<IFieldEditor> fields) {
		Label horizontalLine= new Label(fieldEditorParent, SWT.SEPARATOR | SWT.HORIZONTAL);
		horizontalLine.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, false, 2, 1));
		horizontalLine.setFont(fieldEditorParent.getFont());
		if (DEFAULT_DELEGATION_MODES == null) {
			DEFAULT_DELEGATION_MODES = getDelegateURIs();
		}
		fields.add(new MyComboFieldEditor(CommonOptions.DEFAULT_DELEGATION_MODE,
			CommonUIMessages.DefaultDelegationMode, DEFAULT_DELEGATION_MODES, fieldEditorParent));
		fields.add(new MyComboFieldEditor(CommonOptions.CODE_GENERATION_MODE,
			CommonUIMessages.CodeGenerationMode, CODE_GENERATION_MODES, fieldEditorParent));
	}
}