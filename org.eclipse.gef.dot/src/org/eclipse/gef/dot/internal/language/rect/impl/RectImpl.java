/**
 */
package org.eclipse.gef.dot.internal.language.rect.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gef.dot.internal.language.rect.Rect;
import org.eclipse.gef.dot.internal.language.rect.RectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl#getLlx <em>Llx</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl#getLly <em>Lly</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl#getUrx <em>Urx</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.rect.impl.RectImpl#getUry <em>Ury</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectImpl extends MinimalEObjectImpl.Container implements Rect
{
  /**
   * The default value of the '{@link #getLlx() <em>Llx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLlx()
   * @generated
   * @ordered
   */
  protected static final double LLX_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getLlx() <em>Llx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLlx()
   * @generated
   * @ordered
   */
  protected double llx = LLX_EDEFAULT;

  /**
   * The default value of the '{@link #getLly() <em>Lly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLly()
   * @generated
   * @ordered
   */
  protected static final double LLY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getLly() <em>Lly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLly()
   * @generated
   * @ordered
   */
  protected double lly = LLY_EDEFAULT;

  /**
   * The default value of the '{@link #getUrx() <em>Urx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrx()
   * @generated
   * @ordered
   */
  protected static final double URX_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getUrx() <em>Urx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrx()
   * @generated
   * @ordered
   */
  protected double urx = URX_EDEFAULT;

  /**
   * The default value of the '{@link #getUry() <em>Ury</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUry()
   * @generated
   * @ordered
   */
  protected static final double URY_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getUry() <em>Ury</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUry()
   * @generated
   * @ordered
   */
  protected double ury = URY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RectImpl()
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
    return RectPackage.Literals.RECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getLlx()
  {
    return llx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLlx(double newLlx)
  {
    double oldLlx = llx;
    llx = newLlx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectPackage.RECT__LLX, oldLlx, llx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getLly()
  {
    return lly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLly(double newLly)
  {
    double oldLly = lly;
    lly = newLly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectPackage.RECT__LLY, oldLly, lly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getUrx()
  {
    return urx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrx(double newUrx)
  {
    double oldUrx = urx;
    urx = newUrx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectPackage.RECT__URX, oldUrx, urx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getUry()
  {
    return ury;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUry(double newUry)
  {
    double oldUry = ury;
    ury = newUry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RectPackage.RECT__URY, oldUry, ury));
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
      case RectPackage.RECT__LLX:
        return getLlx();
      case RectPackage.RECT__LLY:
        return getLly();
      case RectPackage.RECT__URX:
        return getUrx();
      case RectPackage.RECT__URY:
        return getUry();
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
      case RectPackage.RECT__LLX:
        setLlx((Double)newValue);
        return;
      case RectPackage.RECT__LLY:
        setLly((Double)newValue);
        return;
      case RectPackage.RECT__URX:
        setUrx((Double)newValue);
        return;
      case RectPackage.RECT__URY:
        setUry((Double)newValue);
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
      case RectPackage.RECT__LLX:
        setLlx(LLX_EDEFAULT);
        return;
      case RectPackage.RECT__LLY:
        setLly(LLY_EDEFAULT);
        return;
      case RectPackage.RECT__URX:
        setUrx(URX_EDEFAULT);
        return;
      case RectPackage.RECT__URY:
        setUry(URY_EDEFAULT);
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
      case RectPackage.RECT__LLX:
        return llx != LLX_EDEFAULT;
      case RectPackage.RECT__LLY:
        return lly != LLY_EDEFAULT;
      case RectPackage.RECT__URX:
        return urx != URX_EDEFAULT;
      case RectPackage.RECT__URY:
        return ury != URY_EDEFAULT;
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
    result.append(" (llx: ");
    result.append(llx);
    result.append(", lly: ");
    result.append(lly);
    result.append(", urx: ");
    result.append(urx);
    result.append(", ury: ");
    result.append(ury);
    result.append(')');
    return result.toString();
  }

} //RectImpl
