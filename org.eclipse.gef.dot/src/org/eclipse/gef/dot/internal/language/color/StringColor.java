/**
 */
package org.eclipse.gef.dot.internal.language.color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.color.StringColor#getScheme <em>Scheme</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.color.StringColor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.color.ColorPackage#getStringColor()
 * @model
 * @generated
 */
public interface StringColor extends Color
{
  /**
   * Returns the value of the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheme</em>' attribute.
   * @see #setScheme(String)
   * @see org.eclipse.gef.dot.internal.language.color.ColorPackage#getStringColor_Scheme()
   * @model
   * @generated
   */
  String getScheme();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.color.StringColor#getScheme <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scheme</em>' attribute.
   * @see #getScheme()
   * @generated
   */
  void setScheme(String value);

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
   * @see org.eclipse.gef.dot.internal.language.color.ColorPackage#getStringColor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.color.StringColor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // StringColor
