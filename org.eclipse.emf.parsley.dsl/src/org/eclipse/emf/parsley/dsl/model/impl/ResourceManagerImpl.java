/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.ResourceManager;
import org.eclipse.emf.parsley.dsl.model.SimpleMethodSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.ResourceManagerImpl#getInitializeBody <em>Initialize Body</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.ResourceManagerImpl#getSaveBody <em>Save Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceManagerImpl extends WithFieldsImpl implements ResourceManager
{
  /**
   * The cached value of the '{@link #getInitializeBody() <em>Initialize Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializeBody()
   * @generated
   * @ordered
   */
  protected SimpleMethodSpecification initializeBody;

  /**
   * The cached value of the '{@link #getSaveBody() <em>Save Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaveBody()
   * @generated
   * @ordered
   */
  protected SimpleMethodSpecification saveBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceManagerImpl()
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
    return ModelPackage.Literals.RESOURCE_MANAGER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMethodSpecification getInitializeBody()
  {
    return initializeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitializeBody(SimpleMethodSpecification newInitializeBody, NotificationChain msgs)
  {
    SimpleMethodSpecification oldInitializeBody = initializeBody;
    initializeBody = newInitializeBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY, oldInitializeBody, newInitializeBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitializeBody(SimpleMethodSpecification newInitializeBody)
  {
    if (newInitializeBody != initializeBody)
    {
      NotificationChain msgs = null;
      if (initializeBody != null)
        msgs = ((InternalEObject)initializeBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY, null, msgs);
      if (newInitializeBody != null)
        msgs = ((InternalEObject)newInitializeBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY, null, msgs);
      msgs = basicSetInitializeBody(newInitializeBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY, newInitializeBody, newInitializeBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMethodSpecification getSaveBody()
  {
    return saveBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSaveBody(SimpleMethodSpecification newSaveBody, NotificationChain msgs)
  {
    SimpleMethodSpecification oldSaveBody = saveBody;
    saveBody = newSaveBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_MANAGER__SAVE_BODY, oldSaveBody, newSaveBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSaveBody(SimpleMethodSpecification newSaveBody)
  {
    if (newSaveBody != saveBody)
    {
      NotificationChain msgs = null;
      if (saveBody != null)
        msgs = ((InternalEObject)saveBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_MANAGER__SAVE_BODY, null, msgs);
      if (newSaveBody != null)
        msgs = ((InternalEObject)newSaveBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESOURCE_MANAGER__SAVE_BODY, null, msgs);
      msgs = basicSetSaveBody(newSaveBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESOURCE_MANAGER__SAVE_BODY, newSaveBody, newSaveBody));
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
      case ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY:
        return basicSetInitializeBody(null, msgs);
      case ModelPackage.RESOURCE_MANAGER__SAVE_BODY:
        return basicSetSaveBody(null, msgs);
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
      case ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY:
        return getInitializeBody();
      case ModelPackage.RESOURCE_MANAGER__SAVE_BODY:
        return getSaveBody();
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
      case ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY:
        setInitializeBody((SimpleMethodSpecification)newValue);
        return;
      case ModelPackage.RESOURCE_MANAGER__SAVE_BODY:
        setSaveBody((SimpleMethodSpecification)newValue);
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
      case ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY:
        setInitializeBody((SimpleMethodSpecification)null);
        return;
      case ModelPackage.RESOURCE_MANAGER__SAVE_BODY:
        setSaveBody((SimpleMethodSpecification)null);
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
      case ModelPackage.RESOURCE_MANAGER__INITIALIZE_BODY:
        return initializeBody != null;
      case ModelPackage.RESOURCE_MANAGER__SAVE_BODY:
        return saveBody != null;
    }
    return super.eIsSet(featureID);
  }

} //ResourceManagerImpl
