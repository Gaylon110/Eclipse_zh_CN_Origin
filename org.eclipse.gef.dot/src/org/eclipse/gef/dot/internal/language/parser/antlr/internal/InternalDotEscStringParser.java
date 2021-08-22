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
import org.eclipse.gef.dot.internal.language.services.DotEscStringGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotEscStringParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CHAR", "'\\\\n'", "'\\\\l'", "'\\\\r'"
    };
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int RULE_CHAR=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotEscStringParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotEscStringParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotEscStringParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g"; }



     	private DotEscStringGrammarAccess grammarAccess;
     	
        public InternalDotEscStringParser(TokenStream input, DotEscStringGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EscString";	
       	}
       	
       	@Override
       	protected DotEscStringGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEscString"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:68:1: entryRuleEscString returns [EObject current=null] : iv_ruleEscString= ruleEscString EOF ;
    public final EObject entryRuleEscString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscString = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:69:2: (iv_ruleEscString= ruleEscString EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:70:2: iv_ruleEscString= ruleEscString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEscStringRule()); 
            }
            pushFollow(FOLLOW_ruleEscString_in_entryRuleEscString75);
            iv_ruleEscString=ruleEscString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEscString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscString85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEscString"


    // $ANTLR start "ruleEscString"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:77:1: ruleEscString returns [EObject current=null] : ( () ( (lv_lines_1_0= ruleJustifiedText ) )* ) ;
    public final EObject ruleEscString() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:80:28: ( ( () ( (lv_lines_1_0= ruleJustifiedText ) )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:81:1: ( () ( (lv_lines_1_0= ruleJustifiedText ) )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:81:1: ( () ( (lv_lines_1_0= ruleJustifiedText ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:81:2: () ( (lv_lines_1_0= ruleJustifiedText ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:81:2: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEscStringAccess().getEscStringAction_0(),
                          current);
                  
            }

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:87:2: ( (lv_lines_1_0= ruleJustifiedText ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_CHAR && LA1_0<=7)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:88:1: (lv_lines_1_0= ruleJustifiedText )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:88:1: (lv_lines_1_0= ruleJustifiedText )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:89:3: lv_lines_1_0= ruleJustifiedText
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEscStringAccess().getLinesJustifiedTextParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJustifiedText_in_ruleEscString140);
            	    lv_lines_1_0=ruleJustifiedText();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEscStringRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_1_0, 
            	              		"JustifiedText");
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEscString"


    // $ANTLR start "entryRuleJustifiedText"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:113:1: entryRuleJustifiedText returns [EObject current=null] : iv_ruleJustifiedText= ruleJustifiedText EOF ;
    public final EObject entryRuleJustifiedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustifiedText = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:114:2: (iv_ruleJustifiedText= ruleJustifiedText EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:115:2: iv_ruleJustifiedText= ruleJustifiedText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJustifiedTextRule()); 
            }
            pushFollow(FOLLOW_ruleJustifiedText_in_entryRuleJustifiedText177);
            iv_ruleJustifiedText=ruleJustifiedText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJustifiedText; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustifiedText187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJustifiedText"


    // $ANTLR start "ruleJustifiedText"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:122:1: ruleJustifiedText returns [EObject current=null] : ( ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? ) | ( (lv_justification_2_0= ruleJustification ) ) ) ;
    public final EObject ruleJustifiedText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;

        Enumerator lv_justification_1_0 = null;

        Enumerator lv_justification_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:125:28: ( ( ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? ) | ( (lv_justification_2_0= ruleJustification ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:1: ( ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? ) | ( (lv_justification_2_0= ruleJustification ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:1: ( ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? ) | ( (lv_justification_2_0= ruleJustification ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CHAR) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=5 && LA3_0<=7)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:2: ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:2: ( ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )? )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:3: ( (lv_text_0_0= ruleTEXT ) ) ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )?
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:126:3: ( (lv_text_0_0= ruleTEXT ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:127:1: (lv_text_0_0= ruleTEXT )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:127:1: (lv_text_0_0= ruleTEXT )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:128:3: lv_text_0_0= ruleTEXT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJustifiedTextAccess().getTextTEXTParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTEXT_in_ruleJustifiedText234);
                    lv_text_0_0=ruleTEXT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJustifiedTextRule());
                      	        }
                             		set(
                             			current, 
                             			"text",
                              		lv_text_0_0, 
                              		"TEXT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:144:2: ( ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification ) )?
                    int alt2=2;
                    switch ( input.LA(1) ) {
                        case 5:
                            {
                            int LA2_1 = input.LA(2);

                            if ( (synpred1_InternalDotEscString()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case 6:
                            {
                            int LA2_2 = input.LA(2);

                            if ( (synpred1_InternalDotEscString()) ) {
                                alt2=1;
                            }
                            }
                            break;
                        case 7:
                            {
                            int LA2_3 = input.LA(2);

                            if ( (synpred1_InternalDotEscString()) ) {
                                alt2=1;
                            }
                            }
                            break;
                    }

                    switch (alt2) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:144:3: ( ( ruleJustification ) )=> (lv_justification_1_0= ruleJustification )
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:149:1: (lv_justification_1_0= ruleJustification )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:150:3: lv_justification_1_0= ruleJustification
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJustification_in_ruleJustifiedText265);
                            lv_justification_1_0=ruleJustification();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getJustifiedTextRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"justification",
                                      		lv_justification_1_0, 
                                      		"Justification");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:167:6: ( (lv_justification_2_0= ruleJustification ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:167:6: ( (lv_justification_2_0= ruleJustification ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:168:1: (lv_justification_2_0= ruleJustification )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:168:1: (lv_justification_2_0= ruleJustification )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:169:3: lv_justification_2_0= ruleJustification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJustification_in_ruleJustifiedText294);
                    lv_justification_2_0=ruleJustification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJustifiedTextRule());
                      	        }
                             		set(
                             			current, 
                             			"justification",
                              		lv_justification_2_0, 
                              		"Justification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJustifiedText"


    // $ANTLR start "entryRuleTEXT"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:193:1: entryRuleTEXT returns [String current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final String entryRuleTEXT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:194:2: (iv_ruleTEXT= ruleTEXT EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:195:2: iv_ruleTEXT= ruleTEXT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTEXTRule()); 
            }
            pushFollow(FOLLOW_ruleTEXT_in_entryRuleTEXT331);
            iv_ruleTEXT=ruleTEXT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTEXT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTEXT342); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:202:1: ruleTEXT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= RULE_CHAR ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )* ) ;
    public final AntlrDatatypeRuleToken ruleTEXT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token this_CHAR_1=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:205:28: ( (this_CHAR_0= RULE_CHAR ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:206:1: (this_CHAR_0= RULE_CHAR ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:206:1: (this_CHAR_0= RULE_CHAR ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:206:6: this_CHAR_0= RULE_CHAR ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )*
            {
            this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleTEXT382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CHAR_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CHAR_0, grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_0()); 
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:213:1: ( ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_CHAR) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred2_InternalDotEscString()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:213:2: ( RULE_CHAR )=>this_CHAR_1= RULE_CHAR
            	    {
            	    this_CHAR_1=(Token)match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_ruleTEXT408); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_CHAR_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_CHAR_1, grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "ruleJustification"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:228:1: ruleJustification returns [Enumerator current=null] : ( (enumLiteral_0= '\\\\n' ) | (enumLiteral_1= '\\\\l' ) | (enumLiteral_2= '\\\\r' ) ) ;
    public final Enumerator ruleJustification() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:230:28: ( ( (enumLiteral_0= '\\\\n' ) | (enumLiteral_1= '\\\\l' ) | (enumLiteral_2= '\\\\r' ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:231:1: ( (enumLiteral_0= '\\\\n' ) | (enumLiteral_1= '\\\\l' ) | (enumLiteral_2= '\\\\r' ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:231:1: ( (enumLiteral_0= '\\\\n' ) | (enumLiteral_1= '\\\\l' ) | (enumLiteral_2= '\\\\r' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 5:
                {
                alt5=1;
                }
                break;
            case 6:
                {
                alt5=2;
                }
                break;
            case 7:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:231:2: (enumLiteral_0= '\\\\n' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:231:2: (enumLiteral_0= '\\\\n' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:231:4: enumLiteral_0= '\\\\n'
                    {
                    enumLiteral_0=(Token)match(input,5,FOLLOW_5_in_ruleJustification469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getJustificationAccess().getCENTEREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getJustificationAccess().getCENTEREDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:237:6: (enumLiteral_1= '\\\\l' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:237:6: (enumLiteral_1= '\\\\l' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:237:8: enumLiteral_1= '\\\\l'
                    {
                    enumLiteral_1=(Token)match(input,6,FOLLOW_6_in_ruleJustification486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getJustificationAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getJustificationAccess().getLEFTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:243:6: (enumLiteral_2= '\\\\r' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:243:6: (enumLiteral_2= '\\\\r' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:243:8: enumLiteral_2= '\\\\r'
                    {
                    enumLiteral_2=(Token)match(input,7,FOLLOW_7_in_ruleJustification503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getJustificationAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getJustificationAccess().getRIGHTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJustification"

    // $ANTLR start synpred1_InternalDotEscString
    public final void synpred1_InternalDotEscString_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:144:3: ( ( ruleJustification ) )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:145:1: ( ruleJustification )
        {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:145:1: ( ruleJustification )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:146:1: ruleJustification
        {
        pushFollow(FOLLOW_ruleJustification_in_synpred1_InternalDotEscString248);
        ruleJustification();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalDotEscString

    // $ANTLR start synpred2_InternalDotEscString
    public final void synpred2_InternalDotEscString_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:213:2: ( RULE_CHAR )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotEscString.g:213:4: RULE_CHAR
        {
        match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_synpred2_InternalDotEscString399); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalDotEscString

    // Delegated rules

    public final boolean synpred1_InternalDotEscString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDotEscString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDotEscString() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDotEscString_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleEscString_in_entryRuleEscString75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscString85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifiedText_in_ruleEscString140 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_ruleJustifiedText_in_entryRuleJustifiedText177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifiedText187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleJustifiedText234 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifiedText265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_ruleJustifiedText294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_entryRuleTEXT331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTEXT342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleTEXT382 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_CHAR_in_ruleTEXT408 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5_in_ruleJustification469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_ruleJustification486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleJustification503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_synpred1_InternalDotEscString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_synpred2_InternalDotEscString399 = new BitSet(new long[]{0x0000000000000002L});

}