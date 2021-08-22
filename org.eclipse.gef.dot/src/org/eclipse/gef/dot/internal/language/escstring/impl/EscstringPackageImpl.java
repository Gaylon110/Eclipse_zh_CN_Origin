/**
 */
package org.eclipse.gef.dot.internal.language.escstring.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.escstring.EscString;
import org.eclipse.gef.dot.internal.language.escstring.EscstringFactory;
import org.eclipse.gef.dot.internal.language.escstring.EscstringPackage;
import org.eclipse.gef.dot.internal.language.escstring.Justification;
import org.eclipse.gef.dot.internal.language.escstring.JustifiedText;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EscstringPackageImpl extends EPackageImpl implements EscstringPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass escStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass justifiedTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum justificationEEnum = null;

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
   * @see org.eclipse.gef.dot.internal.language.escstring.EscstringPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EscstringPackageImpl()
  {
    super(eNS_URI, EscstringFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EscstringPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EscstringPackage init()
  {
    if (isInited) return (EscstringPackage)EPackage.Registry.INSTANCE.getEPackage(EscstringPackage.eNS_URI);

    // Obtain or create and register package
    EscstringPackageImpl theEscstringPackage = (EscstringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EscstringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EscstringPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEscstringPackage.createPackageContents();

    // Initialize created meta-data
    theEscstringPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEscstringPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EscstringPackage.eNS_URI, theEscstringPackage);
    return theEscstringPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEscString()
  {
    return escStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEscString_Lines()
  {
    return (EReference)escStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJustifiedText()
  {
    return justifiedTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJustifiedText_Text()
  {
    return (EAttribute)justifiedTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJustifiedText_Justification()
  {
    return (EAttribute)justifiedTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJustification()
  {
    return justificationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscstringFactory getEscstringFactory()
  {
    return (EscstringFactory)getEFactoryInstance();
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
    escStringEClass = createEClass(ESC_STRING);
    createEReference(escStringEClass, ESC_STRING__LINES);

    justifiedTextEClass = createEClass(JUSTIFIED_TEXT);
    createEAttribute(justifiedTextEClass, JUSTIFIED_TEXT__TEXT);
    createEAttribute(justifiedTextEClass, JUSTIFIED_TEXT__JUSTIFICATION);

    // Create enums
    justificationEEnum = createEEnum(JUSTIFICATION);
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
    initEClass(escStringEClass, EscString.class, "EscString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEscString_Lines(), this.getJustifiedText(), null, "lines", null, 0, -1, EscString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(justifiedTextEClass, JustifiedText.class, "JustifiedText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJustifiedText_Text(), ecorePackage.getEString(), "text", null, 0, 1, JustifiedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJustifiedText_Justification(), this.getJustification(), "justification", null, 0, 1, JustifiedText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(justificationEEnum, Justification.class, "Justification");
    addEEnumLiteral(justificationEEnum, Justification.CENTERED);
    addEEnumLiteral(justificationEEnum, Justification.LEFT);
    addEEnumLiteral(justificationEEnum, Justification.RIGHT);

    // Create resource
    createResource(eNS_URI);
  }

} //EscstringPackageImpl
