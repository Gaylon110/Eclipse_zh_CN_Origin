/**
 */
package org.eclipse.gef.dot.internal.language.color;

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
 * @see org.eclipse.gef.dot.internal.language.color.ColorFactory
 * @model kind="package"
 * @generated
 */
public interface ColorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "color";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotColor";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "color";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ColorPackage eINSTANCE = org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.color.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.color.impl.ColorImpl
   * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getColor()
   * @generated
   */
  int COLOR = 0;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.color.impl.RGBColorImpl <em>RGB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.color.impl.RGBColorImpl
   * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getRGBColor()
   * @generated
   */
  int RGB_COLOR = 1;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__R = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__G = COLOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__B = COLOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__A = COLOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>RGB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl <em>HSV Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl
   * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getHSVColor()
   * @generated
   */
  int HSV_COLOR = 2;

  /**
   * The feature id for the '<em><b>H</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSV_COLOR__H = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSV_COLOR__S = COLOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSV_COLOR__V = COLOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>HSV Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSV_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.color.impl.StringColorImpl <em>String Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.color.impl.StringColorImpl
   * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getStringColor()
   * @generated
   */
  int STRING_COLOR = 3;

  /**
   * The feature id for the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COLOR__SCHEME = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COLOR__NAME = COLOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>String Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.color.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.color.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB Color</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.RGBColor
   * @generated
   */
  EClass getRGBColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.RGBColor#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.RGBColor#getR()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_R();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.RGBColor#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.RGBColor#getG()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_G();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.RGBColor#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.RGBColor#getB()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_B();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.RGBColor#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.RGBColor#getA()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_A();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.color.HSVColor <em>HSV Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HSV Color</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.HSVColor
   * @generated
   */
  EClass getHSVColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.HSVColor#getH <em>H</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>H</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.HSVColor#getH()
   * @see #getHSVColor()
   * @generated
   */
  EAttribute getHSVColor_H();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.HSVColor#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.HSVColor#getS()
   * @see #getHSVColor()
   * @generated
   */
  EAttribute getHSVColor_S();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.HSVColor#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.HSVColor#getV()
   * @see #getHSVColor()
   * @generated
   */
  EAttribute getHSVColor_V();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.color.StringColor <em>String Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Color</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.StringColor
   * @generated
   */
  EClass getStringColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.StringColor#getScheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheme</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.StringColor#getScheme()
   * @see #getStringColor()
   * @generated
   */
  EAttribute getStringColor_Scheme();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.color.StringColor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.color.StringColor#getName()
   * @see #getStringColor()
   * @generated
   */
  EAttribute getStringColor_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ColorFactory getColorFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.color.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.color.impl.ColorImpl
     * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.color.impl.RGBColorImpl <em>RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.color.impl.RGBColorImpl
     * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getRGBColor()
     * @generated
     */
    EClass RGB_COLOR = eINSTANCE.getRGBColor();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__R = eINSTANCE.getRGBColor_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__G = eINSTANCE.getRGBColor_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__B = eINSTANCE.getRGBColor_B();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__A = eINSTANCE.getRGBColor_A();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl <em>HSV Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl
     * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getHSVColor()
     * @generated
     */
    EClass HSV_COLOR = eINSTANCE.getHSVColor();

    /**
     * The meta object literal for the '<em><b>H</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSV_COLOR__H = eINSTANCE.getHSVColor_H();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSV_COLOR__S = eINSTANCE.getHSVColor_S();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSV_COLOR__V = eINSTANCE.getHSVColor_V();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.color.impl.StringColorImpl <em>String Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.color.impl.StringColorImpl
     * @see org.eclipse.gef.dot.internal.language.color.impl.ColorPackageImpl#getStringColor()
     * @generated
     */
    EClass STRING_COLOR = eINSTANCE.getStringColor();

    /**
     * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_COLOR__SCHEME = eINSTANCE.getStringColor_Scheme();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_COLOR__NAME = eINSTANCE.getStringColor_Name();

  }

} //ColorPackage
