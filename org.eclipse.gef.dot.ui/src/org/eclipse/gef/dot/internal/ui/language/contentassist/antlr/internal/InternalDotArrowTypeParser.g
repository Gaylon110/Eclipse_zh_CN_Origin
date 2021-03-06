/*
* generated by Xtext
*/
parser grammar InternalDotArrowTypeParser;

options {
	tokenVocab=InternalDotArrowTypeLexer;
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
import org.eclipse.gef.dot.internal.language.services.DotArrowTypeGrammarAccess;

}

@members {
 
 	private DotArrowTypeGrammarAccess grammarAccess;
 	
 	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
 	
 	{
		tokenNameToValue.put("L", "'l'");
		tokenNameToValue.put("O", "'o'");
		tokenNameToValue.put("R", "'r'");
		tokenNameToValue.put("Box", "'box'");
		tokenNameToValue.put("Dot", "'dot'");
		tokenNameToValue.put("Inv", "'inv'");
		tokenNameToValue.put("Tee", "'tee'");
		tokenNameToValue.put("Vee", "'vee'");
		tokenNameToValue.put("Crow", "'crow'");
		tokenNameToValue.put("None", "'none'");
		tokenNameToValue.put("Open", "'open'");
		tokenNameToValue.put("Curve", "'curve'");
		tokenNameToValue.put("Empty", "'empty'");
		tokenNameToValue.put("Icurve", "'icurve'");
		tokenNameToValue.put("Normal", "'normal'");
		tokenNameToValue.put("Diamond", "'diamond'");
		tokenNameToValue.put("Ediamond", "'ediamond'");
		tokenNameToValue.put("Halfopen", "'halfopen'");
		tokenNameToValue.put("Invempty", "'invempty'");
 	}
 	
    public void setGrammarAccess(DotArrowTypeGrammarAccess grammarAccess) {
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




// Entry rule entryRuleArrowType
entryRuleArrowType 
:
{ before(grammarAccess.getArrowTypeRule()); }
	 ruleArrowType
{ after(grammarAccess.getArrowTypeRule()); } 
	 EOF 
;

// Rule ArrowType
ruleArrowType 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getArrowTypeAccess().getGroup()); }
(rule__ArrowType__Group__0)
{ after(grammarAccess.getArrowTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractArrowShape
entryRuleAbstractArrowShape 
:
{ before(grammarAccess.getAbstractArrowShapeRule()); }
	 ruleAbstractArrowShape
{ after(grammarAccess.getAbstractArrowShapeRule()); } 
	 EOF 
;

// Rule AbstractArrowShape
ruleAbstractArrowShape 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getAbstractArrowShapeAccess().getAlternatives()); }
(rule__AbstractArrowShape__Alternatives)
{ after(grammarAccess.getAbstractArrowShapeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleArrowShape
entryRuleArrowShape 
:
{ before(grammarAccess.getArrowShapeRule()); }
	 ruleArrowShape
{ after(grammarAccess.getArrowShapeRule()); } 
	 EOF 
;

// Rule ArrowShape
ruleArrowShape 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getArrowShapeAccess().getGroup()); }
(rule__ArrowShape__Group__0)
{ after(grammarAccess.getArrowShapeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDeprecatedArrowShape
entryRuleDeprecatedArrowShape 
:
{ before(grammarAccess.getDeprecatedArrowShapeRule()); }
	 ruleDeprecatedArrowShape
{ after(grammarAccess.getDeprecatedArrowShapeRule()); } 
	 EOF 
;

// Rule DeprecatedArrowShape
ruleDeprecatedArrowShape 
    @init {
		int stackSize = keepStackSize();
    }
    :
(
{ before(grammarAccess.getDeprecatedArrowShapeAccess().getShapeAssignment()); }
(rule__DeprecatedArrowShape__ShapeAssignment)
{ after(grammarAccess.getDeprecatedArrowShapeAccess().getShapeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule DeprecatedShape
ruleDeprecatedShape
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeprecatedShapeAccess().getAlternatives()); }
(rule__DeprecatedShape__Alternatives)
{ after(grammarAccess.getDeprecatedShapeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule PrimitiveShape
rulePrimitiveShape
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveShapeAccess().getAlternatives()); }
(rule__PrimitiveShape__Alternatives)
{ after(grammarAccess.getPrimitiveShapeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__AbstractArrowShape__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractArrowShapeAccess().getArrowShapeParserRuleCall_0()); }
	ruleArrowShape
{ after(grammarAccess.getAbstractArrowShapeAccess().getArrowShapeParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractArrowShapeAccess().getDeprecatedArrowShapeParserRuleCall_1()); }
	ruleDeprecatedArrowShape
{ after(grammarAccess.getAbstractArrowShapeAccess().getDeprecatedArrowShapeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__SideAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getSideLKeyword_1_0_0()); }

	L 

{ after(grammarAccess.getArrowShapeAccess().getSideLKeyword_1_0_0()); }
)

    |(
{ before(grammarAccess.getArrowShapeAccess().getSideRKeyword_1_0_1()); }

	R 

{ after(grammarAccess.getArrowShapeAccess().getSideRKeyword_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DeprecatedShape__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0()); }
(	Ediamond
)
{ after(grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1()); }
(	Open
)
{ after(grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2()); }
(	Halfopen
)
{ after(grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3()); }
(	Empty
)
{ after(grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4()); }
(	Invempty
)
{ after(grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveShape__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0()); }
(	Box
)
{ after(grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1()); }
(	Crow
)
{ after(grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2()); }
(	Curve
)
{ after(grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3()); }
(	Icurve
)
{ after(grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4()); }
(	Diamond
)
{ after(grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5()); }
(	Dot
)
{ after(grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6()); }
(	Inv
)
{ after(grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7()); }
(	None
)
{ after(grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8()); }
(	Normal
)
{ after(grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9()); }
(	Tee
)
{ after(grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9()); }
)

    |(
{ before(grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10()); }
(	Vee
)
{ after(grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__ArrowType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group__0__Impl
	rule__ArrowType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_0()); }
(rule__ArrowType__ArrowShapesAssignment_0)
{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArrowType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getGroup_1()); }
(rule__ArrowType__Group_1__0)?
{ after(grammarAccess.getArrowTypeAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ArrowType__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group_1__0__Impl
	rule__ArrowType__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_0()); }
(rule__ArrowType__ArrowShapesAssignment_1_0)
{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArrowType__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getGroup_1_1()); }
(rule__ArrowType__Group_1_1__0)?
{ after(grammarAccess.getArrowTypeAccess().getGroup_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ArrowType__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group_1_1__0__Impl
	rule__ArrowType__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_0()); }
(rule__ArrowType__ArrowShapesAssignment_1_1_0)
{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArrowType__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowType__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_1()); }
(rule__ArrowType__ArrowShapesAssignment_1_1_1)?
{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ArrowShape__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowShape__Group__0__Impl
	rule__ArrowShape__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getOpenAssignment_0()); }
(rule__ArrowShape__OpenAssignment_0)?
{ after(grammarAccess.getArrowShapeAccess().getOpenAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArrowShape__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowShape__Group__1__Impl
	rule__ArrowShape__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getSideAssignment_1()); }
(rule__ArrowShape__SideAssignment_1)?
{ after(grammarAccess.getArrowShapeAccess().getSideAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ArrowShape__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ArrowShape__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getShapeAssignment_2()); }
(rule__ArrowShape__ShapeAssignment_2)
{ after(grammarAccess.getArrowShapeAccess().getShapeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__ArrowType__ArrowShapesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_0_0()); }
	ruleAbstractArrowShape{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__ArrowShapesAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_0_0()); }
	ruleAbstractArrowShape{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__ArrowShapesAssignment_1_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_0_0()); }
	ruleAbstractArrowShape{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowType__ArrowShapesAssignment_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_1_0()); }
	ruleAbstractArrowShape{ after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__OpenAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); }
(
{ before(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); }

	O 

{ after(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); }
)

{ after(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__SideAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getSideAlternatives_1_0()); }
(rule__ArrowShape__SideAlternatives_1_0)
{ after(grammarAccess.getArrowShapeAccess().getSideAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ArrowShape__ShapeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getArrowShapeAccess().getShapePrimitiveShapeEnumRuleCall_2_0()); }
	rulePrimitiveShape{ after(grammarAccess.getArrowShapeAccess().getShapePrimitiveShapeEnumRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DeprecatedArrowShape__ShapeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0()); }
	ruleDeprecatedShape{ after(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


