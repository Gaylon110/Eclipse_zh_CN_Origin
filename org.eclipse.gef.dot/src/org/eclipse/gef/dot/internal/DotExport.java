/**
 * Copyright (c) 2016, 2017 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexander Nyßen (itemis AG) - initial API and implementation
 *     Tamas Miklossy  (itemis AG) - minor refactorings
 */
package org.eclipse.gef.dot.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import org.eclipse.gef.common.attributes.IAttributeStore;
import org.eclipse.gef.dot.internal.DotAttributes;
import org.eclipse.gef.dot.internal.DotFileUtils;
import org.eclipse.gef.dot.internal.language.dot.GraphType;
import org.eclipse.gef.dot.internal.language.terminals.ID;
import org.eclipse.gef.graph.Edge;
import org.eclipse.gef.graph.Graph;
import org.eclipse.gef.graph.Node;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * A serializer that creates a Graphviz DOT string or file from a {@link Graph} with {@link DotAttributes}.
 * 
 * @author anyssen
 */
@SuppressWarnings("all")
public class DotExport {
  public String exportDot(final Graph graph) {
    ArrayList<Graph> _newArrayList = CollectionLiterals.<Graph>newArrayList(graph);
    return this.exportDot(_newArrayList);
  }
  
  public String exportDot(final List<Graph> graphs) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder();
      for (final Graph graph : graphs) {
        {
          GraphType _type = this.type(graph);
          boolean _tripleEquals = (_type == null);
          if (_tripleEquals) {
            throw new IllegalArgumentException(
              (((("The " + DotAttributes._TYPE__G) + " attribute has to be set on the input graph ") + graph) + "."));
          }
          ObservableList<Node> _nodes = graph.getNodes();
          final Function1<Node, Boolean> _function = new Function1<Node, Boolean>() {
            public Boolean apply(final Node it) {
              Graph _nestedGraph = it.getNestedGraph();
              return Boolean.valueOf((_nestedGraph == null));
            }
          };
          Iterable<Node> _filter = IterableExtensions.<Node>filter(_nodes, _function);
          final Function1<Node, Boolean> _function_1 = new Function1<Node, Boolean>() {
            public Boolean apply(final Node it) {
              boolean _hasName = DotExport.this.hasName(it);
              return Boolean.valueOf((!_hasName));
            }
          };
          boolean _exists = IterableExtensions.<Node>exists(_filter, _function_1);
          if (_exists) {
            throw new IllegalArgumentException(
              (((("The " + DotAttributes._NAME__GNE) + " attribute has to be set for all nodes of the input graph ") + graph) + "."));
          }
          String _print = this.print(graph);
          builder.append(_print);
        }
      }
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  public File exportDot(final Graph graph, final String pathname) {
    String _exportDot = this.exportDot(graph);
    File _file = new File(pathname);
    return DotFileUtils.write(_exportDot, _file);
  }
  
  public File exportDot(final List<Graph> graphs, final String pathname) {
    String _exportDot = this.exportDot(graphs);
    File _file = new File(pathname);
    return DotFileUtils.write(_exportDot, _file);
  }
  
  private String print(final Graph it) {
    StringConcatenation _builder = new StringConcatenation();
    GraphType _type = this.type(it);
    _builder.append(_type, "");
    _builder.append(" ");
    {
      boolean _hasName = this.hasName(it);
      if (_hasName) {
        String _name = this.name(it);
        _builder.append(_name, "");
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      boolean _hasNonMetaAttributes = this.hasNonMetaAttributes(it);
      if (_hasNonMetaAttributes) {
        _builder.append("\t");
        String _printNonMetaAttributes = this.printNonMetaAttributes(it, ";");
        _builder.append(_printNonMetaAttributes, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    ObservableList<Node> _nodes = it.getNodes();
    final Function1<Node, String> _function = new Function1<Node, String>() {
      public String apply(final Node it) {
        return DotExport.this.print(it);
      }
    };
    List<String> _map = ListExtensions.<Node, String>map(_nodes, _function);
    String _join = IterableExtensions.join(_map, "; ");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    {
      ObservableList<Edge> _edges = it.getEdges();
      for(final Edge edge : _edges) {
        _builder.append("\t");
        String _name_1 = this.name(edge);
        _builder.append(_name_1, "\t");
        {
          boolean _hasNonMetaAttributes_1 = this.hasNonMetaAttributes(edge);
          if (_hasNonMetaAttributes_1) {
            _builder.append(" [");
            String _printNonMetaAttributes_1 = this.printNonMetaAttributes(edge, ",");
            _builder.append(_printNonMetaAttributes_1, "\t");
            _builder.append("]");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private boolean isMetaAttribute(final String it) {
    return it.startsWith("_");
  }
  
  private String print(final Node it) {
    String _xifexpression = null;
    Graph _nestedGraph = it.getNestedGraph();
    boolean _tripleNotEquals = (_nestedGraph != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("subgraph ");
      {
        Graph _nestedGraph_1 = it.getNestedGraph();
        boolean _hasName = this.hasName(_nestedGraph_1);
        if (_hasName) {
          Graph _nestedGraph_2 = it.getNestedGraph();
          String _name = this.name(_nestedGraph_2);
          _builder.append(_name, "");
          _builder.append(" ");
        }
      }
      _builder.append("{");
      _builder.newLineIfNotEmpty();
      {
        Graph _nestedGraph_3 = it.getNestedGraph();
        boolean _hasNonMetaAttributes = this.hasNonMetaAttributes(_nestedGraph_3);
        if (_hasNonMetaAttributes) {
          _builder.append("\t");
          Graph _nestedGraph_4 = it.getNestedGraph();
          String _printNonMetaAttributes = this.printNonMetaAttributes(_nestedGraph_4, ";");
          _builder.append(_printNonMetaAttributes, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t");
      Graph _nestedGraph_5 = it.getNestedGraph();
      ObservableList<Node> _nodes = _nestedGraph_5.getNodes();
      final Function1<Node, String> _function = new Function1<Node, String>() {
        public String apply(final Node it) {
          return DotExport.this.print(it);
        }
      };
      List<String> _map = ListExtensions.<Node, String>map(_nodes, _function);
      String _join = IterableExtensions.join(_map, "; ");
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      {
        Graph _nestedGraph_6 = it.getNestedGraph();
        ObservableList<Edge> _edges = _nestedGraph_6.getEdges();
        for(final Edge edge : _edges) {
          _builder.append("\t");
          String _name_1 = this.name(edge);
          _builder.append(_name_1, "\t");
          {
            boolean _hasNonMetaAttributes_1 = this.hasNonMetaAttributes(edge);
            if (_hasNonMetaAttributes_1) {
              _builder.append(" [");
              String _printNonMetaAttributes_1 = this.printNonMetaAttributes(edge, ",");
              _builder.append(_printNonMetaAttributes_1, "\t");
              _builder.append("]");
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _xifexpression = _builder.toString();
    } else {
      String _name_2 = this.name(it);
      String _xifexpression_1 = null;
      boolean _hasNonMetaAttributes_2 = this.hasNonMetaAttributes(it);
      if (_hasNonMetaAttributes_2) {
        String _printNonMetaAttributes_2 = this.printNonMetaAttributes(it, ",");
        String _plus = (" [" + _printNonMetaAttributes_2);
        _xifexpression_1 = (_plus + "]");
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = (_name_2 + _xifexpression_1);
    }
    return _xifexpression;
  }
  
  private boolean hasName(final IAttributeStore it) {
    ObservableMap<String, Object> _attributes = it.getAttributes();
    Object _get = _attributes.get(DotAttributes._NAME__GNE);
    return (_get != null);
  }
  
  private GraphType type(final Graph it) {
    return DotAttributes._getType(it);
  }
  
  private String _name(final IAttributeStore it) {
    ObservableMap<String, Object> _attributes = it.getAttributes();
    Object _get = _attributes.get(DotAttributes._NAME__GNE);
    return ((ID) _get).toValue();
  }
  
  private String _name(final Edge it) {
    return DotAttributes._getName(it);
  }
  
  private boolean hasNonMetaAttributes(final IAttributeStore it) {
    ObservableMap<String, Object> _attributes = it.getAttributes();
    Set<String> _keySet = _attributes.keySet();
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String it) {
        boolean _isMetaAttribute = DotExport.this.isMetaAttribute(it);
        return Boolean.valueOf((!_isMetaAttribute));
      }
    };
    return IterableExtensions.<String>exists(_keySet, _function);
  }
  
  private String printNonMetaAttributes(final IAttributeStore it, final String separator) {
    ObservableMap<String, Object> _attributes = it.getAttributes();
    Set<Map.Entry<String, Object>> _entrySet = _attributes.entrySet();
    final Function1<Map.Entry<String, Object>, Boolean> _function = new Function1<Map.Entry<String, Object>, Boolean>() {
      public Boolean apply(final Map.Entry<String, Object> it) {
        String _key = it.getKey();
        boolean _isMetaAttribute = DotExport.this.isMetaAttribute(_key);
        return Boolean.valueOf((!_isMetaAttribute));
      }
    };
    Iterable<Map.Entry<String, Object>> _filter = IterableExtensions.<Map.Entry<String, Object>>filter(_entrySet, _function);
    final Function1<Map.Entry<String, Object>, String> _function_1 = new Function1<Map.Entry<String, Object>, String>() {
      public String apply(final Map.Entry<String, Object> it) {
        String _key = it.getKey();
        String _plus = (_key + "=");
        Object _value = it.getValue();
        String _string = _value.toString();
        return (_plus + _string);
      }
    };
    Iterable<String> _map = IterableExtensions.<Map.Entry<String, Object>, String>map(_filter, _function_1);
    List<String> _sort = IterableExtensions.<String>sort(_map);
    return IterableExtensions.join(_sort, (separator + " "));
  }
  
  private String name(final IAttributeStore it) {
    if (it instanceof Edge) {
      return _name((Edge)it);
    } else if (it != null) {
      return _name(it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}
