/**
 */
package org.eclipse.gef.dot.internal.language.style;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.style.Style#getStyleItems <em>Style Items</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject
{
  /**
   * Returns the value of the '<em><b>Style Items</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.style.StyleItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style Items</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getStyle_StyleItems()
   * @model containment="true"
   * @generated
   */
  EList<StyleItem> getStyleItems();

} // Style
