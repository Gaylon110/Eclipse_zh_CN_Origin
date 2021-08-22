/**
 */
package org.eclipse.gef.dot.internal.language.escstring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justified Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#getJustifiedText()
 * @model
 * @generated
 */
public interface JustifiedText extends EObject
{
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
   * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#getJustifiedText_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Justification</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gef.dot.internal.language.escstring.Justification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justification</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justification</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.escstring.Justification
   * @see #setJustification(Justification)
   * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#getJustifiedText_Justification()
   * @model
   * @generated
   */
  Justification getJustification();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.escstring.JustifiedText#getJustification <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justification</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.escstring.Justification
   * @see #getJustification()
   * @generated
   */
  void setJustification(Justification value);

} // JustifiedText
