/*******************************************************************************
 * Copyright (c) 2009, 2014 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.eventmanager.framework;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.examples.eventmanager.filters.OldValueClassFilter;
import org.eclipse.ocl.examples.eventmanager.filters.StructuralFeatureFilter;

/**
 * The AssociationFilterTable manages all Registrations containing
 * {@link StructuralFeatureFilter}.
 * 
 * @see org.eclipse.ocl.examples.eventmanager.framework.TableForEventFilter
 * @author Daniel Vocke (D044825)
 */
public class TableForOldValueClassFilter extends TableForEventFilter {

    public TableForOldValueClassFilter(int numberOfFilterTables) {
        super(numberOfFilterTables);
    }

    /**
     * @return the affected meta object of <code>LinkChangedEvents</code>. If the event is not of type
     * <code>LinkChangeEvent</code>, <code>null</code> is returned.
     */
    public Object getAffectedObject(Notification event) {
        if(event.getOldValue() == null)
            return null;
        if(event.getOldValue() instanceof EObject){
            return ((EObject)event.getOldValue()).eClass();
        }else if(event.getOldValue() instanceof EList<?>){
            Set<EClass> result = new HashSet<EClass>();
            for(Object o: ((EList<?>)event.getOldValue())){
                if(o instanceof EObject){
                    result.add(((EObject)o).eClass());
                }
            }
            return result;
        }
        return null;
    }

    @Override
    public Class<OldValueClassFilter> getIdentifier() {
        return OldValueClassFilter.class;
    }
    
    @Override
    protected String criterionToString(Object criterion) {
        StringBuilder result = new StringBuilder();
        if (criterion instanceof EClass) {
            result.append(((EClass) criterion).getName());
        } else {
            Set<?> eClassSet = (Set<?>) criterion;
            boolean first = true;
            for (Object eClass : eClassSet) {
                if (!first) {
                    result.append(", ");
                } else {
                    result.append(((EClass) eClass).getName());
                }
            }
        }
        return result.toString();
    }

}
