/**
 */
package org.eclipse.gef.dot.internal.language.style.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.style.Style;
import org.eclipse.gef.dot.internal.language.style.StyleItem;
import org.eclipse.gef.dot.internal.language.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.style.impl.StyleImpl#getStyleItems <em>Style Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style
{
  /**
   * The cached value of the '{@link #getStyleItems() <em>Style Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyleItems()
   * @generated
   * @ordered
   */
  protected EList<StyleItem> styleItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleImpl()
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
    return StylePackage.Literals.STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StyleItem> getStyleItems()
  {
    if (styleItems == null)
    {
      styleItems = new EObjectContainmentEList<StyleItem>(StyleItem.class, this, StylePackage.STYLE__STYLE_ITEMS);
    }
    return styleItems;
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
      case StylePackage.STYLE__STYLE_ITEMS:
        return ((InternalEList<?>)getStyleItems()).basicRemove(otherEnd, msgs);
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
      case StylePackage.STYLE__STYLE_ITEMS:
        return getStyleItems();
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
      case StylePackage.STYLE__STYLE_ITEMS:
        getStyleItems().clear();
        getStyleItems().addAll((Collection<? extends StyleItem>)newValue);
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
      case StylePackage.STYLE__STYLE_ITEMS:
        getStyleItems().clear();
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
      case StylePackage.STYLE__STYLE_ITEMS:
        return styleItems != null && !styleItems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StyleImpl
