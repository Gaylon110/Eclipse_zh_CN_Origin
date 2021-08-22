/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.dot.internal.language.terminals.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotGraph()
 * @model
 * @generated
 */
public interface DotGraph extends EObject
{
  /**
   * Returns the value of the '<em><b>Strict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Strict</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strict</em>' attribute.
   * @see #setStrict(boolean)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotGraph_Strict()
   * @model
   * @generated
   */
  boolean isStrict();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#isStrict <em>Strict</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strict</em>' attribute.
   * @see #isStrict()
   * @generated
   */
  void setStrict(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gef.dot.internal.language.dot.GraphType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.dot.GraphType
   * @see #setType(GraphType)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotGraph_Type()
   * @model
   * @generated
   */
  GraphType getType();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.dot.GraphType
   * @see #getType()
   * @generated
   */
  void setType(GraphType value);

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
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotGraph_Name()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getName <em>Name</em>}' attribute.
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
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotGraph_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStmts();

} // DotGraph
