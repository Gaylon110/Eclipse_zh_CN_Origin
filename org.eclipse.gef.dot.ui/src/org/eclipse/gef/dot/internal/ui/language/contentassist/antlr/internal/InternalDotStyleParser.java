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
import org.eclipse.gef.dot.internal.language.services.DotStyleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotStyleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Diagonals", "Rounded", "Striped", "Tapered", "Dashed", "Dotted", "Filled", "Radial", "Wedged", "Invis", "Solid", "Bold", "LeftParenthesis", "RightParenthesis", "Comma", "RULE_WS", "RULE_NAME"
    };
    public static final int Rounded=5;
    public static final int Invis=13;
    public static final int Dashed=8;
    public static final int RULE_NAME=20;
    public static final int Radial=11;
    public static final int Solid=14;
    public static final int Comma=18;
    public static final int LeftParenthesis=16;
    public static final int Dotted=9;
    public static final int Striped=6;
    public static final int EOF=-1;
    public static final int Wedged=12;
    public static final int Tapered=7;
    public static final int RULE_WS=19;
    public static final int Diagonals=4;
    public static final int RightParenthesis=17;
    public static final int Filled=10;
    public static final int Bold=15;

    // delegates
    // delegators


        public InternalDotStyleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotStyleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotStyleParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g"; }


     
     	private DotStyleGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
     	}
     	
        public void setGrammarAccess(DotStyleGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStyle"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:66:1: entryRuleStyle : ruleStyle EOF ;
    public final void entryRuleStyle() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:67:1: ( ruleStyle EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:68:1: ruleStyle EOF
            {
             before(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle54);
            ruleStyle();

            state._fsp--;

             after(grammarAccess.getStyleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle61); 

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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:75:1: ruleStyle : ( ( rule__Style__Group__0 ) ) ;
    public final void ruleStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:79:5: ( ( ( rule__Style__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:80:1: ( ( rule__Style__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:80:1: ( ( rule__Style__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:81:1: ( rule__Style__Group__0 )
            {
             before(grammarAccess.getStyleAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:82:1: ( rule__Style__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:82:2: rule__Style__Group__0
            {
            pushFollow(FOLLOW_rule__Style__Group__0_in_ruleStyle91);
            rule__Style__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getGroup()); 

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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleStyleItem"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:94:1: entryRuleStyleItem : ruleStyleItem EOF ;
    public final void entryRuleStyleItem() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:95:1: ( ruleStyleItem EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:96:1: ruleStyleItem EOF
            {
             before(grammarAccess.getStyleItemRule()); 
            pushFollow(FOLLOW_ruleStyleItem_in_entryRuleStyleItem118);
            ruleStyleItem();

            state._fsp--;

             after(grammarAccess.getStyleItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyleItem125); 

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
    // $ANTLR end "entryRuleStyleItem"


    // $ANTLR start "ruleStyleItem"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:103:1: ruleStyleItem : ( ( rule__StyleItem__Group__0 ) ) ;
    public final void ruleStyleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:107:5: ( ( ( rule__StyleItem__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:108:1: ( ( rule__StyleItem__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:108:1: ( ( rule__StyleItem__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:109:1: ( rule__StyleItem__Group__0 )
            {
             before(grammarAccess.getStyleItemAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:110:1: ( rule__StyleItem__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:110:2: rule__StyleItem__Group__0
            {
            pushFollow(FOLLOW_rule__StyleItem__Group__0_in_ruleStyleItem155);
            rule__StyleItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStyleItemAccess().getGroup()); 

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
    // $ANTLR end "ruleStyleItem"


    // $ANTLR start "rule__Style__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:130:1: rule__Style__Group__0 : rule__Style__Group__0__Impl rule__Style__Group__1 ;
    public final void rule__Style__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:134:1: ( rule__Style__Group__0__Impl rule__Style__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:135:2: rule__Style__Group__0__Impl rule__Style__Group__1
            {
            pushFollow(FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__0195);
            rule__Style__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Style__Group__1_in_rule__Style__Group__0198);
            rule__Style__Group__1();

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
    // $ANTLR end "rule__Style__Group__0"


    // $ANTLR start "rule__Style__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:142:1: rule__Style__Group__0__Impl : ( () ) ;
    public final void rule__Style__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:146:1: ( ( () ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:147:1: ( () )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:147:1: ( () )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:148:1: ()
            {
             before(grammarAccess.getStyleAccess().getStyleAction_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:149:1: ()
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:151:1: 
            {
            }

             after(grammarAccess.getStyleAccess().getStyleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Style__Group__0__Impl"


    // $ANTLR start "rule__Style__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:161:1: rule__Style__Group__1 : rule__Style__Group__1__Impl ;
    public final void rule__Style__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:165:1: ( rule__Style__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:166:2: rule__Style__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__1256);
            rule__Style__Group__1__Impl();

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
    // $ANTLR end "rule__Style__Group__1"


    // $ANTLR start "rule__Style__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:172:1: rule__Style__Group__1__Impl : ( ( rule__Style__Group_1__0 )? ) ;
    public final void rule__Style__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:176:1: ( ( ( rule__Style__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:177:1: ( ( rule__Style__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:177:1: ( ( rule__Style__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:178:1: ( rule__Style__Group_1__0 )?
            {
             before(grammarAccess.getStyleAccess().getGroup_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:179:1: ( rule__Style__Group_1__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NAME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:179:2: rule__Style__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Style__Group_1__0_in_rule__Style__Group__1__Impl283);
                    rule__Style__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Style__Group__1__Impl"


    // $ANTLR start "rule__Style__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:193:1: rule__Style__Group_1__0 : rule__Style__Group_1__0__Impl rule__Style__Group_1__1 ;
    public final void rule__Style__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:197:1: ( rule__Style__Group_1__0__Impl rule__Style__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:198:2: rule__Style__Group_1__0__Impl rule__Style__Group_1__1
            {
            pushFollow(FOLLOW_rule__Style__Group_1__0__Impl_in_rule__Style__Group_1__0318);
            rule__Style__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Style__Group_1__1_in_rule__Style__Group_1__0321);
            rule__Style__Group_1__1();

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
    // $ANTLR end "rule__Style__Group_1__0"


    // $ANTLR start "rule__Style__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:205:1: rule__Style__Group_1__0__Impl : ( ( rule__Style__StyleItemsAssignment_1_0 ) ) ;
    public final void rule__Style__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:209:1: ( ( ( rule__Style__StyleItemsAssignment_1_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:210:1: ( ( rule__Style__StyleItemsAssignment_1_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:210:1: ( ( rule__Style__StyleItemsAssignment_1_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:211:1: ( rule__Style__StyleItemsAssignment_1_0 )
            {
             before(grammarAccess.getStyleAccess().getStyleItemsAssignment_1_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:212:1: ( rule__Style__StyleItemsAssignment_1_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:212:2: rule__Style__StyleItemsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Style__StyleItemsAssignment_1_0_in_rule__Style__Group_1__0__Impl348);
            rule__Style__StyleItemsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getStyleItemsAssignment_1_0()); 

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
    // $ANTLR end "rule__Style__Group_1__0__Impl"


    // $ANTLR start "rule__Style__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:222:1: rule__Style__Group_1__1 : rule__Style__Group_1__1__Impl ;
    public final void rule__Style__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:226:1: ( rule__Style__Group_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:227:2: rule__Style__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group_1__1__Impl_in_rule__Style__Group_1__1378);
            rule__Style__Group_1__1__Impl();

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
    // $ANTLR end "rule__Style__Group_1__1"


    // $ANTLR start "rule__Style__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:233:1: rule__Style__Group_1__1__Impl : ( ( rule__Style__Group_1_1__0 )* ) ;
    public final void rule__Style__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:237:1: ( ( ( rule__Style__Group_1_1__0 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:238:1: ( ( rule__Style__Group_1_1__0 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:238:1: ( ( rule__Style__Group_1_1__0 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:239:1: ( rule__Style__Group_1_1__0 )*
            {
             before(grammarAccess.getStyleAccess().getGroup_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:240:1: ( rule__Style__Group_1_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:240:2: rule__Style__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Style__Group_1_1__0_in_rule__Style__Group_1__1__Impl405);
            	    rule__Style__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStyleAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Style__Group_1__1__Impl"


    // $ANTLR start "rule__Style__Group_1_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:254:1: rule__Style__Group_1_1__0 : rule__Style__Group_1_1__0__Impl rule__Style__Group_1_1__1 ;
    public final void rule__Style__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:258:1: ( rule__Style__Group_1_1__0__Impl rule__Style__Group_1_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:259:2: rule__Style__Group_1_1__0__Impl rule__Style__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Style__Group_1_1__0__Impl_in_rule__Style__Group_1_1__0440);
            rule__Style__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Style__Group_1_1__1_in_rule__Style__Group_1_1__0443);
            rule__Style__Group_1_1__1();

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
    // $ANTLR end "rule__Style__Group_1_1__0"


    // $ANTLR start "rule__Style__Group_1_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:266:1: rule__Style__Group_1_1__0__Impl : ( Comma ) ;
    public final void rule__Style__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:270:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:271:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:271:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:272:1: Comma
            {
             before(grammarAccess.getStyleAccess().getCommaKeyword_1_1_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Style__Group_1_1__0__Impl471); 
             after(grammarAccess.getStyleAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Style__Group_1_1__0__Impl"


    // $ANTLR start "rule__Style__Group_1_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:285:1: rule__Style__Group_1_1__1 : rule__Style__Group_1_1__1__Impl ;
    public final void rule__Style__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:289:1: ( rule__Style__Group_1_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:290:2: rule__Style__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Style__Group_1_1__1__Impl_in_rule__Style__Group_1_1__1502);
            rule__Style__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Style__Group_1_1__1"


    // $ANTLR start "rule__Style__Group_1_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:296:1: rule__Style__Group_1_1__1__Impl : ( ( rule__Style__StyleItemsAssignment_1_1_1 ) ) ;
    public final void rule__Style__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:300:1: ( ( ( rule__Style__StyleItemsAssignment_1_1_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:301:1: ( ( rule__Style__StyleItemsAssignment_1_1_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:301:1: ( ( rule__Style__StyleItemsAssignment_1_1_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:302:1: ( rule__Style__StyleItemsAssignment_1_1_1 )
            {
             before(grammarAccess.getStyleAccess().getStyleItemsAssignment_1_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:303:1: ( rule__Style__StyleItemsAssignment_1_1_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:303:2: rule__Style__StyleItemsAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Style__StyleItemsAssignment_1_1_1_in_rule__Style__Group_1_1__1__Impl529);
            rule__Style__StyleItemsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleAccess().getStyleItemsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Style__Group_1_1__1__Impl"


    // $ANTLR start "rule__StyleItem__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:317:1: rule__StyleItem__Group__0 : rule__StyleItem__Group__0__Impl rule__StyleItem__Group__1 ;
    public final void rule__StyleItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:321:1: ( rule__StyleItem__Group__0__Impl rule__StyleItem__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:322:2: rule__StyleItem__Group__0__Impl rule__StyleItem__Group__1
            {
            pushFollow(FOLLOW_rule__StyleItem__Group__0__Impl_in_rule__StyleItem__Group__0563);
            rule__StyleItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StyleItem__Group__1_in_rule__StyleItem__Group__0566);
            rule__StyleItem__Group__1();

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
    // $ANTLR end "rule__StyleItem__Group__0"


    // $ANTLR start "rule__StyleItem__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:329:1: rule__StyleItem__Group__0__Impl : ( ( rule__StyleItem__NameAssignment_0 ) ) ;
    public final void rule__StyleItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:333:1: ( ( ( rule__StyleItem__NameAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:334:1: ( ( rule__StyleItem__NameAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:334:1: ( ( rule__StyleItem__NameAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:335:1: ( rule__StyleItem__NameAssignment_0 )
            {
             before(grammarAccess.getStyleItemAccess().getNameAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:336:1: ( rule__StyleItem__NameAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:336:2: rule__StyleItem__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StyleItem__NameAssignment_0_in_rule__StyleItem__Group__0__Impl593);
            rule__StyleItem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStyleItemAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__StyleItem__Group__0__Impl"


    // $ANTLR start "rule__StyleItem__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:346:1: rule__StyleItem__Group__1 : rule__StyleItem__Group__1__Impl ;
    public final void rule__StyleItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:350:1: ( rule__StyleItem__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:351:2: rule__StyleItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StyleItem__Group__1__Impl_in_rule__StyleItem__Group__1623);
            rule__StyleItem__Group__1__Impl();

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
    // $ANTLR end "rule__StyleItem__Group__1"


    // $ANTLR start "rule__StyleItem__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:357:1: rule__StyleItem__Group__1__Impl : ( ( rule__StyleItem__Group_1__0 )? ) ;
    public final void rule__StyleItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:361:1: ( ( ( rule__StyleItem__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:362:1: ( ( rule__StyleItem__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:362:1: ( ( rule__StyleItem__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:363:1: ( rule__StyleItem__Group_1__0 )?
            {
             before(grammarAccess.getStyleItemAccess().getGroup_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:364:1: ( rule__StyleItem__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==LeftParenthesis) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:364:2: rule__StyleItem__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__StyleItem__Group_1__0_in_rule__StyleItem__Group__1__Impl650);
                    rule__StyleItem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStyleItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StyleItem__Group__1__Impl"


    // $ANTLR start "rule__StyleItem__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:378:1: rule__StyleItem__Group_1__0 : rule__StyleItem__Group_1__0__Impl rule__StyleItem__Group_1__1 ;
    public final void rule__StyleItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:382:1: ( rule__StyleItem__Group_1__0__Impl rule__StyleItem__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:383:2: rule__StyleItem__Group_1__0__Impl rule__StyleItem__Group_1__1
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1__0__Impl_in_rule__StyleItem__Group_1__0685);
            rule__StyleItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StyleItem__Group_1__1_in_rule__StyleItem__Group_1__0688);
            rule__StyleItem__Group_1__1();

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
    // $ANTLR end "rule__StyleItem__Group_1__0"


    // $ANTLR start "rule__StyleItem__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:390:1: rule__StyleItem__Group_1__0__Impl : ( LeftParenthesis ) ;
    public final void rule__StyleItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:394:1: ( ( LeftParenthesis ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:395:1: ( LeftParenthesis )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:395:1: ( LeftParenthesis )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:396:1: LeftParenthesis
            {
             before(grammarAccess.getStyleItemAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rule__StyleItem__Group_1__0__Impl716); 
             after(grammarAccess.getStyleItemAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__StyleItem__Group_1__0__Impl"


    // $ANTLR start "rule__StyleItem__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:409:1: rule__StyleItem__Group_1__1 : rule__StyleItem__Group_1__1__Impl rule__StyleItem__Group_1__2 ;
    public final void rule__StyleItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:413:1: ( rule__StyleItem__Group_1__1__Impl rule__StyleItem__Group_1__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:414:2: rule__StyleItem__Group_1__1__Impl rule__StyleItem__Group_1__2
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1__1__Impl_in_rule__StyleItem__Group_1__1747);
            rule__StyleItem__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StyleItem__Group_1__2_in_rule__StyleItem__Group_1__1750);
            rule__StyleItem__Group_1__2();

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
    // $ANTLR end "rule__StyleItem__Group_1__1"


    // $ANTLR start "rule__StyleItem__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:421:1: rule__StyleItem__Group_1__1__Impl : ( ( rule__StyleItem__ArgsAssignment_1_1 ) ) ;
    public final void rule__StyleItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:425:1: ( ( ( rule__StyleItem__ArgsAssignment_1_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:426:1: ( ( rule__StyleItem__ArgsAssignment_1_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:426:1: ( ( rule__StyleItem__ArgsAssignment_1_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:427:1: ( rule__StyleItem__ArgsAssignment_1_1 )
            {
             before(grammarAccess.getStyleItemAccess().getArgsAssignment_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:428:1: ( rule__StyleItem__ArgsAssignment_1_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:428:2: rule__StyleItem__ArgsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StyleItem__ArgsAssignment_1_1_in_rule__StyleItem__Group_1__1__Impl777);
            rule__StyleItem__ArgsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleItemAccess().getArgsAssignment_1_1()); 

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
    // $ANTLR end "rule__StyleItem__Group_1__1__Impl"


    // $ANTLR start "rule__StyleItem__Group_1__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:438:1: rule__StyleItem__Group_1__2 : rule__StyleItem__Group_1__2__Impl rule__StyleItem__Group_1__3 ;
    public final void rule__StyleItem__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:442:1: ( rule__StyleItem__Group_1__2__Impl rule__StyleItem__Group_1__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:443:2: rule__StyleItem__Group_1__2__Impl rule__StyleItem__Group_1__3
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1__2__Impl_in_rule__StyleItem__Group_1__2807);
            rule__StyleItem__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StyleItem__Group_1__3_in_rule__StyleItem__Group_1__2810);
            rule__StyleItem__Group_1__3();

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
    // $ANTLR end "rule__StyleItem__Group_1__2"


    // $ANTLR start "rule__StyleItem__Group_1__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:450:1: rule__StyleItem__Group_1__2__Impl : ( ( rule__StyleItem__Group_1_2__0 )* ) ;
    public final void rule__StyleItem__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:454:1: ( ( ( rule__StyleItem__Group_1_2__0 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:455:1: ( ( rule__StyleItem__Group_1_2__0 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:455:1: ( ( rule__StyleItem__Group_1_2__0 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:456:1: ( rule__StyleItem__Group_1_2__0 )*
            {
             before(grammarAccess.getStyleItemAccess().getGroup_1_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:457:1: ( rule__StyleItem__Group_1_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Comma) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:457:2: rule__StyleItem__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__StyleItem__Group_1_2__0_in_rule__StyleItem__Group_1__2__Impl837);
            	    rule__StyleItem__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStyleItemAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__StyleItem__Group_1__2__Impl"


    // $ANTLR start "rule__StyleItem__Group_1__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:467:1: rule__StyleItem__Group_1__3 : rule__StyleItem__Group_1__3__Impl ;
    public final void rule__StyleItem__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:471:1: ( rule__StyleItem__Group_1__3__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:472:2: rule__StyleItem__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1__3__Impl_in_rule__StyleItem__Group_1__3868);
            rule__StyleItem__Group_1__3__Impl();

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
    // $ANTLR end "rule__StyleItem__Group_1__3"


    // $ANTLR start "rule__StyleItem__Group_1__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:478:1: rule__StyleItem__Group_1__3__Impl : ( RightParenthesis ) ;
    public final void rule__StyleItem__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:482:1: ( ( RightParenthesis ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:483:1: ( RightParenthesis )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:483:1: ( RightParenthesis )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:484:1: RightParenthesis
            {
             before(grammarAccess.getStyleItemAccess().getRightParenthesisKeyword_1_3()); 
            match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rule__StyleItem__Group_1__3__Impl896); 
             after(grammarAccess.getStyleItemAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__StyleItem__Group_1__3__Impl"


    // $ANTLR start "rule__StyleItem__Group_1_2__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:505:1: rule__StyleItem__Group_1_2__0 : rule__StyleItem__Group_1_2__0__Impl rule__StyleItem__Group_1_2__1 ;
    public final void rule__StyleItem__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:509:1: ( rule__StyleItem__Group_1_2__0__Impl rule__StyleItem__Group_1_2__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:510:2: rule__StyleItem__Group_1_2__0__Impl rule__StyleItem__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1_2__0__Impl_in_rule__StyleItem__Group_1_2__0935);
            rule__StyleItem__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StyleItem__Group_1_2__1_in_rule__StyleItem__Group_1_2__0938);
            rule__StyleItem__Group_1_2__1();

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
    // $ANTLR end "rule__StyleItem__Group_1_2__0"


    // $ANTLR start "rule__StyleItem__Group_1_2__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:517:1: rule__StyleItem__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__StyleItem__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:521:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:522:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:522:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:523:1: Comma
            {
             before(grammarAccess.getStyleItemAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__StyleItem__Group_1_2__0__Impl966); 
             after(grammarAccess.getStyleItemAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__StyleItem__Group_1_2__0__Impl"


    // $ANTLR start "rule__StyleItem__Group_1_2__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:536:1: rule__StyleItem__Group_1_2__1 : rule__StyleItem__Group_1_2__1__Impl ;
    public final void rule__StyleItem__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:540:1: ( rule__StyleItem__Group_1_2__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:541:2: rule__StyleItem__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__StyleItem__Group_1_2__1__Impl_in_rule__StyleItem__Group_1_2__1997);
            rule__StyleItem__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__StyleItem__Group_1_2__1"


    // $ANTLR start "rule__StyleItem__Group_1_2__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:547:1: rule__StyleItem__Group_1_2__1__Impl : ( ( rule__StyleItem__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__StyleItem__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:551:1: ( ( ( rule__StyleItem__ArgsAssignment_1_2_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:552:1: ( ( rule__StyleItem__ArgsAssignment_1_2_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:552:1: ( ( rule__StyleItem__ArgsAssignment_1_2_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:553:1: ( rule__StyleItem__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getStyleItemAccess().getArgsAssignment_1_2_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:554:1: ( rule__StyleItem__ArgsAssignment_1_2_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:554:2: rule__StyleItem__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__StyleItem__ArgsAssignment_1_2_1_in_rule__StyleItem__Group_1_2__1__Impl1024);
            rule__StyleItem__ArgsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStyleItemAccess().getArgsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__StyleItem__Group_1_2__1__Impl"


    // $ANTLR start "rule__Style__StyleItemsAssignment_1_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:569:1: rule__Style__StyleItemsAssignment_1_0 : ( ruleStyleItem ) ;
    public final void rule__Style__StyleItemsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:573:1: ( ( ruleStyleItem ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:574:1: ( ruleStyleItem )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:574:1: ( ruleStyleItem )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:575:1: ruleStyleItem
            {
             before(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleStyleItem_in_rule__Style__StyleItemsAssignment_1_01063);
            ruleStyleItem();

            state._fsp--;

             after(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Style__StyleItemsAssignment_1_0"


    // $ANTLR start "rule__Style__StyleItemsAssignment_1_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:584:1: rule__Style__StyleItemsAssignment_1_1_1 : ( ruleStyleItem ) ;
    public final void rule__Style__StyleItemsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:588:1: ( ( ruleStyleItem ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:589:1: ( ruleStyleItem )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:589:1: ( ruleStyleItem )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:590:1: ruleStyleItem
            {
             before(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleStyleItem_in_rule__Style__StyleItemsAssignment_1_1_11094);
            ruleStyleItem();

            state._fsp--;

             after(grammarAccess.getStyleAccess().getStyleItemsStyleItemParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Style__StyleItemsAssignment_1_1_1"


    // $ANTLR start "rule__StyleItem__NameAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:599:1: rule__StyleItem__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__StyleItem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:603:1: ( ( RULE_NAME ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:604:1: ( RULE_NAME )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:604:1: ( RULE_NAME )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:605:1: RULE_NAME
            {
             before(grammarAccess.getStyleItemAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__StyleItem__NameAssignment_01125); 
             after(grammarAccess.getStyleItemAccess().getNameNAMETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StyleItem__NameAssignment_0"


    // $ANTLR start "rule__StyleItem__ArgsAssignment_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:614:1: rule__StyleItem__ArgsAssignment_1_1 : ( RULE_NAME ) ;
    public final void rule__StyleItem__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:618:1: ( ( RULE_NAME ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:619:1: ( RULE_NAME )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:619:1: ( RULE_NAME )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:620:1: RULE_NAME
            {
             before(grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_1_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__StyleItem__ArgsAssignment_1_11156); 
             after(grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__StyleItem__ArgsAssignment_1_1"


    // $ANTLR start "rule__StyleItem__ArgsAssignment_1_2_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:629:1: rule__StyleItem__ArgsAssignment_1_2_1 : ( RULE_NAME ) ;
    public final void rule__StyleItem__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:633:1: ( ( RULE_NAME ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:634:1: ( RULE_NAME )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:634:1: ( RULE_NAME )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotStyleParser.g:635:1: RULE_NAME
            {
             before(grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_2_1_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__StyleItem__ArgsAssignment_1_2_11187); 
             after(grammarAccess.getStyleItemAccess().getArgsNAMETerminalRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__StyleItem__ArgsAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0_in_ruleStyle91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleItem_in_entryRuleStyleItem118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyleItem125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group__0_in_ruleStyleItem155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__0__Impl_in_rule__Style__Group__0195 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Style__Group__1_in_rule__Style__Group__0198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group__1__Impl_in_rule__Style__Group__1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group_1__0_in_rule__Style__Group__1__Impl283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group_1__0__Impl_in_rule__Style__Group_1__0318 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Style__Group_1__1_in_rule__Style__Group_1__0321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__StyleItemsAssignment_1_0_in_rule__Style__Group_1__0__Impl348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group_1__1__Impl_in_rule__Style__Group_1__1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group_1_1__0_in_rule__Style__Group_1__1__Impl405 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Style__Group_1_1__0__Impl_in_rule__Style__Group_1_1__0440 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Style__Group_1_1__1_in_rule__Style__Group_1_1__0443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Style__Group_1_1__0__Impl471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__Group_1_1__1__Impl_in_rule__Style__Group_1_1__1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Style__StyleItemsAssignment_1_1_1_in_rule__Style__Group_1_1__1__Impl529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group__0__Impl_in_rule__StyleItem__Group__0563 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__StyleItem__Group__1_in_rule__StyleItem__Group__0566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__NameAssignment_0_in_rule__StyleItem__Group__0__Impl593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group__1__Impl_in_rule__StyleItem__Group__1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__0_in_rule__StyleItem__Group__1__Impl650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__0__Impl_in_rule__StyleItem__Group_1__0685 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__1_in_rule__StyleItem__Group_1__0688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rule__StyleItem__Group_1__0__Impl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__1__Impl_in_rule__StyleItem__Group_1__1747 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__2_in_rule__StyleItem__Group_1__1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__ArgsAssignment_1_1_in_rule__StyleItem__Group_1__1__Impl777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__2__Impl_in_rule__StyleItem__Group_1__2807 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__3_in_rule__StyleItem__Group_1__2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1_2__0_in_rule__StyleItem__Group_1__2__Impl837 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1__3__Impl_in_rule__StyleItem__Group_1__3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightParenthesis_in_rule__StyleItem__Group_1__3__Impl896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1_2__0__Impl_in_rule__StyleItem__Group_1_2__0935 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1_2__1_in_rule__StyleItem__Group_1_2__0938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__StyleItem__Group_1_2__0__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__Group_1_2__1__Impl_in_rule__StyleItem__Group_1_2__1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StyleItem__ArgsAssignment_1_2_1_in_rule__StyleItem__Group_1_2__1__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleItem_in_rule__Style__StyleItemsAssignment_1_01063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStyleItem_in_rule__Style__StyleItemsAssignment_1_1_11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__StyleItem__NameAssignment_01125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__StyleItem__ArgsAssignment_1_11156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__StyleItem__ArgsAssignment_1_2_11187 = new BitSet(new long[]{0x0000000000000002L});

}