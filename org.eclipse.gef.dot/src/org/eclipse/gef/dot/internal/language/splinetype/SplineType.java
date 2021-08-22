/**
 */
package org.eclipse.gef.dot.internal.language.splinetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.SplineType#getSplines <em>Splines</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSplineType()
 * @model
 * @generated
 */
public interface SplineType extends EObject
{
  /**
   * Returns the value of the '<em><b>Splines</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.splinetype.Spline}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Splines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Splines</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSplineType_Splines()
   * @model containment="true"
   * @generated
   */
  EList<Spline> getSplines();

} // SplineType
