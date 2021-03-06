/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.parsley.dsl.model.ExtendsClause;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.WithExtendsClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Extends Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.WithExtendsClauseImpl#getExtendsClause <em>Extends Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithExtendsClauseImpl extends MinimalEObjectImpl.Container implements WithExtendsClause
{
  /**
   * The cached value of the '{@link #getExtendsClause() <em>Extends Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsClause()
   * @generated
   * @ordered
   */
  protected ExtendsClause extendsClause;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithExtendsClauseImpl()
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
    return ModelPackage.Literals.WITH_EXTENDS_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendsClause getExtendsClause()
  {
    return extendsClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtendsClause(ExtendsClause newExtendsClause, NotificationChain msgs)
  {
    ExtendsClause oldExtendsClause = extendsClause;
    extendsClause = newExtendsClause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE, oldExtendsClause, newExtendsClause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtendsClause(ExtendsClause newExtendsClause)
  {
    if (newExtendsClause != extendsClause)
    {
      NotificationChain msgs = null;
      if (extendsClause != null)
        msgs = ((InternalEObject)extendsClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE, null, msgs);
      if (newExtendsClause != null)
        msgs = ((InternalEObject)newExtendsClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE, null, msgs);
      msgs = basicSetExtendsClause(newExtendsClause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE, newExtendsClause, newExtendsClause));
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
      case ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE:
        return basicSetExtendsClause(null, msgs);
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
      case ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE:
        return getExtendsClause();
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
      case ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE:
        setExtendsClause((ExtendsClause)newValue);
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
      case ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE:
        setExtendsClause((ExtendsClause)null);
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
      case ModelPackage.WITH_EXTENDS_CLAUSE__EXTENDS_CLAUSE:
        return extendsClause != null;
    }
    return super.eIsSet(featureID);
  }

} //WithExtendsClauseImpl
