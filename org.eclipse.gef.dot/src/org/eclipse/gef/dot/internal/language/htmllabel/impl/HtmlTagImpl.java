/**
 */
package org.eclipse.gef.dot.internal.language.htmllabel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.gef.dot.internal.language.htmllabel.HtmlAttr;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlContent;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlTag;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmllabelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Html Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl#isSelfClosing <em>Self Closing</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.htmllabel.impl.HtmlTagImpl#getCloseName <em>Close Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtmlTagImpl extends MinimalEObjectImpl.Container implements HtmlTag
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<HtmlAttr> attributes;

  /**
   * The default value of the '{@link #isSelfClosing() <em>Self Closing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelfClosing()
   * @generated
   * @ordered
   */
  protected static final boolean SELF_CLOSING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSelfClosing() <em>Self Closing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSelfClosing()
   * @generated
   * @ordered
   */
  protected boolean selfClosing = SELF_CLOSING_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<HtmlContent> children;

  /**
   * The default value of the '{@link #getCloseName() <em>Close Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloseName()
   * @generated
   * @ordered
   */
  protected static final String CLOSE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCloseName() <em>Close Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCloseName()
   * @generated
   * @ordered
   */
  protected String closeName = CLOSE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HtmlTagImpl()
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
    return HtmllabelPackage.Literals.HTML_TAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HtmllabelPackage.HTML_TAG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HtmlAttr> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<HtmlAttr>(HtmlAttr.class, this, HtmllabelPackage.HTML_TAG__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSelfClosing()
  {
    return selfClosing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelfClosing(boolean newSelfClosing)
  {
    boolean oldSelfClosing = selfClosing;
    selfClosing = newSelfClosing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HtmllabelPackage.HTML_TAG__SELF_CLOSING, oldSelfClosing, selfClosing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HtmlContent> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentEList<HtmlContent>(HtmlContent.class, this, HtmllabelPackage.HTML_TAG__CHILDREN);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCloseName()
  {
    return closeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCloseName(String newCloseName)
  {
    String oldCloseName = closeName;
    closeName = newCloseName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HtmllabelPackage.HTML_TAG__CLOSE_NAME, oldCloseName, closeName));
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
      case HtmllabelPackage.HTML_TAG__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case HtmllabelPackage.HTML_TAG__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case HtmllabelPackage.HTML_TAG__NAME:
        return getName();
      case HtmllabelPackage.HTML_TAG__ATTRIBUTES:
        return getAttributes();
      case HtmllabelPackage.HTML_TAG__SELF_CLOSING:
        return isSelfClosing();
      case HtmllabelPackage.HTML_TAG__CHILDREN:
        return getChildren();
      case HtmllabelPackage.HTML_TAG__CLOSE_NAME:
        return getCloseName();
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
      case HtmllabelPackage.HTML_TAG__NAME:
        setName((String)newValue);
        return;
      case HtmllabelPackage.HTML_TAG__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends HtmlAttr>)newValue);
        return;
      case HtmllabelPackage.HTML_TAG__SELF_CLOSING:
        setSelfClosing((Boolean)newValue);
        return;
      case HtmllabelPackage.HTML_TAG__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends HtmlContent>)newValue);
        return;
      case HtmllabelPackage.HTML_TAG__CLOSE_NAME:
        setCloseName((String)newValue);
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
      case HtmllabelPackage.HTML_TAG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HtmllabelPackage.HTML_TAG__ATTRIBUTES:
        getAttributes().clear();
        return;
      case HtmllabelPackage.HTML_TAG__SELF_CLOSING:
        setSelfClosing(SELF_CLOSING_EDEFAULT);
        return;
      case HtmllabelPackage.HTML_TAG__CHILDREN:
        getChildren().clear();
        return;
      case HtmllabelPackage.HTML_TAG__CLOSE_NAME:
        setCloseName(CLOSE_NAME_EDEFAULT);
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
      case HtmllabelPackage.HTML_TAG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HtmllabelPackage.HTML_TAG__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case HtmllabelPackage.HTML_TAG__SELF_CLOSING:
        return selfClosing != SELF_CLOSING_EDEFAULT;
      case HtmllabelPackage.HTML_TAG__CHILDREN:
        return children != null && !children.isEmpty();
      case HtmllabelPackage.HTML_TAG__CLOSE_NAME:
        return CLOSE_NAME_EDEFAULT == null ? closeName != null : !CLOSE_NAME_EDEFAULT.equals(closeName);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", selfClosing: ");
    result.append(selfClosing);
    result.append(", closeName: ");
    result.append(closeName);
    result.append(')');
    return result.toString();
  }

} //HtmlTagImpl
