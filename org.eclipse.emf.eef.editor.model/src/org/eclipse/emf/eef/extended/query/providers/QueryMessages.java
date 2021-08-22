/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.extended.query.providers;

import org.eclipse.osgi.util.NLS;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class QueryMessages extends NLS {
	
	private static final String BUNDLE_NAME = "org.eclipse.emf.eef.extended.query.providers.queryMessages"; //$NON-NLS-1$

	
	public static String OCLQueryPropertiesEditionPart_PropertiesGroupLabel;

	
	public static String ExplicitPathQueryPropertiesEditionPart_PropertiesGroupLabel;


	
	public static String OCLQuery_ReadOnly;

	
	public static String OCLQuery_Part_Title;

	
	public static String ExplicitPathQuery_ReadOnly;

	
	public static String ExplicitPathQuery_Part_Title;


	
	public static String OCLQueryPropertiesEditionPart_ContextLabel;

	
	public static String OCLQueryPropertiesEditionPart_QueryLabel;

	
	public static String ExplicitPathQueryPropertiesEditionPart_QueryLabel;


	
	public static String PropertiesEditionPart_DocumentationLabel;

	
	public static String PropertiesEditionPart_IntegerValueMessage;

	
	public static String PropertiesEditionPart_FloatValueMessage;

	
	public static String PropertiesEditionPart_ShortValueMessage;

	
	public static String PropertiesEditionPart_LongValueMessage;

	
	public static String PropertiesEditionPart_ByteValueMessage;

	
	public static String PropertiesEditionPart_BigIntegerValueMessage;

	
	public static String PropertiesEditionPart_BigDecimalValueMessage;

	
	public static String PropertiesEditionPart_DoubleValueMessage;

	
	public static String PropertiesEditionPart_PropertiesGroupLabel;

	
	public static String PropertiesEditionPart_RequiredFeatureMessage;

	
	public static String PropertiesEditionPart_AddTableViewerLabel;

	
	public static String PropertiesEditionPart_EditTableViewerLabel;

	
	public static String PropertiesEditionPart_RemoveTableViewerLabel;

	
	public static String PropertiesEditionPart_AddListViewerLabel;

	
	public static String PropertiesEditionPart_RemoveListViewerLabel;

	// Start of user code for additionnal NLS Constants

// End of user code

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, QueryMessages.class);
	}

	
	private QueryMessages() {
		//protect instanciation
	}
}
