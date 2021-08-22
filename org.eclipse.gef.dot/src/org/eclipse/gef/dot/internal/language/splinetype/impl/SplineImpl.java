/**
 */
package org.eclipse.gef.dot.internal.language.splinetype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.point.Point;

import org.eclipse.gef.dot.internal.language.splinetype.Spline;
import org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl#getStartp <em>Startp</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl#getEndp <em>Endp</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineImpl#getControlPoints <em>Control Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplineImpl extends MinimalEObjectImpl.Container implements Spline
{
  /**
   * The cached value of the '{@link #getStartp() <em>Startp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartp()
   * @generated
   * @ordered
   */
  protected Point startp;

  /**
   * The cached value of the '{@link #getEndp() <em>Endp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndp()
   * @generated
   * @ordered
   */
  protected Point endp;

  /**
   * The cached value of the '{@link #getControlPoints() <em>Control Points</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControlPoints()
   * @generated
   * @ordered
   */
  protected EList<Point> controlPoints;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplineImpl()
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
    return SplinetypePackage.Literals.SPLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getStartp()
  {
    return startp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartp(Point newStartp, NotificationChain msgs)
  {
    Point oldStartp = startp;
    startp = newStartp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SplinetypePackage.SPLINE__STARTP, oldStartp, newStartp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartp(Point newStartp)
  {
    if (newStartp != startp)
    {
      NotificationChain msgs = null;
      if (startp != null)
        msgs = ((InternalEObject)startp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SplinetypePackage.SPLINE__STARTP, null, msgs);
      if (newStartp != null)
        msgs = ((InternalEObject)newStartp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SplinetypePackage.SPLINE__STARTP, null, msgs);
      msgs = basicSetStartp(newStartp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplinetypePackage.SPLINE__STARTP, newStartp, newStartp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getEndp()
  {
    return endp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndp(Point newEndp, NotificationChain msgs)
  {
    Point oldEndp = endp;
    endp = newEndp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SplinetypePackage.SPLINE__ENDP, oldEndp, newEndp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndp(Point newEndp)
  {
    if (newEndp != endp)
    {
      NotificationChain msgs = null;
      if (endp != null)
        msgs = ((InternalEObject)endp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SplinetypePackage.SPLINE__ENDP, null, msgs);
      if (newEndp != null)
        msgs = ((InternalEObject)newEndp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SplinetypePackage.SPLINE__ENDP, null, msgs);
      msgs = basicSetEndp(newEndp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplinetypePackage.SPLINE__ENDP, newEndp, newEndp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Point> getControlPoints()
  {
    if (controlPoints == null)
    {
      controlPoints = new EObjectContainmentEList<Point>(Point.class, this, SplinetypePackage.SPLINE__CONTROL_POINTS);
    }
    return controlPoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SplinetypePackage.SPLINE__STARTP:
        return basicSetStartp(null, msgs);
      case SplinetypePackage.SPLINE__ENDP:
        return basicSetEndp(null, msgs);
      case SplinetypePackage.SPLINE__CONTROL_POINTS:
        return ((InternalEList<?>)getControlPoints()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SplinetypePackage.SPLINE__STARTP:
        return getStartp();
      case SplinetypePackage.SPLINE__ENDP:
        return getEndp();
      case SplinetypePackage.SPLINE__CONTROL_POINTS:
        return getControlPoints();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SplinetypePackage.SPLINE__STARTP:
        setStartp((Point)newValue);
        return;
      case SplinetypePackage.SPLINE__ENDP:
        setEndp((Point)newValue);
        return;
      case SplinetypePackage.SPLINE__CONTROL_POINTS:
        getControlPoints().clear();
        getControlPoints().addAll((Collection<? extends Point>)newValue);
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
      case SplinetypePackage.SPLINE__STARTP:
        setStartp((Point)null);
        return;
      case SplinetypePackage.SPLINE__ENDP:
        setEndp((Point)null);
        return;
      case SplinetypePackage.SPLINE__CONTROL_POINTS:
        getControlPoints().clear();
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
      case SplinetypePackage.SPLINE__STARTP:
        return startp != null;
      case SplinetypePackage.SPLINE__ENDP:
        return endp != null;
      case SplinetypePackage.SPLINE__CONTROL_POINTS:
        return controlPoints != null && !controlPoints.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SplineImpl
