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
import org.eclipse.gef.dot.internal.language.services.DotArrowTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotArrowTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "'o'", "'l'", "'r'", "'ediamond'", "'open'", "'halfopen'", "'empty'", "'invempty'", "'box'", "'crow'", "'curve'", "'icurve'", "'diamond'", "'dot'", "'inv'", "'none'", "'normal'", "'tee'", "'vee'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int T__4=4;
    public static final int T__22=22;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDotArrowTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotArrowTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotArrowTypeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g"; }



     	private DotArrowTypeGrammarAccess grammarAccess;
     	
        public InternalDotArrowTypeParser(TokenStream input, DotArrowTypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ArrowType";	
       	}
       	
       	@Override
       	protected DotArrowTypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleArrowType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:68:1: entryRuleArrowType returns [EObject current=null] : iv_ruleArrowType= ruleArrowType EOF ;
    public final EObject entryRuleArrowType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowType = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:69:2: (iv_ruleArrowType= ruleArrowType EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:70:2: iv_ruleArrowType= ruleArrowType EOF
            {
             newCompositeNode(grammarAccess.getArrowTypeRule()); 
            pushFollow(FOLLOW_ruleArrowType_in_entryRuleArrowType75);
            iv_ruleArrowType=ruleArrowType();

            state._fsp--;

             current =iv_ruleArrowType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowType85); 

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
    // $ANTLR end "entryRuleArrowType"


    // $ANTLR start "ruleArrowType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:77:1: ruleArrowType returns [EObject current=null] : ( ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )? ) ;
    public final EObject ruleArrowType() throws RecognitionException {
        EObject current = null;

        EObject lv_arrowShapes_0_0 = null;

        EObject lv_arrowShapes_1_0 = null;

        EObject lv_arrowShapes_2_0 = null;

        EObject lv_arrowShapes_3_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:80:28: ( ( ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:81:1: ( ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:81:1: ( ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:81:2: ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:81:2: ( (lv_arrowShapes_0_0= ruleAbstractArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:82:1: (lv_arrowShapes_0_0= ruleAbstractArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:82:1: (lv_arrowShapes_0_0= ruleAbstractArrowShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:83:3: lv_arrowShapes_0_0= ruleAbstractArrowShape
            {
             
            	        newCompositeNode(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_ruleArrowType131);
            lv_arrowShapes_0_0=ruleAbstractArrowShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrowTypeRule());
            	        }
                   		add(
                   			current, 
                   			"arrowShapes",
                    		lv_arrowShapes_0_0, 
                    		"AbstractArrowShape");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:99:2: ( ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=4 && LA3_0<=22)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:99:3: ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) ) ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )?
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:99:3: ( (lv_arrowShapes_1_0= ruleAbstractArrowShape ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:100:1: (lv_arrowShapes_1_0= ruleAbstractArrowShape )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:100:1: (lv_arrowShapes_1_0= ruleAbstractArrowShape )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:101:3: lv_arrowShapes_1_0= ruleAbstractArrowShape
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractArrowShape_in_ruleArrowType153);
                    lv_arrowShapes_1_0=ruleAbstractArrowShape();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"arrowShapes",
                            		lv_arrowShapes_1_0, 
                            		"AbstractArrowShape");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:117:2: ( ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )? )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>=4 && LA2_0<=22)) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:117:3: ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) ) ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )?
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:117:3: ( (lv_arrowShapes_2_0= ruleAbstractArrowShape ) )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:118:1: (lv_arrowShapes_2_0= ruleAbstractArrowShape )
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:118:1: (lv_arrowShapes_2_0= ruleAbstractArrowShape )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:119:3: lv_arrowShapes_2_0= ruleAbstractArrowShape
                            {
                             
                            	        newCompositeNode(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAbstractArrowShape_in_ruleArrowType175);
                            lv_arrowShapes_2_0=ruleAbstractArrowShape();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArrowTypeRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"arrowShapes",
                                    		lv_arrowShapes_2_0, 
                                    		"AbstractArrowShape");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:135:2: ( (lv_arrowShapes_3_0= ruleAbstractArrowShape ) )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( ((LA1_0>=4 && LA1_0<=22)) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:136:1: (lv_arrowShapes_3_0= ruleAbstractArrowShape )
                                    {
                                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:136:1: (lv_arrowShapes_3_0= ruleAbstractArrowShape )
                                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:137:3: lv_arrowShapes_3_0= ruleAbstractArrowShape
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getArrowTypeAccess().getArrowShapesAbstractArrowShapeParserRuleCall_1_1_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleAbstractArrowShape_in_ruleArrowType196);
                                    lv_arrowShapes_3_0=ruleAbstractArrowShape();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getArrowTypeRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"arrowShapes",
                                            		lv_arrowShapes_3_0, 
                                            		"AbstractArrowShape");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleArrowType"


    // $ANTLR start "entryRuleAbstractArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:161:1: entryRuleAbstractArrowShape returns [EObject current=null] : iv_ruleAbstractArrowShape= ruleAbstractArrowShape EOF ;
    public final EObject entryRuleAbstractArrowShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractArrowShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:162:2: (iv_ruleAbstractArrowShape= ruleAbstractArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:163:2: iv_ruleAbstractArrowShape= ruleAbstractArrowShape EOF
            {
             newCompositeNode(grammarAccess.getAbstractArrowShapeRule()); 
            pushFollow(FOLLOW_ruleAbstractArrowShape_in_entryRuleAbstractArrowShape237);
            iv_ruleAbstractArrowShape=ruleAbstractArrowShape();

            state._fsp--;

             current =iv_ruleAbstractArrowShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractArrowShape247); 

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
    // $ANTLR end "entryRuleAbstractArrowShape"


    // $ANTLR start "ruleAbstractArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:170:1: ruleAbstractArrowShape returns [EObject current=null] : (this_ArrowShape_0= ruleArrowShape | this_DeprecatedArrowShape_1= ruleDeprecatedArrowShape ) ;
    public final EObject ruleAbstractArrowShape() throws RecognitionException {
        EObject current = null;

        EObject this_ArrowShape_0 = null;

        EObject this_DeprecatedArrowShape_1 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:173:28: ( (this_ArrowShape_0= ruleArrowShape | this_DeprecatedArrowShape_1= ruleDeprecatedArrowShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:174:1: (this_ArrowShape_0= ruleArrowShape | this_DeprecatedArrowShape_1= ruleDeprecatedArrowShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:174:1: (this_ArrowShape_0= ruleArrowShape | this_DeprecatedArrowShape_1= ruleDeprecatedArrowShape )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=4 && LA4_0<=6)||(LA4_0>=12 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=7 && LA4_0<=11)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:175:5: this_ArrowShape_0= ruleArrowShape
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractArrowShapeAccess().getArrowShapeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleArrowShape_in_ruleAbstractArrowShape294);
                    this_ArrowShape_0=ruleArrowShape();

                    state._fsp--;

                     
                            current = this_ArrowShape_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:185:5: this_DeprecatedArrowShape_1= ruleDeprecatedArrowShape
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractArrowShapeAccess().getDeprecatedArrowShapeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeprecatedArrowShape_in_ruleAbstractArrowShape321);
                    this_DeprecatedArrowShape_1=ruleDeprecatedArrowShape();

                    state._fsp--;

                     
                            current = this_DeprecatedArrowShape_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAbstractArrowShape"


    // $ANTLR start "entryRuleArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:201:1: entryRuleArrowShape returns [EObject current=null] : iv_ruleArrowShape= ruleArrowShape EOF ;
    public final EObject entryRuleArrowShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrowShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:202:2: (iv_ruleArrowShape= ruleArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:203:2: iv_ruleArrowShape= ruleArrowShape EOF
            {
             newCompositeNode(grammarAccess.getArrowShapeRule()); 
            pushFollow(FOLLOW_ruleArrowShape_in_entryRuleArrowShape356);
            iv_ruleArrowShape=ruleArrowShape();

            state._fsp--;

             current =iv_ruleArrowShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrowShape366); 

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
    // $ANTLR end "entryRuleArrowShape"


    // $ANTLR start "ruleArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:210:1: ruleArrowShape returns [EObject current=null] : ( ( (lv_open_0_0= 'o' ) )? ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )? ( (lv_shape_2_0= rulePrimitiveShape ) ) ) ;
    public final EObject ruleArrowShape() throws RecognitionException {
        EObject current = null;

        Token lv_open_0_0=null;
        Token lv_side_1_1=null;
        Token lv_side_1_2=null;
        Enumerator lv_shape_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:213:28: ( ( ( (lv_open_0_0= 'o' ) )? ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )? ( (lv_shape_2_0= rulePrimitiveShape ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:214:1: ( ( (lv_open_0_0= 'o' ) )? ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )? ( (lv_shape_2_0= rulePrimitiveShape ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:214:1: ( ( (lv_open_0_0= 'o' ) )? ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )? ( (lv_shape_2_0= rulePrimitiveShape ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:214:2: ( (lv_open_0_0= 'o' ) )? ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )? ( (lv_shape_2_0= rulePrimitiveShape ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:214:2: ( (lv_open_0_0= 'o' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==4) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:215:1: (lv_open_0_0= 'o' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:215:1: (lv_open_0_0= 'o' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:216:3: lv_open_0_0= 'o'
                    {
                    lv_open_0_0=(Token)match(input,4,FOLLOW_4_in_ruleArrowShape409); 

                            newLeafNode(lv_open_0_0, grammarAccess.getArrowShapeAccess().getOpenOKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArrowShapeRule());
                    	        }
                           		setWithLastConsumed(current, "open", true, "o");
                    	    

                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:229:3: ( ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=5 && LA7_0<=6)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:230:1: ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:230:1: ( (lv_side_1_1= 'l' | lv_side_1_2= 'r' ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:231:1: (lv_side_1_1= 'l' | lv_side_1_2= 'r' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:231:1: (lv_side_1_1= 'l' | lv_side_1_2= 'r' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==5) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==6) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:232:3: lv_side_1_1= 'l'
                            {
                            lv_side_1_1=(Token)match(input,5,FOLLOW_5_in_ruleArrowShape443); 

                                    newLeafNode(lv_side_1_1, grammarAccess.getArrowShapeAccess().getSideLKeyword_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getArrowShapeRule());
                            	        }
                                   		setWithLastConsumed(current, "side", lv_side_1_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:244:8: lv_side_1_2= 'r'
                            {
                            lv_side_1_2=(Token)match(input,6,FOLLOW_6_in_ruleArrowShape472); 

                                    newLeafNode(lv_side_1_2, grammarAccess.getArrowShapeAccess().getSideRKeyword_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getArrowShapeRule());
                            	        }
                                   		setWithLastConsumed(current, "side", lv_side_1_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:259:3: ( (lv_shape_2_0= rulePrimitiveShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:260:1: (lv_shape_2_0= rulePrimitiveShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:260:1: (lv_shape_2_0= rulePrimitiveShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:261:3: lv_shape_2_0= rulePrimitiveShape
            {
             
            	        newCompositeNode(grammarAccess.getArrowShapeAccess().getShapePrimitiveShapeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitiveShape_in_ruleArrowShape510);
            lv_shape_2_0=rulePrimitiveShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrowShapeRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_2_0, 
                    		"PrimitiveShape");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleArrowShape"


    // $ANTLR start "entryRuleDeprecatedArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:285:1: entryRuleDeprecatedArrowShape returns [EObject current=null] : iv_ruleDeprecatedArrowShape= ruleDeprecatedArrowShape EOF ;
    public final EObject entryRuleDeprecatedArrowShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeprecatedArrowShape = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:286:2: (iv_ruleDeprecatedArrowShape= ruleDeprecatedArrowShape EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:287:2: iv_ruleDeprecatedArrowShape= ruleDeprecatedArrowShape EOF
            {
             newCompositeNode(grammarAccess.getDeprecatedArrowShapeRule()); 
            pushFollow(FOLLOW_ruleDeprecatedArrowShape_in_entryRuleDeprecatedArrowShape546);
            iv_ruleDeprecatedArrowShape=ruleDeprecatedArrowShape();

            state._fsp--;

             current =iv_ruleDeprecatedArrowShape; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeprecatedArrowShape556); 

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
    // $ANTLR end "entryRuleDeprecatedArrowShape"


    // $ANTLR start "ruleDeprecatedArrowShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:294:1: ruleDeprecatedArrowShape returns [EObject current=null] : ( (lv_shape_0_0= ruleDeprecatedShape ) ) ;
    public final EObject ruleDeprecatedArrowShape() throws RecognitionException {
        EObject current = null;

        Enumerator lv_shape_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:297:28: ( ( (lv_shape_0_0= ruleDeprecatedShape ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:298:1: ( (lv_shape_0_0= ruleDeprecatedShape ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:298:1: ( (lv_shape_0_0= ruleDeprecatedShape ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:299:1: (lv_shape_0_0= ruleDeprecatedShape )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:299:1: (lv_shape_0_0= ruleDeprecatedShape )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:300:3: lv_shape_0_0= ruleDeprecatedShape
            {
             
            	        newCompositeNode(grammarAccess.getDeprecatedArrowShapeAccess().getShapeDeprecatedShapeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleDeprecatedShape_in_ruleDeprecatedArrowShape601);
            lv_shape_0_0=ruleDeprecatedShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeprecatedArrowShapeRule());
            	        }
                   		set(
                   			current, 
                   			"shape",
                    		lv_shape_0_0, 
                    		"DeprecatedShape");
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
    // $ANTLR end "ruleDeprecatedArrowShape"


    // $ANTLR start "ruleDeprecatedShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:324:1: ruleDeprecatedShape returns [Enumerator current=null] : ( (enumLiteral_0= 'ediamond' ) | (enumLiteral_1= 'open' ) | (enumLiteral_2= 'halfopen' ) | (enumLiteral_3= 'empty' ) | (enumLiteral_4= 'invempty' ) ) ;
    public final Enumerator ruleDeprecatedShape() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:326:28: ( ( (enumLiteral_0= 'ediamond' ) | (enumLiteral_1= 'open' ) | (enumLiteral_2= 'halfopen' ) | (enumLiteral_3= 'empty' ) | (enumLiteral_4= 'invempty' ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:327:1: ( (enumLiteral_0= 'ediamond' ) | (enumLiteral_1= 'open' ) | (enumLiteral_2= 'halfopen' ) | (enumLiteral_3= 'empty' ) | (enumLiteral_4= 'invempty' ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:327:1: ( (enumLiteral_0= 'ediamond' ) | (enumLiteral_1= 'open' ) | (enumLiteral_2= 'halfopen' ) | (enumLiteral_3= 'empty' ) | (enumLiteral_4= 'invempty' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 7:
                {
                alt8=1;
                }
                break;
            case 8:
                {
                alt8=2;
                }
                break;
            case 9:
                {
                alt8=3;
                }
                break;
            case 10:
                {
                alt8=4;
                }
                break;
            case 11:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:327:2: (enumLiteral_0= 'ediamond' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:327:2: (enumLiteral_0= 'ediamond' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:327:4: enumLiteral_0= 'ediamond'
                    {
                    enumLiteral_0=(Token)match(input,7,FOLLOW_7_in_ruleDeprecatedShape650); 

                            current = grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDeprecatedShapeAccess().getEdiamondEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:333:6: (enumLiteral_1= 'open' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:333:6: (enumLiteral_1= 'open' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:333:8: enumLiteral_1= 'open'
                    {
                    enumLiteral_1=(Token)match(input,8,FOLLOW_8_in_ruleDeprecatedShape667); 

                            current = grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDeprecatedShapeAccess().getOpenEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:339:6: (enumLiteral_2= 'halfopen' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:339:6: (enumLiteral_2= 'halfopen' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:339:8: enumLiteral_2= 'halfopen'
                    {
                    enumLiteral_2=(Token)match(input,9,FOLLOW_9_in_ruleDeprecatedShape684); 

                            current = grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDeprecatedShapeAccess().getHalfopenEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:345:6: (enumLiteral_3= 'empty' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:345:6: (enumLiteral_3= 'empty' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:345:8: enumLiteral_3= 'empty'
                    {
                    enumLiteral_3=(Token)match(input,10,FOLLOW_10_in_ruleDeprecatedShape701); 

                            current = grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDeprecatedShapeAccess().getEmptyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:351:6: (enumLiteral_4= 'invempty' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:351:6: (enumLiteral_4= 'invempty' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:351:8: enumLiteral_4= 'invempty'
                    {
                    enumLiteral_4=(Token)match(input,11,FOLLOW_11_in_ruleDeprecatedShape718); 

                            current = grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDeprecatedShapeAccess().getInvemptyEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleDeprecatedShape"


    // $ANTLR start "rulePrimitiveShape"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:361:1: rulePrimitiveShape returns [Enumerator current=null] : ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'crow' ) | (enumLiteral_2= 'curve' ) | (enumLiteral_3= 'icurve' ) | (enumLiteral_4= 'diamond' ) | (enumLiteral_5= 'dot' ) | (enumLiteral_6= 'inv' ) | (enumLiteral_7= 'none' ) | (enumLiteral_8= 'normal' ) | (enumLiteral_9= 'tee' ) | (enumLiteral_10= 'vee' ) ) ;
    public final Enumerator rulePrimitiveShape() throws RecognitionException {
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

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:363:28: ( ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'crow' ) | (enumLiteral_2= 'curve' ) | (enumLiteral_3= 'icurve' ) | (enumLiteral_4= 'diamond' ) | (enumLiteral_5= 'dot' ) | (enumLiteral_6= 'inv' ) | (enumLiteral_7= 'none' ) | (enumLiteral_8= 'normal' ) | (enumLiteral_9= 'tee' ) | (enumLiteral_10= 'vee' ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:364:1: ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'crow' ) | (enumLiteral_2= 'curve' ) | (enumLiteral_3= 'icurve' ) | (enumLiteral_4= 'diamond' ) | (enumLiteral_5= 'dot' ) | (enumLiteral_6= 'inv' ) | (enumLiteral_7= 'none' ) | (enumLiteral_8= 'normal' ) | (enumLiteral_9= 'tee' ) | (enumLiteral_10= 'vee' ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:364:1: ( (enumLiteral_0= 'box' ) | (enumLiteral_1= 'crow' ) | (enumLiteral_2= 'curve' ) | (enumLiteral_3= 'icurve' ) | (enumLiteral_4= 'diamond' ) | (enumLiteral_5= 'dot' ) | (enumLiteral_6= 'inv' ) | (enumLiteral_7= 'none' ) | (enumLiteral_8= 'normal' ) | (enumLiteral_9= 'tee' ) | (enumLiteral_10= 'vee' ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
                {
                alt9=3;
                }
                break;
            case 15:
                {
                alt9=4;
                }
                break;
            case 16:
                {
                alt9=5;
                }
                break;
            case 17:
                {
                alt9=6;
                }
                break;
            case 18:
                {
                alt9=7;
                }
                break;
            case 19:
                {
                alt9=8;
                }
                break;
            case 20:
                {
                alt9=9;
                }
                break;
            case 21:
                {
                alt9=10;
                }
                break;
            case 22:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:364:2: (enumLiteral_0= 'box' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:364:2: (enumLiteral_0= 'box' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:364:4: enumLiteral_0= 'box'
                    {
                    enumLiteral_0=(Token)match(input,12,FOLLOW_12_in_rulePrimitiveShape763); 

                            current = grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveShapeAccess().getBoxEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:370:6: (enumLiteral_1= 'crow' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:370:6: (enumLiteral_1= 'crow' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:370:8: enumLiteral_1= 'crow'
                    {
                    enumLiteral_1=(Token)match(input,13,FOLLOW_13_in_rulePrimitiveShape780); 

                            current = grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveShapeAccess().getCrowEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:376:6: (enumLiteral_2= 'curve' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:376:6: (enumLiteral_2= 'curve' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:376:8: enumLiteral_2= 'curve'
                    {
                    enumLiteral_2=(Token)match(input,14,FOLLOW_14_in_rulePrimitiveShape797); 

                            current = grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveShapeAccess().getCurveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:382:6: (enumLiteral_3= 'icurve' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:382:6: (enumLiteral_3= 'icurve' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:382:8: enumLiteral_3= 'icurve'
                    {
                    enumLiteral_3=(Token)match(input,15,FOLLOW_15_in_rulePrimitiveShape814); 

                            current = grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveShapeAccess().getIcurveEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:388:6: (enumLiteral_4= 'diamond' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:388:6: (enumLiteral_4= 'diamond' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:388:8: enumLiteral_4= 'diamond'
                    {
                    enumLiteral_4=(Token)match(input,16,FOLLOW_16_in_rulePrimitiveShape831); 

                            current = grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveShapeAccess().getDiamondEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:394:6: (enumLiteral_5= 'dot' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:394:6: (enumLiteral_5= 'dot' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:394:8: enumLiteral_5= 'dot'
                    {
                    enumLiteral_5=(Token)match(input,17,FOLLOW_17_in_rulePrimitiveShape848); 

                            current = grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveShapeAccess().getDotEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:400:6: (enumLiteral_6= 'inv' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:400:6: (enumLiteral_6= 'inv' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:400:8: enumLiteral_6= 'inv'
                    {
                    enumLiteral_6=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveShape865); 

                            current = grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveShapeAccess().getInvEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:406:6: (enumLiteral_7= 'none' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:406:6: (enumLiteral_7= 'none' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:406:8: enumLiteral_7= 'none'
                    {
                    enumLiteral_7=(Token)match(input,19,FOLLOW_19_in_rulePrimitiveShape882); 

                            current = grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveShapeAccess().getNoneEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:412:6: (enumLiteral_8= 'normal' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:412:6: (enumLiteral_8= 'normal' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:412:8: enumLiteral_8= 'normal'
                    {
                    enumLiteral_8=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveShape899); 

                            current = grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPrimitiveShapeAccess().getNormalEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:418:6: (enumLiteral_9= 'tee' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:418:6: (enumLiteral_9= 'tee' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:418:8: enumLiteral_9= 'tee'
                    {
                    enumLiteral_9=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveShape916); 

                            current = grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPrimitiveShapeAccess().getTeeEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:424:6: (enumLiteral_10= 'vee' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:424:6: (enumLiteral_10= 'vee' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotArrowType.g:424:8: enumLiteral_10= 'vee'
                    {
                    enumLiteral_10=(Token)match(input,22,FOLLOW_22_in_rulePrimitiveShape933); 

                            current = grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPrimitiveShapeAccess().getVeeEnumLiteralDeclaration_10()); 
                        

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
    // $ANTLR end "rulePrimitiveShape"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleArrowType_in_entryRuleArrowType75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowType85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_ruleArrowType131 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_ruleArrowType153 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_ruleArrowType175 = new BitSet(new long[]{0x00000000007FFFF2L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_ruleArrowType196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractArrowShape_in_entryRuleAbstractArrowShape237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractArrowShape247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowShape_in_ruleAbstractArrowShape294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedArrowShape_in_ruleAbstractArrowShape321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrowShape_in_entryRuleArrowShape356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrowShape366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_4_in_ruleArrowShape409 = new BitSet(new long[]{0x00000000007FF070L});
    public static final BitSet FOLLOW_5_in_ruleArrowShape443 = new BitSet(new long[]{0x00000000007FF070L});
    public static final BitSet FOLLOW_6_in_ruleArrowShape472 = new BitSet(new long[]{0x00000000007FF070L});
    public static final BitSet FOLLOW_rulePrimitiveShape_in_ruleArrowShape510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedArrowShape_in_entryRuleDeprecatedArrowShape546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeprecatedArrowShape556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeprecatedShape_in_ruleDeprecatedArrowShape601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleDeprecatedShape650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleDeprecatedShape667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleDeprecatedShape684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleDeprecatedShape701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDeprecatedShape718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePrimitiveShape763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePrimitiveShape780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveShape797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveShape814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveShape831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveShape848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveShape865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveShape882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveShape899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveShape916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveShape933 = new BitSet(new long[]{0x0000000000000002L});

}