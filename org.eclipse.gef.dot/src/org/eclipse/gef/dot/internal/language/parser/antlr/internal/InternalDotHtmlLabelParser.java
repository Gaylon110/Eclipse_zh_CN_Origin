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
import org.eclipse.gef.dot.internal.language.services.DotHtmlLabelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotHtmlLabelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HTML_COMMENT", "RULE_TAG_START_CLOSE", "RULE_TAG_START", "RULE_TAG_END", "RULE_TAG_END_CLOSE", "RULE_ASSIGN", "RULE_ATTR_VALUE", "RULE_ID", "RULE_WS", "RULE_TEXT"
    };
    public static final int RULE_TAG_END_CLOSE=8;
    public static final int RULE_HTML_COMMENT=4;
    public static final int RULE_ATTR_VALUE=10;
    public static final int RULE_TAG_START_CLOSE=5;
    public static final int RULE_TAG_END=7;
    public static final int RULE_TAG_START=6;
    public static final int RULE_ID=11;
    public static final int RULE_WS=12;
    public static final int RULE_ASSIGN=9;
    public static final int RULE_TEXT=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotHtmlLabelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotHtmlLabelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotHtmlLabelParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g"; }




    	private DotHtmlLabelGrammarAccess grammarAccess;
    	 	
    	public InternalDotHtmlLabelParser(TokenStream input, DotHtmlLabelGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "HtmlLabel";	
    	} 
    	   	   	
    	@Override
    	protected DotHtmlLabelGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleHtmlLabel"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:61:1: entryRuleHtmlLabel returns [EObject current=null] : iv_ruleHtmlLabel= ruleHtmlLabel EOF ;
    public final EObject entryRuleHtmlLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlLabel = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:62:2: (iv_ruleHtmlLabel= ruleHtmlLabel EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:63:2: iv_ruleHtmlLabel= ruleHtmlLabel EOF
            {
             newCompositeNode(grammarAccess.getHtmlLabelRule()); 
            pushFollow(FOLLOW_ruleHtmlLabel_in_entryRuleHtmlLabel67);
            iv_ruleHtmlLabel=ruleHtmlLabel();

            state._fsp--;

             current =iv_ruleHtmlLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlLabel77); 

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
    // $ANTLR end "entryRuleHtmlLabel"


    // $ANTLR start "ruleHtmlLabel"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:70:1: ruleHtmlLabel returns [EObject current=null] : ( (lv_parts_0_0= ruleHtmlContent ) )* ;
    public final EObject ruleHtmlLabel() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:73:28: ( ( (lv_parts_0_0= ruleHtmlContent ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:74:1: ( (lv_parts_0_0= ruleHtmlContent ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:74:1: ( (lv_parts_0_0= ruleHtmlContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAG_START||LA1_0==RULE_TEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:75:1: (lv_parts_0_0= ruleHtmlContent )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:75:1: (lv_parts_0_0= ruleHtmlContent )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:76:3: lv_parts_0_0= ruleHtmlContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHtmlLabelAccess().getPartsHtmlContentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHtmlContent_in_ruleHtmlLabel122);
            	    lv_parts_0_0=ruleHtmlContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHtmlLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_0_0, 
            	            		"HtmlContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleHtmlLabel"


    // $ANTLR start "entryRuleHtmlContent"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:100:1: entryRuleHtmlContent returns [EObject current=null] : iv_ruleHtmlContent= ruleHtmlContent EOF ;
    public final EObject entryRuleHtmlContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlContent = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:101:2: (iv_ruleHtmlContent= ruleHtmlContent EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:102:2: iv_ruleHtmlContent= ruleHtmlContent EOF
            {
             newCompositeNode(grammarAccess.getHtmlContentRule()); 
            pushFollow(FOLLOW_ruleHtmlContent_in_entryRuleHtmlContent157);
            iv_ruleHtmlContent=ruleHtmlContent();

            state._fsp--;

             current =iv_ruleHtmlContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlContent167); 

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
    // $ANTLR end "entryRuleHtmlContent"


    // $ANTLR start "ruleHtmlContent"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:109:1: ruleHtmlContent returns [EObject current=null] : ( ( (lv_tag_0_0= ruleHtmlTag ) ) | ( (lv_text_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleHtmlContent() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;
        EObject lv_tag_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:112:28: ( ( ( (lv_tag_0_0= ruleHtmlTag ) ) | ( (lv_text_1_0= RULE_TEXT ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:113:1: ( ( (lv_tag_0_0= ruleHtmlTag ) ) | ( (lv_text_1_0= RULE_TEXT ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:113:1: ( ( (lv_tag_0_0= ruleHtmlTag ) ) | ( (lv_text_1_0= RULE_TEXT ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TAG_START) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TEXT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:113:2: ( (lv_tag_0_0= ruleHtmlTag ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:113:2: ( (lv_tag_0_0= ruleHtmlTag ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:114:1: (lv_tag_0_0= ruleHtmlTag )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:114:1: (lv_tag_0_0= ruleHtmlTag )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:115:3: lv_tag_0_0= ruleHtmlTag
                    {
                     
                    	        newCompositeNode(grammarAccess.getHtmlContentAccess().getTagHtmlTagParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHtmlTag_in_ruleHtmlContent213);
                    lv_tag_0_0=ruleHtmlTag();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHtmlContentRule());
                    	        }
                           		set(
                           			current, 
                           			"tag",
                            		lv_tag_0_0, 
                            		"HtmlTag");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:132:6: ( (lv_text_1_0= RULE_TEXT ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:132:6: ( (lv_text_1_0= RULE_TEXT ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:133:1: (lv_text_1_0= RULE_TEXT )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:133:1: (lv_text_1_0= RULE_TEXT )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:134:3: lv_text_1_0= RULE_TEXT
                    {
                    lv_text_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleHtmlContent236); 

                    			newLeafNode(lv_text_1_0, grammarAccess.getHtmlContentAccess().getTextTEXTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHtmlContentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_1_0, 
                            		"TEXT");
                    	    

                    }


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
    // $ANTLR end "ruleHtmlContent"


    // $ANTLR start "entryRuleHtmlTag"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:158:1: entryRuleHtmlTag returns [EObject current=null] : iv_ruleHtmlTag= ruleHtmlTag EOF ;
    public final EObject entryRuleHtmlTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlTag = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:162:2: (iv_ruleHtmlTag= ruleHtmlTag EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:163:2: iv_ruleHtmlTag= ruleHtmlTag EOF
            {
             newCompositeNode(grammarAccess.getHtmlTagRule()); 
            pushFollow(FOLLOW_ruleHtmlTag_in_entryRuleHtmlTag282);
            iv_ruleHtmlTag=ruleHtmlTag();

            state._fsp--;

             current =iv_ruleHtmlTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlTag292); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleHtmlTag"


    // $ANTLR start "ruleHtmlTag"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:173:1: ruleHtmlTag returns [EObject current=null] : (this_TAG_START_0= RULE_TAG_START ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleHtmlAttr ) )* ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) ) ) ;
    public final EObject ruleHtmlTag() throws RecognitionException {
        EObject current = null;

        Token this_TAG_START_0=null;
        Token lv_name_1_0=null;
        Token lv_selfClosing_3_0=null;
        Token this_TAG_END_4=null;
        Token this_TAG_START_CLOSE_6=null;
        Token lv_closeName_7_0=null;
        Token this_TAG_END_8=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_children_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:177:28: ( (this_TAG_START_0= RULE_TAG_START ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleHtmlAttr ) )* ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:178:1: (this_TAG_START_0= RULE_TAG_START ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleHtmlAttr ) )* ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:178:1: (this_TAG_START_0= RULE_TAG_START ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleHtmlAttr ) )* ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:178:2: this_TAG_START_0= RULE_TAG_START ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleHtmlAttr ) )* ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) )
            {
            this_TAG_START_0=(Token)match(input,RULE_TAG_START,FOLLOW_RULE_TAG_START_in_ruleHtmlTag332); 
             
                newLeafNode(this_TAG_START_0, grammarAccess.getHtmlTagAccess().getTAG_STARTTerminalRuleCall_0()); 
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:182:1: ( (lv_name_1_0= RULE_ID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:183:1: (lv_name_1_0= RULE_ID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHtmlTag348); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHtmlTagAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHtmlTagRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:200:2: ( (lv_attributes_2_0= ruleHtmlAttr ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:201:1: (lv_attributes_2_0= ruleHtmlAttr )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:201:1: (lv_attributes_2_0= ruleHtmlAttr )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:202:3: lv_attributes_2_0= ruleHtmlAttr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHtmlTagAccess().getAttributesHtmlAttrParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHtmlAttr_in_ruleHtmlTag374);
            	    lv_attributes_2_0=ruleHtmlAttr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHtmlTagRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"HtmlAttr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:218:3: ( ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) ) | (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TAG_END_CLOSE) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_TAG_END) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:218:4: ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:218:4: ( (lv_selfClosing_3_0= RULE_TAG_END_CLOSE ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:219:1: (lv_selfClosing_3_0= RULE_TAG_END_CLOSE )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:219:1: (lv_selfClosing_3_0= RULE_TAG_END_CLOSE )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:220:3: lv_selfClosing_3_0= RULE_TAG_END_CLOSE
                    {
                    lv_selfClosing_3_0=(Token)match(input,RULE_TAG_END_CLOSE,FOLLOW_RULE_TAG_END_CLOSE_in_ruleHtmlTag393); 

                    			newLeafNode(lv_selfClosing_3_0, grammarAccess.getHtmlTagAccess().getSelfClosingTAG_END_CLOSETerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHtmlTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"selfClosing",
                            		true, 
                            		"TAG_END_CLOSE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:237:6: (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:237:6: (this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:237:7: this_TAG_END_4= RULE_TAG_END ( (lv_children_5_0= ruleHtmlContent ) )* this_TAG_START_CLOSE_6= RULE_TAG_START_CLOSE ( (lv_closeName_7_0= RULE_ID ) ) this_TAG_END_8= RULE_TAG_END
                    {
                    this_TAG_END_4=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleHtmlTag416); 
                     
                        newLeafNode(this_TAG_END_4, grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_0()); 
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:241:1: ( (lv_children_5_0= ruleHtmlContent ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_TAG_START||LA4_0==RULE_TEXT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:242:1: (lv_children_5_0= ruleHtmlContent )
                    	    {
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:242:1: (lv_children_5_0= ruleHtmlContent )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:243:3: lv_children_5_0= ruleHtmlContent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHtmlTagAccess().getChildrenHtmlContentParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleHtmlContent_in_ruleHtmlTag436);
                    	    lv_children_5_0=ruleHtmlContent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHtmlTagRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_5_0, 
                    	            		"HtmlContent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_TAG_START_CLOSE_6=(Token)match(input,RULE_TAG_START_CLOSE,FOLLOW_RULE_TAG_START_CLOSE_in_ruleHtmlTag448); 
                     
                        newLeafNode(this_TAG_START_CLOSE_6, grammarAccess.getHtmlTagAccess().getTAG_START_CLOSETerminalRuleCall_3_1_2()); 
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:263:1: ( (lv_closeName_7_0= RULE_ID ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:264:1: (lv_closeName_7_0= RULE_ID )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:264:1: (lv_closeName_7_0= RULE_ID )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:265:3: lv_closeName_7_0= RULE_ID
                    {
                    lv_closeName_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHtmlTag464); 

                    			newLeafNode(lv_closeName_7_0, grammarAccess.getHtmlTagAccess().getCloseNameIDTerminalRuleCall_3_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHtmlTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closeName",
                            		lv_closeName_7_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_TAG_END_8=(Token)match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_ruleHtmlTag480); 
                     
                        newLeafNode(this_TAG_END_8, grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_4()); 
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleHtmlTag"


    // $ANTLR start "entryRuleHtmlAttr"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:296:1: entryRuleHtmlAttr returns [EObject current=null] : iv_ruleHtmlAttr= ruleHtmlAttr EOF ;
    public final EObject entryRuleHtmlAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHtmlAttr = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:297:2: (iv_ruleHtmlAttr= ruleHtmlAttr EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:298:2: iv_ruleHtmlAttr= ruleHtmlAttr EOF
            {
             newCompositeNode(grammarAccess.getHtmlAttrRule()); 
            pushFollow(FOLLOW_ruleHtmlAttr_in_entryRuleHtmlAttr520);
            iv_ruleHtmlAttr=ruleHtmlAttr();

            state._fsp--;

             current =iv_ruleHtmlAttr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlAttr530); 

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
    // $ANTLR end "entryRuleHtmlAttr"


    // $ANTLR start "ruleHtmlAttr"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:305:1: ruleHtmlAttr returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? this_ASSIGN_2= RULE_ASSIGN (this_WS_3= RULE_WS )? ( (lv_value_4_0= RULE_ATTR_VALUE ) ) ) ;
    public final EObject ruleHtmlAttr() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_WS_1=null;
        Token this_ASSIGN_2=null;
        Token this_WS_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:308:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? this_ASSIGN_2= RULE_ASSIGN (this_WS_3= RULE_WS )? ( (lv_value_4_0= RULE_ATTR_VALUE ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? this_ASSIGN_2= RULE_ASSIGN (this_WS_3= RULE_WS )? ( (lv_value_4_0= RULE_ATTR_VALUE ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:309:1: ( ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? this_ASSIGN_2= RULE_ASSIGN (this_WS_3= RULE_WS )? ( (lv_value_4_0= RULE_ATTR_VALUE ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:309:2: ( (lv_name_0_0= RULE_ID ) ) (this_WS_1= RULE_WS )? this_ASSIGN_2= RULE_ASSIGN (this_WS_3= RULE_WS )? ( (lv_value_4_0= RULE_ATTR_VALUE ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:309:2: ( (lv_name_0_0= RULE_ID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:310:1: (lv_name_0_0= RULE_ID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:310:1: (lv_name_0_0= RULE_ID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:311:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHtmlAttr572); 

            			newLeafNode(lv_name_0_0, grammarAccess.getHtmlAttrAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHtmlAttrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:327:2: (this_WS_1= RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:327:3: this_WS_1= RULE_WS
                    {
                    this_WS_1=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleHtmlAttr589); 
                     
                        newLeafNode(this_WS_1, grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            this_ASSIGN_2=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleHtmlAttr601); 
             
                newLeafNode(this_ASSIGN_2, grammarAccess.getHtmlAttrAccess().getASSIGNTerminalRuleCall_2()); 
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:335:1: (this_WS_3= RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:335:2: this_WS_3= RULE_WS
                    {
                    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleHtmlAttr612); 
                     
                        newLeafNode(this_WS_3, grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:339:3: ( (lv_value_4_0= RULE_ATTR_VALUE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:340:1: (lv_value_4_0= RULE_ATTR_VALUE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:340:1: (lv_value_4_0= RULE_ATTR_VALUE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotHtmlLabelParser.g:341:3: lv_value_4_0= RULE_ATTR_VALUE
            {
            lv_value_4_0=(Token)match(input,RULE_ATTR_VALUE,FOLLOW_RULE_ATTR_VALUE_in_ruleHtmlAttr630); 

            			newLeafNode(lv_value_4_0, grammarAccess.getHtmlAttrAccess().getValueATTR_VALUETerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHtmlAttrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"ATTR_VALUE");
            	    

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
    // $ANTLR end "ruleHtmlAttr"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHtmlLabel_in_entryRuleHtmlLabel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlLabel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_ruleHtmlLabel122 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_entryRuleHtmlContent157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlContent167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlTag_in_ruleHtmlContent213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleHtmlContent236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlTag_in_entryRuleHtmlTag282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlTag292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_in_ruleHtmlTag332 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHtmlTag348 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_ruleHtmlAttr_in_ruleHtmlTag374 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_RULE_TAG_END_CLOSE_in_ruleHtmlTag393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleHtmlTag416 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_ruleHtmlTag436 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_RULE_TAG_START_CLOSE_in_ruleHtmlTag448 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHtmlTag464 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_ruleHtmlTag480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlAttr_in_entryRuleHtmlAttr520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlAttr530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHtmlAttr572 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleHtmlAttr589 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleHtmlAttr601 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleHtmlAttr612 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ATTR_VALUE_in_ruleHtmlAttr630 = new BitSet(new long[]{0x0000000000000002L});

}