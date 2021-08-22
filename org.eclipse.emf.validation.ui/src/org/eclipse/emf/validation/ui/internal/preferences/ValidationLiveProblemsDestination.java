/******************************************************************************
 * Copyright (c) 2004, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


package org.eclipse.emf.validation.ui.internal.preferences;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.validation.ui.internal.ValidationUIPlugin;


/**
 * An enumeration of destinations for display of live validation problems.
 *
 * @author Christian W. Damus (cdamus)
 */
public enum ValidationLiveProblemsDestination implements Enumerator {
    DIALOG("Dialog"), //$NON-NLS-1$
    CONSOLE("Console"); //$NON-NLS-1$

    private String name;

    /**
     * The list of values for this enumerated type.
     */
    private static final ValidationLiveProblemsDestination[] VALUES =
        { DIALOG, CONSOLE };

    /**
     * Gets the preference setting for live validation problems destination.
     * 
     * @return the preference setting
     */
    public static ValidationLiveProblemsDestination getPreferenceSetting() {
        String name =
            ValidationUIPlugin.getPlugin().getPluginPreferences().getString(
                 IPreferenceConstants.VALIDATION_LIVE_PROBLEMS_DISPLAY);

        if (name.equals(DIALOG.getName())) {
        	return DIALOG;
        }
        
        return CONSOLE;
    }

    /**
     * Constructor for ValidationLiveProblemsDestination.
     * 
     * @param name The name for the ValidationLiveProblemsDestination type
     */
    private ValidationLiveProblemsDestination(String name) {
        this.name = name;
    }

    /**
     * Retrieves the list of constants for this enumerated type.
     * 
     * @return The list of constants for this enumerated type.
     */
    protected List<ValidationLiveProblemsDestination> getValues() {
        return Arrays.asList(VALUES);
    }
    
    public int getOrdinal() {
    	return getValue();
    }
    
    public String getName() {
    	return name;
    }
    
    public int getValue() {
    	return ordinal();
    }
    
    public String getLiteral() {
    	return getName();
    }
}
