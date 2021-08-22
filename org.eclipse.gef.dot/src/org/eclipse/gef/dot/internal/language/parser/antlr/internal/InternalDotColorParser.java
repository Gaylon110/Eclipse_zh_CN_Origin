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
import org.eclipse.gef.dot.internal.language.services.DotColorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotColorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NumberSign", "Comma", "Solidus", "RULE_DIGITS", "RULE_ZERO_OR_ONE", "RULE_COLOR_NUMBER", "RULE_HEXADECIMAL_DIGIT", "RULE_COLOR_STRING", "RULE_WS"
    };
    public static final int RULE_WS=12;
    public static final int RULE_COLOR_STRING=11;
    public static final int RULE_DIGITS=7;
    public static final int RULE_ZERO_OR_ONE=8;
    public static final int Comma=5;
    public static final int RULE_COLOR_NUMBER=9;
    public static final int NumberSign=4;
    public static final int RULE_HEXADECIMAL_DIGIT=10;
    public static final int Solidus=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotColorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotColorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotColorParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g"; }




    	private DotColorGrammarAccess grammarAccess;
    	 	
    	public InternalDotColorParser(TokenStream input, DotColorGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Color";	
    	} 
    	   	   	
    	@Override
    	protected DotColorGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:61:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:62:2: (iv_ruleColor= ruleColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:63:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor67);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor77); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:70:1: ruleColor returns [EObject current=null] : (this_RGBColor_0= ruleRGBColor | this_HSVColor_1= ruleHSVColor | this_StringColor_2= ruleStringColor ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        EObject this_RGBColor_0 = null;

        EObject this_HSVColor_1 = null;

        EObject this_StringColor_2 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:73:28: ( (this_RGBColor_0= ruleRGBColor | this_HSVColor_1= ruleHSVColor | this_StringColor_2= ruleStringColor ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:74:1: (this_RGBColor_0= ruleRGBColor | this_HSVColor_1= ruleHSVColor | this_StringColor_2= ruleStringColor )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:74:1: (this_RGBColor_0= ruleRGBColor | this_HSVColor_1= ruleHSVColor | this_StringColor_2= ruleStringColor )
            int alt1=3;
            switch ( input.LA(1) ) {
            case NumberSign:
                {
                alt1=1;
                }
                break;
            case RULE_COLOR_NUMBER:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF) ) {
                    alt1=3;
                }
                else if ( (LA1_2==Comma||LA1_2==RULE_COLOR_NUMBER) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case Solidus:
            case RULE_HEXADECIMAL_DIGIT:
            case RULE_COLOR_STRING:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:75:5: this_RGBColor_0= ruleRGBColor
                    {
                     
                            newCompositeNode(grammarAccess.getColorAccess().getRGBColorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRGBColor_in_ruleColor124);
                    this_RGBColor_0=ruleRGBColor();

                    state._fsp--;


                            current = this_RGBColor_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:85:5: this_HSVColor_1= ruleHSVColor
                    {
                     
                            newCompositeNode(grammarAccess.getColorAccess().getHSVColorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHSVColor_in_ruleColor151);
                    this_HSVColor_1=ruleHSVColor();

                    state._fsp--;


                            current = this_HSVColor_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:95:5: this_StringColor_2= ruleStringColor
                    {
                     
                            newCompositeNode(grammarAccess.getColorAccess().getStringColorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringColor_in_ruleColor178);
                    this_StringColor_2=ruleStringColor();

                    state._fsp--;


                            current = this_StringColor_2;
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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleRGBColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:111:1: entryRuleRGBColor returns [EObject current=null] : iv_ruleRGBColor= ruleRGBColor EOF ;
    public final EObject entryRuleRGBColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGBColor = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:112:2: (iv_ruleRGBColor= ruleRGBColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:113:2: iv_ruleRGBColor= ruleRGBColor EOF
            {
             newCompositeNode(grammarAccess.getRGBColorRule()); 
            pushFollow(FOLLOW_ruleRGBColor_in_entryRuleRGBColor212);
            iv_ruleRGBColor=ruleRGBColor();

            state._fsp--;

             current =iv_ruleRGBColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGBColor222); 

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
    // $ANTLR end "entryRuleRGBColor"


    // $ANTLR start "ruleRGBColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:120:1: ruleRGBColor returns [EObject current=null] : (otherlv_0= NumberSign ( (lv_r_1_0= rulehex ) ) ( (lv_g_2_0= rulehex ) ) ( (lv_b_3_0= rulehex ) ) ( (lv_a_4_0= rulehex ) )? ) ;
    public final EObject ruleRGBColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_r_1_0 = null;

        AntlrDatatypeRuleToken lv_g_2_0 = null;

        AntlrDatatypeRuleToken lv_b_3_0 = null;

        AntlrDatatypeRuleToken lv_a_4_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:123:28: ( (otherlv_0= NumberSign ( (lv_r_1_0= rulehex ) ) ( (lv_g_2_0= rulehex ) ) ( (lv_b_3_0= rulehex ) ) ( (lv_a_4_0= rulehex ) )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:124:1: (otherlv_0= NumberSign ( (lv_r_1_0= rulehex ) ) ( (lv_g_2_0= rulehex ) ) ( (lv_b_3_0= rulehex ) ) ( (lv_a_4_0= rulehex ) )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:124:1: (otherlv_0= NumberSign ( (lv_r_1_0= rulehex ) ) ( (lv_g_2_0= rulehex ) ) ( (lv_b_3_0= rulehex ) ) ( (lv_a_4_0= rulehex ) )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:125:2: otherlv_0= NumberSign ( (lv_r_1_0= rulehex ) ) ( (lv_g_2_0= rulehex ) ) ( (lv_b_3_0= rulehex ) ) ( (lv_a_4_0= rulehex ) )?
            {
            otherlv_0=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_ruleRGBColor260); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBColorAccess().getNumberSignKeyword_0());
                
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:129:1: ( (lv_r_1_0= rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:130:1: (lv_r_1_0= rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:130:1: (lv_r_1_0= rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:131:3: lv_r_1_0= rulehex
            {
             
            	        newCompositeNode(grammarAccess.getRGBColorAccess().getRHexParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulehex_in_ruleRGBColor280);
            lv_r_1_0=rulehex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
            	        }
                   		set(
                   			current, 
                   			"r",
                    		lv_r_1_0, 
                    		"hex");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:147:2: ( (lv_g_2_0= rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:148:1: (lv_g_2_0= rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:148:1: (lv_g_2_0= rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:149:3: lv_g_2_0= rulehex
            {
             
            	        newCompositeNode(grammarAccess.getRGBColorAccess().getGHexParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulehex_in_ruleRGBColor301);
            lv_g_2_0=rulehex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
            	        }
                   		set(
                   			current, 
                   			"g",
                    		lv_g_2_0, 
                    		"hex");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:165:2: ( (lv_b_3_0= rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:166:1: (lv_b_3_0= rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:166:1: (lv_b_3_0= rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:167:3: lv_b_3_0= rulehex
            {
             
            	        newCompositeNode(grammarAccess.getRGBColorAccess().getBHexParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulehex_in_ruleRGBColor322);
            lv_b_3_0=rulehex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
            	        }
                   		set(
                   			current, 
                   			"b",
                    		lv_b_3_0, 
                    		"hex");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:183:2: ( (lv_a_4_0= rulehex ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_HEXADECIMAL_DIGIT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:184:1: (lv_a_4_0= rulehex )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:184:1: (lv_a_4_0= rulehex )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:185:3: lv_a_4_0= rulehex
                    {
                     
                    	        newCompositeNode(grammarAccess.getRGBColorAccess().getAHexParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulehex_in_ruleRGBColor343);
                    lv_a_4_0=rulehex();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRGBColorRule());
                    	        }
                           		set(
                           			current, 
                           			"a",
                            		lv_a_4_0, 
                            		"hex");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleRGBColor"


    // $ANTLR start "entryRuleHSVColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:209:1: entryRuleHSVColor returns [EObject current=null] : iv_ruleHSVColor= ruleHSVColor EOF ;
    public final EObject entryRuleHSVColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHSVColor = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:210:2: (iv_ruleHSVColor= ruleHSVColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:211:2: iv_ruleHSVColor= ruleHSVColor EOF
            {
             newCompositeNode(grammarAccess.getHSVColorRule()); 
            pushFollow(FOLLOW_ruleHSVColor_in_entryRuleHSVColor379);
            iv_ruleHSVColor=ruleHSVColor();

            state._fsp--;

             current =iv_ruleHSVColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHSVColor389); 

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
    // $ANTLR end "entryRuleHSVColor"


    // $ANTLR start "ruleHSVColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:218:1: ruleHSVColor returns [EObject current=null] : ( ( (lv_h_0_0= RULE_COLOR_NUMBER ) ) (otherlv_1= Comma )? ( (lv_s_2_0= RULE_COLOR_NUMBER ) ) (otherlv_3= Comma )? ( (lv_v_4_0= RULE_COLOR_NUMBER ) ) ) ;
    public final EObject ruleHSVColor() throws RecognitionException {
        EObject current = null;

        Token lv_h_0_0=null;
        Token otherlv_1=null;
        Token lv_s_2_0=null;
        Token otherlv_3=null;
        Token lv_v_4_0=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:221:28: ( ( ( (lv_h_0_0= RULE_COLOR_NUMBER ) ) (otherlv_1= Comma )? ( (lv_s_2_0= RULE_COLOR_NUMBER ) ) (otherlv_3= Comma )? ( (lv_v_4_0= RULE_COLOR_NUMBER ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:222:1: ( ( (lv_h_0_0= RULE_COLOR_NUMBER ) ) (otherlv_1= Comma )? ( (lv_s_2_0= RULE_COLOR_NUMBER ) ) (otherlv_3= Comma )? ( (lv_v_4_0= RULE_COLOR_NUMBER ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:222:1: ( ( (lv_h_0_0= RULE_COLOR_NUMBER ) ) (otherlv_1= Comma )? ( (lv_s_2_0= RULE_COLOR_NUMBER ) ) (otherlv_3= Comma )? ( (lv_v_4_0= RULE_COLOR_NUMBER ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:222:2: ( (lv_h_0_0= RULE_COLOR_NUMBER ) ) (otherlv_1= Comma )? ( (lv_s_2_0= RULE_COLOR_NUMBER ) ) (otherlv_3= Comma )? ( (lv_v_4_0= RULE_COLOR_NUMBER ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:222:2: ( (lv_h_0_0= RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:223:1: (lv_h_0_0= RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:223:1: (lv_h_0_0= RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:224:3: lv_h_0_0= RULE_COLOR_NUMBER
            {
            lv_h_0_0=(Token)match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor431); 

            			newLeafNode(lv_h_0_0, grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHSVColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"h",
                    		lv_h_0_0, 
                    		"COLOR_NUMBER");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:240:2: (otherlv_1= Comma )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Comma) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:241:2: otherlv_1= Comma
                    {
                    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleHSVColor450); 

                        	newLeafNode(otherlv_1, grammarAccess.getHSVColorAccess().getCommaKeyword_1());
                        

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:245:3: ( (lv_s_2_0= RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:246:1: (lv_s_2_0= RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:246:1: (lv_s_2_0= RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:247:3: lv_s_2_0= RULE_COLOR_NUMBER
            {
            lv_s_2_0=(Token)match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor468); 

            			newLeafNode(lv_s_2_0, grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHSVColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"s",
                    		lv_s_2_0, 
                    		"COLOR_NUMBER");
            	    

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:263:2: (otherlv_3= Comma )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Comma) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:264:2: otherlv_3= Comma
                    {
                    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleHSVColor487); 

                        	newLeafNode(otherlv_3, grammarAccess.getHSVColorAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:268:3: ( (lv_v_4_0= RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:269:1: (lv_v_4_0= RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:269:1: (lv_v_4_0= RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:270:3: lv_v_4_0= RULE_COLOR_NUMBER
            {
            lv_v_4_0=(Token)match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor505); 

            			newLeafNode(lv_v_4_0, grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHSVColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"v",
                    		lv_v_4_0, 
                    		"COLOR_NUMBER");
            	    

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
    // $ANTLR end "ruleHSVColor"


    // $ANTLR start "entryRuleStringColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:294:1: entryRuleStringColor returns [EObject current=null] : iv_ruleStringColor= ruleStringColor EOF ;
    public final EObject entryRuleStringColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringColor = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:295:2: (iv_ruleStringColor= ruleStringColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:296:2: iv_ruleStringColor= ruleStringColor EOF
            {
             newCompositeNode(grammarAccess.getStringColorRule()); 
            pushFollow(FOLLOW_ruleStringColor_in_entryRuleStringColor545);
            iv_ruleStringColor=ruleStringColor();

            state._fsp--;

             current =iv_ruleStringColor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringColor555); 

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
    // $ANTLR end "entryRuleStringColor"


    // $ANTLR start "ruleStringColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:303:1: ruleStringColor returns [EObject current=null] : ( (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )? ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) ) ) ;
    public final EObject ruleStringColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_scheme_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token lv_name_3_3=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:306:28: ( ( (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )? ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:307:1: ( (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )? ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:307:1: ( (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )? ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:307:2: (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )? ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:307:2: (otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Solidus) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:308:2: otherlv_0= Solidus ( (lv_scheme_1_0= RULE_COLOR_STRING ) )? otherlv_2= Solidus
                    {
                    otherlv_0=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleStringColor594); 

                        	newLeafNode(otherlv_0, grammarAccess.getStringColorAccess().getSolidusKeyword_0_0());
                        
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:312:1: ( (lv_scheme_1_0= RULE_COLOR_STRING ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_COLOR_STRING) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:313:1: (lv_scheme_1_0= RULE_COLOR_STRING )
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:313:1: (lv_scheme_1_0= RULE_COLOR_STRING )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:314:3: lv_scheme_1_0= RULE_COLOR_STRING
                            {
                            lv_scheme_1_0=(Token)match(input,RULE_COLOR_STRING,FOLLOW_RULE_COLOR_STRING_in_ruleStringColor610); 

                            			newLeafNode(lv_scheme_1_0, grammarAccess.getStringColorAccess().getSchemeCOLOR_STRINGTerminalRuleCall_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStringColorRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"scheme",
                                    		lv_scheme_1_0, 
                                    		"COLOR_STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleStringColor629); 

                        	newLeafNode(otherlv_2, grammarAccess.getStringColorAccess().getSolidusKeyword_0_2());
                        

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:335:3: ( ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:336:1: ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:336:1: ( (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:337:1: (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:337:1: (lv_name_3_1= RULE_HEXADECIMAL_DIGIT | lv_name_3_2= RULE_COLOR_STRING | lv_name_3_3= RULE_COLOR_NUMBER )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_HEXADECIMAL_DIGIT:
                {
                alt7=1;
                }
                break;
            case RULE_COLOR_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_COLOR_NUMBER:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:338:3: lv_name_3_1= RULE_HEXADECIMAL_DIGIT
                    {
                    lv_name_3_1=(Token)match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_ruleStringColor649); 

                    			newLeafNode(lv_name_3_1, grammarAccess.getStringColorAccess().getNameHEXADECIMAL_DIGITTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringColorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_1, 
                            		"HEXADECIMAL_DIGIT");
                    	    

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:353:8: lv_name_3_2= RULE_COLOR_STRING
                    {
                    lv_name_3_2=(Token)match(input,RULE_COLOR_STRING,FOLLOW_RULE_COLOR_STRING_in_ruleStringColor669); 

                    			newLeafNode(lv_name_3_2, grammarAccess.getStringColorAccess().getNameCOLOR_STRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringColorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_2, 
                            		"COLOR_STRING");
                    	    

                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:368:8: lv_name_3_3= RULE_COLOR_NUMBER
                    {
                    lv_name_3_3=(Token)match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_ruleStringColor689); 

                    			newLeafNode(lv_name_3_3, grammarAccess.getStringColorAccess().getNameCOLOR_NUMBERTerminalRuleCall_1_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStringColorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_3, 
                            		"COLOR_NUMBER");
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleStringColor"


    // $ANTLR start "entryRulehex"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:394:1: entryRulehex returns [String current=null] : iv_rulehex= rulehex EOF ;
    public final String entryRulehex() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulehex = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:395:1: (iv_rulehex= rulehex EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:396:2: iv_rulehex= rulehex EOF
            {
             newCompositeNode(grammarAccess.getHexRule()); 
            pushFollow(FOLLOW_rulehex_in_entryRulehex733);
            iv_rulehex=rulehex();

            state._fsp--;

             current =iv_rulehex.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulehex744); 

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
    // $ANTLR end "entryRulehex"


    // $ANTLR start "rulehex"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:403:1: rulehex returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEXADECIMAL_DIGIT_0= RULE_HEXADECIMAL_DIGIT this_HEXADECIMAL_DIGIT_1= RULE_HEXADECIMAL_DIGIT ) ;
    public final AntlrDatatypeRuleToken rulehex() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEXADECIMAL_DIGIT_0=null;
        Token this_HEXADECIMAL_DIGIT_1=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:407:6: ( (this_HEXADECIMAL_DIGIT_0= RULE_HEXADECIMAL_DIGIT this_HEXADECIMAL_DIGIT_1= RULE_HEXADECIMAL_DIGIT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:408:1: (this_HEXADECIMAL_DIGIT_0= RULE_HEXADECIMAL_DIGIT this_HEXADECIMAL_DIGIT_1= RULE_HEXADECIMAL_DIGIT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:408:1: (this_HEXADECIMAL_DIGIT_0= RULE_HEXADECIMAL_DIGIT this_HEXADECIMAL_DIGIT_1= RULE_HEXADECIMAL_DIGIT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotColorParser.g:408:6: this_HEXADECIMAL_DIGIT_0= RULE_HEXADECIMAL_DIGIT this_HEXADECIMAL_DIGIT_1= RULE_HEXADECIMAL_DIGIT
            {
            this_HEXADECIMAL_DIGIT_0=(Token)match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rulehex784); 

            		current.merge(this_HEXADECIMAL_DIGIT_0);
                
             
                newLeafNode(this_HEXADECIMAL_DIGIT_0, grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_0()); 
                
            this_HEXADECIMAL_DIGIT_1=(Token)match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rulehex804); 

            		current.merge(this_HEXADECIMAL_DIGIT_1);
                
             
                newLeafNode(this_HEXADECIMAL_DIGIT_1, grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_1()); 
                

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
    // $ANTLR end "rulehex"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBColor_in_ruleColor124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHSVColor_in_ruleColor151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringColor_in_ruleColor178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBColor_in_entryRuleRGBColor212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGBColor222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_ruleRGBColor260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulehex_in_ruleRGBColor280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulehex_in_ruleRGBColor301 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulehex_in_ruleRGBColor322 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rulehex_in_ruleRGBColor343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHSVColor_in_entryRuleHSVColor379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHSVColor389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor431 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_Comma_in_ruleHSVColor450 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor468 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_Comma_in_ruleHSVColor487 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_ruleHSVColor505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringColor_in_entryRuleStringColor545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringColor555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Solidus_in_ruleStringColor594 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_RULE_COLOR_STRING_in_ruleStringColor610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Solidus_in_ruleStringColor629 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_ruleStringColor649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_STRING_in_ruleStringColor669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_ruleStringColor689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_entryRulehex733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehex744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rulehex784 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rulehex804 = new BitSet(new long[]{0x0000000000000002L});

}