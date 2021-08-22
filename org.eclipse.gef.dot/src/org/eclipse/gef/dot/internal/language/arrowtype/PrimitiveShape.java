/**
 */
package org.eclipse.gef.dot.internal.language.arrowtype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.arrowtype.ArrowtypePackage#getPrimitiveShape()
 * @model
 * @generated
 */
public enum PrimitiveShape implements Enumerator
{
  /**
   * The '<em><b>Box</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOX_VALUE
   * @generated
   * @ordered
   */
  BOX(0, "box", "box"),

  /**
   * The '<em><b>Crow</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CROW_VALUE
   * @generated
   * @ordered
   */
  CROW(1, "crow", "crow"),

  /**
   * The '<em><b>Curve</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CURVE_VALUE
   * @generated
   * @ordered
   */
  CURVE(2, "curve", "curve"),

  /**
   * The '<em><b>Icurve</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ICURVE_VALUE
   * @generated
   * @ordered
   */
  ICURVE(3, "icurve", "icurve"),

  /**
   * The '<em><b>Diamond</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIAMOND_VALUE
   * @generated
   * @ordered
   */
  DIAMOND(4, "diamond", "diamond"),

  /**
   * The '<em><b>Dot</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOT_VALUE
   * @generated
   * @ordered
   */
  DOT(5, "dot", "dot"),

  /**
   * The '<em><b>Inv</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INV_VALUE
   * @generated
   * @ordered
   */
  INV(6, "inv", "inv"),

  /**
   * The '<em><b>None</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(7, "none", "none"),

  /**
   * The '<em><b>Normal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORMAL_VALUE
   * @generated
   * @ordered
   */
  NORMAL(8, "normal", "normal"),

  /**
   * The '<em><b>Tee</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEE_VALUE
   * @generated
   * @ordered
   */
  TEE(9, "tee", "tee"),

  /**
   * The '<em><b>Vee</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VEE_VALUE
   * @generated
   * @ordered
   */
  VEE(10, "vee", "vee");

  /**
   * The '<em><b>Box</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Box</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOX
   * @model name="box"
   * @generated
   * @ordered
   */
  public static final int BOX_VALUE = 0;

  /**
   * The '<em><b>Crow</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Crow</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CROW
   * @model name="crow"
   * @generated
   * @ordered
   */
  public static final int CROW_VALUE = 1;

  /**
   * The '<em><b>Curve</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Curve</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CURVE
   * @model name="curve"
   * @generated
   * @ordered
   */
  public static final int CURVE_VALUE = 2;

  /**
   * The '<em><b>Icurve</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Icurve</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ICURVE
   * @model name="icurve"
   * @generated
   * @ordered
   */
  public static final int ICURVE_VALUE = 3;

  /**
   * The '<em><b>Diamond</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Diamond</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIAMOND
   * @model name="diamond"
   * @generated
   * @ordered
   */
  public static final int DIAMOND_VALUE = 4;

  /**
   * The '<em><b>Dot</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dot</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOT
   * @model name="dot"
   * @generated
   * @ordered
   */
  public static final int DOT_VALUE = 5;

  /**
   * The '<em><b>Inv</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inv</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INV
   * @model name="inv"
   * @generated
   * @ordered
   */
  public static final int INV_VALUE = 6;

  /**
   * The '<em><b>None</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model name="none"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 7;

  /**
   * The '<em><b>Normal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORMAL
   * @model name="normal"
   * @generated
   * @ordered
   */
  public static final int NORMAL_VALUE = 8;

  /**
   * The '<em><b>Tee</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tee</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEE
   * @model name="tee"
   * @generated
   * @ordered
   */
  public static final int TEE_VALUE = 9;

  /**
   * The '<em><b>Vee</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Vee</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VEE
   * @model name="vee"
   * @generated
   * @ordered
   */
  public static final int VEE_VALUE = 10;

  /**
   * An array of all the '<em><b>Primitive Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PrimitiveShape[] VALUES_ARRAY =
    new PrimitiveShape[]
    {
      BOX,
      CROW,
      CURVE,
      ICURVE,
      DIAMOND,
      DOT,
      INV,
      NONE,
      NORMAL,
      TEE,
      VEE,
    };

  /**
   * A public read-only list of all the '<em><b>Primitive Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PrimitiveShape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Primitive Shape</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PrimitiveShape get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PrimitiveShape result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Shape</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PrimitiveShape getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PrimitiveShape result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Shape</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PrimitiveShape get(int value)
  {
    switch (value)
    {
      case BOX_VALUE: return BOX;
      case CROW_VALUE: return CROW;
      case CURVE_VALUE: return CURVE;
      case ICURVE_VALUE: return ICURVE;
      case DIAMOND_VALUE: return DIAMOND;
      case DOT_VALUE: return DOT;
      case INV_VALUE: return INV;
      case NONE_VALUE: return NONE;
      case NORMAL_VALUE: return NORMAL;
      case TEE_VALUE: return TEE;
      case VEE_VALUE: return VEE;
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
  private PrimitiveShape(int value, String name, String literal)
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
  
} //PrimitiveShape
