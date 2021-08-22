/**
 */
package org.eclipse.gef.dot.internal.language.shape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.shape.Shape#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends EObject
{
  /**
   * Returns the value of the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' containment reference.
   * @see #setShape(EObject)
   * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#getShape_Shape()
   * @model containment="true"
   * @generated
   */
  EObject getShape();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.shape.Shape#getShape <em>Shape</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' containment reference.
   * @see #getShape()
   * @generated
   */
  void setShape(EObject value);

} // Shape
