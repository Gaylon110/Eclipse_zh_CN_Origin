/**
 */
package org.eclipse.gef.dot.internal.language.shape.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.gef.dot.internal.language.shape.PolygonBasedNodeShape;
import org.eclipse.gef.dot.internal.language.shape.PolygonBasedShape;
import org.eclipse.gef.dot.internal.language.shape.ShapePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Based Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.shape.impl.PolygonBasedShapeImpl#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolygonBasedShapeImpl extends MinimalEObjectImpl.Container implements PolygonBasedShape
{
  /**
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final PolygonBasedNodeShape SHAPE_EDEFAULT = PolygonBasedNodeShape.BOX;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected PolygonBasedNodeShape shape = SHAPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolygonBasedShapeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ShapePackage.Literals.POLYGON_BASED_SHAPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolygonBasedNodeShape getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(PolygonBasedNodeShape newShape)
  {
    PolygonBasedNodeShape oldShape = shape;
    shape = newShape == null ? SHAPE_EDEFAULT : newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShapePackage.POLYGON_BASED_SHAPE__SHAPE, oldShape, shape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShapePackage.POLYGON_BASED_SHAPE__SHAPE:
        return getShape();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShapePackage.POLYGON_BASED_SHAPE__SHAPE:
        setShape((PolygonBasedNodeShape)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.POLYGON_BASED_SHAPE__SHAPE:
        setShape(SHAPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ShapePackage.POLYGON_BASED_SHAPE__SHAPE:
        return shape != SHAPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (shape: ");
    result.append(shape);
    result.append(')');
    return result.toString();
  }

} //PolygonBasedShapeImpl
