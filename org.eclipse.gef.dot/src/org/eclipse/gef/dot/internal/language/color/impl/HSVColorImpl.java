/**
 */
package org.eclipse.gef.dot.internal.language.color.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gef.dot.internal.language.color.ColorPackage;
import org.eclipse.gef.dot.internal.language.color.HSVColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSV Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl#getH <em>H</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl#getS <em>S</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.color.impl.HSVColorImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HSVColorImpl extends ColorImpl implements HSVColor
{
  /**
   * The default value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected static final String H_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected String h = H_EDEFAULT;

  /**
   * The default value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected static final String S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getS() <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getS()
   * @generated
   * @ordered
   */
  protected String s = S_EDEFAULT;

  /**
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected static final String V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected String v = V_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HSVColorImpl()
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
    return ColorPackage.Literals.HSV_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getH()
  {
    return h;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setH(String newH)
  {
    String oldH = h;
    h = newH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColorPackage.HSV_COLOR__H, oldH, h));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getS()
  {
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setS(String newS)
  {
    String oldS = s;
    s = newS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColorPackage.HSV_COLOR__S, oldS, s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(String newV)
  {
    String oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColorPackage.HSV_COLOR__V, oldV, v));
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
      case ColorPackage.HSV_COLOR__H:
        return getH();
      case ColorPackage.HSV_COLOR__S:
        return getS();
      case ColorPackage.HSV_COLOR__V:
        return getV();
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
      case ColorPackage.HSV_COLOR__H:
        setH((String)newValue);
        return;
      case ColorPackage.HSV_COLOR__S:
        setS((String)newValue);
        return;
      case ColorPackage.HSV_COLOR__V:
        setV((String)newValue);
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
      case ColorPackage.HSV_COLOR__H:
        setH(H_EDEFAULT);
        return;
      case ColorPackage.HSV_COLOR__S:
        setS(S_EDEFAULT);
        return;
      case ColorPackage.HSV_COLOR__V:
        setV(V_EDEFAULT);
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
      case ColorPackage.HSV_COLOR__H:
        return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
      case ColorPackage.HSV_COLOR__S:
        return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
      case ColorPackage.HSV_COLOR__V:
        return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
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
    result.append(" (h: ");
    result.append(h);
    result.append(", s: ");
    result.append(s);
    result.append(", v: ");
    result.append(v);
    result.append(')');
    return result.toString();
  }

} //HSVColorImpl
