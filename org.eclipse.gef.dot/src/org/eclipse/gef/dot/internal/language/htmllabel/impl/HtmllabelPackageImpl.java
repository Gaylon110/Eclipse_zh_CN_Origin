/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelFactory;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmllabelPackageImpl extends EPackageImpl implements HtmllabelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlTagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass htmlAttrEClass = null;

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
   * @see org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HtmllabelPackageImpl()
  {
    super(eNS_URI, HtmllabelFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link HtmllabelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HtmllabelPackage init()
  {
    if (isInited) return (HtmllabelPackage)EPackage.Registry.INSTANCE.getEPackage(HtmllabelPackage.eNS_URI);

    // Obtain or create and register package
    HtmllabelPackageImpl theHtmllabelPackage = (HtmllabelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HtmllabelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HtmllabelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHtmllabelPackage.createPackageContents();

    // Initialize created meta-data
    theHtmllabelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHtmllabelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HtmllabelPackage.eNS_URI, theHtmllabelPackage);
    return theHtmllabelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlLabel()
  {
    return htmlLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHtmlLabel_Parts()
  {
    return (EReference)htmlLabelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlContent()
  {
    return htmlContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHtmlContent_Tag()
  {
    return (EReference)htmlContentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlContent_Text()
  {
    return (EAttribute)htmlContentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlTag()
  {
    return htmlTagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlTag_Name()
  {
    return (EAttribute)htmlTagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHtmlTag_Attributes()
  {
    return (EReference)htmlTagEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlTag_SelfClosing()
  {
    return (EAttribute)htmlTagEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHtmlTag_Children()
  {
    return (EReference)htmlTagEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlTag_CloseName()
  {
    return (EAttribute)htmlTagEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHtmlAttr()
  {
    return htmlAttrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlAttr_Name()
  {
    return (EAttribute)htmlAttrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHtmlAttr_Value()
  {
    return (EAttribute)htmlAttrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmllabelFactory getHtmllabelFactory()
  {
    return (HtmllabelFactory)getEFactoryInstance();
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
    htmlLabelEClass = createEClass(HTML_LABEL);
    createEReference(htmlLabelEClass, HTML_LABEL__PARTS);

    htmlContentEClass = createEClass(HTML_CONTENT);
    createEReference(htmlContentEClass, HTML_CONTENT__TAG);
    createEAttribute(htmlContentEClass, HTML_CONTENT__TEXT);

    htmlTagEClass = createEClass(HTML_TAG);
    createEAttribute(htmlTagEClass, HTML_TAG__NAME);
    createEReference(htmlTagEClass, HTML_TAG__ATTRIBUTES);
    createEAttribute(htmlTagEClass, HTML_TAG__SELF_CLOSING);
    createEReference(htmlTagEClass, HTML_TAG__CHILDREN);
    createEAttribute(htmlTagEClass, HTML_TAG__CLOSE_NAME);

    htmlAttrEClass = createEClass(HTML_ATTR);
    createEAttribute(htmlAttrEClass, HTML_ATTR__NAME);
    createEAttribute(htmlAttrEClass, HTML_ATTR__VALUE);
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
    initEClass(htmlLabelEClass, HtmlLabel.class, "HtmlLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHtmlLabel_Parts(), this.getHtmlContent(), null, "parts", null, 0, -1, HtmlLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlContentEClass, HtmlContent.class, "HtmlContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHtmlContent_Tag(), this.getHtmlTag(), null, "tag", null, 0, 1, HtmlContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHtmlContent_Text(), ecorePackage.getEString(), "text", null, 0, 1, HtmlContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlTagEClass, HtmlTag.class, "HtmlTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHtmlTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, HtmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHtmlTag_Attributes(), this.getHtmlAttr(), null, "attributes", null, 0, -1, HtmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHtmlTag_SelfClosing(), ecorePackage.getEBoolean(), "selfClosing", null, 0, 1, HtmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHtmlTag_Children(), this.getHtmlContent(), null, "children", null, 0, -1, HtmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHtmlTag_CloseName(), ecorePackage.getEString(), "closeName", null, 0, 1, HtmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(htmlAttrEClass, HtmlAttr.class, "HtmlAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHtmlAttr_Name(), ecorePackage.getEString(), "name", null, 0, 1, HtmlAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHtmlAttr_Value(), ecorePackage.getEString(), "value", null, 0, 1, HtmlAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HtmllabelPackageImpl
