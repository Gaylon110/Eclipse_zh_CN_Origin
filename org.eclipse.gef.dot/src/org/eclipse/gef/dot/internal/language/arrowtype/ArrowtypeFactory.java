/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage
 * @generated
 */
public interface ArrowtypeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArrowtypeFactory eINSTANCE = org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Arrow Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Type</em>'.
   * @generated
   */
  ArrowType createArrowType();

  /**
   * Returns a new object of class '<em>Abstract Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Arrow Shape</em>'.
   * @generated
   */
  AbstractArrowShape createAbstractArrowShape();

  /**
   * Returns a new object of class '<em>Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arrow Shape</em>'.
   * @generated
   */
  ArrowShape createArrowShape();

  /**
   * Returns a new object of class '<em>Deprecated Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deprecated Arrow Shape</em>'.
   * @generated
   */
  DeprecatedArrowShape createDeprecatedArrowShape();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArrowtypePackage getArrowtypePackage();

} //ArrowtypeFactory
