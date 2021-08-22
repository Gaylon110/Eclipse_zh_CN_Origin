/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gef.dot.internal.language.arrowtype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage
 * @generated
 */
public class ArrowtypeSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArrowtypePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowtypeSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArrowtypePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ArrowtypePackage.ARROW_TYPE:
      {
        ArrowType arrowType = (ArrowType)theEObject;
        T result = caseArrowType(arrowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArrowtypePackage.ABSTRACT_ARROW_SHAPE:
      {
        AbstractArrowShape abstractArrowShape = (AbstractArrowShape)theEObject;
        T result = caseAbstractArrowShape(abstractArrowShape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArrowtypePackage.ARROW_SHAPE:
      {
        ArrowShape arrowShape = (ArrowShape)theEObject;
        T result = caseArrowShape(arrowShape);
        if (result == null) result = caseAbstractArrowShape(arrowShape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArrowtypePackage.DEPRECATED_ARROW_SHAPE:
      {
        DeprecatedArrowShape deprecatedArrowShape = (DeprecatedArrowShape)theEObject;
        T result = caseDeprecatedArrowShape(deprecatedArrowShape);
        if (result == null) result = caseAbstractArrowShape(deprecatedArrowShape);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowType(ArrowType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Arrow Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractArrowShape(AbstractArrowShape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arrow Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrowShape(ArrowShape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deprecated Arrow Shape</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deprecated Arrow Shape</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeprecatedArrowShape(DeprecatedArrowShape object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ArrowtypeSwitch
