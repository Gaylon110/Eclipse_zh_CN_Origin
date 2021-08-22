/*******************************************************************************
 * Copyright (c) 2016 Red Hat Inc. and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sopot Cela (Red Hat Inc.)
 *******************************************************************************/
package org.eclipse.pde.internal.genericeditor.target.extension.reconciler.presentation;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.pde.internal.genericeditor.target.extension.model.ITargetConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

/**
 * Rule to match the attributes of a tag
 */
public class TargetPlatformAttributeRule extends WordRule {

	private static final String attributes[] = new String[] { ITargetConstants.TARGET_NAME_ATTR,
			ITargetConstants.UNIT_VERSION_ATTR, ITargetConstants.UNIT_ID_ATTR,
			ITargetConstants.LOCATION_INCLUDE_PLATFORMS_ATTR, ITargetConstants.LOCATION_INCLUDE_MODE_ATTR,
			ITargetConstants.LOCATION_TYPE_ATTR, ITargetConstants.REPOSITORY_LOCATION_ATTR,
			ITargetConstants.TARGET_JRE_PATH_ATTR, ITargetConstants.TARGET_SEQ_NO_ATTR };
	private IToken attributeToken = new Token(
			new TextAttribute(Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED)));

	public TargetPlatformAttributeRule() {
		super(new AlphanumericDetector());
		for (String att : attributes) {
			this.addWord(att, attributeToken);
		}
	}

}
