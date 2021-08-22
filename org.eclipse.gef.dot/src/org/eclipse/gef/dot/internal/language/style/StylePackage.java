/**
 */
package org.eclipse.gef.dot.internal.language.style;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.gef.dot.internal.language.style.StyleFactory
 * @model kind="package"
 * @generated
 */
public interface StylePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "style";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotStyle";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "style";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StylePackage eINSTANCE = org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.style.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.style.impl.StyleImpl
   * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getStyle()
   * @generated
   */
  int STYLE = 0;

  /**
   * The feature id for the '<em><b>Style Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__STYLE_ITEMS = 0;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.style.impl.StyleItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.style.impl.StyleItemImpl
   * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getStyleItem()
   * @generated
   */
  int STYLE_ITEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ITEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ITEM__ARGS = 1;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.style.NodeStyle <em>Node Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.style.NodeStyle
   * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getNodeStyle()
   * @generated
   */
  int NODE_STYLE = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.style.EdgeStyle <em>Edge Style</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.style.EdgeStyle
   * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getEdgeStyle()
   * @generated
   */
  int EDGE_STYLE = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.style.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.style.Style#getStyleItems <em>Style Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Style Items</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.Style#getStyleItems()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_StyleItems();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.style.StyleItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.StyleItem
   * @generated
   */
  EClass getStyleItem();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.style.StyleItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.StyleItem#getName()
   * @see #getStyleItem()
   * @generated
   */
  EAttribute getStyleItem_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.gef.dot.internal.language.style.StyleItem#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.StyleItem#getArgs()
   * @see #getStyleItem()
   * @generated
   */
  EAttribute getStyleItem_Args();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.style.NodeStyle <em>Node Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Node Style</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.NodeStyle
   * @generated
   */
  EEnum getNodeStyle();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.style.EdgeStyle <em>Edge Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Edge Style</em>'.
   * @see org.eclipse.gef.dot.internal.language.style.EdgeStyle
   * @generated
   */
  EEnum getEdgeStyle();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StyleFactory getStyleFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.style.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.style.impl.StyleImpl
     * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '<em><b>Style Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__STYLE_ITEMS = eINSTANCE.getStyle_StyleItems();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.style.impl.StyleItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.style.impl.StyleItemImpl
     * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getStyleItem()
     * @generated
     */
    EClass STYLE_ITEM = eINSTANCE.getStyleItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_ITEM__NAME = eINSTANCE.getStyleItem_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLE_ITEM__ARGS = eINSTANCE.getStyleItem_Args();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.style.NodeStyle <em>Node Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.style.NodeStyle
     * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getNodeStyle()
     * @generated
     */
    EEnum NODE_STYLE = eINSTANCE.getNodeStyle();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.style.EdgeStyle <em>Edge Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.style.EdgeStyle
     * @see org.eclipse.gef.dot.internal.language.style.impl.StylePackageImpl#getEdgeStyle()
     * @generated
     */
    EEnum EDGE_STYLE = eINSTANCE.getEdgeStyle();

  }

} //StylePackage
