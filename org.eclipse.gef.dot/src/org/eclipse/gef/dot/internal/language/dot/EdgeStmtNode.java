/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Stmt Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getEdgeStmtNode()
 * @model
 * @generated
 */
public interface EdgeStmtNode extends Stmt
{
  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(NodeId)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getEdgeStmtNode_Node()
   * @model containment="true"
   * @generated
   */
  NodeId getNode();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(NodeId value);

  /**
   * Returns the value of the '<em><b>Edge RHS</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.dot.EdgeRhs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge RHS</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge RHS</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getEdgeStmtNode_EdgeRHS()
   * @model containment="true"
   * @generated
   */
  EList<EdgeRhs> getEdgeRHS();

  /**
   * Returns the value of the '<em><b>Attr Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.dot.AttrList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Lists</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getEdgeStmtNode_AttrLists()
   * @model containment="true"
   * @generated
   */
  EList<AttrList> getAttrLists();

} // EdgeStmtNode
