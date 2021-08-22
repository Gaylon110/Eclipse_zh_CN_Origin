/**
 */
package org.eclipse.gef.dot.internal.language.shape;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.shape.ShapeFactory
 * @model kind="package"
 * @generated
 */
public interface ShapePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "shape";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotShape";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "shape";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ShapePackage eINSTANCE = org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.ShapeImpl <em>Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapeImpl
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getShape()
   * @generated
   */
  int SHAPE = 0;

  /**
   * The feature id for the '<em><b>Shape</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE__SHAPE = 0;

  /**
   * The number of structural features of the '<em>Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHAPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.PolygonBasedShapeImpl <em>Polygon Based Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.shape.impl.PolygonBasedShapeImpl
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getPolygonBasedShape()
   * @generated
   */
  int POLYGON_BASED_SHAPE = 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_BASED_SHAPE__SHAPE = 0;

  /**
   * The number of structural features of the '<em>Polygon Based Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLYGON_BASED_SHAPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.RecordBasedShapeImpl <em>Record Based Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.shape.impl.RecordBasedShapeImpl
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getRecordBasedShape()
   * @generated
   */
  int RECORD_BASED_SHAPE = 2;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BASED_SHAPE__SHAPE = 0;

  /**
   * The number of structural features of the '<em>Record Based Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_BASED_SHAPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape <em>Polygon Based Node Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getPolygonBasedNodeShape()
   * @generated
   */
  int POLYGON_BASED_NODE_SHAPE = 3;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape <em>Record Based Node Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape
   * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getRecordBasedNodeShape()
   * @generated
   */
  int RECORD_BASED_NODE_SHAPE = 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.shape.Shape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.Shape
   * @generated
   */
  EClass getShape();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.shape.Shape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.Shape#getShape()
   * @see #getShape()
   * @generated
   */
  EReference getShape_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape <em>Polygon Based Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Polygon Based Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape
   * @generated
   */
  EClass getPolygonBasedShape();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape#getShape()
   * @see #getPolygonBasedShape()
   * @generated
   */
  EAttribute getPolygonBasedShape_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedShape <em>Record Based Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Based Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedShape
   * @generated
   */
  EClass getRecordBasedShape();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedShape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedShape#getShape()
   * @see #getRecordBasedShape()
   * @generated
   */
  EAttribute getRecordBasedShape_Shape();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape <em>Polygon Based Node Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Polygon Based Node Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape
   * @generated
   */
  EEnum getPolygonBasedNodeShape();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape <em>Record Based Node Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Record Based Node Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape
   * @generated
   */
  EEnum getRecordBasedNodeShape();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ShapeFactory getShapeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.ShapeImpl <em>Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapeImpl
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getShape()
     * @generated
     */
    EClass SHAPE = eINSTANCE.getShape();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHAPE__SHAPE = eINSTANCE.getShape_Shape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.PolygonBasedShapeImpl <em>Polygon Based Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.shape.impl.PolygonBasedShapeImpl
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getPolygonBasedShape()
     * @generated
     */
    EClass POLYGON_BASED_SHAPE = eINSTANCE.getPolygonBasedShape();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLYGON_BASED_SHAPE__SHAPE = eINSTANCE.getPolygonBasedShape_Shape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.shape.impl.RecordBasedShapeImpl <em>Record Based Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.shape.impl.RecordBasedShapeImpl
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getRecordBasedShape()
     * @generated
     */
    EClass RECORD_BASED_SHAPE = eINSTANCE.getRecordBasedShape();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_BASED_SHAPE__SHAPE = eINSTANCE.getRecordBasedShape_Shape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape <em>Polygon Based Node Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getPolygonBasedNodeShape()
     * @generated
     */
    EEnum POLYGON_BASED_NODE_SHAPE = eINSTANCE.getPolygonBasedNodeShape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape <em>Record Based Node Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape
     * @see org.eclipse.gef.dot.internal.language.shape.impl.ShapePackageImpl#getRecordBasedNodeShape()
     * @generated
     */
    EEnum RECORD_BASED_NODE_SHAPE = eINSTANCE.getRecordBasedNodeShape();

  }

} //ShapePackage
