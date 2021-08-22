/**
 */
package org.eclipse.gef.dot.internal.language.escstring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage
 * @generated
 */
public interface EscstringFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EscstringFactory eINSTANCE = org.eclipse.gef.dot.internal.language.escstring.impl.EscstringFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Esc String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Esc String</em>'.
   * @generated
   */
  EscString createEscString();

  /**
   * Returns a new object of class '<em>Justified Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Justified Text</em>'.
   * @generated
   */
  JustifiedText createJustifiedText();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EscstringPackage getEscstringPackage();

} //EscstringFactory
