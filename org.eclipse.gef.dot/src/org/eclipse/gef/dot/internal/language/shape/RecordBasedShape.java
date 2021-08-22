/**
 */
package org.eclipse.gef.dot.internal.language.shape;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Based Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedShape#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#getRecordBasedShape()
 * @model
 * @generated
 */
public interface RecordBasedShape extends EObject
{
  /**
   * Returns the value of the '<em><b>Shape</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape
   * @see #setShape(RecordBasedNodeShape)
   * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#getRecordBasedShape_Shape()
   * @model
   * @generated
   */
  RecordBasedNodeShape getShape();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedShape#getShape <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape
   * @see #getShape()
   * @generated
   */
  void setShape(RecordBasedNodeShape value);

} // RecordBasedShape
