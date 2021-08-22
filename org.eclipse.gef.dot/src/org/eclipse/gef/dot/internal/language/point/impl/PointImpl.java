/**
 */
package org.eclipse.gef.dot.internal.language.point.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gef.dot.internal.language.point.Point;
import org.eclipse.gef.dot.internal.language.point.PointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.point.impl.PointImpl#isInputOnly <em>Input Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final double X_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected double x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final double Y_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected double y = Y_EDEFAULT;

  /**
   * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected static final double Z_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZ()
   * @generated
   * @ordered
   */
  protected double z = Z_EDEFAULT;

  /**
   * The default value of the '{@link #isInputOnly() <em>Input Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInputOnly()
   * @generated
   * @ordered
   */
  protected static final boolean INPUT_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInputOnly() <em>Input Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInputOnly()
   * @generated
   * @ordered
   */
  protected boolean inputOnly = INPUT_ONLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointImpl()
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
    return PointPackage.Literals.POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(double newX)
  {
    double oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointPackage.POINT__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(double newY)
  {
    double oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointPackage.POINT__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getZ()
  {
    return z;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZ(double newZ)
  {
    double oldZ = z;
    z = newZ;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointPackage.POINT__Z, oldZ, z));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInputOnly()
  {
    return inputOnly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputOnly(boolean newInputOnly)
  {
    boolean oldInputOnly = inputOnly;
    inputOnly = newInputOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointPackage.POINT__INPUT_ONLY, oldInputOnly, inputOnly));
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
      case PointPackage.POINT__X:
        return getX();
      case PointPackage.POINT__Y:
        return getY();
      case PointPackage.POINT__Z:
        return getZ();
      case PointPackage.POINT__INPUT_ONLY:
        return isInputOnly();
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
      case PointPackage.POINT__X:
        setX((Double)newValue);
        return;
      case PointPackage.POINT__Y:
        setY((Double)newValue);
        return;
      case PointPackage.POINT__Z:
        setZ((Double)newValue);
        return;
      case PointPackage.POINT__INPUT_ONLY:
        setInputOnly((Boolean)newValue);
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
      case PointPackage.POINT__X:
        setX(X_EDEFAULT);
        return;
      case PointPackage.POINT__Y:
        setY(Y_EDEFAULT);
        return;
      case PointPackage.POINT__Z:
        setZ(Z_EDEFAULT);
        return;
      case PointPackage.POINT__INPUT_ONLY:
        setInputOnly(INPUT_ONLY_EDEFAULT);
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
      case PointPackage.POINT__X:
        return x != X_EDEFAULT;
      case PointPackage.POINT__Y:
        return y != Y_EDEFAULT;
      case PointPackage.POINT__Z:
        return z != Z_EDEFAULT;
      case PointPackage.POINT__INPUT_ONLY:
        return inputOnly != INPUT_ONLY_EDEFAULT;
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(", z: ");
    result.append(z);
    result.append(", inputOnly: ");
    result.append(inputOnly);
    result.append(')');
    return result.toString();
  }

} //PointImpl
