/**
 */
package org.eclipse.gef.dot.internal.language.shape;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage
 * @generated
 */
public interface ShapeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ShapeFactory eINSTANCE = org.eclipse.gef.dot.internal.language.shape.impl.ShapeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shape</em>'.
   * @generated
   */
  Shape createShape();

  /**
   * Returns a new object of class '<em>Polygon Based Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Polygon Based Shape</em>'.
   * @generated
   */
  PolygonBasedShape createPolygonBasedShape();

  /**
   * Returns a new object of class '<em>Record Based Shape</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Based Shape</em>'.
   * @generated
   */
  RecordBasedShape createRecordBasedShape();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ShapePackage getShapePackage();

} //ShapeFactory
