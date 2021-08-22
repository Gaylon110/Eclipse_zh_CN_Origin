/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage
 * @generated
 */
public interface HtmllabelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HtmllabelFactory eINSTANCE = org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmllabelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Html Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Html Label</em>'.
   * @generated
   */
  HtmlLabel createHtmlLabel();

  /**
   * Returns a new object of class '<em>Html Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Html Content</em>'.
   * @generated
   */
  HtmlContent createHtmlContent();

  /**
   * Returns a new object of class '<em>Html Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Html Tag</em>'.
   * @generated
   */
  HtmlTag createHtmlTag();

  /**
   * Returns a new object of class '<em>Html Attr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Html Attr</em>'.
   * @generated
   */
  HtmlAttr createHtmlAttr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HtmllabelPackage getHtmllabelPackage();

} //HtmllabelFactory
