/**
 * generated by Xtext 2.12.0
 */
package org.eclipse.emf.parsley.dsl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Extends Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.parsley.dsl.model.WithExtendsClause#getExtendsClause <em>Extends Clause</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getWithExtendsClause()
 * @model
 * @generated
 */
public interface WithExtendsClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Extends Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends Clause</em>' containment reference.
   * @see #setExtendsClause(ExtendsClause)
   * @see org.eclipse.emf.parsley.dsl.model.ModelPackage#getWithExtendsClause_ExtendsClause()
   * @model containment="true"
   * @generated
   */
  ExtendsClause getExtendsClause();

  /**
   * Sets the value of the '{@link org.eclipse.emf.parsley.dsl.model.WithExtendsClause#getExtendsClause <em>Extends Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends Clause</em>' containment reference.
   * @see #getExtendsClause()
   * @generated
   */
  void setExtendsClause(ExtendsClause value);

} // WithExtendsClause
