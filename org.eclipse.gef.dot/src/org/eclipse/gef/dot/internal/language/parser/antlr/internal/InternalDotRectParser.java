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
import org.eclipse.gef.dot.internal.language.services.DotRectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotRectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_WS", "','"
    };
    public static final int RULE_DOUBLE=4;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotRectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotRectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotRectParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g"; }



     	private DotRectGrammarAccess grammarAccess;
     	
        public InternalDotRectParser(TokenStream input, DotRectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Rect";	
       	}
       	
       	@Override
       	protected DotRectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRect"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:67:1: entryRuleRect returns [EObject current=null] : iv_ruleRect= ruleRect EOF ;
    public final EObject entryRuleRect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRect = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:68:2: (iv_ruleRect= ruleRect EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:69:2: iv_ruleRect= ruleRect EOF
            {
             newCompositeNode(grammarAccess.getRectRule()); 
            pushFollow(FOLLOW_ruleRect_in_entryRuleRect75);
            iv_ruleRect=ruleRect();

            state._fsp--;

             current =iv_ruleRect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRect85); 

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
    // $ANTLR end "entryRuleRect"


    // $ANTLR start "ruleRect"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:76:1: ruleRect returns [EObject current=null] : ( ( (lv_llx_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_lly_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_urx_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_ury_6_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleRect() throws RecognitionException {
        EObject current = null;

        Token lv_llx_0_0=null;
        Token otherlv_1=null;
        Token lv_lly_2_0=null;
        Token otherlv_3=null;
        Token lv_urx_4_0=null;
        Token otherlv_5=null;
        Token lv_ury_6_0=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:79:28: ( ( ( (lv_llx_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_lly_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_urx_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_ury_6_0= RULE_DOUBLE ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:80:1: ( ( (lv_llx_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_lly_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_urx_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_ury_6_0= RULE_DOUBLE ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:80:1: ( ( (lv_llx_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_lly_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_urx_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_ury_6_0= RULE_DOUBLE ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:80:2: ( (lv_llx_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_lly_2_0= RULE_DOUBLE ) ) otherlv_3= ',' ( (lv_urx_4_0= RULE_DOUBLE ) ) otherlv_5= ',' ( (lv_ury_6_0= RULE_DOUBLE ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:80:2: ( (lv_llx_0_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:81:1: (lv_llx_0_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:81:1: (lv_llx_0_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:82:3: lv_llx_0_0= RULE_DOUBLE
            {
            lv_llx_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRect127); 

            			newLeafNode(lv_llx_0_0, grammarAccess.getRectAccess().getLlxDOUBLETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"llx",
                    		lv_llx_0_0, 
                    		"DOUBLE");
            	    

            }


            }

            otherlv_1=(Token)match(input,6,FOLLOW_6_in_ruleRect144); 

                	newLeafNode(otherlv_1, grammarAccess.getRectAccess().getCommaKeyword_1());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:102:1: ( (lv_lly_2_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:103:1: (lv_lly_2_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:103:1: (lv_lly_2_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:104:3: lv_lly_2_0= RULE_DOUBLE
            {
            lv_lly_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRect161); 

            			newLeafNode(lv_lly_2_0, grammarAccess.getRectAccess().getLlyDOUBLETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lly",
                    		lv_lly_2_0, 
                    		"DOUBLE");
            	    

            }


            }

            otherlv_3=(Token)match(input,6,FOLLOW_6_in_ruleRect178); 

                	newLeafNode(otherlv_3, grammarAccess.getRectAccess().getCommaKeyword_3());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:124:1: ( (lv_urx_4_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:125:1: (lv_urx_4_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:125:1: (lv_urx_4_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:126:3: lv_urx_4_0= RULE_DOUBLE
            {
            lv_urx_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRect195); 

            			newLeafNode(lv_urx_4_0, grammarAccess.getRectAccess().getUrxDOUBLETerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"urx",
                    		lv_urx_4_0, 
                    		"DOUBLE");
            	    

            }


            }

            otherlv_5=(Token)match(input,6,FOLLOW_6_in_ruleRect212); 

                	newLeafNode(otherlv_5, grammarAccess.getRectAccess().getCommaKeyword_5());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:146:1: ( (lv_ury_6_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:147:1: (lv_ury_6_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:147:1: (lv_ury_6_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotRect.g:148:3: lv_ury_6_0= RULE_DOUBLE
            {
            lv_ury_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleRect229); 

            			newLeafNode(lv_ury_6_0, grammarAccess.getRectAccess().getUryDOUBLETerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ury",
                    		lv_ury_6_0, 
                    		"DOUBLE");
            	    

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
    // $ANTLR end "ruleRect"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRect_in_entryRuleRect75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRect85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRect127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_ruleRect144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRect161 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_ruleRect178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRect195 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_ruleRect212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleRect229 = new BitSet(new long[]{0x0000000000000002L});

}