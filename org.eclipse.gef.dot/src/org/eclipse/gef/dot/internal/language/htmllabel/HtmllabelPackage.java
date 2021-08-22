/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelFactory
 * @model kind="package"
 * @generated
 */
public interface HtmllabelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "htmllabel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotHtmlLabel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "htmllabel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HtmllabelPackage eINSTANCE = org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlLabelImpl <em>Html Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlLabelImpl
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlLabel()
   * @generated
   */
  int HTML_LABEL = 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_LABEL__PARTS = 0;

  /**
   * The number of structural features of the '<em>Html Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_LABEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlContentImpl <em>Html Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlContentImpl
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlContent()
   * @generated
   */
  int HTML_CONTENT = 1;

  /**
   * The feature id for the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_CONTENT__TAG = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_CONTENT__TEXT = 1;

  /**
   * The number of structural features of the '<em>Html Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_CONTENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl <em>Html Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlTag()
   * @generated
   */
  int HTML_TAG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Self Closing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG__SELF_CLOSING = 2;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG__CHILDREN = 3;

  /**
   * The feature id for the '<em><b>Close Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG__CLOSE_NAME = 4;

  /**
   * The number of structural features of the '<em>Html Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_TAG_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlAttrImpl <em>Html Attr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlAttrImpl
   * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlAttr()
   * @generated
   */
  int HTML_ATTR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_ATTR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_ATTR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Html Attr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTML_ATTR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel <em>Html Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Html Label</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel
   * @generated
   */
  EClass getHtmlLabel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel#getParts()
   * @see #getHtmlLabel()
   * @generated
   */
  EReference getHtmlLabel_Parts();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent <em>Html Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Html Content</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent
   * @generated
   */
  EClass getHtmlContent();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getTag()
   * @see #getHtmlContent()
   * @generated
   */
  EReference getHtmlContent_Tag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getText()
   * @see #getHtmlContent()
   * @generated
   */
  EAttribute getHtmlContent_Text();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag <em>Html Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Html Tag</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag
   * @generated
   */
  EClass getHtmlTag();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getName()
   * @see #getHtmlTag()
   * @generated
   */
  EAttribute getHtmlTag_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getAttributes()
   * @see #getHtmlTag()
   * @generated
   */
  EReference getHtmlTag_Attributes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#isSelfClosing <em>Self Closing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Self Closing</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#isSelfClosing()
   * @see #getHtmlTag()
   * @generated
   */
  EAttribute getHtmlTag_SelfClosing();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getChildren()
   * @see #getHtmlTag()
   * @generated
   */
  EReference getHtmlTag_Children();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getCloseName <em>Close Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Close Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getCloseName()
   * @see #getHtmlTag()
   * @generated
   */
  EAttribute getHtmlTag_CloseName();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr <em>Html Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Html Attr</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr
   * @generated
   */
  EClass getHtmlAttr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr#getName()
   * @see #getHtmlAttr()
   * @generated
   */
  EAttribute getHtmlAttr_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr#getValue()
   * @see #getHtmlAttr()
   * @generated
   */
  EAttribute getHtmlAttr_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HtmllabelFactory getHtmllabelFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlLabelImpl <em>Html Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlLabelImpl
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlLabel()
     * @generated
     */
    EClass HTML_LABEL = eINSTANCE.getHtmlLabel();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTML_LABEL__PARTS = eINSTANCE.getHtmlLabel_Parts();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlContentImpl <em>Html Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlContentImpl
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlContent()
     * @generated
     */
    EClass HTML_CONTENT = eINSTANCE.getHtmlContent();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTML_CONTENT__TAG = eINSTANCE.getHtmlContent_Tag();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_CONTENT__TEXT = eINSTANCE.getHtmlContent_Text();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl <em>Html Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlTag()
     * @generated
     */
    EClass HTML_TAG = eINSTANCE.getHtmlTag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_TAG__NAME = eINSTANCE.getHtmlTag_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTML_TAG__ATTRIBUTES = eINSTANCE.getHtmlTag_Attributes();

    /**
     * The meta object literal for the '<em><b>Self Closing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_TAG__SELF_CLOSING = eINSTANCE.getHtmlTag_SelfClosing();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTML_TAG__CHILDREN = eINSTANCE.getHtmlTag_Children();

    /**
     * The meta object literal for the '<em><b>Close Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_TAG__CLOSE_NAME = eINSTANCE.getHtmlTag_CloseName();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlAttrImpl <em>Html Attr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlAttrImpl
     * @see org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelPackageImpl#getHtmlAttr()
     * @generated
     */
    EClass HTML_ATTR = eINSTANCE.getHtmlAttr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_ATTR__NAME = eINSTANCE.getHtmlAttr_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTML_ATTR__VALUE = eINSTANCE.getHtmlAttr_Value();

  }

} //HtmllabelPackage
