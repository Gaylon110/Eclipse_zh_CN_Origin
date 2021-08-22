/**
 */
package org.eclipse.gef.dot.internal.language.splinetype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef.dot.internal.language.splinetype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplinetypeFactoryImpl extends EFactoryImpl implements SplinetypeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SplinetypeFactory init()
  {
    try
    {
      SplinetypeFactory theSplinetypeFactory = (SplinetypeFactory)EPackage.Registry.INSTANCE.getEFactory(SplinetypePackage.eNS_URI);
      if (theSplinetypeFactory != null)
      {
        return theSplinetypeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SplinetypeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplinetypeFactoryImpl()
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
      case SplinetypePackage.SPLINE_TYPE: return createSplineType();
      case SplinetypePackage.SPLINE: return createSpline();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplineType createSplineType()
  {
    SplineTypeImpl splineType = new SplineTypeImpl();
    return splineType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spline createSpline()
  {
    SplineImpl spline = new SplineImpl();
    return spline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplinetypePackage getSplinetypePackage()
  {
    return (SplinetypePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SplinetypePackage getPackage()
  {
    return SplinetypePackage.eINSTANCE;
  }

} //SplinetypeFactoryImpl
