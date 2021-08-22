/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.FeatureSpecifications#getFeatureSpecifications <em>Feature Specifications</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getFeatureSpecifications()
 * @model
 * @generated
 */
public interface FeatureSpecifications extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature Specifications</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.parsley.dsl.model.FeatureSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Specifications</em>' containment reference list.
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getFeatureSpecifications_FeatureSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<FeatureSpecification> getFeatureSpecifications();

} // FeatureSpecifications