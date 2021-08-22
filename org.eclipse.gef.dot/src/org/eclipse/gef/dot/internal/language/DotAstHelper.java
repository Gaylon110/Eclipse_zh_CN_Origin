/**
 * Copyright (c) 2017 itemis AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tamas Miklossy (itemis AG) - initial API and implementation
 */
package org.eclipse.gef.dot.internal.language;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.dot.internal.language.dot.AttrList;
import org.eclipse.gef.dot.internal.language.dot.Attribute;
import org.eclipse.gef.dot.internal.language.dot.DotGraph;
import org.eclipse.gef.dot.internal.language.dot.Stmt;
import org.eclipse.gef.dot.internal.language.dot.Subgraph;
import org.eclipse.gef.dot.internal.language.terminals.ID;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class provides helper methods for walking the DOT abstract syntax tree.
 */
@SuppressWarnings("all")
public class DotAstHelper {
  public static ID getAttributeValue(final DotGraph graph, final String name) {
    Object _xblockexpression = null;
    {
      EList<Stmt> _stmts = graph.getStmts();
      for (final Stmt stmt : _stmts) {
        {
          ID _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (stmt instanceof Attribute) {
              _matched=true;
              _switchResult = DotAstHelper.getAttributeValue(((Attribute)stmt), name);
            }
          }
          ID value = _switchResult;
          boolean _tripleNotEquals = (value != null);
          if (_tripleNotEquals) {
            return value;
          }
        }
      }
      _xblockexpression = null;
    }
    return ((ID)_xblockexpression);
  }
  
  public static ID getAttributeValue(final Subgraph subgraph, final String name) {
    Object _xblockexpression = null;
    {
      EList<Stmt> _stmts = subgraph.getStmts();
      for (final Stmt stmt : _stmts) {
        {
          ID _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (stmt instanceof Attribute) {
              _matched=true;
              _switchResult = DotAstHelper.getAttributeValue(((Attribute)stmt), name);
            }
          }
          ID value = _switchResult;
          boolean _tripleNotEquals = (value != null);
          if (_tripleNotEquals) {
            return value;
          }
        }
      }
      _xblockexpression = null;
    }
    return ((ID)_xblockexpression);
  }
  
  /**
   * Returns the value of the first attribute with the give name or
   * <code>null</code> if no attribute could be found.
   * 
   * @param attrLists
   *            The {@link AttrList}s to search.
   * @param name
   *            The name of the attribute whose value is to be retrieved.
   * @return The attribute value or <code>null</code> in case the attribute
   *         could not be found.
   */
  public static ID getAttributeValue(final List<AttrList> attrLists, final String name) {
    Object _xblockexpression = null;
    {
      for (final AttrList attrList : attrLists) {
        {
          final ID value = DotAstHelper.getAttributeValue(attrList, name);
          boolean _tripleNotEquals = (value != null);
          if (_tripleNotEquals) {
            return value;
          }
        }
      }
      _xblockexpression = null;
    }
    return ((ID)_xblockexpression);
  }
  
  private static ID getAttributeValue(final AttrList attrList, final String name) {
    EList<Attribute> _attributes = attrList.getAttributes();
    final Function1<Attribute, Boolean> _function = new Function1<Attribute, Boolean>() {
      public Boolean apply(final Attribute it) {
        ID _name = it.getName();
        String _value = _name.toValue();
        return Boolean.valueOf(Objects.equal(_value, name));
      }
    };
    Attribute _findFirst = IterableExtensions.<Attribute>findFirst(_attributes, _function);
    ID _value = null;
    if (_findFirst!=null) {
      _value=_findFirst.getValue();
    }
    return _value;
  }
  
  private static ID getAttributeValue(final Attribute attribute, final String name) {
    Object _xblockexpression = null;
    {
      ID _name = attribute.getName();
      String _value = _name.toValue();
      boolean _equals = _value.equals(name);
      if (_equals) {
        return attribute.getValue();
      }
      _xblockexpression = null;
    }
    return ((ID)_xblockexpression);
  }
}
