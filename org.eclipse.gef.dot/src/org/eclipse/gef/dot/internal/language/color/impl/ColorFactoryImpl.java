/**
 */
package org.eclipse.gef.dot.internal.language.color.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef.dot.internal.language.color.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorFactoryImpl extends EFactoryImpl implements ColorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ColorFactory init()
  {
    try
    {
      ColorFactory theColorFactory = (ColorFactory)EPackage.Registry.INSTANCE.getEFactory(ColorPackage.eNS_URI);
      if (theColorFactory != null)
      {
        return theColorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ColorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFactoryImpl()
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
      case ColorPackage.COLOR: return createColor();
      case ColorPackage.RGB_COLOR: return createRGBColor();
      case ColorPackage.HSV_COLOR: return createHSVColor();
      case ColorPackage.STRING_COLOR: return createStringColor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGBColor createRGBColor()
  {
    RGBColorImpl rgbColor = new RGBColorImpl();
    return rgbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HSVColor createHSVColor()
  {
    HSVColorImpl hsvColor = new HSVColorImpl();
    return hsvColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringColor createStringColor()
  {
    StringColorImpl stringColor = new StringColorImpl();
    return stringColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPackage getColorPackage()
  {
    return (ColorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ColorPackage getPackage()
  {
    return ColorPackage.eINSTANCE;
  }

} //ColorFactoryImpl
