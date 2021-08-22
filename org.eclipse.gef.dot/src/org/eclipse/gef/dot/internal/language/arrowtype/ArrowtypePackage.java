/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;

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
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypeFactory
 * @model kind="package"
 * @generated
 */
public interface ArrowtypePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arrowtype";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/DotArrowType";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "arrowtype";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArrowtypePackage eINSTANCE = org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowTypeImpl <em>Arrow Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowTypeImpl
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getArrowType()
   * @generated
   */
  int ARROW_TYPE = 0;

  /**
   * The feature id for the '<em><b>Arrow Shapes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_TYPE__ARROW_SHAPES = 0;

  /**
   * The number of structural features of the '<em>Arrow Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.AbstractArrowShapeImpl <em>Abstract Arrow Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.AbstractArrowShapeImpl
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getAbstractArrowShape()
   * @generated
   */
  int ABSTRACT_ARROW_SHAPE = 1;

  /**
   * The number of structural features of the '<em>Abstract Arrow Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ARROW_SHAPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getArrowShape()
   * @generated
   */
  int ARROW_SHAPE = 2;

  /**
   * The feature id for the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_SHAPE__OPEN = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_SHAPE__SIDE = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_SHAPE__SHAPE = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Arrow Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARROW_SHAPE_FEATURE_COUNT = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.DeprecatedArrowShapeImpl <em>Deprecated Arrow Shape</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.DeprecatedArrowShapeImpl
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getDeprecatedArrowShape()
   * @generated
   */
  int DEPRECATED_ARROW_SHAPE = 3;

  /**
   * The feature id for the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPRECATED_ARROW_SHAPE__SHAPE = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Deprecated Arrow Shape</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPRECATED_ARROW_SHAPE_FEATURE_COUNT = ABSTRACT_ARROW_SHAPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape <em>Deprecated Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getDeprecatedShape()
   * @generated
   */
  int DEPRECATED_SHAPE = 4;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape <em>Primitive Shape</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape
   * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getPrimitiveShape()
   * @generated
   */
  int PRIMITIVE_SHAPE = 5;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowType <em>Arrow Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowType
   * @generated
   */
  EClass getArrowType();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowType#getArrowShapes <em>Arrow Shapes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arrow Shapes</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowType#getArrowShapes()
   * @see #getArrowType()
   * @generated
   */
  EReference getArrowType_ArrowShapes();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape <em>Abstract Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Arrow Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape
   * @generated
   */
  EClass getAbstractArrowShape();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape <em>Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arrow Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape
   * @generated
   */
  EClass getArrowShape();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#isOpen <em>Open</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#isOpen()
   * @see #getArrowShape()
   * @generated
   */
  EAttribute getArrowShape_Open();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getSide <em>Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Side</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getSide()
   * @see #getArrowShape()
   * @generated
   */
  EAttribute getArrowShape_Side();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getShape()
   * @see #getArrowShape()
   * @generated
   */
  EAttribute getArrowShape_Shape();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape <em>Deprecated Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deprecated Arrow Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape
   * @generated
   */
  EClass getDeprecatedArrowShape();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape#getShape <em>Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape#getShape()
   * @see #getDeprecatedArrowShape()
   * @generated
   */
  EAttribute getDeprecatedArrowShape_Shape();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape <em>Deprecated Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Deprecated Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape
   * @generated
   */
  EEnum getDeprecatedShape();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape <em>Primitive Shape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Shape</em>'.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape
   * @generated
   */
  EEnum getPrimitiveShape();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArrowtypeFactory getArrowtypeFactory();

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
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowTypeImpl <em>Arrow Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowTypeImpl
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getArrowType()
     * @generated
     */
    EClass ARROW_TYPE = eINSTANCE.getArrowType();

    /**
     * The meta object literal for the '<em><b>Arrow Shapes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARROW_TYPE__ARROW_SHAPES = eINSTANCE.getArrowType_ArrowShapes();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.AbstractArrowShapeImpl <em>Abstract Arrow Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.AbstractArrowShapeImpl
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getAbstractArrowShape()
     * @generated
     */
    EClass ABSTRACT_ARROW_SHAPE = eINSTANCE.getAbstractArrowShape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl <em>Arrow Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getArrowShape()
     * @generated
     */
    EClass ARROW_SHAPE = eINSTANCE.getArrowShape();

    /**
     * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_SHAPE__OPEN = eINSTANCE.getArrowShape_Open();

    /**
     * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_SHAPE__SIDE = eINSTANCE.getArrowShape_Side();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARROW_SHAPE__SHAPE = eINSTANCE.getArrowShape_Shape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.DeprecatedArrowShapeImpl <em>Deprecated Arrow Shape</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.DeprecatedArrowShapeImpl
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getDeprecatedArrowShape()
     * @generated
     */
    EClass DEPRECATED_ARROW_SHAPE = eINSTANCE.getDeprecatedArrowShape();

    /**
     * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPRECATED_ARROW_SHAPE__SHAPE = eINSTANCE.getDeprecatedArrowShape_Shape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape <em>Deprecated Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getDeprecatedShape()
     * @generated
     */
    EEnum DEPRECATED_SHAPE = eINSTANCE.getDeprecatedShape();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape <em>Primitive Shape</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape
     * @see org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowtypePackageImpl#getPrimitiveShape()
     * @generated
     */
    EEnum PRIMITIVE_SHAPE = eINSTANCE.getPrimitiveShape();

  }

} //ArrowtypePackage
