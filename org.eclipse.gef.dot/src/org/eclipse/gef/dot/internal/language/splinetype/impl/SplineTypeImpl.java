/**
 */
package org.eclipse.gef.dot.internal.language.splinetype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.splinetype.Spline;
import org.eclipse.gef.dot.internal.language.splinetype.SplineType;
import org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spline Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.splinetype.impl.SplineTypeImpl#getSplines <em>Splines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplineTypeImpl extends MinimalEObjectImpl.Container implements SplineType
{
  /**
   * The cached value of the '{@link #getSplines() <em>Splines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSplines()
   * @generated
   * @ordered
   */
  protected EList<Spline> splines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplineTypeImpl()
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
    return SplinetypePackage.Literals.SPLINE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Spline> getSplines()
  {
    if (splines == null)
    {
      splines = new EObjectContainmentEList<Spline>(Spline.class, this, SplinetypePackage.SPLINE_TYPE__SPLINES);
    }
    return splines;
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
      case SplinetypePackage.SPLINE_TYPE__SPLINES:
        return ((InternalEList<?>)getSplines()).basicRemove(otherEnd, msgs);
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
      case SplinetypePackage.SPLINE_TYPE__SPLINES:
        return getSplines();
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
      case SplinetypePackage.SPLINE_TYPE__SPLINES:
        getSplines().clear();
        getSplines().addAll((Collection<? extends Spline>)newValue);
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
      case SplinetypePackage.SPLINE_TYPE__SPLINES:
        getSplines().clear();
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
      case SplinetypePackage.SPLINE_TYPE__SPLINES:
        return splines != null && !splines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SplineTypeImpl
