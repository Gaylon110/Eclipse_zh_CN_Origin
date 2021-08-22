/**
 */
package org.eclipse.gef.dot.internal.language.point;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.Point#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.Point#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.Point#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.Point#isInputOnly <em>Input Only</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.point.PointPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(double)
   * @see org.eclipse.gef.dot.internal.language.point.PointPackage#getPoint_X()
   * @model
   * @generated
   */
  double getX();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.point.Point#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(double value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(double)
   * @see org.eclipse.gef.dot.internal.language.point.PointPackage#getPoint_Y()
   * @model
   * @generated
   */
  double getY();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.point.Point#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(double value);

  /**
   * Returns the value of the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' attribute.
   * @see #setZ(double)
   * @see org.eclipse.gef.dot.internal.language.point.PointPackage#getPoint_Z()
   * @model
   * @generated
   */
  double getZ();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.point.Point#getZ <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' attribute.
   * @see #getZ()
   * @generated
   */
  void setZ(double value);

  /**
   * Returns the value of the '<em><b>Input Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Only</em>' attribute.
   * @see #setInputOnly(boolean)
   * @see org.eclipse.gef.dot.internal.language.point.PointPackage#getPoint_InputOnly()
   * @model
   * @generated
   */
  boolean isInputOnly();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.point.Point#isInputOnly <em>Input Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Only</em>' attribute.
   * @see #isInputOnly()
   * @generated
   */
  void setInputOnly(boolean value);

} // Point
