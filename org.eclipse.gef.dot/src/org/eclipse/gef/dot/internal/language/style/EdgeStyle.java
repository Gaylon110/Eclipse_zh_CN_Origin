/**
 */
package org.eclipse.gef.dot.internal.language.style;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edge Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.style.StylePackage#getEdgeStyle()
 * @model
 * @generated
 */
public enum EdgeStyle implements Enumerator
{
  /**
   * The '<em><b>Bold</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOLD_VALUE
   * @generated
   * @ordered
   */
  BOLD(0, "bold", "bold"),

  /**
   * The '<em><b>Dashed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DASHED_VALUE
   * @generated
   * @ordered
   */
  DASHED(1, "dashed", "dashed"),

  /**
   * The '<em><b>Dotted</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOTTED_VALUE
   * @generated
   * @ordered
   */
  DOTTED(2, "dotted", "dotted"),

  /**
   * The '<em><b>Invis</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVIS_VALUE
   * @generated
   * @ordered
   */
  INVIS(3, "invis", "invis"),

  /**
   * The '<em><b>Solid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOLID_VALUE
   * @generated
   * @ordered
   */
  SOLID(4, "solid", "solid"),

  /**
   * The '<em><b>Tapered</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAPERED_VALUE
   * @generated
   * @ordered
   */
  TAPERED(5, "tapered", "tapered");

  /**
   * The '<em><b>Bold</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bold</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOLD
   * @model name="bold"
   * @generated
   * @ordered
   */
  public static final int BOLD_VALUE = 0;

  /**
   * The '<em><b>Dashed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dashed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DASHED
   * @model name="dashed"
   * @generated
   * @ordered
   */
  public static final int DASHED_VALUE = 1;

  /**
   * The '<em><b>Dotted</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dotted</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOTTED
   * @model name="dotted"
   * @generated
   * @ordered
   */
  public static final int DOTTED_VALUE = 2;

  /**
   * The '<em><b>Invis</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invis</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVIS
   * @model name="invis"
   * @generated
   * @ordered
   */
  public static final int INVIS_VALUE = 3;

  /**
   * The '<em><b>Solid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SOLID
   * @model name="solid"
   * @generated
   * @ordered
   */
  public static final int SOLID_VALUE = 4;

  /**
   * The '<em><b>Tapered</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tapered</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAPERED
   * @model name="tapered"
   * @generated
   * @ordered
   */
  public static final int TAPERED_VALUE = 5;

  /**
   * An array of all the '<em><b>Edge Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EdgeStyle[] VALUES_ARRAY =
    new EdgeStyle[]
    {
      BOLD,
      DASHED,
      DOTTED,
      INVIS,
      SOLID,
      TAPERED,
    };

  /**
   * A public read-only list of all the '<em><b>Edge Style</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EdgeStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Edge Style</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EdgeStyle get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EdgeStyle result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edge Style</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EdgeStyle getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EdgeStyle result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edge Style</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static EdgeStyle get(int value)
  {
    switch (value)
    {
      case BOLD_VALUE: return BOLD;
      case DASHED_VALUE: return DASHED;
      case DOTTED_VALUE: return DOTTED;
      case INVIS_VALUE: return INVIS;
      case SOLID_VALUE: return SOLID;
      case TAPERED_VALUE: return TAPERED;
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
  private EdgeStyle(int value, String name, String literal)
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
  
} //EdgeStyle
