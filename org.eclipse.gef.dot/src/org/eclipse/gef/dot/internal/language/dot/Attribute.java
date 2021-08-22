/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.gef.dot.internal.language.terminals.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Stmt
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
   * @see #setName(ID)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getAttribute_Name()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(ID value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(ID)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getAttribute_Value()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getValue();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(ID value);

} // Attribute
