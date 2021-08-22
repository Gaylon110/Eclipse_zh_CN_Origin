/**
 */
package org.eclipse.gef.dot.internal.language.escstring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esc String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.EscString#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#getEscString()
 * @model
 * @generated
 */
public interface EscString extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#getEscString_Lines()
   * @model containment="true"
   * @generated
   */
  EList<JustifiedText> getLines();

} // EscString
