/**
 * Copyright (c) 2016 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexander Nyßen (itemis AG) - initial API and implementation
 *     Tamas Miklossy  (itemis AG) - Merge DotInterpreter into DotImport (bug #491261)
 *                                 - Add support for all dot attributes (bug #461506)
 */
package org.eclipse.gef.dot.internal;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.dot.internal.DotAttributes;
import org.eclipse.gef.dot.internal.DotFileUtils;
import org.eclipse.gef.dot.internal.language.DotAstHelper;
import org.eclipse.gef.dot.internal.language.DotStandaloneSetup;
import org.eclipse.gef.dot.internal.language.dot.AttrList;
import org.eclipse.gef.dot.internal.language.dot.AttrStmt;
import org.eclipse.gef.dot.internal.language.dot.Attribute;
import org.eclipse.gef.dot.internal.language.dot.AttributeType;
import org.eclipse.gef.dot.internal.language.dot.DotAst;
import org.eclipse.gef.dot.internal.language.dot.DotFactory;
import org.eclipse.gef.dot.internal.language.dot.DotGraph;
import org.eclipse.gef.dot.internal.language.dot.EdgeOp;
import org.eclipse.gef.dot.internal.language.dot.EdgeRhs;
import org.eclipse.gef.dot.internal.language.dot.EdgeRhsNode;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode;
import org.eclipse.gef.dot.internal.language.dot.GraphType;
import org.eclipse.gef.dot.internal.language.dot.NodeId;
import org.eclipse.gef.dot.internal.language.dot.NodeStmt;
import org.eclipse.gef.dot.internal.language.dot.Stmt;
import org.eclipse.gef.dot.internal.language.dot.Subgraph;
import org.eclipse.gef.dot.internal.language.parser.antlr.DotParser;
import org.eclipse.gef.dot.internal.language.terminals.ID;
import org.eclipse.gef.graph.Edge;
import org.eclipse.gef.graph.Graph;
import org.eclipse.gef.graph.Node;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

/**
 * A parser that creates a {@link Graph} with {@link DotAttributes} from a Graphviz DOT string or file.
 * The created {@link Graph} follows the structure of the DOT input very closely.
 * Subgraphs (including clusters) are represented by a {@link Node} with a nested {@link Graph},
 * where the graph holds all attributes (like the name). If a node is used in multiple (sub-)graphs,
 * it will be contained in the graph where it is defined (first occurrence).
 * 
 * @author anyssen
 */
@SuppressWarnings("all")
public class DotImport {
  @Inject
  private static IParser dotParser;
  
  private static IParser getDotParser() {
    boolean _tripleEquals = (DotImport.dotParser == null);
    if (_tripleEquals) {
      DotStandaloneSetup _dotStandaloneSetup = new DotStandaloneSetup();
      Injector _createInjectorAndDoEMFRegistration = _dotStandaloneSetup.createInjectorAndDoEMFRegistration();
      DotParser _instance = _createInjectorAndDoEMFRegistration.<DotParser>getInstance(DotParser.class);
      DotImport.dotParser = _instance;
    }
    return DotImport.dotParser;
  }
  
  public List<Graph> importDot(final File dotFile) {
    String _read = DotFileUtils.read(dotFile);
    return this.importDot(_read);
  }
  
  public List<Graph> importDot(final String dotString) {
    List<Graph> _xblockexpression = null;
    {
      IParser _dotParser = DotImport.getDotParser();
      StringReader _stringReader = new StringReader(dotString);
      IParseResult parseResult = _dotParser.parse(_stringReader);
      boolean _hasSyntaxErrors = parseResult.hasSyntaxErrors();
      if (_hasSyntaxErrors) {
        Iterable<INode> _syntaxErrors = parseResult.getSyntaxErrors();
        final Function1<INode, String> _function = new Function1<INode, String>() {
          public String apply(final INode it) {
            SyntaxErrorMessage _syntaxErrorMessage = it.getSyntaxErrorMessage();
            return _syntaxErrorMessage.getMessage();
          }
        };
        Iterable<String> _map = IterableExtensions.<INode, String>map(_syntaxErrors, _function);
        String _join = IterableExtensions.join(_map, ",");
        String _plus = ("Given DOT string is not valid: " + _join);
        throw new IllegalArgumentException(_plus);
      }
      EObject _rootASTElement = parseResult.getRootASTElement();
      EList<DotGraph> _graphs = ((DotAst) _rootASTElement).getGraphs();
      final Function1<DotGraph, Graph> _function_1 = new Function1<DotGraph, Graph>() {
        public Graph apply(final DotGraph it) {
          return DotImport.this.transformDotGraph(it);
        }
      };
      List<Graph> _map_1 = ListExtensions.<DotGraph, Graph>map(_graphs, _function_1);
      Iterable<Graph> _filterNull = IterableExtensions.<Graph>filterNull(_map_1);
      _xblockexpression = IterableExtensions.<Graph>toList(_filterNull);
    }
    return _xblockexpression;
  }
  
  private Map<String, ID> globalGraphAttributes(final Graph.Builder context) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(context);
    final HashMap<String, ID> _result;
    synchronized (_createCache_globalGraphAttributes) {
      if (_createCache_globalGraphAttributes.containsKey(_cacheKey)) {
        return _createCache_globalGraphAttributes.get(_cacheKey);
      }
      HashMap<String, ID> _newHashMap = CollectionLiterals.<String, ID>newHashMap();
      _result = _newHashMap;
      _createCache_globalGraphAttributes.put(_cacheKey, _result);
    }
    _init_globalGraphAttributes(_result, context);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Map<String, ID>> _createCache_globalGraphAttributes = CollectionLiterals.newHashMap();
  
  private void _init_globalGraphAttributes(final HashMap<String, ID> it, final Graph.Builder context) {
  }
  
  private Map<String, ID> globalNodeAttributes(final Graph.Builder context) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(context);
    final HashMap<String, ID> _result;
    synchronized (_createCache_globalNodeAttributes) {
      if (_createCache_globalNodeAttributes.containsKey(_cacheKey)) {
        return _createCache_globalNodeAttributes.get(_cacheKey);
      }
      HashMap<String, ID> _newHashMap = CollectionLiterals.<String, ID>newHashMap();
      _result = _newHashMap;
      _createCache_globalNodeAttributes.put(_cacheKey, _result);
    }
    _init_globalNodeAttributes(_result, context);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Map<String, ID>> _createCache_globalNodeAttributes = CollectionLiterals.newHashMap();
  
  private void _init_globalNodeAttributes(final HashMap<String, ID> it, final Graph.Builder context) {
  }
  
  private Map<String, ID> globalEdgeAttributes(final Graph.Builder context) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(context);
    final HashMap<String, ID> _result;
    synchronized (_createCache_globalEdgeAttributes) {
      if (_createCache_globalEdgeAttributes.containsKey(_cacheKey)) {
        return _createCache_globalEdgeAttributes.get(_cacheKey);
      }
      HashMap<String, ID> _newHashMap = CollectionLiterals.<String, ID>newHashMap();
      _result = _newHashMap;
      _createCache_globalEdgeAttributes.put(_cacheKey, _result);
    }
    _init_globalEdgeAttributes(_result, context);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Map<String, ID>> _createCache_globalEdgeAttributes = CollectionLiterals.newHashMap();
  
  private void _init_globalEdgeAttributes(final HashMap<String, ID> it, final Graph.Builder context) {
  }
  
  private Graph transformDotGraph(final DotGraph it) {
    Graph _xblockexpression = null;
    {
      this._createCache_globalGraphAttributes.clear();
      this._createCache_globalNodeAttributes.clear();
      this._createCache_globalEdgeAttributes.clear();
      this._createCache_createNode.clear();
      this._createCache_createSubgraph.clear();
      final Graph.Builder graphBuilder = new Graph.Builder();
      ID _name = it.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        ID _name_1 = it.getName();
        graphBuilder.attr(DotAttributes._NAME__GNE, _name_1);
      }
      GraphType _type = it.getType();
      graphBuilder.attr(DotAttributes._TYPE__G, _type);
      EList<Stmt> _stmts = it.getStmts();
      final Function1<Stmt, Boolean> _function = new Function1<Stmt, Boolean>() {
        public Boolean apply(final Stmt it) {
          return Boolean.valueOf((!(it instanceof Attribute)));
        }
      };
      Iterable<Stmt> _filter = IterableExtensions.<Stmt>filter(_stmts, _function);
      final Consumer<Stmt> _function_1 = new Consumer<Stmt>() {
        public void accept(final Stmt it) {
          DotImport.this.transformStmt(it, graphBuilder);
        }
      };
      _filter.forEach(_function_1);
      final Graph graph = graphBuilder.build();
      final Procedure2<String, Procedure2<? super Graph, ? super ID>> _function_2 = new Procedure2<String, Procedure2<? super Graph, ? super ID>>() {
        public void apply(final String attributeName, final Procedure2<? super Graph, ? super ID> f) {
          final ID attributeValue = DotAstHelper.getAttributeValue(it, attributeName);
          boolean _tripleNotEquals = (attributeValue != null);
          if (_tripleNotEquals) {
            f.apply(graph, attributeValue);
          } else {
            Map<String, ID> _globalGraphAttributes = DotImport.this.globalGraphAttributes(graphBuilder);
            boolean _containsKey = _globalGraphAttributes.containsKey(attributeName);
            if (_containsKey) {
              Map<String, ID> _globalGraphAttributes_1 = DotImport.this.globalGraphAttributes(graphBuilder);
              ID _get = _globalGraphAttributes_1.get(attributeName);
              f.apply(graph, _get);
            }
          }
        }
      };
      final Procedure2<String, Procedure2<? super Graph, ? super ID>> setter = _function_2;
      final Procedure2<Graph, ID> _function_3 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setBbRaw(g, value);
        }
      };
      setter.apply(DotAttributes.BB__GC, _function_3);
      final Procedure2<Graph, ID> _function_4 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setBgcolorRaw(g, value);
        }
      };
      setter.apply(DotAttributes.BGCOLOR__GC, _function_4);
      final Procedure2<Graph, ID> _function_5 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setClusterrankRaw(g, value);
        }
      };
      setter.apply(DotAttributes.CLUSTERRANK__G, _function_5);
      final Procedure2<Graph, ID> _function_6 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setFontcolorRaw(g, value);
        }
      };
      setter.apply(DotAttributes.FONTCOLOR__GCNE, _function_6);
      final Procedure2<Graph, ID> _function_7 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setLabelRaw(g, value);
        }
      };
      setter.apply(DotAttributes.LABEL__GCNE, _function_7);
      final Procedure2<Graph, ID> _function_8 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setLayoutRaw(g, value);
        }
      };
      setter.apply(DotAttributes.LAYOUT__G, _function_8);
      final Procedure2<Graph, ID> _function_9 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setOutputorderRaw(g, value);
        }
      };
      setter.apply(DotAttributes.OUTPUTORDER__G, _function_9);
      final Procedure2<Graph, ID> _function_10 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setPagedirRaw(g, value);
        }
      };
      setter.apply(DotAttributes.PAGEDIR__G, _function_10);
      final Procedure2<Graph, ID> _function_11 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setRankdirRaw(g, value);
        }
      };
      setter.apply(DotAttributes.RANKDIR__G, _function_11);
      final Procedure2<Graph, ID> _function_12 = new Procedure2<Graph, ID>() {
        public void apply(final Graph g, final ID value) {
          DotAttributes.setSplinesRaw(g, value);
        }
      };
      setter.apply(DotAttributes.SPLINES__G, _function_12);
      _xblockexpression = graph;
    }
    return _xblockexpression;
  }
  
  private Node transformNodeId(final NodeId it, final Graph.Builder graphBuilder) {
    AttrList _createAttrList = DotFactory.eINSTANCE.createAttrList();
    return this.transformNodeId(it, Collections.<AttrList>unmodifiableList(CollectionLiterals.<AttrList>newArrayList(_createAttrList)), graphBuilder);
  }
  
  private Node transformNodeId(final NodeId it, final List<AttrList> attrLists, final Graph.Builder graphBuilder) {
    Node _xblockexpression = null;
    {
      ID _name = it.getName();
      String _value = _name.toValue();
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_value);
      final boolean isExistingNode = this._createCache_createNode.containsKey(_newArrayList);
      ID _name_1 = it.getName();
      String _value_1 = _name_1.toValue();
      final Node node = this.createNode(_value_1);
      if ((!isExistingNode)) {
        ID _name_2 = it.getName();
        DotAttributes._setNameRaw(node, _name_2);
        graphBuilder.nodes(node);
      }
      final Procedure2<String, Procedure2<? super Node, ? super ID>> _function = new Procedure2<String, Procedure2<? super Node, ? super ID>>() {
        public void apply(final String attributeName, final Procedure2<? super Node, ? super ID> f) {
          final ID attributeValue = DotAstHelper.getAttributeValue(attrLists, attributeName);
          boolean _tripleNotEquals = (attributeValue != null);
          if (_tripleNotEquals) {
            f.apply(node, attributeValue);
          } else {
            boolean _and = false;
            if (!(!isExistingNode)) {
              _and = false;
            } else {
              Map<String, ID> _globalNodeAttributes = DotImport.this.globalNodeAttributes(graphBuilder);
              boolean _containsKey = _globalNodeAttributes.containsKey(attributeName);
              _and = _containsKey;
            }
            if (_and) {
              Map<String, ID> _globalNodeAttributes_1 = DotImport.this.globalNodeAttributes(graphBuilder);
              ID _get = _globalNodeAttributes_1.get(attributeName);
              f.apply(node, _get);
            }
          }
        }
      };
      final Procedure2<String, Procedure2<? super Node, ? super ID>> setter = _function;
      final Procedure2<Node, ID> _function_1 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setColorRaw(n, value);
        }
      };
      setter.apply(DotAttributes.COLOR__CNE, _function_1);
      final Procedure2<Node, ID> _function_2 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setColorschemeRaw(n, value);
        }
      };
      setter.apply(DotAttributes.COLORSCHEME__GCNE, _function_2);
      final Procedure2<Node, ID> _function_3 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setDistortionRaw(n, value);
        }
      };
      setter.apply(DotAttributes.DISTORTION__N, _function_3);
      final Procedure2<Node, ID> _function_4 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setFillcolorRaw(n, value);
        }
      };
      setter.apply(DotAttributes.FILLCOLOR__CNE, _function_4);
      final Procedure2<Node, ID> _function_5 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setFixedsizeRaw(n, value);
        }
      };
      setter.apply(DotAttributes.FIXEDSIZE__N, _function_5);
      final Procedure2<Node, ID> _function_6 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setFontcolorRaw(n, value);
        }
      };
      setter.apply(DotAttributes.FONTCOLOR__GCNE, _function_6);
      final Procedure2<Node, ID> _function_7 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setHeightRaw(n, value);
        }
      };
      setter.apply(DotAttributes.HEIGHT__N, _function_7);
      final Procedure2<Node, ID> _function_8 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setIdRaw(n, value);
        }
      };
      setter.apply(DotAttributes.ID__GCNE, _function_8);
      final Procedure2<Node, ID> _function_9 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setLabelRaw(n, value);
        }
      };
      setter.apply(DotAttributes.LABEL__GCNE, _function_9);
      final Procedure2<Node, ID> _function_10 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setPosRaw(n, value);
        }
      };
      setter.apply(DotAttributes.POS__NE, _function_10);
      final Procedure2<Node, ID> _function_11 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setShapeRaw(n, value);
        }
      };
      setter.apply(DotAttributes.SHAPE__N, _function_11);
      final Procedure2<Node, ID> _function_12 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setSidesRaw(n, value);
        }
      };
      setter.apply(DotAttributes.SIDES__N, _function_12);
      final Procedure2<Node, ID> _function_13 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setSkewRaw(n, value);
        }
      };
      setter.apply(DotAttributes.SKEW__N, _function_13);
      final Procedure2<Node, ID> _function_14 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setStyleRaw(n, value);
        }
      };
      setter.apply(DotAttributes.STYLE__GCNE, _function_14);
      final Procedure2<Node, ID> _function_15 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setWidthRaw(n, value);
        }
      };
      setter.apply(DotAttributes.WIDTH__N, _function_15);
      final Procedure2<Node, ID> _function_16 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setXlabelRaw(n, value);
        }
      };
      setter.apply(DotAttributes.XLABEL__NE, _function_16);
      final Procedure2<Node, ID> _function_17 = new Procedure2<Node, ID>() {
        public void apply(final Node n, final ID value) {
          DotAttributes.setXlpRaw(n, value);
        }
      };
      setter.apply(DotAttributes.XLP__NE, _function_17);
      _xblockexpression = node;
    }
    return _xblockexpression;
  }
  
  /**
   * dynamic dispatch methods
   */
  private void _transformStmt(final Stmt it, final Graph.Builder graphBuilder) {
    System.err.println(("DotImport cannot transform Stmt: " + it));
  }
  
  private void _transformStmt(final AttrStmt it, final Graph.Builder graphBuilder) {
    AttributeType _type = it.getType();
    if (_type != null) {
      switch (_type) {
        case GRAPH:
          EList<AttrList> _attrLists = it.getAttrLists();
          final Consumer<AttrList> _function = new Consumer<AttrList>() {
            public void accept(final AttrList it) {
              EList<Attribute> _attributes = it.getAttributes();
              final Consumer<Attribute> _function = new Consumer<Attribute>() {
                public void accept(final Attribute it) {
                  Map<String, ID> _globalGraphAttributes = DotImport.this.globalGraphAttributes(graphBuilder);
                  ID _name = it.getName();
                  String _value = _name.toValue();
                  ID _value_1 = it.getValue();
                  _globalGraphAttributes.put(_value, _value_1);
                }
              };
              _attributes.forEach(_function);
            }
          };
          _attrLists.forEach(_function);
          break;
        case NODE:
          EList<AttrList> _attrLists_1 = it.getAttrLists();
          final Consumer<AttrList> _function_1 = new Consumer<AttrList>() {
            public void accept(final AttrList it) {
              EList<Attribute> _attributes = it.getAttributes();
              final Consumer<Attribute> _function = new Consumer<Attribute>() {
                public void accept(final Attribute it) {
                  Map<String, ID> _globalNodeAttributes = DotImport.this.globalNodeAttributes(graphBuilder);
                  ID _name = it.getName();
                  String _value = _name.toValue();
                  ID _value_1 = it.getValue();
                  _globalNodeAttributes.put(_value, _value_1);
                }
              };
              _attributes.forEach(_function);
            }
          };
          _attrLists_1.forEach(_function_1);
          break;
        case EDGE:
          EList<AttrList> _attrLists_2 = it.getAttrLists();
          final Consumer<AttrList> _function_2 = new Consumer<AttrList>() {
            public void accept(final AttrList it) {
              EList<Attribute> _attributes = it.getAttributes();
              final Consumer<Attribute> _function = new Consumer<Attribute>() {
                public void accept(final Attribute it) {
                  Map<String, ID> _globalEdgeAttributes = DotImport.this.globalEdgeAttributes(graphBuilder);
                  ID _name = it.getName();
                  String _value = _name.toValue();
                  ID _value_1 = it.getValue();
                  _globalEdgeAttributes.put(_value, _value_1);
                }
              };
              _attributes.forEach(_function);
            }
          };
          _attrLists_2.forEach(_function_2);
          break;
        default:
          break;
      }
    }
  }
  
  private void _transformStmt(final NodeStmt it, final Graph.Builder graphBuilder) {
    NodeId _node = it.getNode();
    EList<AttrList> _attrLists = it.getAttrLists();
    this.transformNodeId(_node, _attrLists, graphBuilder);
  }
  
  private void _transformStmt(final EdgeStmtNode it, final Graph.Builder graphBuilder) {
    NodeId _node = it.getNode();
    Node sourceNode = this.transformNodeId(_node, graphBuilder);
    EList<EdgeRhs> _edgeRHS = it.getEdgeRHS();
    for (final EdgeRhs edgeRhs : _edgeRHS) {
      boolean _matched = false;
      if (!_matched) {
        if (edgeRhs instanceof EdgeRhsNode) {
          _matched=true;
          NodeId _node_1 = ((EdgeRhsNode)edgeRhs).getNode();
          final Node targetNode = this.transformNodeId(_node_1, graphBuilder);
          EdgeOp _op = ((EdgeRhsNode)edgeRhs).getOp();
          String _literal = _op.getLiteral();
          EList<AttrList> _attrLists = it.getAttrLists();
          Edge _createEdge = this.createEdge(sourceNode, _literal, targetNode, _attrLists, graphBuilder);
          graphBuilder.edges(_createEdge);
          sourceNode = targetNode;
        }
      }
      if (!_matched) {
        System.err.println(("DotImport cannot transform EdgeStmtNode: " + it));
      }
    }
  }
  
  private void _transformStmt(final Subgraph it, final Graph.Builder graphBuilder) {
    boolean _and = false;
    ID _name = it.getName();
    boolean _tripleNotEquals = (_name != null);
    if (!_tripleNotEquals) {
      _and = false;
    } else {
      ID _name_1 = it.getName();
      String _value = _name_1.toValue();
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(_value);
      boolean _containsKey = this._createCache_createSubgraph.containsKey(_newArrayList);
      _and = _containsKey;
    }
    final boolean isExistingSubgraph = _and;
    final Graph.Builder subgraphBuilder = new Graph.Builder();
    Node _xifexpression = null;
    ID _name_2 = it.getName();
    boolean _tripleEquals = (_name_2 == null);
    if (_tripleEquals) {
      int _identityHashCode = System.identityHashCode(subgraphBuilder);
      String _string = Integer.valueOf(_identityHashCode).toString();
      _xifexpression = this.createSubgraph(_string);
    } else {
      ID _name_3 = it.getName();
      String _value_1 = _name_3.toValue();
      _xifexpression = this.createSubgraph(_value_1);
    }
    final Node subgraphNode = _xifexpression;
    ID _name_4 = it.getName();
    boolean _tripleNotEquals_1 = (_name_4 != null);
    if (_tripleNotEquals_1) {
      ID _name_5 = it.getName();
      subgraphBuilder.attr(DotAttributes._NAME__GNE, _name_5);
    }
    Map<String, ID> _globalGraphAttributes = this.globalGraphAttributes(subgraphBuilder);
    Map<String, ID> _globalGraphAttributes_1 = this.globalGraphAttributes(graphBuilder);
    _globalGraphAttributes.putAll(_globalGraphAttributes_1);
    Map<String, ID> _globalNodeAttributes = this.globalNodeAttributes(subgraphBuilder);
    Map<String, ID> _globalNodeAttributes_1 = this.globalNodeAttributes(graphBuilder);
    _globalNodeAttributes.putAll(_globalNodeAttributes_1);
    Map<String, ID> _globalEdgeAttributes = this.globalEdgeAttributes(subgraphBuilder);
    Map<String, ID> _globalEdgeAttributes_1 = this.globalEdgeAttributes(graphBuilder);
    _globalEdgeAttributes.putAll(_globalEdgeAttributes_1);
    EList<Stmt> _stmts = it.getStmts();
    final Consumer<Stmt> _function = new Consumer<Stmt>() {
      public void accept(final Stmt it) {
        DotImport.this.transformStmt(it, subgraphBuilder);
      }
    };
    _stmts.forEach(_function);
    final Graph subgraph = subgraphBuilder.build();
    if ((!isExistingSubgraph)) {
      subgraphNode.setNestedGraph(subgraph);
      subgraph.setNestingNode(subgraphNode);
      graphBuilder.nodes(subgraphNode);
    } else {
      Graph _nestedGraph = subgraphNode.getNestedGraph();
      ObservableMap<String, Object> _attributes = _nestedGraph.getAttributes();
      ObservableMap<String, Object> _attributes_1 = subgraph.getAttributes();
      _attributes.putAll(_attributes_1);
      Graph _nestedGraph_1 = subgraphNode.getNestedGraph();
      ObservableList<Node> _nodes = _nestedGraph_1.getNodes();
      ObservableList<Node> _nodes_1 = subgraph.getNodes();
      final Function1<Node, Boolean> _function_1 = new Function1<Node, Boolean>() {
        public Boolean apply(final Node it) {
          Graph _nestedGraph = subgraphNode.getNestedGraph();
          ObservableList<Node> _nodes = _nestedGraph.getNodes();
          boolean _contains = _nodes.contains(it);
          return Boolean.valueOf((!_contains));
        }
      };
      Iterable<Node> _filter = IterableExtensions.<Node>filter(_nodes_1, _function_1);
      Iterables.<Node>addAll(_nodes, _filter);
      Graph _nestedGraph_2 = subgraphNode.getNestedGraph();
      ObservableList<Edge> _edges = _nestedGraph_2.getEdges();
      ObservableList<Edge> _edges_1 = subgraph.getEdges();
      final Function1<Edge, Boolean> _function_2 = new Function1<Edge, Boolean>() {
        public Boolean apply(final Edge it) {
          Graph _nestedGraph = subgraphNode.getNestedGraph();
          ObservableList<Node> _nodes = _nestedGraph.getNodes();
          boolean _contains = _nodes.contains(it);
          return Boolean.valueOf((!_contains));
        }
      };
      Iterable<Edge> _filter_1 = IterableExtensions.<Edge>filter(_edges_1, _function_2);
      Iterables.<Edge>addAll(_edges, _filter_1);
    }
    final Procedure2<String, Procedure2<? super Graph, ? super ID>> _function_3 = new Procedure2<String, Procedure2<? super Graph, ? super ID>>() {
      public void apply(final String attributeName, final Procedure2<? super Graph, ? super ID> f) {
        final ID attributeValue = DotAstHelper.getAttributeValue(it, attributeName);
        boolean _tripleNotEquals = (attributeValue != null);
        if (_tripleNotEquals) {
          f.apply(subgraph, attributeValue);
        } else {
          Map<String, ID> _globalGraphAttributes = DotImport.this.globalGraphAttributes(subgraphBuilder);
          boolean _containsKey = _globalGraphAttributes.containsKey(attributeName);
          if (_containsKey) {
            Map<String, ID> _globalGraphAttributes_1 = DotImport.this.globalGraphAttributes(subgraphBuilder);
            ID _get = _globalGraphAttributes_1.get(attributeName);
            f.apply(subgraph, _get);
          }
        }
      }
    };
    final Procedure2<String, Procedure2<? super Graph, ? super ID>> setter = _function_3;
    final Procedure2<Graph, ID> _function_4 = new Procedure2<Graph, ID>() {
      public void apply(final Graph g, final ID value) {
        DotAttributes.setBbRaw(g, value);
      }
    };
    setter.apply(DotAttributes.BB__GC, _function_4);
    final Procedure2<Graph, ID> _function_5 = new Procedure2<Graph, ID>() {
      public void apply(final Graph g, final ID value) {
        DotAttributes.setBgcolorRaw(g, value);
      }
    };
    setter.apply(DotAttributes.BGCOLOR__GC, _function_5);
    final Procedure2<Graph, ID> _function_6 = new Procedure2<Graph, ID>() {
      public void apply(final Graph g, final ID value) {
        DotAttributes.setFontcolorRaw(g, value);
      }
    };
    setter.apply(DotAttributes.FONTCOLOR__GCNE, _function_6);
    final Procedure2<Graph, ID> _function_7 = new Procedure2<Graph, ID>() {
      public void apply(final Graph g, final ID value) {
        DotAttributes.setLabelRaw(g, value);
      }
    };
    setter.apply(DotAttributes.LABEL__GCNE, _function_7);
    final Procedure2<Graph, ID> _function_8 = new Procedure2<Graph, ID>() {
      public void apply(final Graph g, final ID value) {
        DotAttributes.setRankRaw(g, value);
      }
    };
    setter.apply(DotAttributes.RANK__S, _function_8);
  }
  
  private Node createSubgraph(final String subgraphName) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(subgraphName);
    final Node _result;
    synchronized (_createCache_createSubgraph) {
      if (_createCache_createSubgraph.containsKey(_cacheKey)) {
        return _createCache_createSubgraph.get(_cacheKey);
      }
      Node.Builder _builder = new Node.Builder();
      Node _buildNode = _builder.buildNode();
      _result = _buildNode;
      _createCache_createSubgraph.put(_cacheKey, _result);
    }
    _init_createSubgraph(_result, subgraphName);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Node> _createCache_createSubgraph = CollectionLiterals.newHashMap();
  
  private void _init_createSubgraph(final Node it, final String subgraphName) {
  }
  
  private Node createNode(final String nodeName) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(nodeName);
    final Node _result;
    synchronized (_createCache_createNode) {
      if (_createCache_createNode.containsKey(_cacheKey)) {
        return _createCache_createNode.get(_cacheKey);
      }
      Node.Builder _builder = new Node.Builder();
      Node _buildNode = _builder.buildNode();
      _result = _buildNode;
      _createCache_createNode.put(_cacheKey, _result);
    }
    _init_createNode(_result, nodeName);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, Node> _createCache_createNode = CollectionLiterals.newHashMap();
  
  private void _init_createNode(final Node it, final String nodeName) {
  }
  
  private Edge createEdge(final Node sourceNode, final String edgeOp, final Node targetNode, final List<AttrList> attrLists, final Graph.Builder graphBuilder) {
    Edge _xblockexpression = null;
    {
      Edge.Builder _builder = new Edge.Builder(sourceNode, targetNode);
      final Edge edge = _builder.buildEdge();
      final Procedure2<String, Procedure2<? super Edge, ? super ID>> _function = new Procedure2<String, Procedure2<? super Edge, ? super ID>>() {
        public void apply(final String attributeName, final Procedure2<? super Edge, ? super ID> f) {
          final ID attributeValue = DotAstHelper.getAttributeValue(attrLists, attributeName);
          boolean _tripleNotEquals = (attributeValue != null);
          if (_tripleNotEquals) {
            f.apply(edge, attributeValue);
          } else {
            Map<String, ID> _globalEdgeAttributes = DotImport.this.globalEdgeAttributes(graphBuilder);
            boolean _containsKey = _globalEdgeAttributes.containsKey(attributeName);
            if (_containsKey) {
              Map<String, ID> _globalEdgeAttributes_1 = DotImport.this.globalEdgeAttributes(graphBuilder);
              ID _get = _globalEdgeAttributes_1.get(attributeName);
              f.apply(edge, _get);
            }
          }
        }
      };
      final Procedure2<String, Procedure2<? super Edge, ? super ID>> setter = _function;
      final Procedure2<Edge, ID> _function_1 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setArrowheadRaw(e, value);
        }
      };
      setter.apply(DotAttributes.ARROWHEAD__E, _function_1);
      final Procedure2<Edge, ID> _function_2 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setArrowsizeRaw(e, value);
        }
      };
      setter.apply(DotAttributes.ARROWSIZE__E, _function_2);
      final Procedure2<Edge, ID> _function_3 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setArrowtailRaw(e, value);
        }
      };
      setter.apply(DotAttributes.ARROWTAIL__E, _function_3);
      final Procedure2<Edge, ID> _function_4 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setColorRaw(e, value);
        }
      };
      setter.apply(DotAttributes.COLOR__CNE, _function_4);
      final Procedure2<Edge, ID> _function_5 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setColorschemeRaw(e, value);
        }
      };
      setter.apply(DotAttributes.COLORSCHEME__GCNE, _function_5);
      final Procedure2<Edge, ID> _function_6 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setDirRaw(e, value);
        }
      };
      setter.apply(DotAttributes.DIR__E, _function_6);
      final Procedure2<Edge, ID> _function_7 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setFillcolorRaw(e, value);
        }
      };
      setter.apply(DotAttributes.FILLCOLOR__CNE, _function_7);
      final Procedure2<Edge, ID> _function_8 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setFontcolorRaw(e, value);
        }
      };
      setter.apply(DotAttributes.FONTCOLOR__GCNE, _function_8);
      final Procedure2<Edge, ID> _function_9 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setHeadLpRaw(e, value);
        }
      };
      setter.apply(DotAttributes.HEAD_LP__E, _function_9);
      final Procedure2<Edge, ID> _function_10 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setHeadlabelRaw(e, value);
        }
      };
      setter.apply(DotAttributes.HEADLABEL__E, _function_10);
      final Procedure2<Edge, ID> _function_11 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setIdRaw(e, value);
        }
      };
      setter.apply(DotAttributes.ID__GCNE, _function_11);
      final Procedure2<Edge, ID> _function_12 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setLabelRaw(e, value);
        }
      };
      setter.apply(DotAttributes.LABEL__GCNE, _function_12);
      final Procedure2<Edge, ID> _function_13 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setLabelfontcolorRaw(e, value);
        }
      };
      setter.apply(DotAttributes.LABELFONTCOLOR__E, _function_13);
      final Procedure2<Edge, ID> _function_14 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setLpRaw(e, value);
        }
      };
      setter.apply(DotAttributes.LP__GCE, _function_14);
      final Procedure2<Edge, ID> _function_15 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setPosRaw(e, value);
        }
      };
      setter.apply(DotAttributes.POS__NE, _function_15);
      final Procedure2<Edge, ID> _function_16 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setStyleRaw(e, value);
        }
      };
      setter.apply(DotAttributes.STYLE__GCNE, _function_16);
      final Procedure2<Edge, ID> _function_17 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setTaillabelRaw(e, value);
        }
      };
      setter.apply(DotAttributes.TAILLABEL__E, _function_17);
      final Procedure2<Edge, ID> _function_18 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setTailLpRaw(e, value);
        }
      };
      setter.apply(DotAttributes.TAIL_LP__E, _function_18);
      final Procedure2<Edge, ID> _function_19 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setXlabelRaw(e, value);
        }
      };
      setter.apply(DotAttributes.XLABEL__NE, _function_19);
      final Procedure2<Edge, ID> _function_20 = new Procedure2<Edge, ID>() {
        public void apply(final Edge e, final ID value) {
          DotAttributes.setXlpRaw(e, value);
        }
      };
      setter.apply(DotAttributes.XLP__NE, _function_20);
      _xblockexpression = edge;
    }
    return _xblockexpression;
  }
  
  private void transformStmt(final Stmt it, final Graph.Builder graphBuilder) {
    if (it instanceof Subgraph) {
      _transformStmt((Subgraph)it, graphBuilder);
      return;
    } else if (it instanceof AttrStmt) {
      _transformStmt((AttrStmt)it, graphBuilder);
      return;
    } else if (it instanceof EdgeStmtNode) {
      _transformStmt((EdgeStmtNode)it, graphBuilder);
      return;
    } else if (it instanceof NodeStmt) {
      _transformStmt((NodeStmt)it, graphBuilder);
      return;
    } else if (it != null) {
      _transformStmt(it, graphBuilder);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it, graphBuilder).toString());
    }
  }
}
