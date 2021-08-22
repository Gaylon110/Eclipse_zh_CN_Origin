/*
* generated by Xtext
*/
parser grammar InternalDotColorParser;

options {
	tokenVocab=InternalDotColorLexer;
	superClass=AbstractInternalContentAssistParser;
	
}

@header {
package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.gef.dot.internal.language.services.DotColorGrammarAccess;

}

@members {
 
 	private DotColorGrammarAccess grammarAccess;
 	
 	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
 	
 	{
		tokenNameToValue.put("NumberSign", "'#'");
		tokenNameToValue.put("Comma", "','");
		tokenNameToValue.put("Solidus", "'/'");
 	}
 	
    public void setGrammarAccess(DotColorGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }

	@Override
    protected String getValueForTokenName(String tokenName) {
    	String result = tokenNameToValue.get(tokenName);
    	if (result == null)
    		result = tokenName;
    	return result;
    }
}




// Entry rule entryRuleColor
entryRuleColor 
:
{ before(grammarAccess.getColorRule()); }
	 ruleColor
{ after(grammarAccess.getColorRule()); } 
	 EOF 
;

// Rule Color
ruleColor 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getColorAccess().getAlternatives()); }
(rule__Color__Alternatives)
{ after(grammarAccess.getColorAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRGBColor
entryRuleRGBColor 
:
{ before(grammarAccess.getRGBColorRule()); }
	 ruleRGBColor
{ after(grammarAccess.getRGBColorRule()); } 
	 EOF 
;

// Rule RGBColor
ruleRGBColor 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getRGBColorAccess().getGroup()); }
(rule__RGBColor__Group__0)
{ after(grammarAccess.getRGBColorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHSVColor
entryRuleHSVColor 
:
{ before(grammarAccess.getHSVColorRule()); }
	 ruleHSVColor
{ after(grammarAccess.getHSVColorRule()); } 
	 EOF 
;

// Rule HSVColor
ruleHSVColor 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getHSVColorAccess().getGroup()); }
(rule__HSVColor__Group__0)
{ after(grammarAccess.getHSVColorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStringColor
entryRuleStringColor 
:
{ before(grammarAccess.getStringColorRule()); }
	 ruleStringColor
{ after(grammarAccess.getStringColorRule()); } 
	 EOF 
;

// Rule StringColor
ruleStringColor 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getStringColorAccess().getGroup()); }
(rule__StringColor__Group__0)
{ after(grammarAccess.getStringColorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulehex
entryRulehex 
:
{ before(grammarAccess.getHexRule()); }
	 rulehex
{ after(grammarAccess.getHexRule()); } 
	 EOF 
;

// Rule hex
rulehex 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getHexAccess().getGroup()); }
(rule__Hex__Group__0)
{ after(grammarAccess.getHexAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Color__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getColorAccess().getRGBColorParserRuleCall_0()); }
	ruleRGBColor
{ after(grammarAccess.getColorAccess().getRGBColorParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getColorAccess().getHSVColorParserRuleCall_1()); }
	ruleHSVColor
{ after(grammarAccess.getColorAccess().getHSVColorParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getColorAccess().getStringColorParserRuleCall_2()); }
	ruleStringColor
{ after(grammarAccess.getColorAccess().getStringColorParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__NameAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getNameHEXADECIMAL_DIGITTerminalRuleCall_1_0_0()); }
	RULE_HEXADECIMAL_DIGIT
{ after(grammarAccess.getStringColorAccess().getNameHEXADECIMAL_DIGITTerminalRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getStringColorAccess().getNameCOLOR_STRINGTerminalRuleCall_1_0_1()); }
	RULE_COLOR_STRING
{ after(grammarAccess.getStringColorAccess().getNameCOLOR_STRINGTerminalRuleCall_1_0_1()); }
)

    |(
{ before(grammarAccess.getStringColorAccess().getNameCOLOR_NUMBERTerminalRuleCall_1_0_2()); }
	RULE_COLOR_NUMBER
{ after(grammarAccess.getStringColorAccess().getNameCOLOR_NUMBERTerminalRuleCall_1_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__RGBColor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RGBColor__Group__0__Impl
	rule__RGBColor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getNumberSignKeyword_0()); }

	NumberSign 

{ after(grammarAccess.getRGBColorAccess().getNumberSignKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RGBColor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RGBColor__Group__1__Impl
	rule__RGBColor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getRAssignment_1()); }
(rule__RGBColor__RAssignment_1)
{ after(grammarAccess.getRGBColorAccess().getRAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RGBColor__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RGBColor__Group__2__Impl
	rule__RGBColor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getGAssignment_2()); }
(rule__RGBColor__GAssignment_2)
{ after(grammarAccess.getRGBColorAccess().getGAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RGBColor__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RGBColor__Group__3__Impl
	rule__RGBColor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getBAssignment_3()); }
(rule__RGBColor__BAssignment_3)
{ after(grammarAccess.getRGBColorAccess().getBAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RGBColor__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RGBColor__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getAAssignment_4()); }
(rule__RGBColor__AAssignment_4)?
{ after(grammarAccess.getRGBColorAccess().getAAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__HSVColor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HSVColor__Group__0__Impl
	rule__HSVColor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getHAssignment_0()); }
(rule__HSVColor__HAssignment_0)
{ after(grammarAccess.getHSVColorAccess().getHAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HSVColor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HSVColor__Group__1__Impl
	rule__HSVColor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getCommaKeyword_1()); }
(
	Comma 
)?
{ after(grammarAccess.getHSVColorAccess().getCommaKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HSVColor__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HSVColor__Group__2__Impl
	rule__HSVColor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getSAssignment_2()); }
(rule__HSVColor__SAssignment_2)
{ after(grammarAccess.getHSVColorAccess().getSAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HSVColor__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HSVColor__Group__3__Impl
	rule__HSVColor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getCommaKeyword_3()); }
(
	Comma 
)?
{ after(grammarAccess.getHSVColorAccess().getCommaKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HSVColor__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HSVColor__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getVAssignment_4()); }
(rule__HSVColor__VAssignment_4)
{ after(grammarAccess.getHSVColorAccess().getVAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__StringColor__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringColor__Group__0__Impl
	rule__StringColor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getGroup_0()); }
(rule__StringColor__Group_0__0)?
{ after(grammarAccess.getStringColorAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StringColor__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringColor__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getNameAssignment_1()); }
(rule__StringColor__NameAssignment_1)
{ after(grammarAccess.getStringColorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__StringColor__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringColor__Group_0__0__Impl
	rule__StringColor__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getSolidusKeyword_0_0()); }

	Solidus 

{ after(grammarAccess.getStringColorAccess().getSolidusKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StringColor__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringColor__Group_0__1__Impl
	rule__StringColor__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getSchemeAssignment_0_1()); }
(rule__StringColor__SchemeAssignment_0_1)?
{ after(grammarAccess.getStringColorAccess().getSchemeAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StringColor__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StringColor__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getSolidusKeyword_0_2()); }

	Solidus 

{ after(grammarAccess.getStringColorAccess().getSolidusKeyword_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Hex__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Hex__Group__0__Impl
	rule__Hex__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Hex__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_0()); }
	RULE_HEXADECIMAL_DIGIT
{ after(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Hex__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Hex__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Hex__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_1()); }
	RULE_HEXADECIMAL_DIGIT
{ after(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__RGBColor__RAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getRHexParserRuleCall_1_0()); }
	rulehex{ after(grammarAccess.getRGBColorAccess().getRHexParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__GAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getGHexParserRuleCall_2_0()); }
	rulehex{ after(grammarAccess.getRGBColorAccess().getGHexParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__BAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getBHexParserRuleCall_3_0()); }
	rulehex{ after(grammarAccess.getRGBColorAccess().getBHexParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RGBColor__AAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRGBColorAccess().getAHexParserRuleCall_4_0()); }
	rulehex{ after(grammarAccess.getRGBColorAccess().getAHexParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__HAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0()); }
	RULE_COLOR_NUMBER{ after(grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__SAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0()); }
	RULE_COLOR_NUMBER{ after(grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HSVColor__VAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0()); }
	RULE_COLOR_NUMBER{ after(grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__SchemeAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getSchemeCOLOR_STRINGTerminalRuleCall_0_1_0()); }
	RULE_COLOR_STRING{ after(grammarAccess.getStringColorAccess().getSchemeCOLOR_STRINGTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringColor__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringColorAccess().getNameAlternatives_1_0()); }
(rule__StringColor__NameAlternatives_1_0)
{ after(grammarAccess.getStringColorAccess().getNameAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

