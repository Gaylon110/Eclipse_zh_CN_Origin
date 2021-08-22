package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.gef.dot.internal.language.services.DotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g"; }


     
     	private DotGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("HyphenMinusHyphenMinus", "'--'");
    		tokenNameToValue.put("HyphenMinusGreaterThanSign", "'->'");
    		tokenNameToValue.put("Edge", "'edge'");
    		tokenNameToValue.put("Node", "'node'");
    		tokenNameToValue.put("Graph", "'graph'");
    		tokenNameToValue.put("Strict", "'strict'");
    		tokenNameToValue.put("Digraph", "'digraph'");
    		tokenNameToValue.put("Subgraph", "'subgraph'");
     	}
     	
        public void setGrammarAccess(DotGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleDotAst"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:80:1: entryRuleDotAst : ruleDotAst EOF ;
    public final void entryRuleDotAst() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:81:1: ( ruleDotAst EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:82:1: ruleDotAst EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstRule()); 
            }
            pushFollow(FOLLOW_ruleDotAst_in_entryRuleDotAst60);
            ruleDotAst();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotAst67); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotAst"


    // $ANTLR start "ruleDotAst"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:89:1: ruleDotAst : ( ( rule__DotAst__GraphsAssignment )* ) ;
    public final void ruleDotAst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:93:5: ( ( ( rule__DotAst__GraphsAssignment )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:94:1: ( ( rule__DotAst__GraphsAssignment )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:94:1: ( ( rule__DotAst__GraphsAssignment )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:95:1: ( rule__DotAst__GraphsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getGraphsAssignment()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:96:1: ( rule__DotAst__GraphsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=Digraph && LA1_0<=Graph)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:96:2: rule__DotAst__GraphsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DotAst__GraphsAssignment_in_ruleDotAst97);
            	    rule__DotAst__GraphsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getGraphsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotAst"


    // $ANTLR start "entryRuleDotGraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:108:1: entryRuleDotGraph : ruleDotGraph EOF ;
    public final void entryRuleDotGraph() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:109:1: ( ruleDotGraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:110:1: ruleDotGraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphRule()); 
            }
            pushFollow(FOLLOW_ruleDotGraph_in_entryRuleDotGraph125);
            ruleDotGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDotGraph132); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:117:1: ruleDotGraph : ( ( rule__DotGraph__Group__0 ) ) ;
    public final void ruleDotGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:121:5: ( ( ( rule__DotGraph__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:122:1: ( ( rule__DotGraph__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:122:1: ( ( rule__DotGraph__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:123:1: ( rule__DotGraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:124:1: ( rule__DotGraph__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:124:2: rule__DotGraph__Group__0
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__0_in_ruleDotGraph162);
            rule__DotGraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:136:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:137:1: ( ruleStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:138:1: ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt189);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt196); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:145:1: ruleStmt : ( ( rule__Stmt__Group__0 ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:149:5: ( ( ( rule__Stmt__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:150:1: ( ( rule__Stmt__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:150:1: ( ( rule__Stmt__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:151:1: ( rule__Stmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:152:1: ( rule__Stmt__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:152:2: rule__Stmt__Group__0
            {
            pushFollow(FOLLOW_rule__Stmt__Group__0_in_ruleStmt226);
            rule__Stmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleEdgeStmtNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:164:1: entryRuleEdgeStmtNode : ruleEdgeStmtNode EOF ;
    public final void entryRuleEdgeStmtNode() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:165:1: ( ruleEdgeStmtNode EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:166:1: ruleEdgeStmtNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeStmtNode_in_entryRuleEdgeStmtNode253);
            ruleEdgeStmtNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeStmtNode260); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeStmtNode"


    // $ANTLR start "ruleEdgeStmtNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:173:1: ruleEdgeStmtNode : ( ( rule__EdgeStmtNode__Group__0 ) ) ;
    public final void ruleEdgeStmtNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:177:5: ( ( ( rule__EdgeStmtNode__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:178:1: ( ( rule__EdgeStmtNode__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:178:1: ( ( rule__EdgeStmtNode__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:179:1: ( rule__EdgeStmtNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:180:1: ( rule__EdgeStmtNode__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:180:2: rule__EdgeStmtNode__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__0_in_ruleEdgeStmtNode290);
            rule__EdgeStmtNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeStmtNode"


    // $ANTLR start "entryRuleNodeStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:194:1: entryRuleNodeStmt : ruleNodeStmt EOF ;
    public final void entryRuleNodeStmt() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:195:1: ( ruleNodeStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:196:1: ruleNodeStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtRule()); 
            }
            pushFollow(FOLLOW_ruleNodeStmt_in_entryRuleNodeStmt319);
            ruleNodeStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeStmt326); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeStmt"


    // $ANTLR start "ruleNodeStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:203:1: ruleNodeStmt : ( ( rule__NodeStmt__Group__0 ) ) ;
    public final void ruleNodeStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:207:5: ( ( ( rule__NodeStmt__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:208:1: ( ( rule__NodeStmt__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:208:1: ( ( rule__NodeStmt__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:209:1: ( rule__NodeStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:210:1: ( rule__NodeStmt__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:210:2: rule__NodeStmt__Group__0
            {
            pushFollow(FOLLOW_rule__NodeStmt__Group__0_in_ruleNodeStmt356);
            rule__NodeStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeStmt"


    // $ANTLR start "entryRuleAttrStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:222:1: entryRuleAttrStmt : ruleAttrStmt EOF ;
    public final void entryRuleAttrStmt() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:223:1: ( ruleAttrStmt EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:224:1: ruleAttrStmt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtRule()); 
            }
            pushFollow(FOLLOW_ruleAttrStmt_in_entryRuleAttrStmt383);
            ruleAttrStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrStmt390); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrStmt"


    // $ANTLR start "ruleAttrStmt"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:231:1: ruleAttrStmt : ( ( rule__AttrStmt__Group__0 ) ) ;
    public final void ruleAttrStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:235:5: ( ( ( rule__AttrStmt__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:236:1: ( ( rule__AttrStmt__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:236:1: ( ( rule__AttrStmt__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:237:1: ( rule__AttrStmt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:238:1: ( rule__AttrStmt__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:238:2: rule__AttrStmt__Group__0
            {
            pushFollow(FOLLOW_rule__AttrStmt__Group__0_in_ruleAttrStmt420);
            rule__AttrStmt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrStmt"


    // $ANTLR start "entryRuleAttrList"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:250:1: entryRuleAttrList : ruleAttrList EOF ;
    public final void entryRuleAttrList() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:251:1: ( ruleAttrList EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:252:1: ruleAttrList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListRule()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList447);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:259:1: ruleAttrList : ( ( rule__AttrList__Group__0 ) ) ;
    public final void ruleAttrList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:263:5: ( ( ( rule__AttrList__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:264:1: ( ( rule__AttrList__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:264:1: ( ( rule__AttrList__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:265:1: ( rule__AttrList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:266:1: ( rule__AttrList__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:266:2: rule__AttrList__Group__0
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0_in_ruleAttrList484);
            rule__AttrList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRuleAttribute"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:279:1: ( ruleAttribute EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:280:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute511);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute518); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:287:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:291:5: ( ( ( rule__Attribute__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:292:1: ( ( rule__Attribute__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:292:1: ( ( rule__Attribute__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:293:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:294:1: ( rule__Attribute__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:294:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute548);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSubgraphOrEdgeStmtSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:306:1: entryRuleSubgraphOrEdgeStmtSubgraph : ruleSubgraphOrEdgeStmtSubgraph EOF ;
    public final void entryRuleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:307:1: ( ruleSubgraphOrEdgeStmtSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:308:1: ruleSubgraphOrEdgeStmtSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_entryRuleSubgraphOrEdgeStmtSubgraph575);
            ruleSubgraphOrEdgeStmtSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubgraphOrEdgeStmtSubgraph582); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "ruleSubgraphOrEdgeStmtSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:315:1: ruleSubgraphOrEdgeStmtSubgraph : ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) ) ;
    public final void ruleSubgraphOrEdgeStmtSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:319:5: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:320:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:320:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:321:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:322:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:322:2: rule__SubgraphOrEdgeStmtSubgraph__Group__0
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__0_in_ruleSubgraphOrEdgeStmtSubgraph612);
            rule__SubgraphOrEdgeStmtSubgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubgraphOrEdgeStmtSubgraph"


    // $ANTLR start "entryRuleSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:334:1: entryRuleSubgraph : ruleSubgraph EOF ;
    public final void entryRuleSubgraph() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:335:1: ( ruleSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:336:1: ruleSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleSubgraph_in_entryRuleSubgraph639);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubgraph646); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubgraph"


    // $ANTLR start "ruleSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:343:1: ruleSubgraph : ( ( rule__Subgraph__Group__0 ) ) ;
    public final void ruleSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:347:5: ( ( ( rule__Subgraph__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:348:1: ( ( rule__Subgraph__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:348:1: ( ( rule__Subgraph__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:349:1: ( rule__Subgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:350:1: ( rule__Subgraph__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:350:2: rule__Subgraph__Group__0
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__0_in_ruleSubgraph676);
            rule__Subgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubgraph"


    // $ANTLR start "entryRulePort"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:362:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:363:1: ( rulePort EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:364:1: rulePort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortRule()); 
            }
            pushFollow(FOLLOW_rulePort_in_entryRulePort703);
            rulePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePort710); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:371:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:375:5: ( ( ( rule__Port__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:376:1: ( ( rule__Port__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:376:1: ( ( rule__Port__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:377:1: ( rule__Port__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:378:1: ( rule__Port__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:378:2: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_rule__Port__Alternatives_in_rulePort740);
            rule__Port__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleEdgeRhs"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:390:1: entryRuleEdgeRhs : ruleEdgeRhs EOF ;
    public final void entryRuleEdgeRhs() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:391:1: ( ruleEdgeRhs EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:392:1: ruleEdgeRhs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhs_in_entryRuleEdgeRhs767);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhs774); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhs"


    // $ANTLR start "ruleEdgeRhs"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:399:1: ruleEdgeRhs : ( ( rule__EdgeRhs__Alternatives ) ) ;
    public final void ruleEdgeRhs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:403:5: ( ( ( rule__EdgeRhs__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:404:1: ( ( rule__EdgeRhs__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:404:1: ( ( rule__EdgeRhs__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:405:1: ( rule__EdgeRhs__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:406:1: ( rule__EdgeRhs__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:406:2: rule__EdgeRhs__Alternatives
            {
            pushFollow(FOLLOW_rule__EdgeRhs__Alternatives_in_ruleEdgeRhs804);
            rule__EdgeRhs__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhs"


    // $ANTLR start "entryRuleEdgeRhsNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:418:1: entryRuleEdgeRhsNode : ruleEdgeRhsNode EOF ;
    public final void entryRuleEdgeRhsNode() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:419:1: ( ruleEdgeRhsNode EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:420:1: ruleEdgeRhsNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhsNode_in_entryRuleEdgeRhsNode831);
            ruleEdgeRhsNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhsNode838); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhsNode"


    // $ANTLR start "ruleEdgeRhsNode"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:427:1: ruleEdgeRhsNode : ( ( rule__EdgeRhsNode__Group__0 ) ) ;
    public final void ruleEdgeRhsNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:431:5: ( ( ( rule__EdgeRhsNode__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:432:1: ( ( rule__EdgeRhsNode__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:432:1: ( ( rule__EdgeRhsNode__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:433:1: ( rule__EdgeRhsNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:434:1: ( rule__EdgeRhsNode__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:434:2: rule__EdgeRhsNode__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeRhsNode__Group__0_in_ruleEdgeRhsNode868);
            rule__EdgeRhsNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhsNode"


    // $ANTLR start "entryRuleEdgeRhsSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:446:1: entryRuleEdgeRhsSubgraph : ruleEdgeRhsSubgraph EOF ;
    public final void entryRuleEdgeRhsSubgraph() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:447:1: ( ruleEdgeRhsSubgraph EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:448:1: ruleEdgeRhsSubgraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhsSubgraph_in_entryRuleEdgeRhsSubgraph895);
            ruleEdgeRhsSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeRhsSubgraph902); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEdgeRhsSubgraph"


    // $ANTLR start "ruleEdgeRhsSubgraph"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:455:1: ruleEdgeRhsSubgraph : ( ( rule__EdgeRhsSubgraph__Group__0 ) ) ;
    public final void ruleEdgeRhsSubgraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:459:5: ( ( ( rule__EdgeRhsSubgraph__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:460:1: ( ( rule__EdgeRhsSubgraph__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:460:1: ( ( rule__EdgeRhsSubgraph__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:461:1: ( rule__EdgeRhsSubgraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:462:1: ( rule__EdgeRhsSubgraph__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:462:2: rule__EdgeRhsSubgraph__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__Group__0_in_ruleEdgeRhsSubgraph932);
            rule__EdgeRhsSubgraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeRhsSubgraph"


    // $ANTLR start "entryRuleNodeId"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:474:1: entryRuleNodeId : ruleNodeId EOF ;
    public final void entryRuleNodeId() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:475:1: ( ruleNodeId EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:476:1: ruleNodeId EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdRule()); 
            }
            pushFollow(FOLLOW_ruleNodeId_in_entryRuleNodeId959);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeId966); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeId"


    // $ANTLR start "ruleNodeId"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:483:1: ruleNodeId : ( ( rule__NodeId__Group__0 ) ) ;
    public final void ruleNodeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:487:5: ( ( ( rule__NodeId__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:488:1: ( ( rule__NodeId__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:488:1: ( ( rule__NodeId__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:489:1: ( rule__NodeId__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:490:1: ( rule__NodeId__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:490:2: rule__NodeId__Group__0
            {
            pushFollow(FOLLOW_rule__NodeId__Group__0_in_ruleNodeId996);
            rule__NodeId__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeId"


    // $ANTLR start "entryRuleID"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:502:1: entryRuleID : ruleID EOF ;
    public final void entryRuleID() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:503:1: ( ruleID EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:504:1: ruleID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDRule()); 
            }
            pushFollow(FOLLOW_ruleID_in_entryRuleID1023);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleID1030); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:511:1: ruleID : ( ( rule__ID__Alternatives ) ) ;
    public final void ruleID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:515:5: ( ( ( rule__ID__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:516:1: ( ( rule__ID__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:516:1: ( ( rule__ID__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:517:1: ( rule__ID__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIDAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:518:1: ( rule__ID__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:518:2: rule__ID__Alternatives
            {
            pushFollow(FOLLOW_rule__ID__Alternatives_in_ruleID1060);
            rule__ID__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIDAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "ruleEdgeOp"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:531:1: ruleEdgeOp : ( ( rule__EdgeOp__Alternatives ) ) ;
    public final void ruleEdgeOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:535:1: ( ( ( rule__EdgeOp__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:536:1: ( ( rule__EdgeOp__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:536:1: ( ( rule__EdgeOp__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:537:1: ( rule__EdgeOp__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeOpAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:538:1: ( rule__EdgeOp__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:538:2: rule__EdgeOp__Alternatives
            {
            pushFollow(FOLLOW_rule__EdgeOp__Alternatives_in_ruleEdgeOp1097);
            rule__EdgeOp__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeOpAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeOp"


    // $ANTLR start "ruleGraphType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:550:1: ruleGraphType : ( ( rule__GraphType__Alternatives ) ) ;
    public final void ruleGraphType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:554:1: ( ( ( rule__GraphType__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:555:1: ( ( rule__GraphType__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:555:1: ( ( rule__GraphType__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:556:1: ( rule__GraphType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphTypeAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:557:1: ( rule__GraphType__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:557:2: rule__GraphType__Alternatives
            {
            pushFollow(FOLLOW_rule__GraphType__Alternatives_in_ruleGraphType1133);
            rule__GraphType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphType"


    // $ANTLR start "ruleAttributeType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:569:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:573:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:574:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:574:1: ( ( rule__AttributeType__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:575:1: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:576:1: ( rule__AttributeType__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:576:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1169);
            rule__AttributeType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "rule__Stmt__Alternatives_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:587:1: rule__Stmt__Alternatives_0 : ( ( ruleNodeStmt ) | ( ruleEdgeStmtNode ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) );
    public final void rule__Stmt__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:591:1: ( ( ruleNodeStmt ) | ( ruleEdgeStmtNode ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:592:1: ( ruleNodeStmt )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:592:1: ( ruleNodeStmt )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:593:1: ruleNodeStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleNodeStmt_in_rule__Stmt__Alternatives_01204);
                    ruleNodeStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getNodeStmtParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:598:6: ( ruleEdgeStmtNode )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:598:6: ( ruleEdgeStmtNode )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:599:1: ruleEdgeStmtNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEdgeStmtNode_in_rule__Stmt__Alternatives_01221);
                    ruleEdgeStmtNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getEdgeStmtNodeParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:604:6: ( ruleAttrStmt )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:604:6: ( ruleAttrStmt )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:605:1: ruleAttrStmt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleAttrStmt_in_rule__Stmt__Alternatives_01238);
                    ruleAttrStmt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttrStmtParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:610:6: ( ruleAttribute )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:610:6: ( ruleAttribute )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:611:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_rule__Stmt__Alternatives_01255);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getAttributeParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:616:6: ( ruleSubgraphOrEdgeStmtSubgraph )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:616:6: ( ruleSubgraphOrEdgeStmtSubgraph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:617:1: ruleSubgraphOrEdgeStmtSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4()); 
                    }
                    pushFollow(FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_rule__Stmt__Alternatives_01272);
                    ruleSubgraphOrEdgeStmtSubgraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStmtAccess().getSubgraphOrEdgeStmtSubgraphParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Alternatives_0"


    // $ANTLR start "rule__AttrList__Alternatives_2_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:627:1: rule__AttrList__Alternatives_2_1 : ( ( Comma ) | ( Semicolon ) );
    public final void rule__AttrList__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:631:1: ( ( Comma ) | ( Semicolon ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Comma) ) {
                alt3=1;
            }
            else if ( (LA3_0==Semicolon) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:632:1: ( Comma )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:632:1: ( Comma )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:633:1: Comma
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0()); 
                    }
                    match(input,Comma,FOLLOW_Comma_in_rule__AttrList__Alternatives_2_11305); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttrListAccess().getCommaKeyword_2_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:640:6: ( Semicolon )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:640:6: ( Semicolon )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:641:1: Semicolon
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1()); 
                    }
                    match(input,Semicolon,FOLLOW_Semicolon_in_rule__AttrList__Alternatives_2_11325); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttrListAccess().getSemicolonKeyword_2_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Alternatives_2_1"


    // $ANTLR start "rule__Port__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:653:1: rule__Port__Alternatives : ( ( ( rule__Port__Group_0__0 ) ) | ( ( rule__Port__Group_1__0 ) ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:657:1: ( ( ( rule__Port__Group_0__0 ) ) | ( ( rule__Port__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Colon) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_COMPASS_PT) ) {
                    int LA4_2 = input.LA(3);

                    if ( (synpred7_InternalDotParser()) ) {
                        alt4=1;
                    }
                    else if ( (true) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==RULE_NUMERAL||(LA4_1>=RULE_STRING && LA4_1<=RULE_QUOTED_STRING)||LA4_1==RULE_HTML_STRING) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:658:1: ( ( rule__Port__Group_0__0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:658:1: ( ( rule__Port__Group_0__0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:659:1: ( rule__Port__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPortAccess().getGroup_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:660:1: ( rule__Port__Group_0__0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:660:2: rule__Port__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_0__0_in_rule__Port__Alternatives1359);
                    rule__Port__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPortAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:664:6: ( ( rule__Port__Group_1__0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:664:6: ( ( rule__Port__Group_1__0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:665:1: ( rule__Port__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPortAccess().getGroup_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:666:1: ( rule__Port__Group_1__0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:666:2: rule__Port__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_1__0_in_rule__Port__Alternatives1377);
                    rule__Port__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPortAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__EdgeRhs__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:675:1: rule__EdgeRhs__Alternatives : ( ( ruleEdgeRhsNode ) | ( ruleEdgeRhsSubgraph ) );
    public final void rule__EdgeRhs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:679:1: ( ( ruleEdgeRhsNode ) | ( ruleEdgeRhsSubgraph ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==HyphenMinusGreaterThanSign) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=RULE_NUMERAL && LA5_1<=RULE_QUOTED_STRING)||LA5_1==RULE_HTML_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_1==Subgraph||LA5_1==LeftCurlyBracket) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==HyphenMinusHyphenMinus) ) {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=RULE_NUMERAL && LA5_2<=RULE_QUOTED_STRING)||LA5_2==RULE_HTML_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_2==Subgraph||LA5_2==LeftCurlyBracket) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:680:1: ( ruleEdgeRhsNode )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:680:1: ( ruleEdgeRhsNode )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:681:1: ruleEdgeRhsNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEdgeRhsNode_in_rule__EdgeRhs__Alternatives1410);
                    ruleEdgeRhsNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeRhsAccess().getEdgeRhsNodeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:686:6: ( ruleEdgeRhsSubgraph )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:686:6: ( ruleEdgeRhsSubgraph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:687:1: ruleEdgeRhsSubgraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEdgeRhsSubgraph_in_rule__EdgeRhs__Alternatives1427);
                    ruleEdgeRhsSubgraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeRhsAccess().getEdgeRhsSubgraphParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhs__Alternatives"


    // $ANTLR start "rule__ID__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:697:1: rule__ID__Alternatives : ( ( RULE_NUMERAL ) | ( RULE_COMPASS_PT ) | ( RULE_STRING ) | ( RULE_QUOTED_STRING ) | ( RULE_HTML_STRING ) );
    public final void rule__ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:701:1: ( ( RULE_NUMERAL ) | ( RULE_COMPASS_PT ) | ( RULE_STRING ) | ( RULE_QUOTED_STRING ) | ( RULE_HTML_STRING ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_NUMERAL:
                {
                alt6=1;
                }
                break;
            case RULE_COMPASS_PT:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case RULE_QUOTED_STRING:
                {
                alt6=4;
                }
                break;
            case RULE_HTML_STRING:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:702:1: ( RULE_NUMERAL )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:702:1: ( RULE_NUMERAL )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:703:1: RULE_NUMERAL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDAccess().getNUMERALTerminalRuleCall_0()); 
                    }
                    match(input,RULE_NUMERAL,FOLLOW_RULE_NUMERAL_in_rule__ID__Alternatives1459); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDAccess().getNUMERALTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:708:6: ( RULE_COMPASS_PT )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:708:6: ( RULE_COMPASS_PT )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:709:1: RULE_COMPASS_PT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDAccess().getCOMPASS_PTTerminalRuleCall_1()); 
                    }
                    match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_rule__ID__Alternatives1476); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDAccess().getCOMPASS_PTTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:714:6: ( RULE_STRING )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:714:6: ( RULE_STRING )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:715:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDAccess().getSTRINGTerminalRuleCall_2()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ID__Alternatives1493); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDAccess().getSTRINGTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:720:6: ( RULE_QUOTED_STRING )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:720:6: ( RULE_QUOTED_STRING )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:721:1: RULE_QUOTED_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDAccess().getQUOTED_STRINGTerminalRuleCall_3()); 
                    }
                    match(input,RULE_QUOTED_STRING,FOLLOW_RULE_QUOTED_STRING_in_rule__ID__Alternatives1510); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDAccess().getQUOTED_STRINGTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:726:6: ( RULE_HTML_STRING )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:726:6: ( RULE_HTML_STRING )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:727:1: RULE_HTML_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIDAccess().getHTML_STRINGTerminalRuleCall_4()); 
                    }
                    match(input,RULE_HTML_STRING,FOLLOW_RULE_HTML_STRING_in_rule__ID__Alternatives1527); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIDAccess().getHTML_STRINGTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ID__Alternatives"


    // $ANTLR start "rule__EdgeOp__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:737:1: rule__EdgeOp__Alternatives : ( ( ( HyphenMinusGreaterThanSign ) ) | ( ( HyphenMinusHyphenMinus ) ) );
    public final void rule__EdgeOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:741:1: ( ( ( HyphenMinusGreaterThanSign ) ) | ( ( HyphenMinusHyphenMinus ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==HyphenMinusGreaterThanSign) ) {
                alt7=1;
            }
            else if ( (LA7_0==HyphenMinusHyphenMinus) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:742:1: ( ( HyphenMinusGreaterThanSign ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:742:1: ( ( HyphenMinusGreaterThanSign ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:743:1: ( HyphenMinusGreaterThanSign )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:744:1: ( HyphenMinusGreaterThanSign )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:744:3: HyphenMinusGreaterThanSign
                    {
                    match(input,HyphenMinusGreaterThanSign,FOLLOW_HyphenMinusGreaterThanSign_in_rule__EdgeOp__Alternatives1560); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeOpAccess().getDirectedEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:749:6: ( ( HyphenMinusHyphenMinus ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:749:6: ( ( HyphenMinusHyphenMinus ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:750:1: ( HyphenMinusHyphenMinus )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:751:1: ( HyphenMinusHyphenMinus )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:751:3: HyphenMinusHyphenMinus
                    {
                    match(input,HyphenMinusHyphenMinus,FOLLOW_HyphenMinusHyphenMinus_in_rule__EdgeOp__Alternatives1580); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEdgeOpAccess().getUndirectedEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeOp__Alternatives"


    // $ANTLR start "rule__GraphType__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:761:1: rule__GraphType__Alternatives : ( ( ( Graph ) ) | ( ( Digraph ) ) );
    public final void rule__GraphType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:765:1: ( ( ( Graph ) ) | ( ( Digraph ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Graph) ) {
                alt8=1;
            }
            else if ( (LA8_0==Digraph) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:766:1: ( ( Graph ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:766:1: ( ( Graph ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:767:1: ( Graph )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:768:1: ( Graph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:768:3: Graph
                    {
                    match(input,Graph,FOLLOW_Graph_in_rule__GraphType__Alternatives1615); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:773:6: ( ( Digraph ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:773:6: ( ( Digraph ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:774:1: ( Digraph )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:775:1: ( Digraph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:775:3: Digraph
                    {
                    match(input,Digraph,FOLLOW_Digraph_in_rule__GraphType__Alternatives1635); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphTypeAccess().getDigraphEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphType__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:785:1: rule__AttributeType__Alternatives : ( ( ( Graph ) ) | ( ( Node ) ) | ( ( Edge ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:789:1: ( ( ( Graph ) ) | ( ( Node ) ) | ( ( Edge ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case Graph:
                {
                alt9=1;
                }
                break;
            case Node:
                {
                alt9=2;
                }
                break;
            case Edge:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:790:1: ( ( Graph ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:790:1: ( ( Graph ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:791:1: ( Graph )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:792:1: ( Graph )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:792:3: Graph
                    {
                    match(input,Graph,FOLLOW_Graph_in_rule__AttributeType__Alternatives1670); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getGraphEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:797:6: ( ( Node ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:797:6: ( ( Node ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:798:1: ( Node )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:799:1: ( Node )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:799:3: Node
                    {
                    match(input,Node,FOLLOW_Node_in_rule__AttributeType__Alternatives1690); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getNodeEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:804:6: ( ( Edge ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:804:6: ( ( Edge ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:805:1: ( Edge )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:806:1: ( Edge )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:806:3: Edge
                    {
                    match(input,Edge,FOLLOW_Edge_in_rule__AttributeType__Alternatives1710); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getEdgeEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__DotGraph__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:818:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:822:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:823:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__01742);
            rule__DotGraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__01745);
            rule__DotGraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0"


    // $ANTLR start "rule__DotGraph__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:830:1: rule__DotGraph__Group__0__Impl : ( ( rule__DotGraph__StrictAssignment_0 )? ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:834:1: ( ( ( rule__DotGraph__StrictAssignment_0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:835:1: ( ( rule__DotGraph__StrictAssignment_0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:835:1: ( ( rule__DotGraph__StrictAssignment_0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:836:1: ( rule__DotGraph__StrictAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:837:1: ( rule__DotGraph__StrictAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Strict) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:837:2: rule__DotGraph__StrictAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DotGraph__StrictAssignment_0_in_rule__DotGraph__Group__0__Impl1772);
                    rule__DotGraph__StrictAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0__Impl"


    // $ANTLR start "rule__DotGraph__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:847:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:851:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:852:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__11803);
            rule__DotGraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__11806);
            rule__DotGraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1"


    // $ANTLR start "rule__DotGraph__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:859:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__TypeAssignment_1 ) ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:863:1: ( ( ( rule__DotGraph__TypeAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:864:1: ( ( rule__DotGraph__TypeAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:864:1: ( ( rule__DotGraph__TypeAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:865:1: ( rule__DotGraph__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getTypeAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:866:1: ( rule__DotGraph__TypeAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:866:2: rule__DotGraph__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__DotGraph__TypeAssignment_1_in_rule__DotGraph__Group__1__Impl1833);
            rule__DotGraph__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1__Impl"


    // $ANTLR start "rule__DotGraph__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:876:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:880:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:881:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__21863);
            rule__DotGraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__21866);
            rule__DotGraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2"


    // $ANTLR start "rule__DotGraph__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:888:1: rule__DotGraph__Group__2__Impl : ( ( rule__DotGraph__NameAssignment_2 )? ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:892:1: ( ( ( rule__DotGraph__NameAssignment_2 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:893:1: ( ( rule__DotGraph__NameAssignment_2 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:893:1: ( ( rule__DotGraph__NameAssignment_2 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:894:1: ( rule__DotGraph__NameAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getNameAssignment_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:895:1: ( rule__DotGraph__NameAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_NUMERAL && LA11_0<=RULE_QUOTED_STRING)||LA11_0==RULE_HTML_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:895:2: rule__DotGraph__NameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DotGraph__NameAssignment_2_in_rule__DotGraph__Group__2__Impl1893);
                    rule__DotGraph__NameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2__Impl"


    // $ANTLR start "rule__DotGraph__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:905:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:909:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:910:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__31924);
            rule__DotGraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__31927);
            rule__DotGraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3"


    // $ANTLR start "rule__DotGraph__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:917:1: rule__DotGraph__Group__3__Impl : ( LeftCurlyBracket ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:921:1: ( ( LeftCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:922:1: ( LeftCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:922:1: ( LeftCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:923:1: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__DotGraph__Group__3__Impl1955); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3__Impl"


    // $ANTLR start "rule__DotGraph__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:936:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:940:1: ( rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:941:2: rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__41986);
            rule__DotGraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DotGraph__Group__5_in_rule__DotGraph__Group__41989);
            rule__DotGraph__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4"


    // $ANTLR start "rule__DotGraph__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:948:1: rule__DotGraph__Group__4__Impl : ( ( rule__DotGraph__StmtsAssignment_4 )* ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:952:1: ( ( ( rule__DotGraph__StmtsAssignment_4 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:953:1: ( ( rule__DotGraph__StmtsAssignment_4 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:953:1: ( ( rule__DotGraph__StmtsAssignment_4 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:954:1: ( rule__DotGraph__StmtsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStmtsAssignment_4()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:955:1: ( rule__DotGraph__StmtsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Subgraph||(LA12_0>=Graph && LA12_0<=Node)||LA12_0==LeftCurlyBracket||(LA12_0>=RULE_NUMERAL && LA12_0<=RULE_QUOTED_STRING)||LA12_0==RULE_HTML_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:955:2: rule__DotGraph__StmtsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DotGraph__StmtsAssignment_4_in_rule__DotGraph__Group__4__Impl2016);
            	    rule__DotGraph__StmtsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStmtsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4__Impl"


    // $ANTLR start "rule__DotGraph__Group__5"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:965:1: rule__DotGraph__Group__5 : rule__DotGraph__Group__5__Impl ;
    public final void rule__DotGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:969:1: ( rule__DotGraph__Group__5__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:970:2: rule__DotGraph__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DotGraph__Group__5__Impl_in_rule__DotGraph__Group__52047);
            rule__DotGraph__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5"


    // $ANTLR start "rule__DotGraph__Group__5__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:976:1: rule__DotGraph__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__DotGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:980:1: ( ( RightCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:981:1: ( RightCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:981:1: ( RightCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:982:1: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__DotGraph__Group__5__Impl2075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5__Impl"


    // $ANTLR start "rule__Stmt__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1007:1: rule__Stmt__Group__0 : rule__Stmt__Group__0__Impl rule__Stmt__Group__1 ;
    public final void rule__Stmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1011:1: ( rule__Stmt__Group__0__Impl rule__Stmt__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1012:2: rule__Stmt__Group__0__Impl rule__Stmt__Group__1
            {
            pushFollow(FOLLOW_rule__Stmt__Group__0__Impl_in_rule__Stmt__Group__02118);
            rule__Stmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Stmt__Group__1_in_rule__Stmt__Group__02121);
            rule__Stmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0"


    // $ANTLR start "rule__Stmt__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1019:1: rule__Stmt__Group__0__Impl : ( ( rule__Stmt__Alternatives_0 ) ) ;
    public final void rule__Stmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1023:1: ( ( ( rule__Stmt__Alternatives_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1024:1: ( ( rule__Stmt__Alternatives_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1024:1: ( ( rule__Stmt__Alternatives_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1025:1: ( rule__Stmt__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1026:1: ( rule__Stmt__Alternatives_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1026:2: rule__Stmt__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Stmt__Alternatives_0_in_rule__Stmt__Group__0__Impl2148);
            rule__Stmt__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__0__Impl"


    // $ANTLR start "rule__Stmt__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1036:1: rule__Stmt__Group__1 : rule__Stmt__Group__1__Impl ;
    public final void rule__Stmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1040:1: ( rule__Stmt__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1041:2: rule__Stmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stmt__Group__1__Impl_in_rule__Stmt__Group__12178);
            rule__Stmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1"


    // $ANTLR start "rule__Stmt__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1047:1: rule__Stmt__Group__1__Impl : ( ( Semicolon )? ) ;
    public final void rule__Stmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1051:1: ( ( ( Semicolon )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1052:1: ( ( Semicolon )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1052:1: ( ( Semicolon )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1053:1: ( Semicolon )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1054:1: ( Semicolon )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Semicolon) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1055:2: Semicolon
                    {
                    match(input,Semicolon,FOLLOW_Semicolon_in_rule__Stmt__Group__1__Impl2207); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStmtAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stmt__Group__1__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1070:1: rule__EdgeStmtNode__Group__0 : rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1 ;
    public final void rule__EdgeStmtNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1074:1: ( rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1075:2: rule__EdgeStmtNode__Group__0__Impl rule__EdgeStmtNode__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__0__Impl_in_rule__EdgeStmtNode__Group__02244);
            rule__EdgeStmtNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__1_in_rule__EdgeStmtNode__Group__02247);
            rule__EdgeStmtNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__0"


    // $ANTLR start "rule__EdgeStmtNode__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1082:1: rule__EdgeStmtNode__Group__0__Impl : ( ( rule__EdgeStmtNode__NodeAssignment_0 ) ) ;
    public final void rule__EdgeStmtNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1086:1: ( ( ( rule__EdgeStmtNode__NodeAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1087:1: ( ( rule__EdgeStmtNode__NodeAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1087:1: ( ( rule__EdgeStmtNode__NodeAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1088:1: ( rule__EdgeStmtNode__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getNodeAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1089:1: ( rule__EdgeStmtNode__NodeAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1089:2: rule__EdgeStmtNode__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__NodeAssignment_0_in_rule__EdgeStmtNode__Group__0__Impl2274);
            rule__EdgeStmtNode__NodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getNodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__0__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1099:1: rule__EdgeStmtNode__Group__1 : rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2 ;
    public final void rule__EdgeStmtNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1103:1: ( rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1104:2: rule__EdgeStmtNode__Group__1__Impl rule__EdgeStmtNode__Group__2
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__1__Impl_in_rule__EdgeStmtNode__Group__12304);
            rule__EdgeStmtNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__2_in_rule__EdgeStmtNode__Group__12307);
            rule__EdgeStmtNode__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__1"


    // $ANTLR start "rule__EdgeStmtNode__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1111:1: rule__EdgeStmtNode__Group__1__Impl : ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* ) ) ;
    public final void rule__EdgeStmtNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1115:1: ( ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1116:1: ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1116:1: ( ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1117:1: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) ) ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1117:1: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1118:1: ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1119:1: ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1119:2: rule__EdgeStmtNode__EdgeRHSAssignment_1
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__EdgeRHSAssignment_1_in_rule__EdgeStmtNode__Group__1__Impl2336);
            rule__EdgeStmtNode__EdgeRHSAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_1()); 
            }

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1122:1: ( ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1123:1: ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1124:1: ( rule__EdgeStmtNode__EdgeRHSAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=HyphenMinusHyphenMinus && LA14_0<=HyphenMinusGreaterThanSign)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1124:2: rule__EdgeStmtNode__EdgeRHSAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EdgeStmtNode__EdgeRHSAssignment_1_in_rule__EdgeStmtNode__Group__1__Impl2348);
            	    rule__EdgeStmtNode__EdgeRHSAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__1__Impl"


    // $ANTLR start "rule__EdgeStmtNode__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1135:1: rule__EdgeStmtNode__Group__2 : rule__EdgeStmtNode__Group__2__Impl ;
    public final void rule__EdgeStmtNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1139:1: ( rule__EdgeStmtNode__Group__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1140:2: rule__EdgeStmtNode__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EdgeStmtNode__Group__2__Impl_in_rule__EdgeStmtNode__Group__22381);
            rule__EdgeStmtNode__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__2"


    // $ANTLR start "rule__EdgeStmtNode__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1146:1: rule__EdgeStmtNode__Group__2__Impl : ( ( rule__EdgeStmtNode__AttrListsAssignment_2 )* ) ;
    public final void rule__EdgeStmtNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1150:1: ( ( ( rule__EdgeStmtNode__AttrListsAssignment_2 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1151:1: ( ( rule__EdgeStmtNode__AttrListsAssignment_2 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1151:1: ( ( rule__EdgeStmtNode__AttrListsAssignment_2 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1152:1: ( rule__EdgeStmtNode__AttrListsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAssignment_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1153:1: ( rule__EdgeStmtNode__AttrListsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LeftSquareBracket) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1153:2: rule__EdgeStmtNode__AttrListsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EdgeStmtNode__AttrListsAssignment_2_in_rule__EdgeStmtNode__Group__2__Impl2408);
            	    rule__EdgeStmtNode__AttrListsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__Group__2__Impl"


    // $ANTLR start "rule__NodeStmt__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1170:1: rule__NodeStmt__Group__0 : rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1 ;
    public final void rule__NodeStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1174:1: ( rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1175:2: rule__NodeStmt__Group__0__Impl rule__NodeStmt__Group__1
            {
            pushFollow(FOLLOW_rule__NodeStmt__Group__0__Impl_in_rule__NodeStmt__Group__02446);
            rule__NodeStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeStmt__Group__1_in_rule__NodeStmt__Group__02449);
            rule__NodeStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__0"


    // $ANTLR start "rule__NodeStmt__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1182:1: rule__NodeStmt__Group__0__Impl : ( ( rule__NodeStmt__NodeAssignment_0 ) ) ;
    public final void rule__NodeStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1186:1: ( ( ( rule__NodeStmt__NodeAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1187:1: ( ( rule__NodeStmt__NodeAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1187:1: ( ( rule__NodeStmt__NodeAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1188:1: ( rule__NodeStmt__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getNodeAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1189:1: ( rule__NodeStmt__NodeAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1189:2: rule__NodeStmt__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeStmt__NodeAssignment_0_in_rule__NodeStmt__Group__0__Impl2476);
            rule__NodeStmt__NodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getNodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__0__Impl"


    // $ANTLR start "rule__NodeStmt__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1199:1: rule__NodeStmt__Group__1 : rule__NodeStmt__Group__1__Impl ;
    public final void rule__NodeStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1203:1: ( rule__NodeStmt__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1204:2: rule__NodeStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeStmt__Group__1__Impl_in_rule__NodeStmt__Group__12506);
            rule__NodeStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__1"


    // $ANTLR start "rule__NodeStmt__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1210:1: rule__NodeStmt__Group__1__Impl : ( ( rule__NodeStmt__AttrListsAssignment_1 )* ) ;
    public final void rule__NodeStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1214:1: ( ( ( rule__NodeStmt__AttrListsAssignment_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1215:1: ( ( rule__NodeStmt__AttrListsAssignment_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1215:1: ( ( rule__NodeStmt__AttrListsAssignment_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1216:1: ( rule__NodeStmt__AttrListsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getAttrListsAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1217:1: ( rule__NodeStmt__AttrListsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LeftSquareBracket) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1217:2: rule__NodeStmt__AttrListsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__NodeStmt__AttrListsAssignment_1_in_rule__NodeStmt__Group__1__Impl2533);
            	    rule__NodeStmt__AttrListsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getAttrListsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__Group__1__Impl"


    // $ANTLR start "rule__AttrStmt__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1231:1: rule__AttrStmt__Group__0 : rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1 ;
    public final void rule__AttrStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1235:1: ( rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1236:2: rule__AttrStmt__Group__0__Impl rule__AttrStmt__Group__1
            {
            pushFollow(FOLLOW_rule__AttrStmt__Group__0__Impl_in_rule__AttrStmt__Group__02568);
            rule__AttrStmt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttrStmt__Group__1_in_rule__AttrStmt__Group__02571);
            rule__AttrStmt__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__0"


    // $ANTLR start "rule__AttrStmt__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1243:1: rule__AttrStmt__Group__0__Impl : ( ( rule__AttrStmt__TypeAssignment_0 ) ) ;
    public final void rule__AttrStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1247:1: ( ( ( rule__AttrStmt__TypeAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1248:1: ( ( rule__AttrStmt__TypeAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1248:1: ( ( rule__AttrStmt__TypeAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1249:1: ( rule__AttrStmt__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getTypeAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1250:1: ( rule__AttrStmt__TypeAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1250:2: rule__AttrStmt__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrStmt__TypeAssignment_0_in_rule__AttrStmt__Group__0__Impl2598);
            rule__AttrStmt__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__0__Impl"


    // $ANTLR start "rule__AttrStmt__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1260:1: rule__AttrStmt__Group__1 : rule__AttrStmt__Group__1__Impl ;
    public final void rule__AttrStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1264:1: ( rule__AttrStmt__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1265:2: rule__AttrStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrStmt__Group__1__Impl_in_rule__AttrStmt__Group__12628);
            rule__AttrStmt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__1"


    // $ANTLR start "rule__AttrStmt__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1271:1: rule__AttrStmt__Group__1__Impl : ( ( ( rule__AttrStmt__AttrListsAssignment_1 ) ) ( ( rule__AttrStmt__AttrListsAssignment_1 )* ) ) ;
    public final void rule__AttrStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1275:1: ( ( ( ( rule__AttrStmt__AttrListsAssignment_1 ) ) ( ( rule__AttrStmt__AttrListsAssignment_1 )* ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1276:1: ( ( ( rule__AttrStmt__AttrListsAssignment_1 ) ) ( ( rule__AttrStmt__AttrListsAssignment_1 )* ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1276:1: ( ( ( rule__AttrStmt__AttrListsAssignment_1 ) ) ( ( rule__AttrStmt__AttrListsAssignment_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1277:1: ( ( rule__AttrStmt__AttrListsAssignment_1 ) ) ( ( rule__AttrStmt__AttrListsAssignment_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1277:1: ( ( rule__AttrStmt__AttrListsAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1278:1: ( rule__AttrStmt__AttrListsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1279:1: ( rule__AttrStmt__AttrListsAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1279:2: rule__AttrStmt__AttrListsAssignment_1
            {
            pushFollow(FOLLOW_rule__AttrStmt__AttrListsAssignment_1_in_rule__AttrStmt__Group__1__Impl2657);
            rule__AttrStmt__AttrListsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_1()); 
            }

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1282:1: ( ( rule__AttrStmt__AttrListsAssignment_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1283:1: ( rule__AttrStmt__AttrListsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1284:1: ( rule__AttrStmt__AttrListsAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LeftSquareBracket) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1284:2: rule__AttrStmt__AttrListsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AttrStmt__AttrListsAssignment_1_in_rule__AttrStmt__Group__1__Impl2669);
            	    rule__AttrStmt__AttrListsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__Group__1__Impl"


    // $ANTLR start "rule__AttrList__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1299:1: rule__AttrList__Group__0 : rule__AttrList__Group__0__Impl rule__AttrList__Group__1 ;
    public final void rule__AttrList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1303:1: ( rule__AttrList__Group__0__Impl rule__AttrList__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1304:2: rule__AttrList__Group__0__Impl rule__AttrList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__02706);
            rule__AttrList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__02709);
            rule__AttrList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__0"


    // $ANTLR start "rule__AttrList__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1311:1: rule__AttrList__Group__0__Impl : ( () ) ;
    public final void rule__AttrList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1315:1: ( ( () ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1316:1: ( () )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1316:1: ( () )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1317:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1318:1: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1320:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__0__Impl"


    // $ANTLR start "rule__AttrList__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1330:1: rule__AttrList__Group__1 : rule__AttrList__Group__1__Impl rule__AttrList__Group__2 ;
    public final void rule__AttrList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1334:1: ( rule__AttrList__Group__1__Impl rule__AttrList__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1335:2: rule__AttrList__Group__1__Impl rule__AttrList__Group__2
            {
            pushFollow(FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__12767);
            rule__AttrList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttrList__Group__2_in_rule__AttrList__Group__12770);
            rule__AttrList__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__1"


    // $ANTLR start "rule__AttrList__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1342:1: rule__AttrList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__AttrList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1346:1: ( ( LeftSquareBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1347:1: ( LeftSquareBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1347:1: ( LeftSquareBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1348:1: LeftSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rule__AttrList__Group__1__Impl2798); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__1__Impl"


    // $ANTLR start "rule__AttrList__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1361:1: rule__AttrList__Group__2 : rule__AttrList__Group__2__Impl rule__AttrList__Group__3 ;
    public final void rule__AttrList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1365:1: ( rule__AttrList__Group__2__Impl rule__AttrList__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1366:2: rule__AttrList__Group__2__Impl rule__AttrList__Group__3
            {
            pushFollow(FOLLOW_rule__AttrList__Group__2__Impl_in_rule__AttrList__Group__22829);
            rule__AttrList__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttrList__Group__3_in_rule__AttrList__Group__22832);
            rule__AttrList__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__2"


    // $ANTLR start "rule__AttrList__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1373:1: rule__AttrList__Group__2__Impl : ( ( rule__AttrList__Group_2__0 )* ) ;
    public final void rule__AttrList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1377:1: ( ( ( rule__AttrList__Group_2__0 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1378:1: ( ( rule__AttrList__Group_2__0 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1378:1: ( ( rule__AttrList__Group_2__0 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1379:1: ( rule__AttrList__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getGroup_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1380:1: ( rule__AttrList__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_NUMERAL && LA18_0<=RULE_QUOTED_STRING)||LA18_0==RULE_HTML_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1380:2: rule__AttrList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrList__Group_2__0_in_rule__AttrList__Group__2__Impl2859);
            	    rule__AttrList__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__2__Impl"


    // $ANTLR start "rule__AttrList__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1390:1: rule__AttrList__Group__3 : rule__AttrList__Group__3__Impl ;
    public final void rule__AttrList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1394:1: ( rule__AttrList__Group__3__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1395:2: rule__AttrList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group__3__Impl_in_rule__AttrList__Group__32890);
            rule__AttrList__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__3"


    // $ANTLR start "rule__AttrList__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1401:1: rule__AttrList__Group__3__Impl : ( RightSquareBracket ) ;
    public final void rule__AttrList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1405:1: ( ( RightSquareBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1406:1: ( RightSquareBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1406:1: ( RightSquareBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1407:1: RightSquareBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rule__AttrList__Group__3__Impl2918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__3__Impl"


    // $ANTLR start "rule__AttrList__Group_2__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1428:1: rule__AttrList__Group_2__0 : rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1 ;
    public final void rule__AttrList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1432:1: ( rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1433:2: rule__AttrList__Group_2__0__Impl rule__AttrList__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group_2__0__Impl_in_rule__AttrList__Group_2__02957);
            rule__AttrList__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AttrList__Group_2__1_in_rule__AttrList__Group_2__02960);
            rule__AttrList__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__0"


    // $ANTLR start "rule__AttrList__Group_2__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1440:1: rule__AttrList__Group_2__0__Impl : ( ( rule__AttrList__AttributesAssignment_2_0 ) ) ;
    public final void rule__AttrList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1444:1: ( ( ( rule__AttrList__AttributesAssignment_2_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1445:1: ( ( rule__AttrList__AttributesAssignment_2_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1445:1: ( ( rule__AttrList__AttributesAssignment_2_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1446:1: ( rule__AttrList__AttributesAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttributesAssignment_2_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1447:1: ( rule__AttrList__AttributesAssignment_2_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1447:2: rule__AttrList__AttributesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__AttrList__AttributesAssignment_2_0_in_rule__AttrList__Group_2__0__Impl2987);
            rule__AttrList__AttributesAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttributesAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__0__Impl"


    // $ANTLR start "rule__AttrList__Group_2__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1457:1: rule__AttrList__Group_2__1 : rule__AttrList__Group_2__1__Impl ;
    public final void rule__AttrList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1461:1: ( rule__AttrList__Group_2__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1462:2: rule__AttrList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group_2__1__Impl_in_rule__AttrList__Group_2__13017);
            rule__AttrList__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__1"


    // $ANTLR start "rule__AttrList__Group_2__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1468:1: rule__AttrList__Group_2__1__Impl : ( ( rule__AttrList__Alternatives_2_1 )? ) ;
    public final void rule__AttrList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1472:1: ( ( ( rule__AttrList__Alternatives_2_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1473:1: ( ( rule__AttrList__Alternatives_2_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1473:1: ( ( rule__AttrList__Alternatives_2_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1474:1: ( rule__AttrList__Alternatives_2_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAlternatives_2_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1475:1: ( rule__AttrList__Alternatives_2_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Comma||LA19_0==Semicolon) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1475:2: rule__AttrList__Alternatives_2_1
                    {
                    pushFollow(FOLLOW_rule__AttrList__Alternatives_2_1_in_rule__AttrList__Group_2__1__Impl3044);
                    rule__AttrList__Alternatives_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAlternatives_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1489:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1493:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1494:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03079);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03082);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1501:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1505:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1506:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1506:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1507:1: ( rule__Attribute__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1508:1: ( rule__Attribute__NameAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1508:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl3109);
            rule__Attribute__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1518:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1522:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1523:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13139);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13142);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1530:1: rule__Attribute__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1534:1: ( ( EqualsSign ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1535:1: ( EqualsSign )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1535:1: ( EqualsSign )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1536:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__Attribute__Group__1__Impl3170); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1549:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1553:1: ( rule__Attribute__Group__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1554:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23201);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1560:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1564:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1565:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1565:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1566:1: ( rule__Attribute__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1567:1: ( rule__Attribute__ValueAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1567:2: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl3228);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1583:1: rule__SubgraphOrEdgeStmtSubgraph__Group__0 : rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1587:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1588:2: rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group__1
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group__03264);
            rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__1_in_rule__SubgraphOrEdgeStmtSubgraph__Group__03267);
            rule__SubgraphOrEdgeStmtSubgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__0"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1595:1: rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl : ( ruleSubgraph ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1599:1: ( ( ruleSubgraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1600:1: ( ruleSubgraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1600:1: ( ruleSubgraph )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1601:1: ruleSubgraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSubgraph_in_rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl3294);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getSubgraphParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1612:1: rule__SubgraphOrEdgeStmtSubgraph__Group__1 : rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1616:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1617:2: rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group__13323);
            rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1623:1: rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl : ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1627:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1628:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1628:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1629:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1630:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=HyphenMinusHyphenMinus && LA20_0<=HyphenMinusGreaterThanSign)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1630:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__0_in_rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl3350);
                    rule__SubgraphOrEdgeStmtSubgraph__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1644:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1648:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1649:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__1
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__03385);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__03388);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1656:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl : ( () ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1660:1: ( ( () ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1661:1: ( () )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1661:1: ( () )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1662:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1663:1: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1665:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeStmtSubgraphSubgraphAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1675:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1679:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1680:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl rule__SubgraphOrEdgeStmtSubgraph__Group_1__2
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__13446);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__13449);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1687:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl : ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1691:1: ( ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1692:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1692:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1693:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) ) ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1693:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1694:1: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1695:1: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1695:2: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl3478);
            rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1698:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1699:1: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1700:1: ( rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=HyphenMinusHyphenMinus && LA21_0<=HyphenMinusGreaterThanSign)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1700:2: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl3490);
            	    rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSAssignment_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1711:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2 : rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1715:1: ( rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1716:2: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__23523);
            rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1722:1: rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl : ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1726:1: ( ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1727:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1727:1: ( ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1728:1: ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAssignment_1_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1729:1: ( rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LeftSquareBracket) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1729:2: rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl3550);
            	    rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl"


    // $ANTLR start "rule__Subgraph__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1745:1: rule__Subgraph__Group__0 : rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 ;
    public final void rule__Subgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1749:1: ( rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1750:2: rule__Subgraph__Group__0__Impl rule__Subgraph__Group__1
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__0__Impl_in_rule__Subgraph__Group__03587);
            rule__Subgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__1_in_rule__Subgraph__Group__03590);
            rule__Subgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__0"


    // $ANTLR start "rule__Subgraph__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1757:1: rule__Subgraph__Group__0__Impl : ( () ) ;
    public final void rule__Subgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1761:1: ( ( () ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1762:1: ( () )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1762:1: ( () )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1763:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getSubgraphAction_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1764:1: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1766:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getSubgraphAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__0__Impl"


    // $ANTLR start "rule__Subgraph__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1776:1: rule__Subgraph__Group__1 : rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 ;
    public final void rule__Subgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1780:1: ( rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1781:2: rule__Subgraph__Group__1__Impl rule__Subgraph__Group__2
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__1__Impl_in_rule__Subgraph__Group__13648);
            rule__Subgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__2_in_rule__Subgraph__Group__13651);
            rule__Subgraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__1"


    // $ANTLR start "rule__Subgraph__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1788:1: rule__Subgraph__Group__1__Impl : ( ( rule__Subgraph__Group_1__0 )? ) ;
    public final void rule__Subgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1792:1: ( ( ( rule__Subgraph__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1793:1: ( ( rule__Subgraph__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1793:1: ( ( rule__Subgraph__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1794:1: ( rule__Subgraph__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getGroup_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1795:1: ( rule__Subgraph__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Subgraph) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1795:2: rule__Subgraph__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Subgraph__Group_1__0_in_rule__Subgraph__Group__1__Impl3678);
                    rule__Subgraph__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__1__Impl"


    // $ANTLR start "rule__Subgraph__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1805:1: rule__Subgraph__Group__2 : rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 ;
    public final void rule__Subgraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1809:1: ( rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1810:2: rule__Subgraph__Group__2__Impl rule__Subgraph__Group__3
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__2__Impl_in_rule__Subgraph__Group__23709);
            rule__Subgraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__3_in_rule__Subgraph__Group__23712);
            rule__Subgraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__2"


    // $ANTLR start "rule__Subgraph__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1817:1: rule__Subgraph__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Subgraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1821:1: ( ( LeftCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1822:1: ( LeftCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1822:1: ( LeftCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1823:1: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Subgraph__Group__2__Impl3740); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__2__Impl"


    // $ANTLR start "rule__Subgraph__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1836:1: rule__Subgraph__Group__3 : rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4 ;
    public final void rule__Subgraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1840:1: ( rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1841:2: rule__Subgraph__Group__3__Impl rule__Subgraph__Group__4
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__3__Impl_in_rule__Subgraph__Group__33771);
            rule__Subgraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group__4_in_rule__Subgraph__Group__33774);
            rule__Subgraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__3"


    // $ANTLR start "rule__Subgraph__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1848:1: rule__Subgraph__Group__3__Impl : ( ( rule__Subgraph__StmtsAssignment_3 )* ) ;
    public final void rule__Subgraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1852:1: ( ( ( rule__Subgraph__StmtsAssignment_3 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1853:1: ( ( rule__Subgraph__StmtsAssignment_3 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1853:1: ( ( rule__Subgraph__StmtsAssignment_3 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1854:1: ( rule__Subgraph__StmtsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsAssignment_3()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1855:1: ( rule__Subgraph__StmtsAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Subgraph||(LA24_0>=Graph && LA24_0<=Node)||LA24_0==LeftCurlyBracket||(LA24_0>=RULE_NUMERAL && LA24_0<=RULE_QUOTED_STRING)||LA24_0==RULE_HTML_STRING) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1855:2: rule__Subgraph__StmtsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Subgraph__StmtsAssignment_3_in_rule__Subgraph__Group__3__Impl3801);
            	    rule__Subgraph__StmtsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__3__Impl"


    // $ANTLR start "rule__Subgraph__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1865:1: rule__Subgraph__Group__4 : rule__Subgraph__Group__4__Impl ;
    public final void rule__Subgraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1869:1: ( rule__Subgraph__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1870:2: rule__Subgraph__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subgraph__Group__4__Impl_in_rule__Subgraph__Group__43832);
            rule__Subgraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__4"


    // $ANTLR start "rule__Subgraph__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1876:1: rule__Subgraph__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__Subgraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1880:1: ( ( RightCurlyBracket ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1881:1: ( RightCurlyBracket )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1881:1: ( RightCurlyBracket )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1882:1: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Subgraph__Group__4__Impl3860); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group__4__Impl"


    // $ANTLR start "rule__Subgraph__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1905:1: rule__Subgraph__Group_1__0 : rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1 ;
    public final void rule__Subgraph__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1909:1: ( rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1910:2: rule__Subgraph__Group_1__0__Impl rule__Subgraph__Group_1__1
            {
            pushFollow(FOLLOW_rule__Subgraph__Group_1__0__Impl_in_rule__Subgraph__Group_1__03901);
            rule__Subgraph__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Subgraph__Group_1__1_in_rule__Subgraph__Group_1__03904);
            rule__Subgraph__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__0"


    // $ANTLR start "rule__Subgraph__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1917:1: rule__Subgraph__Group_1__0__Impl : ( Subgraph ) ;
    public final void rule__Subgraph__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1921:1: ( ( Subgraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1922:1: ( Subgraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1922:1: ( Subgraph )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1923:1: Subgraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0()); 
            }
            match(input,Subgraph,FOLLOW_Subgraph_in_rule__Subgraph__Group_1__0__Impl3932); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getSubgraphKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__0__Impl"


    // $ANTLR start "rule__Subgraph__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1936:1: rule__Subgraph__Group_1__1 : rule__Subgraph__Group_1__1__Impl ;
    public final void rule__Subgraph__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1940:1: ( rule__Subgraph__Group_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1941:2: rule__Subgraph__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subgraph__Group_1__1__Impl_in_rule__Subgraph__Group_1__13963);
            rule__Subgraph__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__1"


    // $ANTLR start "rule__Subgraph__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1947:1: rule__Subgraph__Group_1__1__Impl : ( ( rule__Subgraph__NameAssignment_1_1 )? ) ;
    public final void rule__Subgraph__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1951:1: ( ( ( rule__Subgraph__NameAssignment_1_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1952:1: ( ( rule__Subgraph__NameAssignment_1_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1952:1: ( ( rule__Subgraph__NameAssignment_1_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1953:1: ( rule__Subgraph__NameAssignment_1_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameAssignment_1_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1954:1: ( rule__Subgraph__NameAssignment_1_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_NUMERAL && LA25_0<=RULE_QUOTED_STRING)||LA25_0==RULE_HTML_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1954:2: rule__Subgraph__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Subgraph__NameAssignment_1_1_in_rule__Subgraph__Group_1__1__Impl3990);
                    rule__Subgraph__NameAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__Group_1__1__Impl"


    // $ANTLR start "rule__Port__Group_0__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1968:1: rule__Port__Group_0__0 : rule__Port__Group_0__0__Impl rule__Port__Group_0__1 ;
    public final void rule__Port__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1972:1: ( rule__Port__Group_0__0__Impl rule__Port__Group_0__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1973:2: rule__Port__Group_0__0__Impl rule__Port__Group_0__1
            {
            pushFollow(FOLLOW_rule__Port__Group_0__0__Impl_in_rule__Port__Group_0__04025);
            rule__Port__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Port__Group_0__1_in_rule__Port__Group_0__04028);
            rule__Port__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_0__0"


    // $ANTLR start "rule__Port__Group_0__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1980:1: rule__Port__Group_0__0__Impl : ( ( Colon ) ) ;
    public final void rule__Port__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1984:1: ( ( ( Colon ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1985:1: ( ( Colon ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1985:1: ( ( Colon ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1986:1: ( Colon )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getColonKeyword_0_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1987:1: ( Colon )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1988:2: Colon
            {
            match(input,Colon,FOLLOW_Colon_in_rule__Port__Group_0__0__Impl4057); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getColonKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_0__0__Impl"


    // $ANTLR start "rule__Port__Group_0__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:1999:1: rule__Port__Group_0__1 : rule__Port__Group_0__1__Impl ;
    public final void rule__Port__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2003:1: ( rule__Port__Group_0__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2004:2: rule__Port__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_0__1__Impl_in_rule__Port__Group_0__14089);
            rule__Port__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_0__1"


    // $ANTLR start "rule__Port__Group_0__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2010:1: rule__Port__Group_0__1__Impl : ( ( rule__Port__Compass_ptAssignment_0_1 ) ) ;
    public final void rule__Port__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2014:1: ( ( ( rule__Port__Compass_ptAssignment_0_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2015:1: ( ( rule__Port__Compass_ptAssignment_0_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2015:1: ( ( rule__Port__Compass_ptAssignment_0_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2016:1: ( rule__Port__Compass_ptAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptAssignment_0_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2017:1: ( rule__Port__Compass_ptAssignment_0_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2017:2: rule__Port__Compass_ptAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Port__Compass_ptAssignment_0_1_in_rule__Port__Group_0__1__Impl4116);
            rule__Port__Compass_ptAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_0__1__Impl"


    // $ANTLR start "rule__Port__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2031:1: rule__Port__Group_1__0 : rule__Port__Group_1__0__Impl rule__Port__Group_1__1 ;
    public final void rule__Port__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2035:1: ( rule__Port__Group_1__0__Impl rule__Port__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2036:2: rule__Port__Group_1__0__Impl rule__Port__Group_1__1
            {
            pushFollow(FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__04150);
            rule__Port__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__04153);
            rule__Port__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__0"


    // $ANTLR start "rule__Port__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2043:1: rule__Port__Group_1__0__Impl : ( Colon ) ;
    public final void rule__Port__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2047:1: ( ( Colon ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2048:1: ( Colon )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2048:1: ( Colon )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2049:1: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getColonKeyword_1_0()); 
            }
            match(input,Colon,FOLLOW_Colon_in_rule__Port__Group_1__0__Impl4181); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getColonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__0__Impl"


    // $ANTLR start "rule__Port__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2062:1: rule__Port__Group_1__1 : rule__Port__Group_1__1__Impl rule__Port__Group_1__2 ;
    public final void rule__Port__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2066:1: ( rule__Port__Group_1__1__Impl rule__Port__Group_1__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2067:2: rule__Port__Group_1__1__Impl rule__Port__Group_1__2
            {
            pushFollow(FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__14212);
            rule__Port__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__14215);
            rule__Port__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__1"


    // $ANTLR start "rule__Port__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2074:1: rule__Port__Group_1__1__Impl : ( ( rule__Port__NameAssignment_1_1 ) ) ;
    public final void rule__Port__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2078:1: ( ( ( rule__Port__NameAssignment_1_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2079:1: ( ( rule__Port__NameAssignment_1_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2079:1: ( ( rule__Port__NameAssignment_1_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2080:1: ( rule__Port__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getNameAssignment_1_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2081:1: ( rule__Port__NameAssignment_1_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2081:2: rule__Port__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_1_in_rule__Port__Group_1__1__Impl4242);
            rule__Port__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getNameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__1__Impl"


    // $ANTLR start "rule__Port__Group_1__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2091:1: rule__Port__Group_1__2 : rule__Port__Group_1__2__Impl ;
    public final void rule__Port__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2095:1: ( rule__Port__Group_1__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2096:2: rule__Port__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__24272);
            rule__Port__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__2"


    // $ANTLR start "rule__Port__Group_1__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2102:1: rule__Port__Group_1__2__Impl : ( ( rule__Port__Group_1_2__0 )? ) ;
    public final void rule__Port__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2106:1: ( ( ( rule__Port__Group_1_2__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2107:1: ( ( rule__Port__Group_1_2__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2107:1: ( ( rule__Port__Group_1_2__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2108:1: ( rule__Port__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getGroup_1_2()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2109:1: ( rule__Port__Group_1_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Colon) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2109:2: rule__Port__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Port__Group_1_2__0_in_rule__Port__Group_1__2__Impl4299);
                    rule__Port__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1__2__Impl"


    // $ANTLR start "rule__Port__Group_1_2__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2125:1: rule__Port__Group_1_2__0 : rule__Port__Group_1_2__0__Impl rule__Port__Group_1_2__1 ;
    public final void rule__Port__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2129:1: ( rule__Port__Group_1_2__0__Impl rule__Port__Group_1_2__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2130:2: rule__Port__Group_1_2__0__Impl rule__Port__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Port__Group_1_2__0__Impl_in_rule__Port__Group_1_2__04336);
            rule__Port__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Port__Group_1_2__1_in_rule__Port__Group_1_2__04339);
            rule__Port__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1_2__0"


    // $ANTLR start "rule__Port__Group_1_2__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2137:1: rule__Port__Group_1_2__0__Impl : ( Colon ) ;
    public final void rule__Port__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2141:1: ( ( Colon ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2142:1: ( Colon )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2142:1: ( Colon )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2143:1: Colon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getColonKeyword_1_2_0()); 
            }
            match(input,Colon,FOLLOW_Colon_in_rule__Port__Group_1_2__0__Impl4367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getColonKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1_2__0__Impl"


    // $ANTLR start "rule__Port__Group_1_2__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2156:1: rule__Port__Group_1_2__1 : rule__Port__Group_1_2__1__Impl ;
    public final void rule__Port__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2160:1: ( rule__Port__Group_1_2__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2161:2: rule__Port__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group_1_2__1__Impl_in_rule__Port__Group_1_2__14398);
            rule__Port__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1_2__1"


    // $ANTLR start "rule__Port__Group_1_2__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2167:1: rule__Port__Group_1_2__1__Impl : ( ( rule__Port__Compass_ptAssignment_1_2_1 ) ) ;
    public final void rule__Port__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2171:1: ( ( ( rule__Port__Compass_ptAssignment_1_2_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2172:1: ( ( rule__Port__Compass_ptAssignment_1_2_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2172:1: ( ( rule__Port__Compass_ptAssignment_1_2_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2173:1: ( rule__Port__Compass_ptAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptAssignment_1_2_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2174:1: ( rule__Port__Compass_ptAssignment_1_2_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2174:2: rule__Port__Compass_ptAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Port__Compass_ptAssignment_1_2_1_in_rule__Port__Group_1_2__1__Impl4425);
            rule__Port__Compass_ptAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group_1_2__1__Impl"


    // $ANTLR start "rule__EdgeRhsNode__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2188:1: rule__EdgeRhsNode__Group__0 : rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1 ;
    public final void rule__EdgeRhsNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2192:1: ( rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2193:2: rule__EdgeRhsNode__Group__0__Impl rule__EdgeRhsNode__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeRhsNode__Group__0__Impl_in_rule__EdgeRhsNode__Group__04459);
            rule__EdgeRhsNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EdgeRhsNode__Group__1_in_rule__EdgeRhsNode__Group__04462);
            rule__EdgeRhsNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__0"


    // $ANTLR start "rule__EdgeRhsNode__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2200:1: rule__EdgeRhsNode__Group__0__Impl : ( ( rule__EdgeRhsNode__OpAssignment_0 ) ) ;
    public final void rule__EdgeRhsNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2204:1: ( ( ( rule__EdgeRhsNode__OpAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2205:1: ( ( rule__EdgeRhsNode__OpAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2205:1: ( ( rule__EdgeRhsNode__OpAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2206:1: ( rule__EdgeRhsNode__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getOpAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2207:1: ( rule__EdgeRhsNode__OpAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2207:2: rule__EdgeRhsNode__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeRhsNode__OpAssignment_0_in_rule__EdgeRhsNode__Group__0__Impl4489);
            rule__EdgeRhsNode__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__0__Impl"


    // $ANTLR start "rule__EdgeRhsNode__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2217:1: rule__EdgeRhsNode__Group__1 : rule__EdgeRhsNode__Group__1__Impl ;
    public final void rule__EdgeRhsNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2221:1: ( rule__EdgeRhsNode__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2222:2: rule__EdgeRhsNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EdgeRhsNode__Group__1__Impl_in_rule__EdgeRhsNode__Group__14519);
            rule__EdgeRhsNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__1"


    // $ANTLR start "rule__EdgeRhsNode__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2228:1: rule__EdgeRhsNode__Group__1__Impl : ( ( rule__EdgeRhsNode__NodeAssignment_1 ) ) ;
    public final void rule__EdgeRhsNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2232:1: ( ( ( rule__EdgeRhsNode__NodeAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2233:1: ( ( rule__EdgeRhsNode__NodeAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2233:1: ( ( rule__EdgeRhsNode__NodeAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2234:1: ( rule__EdgeRhsNode__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getNodeAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2235:1: ( rule__EdgeRhsNode__NodeAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2235:2: rule__EdgeRhsNode__NodeAssignment_1
            {
            pushFollow(FOLLOW_rule__EdgeRhsNode__NodeAssignment_1_in_rule__EdgeRhsNode__Group__1__Impl4546);
            rule__EdgeRhsNode__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__Group__1__Impl"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2249:1: rule__EdgeRhsSubgraph__Group__0 : rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1 ;
    public final void rule__EdgeRhsSubgraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2253:1: ( rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2254:2: rule__EdgeRhsSubgraph__Group__0__Impl rule__EdgeRhsSubgraph__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__Group__0__Impl_in_rule__EdgeRhsSubgraph__Group__04580);
            rule__EdgeRhsSubgraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__Group__1_in_rule__EdgeRhsSubgraph__Group__04583);
            rule__EdgeRhsSubgraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__0"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2261:1: rule__EdgeRhsSubgraph__Group__0__Impl : ( ( rule__EdgeRhsSubgraph__OpAssignment_0 ) ) ;
    public final void rule__EdgeRhsSubgraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2265:1: ( ( ( rule__EdgeRhsSubgraph__OpAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2266:1: ( ( rule__EdgeRhsSubgraph__OpAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2266:1: ( ( rule__EdgeRhsSubgraph__OpAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2267:1: ( rule__EdgeRhsSubgraph__OpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getOpAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2268:1: ( rule__EdgeRhsSubgraph__OpAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2268:2: rule__EdgeRhsSubgraph__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__OpAssignment_0_in_rule__EdgeRhsSubgraph__Group__0__Impl4610);
            rule__EdgeRhsSubgraph__OpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getOpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__0__Impl"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2278:1: rule__EdgeRhsSubgraph__Group__1 : rule__EdgeRhsSubgraph__Group__1__Impl ;
    public final void rule__EdgeRhsSubgraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2282:1: ( rule__EdgeRhsSubgraph__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2283:2: rule__EdgeRhsSubgraph__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__Group__1__Impl_in_rule__EdgeRhsSubgraph__Group__14640);
            rule__EdgeRhsSubgraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__1"


    // $ANTLR start "rule__EdgeRhsSubgraph__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2289:1: rule__EdgeRhsSubgraph__Group__1__Impl : ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 ) ) ;
    public final void rule__EdgeRhsSubgraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2293:1: ( ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2294:1: ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2294:1: ( ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2295:1: ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2296:1: ( rule__EdgeRhsSubgraph__SubgraphAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2296:2: rule__EdgeRhsSubgraph__SubgraphAssignment_1
            {
            pushFollow(FOLLOW_rule__EdgeRhsSubgraph__SubgraphAssignment_1_in_rule__EdgeRhsSubgraph__Group__1__Impl4667);
            rule__EdgeRhsSubgraph__SubgraphAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__Group__1__Impl"


    // $ANTLR start "rule__NodeId__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2310:1: rule__NodeId__Group__0 : rule__NodeId__Group__0__Impl rule__NodeId__Group__1 ;
    public final void rule__NodeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2314:1: ( rule__NodeId__Group__0__Impl rule__NodeId__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2315:2: rule__NodeId__Group__0__Impl rule__NodeId__Group__1
            {
            pushFollow(FOLLOW_rule__NodeId__Group__0__Impl_in_rule__NodeId__Group__04701);
            rule__NodeId__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeId__Group__1_in_rule__NodeId__Group__04704);
            rule__NodeId__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__0"


    // $ANTLR start "rule__NodeId__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2322:1: rule__NodeId__Group__0__Impl : ( ( rule__NodeId__NameAssignment_0 ) ) ;
    public final void rule__NodeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2326:1: ( ( ( rule__NodeId__NameAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2327:1: ( ( rule__NodeId__NameAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2327:1: ( ( rule__NodeId__NameAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2328:1: ( rule__NodeId__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getNameAssignment_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2329:1: ( rule__NodeId__NameAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2329:2: rule__NodeId__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeId__NameAssignment_0_in_rule__NodeId__Group__0__Impl4731);
            rule__NodeId__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__0__Impl"


    // $ANTLR start "rule__NodeId__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2339:1: rule__NodeId__Group__1 : rule__NodeId__Group__1__Impl ;
    public final void rule__NodeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2343:1: ( rule__NodeId__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2344:2: rule__NodeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeId__Group__1__Impl_in_rule__NodeId__Group__14761);
            rule__NodeId__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__1"


    // $ANTLR start "rule__NodeId__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2350:1: rule__NodeId__Group__1__Impl : ( ( rule__NodeId__PortAssignment_1 )? ) ;
    public final void rule__NodeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2354:1: ( ( ( rule__NodeId__PortAssignment_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2355:1: ( ( rule__NodeId__PortAssignment_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2355:1: ( ( rule__NodeId__PortAssignment_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2356:1: ( rule__NodeId__PortAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getPortAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2357:1: ( rule__NodeId__PortAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Colon) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2357:2: rule__NodeId__PortAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NodeId__PortAssignment_1_in_rule__NodeId__Group__1__Impl4788);
                    rule__NodeId__PortAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getPortAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__Group__1__Impl"


    // $ANTLR start "rule__DotAst__GraphsAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2372:1: rule__DotAst__GraphsAssignment : ( ruleDotGraph ) ;
    public final void rule__DotAst__GraphsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2376:1: ( ( ruleDotGraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2377:1: ( ruleDotGraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2377:1: ( ruleDotGraph )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2378:1: ruleDotGraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDotGraph_in_rule__DotAst__GraphsAssignment4828);
            ruleDotGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotAstAccess().getGraphsDotGraphParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotAst__GraphsAssignment"


    // $ANTLR start "rule__DotGraph__StrictAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2387:1: rule__DotGraph__StrictAssignment_0 : ( ( Strict ) ) ;
    public final void rule__DotGraph__StrictAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2391:1: ( ( ( Strict ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2392:1: ( ( Strict ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2392:1: ( ( Strict ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2393:1: ( Strict )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_0_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2394:1: ( Strict )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2395:1: Strict
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_0_0()); 
            }
            match(input,Strict,FOLLOW_Strict_in_rule__DotGraph__StrictAssignment_04864); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStrictStrictKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__StrictAssignment_0"


    // $ANTLR start "rule__DotGraph__TypeAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2410:1: rule__DotGraph__TypeAssignment_1 : ( ruleGraphType ) ;
    public final void rule__DotGraph__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2414:1: ( ( ruleGraphType ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2415:1: ( ruleGraphType )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2415:1: ( ruleGraphType )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2416:1: ruleGraphType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleGraphType_in_rule__DotGraph__TypeAssignment_14903);
            ruleGraphType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getTypeGraphTypeEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__TypeAssignment_1"


    // $ANTLR start "rule__DotGraph__NameAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2425:1: rule__DotGraph__NameAssignment_2 : ( ruleID ) ;
    public final void rule__DotGraph__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2429:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2430:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2430:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2431:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getNameIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__DotGraph__NameAssignment_24934);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getNameIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NameAssignment_2"


    // $ANTLR start "rule__DotGraph__StmtsAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2440:1: rule__DotGraph__StmtsAssignment_4 : ( ruleStmt ) ;
    public final void rule__DotGraph__StmtsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2444:1: ( ( ruleStmt ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2445:1: ( ruleStmt )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2445:1: ( ruleStmt )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2446:1: ruleStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_rule__DotGraph__StmtsAssignment_44965);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDotGraphAccess().getStmtsStmtParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__StmtsAssignment_4"


    // $ANTLR start "rule__EdgeStmtNode__NodeAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2455:1: rule__EdgeStmtNode__NodeAssignment_0 : ( ruleNodeId ) ;
    public final void rule__EdgeStmtNode__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2459:1: ( ( ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2460:1: ( ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2460:1: ( ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2461:1: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNodeId_in_rule__EdgeStmtNode__NodeAssignment_04996);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getNodeNodeIdParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__NodeAssignment_0"


    // $ANTLR start "rule__EdgeStmtNode__EdgeRHSAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2470:1: rule__EdgeStmtNode__EdgeRHSAssignment_1 : ( ruleEdgeRhs ) ;
    public final void rule__EdgeStmtNode__EdgeRHSAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2474:1: ( ( ruleEdgeRhs ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2475:1: ( ruleEdgeRhs )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2475:1: ( ruleEdgeRhs )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2476:1: ruleEdgeRhs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhs_in_rule__EdgeStmtNode__EdgeRHSAssignment_15027);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getEdgeRHSEdgeRhsParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__EdgeRHSAssignment_1"


    // $ANTLR start "rule__EdgeStmtNode__AttrListsAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2485:1: rule__EdgeStmtNode__AttrListsAssignment_2 : ( ruleAttrList ) ;
    public final void rule__EdgeStmtNode__AttrListsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2489:1: ( ( ruleAttrList ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2490:1: ( ruleAttrList )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2490:1: ( ruleAttrList )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2491:1: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_rule__EdgeStmtNode__AttrListsAssignment_25058);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeStmtNodeAccess().getAttrListsAttrListParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeStmtNode__AttrListsAssignment_2"


    // $ANTLR start "rule__NodeStmt__NodeAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2503:1: rule__NodeStmt__NodeAssignment_0 : ( ruleNodeId ) ;
    public final void rule__NodeStmt__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2507:1: ( ( ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2508:1: ( ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2508:1: ( ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2509:1: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNodeId_in_rule__NodeStmt__NodeAssignment_05092);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getNodeNodeIdParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__NodeAssignment_0"


    // $ANTLR start "rule__NodeStmt__AttrListsAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2518:1: rule__NodeStmt__AttrListsAssignment_1 : ( ruleAttrList ) ;
    public final void rule__NodeStmt__AttrListsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2522:1: ( ( ruleAttrList ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2523:1: ( ruleAttrList )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2523:1: ( ruleAttrList )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2524:1: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_rule__NodeStmt__AttrListsAssignment_15123);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeStmt__AttrListsAssignment_1"


    // $ANTLR start "rule__AttrStmt__TypeAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2533:1: rule__AttrStmt__TypeAssignment_0 : ( ruleAttributeType ) ;
    public final void rule__AttrStmt__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2537:1: ( ( ruleAttributeType ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2538:1: ( ruleAttributeType )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2538:1: ( ruleAttributeType )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2539:1: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_rule__AttrStmt__TypeAssignment_05154);
            ruleAttributeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getTypeAttributeTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__TypeAssignment_0"


    // $ANTLR start "rule__AttrStmt__AttrListsAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2548:1: rule__AttrStmt__AttrListsAssignment_1 : ( ruleAttrList ) ;
    public final void rule__AttrStmt__AttrListsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2552:1: ( ( ruleAttrList ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2553:1: ( ruleAttrList )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2553:1: ( ruleAttrList )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2554:1: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_rule__AttrStmt__AttrListsAssignment_15185);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrStmtAccess().getAttrListsAttrListParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrStmt__AttrListsAssignment_1"


    // $ANTLR start "rule__AttrList__AttributesAssignment_2_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2563:1: rule__AttrList__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__AttrList__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2567:1: ( ( ruleAttribute ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2568:1: ( ruleAttribute )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2568:1: ( ruleAttribute )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2569:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttrList__AttributesAssignment_2_05216);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttrListAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__AttributesAssignment_2_0"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2578:1: rule__Attribute__NameAssignment_0 : ( ruleID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2582:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2583:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2583:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2584:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__Attribute__NameAssignment_05247);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2593:1: rule__Attribute__ValueAssignment_2 : ( ruleID ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2597:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2598:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2598:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2599:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__Attribute__ValueAssignment_25278);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2608:1: rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1 : ( ruleEdgeRhs ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2612:1: ( ( ruleEdgeRhs ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2613:1: ( ruleEdgeRhs )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2613:1: ( ruleEdgeRhs )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2614:1: ruleEdgeRhs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEdgeRhs_in_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_15309);
            ruleEdgeRhs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getEdgeRHSEdgeRhsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1"


    // $ANTLR start "rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2623:1: rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2 : ( ruleAttrList ) ;
    public final void rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2627:1: ( ( ruleAttrList ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2628:1: ( ruleAttrList )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2628:1: ( ruleAttrList )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2629:1: ruleAttrList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAttrList_in_rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_25340);
            ruleAttrList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphOrEdgeStmtSubgraphAccess().getAttrListsAttrListParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2"


    // $ANTLR start "rule__Subgraph__NameAssignment_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2638:1: rule__Subgraph__NameAssignment_1_1 : ( ruleID ) ;
    public final void rule__Subgraph__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2642:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2643:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2643:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2644:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getNameIDParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__Subgraph__NameAssignment_1_15371);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getNameIDParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__NameAssignment_1_1"


    // $ANTLR start "rule__Subgraph__StmtsAssignment_3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2653:1: rule__Subgraph__StmtsAssignment_3 : ( ruleStmt ) ;
    public final void rule__Subgraph__StmtsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2657:1: ( ( ruleStmt ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2658:1: ( ruleStmt )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2658:1: ( ruleStmt )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2659:1: ruleStmt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_rule__Subgraph__StmtsAssignment_35402);
            ruleStmt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubgraphAccess().getStmtsStmtParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subgraph__StmtsAssignment_3"


    // $ANTLR start "rule__Port__Compass_ptAssignment_0_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2668:1: rule__Port__Compass_ptAssignment_0_1 : ( RULE_COMPASS_PT ) ;
    public final void rule__Port__Compass_ptAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2672:1: ( ( RULE_COMPASS_PT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2673:1: ( RULE_COMPASS_PT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2673:1: ( RULE_COMPASS_PT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2674:1: RULE_COMPASS_PT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_rule__Port__Compass_ptAssignment_0_15433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Compass_ptAssignment_0_1"


    // $ANTLR start "rule__Port__NameAssignment_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2683:1: rule__Port__NameAssignment_1_1 : ( ruleID ) ;
    public final void rule__Port__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2687:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2688:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2688:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2689:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getNameIDParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__Port__NameAssignment_1_15464);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getNameIDParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1_1"


    // $ANTLR start "rule__Port__Compass_ptAssignment_1_2_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2698:1: rule__Port__Compass_ptAssignment_1_2_1 : ( RULE_COMPASS_PT ) ;
    public final void rule__Port__Compass_ptAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2702:1: ( ( RULE_COMPASS_PT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2703:1: ( RULE_COMPASS_PT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2703:1: ( RULE_COMPASS_PT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2704:1: RULE_COMPASS_PT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_1_2_1_0()); 
            }
            match(input,RULE_COMPASS_PT,FOLLOW_RULE_COMPASS_PT_in_rule__Port__Compass_ptAssignment_1_2_15495); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortAccess().getCompass_ptCOMPASS_PTTerminalRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Compass_ptAssignment_1_2_1"


    // $ANTLR start "rule__EdgeRhsNode__OpAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2713:1: rule__EdgeRhsNode__OpAssignment_0 : ( ruleEdgeOp ) ;
    public final void rule__EdgeRhsNode__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2717:1: ( ( ruleEdgeOp ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2718:1: ( ruleEdgeOp )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2718:1: ( ruleEdgeOp )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2719:1: ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEdgeOp_in_rule__EdgeRhsNode__OpAssignment_05526);
            ruleEdgeOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getOpEdgeOpEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__OpAssignment_0"


    // $ANTLR start "rule__EdgeRhsNode__NodeAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2728:1: rule__EdgeRhsNode__NodeAssignment_1 : ( ruleNodeId ) ;
    public final void rule__EdgeRhsNode__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2732:1: ( ( ruleNodeId ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2733:1: ( ruleNodeId )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2733:1: ( ruleNodeId )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2734:1: ruleNodeId
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeId_in_rule__EdgeRhsNode__NodeAssignment_15557);
            ruleNodeId();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsNodeAccess().getNodeNodeIdParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsNode__NodeAssignment_1"


    // $ANTLR start "rule__EdgeRhsSubgraph__OpAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2743:1: rule__EdgeRhsSubgraph__OpAssignment_0 : ( ruleEdgeOp ) ;
    public final void rule__EdgeRhsSubgraph__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2747:1: ( ( ruleEdgeOp ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2748:1: ( ruleEdgeOp )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2748:1: ( ruleEdgeOp )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2749:1: ruleEdgeOp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEdgeOp_in_rule__EdgeRhsSubgraph__OpAssignment_05588);
            ruleEdgeOp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getOpEdgeOpEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__OpAssignment_0"


    // $ANTLR start "rule__EdgeRhsSubgraph__SubgraphAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2758:1: rule__EdgeRhsSubgraph__SubgraphAssignment_1 : ( ruleSubgraph ) ;
    public final void rule__EdgeRhsSubgraph__SubgraphAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2762:1: ( ( ruleSubgraph ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2763:1: ( ruleSubgraph )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2763:1: ( ruleSubgraph )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2764:1: ruleSubgraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSubgraph_in_rule__EdgeRhsSubgraph__SubgraphAssignment_15619);
            ruleSubgraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEdgeRhsSubgraphAccess().getSubgraphSubgraphParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeRhsSubgraph__SubgraphAssignment_1"


    // $ANTLR start "rule__NodeId__NameAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2773:1: rule__NodeId__NameAssignment_0 : ( ruleID ) ;
    public final void rule__NodeId__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2777:1: ( ( ruleID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2778:1: ( ruleID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2778:1: ( ruleID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2779:1: ruleID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getNameIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleID_in_rule__NodeId__NameAssignment_05650);
            ruleID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getNameIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__NameAssignment_0"


    // $ANTLR start "rule__NodeId__PortAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2788:1: rule__NodeId__PortAssignment_1 : ( rulePort ) ;
    public final void rule__NodeId__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2792:1: ( ( rulePort ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2793:1: ( rulePort )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2793:1: ( rulePort )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:2794:1: rulePort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePort_in_rule__NodeId__PortAssignment_15681);
            rulePort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeIdAccess().getPortPortParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeId__PortAssignment_1"

    // $ANTLR start synpred7_InternalDotParser
    public final void synpred7_InternalDotParser_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:658:1: ( ( ( rule__Port__Group_0__0 ) ) )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:658:1: ( ( rule__Port__Group_0__0 ) )
        {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:658:1: ( ( rule__Port__Group_0__0 ) )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:659:1: ( rule__Port__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getPortAccess().getGroup_0()); 
        }
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:660:1: ( rule__Port__Group_0__0 )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotParser.g:660:2: rule__Port__Group_0__0
        {
        pushFollow(FOLLOW_rule__Port__Group_0__0_in_synpred7_InternalDotParser1359);
        rule__Port__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalDotParser

    // Delegated rules

    public final boolean synpred7_InternalDotParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalDotParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\23\uffff";
    static final String DFA2_eofS =
        "\1\uffff\5\11\6\uffff\5\11\1\uffff\1\11";
    static final String DFA2_minS =
        "\6\4\2\uffff\1\24\3\uffff\5\4\1\25\1\4";
    static final String DFA2_maxS =
        "\6\33\2\uffff\1\33\3\uffff\5\33\1\25\1\33";
    static final String DFA2_acceptS =
        "\6\uffff\1\3\1\5\1\uffff\1\1\1\4\1\2\7\uffff";
    static final String DFA2_specialS =
        "\23\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\7\2\uffff\3\6\10\uffff\1\7\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\5",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\10\1\11\1\12\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\10\1\11\1\12\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\10\1\11\1\12\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\10\1\11\1\12\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\10\1\11\1\12\1\11\1\uffff\6\11\3\uffff\1\11",
            "",
            "",
            "\1\14\1\15\1\16\1\17\3\uffff\1\20",
            "",
            "",
            "",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\21\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\21\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\21\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\21\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\11\2\uffff\3\11\2\13\1\uffff\1\21\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11",
            "\1\22",
            "\1\11\2\uffff\3\11\2\13\2\uffff\1\11\1\uffff\1\11\1\uffff\6\11\3\uffff\1\11"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "587:1: rule__Stmt__Alternatives_0 : ( ( ruleNodeStmt ) | ( ruleEdgeStmtNode ) | ( ruleAttrStmt ) | ( ruleAttribute ) | ( ruleSubgraphOrEdgeStmtSubgraph ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDotAst_in_entryRuleDotAst60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotAst67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotAst__GraphsAssignment_in_ruleDotAst97 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_ruleDotGraph_in_entryRuleDotGraph125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDotGraph132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__0_in_ruleDotGraph162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__0_in_ruleStmt226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeStmtNode_in_entryRuleEdgeStmtNode253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeStmtNode260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__0_in_ruleEdgeStmtNode290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStmt_in_entryRuleNodeStmt319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeStmt326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStmt__Group__0_in_ruleNodeStmt356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrStmt_in_entryRuleAttrStmt383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrStmt390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrStmt__Group__0_in_ruleAttrStmt420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0_in_ruleAttrList484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_entryRuleSubgraphOrEdgeStmtSubgraph575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubgraphOrEdgeStmtSubgraph582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__0_in_ruleSubgraphOrEdgeStmtSubgraph612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraph_in_entryRuleSubgraph639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubgraph646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__0_in_ruleSubgraph676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Alternatives_in_rulePort740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_entryRuleEdgeRhs767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhs774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhs__Alternatives_in_ruleEdgeRhs804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsNode_in_entryRuleEdgeRhsNode831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhsNode838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__Group__0_in_ruleEdgeRhsNode868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsSubgraph_in_entryRuleEdgeRhsSubgraph895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeRhsSubgraph902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__Group__0_in_ruleEdgeRhsSubgraph932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_entryRuleNodeId959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeId966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeId__Group__0_in_ruleNodeId996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ID__Alternatives_in_ruleID1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeOp__Alternatives_in_ruleEdgeOp1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GraphType__Alternatives_in_ruleGraphType1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeStmt_in_rule__Stmt__Alternatives_01204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeStmtNode_in_rule__Stmt__Alternatives_01221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrStmt_in_rule__Stmt__Alternatives_01238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Stmt__Alternatives_01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraphOrEdgeStmtSubgraph_in_rule__Stmt__Alternatives_01272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__AttrList__Alternatives_2_11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rule__AttrList__Alternatives_2_11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_0__0_in_rule__Port__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0_in_rule__Port__Alternatives1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsNode_in_rule__EdgeRhs__Alternatives1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhsSubgraph_in_rule__EdgeRhs__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERAL_in_rule__ID__Alternatives1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_rule__ID__Alternatives1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ID__Alternatives1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_QUOTED_STRING_in_rule__ID__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HTML_STRING_in_rule__ID__Alternatives1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinusGreaterThanSign_in_rule__EdgeOp__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HyphenMinusHyphenMinus_in_rule__EdgeOp__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Graph_in_rule__GraphType__Alternatives1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digraph_in_rule__GraphType__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Graph_in_rule__AttributeType__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Node_in_rule__AttributeType__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edge_in_rule__AttributeType__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__01742 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__01745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__StrictAssignment_0_in_rule__DotGraph__Group__0__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__11803 = new BitSet(new long[]{0x0000000008F40000L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__TypeAssignment_1_in_rule__DotGraph__Group__1__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__21863 = new BitSet(new long[]{0x0000000008F40000L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__21866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__NameAssignment_2_in_rule__DotGraph__Group__2__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__31924 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__31927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__DotGraph__Group__3__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__41986 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__5_in_rule__DotGraph__Group__41989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DotGraph__StmtsAssignment_4_in_rule__DotGraph__Group__4__Impl2016 = new BitSet(new long[]{0x0000000008F40392L});
    public static final BitSet FOLLOW_rule__DotGraph__Group__5__Impl_in_rule__DotGraph__Group__52047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__DotGraph__Group__5__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__0__Impl_in_rule__Stmt__Group__02118 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Stmt__Group__1_in_rule__Stmt__Group__02121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Alternatives_0_in_rule__Stmt__Group__0__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Group__1__Impl_in_rule__Stmt__Group__12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rule__Stmt__Group__1__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__0__Impl_in_rule__EdgeStmtNode__Group__02244 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__1_in_rule__EdgeStmtNode__Group__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__NodeAssignment_0_in_rule__EdgeStmtNode__Group__0__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__1__Impl_in_rule__EdgeStmtNode__Group__12304 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__2_in_rule__EdgeStmtNode__Group__12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__EdgeRHSAssignment_1_in_rule__EdgeStmtNode__Group__1__Impl2336 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__EdgeRHSAssignment_1_in_rule__EdgeStmtNode__Group__1__Impl2348 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__Group__2__Impl_in_rule__EdgeStmtNode__Group__22381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeStmtNode__AttrListsAssignment_2_in_rule__EdgeStmtNode__Group__2__Impl2408 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__NodeStmt__Group__0__Impl_in_rule__NodeStmt__Group__02446 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__NodeStmt__Group__1_in_rule__NodeStmt__Group__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStmt__NodeAssignment_0_in_rule__NodeStmt__Group__0__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStmt__Group__1__Impl_in_rule__NodeStmt__Group__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeStmt__AttrListsAssignment_1_in_rule__NodeStmt__Group__1__Impl2533 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AttrStmt__Group__0__Impl_in_rule__AttrStmt__Group__02568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AttrStmt__Group__1_in_rule__AttrStmt__Group__02571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrStmt__TypeAssignment_0_in_rule__AttrStmt__Group__0__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrStmt__Group__1__Impl_in_rule__AttrStmt__Group__12628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrStmt__AttrListsAssignment_1_in_rule__AttrStmt__Group__1__Impl2657 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AttrStmt__AttrListsAssignment_1_in_rule__AttrStmt__Group__1__Impl2669 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__02706 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__12767 = new BitSet(new long[]{0x0000000008F20000L});
    public static final BitSet FOLLOW_rule__AttrList__Group__2_in_rule__AttrList__Group__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rule__AttrList__Group__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__2__Impl_in_rule__AttrList__Group__22829 = new BitSet(new long[]{0x0000000008F20000L});
    public static final BitSet FOLLOW_rule__AttrList__Group__3_in_rule__AttrList__Group__22832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_2__0_in_rule__AttrList__Group__2__Impl2859 = new BitSet(new long[]{0x0000000008F00002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__3__Impl_in_rule__AttrList__Group__32890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rule__AttrList__Group__3__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_2__0__Impl_in_rule__AttrList__Group_2__02957 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__AttrList__Group_2__1_in_rule__AttrList__Group_2__02960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__AttributesAssignment_2_0_in_rule__AttrList__Group_2__0__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_2__1__Impl_in_rule__AttrList__Group_2__13017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Alternatives_2_1_in_rule__AttrList__Group_2__1__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03079 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13139 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__Attribute__Group__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_in_rule__Attribute__Group__2__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group__03264 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__1_in_rule__SubgraphOrEdgeStmtSubgraph__Group__03267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraph_in_rule__SubgraphOrEdgeStmtSubgraph__Group__0__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group__13323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__0_in_rule__SubgraphOrEdgeStmtSubgraph__Group__1__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__0__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__03385 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__03388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__13446 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__13449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl3478 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_1_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__1__Impl3490 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__23523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_2_in_rule__SubgraphOrEdgeStmtSubgraph__Group_1__2__Impl3550 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__0__Impl_in_rule__Subgraph__Group__03587 = new BitSet(new long[]{0x0000000008F40390L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__1_in_rule__Subgraph__Group__03590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__1__Impl_in_rule__Subgraph__Group__13648 = new BitSet(new long[]{0x0000000008F40390L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__2_in_rule__Subgraph__Group__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_1__0_in_rule__Subgraph__Group__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__2__Impl_in_rule__Subgraph__Group__23709 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__3_in_rule__Subgraph__Group__23712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Subgraph__Group__2__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__3__Impl_in_rule__Subgraph__Group__33771 = new BitSet(new long[]{0x0000000008FC0390L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__4_in_rule__Subgraph__Group__33774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__StmtsAssignment_3_in_rule__Subgraph__Group__3__Impl3801 = new BitSet(new long[]{0x0000000008F40392L});
    public static final BitSet FOLLOW_rule__Subgraph__Group__4__Impl_in_rule__Subgraph__Group__43832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Subgraph__Group__4__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_1__0__Impl_in_rule__Subgraph__Group_1__03901 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_1__1_in_rule__Subgraph__Group_1__03904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Subgraph_in_rule__Subgraph__Group_1__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__Group_1__1__Impl_in_rule__Subgraph__Group_1__13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subgraph__NameAssignment_1_1_in_rule__Subgraph__Group_1__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_0__0__Impl_in_rule__Port__Group_0__04025 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Port__Group_0__1_in_rule__Port__Group_0__04028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_rule__Port__Group_0__0__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_0__1__Impl_in_rule__Port__Group_0__14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Compass_ptAssignment_0_1_in_rule__Port__Group_0__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__0__Impl_in_rule__Port__Group_1__04150 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1_in_rule__Port__Group_1__04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_rule__Port__Group_1__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__1__Impl_in_rule__Port__Group_1__14212 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2_in_rule__Port__Group_1__14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_1_in_rule__Port__Group_1__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1__2__Impl_in_rule__Port__Group_1__24272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1_2__0_in_rule__Port__Group_1__2__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1_2__0__Impl_in_rule__Port__Group_1_2__04336 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Port__Group_1_2__1_in_rule__Port__Group_1_2__04339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Colon_in_rule__Port__Group_1_2__0__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_1_2__1__Impl_in_rule__Port__Group_1_2__14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Compass_ptAssignment_1_2_1_in_rule__Port__Group_1_2__1__Impl4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__Group__0__Impl_in_rule__EdgeRhsNode__Group__04459 = new BitSet(new long[]{0x0000000008F00000L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__Group__1_in_rule__EdgeRhsNode__Group__04462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__OpAssignment_0_in_rule__EdgeRhsNode__Group__0__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__Group__1__Impl_in_rule__EdgeRhsNode__Group__14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsNode__NodeAssignment_1_in_rule__EdgeRhsNode__Group__1__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__Group__0__Impl_in_rule__EdgeRhsSubgraph__Group__04580 = new BitSet(new long[]{0x0000000008F40390L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__Group__1_in_rule__EdgeRhsSubgraph__Group__04583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__OpAssignment_0_in_rule__EdgeRhsSubgraph__Group__0__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__Group__1__Impl_in_rule__EdgeRhsSubgraph__Group__14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeRhsSubgraph__SubgraphAssignment_1_in_rule__EdgeRhsSubgraph__Group__1__Impl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeId__Group__0__Impl_in_rule__NodeId__Group__04701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__NodeId__Group__1_in_rule__NodeId__Group__04704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeId__NameAssignment_0_in_rule__NodeId__Group__0__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeId__Group__1__Impl_in_rule__NodeId__Group__14761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeId__PortAssignment_1_in_rule__NodeId__Group__1__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDotGraph_in_rule__DotAst__GraphsAssignment4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Strict_in_rule__DotGraph__StrictAssignment_04864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraphType_in_rule__DotGraph__TypeAssignment_14903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__DotGraph__NameAssignment_24934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_rule__DotGraph__StmtsAssignment_44965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_rule__EdgeStmtNode__NodeAssignment_04996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_rule__EdgeStmtNode__EdgeRHSAssignment_15027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__EdgeStmtNode__AttrListsAssignment_25058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_rule__NodeStmt__NodeAssignment_05092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__NodeStmt__AttrListsAssignment_15123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__AttrStmt__TypeAssignment_05154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__AttrStmt__AttrListsAssignment_15185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttrList__AttributesAssignment_2_05216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__Attribute__NameAssignment_05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__Attribute__ValueAssignment_25278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeRhs_in_rule__SubgraphOrEdgeStmtSubgraph__EdgeRHSAssignment_1_15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__SubgraphOrEdgeStmtSubgraph__AttrListsAssignment_1_25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__Subgraph__NameAssignment_1_15371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_rule__Subgraph__StmtsAssignment_35402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_rule__Port__Compass_ptAssignment_0_15433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__Port__NameAssignment_1_15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPASS_PT_in_rule__Port__Compass_ptAssignment_1_2_15495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOp_in_rule__EdgeRhsNode__OpAssignment_05526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeId_in_rule__EdgeRhsNode__NodeAssignment_15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeOp_in_rule__EdgeRhsSubgraph__OpAssignment_05588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubgraph_in_rule__EdgeRhsSubgraph__SubgraphAssignment_15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__NodeId__NameAssignment_05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__NodeId__PortAssignment_15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group_0__0_in_synpred7_InternalDotParser1359 = new BitSet(new long[]{0x0000000000000002L});

}