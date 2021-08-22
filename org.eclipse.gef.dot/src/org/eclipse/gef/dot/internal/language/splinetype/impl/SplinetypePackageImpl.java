/**
 */
package org.eclipse.gef.dot.internal.language.splinetype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.point.PointPackage;

import org.eclipse.gef.dot.internal.language.splinetype.Spline;
import org.eclipse.gef.dot.internal.language.splinetype.SplineType;
import org.eclipse.gef.dot.internal.language.splinetype.SplinetypeFactory;
import org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplinetypePackageImpl extends EPackageImpl implements SplinetypePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splineTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splineEClass = null;

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
   * @see org.eclipse.gef.dot.internal.language.splinetype.SplinetypePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SplinetypePackageImpl()
  {
    super(eNS_URI, SplinetypeFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SplinetypePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SplinetypePackage init()
  {
    if (isInited) return (SplinetypePackage)EPackage.Registry.INSTANCE.getEPackage(SplinetypePackage.eNS_URI);

    // Obtain or create and register package
    SplinetypePackageImpl theSplinetypePackage = (SplinetypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SplinetypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SplinetypePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PointPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSplinetypePackage.createPackageContents();

    // Initialize created meta-data
    theSplinetypePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSplinetypePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SplinetypePackage.eNS_URI, theSplinetypePackage);
    return theSplinetypePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplineType()
  {
    return splineTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplineType_Splines()
  {
    return (EReference)splineTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpline()
  {
    return splineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpline_Startp()
  {
    return (EReference)splineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpline_Endp()
  {
    return (EReference)splineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpline_ControlPoints()
  {
    return (EReference)splineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplinetypeFactory getSplinetypeFactory()
  {
    return (SplinetypeFactory)getEFactoryInstance();
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
    splineTypeEClass = createEClass(SPLINE_TYPE);
    createEReference(splineTypeEClass, SPLINE_TYPE__SPLINES);

    splineEClass = createEClass(SPLINE);
    createEReference(splineEClass, SPLINE__STARTP);
    createEReference(splineEClass, SPLINE__ENDP);
    createEReference(splineEClass, SPLINE__CONTROL_POINTS);
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

    // Obtain other dependent packages
    PointPackage thePointPackage = (PointPackage)EPackage.Registry.INSTANCE.getEPackage(PointPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(splineTypeEClass, SplineType.class, "SplineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSplineType_Splines(), this.getSpline(), null, "splines", null, 0, -1, SplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splineEClass, Spline.class, "Spline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpline_Startp(), thePointPackage.getPoint(), null, "startp", null, 0, 1, Spline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpline_Endp(), thePointPackage.getPoint(), null, "endp", null, 0, 1, Spline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpline_ControlPoints(), thePointPackage.getPoint(), null, "controlPoints", null, 0, -1, Spline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SplinetypePackageImpl
