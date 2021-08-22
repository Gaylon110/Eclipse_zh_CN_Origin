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
import org.eclipse.gef.dot.internal.language.services.DotStyleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotStyleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_WS", "','", "'('", "')'"
    };
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int RULE_WS=5;
    public static final int RULE_NAME=4;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotStyleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotStyleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotStyleParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g"; }



     	private DotStyleGrammarAccess grammarAccess;
     	
        public InternalDotStyleParser(TokenStream input, DotStyleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Style";	
       	}
       	
       	@Override
       	protected DotStyleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStyle"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:68:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:69:2: (iv_ruleStyle= ruleStyle EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:70:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle75);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle85); 

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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:77:1: ruleStyle returns [EObject current=null] : ( () ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )? ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_styleItems_1_0 = null;

        EObject lv_styleItems_3_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:80:28: ( ( () ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:81:1: ( () ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:81:1: ( () ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:81:2: () ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:81:2: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStyleAccess().getStyleAction_0(),
                        current);
                

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:87:2: ( ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAME) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:87:3: ( (lv_styleItems_1_0= ruleStyleItem ) ) (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )*
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:87:3: ( (lv_styleItems_1_0= ruleStyleItem ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:88:1: (lv_styleItems_1_0= ruleStyleItem )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:88:1: (lv_styleItems_1_0= ruleStyleItem )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:89:3: lv_styleItems_1_0= ruleStyleItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStyleItem_in_ruleStyle141);
                    lv_styleItems_1_0=ruleStyleItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStyleRule());
                    	        }
                           		add(
                           			current, 
                           			"styleItems",
                            		lv_styleItems_1_0, 
                            		"StyleItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:105:2: (otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==6) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:105:4: otherlv_2= ',' ( (lv_styleItems_3_0= ruleStyleItem ) )
                    	    {
                    	    otherlv_2=(Token)match(input,6,FOLLOW_6_in_ruleStyle154); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getStyleAccess().getCommaKeyword_1_1_0());
                    	        
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:109:1: ( (lv_styleItems_3_0= ruleStyleItem ) )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:110:1: (lv_styleItems_3_0= ruleStyleItem )
                    	    {
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:110:1: (lv_styleItems_3_0= ruleStyleItem )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:111:3: lv_styleItems_3_0= ruleStyleItem
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleStyleItem_in_ruleStyle175);
                    	    lv_styleItems_3_0=ruleStyleItem();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStyleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"styleItems",
                    	            		lv_styleItems_3_0, 
                    	            		"StyleItem");
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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleStyleItem"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:135:1: entryRuleStyleItem returns [EObject current=null] : iv_ruleStyleItem= ruleStyleItem EOF ;
    public final EObject entryRuleStyleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyleItem = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:136:2: (iv_ruleStyleItem= ruleStyleItem EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:137:2: iv_ruleStyleItem= ruleStyleItem EOF
            {
             newCompositeNode(grammarAccess.getStyleItemRule()); 
            pushFollow(FOLLOW_ruleStyleItem_in_entryRuleStyleItem215);
            iv_ruleStyleItem=ruleStyleItem();

            state._fsp--;

             current =iv_ruleStyleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleItem225); 

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
    // $ANTLR end "entryRuleStyleItem"


    // $ANTLR start "ruleStyleItem"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:144:1: ruleStyleItem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleStyleItem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_args_2_0=null;
        Token otherlv_3=null;
        Token lv_args_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:147:28: ( ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:148:1: ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:148:1: ( ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:148:2: ( (lv_name_0_0= RULE_NAME ) ) (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:148:2: ( (lv_name_0_0= RULE_NAME ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:149:1: (lv_name_0_0= RULE_NAME )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:149:1: (lv_name_0_0= RULE_NAME )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:150:3: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleStyleItem267); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStyleItemAccess().getNameNAMETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStyleItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"NAME");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:166:2: (otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==7) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:166:4: otherlv_1= '(' ( (lv_args_2_0= RULE_NAME ) ) (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,7,FOLLOW_7_in_ruleStyleItem285); 

                        	newLeafNode(otherlv_1, grammarAccess.getStyleItemAccess().getLeftParenthesisKeyword_1_0());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:170:1: ( (lv_args_2_0= RULE_NAME ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:171:1: (lv_args_2_0= RULE_NAME )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:171:1: (lv_args_2_0= RULE_NAME )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:172:3: lv_args_2_0= RULE_NAME
                    {
                    lv_args_2_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleStyleItem302); 

                    			newLeafNode(lv_args_2_0, grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStyleItemRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"NAME");
                    	    

                    }


                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:188:2: (otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==6) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:188:4: otherlv_3= ',' ( (lv_args_4_0= RULE_NAME ) )
                    	    {
                    	    otherlv_3=(Token)match(input,6,FOLLOW_6_in_ruleStyleItem320); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStyleItemAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:192:1: ( (lv_args_4_0= RULE_NAME ) )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:193:1: (lv_args_4_0= RULE_NAME )
                    	    {
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:193:1: (lv_args_4_0= RULE_NAME )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotStyle.g:194:3: lv_args_4_0= RULE_NAME
                    	    {
                    	    lv_args_4_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleStyleItem337); 

                    	    			newLeafNode(lv_args_4_0, grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStyleItemRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_4_0, 
                    	            		"NAME");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,8,FOLLOW_8_in_ruleStyleItem356); 

                        	newLeafNode(otherlv_5, grammarAccess.getStyleItemAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "ruleStyleItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleItem_in_ruleStyle141 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6_in_ruleStyle154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleStyleItem_in_ruleStyle175 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleStyleItem_in_entryRuleStyleItem215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleItem225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleStyleItem267 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_7_in_ruleStyleItem285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleStyleItem302 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_6_in_ruleStyleItem320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleStyleItem337 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_8_in_ruleStyleItem356 = new BitSet(new long[]{0x0000000000000002L});

}