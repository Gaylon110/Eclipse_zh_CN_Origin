/*
* generated by Xtext
*/
package org.eclipse.gef.dot.internal.language.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.gef.dot.internal.language.services.DotEscStringGrammarAccess;

public class DotEscStringParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DotEscStringGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected org.eclipse.gef.dot.internal.language.parser.antlr.internal.InternalDotEscStringParser createParser(XtextTokenStream stream) {
		return new org.eclipse.gef.dot.internal.language.parser.antlr.internal.InternalDotEscStringParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "EscString";
	}
	
	public DotEscStringGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DotEscStringGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
