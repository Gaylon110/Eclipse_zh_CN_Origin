package org.eclipse.gef.dot.internal.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.gef.dot.internal.language.services.DotShapeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotShapeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'box'", "'polygon'", "'ellipse'", "'oval'", "'circle'", "'point'", "'egg'", "'triangle'", "'plaintext'", "'plain'", "'diamond'", "'trapezium'", "'parallelogram'", "'house'", "'pentagon'", "'hexagon'", "'septagon'", "'octagon'", "'doublecircle'", "'doubleoctagon'", "'tripleoctagon'", "'invtriangle'", "'invtrapezium'", "'invhouse'", "'Mdiamond'", "'Msquare'", "'Mcircle'", "'rect'", "'rectangle'", "'square'", "'star'", "'none'", "'underline'", "'cylinder'", "'note'", "'tab'", "'folder'", "'box3d'", "'component'", "'promoter'", "'cds'", "'terminator'", "'utr'", "'primersite'", "'restrictionsite'", "'fivepoverhang'", "'threepoverhang'", "'noverhang'", "'assembly'", "'signature'", "'insulator'", "'ribosite'", "'rnastab'", "'proteasesite'", "'proteinstab'", "'rpromoter'", "'rarrow'", "'larrow'", "'lpromoter'", "'record'", "'Mrecord'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDotShapeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotShapeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotShapeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g"; }



     	private DotShapeGrammarAccess grammarAccess;
     	
        public InternalDotShapeParser(TokenStream input, DotShapeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Shape";	
       	}
       	
       	@Override
       	protected DotShapeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:68:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:69:2: (iv_ruleShape= ruleShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:70:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FOLLOW_ruleShape_in_entryRuleShape75);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShape85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:77:1: ruleShape returns [EObject current=null] : ( ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) ) ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject lv_shape_0_1 = null;

        EObject lv_shape_0_2 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:80:28: ( ( ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:81:1: ( ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:81:1: ( ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:82:1: ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:82:1: ( (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:83:1: (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:83:1: (lv_shape_0_1= rulePolygonBasedShape | lv_shape_0_2= ruleRecordBasedShape )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=69)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=70 && LA1_0<=71)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:84:3: lv_shape_0_1= rulePolygonBasedShape
                    {
                     
                    	        newCompositeNode(grammarAccess.getShapeAccess().getShapePolygonBasedShapeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePolygonBasedShape_in_ruleShape132);
                    lv_shape_0_1=rulePolygonBasedShape();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShapeRule());
                    	        }
                           		set(
                           			current, 
                           			"shape",
                            		lv_shape_0_1, 
                            		"PolygonBasedShape");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:99:8: lv_shape_0_2= ruleRecordBasedShape
                    {
                     
                    	        newCompositeNode(grammarAccess.getShapeAccess().getShapeRecordBasedShapeParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordBasedShape_in_ruleShape151);
                    lv_shape_0_2=ruleRecordBasedShape();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShapeRule());
                    	        }
                           		set(
                           			current, 
                           			"shape",
                            		lv_shape_0_2, 
                            		"RecordBasedShape");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRulePolygonBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:125:1: entryRulePolygonBasedShape returns [EObject current=null] : iv_rulePolygonBasedShape= rulePolygonBasedShape EOF ;
    public final EObject entryRulePolygonBasedShape() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolygonBasedShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:126:2: (iv_rulePolygonBasedShape= rulePolygonBasedShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:127:2: iv_rulePolygonBasedShape= rulePolygonBasedShape EOF
            {
             newCompositeNode(grammarAccess.getPolygonBasedShapeRule()); 
            pushFollow(FOLLOW_rulePolygonBasedShape_in_entryRulePolygonBasedShape189);
            iv_rulePolygonBasedShape=rulePolygonBasedShape();

            state._fsp--;

             current =iv_rulePolygonBasedShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolygonBasedShape199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolygonBasedShape"


    // $ANTLR start "rulePolygonBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:134:1: rulePolygonBasedShape returns [EObject current=null] : ( (lv_shape_0_0= rulePolygonBasedNodeShape ) ) ;
    public final EObject rulePolygonBasedShape() throws RecognitionException {
        EObject current = null;

        Enumerator lv_shape_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:137:28: ( ( (lv_shape_0_0= rulePolygonBasedNodeShape ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:138:1: ( (lv_shape_0_0= rulePolygonBasedNodeShape ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:138:1: ( (lv_shape_0_0= rulePolygonBasedNodeShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:139:1: (lv_shape_0_0= rulePolygonBasedNodeShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:139:1: (lv_shape_0_0= rulePolygonBasedNodeShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:140:3: lv_shape_0_0= rulePolygonBasedNodeShape
            {
             
            	        newCompositeNode(grammarAccess.getPolygonBasedShapeAccess().getShapePolygonBasedNodeShapeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePolygonBasedNodeShape_in_rulePolygonBasedShape244);
            lv_shape_0_0=rulePolygonBasedNodeShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPolygonBasedShapeRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_0_0, 
                    		"PolygonBasedNodeShape");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolygonBasedShape"


    // $ANTLR start "entryRuleRecordBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:164:1: entryRuleRecordBasedShape returns [EObject current=null] : iv_ruleRecordBasedShape= ruleRecordBasedShape EOF ;
    public final EObject entryRuleRecordBasedShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordBasedShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:165:2: (iv_ruleRecordBasedShape= ruleRecordBasedShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:166:2: iv_ruleRecordBasedShape= ruleRecordBasedShape EOF
            {
             newCompositeNode(grammarAccess.getRecordBasedShapeRule()); 
            pushFollow(FOLLOW_ruleRecordBasedShape_in_entryRuleRecordBasedShape279);
            iv_ruleRecordBasedShape=ruleRecordBasedShape();

            state._fsp--;

             current =iv_ruleRecordBasedShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordBasedShape289); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordBasedShape"


    // $ANTLR start "ruleRecordBasedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:173:1: ruleRecordBasedShape returns [EObject current=null] : ( (lv_shape_0_0= ruleRecordBasedNodeShape ) ) ;
    public final EObject ruleRecordBasedShape() throws RecognitionException {
        EObject current = null;

        Enumerator lv_shape_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:176:28: ( ( (lv_shape_0_0= ruleRecordBasedNodeShape ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:177:1: ( (lv_shape_0_0= ruleRecordBasedNodeShape ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:177:1: ( (lv_shape_0_0= ruleRecordBasedNodeShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:178:1: (lv_shape_0_0= ruleRecordBasedNodeShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:178:1: (lv_shape_0_0= ruleRecordBasedNodeShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:179:3: lv_shape_0_0= ruleRecordBasedNodeShape
            {
             
            	        newCompositeNode(grammarAccess.getRecordBasedShapeAccess().getShapeRecordBasedNodeShapeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordBasedNodeShape_in_ruleRecordBasedShape334);
            lv_shape_0_0=ruleRecordBasedNodeShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordBasedShapeRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_0_0, 
                    		"RecordBasedNodeShape");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordBasedShape"


    // $ANTLR start "rulePolygonBasedNodeShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:203:1: rulePolygonBasedNodeShape returns [Enumerator current=null] : ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'polygon' ) | (enumLiteral_2= 'ellipse' ) | (enumLiteral_3= 'oval' ) | (enumLiteral_4= 'circle' ) | (enumLiteral_5= 'point' ) | (enumLiteral_6= 'egg' ) | (enumLiteral_7= 'triangle' ) | (enumLiteral_8= 'plaintext' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'diamond' ) | (enumLiteral_11= 'trapezium' ) | (enumLiteral_12= 'parallelogram' ) | (enumLiteral_13= 'house' ) | (enumLiteral_14= 'pentagon' ) | (enumLiteral_15= 'hexagon' ) | (enumLiteral_16= 'septagon' ) | (enumLiteral_17= 'octagon' ) | (enumLiteral_18= 'doublecircle' ) | (enumLiteral_19= 'doubleoctagon' ) | (enumLiteral_20= 'tripleoctagon' ) | (enumLiteral_21= 'invtriangle' ) | (enumLiteral_22= 'invtrapezium' ) | (enumLiteral_23= 'invhouse' ) | (enumLiteral_24= 'Mdiamond' ) | (enumLiteral_25= 'Msquare' ) | (enumLiteral_26= 'Mcircle' ) | (enumLiteral_27= 'rect' ) | (enumLiteral_28= 'rectangle' ) | (enumLiteral_29= 'square' ) | (enumLiteral_30= 'star' ) | (enumLiteral_31= 'none' ) | (enumLiteral_32= 'underline' ) | (enumLiteral_33= 'cylinder' ) | (enumLiteral_34= 'note' ) | (enumLiteral_35= 'tab' ) | (enumLiteral_36= 'folder' ) | (enumLiteral_37= 'box3d' ) | (enumLiteral_38= 'component' ) | (enumLiteral_39= 'promoter' ) | (enumLiteral_40= 'cds' ) | (enumLiteral_41= 'terminator' ) | (enumLiteral_42= 'utr' ) | (enumLiteral_43= 'primersite' ) | (enumLiteral_44= 'restrictionsite' ) | (enumLiteral_45= 'fivepoverhang' ) | (enumLiteral_46= 'threepoverhang' ) | (enumLiteral_47= 'noverhang' ) | (enumLiteral_48= 'assembly' ) | (enumLiteral_49= 'signature' ) | (enumLiteral_50= 'insulator' ) | (enumLiteral_51= 'ribosite' ) | (enumLiteral_52= 'rnastab' ) | (enumLiteral_53= 'proteasesite' ) | (enumLiteral_54= 'proteinstab' ) | (enumLiteral_55= 'rpromoter' ) | (enumLiteral_56= 'rarrow' ) | (enumLiteral_57= 'larrow' ) | (enumLiteral_58= 'lpromoter' ) ) ;
    public final Enumerator rulePolygonBasedNodeShape() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;
        Token enumLiteral_46=null;
        Token enumLiteral_47=null;
        Token enumLiteral_48=null;
        Token enumLiteral_49=null;
        Token enumLiteral_50=null;
        Token enumLiteral_51=null;
        Token enumLiteral_52=null;
        Token enumLiteral_53=null;
        Token enumLiteral_54=null;
        Token enumLiteral_55=null;
        Token enumLiteral_56=null;
        Token enumLiteral_57=null;
        Token enumLiteral_58=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:205:28: ( ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'polygon' ) | (enumLiteral_2= 'ellipse' ) | (enumLiteral_3= 'oval' ) | (enumLiteral_4= 'circle' ) | (enumLiteral_5= 'point' ) | (enumLiteral_6= 'egg' ) | (enumLiteral_7= 'triangle' ) | (enumLiteral_8= 'plaintext' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'diamond' ) | (enumLiteral_11= 'trapezium' ) | (enumLiteral_12= 'parallelogram' ) | (enumLiteral_13= 'house' ) | (enumLiteral_14= 'pentagon' ) | (enumLiteral_15= 'hexagon' ) | (enumLiteral_16= 'septagon' ) | (enumLiteral_17= 'octagon' ) | (enumLiteral_18= 'doublecircle' ) | (enumLiteral_19= 'doubleoctagon' ) | (enumLiteral_20= 'tripleoctagon' ) | (enumLiteral_21= 'invtriangle' ) | (enumLiteral_22= 'invtrapezium' ) | (enumLiteral_23= 'invhouse' ) | (enumLiteral_24= 'Mdiamond' ) | (enumLiteral_25= 'Msquare' ) | (enumLiteral_26= 'Mcircle' ) | (enumLiteral_27= 'rect' ) | (enumLiteral_28= 'rectangle' ) | (enumLiteral_29= 'square' ) | (enumLiteral_30= 'star' ) | (enumLiteral_31= 'none' ) | (enumLiteral_32= 'underline' ) | (enumLiteral_33= 'cylinder' ) | (enumLiteral_34= 'note' ) | (enumLiteral_35= 'tab' ) | (enumLiteral_36= 'folder' ) | (enumLiteral_37= 'box3d' ) | (enumLiteral_38= 'component' ) | (enumLiteral_39= 'promoter' ) | (enumLiteral_40= 'cds' ) | (enumLiteral_41= 'terminator' ) | (enumLiteral_42= 'utr' ) | (enumLiteral_43= 'primersite' ) | (enumLiteral_44= 'restrictionsite' ) | (enumLiteral_45= 'fivepoverhang' ) | (enumLiteral_46= 'threepoverhang' ) | (enumLiteral_47= 'noverhang' ) | (enumLiteral_48= 'assembly' ) | (enumLiteral_49= 'signature' ) | (enumLiteral_50= 'insulator' ) | (enumLiteral_51= 'ribosite' ) | (enumLiteral_52= 'rnastab' ) | (enumLiteral_53= 'proteasesite' ) | (enumLiteral_54= 'proteinstab' ) | (enumLiteral_55= 'rpromoter' ) | (enumLiteral_56= 'rarrow' ) | (enumLiteral_57= 'larrow' ) | (enumLiteral_58= 'lpromoter' ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:206:1: ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'polygon' ) | (enumLiteral_2= 'ellipse' ) | (enumLiteral_3= 'oval' ) | (enumLiteral_4= 'circle' ) | (enumLiteral_5= 'point' ) | (enumLiteral_6= 'egg' ) | (enumLiteral_7= 'triangle' ) | (enumLiteral_8= 'plaintext' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'diamond' ) | (enumLiteral_11= 'trapezium' ) | (enumLiteral_12= 'parallelogram' ) | (enumLiteral_13= 'house' ) | (enumLiteral_14= 'pentagon' ) | (enumLiteral_15= 'hexagon' ) | (enumLiteral_16= 'septagon' ) | (enumLiteral_17= 'octagon' ) | (enumLiteral_18= 'doublecircle' ) | (enumLiteral_19= 'doubleoctagon' ) | (enumLiteral_20= 'tripleoctagon' ) | (enumLiteral_21= 'invtriangle' ) | (enumLiteral_22= 'invtrapezium' ) | (enumLiteral_23= 'invhouse' ) | (enumLiteral_24= 'Mdiamond' ) | (enumLiteral_25= 'Msquare' ) | (enumLiteral_26= 'Mcircle' ) | (enumLiteral_27= 'rect' ) | (enumLiteral_28= 'rectangle' ) | (enumLiteral_29= 'square' ) | (enumLiteral_30= 'star' ) | (enumLiteral_31= 'none' ) | (enumLiteral_32= 'underline' ) | (enumLiteral_33= 'cylinder' ) | (enumLiteral_34= 'note' ) | (enumLiteral_35= 'tab' ) | (enumLiteral_36= 'folder' ) | (enumLiteral_37= 'box3d' ) | (enumLiteral_38= 'component' ) | (enumLiteral_39= 'promoter' ) | (enumLiteral_40= 'cds' ) | (enumLiteral_41= 'terminator' ) | (enumLiteral_42= 'utr' ) | (enumLiteral_43= 'primersite' ) | (enumLiteral_44= 'restrictionsite' ) | (enumLiteral_45= 'fivepoverhang' ) | (enumLiteral_46= 'threepoverhang' ) | (enumLiteral_47= 'noverhang' ) | (enumLiteral_48= 'assembly' ) | (enumLiteral_49= 'signature' ) | (enumLiteral_50= 'insulator' ) | (enumLiteral_51= 'ribosite' ) | (enumLiteral_52= 'rnastab' ) | (enumLiteral_53= 'proteasesite' ) | (enumLiteral_54= 'proteinstab' ) | (enumLiteral_55= 'rpromoter' ) | (enumLiteral_56= 'rarrow' ) | (enumLiteral_57= 'larrow' ) | (enumLiteral_58= 'lpromoter' ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:206:1: ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'polygon' ) | (enumLiteral_2= 'ellipse' ) | (enumLiteral_3= 'oval' ) | (enumLiteral_4= 'circle' ) | (enumLiteral_5= 'point' ) | (enumLiteral_6= 'egg' ) | (enumLiteral_7= 'triangle' ) | (enumLiteral_8= 'plaintext' ) | (enumLiteral_9= 'plain' ) | (enumLiteral_10= 'diamond' ) | (enumLiteral_11= 'trapezium' ) | (enumLiteral_12= 'parallelogram' ) | (enumLiteral_13= 'house' ) | (enumLiteral_14= 'pentagon' ) | (enumLiteral_15= 'hexagon' ) | (enumLiteral_16= 'septagon' ) | (enumLiteral_17= 'octagon' ) | (enumLiteral_18= 'doublecircle' ) | (enumLiteral_19= 'doubleoctagon' ) | (enumLiteral_20= 'tripleoctagon' ) | (enumLiteral_21= 'invtriangle' ) | (enumLiteral_22= 'invtrapezium' ) | (enumLiteral_23= 'invhouse' ) | (enumLiteral_24= 'Mdiamond' ) | (enumLiteral_25= 'Msquare' ) | (enumLiteral_26= 'Mcircle' ) | (enumLiteral_27= 'rect' ) | (enumLiteral_28= 'rectangle' ) | (enumLiteral_29= 'square' ) | (enumLiteral_30= 'star' ) | (enumLiteral_31= 'none' ) | (enumLiteral_32= 'underline' ) | (enumLiteral_33= 'cylinder' ) | (enumLiteral_34= 'note' ) | (enumLiteral_35= 'tab' ) | (enumLiteral_36= 'folder' ) | (enumLiteral_37= 'box3d' ) | (enumLiteral_38= 'component' ) | (enumLiteral_39= 'promoter' ) | (enumLiteral_40= 'cds' ) | (enumLiteral_41= 'terminator' ) | (enumLiteral_42= 'utr' ) | (enumLiteral_43= 'primersite' ) | (enumLiteral_44= 'restrictionsite' ) | (enumLiteral_45= 'fivepoverhang' ) | (enumLiteral_46= 'threepoverhang' ) | (enumLiteral_47= 'noverhang' ) | (enumLiteral_48= 'assembly' ) | (enumLiteral_49= 'signature' ) | (enumLiteral_50= 'insulator' ) | (enumLiteral_51= 'ribosite' ) | (enumLiteral_52= 'rnastab' ) | (enumLiteral_53= 'proteasesite' ) | (enumLiteral_54= 'proteinstab' ) | (enumLiteral_55= 'rpromoter' ) | (enumLiteral_56= 'rarrow' ) | (enumLiteral_57= 'larrow' ) | (enumLiteral_58= 'lpromoter' ) )
            int alt2=59;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            case 25:
                {
                alt2=15;
                }
                break;
            case 26:
                {
                alt2=16;
                }
                break;
            case 27:
                {
                alt2=17;
                }
                break;
            case 28:
                {
                alt2=18;
                }
                break;
            case 29:
                {
                alt2=19;
                }
                break;
            case 30:
                {
                alt2=20;
                }
                break;
            case 31:
                {
                alt2=21;
                }
                break;
            case 32:
                {
                alt2=22;
                }
                break;
            case 33:
                {
                alt2=23;
                }
                break;
            case 34:
                {
                alt2=24;
                }
                break;
            case 35:
                {
                alt2=25;
                }
                break;
            case 36:
                {
                alt2=26;
                }
                break;
            case 37:
                {
                alt2=27;
                }
                break;
            case 38:
                {
                alt2=28;
                }
                break;
            case 39:
                {
                alt2=29;
                }
                break;
            case 40:
                {
                alt2=30;
                }
                break;
            case 41:
                {
                alt2=31;
                }
                break;
            case 42:
                {
                alt2=32;
                }
                break;
            case 43:
                {
                alt2=33;
                }
                break;
            case 44:
                {
                alt2=34;
                }
                break;
            case 45:
                {
                alt2=35;
                }
                break;
            case 46:
                {
                alt2=36;
                }
                break;
            case 47:
                {
                alt2=37;
                }
                break;
            case 48:
                {
                alt2=38;
                }
                break;
            case 49:
                {
                alt2=39;
                }
                break;
            case 50:
                {
                alt2=40;
                }
                break;
            case 51:
                {
                alt2=41;
                }
                break;
            case 52:
                {
                alt2=42;
                }
                break;
            case 53:
                {
                alt2=43;
                }
                break;
            case 54:
                {
                alt2=44;
                }
                break;
            case 55:
                {
                alt2=45;
                }
                break;
            case 56:
                {
                alt2=46;
                }
                break;
            case 57:
                {
                alt2=47;
                }
                break;
            case 58:
                {
                alt2=48;
                }
                break;
            case 59:
                {
                alt2=49;
                }
                break;
            case 60:
                {
                alt2=50;
                }
                break;
            case 61:
                {
                alt2=51;
                }
                break;
            case 62:
                {
                alt2=52;
                }
                break;
            case 63:
                {
                alt2=53;
                }
                break;
            case 64:
                {
                alt2=54;
                }
                break;
            case 65:
                {
                alt2=55;
                }
                break;
            case 66:
                {
                alt2=56;
                }
                break;
            case 67:
                {
                alt2=57;
                }
                break;
            case 68:
                {
                alt2=58;
                }
                break;
            case 69:
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:206:2: (enumLiteral_0= 'box' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:206:2: (enumLiteral_0= 'box' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:206:4: enumLiteral_0= 'box'
                    {
                    enumLiteral_0=(Token)match(input,11,FOLLOW_11_in_rulePolygonBasedNodeShape383); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPolygonBasedNodeShapeAccess().getBoxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:212:6: (enumLiteral_1= 'polygon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:212:6: (enumLiteral_1= 'polygon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:212:8: enumLiteral_1= 'polygon'
                    {
                    enumLiteral_1=(Token)match(input,12,FOLLOW_12_in_rulePolygonBasedNodeShape400); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPolygonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPolygonBasedNodeShapeAccess().getPolygonEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:218:6: (enumLiteral_2= 'ellipse' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:218:6: (enumLiteral_2= 'ellipse' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:218:8: enumLiteral_2= 'ellipse'
                    {
                    enumLiteral_2=(Token)match(input,13,FOLLOW_13_in_rulePolygonBasedNodeShape417); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getEllipseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPolygonBasedNodeShapeAccess().getEllipseEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:224:6: (enumLiteral_3= 'oval' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:224:6: (enumLiteral_3= 'oval' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:224:8: enumLiteral_3= 'oval'
                    {
                    enumLiteral_3=(Token)match(input,14,FOLLOW_14_in_rulePolygonBasedNodeShape434); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getOvalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPolygonBasedNodeShapeAccess().getOvalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:230:6: (enumLiteral_4= 'circle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:230:6: (enumLiteral_4= 'circle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:230:8: enumLiteral_4= 'circle'
                    {
                    enumLiteral_4=(Token)match(input,15,FOLLOW_15_in_rulePolygonBasedNodeShape451); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getCircleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPolygonBasedNodeShapeAccess().getCircleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:236:6: (enumLiteral_5= 'point' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:236:6: (enumLiteral_5= 'point' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:236:8: enumLiteral_5= 'point'
                    {
                    enumLiteral_5=(Token)match(input,16,FOLLOW_16_in_rulePolygonBasedNodeShape468); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPointEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPolygonBasedNodeShapeAccess().getPointEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:242:6: (enumLiteral_6= 'egg' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:242:6: (enumLiteral_6= 'egg' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:242:8: enumLiteral_6= 'egg'
                    {
                    enumLiteral_6=(Token)match(input,17,FOLLOW_17_in_rulePolygonBasedNodeShape485); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getEggEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPolygonBasedNodeShapeAccess().getEggEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:248:6: (enumLiteral_7= 'triangle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:248:6: (enumLiteral_7= 'triangle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:248:8: enumLiteral_7= 'triangle'
                    {
                    enumLiteral_7=(Token)match(input,18,FOLLOW_18_in_rulePolygonBasedNodeShape502); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getTriangleEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPolygonBasedNodeShapeAccess().getTriangleEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:254:6: (enumLiteral_8= 'plaintext' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:254:6: (enumLiteral_8= 'plaintext' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:254:8: enumLiteral_8= 'plaintext'
                    {
                    enumLiteral_8=(Token)match(input,19,FOLLOW_19_in_rulePolygonBasedNodeShape519); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPlaintextEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPolygonBasedNodeShapeAccess().getPlaintextEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:260:6: (enumLiteral_9= 'plain' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:260:6: (enumLiteral_9= 'plain' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:260:8: enumLiteral_9= 'plain'
                    {
                    enumLiteral_9=(Token)match(input,20,FOLLOW_20_in_rulePolygonBasedNodeShape536); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPlainEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPolygonBasedNodeShapeAccess().getPlainEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:266:6: (enumLiteral_10= 'diamond' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:266:6: (enumLiteral_10= 'diamond' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:266:8: enumLiteral_10= 'diamond'
                    {
                    enumLiteral_10=(Token)match(input,21,FOLLOW_21_in_rulePolygonBasedNodeShape553); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPolygonBasedNodeShapeAccess().getDiamondEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:272:6: (enumLiteral_11= 'trapezium' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:272:6: (enumLiteral_11= 'trapezium' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:272:8: enumLiteral_11= 'trapezium'
                    {
                    enumLiteral_11=(Token)match(input,22,FOLLOW_22_in_rulePolygonBasedNodeShape570); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getTrapeziumEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPolygonBasedNodeShapeAccess().getTrapeziumEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:278:6: (enumLiteral_12= 'parallelogram' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:278:6: (enumLiteral_12= 'parallelogram' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:278:8: enumLiteral_12= 'parallelogram'
                    {
                    enumLiteral_12=(Token)match(input,23,FOLLOW_23_in_rulePolygonBasedNodeShape587); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getParallelogramEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPolygonBasedNodeShapeAccess().getParallelogramEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:284:6: (enumLiteral_13= 'house' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:284:6: (enumLiteral_13= 'house' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:284:8: enumLiteral_13= 'house'
                    {
                    enumLiteral_13=(Token)match(input,24,FOLLOW_24_in_rulePolygonBasedNodeShape604); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getHouseEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getPolygonBasedNodeShapeAccess().getHouseEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:290:6: (enumLiteral_14= 'pentagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:290:6: (enumLiteral_14= 'pentagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:290:8: enumLiteral_14= 'pentagon'
                    {
                    enumLiteral_14=(Token)match(input,25,FOLLOW_25_in_rulePolygonBasedNodeShape621); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPentagonEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getPolygonBasedNodeShapeAccess().getPentagonEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:296:6: (enumLiteral_15= 'hexagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:296:6: (enumLiteral_15= 'hexagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:296:8: enumLiteral_15= 'hexagon'
                    {
                    enumLiteral_15=(Token)match(input,26,FOLLOW_26_in_rulePolygonBasedNodeShape638); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getHexagonEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getPolygonBasedNodeShapeAccess().getHexagonEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:302:6: (enumLiteral_16= 'septagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:302:6: (enumLiteral_16= 'septagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:302:8: enumLiteral_16= 'septagon'
                    {
                    enumLiteral_16=(Token)match(input,27,FOLLOW_27_in_rulePolygonBasedNodeShape655); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getSeptagonEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getPolygonBasedNodeShapeAccess().getSeptagonEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:308:6: (enumLiteral_17= 'octagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:308:6: (enumLiteral_17= 'octagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:308:8: enumLiteral_17= 'octagon'
                    {
                    enumLiteral_17=(Token)match(input,28,FOLLOW_28_in_rulePolygonBasedNodeShape672); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getOctagonEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getPolygonBasedNodeShapeAccess().getOctagonEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:314:6: (enumLiteral_18= 'doublecircle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:314:6: (enumLiteral_18= 'doublecircle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:314:8: enumLiteral_18= 'doublecircle'
                    {
                    enumLiteral_18=(Token)match(input,29,FOLLOW_29_in_rulePolygonBasedNodeShape689); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getDoublecircleEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getPolygonBasedNodeShapeAccess().getDoublecircleEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:320:6: (enumLiteral_19= 'doubleoctagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:320:6: (enumLiteral_19= 'doubleoctagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:320:8: enumLiteral_19= 'doubleoctagon'
                    {
                    enumLiteral_19=(Token)match(input,30,FOLLOW_30_in_rulePolygonBasedNodeShape706); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getDoubleoctagonEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getPolygonBasedNodeShapeAccess().getDoubleoctagonEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:326:6: (enumLiteral_20= 'tripleoctagon' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:326:6: (enumLiteral_20= 'tripleoctagon' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:326:8: enumLiteral_20= 'tripleoctagon'
                    {
                    enumLiteral_20=(Token)match(input,31,FOLLOW_31_in_rulePolygonBasedNodeShape723); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getTripleoctagonEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getPolygonBasedNodeShapeAccess().getTripleoctagonEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:332:6: (enumLiteral_21= 'invtriangle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:332:6: (enumLiteral_21= 'invtriangle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:332:8: enumLiteral_21= 'invtriangle'
                    {
                    enumLiteral_21=(Token)match(input,32,FOLLOW_32_in_rulePolygonBasedNodeShape740); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getInvtriangleEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getPolygonBasedNodeShapeAccess().getInvtriangleEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:338:6: (enumLiteral_22= 'invtrapezium' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:338:6: (enumLiteral_22= 'invtrapezium' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:338:8: enumLiteral_22= 'invtrapezium'
                    {
                    enumLiteral_22=(Token)match(input,33,FOLLOW_33_in_rulePolygonBasedNodeShape757); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getInvtrapeziumEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getPolygonBasedNodeShapeAccess().getInvtrapeziumEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:344:6: (enumLiteral_23= 'invhouse' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:344:6: (enumLiteral_23= 'invhouse' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:344:8: enumLiteral_23= 'invhouse'
                    {
                    enumLiteral_23=(Token)match(input,34,FOLLOW_34_in_rulePolygonBasedNodeShape774); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getInvhouseEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getPolygonBasedNodeShapeAccess().getInvhouseEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:350:6: (enumLiteral_24= 'Mdiamond' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:350:6: (enumLiteral_24= 'Mdiamond' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:350:8: enumLiteral_24= 'Mdiamond'
                    {
                    enumLiteral_24=(Token)match(input,35,FOLLOW_35_in_rulePolygonBasedNodeShape791); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getMdiamondEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getPolygonBasedNodeShapeAccess().getMdiamondEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:356:6: (enumLiteral_25= 'Msquare' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:356:6: (enumLiteral_25= 'Msquare' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:356:8: enumLiteral_25= 'Msquare'
                    {
                    enumLiteral_25=(Token)match(input,36,FOLLOW_36_in_rulePolygonBasedNodeShape808); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getMsquareEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getPolygonBasedNodeShapeAccess().getMsquareEnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:362:6: (enumLiteral_26= 'Mcircle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:362:6: (enumLiteral_26= 'Mcircle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:362:8: enumLiteral_26= 'Mcircle'
                    {
                    enumLiteral_26=(Token)match(input,37,FOLLOW_37_in_rulePolygonBasedNodeShape825); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getMcircleEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getPolygonBasedNodeShapeAccess().getMcircleEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:368:6: (enumLiteral_27= 'rect' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:368:6: (enumLiteral_27= 'rect' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:368:8: enumLiteral_27= 'rect'
                    {
                    enumLiteral_27=(Token)match(input,38,FOLLOW_38_in_rulePolygonBasedNodeShape842); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRectEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getPolygonBasedNodeShapeAccess().getRectEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:374:6: (enumLiteral_28= 'rectangle' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:374:6: (enumLiteral_28= 'rectangle' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:374:8: enumLiteral_28= 'rectangle'
                    {
                    enumLiteral_28=(Token)match(input,39,FOLLOW_39_in_rulePolygonBasedNodeShape859); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRectangleEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getPolygonBasedNodeShapeAccess().getRectangleEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:380:6: (enumLiteral_29= 'square' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:380:6: (enumLiteral_29= 'square' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:380:8: enumLiteral_29= 'square'
                    {
                    enumLiteral_29=(Token)match(input,40,FOLLOW_40_in_rulePolygonBasedNodeShape876); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getSquareEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getPolygonBasedNodeShapeAccess().getSquareEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:386:6: (enumLiteral_30= 'star' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:386:6: (enumLiteral_30= 'star' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:386:8: enumLiteral_30= 'star'
                    {
                    enumLiteral_30=(Token)match(input,41,FOLLOW_41_in_rulePolygonBasedNodeShape893); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getStarEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getPolygonBasedNodeShapeAccess().getStarEnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:392:6: (enumLiteral_31= 'none' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:392:6: (enumLiteral_31= 'none' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:392:8: enumLiteral_31= 'none'
                    {
                    enumLiteral_31=(Token)match(input,42,FOLLOW_42_in_rulePolygonBasedNodeShape910); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getNoneEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getPolygonBasedNodeShapeAccess().getNoneEnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:398:6: (enumLiteral_32= 'underline' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:398:6: (enumLiteral_32= 'underline' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:398:8: enumLiteral_32= 'underline'
                    {
                    enumLiteral_32=(Token)match(input,43,FOLLOW_43_in_rulePolygonBasedNodeShape927); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getUnderlineEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getPolygonBasedNodeShapeAccess().getUnderlineEnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:404:6: (enumLiteral_33= 'cylinder' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:404:6: (enumLiteral_33= 'cylinder' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:404:8: enumLiteral_33= 'cylinder'
                    {
                    enumLiteral_33=(Token)match(input,44,FOLLOW_44_in_rulePolygonBasedNodeShape944); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getCylinderEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getPolygonBasedNodeShapeAccess().getCylinderEnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:410:6: (enumLiteral_34= 'note' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:410:6: (enumLiteral_34= 'note' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:410:8: enumLiteral_34= 'note'
                    {
                    enumLiteral_34=(Token)match(input,45,FOLLOW_45_in_rulePolygonBasedNodeShape961); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getNoteEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getPolygonBasedNodeShapeAccess().getNoteEnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:416:6: (enumLiteral_35= 'tab' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:416:6: (enumLiteral_35= 'tab' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:416:8: enumLiteral_35= 'tab'
                    {
                    enumLiteral_35=(Token)match(input,46,FOLLOW_46_in_rulePolygonBasedNodeShape978); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getTabEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getPolygonBasedNodeShapeAccess().getTabEnumLiteralDeclaration_35()); 
                        

                    }


                    }
                    break;
                case 37 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:422:6: (enumLiteral_36= 'folder' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:422:6: (enumLiteral_36= 'folder' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:422:8: enumLiteral_36= 'folder'
                    {
                    enumLiteral_36=(Token)match(input,47,FOLLOW_47_in_rulePolygonBasedNodeShape995); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getFolderEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_36, grammarAccess.getPolygonBasedNodeShapeAccess().getFolderEnumLiteralDeclaration_36()); 
                        

                    }


                    }
                    break;
                case 38 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:428:6: (enumLiteral_37= 'box3d' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:428:6: (enumLiteral_37= 'box3d' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:428:8: enumLiteral_37= 'box3d'
                    {
                    enumLiteral_37=(Token)match(input,48,FOLLOW_48_in_rulePolygonBasedNodeShape1012); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getBox3dEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_37, grammarAccess.getPolygonBasedNodeShapeAccess().getBox3dEnumLiteralDeclaration_37()); 
                        

                    }


                    }
                    break;
                case 39 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:434:6: (enumLiteral_38= 'component' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:434:6: (enumLiteral_38= 'component' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:434:8: enumLiteral_38= 'component'
                    {
                    enumLiteral_38=(Token)match(input,49,FOLLOW_49_in_rulePolygonBasedNodeShape1029); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getComponentEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_38, grammarAccess.getPolygonBasedNodeShapeAccess().getComponentEnumLiteralDeclaration_38()); 
                        

                    }


                    }
                    break;
                case 40 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:440:6: (enumLiteral_39= 'promoter' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:440:6: (enumLiteral_39= 'promoter' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:440:8: enumLiteral_39= 'promoter'
                    {
                    enumLiteral_39=(Token)match(input,50,FOLLOW_50_in_rulePolygonBasedNodeShape1046); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPromoterEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_39, grammarAccess.getPolygonBasedNodeShapeAccess().getPromoterEnumLiteralDeclaration_39()); 
                        

                    }


                    }
                    break;
                case 41 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:446:6: (enumLiteral_40= 'cds' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:446:6: (enumLiteral_40= 'cds' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:446:8: enumLiteral_40= 'cds'
                    {
                    enumLiteral_40=(Token)match(input,51,FOLLOW_51_in_rulePolygonBasedNodeShape1063); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getCdsEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_40, grammarAccess.getPolygonBasedNodeShapeAccess().getCdsEnumLiteralDeclaration_40()); 
                        

                    }


                    }
                    break;
                case 42 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:452:6: (enumLiteral_41= 'terminator' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:452:6: (enumLiteral_41= 'terminator' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:452:8: enumLiteral_41= 'terminator'
                    {
                    enumLiteral_41=(Token)match(input,52,FOLLOW_52_in_rulePolygonBasedNodeShape1080); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getTerminatorEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_41, grammarAccess.getPolygonBasedNodeShapeAccess().getTerminatorEnumLiteralDeclaration_41()); 
                        

                    }


                    }
                    break;
                case 43 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:458:6: (enumLiteral_42= 'utr' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:458:6: (enumLiteral_42= 'utr' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:458:8: enumLiteral_42= 'utr'
                    {
                    enumLiteral_42=(Token)match(input,53,FOLLOW_53_in_rulePolygonBasedNodeShape1097); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getUtrEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_42, grammarAccess.getPolygonBasedNodeShapeAccess().getUtrEnumLiteralDeclaration_42()); 
                        

                    }


                    }
                    break;
                case 44 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:464:6: (enumLiteral_43= 'primersite' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:464:6: (enumLiteral_43= 'primersite' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:464:8: enumLiteral_43= 'primersite'
                    {
                    enumLiteral_43=(Token)match(input,54,FOLLOW_54_in_rulePolygonBasedNodeShape1114); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getPrimersiteEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_43, grammarAccess.getPolygonBasedNodeShapeAccess().getPrimersiteEnumLiteralDeclaration_43()); 
                        

                    }


                    }
                    break;
                case 45 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:470:6: (enumLiteral_44= 'restrictionsite' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:470:6: (enumLiteral_44= 'restrictionsite' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:470:8: enumLiteral_44= 'restrictionsite'
                    {
                    enumLiteral_44=(Token)match(input,55,FOLLOW_55_in_rulePolygonBasedNodeShape1131); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRestrictionsiteEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_44, grammarAccess.getPolygonBasedNodeShapeAccess().getRestrictionsiteEnumLiteralDeclaration_44()); 
                        

                    }


                    }
                    break;
                case 46 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:476:6: (enumLiteral_45= 'fivepoverhang' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:476:6: (enumLiteral_45= 'fivepoverhang' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:476:8: enumLiteral_45= 'fivepoverhang'
                    {
                    enumLiteral_45=(Token)match(input,56,FOLLOW_56_in_rulePolygonBasedNodeShape1148); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getFivepoverhangEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_45, grammarAccess.getPolygonBasedNodeShapeAccess().getFivepoverhangEnumLiteralDeclaration_45()); 
                        

                    }


                    }
                    break;
                case 47 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:482:6: (enumLiteral_46= 'threepoverhang' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:482:6: (enumLiteral_46= 'threepoverhang' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:482:8: enumLiteral_46= 'threepoverhang'
                    {
                    enumLiteral_46=(Token)match(input,57,FOLLOW_57_in_rulePolygonBasedNodeShape1165); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getThreepoverhangEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_46, grammarAccess.getPolygonBasedNodeShapeAccess().getThreepoverhangEnumLiteralDeclaration_46()); 
                        

                    }


                    }
                    break;
                case 48 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:488:6: (enumLiteral_47= 'noverhang' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:488:6: (enumLiteral_47= 'noverhang' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:488:8: enumLiteral_47= 'noverhang'
                    {
                    enumLiteral_47=(Token)match(input,58,FOLLOW_58_in_rulePolygonBasedNodeShape1182); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getNoverhangEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_47, grammarAccess.getPolygonBasedNodeShapeAccess().getNoverhangEnumLiteralDeclaration_47()); 
                        

                    }


                    }
                    break;
                case 49 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:494:6: (enumLiteral_48= 'assembly' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:494:6: (enumLiteral_48= 'assembly' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:494:8: enumLiteral_48= 'assembly'
                    {
                    enumLiteral_48=(Token)match(input,59,FOLLOW_59_in_rulePolygonBasedNodeShape1199); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getAssemblyEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_48, grammarAccess.getPolygonBasedNodeShapeAccess().getAssemblyEnumLiteralDeclaration_48()); 
                        

                    }


                    }
                    break;
                case 50 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:500:6: (enumLiteral_49= 'signature' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:500:6: (enumLiteral_49= 'signature' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:500:8: enumLiteral_49= 'signature'
                    {
                    enumLiteral_49=(Token)match(input,60,FOLLOW_60_in_rulePolygonBasedNodeShape1216); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getSignatureEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_49, grammarAccess.getPolygonBasedNodeShapeAccess().getSignatureEnumLiteralDeclaration_49()); 
                        

                    }


                    }
                    break;
                case 51 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:506:6: (enumLiteral_50= 'insulator' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:506:6: (enumLiteral_50= 'insulator' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:506:8: enumLiteral_50= 'insulator'
                    {
                    enumLiteral_50=(Token)match(input,61,FOLLOW_61_in_rulePolygonBasedNodeShape1233); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getInsulatorEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_50, grammarAccess.getPolygonBasedNodeShapeAccess().getInsulatorEnumLiteralDeclaration_50()); 
                        

                    }


                    }
                    break;
                case 52 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:512:6: (enumLiteral_51= 'ribosite' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:512:6: (enumLiteral_51= 'ribosite' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:512:8: enumLiteral_51= 'ribosite'
                    {
                    enumLiteral_51=(Token)match(input,62,FOLLOW_62_in_rulePolygonBasedNodeShape1250); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRibositeEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_51, grammarAccess.getPolygonBasedNodeShapeAccess().getRibositeEnumLiteralDeclaration_51()); 
                        

                    }


                    }
                    break;
                case 53 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:518:6: (enumLiteral_52= 'rnastab' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:518:6: (enumLiteral_52= 'rnastab' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:518:8: enumLiteral_52= 'rnastab'
                    {
                    enumLiteral_52=(Token)match(input,63,FOLLOW_63_in_rulePolygonBasedNodeShape1267); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRnastabEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_52, grammarAccess.getPolygonBasedNodeShapeAccess().getRnastabEnumLiteralDeclaration_52()); 
                        

                    }


                    }
                    break;
                case 54 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:524:6: (enumLiteral_53= 'proteasesite' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:524:6: (enumLiteral_53= 'proteasesite' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:524:8: enumLiteral_53= 'proteasesite'
                    {
                    enumLiteral_53=(Token)match(input,64,FOLLOW_64_in_rulePolygonBasedNodeShape1284); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getProteasesiteEnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_53, grammarAccess.getPolygonBasedNodeShapeAccess().getProteasesiteEnumLiteralDeclaration_53()); 
                        

                    }


                    }
                    break;
                case 55 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:530:6: (enumLiteral_54= 'proteinstab' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:530:6: (enumLiteral_54= 'proteinstab' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:530:8: enumLiteral_54= 'proteinstab'
                    {
                    enumLiteral_54=(Token)match(input,65,FOLLOW_65_in_rulePolygonBasedNodeShape1301); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getProteinstabEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_54, grammarAccess.getPolygonBasedNodeShapeAccess().getProteinstabEnumLiteralDeclaration_54()); 
                        

                    }


                    }
                    break;
                case 56 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:536:6: (enumLiteral_55= 'rpromoter' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:536:6: (enumLiteral_55= 'rpromoter' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:536:8: enumLiteral_55= 'rpromoter'
                    {
                    enumLiteral_55=(Token)match(input,66,FOLLOW_66_in_rulePolygonBasedNodeShape1318); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRpromoterEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_55, grammarAccess.getPolygonBasedNodeShapeAccess().getRpromoterEnumLiteralDeclaration_55()); 
                        

                    }


                    }
                    break;
                case 57 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:542:6: (enumLiteral_56= 'rarrow' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:542:6: (enumLiteral_56= 'rarrow' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:542:8: enumLiteral_56= 'rarrow'
                    {
                    enumLiteral_56=(Token)match(input,67,FOLLOW_67_in_rulePolygonBasedNodeShape1335); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getRarrowEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_56, grammarAccess.getPolygonBasedNodeShapeAccess().getRarrowEnumLiteralDeclaration_56()); 
                        

                    }


                    }
                    break;
                case 58 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:548:6: (enumLiteral_57= 'larrow' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:548:6: (enumLiteral_57= 'larrow' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:548:8: enumLiteral_57= 'larrow'
                    {
                    enumLiteral_57=(Token)match(input,68,FOLLOW_68_in_rulePolygonBasedNodeShape1352); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getLarrowEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_57, grammarAccess.getPolygonBasedNodeShapeAccess().getLarrowEnumLiteralDeclaration_57()); 
                        

                    }


                    }
                    break;
                case 59 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:554:6: (enumLiteral_58= 'lpromoter' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:554:6: (enumLiteral_58= 'lpromoter' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:554:8: enumLiteral_58= 'lpromoter'
                    {
                    enumLiteral_58=(Token)match(input,69,FOLLOW_69_in_rulePolygonBasedNodeShape1369); 

                            current = grammarAccess.getPolygonBasedNodeShapeAccess().getLpromoterEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_58, grammarAccess.getPolygonBasedNodeShapeAccess().getLpromoterEnumLiteralDeclaration_58()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolygonBasedNodeShape"


    // $ANTLR start "ruleRecordBasedNodeShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:564:1: ruleRecordBasedNodeShape returns [Enumerator current=null] : ( (enumLiteral_0= 'record' ) | (enumLiteral_1= 'Mrecord' ) ) ;
    public final Enumerator ruleRecordBasedNodeShape() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:566:28: ( ( (enumLiteral_0= 'record' ) | (enumLiteral_1= 'Mrecord' ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:567:1: ( (enumLiteral_0= 'record' ) | (enumLiteral_1= 'Mrecord' ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:567:1: ( (enumLiteral_0= 'record' ) | (enumLiteral_1= 'Mrecord' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==70) ) {
                alt3=1;
            }
            else if ( (LA3_0==71) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:567:2: (enumLiteral_0= 'record' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:567:2: (enumLiteral_0= 'record' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:567:4: enumLiteral_0= 'record'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleRecordBasedNodeShape1414); 

                            current = grammarAccess.getRecordBasedNodeShapeAccess().getRecordEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRecordBasedNodeShapeAccess().getRecordEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:573:6: (enumLiteral_1= 'Mrecord' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:573:6: (enumLiteral_1= 'Mrecord' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotShape.g:573:8: enumLiteral_1= 'Mrecord'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleRecordBasedNodeShape1431); 

                            current = grammarAccess.getRecordBasedNodeShapeAccess().getMrecordEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRecordBasedNodeShapeAccess().getMrecordEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordBasedNodeShape"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleShape_in_entryRuleShape75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShape85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedShape_in_ruleShape132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedShape_in_ruleShape151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedShape_in_entryRulePolygonBasedShape189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolygonBasedShape199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolygonBasedNodeShape_in_rulePolygonBasedShape244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedShape_in_entryRuleRecordBasedShape279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordBasedShape289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordBasedNodeShape_in_ruleRecordBasedShape334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolygonBasedNodeShape383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePolygonBasedNodeShape400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePolygonBasedNodeShape417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePolygonBasedNodeShape434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePolygonBasedNodeShape451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePolygonBasedNodeShape468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePolygonBasedNodeShape485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePolygonBasedNodeShape502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePolygonBasedNodeShape519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePolygonBasedNodeShape536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePolygonBasedNodeShape553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePolygonBasedNodeShape570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePolygonBasedNodeShape587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePolygonBasedNodeShape604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePolygonBasedNodeShape621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePolygonBasedNodeShape638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePolygonBasedNodeShape655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePolygonBasedNodeShape672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePolygonBasedNodeShape689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePolygonBasedNodeShape706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePolygonBasedNodeShape723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePolygonBasedNodeShape740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePolygonBasedNodeShape757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePolygonBasedNodeShape774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePolygonBasedNodeShape791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePolygonBasedNodeShape808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePolygonBasedNodeShape825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePolygonBasedNodeShape842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePolygonBasedNodeShape859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePolygonBasedNodeShape876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rulePolygonBasedNodeShape893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePolygonBasedNodeShape910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePolygonBasedNodeShape927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePolygonBasedNodeShape944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePolygonBasedNodeShape961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePolygonBasedNodeShape978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePolygonBasedNodeShape995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePolygonBasedNodeShape1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePolygonBasedNodeShape1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePolygonBasedNodeShape1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePolygonBasedNodeShape1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePolygonBasedNodeShape1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePolygonBasedNodeShape1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePolygonBasedNodeShape1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulePolygonBasedNodeShape1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePolygonBasedNodeShape1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePolygonBasedNodeShape1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePolygonBasedNodeShape1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePolygonBasedNodeShape1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePolygonBasedNodeShape1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePolygonBasedNodeShape1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePolygonBasedNodeShape1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePolygonBasedNodeShape1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePolygonBasedNodeShape1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePolygonBasedNodeShape1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePolygonBasedNodeShape1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePolygonBasedNodeShape1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePolygonBasedNodeShape1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePolygonBasedNodeShape1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleRecordBasedNodeShape1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleRecordBasedNodeShape1431 = new BitSet(new long[]{0x0000000000000002L});

}