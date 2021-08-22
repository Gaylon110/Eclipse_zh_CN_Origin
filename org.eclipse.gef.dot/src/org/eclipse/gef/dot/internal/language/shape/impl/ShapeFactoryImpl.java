/**
 */
package org.eclipse.gef.dot.internal.language.shape.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.gef.dot.internal.language.shape.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeFactoryImpl extends EFactoryImpl implements ShapeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ShapeFactory init()
  {
    try
    {
      ShapeFactory theShapeFactory = (ShapeFactory)EPackage.Registry.INSTANCE.getEFactory(ShapePackage.eNS_URI);
      if (theShapeFactory != null)
      {
        return theShapeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ShapeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapeFactoryImpl()
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
      case ShapePackage.SHAPE: return createShape();
      case ShapePackage.POLYGON_BASED_SHAPE: return createPolygonBasedShape();
      case ShapePackage.RECORD_BASED_SHAPE: return createRecordBasedShape();
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
      case ShapePackage.POLYGON_BASED_NODE_SHAPE:
        return createPolygonBasedNodeShapeFromString(eDataType, initialValue);
      case ShapePackage.RECORD_BASED_NODE_SHAPE:
        return createRecordBasedNodeShapeFromString(eDataType, initialValue);
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
      case ShapePackage.POLYGON_BASED_NODE_SHAPE:
        return convertPolygonBasedNodeShapeToString(eDataType, instanceValue);
      case ShapePackage.RECORD_BASED_NODE_SHAPE:
        return convertRecordBasedNodeShapeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape createShape()
  {
    ShapeImpl shape = new ShapeImpl();
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolygonBasedShape createPolygonBasedShape()
  {
    PolygonBasedShapeImpl polygonBasedShape = new PolygonBasedShapeImpl();
    return polygonBasedShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordBasedShape createRecordBasedShape()
  {
    RecordBasedShapeImpl recordBasedShape = new RecordBasedShapeImpl();
    return recordBasedShape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolygonBasedNodeShape createPolygonBasedNodeShapeFromString(EDataType eDataType, String initialValue)
  {
    PolygonBasedNodeShape result = PolygonBasedNodeShape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPolygonBasedNodeShapeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordBasedNodeShape createRecordBasedNodeShapeFromString(EDataType eDataType, String initialValue)
  {
    RecordBasedNodeShape result = RecordBasedNodeShape.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRecordBasedNodeShapeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShapePackage getShapePackage()
  {
    return (ShapePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ShapePackage getPackage()
  {
    return ShapePackage.eINSTANCE;
  }

} //ShapeFactoryImpl
