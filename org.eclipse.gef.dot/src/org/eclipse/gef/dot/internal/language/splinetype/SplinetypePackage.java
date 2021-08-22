/**
 */
package org.eclipse.gef.dot.internal.language.splinetype;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypeFactory
 * @model kind="package"
 * @generated
 */
public interface SplinetypePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "splinetype";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotSplineType";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "splinetype";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SplinetypePackage eINSTANCE = org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineTypeImpl <em>Spline Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplineTypeImpl
   * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypePackageImpl#getSplineType()
   * @generated
   */
  int SPLINE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Splines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE_TYPE__SPLINES = 0;

  /**
   * The number of structural features of the '<em>Spline Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl <em>Spline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl
   * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypePackageImpl#getSpline()
   * @generated
   */
  int SPLINE = 1;

  /**
   * The feature id for the '<em><b>Startp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE__STARTP = 0;

  /**
   * The feature id for the '<em><b>Endp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE__ENDP = 1;

  /**
   * The feature id for the '<em><b>Control Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE__CONTROL_POINTS = 2;

  /**
   * The number of structural features of the '<em>Spline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLINE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.splinetype.SplineType <em>Spline Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spline Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplineType
   * @generated
   */
  EClass getSplineType();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.splinetype.SplineType#getSplines <em>Splines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Splines</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplineType#getSplines()
   * @see #getSplineType()
   * @generated
   */
  EReference getSplineType_Splines();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline <em>Spline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spline</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.Spline
   * @generated
   */
  EClass getSpline();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getStartp <em>Startp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Startp</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.Spline#getStartp()
   * @see #getSpline()
   * @generated
   */
  EReference getSpline_Startp();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getEndp <em>Endp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Endp</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.Spline#getEndp()
   * @see #getSpline()
   * @generated
   */
  EReference getSpline_Endp();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.splinetype.Spline#getControlPoints <em>Control Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Control Points</em>'.
   * @see org.eclipse.gef.dot.internal.language.splinetype.Spline#getControlPoints()
   * @see #getSpline()
   * @generated
   */
  EReference getSpline_ControlPoints();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SplinetypeFactory getSplinetypeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineTypeImpl <em>Spline Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplineTypeImpl
     * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypePackageImpl#getSplineType()
     * @generated
     */
    EClass SPLINE_TYPE = eINSTANCE.getSplineType();

    /**
     * The meta object literal for the '<em><b>Splines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLINE_TYPE__SPLINES = eINSTANCE.getSplineType_Splines();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl <em>Spline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl
     * @see org.eclipse.gef.dot.internal.language.splinetype.impl.SplinetypePackageImpl#getSpline()
     * @generated
     */
    EClass SPLINE = eINSTANCE.getSpline();

    /**
     * The meta object literal for the '<em><b>Startp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLINE__STARTP = eINSTANCE.getSpline_Startp();

    /**
     * The meta object literal for the '<em><b>Endp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLINE__ENDP = eINSTANCE.getSpline_Endp();

    /**
     * The meta object literal for the '<em><b>Control Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLINE__CONTROL_POINTS = eINSTANCE.getSpline_ControlPoints();

  }

} //SplinetypePackage
