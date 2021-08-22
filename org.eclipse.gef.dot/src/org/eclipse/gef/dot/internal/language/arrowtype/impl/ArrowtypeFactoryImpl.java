/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef.dot.internal.language.arrowtype.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrowtypeFactoryImpl extends EFactoryImpl implements ArrowtypeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArrowtypeFactory init()
  {
    try
    {
      ArrowtypeFactory theArrowtypeFactory = (ArrowtypeFactory)EPackage.Registry.INSTANCE.getEFactory(ArrowtypePackage.eNS_URI);
      if (theArrowtypeFactory != null)
      {
        return theArrowtypeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArrowtypeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowtypeFactoryImpl()
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
      case ArrowtypePackage.ARROW_TYPE: return createArrowType();
      case ArrowtypePackage.ABSTRACT_ARROW_SHAPE: return createAbstractArrowShape();
      case ArrowtypePackage.ARROW_SHAPE: return createArrowShape();
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE: return createDeprecatedArrowShape();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArrowtypePackage.DEPRECATED_SHAPE:
        return createDeprecatedShapeFromString(eDataType, initialValue);
      case ArrowtypePackage.PRIMITIVE_SHAPE:
        return createPrimitiveShapeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ArrowtypePackage.DEPRECATED_SHAPE:
        return convertDeprecatedShapeToString(eDataType, instanceValue);
      case ArrowtypePackage.PRIMITIVE_SHAPE:
        return convertPrimitiveShapeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowType createArrowType()
  {
    ArrowTypeImpl arrowType = new ArrowTypeImpl();
    return arrowType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractArrowShape createAbstractArrowShape()
  {
    AbstractArrowShapeImpl abstractArrowShape = new AbstractArrowShapeImpl();
    return abstractArrowShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowShape createArrowShape()
  {
    ArrowShapeImpl arrowShape = new ArrowShapeImpl();
    return arrowShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeprecatedArrowShape createDeprecatedArrowShape()
  {
    DeprecatedArrowShapeImpl deprecatedArrowShape = new DeprecatedArrowShapeImpl();
    return deprecatedArrowShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeprecatedShape createDeprecatedShapeFromString(EDataType eDataType, String initialValue)
  {
    DeprecatedShape result = DeprecatedShape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeprecatedShapeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveShape createPrimitiveShapeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveShape result = PrimitiveShape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveShapeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowtypePackage getArrowtypePackage()
  {
    return (ArrowtypePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArrowtypePackage getPackage()
  {
    return ArrowtypePackage.eINSTANCE;
  }

} //ArrowtypeFactoryImpl
