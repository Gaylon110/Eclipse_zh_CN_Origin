/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef.dot.internal.language.htmllabel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmllabelFactoryImpl extends EFactoryImpl implements HtmllabelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HtmllabelFactory init()
  {
    try
    {
      HtmllabelFactory theHtmllabelFactory = (HtmllabelFactory)EPackage.Registry.INSTANCE.getEFactory(HtmllabelPackage.eNS_URI);
      if (theHtmllabelFactory != null)
      {
        return theHtmllabelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HtmllabelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmllabelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HtmllabelPackage.HTML_LABEL: return createHtmlLabel();
      case HtmllabelPackage.HTML_CONTENT: return createHtmlContent();
      case HtmllabelPackage.HTML_TAG: return createHtmlTag();
      case HtmllabelPackage.HTML_ATTR: return createHtmlAttr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlLabel createHtmlLabel()
  {
    HtmlLabelImpl htmlLabel = new HtmlLabelImpl();
    return htmlLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlContent createHtmlContent()
  {
    HtmlContentImpl htmlContent = new HtmlContentImpl();
    return htmlContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlTag createHtmlTag()
  {
    HtmlTagImpl htmlTag = new HtmlTagImpl();
    return htmlTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlAttr createHtmlAttr()
  {
    HtmlAttrImpl htmlAttr = new HtmlAttrImpl();
    return htmlAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmllabelPackage getHtmllabelPackage()
  {
    return (HtmllabelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HtmllabelPackage getPackage()
  {
    return HtmllabelPackage.eINSTANCE;
  }

} //HtmllabelFactoryImpl
