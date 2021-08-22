/**
 */
package org.eclipse.gef.dot.internal.language.rect;

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
 * @see org.eclipse.gef.dot.internal.language.rect.RectFactory
 * @model kind="package"
 * @generated
 */
public interface RectPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rect";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotRect";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rect";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RectPackage eINSTANCE = org.eclipse.gef.dot.internal.language.rect.impl.RectPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl <em>Rect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.rect.impl.RectImpl
   * @see org.eclipse.gef.dot.internal.language.rect.impl.RectPackageImpl#getRect()
   * @generated
   */
  int RECT = 0;

  /**
   * The feature id for the '<em><b>Llx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECT__LLX = 0;

  /**
   * The feature id for the '<em><b>Lly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECT__LLY = 1;

  /**
   * The feature id for the '<em><b>Urx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECT__URX = 2;

  /**
   * The feature id for the '<em><b>Ury</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECT__URY = 3;

  /**
   * The number of structural features of the '<em>Rect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECT_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.rect.Rect <em>Rect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rect</em>'.
   * @see org.eclipse.gef.dot.internal.language.rect.Rect
   * @generated
   */
  EClass getRect();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.rect.Rect#getLlx <em>Llx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Llx</em>'.
   * @see org.eclipse.gef.dot.internal.language.rect.Rect#getLlx()
   * @see #getRect()
   * @generated
   */
  EAttribute getRect_Llx();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.rect.Rect#getLly <em>Lly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lly</em>'.
   * @see org.eclipse.gef.dot.internal.language.rect.Rect#getLly()
   * @see #getRect()
   * @generated
   */
  EAttribute getRect_Lly();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.rect.Rect#getUrx <em>Urx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Urx</em>'.
   * @see org.eclipse.gef.dot.internal.language.rect.Rect#getUrx()
   * @see #getRect()
   * @generated
   */
  EAttribute getRect_Urx();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.rect.Rect#getUry <em>Ury</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ury</em>'.
   * @see org.eclipse.gef.dot.internal.language.rect.Rect#getUry()
   * @see #getRect()
   * @generated
   */
  EAttribute getRect_Ury();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RectFactory getRectFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl <em>Rect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.rect.impl.RectImpl
     * @see org.eclipse.gef.dot.internal.language.rect.impl.RectPackageImpl#getRect()
     * @generated
     */
    EClass RECT = eINSTANCE.getRect();

    /**
     * The meta object literal for the '<em><b>Llx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECT__LLX = eINSTANCE.getRect_Llx();

    /**
     * The meta object literal for the '<em><b>Lly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECT__LLY = eINSTANCE.getRect_Lly();

    /**
     * The meta object literal for the '<em><b>Urx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECT__URX = eINSTANCE.getRect_Urx();

    /**
     * The meta object literal for the '<em><b>Ury</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECT__URY = eINSTANCE.getRect_Ury();

  }

} //RectPackage
