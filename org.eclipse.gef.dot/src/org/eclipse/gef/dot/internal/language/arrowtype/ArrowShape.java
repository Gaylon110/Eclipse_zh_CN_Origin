/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#isOpen <em>Open</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getSide <em>Side</em>}</li>
 *   <li>{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowShape()
 * @model
 * @generated
 */
public interface ArrowShape extends AbstractArrowShape
{
  /**
   * Returns the value of the '<em><b>Open</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Open</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open</em>' attribute.
   * @see #setOpen(boolean)
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowShape_Open()
   * @model
   * @generated
   */
  boolean isOpen();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#isOpen <em>Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open</em>' attribute.
   * @see #isOpen()
   * @generated
   */
  void setOpen(boolean value);

  /**
   * Returns the value of the '<em><b>Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Side</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Side</em>' attribute.
   * @see #setSide(String)
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowShape_Side()
   * @model
   * @generated
   */
  String getSide();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getSide <em>Side</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Side</em>' attribute.
   * @see #getSide()
   * @generated
   */
  void setSide(String value);

  /**
   * Returns the value of the '<em><b>Shape</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape
   * @see #setShape(PrimitiveShape)
   * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getArrowShape_Shape()
   * @model
   * @generated
   */
  PrimitiveShape getShape();

  /**
   * Sets the value of the '{@link org.eclipse.gef.dot.internal.language.arrowtype.ArrowShape#getShape <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' attribute.
   * @see org.eclipse.gef.dot.internal.language.arrowtype.PrimitiveShape
   * @see #getShape()
   * @generated
   */
  void setShape(PrimitiveShape value);

} // ArrowShape
