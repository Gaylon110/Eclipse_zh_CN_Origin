/**
 */
package org.eclipse.gef.dot.internal.language.color.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.color.Color;
import org.eclipse.gef.dot.internal.language.color.ColorFactory;
import org.eclipse.gef.dot.internal.language.color.ColorPackage;
import org.eclipse.gef.dot.internal.language.color.HSVColor;
import org.eclipse.gef.dot.internal.language.color.RGBColor;
import org.eclipse.gef.dot.internal.language.color.StringColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorPackageImpl extends EPackageImpl implements ColorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hsvColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringColorEClass = null;

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
   * @see org.eclipse.gef.dot.internal.language.color.ColorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ColorPackageImpl()
  {
    super(eNS_URI, ColorFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ColorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ColorPackage init()
  {
    if (isInited) return (ColorPackage)EPackage.Registry.INSTANCE.getEPackage(ColorPackage.eNS_URI);

    // Obtain or create and register package
    ColorPackageImpl theColorPackage = (ColorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theColorPackage.createPackageContents();

    // Initialize created meta-data
    theColorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theColorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ColorPackage.eNS_URI, theColorPackage);
    return theColorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGBColor()
  {
    return rgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_R()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_G()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_B()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_A()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHSVColor()
  {
    return hsvColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSVColor_H()
  {
    return (EAttribute)hsvColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSVColor_S()
  {
    return (EAttribute)hsvColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSVColor_V()
  {
    return (EAttribute)hsvColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringColor()
  {
    return stringColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringColor_Scheme()
  {
    return (EAttribute)stringColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringColor_Name()
  {
    return (EAttribute)stringColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFactory getColorFactory()
  {
    return (ColorFactory)getEFactoryInstance();
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
    colorEClass = createEClass(COLOR);

    rgbColorEClass = createEClass(RGB_COLOR);
    createEAttribute(rgbColorEClass, RGB_COLOR__R);
    createEAttribute(rgbColorEClass, RGB_COLOR__G);
    createEAttribute(rgbColorEClass, RGB_COLOR__B);
    createEAttribute(rgbColorEClass, RGB_COLOR__A);

    hsvColorEClass = createEClass(HSV_COLOR);
    createEAttribute(hsvColorEClass, HSV_COLOR__H);
    createEAttribute(hsvColorEClass, HSV_COLOR__S);
    createEAttribute(hsvColorEClass, HSV_COLOR__V);

    stringColorEClass = createEClass(STRING_COLOR);
    createEAttribute(stringColorEClass, STRING_COLOR__SCHEME);
    createEAttribute(stringColorEClass, STRING_COLOR__NAME);
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
    rgbColorEClass.getESuperTypes().add(this.getColor());
    hsvColorEClass.getESuperTypes().add(this.getColor());
    stringColorEClass.getESuperTypes().add(this.getColor());

    // Initialize classes and features; add operations and parameters
    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGBColor_R(), ecorePackage.getEString(), "r", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_G(), ecorePackage.getEString(), "g", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_B(), ecorePackage.getEString(), "b", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_A(), ecorePackage.getEString(), "a", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hsvColorEClass, HSVColor.class, "HSVColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHSVColor_H(), ecorePackage.getEString(), "h", null, 0, 1, HSVColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHSVColor_S(), ecorePackage.getEString(), "s", null, 0, 1, HSVColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHSVColor_V(), ecorePackage.getEString(), "v", null, 0, 1, HSVColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringColorEClass, StringColor.class, "StringColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringColor_Scheme(), ecorePackage.getEString(), "scheme", null, 0, 1, StringColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, StringColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ColorPackageImpl
