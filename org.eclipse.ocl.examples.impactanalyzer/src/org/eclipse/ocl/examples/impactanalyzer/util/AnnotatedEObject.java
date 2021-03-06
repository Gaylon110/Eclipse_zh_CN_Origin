/*******************************************************************************
 * Copyright (c) 2009, 2016 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Stack;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ecore.TupleLiteralExp;

/**
 * The AnnotatedEObject is a delegate of an {@link EObject} that adds support for {@link String} annotations.
 * Additionally it holds a {@link Stack}&lt;{@link EStructuralFeature}&gt; to enable the backtracking of {@link TupleLiteralExp}
 * 
 * @author martin.hanysz
 *
 */
public class AnnotatedEObject implements EObject {
    private final String comment;
    private final EObject objectReached;
    private final AnnotatedEObject from;
    public final static String NOT_IN_DEBUG_MODE_MESSAGE = "To enable annotations, set the system property org.eclipse.ocl.examples.impactanalyzer.debug to true, "
        + "e.g., by using the VM argument -Dorg.eclipse.ocl.examples.impactanalyzer.debug=true";
    public final static boolean IS_IN_DEBUG_MODE = Boolean.getBoolean("org.eclipse.ocl.examples.impactanalyzer.debug");

    public boolean equals(Object o) {
        if (o instanceof AnnotatedEObject) {
            return objectReached.equals(((AnnotatedEObject) o).objectReached);
        } else {
            return super.equals(o);
        }
    }
    
    public int hashCode() {
        return objectReached.hashCode();
    }
    
    /**
     * Constructor of the {@link AnnotatedEObject}.
     * 
     * @param objectReached the EObject to annotate
     * @param comment an annotationString
     */
    public AnnotatedEObject(EObject objectReached, String comment){
        this.objectReached = objectReached;
        this.comment = comment;
        this.from = null;
    }
    
    public AnnotatedEObject(EObject objectReached, AnnotatedEObject from, String comment) {
        this.from = from;
        this.comment = comment;
        this.objectReached = objectReached;
    }

    public String getComment() {
        return comment;
    }
    
    public EObject getAnnotatedObject() {
        return objectReached;
    }
    
    public TreeIterator<EObject> eAllContents() {
        return objectReached.eAllContents();
    }

    public EClass eClass() {
        return objectReached.eClass();
    }

    public EObject eContainer() {
        return objectReached.eContainer();
    }

    public EStructuralFeature eContainingFeature() {
        return objectReached.eContainingFeature();
    }

    public EReference eContainmentFeature() {
        return objectReached.eContainmentFeature();
    }

    public EList<EObject> eContents() {
        return objectReached.eContents();
    }

    public EList<EObject> eCrossReferences() {
        return objectReached.eCrossReferences();
    }

    public Object eGet(EStructuralFeature feature) {
        return objectReached.eGet(feature);
    }

    public Object eGet(EStructuralFeature feature, boolean resolve) {
        return objectReached.eGet(feature, resolve);
    }

    public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
        return objectReached.eInvoke(operation, arguments);
    }

    public boolean eIsProxy() {
        return objectReached.eIsProxy();
    }

    public boolean eIsSet(EStructuralFeature feature) {
        return objectReached.eIsSet(feature);
    }

    public Resource eResource() {
        return objectReached.eResource();
    }

    public void eSet(EStructuralFeature feature, Object newValue) {
        objectReached.eSet(feature, newValue);
    }

    public void eUnset(EStructuralFeature feature) {
        objectReached.eUnset(feature);        
    }

    public EList<Adapter> eAdapters() {
        return objectReached.eAdapters();
    }

    public boolean eDeliver() {
        return objectReached.eDeliver();
    }

    public void eNotify(Notification notification) {
        objectReached.eNotify(notification);
    }

    public void eSetDeliver(boolean deliver) {
        objectReached.eSetDeliver(deliver);
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (from != null) {
            result.append(" ==== from === \n");
            result.append(from.getAnnotatedObject());
            result.append('\n');
        }
        if (comment != null && comment.length() > 0) {
            result.append(" ==== using step ====\n");
            result.append(comment);
            result.append('\n');
        }
        if (from == null || from.getAnnotatedObject() != objectReached) {
            result.append(" ==== arriving at ====\n");
        }
        result.append(objectReached);
        return result.toString();
    }
}
