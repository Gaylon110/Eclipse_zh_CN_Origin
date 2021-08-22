/**
 */
package org.eclipse.gef.dot.internal.language.rect;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.rect.RectPackage
 * @generated
 */
public interface RectFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RectFactory eINSTANCE = org.eclipse.gef.dot.internal.language.rect.impl.RectFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rect</em>'.
   * @generated
   */
  Rect createRect();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RectPackage getRectPackage();

} //RectFactory
