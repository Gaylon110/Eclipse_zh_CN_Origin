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
import org.eclipse.gef.dot.internal.language.services.DotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Subgraph", "Digraph", "Strict", "Graph", "Edge", "Node", "HyphenMinusHyphenMinus", "HyphenMinusGreaterThanSign", "Comma", "Colon", "Semicolon", "EqualsSign", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_NUMERAL", "RULE_COMPASS_PT", "RULE_STRING", "RULE_QUOTED_STRING", "RULE_HTML_TAG_OPEN", "RULE_HTML_TAG_CLOSE", "RULE_HTML_CHARS", "RULE_HTML_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int HyphenMinusHyphenMinus=10;
    public static final int Node=9;
    public static final int RULE_STRING=22;
    public static final int RULE_NUMERAL=20;
    public static final int RULE_SL_COMMENT=29;
    public static final int Comma=12;
    public static final int EqualsSign=15;
    public static final int RULE_QUOTED_STRING=23;
    public static final int Strict=6;
    public static final int Colon=13;
    public static final int RightCurlyBracket=19;
    public static final int EOF=-1;
    public static final int RightSquareBracket=17;
    public static final int RULE_HTML_TAG_OPEN=24;
    public static final int RULE_WS=30;
    public static final int LeftCurlyBracket=18;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_COMPASS_PT=21;
    public static final int RULE_HTML_TAG_CLOSE=25;
    public static final int Semicolon=14;
    public static final int Graph=7;
    public static final int Subgraph=4;
    public static final int RULE_HTML_STRING=27;
    public static final int RULE_ML_COMMENT=28;
    public static final int LeftSquareBracket=16;
    public static final int Digraph=5;
    public static final int HyphenMinusGreaterThanSign=11;
    public static final int RULE_HTML_CHARS=26;
    public static final int Edge=8;

    // delegates
    // delegators


        public InternalDotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g"; }




    	private DotGrammarAccess grammarAccess;
    	 	
    	public InternalDotParser(TokenStream input, DotGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "DotAst";	
    	} 
    	   	   	
    	@Override
    	protected DotGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleDotAst"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:62:1: entryRuleDotAst returns [EObject current=null] : iv_ruleDotAst= ruleDotAst EOF ;
    public final EObject entryRuleDotAst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotAst = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:63:2: (iv_ruleDotAst= ruleDotAst EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:64:2: iv_ruleDotAst= ruleDotAst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotAstRule()); 
            }
            pushFollow(FOLLOW_ruleDotAst_in_entryRuleDotAst67);
            iv_ruleDotAst=ruleDotAst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotAst; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotAst77); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDotAst"


    // $ANTLR start "ruleDotAst"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:71:1: ruleDotAst returns [EObject current=null] : ( (lv_graphs_0_0= ruleDotGraph ) )* ;
    public final EObject ruleDotAst() throws RecognitionException {
        EObject current = null;

        EObject lv_graphs_0_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:74:28: ( ( (lv_graphs_0_0= ruleDotGraph ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:75:1: ( (lv_graphs_0_0= ruleDotGraph ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:75:1: ( (lv_graphs_0_0= ruleDotGraph ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Digraph && LA1_0<=Graph)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:76:1: (lv_graphs_0_0= ruleDotGraph )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:76:1: (lv_graphs_0_0= ruleDotGraph )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:77:3: lv_graphs_0_0= ruleDotGraph
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDotGraph_in_ruleDotAst122);
            	    lv_graphs_0_0=ruleDotGraph();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDotAstRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"graphs",
            	              		lv_graphs_0_0, 
            	              		"DotGraph");
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
    // $ANTLR end "ruleDotAst"


    // $ANTLR start "entryRuleDotGraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:101:1: entryRuleDotGraph returns [EObject current=null] : iv_ruleDotGraph= ruleDotGraph EOF ;
    public final EObject entryRuleDotGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDotGraph = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:102:2: (iv_ruleDotGraph= ruleDotGraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:103:2: iv_ruleDotGraph= ruleDotGraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDotGraphRule()); 
            }
            pushFollow(FOLLOW_ruleDotGraph_in_entryRuleDotGraph157);
            iv_ruleDotGraph=ruleDotGraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDotGraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotGraph167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:110:1: ruleDotGraph returns [EObject current=null] : ( ( (lv_strict_0_0= Strict ) )? ( (lv_type_1_0= ruleGraphType ) ) ( (lv_name_2_0= ruleID ) )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleDotGraph() throws RecognitionException {
        EObject current = null;

        Token lv_strict_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_stmts_4_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:113:28: ( ( ( (lv_strict_0_0= Strict ) )? ( (lv_type_1_0= ruleGraphType ) ) ( (lv_name_2_0= ruleID ) )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:114:1: ( ( (lv_strict_0_0= Strict ) )? ( (lv_type_1_0= ruleGraphType ) ) ( (lv_name_2_0= ruleID ) )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:114:1: ( ( (lv_strict_0_0= Strict ) )? ( (lv_type_1_0= ruleGraphType ) ) ( (lv_name_2_0= ruleID ) )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:114:2: ( (lv_strict_0_0= Strict ) )? ( (lv_type_1_0= ruleGraphType ) ) ( (lv_name_2_0= ruleID ) )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:114:2: ( (lv_strict_0_0= Strict ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Strict) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:115:1: (lv_strict_0_0= Strict )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:115:1: (lv_strict_0_0= Strict )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:116:3: lv_strict_0_0= Strict
                    {
                    lv_strict_0_0=(Token)match(input,Strict,FOLLOW_Strict_in_ruleDotGraph211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_strict_0_0, grammarAccess.getDotGraphAccess().getStrictStrictKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDotGraphRule());
                      	        }
                             		setWithLastConsumed(current, "strict", true, "strict");
                      	    
                    }

                    }


                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:130:3: ( (lv_type_1_0= ruleGraphType ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:131:1: (lv_type_1_0= ruleGraphType )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:131:1: (lv_type_1_0= ruleGraphType )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:132:3: lv_type_1_0= ruleGraphType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGraphType_in_ruleDotGraph244);
            lv_type_1_0=ruleGraphType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"GraphType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:148:2: ( (lv_name_2_0= ruleID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_NUMERAL && LA3_0<=RULE_QUOTED_STRING)||LA3_0==RULE_HTML_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:149:1: (lv_name_2_0= ruleID )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:149:1: (lv_name_2_0= ruleID )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:150:3: lv_name_2_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDotGraphAccess().getNameIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleID_in_ruleDotGraph265);
                    lv_name_2_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_2_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleDotGraph279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:171:1: ( (lv_stmts_4_0= ruleStmt ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Subgraph||(LA4_0>=Graph && LA4_0<=Node)||LA4_0==LeftCurlyBracket||(LA4_0>=RULE_NUMERAL && LA4_0<=RULE_QUOTED_STRING)||LA4_0==RULE_HTML_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:172:1: (lv_stmts_4_0= ruleStmt )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:172:1: (lv_stmts_4_0= ruleStmt )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:173:3: lv_stmts_4_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStmt_in_ruleDotGraph299);
            	    lv_stmts_4_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDotGraphRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stmts",
            	              		lv_stmts_4_0, 
            	              		"Stmt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleDotGraph313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5());
                  
            }

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
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:202:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:203:2: (iv_ruleStmt= ruleStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:204:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt347);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt357); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:211:1: ruleStmt returns [EObject current=null] : ( (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= Semicolon )? ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_NodeStmt_0 = null;

        EObject this_EdgeStmtNode_1 = null;

        EObject this_AttrStmt_2 = null;

        EObject this_Attribute_3 = null;

        EObject this_SubgraphOrEdgeStmtSubgraph_4 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:214:28: ( ( (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= Semicolon )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:215:1: ( (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= Semicolon )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:215:1: ( (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= Semicolon )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:215:2: (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph ) (otherlv_5= Semicolon )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:215:2: (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:216:5: this_NodeStmt_0= ruleNodeStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeStmt_in_ruleStmt405);
                    this_NodeStmt_0=ruleNodeStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_NodeStmt_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:226:5: this_EdgeStmtNode_1= ruleEdgeStmtNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeStmtNode_in_ruleStmt432);
                    this_EdgeStmtNode_1=ruleEdgeStmtNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EdgeStmtNode_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:236:5: this_AttrStmt_2= ruleAttrStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttrStmt_in_ruleStmt459);
                    this_AttrStmt_2=ruleAttrStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AttrStmt_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:246:5: this_Attribute_3= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleStmt486);
                    this_Attribute_3=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Attribute_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:256:5: this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_ruleStmt513);
                    this_SubgraphOrEdgeStmtSubgraph_4=ruleSubgraphOrEdgeStmtSubgraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_SubgraphOrEdgeStmtSubgraph_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:264:2: (otherlv_5= Semicolon )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Semicolon) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:265:2: otherlv_5= Semicolon
                    {
                    otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleStmt527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStmtAccess().getSemicolonKeyword_1());
                          
                    }

                    }
                    break;

            }


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
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleEdgeStmtNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:277:1: entryRuleEdgeStmtNode returns [EObject current=null] : iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF ;
    public final EObject entryRuleEdgeStmtNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStmtNode = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:278:2: (iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:279:2: iv_ruleEdgeStmtNode= ruleEdgeStmtNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeStmtNodeRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeStmtNode_in_entryRuleEdgeStmtNode563);
            iv_ruleEdgeStmtNode=ruleEdgeStmtNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeStmtNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeStmtNode573); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeStmtNode"


    // $ANTLR start "ruleEdgeStmtNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:286:1: ruleEdgeStmtNode returns [EObject current=null] : ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+ ( (lv_attrLists_2_0= ruleAttrList ) )* ) ;
    public final EObject ruleEdgeStmtNode() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;

        EObject lv_edgeRHS_1_0 = null;

        EObject lv_attrLists_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:289:28: ( ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+ ( (lv_attrLists_2_0= ruleAttrList ) )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:290:1: ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+ ( (lv_attrLists_2_0= ruleAttrList ) )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:290:1: ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+ ( (lv_attrLists_2_0= ruleAttrList ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:290:2: ( (lv_node_0_0= ruleNodeId ) ) ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+ ( (lv_attrLists_2_0= ruleAttrList ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:290:2: ( (lv_node_0_0= ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:291:1: (lv_node_0_0= ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:291:1: (lv_node_0_0= ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:292:3: lv_node_0_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeId_in_ruleEdgeStmtNode619);
            lv_node_0_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_0_0, 
                      		"NodeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:308:2: ( (lv_edgeRHS_1_0= ruleEdgeRhs ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=HyphenMinusHyphenMinus && LA7_0<=HyphenMinusGreaterThanSign)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:309:1: (lv_edgeRHS_1_0= ruleEdgeRhs )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:309:1: (lv_edgeRHS_1_0= ruleEdgeRhs )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:310:3: lv_edgeRHS_1_0= ruleEdgeRhs
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEdgeRhs_in_ruleEdgeStmtNode640);
            	    lv_edgeRHS_1_0=ruleEdgeRhs();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"edgeRHS",
            	              		lv_edgeRHS_1_0, 
            	              		"EdgeRhs");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:326:3: ( (lv_attrLists_2_0= ruleAttrList ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LeftSquareBracket) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:327:1: (lv_attrLists_2_0= ruleAttrList )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:327:1: (lv_attrLists_2_0= ruleAttrList )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:328:3: lv_attrLists_2_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttrList_in_ruleEdgeStmtNode662);
            	    lv_attrLists_2_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEdgeStmtNodeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attrLists",
            	              		lv_attrLists_2_0, 
            	              		"AttrList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleEdgeStmtNode"


    // $ANTLR start "entryRuleNodeStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:354:1: entryRuleNodeStmt returns [EObject current=null] : iv_ruleNodeStmt= ruleNodeStmt EOF ;
    public final EObject entryRuleNodeStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStmt = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:355:2: (iv_ruleNodeStmt= ruleNodeStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:356:2: iv_ruleNodeStmt= ruleNodeStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeStmtRule()); 
            }
            pushFollow(FOLLOW_ruleNodeStmt_in_entryRuleNodeStmt700);
            iv_ruleNodeStmt=ruleNodeStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeStmt710); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeStmt"


    // $ANTLR start "ruleNodeStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:363:1: ruleNodeStmt returns [EObject current=null] : ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_attrLists_1_0= ruleAttrList ) )* ) ;
    public final EObject ruleNodeStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_node_0_0 = null;

        EObject lv_attrLists_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:366:28: ( ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_attrLists_1_0= ruleAttrList ) )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:367:1: ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_attrLists_1_0= ruleAttrList ) )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:367:1: ( ( (lv_node_0_0= ruleNodeId ) ) ( (lv_attrLists_1_0= ruleAttrList ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:367:2: ( (lv_node_0_0= ruleNodeId ) ) ( (lv_attrLists_1_0= ruleAttrList ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:367:2: ( (lv_node_0_0= ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:368:1: (lv_node_0_0= ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:368:1: (lv_node_0_0= ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:369:3: lv_node_0_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeId_in_ruleNodeStmt756);
            lv_node_0_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeStmtRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_0_0, 
                      		"NodeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:385:2: ( (lv_attrLists_1_0= ruleAttrList ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LeftSquareBracket) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:386:1: (lv_attrLists_1_0= ruleAttrList )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:386:1: (lv_attrLists_1_0= ruleAttrList )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:387:3: lv_attrLists_1_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttrList_in_ruleNodeStmt777);
            	    lv_attrLists_1_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNodeStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attrLists",
            	              		lv_attrLists_1_0, 
            	              		"AttrList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleNodeStmt"


    // $ANTLR start "entryRuleAttrStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:411:1: entryRuleAttrStmt returns [EObject current=null] : iv_ruleAttrStmt= ruleAttrStmt EOF ;
    public final EObject entryRuleAttrStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrStmt = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:412:2: (iv_ruleAttrStmt= ruleAttrStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:413:2: iv_ruleAttrStmt= ruleAttrStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrStmtRule()); 
            }
            pushFollow(FOLLOW_ruleAttrStmt_in_entryRuleAttrStmt813);
            iv_ruleAttrStmt=ruleAttrStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrStmt823); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttrStmt"


    // $ANTLR start "ruleAttrStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:420:1: ruleAttrStmt returns [EObject current=null] : ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_attrLists_1_0= ruleAttrList ) )+ ) ;
    public final EObject ruleAttrStmt() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject lv_attrLists_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:423:28: ( ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_attrLists_1_0= ruleAttrList ) )+ ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:424:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_attrLists_1_0= ruleAttrList ) )+ )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:424:1: ( ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_attrLists_1_0= ruleAttrList ) )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:424:2: ( (lv_type_0_0= ruleAttributeType ) ) ( (lv_attrLists_1_0= ruleAttrList ) )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:424:2: ( (lv_type_0_0= ruleAttributeType ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:425:1: (lv_type_0_0= ruleAttributeType )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:425:1: (lv_type_0_0= ruleAttributeType )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:426:3: lv_type_0_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttrStmt869);
            lv_type_0_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttrStmtRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"AttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:442:2: ( (lv_attrLists_1_0= ruleAttrList ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LeftSquareBracket) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:443:1: (lv_attrLists_1_0= ruleAttrList )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:443:1: (lv_attrLists_1_0= ruleAttrList )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:444:3: lv_attrLists_1_0= ruleAttrList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttrList_in_ruleAttrStmt890);
            	    lv_attrLists_1_0=ruleAttrList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttrStmtRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attrLists",
            	              		lv_attrLists_1_0, 
            	              		"AttrList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleAttrStmt"


    // $ANTLR start "entryRuleAttrList"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:468:1: entryRuleAttrList returns [EObject current=null] : iv_ruleAttrList= ruleAttrList EOF ;
    public final EObject entryRuleAttrList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrList = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:469:2: (iv_ruleAttrList= ruleAttrList EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:470:2: iv_ruleAttrList= ruleAttrList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttrListRule()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList926);
            iv_ruleAttrList=ruleAttrList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttrList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:477:1: ruleAttrList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleAttrList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:480:28: ( ( () otherlv_1= LeftSquareBracket ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )* otherlv_5= RightSquareBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:481:1: ( () otherlv_1= LeftSquareBracket ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )* otherlv_5= RightSquareBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:481:1: ( () otherlv_1= LeftSquareBracket ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )* otherlv_5= RightSquareBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:481:2: () otherlv_1= LeftSquareBracket ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )* otherlv_5= RightSquareBracket
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:481:2: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:482:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttrListAccess().getAttrListAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleAttrList983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:492:1: ( ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )? )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_NUMERAL && LA12_0<=RULE_QUOTED_STRING)||LA12_0==RULE_HTML_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:492:2: ( (lv_attributes_2_0= ruleAttribute ) ) (otherlv_3= Comma | otherlv_4= Semicolon )?
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:492:2: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:493:1: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:493:1: (lv_attributes_2_0= ruleAttribute )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:494:3: lv_attributes_2_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttrList1004);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttrListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attributes",
            	              		lv_attributes_2_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:510:2: (otherlv_3= Comma | otherlv_4= Semicolon )?
            	    int alt11=3;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==Comma) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==Semicolon) ) {
            	        alt11=2;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:511:2: otherlv_3= Comma
            	            {
            	            otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_ruleAttrList1018); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:517:2: otherlv_4= Semicolon
            	            {
            	            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleAttrList1036); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleAttrList1052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3());
                  
            }

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
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRuleAttribute"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:534:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:535:2: (iv_ruleAttribute= ruleAttribute EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:536:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1086);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1096); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:543:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:546:28: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleID ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:547:1: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleID ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:547:1: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleID ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:547:2: ( (lv_name_0_0= ruleID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleID ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:547:2: ( (lv_name_0_0= ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:548:1: (lv_name_0_0= ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:548:1: (lv_name_0_0= ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:549:3: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getNameIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleAttribute1142);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleAttribute1155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:570:1: ( (lv_value_2_0= ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:571:1: (lv_value_2_0= ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:571:1: (lv_value_2_0= ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:572:3: lv_value_2_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getValueIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleAttribute1175);
            lv_value_2_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSubgraphOrEdgeStmtSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:596:1: entryRuleSubgraphOrEdgeStmtSubgraph returns [EObject current=null] : iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF ;
    public final EObject entryRuleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubgraphOrEdgeStmtSubgraph = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:597:2: (iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:598:2: iv_ruleSubgraphOrEdgeStmtSubgraph= ruleSubgraphOrEdgeStmtSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_entryRuleSubgraphOrEdgeStmtSubgraph1210);
            iv_ruleSubgraphOrEdgeStmtSubgraph=ruleSubgraphOrEdgeStmtSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubgraphOrEdgeStmtSubgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubgraphOrEdgeStmtSubgraph1220); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "ruleSubgraphOrEdgeStmtSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:605:1: ruleSubgraphOrEdgeStmtSubgraph returns [EObject current=null] : (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? ) ;
    public final EObject ruleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        EObject current = null;

        EObject this_Subgraph_0 = null;

        EObject lv_edgeRHS_2_0 = null;

        EObject lv_attrLists_3_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:608:28: ( (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:609:1: (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:609:1: (this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:610:5: this_Subgraph_0= ruleSubgraph ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSubgraph_in_ruleSubgraphOrEdgeStmtSubgraph1267);
            this_Subgraph_0=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_Subgraph_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:618:1: ( () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=HyphenMinusHyphenMinus && LA15_0<=HyphenMinusGreaterThanSign)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:618:2: () ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+ ( (lv_attrLists_3_0= ruleAttrList ) )*
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:618:2: ()
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:619:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0(),
                                  current);
                          
                    }

                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:624:2: ( (lv_edgeRHS_2_0= ruleEdgeRhs ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=HyphenMinusHyphenMinus && LA13_0<=HyphenMinusGreaterThanSign)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:625:1: (lv_edgeRHS_2_0= ruleEdgeRhs )
                    	    {
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:625:1: (lv_edgeRHS_2_0= ruleEdgeRhs )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:626:3: lv_edgeRHS_2_0= ruleEdgeRhs
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEdgeRhs_in_ruleSubgraphOrEdgeStmtSubgraph1297);
                    	    lv_edgeRHS_2_0=ruleEdgeRhs();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"edgeRHS",
                    	              		lv_edgeRHS_2_0, 
                    	              		"EdgeRhs");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:642:3: ( (lv_attrLists_3_0= ruleAttrList ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==LeftSquareBracket) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:643:1: (lv_attrLists_3_0= ruleAttrList )
                    	    {
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:643:1: (lv_attrLists_3_0= ruleAttrList )
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:644:3: lv_attrLists_3_0= ruleAttrList
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttrList_in_ruleSubgraphOrEdgeStmtSubgraph1319);
                    	    lv_attrLists_3_0=ruleAttrList();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attrLists",
                    	              		lv_attrLists_3_0, 
                    	              		"AttrList");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "entryRuleSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:668:1: entryRuleSubgraph returns [EObject current=null] : iv_ruleSubgraph= ruleSubgraph EOF ;
    public final EObject entryRuleSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubgraph = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:669:2: (iv_ruleSubgraph= ruleSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:670:2: iv_ruleSubgraph= ruleSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleSubgraph_in_entryRuleSubgraph1357);
            iv_ruleSubgraph=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubgraph1367); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubgraph"


    // $ANTLR start "ruleSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:677:1: ruleSubgraph returns [EObject current=null] : ( () (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleSubgraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_stmts_4_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:680:28: ( ( () (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:681:1: ( () (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:681:1: ( () (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:681:2: () (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )? otherlv_3= LeftCurlyBracket ( (lv_stmts_4_0= ruleStmt ) )* otherlv_5= RightCurlyBracket
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:681:2: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:682:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubgraphAccess().getSubgraphAction_0(),
                          current);
                  
            }

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:687:2: (otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Subgraph) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:688:2: otherlv_1= Subgraph ( (lv_name_2_0= ruleID ) )?
                    {
                    otherlv_1=(Token)match(input,Subgraph,FOLLOW_Subgraph_in_ruleSubgraph1415); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0());
                          
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:692:1: ( (lv_name_2_0= ruleID ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_NUMERAL && LA16_0<=RULE_QUOTED_STRING)||LA16_0==RULE_HTML_STRING) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:693:1: (lv_name_2_0= ruleID )
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:693:1: (lv_name_2_0= ruleID )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:694:3: lv_name_2_0= ruleID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSubgraphAccess().getNameIDParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleID_in_ruleSubgraph1435);
                            lv_name_2_0=ruleID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSubgraphRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_2_0, 
                                      		"ID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleSubgraph1451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:715:1: ( (lv_stmts_4_0= ruleStmt ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Subgraph||(LA18_0>=Graph && LA18_0<=Node)||LA18_0==LeftCurlyBracket||(LA18_0>=RULE_NUMERAL && LA18_0<=RULE_QUOTED_STRING)||LA18_0==RULE_HTML_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:716:1: (lv_stmts_4_0= ruleStmt )
            	    {
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:716:1: (lv_stmts_4_0= ruleStmt )
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:717:3: lv_stmts_4_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStmt_in_ruleSubgraph1471);
            	    lv_stmts_4_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSubgraphRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stmts",
            	              		lv_stmts_4_0, 
            	              		"Stmt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleSubgraph1485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4());
                  
            }

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
    // $ANTLR end "ruleSubgraph"


    // $ANTLR start "entryRulePort"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:746:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:747:2: (iv_rulePort= rulePort EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:748:2: iv_rulePort= rulePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_rulePort_in_entryRulePort1519);
            iv_rulePort=rulePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePort; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1529); if (state.failed) return current;

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:755:1: rulePort returns [EObject current=null] : ( ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) ) | (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_compass_pt_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_compass_pt_5_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:758:28: ( ( ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) ) | (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:1: ( ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) ) | (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:1: ( ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) ) | (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_NUMERAL||(LA20_1>=RULE_STRING && LA20_1<=RULE_QUOTED_STRING)||LA20_1==RULE_HTML_STRING) ) {
                    alt20=2;
                }
                else if ( (LA20_1==RULE_COMPASS_PT) ) {
                    int LA20_3 = input.LA(3);

                    if ( (synpred1_InternalDotParser()) ) {
                        alt20=1;
                    }
                    else if ( (true) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:2: ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:2: ( ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:3: ( ( Colon )=>otherlv_0= Colon ) ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:3: ( ( Colon )=>otherlv_0= Colon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:4: ( Colon )=>otherlv_0= Colon
                    {
                    otherlv_0=(Token)match(input,Colon,FOLLOW_Colon_in_rulePort1575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getColonKeyword_0_0());
                          
                    }

                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:766:2: ( (lv_compass_pt_1_0= RULE_COMPASS_PT ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:767:1: (lv_compass_pt_1_0= RULE_COMPASS_PT )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:767:1: (lv_compass_pt_1_0= RULE_COMPASS_PT )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:768:3: lv_compass_pt_1_0= RULE_COMPASS_PT
                    {
                    lv_compass_pt_1_0=(Token)match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_rulePort1592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_compass_pt_1_0, grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPortRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"compass_pt",
                              		lv_compass_pt_1_0, 
                              		"COMPASS_PT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:785:6: (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:785:6: (otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )? )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:786:2: otherlv_2= Colon ( (lv_name_3_0= ruleID ) ) (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )?
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_rulePort1618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPortAccess().getColonKeyword_1_0());
                          
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:790:1: ( (lv_name_3_0= ruleID ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:791:1: (lv_name_3_0= ruleID )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:791:1: (lv_name_3_0= ruleID )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:792:3: lv_name_3_0= ruleID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPortAccess().getNameIDParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleID_in_rulePort1638);
                    lv_name_3_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPortRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"ID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:808:2: (otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Colon) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:809:2: otherlv_4= Colon ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) )
                            {
                            otherlv_4=(Token)match(input,Colon,FOLLOW_Colon_in_rulePort1652); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getPortAccess().getColonKeyword_1_2_0());
                                  
                            }
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:813:1: ( (lv_compass_pt_5_0= RULE_COMPASS_PT ) )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:814:1: (lv_compass_pt_5_0= RULE_COMPASS_PT )
                            {
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:814:1: (lv_compass_pt_5_0= RULE_COMPASS_PT )
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:815:3: lv_compass_pt_5_0= RULE_COMPASS_PT
                            {
                            lv_compass_pt_5_0=(Token)match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_rulePort1668); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_compass_pt_5_0, grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_1_2_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPortRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"compass_pt",
                                      		lv_compass_pt_5_0, 
                                      		"COMPASS_PT");
                              	    
                            }

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleEdgeRhs"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:839:1: entryRuleEdgeRhs returns [EObject current=null] : iv_ruleEdgeRhs= ruleEdgeRhs EOF ;
    public final EObject entryRuleEdgeRhs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhs = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:840:2: (iv_ruleEdgeRhs= ruleEdgeRhs EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:841:2: iv_ruleEdgeRhs= ruleEdgeRhs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhs_in_entryRuleEdgeRhs1711);
            iv_ruleEdgeRhs=ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhs1721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeRhs"


    // $ANTLR start "ruleEdgeRhs"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:848:1: ruleEdgeRhs returns [EObject current=null] : (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph ) ;
    public final EObject ruleEdgeRhs() throws RecognitionException {
        EObject current = null;

        EObject this_EdgeRhsNode_0 = null;

        EObject this_EdgeRhsSubgraph_1 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:851:28: ( (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:852:1: (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:852:1: (this_EdgeRhsNode_0= ruleEdgeRhsNode | this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==HyphenMinusGreaterThanSign) ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=RULE_NUMERAL && LA21_1<=RULE_QUOTED_STRING)||LA21_1==RULE_HTML_STRING) ) {
                    alt21=1;
                }
                else if ( (LA21_1==Subgraph||LA21_1==LeftCurlyBracket) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==HyphenMinusHyphenMinus) ) {
                int LA21_2 = input.LA(2);

                if ( ((LA21_2>=RULE_NUMERAL && LA21_2<=RULE_QUOTED_STRING)||LA21_2==RULE_HTML_STRING) ) {
                    alt21=1;
                }
                else if ( (LA21_2==Subgraph||LA21_2==LeftCurlyBracket) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:853:5: this_EdgeRhsNode_0= ruleEdgeRhsNode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeRhsNode_in_ruleEdgeRhs1768);
                    this_EdgeRhsNode_0=ruleEdgeRhsNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EdgeRhsNode_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:863:5: this_EdgeRhsSubgraph_1= ruleEdgeRhsSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEdgeRhsSubgraph_in_ruleEdgeRhs1795);
                    this_EdgeRhsSubgraph_1=ruleEdgeRhsSubgraph();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_EdgeRhsSubgraph_1;
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleEdgeRhs"


    // $ANTLR start "entryRuleEdgeRhsNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:879:1: entryRuleEdgeRhsNode returns [EObject current=null] : iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF ;
    public final EObject entryRuleEdgeRhsNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhsNode = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:880:2: (iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:881:2: iv_ruleEdgeRhsNode= ruleEdgeRhsNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsNodeRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhsNode_in_entryRuleEdgeRhsNode1829);
            iv_ruleEdgeRhsNode=ruleEdgeRhsNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhsNode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhsNode1839); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeRhsNode"


    // $ANTLR start "ruleEdgeRhsNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:888:1: ruleEdgeRhsNode returns [EObject current=null] : ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_node_1_0= ruleNodeId ) ) ) ;
    public final EObject ruleEdgeRhsNode() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_node_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:891:28: ( ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_node_1_0= ruleNodeId ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:892:1: ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_node_1_0= ruleNodeId ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:892:1: ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_node_1_0= ruleNodeId ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:892:2: ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_node_1_0= ruleNodeId ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:892:2: ( (lv_op_0_0= ruleEdgeOp ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:893:1: (lv_op_0_0= ruleEdgeOp )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:893:1: (lv_op_0_0= ruleEdgeOp )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:894:3: lv_op_0_0= ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEdgeOp_in_ruleEdgeRhsNode1885);
            lv_op_0_0=ruleEdgeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeRhsNodeRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"EdgeOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:910:2: ( (lv_node_1_0= ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:911:1: (lv_node_1_0= ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:911:1: (lv_node_1_0= ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:912:3: lv_node_1_0= ruleNodeId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeId_in_ruleEdgeRhsNode1906);
            lv_node_1_0=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeRhsNodeRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_1_0, 
                      		"NodeId");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleEdgeRhsNode"


    // $ANTLR start "entryRuleEdgeRhsSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:936:1: entryRuleEdgeRhsSubgraph returns [EObject current=null] : iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF ;
    public final EObject entryRuleEdgeRhsSubgraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeRhsSubgraph = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:937:2: (iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:938:2: iv_ruleEdgeRhsSubgraph= ruleEdgeRhsSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhsSubgraph_in_entryRuleEdgeRhsSubgraph1941);
            iv_ruleEdgeRhsSubgraph=ruleEdgeRhsSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEdgeRhsSubgraph; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhsSubgraph1951); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEdgeRhsSubgraph"


    // $ANTLR start "ruleEdgeRhsSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:945:1: ruleEdgeRhsSubgraph returns [EObject current=null] : ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_subgraph_1_0= ruleSubgraph ) ) ) ;
    public final EObject ruleEdgeRhsSubgraph() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_0_0 = null;

        EObject lv_subgraph_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:948:28: ( ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_subgraph_1_0= ruleSubgraph ) ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:949:1: ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_subgraph_1_0= ruleSubgraph ) ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:949:1: ( ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_subgraph_1_0= ruleSubgraph ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:949:2: ( (lv_op_0_0= ruleEdgeOp ) ) ( (lv_subgraph_1_0= ruleSubgraph ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:949:2: ( (lv_op_0_0= ruleEdgeOp ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:950:1: (lv_op_0_0= ruleEdgeOp )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:950:1: (lv_op_0_0= ruleEdgeOp )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:951:3: lv_op_0_0= ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEdgeOp_in_ruleEdgeRhsSubgraph1997);
            lv_op_0_0=ruleEdgeOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeRhsSubgraphRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"EdgeOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:967:2: ( (lv_subgraph_1_0= ruleSubgraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:968:1: (lv_subgraph_1_0= ruleSubgraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:968:1: (lv_subgraph_1_0= ruleSubgraph )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:969:3: lv_subgraph_1_0= ruleSubgraph
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSubgraph_in_ruleEdgeRhsSubgraph2018);
            lv_subgraph_1_0=ruleSubgraph();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEdgeRhsSubgraphRule());
              	        }
                     		set(
                     			current, 
                     			"subgraph",
                      		lv_subgraph_1_0, 
                      		"Subgraph");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


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
    // $ANTLR end "ruleEdgeRhsSubgraph"


    // $ANTLR start "entryRuleNodeId"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:993:1: entryRuleNodeId returns [EObject current=null] : iv_ruleNodeId= ruleNodeId EOF ;
    public final EObject entryRuleNodeId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeId = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:994:2: (iv_ruleNodeId= ruleNodeId EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:995:2: iv_ruleNodeId= ruleNodeId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeIdRule()); 
            }
            pushFollow(FOLLOW_ruleNodeId_in_entryRuleNodeId2053);
            iv_ruleNodeId=ruleNodeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeId2063); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1002:1: ruleNodeId returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) ( (lv_port_1_0= rulePort ) )? ) ;
    public final EObject ruleNodeId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_port_1_0 = null;


         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1005:28: ( ( ( (lv_name_0_0= ruleID ) ) ( (lv_port_1_0= rulePort ) )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1006:1: ( ( (lv_name_0_0= ruleID ) ) ( (lv_port_1_0= rulePort ) )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1006:1: ( ( (lv_name_0_0= ruleID ) ) ( (lv_port_1_0= rulePort ) )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1006:2: ( (lv_name_0_0= ruleID ) ) ( (lv_port_1_0= rulePort ) )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1006:2: ( (lv_name_0_0= ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1007:1: (lv_name_0_0= ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1007:1: (lv_name_0_0= ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1008:3: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeIdAccess().getNameIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleID_in_ruleNodeId2109);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNodeIdRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1024:2: ( (lv_port_1_0= rulePort ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Colon) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1025:1: (lv_port_1_0= rulePort )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1025:1: (lv_port_1_0= rulePort )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1026:3: lv_port_1_0= rulePort
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePort_in_ruleNodeId2130);
                    lv_port_1_0=rulePort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeIdRule());
                      	        }
                             		set(
                             			current, 
                             			"port",
                              		lv_port_1_0, 
                              		"Port");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleID"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1050:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1051:1: (iv_ruleID= ruleID EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1052:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FOLLOW_ruleID_in_entryRuleID2167);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleID2178); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1059:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NUMERAL_0= RULE_NUMERAL | this_COMPASS_PT_1= RULE_COMPASS_PT | this_STRING_2= RULE_STRING | this_QUOTED_STRING_3= RULE_QUOTED_STRING | this_HTML_STRING_4= RULE_HTML_STRING ) ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NUMERAL_0=null;
        Token this_COMPASS_PT_1=null;
        Token this_STRING_2=null;
        Token this_QUOTED_STRING_3=null;
        Token this_HTML_STRING_4=null;

         enterRule(); 
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1063:6: ( (this_NUMERAL_0= RULE_NUMERAL | this_COMPASS_PT_1= RULE_COMPASS_PT | this_STRING_2= RULE_STRING | this_QUOTED_STRING_3= RULE_QUOTED_STRING | this_HTML_STRING_4= RULE_HTML_STRING ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1064:1: (this_NUMERAL_0= RULE_NUMERAL | this_COMPASS_PT_1= RULE_COMPASS_PT | this_STRING_2= RULE_STRING | this_QUOTED_STRING_3= RULE_QUOTED_STRING | this_HTML_STRING_4= RULE_HTML_STRING )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1064:1: (this_NUMERAL_0= RULE_NUMERAL | this_COMPASS_PT_1= RULE_COMPASS_PT | this_STRING_2= RULE_STRING | this_QUOTED_STRING_3= RULE_QUOTED_STRING | this_HTML_STRING_4= RULE_HTML_STRING )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_NUMERAL:
                {
                alt23=1;
                }
                break;
            case RULE_COMPASS_PT:
                {
                alt23=2;
                }
                break;
            case RULE_STRING:
                {
                alt23=3;
                }
                break;
            case RULE_QUOTED_STRING:
                {
                alt23=4;
                }
                break;
            case RULE_HTML_STRING:
                {
                alt23=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1064:6: this_NUMERAL_0= RULE_NUMERAL
                    {
                    this_NUMERAL_0=(Token)match(input,RULE_NUMERAL,FOLLOW_RULE_NUMERAL_in_ruleID2218); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NUMERAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NUMERAL_0, grammarAccess.getIDAccess().getNUMERALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1072:10: this_COMPASS_PT_1= RULE_COMPASS_PT
                    {
                    this_COMPASS_PT_1=(Token)match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_ruleID2244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_COMPASS_PT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMPASS_PT_1, grammarAccess.getIDAccess().getCOMPASS_PTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1080:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleID2270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getIDAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1088:10: this_QUOTED_STRING_3= RULE_QUOTED_STRING
                    {
                    this_QUOTED_STRING_3=(Token)match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_ruleID2296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QUOTED_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUOTED_STRING_3, grammarAccess.getIDAccess().getQUOTED_STRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1096:10: this_HTML_STRING_4= RULE_HTML_STRING
                    {
                    this_HTML_STRING_4=(Token)match(input,RULE_HTML_STRING,FOLLOW_RULE_HTML_STRING_in_ruleID2322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HTML_STRING_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HTML_STRING_4, grammarAccess.getIDAccess().getHTML_STRINGTerminalRuleCall_4()); 
                          
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
    // $ANTLR end "ruleID"


    // $ANTLR start "ruleEdgeOp"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1111:1: ruleEdgeOp returns [Enumerator current=null] : ( (enumLiteral_0= HyphenMinusGreaterThanSign ) | (enumLiteral_1= HyphenMinusHyphenMinus ) ) ;
    public final Enumerator ruleEdgeOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1113:28: ( ( (enumLiteral_0= HyphenMinusGreaterThanSign ) | (enumLiteral_1= HyphenMinusHyphenMinus ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1114:1: ( (enumLiteral_0= HyphenMinusGreaterThanSign ) | (enumLiteral_1= HyphenMinusHyphenMinus ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1114:1: ( (enumLiteral_0= HyphenMinusGreaterThanSign ) | (enumLiteral_1= HyphenMinusHyphenMinus ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==HyphenMinusGreaterThanSign) ) {
                alt24=1;
            }
            else if ( (LA24_0==HyphenMinusHyphenMinus) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1114:2: (enumLiteral_0= HyphenMinusGreaterThanSign )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1114:2: (enumLiteral_0= HyphenMinusGreaterThanSign )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1114:7: enumLiteral_0= HyphenMinusGreaterThanSign
                    {
                    enumLiteral_0=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_HyphenMinusGreaterThanSign_in_ruleEdgeOp2384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1120:6: (enumLiteral_1= HyphenMinusHyphenMinus )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1120:6: (enumLiteral_1= HyphenMinusHyphenMinus )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1120:11: enumLiteral_1= HyphenMinusHyphenMinus
                    {
                    enumLiteral_1=(Token)match(input,HyphenMinusHyphenMinus,FOLLOW_HyphenMinusHyphenMinus_in_ruleEdgeOp2406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleEdgeOp"


    // $ANTLR start "ruleGraphType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1130:1: ruleGraphType returns [Enumerator current=null] : ( (enumLiteral_0= Graph ) | (enumLiteral_1= Digraph ) ) ;
    public final Enumerator ruleGraphType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1132:28: ( ( (enumLiteral_0= Graph ) | (enumLiteral_1= Digraph ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1133:1: ( (enumLiteral_0= Graph ) | (enumLiteral_1= Digraph ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1133:1: ( (enumLiteral_0= Graph ) | (enumLiteral_1= Digraph ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Graph) ) {
                alt25=1;
            }
            else if ( (LA25_0==Digraph) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1133:2: (enumLiteral_0= Graph )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1133:2: (enumLiteral_0= Graph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1133:7: enumLiteral_0= Graph
                    {
                    enumLiteral_0=(Token)match(input,Graph,FOLLOW_Graph_in_ruleGraphType2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1139:6: (enumLiteral_1= Digraph )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1139:6: (enumLiteral_1= Digraph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1139:11: enumLiteral_1= Digraph
                    {
                    enumLiteral_1=(Token)match(input,Digraph,FOLLOW_Digraph_in_ruleGraphType2478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleAttributeType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1149:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= Graph ) | (enumLiteral_1= Node ) | (enumLiteral_2= Edge ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1151:28: ( ( (enumLiteral_0= Graph ) | (enumLiteral_1= Node ) | (enumLiteral_2= Edge ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1152:1: ( (enumLiteral_0= Graph ) | (enumLiteral_1= Node ) | (enumLiteral_2= Edge ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1152:1: ( (enumLiteral_0= Graph ) | (enumLiteral_1= Node ) | (enumLiteral_2= Edge ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case Graph:
                {
                alt26=1;
                }
                break;
            case Node:
                {
                alt26=2;
                }
                break;
            case Edge:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1152:2: (enumLiteral_0= Graph )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1152:2: (enumLiteral_0= Graph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1152:7: enumLiteral_0= Graph
                    {
                    enumLiteral_0=(Token)match(input,Graph,FOLLOW_Graph_in_ruleAttributeType2528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1158:6: (enumLiteral_1= Node )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1158:6: (enumLiteral_1= Node )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1158:11: enumLiteral_1= Node
                    {
                    enumLiteral_1=(Token)match(input,Node,FOLLOW_Node_in_ruleAttributeType2550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1164:6: (enumLiteral_2= Edge )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1164:6: (enumLiteral_2= Edge )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:1164:11: enumLiteral_2= Edge
                    {
                    enumLiteral_2=(Token)match(input,Edge,FOLLOW_Edge_in_ruleAttributeType2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleAttributeType"

    // $ANTLR start synpred1_InternalDotParser
    public final void synpred1_InternalDotParser_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:759:4: ( Colon )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src-gen/org/eclipse/gef/dot/internal/language/parser/antlr/internal/InternalDotParser.g:760:1: Colon
        {
        match(input,Colon,FOLLOW_Colon_in_synpred1_InternalDotParser1567); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDotParser

    // Delegated rules

    public final boolean synpred1_InternalDotParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDotParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\23\uffff";
    static final String DFA5_eofS =
        "\1\uffff\5\13\6\uffff\5\13\1\uffff\1\13";
    static final String DFA5_minS =
        "\6\4\3\uffff\1\24\2\uffff\5\4\1\25\1\4";
    static final String DFA5_maxS =
        "\6\33\3\uffff\1\33\2\uffff\5\33\1\25\1\33";
    static final String DFA5_acceptS =
        "\6\uffff\1\3\1\5\1\4\1\uffff\1\2\1\1\7\uffff";
    static final String DFA5_specialS =
        "\23\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\7\2\uffff\3\6\10\uffff\1\7\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\11\1\13\1\10\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\11\1\13\1\10\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\11\1\13\1\10\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\11\1\13\1\10\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\11\1\13\1\10\1\13\1\uffff\6\13\3\uffff\1\13",
            "",
            "",
            "",
            "\1\14\1\15\1\16\1\17\3\uffff\1\20",
            "",
            "",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\21\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\21\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\21\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\21\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\13\2\uffff\3\13\2\12\1\uffff\1\21\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13",
            "\1\22",
            "\1\13\2\uffff\3\13\2\12\2\uffff\1\13\1\uffff\1\13\1\uffff\6\13\3\uffff\1\13"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "215:2: (this_NodeStmt_0= ruleNodeStmt | this_EdgeStmtNode_1= ruleEdgeStmtNode | this_AttrStmt_2= ruleAttrStmt | this_Attribute_3= ruleAttribute | this_SubgraphOrEdgeStmtSubgraph_4= ruleSubgraphOrEdgeStmtSubgraph )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDotAst_in_entryRuleDotAst67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotAst77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotGraph_in_ruleDotAst122 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleDotGraph_in_entryRuleDotGraph157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotGraph167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Strict_in_ruleDotGraph211 = new BitSet(new long[]{0x0000000008F400E0L});
    public static final BitSet FOLLOW_ruleGraphType_in_ruleDotGraph244 = new BitSet(new long[]{0x0000000008F40000L});
    public static final BitSet FOLLOW_ruleID_in_ruleDotGraph265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleDotGraph279 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleDotGraph299 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleDotGraph313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStmt_in_ruleStmt405 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEdgeStmtNode_in_ruleStmt432 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAttrStmt_in_ruleStmt459 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStmt486 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_ruleStmt513 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_Semicolon_in_ruleStmt527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeStmtNode_in_entryRuleEdgeStmtNode563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeStmtNode573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_ruleEdgeStmtNode619 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_ruleEdgeStmtNode640 = new BitSet(new long[]{0x0000000000010C02L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleEdgeStmtNode662 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleNodeStmt_in_entryRuleNodeStmt700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeStmt710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_ruleNodeStmt756 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleNodeStmt777 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAttrStmt_in_entryRuleAttrStmt813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrStmt823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttrStmt869 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleAttrStmt890 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleAttrList983 = new BitSet(new long[]{0x0000000008F20000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttrList1004 = new BitSet(new long[]{0x0000000008F25000L});
    public static final BitSet FOLLOW_Comma_in_ruleAttrList1018 = new BitSet(new long[]{0x0000000008F20000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleAttrList1036 = new BitSet(new long[]{0x0000000008F20000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleAttrList1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleAttribute1142 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleAttribute1155 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_ruleID_in_ruleAttribute1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_entryRuleSubgraphOrEdgeStmtSubgraph1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubgraphOrEdgeStmtSubgraph1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraph_in_ruleSubgraphOrEdgeStmtSubgraph1267 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_ruleSubgraphOrEdgeStmtSubgraph1297 = new BitSet(new long[]{0x0000000000010C02L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleSubgraphOrEdgeStmtSubgraph1319 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleSubgraph_in_entryRuleSubgraph1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubgraph1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Subgraph_in_ruleSubgraph1415 = new BitSet(new long[]{0x0000000008F40000L});
    public static final BitSet FOLLOW_ruleID_in_ruleSubgraph1435 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleSubgraph1451 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleSubgraph1471 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleSubgraph1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_rulePort1575 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_rulePort1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_rulePort1618 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_ruleID_in_rulePort1638 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_Colon_in_rulePort1652 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_rulePort1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_entryRuleEdgeRhs1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhs1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsNode_in_ruleEdgeRhs1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsSubgraph_in_ruleEdgeRhs1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsNode_in_entryRuleEdgeRhsNode1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhsNode1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOp_in_ruleEdgeRhsNode1885 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_ruleNodeId_in_ruleEdgeRhsNode1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsSubgraph_in_entryRuleEdgeRhsSubgraph1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhsSubgraph1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOp_in_ruleEdgeRhsSubgraph1997 = new BitSet(new long[]{0x0000000008F40390L});
    public static final BitSet FOLLOW_ruleSubgraph_in_ruleEdgeRhsSubgraph2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_entryRuleNodeId2053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeId2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleNodeId2109 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePort_in_ruleNodeId2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERAL_in_ruleID2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_ruleID2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleID2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_ruleID2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HTML_STRING_in_ruleID2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinusGreaterThanSign_in_ruleEdgeOp2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinusHyphenMinus_in_ruleEdgeOp2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Graph_in_ruleGraphType2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digraph_in_ruleGraphType2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Graph_in_ruleAttributeType2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Node_in_ruleAttributeType2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edge_in_ruleAttributeType2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_synpred1_InternalDotParser1567 = new BitSet(new long[]{0x0000000000000002L});

}