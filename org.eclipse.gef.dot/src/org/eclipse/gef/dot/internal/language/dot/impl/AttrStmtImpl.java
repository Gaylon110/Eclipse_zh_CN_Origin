/**
 */
package org.eclipse.gef.dot.internal.language.dot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.dot.AttrList;
import org.eclipse.gef.dot.internal.language.dot.AttrStmt;
import org.eclipse.gef.dot.internal.language.dot.AttributeType;
import org.eclipse.gef.dot.internal.language.dot.DotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attr Stmt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttrStmtImpl extends StmtImpl implements AttrStmt
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final AttributeType TYPE_EDEFAULT = AttributeType.GRAPH;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AttributeType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttrLists() <em>Attr Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrLists()
   * @generated
   * @ordered
   */
  protected EList<AttrList> attrLists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttrStmtImpl()
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
    return DotPackage.Literals.ATTR_STMT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AttributeType newType)
  {
    AttributeType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.ATTR_STMT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttrList> getAttrLists()
  {
    if (attrLists == null)
    {
      attrLists = new EObjectContainmentEList<AttrList>(AttrList.class, this, DotPackage.ATTR_STMT__ATTR_LISTS);
    }
    return attrLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DotPackage.ATTR_STMT__ATTR_LISTS:
        return ((InternalEList<?>)getAttrLists()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DotPackage.ATTR_STMT__TYPE:
        return getType();
      case DotPackage.ATTR_STMT__ATTR_LISTS:
        return getAttrLists();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DotPackage.ATTR_STMT__TYPE:
        setType((AttributeType)newValue);
        return;
      case DotPackage.ATTR_STMT__ATTR_LISTS:
        getAttrLists().clear();
        getAttrLists().addAll((Collection<? extends AttrList>)newValue);
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
      case DotPackage.ATTR_STMT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DotPackage.ATTR_STMT__ATTR_LISTS:
        getAttrLists().clear();
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
      case DotPackage.ATTR_STMT__TYPE:
        return type != TYPE_EDEFAULT;
      case DotPackage.ATTR_STMT__ATTR_LISTS:
        return attrLists != null && !attrLists.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AttrStmtImpl
