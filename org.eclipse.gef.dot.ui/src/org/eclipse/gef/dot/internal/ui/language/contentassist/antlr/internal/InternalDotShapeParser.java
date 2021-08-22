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
import org.eclipse.gef.dot.internal.language.services.DotShapeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotShapeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Restrictionsite", "Threepoverhang", "Doubleoctagon", "Fivepoverhang", "Parallelogram", "Tripleoctagon", "Doublecircle", "Invtrapezium", "Proteasesite", "Invtriangle", "Proteinstab", "Primersite", "Terminator", "Component", "Insulator", "Lpromoter", "Noverhang", "Plaintext", "Rectangle", "Rpromoter", "Signature", "Trapezium", "Underline", "Mdiamond", "Assembly", "Cylinder", "Invhouse", "Pentagon", "Promoter", "Ribosite", "Septagon", "Triangle", "Mcircle", "Mrecord", "Msquare", "Diamond", "Ellipse", "Hexagon", "Octagon", "Polygon", "Rnastab", "Circle", "Folder", "Larrow", "Rarrow", "Record", "Square", "Box3d", "House", "Plain", "Point", "None", "Note", "Oval", "Rect", "Star", "Box", "Cds", "Egg", "Tab", "Utr", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Larrow=47;
    public static final int Proteinstab=14;
    public static final int Invhouse=30;
    public static final int Lpromoter=19;
    public static final int Mdiamond=27;
    public static final int Rectangle=22;
    public static final int Triangle=35;
    public static final int Octagon=42;
    public static final int Rarrow=48;
    public static final int Utr=64;
    public static final int Cds=61;
    public static final int Doubleoctagon=6;
    public static final int Rpromoter=23;
    public static final int Underline=26;
    public static final int Invtrapezium=11;
    public static final int Polygon=43;
    public static final int Assembly=28;
    public static final int Primersite=15;
    public static final int Circle=45;
    public static final int Rect=58;
    public static final int RULE_ID=65;
    public static final int Box3d=51;
    public static final int House=52;
    public static final int Box=60;
    public static final int Threepoverhang=5;
    public static final int Square=50;
    public static final int Ribosite=33;
    public static final int Fivepoverhang=7;
    public static final int Plain=53;
    public static final int RULE_INT=66;
    public static final int Note=56;
    public static final int RULE_ML_COMMENT=68;
    public static final int Ellipse=40;
    public static final int Insulator=18;
    public static final int Restrictionsite=4;
    public static final int Msquare=38;
    public static final int Parallelogram=8;
    public static final int Rnastab=44;
    public static final int Terminator=16;
    public static final int RULE_STRING=67;
    public static final int Folder=46;
    public static final int Invtriangle=13;
    public static final int RULE_SL_COMMENT=69;
    public static final int Promoter=32;
    public static final int Star=59;
    public static final int Oval=57;
    public static final int Plaintext=21;
    public static final int Pentagon=31;
    public static final int Mrecord=37;
    public static final int Record=49;
    public static final int Doublecircle=10;
    public static final int Component=17;
    public static final int EOF=-1;
    public static final int Trapezium=25;
    public static final int Hexagon=41;
    public static final int Egg=62;
    public static final int RULE_WS=70;
    public static final int Diamond=39;
    public static final int Point=54;
    public static final int RULE_ANY_OTHER=71;
    public static final int Cylinder=29;
    public static final int Mcircle=36;
    public static final int Tab=63;
    public static final int Tripleoctagon=9;
    public static final int Proteasesite=12;
    public static final int Signature=24;
    public static final int Noverhang=20;
    public static final int Septagon=34;
    public static final int None=55;

    // delegates
    // delegators


        public InternalDotShapeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotShapeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotShapeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g"; }


     
     	private DotShapeGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("Box", "'box'");
    		tokenNameToValue.put("Cds", "'cds'");
    		tokenNameToValue.put("Egg", "'egg'");
    		tokenNameToValue.put("Tab", "'tab'");
    		tokenNameToValue.put("Utr", "'utr'");
    		tokenNameToValue.put("None", "'none'");
    		tokenNameToValue.put("Note", "'note'");
    		tokenNameToValue.put("Oval", "'oval'");
    		tokenNameToValue.put("Rect", "'rect'");
    		tokenNameToValue.put("Star", "'star'");
    		tokenNameToValue.put("Box3d", "'box3d'");
    		tokenNameToValue.put("House", "'house'");
    		tokenNameToValue.put("Plain", "'plain'");
    		tokenNameToValue.put("Point", "'point'");
    		tokenNameToValue.put("Circle", "'circle'");
    		tokenNameToValue.put("Folder", "'folder'");
    		tokenNameToValue.put("Larrow", "'larrow'");
    		tokenNameToValue.put("Rarrow", "'rarrow'");
    		tokenNameToValue.put("Record", "'record'");
    		tokenNameToValue.put("Square", "'square'");
    		tokenNameToValue.put("Mcircle", "'Mcircle'");
    		tokenNameToValue.put("Mrecord", "'Mrecord'");
    		tokenNameToValue.put("Msquare", "'Msquare'");
    		tokenNameToValue.put("Diamond", "'diamond'");
    		tokenNameToValue.put("Ellipse", "'ellipse'");
    		tokenNameToValue.put("Hexagon", "'hexagon'");
    		tokenNameToValue.put("Octagon", "'octagon'");
    		tokenNameToValue.put("Polygon", "'polygon'");
    		tokenNameToValue.put("Rnastab", "'rnastab'");
    		tokenNameToValue.put("Mdiamond", "'Mdiamond'");
    		tokenNameToValue.put("Assembly", "'assembly'");
    		tokenNameToValue.put("Cylinder", "'cylinder'");
    		tokenNameToValue.put("Invhouse", "'invhouse'");
    		tokenNameToValue.put("Pentagon", "'pentagon'");
    		tokenNameToValue.put("Promoter", "'promoter'");
    		tokenNameToValue.put("Ribosite", "'ribosite'");
    		tokenNameToValue.put("Septagon", "'septagon'");
    		tokenNameToValue.put("Triangle", "'triangle'");
    		tokenNameToValue.put("Component", "'component'");
    		tokenNameToValue.put("Insulator", "'insulator'");
    		tokenNameToValue.put("Lpromoter", "'lpromoter'");
    		tokenNameToValue.put("Noverhang", "'noverhang'");
    		tokenNameToValue.put("Plaintext", "'plaintext'");
    		tokenNameToValue.put("Rectangle", "'rectangle'");
    		tokenNameToValue.put("Rpromoter", "'rpromoter'");
    		tokenNameToValue.put("Signature", "'signature'");
    		tokenNameToValue.put("Trapezium", "'trapezium'");
    		tokenNameToValue.put("Underline", "'underline'");
    		tokenNameToValue.put("Primersite", "'primersite'");
    		tokenNameToValue.put("Terminator", "'terminator'");
    		tokenNameToValue.put("Invtriangle", "'invtriangle'");
    		tokenNameToValue.put("Proteinstab", "'proteinstab'");
    		tokenNameToValue.put("Doublecircle", "'doublecircle'");
    		tokenNameToValue.put("Invtrapezium", "'invtrapezium'");
    		tokenNameToValue.put("Proteasesite", "'proteasesite'");
    		tokenNameToValue.put("Doubleoctagon", "'doubleoctagon'");
    		tokenNameToValue.put("Fivepoverhang", "'fivepoverhang'");
    		tokenNameToValue.put("Parallelogram", "'parallelogram'");
    		tokenNameToValue.put("Tripleoctagon", "'tripleoctagon'");
    		tokenNameToValue.put("Threepoverhang", "'threepoverhang'");
    		tokenNameToValue.put("Restrictionsite", "'restrictionsite'");
     	}
     	
        public void setGrammarAccess(DotShapeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:124:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:125:1: ( ruleShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:126:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_ruleShape_in_entryRuleShape54);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShape61); 

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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:133:1: ruleShape : ( ( rule__Shape__ShapeAssignment ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:137:5: ( ( ( rule__Shape__ShapeAssignment ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:138:1: ( ( rule__Shape__ShapeAssignment ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:138:1: ( ( rule__Shape__ShapeAssignment ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:139:1: ( rule__Shape__ShapeAssignment )
            {
             before(grammarAccess.getShapeAccess().getShapeAssignment()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:140:1: ( rule__Shape__ShapeAssignment )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:140:2: rule__Shape__ShapeAssignment
            {
            pushFollow(FOLLOW_rule__Shape__ShapeAssignment_in_ruleShape91);
            rule__Shape__ShapeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getShapeAssignment()); 

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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRulePolygonBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:152:1: entryRulePolygonBasedShape : rulePolygonBasedShape EOF ;
    public final void entryRulePolygonBasedShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:153:1: ( rulePolygonBasedShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:154:1: rulePolygonBasedShape EOF
            {
             before(grammarAccess.getPolygonBasedShapeRule()); 
            pushFollow(FOLLOW_rulePolygonBasedShape_in_entryRulePolygonBasedShape118);
            rulePolygonBasedShape();

            state._fsp--;

             after(grammarAccess.getPolygonBasedShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolygonBasedShape125); 

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
    // $ANTLR end "entryRulePolygonBasedShape"


    // $ANTLR start "rulePolygonBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:161:1: rulePolygonBasedShape : ( ( rule__PolygonBasedShape__ShapeAssignment ) ) ;
    public final void rulePolygonBasedShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:165:5: ( ( ( rule__PolygonBasedShape__ShapeAssignment ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:166:1: ( ( rule__PolygonBasedShape__ShapeAssignment ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:166:1: ( ( rule__PolygonBasedShape__ShapeAssignment ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:167:1: ( rule__PolygonBasedShape__ShapeAssignment )
            {
             before(grammarAccess.getPolygonBasedShapeAccess().getShapeAssignment()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:168:1: ( rule__PolygonBasedShape__ShapeAssignment )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:168:2: rule__PolygonBasedShape__ShapeAssignment
            {
            pushFollow(FOLLOW_rule__PolygonBasedShape__ShapeAssignment_in_rulePolygonBasedShape155);
            rule__PolygonBasedShape__ShapeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPolygonBasedShapeAccess().getShapeAssignment()); 

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
    // $ANTLR end "rulePolygonBasedShape"


    // $ANTLR start "entryRuleRecordBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:180:1: entryRuleRecordBasedShape : ruleRecordBasedShape EOF ;
    public final void entryRuleRecordBasedShape() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:181:1: ( ruleRecordBasedShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:182:1: ruleRecordBasedShape EOF
            {
             before(grammarAccess.getRecordBasedShapeRule()); 
            pushFollow(FOLLOW_ruleRecordBasedShape_in_entryRuleRecordBasedShape182);
            ruleRecordBasedShape();

            state._fsp--;

             after(grammarAccess.getRecordBasedShapeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordBasedShape189); 

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
    // $ANTLR end "entryRuleRecordBasedShape"


    // $ANTLR start "ruleRecordBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:189:1: ruleRecordBasedShape : ( ( rule__RecordBasedShape__ShapeAssignment ) ) ;
    public final void ruleRecordBasedShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:193:5: ( ( ( rule__RecordBasedShape__ShapeAssignment ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:194:1: ( ( rule__RecordBasedShape__ShapeAssignment ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:194:1: ( ( rule__RecordBasedShape__ShapeAssignment ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:195:1: ( rule__RecordBasedShape__ShapeAssignment )
            {
             before(grammarAccess.getRecordBasedShapeAccess().getShapeAssignment()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:196:1: ( rule__RecordBasedShape__ShapeAssignment )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:196:2: rule__RecordBasedShape__ShapeAssignment
            {
            pushFollow(FOLLOW_rule__RecordBasedShape__ShapeAssignment_in_ruleRecordBasedShape219);
            rule__RecordBasedShape__ShapeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRecordBasedShapeAccess().getShapeAssignment()); 

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
    // $ANTLR end "ruleRecordBasedShape"


    // $ANTLR start "rulePolygonBasedNodeShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:209:1: rulePolygonBasedNodeShape : ( ( rule__PolygonBasedNodeShape__Alternatives ) ) ;
    public final void rulePolygonBasedNodeShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:213:1: ( ( ( rule__PolygonBasedNodeShape__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:214:1: ( ( rule__PolygonBasedNodeShape__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:214:1: ( ( rule__PolygonBasedNodeShape__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:215:1: ( rule__PolygonBasedNodeShape__Alternatives )
            {
             before(grammarAccess.getPolygonBasedNodeShapeAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:216:1: ( rule__PolygonBasedNodeShape__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:216:2: rule__PolygonBasedNodeShape__Alternatives
            {
            pushFollow(FOLLOW_rule__PolygonBasedNodeShape__Alternatives_in_rulePolygonBasedNodeShape256);
            rule__PolygonBasedNodeShape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPolygonBasedNodeShapeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePolygonBasedNodeShape"


    // $ANTLR start "ruleRecordBasedNodeShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:228:1: ruleRecordBasedNodeShape : ( ( rule__RecordBasedNodeShape__Alternatives ) ) ;
    public final void ruleRecordBasedNodeShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:232:1: ( ( ( rule__RecordBasedNodeShape__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:233:1: ( ( rule__RecordBasedNodeShape__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:233:1: ( ( rule__RecordBasedNodeShape__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:234:1: ( rule__RecordBasedNodeShape__Alternatives )
            {
             before(grammarAccess.getRecordBasedNodeShapeAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:235:1: ( rule__RecordBasedNodeShape__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:235:2: rule__RecordBasedNodeShape__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordBasedNodeShape__Alternatives_in_ruleRecordBasedNodeShape292);
            rule__RecordBasedNodeShape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecordBasedNodeShapeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRecordBasedNodeShape"


    // $ANTLR start "rule__Shape__ShapeAlternatives_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:246:1: rule__Shape__ShapeAlternatives_0 : ( ( rulePolygonBasedShape ) | ( ruleRecordBasedShape ) );
    public final void rule__Shape__ShapeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:250:1: ( ( rulePolygonBasedShape ) | ( ruleRecordBasedShape ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=Restrictionsite && LA1_0<=Mcircle)||(LA1_0>=Msquare && LA1_0<=Rarrow)||(LA1_0>=Square && LA1_0<=Utr)) ) {
                alt1=1;
            }
            else if ( (LA1_0==Mrecord||LA1_0==Record) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:251:1: ( rulePolygonBasedShape )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:251:1: ( rulePolygonBasedShape )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:252:1: rulePolygonBasedShape
                    {
                     before(grammarAccess.getShapeAccess().getShapePolygonBasedShapeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulePolygonBasedShape_in_rule__Shape__ShapeAlternatives_0327);
                    rulePolygonBasedShape();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getShapePolygonBasedShapeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:257:6: ( ruleRecordBasedShape )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:257:6: ( ruleRecordBasedShape )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:258:1: ruleRecordBasedShape
                    {
                     before(grammarAccess.getShapeAccess().getShapeRecordBasedShapeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleRecordBasedShape_in_rule__Shape__ShapeAlternatives_0344);
                    ruleRecordBasedShape();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getShapeRecordBasedShapeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Shape__ShapeAlternatives_0"


    // $ANTLR start "rule__PolygonBasedNodeShape__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:268:1: rule__PolygonBasedNodeShape__Alternatives : ( ( ( Box ) ) | ( ( Polygon ) ) | ( ( Ellipse ) ) | ( ( Oval ) ) | ( ( Circle ) ) | ( ( Point ) ) | ( ( Egg ) ) | ( ( Triangle ) ) | ( ( Plaintext ) ) | ( ( Plain ) ) | ( ( Diamond ) ) | ( ( Trapezium ) ) | ( ( Parallelogram ) ) | ( ( House ) ) | ( ( Pentagon ) ) | ( ( Hexagon ) ) | ( ( Septagon ) ) | ( ( Octagon ) ) | ( ( Doublecircle ) ) | ( ( Doubleoctagon ) ) | ( ( Tripleoctagon ) ) | ( ( Invtriangle ) ) | ( ( Invtrapezium ) ) | ( ( Invhouse ) ) | ( ( Mdiamond ) ) | ( ( Msquare ) ) | ( ( Mcircle ) ) | ( ( Rect ) ) | ( ( Rectangle ) ) | ( ( Square ) ) | ( ( Star ) ) | ( ( None ) ) | ( ( Underline ) ) | ( ( Cylinder ) ) | ( ( Note ) ) | ( ( Tab ) ) | ( ( Folder ) ) | ( ( Box3d ) ) | ( ( Component ) ) | ( ( Promoter ) ) | ( ( Cds ) ) | ( ( Terminator ) ) | ( ( Utr ) ) | ( ( Primersite ) ) | ( ( Restrictionsite ) ) | ( ( Fivepoverhang ) ) | ( ( Threepoverhang ) ) | ( ( Noverhang ) ) | ( ( Assembly ) ) | ( ( Signature ) ) | ( ( Insulator ) ) | ( ( Ribosite ) ) | ( ( Rnastab ) ) | ( ( Proteasesite ) ) | ( ( Proteinstab ) ) | ( ( Rpromoter ) ) | ( ( Rarrow ) ) | ( ( Larrow ) ) | ( ( Lpromoter ) ) );
    public final void rule__PolygonBasedNodeShape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:272:1: ( ( ( Box ) ) | ( ( Polygon ) ) | ( ( Ellipse ) ) | ( ( Oval ) ) | ( ( Circle ) ) | ( ( Point ) ) | ( ( Egg ) ) | ( ( Triangle ) ) | ( ( Plaintext ) ) | ( ( Plain ) ) | ( ( Diamond ) ) | ( ( Trapezium ) ) | ( ( Parallelogram ) ) | ( ( House ) ) | ( ( Pentagon ) ) | ( ( Hexagon ) ) | ( ( Septagon ) ) | ( ( Octagon ) ) | ( ( Doublecircle ) ) | ( ( Doubleoctagon ) ) | ( ( Tripleoctagon ) ) | ( ( Invtriangle ) ) | ( ( Invtrapezium ) ) | ( ( Invhouse ) ) | ( ( Mdiamond ) ) | ( ( Msquare ) ) | ( ( Mcircle ) ) | ( ( Rect ) ) | ( ( Rectangle ) ) | ( ( Square ) ) | ( ( Star ) ) | ( ( None ) ) | ( ( Underline ) ) | ( ( Cylinder ) ) | ( ( Note ) ) | ( ( Tab ) ) | ( ( Folder ) ) | ( ( Box3d ) ) | ( ( Component ) ) | ( ( Promoter ) ) | ( ( Cds ) ) | ( ( Terminator ) ) | ( ( Utr ) ) | ( ( Primersite ) ) | ( ( Restrictionsite ) ) | ( ( Fivepoverhang ) ) | ( ( Threepoverhang ) ) | ( ( Noverhang ) ) | ( ( Assembly ) ) | ( ( Signature ) ) | ( ( Insulator ) ) | ( ( Ribosite ) ) | ( ( Rnastab ) ) | ( ( Proteasesite ) ) | ( ( Proteinstab ) ) | ( ( Rpromoter ) ) | ( ( Rarrow ) ) | ( ( Larrow ) ) | ( ( Lpromoter ) ) )
            int alt2=59;
            switch ( input.LA(1) ) {
            case Box:
                {
                alt2=1;
                }
                break;
            case Polygon:
                {
                alt2=2;
                }
                break;
            case Ellipse:
                {
                alt2=3;
                }
                break;
            case Oval:
                {
                alt2=4;
                }
                break;
            case Circle:
                {
                alt2=5;
                }
                break;
            case Point:
                {
                alt2=6;
                }
                break;
            case Egg:
                {
                alt2=7;
                }
                break;
            case Triangle:
                {
                alt2=8;
                }
                break;
            case Plaintext:
                {
                alt2=9;
                }
                break;
            case Plain:
                {
                alt2=10;
                }
                break;
            case Diamond:
                {
                alt2=11;
                }
                break;
            case Trapezium:
                {
                alt2=12;
                }
                break;
            case Parallelogram:
                {
                alt2=13;
                }
                break;
            case House:
                {
                alt2=14;
                }
                break;
            case Pentagon:
                {
                alt2=15;
                }
                break;
            case Hexagon:
                {
                alt2=16;
                }
                break;
            case Septagon:
                {
                alt2=17;
                }
                break;
            case Octagon:
                {
                alt2=18;
                }
                break;
            case Doublecircle:
                {
                alt2=19;
                }
                break;
            case Doubleoctagon:
                {
                alt2=20;
                }
                break;
            case Tripleoctagon:
                {
                alt2=21;
                }
                break;
            case Invtriangle:
                {
                alt2=22;
                }
                break;
            case Invtrapezium:
                {
                alt2=23;
                }
                break;
            case Invhouse:
                {
                alt2=24;
                }
                break;
            case Mdiamond:
                {
                alt2=25;
                }
                break;
            case Msquare:
                {
                alt2=26;
                }
                break;
            case Mcircle:
                {
                alt2=27;
                }
                break;
            case Rect:
                {
                alt2=28;
                }
                break;
            case Rectangle:
                {
                alt2=29;
                }
                break;
            case Square:
                {
                alt2=30;
                }
                break;
            case Star:
                {
                alt2=31;
                }
                break;
            case None:
                {
                alt2=32;
                }
                break;
            case Underline:
                {
                alt2=33;
                }
                break;
            case Cylinder:
                {
                alt2=34;
                }
                break;
            case Note:
                {
                alt2=35;
                }
                break;
            case Tab:
                {
                alt2=36;
                }
                break;
            case Folder:
                {
                alt2=37;
                }
                break;
            case Box3d:
                {
                alt2=38;
                }
                break;
            case Component:
                {
                alt2=39;
                }
                break;
            case Promoter:
                {
                alt2=40;
                }
                break;
            case Cds:
                {
                alt2=41;
                }
                break;
            case Terminator:
                {
                alt2=42;
                }
                break;
            case Utr:
                {
                alt2=43;
                }
                break;
            case Primersite:
                {
                alt2=44;
                }
                break;
            case Restrictionsite:
                {
                alt2=45;
                }
                break;
            case Fivepoverhang:
                {
                alt2=46;
                }
                break;
            case Threepoverhang:
                {
                alt2=47;
                }
                break;
            case Noverhang:
                {
                alt2=48;
                }
                break;
            case Assembly:
                {
                alt2=49;
                }
                break;
            case Signature:
                {
                alt2=50;
                }
                break;
            case Insulator:
                {
                alt2=51;
                }
                break;
            case Ribosite:
                {
                alt2=52;
                }
                break;
            case Rnastab:
                {
                alt2=53;
                }
                break;
            case Proteasesite:
                {
                alt2=54;
                }
                break;
            case Proteinstab:
                {
                alt2=55;
                }
                break;
            case Rpromoter:
                {
                alt2=56;
                }
                break;
            case Rarrow:
                {
                alt2=57;
                }
                break;
            case Larrow:
                {
                alt2=58;
                }
                break;
            case Lpromoter:
                {
                alt2=59;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:273:1: ( ( Box ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:273:1: ( ( Box ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:274:1: ( Box )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getBoxEnumLiteralDeclaration_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:275:1: ( Box )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:275:3: Box
                    {
                    match(input,Box,FOLLOW_Box_in_rule__PolygonBasedNodeShape__Alternatives377); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getBoxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:280:6: ( ( Polygon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:280:6: ( ( Polygon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:281:1: ( Polygon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPolygonEnumLiteralDeclaration_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:282:1: ( Polygon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:282:3: Polygon
                    {
                    match(input,Polygon,FOLLOW_Polygon_in_rule__PolygonBasedNodeShape__Alternatives397); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPolygonEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:287:6: ( ( Ellipse ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:287:6: ( ( Ellipse ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:288:1: ( Ellipse )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getEllipseEnumLiteralDeclaration_2()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:289:1: ( Ellipse )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:289:3: Ellipse
                    {
                    match(input,Ellipse,FOLLOW_Ellipse_in_rule__PolygonBasedNodeShape__Alternatives417); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getEllipseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:294:6: ( ( Oval ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:294:6: ( ( Oval ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:295:1: ( Oval )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getOvalEnumLiteralDeclaration_3()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:296:1: ( Oval )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:296:3: Oval
                    {
                    match(input,Oval,FOLLOW_Oval_in_rule__PolygonBasedNodeShape__Alternatives437); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getOvalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:301:6: ( ( Circle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:301:6: ( ( Circle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:302:1: ( Circle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getCircleEnumLiteralDeclaration_4()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:303:1: ( Circle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:303:3: Circle
                    {
                    match(input,Circle,FOLLOW_Circle_in_rule__PolygonBasedNodeShape__Alternatives457); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getCircleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:308:6: ( ( Point ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:308:6: ( ( Point ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:309:1: ( Point )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPointEnumLiteralDeclaration_5()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:310:1: ( Point )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:310:3: Point
                    {
                    match(input,Point,FOLLOW_Point_in_rule__PolygonBasedNodeShape__Alternatives477); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPointEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:315:6: ( ( Egg ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:315:6: ( ( Egg ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:316:1: ( Egg )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getEggEnumLiteralDeclaration_6()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:317:1: ( Egg )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:317:3: Egg
                    {
                    match(input,Egg,FOLLOW_Egg_in_rule__PolygonBasedNodeShape__Alternatives497); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getEggEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:322:6: ( ( Triangle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:322:6: ( ( Triangle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:323:1: ( Triangle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getTriangleEnumLiteralDeclaration_7()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:324:1: ( Triangle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:324:3: Triangle
                    {
                    match(input,Triangle,FOLLOW_Triangle_in_rule__PolygonBasedNodeShape__Alternatives517); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getTriangleEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:329:6: ( ( Plaintext ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:329:6: ( ( Plaintext ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:330:1: ( Plaintext )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPlaintextEnumLiteralDeclaration_8()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:331:1: ( Plaintext )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:331:3: Plaintext
                    {
                    match(input,Plaintext,FOLLOW_Plaintext_in_rule__PolygonBasedNodeShape__Alternatives537); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPlaintextEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:336:6: ( ( Plain ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:336:6: ( ( Plain ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:337:1: ( Plain )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPlainEnumLiteralDeclaration_9()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:338:1: ( Plain )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:338:3: Plain
                    {
                    match(input,Plain,FOLLOW_Plain_in_rule__PolygonBasedNodeShape__Alternatives557); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPlainEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:343:6: ( ( Diamond ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:343:6: ( ( Diamond ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:344:1: ( Diamond )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getDiamondEnumLiteralDeclaration_10()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:345:1: ( Diamond )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:345:3: Diamond
                    {
                    match(input,Diamond,FOLLOW_Diamond_in_rule__PolygonBasedNodeShape__Alternatives577); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getDiamondEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:350:6: ( ( Trapezium ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:350:6: ( ( Trapezium ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:351:1: ( Trapezium )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getTrapeziumEnumLiteralDeclaration_11()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:352:1: ( Trapezium )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:352:3: Trapezium
                    {
                    match(input,Trapezium,FOLLOW_Trapezium_in_rule__PolygonBasedNodeShape__Alternatives597); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getTrapeziumEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:357:6: ( ( Parallelogram ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:357:6: ( ( Parallelogram ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:358:1: ( Parallelogram )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getParallelogramEnumLiteralDeclaration_12()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:359:1: ( Parallelogram )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:359:3: Parallelogram
                    {
                    match(input,Parallelogram,FOLLOW_Parallelogram_in_rule__PolygonBasedNodeShape__Alternatives617); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getParallelogramEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:364:6: ( ( House ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:364:6: ( ( House ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:365:1: ( House )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getHouseEnumLiteralDeclaration_13()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:366:1: ( House )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:366:3: House
                    {
                    match(input,House,FOLLOW_House_in_rule__PolygonBasedNodeShape__Alternatives637); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getHouseEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:371:6: ( ( Pentagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:371:6: ( ( Pentagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:372:1: ( Pentagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPentagonEnumLiteralDeclaration_14()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:373:1: ( Pentagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:373:3: Pentagon
                    {
                    match(input,Pentagon,FOLLOW_Pentagon_in_rule__PolygonBasedNodeShape__Alternatives657); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPentagonEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:378:6: ( ( Hexagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:378:6: ( ( Hexagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:379:1: ( Hexagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getHexagonEnumLiteralDeclaration_15()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:380:1: ( Hexagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:380:3: Hexagon
                    {
                    match(input,Hexagon,FOLLOW_Hexagon_in_rule__PolygonBasedNodeShape__Alternatives677); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getHexagonEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:385:6: ( ( Septagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:385:6: ( ( Septagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:386:1: ( Septagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getSeptagonEnumLiteralDeclaration_16()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:387:1: ( Septagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:387:3: Septagon
                    {
                    match(input,Septagon,FOLLOW_Septagon_in_rule__PolygonBasedNodeShape__Alternatives697); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getSeptagonEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:392:6: ( ( Octagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:392:6: ( ( Octagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:393:1: ( Octagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getOctagonEnumLiteralDeclaration_17()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:394:1: ( Octagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:394:3: Octagon
                    {
                    match(input,Octagon,FOLLOW_Octagon_in_rule__PolygonBasedNodeShape__Alternatives717); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getOctagonEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:399:6: ( ( Doublecircle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:399:6: ( ( Doublecircle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:400:1: ( Doublecircle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getDoublecircleEnumLiteralDeclaration_18()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:401:1: ( Doublecircle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:401:3: Doublecircle
                    {
                    match(input,Doublecircle,FOLLOW_Doublecircle_in_rule__PolygonBasedNodeShape__Alternatives737); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getDoublecircleEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:406:6: ( ( Doubleoctagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:406:6: ( ( Doubleoctagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:407:1: ( Doubleoctagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getDoubleoctagonEnumLiteralDeclaration_19()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:408:1: ( Doubleoctagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:408:3: Doubleoctagon
                    {
                    match(input,Doubleoctagon,FOLLOW_Doubleoctagon_in_rule__PolygonBasedNodeShape__Alternatives757); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getDoubleoctagonEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:413:6: ( ( Tripleoctagon ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:413:6: ( ( Tripleoctagon ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:414:1: ( Tripleoctagon )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getTripleoctagonEnumLiteralDeclaration_20()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:415:1: ( Tripleoctagon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:415:3: Tripleoctagon
                    {
                    match(input,Tripleoctagon,FOLLOW_Tripleoctagon_in_rule__PolygonBasedNodeShape__Alternatives777); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getTripleoctagonEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:420:6: ( ( Invtriangle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:420:6: ( ( Invtriangle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:421:1: ( Invtriangle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getInvtriangleEnumLiteralDeclaration_21()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:422:1: ( Invtriangle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:422:3: Invtriangle
                    {
                    match(input,Invtriangle,FOLLOW_Invtriangle_in_rule__PolygonBasedNodeShape__Alternatives797); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getInvtriangleEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:427:6: ( ( Invtrapezium ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:427:6: ( ( Invtrapezium ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:428:1: ( Invtrapezium )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getInvtrapeziumEnumLiteralDeclaration_22()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:429:1: ( Invtrapezium )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:429:3: Invtrapezium
                    {
                    match(input,Invtrapezium,FOLLOW_Invtrapezium_in_rule__PolygonBasedNodeShape__Alternatives817); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getInvtrapeziumEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:434:6: ( ( Invhouse ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:434:6: ( ( Invhouse ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:435:1: ( Invhouse )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getInvhouseEnumLiteralDeclaration_23()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:436:1: ( Invhouse )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:436:3: Invhouse
                    {
                    match(input,Invhouse,FOLLOW_Invhouse_in_rule__PolygonBasedNodeShape__Alternatives837); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getInvhouseEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:441:6: ( ( Mdiamond ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:441:6: ( ( Mdiamond ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:442:1: ( Mdiamond )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getMdiamondEnumLiteralDeclaration_24()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:443:1: ( Mdiamond )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:443:3: Mdiamond
                    {
                    match(input,Mdiamond,FOLLOW_Mdiamond_in_rule__PolygonBasedNodeShape__Alternatives857); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getMdiamondEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:448:6: ( ( Msquare ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:448:6: ( ( Msquare ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:449:1: ( Msquare )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getMsquareEnumLiteralDeclaration_25()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:450:1: ( Msquare )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:450:3: Msquare
                    {
                    match(input,Msquare,FOLLOW_Msquare_in_rule__PolygonBasedNodeShape__Alternatives877); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getMsquareEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:455:6: ( ( Mcircle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:455:6: ( ( Mcircle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:456:1: ( Mcircle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getMcircleEnumLiteralDeclaration_26()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:457:1: ( Mcircle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:457:3: Mcircle
                    {
                    match(input,Mcircle,FOLLOW_Mcircle_in_rule__PolygonBasedNodeShape__Alternatives897); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getMcircleEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:462:6: ( ( Rect ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:462:6: ( ( Rect ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:463:1: ( Rect )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRectEnumLiteralDeclaration_27()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:464:1: ( Rect )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:464:3: Rect
                    {
                    match(input,Rect,FOLLOW_Rect_in_rule__PolygonBasedNodeShape__Alternatives917); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRectEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:469:6: ( ( Rectangle ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:469:6: ( ( Rectangle ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:470:1: ( Rectangle )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRectangleEnumLiteralDeclaration_28()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:471:1: ( Rectangle )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:471:3: Rectangle
                    {
                    match(input,Rectangle,FOLLOW_Rectangle_in_rule__PolygonBasedNodeShape__Alternatives937); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRectangleEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:476:6: ( ( Square ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:476:6: ( ( Square ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:477:1: ( Square )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getSquareEnumLiteralDeclaration_29()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:478:1: ( Square )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:478:3: Square
                    {
                    match(input,Square,FOLLOW_Square_in_rule__PolygonBasedNodeShape__Alternatives957); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getSquareEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:483:6: ( ( Star ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:483:6: ( ( Star ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:484:1: ( Star )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getStarEnumLiteralDeclaration_30()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:485:1: ( Star )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:485:3: Star
                    {
                    match(input,Star,FOLLOW_Star_in_rule__PolygonBasedNodeShape__Alternatives977); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getStarEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:490:6: ( ( None ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:490:6: ( ( None ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:491:1: ( None )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getNoneEnumLiteralDeclaration_31()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:492:1: ( None )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:492:3: None
                    {
                    match(input,None,FOLLOW_None_in_rule__PolygonBasedNodeShape__Alternatives997); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getNoneEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:497:6: ( ( Underline ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:497:6: ( ( Underline ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:498:1: ( Underline )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getUnderlineEnumLiteralDeclaration_32()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:499:1: ( Underline )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:499:3: Underline
                    {
                    match(input,Underline,FOLLOW_Underline_in_rule__PolygonBasedNodeShape__Alternatives1017); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getUnderlineEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:504:6: ( ( Cylinder ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:504:6: ( ( Cylinder ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:505:1: ( Cylinder )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getCylinderEnumLiteralDeclaration_33()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:506:1: ( Cylinder )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:506:3: Cylinder
                    {
                    match(input,Cylinder,FOLLOW_Cylinder_in_rule__PolygonBasedNodeShape__Alternatives1037); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getCylinderEnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:511:6: ( ( Note ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:511:6: ( ( Note ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:512:1: ( Note )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getNoteEnumLiteralDeclaration_34()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:513:1: ( Note )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:513:3: Note
                    {
                    match(input,Note,FOLLOW_Note_in_rule__PolygonBasedNodeShape__Alternatives1057); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getNoteEnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:518:6: ( ( Tab ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:518:6: ( ( Tab ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:519:1: ( Tab )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getTabEnumLiteralDeclaration_35()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:520:1: ( Tab )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:520:3: Tab
                    {
                    match(input,Tab,FOLLOW_Tab_in_rule__PolygonBasedNodeShape__Alternatives1077); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getTabEnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:525:6: ( ( Folder ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:525:6: ( ( Folder ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:526:1: ( Folder )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getFolderEnumLiteralDeclaration_36()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:527:1: ( Folder )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:527:3: Folder
                    {
                    match(input,Folder,FOLLOW_Folder_in_rule__PolygonBasedNodeShape__Alternatives1097); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getFolderEnumLiteralDeclaration_36()); 

                    }


                    }
                    break;
                case 38 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:532:6: ( ( Box3d ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:532:6: ( ( Box3d ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:533:1: ( Box3d )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getBox3dEnumLiteralDeclaration_37()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:534:1: ( Box3d )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:534:3: Box3d
                    {
                    match(input,Box3d,FOLLOW_Box3d_in_rule__PolygonBasedNodeShape__Alternatives1117); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getBox3dEnumLiteralDeclaration_37()); 

                    }


                    }
                    break;
                case 39 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:539:6: ( ( Component ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:539:6: ( ( Component ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:540:1: ( Component )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getComponentEnumLiteralDeclaration_38()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:541:1: ( Component )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:541:3: Component
                    {
                    match(input,Component,FOLLOW_Component_in_rule__PolygonBasedNodeShape__Alternatives1137); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getComponentEnumLiteralDeclaration_38()); 

                    }


                    }
                    break;
                case 40 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:546:6: ( ( Promoter ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:546:6: ( ( Promoter ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:547:1: ( Promoter )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPromoterEnumLiteralDeclaration_39()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:548:1: ( Promoter )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:548:3: Promoter
                    {
                    match(input,Promoter,FOLLOW_Promoter_in_rule__PolygonBasedNodeShape__Alternatives1157); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPromoterEnumLiteralDeclaration_39()); 

                    }


                    }
                    break;
                case 41 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:553:6: ( ( Cds ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:553:6: ( ( Cds ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:554:1: ( Cds )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getCdsEnumLiteralDeclaration_40()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:555:1: ( Cds )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:555:3: Cds
                    {
                    match(input,Cds,FOLLOW_Cds_in_rule__PolygonBasedNodeShape__Alternatives1177); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getCdsEnumLiteralDeclaration_40()); 

                    }


                    }
                    break;
                case 42 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:560:6: ( ( Terminator ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:560:6: ( ( Terminator ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:561:1: ( Terminator )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getTerminatorEnumLiteralDeclaration_41()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:562:1: ( Terminator )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:562:3: Terminator
                    {
                    match(input,Terminator,FOLLOW_Terminator_in_rule__PolygonBasedNodeShape__Alternatives1197); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getTerminatorEnumLiteralDeclaration_41()); 

                    }


                    }
                    break;
                case 43 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:567:6: ( ( Utr ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:567:6: ( ( Utr ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:568:1: ( Utr )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getUtrEnumLiteralDeclaration_42()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:569:1: ( Utr )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:569:3: Utr
                    {
                    match(input,Utr,FOLLOW_Utr_in_rule__PolygonBasedNodeShape__Alternatives1217); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getUtrEnumLiteralDeclaration_42()); 

                    }


                    }
                    break;
                case 44 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:574:6: ( ( Primersite ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:574:6: ( ( Primersite ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:575:1: ( Primersite )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getPrimersiteEnumLiteralDeclaration_43()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:576:1: ( Primersite )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:576:3: Primersite
                    {
                    match(input,Primersite,FOLLOW_Primersite_in_rule__PolygonBasedNodeShape__Alternatives1237); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getPrimersiteEnumLiteralDeclaration_43()); 

                    }


                    }
                    break;
                case 45 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:581:6: ( ( Restrictionsite ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:581:6: ( ( Restrictionsite ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:582:1: ( Restrictionsite )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRestrictionsiteEnumLiteralDeclaration_44()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:583:1: ( Restrictionsite )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:583:3: Restrictionsite
                    {
                    match(input,Restrictionsite,FOLLOW_Restrictionsite_in_rule__PolygonBasedNodeShape__Alternatives1257); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRestrictionsiteEnumLiteralDeclaration_44()); 

                    }


                    }
                    break;
                case 46 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:588:6: ( ( Fivepoverhang ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:588:6: ( ( Fivepoverhang ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:589:1: ( Fivepoverhang )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getFivepoverhangEnumLiteralDeclaration_45()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:590:1: ( Fivepoverhang )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:590:3: Fivepoverhang
                    {
                    match(input,Fivepoverhang,FOLLOW_Fivepoverhang_in_rule__PolygonBasedNodeShape__Alternatives1277); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getFivepoverhangEnumLiteralDeclaration_45()); 

                    }


                    }
                    break;
                case 47 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:595:6: ( ( Threepoverhang ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:595:6: ( ( Threepoverhang ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:596:1: ( Threepoverhang )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getThreepoverhangEnumLiteralDeclaration_46()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:597:1: ( Threepoverhang )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:597:3: Threepoverhang
                    {
                    match(input,Threepoverhang,FOLLOW_Threepoverhang_in_rule__PolygonBasedNodeShape__Alternatives1297); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getThreepoverhangEnumLiteralDeclaration_46()); 

                    }


                    }
                    break;
                case 48 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:602:6: ( ( Noverhang ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:602:6: ( ( Noverhang ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:603:1: ( Noverhang )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getNoverhangEnumLiteralDeclaration_47()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:604:1: ( Noverhang )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:604:3: Noverhang
                    {
                    match(input,Noverhang,FOLLOW_Noverhang_in_rule__PolygonBasedNodeShape__Alternatives1317); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getNoverhangEnumLiteralDeclaration_47()); 

                    }


                    }
                    break;
                case 49 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:609:6: ( ( Assembly ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:609:6: ( ( Assembly ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:610:1: ( Assembly )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getAssemblyEnumLiteralDeclaration_48()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:611:1: ( Assembly )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:611:3: Assembly
                    {
                    match(input,Assembly,FOLLOW_Assembly_in_rule__PolygonBasedNodeShape__Alternatives1337); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getAssemblyEnumLiteralDeclaration_48()); 

                    }


                    }
                    break;
                case 50 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:616:6: ( ( Signature ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:616:6: ( ( Signature ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:617:1: ( Signature )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getSignatureEnumLiteralDeclaration_49()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:618:1: ( Signature )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:618:3: Signature
                    {
                    match(input,Signature,FOLLOW_Signature_in_rule__PolygonBasedNodeShape__Alternatives1357); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getSignatureEnumLiteralDeclaration_49()); 

                    }


                    }
                    break;
                case 51 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:623:6: ( ( Insulator ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:623:6: ( ( Insulator ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:624:1: ( Insulator )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getInsulatorEnumLiteralDeclaration_50()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:625:1: ( Insulator )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:625:3: Insulator
                    {
                    match(input,Insulator,FOLLOW_Insulator_in_rule__PolygonBasedNodeShape__Alternatives1377); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getInsulatorEnumLiteralDeclaration_50()); 

                    }


                    }
                    break;
                case 52 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:630:6: ( ( Ribosite ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:630:6: ( ( Ribosite ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:631:1: ( Ribosite )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRibositeEnumLiteralDeclaration_51()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:632:1: ( Ribosite )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:632:3: Ribosite
                    {
                    match(input,Ribosite,FOLLOW_Ribosite_in_rule__PolygonBasedNodeShape__Alternatives1397); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRibositeEnumLiteralDeclaration_51()); 

                    }


                    }
                    break;
                case 53 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:637:6: ( ( Rnastab ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:637:6: ( ( Rnastab ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:638:1: ( Rnastab )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRnastabEnumLiteralDeclaration_52()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:639:1: ( Rnastab )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:639:3: Rnastab
                    {
                    match(input,Rnastab,FOLLOW_Rnastab_in_rule__PolygonBasedNodeShape__Alternatives1417); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRnastabEnumLiteralDeclaration_52()); 

                    }


                    }
                    break;
                case 54 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:644:6: ( ( Proteasesite ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:644:6: ( ( Proteasesite ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:645:1: ( Proteasesite )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getProteasesiteEnumLiteralDeclaration_53()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:646:1: ( Proteasesite )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:646:3: Proteasesite
                    {
                    match(input,Proteasesite,FOLLOW_Proteasesite_in_rule__PolygonBasedNodeShape__Alternatives1437); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getProteasesiteEnumLiteralDeclaration_53()); 

                    }


                    }
                    break;
                case 55 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:651:6: ( ( Proteinstab ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:651:6: ( ( Proteinstab ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:652:1: ( Proteinstab )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getProteinstabEnumLiteralDeclaration_54()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:653:1: ( Proteinstab )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:653:3: Proteinstab
                    {
                    match(input,Proteinstab,FOLLOW_Proteinstab_in_rule__PolygonBasedNodeShape__Alternatives1457); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getProteinstabEnumLiteralDeclaration_54()); 

                    }


                    }
                    break;
                case 56 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:658:6: ( ( Rpromoter ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:658:6: ( ( Rpromoter ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:659:1: ( Rpromoter )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRpromoterEnumLiteralDeclaration_55()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:660:1: ( Rpromoter )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:660:3: Rpromoter
                    {
                    match(input,Rpromoter,FOLLOW_Rpromoter_in_rule__PolygonBasedNodeShape__Alternatives1477); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRpromoterEnumLiteralDeclaration_55()); 

                    }


                    }
                    break;
                case 57 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:665:6: ( ( Rarrow ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:665:6: ( ( Rarrow ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:666:1: ( Rarrow )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getRarrowEnumLiteralDeclaration_56()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:667:1: ( Rarrow )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:667:3: Rarrow
                    {
                    match(input,Rarrow,FOLLOW_Rarrow_in_rule__PolygonBasedNodeShape__Alternatives1497); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getRarrowEnumLiteralDeclaration_56()); 

                    }


                    }
                    break;
                case 58 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:672:6: ( ( Larrow ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:672:6: ( ( Larrow ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:673:1: ( Larrow )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getLarrowEnumLiteralDeclaration_57()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:674:1: ( Larrow )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:674:3: Larrow
                    {
                    match(input,Larrow,FOLLOW_Larrow_in_rule__PolygonBasedNodeShape__Alternatives1517); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getLarrowEnumLiteralDeclaration_57()); 

                    }


                    }
                    break;
                case 59 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:679:6: ( ( Lpromoter ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:679:6: ( ( Lpromoter ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:680:1: ( Lpromoter )
                    {
                     before(grammarAccess.getPolygonBasedNodeShapeAccess().getLpromoterEnumLiteralDeclaration_58()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:681:1: ( Lpromoter )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:681:3: Lpromoter
                    {
                    match(input,Lpromoter,FOLLOW_Lpromoter_in_rule__PolygonBasedNodeShape__Alternatives1537); 

                    }

                     after(grammarAccess.getPolygonBasedNodeShapeAccess().getLpromoterEnumLiteralDeclaration_58()); 

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
    // $ANTLR end "rule__PolygonBasedNodeShape__Alternatives"


    // $ANTLR start "rule__RecordBasedNodeShape__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:691:1: rule__RecordBasedNodeShape__Alternatives : ( ( ( Record ) ) | ( ( Mrecord ) ) );
    public final void rule__RecordBasedNodeShape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:695:1: ( ( ( Record ) ) | ( ( Mrecord ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Record) ) {
                alt3=1;
            }
            else if ( (LA3_0==Mrecord) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:696:1: ( ( Record ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:696:1: ( ( Record ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:697:1: ( Record )
                    {
                     before(grammarAccess.getRecordBasedNodeShapeAccess().getRecordEnumLiteralDeclaration_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:698:1: ( Record )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:698:3: Record
                    {
                    match(input,Record,FOLLOW_Record_in_rule__RecordBasedNodeShape__Alternatives1572); 

                    }

                     after(grammarAccess.getRecordBasedNodeShapeAccess().getRecordEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:703:6: ( ( Mrecord ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:703:6: ( ( Mrecord ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:704:1: ( Mrecord )
                    {
                     before(grammarAccess.getRecordBasedNodeShapeAccess().getMrecordEnumLiteralDeclaration_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:705:1: ( Mrecord )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:705:3: Mrecord
                    {
                    match(input,Mrecord,FOLLOW_Mrecord_in_rule__RecordBasedNodeShape__Alternatives1592); 

                    }

                     after(grammarAccess.getRecordBasedNodeShapeAccess().getMrecordEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__RecordBasedNodeShape__Alternatives"


    // $ANTLR start "rule__Shape__ShapeAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:718:1: rule__Shape__ShapeAssignment : ( ( rule__Shape__ShapeAlternatives_0 ) ) ;
    public final void rule__Shape__ShapeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:722:1: ( ( ( rule__Shape__ShapeAlternatives_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:723:1: ( ( rule__Shape__ShapeAlternatives_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:723:1: ( ( rule__Shape__ShapeAlternatives_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:724:1: ( rule__Shape__ShapeAlternatives_0 )
            {
             before(grammarAccess.getShapeAccess().getShapeAlternatives_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:725:1: ( rule__Shape__ShapeAlternatives_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:725:2: rule__Shape__ShapeAlternatives_0
            {
            pushFollow(FOLLOW_rule__Shape__ShapeAlternatives_0_in_rule__Shape__ShapeAssignment1629);
            rule__Shape__ShapeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getShapeAlternatives_0()); 

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
    // $ANTLR end "rule__Shape__ShapeAssignment"


    // $ANTLR start "rule__PolygonBasedShape__ShapeAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:734:1: rule__PolygonBasedShape__ShapeAssignment : ( rulePolygonBasedNodeShape ) ;
    public final void rule__PolygonBasedShape__ShapeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:738:1: ( ( rulePolygonBasedNodeShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:739:1: ( rulePolygonBasedNodeShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:739:1: ( rulePolygonBasedNodeShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:740:1: rulePolygonBasedNodeShape
            {
             before(grammarAccess.getPolygonBasedShapeAccess().getShapePolygonBasedNodeShapeEnumRuleCall_0()); 
            pushFollow(FOLLOW_rulePolygonBasedNodeShape_in_rule__PolygonBasedShape__ShapeAssignment1662);
            rulePolygonBasedNodeShape();

            state._fsp--;

             after(grammarAccess.getPolygonBasedShapeAccess().getShapePolygonBasedNodeShapeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__PolygonBasedShape__ShapeAssignment"


    // $ANTLR start "rule__RecordBasedShape__ShapeAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:749:1: rule__RecordBasedShape__ShapeAssignment : ( ruleRecordBasedNodeShape ) ;
    public final void rule__RecordBasedShape__ShapeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:753:1: ( ( ruleRecordBasedNodeShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:754:1: ( ruleRecordBasedNodeShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:754:1: ( ruleRecordBasedNodeShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotShapeParser.g:755:1: ruleRecordBasedNodeShape
            {
             before(grammarAccess.getRecordBasedShapeAccess().getShapeRecordBasedNodeShapeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleRecordBasedNodeShape_in_rule__RecordBasedShape__ShapeAssignment1693);
            ruleRecordBasedNodeShape();

            state._fsp--;

             after(grammarAccess.getRecordBasedShapeAccess().getShapeRecordBasedNodeShapeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__RecordBasedShape__ShapeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleShape_in_entryRuleShape54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShape61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shape__ShapeAssignment_in_ruleShape91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedShape_in_entryRulePolygonBasedShape118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolygonBasedShape125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PolygonBasedShape__ShapeAssignment_in_rulePolygonBasedShape155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedShape_in_entryRuleRecordBasedShape182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordBasedShape189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordBasedShape__ShapeAssignment_in_ruleRecordBasedShape219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PolygonBasedNodeShape__Alternatives_in_rulePolygonBasedNodeShape256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordBasedNodeShape__Alternatives_in_ruleRecordBasedNodeShape292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedShape_in_rule__Shape__ShapeAlternatives_0327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedShape_in_rule__Shape__ShapeAlternatives_0344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Box_in_rule__PolygonBasedNodeShape__Alternatives377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Polygon_in_rule__PolygonBasedNodeShape__Alternatives397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ellipse_in_rule__PolygonBasedNodeShape__Alternatives417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Oval_in_rule__PolygonBasedNodeShape__Alternatives437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Circle_in_rule__PolygonBasedNodeShape__Alternatives457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Point_in_rule__PolygonBasedNodeShape__Alternatives477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Egg_in_rule__PolygonBasedNodeShape__Alternatives497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Triangle_in_rule__PolygonBasedNodeShape__Alternatives517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Plaintext_in_rule__PolygonBasedNodeShape__Alternatives537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Plain_in_rule__PolygonBasedNodeShape__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Diamond_in_rule__PolygonBasedNodeShape__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Trapezium_in_rule__PolygonBasedNodeShape__Alternatives597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Parallelogram_in_rule__PolygonBasedNodeShape__Alternatives617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_House_in_rule__PolygonBasedNodeShape__Alternatives637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pentagon_in_rule__PolygonBasedNodeShape__Alternatives657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Hexagon_in_rule__PolygonBasedNodeShape__Alternatives677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Septagon_in_rule__PolygonBasedNodeShape__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Octagon_in_rule__PolygonBasedNodeShape__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Doublecircle_in_rule__PolygonBasedNodeShape__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Doubleoctagon_in_rule__PolygonBasedNodeShape__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Tripleoctagon_in_rule__PolygonBasedNodeShape__Alternatives777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Invtriangle_in_rule__PolygonBasedNodeShape__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Invtrapezium_in_rule__PolygonBasedNodeShape__Alternatives817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Invhouse_in_rule__PolygonBasedNodeShape__Alternatives837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Mdiamond_in_rule__PolygonBasedNodeShape__Alternatives857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Msquare_in_rule__PolygonBasedNodeShape__Alternatives877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Mcircle_in_rule__PolygonBasedNodeShape__Alternatives897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Rect_in_rule__PolygonBasedNodeShape__Alternatives917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Rectangle_in_rule__PolygonBasedNodeShape__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Square_in_rule__PolygonBasedNodeShape__Alternatives957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Star_in_rule__PolygonBasedNodeShape__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_None_in_rule__PolygonBasedNodeShape__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Underline_in_rule__PolygonBasedNodeShape__Alternatives1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Cylinder_in_rule__PolygonBasedNodeShape__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Note_in_rule__PolygonBasedNodeShape__Alternatives1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Tab_in_rule__PolygonBasedNodeShape__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Folder_in_rule__PolygonBasedNodeShape__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Box3d_in_rule__PolygonBasedNodeShape__Alternatives1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Component_in_rule__PolygonBasedNodeShape__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Promoter_in_rule__PolygonBasedNodeShape__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Cds_in_rule__PolygonBasedNodeShape__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Terminator_in_rule__PolygonBasedNodeShape__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Utr_in_rule__PolygonBasedNodeShape__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Primersite_in_rule__PolygonBasedNodeShape__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Restrictionsite_in_rule__PolygonBasedNodeShape__Alternatives1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fivepoverhang_in_rule__PolygonBasedNodeShape__Alternatives1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Threepoverhang_in_rule__PolygonBasedNodeShape__Alternatives1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Noverhang_in_rule__PolygonBasedNodeShape__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Assembly_in_rule__PolygonBasedNodeShape__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Signature_in_rule__PolygonBasedNodeShape__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Insulator_in_rule__PolygonBasedNodeShape__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Ribosite_in_rule__PolygonBasedNodeShape__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Rnastab_in_rule__PolygonBasedNodeShape__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Proteasesite_in_rule__PolygonBasedNodeShape__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Proteinstab_in_rule__PolygonBasedNodeShape__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Rpromoter_in_rule__PolygonBasedNodeShape__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Rarrow_in_rule__PolygonBasedNodeShape__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Larrow_in_rule__PolygonBasedNodeShape__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Lpromoter_in_rule__PolygonBasedNodeShape__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Record_in_rule__RecordBasedNodeShape__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Mrecord_in_rule__RecordBasedNodeShape__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shape__ShapeAlternatives_0_in_rule__Shape__ShapeAssignment1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedNodeShape_in_rule__PolygonBasedShape__ShapeAssignment1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedNodeShape_in_rule__RecordBasedShape__ShapeAssignment1693 = new BitSet(new long[]{0x0000000000000002L});

}