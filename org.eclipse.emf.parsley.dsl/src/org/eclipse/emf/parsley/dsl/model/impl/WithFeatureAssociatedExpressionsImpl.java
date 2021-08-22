/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.parsley.dsl.model.FeatureAssociatedExpression;
import org.eclipse.emf.parsley.dsl.model.ModelPackage;
import org.eclipse.emf.parsley.dsl.model.WithFeatureAssociatedExpressions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With Feature Associated Expressions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.impl.WithFeatureAssociatedExpressionsImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithFeatureAssociatedExpressionsImpl extends MinimalEObjectImpl.Container implements WithFeatureAssociatedExpressions
{
  /**
   * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifications()
   * @generated
   * @ordered
   */
  protected EList<FeatureAssociatedExpression> specifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WithFeatureAssociatedExpressionsImpl()
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
    return ModelPackage.Literals.WITH_FEATURE_ASSOCIATED_EXPRESSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureAssociatedExpression> getSpecifications()
  {
    if (specifications == null)
    {
      specifications = new EObjectContainmentEList<FeatureAssociatedExpression>(FeatureAssociatedExpression.class, this, ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS);
    }
    return specifications;
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
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS:
        return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS:
        return getSpecifications();
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
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS:
        getSpecifications().clear();
        getSpecifications().addAll((Collection<? extends FeatureAssociatedExpression>)newValue);
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
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS:
        getSpecifications().clear();
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
      case ModelPackage.WITH_FEATURE_ASSOCIATED_EXPRESSIONS__SPECIFICATIONS:
        return specifications != null && !specifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WithFeatureAssociatedExpressionsImpl