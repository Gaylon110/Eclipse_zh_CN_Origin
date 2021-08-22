/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.dot.internal.language.terminals.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Port#getCompass_pt <em>Compass pt</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Port#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Compass pt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compass pt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compass pt</em>' attribute.
   * @see #setCompass_pt(String)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getPort_Compass_pt()
   * @model
   * @generated
   */
  String getCompass_pt();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.Port#getCompass_pt <em>Compass pt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compass pt</em>' attribute.
   * @see #getCompass_pt()
   * @generated
   */
  void setCompass_pt(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(ID)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getPort_Name()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(ID value);

} // Port
