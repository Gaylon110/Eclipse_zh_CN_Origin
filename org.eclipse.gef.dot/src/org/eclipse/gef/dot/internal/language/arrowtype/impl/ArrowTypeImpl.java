/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowType;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowTypeImpl#getArrowShapes <em>Arrow Shapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowTypeImpl extends MinimalEObjectImpl.Container implements ArrowType
{
  /**
   * The cached value of the '{@link #getArrowShapes() <em>Arrow Shapes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrowShapes()
   * @generated
   * @ordered
   */
  protected EList<AbstractArrowShape> arrowShapes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrowTypeImpl()
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
    return ArrowtypePackage.Literals.ARROW_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractArrowShape> getArrowShapes()
  {
    if (arrowShapes == null)
    {
      arrowShapes = new EObjectContainmentEList<AbstractArrowShape>(AbstractArrowShape.class, this, ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES);
    }
    return arrowShapes;
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
      case ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES:
        return ((InternalEList<?>)getArrowShapes()).basicRemove(otherEnd, msgs);
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
      case ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES:
        return getArrowShapes();
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
      case ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES:
        getArrowShapes().clear();
        getArrowShapes().addAll((Collection<? extends AbstractArrowShape>)newValue);
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
      case ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES:
        getArrowShapes().clear();
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
      case ArrowtypePackage.ARROW_TYPE__ARROW_SHAPES:
        return arrowShapes != null && !arrowShapes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrowTypeImpl
