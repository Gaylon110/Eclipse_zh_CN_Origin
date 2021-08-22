/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlContent()
 * @model
 * @generated
 */
public interface HtmlContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' containment reference.
   * @see #setTag(HtmlTag)
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlContent_Tag()
   * @model containment="true"
   * @generated
   */
  HtmlTag getTag();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getTag <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' containment reference.
   * @see #getTag()
   * @generated
   */
  void setTag(HtmlTag value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlContent_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // HtmlContent
