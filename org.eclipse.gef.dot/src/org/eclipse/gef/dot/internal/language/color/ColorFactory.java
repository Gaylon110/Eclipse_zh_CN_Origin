/**
 */
package org.eclipse.gef.dot.internal.language.color;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.color.ColorPackage
 * @generated
 */
public interface ColorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ColorFactory eINSTANCE = org.eclipse.gef.dot.internal.language.color.impl.ColorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color</em>'.
   * @generated
   */
  Color createColor();

  /**
   * Returns a new object of class '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RGB Color</em>'.
   * @generated
   */
  RGBColor createRGBColor();

  /**
   * Returns a new object of class '<em>HSV Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HSV Color</em>'.
   * @generated
   */
  HSVColor createHSVColor();

  /**
   * Returns a new object of class '<em>String Color</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Color</em>'.
   * @generated
   */
  StringColor createStringColor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ColorPackage getColorPackage();

} //ColorFactory
