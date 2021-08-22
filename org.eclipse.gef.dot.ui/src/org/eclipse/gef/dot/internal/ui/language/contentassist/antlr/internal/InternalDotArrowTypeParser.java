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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotArrowTypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Ediamond", "Halfopen", "Invempty", "Diamond", "Icurve", "Normal", "Curve", "Empty", "Crow", "None", "Open", "Box", "Dot", "Inv", "Tee", "Vee", "L", "O", "R"
    };
    public static final int L=20;
    public static final int Open=14;
    public static final int O=21;
    public static final int Inv=17;
    public static final int Empty=11;
    public static final int R=22;
    public static final int Crow=12;
    public static final int EOF=-1;
    public static final int Invempty=6;
    public static final int Curve=10;
    public static final int Dot=16;
    public static final int Diamond=7;
    public static final int Box=15;
    public static final int Normal=9;
    public static final int Halfopen=5;
    public static final int Tee=18;
    public static final int Vee=19;
    public static final int Ediamond=4;
    public static final int Icurve=8;
    public static final int None=13;

    // delegates
    // delegators


        public InternalDotArrowTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotArrowTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotArrowTypeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g"; }


     
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



    // $ANTLR start "entryRuleArrowType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:82:1: entryRuleArrowType : ruleArrowType EOF ;
    public final void entryRuleArrowType() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:83:1: ( ruleArrowType EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:84:1: ruleArrowType EOF
            {
             before(grammarAccess.getArrowTypeRule()); 
            pushFollow(FOLLOW_ruleArrowType_in_entryRuleArrowType54);
            ruleArrowType();

            state._fsp--;

             after(grammarAccess.getArrowTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowType61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrowType"


    // $ANTLR start "ruleArrowType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:91:1: ruleArrowType : ( ( rule__ArrowType__Group__0 ) ) ;
    public final void ruleArrowType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:95:5: ( ( ( rule__ArrowType__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:96:1: ( ( rule__ArrowType__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:96:1: ( ( rule__ArrowType__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:97:1: ( rule__ArrowType__Group__0 )
            {
             before(grammarAccess.getArrowTypeAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:98:1: ( rule__ArrowType__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:98:2: rule__ArrowType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrowType__Group__0_in_ruleArrowType91);
            rule__ArrowType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrowTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrowType"


    // $ANTLR start "entryRuleAbstractArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:110:1: entryRuleAbstractArrowShape : ruleAbstractArrowShape EOF ;
    public final void entryRuleAbstractArrowShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:111:1: ( ruleAbstractArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:112:1: ruleAbstractArrowShape EOF
            {
             before(grammarAccess.getAbstractArrowShapeRule()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_entryRuleAbstractArrowShape118);
            ruleAbstractArrowShape();

            state._fsp--;

             after(grammarAccess.getAbstractArrowShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractArrowShape125); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractArrowShape"


    // $ANTLR start "ruleAbstractArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:119:1: ruleAbstractArrowShape : ( ( rule__AbstractArrowShape__Alternatives ) ) ;
    public final void ruleAbstractArrowShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:123:5: ( ( ( rule__AbstractArrowShape__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:124:1: ( ( rule__AbstractArrowShape__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:124:1: ( ( rule__AbstractArrowShape__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:125:1: ( rule__AbstractArrowShape__Alternatives )
            {
             before(grammarAccess.getAbstractArrowShapeAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:126:1: ( rule__AbstractArrowShape__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:126:2: rule__AbstractArrowShape__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractArrowShape__Alternatives_in_ruleAbstractArrowShape155);
            rule__AbstractArrowShape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractArrowShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractArrowShape"


    // $ANTLR start "entryRuleArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:138:1: entryRuleArrowShape : ruleArrowShape EOF ;
    public final void entryRuleArrowShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:139:1: ( ruleArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:140:1: ruleArrowShape EOF
            {
             before(grammarAccess.getArrowShapeRule()); 
            pushFollow(FOLLOW_ruleArrowShape_in_entryRuleArrowShape182);
            ruleArrowShape();

            state._fsp--;

             after(grammarAccess.getArrowShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowShape189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrowShape"


    // $ANTLR start "ruleArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:147:1: ruleArrowShape : ( ( rule__ArrowShape__Group__0 ) ) ;
    public final void ruleArrowShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:151:5: ( ( ( rule__ArrowShape__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:152:1: ( ( rule__ArrowShape__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:152:1: ( ( rule__ArrowShape__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:153:1: ( rule__ArrowShape__Group__0 )
            {
             before(grammarAccess.getArrowShapeAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:154:1: ( rule__ArrowShape__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:154:2: rule__ArrowShape__Group__0
            {
            pushFollow(FOLLOW_rule__ArrowShape__Group__0_in_ruleArrowShape219);
            rule__ArrowShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrowShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrowShape"


    // $ANTLR start "entryRuleDeprecatedArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:166:1: entryRuleDeprecatedArrowShape : ruleDeprecatedArrowShape EOF ;
    public final void entryRuleDeprecatedArrowShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:167:1: ( ruleDeprecatedArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:168:1: ruleDeprecatedArrowShape EOF
            {
             before(grammarAccess.getDeprecatedArrowShapeRule()); 
            pushFollow(FOLLOW_ruleDeprecatedArrowShape_in_entryRuleDeprecatedArrowShape246);
            ruleDeprecatedArrowShape();

            state._fsp--;

             after(grammarAccess.getDeprecatedArrowShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeprecatedArrowShape253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeprecatedArrowShape"


    // $ANTLR start "ruleDeprecatedArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:175:1: ruleDeprecatedArrowShape : ( ( rule__DeprecatedArrowShape__ShapeAssignment ) ) ;
    public final void ruleDeprecatedArrowShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:179:5: ( ( ( rule__DeprecatedArrowShape__ShapeAssignment ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:180:1: ( ( rule__DeprecatedArrowShape__ShapeAssignment ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:180:1: ( ( rule__DeprecatedArrowShape__ShapeAssignment ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:181:1: ( rule__DeprecatedArrowShape__ShapeAssignment )
            {
             before(grammarAccess.getDeprecatedArrowShapeAccess().getShapeAssignment()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:182:1: ( rule__DeprecatedArrowShape__ShapeAssignment )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:182:2: rule__DeprecatedArrowShape__ShapeAssignment
            {
            pushFollow(FOLLOW_rule__DeprecatedArrowShape__ShapeAssignment_in_ruleDeprecatedArrowShape283);
            rule__DeprecatedArrowShape__ShapeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeprecatedArrowShapeAccess().getShapeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeprecatedArrowShape"


    // $ANTLR start "ruleDeprecatedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:195:1: ruleDeprecatedShape : ( ( rule__DeprecatedShape__Alternatives ) ) ;
    public final void ruleDeprecatedShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:199:1: ( ( ( rule__DeprecatedShape__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:200:1: ( ( rule__DeprecatedShape__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:200:1: ( ( rule__DeprecatedShape__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:201:1: ( rule__DeprecatedShape__Alternatives )
            {
             before(grammarAccess.getDeprecatedShapeAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:202:1: ( rule__DeprecatedShape__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:202:2: rule__DeprecatedShape__Alternatives
            {
            pushFollow(FOLLOW_rule__DeprecatedShape__Alternatives_in_ruleDeprecatedShape320);
            rule__DeprecatedShape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeprecatedShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeprecatedShape"


    // $ANTLR start "rulePrimitiveShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:214:1: rulePrimitiveShape : ( ( rule__PrimitiveShape__Alternatives ) ) ;
    public final void rulePrimitiveShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:218:1: ( ( ( rule__PrimitiveShape__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:219:1: ( ( rule__PrimitiveShape__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:219:1: ( ( rule__PrimitiveShape__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:220:1: ( rule__PrimitiveShape__Alternatives )
            {
             before(grammarAccess.getPrimitiveShapeAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:221:1: ( rule__PrimitiveShape__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:221:2: rule__PrimitiveShape__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveShape__Alternatives_in_rulePrimitiveShape356);
            rule__PrimitiveShape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveShape"


    // $ANTLR start "rule__AbstractArrowShape__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:232:1: rule__AbstractArrowShape__Alternatives : ( ( ruleArrowShape ) | ( ruleDeprecatedArrowShape ) );
    public final void rule__AbstractArrowShape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:236:1: ( ( ruleArrowShape ) | ( ruleDeprecatedArrowShape ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=Diamond && LA1_0<=Curve)||(LA1_0>=Crow && LA1_0<=None)||(LA1_0>=Box && LA1_0<=R)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=Ediamond && LA1_0<=Invempty)||LA1_0==Empty||LA1_0==Open) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:237:1: ( ruleArrowShape )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:237:1: ( ruleArrowShape )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:238:1: ruleArrowShape
                    {
                     before(grammarAccess.getAbstractArrowShapeAccess().getArrowShapeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleArrowShape_in_rule__AbstractArrowShape__Alternatives391);
                    ruleArrowShape();

                    state._fsp--;

                     after(grammarAccess.getAbstractArrowShapeAccess().getArrowShapeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:243:6: ( ruleDeprecatedArrowShape )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:243:6: ( ruleDeprecatedArrowShape )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:244:1: ruleDeprecatedArrowShape
                    {
                     before(grammarAccess.getAbstractArrowShapeAccess().getDeprecatedArrowShapeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDeprecatedArrowShape_in_rule__AbstractArrowShape__Alternatives408);
                    ruleDeprecatedArrowShape();

                    state._fsp--;

                     after(grammarAccess.getAbstractArrowShapeAccess().getDeprecatedArrowShapeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractArrowShape__Alternatives"


    // $ANTLR start "rule__ArrowShape__SideAlternatives_1_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:254:1: rule__ArrowShape__SideAlternatives_1_0 : ( ( L ) | ( R ) );
    public final void rule__ArrowShape__SideAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:258:1: ( ( L ) | ( R ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==L) ) {
                alt2=1;
            }
            else if ( (LA2_0==R) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:259:1: ( L )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:259:1: ( L )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:260:1: L
                    {
                     before(grammarAccess.getArrowShapeAccess().getSideLKeyword_1_0_0()); 
                    match(input,L,FOLLOW_L_in_rule__ArrowShape__SideAlternatives_1_0441); 
                     after(grammarAccess.getArrowShapeAccess().getSideLKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:267:6: ( R )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:267:6: ( R )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:268:1: R
                    {
                     before(grammarAccess.getArrowShapeAccess().getSideRKeyword_1_0_1()); 
                    match(input,R,FOLLOW_R_in_rule__ArrowShape__SideAlternatives_1_0461); 
                     after(grammarAccess.getArrowShapeAccess().getSideRKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__SideAlternatives_1_0"


    // $ANTLR start "rule__DeprecatedShape__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:280:1: rule__DeprecatedShape__Alternatives : ( ( ( Ediamond ) ) | ( ( Open ) ) | ( ( Halfopen ) ) | ( ( Empty ) ) | ( ( Invempty ) ) );
    public final void rule__DeprecatedShape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:284:1: ( ( ( Ediamond ) ) | ( ( Open ) ) | ( ( Halfopen ) ) | ( ( Empty ) ) | ( ( Invempty ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case Ediamond:
                {
                alt3=1;
                }
                break;
            case Open:
                {
                alt3=2;
                }
                break;
            case Halfopen:
                {
                alt3=3;
                }
                break;
            case Empty:
                {
                alt3=4;
                }
                break;
            case Invempty:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:285:1: ( ( Ediamond ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:285:1: ( ( Ediamond ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:286:1: ( Ediamond )
                    {
                     before(grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:287:1: ( Ediamond )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:287:3: Ediamond
                    {
                    match(input,Ediamond,FOLLOW_Ediamond_in_rule__DeprecatedShape__Alternatives496); 

                    }

                     after(grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:292:6: ( ( Open ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:292:6: ( ( Open ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:293:1: ( Open )
                    {
                     before(grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:294:1: ( Open )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:294:3: Open
                    {
                    match(input,Open,FOLLOW_Open_in_rule__DeprecatedShape__Alternatives516); 

                    }

                     after(grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:299:6: ( ( Halfopen ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:299:6: ( ( Halfopen ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:300:1: ( Halfopen )
                    {
                     before(grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:301:1: ( Halfopen )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:301:3: Halfopen
                    {
                    match(input,Halfopen,FOLLOW_Halfopen_in_rule__DeprecatedShape__Alternatives536); 

                    }

                     after(grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:306:6: ( ( Empty ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:306:6: ( ( Empty ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:307:1: ( Empty )
                    {
                     before(grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:308:1: ( Empty )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:308:3: Empty
                    {
                    match(input,Empty,FOLLOW_Empty_in_rule__DeprecatedShape__Alternatives556); 

                    }

                     after(grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:313:6: ( ( Invempty ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:313:6: ( ( Invempty ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:314:1: ( Invempty )
                    {
                     before(grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:315:1: ( Invempty )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:315:3: Invempty
                    {
                    match(input,Invempty,FOLLOW_Invempty_in_rule__DeprecatedShape__Alternatives576); 

                    }

                     after(grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeprecatedShape__Alternatives"


    // $ANTLR start "rule__PrimitiveShape__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:325:1: rule__PrimitiveShape__Alternatives : ( ( ( Box ) ) | ( ( Crow ) ) | ( ( Curve ) ) | ( ( Icurve ) ) | ( ( Diamond ) ) | ( ( Dot ) ) | ( ( Inv ) ) | ( ( None ) ) | ( ( Normal ) ) | ( ( Tee ) ) | ( ( Vee ) ) );
    public final void rule__PrimitiveShape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:329:1: ( ( ( Box ) ) | ( ( Crow ) ) | ( ( Curve ) ) | ( ( Icurve ) ) | ( ( Diamond ) ) | ( ( Dot ) ) | ( ( Inv ) ) | ( ( None ) ) | ( ( Normal ) ) | ( ( Tee ) ) | ( ( Vee ) ) )
            int alt4=11;
            switch ( input.LA(1) ) {
            case Box:
                {
                alt4=1;
                }
                break;
            case Crow:
                {
                alt4=2;
                }
                break;
            case Curve:
                {
                alt4=3;
                }
                break;
            case Icurve:
                {
                alt4=4;
                }
                break;
            case Diamond:
                {
                alt4=5;
                }
                break;
            case Dot:
                {
                alt4=6;
                }
                break;
            case Inv:
                {
                alt4=7;
                }
                break;
            case None:
                {
                alt4=8;
                }
                break;
            case Normal:
                {
                alt4=9;
                }
                break;
            case Tee:
                {
                alt4=10;
                }
                break;
            case Vee:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:330:1: ( ( Box ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:330:1: ( ( Box ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:331:1: ( Box )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:332:1: ( Box )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:332:3: Box
                    {
                    match(input,Box,FOLLOW_Box_in_rule__PrimitiveShape__Alternatives611); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:337:6: ( ( Crow ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:337:6: ( ( Crow ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:338:1: ( Crow )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:339:1: ( Crow )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:339:3: Crow
                    {
                    match(input,Crow,FOLLOW_Crow_in_rule__PrimitiveShape__Alternatives631); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:344:6: ( ( Curve ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:344:6: ( ( Curve ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:345:1: ( Curve )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:346:1: ( Curve )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:346:3: Curve
                    {
                    match(input,Curve,FOLLOW_Curve_in_rule__PrimitiveShape__Alternatives651); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:351:6: ( ( Icurve ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:351:6: ( ( Icurve ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:352:1: ( Icurve )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:353:1: ( Icurve )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:353:3: Icurve
                    {
                    match(input,Icurve,FOLLOW_Icurve_in_rule__PrimitiveShape__Alternatives671); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:358:6: ( ( Diamond ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:358:6: ( ( Diamond ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:359:1: ( Diamond )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:360:1: ( Diamond )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:360:3: Diamond
                    {
                    match(input,Diamond,FOLLOW_Diamond_in_rule__PrimitiveShape__Alternatives691); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:365:6: ( ( Dot ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:365:6: ( ( Dot ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:366:1: ( Dot )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:367:1: ( Dot )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:367:3: Dot
                    {
                    match(input,Dot,FOLLOW_Dot_in_rule__PrimitiveShape__Alternatives711); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:372:6: ( ( Inv ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:372:6: ( ( Inv ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:373:1: ( Inv )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:374:1: ( Inv )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:374:3: Inv
                    {
                    match(input,Inv,FOLLOW_Inv_in_rule__PrimitiveShape__Alternatives731); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:379:6: ( ( None ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:379:6: ( ( None ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:380:1: ( None )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:381:1: ( None )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:381:3: None
                    {
                    match(input,None,FOLLOW_None_in_rule__PrimitiveShape__Alternatives751); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:386:6: ( ( Normal ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:386:6: ( ( Normal ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:387:1: ( Normal )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:388:1: ( Normal )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:388:3: Normal
                    {
                    match(input,Normal,FOLLOW_Normal_in_rule__PrimitiveShape__Alternatives771); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:393:6: ( ( Tee ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:393:6: ( ( Tee ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:394:1: ( Tee )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:395:1: ( Tee )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:395:3: Tee
                    {
                    match(input,Tee,FOLLOW_Tee_in_rule__PrimitiveShape__Alternatives791); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:400:6: ( ( Vee ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:400:6: ( ( Vee ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:401:1: ( Vee )
                    {
                     before(grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:402:1: ( Vee )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:402:3: Vee
                    {
                    match(input,Vee,FOLLOW_Vee_in_rule__PrimitiveShape__Alternatives811); 

                    }

                     after(grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveShape__Alternatives"


    // $ANTLR start "rule__ArrowType__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:414:1: rule__ArrowType__Group__0 : rule__ArrowType__Group__0__Impl rule__ArrowType__Group__1 ;
    public final void rule__ArrowType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:418:1: ( rule__ArrowType__Group__0__Impl rule__ArrowType__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:419:2: rule__ArrowType__Group__0__Impl rule__ArrowType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrowType__Group__0__Impl_in_rule__ArrowType__Group__0843);
            rule__ArrowType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrowType__Group__1_in_rule__ArrowType__Group__0846);
            rule__ArrowType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group__0"


    // $ANTLR start "rule__ArrowType__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:426:1: rule__ArrowType__Group__0__Impl : ( ( rule__ArrowType__ArrowShapesAssignment_0 ) ) ;
    public final void rule__ArrowType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:430:1: ( ( ( rule__ArrowType__ArrowShapesAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:431:1: ( ( rule__ArrowType__ArrowShapesAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:431:1: ( ( rule__ArrowType__ArrowShapesAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:432:1: ( rule__ArrowType__ArrowShapesAssignment_0 )
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:433:1: ( rule__ArrowType__ArrowShapesAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:433:2: rule__ArrowType__ArrowShapesAssignment_0
            {
            pushFollow(FOLLOW_rule__ArrowType__ArrowShapesAssignment_0_in_rule__ArrowType__Group__0__Impl873);
            rule__ArrowType__ArrowShapesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group__0__Impl"


    // $ANTLR start "rule__ArrowType__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:443:1: rule__ArrowType__Group__1 : rule__ArrowType__Group__1__Impl ;
    public final void rule__ArrowType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:447:1: ( rule__ArrowType__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:448:2: rule__ArrowType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowType__Group__1__Impl_in_rule__ArrowType__Group__1903);
            rule__ArrowType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group__1"


    // $ANTLR start "rule__ArrowType__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:454:1: rule__ArrowType__Group__1__Impl : ( ( rule__ArrowType__Group_1__0 )? ) ;
    public final void rule__ArrowType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:458:1: ( ( ( rule__ArrowType__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:459:1: ( ( rule__ArrowType__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:459:1: ( ( rule__ArrowType__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:460:1: ( rule__ArrowType__Group_1__0 )?
            {
             before(grammarAccess.getArrowTypeAccess().getGroup_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:461:1: ( rule__ArrowType__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=Ediamond && LA5_0<=R)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:461:2: rule__ArrowType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ArrowType__Group_1__0_in_rule__ArrowType__Group__1__Impl930);
                    rule__ArrowType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrowTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group__1__Impl"


    // $ANTLR start "rule__ArrowType__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:475:1: rule__ArrowType__Group_1__0 : rule__ArrowType__Group_1__0__Impl rule__ArrowType__Group_1__1 ;
    public final void rule__ArrowType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:479:1: ( rule__ArrowType__Group_1__0__Impl rule__ArrowType__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:480:2: rule__ArrowType__Group_1__0__Impl rule__ArrowType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArrowType__Group_1__0__Impl_in_rule__ArrowType__Group_1__0965);
            rule__ArrowType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrowType__Group_1__1_in_rule__ArrowType__Group_1__0968);
            rule__ArrowType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1__0"


    // $ANTLR start "rule__ArrowType__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:487:1: rule__ArrowType__Group_1__0__Impl : ( ( rule__ArrowType__ArrowShapesAssignment_1_0 ) ) ;
    public final void rule__ArrowType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:491:1: ( ( ( rule__ArrowType__ArrowShapesAssignment_1_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:492:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:492:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:493:1: ( rule__ArrowType__ArrowShapesAssignment_1_0 )
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:494:1: ( rule__ArrowType__ArrowShapesAssignment_1_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:494:2: rule__ArrowType__ArrowShapesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_0_in_rule__ArrowType__Group_1__0__Impl995);
            rule__ArrowType__ArrowShapesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1__0__Impl"


    // $ANTLR start "rule__ArrowType__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:504:1: rule__ArrowType__Group_1__1 : rule__ArrowType__Group_1__1__Impl ;
    public final void rule__ArrowType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:508:1: ( rule__ArrowType__Group_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:509:2: rule__ArrowType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowType__Group_1__1__Impl_in_rule__ArrowType__Group_1__11025);
            rule__ArrowType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1__1"


    // $ANTLR start "rule__ArrowType__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:515:1: rule__ArrowType__Group_1__1__Impl : ( ( rule__ArrowType__Group_1_1__0 )? ) ;
    public final void rule__ArrowType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:519:1: ( ( ( rule__ArrowType__Group_1_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:520:1: ( ( rule__ArrowType__Group_1_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:520:1: ( ( rule__ArrowType__Group_1_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:521:1: ( rule__ArrowType__Group_1_1__0 )?
            {
             before(grammarAccess.getArrowTypeAccess().getGroup_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:522:1: ( rule__ArrowType__Group_1_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=Ediamond && LA6_0<=R)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:522:2: rule__ArrowType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ArrowType__Group_1_1__0_in_rule__ArrowType__Group_1__1__Impl1052);
                    rule__ArrowType__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrowTypeAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1__1__Impl"


    // $ANTLR start "rule__ArrowType__Group_1_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:536:1: rule__ArrowType__Group_1_1__0 : rule__ArrowType__Group_1_1__0__Impl rule__ArrowType__Group_1_1__1 ;
    public final void rule__ArrowType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:540:1: ( rule__ArrowType__Group_1_1__0__Impl rule__ArrowType__Group_1_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:541:2: rule__ArrowType__Group_1_1__0__Impl rule__ArrowType__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ArrowType__Group_1_1__0__Impl_in_rule__ArrowType__Group_1_1__01087);
            rule__ArrowType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrowType__Group_1_1__1_in_rule__ArrowType__Group_1_1__01090);
            rule__ArrowType__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1_1__0"


    // $ANTLR start "rule__ArrowType__Group_1_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:548:1: rule__ArrowType__Group_1_1__0__Impl : ( ( rule__ArrowType__ArrowShapesAssignment_1_1_0 ) ) ;
    public final void rule__ArrowType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:552:1: ( ( ( rule__ArrowType__ArrowShapesAssignment_1_1_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:553:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_1_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:553:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_1_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:554:1: ( rule__ArrowType__ArrowShapesAssignment_1_1_0 )
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:555:1: ( rule__ArrowType__ArrowShapesAssignment_1_1_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:555:2: rule__ArrowType__ArrowShapesAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_1_0_in_rule__ArrowType__Group_1_1__0__Impl1117);
            rule__ArrowType__ArrowShapesAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1_1__0__Impl"


    // $ANTLR start "rule__ArrowType__Group_1_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:565:1: rule__ArrowType__Group_1_1__1 : rule__ArrowType__Group_1_1__1__Impl ;
    public final void rule__ArrowType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:569:1: ( rule__ArrowType__Group_1_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:570:2: rule__ArrowType__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrowType__Group_1_1__1__Impl_in_rule__ArrowType__Group_1_1__11147);
            rule__ArrowType__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1_1__1"


    // $ANTLR start "rule__ArrowType__Group_1_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:576:1: rule__ArrowType__Group_1_1__1__Impl : ( ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )? ) ;
    public final void rule__ArrowType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:580:1: ( ( ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:581:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:581:1: ( ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:582:1: ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )?
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:583:1: ( rule__ArrowType__ArrowShapesAssignment_1_1_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Ediamond && LA7_0<=R)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:583:2: rule__ArrowType__ArrowShapesAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_1_1_in_rule__ArrowType__Group_1_1__1__Impl1174);
                    rule__ArrowType__ArrowShapesAssignment_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__Group_1_1__1__Impl"


    // $ANTLR start "rule__ArrowShape__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:597:1: rule__ArrowShape__Group__0 : rule__ArrowShape__Group__0__Impl rule__ArrowShape__Group__1 ;
    public final void rule__ArrowShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:601:1: ( rule__ArrowShape__Group__0__Impl rule__ArrowShape__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:602:2: rule__ArrowShape__Group__0__Impl rule__ArrowShape__Group__1
            {
            pushFollow(FOLLOW_rule__ArrowShape__Group__0__Impl_in_rule__ArrowShape__Group__01209);
            rule__ArrowShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrowShape__Group__1_in_rule__ArrowShape__Group__01212);
            rule__ArrowShape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__0"


    // $ANTLR start "rule__ArrowShape__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:609:1: rule__ArrowShape__Group__0__Impl : ( ( rule__ArrowShape__OpenAssignment_0 )? ) ;
    public final void rule__ArrowShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:613:1: ( ( ( rule__ArrowShape__OpenAssignment_0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:614:1: ( ( rule__ArrowShape__OpenAssignment_0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:614:1: ( ( rule__ArrowShape__OpenAssignment_0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:615:1: ( rule__ArrowShape__OpenAssignment_0 )?
            {
             before(grammarAccess.getArrowShapeAccess().getOpenAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:616:1: ( rule__ArrowShape__OpenAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==O) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:616:2: rule__ArrowShape__OpenAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ArrowShape__OpenAssignment_0_in_rule__ArrowShape__Group__0__Impl1239);
                    rule__ArrowShape__OpenAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrowShapeAccess().getOpenAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__0__Impl"


    // $ANTLR start "rule__ArrowShape__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:626:1: rule__ArrowShape__Group__1 : rule__ArrowShape__Group__1__Impl rule__ArrowShape__Group__2 ;
    public final void rule__ArrowShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:630:1: ( rule__ArrowShape__Group__1__Impl rule__ArrowShape__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:631:2: rule__ArrowShape__Group__1__Impl rule__ArrowShape__Group__2
            {
            pushFollow(FOLLOW_rule__ArrowShape__Group__1__Impl_in_rule__ArrowShape__Group__11270);
            rule__ArrowShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrowShape__Group__2_in_rule__ArrowShape__Group__11273);
            rule__ArrowShape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__1"


    // $ANTLR start "rule__ArrowShape__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:638:1: rule__ArrowShape__Group__1__Impl : ( ( rule__ArrowShape__SideAssignment_1 )? ) ;
    public final void rule__ArrowShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:642:1: ( ( ( rule__ArrowShape__SideAssignment_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:643:1: ( ( rule__ArrowShape__SideAssignment_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:643:1: ( ( rule__ArrowShape__SideAssignment_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:644:1: ( rule__ArrowShape__SideAssignment_1 )?
            {
             before(grammarAccess.getArrowShapeAccess().getSideAssignment_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:645:1: ( rule__ArrowShape__SideAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==L||LA9_0==R) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:645:2: rule__ArrowShape__SideAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ArrowShape__SideAssignment_1_in_rule__ArrowShape__Group__1__Impl1300);
                    rule__ArrowShape__SideAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrowShapeAccess().getSideAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__1__Impl"


    // $ANTLR start "rule__ArrowShape__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:655:1: rule__ArrowShape__Group__2 : rule__ArrowShape__Group__2__Impl ;
    public final void rule__ArrowShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:659:1: ( rule__ArrowShape__Group__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:660:2: rule__ArrowShape__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrowShape__Group__2__Impl_in_rule__ArrowShape__Group__21331);
            rule__ArrowShape__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__2"


    // $ANTLR start "rule__ArrowShape__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:666:1: rule__ArrowShape__Group__2__Impl : ( ( rule__ArrowShape__ShapeAssignment_2 ) ) ;
    public final void rule__ArrowShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:670:1: ( ( ( rule__ArrowShape__ShapeAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:671:1: ( ( rule__ArrowShape__ShapeAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:671:1: ( ( rule__ArrowShape__ShapeAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:672:1: ( rule__ArrowShape__ShapeAssignment_2 )
            {
             before(grammarAccess.getArrowShapeAccess().getShapeAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:673:1: ( rule__ArrowShape__ShapeAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:673:2: rule__ArrowShape__ShapeAssignment_2
            {
            pushFollow(FOLLOW_rule__ArrowShape__ShapeAssignment_2_in_rule__ArrowShape__Group__2__Impl1358);
            rule__ArrowShape__ShapeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArrowShapeAccess().getShapeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__Group__2__Impl"


    // $ANTLR start "rule__ArrowType__ArrowShapesAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:690:1: rule__ArrowType__ArrowShapesAssignment_0 : ( ruleAbstractArrowShape ) ;
    public final void rule__ArrowType__ArrowShapesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:694:1: ( ( ruleAbstractArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:695:1: ( ruleAbstractArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:695:1: ( ruleAbstractArrowShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:696:1: ruleAbstractArrowShape
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_01399);
            ruleAbstractArrowShape();

            state._fsp--;

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__ArrowShapesAssignment_0"


    // $ANTLR start "rule__ArrowType__ArrowShapesAssignment_1_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:705:1: rule__ArrowType__ArrowShapesAssignment_1_0 : ( ruleAbstractArrowShape ) ;
    public final void rule__ArrowType__ArrowShapesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:709:1: ( ( ruleAbstractArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:710:1: ( ruleAbstractArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:710:1: ( ruleAbstractArrowShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:711:1: ruleAbstractArrowShape
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_01430);
            ruleAbstractArrowShape();

            state._fsp--;

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__ArrowShapesAssignment_1_0"


    // $ANTLR start "rule__ArrowType__ArrowShapesAssignment_1_1_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:720:1: rule__ArrowType__ArrowShapesAssignment_1_1_0 : ( ruleAbstractArrowShape ) ;
    public final void rule__ArrowType__ArrowShapesAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:724:1: ( ( ruleAbstractArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:725:1: ( ruleAbstractArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:725:1: ( ruleAbstractArrowShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:726:1: ruleAbstractArrowShape
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_1_01461);
            ruleAbstractArrowShape();

            state._fsp--;

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__ArrowShapesAssignment_1_1_0"


    // $ANTLR start "rule__ArrowType__ArrowShapesAssignment_1_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:735:1: rule__ArrowType__ArrowShapesAssignment_1_1_1 : ( ruleAbstractArrowShape ) ;
    public final void rule__ArrowType__ArrowShapesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:739:1: ( ( ruleAbstractArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:740:1: ( ruleAbstractArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:740:1: ( ruleAbstractArrowShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:741:1: ruleAbstractArrowShape
            {
             before(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_1_11492);
            ruleAbstractArrowShape();

            state._fsp--;

             after(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowType__ArrowShapesAssignment_1_1_1"


    // $ANTLR start "rule__ArrowShape__OpenAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:750:1: rule__ArrowShape__OpenAssignment_0 : ( ( O ) ) ;
    public final void rule__ArrowShape__OpenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:754:1: ( ( ( O ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:755:1: ( ( O ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:755:1: ( ( O ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:756:1: ( O )
            {
             before(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:757:1: ( O )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:758:1: O
            {
             before(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); 
            match(input,O,FOLLOW_O_in_rule__ArrowShape__OpenAssignment_01528); 
             after(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); 

            }

             after(grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__OpenAssignment_0"


    // $ANTLR start "rule__ArrowShape__SideAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:773:1: rule__ArrowShape__SideAssignment_1 : ( ( rule__ArrowShape__SideAlternatives_1_0 ) ) ;
    public final void rule__ArrowShape__SideAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:777:1: ( ( ( rule__ArrowShape__SideAlternatives_1_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:778:1: ( ( rule__ArrowShape__SideAlternatives_1_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:778:1: ( ( rule__ArrowShape__SideAlternatives_1_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:779:1: ( rule__ArrowShape__SideAlternatives_1_0 )
            {
             before(grammarAccess.getArrowShapeAccess().getSideAlternatives_1_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:780:1: ( rule__ArrowShape__SideAlternatives_1_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:780:2: rule__ArrowShape__SideAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ArrowShape__SideAlternatives_1_0_in_rule__ArrowShape__SideAssignment_11567);
            rule__ArrowShape__SideAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrowShapeAccess().getSideAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__SideAssignment_1"


    // $ANTLR start "rule__ArrowShape__ShapeAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:789:1: rule__ArrowShape__ShapeAssignment_2 : ( rulePrimitiveShape ) ;
    public final void rule__ArrowShape__ShapeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:793:1: ( ( rulePrimitiveShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:794:1: ( rulePrimitiveShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:794:1: ( rulePrimitiveShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:795:1: rulePrimitiveShape
            {
             before(grammarAccess.getArrowShapeAccess().getShapePrimitiveShapeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimitiveShape_in_rule__ArrowShape__ShapeAssignment_21600);
            rulePrimitiveShape();

            state._fsp--;

             after(grammarAccess.getArrowShapeAccess().getShapePrimitiveShapeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrowShape__ShapeAssignment_2"


    // $ANTLR start "rule__DeprecatedArrowShape__ShapeAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:804:1: rule__DeprecatedArrowShape__ShapeAssignment : ( ruleDeprecatedShape ) ;
    public final void rule__DeprecatedArrowShape__ShapeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:808:1: ( ( ruleDeprecatedShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:809:1: ( ruleDeprecatedShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:809:1: ( ruleDeprecatedShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotArrowTypeParser.g:810:1: ruleDeprecatedShape
            {
             before(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeprecatedShape_in_rule__DeprecatedArrowShape__ShapeAssignment1631);
            ruleDeprecatedShape();

            state._fsp--;

             after(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeprecatedArrowShape__ShapeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArrowType_in_entryRuleArrowType54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowType61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group__0_in_ruleArrowType91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_entryRuleAbstractArrowShape118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractArrowShape125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractArrowShape__Alternatives_in_ruleAbstractArrowShape155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowShape_in_entryRuleArrowShape182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowShape189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__0_in_ruleArrowShape219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedArrowShape_in_entryRuleDeprecatedArrowShape246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeprecatedArrowShape253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeprecatedArrowShape__ShapeAssignment_in_ruleDeprecatedArrowShape283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeprecatedShape__Alternatives_in_ruleDeprecatedShape320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveShape__Alternatives_in_rulePrimitiveShape356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowShape_in_rule__AbstractArrowShape__Alternatives391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedArrowShape_in_rule__AbstractArrowShape__Alternatives408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_in_rule__ArrowShape__SideAlternatives_1_0441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_R_in_rule__ArrowShape__SideAlternatives_1_0461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ediamond_in_rule__DeprecatedShape__Alternatives496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Open_in_rule__DeprecatedShape__Alternatives516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Halfopen_in_rule__DeprecatedShape__Alternatives536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Empty_in_rule__DeprecatedShape__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Invempty_in_rule__DeprecatedShape__Alternatives576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Box_in_rule__PrimitiveShape__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Crow_in_rule__PrimitiveShape__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Curve_in_rule__PrimitiveShape__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Icurve_in_rule__PrimitiveShape__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Diamond_in_rule__PrimitiveShape__Alternatives691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_rule__PrimitiveShape__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Inv_in_rule__PrimitiveShape__Alternatives731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_None_in_rule__PrimitiveShape__Alternatives751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Normal_in_rule__PrimitiveShape__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Tee_in_rule__PrimitiveShape__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Vee_in_rule__PrimitiveShape__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group__0__Impl_in_rule__ArrowType__Group__0843 = new BitSet(new long[]{0x00000000007FFFF0L});
    public static final BitSet FOLLOW_rule__ArrowType__Group__1_in_rule__ArrowType__Group__0846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__ArrowShapesAssignment_0_in_rule__ArrowType__Group__0__Impl873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group__1__Impl_in_rule__ArrowType__Group__1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1__0_in_rule__ArrowType__Group__1__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1__0__Impl_in_rule__ArrowType__Group_1__0965 = new BitSet(new long[]{0x00000000007FFFF0L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1__1_in_rule__ArrowType__Group_1__0968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_0_in_rule__ArrowType__Group_1__0__Impl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1__1__Impl_in_rule__ArrowType__Group_1__11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1_1__0_in_rule__ArrowType__Group_1__1__Impl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1_1__0__Impl_in_rule__ArrowType__Group_1_1__01087 = new BitSet(new long[]{0x00000000007FFFF0L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1_1__1_in_rule__ArrowType__Group_1_1__01090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_1_0_in_rule__ArrowType__Group_1_1__0__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__Group_1_1__1__Impl_in_rule__ArrowType__Group_1_1__11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowType__ArrowShapesAssignment_1_1_1_in_rule__ArrowType__Group_1_1__1__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__0__Impl_in_rule__ArrowShape__Group__01209 = new BitSet(new long[]{0x00000000007FB780L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__1_in_rule__ArrowShape__Group__01212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__OpenAssignment_0_in_rule__ArrowShape__Group__0__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__1__Impl_in_rule__ArrowShape__Group__11270 = new BitSet(new long[]{0x00000000007FB780L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__2_in_rule__ArrowShape__Group__11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__SideAssignment_1_in_rule__ArrowShape__Group__1__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__Group__2__Impl_in_rule__ArrowShape__Group__21331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__ShapeAssignment_2_in_rule__ArrowShape__Group__2__Impl1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_01430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_1_01461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_rule__ArrowType__ArrowShapesAssignment_1_1_11492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_O_in_rule__ArrowShape__OpenAssignment_01528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrowShape__SideAlternatives_1_0_in_rule__ArrowShape__SideAssignment_11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveShape_in_rule__ArrowShape__ShapeAssignment_21600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedShape_in_rule__DeprecatedArrowShape__ShapeAssignment1631 = new BitSet(new long[]{0x0000000000000002L});

}