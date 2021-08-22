/**
 */
package org.eclipse.gef.dot.internal.language.splinetype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage
 * @generated
 */
public interface SplinetypeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SplinetypeFactory eINSTANCE = org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Spline Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spline Type</em>'.
   * @generated
   */
  SplineType createSplineType();

  /**
   * Returns a new object of class '<em>Spline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spline</em>'.
   * @generated
   */
  Spline createSpline();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SplinetypePackage getSplinetypePackage();

} //SplinetypeFactory
