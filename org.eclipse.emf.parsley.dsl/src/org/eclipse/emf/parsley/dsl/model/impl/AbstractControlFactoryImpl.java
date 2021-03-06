/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.parsley.dsl.model.AbstractControlFactory;
import org.eclipse.emf.parsley.dsl.model.ControlFactorySpecifications;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Control Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.AbstractControlFactoryImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractControlFactoryImpl extends WithFieldsImpl implements AbstractControlFactory
{
  /**
   * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControls()
   * @generated
   * @ordered
   */
  protected ControlFactorySpecifications controls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractControlFactoryImpl()
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
    return ModelPackage.Literals.ABSTRACT_CONTROL_FACTORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControlFactorySpecifications getControls()
  {
    return controls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetControls(ControlFactorySpecifications newControls, NotificationChain msgs)
  {
    ControlFactorySpecifications oldControls = controls;
    controls = newControls;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS, oldControls, newControls);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControls(ControlFactorySpecifications newControls)
  {
    if (newControls != controls)
    {
      NotificationChain msgs = null;
      if (controls != null)
        msgs = ((InternalEObject)controls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS, null, msgs);
      if (newControls != null)
        msgs = ((InternalEObject)newControls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS, null, msgs);
      msgs = basicSetControls(newControls, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS, newControls, newControls));
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
      case ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS:
        return basicSetControls(null, msgs);
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
      case ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS:
        return getControls();
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
      case ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS:
        setControls((ControlFactorySpecifications)newValue);
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
      case ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS:
        setControls((ControlFactorySpecifications)null);
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
      case ModelPackage.ABSTRACT_CONTROL_FACTORY__CONTROLS:
        return controls != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractControlFactoryImpl
