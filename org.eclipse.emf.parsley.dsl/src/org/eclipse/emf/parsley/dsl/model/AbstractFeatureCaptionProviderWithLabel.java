/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Caption Provider With Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel#getFeatureTexts <em>Feature Texts</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel#getFeatureLabels <em>Feature Labels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getAbstractFeatureCaptionProviderWithLabel()
 * @model
 * @generated
 */
public interface AbstractFeatureCaptionProviderWithLabel extends WithFields
{
  /**
   * Returns the value of the '<em><b>Feature Texts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Texts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Texts</em>' containment reference.
   * @see #setFeatureTexts(FeatureTexts)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getAbstractFeatureCaptionProviderWithLabel_FeatureTexts()
   * @model containment="true"
   * @generated
   */
  FeatureTexts getFeatureTexts();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel#getFeatureTexts <em>Feature Texts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Texts</em>' containment reference.
   * @see #getFeatureTexts()
   * @generated
   */
  void setFeatureTexts(FeatureTexts value);

  /**
   * Returns the value of the '<em><b>Feature Labels</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Labels</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Labels</em>' containment reference.
   * @see #setFeatureLabels(FeatureLabels)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getAbstractFeatureCaptionProviderWithLabel_FeatureLabels()
   * @model containment="true"
   * @generated
   */
  FeatureLabels getFeatureLabels();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.AbstractFeatureCaptionProviderWithLabel#getFeatureLabels <em>Feature Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Labels</em>' containment reference.
   * @see #getFeatureLabels()
   * @generated
   */
  void setFeatureLabels(FeatureLabels value);

} // AbstractFeatureCaptionProviderWithLabel