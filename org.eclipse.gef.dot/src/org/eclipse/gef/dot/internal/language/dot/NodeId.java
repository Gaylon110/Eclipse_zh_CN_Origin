/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.dot.internal.language.terminals.ID;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getNodeId()
 * @model
 * @generated
 */
public interface NodeId extends EObject
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
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getNodeId_Name()
   * @model dataType="org.eclipse.gef.dot.internal.language.terminals.ID"
   * @generated
   */
  ID getName();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(ID value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(Port)
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getNodeId_Port()
   * @model containment="true"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

} // NodeId
