/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.ResourceManager#getInitializeBody <em>Initialize Body</em>}</li>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.ResourceManager#getSaveBody <em>Save Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getResourceManager()
 * @model
 * @generated
 */
public interface ResourceManager extends WithFields
{
  /**
   * Returns the value of the '<em><b>Initialize Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialize Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialize Body</em>' containment reference.
   * @see #setInitializeBody(SimpleMethodSpecification)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getResourceManager_InitializeBody()
   * @model containment="true"
   * @generated
   */
  SimpleMethodSpecification getInitializeBody();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.ResourceManager#getInitializeBody <em>Initialize Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialize Body</em>' containment reference.
   * @see #getInitializeBody()
   * @generated
   */
  void setInitializeBody(SimpleMethodSpecification value);

  /**
   * Returns the value of the '<em><b>Save Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Save Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Save Body</em>' containment reference.
   * @see #setSaveBody(SimpleMethodSpecification)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getResourceManager_SaveBody()
   * @model containment="true"
   * @generated
   */
  SimpleMethodSpecification getSaveBody();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.ResourceManager#getSaveBody <em>Save Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Save Body</em>' containment reference.
   * @see #getSaveBody()
   * @generated
   */
  void setSaveBody(SimpleMethodSpecification value);

} // ResourceManager