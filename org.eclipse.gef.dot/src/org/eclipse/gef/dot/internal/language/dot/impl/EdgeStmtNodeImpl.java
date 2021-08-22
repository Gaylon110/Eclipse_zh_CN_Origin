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
import org.eclipse.gef.dot.internal.language.dot.DotPackage;
import org.eclipse.gef.dot.internal.language.dot.EdgeRhs;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode;
import org.eclipse.gef.dot.internal.language.dot.NodeId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Stmt Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStmtNodeImpl extends StmtImpl implements EdgeStmtNode
{
  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected NodeId node;

  /**
   * The cached value of the '{@link #getEdgeRHS() <em>Edge RHS</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEdgeRHS()
   * @generated
   * @ordered
   */
  protected EList<EdgeRhs> edgeRHS;

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
  protected EdgeStmtNodeImpl()
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
    return DotPackage.Literals.EDGE_STMT_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeId getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(NodeId newNode, NotificationChain msgs)
  {
    NodeId oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_NODE__NODE, oldNode, newNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(NodeId newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_NODE__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_NODE__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_NODE__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EdgeRhs> getEdgeRHS()
  {
    if (edgeRHS == null)
    {
      edgeRHS = new EObjectContainmentEList<EdgeRhs>(EdgeRhs.class, this, DotPackage.EDGE_STMT_NODE__EDGE_RHS);
    }
    return edgeRHS;
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
      attrLists = new EObjectContainmentEList<AttrList>(AttrList.class, this, DotPackage.EDGE_STMT_NODE__ATTR_LISTS);
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
      case DotPackage.EDGE_STMT_NODE__NODE:
        return basicSetNode(null, msgs);
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return ((InternalEList<?>)getEdgeRHS()).basicRemove(otherEnd, msgs);
      case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_NODE__NODE:
        return getNode();
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return getEdgeRHS();
      case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_NODE__NODE:
        setNode((NodeId)newValue);
        return;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        getEdgeRHS().clear();
        getEdgeRHS().addAll((Collection<? extends EdgeRhs>)newValue);
        return;
      case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_NODE__NODE:
        setNode((NodeId)null);
        return;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        getEdgeRHS().clear();
        return;
      case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_NODE__NODE:
        return node != null;
      case DotPackage.EDGE_STMT_NODE__EDGE_RHS:
        return edgeRHS != null && !edgeRHS.isEmpty();
      case DotPackage.EDGE_STMT_NODE__ATTR_LISTS:
        return attrLists != null && !attrLists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EdgeStmtNodeImpl
