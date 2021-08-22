/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowType#getArrowShapes <em>Arrow Shapes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowType()
 * @model
 * @generated
 */
public interface ArrowType extends EObject
{
  /**
   * Returns the value of the '<em><b>Arrow Shapes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arrow Shapes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrow Shapes</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowType_ArrowShapes()
   * @model containment="true"
   * @generated
   */
  EList<AbstractArrowShape> getArrowShapes();

} // ArrowType
