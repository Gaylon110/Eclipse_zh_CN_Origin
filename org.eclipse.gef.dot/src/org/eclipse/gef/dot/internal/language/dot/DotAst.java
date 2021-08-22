/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.DotAst#getGraphs <em>Graphs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotAst()
 * @model
 * @generated
 */
public interface DotAst extends EObject
{
  /**
   * Returns the value of the '<em><b>Graphs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.gef.dot.internal.language.dot.DotGraph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graphs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphs</em>' containment reference list.
   * @see org.eclipse.gef.dot.internal.language.dot.DotPackage#getDotAst_Graphs()
   * @model containment="true"
   * @generated
   */
  EList<DotGraph> getGraphs();

} // DotAst
