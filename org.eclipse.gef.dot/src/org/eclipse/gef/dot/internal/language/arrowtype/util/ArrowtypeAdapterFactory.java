/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.dot.internal.language.arrowtype.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage
 * @generated
 */
public class ArrowtypeAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArrowtypePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrowtypeAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArrowtypePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrowtypeSwitch<Adapter> modelSwitch =
    new ArrowtypeSwitch<Adapter>()
    {
      @Override
      public Adapter caseArrowType(ArrowType object)
      {
        return createArrowTypeAdapter();
      }
      @Override
      public Adapter caseAbstractArrowShape(AbstractArrowShape object)
      {
        return createAbstractArrowShapeAdapter();
      }
      @Override
      public Adapter caseArrowShape(ArrowShape object)
      {
        return createArrowShapeAdapter();
      }
      @Override
      public Adapter caseDeprecatedArrowShape(DeprecatedArrowShape object)
      {
        return createDeprecatedArrowShapeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowType <em>Arrow Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowType
   * @generated
   */
  public Adapter createArrowTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape <em>Abstract Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.AbstractArrowShape
   * @generated
   */
  public Adapter createAbstractArrowShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape <em>Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape
   * @generated
   */
  public Adapter createArrowShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape <em>Deprecated Arrow Shape</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.DeprecatedArrowShape
   * @generated
   */
  public Adapter createDeprecatedArrowShapeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArrowtypeAdapterFactory
