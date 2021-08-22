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
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph;
import org.eclipse.gef.dot.internal.language.dot.Subgraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Stmt Subgraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl#getEdgeRHS <em>Edge RHS</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl#getAttrLists <em>Attr Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeStmtSubgraphImpl extends SubgraphOrEdgeStmtSubgraphImpl implements EdgeStmtSubgraph
{
  /**
   * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubgraph()
   * @generated
   * @ordered
   */
  protected Subgraph subgraph;

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
  protected EdgeStmtSubgraphImpl()
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
    return DotPackage.Literals.EDGE_STMT_SUBGRAPH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subgraph getSubgraph()
  {
    return subgraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubgraph(Subgraph newSubgraph, NotificationChain msgs)
  {
    Subgraph oldSubgraph = subgraph;
    subgraph = newSubgraph;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, oldSubgraph, newSubgraph);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubgraph(Subgraph newSubgraph)
  {
    if (newSubgraph != subgraph)
    {
      NotificationChain msgs = null;
      if (subgraph != null)
        msgs = ((InternalEObject)subgraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, null, msgs);
      if (newSubgraph != null)
        msgs = ((InternalEObject)newSubgraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, null, msgs);
      msgs = basicSetSubgraph(newSubgraph, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH, newSubgraph, newSubgraph));
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
      edgeRHS = new EObjectContainmentEList<EdgeRhs>(EdgeRhs.class, this, DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS);
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
      attrLists = new EObjectContainmentEList<AttrList>(AttrList.class, this, DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS);
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
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return basicSetSubgraph(null, msgs);
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return ((InternalEList<?>)getEdgeRHS()).basicRemove(otherEnd, msgs);
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return getSubgraph();
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return getEdgeRHS();
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        setSubgraph((Subgraph)newValue);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        getEdgeRHS().clear();
        getEdgeRHS().addAll((Collection<? extends EdgeRhs>)newValue);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        setSubgraph((Subgraph)null);
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        getEdgeRHS().clear();
        return;
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS:
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
      case DotPackage.EDGE_STMT_SUBGRAPH__SUBGRAPH:
        return subgraph != null;
      case DotPackage.EDGE_STMT_SUBGRAPH__EDGE_RHS:
        return edgeRHS != null && !edgeRHS.isEmpty();
      case DotPackage.EDGE_STMT_SUBGRAPH__ATTR_LISTS:
        return attrLists != null && !attrLists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EdgeStmtSubgraphImpl
