/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gef.dot.internal.language.terminals.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Subgraph#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.Subgraph#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getSubgraph()
 * @model
 * @generated
 */
public interface Subgraph extends SubgraphOrEdgeStmtSubgraph
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(ID)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getSubgraph_Name()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.Subgraph#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(ID value);

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.dot.Stmt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getSubgraph_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmts();

} // Subgraph
