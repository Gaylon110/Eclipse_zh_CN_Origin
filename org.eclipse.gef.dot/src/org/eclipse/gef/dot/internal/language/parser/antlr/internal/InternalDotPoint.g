/*
* generated by Xtext
*/
grammar InternalDotPoint;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.gef.dot.internal.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.gef.dot.internal.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.gef.dot.internal.language.services.DotPointGrammarAccess;

}

@parser::members {

 	private DotPointGrammarAccess grammarAccess;
 	
    public InternalDotPointParser(TokenStream input, DotPointGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Point";	
   	}
   	
   	@Override
   	protected DotPointGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulePoint
entryRulePoint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPointRule()); }
	 iv_rulePoint=rulePoint 
	 { $current=$iv_rulePoint.current; } 
	 EOF 
;

// Rule Point
rulePoint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_x_0_0=RULE_DOUBLE
		{
			newLeafNode(lv_x_0_0, grammarAccess.getPointAccess().getXDOUBLETerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"x",
        		lv_x_0_0, 
        		"DOUBLE");
	    }

)
)	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getCommaKeyword_1());
    }
(
(
		lv_y_2_0=RULE_DOUBLE
		{
			newLeafNode(lv_y_2_0, grammarAccess.getPointAccess().getYDOUBLETerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"y",
        		lv_y_2_0, 
        		"DOUBLE");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getCommaKeyword_3_0());
    }
(
(
		lv_z_4_0=RULE_DOUBLE
		{
			newLeafNode(lv_z_4_0, grammarAccess.getPointAccess().getZDOUBLETerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"z",
        		lv_z_4_0, 
        		"DOUBLE");
	    }

)
))?(
(
		lv_inputOnly_5_0=	'!' 
    {
        newLeafNode(lv_inputOnly_5_0, grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointRule());
	        }
       		setWithLastConsumed($current, "inputOnly", true, "!");
	    }

)
)?)
;





RULE_DOUBLE : '-'? ('.' ('0'..'9')+|('0'..'9')+ ('.' ('0'..'9')*)?);

RULE_WS : (' '|'\t'|'\r'|'\n')+;


