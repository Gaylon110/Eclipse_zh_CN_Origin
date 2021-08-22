/**
 * Copyright (c) 2016, 2017 itemis AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexander Nyßen (itemis AG) - initial API and implementation
 *     Tamas Miklossy  (itemis AG) - Add support for all dot attributes (bug #461506)
 */
package org.eclipse.gef.dot.internal;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import java.io.StringReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javafx.beans.property.ReadOnlyMapProperty;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.common.reflect.ReflectionUtils;
import org.eclipse.gef.dot.internal.language.DotArrowTypeStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotColorStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotEscStringStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotHtmlLabelStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotPointStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotRectStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotShapeStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotSplineTypeStandaloneSetup;
import org.eclipse.gef.dot.internal.language.DotStyleStandaloneSetup;
import org.eclipse.gef.dot.internal.language.arrowtype.ArrowType;
import org.eclipse.gef.dot.internal.language.clustermode.ClusterMode;
import org.eclipse.gef.dot.internal.language.color.Color;
import org.eclipse.gef.dot.internal.language.color.DotColors;
import org.eclipse.gef.dot.internal.language.dir.DirType;
import org.eclipse.gef.dot.internal.language.dot.AttrStmt;
import org.eclipse.gef.dot.internal.language.dot.AttributeType;
import org.eclipse.gef.dot.internal.language.dot.EdgeOp;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtNode;
import org.eclipse.gef.dot.internal.language.dot.EdgeStmtSubgraph;
import org.eclipse.gef.dot.internal.language.dot.GraphType;
import org.eclipse.gef.dot.internal.language.dot.NodeStmt;
import org.eclipse.gef.dot.internal.language.dot.Subgraph;
import org.eclipse.gef.dot.internal.language.escstring.EscString;
import org.eclipse.gef.dot.internal.language.htmllabel.HtmlLabel;
import org.eclipse.gef.dot.internal.language.layout.Layout;
import org.eclipse.gef.dot.internal.language.outputmode.OutputMode;
import org.eclipse.gef.dot.internal.language.pagedir.Pagedir;
import org.eclipse.gef.dot.internal.language.point.Point;
import org.eclipse.gef.dot.internal.language.rankdir.Rankdir;
import org.eclipse.gef.dot.internal.language.ranktype.RankType;
import org.eclipse.gef.dot.internal.language.rect.Rect;
import org.eclipse.gef.dot.internal.language.shape.Shape;
import org.eclipse.gef.dot.internal.language.splines.Splines;
import org.eclipse.gef.dot.internal.language.splinetype.SplineType;
import org.eclipse.gef.dot.internal.language.style.Style;
import org.eclipse.gef.dot.internal.language.terminals.ID;
import org.eclipse.gef.dot.internal.language.validation.DotArrowTypeJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotColorJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotEscStringJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotHtmlLabelJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotPointJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotRectJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotShapeJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotSplineTypeJavaValidator;
import org.eclipse.gef.dot.internal.language.validation.DotStyleJavaValidator;
import org.eclipse.gef.graph.Edge;
import org.eclipse.gef.graph.Graph;
import org.eclipse.gef.graph.Node;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.TypeRef;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.AbstractInjectableValidator;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.RangeBasedDiagnostic;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * The {@link DotAttributes} class contains all attributes which are supported
 * by {@link DotImport} and {@link DotExport}.
 * 
 * @author anyssen
 */
@SuppressWarnings("all")
public class DotAttributes {
  /**
   * Contexts by which attributes may be used.
   */
  public enum Context {
    GRAPH,
    
    EDGE,
    
    NODE,
    
    SUBGRAPH,
    
    CLUSTER;
  }
  
  private static class RangeBasedDiagnosticEx extends RangeBasedDiagnostic {
    public RangeBasedDiagnosticEx(final int severity, final String message, final EObject source, final int offset, final int length, final CheckType checkType, final String issueCode, final String[] issueData) {
      super(severity, message, source, offset, length, checkType, issueCode, issueData);
    }
  }
  
  /**
   * A validator for attribute values
   * 
   * @param <T>
   *            The type of the attribute.
   */
  private interface IAttributeValueValidator<T extends Object> {
    /**
     * Validates the given attribute value.
     * 
     * @param attributeContext
     *            The context of the attribute.
     * 
     * @param attributeValue
     *            The value to validate.
     * @return A list of {@link Diagnostic}s that represent the validation
     *         result.
     */
    public abstract List<Diagnostic> validate(final DotAttributes.Context attributeContext, final T attributeValue);
  }
  
  /**
   * A parser to parse a DOT primitive value type.
   * 
   * @param <T>
   *            The java equivalent of the parsed DOT value.
   */
  private interface IAttributeValueParser<T extends Object> {
    public static class ParseResult<T extends Object> {
      private T parsedValue;
      
      private List<Diagnostic> syntaxErrors;
      
      private ParseResult(final T parsedValue) {
        this(parsedValue, Collections.<Diagnostic>emptyList());
      }
      
      private ParseResult(final List<Diagnostic> syntaxErrors) {
        this(null, syntaxErrors);
      }
      
      private ParseResult(final T parsedValue, final List<Diagnostic> syntaxErrors) {
        this.parsedValue = parsedValue;
        this.syntaxErrors = syntaxErrors;
      }
      
      public T getParsedValue() {
        return this.parsedValue;
      }
      
      public List<Diagnostic> getSyntaxErrors() {
        return this.syntaxErrors;
      }
      
      public boolean hasSyntaxErrors() {
        boolean _isEmpty = this.syntaxErrors.isEmpty();
        return (!_isEmpty);
      }
    }
    
    /**
     * Parses the given raw value as a DOT primitive value.
     * 
     * @param attributeValue
     *            The raw value to parse.
     * @return A {@link ParseResult} indicating the parse result.
     */
    public abstract DotAttributes.IAttributeValueParser.ParseResult<T> parse(final String attributeValue);
    
    /**
     * Returns the type parsed by this parser.
     * @return The parsed type.
     */
    public abstract Class<T> getParsedType();
  }
  
  /**
   * A serializer to serialize a DOT primitive value type.
   * 
   * @param <T>
   *            The java equivalent type to serialize.
   */
  private interface IAttributeValueSerializer<T extends Object> {
    /**
     * Serializes the given value.
     * 
     * @param value
     *            The value to serialize.
     * @return The string representation to which the value was
     *         serialized.
     */
    public abstract String serialize(final T value);
  }
  
  /**
   * A generic {@link IAttributeValueParser} for enumeration values.
   * 
   * @param <E>
   *            The type of enumeration to parse.
   */
  private static class EnumParser<E extends Enum<E>> implements DotAttributes.IAttributeValueParser<E> {
    private Class<E> definition;
    
    /**
     * Creates a new parser for the given enumeration definition
     * 
     * @param attributeType
     *            The enumeration class.
     */
    public EnumParser(final Class<E> attributeType) {
      this.definition = attributeType;
    }
    
    public DotAttributes.IAttributeValueParser.ParseResult<E> parse(final String attributeValue) {
      boolean _tripleEquals = (attributeValue == null);
      if (_tripleEquals) {
        return null;
      }
      E[] _enumConstants = this.definition.getEnumConstants();
      for (final E value : _enumConstants) {
        String _string = value.toString();
        boolean _equals = _string.equals(attributeValue);
        if (_equals) {
          return new DotAttributes.IAttributeValueParser.ParseResult<E>(value);
        }
      }
      E[] _enumConstants_1 = this.definition.getEnumConstants();
      String _formattedValues = DotAttributes.EnumParser.getFormattedValues(_enumConstants_1);
      String _plus = ("Value has to be one of " + _formattedValues);
      BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, attributeValue, (-1), _plus, new Object[] {});
      List<Diagnostic> _singletonList = Collections.<Diagnostic>singletonList(_basicDiagnostic);
      return new DotAttributes.IAttributeValueParser.ParseResult<E>(_singletonList);
    }
    
    private static String getFormattedValues(final Object[] values) {
      final Function1<Object, String> _function = new Function1<Object, String>() {
        public String apply(final Object it) {
          return (("\'" + it) + "\'");
        }
      };
      List<String> _map = ListExtensions.<Object, String>map(((List<Object>)Conversions.doWrapArray(values)), _function);
      return IterableExtensions.join(_map, ", ");
    }
    
    public Class<E> getParsedType() {
      return this.definition;
    }
  }
  
  /**
   * A generic {@link IAttributeValueSerializer} for enumeration values.
   * 
   * @param <E>
   *            The type of enumeration to serialize.
   */
  private static class EnumSerializer<E extends Enum<E>> implements DotAttributes.IAttributeValueSerializer<E> {
    private Class<E> definition;
    
    /**
     * Creates a new serializer for the given enumeration definition
     * 
     * @param definition
     *            The enumeration class.
     */
    public EnumSerializer(final Class<E> definition) {
      this.definition = definition;
    }
    
    public String serialize(final E value) {
      String _xblockexpression = null;
      {
        Class<? extends Enum> _class = value.getClass();
        boolean _isAssignableFrom = this.definition.isAssignableFrom(_class);
        boolean _not = (!_isAssignableFrom);
        if (_not) {
          throw new IllegalArgumentException(("Value does not comply to definition " + this.definition));
        }
        _xblockexpression = value.toString();
      }
      return _xblockexpression;
    }
  }
  
  private static class EObjectParser<T extends EObject> implements DotAttributes.IAttributeValueParser<T> {
    private final Injector injector;
    
    private IParser xtextParser;
    
    private Class<T> parsedType;
    
    public EObjectParser(final Injector injector) {
      this.injector = injector;
    }
    
    @SuppressWarnings("unchecked")
    public DotAttributes.IAttributeValueParser.ParseResult<T> parse(final String attributeValue) {
      IParser _parser = this.getParser();
      StringReader _stringReader = new StringReader(attributeValue);
      final IParseResult xtextParseResult = _parser.parse(_stringReader);
      boolean _hasSyntaxErrors = xtextParseResult.hasSyntaxErrors();
      if (_hasSyntaxErrors) {
        final List<Diagnostic> syntaxProblems = CollectionLiterals.<Diagnostic>newArrayList();
        Iterable<INode> _syntaxErrors = xtextParseResult.getSyntaxErrors();
        for (final INode xtextSyntaxError : _syntaxErrors) {
          SyntaxErrorMessage _syntaxErrorMessage = xtextSyntaxError.getSyntaxErrorMessage();
          String _message = _syntaxErrorMessage.getMessage();
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, attributeValue, (-1), _message, new Object[] {});
          syntaxProblems.add(_basicDiagnostic);
        }
        return new DotAttributes.IAttributeValueParser.ParseResult<T>(syntaxProblems);
      }
      EObject _rootASTElement = xtextParseResult.getRootASTElement();
      return new DotAttributes.IAttributeValueParser.ParseResult<T>(((T) _rootASTElement));
    }
    
    protected IParser getParser() {
      boolean _tripleEquals = (this.xtextParser == null);
      if (_tripleEquals) {
        IParser _instance = this.injector.<IParser>getInstance(IParser.class);
        this.xtextParser = _instance;
      }
      return this.xtextParser;
    }
    
    public Class<T> getParsedType() {
      Class<T> _xblockexpression = null;
      {
        boolean _tripleEquals = (this.parsedType == null);
        if (_tripleEquals) {
          final IGrammarAccess grammarAccess = this.injector.<IGrammarAccess>getInstance(IGrammarAccess.class);
          Grammar _grammar = grammarAccess.getGrammar();
          EList<AbstractRule> _rules = _grammar.getRules();
          AbstractRule _head = IterableExtensions.<AbstractRule>head(_rules);
          TypeRef _type = _head.getType();
          EClassifier _classifier = _type.getClassifier();
          Class<?> _instanceClass = _classifier.getInstanceClass();
          this.parsedType = ((Class<T>) _instanceClass);
          boolean _tripleEquals_1 = (this.parsedType == null);
          if (_tripleEquals_1) {
            Grammar _grammar_1 = grammarAccess.getGrammar();
            String _name = _grammar_1.getName();
            String _plus = ("DotAttributes: parsedType cannot be determined for grammar: " + _name);
            System.err.println(_plus);
          }
        }
        _xblockexpression = this.parsedType;
      }
      return _xblockexpression;
    }
  }
  
  private static class EObjectSerializer<T extends EObject> implements DotAttributes.IAttributeValueSerializer<T> {
    private final Injector injector;
    
    private ISerializer serializer;
    
    public EObjectSerializer(final Injector injector) {
      this.injector = injector;
    }
    
    public String serialize(final T value) {
      String _xblockexpression = null;
      {
        final ISerializer serializer = this.getSerializer();
        _xblockexpression = serializer.serialize(value);
      }
      return _xblockexpression;
    }
    
    protected ISerializer getSerializer() {
      ISerializer _xblockexpression = null;
      {
        boolean _tripleEquals = (this.serializer == null);
        if (_tripleEquals) {
          ISerializer _instance = this.injector.<ISerializer>getInstance(ISerializer.class);
          this.serializer = _instance;
        }
        _xblockexpression = this.serializer;
      }
      return _xblockexpression;
    }
  }
  
  private static class DoubleValidator implements DotAttributes.IAttributeValueValidator<Double> {
    private double minValue;
    
    public DoubleValidator(final double minValue) {
      this.minValue = minValue;
    }
    
    public List<Diagnostic> validate(final DotAttributes.Context attributeContext, final Double attributeValue) {
      List<Diagnostic> _xblockexpression = null;
      {
        double _doubleValue = attributeValue.doubleValue();
        boolean _lessThan = (_doubleValue < this.minValue);
        if (_lessThan) {
          String _string = attributeValue.toString();
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, _string, (-1), 
            (("Value may not be smaller than " + Double.valueOf(this.minValue)) + "."), new Object[] {});
          return Collections.<Diagnostic>singletonList(_basicDiagnostic);
        }
        _xblockexpression = Collections.<Diagnostic>emptyList();
      }
      return _xblockexpression;
    }
  }
  
  private static class IntValidator implements DotAttributes.IAttributeValueValidator<Integer> {
    private int minValue;
    
    public IntValidator(final int minValue) {
      this.minValue = minValue;
    }
    
    public List<Diagnostic> validate(final DotAttributes.Context attributeContext, final Integer attributeValue) {
      List<Diagnostic> _xblockexpression = null;
      {
        double _doubleValue = attributeValue.doubleValue();
        boolean _lessThan = (_doubleValue < this.minValue);
        if (_lessThan) {
          String _string = attributeValue.toString();
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, _string, (-1), 
            (("Value may not be smaller than " + Integer.valueOf(this.minValue)) + "."), new Object[] {});
          return Collections.<Diagnostic>singletonList(_basicDiagnostic);
        }
        _xblockexpression = Collections.<Diagnostic>emptyList();
      }
      return _xblockexpression;
    }
  }
  
  private static class StringValidator implements DotAttributes.IAttributeValueValidator<String> {
    private Object[] validValues;
    
    public StringValidator(final Object[] validValues) {
      this.validValues = validValues;
    }
    
    public List<Diagnostic> validate(final DotAttributes.Context attributeContext, final String attributeValue) {
      for (final Object validValue : this.validValues) {
        String _string = validValue.toString();
        boolean _equals = _string.equals(attributeValue);
        if (_equals) {
          return Collections.<Diagnostic>emptyList();
        }
      }
      String _formattedValues = this.getFormattedValues(this.validValues);
      String _plus = ("Value should be one of " + _formattedValues);
      String _plus_1 = (_plus + ".");
      BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, attributeValue, (-1), _plus_1, new Object[] {});
      return Collections.<Diagnostic>singletonList(_basicDiagnostic);
    }
    
    private String getFormattedValues(final Object[] values) {
      final Function1<Object, String> _function = new Function1<Object, String>() {
        public String apply(final Object it) {
          return it.toString();
        }
      };
      List<Object> _sortBy = IterableExtensions.<Object, String>sortBy(((Iterable<Object>)Conversions.doWrapArray(values)), _function);
      final Function1<Object, String> _function_1 = new Function1<Object, String>() {
        public String apply(final Object it) {
          return (("\'" + it) + "\'");
        }
      };
      List<String> _map = ListExtensions.<Object, String>map(_sortBy, _function_1);
      return IterableExtensions.join(_map, ", ");
    }
  }
  
  private static class EObjectValidator<T extends EObject> implements DotAttributes.IAttributeValueValidator<T> {
    private final Injector injector;
    
    private Class<? extends AbstractDeclarativeValidator> validatorClass;
    
    private AbstractDeclarativeValidator validator;
    
    public EObjectValidator(final Injector injector, final Class<? extends AbstractDeclarativeValidator> validatorClass) {
      this.injector = injector;
      this.validatorClass = validatorClass;
    }
    
    protected AbstractDeclarativeValidator getValidator() {
      AbstractDeclarativeValidator _xblockexpression = null;
      {
        boolean _tripleEquals = (this.validator == null);
        if (_tripleEquals) {
          AbstractDeclarativeValidator _instance = this.injector.getInstance(this.validatorClass);
          this.validator = _instance;
        }
        _xblockexpression = this.validator;
      }
      return _xblockexpression;
    }
    
    public List<Diagnostic> validate(final DotAttributes.Context attributeContext, final T attributeValue) {
      List<Diagnostic> _xblockexpression = null;
      {
        final AbstractDeclarativeValidator validator = this.getValidator();
        final List<Diagnostic> diagnostics = CollectionLiterals.<Diagnostic>newArrayList();
        boolean _tripleNotEquals = (validator != null);
        if (_tripleNotEquals) {
          validator.setMessageAcceptor(
            new ValidationMessageAcceptor() {
              public void acceptError(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
                BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, null, (-1), message, new Object[] {});
                diagnostics.add(_basicDiagnostic);
              }
              
              public void acceptError(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
                DotAttributes.RangeBasedDiagnosticEx _rangeBasedDiagnosticEx = new DotAttributes.RangeBasedDiagnosticEx(Diagnostic.ERROR, message, object, offset, length, CheckType.FAST, code, issueData);
                diagnostics.add(_rangeBasedDiagnosticEx);
              }
              
              public void acceptInfo(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
                BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.INFO, null, (-1), message, new Object[] {});
                diagnostics.add(_basicDiagnostic);
              }
              
              public void acceptInfo(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
                DotAttributes.RangeBasedDiagnosticEx _rangeBasedDiagnosticEx = new DotAttributes.RangeBasedDiagnosticEx(Diagnostic.INFO, message, object, offset, length, CheckType.FAST, code, issueData);
                diagnostics.add(_rangeBasedDiagnosticEx);
              }
              
              public void acceptWarning(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code, final String... issueData) {
                BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.WARNING, null, (-1), message, new Object[] {});
                diagnostics.add(_basicDiagnostic);
              }
              
              public void acceptWarning(final String message, final EObject object, final int offset, final int length, final String code, final String... issueData) {
                DotAttributes.RangeBasedDiagnosticEx _rangeBasedDiagnosticEx = new DotAttributes.RangeBasedDiagnosticEx(Diagnostic.WARNING, message, object, offset, length, CheckType.FAST, code, issueData);
                diagnostics.add(_rangeBasedDiagnosticEx);
              }
            });
          final Map<Object, Object> validationContext = CollectionLiterals.<Object, Object>newHashMap();
          Object _privateFieldValue = ReflectionUtils.<Object>getPrivateFieldValue(validator, "languageName");
          validationContext.put(AbstractInjectableValidator.CURRENT_LANGUAGE_NAME, _privateFieldValue);
          String _name = DotAttributes.Context.class.getName();
          validationContext.put(_name, attributeContext);
          validator.validate(attributeValue, null, validationContext);
          final Iterator<EObject> iterator = EcoreUtil.<EObject>getAllProperContents(attributeValue, true);
          while (iterator.hasNext()) {
            EObject _next = iterator.next();
            validator.validate(_next, null, validationContext);
          }
        }
        _xblockexpression = diagnostics;
      }
      return _xblockexpression;
    }
  }
  
  public static boolean isCluster(final Node node) {
    Graph _nestedGraph = node.getNestedGraph();
    boolean _tripleEquals = (_nestedGraph == null);
    if (_tripleEquals) {
      return false;
    }
    Graph _nestedGraph_1 = node.getNestedGraph();
    final String name = DotAttributes._getName(_nestedGraph_1);
    boolean _and = false;
    boolean _tripleNotEquals = (name != null);
    if (!_tripleNotEquals) {
      _and = false;
    } else {
      boolean _startsWith = name.startsWith("cluster");
      _and = _startsWith;
    }
    return _and;
  }
  
  /**
   * Determine the context in which the given {@link EObject} is used.
   * 
   * @param eObject
   *            The {@link EObject} for which the context is to be determined.
   * @return the context in which the given {@link EObject} is used.
   */
  public static DotAttributes.Context getContext(final EObject eObject) {
    DotAttributes.Context _xblockexpression = null;
    {
      boolean _or = false;
      EdgeStmtNode _containerOfType = EcoreUtil2.<EdgeStmtNode>getContainerOfType(eObject, EdgeStmtNode.class);
      boolean _tripleNotEquals = (_containerOfType != null);
      if (_tripleNotEquals) {
        _or = true;
      } else {
        EdgeStmtSubgraph _containerOfType_1 = EcoreUtil2.<EdgeStmtSubgraph>getContainerOfType(eObject, EdgeStmtSubgraph.class);
        boolean _tripleNotEquals_1 = (_containerOfType_1 != null);
        _or = _tripleNotEquals_1;
      }
      if (_or) {
        return DotAttributes.Context.EDGE;
      }
      final AttrStmt attrStmt = EcoreUtil2.<AttrStmt>getContainerOfType(eObject, AttrStmt.class);
      boolean _and = false;
      boolean _tripleNotEquals_2 = (attrStmt != null);
      if (!_tripleNotEquals_2) {
        _and = false;
      } else {
        AttributeType _type = attrStmt.getType();
        boolean _equals = AttributeType.EDGE.equals(_type);
        _and = _equals;
      }
      if (_and) {
        return DotAttributes.Context.EDGE;
      }
      NodeStmt _containerOfType_2 = EcoreUtil2.<NodeStmt>getContainerOfType(eObject, NodeStmt.class);
      boolean _tripleNotEquals_3 = (_containerOfType_2 != null);
      if (_tripleNotEquals_3) {
        return DotAttributes.Context.NODE;
      }
      boolean _and_1 = false;
      boolean _tripleNotEquals_4 = (attrStmt != null);
      if (!_tripleNotEquals_4) {
        _and_1 = false;
      } else {
        AttributeType _type_1 = attrStmt.getType();
        boolean _equals_1 = AttributeType.NODE.equals(_type_1);
        _and_1 = _equals_1;
      }
      if (_and_1) {
        return DotAttributes.Context.NODE;
      }
      final Subgraph subgraph = EcoreUtil2.<Subgraph>getContainerOfType(eObject, Subgraph.class);
      boolean _tripleNotEquals_5 = (subgraph != null);
      if (_tripleNotEquals_5) {
        boolean _and_2 = false;
        ID _name = subgraph.getName();
        boolean _tripleNotEquals_6 = (_name != null);
        if (!_tripleNotEquals_6) {
          _and_2 = false;
        } else {
          ID _name_1 = subgraph.getName();
          String _value = _name_1.toValue();
          boolean _startsWith = _value.startsWith("cluster");
          _and_2 = _startsWith;
        }
        if (_and_2) {
          return DotAttributes.Context.CLUSTER;
        }
        return DotAttributes.Context.SUBGRAPH;
      }
      _xblockexpression = DotAttributes.Context.GRAPH;
    }
    return _xblockexpression;
  }
  
  /**
   * Serialize the given attribute value using the given serializer.
   * 
   * @param <T>
   *            The (primitive) object type of the to be serialized value.
   * @param serializer
   *            The {@link IAttributeValueSerializer} to use for serializing.
   * @param attributeValue
   *            The value to serialize.
   * @return The serialized value, or <code>null</code> if the value could not be serialized.
   */
  private static <T extends Object> String serializeAttributeValue(final DotAttributes.IAttributeValueSerializer<T> serializer, final T attributeValue) {
    String _xifexpression = null;
    boolean _tripleEquals = (attributeValue == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      _xifexpression = serializer.serialize(attributeValue);
    }
    return _xifexpression;
  }
  
  /**
   * Parses the given (unquoted) attribute, using the given
   * {@link IAttributeValueParser}.
   * 
   * @param <T>
   *            The (primitive) object type of the parsed value.
   * @param parser
   *            The parser to be used for parsing.
   * @param attributeValue
   *            The attribute value that is to be parsed.
   * @return The parsed value, or <code>null</code> if the value could not be
   *         parsed.
   */
  private static <T extends Object> T parseAttributeValue(final DotAttributes.IAttributeValueParser<T> parser, final String attributeValue) {
    T _xifexpression = null;
    boolean _tripleEquals = (attributeValue == null);
    if (_tripleEquals) {
      _xifexpression = null;
    } else {
      DotAttributes.IAttributeValueParser.ParseResult<T> _parse = parser.parse(attributeValue);
      _xifexpression = _parse.parsedValue;
    }
    return _xifexpression;
  }
  
  private static <T extends Object> List<Diagnostic> validateAttributeRawValue(final DotAttributes.IAttributeValueParser<T> parser, final DotAttributes.IAttributeValueValidator<T> validator, final DotAttributes.Context attributeContext, final String attributeName, final ID attributeValue) {
    List<Diagnostic> _xblockexpression = null;
    {
      Class<?> _xifexpression = null;
      boolean _tripleEquals = (parser == null);
      if (_tripleEquals) {
        _xifexpression = String.class;
      } else {
        _xifexpression = parser.getParsedType();
      }
      final Class<?> attributeType = _xifexpression;
      String _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(attributeType, Integer.class)) {
          _matched=true;
          _switchResult = "int";
        }
      }
      if (!_matched) {
        if (Objects.equal(attributeType, Boolean.class)) {
          _matched=true;
          _switchResult = "bool";
        }
      }
      if (!_matched) {
        String _simpleName = attributeType.getSimpleName();
        _switchResult = StringExtensions.toFirstLower(_simpleName);
      }
      String attributeTypeName = _switchResult;
      T _xifexpression_1 = null;
      boolean _tripleNotEquals = (parser != null);
      if (_tripleNotEquals) {
        T _xblockexpression_1 = null;
        {
          String _value = attributeValue.toValue();
          final DotAttributes.IAttributeValueParser.ParseResult<T> parseResult = parser.parse(_value);
          boolean _hasSyntaxErrors = parseResult.hasSyntaxErrors();
          if (_hasSyntaxErrors) {
            String _value_1 = attributeValue.toValue();
            String _plus = ("The value \'" + _value_1);
            String _plus_1 = (_plus + "\' is not a syntactically correct ");
            String _plus_2 = (_plus_1 + attributeTypeName);
            String _plus_3 = (_plus_2 + 
              ": ");
            final Function1<Diagnostic, String> _function = new Function1<Diagnostic, String>() {
              public String apply(final Diagnostic it) {
                String _message = it.getMessage();
                String _firstUpper = StringExtensions.toFirstUpper(_message);
                return _firstUpper.replaceAll("\\.$", "");
              }
            };
            List<String> _map = ListExtensions.<Diagnostic, String>map(parseResult.syntaxErrors, _function);
            String _join = IterableExtensions.join(_map, ". ");
            String _plus_4 = (_plus_3 + _join);
            String _plus_5 = (_plus_4 + ".");
            BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, null, (-1), _plus_5, new Object[] {});
            return Collections.<Diagnostic>singletonList(_basicDiagnostic);
          }
          _xblockexpression_1 = parseResult.getParsedValue();
        }
        _xifexpression_1 = _xblockexpression_1;
      } else {
        String _value = attributeValue.toValue();
        _xifexpression_1 = ((T) ((Object) _value));
      }
      final T parsedValue = _xifexpression_1;
      final List<Diagnostic> diagnostics = CollectionLiterals.<Diagnostic>newArrayList();
      boolean _tripleNotEquals_1 = (validator != null);
      if (_tripleNotEquals_1) {
        final List<Diagnostic> validationResults = validator.validate(attributeContext, parsedValue);
        String _value_1 = attributeValue.toValue();
        String _plus = ((("The " + attributeTypeName) + " value \'") + _value_1);
        final String newMessagePrefix = (_plus + "\' is not semantically correct: ");
        for (final Diagnostic r : validationResults) {
          {
            String _message = r.getMessage();
            final String newMessage = (newMessagePrefix + _message);
            Diagnostic _xifexpression_2 = null;
            if ((r instanceof RangeBasedDiagnostic)) {
              DotAttributes.RangeBasedDiagnosticEx _xblockexpression_2 = null;
              {
                final RangeBasedDiagnostic result = ((RangeBasedDiagnostic) r);
                int _severity = result.getSeverity();
                int _offset = result.getOffset();
                int _length = result.getLength();
                CheckType _checkType = result.getCheckType();
                String[] _issueData = result.getIssueData();
                _xblockexpression_2 = new DotAttributes.RangeBasedDiagnosticEx(_severity, newMessage, null, _offset, _length, _checkType, attributeName, _issueData);
              }
              _xifexpression_2 = _xblockexpression_2;
            } else {
              int _severity = r.getSeverity();
              _xifexpression_2 = new BasicDiagnostic(_severity, null, (-1), newMessage, new Object[] {});
            }
            diagnostics.add(_xifexpression_2);
          }
        }
      }
      _xblockexpression = diagnostics;
    }
    return _xblockexpression;
  }
  
  private static void checkAttributeRawValue(final DotAttributes.Context context, final String attributeName, final ID attributeValue) {
    List<Diagnostic> _validateAttributeRawValue = DotAttributes.validateAttributeRawValue(context, attributeName, attributeValue);
    final Function1<Diagnostic, Boolean> _function = new Function1<Diagnostic, Boolean>() {
      public Boolean apply(final Diagnostic it) {
        int _severity = it.getSeverity();
        return Boolean.valueOf((_severity >= Diagnostic.ERROR));
      }
    };
    final Iterable<Diagnostic> diagnostics = IterableExtensions.<Diagnostic>filter(_validateAttributeRawValue, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(diagnostics);
    boolean _not = (!_isEmpty);
    if (_not) {
      String _name = context.name();
      String _lowerCase = _name.toLowerCase();
      String _plus = ("Cannot set " + _lowerCase);
      String _plus_1 = (_plus + " attribute \'");
      String _plus_2 = (_plus_1 + attributeName);
      String _plus_3 = (_plus_2 + "\' to \'");
      String _value = attributeValue.toValue();
      String _plus_4 = (_plus_3 + _value);
      String _plus_5 = (_plus_4 + "\'. ");
      final Function1<Diagnostic, Boolean> _function_1 = new Function1<Diagnostic, Boolean>() {
        public Boolean apply(final Diagnostic it) {
          String _message = it.getMessage();
          boolean _isEmpty = _message.isEmpty();
          return Boolean.valueOf((!_isEmpty));
        }
      };
      Iterable<Diagnostic> _filter = IterableExtensions.<Diagnostic>filter(diagnostics, _function_1);
      final Function1<Diagnostic, String> _function_2 = new Function1<Diagnostic, String>() {
        public String apply(final Diagnostic it) {
          return it.getMessage();
        }
      };
      Iterable<String> _map = IterableExtensions.<Diagnostic, String>map(_filter, _function_2);
      String _join = IterableExtensions.join(_map, " ");
      String _plus_6 = (_plus_5 + _join);
      throw new IllegalArgumentException(_plus_6);
    }
  }
  
  /**
   * Validate the attribute determined via name and value syntactically and
   * semantically.
   * 
   * @param attributeContext
   *            The context element the attribute is related to.
   * @param attributeName
   *            The name of the attribute.
   * @param attributeValue
   *            The value of the attribute.
   * @return A list of {@link Diagnostic} objects representing the identified
   *         issues, or an empty list if no issues were found.
   */
  public static List<Diagnostic> validateAttributeRawValue(final DotAttributes.Context attributeContext, final String attributeName, final ID attributeValue) {
    List<Diagnostic> _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.ARROWHEAD__E)) {
        _matched=true;
        _switchResult = DotAttributes.<ArrowType>validateAttributeRawValue(DotAttributes.ARROWTYPE_PARSER, DotAttributes.ARROWTYPE_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.ARROWSIZE__E)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.ARROWSIZE_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.ARROWTAIL__E)) {
        _matched=true;
        _switchResult = DotAttributes.<ArrowType>validateAttributeRawValue(DotAttributes.ARROWTYPE_PARSER, DotAttributes.ARROWTYPE_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.BB__GC)) {
        _matched=true;
        _switchResult = DotAttributes.<Rect>validateAttributeRawValue(DotAttributes.RECT_PARSER, DotAttributes.RECT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.BGCOLOR__GC)) {
        _matched=true;
        _switchResult = DotAttributes.<Color>validateAttributeRawValue(DotAttributes.COLOR_PARSER, DotAttributes.COLOR_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.CLUSTERRANK__G)) {
        _matched=true;
        _switchResult = DotAttributes.<ClusterMode>validateAttributeRawValue(DotAttributes.CLUSTERMODE_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.COLORSCHEME__GCNE)) {
        _matched=true;
        _switchResult = DotAttributes.<String>validateAttributeRawValue(null, DotAttributes.COLORSCHEME_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.COLOR__CNE)) {
        _matched=true;
        _switchResult = DotAttributes.<Color>validateAttributeRawValue(DotAttributes.COLOR_PARSER, DotAttributes.COLOR_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.DIR__E)) {
        _matched=true;
        _switchResult = DotAttributes.<DirType>validateAttributeRawValue(DotAttributes.DIRTYPE_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.DISTORTION__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.DISTORTION_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.FILLCOLOR__CNE)) {
        _matched=true;
        _switchResult = DotAttributes.<Color>validateAttributeRawValue(DotAttributes.COLOR_PARSER, DotAttributes.COLOR_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.FIXEDSIZE__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Boolean>validateAttributeRawValue(DotAttributes.BOOL_PARSER, null, attributeContext, DotAttributes.FIXEDSIZE__N, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.FONTCOLOR__GCNE)) {
        _matched=true;
        _switchResult = DotAttributes.<Color>validateAttributeRawValue(DotAttributes.COLOR_PARSER, DotAttributes.COLOR_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.FORCELABELS__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Boolean>validateAttributeRawValue(DotAttributes.BOOL_PARSER, null, attributeContext, DotAttributes.FORCELABELS__G, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.HEAD_LP__E)) {
        _matched=true;
        _switchResult = DotAttributes.<Point>validateAttributeRawValue(DotAttributes.POINT_PARSER, DotAttributes.POINT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.HEIGHT__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.HEIGHT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.LABEL__GCNE)) {
        _matched=true;
        List<Diagnostic> _xifexpression = null;
        ID.Type _type = attributeValue.getType();
        boolean _equals = Objects.equal(_type, ID.Type.HTML_STRING);
        if (_equals) {
          _xifexpression = DotAttributes.<HtmlLabel>validateAttributeRawValue(DotAttributes.HTML_LABEL_PARSER, DotAttributes.HTML_LABEL_VALIDATOR, attributeContext, attributeName, attributeValue);
        } else {
          List<Diagnostic> _xifexpression_1 = null;
          ID.Type _type_1 = attributeValue.getType();
          boolean _equals_1 = Objects.equal(_type_1, ID.Type.QUOTED_STRING);
          if (_equals_1) {
            _xifexpression_1 = DotAttributes.<EscString>validateAttributeRawValue(DotAttributes.ESC_STRING_PARSER, DotAttributes.ESC_STRING_VALIDATOR, attributeContext, attributeName, attributeValue);
          } else {
            _xifexpression_1 = Collections.<Diagnostic>emptyList();
          }
          _xifexpression = _xifexpression_1;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.LABELFONTCOLOR__E)) {
        _matched=true;
        _switchResult = DotAttributes.<Color>validateAttributeRawValue(DotAttributes.COLOR_PARSER, DotAttributes.COLOR_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.LAYOUT__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Layout>validateAttributeRawValue(DotAttributes.LAYOUT_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.LP__GCE)) {
        _matched=true;
        _switchResult = DotAttributes.<Point>validateAttributeRawValue(DotAttributes.POINT_PARSER, DotAttributes.POINT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.NODESEP__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.NODESEP_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.OUTPUTORDER__G)) {
        _matched=true;
        _switchResult = DotAttributes.<OutputMode>validateAttributeRawValue(DotAttributes.OUTPUTMODE_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.PAGEDIR__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Pagedir>validateAttributeRawValue(DotAttributes.PAGEDIR_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.POS__NE)) {
        _matched=true;
        List<Diagnostic> _xifexpression_2 = null;
        boolean _equals_2 = Objects.equal(attributeContext, DotAttributes.Context.NODE);
        if (_equals_2) {
          _xifexpression_2 = DotAttributes.<Point>validateAttributeRawValue(DotAttributes.POINT_PARSER, DotAttributes.POINT_VALIDATOR, attributeContext, attributeName, attributeValue);
        } else {
          List<Diagnostic> _xifexpression_3 = null;
          boolean _equals_3 = Objects.equal(attributeContext, DotAttributes.Context.EDGE);
          if (_equals_3) {
            _xifexpression_3 = DotAttributes.<SplineType>validateAttributeRawValue(DotAttributes.SPLINETYPE_PARSER, DotAttributes.SPLINETYPE_VALIDATOR, attributeContext, attributeName, attributeValue);
          } else {
            _xifexpression_3 = Collections.<Diagnostic>emptyList();
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _switchResult = _xifexpression_2;
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.RANKDIR__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Rankdir>validateAttributeRawValue(DotAttributes.RANKDIR_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.RANK__S)) {
        _matched=true;
        _switchResult = DotAttributes.<RankType>validateAttributeRawValue(DotAttributes.RANKTYPE_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.SHAPE__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Shape>validateAttributeRawValue(DotAttributes.SHAPE_PARSER, DotAttributes.SHAPE_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.SIDES__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Integer>validateAttributeRawValue(DotAttributes.INT_PARSER, DotAttributes.SIDES_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.SKEW__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.SKEW_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.SPLINES__G)) {
        _matched=true;
        _switchResult = DotAttributes.<Splines>validateAttributeRawValue(DotAttributes.SPLINES_PARSER, null, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.STYLE__GCNE)) {
        _matched=true;
        _switchResult = DotAttributes.<Style>validateAttributeRawValue(DotAttributes.STYLE_PARSER, DotAttributes.STYLE_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.TAIL_LP__E)) {
        _matched=true;
        _switchResult = DotAttributes.<Point>validateAttributeRawValue(DotAttributes.POINT_PARSER, DotAttributes.POINT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.WIDTH__N)) {
        _matched=true;
        _switchResult = DotAttributes.<Double>validateAttributeRawValue(DotAttributes.DOUBLE_PARSER, DotAttributes.WIDTH_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      if (Objects.equal(attributeName, DotAttributes.XLP__NE)) {
        _matched=true;
        _switchResult = DotAttributes.<Point>validateAttributeRawValue(DotAttributes.POINT_PARSER, DotAttributes.POINT_VALIDATOR, attributeContext, attributeName, attributeValue);
      }
    }
    if (!_matched) {
      _switchResult = Collections.<Diagnostic>emptyList();
    }
    return _switchResult;
  }
  
  /**
   * Parses the given value as a DOT dirType.
   */
  private final static DotAttributes.EnumParser<DirType> DIRTYPE_PARSER = new DotAttributes.EnumParser<DirType>(DirType.class);
  
  /**
   * A serializer for {@link DirType} values.
   */
  private final static DotAttributes.EnumSerializer<DirType> DIRTYPE_SERIALIZER = new DotAttributes.EnumSerializer<DirType>(DirType.class);
  
  /**
   * Parses the given value as a DOT dirType.
   */
  private final static DotAttributes.EnumParser<Layout> LAYOUT_PARSER = new DotAttributes.EnumParser<Layout>(Layout.class);
  
  /**
   * A serializer for {@link DirType} values.
   */
  private final static DotAttributes.EnumSerializer<Layout> LAYOUT_SERIALIZER = new DotAttributes.EnumSerializer<Layout>(Layout.class);
  
  /**
   * Parses the given value as a {@link ClusterMode}.
   */
  private final static DotAttributes.EnumParser<ClusterMode> CLUSTERMODE_PARSER = new DotAttributes.EnumParser<ClusterMode>(ClusterMode.class);
  
  /**
   * Serializes the given {@link ClusterMode} value.
   */
  private final static DotAttributes.EnumSerializer<ClusterMode> CLUSTERMODE_SERIALIZER = new DotAttributes.EnumSerializer<ClusterMode>(ClusterMode.class);
  
  /**
   * Parses the given value as a DOT outputMode.
   */
  private final static DotAttributes.EnumParser<OutputMode> OUTPUTMODE_PARSER = new DotAttributes.EnumParser<OutputMode>(OutputMode.class);
  
  /**
   * Serializes the given {@link OutputMode} value.
   */
  private final static DotAttributes.EnumSerializer<OutputMode> OUTPUTMODE_SERIALIZER = new DotAttributes.EnumSerializer<OutputMode>(OutputMode.class);
  
  /**
   * Parses the given value as a DOT pagedir.
   */
  private final static DotAttributes.EnumParser<Pagedir> PAGEDIR_PARSER = new DotAttributes.EnumParser<Pagedir>(Pagedir.class);
  
  /**
   * Serializes the given {@link Pagedir} value.
   */
  private final static DotAttributes.EnumSerializer<Pagedir> PAGEDIR_SERIALIZER = new DotAttributes.EnumSerializer<Pagedir>(Pagedir.class);
  
  /**
   * A parser used to parse DOT rankdir values.
   */
  private final static DotAttributes.EnumParser<Rankdir> RANKDIR_PARSER = new DotAttributes.EnumParser<Rankdir>(Rankdir.class);
  
  /**
   * Serializes the given {@link Rankdir} value.
   */
  private final static DotAttributes.EnumSerializer<Rankdir> RANKDIR_SERIALIZER = new DotAttributes.EnumSerializer<Rankdir>(Rankdir.class);
  
  /**
   * Parses the given value as a DOT rankType.
   */
  private final static DotAttributes.EnumParser<RankType> RANKTYPE_PARSER = new DotAttributes.EnumParser<RankType>(RankType.class);
  
  /**
   * A serializer for {@link RankType} values.
   */
  private final static DotAttributes.EnumSerializer<RankType> RANKTYPE_SERIALIZER = new DotAttributes.EnumSerializer<RankType>(RankType.class);
  
  /**
   * A parser used to parse DOT {@link Splines} values.
   */
  private final static DotAttributes.IAttributeValueParser<Splines> SPLINES_PARSER = new Function0<DotAttributes.IAttributeValueParser<Splines>>() {
    public DotAttributes.IAttributeValueParser<Splines> apply() {
      abstract class __DotAttributes_1 implements DotAttributes.IAttributeValueParser<Splines> {
        DotAttributes.EnumParser<Splines> enumParser;
      }
      
      __DotAttributes_1 ___DotAttributes_1 = new __DotAttributes_1() {
        {
          enumParser = new DotAttributes.EnumParser<Splines>(Splines.class);
        }
        public DotAttributes.IAttributeValueParser.ParseResult<Splines> parse(final String attributeValue) {
          final DotAttributes.IAttributeValueParser.ParseResult<Boolean> boolResult = DotAttributes.BOOL_PARSER.parse(attributeValue);
          boolean _hasSyntaxErrors = boolResult.hasSyntaxErrors();
          boolean _not = (!_hasSyntaxErrors);
          if (_not) {
            Splines _xifexpression = null;
            Boolean _parsedValue = boolResult.getParsedValue();
            if ((_parsedValue).booleanValue()) {
              _xifexpression = Splines.TRUE;
            } else {
              _xifexpression = Splines.FALSE;
            }
            return new DotAttributes.IAttributeValueParser.ParseResult<Splines>(_xifexpression);
          }
          final DotAttributes.IAttributeValueParser.ParseResult<Splines> enumResult = this.enumParser.parse(attributeValue);
          boolean _hasSyntaxErrors_1 = enumResult.hasSyntaxErrors();
          boolean _not_1 = (!_hasSyntaxErrors_1);
          if (_not_1) {
            Splines _parsedValue_1 = enumResult.getParsedValue();
            return new DotAttributes.IAttributeValueParser.ParseResult<Splines>(_parsedValue_1);
          }
          final List<Diagnostic> combinedFindings = CollectionLiterals.<Diagnostic>newArrayList();
          combinedFindings.addAll(boolResult.syntaxErrors);
          combinedFindings.addAll(enumResult.syntaxErrors);
          return new DotAttributes.IAttributeValueParser.ParseResult<Splines>(combinedFindings);
        }
        
        public Class<Splines> getParsedType() {
          return Splines.class;
        }
      };
      return ___DotAttributes_1;
    }
  }.apply();
  
  /**
   * Serializes the given {@link Splines} value.
   */
  private final static DotAttributes.EnumSerializer<Splines> SPLINES_SERIALIZER = new DotAttributes.EnumSerializer<Splines>(Splines.class);
  
  /**
   * A parser for bool values.
   */
  private final static DotAttributes.IAttributeValueParser<Boolean> BOOL_PARSER = new DotAttributes.IAttributeValueParser<Boolean>() {
    public DotAttributes.IAttributeValueParser.ParseResult<Boolean> parse(final String rawValue) {
      boolean _tripleEquals = (rawValue == null);
      if (_tripleEquals) {
        return null;
      }
      boolean _or = false;
      String _string = Boolean.TRUE.toString();
      boolean _equalsIgnoreCase = _string.equalsIgnoreCase(rawValue);
      if (_equalsIgnoreCase) {
        _or = true;
      } else {
        boolean _equalsIgnoreCase_1 = "yes".equalsIgnoreCase(rawValue);
        _or = _equalsIgnoreCase_1;
      }
      if (_or) {
        return new DotAttributes.IAttributeValueParser.ParseResult<Boolean>(Boolean.TRUE);
      }
      boolean _or_1 = false;
      String _string_1 = Boolean.FALSE.toString();
      boolean _equalsIgnoreCase_2 = _string_1.equalsIgnoreCase(rawValue);
      if (_equalsIgnoreCase_2) {
        _or_1 = true;
      } else {
        boolean _equalsIgnoreCase_3 = "no".equalsIgnoreCase(rawValue);
        _or_1 = _equalsIgnoreCase_3;
      }
      if (_or_1) {
        return new DotAttributes.IAttributeValueParser.ParseResult<Boolean>(Boolean.FALSE);
      }
      try {
        final int parsedValue = Integer.parseInt(rawValue);
        Boolean _xifexpression = null;
        if ((parsedValue > 0)) {
          _xifexpression = Boolean.TRUE;
        } else {
          _xifexpression = Boolean.FALSE;
        }
        return new DotAttributes.IAttributeValueParser.ParseResult<Boolean>(_xifexpression);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, rawValue, (-1), 
            (("The given value \'" + rawValue) + 
              "\' does not (case-insensitively) equal \'true\', \'yes\', \'false\', or \'no\' and is also not parsable as an integer value"), 
            new Object[] {});
          List<Diagnostic> _singletonList = Collections.<Diagnostic>singletonList(_basicDiagnostic);
          return new DotAttributes.IAttributeValueParser.ParseResult<Boolean>(_singletonList);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    
    public Class<Boolean> getParsedType() {
      return Boolean.class;
    }
  };
  
  /**
   * A serializer for bool values.
   */
  private final static DotAttributes.IAttributeValueSerializer<Boolean> BOOL_SERIALIZER = new DotAttributes.IAttributeValueSerializer<Boolean>() {
    public String serialize(final Boolean value) {
      return Boolean.toString((value).booleanValue());
    }
  };
  
  /**
   * A parser for double values.
   */
  private final static DotAttributes.IAttributeValueParser<Double> DOUBLE_PARSER = new DotAttributes.IAttributeValueParser<Double>() {
    public DotAttributes.IAttributeValueParser.ParseResult<Double> parse(final String rawValue) {
      boolean _tripleEquals = (rawValue == null);
      if (_tripleEquals) {
        return null;
      }
      try {
        final double parsedValue = Double.parseDouble(rawValue);
        Double _double = new Double(parsedValue);
        return new DotAttributes.IAttributeValueParser.ParseResult<Double>(_double);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException exception = (NumberFormatException)_t;
          String _message = exception.getMessage();
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, rawValue, (-1), _message, new Object[] {});
          List<Diagnostic> _singletonList = Collections.<Diagnostic>singletonList(_basicDiagnostic);
          return new DotAttributes.IAttributeValueParser.ParseResult<Double>(_singletonList);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    
    public Class<Double> getParsedType() {
      return Double.class;
    }
  };
  
  /**
   * A serializer for double values.
   */
  private final static DotAttributes.IAttributeValueSerializer<Double> DOUBLE_SERIALIZER = new DotAttributes.IAttributeValueSerializer<Double>() {
    public String serialize(final Double value) {
      return Double.toString((value).doubleValue());
    }
  };
  
  /**
   * A parser used to parse DOT int values.
   */
  private final static DotAttributes.IAttributeValueParser<Integer> INT_PARSER = new DotAttributes.IAttributeValueParser<Integer>() {
    public DotAttributes.IAttributeValueParser.ParseResult<Integer> parse(final String rawValue) {
      boolean _tripleEquals = (rawValue == null);
      if (_tripleEquals) {
        return null;
      }
      try {
        final int parsedValue = Integer.parseInt(rawValue);
        Integer _integer = new Integer(parsedValue);
        return new DotAttributes.IAttributeValueParser.ParseResult<Integer>(_integer);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException exception = (NumberFormatException)_t;
          String _message = exception.getMessage();
          BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, rawValue, (-1), _message, new Object[] {});
          List<Diagnostic> _singletonList = Collections.<Diagnostic>singletonList(_basicDiagnostic);
          return new DotAttributes.IAttributeValueParser.ParseResult<Integer>(_singletonList);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    
    public Class<Integer> getParsedType() {
      return Integer.class;
    }
  };
  
  /**
   * A serializer for int values.
   */
  private final static DotAttributes.IAttributeValueSerializer<Integer> INT_SERIALIZER = new DotAttributes.IAttributeValueSerializer<Integer>() {
    public String serialize(final Integer value) {
      return Integer.toString((value).intValue());
    }
  };
  
  /**
   * A validator for colorscheme {@link String} attribute values.
   */
  private final static DotAttributes.StringValidator COLORSCHEME_VALIDATOR = new DotAttributes.StringValidator(DotColors.getColorSchemes().toArray());
  
  /**
   * A validator for sides {@link Integer} attribute values.
   */
  private final static DotAttributes.IntValidator SIDES_VALIDATOR = new DotAttributes.IntValidator(0);
  
  /**
   * A validator for arrowsize {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator ARROWSIZE_VALIDATOR = new DotAttributes.DoubleValidator(0.0);
  
  /**
   * A validator for skew {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator SKEW_VALIDATOR = new DotAttributes.DoubleValidator((-100.0));
  
  /**
   * A validator for distortion {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator DISTORTION_VALIDATOR = new DotAttributes.DoubleValidator((-100.0));
  
  /**
   * A validator for width {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator WIDTH_VALIDATOR = new DotAttributes.DoubleValidator(0.01);
  
  /**
   * A validator for height {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator HEIGHT_VALIDATOR = new DotAttributes.DoubleValidator(0.02);
  
  /**
   * A validator for nodesep {@link Double} attribute values.
   */
  private final static DotAttributes.DoubleValidator NODESEP_VALIDATOR = new DotAttributes.DoubleValidator(0.02);
  
  private final static Injector arrowTypeInjector = new DotArrowTypeStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The validator for arrowtype attribute values.
   */
  private final static DotAttributes.EObjectValidator<ArrowType> ARROWTYPE_VALIDATOR = new DotAttributes.EObjectValidator<ArrowType>(DotAttributes.arrowTypeInjector, 
    DotArrowTypeJavaValidator.class);
  
  /**
   * The parser for arrowtype attribute values.
   */
  private final static DotAttributes.EObjectParser<ArrowType> ARROWTYPE_PARSER = new DotAttributes.EObjectParser<ArrowType>(DotAttributes.arrowTypeInjector);
  
  /**
   * The serializer for arrowtype attribute values.
   */
  private final static DotAttributes.EObjectSerializer<ArrowType> ARROWTYPE_SERIALIZER = new DotAttributes.EObjectSerializer<ArrowType>(DotAttributes.arrowTypeInjector);
  
  private final static Injector colorInjector = new DotColorStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for color attribute values.
   */
  private final static DotAttributes.EObjectParser<Color> COLOR_PARSER = new DotAttributes.EObjectParser<Color>(DotAttributes.colorInjector);
  
  /**
   * The serializer for color attribute values.
   */
  private final static DotAttributes.EObjectSerializer<Color> COLOR_SERIALIZER = new DotAttributes.EObjectSerializer<Color>(DotAttributes.colorInjector);
  
  private final static Injector htmlLabelInjector = new DotHtmlLabelStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for (html) label attribute values.
   */
  private final static DotAttributes.EObjectParser<HtmlLabel> HTML_LABEL_PARSER = new DotAttributes.EObjectParser<HtmlLabel>(DotAttributes.htmlLabelInjector);
  
  private final static DotAttributes.EObjectValidator<HtmlLabel> HTML_LABEL_VALIDATOR = new DotAttributes.EObjectValidator<HtmlLabel>(DotAttributes.htmlLabelInjector, 
    DotHtmlLabelJavaValidator.class);
  
  private final static Injector escStringInjector = new DotEscStringStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for (escString) label attribute values.
   */
  private final static DotAttributes.EObjectParser<EscString> ESC_STRING_PARSER = new DotAttributes.EObjectParser<EscString>(DotAttributes.escStringInjector);
  
  private final static DotAttributes.EObjectValidator<EscString> ESC_STRING_VALIDATOR = new DotAttributes.EObjectValidator<EscString>(DotAttributes.escStringInjector, 
    DotEscStringJavaValidator.class);
  
  private final static Injector rectInjector = new DotRectStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for rect attribute values.
   */
  private final static DotAttributes.EObjectParser<Rect> RECT_PARSER = new DotAttributes.EObjectParser<Rect>(DotAttributes.rectInjector);
  
  /**
   * The serializer for rect attribute values.
   */
  private final static DotAttributes.EObjectSerializer<Rect> RECT_SERIALIZER = new DotAttributes.EObjectSerializer<Rect>(DotAttributes.rectInjector);
  
  private final static Injector pointInjector = new DotPointStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for point attribute values.
   */
  private final static DotAttributes.EObjectParser<Point> POINT_PARSER = new DotAttributes.EObjectParser<Point>(DotAttributes.pointInjector);
  
  /**
   * The serializer for point attribute values.
   */
  private final static DotAttributes.EObjectSerializer<Point> POINT_SERIALIZER = new DotAttributes.EObjectSerializer<Point>(DotAttributes.pointInjector);
  
  private final static Injector shapeInjector = new DotShapeStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for shape attribute values.
   */
  private final static DotAttributes.EObjectParser<Shape> SHAPE_PARSER = new DotAttributes.EObjectParser<Shape>(DotAttributes.shapeInjector);
  
  /**
   * The serializer for shape attribute values.
   */
  private final static DotAttributes.EObjectSerializer<Shape> SHAPE_SERIALIZER = new DotAttributes.EObjectSerializer<Shape>(DotAttributes.shapeInjector);
  
  private final static Injector splineTypeInjector = new DotSplineTypeStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The parser for splinetype attribute values.
   */
  private final static DotAttributes.EObjectParser<SplineType> SPLINETYPE_PARSER = new DotAttributes.EObjectParser<SplineType>(DotAttributes.splineTypeInjector);
  
  /**
   * The serializer for splinetype attribute values.
   */
  private final static DotAttributes.EObjectSerializer<SplineType> SPLINETYPE_SERIALIZER = new DotAttributes.EObjectSerializer<SplineType>(DotAttributes.splineTypeInjector);
  
  private final static Injector styleInjector = new DotStyleStandaloneSetup().createInjectorAndDoEMFRegistration();
  
  /**
   * The serializer for style attribute values.
   */
  private final static DotAttributes.EObjectSerializer<Style> STYLE_SERIALIZER = new DotAttributes.EObjectSerializer<Style>(DotAttributes.styleInjector);
  
  /**
   * The parser for style attribute values.
   */
  private final static DotAttributes.EObjectParser<Style> STYLE_PARSER = new DotAttributes.EObjectParser<Style>(DotAttributes.styleInjector);
  
  /**
   * Validator for Color types.
   */
  private final static DotAttributes.EObjectValidator<Color> COLOR_VALIDATOR = new DotAttributes.EObjectValidator<Color>(DotAttributes.colorInjector, DotColorJavaValidator.class);
  
  /**
   * Validator for SplineType types.
   */
  private final static DotAttributes.EObjectValidator<SplineType> SPLINETYPE_VALIDATOR = new DotAttributes.EObjectValidator<SplineType>(DotAttributes.splineTypeInjector, 
    DotSplineTypeJavaValidator.class);
  
  /**
   * Validator for Point types.
   */
  private final static DotAttributes.EObjectValidator<Point> POINT_VALIDATOR = new DotAttributes.EObjectValidator<Point>(DotAttributes.pointInjector, DotPointJavaValidator.class);
  
  /**
   * Validator for Rect types.
   */
  private final static DotAttributes.EObjectValidator<Rect> RECT_VALIDATOR = new DotAttributes.EObjectValidator<Rect>(DotAttributes.rectInjector, DotRectJavaValidator.class);
  
  /**
   * Validator for Shape types.
   */
  private final static DotAttributes.EObjectValidator<Shape> SHAPE_VALIDATOR = new DotAttributes.EObjectValidator<Shape>(DotAttributes.shapeInjector, DotShapeJavaValidator.class);
  
  /**
   * Validator for Style types.
   */
  private final static DotAttributes.EObjectValidator<Style> STYLE_VALIDATOR = new DotAttributes.EObjectValidator<Style>(DotAttributes.styleInjector, DotStyleJavaValidator.class);
  
  /**
   * Specifies the name of a graph, node, or edge (not an attribute), as
   * retrieved through the graph, node_id, as well as edge_stmt and edgeRHS
   * grammar rules.
   */
  public final static String _NAME__GNE = "_name";
  
  /**
   * Specifies the graph type.
   */
  public final static String _TYPE__G = "_type";
  
  /**
   * Returns the value of the {@link #_NAME__GNE} attribute of the given
   * {@link Graph}.
   * 
   * @param graph
   *            The {@link Graph} for which to return the value of the
   *            {@link #_NAME__GNE} attribute.
   * @return The value of the {@link #_NAME__GNE} attribute of the given
   *         {@link Graph}.
   */
  public static ID _getNameRaw(final Graph graph) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = graph.attributesProperty();
    Object _get = _attributesProperty.get(DotAttributes._NAME__GNE);
    return ((ID) _get);
  }
  
  /**
   * Returns the value of the {@link #_NAME__GNE} attribute of the given
   * {@link Graph}.
   * 
   * @param graph
   *            The {@link Graph} for which to return the value of the
   *            {@link #_NAME__GNE} attribute.
   * @return The value of the {@link #_NAME__GNE} attribute of the given
   *         {@link Graph}.
   */
  public static String _getName(final Graph graph) {
    String _xblockexpression = null;
    {
      final ID _nameRaw = DotAttributes._getNameRaw(graph);
      String _xifexpression = null;
      boolean _tripleNotEquals = (_nameRaw != null);
      if (_tripleNotEquals) {
        _xifexpression = _nameRaw.toValue();
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns the value of the {@link #_NAME__GNE} attribute of the given
   * {@link Node}.
   * 
   * @param node
   *            The {@link Node} for which to return the value of the
   *            {@link #_NAME__GNE} attribute.
   * @return The value of the {@link #_NAME__GNE} attribute of the given
   *         {@link Node}.
   */
  public static ID _getNameRaw(final Node node) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = node.attributesProperty();
    Object _get = _attributesProperty.get(DotAttributes._NAME__GNE);
    return ((ID) _get);
  }
  
  /**
   * Returns the value of the {@link #_NAME__GNE} attribute of the given
   * {@link Node}.
   * 
   * @param node
   *            The {@link Node} for which to return the value of the
   *            {@link #_NAME__GNE} attribute.
   * @return The value of the {@link #_NAME__GNE} attribute of the given
   *         {@link Node}.
   */
  public static String _getName(final Node node) {
    String _xblockexpression = null;
    {
      final ID _nameRaw = DotAttributes._getNameRaw(node);
      String _xifexpression = null;
      boolean _tripleNotEquals = (_nameRaw != null);
      if (_tripleNotEquals) {
        _xifexpression = _nameRaw.toValue();
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns the value of the {@link #_TYPE__G} attribute of the given
   * {@link Graph}.
   * 
   * @param graph
   *            The {@link Graph} for which to return the value of the
   *            {@link #_TYPE__G} attribute.
   * @return The value of the {@link #_TYPE__G} attribute of the given
   *         {@link Graph}.
   */
  public static GraphType _getType(final Graph graph) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = graph.attributesProperty();
    Object _get = _attributesProperty.get(DotAttributes._TYPE__G);
    return ((GraphType) _get);
  }
  
  /**
   * Sets the {@link #_NAME__GNE} attribute of the given {@link Graph} to the
   * given <i>name</i> value.
   * 
   * @param graph
   *            The {@link Graph} for which to change the value of the
   *            {@link #_NAME__GNE} attribute.
   * @param name
   *            The new value for the {@link #_NAME__GNE} attribute.
   */
  public static void _setNameRaw(final Graph graph, final ID name) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = graph.attributesProperty();
    _attributesProperty.put(DotAttributes._NAME__GNE, name);
  }
  
  /**
   * Sets the {@link #_NAME__GNE} attribute of the given {@link Graph} to the
   * given <i>name</i> value.
   * 
   * @param graph
   *            The {@link Graph} for which to change the value of the
   *            {@link #_NAME__GNE} attribute.
   * @param name
   *            The new value for the {@link #_NAME__GNE} attribute.
   */
  public static void _setName(final Graph graph, final String name) {
    ID _fromValue = ID.fromValue(name);
    DotAttributes._setNameRaw(graph, _fromValue);
  }
  
  /**
   * Sets the {@link #_NAME__GNE} attribute of the given {@link Node} to the
   * given <i>name</i> value.
   * 
   * @param node
   *            The {@link Node} for which to change the value of the
   *            {@link #_NAME__GNE} attribute.
   * @param name
   *            The new value for the {@link #_NAME__GNE} attribute.
   */
  public static void _setNameRaw(final Node node, final ID name) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = node.attributesProperty();
    _attributesProperty.put(DotAttributes._NAME__GNE, name);
  }
  
  /**
   * Sets the {@link #_NAME__GNE} attribute of the given {@link Node} to the
   * given <i>name</i> value.
   * 
   * @param node
   *            The {@link Node} for which to change the value of the
   *            {@link #_NAME__GNE} attribute.
   * @param name
   *            The new value for the {@link #_NAME__GNE} attribute.
   */
  public static void _setName(final Node node, final String name) {
    ID _fromValue = ID.fromValue(name);
    DotAttributes._setNameRaw(node, _fromValue);
  }
  
  /**
   * Returns the value of the {@link #_NAME__GNE} attribute of the given
   * {@link Edge}.
   * 
   * @param edge
   *            The {@link Edge} for which to return the value of the
   *            {@link #_NAME__GNE} attribute.
   * @return The value of the {@link #_NAME__GNE} attribute of the given
   *         {@link Edge}.
   */
  public static String _getName(final Edge edge) {
    Node _source = edge.getSource();
    String __getName = DotAttributes._getName(_source);
    String _xifexpression = null;
    Graph _graph = edge.getGraph();
    Graph _rootGraph = _graph.getRootGraph();
    GraphType __getType = DotAttributes._getType(_rootGraph);
    boolean _equals = GraphType.DIGRAPH.equals(__getType);
    if (_equals) {
      _xifexpression = EdgeOp.DIRECTED.getLiteral();
    } else {
      _xifexpression = EdgeOp.UNDIRECTED.getLiteral();
    }
    String _plus = (__getName + _xifexpression);
    Node _target = edge.getTarget();
    String __getName_1 = DotAttributes._getName(_target);
    return (_plus + __getName_1);
  }
  
  /**
   * Sets the {@link #_TYPE__G} attribute of the given {@link Graph} to the
   * given <i>type</i> value.
   * 
   * @param graph
   *            The {@link Graph} for which to change the value of the
   *            {@link #_TYPE__G} attribute.
   * @param type
   *            The new value for the {@link #_TYPE__G} attribute.
   */
  public static void _setType(final Graph graph, final GraphType type) {
    ReadOnlyMapProperty<String, Object> _attributesProperty = graph.attributesProperty();
    _attributesProperty.put(DotAttributes._TYPE__G, type);
  }
  
  /**
   * The 'arrowhead' attribute, which is used by: {@link Edge}.
   */
  public final static String ARROWHEAD__E = "arrowhead";
  
  /**
   * The 'arrowsize' attribute, which is used by: {@link Edge}.
   */
  public final static String ARROWSIZE__E = "arrowsize";
  
  /**
   * The 'arrowtail' attribute, which is used by: {@link Edge}.
   */
  public final static String ARROWTAIL__E = "arrowtail";
  
  /**
   * The 'bb' attribute, which is used by: {@link Graph}, Cluster.
   */
  public final static String BB__GC = "bb";
  
  /**
   * The 'bgcolor' attribute, which is used by: {@link Graph}, Cluster.
   */
  public final static String BGCOLOR__GC = "bgcolor";
  
  /**
   * The 'clusterrank' attribute, which is used by: {@link Graph}.
   */
  public final static String CLUSTERRANK__G = "clusterrank";
  
  /**
   * The 'color' attribute, which is used by: Cluster, {@link Node}, {@link Edge}.
   */
  public final static String COLOR__CNE = "color";
  
  /**
   * The 'colorscheme' attribute, which is used by: {@link Graph}, Cluster, {@link Node}, {@link Edge}.
   */
  public final static String COLORSCHEME__GCNE = "colorscheme";
  
  /**
   * The 'dir' attribute, which is used by: {@link Edge}.
   */
  public final static String DIR__E = "dir";
  
  /**
   * The 'distortion' attribute, which is used by: {@link Node}.
   */
  public final static String DISTORTION__N = "distortion";
  
  /**
   * The 'fillcolor' attribute, which is used by: Cluster, {@link Node}, {@link Edge}.
   */
  public final static String FILLCOLOR__CNE = "fillcolor";
  
  /**
   * The 'fixedsize' attribute, which is used by: {@link Node}.
   */
  public final static String FIXEDSIZE__N = "fixedsize";
  
  /**
   * The 'fontcolor' attribute, which is used by: {@link Graph}, Cluster, {@link Node}, {@link Edge}.
   */
  public final static String FONTCOLOR__GCNE = "fontcolor";
  
  /**
   * The 'forcelabels' attribute, which is used by: {@link Graph}.
   */
  public final static String FORCELABELS__G = "forcelabels";
  
  /**
   * The 'headLp' attribute, which is used by: {@link Edge}.
   */
  public final static String HEAD_LP__E = "head_lp";
  
  /**
   * The 'headlabel' attribute, which is used by: {@link Edge}.
   */
  public final static String HEADLABEL__E = "headlabel";
  
  /**
   * The 'height' attribute, which is used by: {@link Node}.
   */
  public final static String HEIGHT__N = "height";
  
  /**
   * The 'id' attribute, which is used by: {@link Graph}, Cluster, {@link Node}, {@link Edge}.
   */
  public final static String ID__GCNE = "id";
  
  /**
   * The 'label' attribute, which is used by: {@link Graph}, Cluster, {@link Node}, {@link Edge}.
   */
  public final static String LABEL__GCNE = "label";
  
  /**
   * The 'labelfontcolor' attribute, which is used by: {@link Edge}.
   */
  public final static String LABELFONTCOLOR__E = "labelfontcolor";
  
  /**
   * The 'layout' attribute, which is used by: {@link Graph}.
   */
  public final static String LAYOUT__G = "layout";
  
  /**
   * The 'lp' attribute, which is used by: {@link Graph}, Cluster, {@link Edge}.
   */
  public final static String LP__GCE = "lp";
  
  /**
   * The 'nodesep' attribute, which is used by: {@link Graph}.
   */
  public final static String NODESEP__G = "nodesep";
  
  /**
   * The 'outputorder' attribute, which is used by: {@link Graph}.
   */
  public final static String OUTPUTORDER__G = "outputorder";
  
  /**
   * The 'pagedir' attribute, which is used by: {@link Graph}.
   */
  public final static String PAGEDIR__G = "pagedir";
  
  /**
   * The 'pos' attribute, which is used by: {@link Node}, {@link Edge}.
   */
  public final static String POS__NE = "pos";
  
  /**
   * The 'rank' attribute, which is used by: {@link Subgraph}.
   */
  public final static String RANK__S = "rank";
  
  /**
   * The 'rankdir' attribute, which is used by: {@link Graph}.
   */
  public final static String RANKDIR__G = "rankdir";
  
  /**
   * The 'shape' attribute, which is used by: {@link Node}.
   */
  public final static String SHAPE__N = "shape";
  
  /**
   * The 'sides' attribute, which is used by: {@link Node}.
   */
  public final static String SIDES__N = "sides";
  
  /**
   * The 'skew' attribute, which is used by: {@link Node}.
   */
  public final static String SKEW__N = "skew";
  
  /**
   * The 'splines' attribute, which is used by: {@link Graph}.
   */
  public final static String SPLINES__G = "splines";
  
  /**
   * The 'style' attribute, which is used by: {@link Graph}, Cluster, {@link Node}, {@link Edge}.
   */
  public final static String STYLE__GCNE = "style";
  
  /**
   * The 'tailLp' attribute, which is used by: {@link Edge}.
   */
  public final static String TAIL_LP__E = "tail_lp";
  
  /**
   * The 'taillabel' attribute, which is used by: {@link Edge}.
   */
  public final static String TAILLABEL__E = "taillabel";
  
  /**
   * The 'width' attribute, which is used by: {@link Node}.
   */
  public final static String WIDTH__N = "width";
  
  /**
   * The 'xlabel' attribute, which is used by: {@link Node}, {@link Edge}.
   */
  public final static String XLABEL__NE = "xlabel";
  
  /**
   * The 'xlp' attribute, which is used by: {@link Node}, {@link Edge}.
   */
  public final static String XLP__NE = "xlp";
  
  /**
   * Returns the (raw) value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #ARROWHEAD__E} attribute.
   *     @return The (raw) value of the {@link #ARROWHEAD__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getArrowheadRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(ARROWHEAD__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}
   * to the given <i>arrowhead</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #ARROWHEAD__E} attribute.
   *     @param arrowhead
   *                The new (raw) value of the {@link #ARROWHEAD__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowhead</i> value is not supported.
   * 
   */
  public static void setArrowheadRaw(final Edge edge, final ID arrowhead) {
    checkAttributeRawValue(Context.EDGE, ARROWHEAD__E, arrowhead);edge.attributesProperty().put(ARROWHEAD__E, arrowhead);
  }
  
  /**
   * Returns the value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #ARROWHEAD__E} attribute.
   *     @return The value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getArrowhead(final Edge edge) {
    ID arrowheadRaw = getArrowheadRaw(edge);
    return arrowheadRaw != null ? arrowheadRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge} to the given <i>arrowhead</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWHEAD__E} attribute.
   *     @param arrowhead
   *            The new value of the {@link #ARROWHEAD__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>arrowhead</i> value is not supported.
   * 
   */
  public static void setArrowhead(final Edge edge, final String arrowhead) {
    setArrowheadRaw(edge, ID.fromValue(arrowhead, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #ARROWHEAD__E} attribute.
   *     @return The (parsed) value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge}.
   * 
   */
  public static ArrowType getArrowheadParsed(final Edge edge) {
    return parseAttributeValue(ARROWTYPE_PARSER, getArrowhead(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #ARROWHEAD__E} attribute of the given {@link Edge} to the given <i>arrowhead</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWHEAD__E} attribute.
   *     @param arrowhead
   *                The new (parsed) value of the {@link #ARROWHEAD__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowhead</i> value is not supported.
   * 
   */
  public static void setArrowheadParsed(final Edge edge, final ArrowType arrowhead) {
    setArrowhead(edge, serializeAttributeValue(ARROWTYPE_SERIALIZER, arrowhead));
  }
  
  /**
   * Returns the (raw) value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #ARROWSIZE__E} attribute.
   *     @return The (raw) value of the {@link #ARROWSIZE__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getArrowsizeRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(ARROWSIZE__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}
   * to the given <i>arrowsize</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #ARROWSIZE__E} attribute.
   *     @param arrowsize
   *                The new (raw) value of the {@link #ARROWSIZE__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowsize</i> value is not supported.
   * 
   */
  public static void setArrowsizeRaw(final Edge edge, final ID arrowsize) {
    checkAttributeRawValue(Context.EDGE, ARROWSIZE__E, arrowsize);edge.attributesProperty().put(ARROWSIZE__E, arrowsize);
  }
  
  /**
   * Returns the value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #ARROWSIZE__E} attribute.
   *     @return The value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getArrowsize(final Edge edge) {
    ID arrowsizeRaw = getArrowsizeRaw(edge);
    return arrowsizeRaw != null ? arrowsizeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge} to the given <i>arrowsize</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWSIZE__E} attribute.
   *     @param arrowsize
   *            The new value of the {@link #ARROWSIZE__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>arrowsize</i> value is not supported.
   * 
   */
  public static void setArrowsize(final Edge edge, final String arrowsize) {
    setArrowsizeRaw(edge, ID.fromValue(arrowsize, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #ARROWSIZE__E} attribute.
   *     @return The (parsed) value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge}.
   * 
   */
  public static Double getArrowsizeParsed(final Edge edge) {
    return parseAttributeValue(DOUBLE_PARSER, getArrowsize(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #ARROWSIZE__E} attribute of the given {@link Edge} to the given <i>arrowsize</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWSIZE__E} attribute.
   *     @param arrowsize
   *                The new (parsed) value of the {@link #ARROWSIZE__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowsize</i> value is not supported.
   * 
   */
  public static void setArrowsizeParsed(final Edge edge, final Double arrowsize) {
    setArrowsize(edge, serializeAttributeValue(DOUBLE_SERIALIZER, arrowsize));
  }
  
  /**
   * Returns the (raw) value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #ARROWTAIL__E} attribute.
   *     @return The (raw) value of the {@link #ARROWTAIL__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getArrowtailRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(ARROWTAIL__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}
   * to the given <i>arrowtail</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #ARROWTAIL__E} attribute.
   *     @param arrowtail
   *                The new (raw) value of the {@link #ARROWTAIL__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowtail</i> value is not supported.
   * 
   */
  public static void setArrowtailRaw(final Edge edge, final ID arrowtail) {
    checkAttributeRawValue(Context.EDGE, ARROWTAIL__E, arrowtail);edge.attributesProperty().put(ARROWTAIL__E, arrowtail);
  }
  
  /**
   * Returns the value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #ARROWTAIL__E} attribute.
   *     @return The value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getArrowtail(final Edge edge) {
    ID arrowtailRaw = getArrowtailRaw(edge);
    return arrowtailRaw != null ? arrowtailRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge} to the given <i>arrowtail</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWTAIL__E} attribute.
   *     @param arrowtail
   *            The new value of the {@link #ARROWTAIL__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>arrowtail</i> value is not supported.
   * 
   */
  public static void setArrowtail(final Edge edge, final String arrowtail) {
    setArrowtailRaw(edge, ID.fromValue(arrowtail, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #ARROWTAIL__E} attribute.
   *     @return The (parsed) value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge}.
   * 
   */
  public static ArrowType getArrowtailParsed(final Edge edge) {
    return parseAttributeValue(ARROWTYPE_PARSER, getArrowtail(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #ARROWTAIL__E} attribute of the given {@link Edge} to the given <i>arrowtail</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ARROWTAIL__E} attribute.
   *     @param arrowtail
   *                The new (parsed) value of the {@link #ARROWTAIL__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>arrowtail</i> value is not supported.
   * 
   */
  public static void setArrowtailParsed(final Edge edge, final ArrowType arrowtail) {
    setArrowtail(edge, serializeAttributeValue(ARROWTYPE_SERIALIZER, arrowtail));
  }
  
  /**
   * Returns the (raw) value of the {@link #BB__GC} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #BB__GC} attribute.
   *     @return The (raw) value of the {@link #BB__GC} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getBbRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(BB__GC);
  }
  
  /**
   * Sets the (raw) value of the {@link #BB__GC} attribute of the given {@link Graph}
   * to the given <i>bb</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #BB__GC} attribute.
   *     @param bb
   *                The new (raw) value of the {@link #BB__GC} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>bb</i> value is not supported.
   * 
   */
  public static void setBbRaw(final Graph graph, final ID bb) {
    checkAttributeRawValue(Context.GRAPH, BB__GC, bb);graph.attributesProperty().put(BB__GC, bb);
  }
  
  /**
   * Returns the value of the {@link #BB__GC} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #BB__GC} attribute.
   *     @return The value of the {@link #BB__GC} attribute of the given {@link Graph}.
   * 
   */
  public static String getBb(final Graph graph) {
    ID bbRaw = getBbRaw(graph);
    return bbRaw != null ? bbRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #BB__GC} attribute of the given {@link Graph} to the given <i>bb</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #BB__GC} attribute.
   *     @param bb
   *            The new value of the {@link #BB__GC} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>bb</i> value is not supported.
   * 
   */
  public static void setBb(final Graph graph, final String bb) {
    setBbRaw(graph, ID.fromValue(bb));
  }
  
  /**
   * Returns the (parsed) value of the {@link #BB__GC} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #BB__GC} attribute.
   *     @return The (parsed) value of the {@link #BB__GC} attribute of the given {@link Graph}.
   * 
   */
  public static Rect getBbParsed(final Graph graph) {
    return parseAttributeValue(RECT_PARSER, getBb(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #BB__GC} attribute of the given {@link Graph} to the given <i>bb</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #BB__GC} attribute.
   *     @param bb
   *                The new (parsed) value of the {@link #BB__GC} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>bb</i> value is not supported.
   * 
   */
  public static void setBbParsed(final Graph graph, final Rect bb) {
    setBb(graph, serializeAttributeValue(RECT_SERIALIZER, bb));
  }
  
  /**
   * Returns the (raw) value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #BGCOLOR__GC} attribute.
   *     @return The (raw) value of the {@link #BGCOLOR__GC} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getBgcolorRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(BGCOLOR__GC);
  }
  
  /**
   * Sets the (raw) value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}
   * to the given <i>bgcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #BGCOLOR__GC} attribute.
   *     @param bgcolor
   *                The new (raw) value of the {@link #BGCOLOR__GC} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>bgcolor</i> value is not supported.
   * 
   */
  public static void setBgcolorRaw(final Graph graph, final ID bgcolor) {
    checkAttributeRawValue(Context.GRAPH, BGCOLOR__GC, bgcolor);graph.attributesProperty().put(BGCOLOR__GC, bgcolor);
  }
  
  /**
   * Returns the value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #BGCOLOR__GC} attribute.
   *     @return The value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}.
   * 
   */
  public static String getBgcolor(final Graph graph) {
    ID bgcolorRaw = getBgcolorRaw(graph);
    return bgcolorRaw != null ? bgcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph} to the given <i>bgcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #BGCOLOR__GC} attribute.
   *     @param bgcolor
   *            The new value of the {@link #BGCOLOR__GC} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>bgcolor</i> value is not supported.
   * 
   */
  public static void setBgcolor(final Graph graph, final String bgcolor) {
    setBgcolorRaw(graph, ID.fromValue(bgcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #BGCOLOR__GC} attribute.
   *     @return The (parsed) value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph}.
   * 
   */
  public static Color getBgcolorParsed(final Graph graph) {
    return parseAttributeValue(COLOR_PARSER, getBgcolor(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #BGCOLOR__GC} attribute of the given {@link Graph} to the given <i>bgcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #BGCOLOR__GC} attribute.
   *     @param bgcolor
   *                The new (parsed) value of the {@link #BGCOLOR__GC} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>bgcolor</i> value is not supported.
   * 
   */
  public static void setBgcolorParsed(final Graph graph, final Color bgcolor) {
    setBgcolor(graph, serializeAttributeValue(COLOR_SERIALIZER, bgcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #CLUSTERRANK__G} attribute.
   *     @return The (raw) value of the {@link #CLUSTERRANK__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getClusterrankRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(CLUSTERRANK__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}
   * to the given <i>clusterrank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #CLUSTERRANK__G} attribute.
   *     @param clusterrank
   *                The new (raw) value of the {@link #CLUSTERRANK__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>clusterrank</i> value is not supported.
   * 
   */
  public static void setClusterrankRaw(final Graph graph, final ID clusterrank) {
    checkAttributeRawValue(Context.GRAPH, CLUSTERRANK__G, clusterrank);graph.attributesProperty().put(CLUSTERRANK__G, clusterrank);
  }
  
  /**
   * Returns the value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #CLUSTERRANK__G} attribute.
   *     @return The value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getClusterrank(final Graph graph) {
    ID clusterrankRaw = getClusterrankRaw(graph);
    return clusterrankRaw != null ? clusterrankRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph} to the given <i>clusterrank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #CLUSTERRANK__G} attribute.
   *     @param clusterrank
   *            The new value of the {@link #CLUSTERRANK__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>clusterrank</i> value is not supported.
   * 
   */
  public static void setClusterrank(final Graph graph, final String clusterrank) {
    setClusterrankRaw(graph, ID.fromValue(clusterrank, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #CLUSTERRANK__G} attribute.
   *     @return The (parsed) value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph}.
   * 
   */
  public static ClusterMode getClusterrankParsed(final Graph graph) {
    return parseAttributeValue(CLUSTERMODE_PARSER, getClusterrank(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #CLUSTERRANK__G} attribute of the given {@link Graph} to the given <i>clusterrank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #CLUSTERRANK__G} attribute.
   *     @param clusterrank
   *                The new (parsed) value of the {@link #CLUSTERRANK__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>clusterrank</i> value is not supported.
   * 
   */
  public static void setClusterrankParsed(final Graph graph, final ClusterMode clusterrank) {
    setClusterrank(graph, serializeAttributeValue(CLUSTERMODE_SERIALIZER, clusterrank));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #COLOR__CNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getColorRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(COLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Graph}
   * to the given <i>color</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (raw) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorRaw(final Graph graph, final ID color) {
    checkAttributeRawValue(Context.GRAPH, COLOR__CNE, color);graph.attributesProperty().put(COLOR__CNE, color);
  }
  
  /**
   * Returns the value of the {@link #COLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The value of the {@link #COLOR__CNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getColor(final Graph graph) {
    ID colorRaw = getColorRaw(graph);
    return colorRaw != null ? colorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLOR__CNE} attribute of the given {@link Graph} to the given <i>color</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *            The new value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColor(final Graph graph, final String color) {
    setColorRaw(graph, ID.fromValue(color));
  }
  
  /**
   * Returns the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Graph}.
   * 
   */
  public static Color getColorParsed(final Graph graph) {
    return parseAttributeValue(COLOR_PARSER, getColor(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Graph} to the given <i>color</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (parsed) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorParsed(final Graph graph, final Color color) {
    setColor(graph, serializeAttributeValue(COLOR_SERIALIZER, color));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #COLOR__CNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getColorRaw(final Node node) {
    return (ID) node.attributesProperty().get(COLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Node}
   * to the given <i>color</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (raw) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorRaw(final Node node, final ID color) {
    checkAttributeRawValue(Context.NODE, COLOR__CNE, color);node.attributesProperty().put(COLOR__CNE, color);
  }
  
  /**
   * Returns the value of the {@link #COLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The value of the {@link #COLOR__CNE} attribute of the given {@link Node}.
   * 
   */
  public static String getColor(final Node node) {
    ID colorRaw = getColorRaw(node);
    return colorRaw != null ? colorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLOR__CNE} attribute of the given {@link Node} to the given <i>color</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *            The new value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColor(final Node node, final String color) {
    setColorRaw(node, ID.fromValue(color));
  }
  
  /**
   * Returns the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Node}.
   * 
   */
  public static Color getColorParsed(final Node node) {
    return parseAttributeValue(COLOR_PARSER, getColor(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Node} to the given <i>color</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (parsed) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorParsed(final Node node, final Color color) {
    setColor(node, serializeAttributeValue(COLOR_SERIALIZER, color));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #COLOR__CNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getColorRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(COLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLOR__CNE} attribute of the given {@link Edge}
   * to the given <i>color</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (raw) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorRaw(final Edge edge, final ID color) {
    checkAttributeRawValue(Context.EDGE, COLOR__CNE, color);edge.attributesProperty().put(COLOR__CNE, color);
  }
  
  /**
   * Returns the value of the {@link #COLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The value of the {@link #COLOR__CNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getColor(final Edge edge) {
    ID colorRaw = getColorRaw(edge);
    return colorRaw != null ? colorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLOR__CNE} attribute of the given {@link Edge} to the given <i>color</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *            The new value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColor(final Edge edge, final String color) {
    setColorRaw(edge, ID.fromValue(color));
  }
  
  /**
   * Returns the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #COLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Edge}.
   * 
   */
  public static Color getColorParsed(final Edge edge) {
    return parseAttributeValue(COLOR_PARSER, getColor(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #COLOR__CNE} attribute of the given {@link Edge} to the given <i>color</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #COLOR__CNE} attribute.
   *     @param color
   *                The new (parsed) value of the {@link #COLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>color</i> value is not supported.
   * 
   */
  public static void setColorParsed(final Edge edge, final Color color) {
    setColor(edge, serializeAttributeValue(COLOR_SERIALIZER, color));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @return The (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getColorschemeRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(COLORSCHEME__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Graph}
   * to the given <i>colorscheme</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *                The new (raw) value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorschemeRaw(final Graph graph, final ID colorscheme) {
    checkAttributeRawValue(Context.GRAPH, COLORSCHEME__GCNE, colorscheme);graph.attributesProperty().put(COLORSCHEME__GCNE, colorscheme);
  }
  
  /**
   * Returns the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @return The value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getColorscheme(final Graph graph) {
    ID colorschemeRaw = getColorschemeRaw(graph);
    return colorschemeRaw != null ? colorschemeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Graph} to the given <i>colorscheme</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *            The new value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorscheme(final Graph graph, final String colorscheme) {
    setColorschemeRaw(graph, ID.fromValue(colorscheme));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @return The (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getColorschemeRaw(final Node node) {
    return (ID) node.attributesProperty().get(COLORSCHEME__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Node}
   * to the given <i>colorscheme</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *                The new (raw) value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorschemeRaw(final Node node, final ID colorscheme) {
    checkAttributeRawValue(Context.NODE, COLORSCHEME__GCNE, colorscheme);node.attributesProperty().put(COLORSCHEME__GCNE, colorscheme);
  }
  
  /**
   * Returns the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @return The value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static String getColorscheme(final Node node) {
    ID colorschemeRaw = getColorschemeRaw(node);
    return colorschemeRaw != null ? colorschemeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Node} to the given <i>colorscheme</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *            The new value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorscheme(final Node node, final String colorscheme) {
    setColorschemeRaw(node, ID.fromValue(colorscheme));
  }
  
  /**
   * Returns the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @return The (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getColorschemeRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(COLORSCHEME__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Edge}
   * to the given <i>colorscheme</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *                The new (raw) value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorschemeRaw(final Edge edge, final ID colorscheme) {
    checkAttributeRawValue(Context.EDGE, COLORSCHEME__GCNE, colorscheme);edge.attributesProperty().put(COLORSCHEME__GCNE, colorscheme);
  }
  
  /**
   * Returns the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @return The value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getColorscheme(final Edge edge) {
    ID colorschemeRaw = getColorschemeRaw(edge);
    return colorschemeRaw != null ? colorschemeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #COLORSCHEME__GCNE} attribute of the given {@link Edge} to the given <i>colorscheme</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @param colorscheme
   *            The new value of the {@link #COLORSCHEME__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>colorscheme</i> value is not supported.
   * 
   */
  public static void setColorscheme(final Edge edge, final String colorscheme) {
    setColorschemeRaw(edge, ID.fromValue(colorscheme));
  }
  
  /**
   * Returns the (raw) value of the {@link #DIR__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #DIR__E} attribute.
   *     @return The (raw) value of the {@link #DIR__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getDirRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(DIR__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #DIR__E} attribute of the given {@link Edge}
   * to the given <i>dir</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #DIR__E} attribute.
   *     @param dir
   *                The new (raw) value of the {@link #DIR__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>dir</i> value is not supported.
   * 
   */
  public static void setDirRaw(final Edge edge, final ID dir) {
    checkAttributeRawValue(Context.EDGE, DIR__E, dir);edge.attributesProperty().put(DIR__E, dir);
  }
  
  /**
   * Returns the value of the {@link #DIR__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #DIR__E} attribute.
   *     @return The value of the {@link #DIR__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getDir(final Edge edge) {
    ID dirRaw = getDirRaw(edge);
    return dirRaw != null ? dirRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #DIR__E} attribute of the given {@link Edge} to the given <i>dir</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #DIR__E} attribute.
   *     @param dir
   *            The new value of the {@link #DIR__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>dir</i> value is not supported.
   * 
   */
  public static void setDir(final Edge edge, final String dir) {
    setDirRaw(edge, ID.fromValue(dir, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #DIR__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #DIR__E} attribute.
   *     @return The (parsed) value of the {@link #DIR__E} attribute of the given {@link Edge}.
   * 
   */
  public static DirType getDirParsed(final Edge edge) {
    return parseAttributeValue(DIRTYPE_PARSER, getDir(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #DIR__E} attribute of the given {@link Edge} to the given <i>dir</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #DIR__E} attribute.
   *     @param dir
   *                The new (parsed) value of the {@link #DIR__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>dir</i> value is not supported.
   * 
   */
  public static void setDirParsed(final Edge edge, final DirType dir) {
    setDir(edge, serializeAttributeValue(DIRTYPE_SERIALIZER, dir));
  }
  
  /**
   * Returns the (raw) value of the {@link #DISTORTION__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #DISTORTION__N} attribute.
   *     @return The (raw) value of the {@link #DISTORTION__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getDistortionRaw(final Node node) {
    return (ID) node.attributesProperty().get(DISTORTION__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #DISTORTION__N} attribute of the given {@link Node}
   * to the given <i>distortion</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #DISTORTION__N} attribute.
   *     @param distortion
   *                The new (raw) value of the {@link #DISTORTION__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>distortion</i> value is not supported.
   * 
   */
  public static void setDistortionRaw(final Node node, final ID distortion) {
    checkAttributeRawValue(Context.NODE, DISTORTION__N, distortion);node.attributesProperty().put(DISTORTION__N, distortion);
  }
  
  /**
   * Returns the value of the {@link #DISTORTION__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #DISTORTION__N} attribute.
   *     @return The value of the {@link #DISTORTION__N} attribute of the given {@link Node}.
   * 
   */
  public static String getDistortion(final Node node) {
    ID distortionRaw = getDistortionRaw(node);
    return distortionRaw != null ? distortionRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #DISTORTION__N} attribute of the given {@link Node} to the given <i>distortion</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #DISTORTION__N} attribute.
   *     @param distortion
   *            The new value of the {@link #DISTORTION__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>distortion</i> value is not supported.
   * 
   */
  public static void setDistortion(final Node node, final String distortion) {
    setDistortionRaw(node, ID.fromValue(distortion, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #DISTORTION__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #DISTORTION__N} attribute.
   *     @return The (parsed) value of the {@link #DISTORTION__N} attribute of the given {@link Node}.
   * 
   */
  public static Double getDistortionParsed(final Node node) {
    return parseAttributeValue(DOUBLE_PARSER, getDistortion(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #DISTORTION__N} attribute of the given {@link Node} to the given <i>distortion</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #DISTORTION__N} attribute.
   *     @param distortion
   *                The new (parsed) value of the {@link #DISTORTION__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>distortion</i> value is not supported.
   * 
   */
  public static void setDistortionParsed(final Node node, final Double distortion) {
    setDistortion(node, serializeAttributeValue(DOUBLE_SERIALIZER, distortion));
  }
  
  /**
   * Returns the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getFillcolorRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(FILLCOLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}
   * to the given <i>fillcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (raw) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorRaw(final Graph graph, final ID fillcolor) {
    checkAttributeRawValue(Context.GRAPH, FILLCOLOR__CNE, fillcolor);graph.attributesProperty().put(FILLCOLOR__CNE, fillcolor);
  }
  
  /**
   * Returns the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getFillcolor(final Graph graph) {
    ID fillcolorRaw = getFillcolorRaw(graph);
    return fillcolorRaw != null ? fillcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph} to the given <i>fillcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *            The new value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolor(final Graph graph, final String fillcolor) {
    setFillcolorRaw(graph, ID.fromValue(fillcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph}.
   * 
   */
  public static Color getFillcolorParsed(final Graph graph) {
    return parseAttributeValue(COLOR_PARSER, getFillcolor(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Graph} to the given <i>fillcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (parsed) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorParsed(final Graph graph, final Color fillcolor) {
    setFillcolor(graph, serializeAttributeValue(COLOR_SERIALIZER, fillcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getFillcolorRaw(final Node node) {
    return (ID) node.attributesProperty().get(FILLCOLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}
   * to the given <i>fillcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (raw) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorRaw(final Node node, final ID fillcolor) {
    checkAttributeRawValue(Context.NODE, FILLCOLOR__CNE, fillcolor);node.attributesProperty().put(FILLCOLOR__CNE, fillcolor);
  }
  
  /**
   * Returns the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}.
   * 
   */
  public static String getFillcolor(final Node node) {
    ID fillcolorRaw = getFillcolorRaw(node);
    return fillcolorRaw != null ? fillcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node} to the given <i>fillcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *            The new value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolor(final Node node, final String fillcolor) {
    setFillcolorRaw(node, ID.fromValue(fillcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node}.
   * 
   */
  public static Color getFillcolorParsed(final Node node) {
    return parseAttributeValue(COLOR_PARSER, getFillcolor(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Node} to the given <i>fillcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (parsed) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorParsed(final Node node, final Color fillcolor) {
    setFillcolor(node, serializeAttributeValue(COLOR_SERIALIZER, fillcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @return The (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getFillcolorRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(FILLCOLOR__CNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}
   * to the given <i>fillcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (raw) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorRaw(final Edge edge, final ID fillcolor) {
    checkAttributeRawValue(Context.EDGE, FILLCOLOR__CNE, fillcolor);edge.attributesProperty().put(FILLCOLOR__CNE, fillcolor);
  }
  
  /**
   * Returns the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getFillcolor(final Edge edge) {
    ID fillcolorRaw = getFillcolorRaw(edge);
    return fillcolorRaw != null ? fillcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge} to the given <i>fillcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *            The new value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolor(final Edge edge, final String fillcolor) {
    setFillcolorRaw(edge, ID.fromValue(fillcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @return The (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge}.
   * 
   */
  public static Color getFillcolorParsed(final Edge edge) {
    return parseAttributeValue(COLOR_PARSER, getFillcolor(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FILLCOLOR__CNE} attribute of the given {@link Edge} to the given <i>fillcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #FILLCOLOR__CNE} attribute.
   *     @param fillcolor
   *                The new (parsed) value of the {@link #FILLCOLOR__CNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fillcolor</i> value is not supported.
   * 
   */
  public static void setFillcolorParsed(final Edge edge, final Color fillcolor) {
    setFillcolor(edge, serializeAttributeValue(COLOR_SERIALIZER, fillcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #FIXEDSIZE__N} attribute.
   *     @return The (raw) value of the {@link #FIXEDSIZE__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getFixedsizeRaw(final Node node) {
    return (ID) node.attributesProperty().get(FIXEDSIZE__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}
   * to the given <i>fixedsize</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #FIXEDSIZE__N} attribute.
   *     @param fixedsize
   *                The new (raw) value of the {@link #FIXEDSIZE__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fixedsize</i> value is not supported.
   * 
   */
  public static void setFixedsizeRaw(final Node node, final ID fixedsize) {
    checkAttributeRawValue(Context.NODE, FIXEDSIZE__N, fixedsize);node.attributesProperty().put(FIXEDSIZE__N, fixedsize);
  }
  
  /**
   * Returns the value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #FIXEDSIZE__N} attribute.
   *     @return The value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}.
   * 
   */
  public static String getFixedsize(final Node node) {
    ID fixedsizeRaw = getFixedsizeRaw(node);
    return fixedsizeRaw != null ? fixedsizeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node} to the given <i>fixedsize</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FIXEDSIZE__N} attribute.
   *     @param fixedsize
   *            The new value of the {@link #FIXEDSIZE__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fixedsize</i> value is not supported.
   * 
   */
  public static void setFixedsize(final Node node, final String fixedsize) {
    setFixedsizeRaw(node, ID.fromValue(fixedsize, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #FIXEDSIZE__N} attribute.
   *     @return The (parsed) value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node}.
   * 
   */
  public static Boolean getFixedsizeParsed(final Node node) {
    return parseAttributeValue(BOOL_PARSER, getFixedsize(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FIXEDSIZE__N} attribute of the given {@link Node} to the given <i>fixedsize</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FIXEDSIZE__N} attribute.
   *     @param fixedsize
   *                The new (parsed) value of the {@link #FIXEDSIZE__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fixedsize</i> value is not supported.
   * 
   */
  public static void setFixedsizeParsed(final Node node, final Boolean fixedsize) {
    setFixedsize(node, serializeAttributeValue(BOOL_SERIALIZER, fixedsize));
  }
  
  /**
   * Returns the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getFontcolorRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(FONTCOLOR__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}
   * to the given <i>fontcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (raw) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorRaw(final Graph graph, final ID fontcolor) {
    checkAttributeRawValue(Context.GRAPH, FONTCOLOR__GCNE, fontcolor);graph.attributesProperty().put(FONTCOLOR__GCNE, fontcolor);
  }
  
  /**
   * Returns the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getFontcolor(final Graph graph) {
    ID fontcolorRaw = getFontcolorRaw(graph);
    return fontcolorRaw != null ? fontcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph} to the given <i>fontcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *            The new value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolor(final Graph graph, final String fontcolor) {
    setFontcolorRaw(graph, ID.fromValue(fontcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static Color getFontcolorParsed(final Graph graph) {
    return parseAttributeValue(COLOR_PARSER, getFontcolor(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Graph} to the given <i>fontcolor</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (parsed) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorParsed(final Graph graph, final Color fontcolor) {
    setFontcolor(graph, serializeAttributeValue(COLOR_SERIALIZER, fontcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getFontcolorRaw(final Node node) {
    return (ID) node.attributesProperty().get(FONTCOLOR__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}
   * to the given <i>fontcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (raw) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorRaw(final Node node, final ID fontcolor) {
    checkAttributeRawValue(Context.NODE, FONTCOLOR__GCNE, fontcolor);node.attributesProperty().put(FONTCOLOR__GCNE, fontcolor);
  }
  
  /**
   * Returns the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static String getFontcolor(final Node node) {
    ID fontcolorRaw = getFontcolorRaw(node);
    return fontcolorRaw != null ? fontcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node} to the given <i>fontcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *            The new value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolor(final Node node, final String fontcolor) {
    setFontcolorRaw(node, ID.fromValue(fontcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static Color getFontcolorParsed(final Node node) {
    return parseAttributeValue(COLOR_PARSER, getFontcolor(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Node} to the given <i>fontcolor</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (parsed) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorParsed(final Node node, final Color fontcolor) {
    setFontcolor(node, serializeAttributeValue(COLOR_SERIALIZER, fontcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getFontcolorRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(FONTCOLOR__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}
   * to the given <i>fontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (raw) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorRaw(final Edge edge, final ID fontcolor) {
    checkAttributeRawValue(Context.EDGE, FONTCOLOR__GCNE, fontcolor);edge.attributesProperty().put(FONTCOLOR__GCNE, fontcolor);
  }
  
  /**
   * Returns the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getFontcolor(final Edge edge) {
    ID fontcolorRaw = getFontcolorRaw(edge);
    return fontcolorRaw != null ? fontcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge} to the given <i>fontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *            The new value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolor(final Edge edge, final String fontcolor) {
    setFontcolorRaw(edge, ID.fromValue(fontcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @return The (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static Color getFontcolorParsed(final Edge edge) {
    return parseAttributeValue(COLOR_PARSER, getFontcolor(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FONTCOLOR__GCNE} attribute of the given {@link Edge} to the given <i>fontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @param fontcolor
   *                The new (parsed) value of the {@link #FONTCOLOR__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>fontcolor</i> value is not supported.
   * 
   */
  public static void setFontcolorParsed(final Edge edge, final Color fontcolor) {
    setFontcolor(edge, serializeAttributeValue(COLOR_SERIALIZER, fontcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #FORCELABELS__G} attribute.
   *     @return The (raw) value of the {@link #FORCELABELS__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getForcelabelsRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(FORCELABELS__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}
   * to the given <i>forcelabels</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #FORCELABELS__G} attribute.
   *     @param forcelabels
   *                The new (raw) value of the {@link #FORCELABELS__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>forcelabels</i> value is not supported.
   * 
   */
  public static void setForcelabelsRaw(final Graph graph, final ID forcelabels) {
    checkAttributeRawValue(Context.GRAPH, FORCELABELS__G, forcelabels);graph.attributesProperty().put(FORCELABELS__G, forcelabels);
  }
  
  /**
   * Returns the value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #FORCELABELS__G} attribute.
   *     @return The value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getForcelabels(final Graph graph) {
    ID forcelabelsRaw = getForcelabelsRaw(graph);
    return forcelabelsRaw != null ? forcelabelsRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #FORCELABELS__G} attribute of the given {@link Graph} to the given <i>forcelabels</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FORCELABELS__G} attribute.
   *     @param forcelabels
   *            The new value of the {@link #FORCELABELS__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>forcelabels</i> value is not supported.
   * 
   */
  public static void setForcelabels(final Graph graph, final String forcelabels) {
    setForcelabelsRaw(graph, ID.fromValue(forcelabels, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #FORCELABELS__G} attribute.
   *     @return The (parsed) value of the {@link #FORCELABELS__G} attribute of the given {@link Graph}.
   * 
   */
  public static Boolean getForcelabelsParsed(final Graph graph) {
    return parseAttributeValue(BOOL_PARSER, getForcelabels(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #FORCELABELS__G} attribute of the given {@link Graph} to the given <i>forcelabels</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #FORCELABELS__G} attribute.
   *     @param forcelabels
   *                The new (parsed) value of the {@link #FORCELABELS__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>forcelabels</i> value is not supported.
   * 
   */
  public static void setForcelabelsParsed(final Graph graph, final Boolean forcelabels) {
    setForcelabels(graph, serializeAttributeValue(BOOL_SERIALIZER, forcelabels));
  }
  
  /**
   * Returns the (raw) value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #HEAD_LP__E} attribute.
   *     @return The (raw) value of the {@link #HEAD_LP__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getHeadLpRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(HEAD_LP__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}
   * to the given <i>headLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #HEAD_LP__E} attribute.
   *     @param headLp
   *                The new (raw) value of the {@link #HEAD_LP__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>headLp</i> value is not supported.
   * 
   */
  public static void setHeadLpRaw(final Edge edge, final ID headLp) {
    checkAttributeRawValue(Context.EDGE, HEAD_LP__E, headLp);edge.attributesProperty().put(HEAD_LP__E, headLp);
  }
  
  /**
   * Returns the value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #HEAD_LP__E} attribute.
   *     @return The value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getHeadLp(final Edge edge) {
    ID headLpRaw = getHeadLpRaw(edge);
    return headLpRaw != null ? headLpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #HEAD_LP__E} attribute of the given {@link Edge} to the given <i>headLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #HEAD_LP__E} attribute.
   *     @param headLp
   *            The new value of the {@link #HEAD_LP__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>headLp</i> value is not supported.
   * 
   */
  public static void setHeadLp(final Edge edge, final String headLp) {
    setHeadLpRaw(edge, ID.fromValue(headLp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #HEAD_LP__E} attribute.
   *     @return The (parsed) value of the {@link #HEAD_LP__E} attribute of the given {@link Edge}.
   * 
   */
  public static Point getHeadLpParsed(final Edge edge) {
    return parseAttributeValue(POINT_PARSER, getHeadLp(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #HEAD_LP__E} attribute of the given {@link Edge} to the given <i>headLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #HEAD_LP__E} attribute.
   *     @param headLp
   *                The new (parsed) value of the {@link #HEAD_LP__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>headLp</i> value is not supported.
   * 
   */
  public static void setHeadLpParsed(final Edge edge, final Point headLp) {
    setHeadLp(edge, serializeAttributeValue(POINT_SERIALIZER, headLp));
  }
  
  /**
   * Returns the (raw) value of the {@link #HEADLABEL__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #HEADLABEL__E} attribute.
   *     @return The (raw) value of the {@link #HEADLABEL__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getHeadlabelRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(HEADLABEL__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #HEADLABEL__E} attribute of the given {@link Edge}
   * to the given <i>headlabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #HEADLABEL__E} attribute.
   *     @param headlabel
   *                The new (raw) value of the {@link #HEADLABEL__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>headlabel</i> value is not supported.
   * 
   */
  public static void setHeadlabelRaw(final Edge edge, final ID headlabel) {
    checkAttributeRawValue(Context.EDGE, HEADLABEL__E, headlabel);edge.attributesProperty().put(HEADLABEL__E, headlabel);
  }
  
  /**
   * Returns the value of the {@link #HEADLABEL__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #HEADLABEL__E} attribute.
   *     @return The value of the {@link #HEADLABEL__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getHeadlabel(final Edge edge) {
    ID headlabelRaw = getHeadlabelRaw(edge);
    return headlabelRaw != null ? headlabelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #HEADLABEL__E} attribute of the given {@link Edge} to the given <i>headlabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #HEADLABEL__E} attribute.
   *     @param headlabel
   *            The new value of the {@link #HEADLABEL__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>headlabel</i> value is not supported.
   * 
   */
  public static void setHeadlabel(final Edge edge, final String headlabel) {
    setHeadlabelRaw(edge, ID.fromValue(headlabel));
  }
  
  /**
   * Returns the (raw) value of the {@link #HEIGHT__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #HEIGHT__N} attribute.
   *     @return The (raw) value of the {@link #HEIGHT__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getHeightRaw(final Node node) {
    return (ID) node.attributesProperty().get(HEIGHT__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #HEIGHT__N} attribute of the given {@link Node}
   * to the given <i>height</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #HEIGHT__N} attribute.
   *     @param height
   *                The new (raw) value of the {@link #HEIGHT__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>height</i> value is not supported.
   * 
   */
  public static void setHeightRaw(final Node node, final ID height) {
    checkAttributeRawValue(Context.NODE, HEIGHT__N, height);node.attributesProperty().put(HEIGHT__N, height);
  }
  
  /**
   * Returns the value of the {@link #HEIGHT__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #HEIGHT__N} attribute.
   *     @return The value of the {@link #HEIGHT__N} attribute of the given {@link Node}.
   * 
   */
  public static String getHeight(final Node node) {
    ID heightRaw = getHeightRaw(node);
    return heightRaw != null ? heightRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #HEIGHT__N} attribute of the given {@link Node} to the given <i>height</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #HEIGHT__N} attribute.
   *     @param height
   *            The new value of the {@link #HEIGHT__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>height</i> value is not supported.
   * 
   */
  public static void setHeight(final Node node, final String height) {
    setHeightRaw(node, ID.fromValue(height, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #HEIGHT__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #HEIGHT__N} attribute.
   *     @return The (parsed) value of the {@link #HEIGHT__N} attribute of the given {@link Node}.
   * 
   */
  public static Double getHeightParsed(final Node node) {
    return parseAttributeValue(DOUBLE_PARSER, getHeight(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #HEIGHT__N} attribute of the given {@link Node} to the given <i>height</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #HEIGHT__N} attribute.
   *     @param height
   *                The new (parsed) value of the {@link #HEIGHT__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>height</i> value is not supported.
   * 
   */
  public static void setHeightParsed(final Node node, final Double height) {
    setHeight(node, serializeAttributeValue(DOUBLE_SERIALIZER, height));
  }
  
  /**
   * Returns the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #ID__GCNE} attribute.
   *     @return The (raw) value of the {@link #ID__GCNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getIdRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(ID__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Graph}
   * to the given <i>id</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #ID__GCNE} attribute.
   *     @param id
   *                The new (raw) value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>id</i> value is not supported.
   * 
   */
  public static void setIdRaw(final Graph graph, final ID id) {
    checkAttributeRawValue(Context.GRAPH, ID__GCNE, id);graph.attributesProperty().put(ID__GCNE, id);
  }
  
  /**
   * Returns the value of the {@link #ID__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #ID__GCNE} attribute.
   *     @return The value of the {@link #ID__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getId(final Graph graph) {
    ID idRaw = getIdRaw(graph);
    return idRaw != null ? idRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ID__GCNE} attribute of the given {@link Graph} to the given <i>id</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #ID__GCNE} attribute.
   *     @param id
   *            The new value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>id</i> value is not supported.
   * 
   */
  public static void setId(final Graph graph, final String id) {
    setIdRaw(graph, ID.fromValue(id));
  }
  
  /**
   * Returns the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #ID__GCNE} attribute.
   *     @return The (raw) value of the {@link #ID__GCNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getIdRaw(final Node node) {
    return (ID) node.attributesProperty().get(ID__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Node}
   * to the given <i>id</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #ID__GCNE} attribute.
   *     @param id
   *                The new (raw) value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>id</i> value is not supported.
   * 
   */
  public static void setIdRaw(final Node node, final ID id) {
    checkAttributeRawValue(Context.NODE, ID__GCNE, id);node.attributesProperty().put(ID__GCNE, id);
  }
  
  /**
   * Returns the value of the {@link #ID__GCNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #ID__GCNE} attribute.
   *     @return The value of the {@link #ID__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static String getId(final Node node) {
    ID idRaw = getIdRaw(node);
    return idRaw != null ? idRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ID__GCNE} attribute of the given {@link Node} to the given <i>id</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #ID__GCNE} attribute.
   *     @param id
   *            The new value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>id</i> value is not supported.
   * 
   */
  public static void setId(final Node node, final String id) {
    setIdRaw(node, ID.fromValue(id));
  }
  
  /**
   * Returns the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #ID__GCNE} attribute.
   *     @return The (raw) value of the {@link #ID__GCNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getIdRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(ID__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #ID__GCNE} attribute of the given {@link Edge}
   * to the given <i>id</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #ID__GCNE} attribute.
   *     @param id
   *                The new (raw) value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>id</i> value is not supported.
   * 
   */
  public static void setIdRaw(final Edge edge, final ID id) {
    checkAttributeRawValue(Context.EDGE, ID__GCNE, id);edge.attributesProperty().put(ID__GCNE, id);
  }
  
  /**
   * Returns the value of the {@link #ID__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #ID__GCNE} attribute.
   *     @return The value of the {@link #ID__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getId(final Edge edge) {
    ID idRaw = getIdRaw(edge);
    return idRaw != null ? idRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #ID__GCNE} attribute of the given {@link Edge} to the given <i>id</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #ID__GCNE} attribute.
   *     @param id
   *            The new value of the {@link #ID__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>id</i> value is not supported.
   * 
   */
  public static void setId(final Edge edge, final String id) {
    setIdRaw(edge, ID.fromValue(id));
  }
  
  /**
   * Returns the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @return The (raw) value of the {@link #LABEL__GCNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getLabelRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(LABEL__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Graph}
   * to the given <i>label</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @param label
   *                The new (raw) value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabelRaw(final Graph graph, final ID label) {
    checkAttributeRawValue(Context.GRAPH, LABEL__GCNE, label);graph.attributesProperty().put(LABEL__GCNE, label);
  }
  
  /**
   * Returns the value of the {@link #LABEL__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #LABEL__GCNE} attribute.
   *     @return The value of the {@link #LABEL__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getLabel(final Graph graph) {
    ID labelRaw = getLabelRaw(graph);
    return labelRaw != null ? labelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LABEL__GCNE} attribute of the given {@link Graph} to the given <i>label</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #LABEL__GCNE} attribute.
   *     @param label
   *            The new value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabel(final Graph graph, final String label) {
    setLabelRaw(graph, ID.fromValue(label));
  }
  
  /**
   * Returns the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @return The (raw) value of the {@link #LABEL__GCNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getLabelRaw(final Node node) {
    return (ID) node.attributesProperty().get(LABEL__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Node}
   * to the given <i>label</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @param label
   *                The new (raw) value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabelRaw(final Node node, final ID label) {
    checkAttributeRawValue(Context.NODE, LABEL__GCNE, label);node.attributesProperty().put(LABEL__GCNE, label);
  }
  
  /**
   * Returns the value of the {@link #LABEL__GCNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #LABEL__GCNE} attribute.
   *     @return The value of the {@link #LABEL__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static String getLabel(final Node node) {
    ID labelRaw = getLabelRaw(node);
    return labelRaw != null ? labelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LABEL__GCNE} attribute of the given {@link Node} to the given <i>label</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #LABEL__GCNE} attribute.
   *     @param label
   *            The new value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabel(final Node node, final String label) {
    setLabelRaw(node, ID.fromValue(label));
  }
  
  /**
   * Returns the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @return The (raw) value of the {@link #LABEL__GCNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getLabelRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(LABEL__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #LABEL__GCNE} attribute of the given {@link Edge}
   * to the given <i>label</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #LABEL__GCNE} attribute.
   *     @param label
   *                The new (raw) value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabelRaw(final Edge edge, final ID label) {
    checkAttributeRawValue(Context.EDGE, LABEL__GCNE, label);edge.attributesProperty().put(LABEL__GCNE, label);
  }
  
  /**
   * Returns the value of the {@link #LABEL__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #LABEL__GCNE} attribute.
   *     @return The value of the {@link #LABEL__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getLabel(final Edge edge) {
    ID labelRaw = getLabelRaw(edge);
    return labelRaw != null ? labelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LABEL__GCNE} attribute of the given {@link Edge} to the given <i>label</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #LABEL__GCNE} attribute.
   *     @param label
   *            The new value of the {@link #LABEL__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>label</i> value is not supported.
   * 
   */
  public static void setLabel(final Edge edge, final String label) {
    setLabelRaw(edge, ID.fromValue(label));
  }
  
  /**
   * Returns the (raw) value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #LABELFONTCOLOR__E} attribute.
   *     @return The (raw) value of the {@link #LABELFONTCOLOR__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getLabelfontcolorRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(LABELFONTCOLOR__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}
   * to the given <i>labelfontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #LABELFONTCOLOR__E} attribute.
   *     @param labelfontcolor
   *                The new (raw) value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>labelfontcolor</i> value is not supported.
   * 
   */
  public static void setLabelfontcolorRaw(final Edge edge, final ID labelfontcolor) {
    checkAttributeRawValue(Context.EDGE, LABELFONTCOLOR__E, labelfontcolor);edge.attributesProperty().put(LABELFONTCOLOR__E, labelfontcolor);
  }
  
  /**
   * Returns the value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @return The value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getLabelfontcolor(final Edge edge) {
    ID labelfontcolorRaw = getLabelfontcolorRaw(edge);
    return labelfontcolorRaw != null ? labelfontcolorRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge} to the given <i>labelfontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @param labelfontcolor
   *            The new value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>labelfontcolor</i> value is not supported.
   * 
   */
  public static void setLabelfontcolor(final Edge edge, final String labelfontcolor) {
    setLabelfontcolorRaw(edge, ID.fromValue(labelfontcolor));
  }
  
  /**
   * Returns the (parsed) value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @return The (parsed) value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge}.
   * 
   */
  public static Color getLabelfontcolorParsed(final Edge edge) {
    return parseAttributeValue(COLOR_PARSER, getLabelfontcolor(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #LABELFONTCOLOR__E} attribute of the given {@link Edge} to the given <i>labelfontcolor</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @param labelfontcolor
   *                The new (parsed) value of the {@link #LABELFONTCOLOR__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>labelfontcolor</i> value is not supported.
   * 
   */
  public static void setLabelfontcolorParsed(final Edge edge, final Color labelfontcolor) {
    setLabelfontcolor(edge, serializeAttributeValue(COLOR_SERIALIZER, labelfontcolor));
  }
  
  /**
   * Returns the (raw) value of the {@link #LAYOUT__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #LAYOUT__G} attribute.
   *     @return The (raw) value of the {@link #LAYOUT__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getLayoutRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(LAYOUT__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #LAYOUT__G} attribute of the given {@link Graph}
   * to the given <i>layout</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #LAYOUT__G} attribute.
   *     @param layout
   *                The new (raw) value of the {@link #LAYOUT__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>layout</i> value is not supported.
   * 
   */
  public static void setLayoutRaw(final Graph graph, final ID layout) {
    checkAttributeRawValue(Context.GRAPH, LAYOUT__G, layout);graph.attributesProperty().put(LAYOUT__G, layout);
  }
  
  /**
   * Returns the value of the {@link #LAYOUT__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #LAYOUT__G} attribute.
   *     @return The value of the {@link #LAYOUT__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getLayout(final Graph graph) {
    ID layoutRaw = getLayoutRaw(graph);
    return layoutRaw != null ? layoutRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LAYOUT__G} attribute of the given {@link Graph} to the given <i>layout</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #LAYOUT__G} attribute.
   *     @param layout
   *            The new value of the {@link #LAYOUT__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>layout</i> value is not supported.
   * 
   */
  public static void setLayout(final Graph graph, final String layout) {
    setLayoutRaw(graph, ID.fromValue(layout, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #LAYOUT__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #LAYOUT__G} attribute.
   *     @return The (parsed) value of the {@link #LAYOUT__G} attribute of the given {@link Graph}.
   * 
   */
  public static Layout getLayoutParsed(final Graph graph) {
    return parseAttributeValue(LAYOUT_PARSER, getLayout(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #LAYOUT__G} attribute of the given {@link Graph} to the given <i>layout</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #LAYOUT__G} attribute.
   *     @param layout
   *                The new (parsed) value of the {@link #LAYOUT__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>layout</i> value is not supported.
   * 
   */
  public static void setLayoutParsed(final Graph graph, final Layout layout) {
    setLayout(graph, serializeAttributeValue(LAYOUT_SERIALIZER, layout));
  }
  
  /**
   * Returns the (raw) value of the {@link #LP__GCE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #LP__GCE} attribute.
   *     @return The (raw) value of the {@link #LP__GCE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getLpRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(LP__GCE);
  }
  
  /**
   * Sets the (raw) value of the {@link #LP__GCE} attribute of the given {@link Graph}
   * to the given <i>lp</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #LP__GCE} attribute.
   *     @param lp
   *                The new (raw) value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLpRaw(final Graph graph, final ID lp) {
    checkAttributeRawValue(Context.GRAPH, LP__GCE, lp);graph.attributesProperty().put(LP__GCE, lp);
  }
  
  /**
   * Returns the value of the {@link #LP__GCE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #LP__GCE} attribute.
   *     @return The value of the {@link #LP__GCE} attribute of the given {@link Graph}.
   * 
   */
  public static String getLp(final Graph graph) {
    ID lpRaw = getLpRaw(graph);
    return lpRaw != null ? lpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LP__GCE} attribute of the given {@link Graph} to the given <i>lp</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #LP__GCE} attribute.
   *     @param lp
   *            The new value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLp(final Graph graph, final String lp) {
    setLpRaw(graph, ID.fromValue(lp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #LP__GCE} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #LP__GCE} attribute.
   *     @return The (parsed) value of the {@link #LP__GCE} attribute of the given {@link Graph}.
   * 
   */
  public static Point getLpParsed(final Graph graph) {
    return parseAttributeValue(POINT_PARSER, getLp(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #LP__GCE} attribute of the given {@link Graph} to the given <i>lp</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #LP__GCE} attribute.
   *     @param lp
   *                The new (parsed) value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLpParsed(final Graph graph, final Point lp) {
    setLp(graph, serializeAttributeValue(POINT_SERIALIZER, lp));
  }
  
  /**
   * Returns the (raw) value of the {@link #LP__GCE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #LP__GCE} attribute.
   *     @return The (raw) value of the {@link #LP__GCE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getLpRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(LP__GCE);
  }
  
  /**
   * Sets the (raw) value of the {@link #LP__GCE} attribute of the given {@link Edge}
   * to the given <i>lp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #LP__GCE} attribute.
   *     @param lp
   *                The new (raw) value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLpRaw(final Edge edge, final ID lp) {
    checkAttributeRawValue(Context.EDGE, LP__GCE, lp);edge.attributesProperty().put(LP__GCE, lp);
  }
  
  /**
   * Returns the value of the {@link #LP__GCE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #LP__GCE} attribute.
   *     @return The value of the {@link #LP__GCE} attribute of the given {@link Edge}.
   * 
   */
  public static String getLp(final Edge edge) {
    ID lpRaw = getLpRaw(edge);
    return lpRaw != null ? lpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #LP__GCE} attribute of the given {@link Edge} to the given <i>lp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #LP__GCE} attribute.
   *     @param lp
   *            The new value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLp(final Edge edge, final String lp) {
    setLpRaw(edge, ID.fromValue(lp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #LP__GCE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #LP__GCE} attribute.
   *     @return The (parsed) value of the {@link #LP__GCE} attribute of the given {@link Edge}.
   * 
   */
  public static Point getLpParsed(final Edge edge) {
    return parseAttributeValue(POINT_PARSER, getLp(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #LP__GCE} attribute of the given {@link Edge} to the given <i>lp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #LP__GCE} attribute.
   *     @param lp
   *                The new (parsed) value of the {@link #LP__GCE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>lp</i> value is not supported.
   * 
   */
  public static void setLpParsed(final Edge edge, final Point lp) {
    setLp(edge, serializeAttributeValue(POINT_SERIALIZER, lp));
  }
  
  /**
   * Returns the (raw) value of the {@link #NODESEP__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #NODESEP__G} attribute.
   *     @return The (raw) value of the {@link #NODESEP__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getNodesepRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(NODESEP__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #NODESEP__G} attribute of the given {@link Graph}
   * to the given <i>nodesep</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #NODESEP__G} attribute.
   *     @param nodesep
   *                The new (raw) value of the {@link #NODESEP__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>nodesep</i> value is not supported.
   * 
   */
  public static void setNodesepRaw(final Graph graph, final ID nodesep) {
    checkAttributeRawValue(Context.GRAPH, NODESEP__G, nodesep);graph.attributesProperty().put(NODESEP__G, nodesep);
  }
  
  /**
   * Returns the value of the {@link #NODESEP__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #NODESEP__G} attribute.
   *     @return The value of the {@link #NODESEP__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getNodesep(final Graph graph) {
    ID nodesepRaw = getNodesepRaw(graph);
    return nodesepRaw != null ? nodesepRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #NODESEP__G} attribute of the given {@link Graph} to the given <i>nodesep</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #NODESEP__G} attribute.
   *     @param nodesep
   *            The new value of the {@link #NODESEP__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>nodesep</i> value is not supported.
   * 
   */
  public static void setNodesep(final Graph graph, final String nodesep) {
    setNodesepRaw(graph, ID.fromValue(nodesep, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #NODESEP__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #NODESEP__G} attribute.
   *     @return The (parsed) value of the {@link #NODESEP__G} attribute of the given {@link Graph}.
   * 
   */
  public static Double getNodesepParsed(final Graph graph) {
    return parseAttributeValue(DOUBLE_PARSER, getNodesep(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #NODESEP__G} attribute of the given {@link Graph} to the given <i>nodesep</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #NODESEP__G} attribute.
   *     @param nodesep
   *                The new (parsed) value of the {@link #NODESEP__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>nodesep</i> value is not supported.
   * 
   */
  public static void setNodesepParsed(final Graph graph, final Double nodesep) {
    setNodesep(graph, serializeAttributeValue(DOUBLE_SERIALIZER, nodesep));
  }
  
  /**
   * Returns the (raw) value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #OUTPUTORDER__G} attribute.
   *     @return The (raw) value of the {@link #OUTPUTORDER__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getOutputorderRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(OUTPUTORDER__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}
   * to the given <i>outputorder</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #OUTPUTORDER__G} attribute.
   *     @param outputorder
   *                The new (raw) value of the {@link #OUTPUTORDER__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>outputorder</i> value is not supported.
   * 
   */
  public static void setOutputorderRaw(final Graph graph, final ID outputorder) {
    checkAttributeRawValue(Context.GRAPH, OUTPUTORDER__G, outputorder);graph.attributesProperty().put(OUTPUTORDER__G, outputorder);
  }
  
  /**
   * Returns the value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #OUTPUTORDER__G} attribute.
   *     @return The value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getOutputorder(final Graph graph) {
    ID outputorderRaw = getOutputorderRaw(graph);
    return outputorderRaw != null ? outputorderRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph} to the given <i>outputorder</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #OUTPUTORDER__G} attribute.
   *     @param outputorder
   *            The new value of the {@link #OUTPUTORDER__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>outputorder</i> value is not supported.
   * 
   */
  public static void setOutputorder(final Graph graph, final String outputorder) {
    setOutputorderRaw(graph, ID.fromValue(outputorder, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #OUTPUTORDER__G} attribute.
   *     @return The (parsed) value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph}.
   * 
   */
  public static OutputMode getOutputorderParsed(final Graph graph) {
    return parseAttributeValue(OUTPUTMODE_PARSER, getOutputorder(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #OUTPUTORDER__G} attribute of the given {@link Graph} to the given <i>outputorder</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #OUTPUTORDER__G} attribute.
   *     @param outputorder
   *                The new (parsed) value of the {@link #OUTPUTORDER__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>outputorder</i> value is not supported.
   * 
   */
  public static void setOutputorderParsed(final Graph graph, final OutputMode outputorder) {
    setOutputorder(graph, serializeAttributeValue(OUTPUTMODE_SERIALIZER, outputorder));
  }
  
  /**
   * Returns the (raw) value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #PAGEDIR__G} attribute.
   *     @return The (raw) value of the {@link #PAGEDIR__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getPagedirRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(PAGEDIR__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}
   * to the given <i>pagedir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #PAGEDIR__G} attribute.
   *     @param pagedir
   *                The new (raw) value of the {@link #PAGEDIR__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pagedir</i> value is not supported.
   * 
   */
  public static void setPagedirRaw(final Graph graph, final ID pagedir) {
    checkAttributeRawValue(Context.GRAPH, PAGEDIR__G, pagedir);graph.attributesProperty().put(PAGEDIR__G, pagedir);
  }
  
  /**
   * Returns the value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #PAGEDIR__G} attribute.
   *     @return The value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getPagedir(final Graph graph) {
    ID pagedirRaw = getPagedirRaw(graph);
    return pagedirRaw != null ? pagedirRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #PAGEDIR__G} attribute of the given {@link Graph} to the given <i>pagedir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #PAGEDIR__G} attribute.
   *     @param pagedir
   *            The new value of the {@link #PAGEDIR__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>pagedir</i> value is not supported.
   * 
   */
  public static void setPagedir(final Graph graph, final String pagedir) {
    setPagedirRaw(graph, ID.fromValue(pagedir, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #PAGEDIR__G} attribute.
   *     @return The (parsed) value of the {@link #PAGEDIR__G} attribute of the given {@link Graph}.
   * 
   */
  public static Pagedir getPagedirParsed(final Graph graph) {
    return parseAttributeValue(PAGEDIR_PARSER, getPagedir(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #PAGEDIR__G} attribute of the given {@link Graph} to the given <i>pagedir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #PAGEDIR__G} attribute.
   *     @param pagedir
   *                The new (parsed) value of the {@link #PAGEDIR__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pagedir</i> value is not supported.
   * 
   */
  public static void setPagedirParsed(final Graph graph, final Pagedir pagedir) {
    setPagedir(graph, serializeAttributeValue(PAGEDIR_SERIALIZER, pagedir));
  }
  
  /**
   * Returns the (raw) value of the {@link #POS__NE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #POS__NE} attribute.
   *     @return The (raw) value of the {@link #POS__NE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getPosRaw(final Node node) {
    return (ID) node.attributesProperty().get(POS__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #POS__NE} attribute of the given {@link Node}
   * to the given <i>pos</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #POS__NE} attribute.
   *     @param pos
   *                The new (raw) value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPosRaw(final Node node, final ID pos) {
    checkAttributeRawValue(Context.NODE, POS__NE, pos);node.attributesProperty().put(POS__NE, pos);
  }
  
  /**
   * Returns the value of the {@link #POS__NE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #POS__NE} attribute.
   *     @return The value of the {@link #POS__NE} attribute of the given {@link Node}.
   * 
   */
  public static String getPos(final Node node) {
    ID posRaw = getPosRaw(node);
    return posRaw != null ? posRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #POS__NE} attribute of the given {@link Node} to the given <i>pos</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #POS__NE} attribute.
   *     @param pos
   *            The new value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPos(final Node node, final String pos) {
    setPosRaw(node, ID.fromValue(pos, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #POS__NE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #POS__NE} attribute.
   *     @return The (parsed) value of the {@link #POS__NE} attribute of the given {@link Node}.
   * 
   */
  public static Point getPosParsed(final Node node) {
    return parseAttributeValue(POINT_PARSER, getPos(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #POS__NE} attribute of the given {@link Node} to the given <i>pos</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #POS__NE} attribute.
   *     @param pos
   *                The new (parsed) value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPosParsed(final Node node, final Point pos) {
    setPos(node, serializeAttributeValue(POINT_SERIALIZER, pos));
  }
  
  /**
   * Returns the (raw) value of the {@link #POS__NE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #POS__NE} attribute.
   *     @return The (raw) value of the {@link #POS__NE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getPosRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(POS__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #POS__NE} attribute of the given {@link Edge}
   * to the given <i>pos</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #POS__NE} attribute.
   *     @param pos
   *                The new (raw) value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPosRaw(final Edge edge, final ID pos) {
    checkAttributeRawValue(Context.EDGE, POS__NE, pos);edge.attributesProperty().put(POS__NE, pos);
  }
  
  /**
   * Returns the value of the {@link #POS__NE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #POS__NE} attribute.
   *     @return The value of the {@link #POS__NE} attribute of the given {@link Edge}.
   * 
   */
  public static String getPos(final Edge edge) {
    ID posRaw = getPosRaw(edge);
    return posRaw != null ? posRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #POS__NE} attribute of the given {@link Edge} to the given <i>pos</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #POS__NE} attribute.
   *     @param pos
   *            The new value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPos(final Edge edge, final String pos) {
    setPosRaw(edge, ID.fromValue(pos, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #POS__NE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #POS__NE} attribute.
   *     @return The (parsed) value of the {@link #POS__NE} attribute of the given {@link Edge}.
   * 
   */
  public static SplineType getPosParsed(final Edge edge) {
    return parseAttributeValue(SPLINETYPE_PARSER, getPos(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #POS__NE} attribute of the given {@link Edge} to the given <i>pos</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #POS__NE} attribute.
   *     @param pos
   *                The new (parsed) value of the {@link #POS__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>pos</i> value is not supported.
   * 
   */
  public static void setPosParsed(final Edge edge, final SplineType pos) {
    setPos(edge, serializeAttributeValue(SPLINETYPE_SERIALIZER, pos));
  }
  
  /**
   * Returns the (raw) value of the {@link #RANK__S} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #RANK__S} attribute.
   *     @return The (raw) value of the {@link #RANK__S} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getRankRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(RANK__S);
  }
  
  /**
   * Sets the (raw) value of the {@link #RANK__S} attribute of the given {@link Graph}
   * to the given <i>rank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #RANK__S} attribute.
   *     @param rank
   *                The new (raw) value of the {@link #RANK__S} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>rank</i> value is not supported.
   * 
   */
  public static void setRankRaw(final Graph graph, final ID rank) {
    checkAttributeRawValue(Context.GRAPH, RANK__S, rank);graph.attributesProperty().put(RANK__S, rank);
  }
  
  /**
   * Returns the value of the {@link #RANK__S} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #RANK__S} attribute.
   *     @return The value of the {@link #RANK__S} attribute of the given {@link Graph}.
   * 
   */
  public static String getRank(final Graph graph) {
    ID rankRaw = getRankRaw(graph);
    return rankRaw != null ? rankRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #RANK__S} attribute of the given {@link Graph} to the given <i>rank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #RANK__S} attribute.
   *     @param rank
   *            The new value of the {@link #RANK__S} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>rank</i> value is not supported.
   * 
   */
  public static void setRank(final Graph graph, final String rank) {
    setRankRaw(graph, ID.fromValue(rank, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #RANK__S} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #RANK__S} attribute.
   *     @return The (parsed) value of the {@link #RANK__S} attribute of the given {@link Graph}.
   * 
   */
  public static RankType getRankParsed(final Graph graph) {
    return parseAttributeValue(RANKTYPE_PARSER, getRank(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #RANK__S} attribute of the given {@link Graph} to the given <i>rank</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #RANK__S} attribute.
   *     @param rank
   *                The new (parsed) value of the {@link #RANK__S} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>rank</i> value is not supported.
   * 
   */
  public static void setRankParsed(final Graph graph, final RankType rank) {
    setRank(graph, serializeAttributeValue(RANKTYPE_SERIALIZER, rank));
  }
  
  /**
   * Returns the (raw) value of the {@link #RANKDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #RANKDIR__G} attribute.
   *     @return The (raw) value of the {@link #RANKDIR__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getRankdirRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(RANKDIR__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #RANKDIR__G} attribute of the given {@link Graph}
   * to the given <i>rankdir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #RANKDIR__G} attribute.
   *     @param rankdir
   *                The new (raw) value of the {@link #RANKDIR__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>rankdir</i> value is not supported.
   * 
   */
  public static void setRankdirRaw(final Graph graph, final ID rankdir) {
    checkAttributeRawValue(Context.GRAPH, RANKDIR__G, rankdir);graph.attributesProperty().put(RANKDIR__G, rankdir);
  }
  
  /**
   * Returns the value of the {@link #RANKDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #RANKDIR__G} attribute.
   *     @return The value of the {@link #RANKDIR__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getRankdir(final Graph graph) {
    ID rankdirRaw = getRankdirRaw(graph);
    return rankdirRaw != null ? rankdirRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #RANKDIR__G} attribute of the given {@link Graph} to the given <i>rankdir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #RANKDIR__G} attribute.
   *     @param rankdir
   *            The new value of the {@link #RANKDIR__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>rankdir</i> value is not supported.
   * 
   */
  public static void setRankdir(final Graph graph, final String rankdir) {
    setRankdirRaw(graph, ID.fromValue(rankdir, org.eclipse.gef.dot.internal.language.terminals.ID.Type.STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #RANKDIR__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #RANKDIR__G} attribute.
   *     @return The (parsed) value of the {@link #RANKDIR__G} attribute of the given {@link Graph}.
   * 
   */
  public static Rankdir getRankdirParsed(final Graph graph) {
    return parseAttributeValue(RANKDIR_PARSER, getRankdir(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #RANKDIR__G} attribute of the given {@link Graph} to the given <i>rankdir</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #RANKDIR__G} attribute.
   *     @param rankdir
   *                The new (parsed) value of the {@link #RANKDIR__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>rankdir</i> value is not supported.
   * 
   */
  public static void setRankdirParsed(final Graph graph, final Rankdir rankdir) {
    setRankdir(graph, serializeAttributeValue(RANKDIR_SERIALIZER, rankdir));
  }
  
  /**
   * Returns the (raw) value of the {@link #SHAPE__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #SHAPE__N} attribute.
   *     @return The (raw) value of the {@link #SHAPE__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getShapeRaw(final Node node) {
    return (ID) node.attributesProperty().get(SHAPE__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #SHAPE__N} attribute of the given {@link Node}
   * to the given <i>shape</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #SHAPE__N} attribute.
   *     @param shape
   *                The new (raw) value of the {@link #SHAPE__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>shape</i> value is not supported.
   * 
   */
  public static void setShapeRaw(final Node node, final ID shape) {
    checkAttributeRawValue(Context.NODE, SHAPE__N, shape);node.attributesProperty().put(SHAPE__N, shape);
  }
  
  /**
   * Returns the value of the {@link #SHAPE__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #SHAPE__N} attribute.
   *     @return The value of the {@link #SHAPE__N} attribute of the given {@link Node}.
   * 
   */
  public static String getShape(final Node node) {
    ID shapeRaw = getShapeRaw(node);
    return shapeRaw != null ? shapeRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #SHAPE__N} attribute of the given {@link Node} to the given <i>shape</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SHAPE__N} attribute.
   *     @param shape
   *            The new value of the {@link #SHAPE__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>shape</i> value is not supported.
   * 
   */
  public static void setShape(final Node node, final String shape) {
    setShapeRaw(node, ID.fromValue(shape));
  }
  
  /**
   * Returns the (parsed) value of the {@link #SHAPE__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #SHAPE__N} attribute.
   *     @return The (parsed) value of the {@link #SHAPE__N} attribute of the given {@link Node}.
   * 
   */
  public static Shape getShapeParsed(final Node node) {
    return parseAttributeValue(SHAPE_PARSER, getShape(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #SHAPE__N} attribute of the given {@link Node} to the given <i>shape</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SHAPE__N} attribute.
   *     @param shape
   *                The new (parsed) value of the {@link #SHAPE__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>shape</i> value is not supported.
   * 
   */
  public static void setShapeParsed(final Node node, final Shape shape) {
    setShape(node, serializeAttributeValue(SHAPE_SERIALIZER, shape));
  }
  
  /**
   * Returns the (raw) value of the {@link #SIDES__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #SIDES__N} attribute.
   *     @return The (raw) value of the {@link #SIDES__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getSidesRaw(final Node node) {
    return (ID) node.attributesProperty().get(SIDES__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #SIDES__N} attribute of the given {@link Node}
   * to the given <i>sides</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #SIDES__N} attribute.
   *     @param sides
   *                The new (raw) value of the {@link #SIDES__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>sides</i> value is not supported.
   * 
   */
  public static void setSidesRaw(final Node node, final ID sides) {
    checkAttributeRawValue(Context.NODE, SIDES__N, sides);node.attributesProperty().put(SIDES__N, sides);
  }
  
  /**
   * Returns the value of the {@link #SIDES__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #SIDES__N} attribute.
   *     @return The value of the {@link #SIDES__N} attribute of the given {@link Node}.
   * 
   */
  public static String getSides(final Node node) {
    ID sidesRaw = getSidesRaw(node);
    return sidesRaw != null ? sidesRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #SIDES__N} attribute of the given {@link Node} to the given <i>sides</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SIDES__N} attribute.
   *     @param sides
   *            The new value of the {@link #SIDES__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>sides</i> value is not supported.
   * 
   */
  public static void setSides(final Node node, final String sides) {
    setSidesRaw(node, ID.fromValue(sides, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #SIDES__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #SIDES__N} attribute.
   *     @return The (parsed) value of the {@link #SIDES__N} attribute of the given {@link Node}.
   * 
   */
  public static Integer getSidesParsed(final Node node) {
    return parseAttributeValue(INT_PARSER, getSides(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #SIDES__N} attribute of the given {@link Node} to the given <i>sides</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SIDES__N} attribute.
   *     @param sides
   *                The new (parsed) value of the {@link #SIDES__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>sides</i> value is not supported.
   * 
   */
  public static void setSidesParsed(final Node node, final Integer sides) {
    setSides(node, serializeAttributeValue(INT_SERIALIZER, sides));
  }
  
  /**
   * Returns the (raw) value of the {@link #SKEW__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #SKEW__N} attribute.
   *     @return The (raw) value of the {@link #SKEW__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getSkewRaw(final Node node) {
    return (ID) node.attributesProperty().get(SKEW__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #SKEW__N} attribute of the given {@link Node}
   * to the given <i>skew</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #SKEW__N} attribute.
   *     @param skew
   *                The new (raw) value of the {@link #SKEW__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>skew</i> value is not supported.
   * 
   */
  public static void setSkewRaw(final Node node, final ID skew) {
    checkAttributeRawValue(Context.NODE, SKEW__N, skew);node.attributesProperty().put(SKEW__N, skew);
  }
  
  /**
   * Returns the value of the {@link #SKEW__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #SKEW__N} attribute.
   *     @return The value of the {@link #SKEW__N} attribute of the given {@link Node}.
   * 
   */
  public static String getSkew(final Node node) {
    ID skewRaw = getSkewRaw(node);
    return skewRaw != null ? skewRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #SKEW__N} attribute of the given {@link Node} to the given <i>skew</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SKEW__N} attribute.
   *     @param skew
   *            The new value of the {@link #SKEW__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>skew</i> value is not supported.
   * 
   */
  public static void setSkew(final Node node, final String skew) {
    setSkewRaw(node, ID.fromValue(skew, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #SKEW__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #SKEW__N} attribute.
   *     @return The (parsed) value of the {@link #SKEW__N} attribute of the given {@link Node}.
   * 
   */
  public static Double getSkewParsed(final Node node) {
    return parseAttributeValue(DOUBLE_PARSER, getSkew(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #SKEW__N} attribute of the given {@link Node} to the given <i>skew</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #SKEW__N} attribute.
   *     @param skew
   *                The new (parsed) value of the {@link #SKEW__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>skew</i> value is not supported.
   * 
   */
  public static void setSkewParsed(final Node node, final Double skew) {
    setSkew(node, serializeAttributeValue(DOUBLE_SERIALIZER, skew));
  }
  
  /**
   * Returns the (raw) value of the {@link #SPLINES__G} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #SPLINES__G} attribute.
   *     @return The (raw) value of the {@link #SPLINES__G} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getSplinesRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(SPLINES__G);
  }
  
  /**
   * Sets the (raw) value of the {@link #SPLINES__G} attribute of the given {@link Graph}
   * to the given <i>splines</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #SPLINES__G} attribute.
   *     @param splines
   *                The new (raw) value of the {@link #SPLINES__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>splines</i> value is not supported.
   * 
   */
  public static void setSplinesRaw(final Graph graph, final ID splines) {
    checkAttributeRawValue(Context.GRAPH, SPLINES__G, splines);graph.attributesProperty().put(SPLINES__G, splines);
  }
  
  /**
   * Returns the value of the {@link #SPLINES__G} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #SPLINES__G} attribute.
   *     @return The value of the {@link #SPLINES__G} attribute of the given {@link Graph}.
   * 
   */
  public static String getSplines(final Graph graph) {
    ID splinesRaw = getSplinesRaw(graph);
    return splinesRaw != null ? splinesRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #SPLINES__G} attribute of the given {@link Graph} to the given <i>splines</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #SPLINES__G} attribute.
   *     @param splines
   *            The new value of the {@link #SPLINES__G} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>splines</i> value is not supported.
   * 
   */
  public static void setSplines(final Graph graph, final String splines) {
    setSplinesRaw(graph, ID.fromValue(splines, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #SPLINES__G} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #SPLINES__G} attribute.
   *     @return The (parsed) value of the {@link #SPLINES__G} attribute of the given {@link Graph}.
   * 
   */
  public static Splines getSplinesParsed(final Graph graph) {
    return parseAttributeValue(SPLINES_PARSER, getSplines(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #SPLINES__G} attribute of the given {@link Graph} to the given <i>splines</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #SPLINES__G} attribute.
   *     @param splines
   *                The new (parsed) value of the {@link #SPLINES__G} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>splines</i> value is not supported.
   * 
   */
  public static void setSplinesParsed(final Graph graph, final Splines splines) {
    setSplines(graph, serializeAttributeValue(SPLINES_SERIALIZER, splines));
  }
  
  /**
   * Returns the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                The {@link Graph} for which to return the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @return The (raw) value of the {@link #STYLE__GCNE} attribute of the given
   *             {@link Graph}.
   * 
   */
  public static ID getStyleRaw(final Graph graph) {
    return (ID) graph.attributesProperty().get(STYLE__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}
   * to the given <i>style</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (raw) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleRaw(final Graph graph, final ID style) {
    checkAttributeRawValue(Context.GRAPH, STYLE__GCNE, style);graph.attributesProperty().put(STYLE__GCNE, style);
  }
  
  /**
   * Returns the value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *            The {@link Graph} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static String getStyle(final Graph graph) {
    ID styleRaw = getStyleRaw(graph);
    return styleRaw != null ? styleRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #STYLE__GCNE} attribute of the given {@link Graph} to the given <i>style</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *            The new value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyle(final Graph graph, final String style) {
    setStyleRaw(graph, ID.fromValue(style));
  }
  
  /**
   * Returns the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}.
   *     @param graph
   *                 The {@link Graph} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Graph}.
   * 
   */
  public static Style getStyleParsed(final Graph graph) {
    return parseAttributeValue(STYLE_PARSER, getStyle(graph));
  }
  
  /**
   * Sets the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Graph} to the given <i>style</i> value.
   *     @param graph
   *                The {@link Graph} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (parsed) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleParsed(final Graph graph, final Style style) {
    setStyle(graph, serializeAttributeValue(STYLE_SERIALIZER, style));
  }
  
  /**
   * Returns the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @return The (raw) value of the {@link #STYLE__GCNE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getStyleRaw(final Node node) {
    return (ID) node.attributesProperty().get(STYLE__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Node}
   * to the given <i>style</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (raw) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleRaw(final Node node, final ID style) {
    checkAttributeRawValue(Context.NODE, STYLE__GCNE, style);node.attributesProperty().put(STYLE__GCNE, style);
  }
  
  /**
   * Returns the value of the {@link #STYLE__GCNE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The value of the {@link #STYLE__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static String getStyle(final Node node) {
    ID styleRaw = getStyleRaw(node);
    return styleRaw != null ? styleRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #STYLE__GCNE} attribute of the given {@link Node} to the given <i>style</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *            The new value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyle(final Node node, final String style) {
    setStyleRaw(node, ID.fromValue(style));
  }
  
  /**
   * Returns the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Node}.
   * 
   */
  public static Style getStyleParsed(final Node node) {
    return parseAttributeValue(STYLE_PARSER, getStyle(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Node} to the given <i>style</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (parsed) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleParsed(final Node node, final Style style) {
    setStyle(node, serializeAttributeValue(STYLE_SERIALIZER, style));
  }
  
  /**
   * Returns the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @return The (raw) value of the {@link #STYLE__GCNE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getStyleRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(STYLE__GCNE);
  }
  
  /**
   * Sets the (raw) value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}
   * to the given <i>style</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (raw) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleRaw(final Edge edge, final ID style) {
    checkAttributeRawValue(Context.EDGE, STYLE__GCNE, style);edge.attributesProperty().put(STYLE__GCNE, style);
  }
  
  /**
   * Returns the value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static String getStyle(final Edge edge) {
    ID styleRaw = getStyleRaw(edge);
    return styleRaw != null ? styleRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #STYLE__GCNE} attribute of the given {@link Edge} to the given <i>style</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *            The new value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyle(final Edge edge, final String style) {
    setStyleRaw(edge, ID.fromValue(style));
  }
  
  /**
   * Returns the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #STYLE__GCNE} attribute.
   *     @return The (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Edge}.
   * 
   */
  public static Style getStyleParsed(final Edge edge) {
    return parseAttributeValue(STYLE_PARSER, getStyle(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #STYLE__GCNE} attribute of the given {@link Edge} to the given <i>style</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #STYLE__GCNE} attribute.
   *     @param style
   *                The new (parsed) value of the {@link #STYLE__GCNE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>style</i> value is not supported.
   * 
   */
  public static void setStyleParsed(final Edge edge, final Style style) {
    setStyle(edge, serializeAttributeValue(STYLE_SERIALIZER, style));
  }
  
  /**
   * Returns the (raw) value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #TAIL_LP__E} attribute.
   *     @return The (raw) value of the {@link #TAIL_LP__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getTailLpRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(TAIL_LP__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}
   * to the given <i>tailLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #TAIL_LP__E} attribute.
   *     @param tailLp
   *                The new (raw) value of the {@link #TAIL_LP__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>tailLp</i> value is not supported.
   * 
   */
  public static void setTailLpRaw(final Edge edge, final ID tailLp) {
    checkAttributeRawValue(Context.EDGE, TAIL_LP__E, tailLp);edge.attributesProperty().put(TAIL_LP__E, tailLp);
  }
  
  /**
   * Returns the value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #TAIL_LP__E} attribute.
   *     @return The value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getTailLp(final Edge edge) {
    ID tailLpRaw = getTailLpRaw(edge);
    return tailLpRaw != null ? tailLpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #TAIL_LP__E} attribute of the given {@link Edge} to the given <i>tailLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #TAIL_LP__E} attribute.
   *     @param tailLp
   *            The new value of the {@link #TAIL_LP__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>tailLp</i> value is not supported.
   * 
   */
  public static void setTailLp(final Edge edge, final String tailLp) {
    setTailLpRaw(edge, ID.fromValue(tailLp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #TAIL_LP__E} attribute.
   *     @return The (parsed) value of the {@link #TAIL_LP__E} attribute of the given {@link Edge}.
   * 
   */
  public static Point getTailLpParsed(final Edge edge) {
    return parseAttributeValue(POINT_PARSER, getTailLp(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #TAIL_LP__E} attribute of the given {@link Edge} to the given <i>tailLp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #TAIL_LP__E} attribute.
   *     @param tailLp
   *                The new (parsed) value of the {@link #TAIL_LP__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>tailLp</i> value is not supported.
   * 
   */
  public static void setTailLpParsed(final Edge edge, final Point tailLp) {
    setTailLp(edge, serializeAttributeValue(POINT_SERIALIZER, tailLp));
  }
  
  /**
   * Returns the (raw) value of the {@link #TAILLABEL__E} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #TAILLABEL__E} attribute.
   *     @return The (raw) value of the {@link #TAILLABEL__E} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getTaillabelRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(TAILLABEL__E);
  }
  
  /**
   * Sets the (raw) value of the {@link #TAILLABEL__E} attribute of the given {@link Edge}
   * to the given <i>taillabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #TAILLABEL__E} attribute.
   *     @param taillabel
   *                The new (raw) value of the {@link #TAILLABEL__E} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>taillabel</i> value is not supported.
   * 
   */
  public static void setTaillabelRaw(final Edge edge, final ID taillabel) {
    checkAttributeRawValue(Context.EDGE, TAILLABEL__E, taillabel);edge.attributesProperty().put(TAILLABEL__E, taillabel);
  }
  
  /**
   * Returns the value of the {@link #TAILLABEL__E} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #TAILLABEL__E} attribute.
   *     @return The value of the {@link #TAILLABEL__E} attribute of the given {@link Edge}.
   * 
   */
  public static String getTaillabel(final Edge edge) {
    ID taillabelRaw = getTaillabelRaw(edge);
    return taillabelRaw != null ? taillabelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #TAILLABEL__E} attribute of the given {@link Edge} to the given <i>taillabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #TAILLABEL__E} attribute.
   *     @param taillabel
   *            The new value of the {@link #TAILLABEL__E} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>taillabel</i> value is not supported.
   * 
   */
  public static void setTaillabel(final Edge edge, final String taillabel) {
    setTaillabelRaw(edge, ID.fromValue(taillabel));
  }
  
  /**
   * Returns the (raw) value of the {@link #WIDTH__N} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #WIDTH__N} attribute.
   *     @return The (raw) value of the {@link #WIDTH__N} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getWidthRaw(final Node node) {
    return (ID) node.attributesProperty().get(WIDTH__N);
  }
  
  /**
   * Sets the (raw) value of the {@link #WIDTH__N} attribute of the given {@link Node}
   * to the given <i>width</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #WIDTH__N} attribute.
   *     @param width
   *                The new (raw) value of the {@link #WIDTH__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>width</i> value is not supported.
   * 
   */
  public static void setWidthRaw(final Node node, final ID width) {
    checkAttributeRawValue(Context.NODE, WIDTH__N, width);node.attributesProperty().put(WIDTH__N, width);
  }
  
  /**
   * Returns the value of the {@link #WIDTH__N} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #WIDTH__N} attribute.
   *     @return The value of the {@link #WIDTH__N} attribute of the given {@link Node}.
   * 
   */
  public static String getWidth(final Node node) {
    ID widthRaw = getWidthRaw(node);
    return widthRaw != null ? widthRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #WIDTH__N} attribute of the given {@link Node} to the given <i>width</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #WIDTH__N} attribute.
   *     @param width
   *            The new value of the {@link #WIDTH__N} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>width</i> value is not supported.
   * 
   */
  public static void setWidth(final Node node, final String width) {
    setWidthRaw(node, ID.fromValue(width, org.eclipse.gef.dot.internal.language.terminals.ID.Type.NUMERAL));
  }
  
  /**
   * Returns the (parsed) value of the {@link #WIDTH__N} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #WIDTH__N} attribute.
   *     @return The (parsed) value of the {@link #WIDTH__N} attribute of the given {@link Node}.
   * 
   */
  public static Double getWidthParsed(final Node node) {
    return parseAttributeValue(DOUBLE_PARSER, getWidth(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #WIDTH__N} attribute of the given {@link Node} to the given <i>width</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #WIDTH__N} attribute.
   *     @param width
   *                The new (parsed) value of the {@link #WIDTH__N} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>width</i> value is not supported.
   * 
   */
  public static void setWidthParsed(final Node node, final Double width) {
    setWidth(node, serializeAttributeValue(DOUBLE_SERIALIZER, width));
  }
  
  /**
   * Returns the (raw) value of the {@link #XLABEL__NE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #XLABEL__NE} attribute.
   *     @return The (raw) value of the {@link #XLABEL__NE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getXlabelRaw(final Node node) {
    return (ID) node.attributesProperty().get(XLABEL__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #XLABEL__NE} attribute of the given {@link Node}
   * to the given <i>xlabel</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #XLABEL__NE} attribute.
   *     @param xlabel
   *                The new (raw) value of the {@link #XLABEL__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlabel</i> value is not supported.
   * 
   */
  public static void setXlabelRaw(final Node node, final ID xlabel) {
    checkAttributeRawValue(Context.NODE, XLABEL__NE, xlabel);node.attributesProperty().put(XLABEL__NE, xlabel);
  }
  
  /**
   * Returns the value of the {@link #XLABEL__NE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #XLABEL__NE} attribute.
   *     @return The value of the {@link #XLABEL__NE} attribute of the given {@link Node}.
   * 
   */
  public static String getXlabel(final Node node) {
    ID xlabelRaw = getXlabelRaw(node);
    return xlabelRaw != null ? xlabelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #XLABEL__NE} attribute of the given {@link Node} to the given <i>xlabel</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #XLABEL__NE} attribute.
   *     @param xlabel
   *            The new value of the {@link #XLABEL__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>xlabel</i> value is not supported.
   * 
   */
  public static void setXlabel(final Node node, final String xlabel) {
    setXlabelRaw(node, ID.fromValue(xlabel));
  }
  
  /**
   * Returns the (raw) value of the {@link #XLABEL__NE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #XLABEL__NE} attribute.
   *     @return The (raw) value of the {@link #XLABEL__NE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getXlabelRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(XLABEL__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #XLABEL__NE} attribute of the given {@link Edge}
   * to the given <i>xlabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #XLABEL__NE} attribute.
   *     @param xlabel
   *                The new (raw) value of the {@link #XLABEL__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlabel</i> value is not supported.
   * 
   */
  public static void setXlabelRaw(final Edge edge, final ID xlabel) {
    checkAttributeRawValue(Context.EDGE, XLABEL__NE, xlabel);edge.attributesProperty().put(XLABEL__NE, xlabel);
  }
  
  /**
   * Returns the value of the {@link #XLABEL__NE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #XLABEL__NE} attribute.
   *     @return The value of the {@link #XLABEL__NE} attribute of the given {@link Edge}.
   * 
   */
  public static String getXlabel(final Edge edge) {
    ID xlabelRaw = getXlabelRaw(edge);
    return xlabelRaw != null ? xlabelRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #XLABEL__NE} attribute of the given {@link Edge} to the given <i>xlabel</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #XLABEL__NE} attribute.
   *     @param xlabel
   *            The new value of the {@link #XLABEL__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>xlabel</i> value is not supported.
   * 
   */
  public static void setXlabel(final Edge edge, final String xlabel) {
    setXlabelRaw(edge, ID.fromValue(xlabel));
  }
  
  /**
   * Returns the (raw) value of the {@link #XLP__NE} attribute of the given {@link Node}.
   *     @param node
   *                The {@link Node} for which to return the value of the
   *                {@link #XLP__NE} attribute.
   *     @return The (raw) value of the {@link #XLP__NE} attribute of the given
   *             {@link Node}.
   * 
   */
  public static ID getXlpRaw(final Node node) {
    return (ID) node.attributesProperty().get(XLP__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #XLP__NE} attribute of the given {@link Node}
   * to the given <i>xlp</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the
   *                {@link #XLP__NE} attribute.
   *     @param xlp
   *                The new (raw) value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlpRaw(final Node node, final ID xlp) {
    checkAttributeRawValue(Context.NODE, XLP__NE, xlp);node.attributesProperty().put(XLP__NE, xlp);
  }
  
  /**
   * Returns the value of the {@link #XLP__NE} attribute of the given {@link Node}.
   *     @param node
   *            The {@link Node} for which to return the value of the {@link #XLP__NE} attribute.
   *     @return The value of the {@link #XLP__NE} attribute of the given {@link Node}.
   * 
   */
  public static String getXlp(final Node node) {
    ID xlpRaw = getXlpRaw(node);
    return xlpRaw != null ? xlpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #XLP__NE} attribute of the given {@link Node} to the given <i>xlp</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #XLP__NE} attribute.
   *     @param xlp
   *            The new value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlp(final Node node, final String xlp) {
    setXlpRaw(node, ID.fromValue(xlp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #XLP__NE} attribute of the given {@link Node}.
   *     @param node
   *                 The {@link Node} for which to return the value of the {@link #XLP__NE} attribute.
   *     @return The (parsed) value of the {@link #XLP__NE} attribute of the given {@link Node}.
   * 
   */
  public static Point getXlpParsed(final Node node) {
    return parseAttributeValue(POINT_PARSER, getXlp(node));
  }
  
  /**
   * Sets the (parsed) value of the {@link #XLP__NE} attribute of the given {@link Node} to the given <i>xlp</i> value.
   *     @param node
   *                The {@link Node} for which to change the value of the {@link #XLP__NE} attribute.
   *     @param xlp
   *                The new (parsed) value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlpParsed(final Node node, final Point xlp) {
    setXlp(node, serializeAttributeValue(POINT_SERIALIZER, xlp));
  }
  
  /**
   * Returns the (raw) value of the {@link #XLP__NE} attribute of the given {@link Edge}.
   *     @param edge
   *                The {@link Edge} for which to return the value of the
   *                {@link #XLP__NE} attribute.
   *     @return The (raw) value of the {@link #XLP__NE} attribute of the given
   *             {@link Edge}.
   * 
   */
  public static ID getXlpRaw(final Edge edge) {
    return (ID) edge.attributesProperty().get(XLP__NE);
  }
  
  /**
   * Sets the (raw) value of the {@link #XLP__NE} attribute of the given {@link Edge}
   * to the given <i>xlp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the
   *                {@link #XLP__NE} attribute.
   *     @param xlp
   *                The new (raw) value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlpRaw(final Edge edge, final ID xlp) {
    checkAttributeRawValue(Context.EDGE, XLP__NE, xlp);edge.attributesProperty().put(XLP__NE, xlp);
  }
  
  /**
   * Returns the value of the {@link #XLP__NE} attribute of the given {@link Edge}.
   *     @param edge
   *            The {@link Edge} for which to return the value of the {@link #XLP__NE} attribute.
   *     @return The value of the {@link #XLP__NE} attribute of the given {@link Edge}.
   * 
   */
  public static String getXlp(final Edge edge) {
    ID xlpRaw = getXlpRaw(edge);
    return xlpRaw != null ? xlpRaw.toValue() : null;
  }
  
  /**
   * Sets the value of the {@link #XLP__NE} attribute of the given {@link Edge} to the given <i>xlp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #XLP__NE} attribute.
   *     @param xlp
   *            The new value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *            when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlp(final Edge edge, final String xlp) {
    setXlpRaw(edge, ID.fromValue(xlp, org.eclipse.gef.dot.internal.language.terminals.ID.Type.QUOTED_STRING));
  }
  
  /**
   * Returns the (parsed) value of the {@link #XLP__NE} attribute of the given {@link Edge}.
   *     @param edge
   *                 The {@link Edge} for which to return the value of the {@link #XLP__NE} attribute.
   *     @return The (parsed) value of the {@link #XLP__NE} attribute of the given {@link Edge}.
   * 
   */
  public static Point getXlpParsed(final Edge edge) {
    return parseAttributeValue(POINT_PARSER, getXlp(edge));
  }
  
  /**
   * Sets the (parsed) value of the {@link #XLP__NE} attribute of the given {@link Edge} to the given <i>xlp</i> value.
   *     @param edge
   *                The {@link Edge} for which to change the value of the {@link #XLP__NE} attribute.
   *     @param xlp
   *                The new (parsed) value of the {@link #XLP__NE} attribute.
   *     @throws IllegalArgumentException
   *                when the given <i>xlp</i> value is not supported.
   * 
   */
  public static void setXlpParsed(final Edge edge, final Point xlp) {
    setXlp(edge, serializeAttributeValue(POINT_SERIALIZER, xlp));
  }
}
