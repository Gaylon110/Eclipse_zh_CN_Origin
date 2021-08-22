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
import org.eclipse.gef.dot.internal.language.services.DotEscStringGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotEscStringParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "L", "N", "R", "RULE_CHAR"
    };
    public static final int L=4;
    public static final int N=5;
    public static final int R=6;
    public static final int RULE_CHAR=7;
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
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g"; }


     
     	private DotEscStringGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("L", "'\\l'");
    		tokenNameToValue.put("N", "'\\n'");
    		tokenNameToValue.put("R", "'\\r'");
     	}
     	
        public void setGrammarAccess(DotEscStringGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEscString"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:67:1: entryRuleEscString : ruleEscString EOF ;
    public final void entryRuleEscString() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:68:1: ( ruleEscString EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:69:1: ruleEscString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscStringRule()); 
            }
            pushFollow(FOLLOW_ruleEscString_in_entryRuleEscString60);
            ruleEscString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEscString67); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEscString"


    // $ANTLR start "ruleEscString"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:76:1: ruleEscString : ( ( rule__EscString__Group__0 ) ) ;
    public final void ruleEscString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:80:5: ( ( ( rule__EscString__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:81:1: ( ( rule__EscString__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:81:1: ( ( rule__EscString__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:82:1: ( rule__EscString__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscStringAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:83:1: ( rule__EscString__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:83:2: rule__EscString__Group__0
            {
            pushFollow(FOLLOW_rule__EscString__Group__0_in_ruleEscString97);
            rule__EscString__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscStringAccess().getGroup()); 
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
    // $ANTLR end "ruleEscString"


    // $ANTLR start "entryRuleJustifiedText"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:95:1: entryRuleJustifiedText : ruleJustifiedText EOF ;
    public final void entryRuleJustifiedText() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:96:1: ( ruleJustifiedText EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:97:1: ruleJustifiedText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextRule()); 
            }
            pushFollow(FOLLOW_ruleJustifiedText_in_entryRuleJustifiedText124);
            ruleJustifiedText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJustifiedText131); if (state.failed) return ;

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
    // $ANTLR end "entryRuleJustifiedText"


    // $ANTLR start "ruleJustifiedText"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:104:1: ruleJustifiedText : ( ( rule__JustifiedText__Alternatives ) ) ;
    public final void ruleJustifiedText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:108:5: ( ( ( rule__JustifiedText__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:109:1: ( ( rule__JustifiedText__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:109:1: ( ( rule__JustifiedText__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:110:1: ( rule__JustifiedText__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:111:1: ( rule__JustifiedText__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:111:2: rule__JustifiedText__Alternatives
            {
            pushFollow(FOLLOW_rule__JustifiedText__Alternatives_in_ruleJustifiedText161);
            rule__JustifiedText__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleJustifiedText"


    // $ANTLR start "entryRuleTEXT"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:123:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:124:1: ( ruleTEXT EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:125:1: ruleTEXT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXTRule()); 
            }
            pushFollow(FOLLOW_ruleTEXT_in_entryRuleTEXT188);
            ruleTEXT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXTRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTEXT195); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:132:1: ruleTEXT : ( ( rule__TEXT__Group__0 ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:136:5: ( ( ( rule__TEXT__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:137:1: ( ( rule__TEXT__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:137:1: ( ( rule__TEXT__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:138:1: ( rule__TEXT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXTAccess().getGroup()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:139:1: ( rule__TEXT__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:139:2: rule__TEXT__Group__0
            {
            pushFollow(FOLLOW_rule__TEXT__Group__0_in_ruleTEXT225);
            rule__TEXT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXTAccess().getGroup()); 
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
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "ruleJustification"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:152:1: ruleJustification : ( ( rule__Justification__Alternatives ) ) ;
    public final void ruleJustification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:156:1: ( ( ( rule__Justification__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:157:1: ( ( rule__Justification__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:157:1: ( ( rule__Justification__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:158:1: ( rule__Justification__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustificationAccess().getAlternatives()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:159:1: ( rule__Justification__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:159:2: rule__Justification__Alternatives
            {
            pushFollow(FOLLOW_rule__Justification__Alternatives_in_ruleJustification262);
            rule__Justification__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustificationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleJustification"


    // $ANTLR start "rule__JustifiedText__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:170:1: rule__JustifiedText__Alternatives : ( ( ( rule__JustifiedText__Group_0__0 ) ) | ( ( rule__JustifiedText__JustificationAssignment_1 ) ) );
    public final void rule__JustifiedText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:174:1: ( ( ( rule__JustifiedText__Group_0__0 ) ) | ( ( rule__JustifiedText__JustificationAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CHAR) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=L && LA1_0<=R)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:175:1: ( ( rule__JustifiedText__Group_0__0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:175:1: ( ( rule__JustifiedText__Group_0__0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:176:1: ( rule__JustifiedText__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJustifiedTextAccess().getGroup_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:177:1: ( rule__JustifiedText__Group_0__0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:177:2: rule__JustifiedText__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__JustifiedText__Group_0__0_in_rule__JustifiedText__Alternatives297);
                    rule__JustifiedText__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJustifiedTextAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:181:6: ( ( rule__JustifiedText__JustificationAssignment_1 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:181:6: ( ( rule__JustifiedText__JustificationAssignment_1 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:182:1: ( rule__JustifiedText__JustificationAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJustifiedTextAccess().getJustificationAssignment_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:183:1: ( rule__JustifiedText__JustificationAssignment_1 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:183:2: rule__JustifiedText__JustificationAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JustifiedText__JustificationAssignment_1_in_rule__JustifiedText__Alternatives315);
                    rule__JustifiedText__JustificationAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJustifiedTextAccess().getJustificationAssignment_1()); 
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
    // $ANTLR end "rule__JustifiedText__Alternatives"


    // $ANTLR start "rule__Justification__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:192:1: rule__Justification__Alternatives : ( ( ( N ) ) | ( ( L ) ) | ( ( R ) ) );
    public final void rule__Justification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:196:1: ( ( ( N ) ) | ( ( L ) ) | ( ( R ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case N:
                {
                alt2=1;
                }
                break;
            case L:
                {
                alt2=2;
                }
                break;
            case R:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:197:1: ( ( N ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:197:1: ( ( N ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:198:1: ( N )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJustificationAccess().getCENTEREDEnumLiteralDeclaration_0()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:199:1: ( N )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:199:3: N
                    {
                    match(input,N,FOLLOW_N_in_rule__Justification__Alternatives349); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJustificationAccess().getCENTEREDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:204:6: ( ( L ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:204:6: ( ( L ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:205:1: ( L )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJustificationAccess().getLEFTEnumLiteralDeclaration_1()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:206:1: ( L )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:206:3: L
                    {
                    match(input,L,FOLLOW_L_in_rule__Justification__Alternatives369); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJustificationAccess().getLEFTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:211:6: ( ( R ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:211:6: ( ( R ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:212:1: ( R )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getJustificationAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    }
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:213:1: ( R )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:213:3: R
                    {
                    match(input,R,FOLLOW_R_in_rule__Justification__Alternatives389); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getJustificationAccess().getRIGHTEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__Justification__Alternatives"


    // $ANTLR start "rule__EscString__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:225:1: rule__EscString__Group__0 : rule__EscString__Group__0__Impl rule__EscString__Group__1 ;
    public final void rule__EscString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:229:1: ( rule__EscString__Group__0__Impl rule__EscString__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:230:2: rule__EscString__Group__0__Impl rule__EscString__Group__1
            {
            pushFollow(FOLLOW_rule__EscString__Group__0__Impl_in_rule__EscString__Group__0421);
            rule__EscString__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EscString__Group__1_in_rule__EscString__Group__0424);
            rule__EscString__Group__1();

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
    // $ANTLR end "rule__EscString__Group__0"


    // $ANTLR start "rule__EscString__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:237:1: rule__EscString__Group__0__Impl : ( () ) ;
    public final void rule__EscString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:241:1: ( ( () ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:242:1: ( () )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:242:1: ( () )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:243:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscStringAccess().getEscStringAction_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:244:1: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:246:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscStringAccess().getEscStringAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EscString__Group__0__Impl"


    // $ANTLR start "rule__EscString__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:256:1: rule__EscString__Group__1 : rule__EscString__Group__1__Impl ;
    public final void rule__EscString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:260:1: ( rule__EscString__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:261:2: rule__EscString__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EscString__Group__1__Impl_in_rule__EscString__Group__1482);
            rule__EscString__Group__1__Impl();

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
    // $ANTLR end "rule__EscString__Group__1"


    // $ANTLR start "rule__EscString__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:267:1: rule__EscString__Group__1__Impl : ( ( rule__EscString__LinesAssignment_1 )* ) ;
    public final void rule__EscString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:271:1: ( ( ( rule__EscString__LinesAssignment_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:272:1: ( ( rule__EscString__LinesAssignment_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:272:1: ( ( rule__EscString__LinesAssignment_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:273:1: ( rule__EscString__LinesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscStringAccess().getLinesAssignment_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:274:1: ( rule__EscString__LinesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=L && LA3_0<=RULE_CHAR)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:274:2: rule__EscString__LinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__EscString__LinesAssignment_1_in_rule__EscString__Group__1__Impl509);
            	    rule__EscString__LinesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscStringAccess().getLinesAssignment_1()); 
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
    // $ANTLR end "rule__EscString__Group__1__Impl"


    // $ANTLR start "rule__JustifiedText__Group_0__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:288:1: rule__JustifiedText__Group_0__0 : rule__JustifiedText__Group_0__0__Impl rule__JustifiedText__Group_0__1 ;
    public final void rule__JustifiedText__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:292:1: ( rule__JustifiedText__Group_0__0__Impl rule__JustifiedText__Group_0__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:293:2: rule__JustifiedText__Group_0__0__Impl rule__JustifiedText__Group_0__1
            {
            pushFollow(FOLLOW_rule__JustifiedText__Group_0__0__Impl_in_rule__JustifiedText__Group_0__0544);
            rule__JustifiedText__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JustifiedText__Group_0__1_in_rule__JustifiedText__Group_0__0547);
            rule__JustifiedText__Group_0__1();

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
    // $ANTLR end "rule__JustifiedText__Group_0__0"


    // $ANTLR start "rule__JustifiedText__Group_0__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:300:1: rule__JustifiedText__Group_0__0__Impl : ( ( rule__JustifiedText__TextAssignment_0_0 ) ) ;
    public final void rule__JustifiedText__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:304:1: ( ( ( rule__JustifiedText__TextAssignment_0_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:305:1: ( ( rule__JustifiedText__TextAssignment_0_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:305:1: ( ( rule__JustifiedText__TextAssignment_0_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:306:1: ( rule__JustifiedText__TextAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getTextAssignment_0_0()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:307:1: ( rule__JustifiedText__TextAssignment_0_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:307:2: rule__JustifiedText__TextAssignment_0_0
            {
            pushFollow(FOLLOW_rule__JustifiedText__TextAssignment_0_0_in_rule__JustifiedText__Group_0__0__Impl574);
            rule__JustifiedText__TextAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getTextAssignment_0_0()); 
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
    // $ANTLR end "rule__JustifiedText__Group_0__0__Impl"


    // $ANTLR start "rule__JustifiedText__Group_0__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:317:1: rule__JustifiedText__Group_0__1 : rule__JustifiedText__Group_0__1__Impl ;
    public final void rule__JustifiedText__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:321:1: ( rule__JustifiedText__Group_0__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:322:2: rule__JustifiedText__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__JustifiedText__Group_0__1__Impl_in_rule__JustifiedText__Group_0__1604);
            rule__JustifiedText__Group_0__1__Impl();

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
    // $ANTLR end "rule__JustifiedText__Group_0__1"


    // $ANTLR start "rule__JustifiedText__Group_0__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:328:1: rule__JustifiedText__Group_0__1__Impl : ( ( rule__JustifiedText__JustificationAssignment_0_1 )? ) ;
    public final void rule__JustifiedText__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:332:1: ( ( ( rule__JustifiedText__JustificationAssignment_0_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:333:1: ( ( rule__JustifiedText__JustificationAssignment_0_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:333:1: ( ( rule__JustifiedText__JustificationAssignment_0_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:334:1: ( rule__JustifiedText__JustificationAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getJustificationAssignment_0_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:335:1: ( rule__JustifiedText__JustificationAssignment_0_1 )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case N:
                    {
                    int LA4_1 = input.LA(2);

                    if ( (synpred5_InternalDotEscStringParser()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case L:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (synpred5_InternalDotEscStringParser()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case R:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (synpred5_InternalDotEscStringParser()) ) {
                        alt4=1;
                    }
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:335:2: rule__JustifiedText__JustificationAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__JustifiedText__JustificationAssignment_0_1_in_rule__JustifiedText__Group_0__1__Impl631);
                    rule__JustifiedText__JustificationAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getJustificationAssignment_0_1()); 
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
    // $ANTLR end "rule__JustifiedText__Group_0__1__Impl"


    // $ANTLR start "rule__TEXT__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:349:1: rule__TEXT__Group__0 : rule__TEXT__Group__0__Impl rule__TEXT__Group__1 ;
    public final void rule__TEXT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:353:1: ( rule__TEXT__Group__0__Impl rule__TEXT__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:354:2: rule__TEXT__Group__0__Impl rule__TEXT__Group__1
            {
            pushFollow(FOLLOW_rule__TEXT__Group__0__Impl_in_rule__TEXT__Group__0666);
            rule__TEXT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TEXT__Group__1_in_rule__TEXT__Group__0669);
            rule__TEXT__Group__1();

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
    // $ANTLR end "rule__TEXT__Group__0"


    // $ANTLR start "rule__TEXT__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:361:1: rule__TEXT__Group__0__Impl : ( RULE_CHAR ) ;
    public final void rule__TEXT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:365:1: ( ( RULE_CHAR ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:366:1: ( RULE_CHAR )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:366:1: ( RULE_CHAR )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:367:1: RULE_CHAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_0()); 
            }
            match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__TEXT__Group__0__Impl696); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__TEXT__Group__0__Impl"


    // $ANTLR start "rule__TEXT__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:378:1: rule__TEXT__Group__1 : rule__TEXT__Group__1__Impl ;
    public final void rule__TEXT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:382:1: ( rule__TEXT__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:383:2: rule__TEXT__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TEXT__Group__1__Impl_in_rule__TEXT__Group__1725);
            rule__TEXT__Group__1__Impl();

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
    // $ANTLR end "rule__TEXT__Group__1"


    // $ANTLR start "rule__TEXT__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:389:1: rule__TEXT__Group__1__Impl : ( ( RULE_CHAR )* ) ;
    public final void rule__TEXT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:393:1: ( ( ( RULE_CHAR )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:394:1: ( ( RULE_CHAR )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:394:1: ( ( RULE_CHAR )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:395:1: ( RULE_CHAR )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_1()); 
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:396:1: ( RULE_CHAR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_CHAR) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred6_InternalDotEscStringParser()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:396:3: RULE_CHAR
            	    {
            	    match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_rule__TEXT__Group__1__Impl753); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTEXTAccess().getCHARTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__TEXT__Group__1__Impl"


    // $ANTLR start "rule__EscString__LinesAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:411:1: rule__EscString__LinesAssignment_1 : ( ruleJustifiedText ) ;
    public final void rule__EscString__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:415:1: ( ( ruleJustifiedText ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:416:1: ( ruleJustifiedText )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:416:1: ( ruleJustifiedText )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:417:1: ruleJustifiedText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEscStringAccess().getLinesJustifiedTextParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJustifiedText_in_rule__EscString__LinesAssignment_1793);
            ruleJustifiedText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEscStringAccess().getLinesJustifiedTextParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EscString__LinesAssignment_1"


    // $ANTLR start "rule__JustifiedText__TextAssignment_0_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:426:1: rule__JustifiedText__TextAssignment_0_0 : ( ruleTEXT ) ;
    public final void rule__JustifiedText__TextAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:430:1: ( ( ruleTEXT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:431:1: ( ruleTEXT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:431:1: ( ruleTEXT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:432:1: ruleTEXT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getTextTEXTParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleTEXT_in_rule__JustifiedText__TextAssignment_0_0824);
            ruleTEXT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getTextTEXTParserRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__JustifiedText__TextAssignment_0_0"


    // $ANTLR start "rule__JustifiedText__JustificationAssignment_0_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:441:1: rule__JustifiedText__JustificationAssignment_0_1 : ( ruleJustification ) ;
    public final void rule__JustifiedText__JustificationAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:445:1: ( ( ruleJustification ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:446:1: ( ruleJustification )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:446:1: ( ruleJustification )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:447:1: ruleJustification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleJustification_in_rule__JustifiedText__JustificationAssignment_0_1855);
            ruleJustification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__JustifiedText__JustificationAssignment_0_1"


    // $ANTLR start "rule__JustifiedText__JustificationAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:456:1: rule__JustifiedText__JustificationAssignment_1 : ( ruleJustification ) ;
    public final void rule__JustifiedText__JustificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:460:1: ( ( ruleJustification ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:461:1: ( ruleJustification )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:461:1: ( ruleJustification )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:462:1: ruleJustification
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleJustification_in_rule__JustifiedText__JustificationAssignment_1886);
            ruleJustification();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJustifiedTextAccess().getJustificationJustificationEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__JustifiedText__JustificationAssignment_1"

    // $ANTLR start synpred5_InternalDotEscStringParser
    public final void synpred5_InternalDotEscStringParser_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:335:2: ( rule__JustifiedText__JustificationAssignment_0_1 )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:335:2: rule__JustifiedText__JustificationAssignment_0_1
        {
        pushFollow(FOLLOW_rule__JustifiedText__JustificationAssignment_0_1_in_synpred5_InternalDotEscStringParser631);
        rule__JustifiedText__JustificationAssignment_0_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalDotEscStringParser

    // $ANTLR start synpred6_InternalDotEscStringParser
    public final void synpred6_InternalDotEscStringParser_fragment() throws RecognitionException {   
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:396:3: ( RULE_CHAR )
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotEscStringParser.g:396:3: RULE_CHAR
        {
        match(input,RULE_CHAR,FOLLOW_RULE_CHAR_in_synpred6_InternalDotEscStringParser753); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalDotEscStringParser

    // Delegated rules

    public final boolean synpred6_InternalDotEscStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalDotEscStringParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalDotEscStringParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalDotEscStringParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleEscString_in_entryRuleEscString60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEscString67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscString__Group__0_in_ruleEscString97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustifiedText_in_entryRuleJustifiedText124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJustifiedText131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__Alternatives_in_ruleJustifiedText161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_entryRuleTEXT188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTEXT195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEXT__Group__0_in_ruleTEXT225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Justification__Alternatives_in_ruleJustification262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__Group_0__0_in_rule__JustifiedText__Alternatives297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__JustificationAssignment_1_in_rule__JustifiedText__Alternatives315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_rule__Justification__Alternatives349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_in_rule__Justification__Alternatives369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_R_in_rule__Justification__Alternatives389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscString__Group__0__Impl_in_rule__EscString__Group__0421 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__EscString__Group__1_in_rule__EscString__Group__0424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscString__Group__1__Impl_in_rule__EscString__Group__1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EscString__LinesAssignment_1_in_rule__EscString__Group__1__Impl509 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rule__JustifiedText__Group_0__0__Impl_in_rule__JustifiedText__Group_0__0544 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__JustifiedText__Group_0__1_in_rule__JustifiedText__Group_0__0547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__TextAssignment_0_0_in_rule__JustifiedText__Group_0__0__Impl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__Group_0__1__Impl_in_rule__JustifiedText__Group_0__1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__JustificationAssignment_0_1_in_rule__JustifiedText__Group_0__1__Impl631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEXT__Group__0__Impl_in_rule__TEXT__Group__0666 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TEXT__Group__1_in_rule__TEXT__Group__0669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__TEXT__Group__0__Impl696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEXT__Group__1__Impl_in_rule__TEXT__Group__1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_rule__TEXT__Group__1__Impl753 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleJustifiedText_in_rule__EscString__LinesAssignment_1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__JustifiedText__TextAssignment_0_0824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__JustifiedText__JustificationAssignment_0_1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJustification_in_rule__JustifiedText__JustificationAssignment_1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JustifiedText__JustificationAssignment_0_1_in_synpred5_InternalDotEscStringParser631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHAR_in_synpred6_InternalDotEscStringParser753 = new BitSet(new long[]{0x0000000000000002L});

}