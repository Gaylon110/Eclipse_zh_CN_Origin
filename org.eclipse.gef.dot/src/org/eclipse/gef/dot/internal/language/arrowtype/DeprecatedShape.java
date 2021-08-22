/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deprecated Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getDeprecatedShape()
 * @model
 * @generated
 */
public enum DeprecatedShape implements Enumerator
{
  /**
   * The '<em><b>Ediamond</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EDIAMOND_VALUE
   * @generated
   * @ordered
   */
  EDIAMOND(0, "ediamond", "ediamond"),

  /**
   * The '<em><b>Open</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPEN_VALUE
   * @generated
   * @ordered
   */
  OPEN(1, "open", "open"),

  /**
   * The '<em><b>Halfopen</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HALFOPEN_VALUE
   * @generated
   * @ordered
   */
  HALFOPEN(2, "halfopen", "halfopen"),

  /**
   * The '<em><b>Empty</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMPTY_VALUE
   * @generated
   * @ordered
   */
  EMPTY(3, "empty", "empty"),

  /**
   * The '<em><b>Invempty</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVEMPTY_VALUE
   * @generated
   * @ordered
   */
  INVEMPTY(4, "invempty", "invempty");

  /**
   * The '<em><b>Ediamond</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ediamond</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EDIAMOND
   * @model name="ediamond"
   * @generated
   * @ordered
   */
  public static final int EDIAMOND_VALUE = 0;

  /**
   * The '<em><b>Open</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Open</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPEN
   * @model name="open"
   * @generated
   * @ordered
   */
  public static final int OPEN_VALUE = 1;

  /**
   * The '<em><b>Halfopen</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Halfopen</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HALFOPEN
   * @model name="halfopen"
   * @generated
   * @ordered
   */
  public static final int HALFOPEN_VALUE = 2;

  /**
   * The '<em><b>Empty</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMPTY
   * @model name="empty"
   * @generated
   * @ordered
   */
  public static final int EMPTY_VALUE = 3;

  /**
   * The '<em><b>Invempty</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invempty</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVEMPTY
   * @model name="invempty"
   * @generated
   * @ordered
   */
  public static final int INVEMPTY_VALUE = 4;

  /**
   * An array of all the '<em><b>Deprecated Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DeprecatedShape[] VALUES_ARRAY =
    new DeprecatedShape[]
    {
      EDIAMOND,
      OPEN,
      HALFOPEN,
      EMPTY,
      INVEMPTY,
    };

  /**
   * A public read-only list of all the '<em><b>Deprecated Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DeprecatedShape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Deprecated Shape</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DeprecatedShape get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DeprecatedShape result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Deprecated Shape</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DeprecatedShape getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DeprecatedShape result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Deprecated Shape</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DeprecatedShape get(int value)
  {
    switch (value)
    {
      case EDIAMOND_VALUE: return EDIAMOND;
      case OPEN_VALUE: return OPEN;
      case HALFOPEN_VALUE: return HALFOPEN;
      case EMPTY_VALUE: return EMPTY;
      case INVEMPTY_VALUE: return INVEMPTY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DeprecatedShape(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DeprecatedShape
