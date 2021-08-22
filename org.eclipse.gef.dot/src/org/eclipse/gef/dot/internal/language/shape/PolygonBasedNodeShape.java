/**
 */
package org.eclipse.gef.dot.internal.language.shape;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Polygon Based Node Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.shape.ShapePackage#getPolygonBasedNodeShape()
 * @model
 * @generated
 */
public enum PolygonBasedNodeShape implements Enumerator
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
   * The '<em><b>Polygon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POLYGON_VALUE
   * @generated
   * @ordered
   */
  POLYGON(1, "polygon", "polygon"),

  /**
   * The '<em><b>Ellipse</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ELLIPSE_VALUE
   * @generated
   * @ordered
   */
  ELLIPSE(2, "ellipse", "ellipse"),

  /**
   * The '<em><b>Oval</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OVAL_VALUE
   * @generated
   * @ordered
   */
  OVAL(3, "oval", "oval"),

  /**
   * The '<em><b>Circle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CIRCLE_VALUE
   * @generated
   * @ordered
   */
  CIRCLE(4, "circle", "circle"),

  /**
   * The '<em><b>Point</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POINT_VALUE
   * @generated
   * @ordered
   */
  POINT(5, "point", "point"),

  /**
   * The '<em><b>Egg</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EGG_VALUE
   * @generated
   * @ordered
   */
  EGG(6, "egg", "egg"),

  /**
   * The '<em><b>Triangle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIANGLE_VALUE
   * @generated
   * @ordered
   */
  TRIANGLE(7, "triangle", "triangle"),

  /**
   * The '<em><b>Plaintext</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAINTEXT_VALUE
   * @generated
   * @ordered
   */
  PLAINTEXT(8, "plaintext", "plaintext"),

  /**
   * The '<em><b>Plain</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAIN_VALUE
   * @generated
   * @ordered
   */
  PLAIN(9, "plain", "plain"),

  /**
   * The '<em><b>Diamond</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIAMOND_VALUE
   * @generated
   * @ordered
   */
  DIAMOND(10, "diamond", "diamond"),

  /**
   * The '<em><b>Trapezium</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRAPEZIUM_VALUE
   * @generated
   * @ordered
   */
  TRAPEZIUM(11, "trapezium", "trapezium"),

  /**
   * The '<em><b>Parallelogram</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARALLELOGRAM_VALUE
   * @generated
   * @ordered
   */
  PARALLELOGRAM(12, "parallelogram", "parallelogram"),

  /**
   * The '<em><b>House</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUSE_VALUE
   * @generated
   * @ordered
   */
  HOUSE(13, "house", "house"),

  /**
   * The '<em><b>Pentagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PENTAGON_VALUE
   * @generated
   * @ordered
   */
  PENTAGON(14, "pentagon", "pentagon"),

  /**
   * The '<em><b>Hexagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HEXAGON_VALUE
   * @generated
   * @ordered
   */
  HEXAGON(15, "hexagon", "hexagon"),

  /**
   * The '<em><b>Septagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEPTAGON_VALUE
   * @generated
   * @ordered
   */
  SEPTAGON(16, "septagon", "septagon"),

  /**
   * The '<em><b>Octagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OCTAGON_VALUE
   * @generated
   * @ordered
   */
  OCTAGON(17, "octagon", "octagon"),

  /**
   * The '<em><b>Doublecircle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLECIRCLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLECIRCLE(18, "doublecircle", "doublecircle"),

  /**
   * The '<em><b>Doubleoctagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLEOCTAGON_VALUE
   * @generated
   * @ordered
   */
  DOUBLEOCTAGON(19, "doubleoctagon", "doubleoctagon"),

  /**
   * The '<em><b>Tripleoctagon</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIPLEOCTAGON_VALUE
   * @generated
   * @ordered
   */
  TRIPLEOCTAGON(20, "tripleoctagon", "tripleoctagon"),

  /**
   * The '<em><b>Invtriangle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVTRIANGLE_VALUE
   * @generated
   * @ordered
   */
  INVTRIANGLE(21, "invtriangle", "invtriangle"),

  /**
   * The '<em><b>Invtrapezium</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVTRAPEZIUM_VALUE
   * @generated
   * @ordered
   */
  INVTRAPEZIUM(22, "invtrapezium", "invtrapezium"),

  /**
   * The '<em><b>Invhouse</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVHOUSE_VALUE
   * @generated
   * @ordered
   */
  INVHOUSE(23, "invhouse", "invhouse"),

  /**
   * The '<em><b>Mdiamond</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MDIAMOND_VALUE
   * @generated
   * @ordered
   */
  MDIAMOND(24, "Mdiamond", "Mdiamond"),

  /**
   * The '<em><b>Msquare</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MSQUARE_VALUE
   * @generated
   * @ordered
   */
  MSQUARE(25, "Msquare", "Msquare"),

  /**
   * The '<em><b>Mcircle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MCIRCLE_VALUE
   * @generated
   * @ordered
   */
  MCIRCLE(26, "Mcircle", "Mcircle"),

  /**
   * The '<em><b>Rect</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECT_VALUE
   * @generated
   * @ordered
   */
  RECT(27, "rect", "rect"),

  /**
   * The '<em><b>Rectangle</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RECTANGLE_VALUE
   * @generated
   * @ordered
   */
  RECTANGLE(28, "rectangle", "rectangle"),

  /**
   * The '<em><b>Square</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQUARE_VALUE
   * @generated
   * @ordered
   */
  SQUARE(29, "square", "square"),

  /**
   * The '<em><b>Star</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STAR_VALUE
   * @generated
   * @ordered
   */
  STAR(30, "star", "star"),

  /**
   * The '<em><b>None</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(31, "none", "none"),

  /**
   * The '<em><b>Underline</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDERLINE_VALUE
   * @generated
   * @ordered
   */
  UNDERLINE(32, "underline", "underline"),

  /**
   * The '<em><b>Cylinder</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CYLINDER_VALUE
   * @generated
   * @ordered
   */
  CYLINDER(33, "cylinder", "cylinder"),

  /**
   * The '<em><b>Note</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOTE_VALUE
   * @generated
   * @ordered
   */
  NOTE(34, "note", "note"),

  /**
   * The '<em><b>Tab</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAB_VALUE
   * @generated
   * @ordered
   */
  TAB(35, "tab", "tab"),

  /**
   * The '<em><b>Folder</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOLDER_VALUE
   * @generated
   * @ordered
   */
  FOLDER(36, "folder", "folder"),

  /**
   * The '<em><b>Box3d</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOX3D_VALUE
   * @generated
   * @ordered
   */
  BOX3D(37, "box3d", "box3d"),

  /**
   * The '<em><b>Component</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPONENT_VALUE
   * @generated
   * @ordered
   */
  COMPONENT(38, "component", "component"),

  /**
   * The '<em><b>Promoter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROMOTER_VALUE
   * @generated
   * @ordered
   */
  PROMOTER(39, "promoter", "promoter"),

  /**
   * The '<em><b>Cds</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CDS_VALUE
   * @generated
   * @ordered
   */
  CDS(40, "cds", "cds"),

  /**
   * The '<em><b>Terminator</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TERMINATOR_VALUE
   * @generated
   * @ordered
   */
  TERMINATOR(41, "terminator", "terminator"),

  /**
   * The '<em><b>Utr</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UTR_VALUE
   * @generated
   * @ordered
   */
  UTR(42, "utr", "utr"),

  /**
   * The '<em><b>Primersite</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRIMERSITE_VALUE
   * @generated
   * @ordered
   */
  PRIMERSITE(43, "primersite", "primersite"),

  /**
   * The '<em><b>Restrictionsite</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESTRICTIONSITE_VALUE
   * @generated
   * @ordered
   */
  RESTRICTIONSITE(44, "restrictionsite", "restrictionsite"),

  /**
   * The '<em><b>Fivepoverhang</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIVEPOVERHANG_VALUE
   * @generated
   * @ordered
   */
  FIVEPOVERHANG(45, "fivepoverhang", "fivepoverhang"),

  /**
   * The '<em><b>Threepoverhang</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THREEPOVERHANG_VALUE
   * @generated
   * @ordered
   */
  THREEPOVERHANG(46, "threepoverhang", "threepoverhang"),

  /**
   * The '<em><b>Noverhang</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOVERHANG_VALUE
   * @generated
   * @ordered
   */
  NOVERHANG(47, "noverhang", "noverhang"),

  /**
   * The '<em><b>Assembly</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSEMBLY_VALUE
   * @generated
   * @ordered
   */
  ASSEMBLY(48, "assembly", "assembly"),

  /**
   * The '<em><b>Signature</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNATURE_VALUE
   * @generated
   * @ordered
   */
  SIGNATURE(49, "signature", "signature"),

  /**
   * The '<em><b>Insulator</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSULATOR_VALUE
   * @generated
   * @ordered
   */
  INSULATOR(50, "insulator", "insulator"),

  /**
   * The '<em><b>Ribosite</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RIBOSITE_VALUE
   * @generated
   * @ordered
   */
  RIBOSITE(51, "ribosite", "ribosite"),

  /**
   * The '<em><b>Rnastab</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RNASTAB_VALUE
   * @generated
   * @ordered
   */
  RNASTAB(52, "rnastab", "rnastab"),

  /**
   * The '<em><b>Proteasesite</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROTEASESITE_VALUE
   * @generated
   * @ordered
   */
  PROTEASESITE(53, "proteasesite", "proteasesite"),

  /**
   * The '<em><b>Proteinstab</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROTEINSTAB_VALUE
   * @generated
   * @ordered
   */
  PROTEINSTAB(54, "proteinstab", "proteinstab"),

  /**
   * The '<em><b>Rpromoter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RPROMOTER_VALUE
   * @generated
   * @ordered
   */
  RPROMOTER(55, "rpromoter", "rpromoter"),

  /**
   * The '<em><b>Rarrow</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RARROW_VALUE
   * @generated
   * @ordered
   */
  RARROW(56, "rarrow", "rarrow"),

  /**
   * The '<em><b>Larrow</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LARROW_VALUE
   * @generated
   * @ordered
   */
  LARROW(57, "larrow", "larrow"),

  /**
   * The '<em><b>Lpromoter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LPROMOTER_VALUE
   * @generated
   * @ordered
   */
  LPROMOTER(58, "lpromoter", "lpromoter");

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
   * The '<em><b>Polygon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Polygon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POLYGON
   * @model name="polygon"
   * @generated
   * @ordered
   */
  public static final int POLYGON_VALUE = 1;

  /**
   * The '<em><b>Ellipse</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ellipse</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ELLIPSE
   * @model name="ellipse"
   * @generated
   * @ordered
   */
  public static final int ELLIPSE_VALUE = 2;

  /**
   * The '<em><b>Oval</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oval</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OVAL
   * @model name="oval"
   * @generated
   * @ordered
   */
  public static final int OVAL_VALUE = 3;

  /**
   * The '<em><b>Circle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Circle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CIRCLE
   * @model name="circle"
   * @generated
   * @ordered
   */
  public static final int CIRCLE_VALUE = 4;

  /**
   * The '<em><b>Point</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Point</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POINT
   * @model name="point"
   * @generated
   * @ordered
   */
  public static final int POINT_VALUE = 5;

  /**
   * The '<em><b>Egg</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Egg</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EGG
   * @model name="egg"
   * @generated
   * @ordered
   */
  public static final int EGG_VALUE = 6;

  /**
   * The '<em><b>Triangle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Triangle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIANGLE
   * @model name="triangle"
   * @generated
   * @ordered
   */
  public static final int TRIANGLE_VALUE = 7;

  /**
   * The '<em><b>Plaintext</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plaintext</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAINTEXT
   * @model name="plaintext"
   * @generated
   * @ordered
   */
  public static final int PLAINTEXT_VALUE = 8;

  /**
   * The '<em><b>Plain</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Plain</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAIN
   * @model name="plain"
   * @generated
   * @ordered
   */
  public static final int PLAIN_VALUE = 9;

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
  public static final int DIAMOND_VALUE = 10;

  /**
   * The '<em><b>Trapezium</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Trapezium</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRAPEZIUM
   * @model name="trapezium"
   * @generated
   * @ordered
   */
  public static final int TRAPEZIUM_VALUE = 11;

  /**
   * The '<em><b>Parallelogram</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parallelogram</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARALLELOGRAM
   * @model name="parallelogram"
   * @generated
   * @ordered
   */
  public static final int PARALLELOGRAM_VALUE = 12;

  /**
   * The '<em><b>House</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>House</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOUSE
   * @model name="house"
   * @generated
   * @ordered
   */
  public static final int HOUSE_VALUE = 13;

  /**
   * The '<em><b>Pentagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pentagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PENTAGON
   * @model name="pentagon"
   * @generated
   * @ordered
   */
  public static final int PENTAGON_VALUE = 14;

  /**
   * The '<em><b>Hexagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Hexagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HEXAGON
   * @model name="hexagon"
   * @generated
   * @ordered
   */
  public static final int HEXAGON_VALUE = 15;

  /**
   * The '<em><b>Septagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Septagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEPTAGON
   * @model name="septagon"
   * @generated
   * @ordered
   */
  public static final int SEPTAGON_VALUE = 16;

  /**
   * The '<em><b>Octagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Octagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OCTAGON
   * @model name="octagon"
   * @generated
   * @ordered
   */
  public static final int OCTAGON_VALUE = 17;

  /**
   * The '<em><b>Doublecircle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Doublecircle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLECIRCLE
   * @model name="doublecircle"
   * @generated
   * @ordered
   */
  public static final int DOUBLECIRCLE_VALUE = 18;

  /**
   * The '<em><b>Doubleoctagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Doubleoctagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLEOCTAGON
   * @model name="doubleoctagon"
   * @generated
   * @ordered
   */
  public static final int DOUBLEOCTAGON_VALUE = 19;

  /**
   * The '<em><b>Tripleoctagon</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tripleoctagon</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIPLEOCTAGON
   * @model name="tripleoctagon"
   * @generated
   * @ordered
   */
  public static final int TRIPLEOCTAGON_VALUE = 20;

  /**
   * The '<em><b>Invtriangle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invtriangle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVTRIANGLE
   * @model name="invtriangle"
   * @generated
   * @ordered
   */
  public static final int INVTRIANGLE_VALUE = 21;

  /**
   * The '<em><b>Invtrapezium</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invtrapezium</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVTRAPEZIUM
   * @model name="invtrapezium"
   * @generated
   * @ordered
   */
  public static final int INVTRAPEZIUM_VALUE = 22;

  /**
   * The '<em><b>Invhouse</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Invhouse</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVHOUSE
   * @model name="invhouse"
   * @generated
   * @ordered
   */
  public static final int INVHOUSE_VALUE = 23;

  /**
   * The '<em><b>Mdiamond</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mdiamond</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MDIAMOND
   * @model name="Mdiamond"
   * @generated
   * @ordered
   */
  public static final int MDIAMOND_VALUE = 24;

  /**
   * The '<em><b>Msquare</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Msquare</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MSQUARE
   * @model name="Msquare"
   * @generated
   * @ordered
   */
  public static final int MSQUARE_VALUE = 25;

  /**
   * The '<em><b>Mcircle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mcircle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MCIRCLE
   * @model name="Mcircle"
   * @generated
   * @ordered
   */
  public static final int MCIRCLE_VALUE = 26;

  /**
   * The '<em><b>Rect</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rect</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECT
   * @model name="rect"
   * @generated
   * @ordered
   */
  public static final int RECT_VALUE = 27;

  /**
   * The '<em><b>Rectangle</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rectangle</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RECTANGLE
   * @model name="rectangle"
   * @generated
   * @ordered
   */
  public static final int RECTANGLE_VALUE = 28;

  /**
   * The '<em><b>Square</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Square</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SQUARE
   * @model name="square"
   * @generated
   * @ordered
   */
  public static final int SQUARE_VALUE = 29;

  /**
   * The '<em><b>Star</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Star</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STAR
   * @model name="star"
   * @generated
   * @ordered
   */
  public static final int STAR_VALUE = 30;

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
  public static final int NONE_VALUE = 31;

  /**
   * The '<em><b>Underline</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Underline</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDERLINE
   * @model name="underline"
   * @generated
   * @ordered
   */
  public static final int UNDERLINE_VALUE = 32;

  /**
   * The '<em><b>Cylinder</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cylinder</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CYLINDER
   * @model name="cylinder"
   * @generated
   * @ordered
   */
  public static final int CYLINDER_VALUE = 33;

  /**
   * The '<em><b>Note</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Note</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOTE
   * @model name="note"
   * @generated
   * @ordered
   */
  public static final int NOTE_VALUE = 34;

  /**
   * The '<em><b>Tab</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tab</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAB
   * @model name="tab"
   * @generated
   * @ordered
   */
  public static final int TAB_VALUE = 35;

  /**
   * The '<em><b>Folder</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Folder</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOLDER
   * @model name="folder"
   * @generated
   * @ordered
   */
  public static final int FOLDER_VALUE = 36;

  /**
   * The '<em><b>Box3d</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Box3d</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOX3D
   * @model name="box3d"
   * @generated
   * @ordered
   */
  public static final int BOX3D_VALUE = 37;

  /**
   * The '<em><b>Component</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPONENT
   * @model name="component"
   * @generated
   * @ordered
   */
  public static final int COMPONENT_VALUE = 38;

  /**
   * The '<em><b>Promoter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Promoter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROMOTER
   * @model name="promoter"
   * @generated
   * @ordered
   */
  public static final int PROMOTER_VALUE = 39;

  /**
   * The '<em><b>Cds</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cds</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CDS
   * @model name="cds"
   * @generated
   * @ordered
   */
  public static final int CDS_VALUE = 40;

  /**
   * The '<em><b>Terminator</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Terminator</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TERMINATOR
   * @model name="terminator"
   * @generated
   * @ordered
   */
  public static final int TERMINATOR_VALUE = 41;

  /**
   * The '<em><b>Utr</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Utr</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UTR
   * @model name="utr"
   * @generated
   * @ordered
   */
  public static final int UTR_VALUE = 42;

  /**
   * The '<em><b>Primersite</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Primersite</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRIMERSITE
   * @model name="primersite"
   * @generated
   * @ordered
   */
  public static final int PRIMERSITE_VALUE = 43;

  /**
   * The '<em><b>Restrictionsite</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Restrictionsite</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESTRICTIONSITE
   * @model name="restrictionsite"
   * @generated
   * @ordered
   */
  public static final int RESTRICTIONSITE_VALUE = 44;

  /**
   * The '<em><b>Fivepoverhang</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fivepoverhang</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIVEPOVERHANG
   * @model name="fivepoverhang"
   * @generated
   * @ordered
   */
  public static final int FIVEPOVERHANG_VALUE = 45;

  /**
   * The '<em><b>Threepoverhang</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Threepoverhang</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THREEPOVERHANG
   * @model name="threepoverhang"
   * @generated
   * @ordered
   */
  public static final int THREEPOVERHANG_VALUE = 46;

  /**
   * The '<em><b>Noverhang</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Noverhang</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOVERHANG
   * @model name="noverhang"
   * @generated
   * @ordered
   */
  public static final int NOVERHANG_VALUE = 47;

  /**
   * The '<em><b>Assembly</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Assembly</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSEMBLY
   * @model name="assembly"
   * @generated
   * @ordered
   */
  public static final int ASSEMBLY_VALUE = 48;

  /**
   * The '<em><b>Signature</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Signature</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNATURE
   * @model name="signature"
   * @generated
   * @ordered
   */
  public static final int SIGNATURE_VALUE = 49;

  /**
   * The '<em><b>Insulator</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Insulator</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSULATOR
   * @model name="insulator"
   * @generated
   * @ordered
   */
  public static final int INSULATOR_VALUE = 50;

  /**
   * The '<em><b>Ribosite</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ribosite</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RIBOSITE
   * @model name="ribosite"
   * @generated
   * @ordered
   */
  public static final int RIBOSITE_VALUE = 51;

  /**
   * The '<em><b>Rnastab</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rnastab</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RNASTAB
   * @model name="rnastab"
   * @generated
   * @ordered
   */
  public static final int RNASTAB_VALUE = 52;

  /**
   * The '<em><b>Proteasesite</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Proteasesite</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROTEASESITE
   * @model name="proteasesite"
   * @generated
   * @ordered
   */
  public static final int PROTEASESITE_VALUE = 53;

  /**
   * The '<em><b>Proteinstab</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Proteinstab</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROTEINSTAB
   * @model name="proteinstab"
   * @generated
   * @ordered
   */
  public static final int PROTEINSTAB_VALUE = 54;

  /**
   * The '<em><b>Rpromoter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rpromoter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RPROMOTER
   * @model name="rpromoter"
   * @generated
   * @ordered
   */
  public static final int RPROMOTER_VALUE = 55;

  /**
   * The '<em><b>Rarrow</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Rarrow</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RARROW
   * @model name="rarrow"
   * @generated
   * @ordered
   */
  public static final int RARROW_VALUE = 56;

  /**
   * The '<em><b>Larrow</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Larrow</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LARROW
   * @model name="larrow"
   * @generated
   * @ordered
   */
  public static final int LARROW_VALUE = 57;

  /**
   * The '<em><b>Lpromoter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lpromoter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LPROMOTER
   * @model name="lpromoter"
   * @generated
   * @ordered
   */
  public static final int LPROMOTER_VALUE = 58;

  /**
   * An array of all the '<em><b>Polygon Based Node Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PolygonBasedNodeShape[] VALUES_ARRAY =
    new PolygonBasedNodeShape[]
    {
      BOX,
      POLYGON,
      ELLIPSE,
      OVAL,
      CIRCLE,
      POINT,
      EGG,
      TRIANGLE,
      PLAINTEXT,
      PLAIN,
      DIAMOND,
      TRAPEZIUM,
      PARALLELOGRAM,
      HOUSE,
      PENTAGON,
      HEXAGON,
      SEPTAGON,
      OCTAGON,
      DOUBLECIRCLE,
      DOUBLEOCTAGON,
      TRIPLEOCTAGON,
      INVTRIANGLE,
      INVTRAPEZIUM,
      INVHOUSE,
      MDIAMOND,
      MSQUARE,
      MCIRCLE,
      RECT,
      RECTANGLE,
      SQUARE,
      STAR,
      NONE,
      UNDERLINE,
      CYLINDER,
      NOTE,
      TAB,
      FOLDER,
      BOX3D,
      COMPONENT,
      PROMOTER,
      CDS,
      TERMINATOR,
      UTR,
      PRIMERSITE,
      RESTRICTIONSITE,
      FIVEPOVERHANG,
      THREEPOVERHANG,
      NOVERHANG,
      ASSEMBLY,
      SIGNATURE,
      INSULATOR,
      RIBOSITE,
      RNASTAB,
      PROTEASESITE,
      PROTEINSTAB,
      RPROMOTER,
      RARROW,
      LARROW,
      LPROMOTER,
    };

  /**
   * A public read-only list of all the '<em><b>Polygon Based Node Shape</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PolygonBasedNodeShape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Polygon Based Node Shape</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PolygonBasedNodeShape get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PolygonBasedNodeShape result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Polygon Based Node Shape</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PolygonBasedNodeShape getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PolygonBasedNodeShape result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Polygon Based Node Shape</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PolygonBasedNodeShape get(int value)
  {
    switch (value)
    {
      case BOX_VALUE: return BOX;
      case POLYGON_VALUE: return POLYGON;
      case ELLIPSE_VALUE: return ELLIPSE;
      case OVAL_VALUE: return OVAL;
      case CIRCLE_VALUE: return CIRCLE;
      case POINT_VALUE: return POINT;
      case EGG_VALUE: return EGG;
      case TRIANGLE_VALUE: return TRIANGLE;
      case PLAINTEXT_VALUE: return PLAINTEXT;
      case PLAIN_VALUE: return PLAIN;
      case DIAMOND_VALUE: return DIAMOND;
      case TRAPEZIUM_VALUE: return TRAPEZIUM;
      case PARALLELOGRAM_VALUE: return PARALLELOGRAM;
      case HOUSE_VALUE: return HOUSE;
      case PENTAGON_VALUE: return PENTAGON;
      case HEXAGON_VALUE: return HEXAGON;
      case SEPTAGON_VALUE: return SEPTAGON;
      case OCTAGON_VALUE: return OCTAGON;
      case DOUBLECIRCLE_VALUE: return DOUBLECIRCLE;
      case DOUBLEOCTAGON_VALUE: return DOUBLEOCTAGON;
      case TRIPLEOCTAGON_VALUE: return TRIPLEOCTAGON;
      case INVTRIANGLE_VALUE: return INVTRIANGLE;
      case INVTRAPEZIUM_VALUE: return INVTRAPEZIUM;
      case INVHOUSE_VALUE: return INVHOUSE;
      case MDIAMOND_VALUE: return MDIAMOND;
      case MSQUARE_VALUE: return MSQUARE;
      case MCIRCLE_VALUE: return MCIRCLE;
      case RECT_VALUE: return RECT;
      case RECTANGLE_VALUE: return RECTANGLE;
      case SQUARE_VALUE: return SQUARE;
      case STAR_VALUE: return STAR;
      case NONE_VALUE: return NONE;
      case UNDERLINE_VALUE: return UNDERLINE;
      case CYLINDER_VALUE: return CYLINDER;
      case NOTE_VALUE: return NOTE;
      case TAB_VALUE: return TAB;
      case FOLDER_VALUE: return FOLDER;
      case BOX3D_VALUE: return BOX3D;
      case COMPONENT_VALUE: return COMPONENT;
      case PROMOTER_VALUE: return PROMOTER;
      case CDS_VALUE: return CDS;
      case TERMINATOR_VALUE: return TERMINATOR;
      case UTR_VALUE: return UTR;
      case PRIMERSITE_VALUE: return PRIMERSITE;
      case RESTRICTIONSITE_VALUE: return RESTRICTIONSITE;
      case FIVEPOVERHANG_VALUE: return FIVEPOVERHANG;
      case THREEPOVERHANG_VALUE: return THREEPOVERHANG;
      case NOVERHANG_VALUE: return NOVERHANG;
      case ASSEMBLY_VALUE: return ASSEMBLY;
      case SIGNATURE_VALUE: return SIGNATURE;
      case INSULATOR_VALUE: return INSULATOR;
      case RIBOSITE_VALUE: return RIBOSITE;
      case RNASTAB_VALUE: return RNASTAB;
      case PROTEASESITE_VALUE: return PROTEASESITE;
      case PROTEINSTAB_VALUE: return PROTEINSTAB;
      case RPROMOTER_VALUE: return RPROMOTER;
      case RARROW_VALUE: return RARROW;
      case LARROW_VALUE: return LARROW;
      case LPROMOTER_VALUE: return LPROMOTER;
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
  private PolygonBasedNodeShape(int value, String name, String literal)
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
  
} //PolygonBasedNodeShape
