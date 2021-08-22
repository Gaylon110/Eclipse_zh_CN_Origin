/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage;
import org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl#getSide <em>Side</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.impl.ArrowShapeImpl#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrowShapeImpl extends AbstractArrowShapeImpl implements ArrowShape
{
  /**
   * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOpen()
   * @generated
   * @ordered
   */
  protected static final boolean OPEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOpen()
   * @generated
   * @ordered
   */
  protected boolean open = OPEN_EDEFAULT;

  /**
   * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected static final String SIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSide()
   * @generated
   * @ordered
   */
  protected String side = SIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final PrimitiveShape SHAPE_EDEFAULT = PrimitiveShape.BOX;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected PrimitiveShape shape = SHAPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrowShapeImpl()
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
    return ArrowtypePackage.Literals.ARROW_SHAPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOpen()
  {
    return open;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpen(boolean newOpen)
  {
    boolean oldOpen = open;
    open = newOpen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArrowtypePackage.ARROW_SHAPE__OPEN, oldOpen, open));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSide()
  {
    return side;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSide(String newSide)
  {
    String oldSide = side;
    side = newSide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArrowtypePackage.ARROW_SHAPE__SIDE, oldSide, side));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveShape getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(PrimitiveShape newShape)
  {
    PrimitiveShape oldShape = shape;
    shape = newShape == null ? SHAPE_EDEFAULT : newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArrowtypePackage.ARROW_SHAPE__SHAPE, oldShape, shape));
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
      case ArrowtypePackage.ARROW_SHAPE__OPEN:
        return isOpen();
      case ArrowtypePackage.ARROW_SHAPE__SIDE:
        return getSide();
      case ArrowtypePackage.ARROW_SHAPE__SHAPE:
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
      case ArrowtypePackage.ARROW_SHAPE__OPEN:
        setOpen((Boolean)newValue);
        return;
      case ArrowtypePackage.ARROW_SHAPE__SIDE:
        setSide((String)newValue);
        return;
      case ArrowtypePackage.ARROW_SHAPE__SHAPE:
        setShape((PrimitiveShape)newValue);
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
      case ArrowtypePackage.ARROW_SHAPE__OPEN:
        setOpen(OPEN_EDEFAULT);
        return;
      case ArrowtypePackage.ARROW_SHAPE__SIDE:
        setSide(SIDE_EDEFAULT);
        return;
      case ArrowtypePackage.ARROW_SHAPE__SHAPE:
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
      case ArrowtypePackage.ARROW_SHAPE__OPEN:
        return open != OPEN_EDEFAULT;
      case ArrowtypePackage.ARROW_SHAPE__SIDE:
        return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
      case ArrowtypePackage.ARROW_SHAPE__SHAPE:
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
    result.append(" (open: ");
    result.append(open);
    result.append(", side: ");
    result.append(side);
    result.append(", shape: ");
    result.append(shape);
    result.append(')');
    return result.toString();
  }

} //ArrowShapeImpl
