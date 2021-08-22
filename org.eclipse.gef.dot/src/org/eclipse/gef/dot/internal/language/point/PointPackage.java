/**
 */
package org.eclipse.gef.dot.internal.language.point;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.gef.dot.internal.language.point.PointFactory
 * @model kind="package"
 * @generated
 */
public interface PointPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "point";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotPoint";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "point";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PointPackage eINSTANCE = org.eclipse.gef.dot.internal.language.point.impl.PointPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.point.impl.PointImpl
   * @see org.eclipse.gef.dot.internal.language.point.impl.PointPackageImpl#getPoint()
   * @generated
   */
  int POINT = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Z = 2;

  /**
   * The feature id for the '<em><b>Input Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__INPUT_ONLY = 3;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.point.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.eclipse.gef.dot.internal.language.point.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.point.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.gef.dot.internal.language.point.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.point.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipse.gef.dot.internal.language.point.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.point.Point#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.eclipse.gef.dot.internal.language.point.Point#getZ()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Z();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.point.Point#isInputOnly <em>Input Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Input Only</em>'.
   * @see org.eclipse.gef.dot.internal.language.point.Point#isInputOnly()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_InputOnly();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PointFactory getPointFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.point.impl.PointImpl
     * @see org.eclipse.gef.dot.internal.language.point.impl.PointPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Z = eINSTANCE.getPoint_Z();

    /**
     * The meta object literal for the '<em><b>Input Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__INPUT_ONLY = eINSTANCE.getPoint_InputOnly();

  }

} //PointPackage
