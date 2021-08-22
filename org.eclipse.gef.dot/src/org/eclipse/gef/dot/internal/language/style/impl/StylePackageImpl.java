/**
 */
package org.eclipse.gef.dot.internal.language.style.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.style.EdgeStyle;
import org.eclipse.gef.dot.internal.language.style.NodeStyle;
import org.eclipse.gef.dot.internal.language.style.Style;
import org.eclipse.gef.dot.internal.language.style.StyleFactory;
import org.eclipse.gef.dot.internal.language.style.StyleItem;
import org.eclipse.gef.dot.internal.language.style.StylePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StylePackageImpl extends EPackageImpl implements StylePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nodeStyleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum edgeStyleEEnum = null;

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
   * @see org.eclipse.gef.dot.internal.language.style.StylePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StylePackageImpl()
  {
    super(eNS_URI, StyleFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link StylePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StylePackage init()
  {
    if (isInited) return (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);

    // Obtain or create and register package
    StylePackageImpl theStylePackage = (StylePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StylePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StylePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStylePackage.createPackageContents();

    // Initialize created meta-data
    theStylePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStylePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StylePackage.eNS_URI, theStylePackage);
    return theStylePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_StyleItems()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyleItem()
  {
    return styleItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyleItem_Name()
  {
    return (EAttribute)styleItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStyleItem_Args()
  {
    return (EAttribute)styleItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNodeStyle()
  {
    return nodeStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEdgeStyle()
  {
    return edgeStyleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleFactory getStyleFactory()
  {
    return (StyleFactory)getEFactoryInstance();
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
    styleEClass = createEClass(STYLE);
    createEReference(styleEClass, STYLE__STYLE_ITEMS);

    styleItemEClass = createEClass(STYLE_ITEM);
    createEAttribute(styleItemEClass, STYLE_ITEM__NAME);
    createEAttribute(styleItemEClass, STYLE_ITEM__ARGS);

    // Create enums
    nodeStyleEEnum = createEEnum(NODE_STYLE);
    edgeStyleEEnum = createEEnum(EDGE_STYLE);
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
    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStyle_StyleItems(), this.getStyleItem(), null, "styleItems", null, 0, -1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(styleItemEClass, StyleItem.class, "StyleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStyleItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStyleItem_Args(), ecorePackage.getEString(), "args", null, 0, -1, StyleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(nodeStyleEEnum, NodeStyle.class, "NodeStyle");
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.BOLD);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.DASHED);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.DIAGONALS);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.DOTTED);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.FILLED);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.INVIS);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.RADIAL);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.ROUNDED);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.SOLID);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.STRIPED);
    addEEnumLiteral(nodeStyleEEnum, NodeStyle.WEDGED);

    initEEnum(edgeStyleEEnum, EdgeStyle.class, "EdgeStyle");
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.BOLD);
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.DASHED);
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.DOTTED);
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.INVIS);
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.SOLID);
    addEEnumLiteral(edgeStyleEEnum, EdgeStyle.TAPERED);

    // Create resource
    createResource(eNS_URI);
  }

} //StylePackageImpl
