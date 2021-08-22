/**
 */
package org.eclipse.gef.dot.internal.language.splinetype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.dot.internal.language.point.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getStartp <em>Startp</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getEndp <em>Endp</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getControlPoints <em>Control Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSpline()
 * @model
 * @generated
 */
public interface Spline extends EObject
{
  /**
   * Returns the value of the '<em><b>Startp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startp</em>' containment reference.
   * @see #setStartp(Point)
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSpline_Startp()
   * @model containment="true"
   * @generated
   */
  Point getStartp();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getStartp <em>Startp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startp</em>' containment reference.
   * @see #getStartp()
   * @generated
   */
  void setStartp(Point value);

  /**
   * Returns the value of the '<em><b>Endp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endp</em>' containment reference.
   * @see #setEndp(Point)
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSpline_Endp()
   * @model containment="true"
   * @generated
   */
  Point getEndp();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getEndp <em>Endp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endp</em>' containment reference.
   * @see #getEndp()
   * @generated
   */
  void setEndp(Point value);

  /**
   * Returns the value of the '<em><b>Control Points</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.point.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Control Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Control Points</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#getSpline_ControlPoints()
   * @model containment="true"
   * @generated
   */
  EList<Point> getControlPoints();

} // Spline
