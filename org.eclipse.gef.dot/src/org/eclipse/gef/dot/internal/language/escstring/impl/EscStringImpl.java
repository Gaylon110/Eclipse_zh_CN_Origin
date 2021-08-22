/**
 */
package org.eclipse.gef.dot.internal.language.escstring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.escstring.EscString;
import org.eclipse.gef.dot.internal.language.escstring.EscstringPackage;
import org.eclipse.gef.dot.internal.language.escstring.JustifiedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Esc String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.escstring.impl.EscStringImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EscStringImpl extends MinimalEObjectImpl.Container implements EscString
{
  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList<JustifiedText> lines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EscStringImpl()
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
    return EscstringPackage.Literals.ESC_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JustifiedText> getLines()
  {
    if (lines == null)
    {
      lines = new EObjectContainmentEList<JustifiedText>(JustifiedText.class, this, EscstringPackage.ESC_STRING__LINES);
    }
    return lines;
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
      case EscstringPackage.ESC_STRING__LINES:
        return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
      case EscstringPackage.ESC_STRING__LINES:
        return getLines();
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
      case EscstringPackage.ESC_STRING__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends JustifiedText>)newValue);
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
      case EscstringPackage.ESC_STRING__LINES:
        getLines().clear();
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
      case EscstringPackage.ESC_STRING__LINES:
        return lines != null && !lines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EscStringImpl
