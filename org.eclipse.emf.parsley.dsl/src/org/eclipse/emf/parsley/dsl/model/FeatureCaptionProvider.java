/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Caption Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.FeatureCaptionProvider#getFeatureTexts <em>Feature Texts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getFeatureCaptionProvider()
 * @model
 * @generated
 */
public interface FeatureCaptionProvider extends WithFields
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
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getFeatureCaptionProvider_FeatureTexts()
   * @model containment="true"
   * @generated
   */
  FeatureTexts getFeatureTexts();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.FeatureCaptionProvider#getFeatureTexts <em>Feature Texts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Texts</em>' containment reference.
   * @see #getFeatureTexts()
   * @generated
   */
  void setFeatureTexts(FeatureTexts value);

} // FeatureCaptionProvider