/**
 */
package org.eclipse.gef.dot.internal.language.shape.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape;
import org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape;
import org.eclipse.gef.dot.internal.language.shape.RecordBasedNodeShape;
import org.eclipse.gef.dot.internal.language.shape.RecordBasedShape;
import org.eclipse.gef.dot.internal.language.shape.Shape;
import org.eclipse.gef.dot.internal.language.shape.ShapeFactory;
import org.eclipse.gef.dot.internal.language.shape.ShapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapePackageImpl extends EPackageImpl implements ShapePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass polygonBasedShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordBasedShapeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum polygonBasedNodeShapeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum recordBasedNodeShapeEEnum = null;

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
   * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ShapePackageImpl()
  {
    super(eNS_URI, ShapeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ShapePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ShapePackage init()
  {
    if (isInited) return (ShapePackage)EPackage.Registry.INSTANCE.getEPackage(ShapePackage.eNS_URI);

    // Obtain or create and register package
    ShapePackageImpl theShapePackage = (ShapePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShapePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShapePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theShapePackage.createPackageContents();

    // Initialize created meta-data
    theShapePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theShapePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ShapePackage.eNS_URI, theShapePackage);
    return theShapePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShape()
  {
    return shapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShape_Shape()
  {
    return (EReference)shapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolygonBasedShape()
  {
    return polygonBasedShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolygonBasedShape_Shape()
  {
    return (EAttribute)polygonBasedShapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordBasedShape()
  {
    return recordBasedShapeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordBasedShape_Shape()
  {
    return (EAttribute)recordBasedShapeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPolygonBasedNodeShape()
  {
    return polygonBasedNodeShapeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRecordBasedNodeShape()
  {
    return recordBasedNodeShapeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFactory getShapeFactory()
  {
    return (ShapeFactory)getEFactoryInstance();
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
    shapeEClass = createEClass(SHAPE);
    createEReference(shapeEClass, SHAPE__SHAPE);

    polygonBasedShapeEClass = createEClass(POLYGON_BASED_SHAPE);
    createEAttribute(polygonBasedShapeEClass, POLYGON_BASED_SHAPE__SHAPE);

    recordBasedShapeEClass = createEClass(RECORD_BASED_SHAPE);
    createEAttribute(recordBasedShapeEClass, RECORD_BASED_SHAPE__SHAPE);

    // Create enums
    polygonBasedNodeShapeEEnum = createEEnum(POLYGON_BASED_NODE_SHAPE);
    recordBasedNodeShapeEEnum = createEEnum(RECORD_BASED_NODE_SHAPE);
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

    // Initialize classes and features; add operations and parameters
    initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShape_Shape(), ecorePackage.getEObject(), null, "shape", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(polygonBasedShapeEClass, PolygonBasedShape.class, "PolygonBasedShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPolygonBasedShape_Shape(), this.getPolygonBasedNodeShape(), "shape", null, 0, 1, PolygonBasedShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordBasedShapeEClass, RecordBasedShape.class, "RecordBasedShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecordBasedShape_Shape(), this.getRecordBasedNodeShape(), "shape", null, 0, 1, RecordBasedShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.class, "PolygonBasedNodeShape");
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.BOX);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.POLYGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.ELLIPSE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.OVAL);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.CIRCLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.POINT);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.EGG);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.TRIANGLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PLAINTEXT);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PLAIN);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.DIAMOND);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.TRAPEZIUM);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PARALLELOGRAM);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.HOUSE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PENTAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.HEXAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.SEPTAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.OCTAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.DOUBLECIRCLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.DOUBLEOCTAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.TRIPLEOCTAGON);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.INVTRIANGLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.INVTRAPEZIUM);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.INVHOUSE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.MDIAMOND);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.MSQUARE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.MCIRCLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RECT);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RECTANGLE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.SQUARE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.STAR);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.NONE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.UNDERLINE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.CYLINDER);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.NOTE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.TAB);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.FOLDER);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.BOX3D);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.COMPONENT);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PROMOTER);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.CDS);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.TERMINATOR);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.UTR);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PRIMERSITE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RESTRICTIONSITE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.FIVEPOVERHANG);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.THREEPOVERHANG);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.NOVERHANG);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.ASSEMBLY);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.SIGNATURE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.INSULATOR);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RIBOSITE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RNASTAB);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PROTEASESITE);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.PROTEINSTAB);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RPROMOTER);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.RARROW);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.LARROW);
    addEEnumLiteral(polygonBasedNodeShapeEEnum, PolygonBasedNodeShape.LPROMOTER);

    initEEnum(recordBasedNodeShapeEEnum, RecordBasedNodeShape.class, "RecordBasedNodeShape");
    addEEnumLiteral(recordBasedNodeShapeEEnum, RecordBasedNodeShape.RECORD);
    addEEnumLiteral(recordBasedNodeShapeEEnum, RecordBasedNodeShape.MRECORD);

    // Create resource
    createResource(eNS_URI);
  }

} //ShapePackageImpl
