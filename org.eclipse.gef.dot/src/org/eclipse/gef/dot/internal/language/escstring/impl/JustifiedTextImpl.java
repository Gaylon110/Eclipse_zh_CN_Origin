/**
 */
package org.eclipse.gef.dot.internal.language.escstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gef.dot.internal.language.escstring.EscstringPackage;
import org.eclipse.gef.dot.internal.language.escstring.Justification;
import org.eclipse.gef.dot.internal.language.escstring.JustifiedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Justified Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.impl.JustifiedTextImpl#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JustifiedTextImpl extends MinimalEObjectImpl.Container implements JustifiedText
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustification()
   * @generated
   * @ordered
   */
  protected static final Justification JUSTIFICATION_EDEFAULT = Justification.CENTERED;

  /**
   * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustification()
   * @generated
   * @ordered
   */
  protected Justification justification = JUSTIFICATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JustifiedTextImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EscstringPackage.Literals.JUSTIFIED_TEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EscstringPackage.JUSTIFIED_TEXT__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justification getJustification()
  {
    return justification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJustification(Justification newJustification)
  {
    Justification oldJustification = justification;
    justification = newJustification == null ? JUSTIFICATION_EDEFAULT : newJustification;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EscstringPackage.JUSTIFIED_TEXT__JUSTIFICATION, oldJustification, justification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EscstringPackage.JUSTIFIED_TEXT__TEXT:
        return getText();
      case EscstringPackage.JUSTIFIED_TEXT__JUSTIFICATION:
        return getJustification();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EscstringPackage.JUSTIFIED_TEXT__TEXT:
        setText((String)newValue);
        return;
      case EscstringPackage.JUSTIFIED_TEXT__JUSTIFICATION:
        setJustification((Justification)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EscstringPackage.JUSTIFIED_TEXT__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case EscstringPackage.JUSTIFIED_TEXT__JUSTIFICATION:
        setJustification(JUSTIFICATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EscstringPackage.JUSTIFIED_TEXT__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case EscstringPackage.JUSTIFIED_TEXT__JUSTIFICATION:
        return justification != JUSTIFICATION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (text: ");
    result.append(text);
    result.append(", justification: ");
    result.append(justification);
    result.append(')');
    return result.toString();
  }

} //JustifiedTextImpl
