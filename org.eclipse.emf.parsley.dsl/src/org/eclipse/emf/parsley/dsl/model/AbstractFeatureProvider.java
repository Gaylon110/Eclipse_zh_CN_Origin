/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureProvider#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getAbstractFeatureProvider()
 * @model
 * @generated
 */
public interface AbstractFeatureProvider extends WithFields
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference.
   * @see #setFeatures(FeatureSpecifications)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getAbstractFeatureProvider_Features()
   * @model containment="true"
   * @generated
   */
  FeatureSpecifications getFeatures();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureProvider#getFeatures <em>Features</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features</em>' containment reference.
   * @see #getFeatures()
   * @generated
   */
  void setFeatures(FeatureSpecifications value);

} // AbstractFeatureProvider