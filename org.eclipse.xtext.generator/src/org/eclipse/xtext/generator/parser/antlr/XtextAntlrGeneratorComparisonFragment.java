/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.generator.parser.antlr;

import com.google.common.base.Charsets;
import com.google.common.base.Objects;
import com.google.common.io.Files;
import com.google.inject.Inject;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.Generator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.Naming;
import org.eclipse.xtext.generator.adapter.FragmentAdapter;
import org.eclipse.xtext.generator.parser.antlr.AntlrGrammarComparator;
import org.eclipse.xtext.generator.parser.antlr.AntlrOptions;
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment;
import org.eclipse.xtext.generator.parser.antlr.XtextAntlrUiGeneratorFragment;
import org.eclipse.xtext.generator.parser.antlr.ex.ca.ContentAssistParserGeneratorFragment;
import org.eclipse.xtext.generator.parser.antlr.ex.common.AntlrFragmentHelper;
import org.eclipse.xtext.generator.parser.antlr.ex.rt.AntlrGeneratorFragment;
import org.eclipse.xtext.util.StopWatch;
import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xtext.FlattenedGrammarAccess;
import org.eclipse.xtext.xtext.RuleFilter;
import org.eclipse.xtext.xtext.RuleNames;
import org.eclipse.xtext.xtext.generator.Issues;
import org.eclipse.xtext.xtext.generator.model.IXtextGeneratorFileSystemAccess;
import org.eclipse.xtext.xtext.generator.model.project.IBundleProjectConfig;
import org.eclipse.xtext.xtext.generator.model.project.IRuntimeProjectConfig;
import org.eclipse.xtext.xtext.generator.parser.antlr.CombinedGrammarMarker;
import org.eclipse.xtext.xtext.generator.parser.antlr.ContentAssistGrammarNaming;
import org.eclipse.xtext.xtext.generator.parser.antlr.GrammarNaming;

/**
 * Compares the ANTLR grammar generated by {@link
 * org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
 * XtextAntlrGeneratorFragment2} with that of {@link XtextAntlrGeneratorFragment}
 * by running its grammar generation in a temporary folder and calling {@link
 * GrammarComparator} to compare them.
 * 
 * @author Christian Schneider - Initial contribution and API
 * @noreference
 */
@Log
@SuppressWarnings("all")
public class XtextAntlrGeneratorComparisonFragment extends FragmentAdapter {
  public static class ErrorHandler implements AntlrGrammarComparator.IErrorHandler {
    @Override
    public void handleInvalidGeneratedGrammarFile(final AntlrGrammarComparator.ErrorContext context) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Noticed an unexpectect character sequence in reference grammar after token ");
      String _previousToken = context.getTestedGrammar().getPreviousToken();
      _builder.append(_previousToken);
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("and before token ");
      String _currentToken = context.getTestedGrammar().getCurrentToken();
      _builder.append(_currentToken, "\t");
      _builder.append(" in line ");
      int _lineNumber = context.getTestedGrammar().getLineNumber();
      _builder.append(_lineNumber, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("in file ");
      String _absoluteFileName = context.getTestedGrammar().getAbsoluteFileName();
      _builder.append(_absoluteFileName, "\t");
      _builder.append(".");
      throw new RuntimeException(_builder.toString());
    }
    
    @Override
    public void handleInvalidReferenceGrammarFile(final AntlrGrammarComparator.ErrorContext context) {
      XtextAntlrGeneratorComparisonFragment.copyFile(context.getReferenceGrammar().getAbsoluteFileName(), context.getTestedGrammar().getAbsoluteFileName());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Noticed an unexpectect character sequence in reference grammar after token ");
      String _previousToken = context.getReferenceGrammar().getPreviousToken();
      _builder.append(_previousToken);
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("and before token ");
      String _currentToken = context.getReferenceGrammar().getCurrentToken();
      _builder.append(_currentToken, "\t");
      _builder.append(" in line ");
      int _lineNumber = context.getReferenceGrammar().getLineNumber();
      _builder.append(_lineNumber, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("in file ");
      String _absoluteFileName = context.getReferenceGrammar().getAbsoluteFileName();
      _builder.append(_absoluteFileName, "\t");
      _builder.append(".");
      throw new RuntimeException(_builder.toString());
    }
    
    @Override
    public void handleMismatch(final String match, final String matchReference, final AntlrGrammarComparator.ErrorContext context) {
      XtextAntlrGeneratorComparisonFragment.copyFile(context.getReferenceGrammar().getAbsoluteFileName(), context.getTestedGrammar().getAbsoluteFileName());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Generated grammar ");
      String _absoluteFileName = context.getTestedGrammar().getAbsoluteFileName();
      _builder.append(_absoluteFileName);
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("differs at token ");
      _builder.append(match, "\t");
      _builder.append(" (line ");
      int _lineNumber = context.getTestedGrammar().getLineNumber();
      _builder.append(_lineNumber, "\t");
      _builder.append("), expected token ");
      _builder.append(matchReference, "\t");
      _builder.append(" (line ");
      int _lineNumber_1 = context.getReferenceGrammar().getLineNumber();
      _builder.append(_lineNumber_1, "\t");
      _builder.append(").");
      throw new RuntimeException(_builder.toString());
    }
  }
  
  protected static class AntlrFragmentHelperEx extends AntlrFragmentHelper {
    private Naming oldNaming;
    
    private GrammarNaming prodNaming;
    
    private ContentAssistGrammarNaming caNaming;
    
    public AntlrFragmentHelperEx(final Naming oldNaming, final GrammarNaming prodNaming, final ContentAssistGrammarNaming caNaming) {
      super(oldNaming);
      this.oldNaming = oldNaming;
      this.prodNaming = prodNaming;
      this.caNaming = caNaming;
    }
    
    @Override
    public String getLexerGrammarFileName(final Grammar g) {
      return this.prodNaming.getLexerGrammar(g).getName();
    }
    
    @Override
    public String getContentAssistLexerGrammarFileName(final Grammar g) {
      return this.caNaming.getLexerGrammar(g).getName();
    }
  }
  
  private final static String ENCODING = Charsets.ISO_8859_1.name();
  
  @Inject
  @Accessors(AccessorType.PROTECTED_GETTER)
  @Extension
  private GrammarNaming productionNaming;
  
  @Inject
  @Accessors(AccessorType.PROTECTED_GETTER)
  private ContentAssistGrammarNaming contentAssistNaming;
  
  @Inject
  @Accessors(AccessorType.PROTECTED_GETTER)
  private AntlrGrammarComparator comparator;
  
  @Accessors
  private AntlrOptions options;
  
  @Accessors
  private boolean partialParsing;
  
  @Accessors
  private boolean skipContentAssistGrammarComparison = false;
  
  @Accessors
  private boolean failOnError = true;
  
  @Accessors(AccessorType.PROTECTED_GETTER)
  private List<String> advices = CollectionLiterals.<String>newArrayList();
  
  @Accessors(AccessorType.PROTECTED_GETTER)
  private List<String> extensionAdvices = CollectionLiterals.<String>newArrayList();
  
  public void addRegisterAdvice(final String advice) {
    this.advices.add(advice);
  }
  
  public void addRegisterExtensionAdvice(final String advice) {
    this.extensionAdvices.add(advice);
  }
  
  /**
   * Deactivate the super class' initialization check.
   */
  @Override
  public void checkConfiguration(final Issues issues) {
  }
  
  /**
   * Tweaks the generation of the {@link Generator#SRC_GEN Generator.SRC_GEN},
   * {@link Generator#SRC_GEN_IDE Generator.SRC_GEN_IDE}, and
   * {@link Generator#SRC_GEN_UI Generator.SRC_GEN_UI} outlets
   * and injects the {@link #getTmpPath()}.
   */
  @Override
  protected Outlet createOutlet(final boolean append, final String encoding, final String name, final boolean overwrite, final String path) {
    Outlet _xifexpression = null;
    if (((Objects.equal(name, Generator.SRC_GEN) || Objects.equal(name, Generator.SRC_GEN_IDE)) || Objects.equal(name, Generator.SRC_GEN_UI))) {
      _xifexpression = super.createOutlet(append, encoding, name, overwrite, this.getTmpFolder().getAbsolutePath());
    } else {
      _xifexpression = super.createOutlet(append, encoding, name, overwrite, path);
    }
    return _xifexpression;
  }
  
  @Override
  public void generate() {
    Naming _naming = this.getNaming();
    boolean _tripleEquals = (_naming == null);
    if (_tripleEquals) {
      this.setNaming(this.createNaming());
    }
    if ((this.options == null)) {
      AntlrOptions _antlrOptions = new AntlrOptions();
      this.options = _antlrOptions;
    }
    final AntlrGrammarComparator.IErrorHandler errorHandler = this.createErrorHandler();
    RuntimeException exception = null;
    IRuntimeProjectConfig _runtime = this.getProjectConfig().getRuntime();
    IXtextGeneratorFileSystemAccess _srcGen = null;
    if (_runtime!=null) {
      _srcGen=_runtime.getSrcGen();
    }
    boolean _tripleNotEquals = (_srcGen != null);
    if (_tripleNotEquals) {
      exception = this.loadAndCompareGrammars(this.getProjectConfig().getRuntime().getSrcGen(), Generator.SRC_GEN, errorHandler);
    }
    boolean _and = false;
    if (!(((!this.failOnError) || (exception == null)) && (!this.skipContentAssistGrammarComparison))) {
      _and = false;
    } else {
      IBundleProjectConfig _genericIde = this.getProjectConfig().getGenericIde();
      IXtextGeneratorFileSystemAccess _srcGen_1 = null;
      if (_genericIde!=null) {
        _srcGen_1=_genericIde.getSrcGen();
      }
      boolean _tripleNotEquals_1 = (_srcGen_1 != null);
      _and = _tripleNotEquals_1;
    }
    if (_and) {
      exception = this.loadAndCompareGrammars(this.getProjectConfig().getGenericIde().getSrcGen(), Generator.SRC_GEN_IDE, errorHandler);
    }
    XtextAntlrGeneratorComparisonFragment.deleteDir(this.getTmpFolder());
    if ((this.failOnError && (exception != null))) {
      throw exception;
    }
  }
  
  protected AntlrGrammarComparator.IErrorHandler createErrorHandler() {
    return new XtextAntlrGeneratorComparisonFragment.ErrorHandler();
  }
  
  protected RuntimeException loadAndCompareGrammars(final IFileSystemAccess2 fsa, final String outlet, final AntlrGrammarComparator.IErrorHandler errorHandler) {
    try {
      final StopWatch stopWatch = new StopWatch();
      stopWatch.reset();
      this.performXpandBasedGeneration(outlet);
      String parserGrammarFileName = null;
      String lexerGrammarFileName = null;
      String type = null;
      boolean _equals = Objects.equal(outlet, Generator.SRC_GEN);
      if (_equals) {
        lexerGrammarFileName = this.productionNaming.getLexerGrammar(this.getGrammar()).getGrammarFileName();
        parserGrammarFileName = this.productionNaming.getParserGrammar(this.getGrammar()).getGrammarFileName();
        type = "runtime";
      } else {
        boolean _equals_1 = Objects.equal(outlet, Generator.SRC_GEN_IDE);
        if (_equals_1) {
          lexerGrammarFileName = this.contentAssistNaming.getLexerGrammar(this.getGrammar()).getGrammarFileName();
          parserGrammarFileName = this.contentAssistNaming.getParserGrammar(this.getGrammar()).getGrammarFileName();
          type = "content assist";
        } else {
          throw new RuntimeException("Unexpected value of parameter \'outlet\'");
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      String _absolutePath = this.getTmpFolder().getAbsolutePath();
      _builder.append(_absolutePath);
      _builder.append("/");
      _builder.append(lexerGrammarFileName);
      final String absoluteLexerGrammarFileNameReference = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      String _absolutePath_1 = this.getTmpFolder().getAbsolutePath();
      _builder_1.append(_absolutePath_1);
      _builder_1.append("/");
      _builder_1.append(parserGrammarFileName);
      final String absoluteParserGrammarFileNameReference = _builder_1.toString();
      RuntimeException exception = null;
      boolean _isCombinedGrammar = this.productionNaming.isCombinedGrammar(this.getGrammar());
      boolean _not = (!_isCombinedGrammar);
      if (_not) {
        this.postProcessReferenceLexerGrammar(absoluteLexerGrammarFileNameReference, outlet);
        final CharSequence lexerGrammarFile = fsa.readTextFile(lexerGrammarFileName);
        File _file = new File(absoluteLexerGrammarFileNameReference);
        final String lexerGrammarFileReference = Files.toString(_file, Charset.forName(XtextAntlrGeneratorComparisonFragment.ENCODING));
        try {
          StringConcatenation _builder_2 = new StringConcatenation();
          String _path = this.getPath(fsa);
          _builder_2.append(_path);
          _builder_2.append("/");
          _builder_2.append(lexerGrammarFileName);
          final AntlrGrammarComparator.ErrorContext resultLexer = this.comparator.compareGrammars(lexerGrammarFile, lexerGrammarFileReference, _builder_2.toString(), absoluteLexerGrammarFileNameReference, errorHandler);
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Generated ");
          _builder_3.append(type);
          _builder_3.append(" lexer grammar of ");
          int _lineNumber = resultLexer.getTestedGrammar().getLineNumber();
          _builder_3.append(_lineNumber);
          _builder_3.append(" lines matches expected one of ");
          int _lineNumber_1 = resultLexer.getReferenceGrammar().getLineNumber();
          _builder_3.append(_lineNumber_1);
          _builder_3.append(".");
          XtextAntlrGeneratorComparisonFragment.LOG.info(_builder_3);
        } catch (final Throwable _t) {
          if (_t instanceof RuntimeException) {
            final RuntimeException e = (RuntimeException)_t;
            XtextAntlrGeneratorComparisonFragment.LOG.error(e.getMessage());
            exception = e;
            if (this.failOnError) {
              return e;
            }
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
      this.postProcessReferenceParserGrammar(absoluteParserGrammarFileNameReference, outlet);
      final CharSequence grammarFile = fsa.readTextFile(parserGrammarFileName);
      File _file_1 = new File(absoluteParserGrammarFileNameReference);
      final String grammarFileReference = Files.toString(_file_1, Charset.forName(XtextAntlrGeneratorComparisonFragment.ENCODING));
      try {
        StringConcatenation _builder_4 = new StringConcatenation();
        String _path_1 = this.getPath(fsa);
        _builder_4.append(_path_1);
        _builder_4.append("/");
        _builder_4.append(parserGrammarFileName);
        final AntlrGrammarComparator.ErrorContext result = this.comparator.compareGrammars(grammarFile, grammarFileReference, _builder_4.toString(), absoluteParserGrammarFileNameReference, errorHandler);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("Generated ");
        _builder_5.append(type);
        _builder_5.append(" parser grammar of ");
        int _lineNumber_2 = result.getTestedGrammar().getLineNumber();
        _builder_5.append(_lineNumber_2);
        _builder_5.append(" lines matches expected one of ");
        int _lineNumber_3 = result.getReferenceGrammar().getLineNumber();
        _builder_5.append(_lineNumber_3);
        _builder_5.append(" (");
        long _reset = stopWatch.reset();
        _builder_5.append(_reset);
        _builder_5.append(" ms).");
        XtextAntlrGeneratorComparisonFragment.LOG.info(_builder_5);
      } catch (final Throwable _t_1) {
        if (_t_1 instanceof RuntimeException) {
          final RuntimeException e_1 = (RuntimeException)_t_1;
          XtextAntlrGeneratorComparisonFragment.LOG.error(e_1.getMessage());
          exception = e_1;
        } else {
          throw Exceptions.sneakyThrow(_t_1);
        }
      }
      if (this.failOnError) {
        return exception;
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Method hook allowing some grammar processing before comparison.
   */
  protected void postProcessReferenceLexerGrammar(final String absoluteReferenceLexerGrammarFile, final String outlet) {
  }
  
  /**
   * Method hook allowing some grammar processing before comparison.
   */
  protected void postProcessReferenceParserGrammar(final String absoluteReferenceParserGrammarFile, final String outlet) {
  }
  
  protected void performXpandBasedGeneration(final String outlet) {
    final RuleFilter filter = new RuleFilter();
    filter.setDiscardUnreachableRules(this.options.isSkipUnusedRules());
    final RuleNames ruleNames = RuleNames.getRuleNames(this.getGrammar(), true);
    final Grammar flattened = new FlattenedGrammarAccess(ruleNames, filter).getFlattenedGrammar();
    XpandExecutionContext _createExecutionContext = this.createExecutionContext();
    final XpandExecutionContextImpl context = ((XpandExecutionContextImpl) _createExecutionContext);
    final Consumer<String> _function = (String it) -> {
      context.registerAdvices(it);
    };
    this.advices.forEach(_function);
    final Consumer<String> _function_1 = (String it) -> {
      context.registerExtensionAdvices(it);
    };
    this.extensionAdvices.forEach(_function_1);
    final boolean combined = this.productionNaming.isCombinedGrammar(this.getGrammar());
    XtextAntlrGeneratorComparisonFragment.AntlrFragmentHelperEx _xifexpression = null;
    if ((!combined)) {
      Naming _naming = this.getNaming();
      _xifexpression = new XtextAntlrGeneratorComparisonFragment.AntlrFragmentHelperEx(_naming, this.productionNaming, this.contentAssistNaming);
    }
    final XtextAntlrGeneratorComparisonFragment.AntlrFragmentHelperEx helper = _xifexpression;
    String template = null;
    Object[] params = null;
    new CombinedGrammarMarker(combined).attachToEmfObject(flattened);
    if ((Objects.equal(outlet, Generator.SRC_GEN) && (context.getOutput().getOutlet(Generator.SRC_GEN) != null))) {
      if (combined) {
        template = XtextAntlrGeneratorFragment.class.getName();
        params = new Object[] { this.options };
      } else {
        template = AntlrGeneratorFragment.class.getName();
        params = new Object[] { this.options, helper };
      }
      XpandFacade _create = XpandFacade.create(context);
      String _replaceAll = template.replaceAll("\\.", "::");
      String _plus = (_replaceAll + "::generate");
      final Object[] _converted_params = (Object[])params;
      _create.evaluate2(_plus, flattened, ((List<Object>)Conversions.doWrapArray(_converted_params)));
    } else {
      if ((Objects.equal(outlet, Generator.SRC_GEN_IDE) && (context.getOutput().getOutlet(Generator.SRC_GEN_IDE) != null))) {
        if (combined) {
          template = XtextAntlrUiGeneratorFragment.class.getName();
          boolean _hasIde = this.getNaming().hasIde();
          params = new Object[] { this.options, Boolean.valueOf(this.partialParsing), Boolean.valueOf(_hasIde) };
        } else {
          template = ContentAssistParserGeneratorFragment.class.getName();
          boolean _booleanValue = Boolean.valueOf(this.partialParsing).booleanValue();
          boolean _booleanValue_1 = Boolean.valueOf(this.getNaming().hasIde()).booleanValue();
          params = new Object[] { this.options, helper, Boolean.valueOf(_booleanValue), Boolean.valueOf(_booleanValue_1) };
        }
        XpandFacade _create_1 = XpandFacade.create(context);
        String _replaceAll_1 = template.replaceAll("\\.", "::");
        String _plus_1 = (_replaceAll_1 + "::generate");
        final Object[] _converted_params_1 = (Object[])params;
        _create_1.evaluate2(_plus_1, flattened, ((List<Object>)Conversions.doWrapArray(_converted_params_1)));
      }
    }
  }
  
  /**
   * offers a singleton temporary folder
   */
  protected File getTmpFolder() {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList();
    final File _result;
    synchronized (_createCache_getTmpFolder) {
      if (_createCache_getTmpFolder.containsKey(_cacheKey)) {
        return _createCache_getTmpFolder.get(_cacheKey);
      }
      File _createTempDir = Files.createTempDir();
      _result = _createTempDir;
      _createCache_getTmpFolder.put(_cacheKey, _result);
    }
    _init_getTmpFolder(_result);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, File> _createCache_getTmpFolder = CollectionLiterals.newHashMap();
  
  private void _init_getTmpFolder(final File path) {
  }
  
  protected static void copyFile(final String from, final String to) {
    try {
      File _file = new File(from);
      StringConcatenation _builder = new StringConcatenation();
      int _length = to.length();
      int _minus = (_length - 2);
      String _substring = to.substring(0, _minus);
      _builder.append(_substring);
      _builder.append("Expected.g");
      File _file_1 = new File(_builder.toString());
      Files.copy(_file, _file_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * little helper for cleaning up the temporary stuff.
   */
  protected static void deleteDir(final File dir) {
    try {
      boolean _exists = dir.exists();
      boolean _not = (!_exists);
      if (_not) {
        return;
      }
      org.eclipse.xtext.util.Files.sweepFolder(dir);
      try {
        dir.delete();
      } finally {
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private final static Logger LOG = Logger.getLogger(XtextAntlrGeneratorComparisonFragment.class);
  
  @Pure
  protected GrammarNaming getProductionNaming() {
    return this.productionNaming;
  }
  
  @Pure
  protected ContentAssistGrammarNaming getContentAssistNaming() {
    return this.contentAssistNaming;
  }
  
  @Pure
  protected AntlrGrammarComparator getComparator() {
    return this.comparator;
  }
  
  @Pure
  public AntlrOptions getOptions() {
    return this.options;
  }
  
  public void setOptions(final AntlrOptions options) {
    this.options = options;
  }
  
  @Pure
  public boolean isPartialParsing() {
    return this.partialParsing;
  }
  
  public void setPartialParsing(final boolean partialParsing) {
    this.partialParsing = partialParsing;
  }
  
  @Pure
  public boolean isSkipContentAssistGrammarComparison() {
    return this.skipContentAssistGrammarComparison;
  }
  
  public void setSkipContentAssistGrammarComparison(final boolean skipContentAssistGrammarComparison) {
    this.skipContentAssistGrammarComparison = skipContentAssistGrammarComparison;
  }
  
  @Pure
  public boolean isFailOnError() {
    return this.failOnError;
  }
  
  public void setFailOnError(final boolean failOnError) {
    this.failOnError = failOnError;
  }
  
  @Pure
  protected List<String> getAdvices() {
    return this.advices;
  }
  
  @Pure
  protected List<String> getExtensionAdvices() {
    return this.extensionAdvices;
  }
}