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
import org.eclipse.gef.dot.internal.language.services.DotHtmlLabelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotHtmlLabelParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g"; }


     
     	private DotHtmlLabelGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
     	}
     	
        public void setGrammarAccess(DotHtmlLabelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleHtmlLabel"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:63:1: entryRuleHtmlLabel : ruleHtmlLabel EOF ;
    public final void entryRuleHtmlLabel() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:64:1: ( ruleHtmlLabel EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:65:1: ruleHtmlLabel EOF
            {
             before(grammarAccess.getHtmlLabelRule()); 
            pushFollow(FOLLOW_ruleHtmlLabel_in_entryRuleHtmlLabel54);
            ruleHtmlLabel();

            state._fsp--;

             after(grammarAccess.getHtmlLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlLabel61); 

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
    // $ANTLR end "entryRuleHtmlLabel"


    // $ANTLR start "ruleHtmlLabel"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:72:1: ruleHtmlLabel : ( ( rule__HtmlLabel__PartsAssignment )* ) ;
    public final void ruleHtmlLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:76:5: ( ( ( rule__HtmlLabel__PartsAssignment )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:77:1: ( ( rule__HtmlLabel__PartsAssignment )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:77:1: ( ( rule__HtmlLabel__PartsAssignment )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:78:1: ( rule__HtmlLabel__PartsAssignment )*
            {
             before(grammarAccess.getHtmlLabelAccess().getPartsAssignment()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:79:1: ( rule__HtmlLabel__PartsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAG_START||LA1_0==RULE_TEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:79:2: rule__HtmlLabel__PartsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__HtmlLabel__PartsAssignment_in_ruleHtmlLabel91);
            	    rule__HtmlLabel__PartsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getHtmlLabelAccess().getPartsAssignment()); 

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
    // $ANTLR end "ruleHtmlLabel"


    // $ANTLR start "entryRuleHtmlContent"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:91:1: entryRuleHtmlContent : ruleHtmlContent EOF ;
    public final void entryRuleHtmlContent() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:92:1: ( ruleHtmlContent EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:93:1: ruleHtmlContent EOF
            {
             before(grammarAccess.getHtmlContentRule()); 
            pushFollow(FOLLOW_ruleHtmlContent_in_entryRuleHtmlContent119);
            ruleHtmlContent();

            state._fsp--;

             after(grammarAccess.getHtmlContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlContent126); 

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
    // $ANTLR end "entryRuleHtmlContent"


    // $ANTLR start "ruleHtmlContent"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:100:1: ruleHtmlContent : ( ( rule__HtmlContent__Alternatives ) ) ;
    public final void ruleHtmlContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:104:5: ( ( ( rule__HtmlContent__Alternatives ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:105:1: ( ( rule__HtmlContent__Alternatives ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:105:1: ( ( rule__HtmlContent__Alternatives ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:106:1: ( rule__HtmlContent__Alternatives )
            {
             before(grammarAccess.getHtmlContentAccess().getAlternatives()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:107:1: ( rule__HtmlContent__Alternatives )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:107:2: rule__HtmlContent__Alternatives
            {
            pushFollow(FOLLOW_rule__HtmlContent__Alternatives_in_ruleHtmlContent156);
            rule__HtmlContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHtmlContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHtmlContent"


    // $ANTLR start "entryRuleHtmlTag"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:119:1: entryRuleHtmlTag : ruleHtmlTag EOF ;
    public final void entryRuleHtmlTag() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:123:1: ( ruleHtmlTag EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:124:1: ruleHtmlTag EOF
            {
             before(grammarAccess.getHtmlTagRule()); 
            pushFollow(FOLLOW_ruleHtmlTag_in_entryRuleHtmlTag188);
            ruleHtmlTag();

            state._fsp--;

             after(grammarAccess.getHtmlTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlTag195); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleHtmlTag"


    // $ANTLR start "ruleHtmlTag"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:134:1: ruleHtmlTag : ( ( rule__HtmlTag__Group__0 ) ) ;
    public final void ruleHtmlTag() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:139:5: ( ( ( rule__HtmlTag__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:140:1: ( ( rule__HtmlTag__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:140:1: ( ( rule__HtmlTag__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:141:1: ( rule__HtmlTag__Group__0 )
            {
             before(grammarAccess.getHtmlTagAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:142:1: ( rule__HtmlTag__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:142:2: rule__HtmlTag__Group__0
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group__0_in_ruleHtmlTag229);
            rule__HtmlTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleHtmlTag"


    // $ANTLR start "entryRuleHtmlAttr"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:155:1: entryRuleHtmlAttr : ruleHtmlAttr EOF ;
    public final void entryRuleHtmlAttr() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:156:1: ( ruleHtmlAttr EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:157:1: ruleHtmlAttr EOF
            {
             before(grammarAccess.getHtmlAttrRule()); 
            pushFollow(FOLLOW_ruleHtmlAttr_in_entryRuleHtmlAttr256);
            ruleHtmlAttr();

            state._fsp--;

             after(grammarAccess.getHtmlAttrRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHtmlAttr263); 

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
    // $ANTLR end "entryRuleHtmlAttr"


    // $ANTLR start "ruleHtmlAttr"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:164:1: ruleHtmlAttr : ( ( rule__HtmlAttr__Group__0 ) ) ;
    public final void ruleHtmlAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:168:5: ( ( ( rule__HtmlAttr__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:169:1: ( ( rule__HtmlAttr__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:169:1: ( ( rule__HtmlAttr__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:170:1: ( rule__HtmlAttr__Group__0 )
            {
             before(grammarAccess.getHtmlAttrAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:171:1: ( rule__HtmlAttr__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:171:2: rule__HtmlAttr__Group__0
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__0_in_ruleHtmlAttr293);
            rule__HtmlAttr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlAttrAccess().getGroup()); 

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
    // $ANTLR end "ruleHtmlAttr"


    // $ANTLR start "rule__HtmlContent__Alternatives"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:183:1: rule__HtmlContent__Alternatives : ( ( ( rule__HtmlContent__TagAssignment_0 ) ) | ( ( rule__HtmlContent__TextAssignment_1 ) ) );
    public final void rule__HtmlContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:187:1: ( ( ( rule__HtmlContent__TagAssignment_0 ) ) | ( ( rule__HtmlContent__TextAssignment_1 ) ) )
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:188:1: ( ( rule__HtmlContent__TagAssignment_0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:188:1: ( ( rule__HtmlContent__TagAssignment_0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:189:1: ( rule__HtmlContent__TagAssignment_0 )
                    {
                     before(grammarAccess.getHtmlContentAccess().getTagAssignment_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:190:1: ( rule__HtmlContent__TagAssignment_0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:190:2: rule__HtmlContent__TagAssignment_0
                    {
                    pushFollow(FOLLOW_rule__HtmlContent__TagAssignment_0_in_rule__HtmlContent__Alternatives329);
                    rule__HtmlContent__TagAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlContentAccess().getTagAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:194:6: ( ( rule__HtmlContent__TextAssignment_1 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:194:6: ( ( rule__HtmlContent__TextAssignment_1 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:195:1: ( rule__HtmlContent__TextAssignment_1 )
                    {
                     before(grammarAccess.getHtmlContentAccess().getTextAssignment_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:196:1: ( rule__HtmlContent__TextAssignment_1 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:196:2: rule__HtmlContent__TextAssignment_1
                    {
                    pushFollow(FOLLOW_rule__HtmlContent__TextAssignment_1_in_rule__HtmlContent__Alternatives347);
                    rule__HtmlContent__TextAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlContentAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__HtmlContent__Alternatives"


    // $ANTLR start "rule__HtmlTag__Alternatives_3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:205:1: rule__HtmlTag__Alternatives_3 : ( ( ( rule__HtmlTag__SelfClosingAssignment_3_0 ) ) | ( ( rule__HtmlTag__Group_3_1__0 ) ) );
    public final void rule__HtmlTag__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:209:1: ( ( ( rule__HtmlTag__SelfClosingAssignment_3_0 ) ) | ( ( rule__HtmlTag__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TAG_END_CLOSE) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_TAG_END) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:210:1: ( ( rule__HtmlTag__SelfClosingAssignment_3_0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:210:1: ( ( rule__HtmlTag__SelfClosingAssignment_3_0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:211:1: ( rule__HtmlTag__SelfClosingAssignment_3_0 )
                    {
                     before(grammarAccess.getHtmlTagAccess().getSelfClosingAssignment_3_0()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:212:1: ( rule__HtmlTag__SelfClosingAssignment_3_0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:212:2: rule__HtmlTag__SelfClosingAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__HtmlTag__SelfClosingAssignment_3_0_in_rule__HtmlTag__Alternatives_3380);
                    rule__HtmlTag__SelfClosingAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlTagAccess().getSelfClosingAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:216:6: ( ( rule__HtmlTag__Group_3_1__0 ) )
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:216:6: ( ( rule__HtmlTag__Group_3_1__0 ) )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:217:1: ( rule__HtmlTag__Group_3_1__0 )
                    {
                     before(grammarAccess.getHtmlTagAccess().getGroup_3_1()); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:218:1: ( rule__HtmlTag__Group_3_1__0 )
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:218:2: rule__HtmlTag__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__0_in_rule__HtmlTag__Alternatives_3398);
                    rule__HtmlTag__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHtmlTagAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__HtmlTag__Alternatives_3"


    // $ANTLR start "rule__HtmlTag__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:229:1: rule__HtmlTag__Group__0 : rule__HtmlTag__Group__0__Impl rule__HtmlTag__Group__1 ;
    public final void rule__HtmlTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:233:1: ( rule__HtmlTag__Group__0__Impl rule__HtmlTag__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:234:2: rule__HtmlTag__Group__0__Impl rule__HtmlTag__Group__1
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group__0__Impl_in_rule__HtmlTag__Group__0429);
            rule__HtmlTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group__1_in_rule__HtmlTag__Group__0432);
            rule__HtmlTag__Group__1();

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
    // $ANTLR end "rule__HtmlTag__Group__0"


    // $ANTLR start "rule__HtmlTag__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:241:1: rule__HtmlTag__Group__0__Impl : ( RULE_TAG_START ) ;
    public final void rule__HtmlTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:245:1: ( ( RULE_TAG_START ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:246:1: ( RULE_TAG_START )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:246:1: ( RULE_TAG_START )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:247:1: RULE_TAG_START
            {
             before(grammarAccess.getHtmlTagAccess().getTAG_STARTTerminalRuleCall_0()); 
            match(input,RULE_TAG_START,FOLLOW_RULE_TAG_START_in_rule__HtmlTag__Group__0__Impl459); 
             after(grammarAccess.getHtmlTagAccess().getTAG_STARTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__HtmlTag__Group__0__Impl"


    // $ANTLR start "rule__HtmlTag__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:258:1: rule__HtmlTag__Group__1 : rule__HtmlTag__Group__1__Impl rule__HtmlTag__Group__2 ;
    public final void rule__HtmlTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:262:1: ( rule__HtmlTag__Group__1__Impl rule__HtmlTag__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:263:2: rule__HtmlTag__Group__1__Impl rule__HtmlTag__Group__2
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group__1__Impl_in_rule__HtmlTag__Group__1488);
            rule__HtmlTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group__2_in_rule__HtmlTag__Group__1491);
            rule__HtmlTag__Group__2();

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
    // $ANTLR end "rule__HtmlTag__Group__1"


    // $ANTLR start "rule__HtmlTag__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:270:1: rule__HtmlTag__Group__1__Impl : ( ( rule__HtmlTag__NameAssignment_1 ) ) ;
    public final void rule__HtmlTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:274:1: ( ( ( rule__HtmlTag__NameAssignment_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:275:1: ( ( rule__HtmlTag__NameAssignment_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:275:1: ( ( rule__HtmlTag__NameAssignment_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:276:1: ( rule__HtmlTag__NameAssignment_1 )
            {
             before(grammarAccess.getHtmlTagAccess().getNameAssignment_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:277:1: ( rule__HtmlTag__NameAssignment_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:277:2: rule__HtmlTag__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HtmlTag__NameAssignment_1_in_rule__HtmlTag__Group__1__Impl518);
            rule__HtmlTag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTagAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__HtmlTag__Group__1__Impl"


    // $ANTLR start "rule__HtmlTag__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:287:1: rule__HtmlTag__Group__2 : rule__HtmlTag__Group__2__Impl rule__HtmlTag__Group__3 ;
    public final void rule__HtmlTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:291:1: ( rule__HtmlTag__Group__2__Impl rule__HtmlTag__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:292:2: rule__HtmlTag__Group__2__Impl rule__HtmlTag__Group__3
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group__2__Impl_in_rule__HtmlTag__Group__2548);
            rule__HtmlTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group__3_in_rule__HtmlTag__Group__2551);
            rule__HtmlTag__Group__3();

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
    // $ANTLR end "rule__HtmlTag__Group__2"


    // $ANTLR start "rule__HtmlTag__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:299:1: rule__HtmlTag__Group__2__Impl : ( ( rule__HtmlTag__AttributesAssignment_2 )* ) ;
    public final void rule__HtmlTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:303:1: ( ( ( rule__HtmlTag__AttributesAssignment_2 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:304:1: ( ( rule__HtmlTag__AttributesAssignment_2 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:304:1: ( ( rule__HtmlTag__AttributesAssignment_2 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:305:1: ( rule__HtmlTag__AttributesAssignment_2 )*
            {
             before(grammarAccess.getHtmlTagAccess().getAttributesAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:306:1: ( rule__HtmlTag__AttributesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:306:2: rule__HtmlTag__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__HtmlTag__AttributesAssignment_2_in_rule__HtmlTag__Group__2__Impl578);
            	    rule__HtmlTag__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getHtmlTagAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__HtmlTag__Group__2__Impl"


    // $ANTLR start "rule__HtmlTag__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:316:1: rule__HtmlTag__Group__3 : rule__HtmlTag__Group__3__Impl ;
    public final void rule__HtmlTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:320:1: ( rule__HtmlTag__Group__3__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:321:2: rule__HtmlTag__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group__3__Impl_in_rule__HtmlTag__Group__3609);
            rule__HtmlTag__Group__3__Impl();

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
    // $ANTLR end "rule__HtmlTag__Group__3"


    // $ANTLR start "rule__HtmlTag__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:327:1: rule__HtmlTag__Group__3__Impl : ( ( rule__HtmlTag__Alternatives_3 ) ) ;
    public final void rule__HtmlTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:331:1: ( ( ( rule__HtmlTag__Alternatives_3 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:332:1: ( ( rule__HtmlTag__Alternatives_3 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:332:1: ( ( rule__HtmlTag__Alternatives_3 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:333:1: ( rule__HtmlTag__Alternatives_3 )
            {
             before(grammarAccess.getHtmlTagAccess().getAlternatives_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:334:1: ( rule__HtmlTag__Alternatives_3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:334:2: rule__HtmlTag__Alternatives_3
            {
            pushFollow(FOLLOW_rule__HtmlTag__Alternatives_3_in_rule__HtmlTag__Group__3__Impl636);
            rule__HtmlTag__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTagAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__HtmlTag__Group__3__Impl"


    // $ANTLR start "rule__HtmlTag__Group_3_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:352:1: rule__HtmlTag__Group_3_1__0 : rule__HtmlTag__Group_3_1__0__Impl rule__HtmlTag__Group_3_1__1 ;
    public final void rule__HtmlTag__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:356:1: ( rule__HtmlTag__Group_3_1__0__Impl rule__HtmlTag__Group_3_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:357:2: rule__HtmlTag__Group_3_1__0__Impl rule__HtmlTag__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__0__Impl_in_rule__HtmlTag__Group_3_1__0674);
            rule__HtmlTag__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__1_in_rule__HtmlTag__Group_3_1__0677);
            rule__HtmlTag__Group_3_1__1();

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__0"


    // $ANTLR start "rule__HtmlTag__Group_3_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:364:1: rule__HtmlTag__Group_3_1__0__Impl : ( RULE_TAG_END ) ;
    public final void rule__HtmlTag__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:368:1: ( ( RULE_TAG_END ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:369:1: ( RULE_TAG_END )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:369:1: ( RULE_TAG_END )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:370:1: RULE_TAG_END
            {
             before(grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_0()); 
            match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__HtmlTag__Group_3_1__0__Impl704); 
             after(grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__0__Impl"


    // $ANTLR start "rule__HtmlTag__Group_3_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:381:1: rule__HtmlTag__Group_3_1__1 : rule__HtmlTag__Group_3_1__1__Impl rule__HtmlTag__Group_3_1__2 ;
    public final void rule__HtmlTag__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:385:1: ( rule__HtmlTag__Group_3_1__1__Impl rule__HtmlTag__Group_3_1__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:386:2: rule__HtmlTag__Group_3_1__1__Impl rule__HtmlTag__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__1__Impl_in_rule__HtmlTag__Group_3_1__1733);
            rule__HtmlTag__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__2_in_rule__HtmlTag__Group_3_1__1736);
            rule__HtmlTag__Group_3_1__2();

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__1"


    // $ANTLR start "rule__HtmlTag__Group_3_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:393:1: rule__HtmlTag__Group_3_1__1__Impl : ( ( rule__HtmlTag__ChildrenAssignment_3_1_1 )* ) ;
    public final void rule__HtmlTag__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:397:1: ( ( ( rule__HtmlTag__ChildrenAssignment_3_1_1 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:398:1: ( ( rule__HtmlTag__ChildrenAssignment_3_1_1 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:398:1: ( ( rule__HtmlTag__ChildrenAssignment_3_1_1 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:399:1: ( rule__HtmlTag__ChildrenAssignment_3_1_1 )*
            {
             before(grammarAccess.getHtmlTagAccess().getChildrenAssignment_3_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:400:1: ( rule__HtmlTag__ChildrenAssignment_3_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG_START||LA5_0==RULE_TEXT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:400:2: rule__HtmlTag__ChildrenAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_rule__HtmlTag__ChildrenAssignment_3_1_1_in_rule__HtmlTag__Group_3_1__1__Impl763);
            	    rule__HtmlTag__ChildrenAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHtmlTagAccess().getChildrenAssignment_3_1_1()); 

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__1__Impl"


    // $ANTLR start "rule__HtmlTag__Group_3_1__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:410:1: rule__HtmlTag__Group_3_1__2 : rule__HtmlTag__Group_3_1__2__Impl rule__HtmlTag__Group_3_1__3 ;
    public final void rule__HtmlTag__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:414:1: ( rule__HtmlTag__Group_3_1__2__Impl rule__HtmlTag__Group_3_1__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:415:2: rule__HtmlTag__Group_3_1__2__Impl rule__HtmlTag__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__2__Impl_in_rule__HtmlTag__Group_3_1__2794);
            rule__HtmlTag__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__3_in_rule__HtmlTag__Group_3_1__2797);
            rule__HtmlTag__Group_3_1__3();

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__2"


    // $ANTLR start "rule__HtmlTag__Group_3_1__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:422:1: rule__HtmlTag__Group_3_1__2__Impl : ( RULE_TAG_START_CLOSE ) ;
    public final void rule__HtmlTag__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:426:1: ( ( RULE_TAG_START_CLOSE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:427:1: ( RULE_TAG_START_CLOSE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:427:1: ( RULE_TAG_START_CLOSE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:428:1: RULE_TAG_START_CLOSE
            {
             before(grammarAccess.getHtmlTagAccess().getTAG_START_CLOSETerminalRuleCall_3_1_2()); 
            match(input,RULE_TAG_START_CLOSE,FOLLOW_RULE_TAG_START_CLOSE_in_rule__HtmlTag__Group_3_1__2__Impl824); 
             after(grammarAccess.getHtmlTagAccess().getTAG_START_CLOSETerminalRuleCall_3_1_2()); 

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__2__Impl"


    // $ANTLR start "rule__HtmlTag__Group_3_1__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:439:1: rule__HtmlTag__Group_3_1__3 : rule__HtmlTag__Group_3_1__3__Impl rule__HtmlTag__Group_3_1__4 ;
    public final void rule__HtmlTag__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:443:1: ( rule__HtmlTag__Group_3_1__3__Impl rule__HtmlTag__Group_3_1__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:444:2: rule__HtmlTag__Group_3_1__3__Impl rule__HtmlTag__Group_3_1__4
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__3__Impl_in_rule__HtmlTag__Group_3_1__3853);
            rule__HtmlTag__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__4_in_rule__HtmlTag__Group_3_1__3856);
            rule__HtmlTag__Group_3_1__4();

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__3"


    // $ANTLR start "rule__HtmlTag__Group_3_1__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:451:1: rule__HtmlTag__Group_3_1__3__Impl : ( ( rule__HtmlTag__CloseNameAssignment_3_1_3 ) ) ;
    public final void rule__HtmlTag__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:455:1: ( ( ( rule__HtmlTag__CloseNameAssignment_3_1_3 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:456:1: ( ( rule__HtmlTag__CloseNameAssignment_3_1_3 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:456:1: ( ( rule__HtmlTag__CloseNameAssignment_3_1_3 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:457:1: ( rule__HtmlTag__CloseNameAssignment_3_1_3 )
            {
             before(grammarAccess.getHtmlTagAccess().getCloseNameAssignment_3_1_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:458:1: ( rule__HtmlTag__CloseNameAssignment_3_1_3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:458:2: rule__HtmlTag__CloseNameAssignment_3_1_3
            {
            pushFollow(FOLLOW_rule__HtmlTag__CloseNameAssignment_3_1_3_in_rule__HtmlTag__Group_3_1__3__Impl883);
            rule__HtmlTag__CloseNameAssignment_3_1_3();

            state._fsp--;


            }

             after(grammarAccess.getHtmlTagAccess().getCloseNameAssignment_3_1_3()); 

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__3__Impl"


    // $ANTLR start "rule__HtmlTag__Group_3_1__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:468:1: rule__HtmlTag__Group_3_1__4 : rule__HtmlTag__Group_3_1__4__Impl ;
    public final void rule__HtmlTag__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:472:1: ( rule__HtmlTag__Group_3_1__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:473:2: rule__HtmlTag__Group_3_1__4__Impl
            {
            pushFollow(FOLLOW_rule__HtmlTag__Group_3_1__4__Impl_in_rule__HtmlTag__Group_3_1__4913);
            rule__HtmlTag__Group_3_1__4__Impl();

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__4"


    // $ANTLR start "rule__HtmlTag__Group_3_1__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:479:1: rule__HtmlTag__Group_3_1__4__Impl : ( RULE_TAG_END ) ;
    public final void rule__HtmlTag__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:483:1: ( ( RULE_TAG_END ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:484:1: ( RULE_TAG_END )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:484:1: ( RULE_TAG_END )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:485:1: RULE_TAG_END
            {
             before(grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_4()); 
            match(input,RULE_TAG_END,FOLLOW_RULE_TAG_END_in_rule__HtmlTag__Group_3_1__4__Impl940); 
             after(grammarAccess.getHtmlTagAccess().getTAG_ENDTerminalRuleCall_3_1_4()); 

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
    // $ANTLR end "rule__HtmlTag__Group_3_1__4__Impl"


    // $ANTLR start "rule__HtmlAttr__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:506:1: rule__HtmlAttr__Group__0 : rule__HtmlAttr__Group__0__Impl rule__HtmlAttr__Group__1 ;
    public final void rule__HtmlAttr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:510:1: ( rule__HtmlAttr__Group__0__Impl rule__HtmlAttr__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:511:2: rule__HtmlAttr__Group__0__Impl rule__HtmlAttr__Group__1
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__0__Impl_in_rule__HtmlAttr__Group__0979);
            rule__HtmlAttr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlAttr__Group__1_in_rule__HtmlAttr__Group__0982);
            rule__HtmlAttr__Group__1();

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
    // $ANTLR end "rule__HtmlAttr__Group__0"


    // $ANTLR start "rule__HtmlAttr__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:518:1: rule__HtmlAttr__Group__0__Impl : ( ( rule__HtmlAttr__NameAssignment_0 ) ) ;
    public final void rule__HtmlAttr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:522:1: ( ( ( rule__HtmlAttr__NameAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:523:1: ( ( rule__HtmlAttr__NameAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:523:1: ( ( rule__HtmlAttr__NameAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:524:1: ( rule__HtmlAttr__NameAssignment_0 )
            {
             before(grammarAccess.getHtmlAttrAccess().getNameAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:525:1: ( rule__HtmlAttr__NameAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:525:2: rule__HtmlAttr__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__HtmlAttr__NameAssignment_0_in_rule__HtmlAttr__Group__0__Impl1009);
            rule__HtmlAttr__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHtmlAttrAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__HtmlAttr__Group__0__Impl"


    // $ANTLR start "rule__HtmlAttr__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:535:1: rule__HtmlAttr__Group__1 : rule__HtmlAttr__Group__1__Impl rule__HtmlAttr__Group__2 ;
    public final void rule__HtmlAttr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:539:1: ( rule__HtmlAttr__Group__1__Impl rule__HtmlAttr__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:540:2: rule__HtmlAttr__Group__1__Impl rule__HtmlAttr__Group__2
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__1__Impl_in_rule__HtmlAttr__Group__11039);
            rule__HtmlAttr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlAttr__Group__2_in_rule__HtmlAttr__Group__11042);
            rule__HtmlAttr__Group__2();

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
    // $ANTLR end "rule__HtmlAttr__Group__1"


    // $ANTLR start "rule__HtmlAttr__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:547:1: rule__HtmlAttr__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__HtmlAttr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:551:1: ( ( ( RULE_WS )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:552:1: ( ( RULE_WS )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:552:1: ( ( RULE_WS )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:553:1: ( RULE_WS )?
            {
             before(grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:554:1: ( RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:554:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__HtmlAttr__Group__1__Impl1070); 

                    }
                    break;

            }

             after(grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__HtmlAttr__Group__1__Impl"


    // $ANTLR start "rule__HtmlAttr__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:564:1: rule__HtmlAttr__Group__2 : rule__HtmlAttr__Group__2__Impl rule__HtmlAttr__Group__3 ;
    public final void rule__HtmlAttr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:568:1: ( rule__HtmlAttr__Group__2__Impl rule__HtmlAttr__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:569:2: rule__HtmlAttr__Group__2__Impl rule__HtmlAttr__Group__3
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__2__Impl_in_rule__HtmlAttr__Group__21101);
            rule__HtmlAttr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlAttr__Group__3_in_rule__HtmlAttr__Group__21104);
            rule__HtmlAttr__Group__3();

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
    // $ANTLR end "rule__HtmlAttr__Group__2"


    // $ANTLR start "rule__HtmlAttr__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:576:1: rule__HtmlAttr__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__HtmlAttr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:580:1: ( ( RULE_ASSIGN ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:581:1: ( RULE_ASSIGN )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:581:1: ( RULE_ASSIGN )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:582:1: RULE_ASSIGN
            {
             before(grammarAccess.getHtmlAttrAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__HtmlAttr__Group__2__Impl1131); 
             after(grammarAccess.getHtmlAttrAccess().getASSIGNTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__HtmlAttr__Group__2__Impl"


    // $ANTLR start "rule__HtmlAttr__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:593:1: rule__HtmlAttr__Group__3 : rule__HtmlAttr__Group__3__Impl rule__HtmlAttr__Group__4 ;
    public final void rule__HtmlAttr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:597:1: ( rule__HtmlAttr__Group__3__Impl rule__HtmlAttr__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:598:2: rule__HtmlAttr__Group__3__Impl rule__HtmlAttr__Group__4
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__3__Impl_in_rule__HtmlAttr__Group__31160);
            rule__HtmlAttr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HtmlAttr__Group__4_in_rule__HtmlAttr__Group__31163);
            rule__HtmlAttr__Group__4();

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
    // $ANTLR end "rule__HtmlAttr__Group__3"


    // $ANTLR start "rule__HtmlAttr__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:605:1: rule__HtmlAttr__Group__3__Impl : ( ( RULE_WS )? ) ;
    public final void rule__HtmlAttr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:609:1: ( ( ( RULE_WS )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:610:1: ( ( RULE_WS )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:610:1: ( ( RULE_WS )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:611:1: ( RULE_WS )?
            {
             before(grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:612:1: ( RULE_WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:612:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__HtmlAttr__Group__3__Impl1191); 

                    }
                    break;

            }

             after(grammarAccess.getHtmlAttrAccess().getWSTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__HtmlAttr__Group__3__Impl"


    // $ANTLR start "rule__HtmlAttr__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:622:1: rule__HtmlAttr__Group__4 : rule__HtmlAttr__Group__4__Impl ;
    public final void rule__HtmlAttr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:626:1: ( rule__HtmlAttr__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:627:2: rule__HtmlAttr__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HtmlAttr__Group__4__Impl_in_rule__HtmlAttr__Group__41222);
            rule__HtmlAttr__Group__4__Impl();

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
    // $ANTLR end "rule__HtmlAttr__Group__4"


    // $ANTLR start "rule__HtmlAttr__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:633:1: rule__HtmlAttr__Group__4__Impl : ( ( rule__HtmlAttr__ValueAssignment_4 ) ) ;
    public final void rule__HtmlAttr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:637:1: ( ( ( rule__HtmlAttr__ValueAssignment_4 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:638:1: ( ( rule__HtmlAttr__ValueAssignment_4 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:638:1: ( ( rule__HtmlAttr__ValueAssignment_4 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:639:1: ( rule__HtmlAttr__ValueAssignment_4 )
            {
             before(grammarAccess.getHtmlAttrAccess().getValueAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:640:1: ( rule__HtmlAttr__ValueAssignment_4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:640:2: rule__HtmlAttr__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__HtmlAttr__ValueAssignment_4_in_rule__HtmlAttr__Group__4__Impl1249);
            rule__HtmlAttr__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHtmlAttrAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__HtmlAttr__Group__4__Impl"


    // $ANTLR start "rule__HtmlLabel__PartsAssignment"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:661:1: rule__HtmlLabel__PartsAssignment : ( ruleHtmlContent ) ;
    public final void rule__HtmlLabel__PartsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:665:1: ( ( ruleHtmlContent ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:666:1: ( ruleHtmlContent )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:666:1: ( ruleHtmlContent )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:667:1: ruleHtmlContent
            {
             before(grammarAccess.getHtmlLabelAccess().getPartsHtmlContentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleHtmlContent_in_rule__HtmlLabel__PartsAssignment1294);
            ruleHtmlContent();

            state._fsp--;

             after(grammarAccess.getHtmlLabelAccess().getPartsHtmlContentParserRuleCall_0()); 

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
    // $ANTLR end "rule__HtmlLabel__PartsAssignment"


    // $ANTLR start "rule__HtmlContent__TagAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:676:1: rule__HtmlContent__TagAssignment_0 : ( ruleHtmlTag ) ;
    public final void rule__HtmlContent__TagAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:680:1: ( ( ruleHtmlTag ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:681:1: ( ruleHtmlTag )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:681:1: ( ruleHtmlTag )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:682:1: ruleHtmlTag
            {
             before(grammarAccess.getHtmlContentAccess().getTagHtmlTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHtmlTag_in_rule__HtmlContent__TagAssignment_01325);
            ruleHtmlTag();

            state._fsp--;

             after(grammarAccess.getHtmlContentAccess().getTagHtmlTagParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__HtmlContent__TagAssignment_0"


    // $ANTLR start "rule__HtmlContent__TextAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:691:1: rule__HtmlContent__TextAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__HtmlContent__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:695:1: ( ( RULE_TEXT ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:696:1: ( RULE_TEXT )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:696:1: ( RULE_TEXT )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:697:1: RULE_TEXT
            {
             before(grammarAccess.getHtmlContentAccess().getTextTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__HtmlContent__TextAssignment_11356); 
             after(grammarAccess.getHtmlContentAccess().getTextTEXTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HtmlContent__TextAssignment_1"


    // $ANTLR start "rule__HtmlTag__NameAssignment_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:706:1: rule__HtmlTag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HtmlTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:710:1: ( ( RULE_ID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:711:1: ( RULE_ID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:711:1: ( RULE_ID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:712:1: RULE_ID
            {
             before(grammarAccess.getHtmlTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HtmlTag__NameAssignment_11387); 
             after(grammarAccess.getHtmlTagAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HtmlTag__NameAssignment_1"


    // $ANTLR start "rule__HtmlTag__AttributesAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:721:1: rule__HtmlTag__AttributesAssignment_2 : ( ruleHtmlAttr ) ;
    public final void rule__HtmlTag__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:725:1: ( ( ruleHtmlAttr ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:726:1: ( ruleHtmlAttr )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:726:1: ( ruleHtmlAttr )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:727:1: ruleHtmlAttr
            {
             before(grammarAccess.getHtmlTagAccess().getAttributesHtmlAttrParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHtmlAttr_in_rule__HtmlTag__AttributesAssignment_21418);
            ruleHtmlAttr();

            state._fsp--;

             after(grammarAccess.getHtmlTagAccess().getAttributesHtmlAttrParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__HtmlTag__AttributesAssignment_2"


    // $ANTLR start "rule__HtmlTag__SelfClosingAssignment_3_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:736:1: rule__HtmlTag__SelfClosingAssignment_3_0 : ( RULE_TAG_END_CLOSE ) ;
    public final void rule__HtmlTag__SelfClosingAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:740:1: ( ( RULE_TAG_END_CLOSE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:741:1: ( RULE_TAG_END_CLOSE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:741:1: ( RULE_TAG_END_CLOSE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:742:1: RULE_TAG_END_CLOSE
            {
             before(grammarAccess.getHtmlTagAccess().getSelfClosingTAG_END_CLOSETerminalRuleCall_3_0_0()); 
            match(input,RULE_TAG_END_CLOSE,FOLLOW_RULE_TAG_END_CLOSE_in_rule__HtmlTag__SelfClosingAssignment_3_01449); 
             after(grammarAccess.getHtmlTagAccess().getSelfClosingTAG_END_CLOSETerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__HtmlTag__SelfClosingAssignment_3_0"


    // $ANTLR start "rule__HtmlTag__ChildrenAssignment_3_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:751:1: rule__HtmlTag__ChildrenAssignment_3_1_1 : ( ruleHtmlContent ) ;
    public final void rule__HtmlTag__ChildrenAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:755:1: ( ( ruleHtmlContent ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:756:1: ( ruleHtmlContent )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:756:1: ( ruleHtmlContent )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:757:1: ruleHtmlContent
            {
             before(grammarAccess.getHtmlTagAccess().getChildrenHtmlContentParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleHtmlContent_in_rule__HtmlTag__ChildrenAssignment_3_1_11480);
            ruleHtmlContent();

            state._fsp--;

             after(grammarAccess.getHtmlTagAccess().getChildrenHtmlContentParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__HtmlTag__ChildrenAssignment_3_1_1"


    // $ANTLR start "rule__HtmlTag__CloseNameAssignment_3_1_3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:766:1: rule__HtmlTag__CloseNameAssignment_3_1_3 : ( RULE_ID ) ;
    public final void rule__HtmlTag__CloseNameAssignment_3_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:770:1: ( ( RULE_ID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:771:1: ( RULE_ID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:771:1: ( RULE_ID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:772:1: RULE_ID
            {
             before(grammarAccess.getHtmlTagAccess().getCloseNameIDTerminalRuleCall_3_1_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HtmlTag__CloseNameAssignment_3_1_31511); 
             after(grammarAccess.getHtmlTagAccess().getCloseNameIDTerminalRuleCall_3_1_3_0()); 

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
    // $ANTLR end "rule__HtmlTag__CloseNameAssignment_3_1_3"


    // $ANTLR start "rule__HtmlAttr__NameAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:781:1: rule__HtmlAttr__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__HtmlAttr__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:785:1: ( ( RULE_ID ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:786:1: ( RULE_ID )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:786:1: ( RULE_ID )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:787:1: RULE_ID
            {
             before(grammarAccess.getHtmlAttrAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HtmlAttr__NameAssignment_01542); 
             after(grammarAccess.getHtmlAttrAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__HtmlAttr__NameAssignment_0"


    // $ANTLR start "rule__HtmlAttr__ValueAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:796:1: rule__HtmlAttr__ValueAssignment_4 : ( RULE_ATTR_VALUE ) ;
    public final void rule__HtmlAttr__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:800:1: ( ( RULE_ATTR_VALUE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:801:1: ( RULE_ATTR_VALUE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:801:1: ( RULE_ATTR_VALUE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotHtmlLabelParser.g:802:1: RULE_ATTR_VALUE
            {
             before(grammarAccess.getHtmlAttrAccess().getValueATTR_VALUETerminalRuleCall_4_0()); 
            match(input,RULE_ATTR_VALUE,FOLLOW_RULE_ATTR_VALUE_in_rule__HtmlAttr__ValueAssignment_41573); 
             after(grammarAccess.getHtmlAttrAccess().getValueATTR_VALUETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__HtmlAttr__ValueAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHtmlLabel_in_entryRuleHtmlLabel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlLabel61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlLabel__PartsAssignment_in_ruleHtmlLabel91 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_entryRuleHtmlContent119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlContent126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlContent__Alternatives_in_ruleHtmlContent156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlTag_in_entryRuleHtmlTag188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlTag195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__0_in_ruleHtmlTag229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlAttr_in_entryRuleHtmlAttr256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHtmlAttr263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__0_in_ruleHtmlAttr293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlContent__TagAssignment_0_in_rule__HtmlContent__Alternatives329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlContent__TextAssignment_1_in_rule__HtmlContent__Alternatives347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__SelfClosingAssignment_3_0_in_rule__HtmlTag__Alternatives_3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__0_in_rule__HtmlTag__Alternatives_3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__0__Impl_in_rule__HtmlTag__Group__0429 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__1_in_rule__HtmlTag__Group__0432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_in_rule__HtmlTag__Group__0__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__1__Impl_in_rule__HtmlTag__Group__1488 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__2_in_rule__HtmlTag__Group__1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__NameAssignment_1_in_rule__HtmlTag__Group__1__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__2__Impl_in_rule__HtmlTag__Group__2548 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__3_in_rule__HtmlTag__Group__2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__AttributesAssignment_2_in_rule__HtmlTag__Group__2__Impl578 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group__3__Impl_in_rule__HtmlTag__Group__3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Alternatives_3_in_rule__HtmlTag__Group__3__Impl636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__0__Impl_in_rule__HtmlTag__Group_3_1__0674 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__1_in_rule__HtmlTag__Group_3_1__0677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__HtmlTag__Group_3_1__0__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__1__Impl_in_rule__HtmlTag__Group_3_1__1733 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__2_in_rule__HtmlTag__Group_3_1__1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__ChildrenAssignment_3_1_1_in_rule__HtmlTag__Group_3_1__1__Impl763 = new BitSet(new long[]{0x0000000000002042L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__2__Impl_in_rule__HtmlTag__Group_3_1__2794 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__3_in_rule__HtmlTag__Group_3_1__2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_CLOSE_in_rule__HtmlTag__Group_3_1__2__Impl824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__3__Impl_in_rule__HtmlTag__Group_3_1__3853 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__4_in_rule__HtmlTag__Group_3_1__3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__CloseNameAssignment_3_1_3_in_rule__HtmlTag__Group_3_1__3__Impl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlTag__Group_3_1__4__Impl_in_rule__HtmlTag__Group_3_1__4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_in_rule__HtmlTag__Group_3_1__4__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__0__Impl_in_rule__HtmlAttr__Group__0979 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__1_in_rule__HtmlAttr__Group__0982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__NameAssignment_0_in_rule__HtmlAttr__Group__0__Impl1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__1__Impl_in_rule__HtmlAttr__Group__11039 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__2_in_rule__HtmlAttr__Group__11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__HtmlAttr__Group__1__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__2__Impl_in_rule__HtmlAttr__Group__21101 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__3_in_rule__HtmlAttr__Group__21104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__HtmlAttr__Group__2__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__3__Impl_in_rule__HtmlAttr__Group__31160 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__4_in_rule__HtmlAttr__Group__31163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__HtmlAttr__Group__3__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__Group__4__Impl_in_rule__HtmlAttr__Group__41222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HtmlAttr__ValueAssignment_4_in_rule__HtmlAttr__Group__4__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_rule__HtmlLabel__PartsAssignment1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlTag_in_rule__HtmlContent__TagAssignment_01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__HtmlContent__TextAssignment_11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HtmlTag__NameAssignment_11387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlAttr_in_rule__HtmlTag__AttributesAssignment_21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_CLOSE_in_rule__HtmlTag__SelfClosingAssignment_3_01449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHtmlContent_in_rule__HtmlTag__ChildrenAssignment_3_1_11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HtmlTag__CloseNameAssignment_3_1_31511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HtmlAttr__NameAssignment_01542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATTR_VALUE_in_rule__HtmlAttr__ValueAssignment_41573 = new BitSet(new long[]{0x0000000000000002L});

}