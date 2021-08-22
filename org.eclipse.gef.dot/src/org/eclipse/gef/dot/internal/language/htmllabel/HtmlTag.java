/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#isSelfClosing <em>Self Closing</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getCloseName <em>Close Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag()
 * @model
 * @generated
 */
public interface HtmlTag extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<HtmlAttr> getAttributes();

  /**
   * Returns the value of the '<em><b>Self Closing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Self Closing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Self Closing</em>' attribute.
   * @see #setSelfClosing(boolean)
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag_SelfClosing()
   * @model
   * @generated
   */
  boolean isSelfClosing();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#isSelfClosing <em>Self Closing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Self Closing</em>' attribute.
   * @see #isSelfClosing()
   * @generated
   */
  void setSelfClosing(boolean value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag_Children()
   * @model containment="true"
   * @generated
   */
  EList<HtmlContent> getChildren();

  /**
   * Returns the value of the '<em><b>Close Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Close Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Close Name</em>' attribute.
   * @see #setCloseName(String)
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#getHtmlTag_CloseName()
   * @model
   * @generated
   */
  String getCloseName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag#getCloseName <em>Close Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Close Name</em>' attribute.
   * @see #getCloseName()
   * @generated
   */
  void setCloseName(String value);

} // HtmlTag
