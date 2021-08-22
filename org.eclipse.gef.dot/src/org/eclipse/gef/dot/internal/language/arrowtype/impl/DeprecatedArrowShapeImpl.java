/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage;
import org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deprecated Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.DeprecatedArrowShapeImpl#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeprecatedArrowShapeImpl extends AbstractArrowShapeImpl implements DeprecatedArrowShape
{
  /**
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final DeprecatedShape SHAPE_EDEFAULT = DeprecatedShape.EDIAMOND;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected DeprecatedShape shape = SHAPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeprecatedArrowShapeImpl()
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
    return ArrowtypePackage.Literals.DEPRECATED_ARROW_SHAPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeprecatedShape getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(DeprecatedShape newShape)
  {
    DeprecatedShape oldShape = shape;
    shape = newShape == null ? SHAPE_EDEFAULT : newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArrowtypePackage.DEPRECATED_ARROW_SHAPE__SHAPE, oldShape, shape));
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
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE__SHAPE:
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
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE__SHAPE:
        setShape((DeprecatedShape)newValue);
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
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE__SHAPE:
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
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE__SHAPE:
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

} //DeprecatedArrowShapeImpl
