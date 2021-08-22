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
import org.eclipse.gef.dot.internal.language.services.DotColorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotColorParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g"; }


     
     	private DotColorGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("NumberSign", "'#'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Solidus", "'/'");
     	}
     	
        public void setGrammarAccess(DotColorGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:66:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:67:1: ( ruleColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:68:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_ruleColor_in_entryRuleColor54);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColor61); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:75:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:79:5: ( ( ( rule__Color__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:80:1: ( ( rule__Color__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:80:1: ( ( rule__Color__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:81:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:82:1: ( rule__Color__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:82:2: rule__Color__Alternatives
            {
            pushFollow(FOLLOW_rule__Color__Alternatives_in_ruleColor91);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleRGBColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:94:1: entryRuleRGBColor : ruleRGBColor EOF ;
    public final void entryRuleRGBColor() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:95:1: ( ruleRGBColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:96:1: ruleRGBColor EOF
            {
             before(grammarAccess.getRGBColorRule()); 
            pushFollow(FOLLOW_ruleRGBColor_in_entryRuleRGBColor118);
            ruleRGBColor();

            state._fsp--;

             after(grammarAccess.getRGBColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRGBColor125); 

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
    // $ANTLR end "entryRuleRGBColor"


    // $ANTLR start "ruleRGBColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:103:1: ruleRGBColor : ( ( rule__RGBColor__Group__0 ) ) ;
    public final void ruleRGBColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:107:5: ( ( ( rule__RGBColor__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:108:1: ( ( rule__RGBColor__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:108:1: ( ( rule__RGBColor__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:109:1: ( rule__RGBColor__Group__0 )
            {
             before(grammarAccess.getRGBColorAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:110:1: ( rule__RGBColor__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:110:2: rule__RGBColor__Group__0
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__0_in_ruleRGBColor155);
            rule__RGBColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRGBColorAccess().getGroup()); 

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
    // $ANTLR end "ruleRGBColor"


    // $ANTLR start "entryRuleHSVColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:122:1: entryRuleHSVColor : ruleHSVColor EOF ;
    public final void entryRuleHSVColor() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:123:1: ( ruleHSVColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:124:1: ruleHSVColor EOF
            {
             before(grammarAccess.getHSVColorRule()); 
            pushFollow(FOLLOW_ruleHSVColor_in_entryRuleHSVColor182);
            ruleHSVColor();

            state._fsp--;

             after(grammarAccess.getHSVColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHSVColor189); 

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
    // $ANTLR end "entryRuleHSVColor"


    // $ANTLR start "ruleHSVColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:131:1: ruleHSVColor : ( ( rule__HSVColor__Group__0 ) ) ;
    public final void ruleHSVColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:135:5: ( ( ( rule__HSVColor__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:136:1: ( ( rule__HSVColor__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:136:1: ( ( rule__HSVColor__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:137:1: ( rule__HSVColor__Group__0 )
            {
             before(grammarAccess.getHSVColorAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:138:1: ( rule__HSVColor__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:138:2: rule__HSVColor__Group__0
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__0_in_ruleHSVColor219);
            rule__HSVColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHSVColorAccess().getGroup()); 

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
    // $ANTLR end "ruleHSVColor"


    // $ANTLR start "entryRuleStringColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:150:1: entryRuleStringColor : ruleStringColor EOF ;
    public final void entryRuleStringColor() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:151:1: ( ruleStringColor EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:152:1: ruleStringColor EOF
            {
             before(grammarAccess.getStringColorRule()); 
            pushFollow(FOLLOW_ruleStringColor_in_entryRuleStringColor246);
            ruleStringColor();

            state._fsp--;

             after(grammarAccess.getStringColorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringColor253); 

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
    // $ANTLR end "entryRuleStringColor"


    // $ANTLR start "ruleStringColor"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:159:1: ruleStringColor : ( ( rule__StringColor__Group__0 ) ) ;
    public final void ruleStringColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:163:5: ( ( ( rule__StringColor__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:164:1: ( ( rule__StringColor__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:164:1: ( ( rule__StringColor__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:165:1: ( rule__StringColor__Group__0 )
            {
             before(grammarAccess.getStringColorAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:166:1: ( rule__StringColor__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:166:2: rule__StringColor__Group__0
            {
            pushFollow(FOLLOW_rule__StringColor__Group__0_in_ruleStringColor283);
            rule__StringColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringColorAccess().getGroup()); 

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
    // $ANTLR end "ruleStringColor"


    // $ANTLR start "entryRulehex"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:178:1: entryRulehex : rulehex EOF ;
    public final void entryRulehex() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:179:1: ( rulehex EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:180:1: rulehex EOF
            {
             before(grammarAccess.getHexRule()); 
            pushFollow(FOLLOW_rulehex_in_entryRulehex310);
            rulehex();

            state._fsp--;

             after(grammarAccess.getHexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulehex317); 

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
    // $ANTLR end "entryRulehex"


    // $ANTLR start "rulehex"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:187:1: rulehex : ( ( rule__Hex__Group__0 ) ) ;
    public final void rulehex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:191:5: ( ( ( rule__Hex__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:192:1: ( ( rule__Hex__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:192:1: ( ( rule__Hex__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:193:1: ( rule__Hex__Group__0 )
            {
             before(grammarAccess.getHexAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:194:1: ( rule__Hex__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:194:2: rule__Hex__Group__0
            {
            pushFollow(FOLLOW_rule__Hex__Group__0_in_rulehex347);
            rule__Hex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexAccess().getGroup()); 

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
    // $ANTLR end "rulehex"


    // $ANTLR start "rule__Color__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:206:1: rule__Color__Alternatives : ( ( ruleRGBColor ) | ( ruleHSVColor ) | ( ruleStringColor ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:210:1: ( ( ruleRGBColor ) | ( ruleHSVColor ) | ( ruleStringColor ) )
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

                if ( (LA1_2==Comma||LA1_2==RULE_COLOR_NUMBER) ) {
                    alt1=2;
                }
                else if ( (LA1_2==EOF) ) {
                    alt1=3;
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:211:1: ( ruleRGBColor )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:211:1: ( ruleRGBColor )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:212:1: ruleRGBColor
                    {
                     before(grammarAccess.getColorAccess().getRGBColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRGBColor_in_rule__Color__Alternatives383);
                    ruleRGBColor();

                    state._fsp--;

                     after(grammarAccess.getColorAccess().getRGBColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:217:6: ( ruleHSVColor )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:217:6: ( ruleHSVColor )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:218:1: ruleHSVColor
                    {
                     before(grammarAccess.getColorAccess().getHSVColorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHSVColor_in_rule__Color__Alternatives400);
                    ruleHSVColor();

                    state._fsp--;

                     after(grammarAccess.getColorAccess().getHSVColorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:223:6: ( ruleStringColor )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:223:6: ( ruleStringColor )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:224:1: ruleStringColor
                    {
                     before(grammarAccess.getColorAccess().getStringColorParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringColor_in_rule__Color__Alternatives417);
                    ruleStringColor();

                    state._fsp--;

                     after(grammarAccess.getColorAccess().getStringColorParserRuleCall_2()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__StringColor__NameAlternatives_1_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:234:1: rule__StringColor__NameAlternatives_1_0 : ( ( RULE_HEXADECIMAL_DIGIT ) | ( RULE_COLOR_STRING ) | ( RULE_COLOR_NUMBER ) );
    public final void rule__StringColor__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:238:1: ( ( RULE_HEXADECIMAL_DIGIT ) | ( RULE_COLOR_STRING ) | ( RULE_COLOR_NUMBER ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_HEXADECIMAL_DIGIT:
                {
                alt2=1;
                }
                break;
            case RULE_COLOR_STRING:
                {
                alt2=2;
                }
                break;
            case RULE_COLOR_NUMBER:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:239:1: ( RULE_HEXADECIMAL_DIGIT )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:239:1: ( RULE_HEXADECIMAL_DIGIT )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:240:1: RULE_HEXADECIMAL_DIGIT
                    {
                     before(grammarAccess.getStringColorAccess().getNameHEXADECIMAL_DIGITTerminalRuleCall_1_0_0()); 
                    match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__StringColor__NameAlternatives_1_0449); 
                     after(grammarAccess.getStringColorAccess().getNameHEXADECIMAL_DIGITTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:245:6: ( RULE_COLOR_STRING )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:245:6: ( RULE_COLOR_STRING )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:246:1: RULE_COLOR_STRING
                    {
                     before(grammarAccess.getStringColorAccess().getNameCOLOR_STRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_COLOR_STRING,FOLLOW_RULE_COLOR_STRING_in_rule__StringColor__NameAlternatives_1_0466); 
                     after(grammarAccess.getStringColorAccess().getNameCOLOR_STRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:251:6: ( RULE_COLOR_NUMBER )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:251:6: ( RULE_COLOR_NUMBER )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:252:1: RULE_COLOR_NUMBER
                    {
                     before(grammarAccess.getStringColorAccess().getNameCOLOR_NUMBERTerminalRuleCall_1_0_2()); 
                    match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_rule__StringColor__NameAlternatives_1_0483); 
                     after(grammarAccess.getStringColorAccess().getNameCOLOR_NUMBERTerminalRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__StringColor__NameAlternatives_1_0"


    // $ANTLR start "rule__RGBColor__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:264:1: rule__RGBColor__Group__0 : rule__RGBColor__Group__0__Impl rule__RGBColor__Group__1 ;
    public final void rule__RGBColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:268:1: ( rule__RGBColor__Group__0__Impl rule__RGBColor__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:269:2: rule__RGBColor__Group__0__Impl rule__RGBColor__Group__1
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__0__Impl_in_rule__RGBColor__Group__0513);
            rule__RGBColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBColor__Group__1_in_rule__RGBColor__Group__0516);
            rule__RGBColor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__RGBColor__Group__0"


    // $ANTLR start "rule__RGBColor__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:276:1: rule__RGBColor__Group__0__Impl : ( NumberSign ) ;
    public final void rule__RGBColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:280:1: ( ( NumberSign ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:281:1: ( NumberSign )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:281:1: ( NumberSign )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:282:1: NumberSign
            {
             before(grammarAccess.getRGBColorAccess().getNumberSignKeyword_0()); 
            match(input,NumberSign,FOLLOW_NumberSign_in_rule__RGBColor__Group__0__Impl544); 
             after(grammarAccess.getRGBColorAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__RGBColor__Group__0__Impl"


    // $ANTLR start "rule__RGBColor__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:295:1: rule__RGBColor__Group__1 : rule__RGBColor__Group__1__Impl rule__RGBColor__Group__2 ;
    public final void rule__RGBColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:299:1: ( rule__RGBColor__Group__1__Impl rule__RGBColor__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:300:2: rule__RGBColor__Group__1__Impl rule__RGBColor__Group__2
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__1__Impl_in_rule__RGBColor__Group__1575);
            rule__RGBColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBColor__Group__2_in_rule__RGBColor__Group__1578);
            rule__RGBColor__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__RGBColor__Group__1"


    // $ANTLR start "rule__RGBColor__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:307:1: rule__RGBColor__Group__1__Impl : ( ( rule__RGBColor__RAssignment_1 ) ) ;
    public final void rule__RGBColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:311:1: ( ( ( rule__RGBColor__RAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:312:1: ( ( rule__RGBColor__RAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:312:1: ( ( rule__RGBColor__RAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:313:1: ( rule__RGBColor__RAssignment_1 )
            {
             before(grammarAccess.getRGBColorAccess().getRAssignment_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:314:1: ( rule__RGBColor__RAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:314:2: rule__RGBColor__RAssignment_1
            {
            pushFollow(FOLLOW_rule__RGBColor__RAssignment_1_in_rule__RGBColor__Group__1__Impl605);
            rule__RGBColor__RAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRGBColorAccess().getRAssignment_1()); 

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
    // $ANTLR end "rule__RGBColor__Group__1__Impl"


    // $ANTLR start "rule__RGBColor__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:324:1: rule__RGBColor__Group__2 : rule__RGBColor__Group__2__Impl rule__RGBColor__Group__3 ;
    public final void rule__RGBColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:328:1: ( rule__RGBColor__Group__2__Impl rule__RGBColor__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:329:2: rule__RGBColor__Group__2__Impl rule__RGBColor__Group__3
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__2__Impl_in_rule__RGBColor__Group__2635);
            rule__RGBColor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBColor__Group__3_in_rule__RGBColor__Group__2638);
            rule__RGBColor__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__RGBColor__Group__2"


    // $ANTLR start "rule__RGBColor__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:336:1: rule__RGBColor__Group__2__Impl : ( ( rule__RGBColor__GAssignment_2 ) ) ;
    public final void rule__RGBColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:340:1: ( ( ( rule__RGBColor__GAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:341:1: ( ( rule__RGBColor__GAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:341:1: ( ( rule__RGBColor__GAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:342:1: ( rule__RGBColor__GAssignment_2 )
            {
             before(grammarAccess.getRGBColorAccess().getGAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:343:1: ( rule__RGBColor__GAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:343:2: rule__RGBColor__GAssignment_2
            {
            pushFollow(FOLLOW_rule__RGBColor__GAssignment_2_in_rule__RGBColor__Group__2__Impl665);
            rule__RGBColor__GAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRGBColorAccess().getGAssignment_2()); 

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
    // $ANTLR end "rule__RGBColor__Group__2__Impl"


    // $ANTLR start "rule__RGBColor__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:353:1: rule__RGBColor__Group__3 : rule__RGBColor__Group__3__Impl rule__RGBColor__Group__4 ;
    public final void rule__RGBColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:357:1: ( rule__RGBColor__Group__3__Impl rule__RGBColor__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:358:2: rule__RGBColor__Group__3__Impl rule__RGBColor__Group__4
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__3__Impl_in_rule__RGBColor__Group__3695);
            rule__RGBColor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RGBColor__Group__4_in_rule__RGBColor__Group__3698);
            rule__RGBColor__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__RGBColor__Group__3"


    // $ANTLR start "rule__RGBColor__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:365:1: rule__RGBColor__Group__3__Impl : ( ( rule__RGBColor__BAssignment_3 ) ) ;
    public final void rule__RGBColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:369:1: ( ( ( rule__RGBColor__BAssignment_3 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:370:1: ( ( rule__RGBColor__BAssignment_3 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:370:1: ( ( rule__RGBColor__BAssignment_3 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:371:1: ( rule__RGBColor__BAssignment_3 )
            {
             before(grammarAccess.getRGBColorAccess().getBAssignment_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:372:1: ( rule__RGBColor__BAssignment_3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:372:2: rule__RGBColor__BAssignment_3
            {
            pushFollow(FOLLOW_rule__RGBColor__BAssignment_3_in_rule__RGBColor__Group__3__Impl725);
            rule__RGBColor__BAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRGBColorAccess().getBAssignment_3()); 

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
    // $ANTLR end "rule__RGBColor__Group__3__Impl"


    // $ANTLR start "rule__RGBColor__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:382:1: rule__RGBColor__Group__4 : rule__RGBColor__Group__4__Impl ;
    public final void rule__RGBColor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:386:1: ( rule__RGBColor__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:387:2: rule__RGBColor__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RGBColor__Group__4__Impl_in_rule__RGBColor__Group__4755);
            rule__RGBColor__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RGBColor__Group__4"


    // $ANTLR start "rule__RGBColor__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:393:1: rule__RGBColor__Group__4__Impl : ( ( rule__RGBColor__AAssignment_4 )? ) ;
    public final void rule__RGBColor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:397:1: ( ( ( rule__RGBColor__AAssignment_4 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:398:1: ( ( rule__RGBColor__AAssignment_4 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:398:1: ( ( rule__RGBColor__AAssignment_4 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:399:1: ( rule__RGBColor__AAssignment_4 )?
            {
             before(grammarAccess.getRGBColorAccess().getAAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:400:1: ( rule__RGBColor__AAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_HEXADECIMAL_DIGIT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:400:2: rule__RGBColor__AAssignment_4
                    {
                    pushFollow(FOLLOW_rule__RGBColor__AAssignment_4_in_rule__RGBColor__Group__4__Impl782);
                    rule__RGBColor__AAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRGBColorAccess().getAAssignment_4()); 

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
    // $ANTLR end "rule__RGBColor__Group__4__Impl"


    // $ANTLR start "rule__HSVColor__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:420:1: rule__HSVColor__Group__0 : rule__HSVColor__Group__0__Impl rule__HSVColor__Group__1 ;
    public final void rule__HSVColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:424:1: ( rule__HSVColor__Group__0__Impl rule__HSVColor__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:425:2: rule__HSVColor__Group__0__Impl rule__HSVColor__Group__1
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__0__Impl_in_rule__HSVColor__Group__0823);
            rule__HSVColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HSVColor__Group__1_in_rule__HSVColor__Group__0826);
            rule__HSVColor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__HSVColor__Group__0"


    // $ANTLR start "rule__HSVColor__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:432:1: rule__HSVColor__Group__0__Impl : ( ( rule__HSVColor__HAssignment_0 ) ) ;
    public final void rule__HSVColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:436:1: ( ( ( rule__HSVColor__HAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:437:1: ( ( rule__HSVColor__HAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:437:1: ( ( rule__HSVColor__HAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:438:1: ( rule__HSVColor__HAssignment_0 )
            {
             before(grammarAccess.getHSVColorAccess().getHAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:439:1: ( rule__HSVColor__HAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:439:2: rule__HSVColor__HAssignment_0
            {
            pushFollow(FOLLOW_rule__HSVColor__HAssignment_0_in_rule__HSVColor__Group__0__Impl853);
            rule__HSVColor__HAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHSVColorAccess().getHAssignment_0()); 

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
    // $ANTLR end "rule__HSVColor__Group__0__Impl"


    // $ANTLR start "rule__HSVColor__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:449:1: rule__HSVColor__Group__1 : rule__HSVColor__Group__1__Impl rule__HSVColor__Group__2 ;
    public final void rule__HSVColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:453:1: ( rule__HSVColor__Group__1__Impl rule__HSVColor__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:454:2: rule__HSVColor__Group__1__Impl rule__HSVColor__Group__2
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__1__Impl_in_rule__HSVColor__Group__1883);
            rule__HSVColor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HSVColor__Group__2_in_rule__HSVColor__Group__1886);
            rule__HSVColor__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__HSVColor__Group__1"


    // $ANTLR start "rule__HSVColor__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:461:1: rule__HSVColor__Group__1__Impl : ( ( Comma )? ) ;
    public final void rule__HSVColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:465:1: ( ( ( Comma )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:466:1: ( ( Comma )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:466:1: ( ( Comma )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:467:1: ( Comma )?
            {
             before(grammarAccess.getHSVColorAccess().getCommaKeyword_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:468:1: ( Comma )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Comma) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:469:2: Comma
                    {
                    match(input,Comma,FOLLOW_Comma_in_rule__HSVColor__Group__1__Impl915); 

                    }
                    break;

            }

             after(grammarAccess.getHSVColorAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__HSVColor__Group__1__Impl"


    // $ANTLR start "rule__HSVColor__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:480:1: rule__HSVColor__Group__2 : rule__HSVColor__Group__2__Impl rule__HSVColor__Group__3 ;
    public final void rule__HSVColor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:484:1: ( rule__HSVColor__Group__2__Impl rule__HSVColor__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:485:2: rule__HSVColor__Group__2__Impl rule__HSVColor__Group__3
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__2__Impl_in_rule__HSVColor__Group__2948);
            rule__HSVColor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HSVColor__Group__3_in_rule__HSVColor__Group__2951);
            rule__HSVColor__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__HSVColor__Group__2"


    // $ANTLR start "rule__HSVColor__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:492:1: rule__HSVColor__Group__2__Impl : ( ( rule__HSVColor__SAssignment_2 ) ) ;
    public final void rule__HSVColor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:496:1: ( ( ( rule__HSVColor__SAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:497:1: ( ( rule__HSVColor__SAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:497:1: ( ( rule__HSVColor__SAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:498:1: ( rule__HSVColor__SAssignment_2 )
            {
             before(grammarAccess.getHSVColorAccess().getSAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:499:1: ( rule__HSVColor__SAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:499:2: rule__HSVColor__SAssignment_2
            {
            pushFollow(FOLLOW_rule__HSVColor__SAssignment_2_in_rule__HSVColor__Group__2__Impl978);
            rule__HSVColor__SAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHSVColorAccess().getSAssignment_2()); 

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
    // $ANTLR end "rule__HSVColor__Group__2__Impl"


    // $ANTLR start "rule__HSVColor__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:509:1: rule__HSVColor__Group__3 : rule__HSVColor__Group__3__Impl rule__HSVColor__Group__4 ;
    public final void rule__HSVColor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:513:1: ( rule__HSVColor__Group__3__Impl rule__HSVColor__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:514:2: rule__HSVColor__Group__3__Impl rule__HSVColor__Group__4
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__3__Impl_in_rule__HSVColor__Group__31008);
            rule__HSVColor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HSVColor__Group__4_in_rule__HSVColor__Group__31011);
            rule__HSVColor__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__HSVColor__Group__3"


    // $ANTLR start "rule__HSVColor__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:521:1: rule__HSVColor__Group__3__Impl : ( ( Comma )? ) ;
    public final void rule__HSVColor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:525:1: ( ( ( Comma )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:526:1: ( ( Comma )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:526:1: ( ( Comma )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:527:1: ( Comma )?
            {
             before(grammarAccess.getHSVColorAccess().getCommaKeyword_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:528:1: ( Comma )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Comma) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:529:2: Comma
                    {
                    match(input,Comma,FOLLOW_Comma_in_rule__HSVColor__Group__3__Impl1040); 

                    }
                    break;

            }

             after(grammarAccess.getHSVColorAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__HSVColor__Group__3__Impl"


    // $ANTLR start "rule__HSVColor__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:540:1: rule__HSVColor__Group__4 : rule__HSVColor__Group__4__Impl ;
    public final void rule__HSVColor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:544:1: ( rule__HSVColor__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:545:2: rule__HSVColor__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HSVColor__Group__4__Impl_in_rule__HSVColor__Group__41073);
            rule__HSVColor__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HSVColor__Group__4"


    // $ANTLR start "rule__HSVColor__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:551:1: rule__HSVColor__Group__4__Impl : ( ( rule__HSVColor__VAssignment_4 ) ) ;
    public final void rule__HSVColor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:555:1: ( ( ( rule__HSVColor__VAssignment_4 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:556:1: ( ( rule__HSVColor__VAssignment_4 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:556:1: ( ( rule__HSVColor__VAssignment_4 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:557:1: ( rule__HSVColor__VAssignment_4 )
            {
             before(grammarAccess.getHSVColorAccess().getVAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:558:1: ( rule__HSVColor__VAssignment_4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:558:2: rule__HSVColor__VAssignment_4
            {
            pushFollow(FOLLOW_rule__HSVColor__VAssignment_4_in_rule__HSVColor__Group__4__Impl1100);
            rule__HSVColor__VAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHSVColorAccess().getVAssignment_4()); 

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
    // $ANTLR end "rule__HSVColor__Group__4__Impl"


    // $ANTLR start "rule__StringColor__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:578:1: rule__StringColor__Group__0 : rule__StringColor__Group__0__Impl rule__StringColor__Group__1 ;
    public final void rule__StringColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:582:1: ( rule__StringColor__Group__0__Impl rule__StringColor__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:583:2: rule__StringColor__Group__0__Impl rule__StringColor__Group__1
            {
            pushFollow(FOLLOW_rule__StringColor__Group__0__Impl_in_rule__StringColor__Group__01140);
            rule__StringColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringColor__Group__1_in_rule__StringColor__Group__01143);
            rule__StringColor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__StringColor__Group__0"


    // $ANTLR start "rule__StringColor__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:590:1: rule__StringColor__Group__0__Impl : ( ( rule__StringColor__Group_0__0 )? ) ;
    public final void rule__StringColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:594:1: ( ( ( rule__StringColor__Group_0__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:595:1: ( ( rule__StringColor__Group_0__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:595:1: ( ( rule__StringColor__Group_0__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:596:1: ( rule__StringColor__Group_0__0 )?
            {
             before(grammarAccess.getStringColorAccess().getGroup_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:597:1: ( rule__StringColor__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Solidus) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:597:2: rule__StringColor__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StringColor__Group_0__0_in_rule__StringColor__Group__0__Impl1170);
                    rule__StringColor__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringColorAccess().getGroup_0()); 

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
    // $ANTLR end "rule__StringColor__Group__0__Impl"


    // $ANTLR start "rule__StringColor__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:607:1: rule__StringColor__Group__1 : rule__StringColor__Group__1__Impl ;
    public final void rule__StringColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:611:1: ( rule__StringColor__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:612:2: rule__StringColor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringColor__Group__1__Impl_in_rule__StringColor__Group__11201);
            rule__StringColor__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StringColor__Group__1"


    // $ANTLR start "rule__StringColor__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:618:1: rule__StringColor__Group__1__Impl : ( ( rule__StringColor__NameAssignment_1 ) ) ;
    public final void rule__StringColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:622:1: ( ( ( rule__StringColor__NameAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:623:1: ( ( rule__StringColor__NameAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:623:1: ( ( rule__StringColor__NameAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:624:1: ( rule__StringColor__NameAssignment_1 )
            {
             before(grammarAccess.getStringColorAccess().getNameAssignment_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:625:1: ( rule__StringColor__NameAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:625:2: rule__StringColor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringColor__NameAssignment_1_in_rule__StringColor__Group__1__Impl1228);
            rule__StringColor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringColorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StringColor__Group__1__Impl"


    // $ANTLR start "rule__StringColor__Group_0__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:639:1: rule__StringColor__Group_0__0 : rule__StringColor__Group_0__0__Impl rule__StringColor__Group_0__1 ;
    public final void rule__StringColor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:643:1: ( rule__StringColor__Group_0__0__Impl rule__StringColor__Group_0__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:644:2: rule__StringColor__Group_0__0__Impl rule__StringColor__Group_0__1
            {
            pushFollow(FOLLOW_rule__StringColor__Group_0__0__Impl_in_rule__StringColor__Group_0__01262);
            rule__StringColor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringColor__Group_0__1_in_rule__StringColor__Group_0__01265);
            rule__StringColor__Group_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__StringColor__Group_0__0"


    // $ANTLR start "rule__StringColor__Group_0__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:651:1: rule__StringColor__Group_0__0__Impl : ( Solidus ) ;
    public final void rule__StringColor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:655:1: ( ( Solidus ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:656:1: ( Solidus )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:656:1: ( Solidus )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:657:1: Solidus
            {
             before(grammarAccess.getStringColorAccess().getSolidusKeyword_0_0()); 
            match(input,Solidus,FOLLOW_Solidus_in_rule__StringColor__Group_0__0__Impl1293); 
             after(grammarAccess.getStringColorAccess().getSolidusKeyword_0_0()); 

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
    // $ANTLR end "rule__StringColor__Group_0__0__Impl"


    // $ANTLR start "rule__StringColor__Group_0__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:670:1: rule__StringColor__Group_0__1 : rule__StringColor__Group_0__1__Impl rule__StringColor__Group_0__2 ;
    public final void rule__StringColor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:674:1: ( rule__StringColor__Group_0__1__Impl rule__StringColor__Group_0__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:675:2: rule__StringColor__Group_0__1__Impl rule__StringColor__Group_0__2
            {
            pushFollow(FOLLOW_rule__StringColor__Group_0__1__Impl_in_rule__StringColor__Group_0__11324);
            rule__StringColor__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringColor__Group_0__2_in_rule__StringColor__Group_0__11327);
            rule__StringColor__Group_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__StringColor__Group_0__1"


    // $ANTLR start "rule__StringColor__Group_0__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:682:1: rule__StringColor__Group_0__1__Impl : ( ( rule__StringColor__SchemeAssignment_0_1 )? ) ;
    public final void rule__StringColor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:686:1: ( ( ( rule__StringColor__SchemeAssignment_0_1 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:687:1: ( ( rule__StringColor__SchemeAssignment_0_1 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:687:1: ( ( rule__StringColor__SchemeAssignment_0_1 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:688:1: ( rule__StringColor__SchemeAssignment_0_1 )?
            {
             before(grammarAccess.getStringColorAccess().getSchemeAssignment_0_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:689:1: ( rule__StringColor__SchemeAssignment_0_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_COLOR_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:689:2: rule__StringColor__SchemeAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__StringColor__SchemeAssignment_0_1_in_rule__StringColor__Group_0__1__Impl1354);
                    rule__StringColor__SchemeAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringColorAccess().getSchemeAssignment_0_1()); 

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
    // $ANTLR end "rule__StringColor__Group_0__1__Impl"


    // $ANTLR start "rule__StringColor__Group_0__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:699:1: rule__StringColor__Group_0__2 : rule__StringColor__Group_0__2__Impl ;
    public final void rule__StringColor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:703:1: ( rule__StringColor__Group_0__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:704:2: rule__StringColor__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__StringColor__Group_0__2__Impl_in_rule__StringColor__Group_0__21385);
            rule__StringColor__Group_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StringColor__Group_0__2"


    // $ANTLR start "rule__StringColor__Group_0__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:710:1: rule__StringColor__Group_0__2__Impl : ( Solidus ) ;
    public final void rule__StringColor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:714:1: ( ( Solidus ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:715:1: ( Solidus )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:715:1: ( Solidus )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:716:1: Solidus
            {
             before(grammarAccess.getStringColorAccess().getSolidusKeyword_0_2()); 
            match(input,Solidus,FOLLOW_Solidus_in_rule__StringColor__Group_0__2__Impl1413); 
             after(grammarAccess.getStringColorAccess().getSolidusKeyword_0_2()); 

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
    // $ANTLR end "rule__StringColor__Group_0__2__Impl"


    // $ANTLR start "rule__Hex__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:735:1: rule__Hex__Group__0 : rule__Hex__Group__0__Impl rule__Hex__Group__1 ;
    public final void rule__Hex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:739:1: ( rule__Hex__Group__0__Impl rule__Hex__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:740:2: rule__Hex__Group__0__Impl rule__Hex__Group__1
            {
            pushFollow(FOLLOW_rule__Hex__Group__0__Impl_in_rule__Hex__Group__01450);
            rule__Hex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hex__Group__1_in_rule__Hex__Group__01453);
            rule__Hex__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Hex__Group__0"


    // $ANTLR start "rule__Hex__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:747:1: rule__Hex__Group__0__Impl : ( RULE_HEXADECIMAL_DIGIT ) ;
    public final void rule__Hex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:751:1: ( ( RULE_HEXADECIMAL_DIGIT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:752:1: ( RULE_HEXADECIMAL_DIGIT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:752:1: ( RULE_HEXADECIMAL_DIGIT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:753:1: RULE_HEXADECIMAL_DIGIT
            {
             before(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_0()); 
            match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__Hex__Group__0__Impl1480); 
             after(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Hex__Group__0__Impl"


    // $ANTLR start "rule__Hex__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:764:1: rule__Hex__Group__1 : rule__Hex__Group__1__Impl ;
    public final void rule__Hex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:768:1: ( rule__Hex__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:769:2: rule__Hex__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Hex__Group__1__Impl_in_rule__Hex__Group__11509);
            rule__Hex__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Hex__Group__1"


    // $ANTLR start "rule__Hex__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:775:1: rule__Hex__Group__1__Impl : ( RULE_HEXADECIMAL_DIGIT ) ;
    public final void rule__Hex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:779:1: ( ( RULE_HEXADECIMAL_DIGIT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:780:1: ( RULE_HEXADECIMAL_DIGIT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:780:1: ( RULE_HEXADECIMAL_DIGIT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:781:1: RULE_HEXADECIMAL_DIGIT
            {
             before(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_1()); 
            match(input,RULE_HEXADECIMAL_DIGIT,FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__Hex__Group__1__Impl1536); 
             after(grammarAccess.getHexAccess().getHEXADECIMAL_DIGITTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Hex__Group__1__Impl"


    // $ANTLR start "rule__RGBColor__RAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:797:1: rule__RGBColor__RAssignment_1 : ( rulehex ) ;
    public final void rule__RGBColor__RAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:801:1: ( ( rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:802:1: ( rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:802:1: ( rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:803:1: rulehex
            {
             before(grammarAccess.getRGBColorAccess().getRHexParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulehex_in_rule__RGBColor__RAssignment_11574);
            rulehex();

            state._fsp--;

             after(grammarAccess.getRGBColorAccess().getRHexParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RGBColor__RAssignment_1"


    // $ANTLR start "rule__RGBColor__GAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:812:1: rule__RGBColor__GAssignment_2 : ( rulehex ) ;
    public final void rule__RGBColor__GAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:816:1: ( ( rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:817:1: ( rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:817:1: ( rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:818:1: rulehex
            {
             before(grammarAccess.getRGBColorAccess().getGHexParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulehex_in_rule__RGBColor__GAssignment_21605);
            rulehex();

            state._fsp--;

             after(grammarAccess.getRGBColorAccess().getGHexParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RGBColor__GAssignment_2"


    // $ANTLR start "rule__RGBColor__BAssignment_3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:827:1: rule__RGBColor__BAssignment_3 : ( rulehex ) ;
    public final void rule__RGBColor__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:831:1: ( ( rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:832:1: ( rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:832:1: ( rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:833:1: rulehex
            {
             before(grammarAccess.getRGBColorAccess().getBHexParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulehex_in_rule__RGBColor__BAssignment_31636);
            rulehex();

            state._fsp--;

             after(grammarAccess.getRGBColorAccess().getBHexParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RGBColor__BAssignment_3"


    // $ANTLR start "rule__RGBColor__AAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:842:1: rule__RGBColor__AAssignment_4 : ( rulehex ) ;
    public final void rule__RGBColor__AAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:846:1: ( ( rulehex ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:847:1: ( rulehex )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:847:1: ( rulehex )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:848:1: rulehex
            {
             before(grammarAccess.getRGBColorAccess().getAHexParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulehex_in_rule__RGBColor__AAssignment_41667);
            rulehex();

            state._fsp--;

             after(grammarAccess.getRGBColorAccess().getAHexParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RGBColor__AAssignment_4"


    // $ANTLR start "rule__HSVColor__HAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:857:1: rule__HSVColor__HAssignment_0 : ( RULE_COLOR_NUMBER ) ;
    public final void rule__HSVColor__HAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:861:1: ( ( RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:862:1: ( RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:862:1: ( RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:863:1: RULE_COLOR_NUMBER
            {
             before(grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__HAssignment_01698); 
             after(grammarAccess.getHSVColorAccess().getHCOLOR_NUMBERTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__HSVColor__HAssignment_0"


    // $ANTLR start "rule__HSVColor__SAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:872:1: rule__HSVColor__SAssignment_2 : ( RULE_COLOR_NUMBER ) ;
    public final void rule__HSVColor__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:876:1: ( ( RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:877:1: ( RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:877:1: ( RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:878:1: RULE_COLOR_NUMBER
            {
             before(grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__SAssignment_21729); 
             after(grammarAccess.getHSVColorAccess().getSCOLOR_NUMBERTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HSVColor__SAssignment_2"


    // $ANTLR start "rule__HSVColor__VAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:887:1: rule__HSVColor__VAssignment_4 : ( RULE_COLOR_NUMBER ) ;
    public final void rule__HSVColor__VAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:891:1: ( ( RULE_COLOR_NUMBER ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:892:1: ( RULE_COLOR_NUMBER )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:892:1: ( RULE_COLOR_NUMBER )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:893:1: RULE_COLOR_NUMBER
            {
             before(grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0()); 
            match(input,RULE_COLOR_NUMBER,FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__VAssignment_41760); 
             after(grammarAccess.getHSVColorAccess().getVCOLOR_NUMBERTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__HSVColor__VAssignment_4"


    // $ANTLR start "rule__StringColor__SchemeAssignment_0_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:902:1: rule__StringColor__SchemeAssignment_0_1 : ( RULE_COLOR_STRING ) ;
    public final void rule__StringColor__SchemeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:906:1: ( ( RULE_COLOR_STRING ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:907:1: ( RULE_COLOR_STRING )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:907:1: ( RULE_COLOR_STRING )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:908:1: RULE_COLOR_STRING
            {
             before(grammarAccess.getStringColorAccess().getSchemeCOLOR_STRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_COLOR_STRING,FOLLOW_RULE_COLOR_STRING_in_rule__StringColor__SchemeAssignment_0_11791); 
             after(grammarAccess.getStringColorAccess().getSchemeCOLOR_STRINGTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__StringColor__SchemeAssignment_0_1"


    // $ANTLR start "rule__StringColor__NameAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:917:1: rule__StringColor__NameAssignment_1 : ( ( rule__StringColor__NameAlternatives_1_0 ) ) ;
    public final void rule__StringColor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:921:1: ( ( ( rule__StringColor__NameAlternatives_1_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:922:1: ( ( rule__StringColor__NameAlternatives_1_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:922:1: ( ( rule__StringColor__NameAlternatives_1_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:923:1: ( rule__StringColor__NameAlternatives_1_0 )
            {
             before(grammarAccess.getStringColorAccess().getNameAlternatives_1_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:924:1: ( rule__StringColor__NameAlternatives_1_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotColorParser.g:924:2: rule__StringColor__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__StringColor__NameAlternatives_1_0_in_rule__StringColor__NameAssignment_11822);
            rule__StringColor__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringColorAccess().getNameAlternatives_1_0()); 

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
    // $ANTLR end "rule__StringColor__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleColor_in_entryRuleColor54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColor61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBColor_in_entryRuleRGBColor118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRGBColor125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__0_in_ruleRGBColor155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHSVColor_in_entryRuleHSVColor182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHSVColor189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__0_in_ruleHSVColor219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringColor_in_entryRuleStringColor246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringColor253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group__0_in_ruleStringColor283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_entryRulehex310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehex317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hex__Group__0_in_rulehex347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRGBColor_in_rule__Color__Alternatives383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHSVColor_in_rule__Color__Alternatives400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringColor_in_rule__Color__Alternatives417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__StringColor__NameAlternatives_1_0449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_STRING_in_rule__StringColor__NameAlternatives_1_0466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_rule__StringColor__NameAlternatives_1_0483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__0__Impl_in_rule__RGBColor__Group__0513 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__1_in_rule__RGBColor__Group__0516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_rule__RGBColor__Group__0__Impl544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__1__Impl_in_rule__RGBColor__Group__1575 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__2_in_rule__RGBColor__Group__1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__RAssignment_1_in_rule__RGBColor__Group__1__Impl605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__2__Impl_in_rule__RGBColor__Group__2635 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__3_in_rule__RGBColor__Group__2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__GAssignment_2_in_rule__RGBColor__Group__2__Impl665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__3__Impl_in_rule__RGBColor__Group__3695 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__4_in_rule__RGBColor__Group__3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__BAssignment_3_in_rule__RGBColor__Group__3__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__Group__4__Impl_in_rule__RGBColor__Group__4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RGBColor__AAssignment_4_in_rule__RGBColor__Group__4__Impl782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__0__Impl_in_rule__HSVColor__Group__0823 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__1_in_rule__HSVColor__Group__0826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__HAssignment_0_in_rule__HSVColor__Group__0__Impl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__1__Impl_in_rule__HSVColor__Group__1883 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__2_in_rule__HSVColor__Group__1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__HSVColor__Group__1__Impl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__2__Impl_in_rule__HSVColor__Group__2948 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__3_in_rule__HSVColor__Group__2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__SAssignment_2_in_rule__HSVColor__Group__2__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__3__Impl_in_rule__HSVColor__Group__31008 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__4_in_rule__HSVColor__Group__31011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__HSVColor__Group__3__Impl1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__Group__4__Impl_in_rule__HSVColor__Group__41073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HSVColor__VAssignment_4_in_rule__HSVColor__Group__4__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group__0__Impl_in_rule__StringColor__Group__01140 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_rule__StringColor__Group__1_in_rule__StringColor__Group__01143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__0_in_rule__StringColor__Group__0__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group__1__Impl_in_rule__StringColor__Group__11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__NameAssignment_1_in_rule__StringColor__Group__1__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__0__Impl_in_rule__StringColor__Group_0__01262 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__1_in_rule__StringColor__Group_0__01265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Solidus_in_rule__StringColor__Group_0__0__Impl1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__1__Impl_in_rule__StringColor__Group_0__11324 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__2_in_rule__StringColor__Group_0__11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__SchemeAssignment_0_1_in_rule__StringColor__Group_0__1__Impl1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__Group_0__2__Impl_in_rule__StringColor__Group_0__21385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Solidus_in_rule__StringColor__Group_0__2__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hex__Group__0__Impl_in_rule__Hex__Group__01450 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Hex__Group__1_in_rule__Hex__Group__01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__Hex__Group__0__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hex__Group__1__Impl_in_rule__Hex__Group__11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXADECIMAL_DIGIT_in_rule__Hex__Group__1__Impl1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_rule__RGBColor__RAssignment_11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_rule__RGBColor__GAssignment_21605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_rule__RGBColor__BAssignment_31636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehex_in_rule__RGBColor__AAssignment_41667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__HAssignment_01698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__SAssignment_21729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_NUMBER_in_rule__HSVColor__VAssignment_41760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLOR_STRING_in_rule__StringColor__SchemeAssignment_0_11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringColor__NameAlternatives_1_0_in_rule__StringColor__NameAssignment_11822 = new BitSet(new long[]{0x0000000000000002L});

}