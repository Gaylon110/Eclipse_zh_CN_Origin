/**
 *  Copyright (c) 2011-2012 Mia-Software.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 * 	Emmanuelle Rouillé (Mia-Software) - Bug 352618 - To be able to use non derived facet structural features and save their values. 
 */
package org.eclipse.emf.facet.efacet.examples.library.metamodel.library;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getWriter <em>Writer</em>}</li>
 *   <li>{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getIsbn <em>Isbn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage#getBook_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' reference.
	 * @see #setWriter(Writer)
	 * @see org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage#getBook_Writer()
	 * @model
	 * @generated
	 */
	Writer getWriter();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getWriter <em>Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' reference.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(Writer value);

	/**
	 * Returns the value of the '<em><b>Isbn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isbn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isbn</em>' attribute.
	 * @see #setIsbn(int)
	 * @see org.eclipse.emf.facet.efacet.examples.library.metamodel.library.LibraryPackage#getBook_Isbn()
	 * @model
	 * @generated
	 */
	int getIsbn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.facet.efacet.examples.library.metamodel.library.Book#getIsbn <em>Isbn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isbn</em>' attribute.
	 * @see #getIsbn()
	 * @generated
	 */
	void setIsbn(int value);

} // Book
