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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotPointParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_WS", "','", "'!'"
    };
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int RULE_DOUBLE=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotPointParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotPointParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotPointParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g"; }



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



    // $ANTLR start "entryRulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:67:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:68:2: (iv_rulePoint= rulePoint EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:69:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint75);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint85); 

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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:76:1: rulePoint returns [EObject current=null] : ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? ) ;
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:79:28: ( ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:80:1: ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:80:1: ( ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:80:2: ( (lv_x_0_0= RULE_DOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= RULE_DOUBLE ) ) (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )? ( (lv_inputOnly_5_0= '!' ) )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:80:2: ( (lv_x_0_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:81:1: (lv_x_0_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:81:1: (lv_x_0_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:82:3: lv_x_0_0= RULE_DOUBLE
            {
            lv_x_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint127); 

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

            otherlv_1=(Token)match(input,6,FOLLOW_6_in_rulePoint144); 

                	newLeafNode(otherlv_1, grammarAccess.getPointAccess().getCommaKeyword_1());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:102:1: ( (lv_y_2_0= RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:103:1: (lv_y_2_0= RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:103:1: (lv_y_2_0= RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:104:3: lv_y_2_0= RULE_DOUBLE
            {
            lv_y_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint161); 

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

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:120:2: (otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==6) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:120:4: otherlv_3= ',' ( (lv_z_4_0= RULE_DOUBLE ) )
                    {
                    otherlv_3=(Token)match(input,6,FOLLOW_6_in_rulePoint179); 

                        	newLeafNode(otherlv_3, grammarAccess.getPointAccess().getCommaKeyword_3_0());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:124:1: ( (lv_z_4_0= RULE_DOUBLE ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:125:1: (lv_z_4_0= RULE_DOUBLE )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:125:1: (lv_z_4_0= RULE_DOUBLE )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:126:3: lv_z_4_0= RULE_DOUBLE
                    {
                    lv_z_4_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rulePoint196); 

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

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:142:4: ( (lv_inputOnly_5_0= '!' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==7) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:143:1: (lv_inputOnly_5_0= '!' )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:143:1: (lv_inputOnly_5_0= '!' )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotPoint.g:144:3: lv_inputOnly_5_0= '!'
                    {
                    lv_inputOnly_5_0=(Token)match(input,7,FOLLOW_7_in_rulePoint221); 

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


 

    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_rulePoint144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint161 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_6_in_rulePoint179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rulePoint196 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_rulePoint221 = new BitSet(new long[]{0x0000000000000002L});

}