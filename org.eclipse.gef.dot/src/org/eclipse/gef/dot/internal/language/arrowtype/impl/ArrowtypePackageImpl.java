/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowType;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypeFactory;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage;
import org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape;
import org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowtypePackageImpl extends EPackageImpl implements ArrowtypePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractArrowShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrowShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deprecatedArrowShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum deprecatedShapeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum primitiveShapeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArrowtypePackageImpl()
  {
    super(eNS_URI, ArrowtypeFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ArrowtypePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArrowtypePackage init()
  {
    if (isInited) return (ArrowtypePackage)EPackage.Registry.INSTANCE.getEPackage(ArrowtypePackage.eNS_URI);

    // Obtain or create and register package
    ArrowtypePackageImpl theArrowtypePackage = (ArrowtypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArrowtypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArrowtypePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theArrowtypePackage.createPackageContents();

    // Initialize created meta-data
    theArrowtypePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArrowtypePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArrowtypePackage.eNS_URI, theArrowtypePackage);
    return theArrowtypePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowType()
  {
    return arrowTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrowType_ArrowShapes()
  {
    return (EReference)arrowTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractArrowShape()
  {
    return abstractArrowShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrowShape()
  {
    return arrowShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowShape_Open()
  {
    return (EAttribute)arrowShapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowShape_Side()
  {
    return (EAttribute)arrowShapeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrowShape_Shape()
  {
    return (EAttribute)arrowShapeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeprecatedArrowShape()
  {
    return deprecatedArrowShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeprecatedArrowShape_Shape()
  {
    return (EAttribute)deprecatedArrowShapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDeprecatedShape()
  {
    return deprecatedShapeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPrimitiveShape()
  {
    return primitiveShapeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowtypeFactory getArrowtypeFactory()
  {
    return (ArrowtypeFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    arrowTypeEClass = createEClass(ARROW_TYPE);
    createEReference(arrowTypeEClass, ARROW_TYPE__ARROW_SHAPES);

    abstractArrowShapeEClass = createEClass(ABSTRACT_ARROW_SHAPE);

    arrowShapeEClass = createEClass(ARROW_SHAPE);
    createEAttribute(arrowShapeEClass, ARROW_SHAPE__OPEN);
    createEAttribute(arrowShapeEClass, ARROW_SHAPE__SIDE);
    createEAttribute(arrowShapeEClass, ARROW_SHAPE__SHAPE);

    deprecatedArrowShapeEClass = createEClass(DEPRECATED_ARROW_SHAPE);
    createEAttribute(deprecatedArrowShapeEClass, DEPRECATED_ARROW_SHAPE__SHAPE);

    // Create enums
    deprecatedShapeEEnum = createEEnum(DEPRECATED_SHAPE);
    primitiveShapeEEnum = createEEnum(PRIMITIVE_SHAPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    arrowShapeEClass.getESuperTypes().add(this.getAbstractArrowShape());
    deprecatedArrowShapeEClass.getESuperTypes().add(this.getAbstractArrowShape());

    // Initialize classes and features; add operations and parameters
    initEClass(arrowTypeEClass, ArrowType.class, "ArrowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrowType_ArrowShapes(), this.getAbstractArrowShape(), null, "arrowShapes", null, 0, -1, ArrowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractArrowShapeEClass, AbstractArrowShape.class, "AbstractArrowShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrowShapeEClass, ArrowShape.class, "ArrowShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArrowShape_Open(), ecorePackage.getEBoolean(), "open", null, 0, 1, ArrowShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrowShape_Side(), ecorePackage.getEString(), "side", null, 0, 1, ArrowShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrowShape_Shape(), this.getPrimitiveShape(), "shape", null, 0, 1, ArrowShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deprecatedArrowShapeEClass, DeprecatedArrowShape.class, "DeprecatedArrowShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeprecatedArrowShape_Shape(), this.getDeprecatedShape(), "shape", null, 0, 1, DeprecatedArrowShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(deprecatedShapeEEnum, DeprecatedShape.class, "DeprecatedShape");
    addEEnumLiteral(deprecatedShapeEEnum, DeprecatedShape.EDIAMOND);
    addEEnumLiteral(deprecatedShapeEEnum, DeprecatedShape.OPEN);
    addEEnumLiteral(deprecatedShapeEEnum, DeprecatedShape.HALFOPEN);
    addEEnumLiteral(deprecatedShapeEEnum, DeprecatedShape.EMPTY);
    addEEnumLiteral(deprecatedShapeEEnum, DeprecatedShape.INVEMPTY);

    initEEnum(primitiveShapeEEnum, PrimitiveShape.class, "PrimitiveShape");
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.BOX);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.CROW);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.CURVE);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.ICURVE);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.DIAMOND);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.DOT);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.INV);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.NONE);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.NORMAL);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.TEE);
    addEEnumLiteral(primitiveShapeEEnum, PrimitiveShape.VEE);

    // Create resource
    createResource(eNS_URI);
  }

} //ArrowtypePackageImpl
