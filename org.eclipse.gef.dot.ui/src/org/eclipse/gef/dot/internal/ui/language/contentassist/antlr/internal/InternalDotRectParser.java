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
import org.eclipse.gef.dot.internal.language.services.DotRectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotRectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Comma", "RULE_DOUBLE", "RULE_WS"
    };
    public static final int Comma=4;
    public static final int RULE_DOUBLE=5;
    public static final int RULE_WS=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDotRectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotRectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotRectParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g"; }


     
     	private DotRectGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("Comma", "','");
     	}
     	
        public void setGrammarAccess(DotRectGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRect"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:64:1: entryRuleRect : ruleRect EOF ;
    public final void entryRuleRect() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:65:1: ( ruleRect EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:66:1: ruleRect EOF
            {
             before(grammarAccess.getRectRule()); 
            pushFollow(FOLLOW_ruleRect_in_entryRuleRect54);
            ruleRect();

            state._fsp--;

             after(grammarAccess.getRectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRect61); 

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
    // $ANTLR end "entryRuleRect"


    // $ANTLR start "ruleRect"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:73:1: ruleRect : ( ( rule__Rect__Group__0 ) ) ;
    public final void ruleRect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:77:5: ( ( ( rule__Rect__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:78:1: ( ( rule__Rect__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:78:1: ( ( rule__Rect__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:79:1: ( rule__Rect__Group__0 )
            {
             before(grammarAccess.getRectAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:80:1: ( rule__Rect__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:80:2: rule__Rect__Group__0
            {
            pushFollow(FOLLOW_rule__Rect__Group__0_in_ruleRect91);
            rule__Rect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getGroup()); 

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
    // $ANTLR end "ruleRect"


    // $ANTLR start "rule__Rect__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:94:1: rule__Rect__Group__0 : rule__Rect__Group__0__Impl rule__Rect__Group__1 ;
    public final void rule__Rect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:98:1: ( rule__Rect__Group__0__Impl rule__Rect__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:99:2: rule__Rect__Group__0__Impl rule__Rect__Group__1
            {
            pushFollow(FOLLOW_rule__Rect__Group__0__Impl_in_rule__Rect__Group__0125);
            rule__Rect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__1_in_rule__Rect__Group__0128);
            rule__Rect__Group__1();

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
    // $ANTLR end "rule__Rect__Group__0"


    // $ANTLR start "rule__Rect__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:106:1: rule__Rect__Group__0__Impl : ( ( rule__Rect__LlxAssignment_0 ) ) ;
    public final void rule__Rect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:110:1: ( ( ( rule__Rect__LlxAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:111:1: ( ( rule__Rect__LlxAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:111:1: ( ( rule__Rect__LlxAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:112:1: ( rule__Rect__LlxAssignment_0 )
            {
             before(grammarAccess.getRectAccess().getLlxAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:113:1: ( rule__Rect__LlxAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:113:2: rule__Rect__LlxAssignment_0
            {
            pushFollow(FOLLOW_rule__Rect__LlxAssignment_0_in_rule__Rect__Group__0__Impl155);
            rule__Rect__LlxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getLlxAssignment_0()); 

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
    // $ANTLR end "rule__Rect__Group__0__Impl"


    // $ANTLR start "rule__Rect__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:123:1: rule__Rect__Group__1 : rule__Rect__Group__1__Impl rule__Rect__Group__2 ;
    public final void rule__Rect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:127:1: ( rule__Rect__Group__1__Impl rule__Rect__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:128:2: rule__Rect__Group__1__Impl rule__Rect__Group__2
            {
            pushFollow(FOLLOW_rule__Rect__Group__1__Impl_in_rule__Rect__Group__1185);
            rule__Rect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__2_in_rule__Rect__Group__1188);
            rule__Rect__Group__2();

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
    // $ANTLR end "rule__Rect__Group__1"


    // $ANTLR start "rule__Rect__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:135:1: rule__Rect__Group__1__Impl : ( Comma ) ;
    public final void rule__Rect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:139:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:140:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:140:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:141:1: Comma
            {
             before(grammarAccess.getRectAccess().getCommaKeyword_1()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Rect__Group__1__Impl216); 
             after(grammarAccess.getRectAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__Rect__Group__1__Impl"


    // $ANTLR start "rule__Rect__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:154:1: rule__Rect__Group__2 : rule__Rect__Group__2__Impl rule__Rect__Group__3 ;
    public final void rule__Rect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:158:1: ( rule__Rect__Group__2__Impl rule__Rect__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:159:2: rule__Rect__Group__2__Impl rule__Rect__Group__3
            {
            pushFollow(FOLLOW_rule__Rect__Group__2__Impl_in_rule__Rect__Group__2247);
            rule__Rect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__3_in_rule__Rect__Group__2250);
            rule__Rect__Group__3();

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
    // $ANTLR end "rule__Rect__Group__2"


    // $ANTLR start "rule__Rect__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:166:1: rule__Rect__Group__2__Impl : ( ( rule__Rect__LlyAssignment_2 ) ) ;
    public final void rule__Rect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:170:1: ( ( ( rule__Rect__LlyAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:171:1: ( ( rule__Rect__LlyAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:171:1: ( ( rule__Rect__LlyAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:172:1: ( rule__Rect__LlyAssignment_2 )
            {
             before(grammarAccess.getRectAccess().getLlyAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:173:1: ( rule__Rect__LlyAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:173:2: rule__Rect__LlyAssignment_2
            {
            pushFollow(FOLLOW_rule__Rect__LlyAssignment_2_in_rule__Rect__Group__2__Impl277);
            rule__Rect__LlyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getLlyAssignment_2()); 

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
    // $ANTLR end "rule__Rect__Group__2__Impl"


    // $ANTLR start "rule__Rect__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:183:1: rule__Rect__Group__3 : rule__Rect__Group__3__Impl rule__Rect__Group__4 ;
    public final void rule__Rect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:187:1: ( rule__Rect__Group__3__Impl rule__Rect__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:188:2: rule__Rect__Group__3__Impl rule__Rect__Group__4
            {
            pushFollow(FOLLOW_rule__Rect__Group__3__Impl_in_rule__Rect__Group__3307);
            rule__Rect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__4_in_rule__Rect__Group__3310);
            rule__Rect__Group__4();

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
    // $ANTLR end "rule__Rect__Group__3"


    // $ANTLR start "rule__Rect__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:195:1: rule__Rect__Group__3__Impl : ( Comma ) ;
    public final void rule__Rect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:199:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:200:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:200:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:201:1: Comma
            {
             before(grammarAccess.getRectAccess().getCommaKeyword_3()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Rect__Group__3__Impl338); 
             after(grammarAccess.getRectAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Rect__Group__3__Impl"


    // $ANTLR start "rule__Rect__Group__4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:214:1: rule__Rect__Group__4 : rule__Rect__Group__4__Impl rule__Rect__Group__5 ;
    public final void rule__Rect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:218:1: ( rule__Rect__Group__4__Impl rule__Rect__Group__5 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:219:2: rule__Rect__Group__4__Impl rule__Rect__Group__5
            {
            pushFollow(FOLLOW_rule__Rect__Group__4__Impl_in_rule__Rect__Group__4369);
            rule__Rect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__5_in_rule__Rect__Group__4372);
            rule__Rect__Group__5();

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
    // $ANTLR end "rule__Rect__Group__4"


    // $ANTLR start "rule__Rect__Group__4__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:226:1: rule__Rect__Group__4__Impl : ( ( rule__Rect__UrxAssignment_4 ) ) ;
    public final void rule__Rect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:230:1: ( ( ( rule__Rect__UrxAssignment_4 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:231:1: ( ( rule__Rect__UrxAssignment_4 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:231:1: ( ( rule__Rect__UrxAssignment_4 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:232:1: ( rule__Rect__UrxAssignment_4 )
            {
             before(grammarAccess.getRectAccess().getUrxAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:233:1: ( rule__Rect__UrxAssignment_4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:233:2: rule__Rect__UrxAssignment_4
            {
            pushFollow(FOLLOW_rule__Rect__UrxAssignment_4_in_rule__Rect__Group__4__Impl399);
            rule__Rect__UrxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getUrxAssignment_4()); 

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
    // $ANTLR end "rule__Rect__Group__4__Impl"


    // $ANTLR start "rule__Rect__Group__5"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:243:1: rule__Rect__Group__5 : rule__Rect__Group__5__Impl rule__Rect__Group__6 ;
    public final void rule__Rect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:247:1: ( rule__Rect__Group__5__Impl rule__Rect__Group__6 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:248:2: rule__Rect__Group__5__Impl rule__Rect__Group__6
            {
            pushFollow(FOLLOW_rule__Rect__Group__5__Impl_in_rule__Rect__Group__5429);
            rule__Rect__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rect__Group__6_in_rule__Rect__Group__5432);
            rule__Rect__Group__6();

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
    // $ANTLR end "rule__Rect__Group__5"


    // $ANTLR start "rule__Rect__Group__5__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:255:1: rule__Rect__Group__5__Impl : ( Comma ) ;
    public final void rule__Rect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:259:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:260:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:260:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:261:1: Comma
            {
             before(grammarAccess.getRectAccess().getCommaKeyword_5()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Rect__Group__5__Impl460); 
             after(grammarAccess.getRectAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Rect__Group__5__Impl"


    // $ANTLR start "rule__Rect__Group__6"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:274:1: rule__Rect__Group__6 : rule__Rect__Group__6__Impl ;
    public final void rule__Rect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:278:1: ( rule__Rect__Group__6__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:279:2: rule__Rect__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Rect__Group__6__Impl_in_rule__Rect__Group__6491);
            rule__Rect__Group__6__Impl();

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
    // $ANTLR end "rule__Rect__Group__6"


    // $ANTLR start "rule__Rect__Group__6__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:285:1: rule__Rect__Group__6__Impl : ( ( rule__Rect__UryAssignment_6 ) ) ;
    public final void rule__Rect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:289:1: ( ( ( rule__Rect__UryAssignment_6 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:290:1: ( ( rule__Rect__UryAssignment_6 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:290:1: ( ( rule__Rect__UryAssignment_6 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:291:1: ( rule__Rect__UryAssignment_6 )
            {
             before(grammarAccess.getRectAccess().getUryAssignment_6()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:292:1: ( rule__Rect__UryAssignment_6 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:292:2: rule__Rect__UryAssignment_6
            {
            pushFollow(FOLLOW_rule__Rect__UryAssignment_6_in_rule__Rect__Group__6__Impl518);
            rule__Rect__UryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRectAccess().getUryAssignment_6()); 

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
    // $ANTLR end "rule__Rect__Group__6__Impl"


    // $ANTLR start "rule__Rect__LlxAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:317:1: rule__Rect__LlxAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__Rect__LlxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:321:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:322:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:322:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:323:1: RULE_DOUBLE
            {
             before(grammarAccess.getRectAccess().getLlxDOUBLETerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Rect__LlxAssignment_0567); 
             after(grammarAccess.getRectAccess().getLlxDOUBLETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rect__LlxAssignment_0"


    // $ANTLR start "rule__Rect__LlyAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:332:1: rule__Rect__LlyAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__Rect__LlyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:336:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:337:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:337:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:338:1: RULE_DOUBLE
            {
             before(grammarAccess.getRectAccess().getLlyDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Rect__LlyAssignment_2598); 
             after(grammarAccess.getRectAccess().getLlyDOUBLETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rect__LlyAssignment_2"


    // $ANTLR start "rule__Rect__UrxAssignment_4"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:347:1: rule__Rect__UrxAssignment_4 : ( RULE_DOUBLE ) ;
    public final void rule__Rect__UrxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:351:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:352:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:352:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:353:1: RULE_DOUBLE
            {
             before(grammarAccess.getRectAccess().getUrxDOUBLETerminalRuleCall_4_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Rect__UrxAssignment_4629); 
             after(grammarAccess.getRectAccess().getUrxDOUBLETerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rect__UrxAssignment_4"


    // $ANTLR start "rule__Rect__UryAssignment_6"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:362:1: rule__Rect__UryAssignment_6 : ( RULE_DOUBLE ) ;
    public final void rule__Rect__UryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:366:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:367:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:367:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotRectParser.g:368:1: RULE_DOUBLE
            {
             before(grammarAccess.getRectAccess().getUryDOUBLETerminalRuleCall_6_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Rect__UryAssignment_6660); 
             after(grammarAccess.getRectAccess().getUryDOUBLETerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rect__UryAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRect_in_entryRuleRect54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRect61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__0_in_ruleRect91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__0__Impl_in_rule__Rect__Group__0125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rect__Group__1_in_rule__Rect__Group__0128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__LlxAssignment_0_in_rule__Rect__Group__0__Impl155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__1__Impl_in_rule__Rect__Group__1185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rect__Group__2_in_rule__Rect__Group__1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Rect__Group__1__Impl216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__2__Impl_in_rule__Rect__Group__2247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rect__Group__3_in_rule__Rect__Group__2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__LlyAssignment_2_in_rule__Rect__Group__2__Impl277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__3__Impl_in_rule__Rect__Group__3307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rect__Group__4_in_rule__Rect__Group__3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Rect__Group__3__Impl338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__4__Impl_in_rule__Rect__Group__4369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rect__Group__5_in_rule__Rect__Group__4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__UrxAssignment_4_in_rule__Rect__Group__4__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__5__Impl_in_rule__Rect__Group__5429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rect__Group__6_in_rule__Rect__Group__5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Rect__Group__5__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__Group__6__Impl_in_rule__Rect__Group__6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rect__UryAssignment_6_in_rule__Rect__Group__6__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Rect__LlxAssignment_0567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Rect__LlyAssignment_2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Rect__UrxAssignment_4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Rect__UryAssignment_6660 = new BitSet(new long[]{0x0000000000000002L});

}