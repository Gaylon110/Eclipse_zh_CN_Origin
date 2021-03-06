/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: WildCardReferencePropertyHandler.java,v 1.1 2009/06/28 02:04:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernateFeatureMapEntry;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Implements the getter/setter for a wild card reference property. This type of property is used in a feature map
 * created for wild cards.
 * 
 * This class implements both the getter, setter and propertyaccessor interfaces. When the getGetter and getSetter
 * methods are called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
@SuppressWarnings("unchecked")
public class WildCardReferencePropertyHandler implements Getter, Setter, PropertyAccessor, ExtensionPoint {

	/**
	 * Generated Version ID
	 */
	private static final long serialVersionUID = -2659637883475733107L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getGetter(java.lang.Class, java.lang.String)
	 */
	public Getter getGetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getSetter(java.lang.Class, java.lang.String)
	 */
	public Setter getSetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {
		Object value = null;
		if (!(owner instanceof HibernateFeatureMapEntry)) {
			value = ((FeatureMap.Entry) owner).getValue();
		} else {
			final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) owner;
			value = fme.getValue();
		}
		// handled by this one
		if (value instanceof EObject) {
			return value;
		}
		// are handled by other property handler
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 * org.hibernate.engine.SessionImplementor)
	 */
	public Object getForInsert(Object owner, Map mergeMap, SessionImplementor session) throws HibernateException {
		final Object value = get(owner);
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 * org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory) throws HibernateException {
		if (!(target instanceof HibernateFeatureMapEntry)) {
			// happens during initial save, value has not changed do nothing
			return;
		}
		final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) target;
		if (value != null && value instanceof EObject) {
			fme.setValue(value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethod()
	 */
	public Method getMethod() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethodName()
	 */
	public String getMethodName() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getReturnType()
	 */
	public Class getReturnType() {
		return EObject.class;
	}
}