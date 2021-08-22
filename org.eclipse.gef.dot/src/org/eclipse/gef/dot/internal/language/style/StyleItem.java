/**
 */
package org.eclipse.gef.dot.internal.language.style;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.style.StyleItem#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.style.StyleItem#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getStyleItem()
 * @model
 * @generated
 */
public interface StyleItem extends EObject
{
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
   * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getStyleItem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.style.StyleItem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getStyleItem_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

} // StyleItem
