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
import org.eclipse.gef.dot.internal.language.services.DotSplineTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotSplineTypeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_WS", "';'", "'s'", "','", "'e'", "'!'"
    };
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int RULE_DOUBLE=4;
    public static final int EOF=-1;
    public static final int T__10=10;

    // delegates
    // delegators


        public InternalDotSplineTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotSplineTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotSplineTypeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g"; }



     	private DotSplineTypeGrammarAccess grammarAccess;
     	
        public InternalDotSplineTypeParser(TokenStream input, DotSplineTypeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SplineType";	
       	}
       	
       	@Override
       	protected DotSplineTypeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSplineType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:67:1: entryRuleSplineType returns [EObject current=null] : iv_ruleSplineType= ruleSplineType EOF ;
    public final EObject entryRuleSplineType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplineType = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:68:2: (iv_ruleSplineType= ruleSplineType EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:69:2: iv_ruleSplineType= ruleSplineType EOF
            {
             newCompositeNode(grammarAccess.getSplineTypeRule()); 
            pushFollow(FOLLOW_ruleSplineType_in_entryRuleSplineType75);
            iv_ruleSplineType=ruleSplineType();

            state._fsp--;

             current =iv_ruleSplineType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplineType85); 

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
    // $ANTLR end "entryRuleSplineType"


    // $ANTLR start "ruleSplineType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:76:1: ruleSplineType returns [EObject current=null] : ( ( (lv_splines_0_0= ruleSpline ) ) (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )* ) ;
    public final EObject ruleSplineType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_splines_0_0 = null;

        EObject lv_splines_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:79:28: ( ( ( (lv_splines_0_0= ruleSpline ) ) (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:80:1: ( ( (lv_splines_0_0= ruleSpline ) ) (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:80:1: ( ( (lv_splines_0_0= ruleSpline ) ) (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:80:2: ( (lv_splines_0_0= ruleSpline ) ) (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:80:2: ( (lv_splines_0_0= ruleSpline ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:81:1: (lv_splines_0_0= ruleSpline )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:81:1: (lv_splines_0_0= ruleSpline )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:82:3: lv_splines_0_0= ruleSpline
            {
             
            	        newCompositeNode(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSpline_in_ruleSplineType131);
            lv_splines_0_0=ruleSpline();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplineTypeRule());
            	        }
                   		add(
                   			current, 
                   			"splines",
                    		lv_splines_0_0, 
                    		"Spline");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:98:2: (otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:98:4: otherlv_1= ';' ( (lv_splines_2_0= ruleSpline ) )
            	    {
            	    otherlv_1=(Token)match(input,6,FOLLOW_6_in_ruleSplineType144); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSplineTypeAccess().getSemicolonKeyword_1_0());
            	        
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:102:1: ( (lv_splines_2_0= ruleSpline ) )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:103:1: (lv_splines_2_0= ruleSpline )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:103:1: (lv_splines_2_0= ruleSpline )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:104:3: lv_splines_2_0= ruleSpline
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpline_in_ruleSplineType165);
            	    lv_splines_2_0=ruleSpline();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplineTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"splines",
            	            		lv_splines_2_0, 
            	            		"Spline");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleSplineType"


    // $ANTLR start "entryRuleSpline"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:128:1: entryRuleSpline returns [EObject current=null] : iv_ruleSpline= ruleSpline EOF ;
    public final EObject entryRuleSpline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpline = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:129:2: (iv_ruleSpline= ruleSpline EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:130:2: iv_ruleSpline= ruleSpline EOF
            {
             newCompositeNode(grammarAccess.getSplineRule()); 
            pushFollow(FOLLOW_ruleSpline_in_entryRuleSpline203);
            iv_ruleSpline=ruleSpline();

            state._fsp--;

             current =iv_ruleSpline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpline213); 

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
    // $ANTLR end "entryRuleSpline"


    // $ANTLR start "ruleSpline"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:137:1: ruleSpline returns [EObject current=null] : ( (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )? (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )? ( (lv_controlPoints_6_0= rulePoint ) ) ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+ ) ;
    public final EObject ruleSpline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_startp_2_0 = null;

        EObject lv_endp_5_0 = null;

        EObject lv_controlPoints_6_0 = null;

        EObject lv_controlPoints_7_0 = null;

        EObject lv_controlPoints_8_0 = null;

        EObject lv_controlPoints_9_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:140:28: ( ( (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )? (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )? ( (lv_controlPoints_6_0= rulePoint ) ) ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+ ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:141:1: ( (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )? (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )? ( (lv_controlPoints_6_0= rulePoint ) ) ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+ )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:141:1: ( (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )? (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )? ( (lv_controlPoints_6_0= rulePoint ) ) ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:141:2: (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )? (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )? ( (lv_controlPoints_6_0= rulePoint ) ) ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:141:2: (otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==7) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:141:4: otherlv_0= 's' otherlv_1= ',' ( (lv_startp_2_0= rulePoint ) )
                    {
                    otherlv_0=(Token)match(input,7,FOLLOW_7_in_ruleSpline251); 

                        	newLeafNode(otherlv_0, grammarAccess.getSplineAccess().getSKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,8,FOLLOW_8_in_ruleSpline263); 

                        	newLeafNode(otherlv_1, grammarAccess.getSplineAccess().getCommaKeyword_0_1());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:149:1: ( (lv_startp_2_0= rulePoint ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:150:1: (lv_startp_2_0= rulePoint )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:150:1: (lv_startp_2_0= rulePoint )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:151:3: lv_startp_2_0= rulePoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getSplineAccess().getStartpPointParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleSpline284);
                    lv_startp_2_0=rulePoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSplineRule());
                    	        }
                           		set(
                           			current, 
                           			"startp",
                            		lv_startp_2_0, 
                            		"Point");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:167:4: (otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:167:6: otherlv_3= 'e' otherlv_4= ',' ( (lv_endp_5_0= rulePoint ) )
                    {
                    otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleSpline299); 

                        	newLeafNode(otherlv_3, grammarAccess.getSplineAccess().getEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,8,FOLLOW_8_in_ruleSpline311); 

                        	newLeafNode(otherlv_4, grammarAccess.getSplineAccess().getCommaKeyword_1_1());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:175:1: ( (lv_endp_5_0= rulePoint ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:176:1: (lv_endp_5_0= rulePoint )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:176:1: (lv_endp_5_0= rulePoint )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:177:3: lv_endp_5_0= rulePoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getSplineAccess().getEndpPointParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePoint_in_ruleSpline332);
                    lv_endp_5_0=rulePoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSplineRule());
                    	        }
                           		set(
                           			current, 
                           			"endp",
                            		lv_endp_5_0, 
                            		"Point");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:193:4: ( (lv_controlPoints_6_0= rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:194:1: (lv_controlPoints_6_0= rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:194:1: (lv_controlPoints_6_0= rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:195:3: lv_controlPoints_6_0= rulePoint
            {
             
            	        newCompositeNode(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePoint_in_ruleSpline355);
            lv_controlPoints_6_0=rulePoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplineRule());
            	        }
                   		add(
                   			current, 
                   			"controlPoints",
                    		lv_controlPoints_6_0, 
                    		"Point");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:211:2: ( ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOUBLE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:211:3: ( (lv_controlPoints_7_0= rulePoint ) ) ( (lv_controlPoints_8_0= rulePoint ) ) ( (lv_controlPoints_9_0= rulePoint ) )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:211:3: ( (lv_controlPoints_7_0= rulePoint ) )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:212:1: (lv_controlPoints_7_0= rulePoint )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:212:1: (lv_controlPoints_7_0= rulePoint )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:213:3: lv_controlPoints_7_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_ruleSpline377);
            	    lv_controlPoints_7_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controlPoints",
            	            		lv_controlPoints_7_0, 
            	            		"Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:229:2: ( (lv_controlPoints_8_0= rulePoint ) )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:230:1: (lv_controlPoints_8_0= rulePoint )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:230:1: (lv_controlPoints_8_0= rulePoint )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:231:3: lv_controlPoints_8_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_ruleSpline398);
            	    lv_controlPoints_8_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controlPoints",
            	            		lv_controlPoints_8_0, 
            	            		"Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:247:2: ( (lv_controlPoints_9_0= rulePoint ) )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:248:1: (lv_controlPoints_9_0= rulePoint )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:248:1: (lv_controlPoints_9_0= rulePoint )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:249:3: lv_controlPoints_9_0= rulePoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoint_in_ruleSpline419);
            	    lv_controlPoints_9_0=rulePoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"controlPoints",
            	            		lv_controlPoints_9_0, 
            	            		"Point");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "ruleSpline"


    // $ANTLR start "entryRulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:273:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:274:2: (iv_rulePoint= rulePoint EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:275:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint457);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint467); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:282:1: rulePoint returns [EObject current=null] : ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token otherlv_1=null;
        Token lv_y_2_0=null;
        Token otherlv_3=null;
        Token lv_z_4_0=null;
        Token lv_inputOnly_5_0=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:285:28: ( ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:286:1: ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:286:1: ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:286:2: ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:286:2: ( (lv_x_0_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:287:1: (lv_x_0_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:287:1: (lv_x_0_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:288:3: lv_x_0_0= RULE_DOUBLE
            {
            lv_x_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint509); 

            			newLeafNode(lv_x_0_0, grammarAccess.getPointAccess().getXDOUBLETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_0_0, 
                    		"DOUBLE");
            	    

            }


            }

            otherlv_1=(Token)match(input,8,FOLLOW_8_in_rulePoint526); 

                	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getCommaKeyword_1());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:308:1: ( (lv_y_2_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:309:1: (lv_y_2_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:309:1: (lv_y_2_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:310:3: lv_y_2_0= RULE_DOUBLE
            {
            lv_y_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint543); 

            			newLeafNode(lv_y_2_0, grammarAccess.getPointAccess().getYDOUBLETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"y",
                    		lv_y_2_0, 
                    		"DOUBLE");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:326:2: (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==8) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:326:4: otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) )
                    {
                    otherlv_3=(Token)match(input,8,FOLLOW_8_in_rulePoint561); 

                        	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getCommaKeyword_3_0());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:330:1: ( (lv_z_4_0= RULE_DOUBLE ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:331:1: (lv_z_4_0= RULE_DOUBLE )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:331:1: (lv_z_4_0= RULE_DOUBLE )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:332:3: lv_z_4_0= RULE_DOUBLE
                    {
                    lv_z_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint578); 

                    			newLeafNode(lv_z_4_0, grammarAccess.getPointAccess().getZDOUBLETerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"z",
                            		lv_z_4_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:348:4: ( (lv_inputOnly_5_0= '!' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:349:1: (lv_inputOnly_5_0= '!' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:349:1: (lv_inputOnly_5_0= '!' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotSplineType.g:350:3: lv_inputOnly_5_0= '!'
                    {
                    lv_inputOnly_5_0=(Token)match(input,10,FOLLOW_10_in_rulePoint603); 

                            newLeafNode(lv_inputOnly_5_0, grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPointRule());
                    	        }
                           		setWithLastConsumed(current, "inputOnly", true, "!");
                    	    

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
    // $ANTLR end "rulePoint"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSplineType_in_entryRuleSplineType75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplineType85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpline_in_ruleSplineType131 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_ruleSplineType144 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_ruleSpline_in_ruleSplineType165 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleSpline_in_entryRuleSpline203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpline213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleSpline251 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleSpline263 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline284 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_9_in_ruleSpline299 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleSpline311 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline332 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline355 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline377 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline398 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_rulePoint_in_ruleSpline419 = new BitSet(new long[]{0x0000000000000292L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_rulePoint526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint543 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_8_in_rulePoint561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint578 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rulePoint603 = new BitSet(new long[]{0x0000000000000002L});

}