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
import org.eclipse.gef.dot.internal.language.services.DotPointGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotPointParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExclamationMark", "Comma", "RULE_DOUBLE", "RULE_WS"
    };
    public static final int RULE_WS=7;
    public static final int Comma=5;
    public static final int RULE_DOUBLE=6;
    public static final int EOF=-1;
    public static final int ExclamationMark=4;

    // delegates
    // delegators


        public InternalDotPointParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotPointParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotPointParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g"; }


     
     	private DotPointGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("Comma", "','");
     	}
     	
        public void setGrammarAccess(DotPointGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:65:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:66:1: ( rulePoint EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:67:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint54);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint61); 

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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:74:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:78:5: ( ( ( rule__Point__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:79:1: ( ( rule__Point__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:79:1: ( ( rule__Point__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:80:1: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:81:1: ( rule__Point__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:81:2: rule__Point__Group__0
            {
            pushFollow(FOLLOW_rule__Point__Group__0_in_rulePoint91);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "rule__Point__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:95:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:99:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:100:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__0125);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__1_in_rule__Point__Group__0128);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:107:1: rule__Point__Group__0__Impl : ( ( rule__Point__XAssignment_0 ) ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:111:1: ( ( ( rule__Point__XAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:112:1: ( ( rule__Point__XAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:112:1: ( ( rule__Point__XAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:113:1: ( rule__Point__XAssignment_0 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:114:1: ( rule__Point__XAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:114:2: rule__Point__XAssignment_0
            {
            pushFollow(FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl155);
            rule__Point__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getXAssignment_0()); 

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
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:124:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:128:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:129:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__1185);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__2_in_rule__Point__Group__1188);
            rule__Point__Group__2();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:136:1: rule__Point__Group__1__Impl : ( Comma ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:140:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:141:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:141:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:142:1: Comma
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_1()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Point__Group__1__Impl216); 
             after(grammarAccess.getPointAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Point__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:155:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:159:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:160:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__2247);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__3_in_rule__Point__Group__2250);
            rule__Point__Group__3();

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
    // $ANTLR end "rule__Point__Group__2"


    // $ANTLR start "rule__Point__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:167:1: rule__Point__Group__2__Impl : ( ( rule__Point__YAssignment_2 ) ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:171:1: ( ( ( rule__Point__YAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:172:1: ( ( rule__Point__YAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:172:1: ( ( rule__Point__YAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:173:1: ( rule__Point__YAssignment_2 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:174:1: ( rule__Point__YAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:174:2: rule__Point__YAssignment_2
            {
            pushFollow(FOLLOW_rule__Point__YAssignment_2_in_rule__Point__Group__2__Impl277);
            rule__Point__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getYAssignment_2()); 

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
    // $ANTLR end "rule__Point__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:184:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:188:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:189:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__3307);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__4_in_rule__Point__Group__3310);
            rule__Point__Group__4();

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
    // $ANTLR end "rule__Point__Group__3"


    // $ANTLR start "rule__Point__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:196:1: rule__Point__Group__3__Impl : ( ( rule__Point__Group_3__0 )? ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:200:1: ( ( ( rule__Point__Group_3__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:201:1: ( ( rule__Point__Group_3__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:201:1: ( ( rule__Point__Group_3__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:202:1: ( rule__Point__Group_3__0 )?
            {
             before(grammarAccess.getPointAccess().getGroup_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:203:1: ( rule__Point__Group_3__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Comma) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:203:2: rule__Point__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Point__Group_3__0_in_rule__Point__Group__3__Impl337);
                    rule__Point__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPointAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Point__Group__3__Impl"


    // $ANTLR start "rule__Point__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:213:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:217:1: ( rule__Point__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:218:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__4368);
            rule__Point__Group__4__Impl();

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
    // $ANTLR end "rule__Point__Group__4"


    // $ANTLR start "rule__Point__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:224:1: rule__Point__Group__4__Impl : ( ( rule__Point__InputOnlyAssignment_4 )? ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:228:1: ( ( ( rule__Point__InputOnlyAssignment_4 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:229:1: ( ( rule__Point__InputOnlyAssignment_4 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:229:1: ( ( rule__Point__InputOnlyAssignment_4 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:230:1: ( rule__Point__InputOnlyAssignment_4 )?
            {
             before(grammarAccess.getPointAccess().getInputOnlyAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:231:1: ( rule__Point__InputOnlyAssignment_4 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ExclamationMark) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:231:2: rule__Point__InputOnlyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Point__InputOnlyAssignment_4_in_rule__Point__Group__4__Impl395);
                    rule__Point__InputOnlyAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPointAccess().getInputOnlyAssignment_4()); 

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
    // $ANTLR end "rule__Point__Group__4__Impl"


    // $ANTLR start "rule__Point__Group_3__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:251:1: rule__Point__Group_3__0 : rule__Point__Group_3__0__Impl rule__Point__Group_3__1 ;
    public final void rule__Point__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:255:1: ( rule__Point__Group_3__0__Impl rule__Point__Group_3__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:256:2: rule__Point__Group_3__0__Impl rule__Point__Group_3__1
            {
            pushFollow(FOLLOW_rule__Point__Group_3__0__Impl_in_rule__Point__Group_3__0436);
            rule__Point__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group_3__1_in_rule__Point__Group_3__0439);
            rule__Point__Group_3__1();

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
    // $ANTLR end "rule__Point__Group_3__0"


    // $ANTLR start "rule__Point__Group_3__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:263:1: rule__Point__Group_3__0__Impl : ( Comma ) ;
    public final void rule__Point__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:267:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:268:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:268:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:269:1: Comma
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Point__Group_3__0__Impl467); 
             after(grammarAccess.getPointAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Point__Group_3__0__Impl"


    // $ANTLR start "rule__Point__Group_3__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:282:1: rule__Point__Group_3__1 : rule__Point__Group_3__1__Impl ;
    public final void rule__Point__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:286:1: ( rule__Point__Group_3__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:287:2: rule__Point__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Point__Group_3__1__Impl_in_rule__Point__Group_3__1498);
            rule__Point__Group_3__1__Impl();

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
    // $ANTLR end "rule__Point__Group_3__1"


    // $ANTLR start "rule__Point__Group_3__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:293:1: rule__Point__Group_3__1__Impl : ( ( rule__Point__ZAssignment_3_1 ) ) ;
    public final void rule__Point__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:297:1: ( ( ( rule__Point__ZAssignment_3_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:298:1: ( ( rule__Point__ZAssignment_3_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:298:1: ( ( rule__Point__ZAssignment_3_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:299:1: ( rule__Point__ZAssignment_3_1 )
            {
             before(grammarAccess.getPointAccess().getZAssignment_3_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:300:1: ( rule__Point__ZAssignment_3_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:300:2: rule__Point__ZAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Point__ZAssignment_3_1_in_rule__Point__Group_3__1__Impl525);
            rule__Point__ZAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getZAssignment_3_1()); 

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
    // $ANTLR end "rule__Point__Group_3__1__Impl"


    // $ANTLR start "rule__Point__XAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:315:1: rule__Point__XAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__Point__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:319:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:320:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:320:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:321:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getXDOUBLETerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__XAssignment_0564); 
             after(grammarAccess.getPointAccess().getXDOUBLETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Point__XAssignment_0"


    // $ANTLR start "rule__Point__YAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:330:1: rule__Point__YAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__Point__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:334:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:335:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:335:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:336:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getYDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__YAssignment_2595); 
             after(grammarAccess.getPointAccess().getYDOUBLETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Point__YAssignment_2"


    // $ANTLR start "rule__Point__ZAssignment_3_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:345:1: rule__Point__ZAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Point__ZAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:349:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:350:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:350:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:351:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getZDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__ZAssignment_3_1626); 
             after(grammarAccess.getPointAccess().getZDOUBLETerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Point__ZAssignment_3_1"


    // $ANTLR start "rule__Point__InputOnlyAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:360:1: rule__Point__InputOnlyAssignment_4 : ( ( ExclamationMark ) ) ;
    public final void rule__Point__InputOnlyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:364:1: ( ( ( ExclamationMark ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:365:1: ( ( ExclamationMark ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:365:1: ( ( ExclamationMark ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:366:1: ( ExclamationMark )
            {
             before(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:367:1: ( ExclamationMark )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotPointParser.g:368:1: ExclamationMark
            {
             before(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 
            match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Point__InputOnlyAssignment_4662); 
             after(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 

            }

             after(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 

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
    // $ANTLR end "rule__Point__InputOnlyAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__0_in_rulePoint91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__0125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Point__Group__1_in_rule__Point__Group__0128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__1185 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Point__Group__2_in_rule__Point__Group__1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Point__Group__1__Impl216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__2247 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Point__Group__3_in_rule__Point__Group__2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__YAssignment_2_in_rule__Point__Group__2__Impl277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__3307 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Point__Group__4_in_rule__Point__Group__3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__0_in_rule__Point__Group__3__Impl337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__InputOnlyAssignment_4_in_rule__Point__Group__4__Impl395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__0__Impl_in_rule__Point__Group_3__0436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Point__Group_3__1_in_rule__Point__Group_3__0439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Point__Group_3__0__Impl467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__1__Impl_in_rule__Point__Group_3__1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__ZAssignment_3_1_in_rule__Point__Group_3__1__Impl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__XAssignment_0564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__YAssignment_2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__ZAssignment_3_1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Point__InputOnlyAssignment_4662 = new BitSet(new long[]{0x0000000000000002L});

}