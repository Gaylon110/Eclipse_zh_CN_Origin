/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Viewer Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.TableViewerContentProvider#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getTableViewerContentProvider()
 * @model
 * @generated
 */
public interface TableViewerContentProvider extends WithFields
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference.
   * @see #setElements(ContentProviderElements)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getTableViewerContentProvider_Elements()
   * @model containment="true"
   * @generated
   */
  ContentProviderElements getElements();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.TableViewerContentProvider#getElements <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elements</em>' containment reference.
   * @see #getElements()
   * @generated
   */
  void setElements(ContentProviderElements value);

} // TableViewerContentProvider