/**
 */
package org.eclipse.gef.dot.internal.language.dot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.gef.dot.internal.language.dot.DotFactory
 * @model kind="package"
 * @generated
 */
public interface DotPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dot";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/gef/dot/internal/language/Dot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dot";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotPackage eINSTANCE = org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.DotAstImpl <em>Ast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotAstImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getDotAst()
   * @generated
   */
  int DOT_AST = 0;

  /**
   * The feature id for the '<em><b>Graphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_AST__GRAPHS = 0;

  /**
   * The number of structural features of the '<em>Ast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_AST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.DotGraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotGraphImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getDotGraph()
   * @generated
   */
  int DOT_GRAPH = 1;

  /**
   * The feature id for the '<em><b>Strict</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_GRAPH__STRICT = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_GRAPH__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_GRAPH__NAME = 2;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_GRAPH__STMTS = 3;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_GRAPH_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.StmtImpl <em>Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.StmtImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getStmt()
   * @generated
   */
  int STMT = 2;

  /**
   * The number of structural features of the '<em>Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STMT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl <em>Edge Stmt Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeStmtNode()
   * @generated
   */
  int EDGE_STMT_NODE = 3;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__NODE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge RHS</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__EDGE_RHS = STMT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attr Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE__ATTR_LISTS = STMT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Edge Stmt Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_NODE_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.SubgraphOrEdgeStmtSubgraphImpl <em>Subgraph Or Edge Stmt Subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.SubgraphOrEdgeStmtSubgraphImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getSubgraphOrEdgeStmtSubgraph()
   * @generated
   */
  int SUBGRAPH_OR_EDGE_STMT_SUBGRAPH = 9;

  /**
   * The number of structural features of the '<em>Subgraph Or Edge Stmt Subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl <em>Edge Stmt Subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeStmtSubgraph()
   * @generated
   */
  int EDGE_STMT_SUBGRAPH = 4;

  /**
   * The feature id for the '<em><b>Subgraph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__SUBGRAPH = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge RHS</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__EDGE_RHS = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attr Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH__ATTR_LISTS = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Edge Stmt Subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_STMT_SUBGRAPH_FEATURE_COUNT = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.NodeStmtImpl <em>Node Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.NodeStmtImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getNodeStmt()
   * @generated
   */
  int NODE_STMT = 5;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT__NODE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attr Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT__ATTR_LISTS = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl <em>Attr Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttrStmt()
   * @generated
   */
  int ATTR_STMT = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT__TYPE = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attr Lists</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT__ATTR_LISTS = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attr Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrListImpl <em>Attr List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.AttrListImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttrList()
   * @generated
   */
  int ATTR_LIST = 7;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Attr List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTR_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.AttributeImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = STMT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = STMT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = STMT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.SubgraphImpl <em>Subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.SubgraphImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getSubgraph()
   * @generated
   */
  int SUBGRAPH = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH__NAME = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH__STMTS = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBGRAPH_FEATURE_COUNT = SUBGRAPH_OR_EDGE_STMT_SUBGRAPH_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.PortImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getPort()
   * @generated
   */
  int PORT = 11;

  /**
   * The feature id for the '<em><b>Compass pt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__COMPASS_PT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsImpl <em>Edge Rhs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhs()
   * @generated
   */
  int EDGE_RHS = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS__OP = 0;

  /**
   * The number of structural features of the '<em>Edge Rhs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsNodeImpl <em>Edge Rhs Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsNodeImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhsNode()
   * @generated
   */
  int EDGE_RHS_NODE = 13;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE__OP = EDGE_RHS__OP;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE__NODE = EDGE_RHS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Edge Rhs Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_NODE_FEATURE_COUNT = EDGE_RHS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsSubgraphImpl <em>Edge Rhs Subgraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsSubgraphImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhsSubgraph()
   * @generated
   */
  int EDGE_RHS_SUBGRAPH = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH__OP = EDGE_RHS__OP;

  /**
   * The feature id for the '<em><b>Subgraph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH__SUBGRAPH = EDGE_RHS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Edge Rhs Subgraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDGE_RHS_SUBGRAPH_FEATURE_COUNT = EDGE_RHS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.NodeIdImpl <em>Node Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.impl.NodeIdImpl
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getNodeId()
   * @generated
   */
  int NODE_ID = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID__NAME = 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID__PORT = 1;

  /**
   * The number of structural features of the '<em>Node Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.EdgeOp <em>Edge Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeOp
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeOp()
   * @generated
   */
  int EDGE_OP = 16;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.GraphType <em>Graph Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.GraphType
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getGraphType()
   * @generated
   */
  int GRAPH_TYPE = 17;

  /**
   * The meta object id for the '{@link org.eclipse.gef.dot.internal.language.dot.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.gef.dot.internal.language.dot.AttributeType
   * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 18;


  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.DotAst <em>Ast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ast</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotAst
   * @generated
   */
  EClass getDotAst();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.DotAst#getGraphs <em>Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graphs</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotAst#getGraphs()
   * @see #getDotAst()
   * @generated
   */
  EReference getDotAst_Graphs();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotGraph
   * @generated
   */
  EClass getDotGraph();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#isStrict <em>Strict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Strict</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotGraph#isStrict()
   * @see #getDotGraph()
   * @generated
   */
  EAttribute getDotGraph_Strict();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotGraph#getType()
   * @see #getDotGraph()
   * @generated
   */
  EAttribute getDotGraph_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotGraph#getName()
   * @see #getDotGraph()
   * @generated
   */
  EAttribute getDotGraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.DotGraph#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.DotGraph#getStmts()
   * @see #getDotGraph()
   * @generated
   */
  EReference getDotGraph_Stmts();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.Stmt <em>Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stmt</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Stmt
   * @generated
   */
  EClass getStmt();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode <em>Edge Stmt Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Stmt Node</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode
   * @generated
   */
  EClass getEdgeStmtNode();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getNode()
   * @see #getEdgeStmtNode()
   * @generated
   */
  EReference getEdgeStmtNode_Node();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getEdgeRHS <em>Edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge RHS</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getEdgeRHS()
   * @see #getEdgeStmtNode()
   * @generated
   */
  EReference getEdgeStmtNode_EdgeRHS();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getAttrLists <em>Attr Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Lists</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode#getAttrLists()
   * @see #getEdgeStmtNode()
   * @generated
   */
  EReference getEdgeStmtNode_AttrLists();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph <em>Edge Stmt Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Stmt Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph
   * @generated
   */
  EClass getEdgeStmtSubgraph();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getSubgraph <em>Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getSubgraph()
   * @see #getEdgeStmtSubgraph()
   * @generated
   */
  EReference getEdgeStmtSubgraph_Subgraph();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getEdgeRHS <em>Edge RHS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge RHS</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getEdgeRHS()
   * @see #getEdgeStmtSubgraph()
   * @generated
   */
  EReference getEdgeStmtSubgraph_EdgeRHS();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getAttrLists <em>Attr Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Lists</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph#getAttrLists()
   * @see #getEdgeStmtSubgraph()
   * @generated
   */
  EReference getEdgeStmtSubgraph_AttrLists();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.NodeStmt <em>Node Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Stmt</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeStmt
   * @generated
   */
  EClass getNodeStmt();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.NodeStmt#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeStmt#getNode()
   * @see #getNodeStmt()
   * @generated
   */
  EReference getNodeStmt_Node();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.NodeStmt#getAttrLists <em>Attr Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Lists</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeStmt#getAttrLists()
   * @see #getNodeStmt()
   * @generated
   */
  EReference getNodeStmt_AttrLists();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.AttrStmt <em>Attr Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr Stmt</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttrStmt
   * @generated
   */
  EClass getAttrStmt();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.AttrStmt#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttrStmt#getType()
   * @see #getAttrStmt()
   * @generated
   */
  EAttribute getAttrStmt_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.AttrStmt#getAttrLists <em>Attr Lists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr Lists</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttrStmt#getAttrLists()
   * @see #getAttrStmt()
   * @generated
   */
  EReference getAttrStmt_AttrLists();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.AttrList <em>Attr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attr List</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttrList
   * @generated
   */
  EClass getAttrList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.AttrList#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttrList#getAttributes()
   * @see #getAttrList()
   * @generated
   */
  EReference getAttrList_Attributes();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.SubgraphOrEdgeStmtSubgraph <em>Subgraph Or Edge Stmt Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subgraph Or Edge Stmt Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.SubgraphOrEdgeStmtSubgraph
   * @generated
   */
  EClass getSubgraphOrEdgeStmtSubgraph();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.Subgraph <em>Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Subgraph
   * @generated
   */
  EClass getSubgraph();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.Subgraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Subgraph#getName()
   * @see #getSubgraph()
   * @generated
   */
  EAttribute getSubgraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.gef.dot.internal.language.dot.Subgraph#getStmts <em>Stmts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stmts</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Subgraph#getStmts()
   * @see #getSubgraph()
   * @generated
   */
  EReference getSubgraph_Stmts();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.Port#getCompass_pt <em>Compass pt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compass pt</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Port#getCompass_pt()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Compass_pt();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhs <em>Edge Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Rhs</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhs
   * @generated
   */
  EClass getEdgeRhs();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhs#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhs#getOp()
   * @see #getEdgeRhs()
   * @generated
   */
  EAttribute getEdgeRhs_Op();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode <em>Edge Rhs Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Rhs Node</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode
   * @generated
   */
  EClass getEdgeRhsNode();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode#getNode()
   * @see #getEdgeRhsNode()
   * @generated
   */
  EReference getEdgeRhsNode_Node();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhsSubgraph <em>Edge Rhs Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edge Rhs Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhsSubgraph
   * @generated
   */
  EClass getEdgeRhsSubgraph();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.EdgeRhsSubgraph#getSubgraph <em>Subgraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subgraph</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeRhsSubgraph#getSubgraph()
   * @see #getEdgeRhsSubgraph()
   * @generated
   */
  EReference getEdgeRhsSubgraph_Subgraph();

  /**
   * Returns the meta object for class '{@link org.eclipse.gef.dot.internal.language.dot.NodeId <em>Node Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Id</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeId
   * @generated
   */
  EClass getNodeId();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeId#getName()
   * @see #getNodeId()
   * @generated
   */
  EAttribute getNodeId_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.gef.dot.internal.language.dot.NodeId#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.NodeId#getPort()
   * @see #getNodeId()
   * @generated
   */
  EReference getNodeId_Port();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.dot.EdgeOp <em>Edge Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Edge Op</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.EdgeOp
   * @generated
   */
  EEnum getEdgeOp();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.dot.GraphType <em>Graph Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Graph Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.GraphType
   * @generated
   */
  EEnum getGraphType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.gef.dot.internal.language.dot.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see org.eclipse.gef.dot.internal.language.dot.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DotFactory getDotFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.DotAstImpl <em>Ast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotAstImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getDotAst()
     * @generated
     */
    EClass DOT_AST = eINSTANCE.getDotAst();

    /**
     * The meta object literal for the '<em><b>Graphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_AST__GRAPHS = eINSTANCE.getDotAst_Graphs();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.DotGraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotGraphImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getDotGraph()
     * @generated
     */
    EClass DOT_GRAPH = eINSTANCE.getDotGraph();

    /**
     * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOT_GRAPH__STRICT = eINSTANCE.getDotGraph_Strict();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOT_GRAPH__TYPE = eINSTANCE.getDotGraph_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOT_GRAPH__NAME = eINSTANCE.getDotGraph_Name();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_GRAPH__STMTS = eINSTANCE.getDotGraph_Stmts();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.StmtImpl <em>Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.StmtImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getStmt()
     * @generated
     */
    EClass STMT = eINSTANCE.getStmt();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl <em>Edge Stmt Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtNodeImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeStmtNode()
     * @generated
     */
    EClass EDGE_STMT_NODE = eINSTANCE.getEdgeStmtNode();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__NODE = eINSTANCE.getEdgeStmtNode_Node();

    /**
     * The meta object literal for the '<em><b>Edge RHS</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__EDGE_RHS = eINSTANCE.getEdgeStmtNode_EdgeRHS();

    /**
     * The meta object literal for the '<em><b>Attr Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_NODE__ATTR_LISTS = eINSTANCE.getEdgeStmtNode_AttrLists();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl <em>Edge Stmt Subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeStmtSubgraphImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeStmtSubgraph()
     * @generated
     */
    EClass EDGE_STMT_SUBGRAPH = eINSTANCE.getEdgeStmtSubgraph();

    /**
     * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__SUBGRAPH = eINSTANCE.getEdgeStmtSubgraph_Subgraph();

    /**
     * The meta object literal for the '<em><b>Edge RHS</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__EDGE_RHS = eINSTANCE.getEdgeStmtSubgraph_EdgeRHS();

    /**
     * The meta object literal for the '<em><b>Attr Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_STMT_SUBGRAPH__ATTR_LISTS = eINSTANCE.getEdgeStmtSubgraph_AttrLists();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.NodeStmtImpl <em>Node Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.NodeStmtImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getNodeStmt()
     * @generated
     */
    EClass NODE_STMT = eINSTANCE.getNodeStmt();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STMT__NODE = eINSTANCE.getNodeStmt_Node();

    /**
     * The meta object literal for the '<em><b>Attr Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_STMT__ATTR_LISTS = eINSTANCE.getNodeStmt_AttrLists();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl <em>Attr Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.AttrStmtImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttrStmt()
     * @generated
     */
    EClass ATTR_STMT = eINSTANCE.getAttrStmt();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTR_STMT__TYPE = eINSTANCE.getAttrStmt_Type();

    /**
     * The meta object literal for the '<em><b>Attr Lists</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_STMT__ATTR_LISTS = eINSTANCE.getAttrStmt_AttrLists();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttrListImpl <em>Attr List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.AttrListImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttrList()
     * @generated
     */
    EClass ATTR_LIST = eINSTANCE.getAttrList();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTR_LIST__ATTRIBUTES = eINSTANCE.getAttrList_Attributes();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.AttributeImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.SubgraphOrEdgeStmtSubgraphImpl <em>Subgraph Or Edge Stmt Subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.SubgraphOrEdgeStmtSubgraphImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getSubgraphOrEdgeStmtSubgraph()
     * @generated
     */
    EClass SUBGRAPH_OR_EDGE_STMT_SUBGRAPH = eINSTANCE.getSubgraphOrEdgeStmtSubgraph();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.SubgraphImpl <em>Subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.SubgraphImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getSubgraph()
     * @generated
     */
    EClass SUBGRAPH = eINSTANCE.getSubgraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBGRAPH__NAME = eINSTANCE.getSubgraph_Name();

    /**
     * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBGRAPH__STMTS = eINSTANCE.getSubgraph_Stmts();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.PortImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Compass pt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__COMPASS_PT = eINSTANCE.getPort_Compass_pt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsImpl <em>Edge Rhs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhs()
     * @generated
     */
    EClass EDGE_RHS = eINSTANCE.getEdgeRhs();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EDGE_RHS__OP = eINSTANCE.getEdgeRhs_Op();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsNodeImpl <em>Edge Rhs Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsNodeImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhsNode()
     * @generated
     */
    EClass EDGE_RHS_NODE = eINSTANCE.getEdgeRhsNode();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_RHS_NODE__NODE = eINSTANCE.getEdgeRhsNode_Node();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsSubgraphImpl <em>Edge Rhs Subgraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.EdgeRhsSubgraphImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeRhsSubgraph()
     * @generated
     */
    EClass EDGE_RHS_SUBGRAPH = eINSTANCE.getEdgeRhsSubgraph();

    /**
     * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EDGE_RHS_SUBGRAPH__SUBGRAPH = eINSTANCE.getEdgeRhsSubgraph_Subgraph();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.impl.NodeIdImpl <em>Node Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.impl.NodeIdImpl
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getNodeId()
     * @generated
     */
    EClass NODE_ID = eINSTANCE.getNodeId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ID__NAME = eINSTANCE.getNodeId_Name();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_ID__PORT = eINSTANCE.getNodeId_Port();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.EdgeOp <em>Edge Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.EdgeOp
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getEdgeOp()
     * @generated
     */
    EEnum EDGE_OP = eINSTANCE.getEdgeOp();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.GraphType <em>Graph Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.GraphType
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getGraphType()
     * @generated
     */
    EEnum GRAPH_TYPE = eINSTANCE.getGraphType();

    /**
     * The meta object literal for the '{@link org.eclipse.gef.dot.internal.language.dot.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.gef.dot.internal.language.dot.AttributeType
     * @see org.eclipse.gef.dot.internal.language.dot.impl.DotPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

  }

} //DotPackage
