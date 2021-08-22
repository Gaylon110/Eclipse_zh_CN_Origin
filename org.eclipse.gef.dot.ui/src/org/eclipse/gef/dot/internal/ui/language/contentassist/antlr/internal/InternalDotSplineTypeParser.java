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
import org.eclipse.gef.dot.internal.language.services.DotSplineTypeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotSplineTypeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExclamationMark", "Comma", "Semicolon", "E", "S", "RULE_DOUBLE", "RULE_WS"
    };
    public static final int E=7;
    public static final int RULE_WS=10;
    public static final int Semicolon=6;
    public static final int Comma=5;
    public static final int S=8;
    public static final int RULE_DOUBLE=9;
    public static final int EOF=-1;
    public static final int ExclamationMark=4;

    // delegates
    // delegators


        public InternalDotSplineTypeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotSplineTypeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotSplineTypeParser.tokenNames; }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g"; }


     
     	private DotSplineTypeGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("E", "'e'");
    		tokenNameToValue.put("S", "'s'");
     	}
     	
        public void setGrammarAccess(DotSplineTypeGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSplineType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:68:1: entryRuleSplineType : ruleSplineType EOF ;
    public final void entryRuleSplineType() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:69:1: ( ruleSplineType EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:70:1: ruleSplineType EOF
            {
             before(grammarAccess.getSplineTypeRule()); 
            pushFollow(FOLLOW_ruleSplineType_in_entryRuleSplineType54);
            ruleSplineType();

            state._fsp--;

             after(grammarAccess.getSplineTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplineType61); 

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
    // $ANTLR end "entryRuleSplineType"


    // $ANTLR start "ruleSplineType"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:77:1: ruleSplineType : ( ( rule__SplineType__Group__0 ) ) ;
    public final void ruleSplineType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:81:5: ( ( ( rule__SplineType__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:82:1: ( ( rule__SplineType__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:82:1: ( ( rule__SplineType__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:83:1: ( rule__SplineType__Group__0 )
            {
             before(grammarAccess.getSplineTypeAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:84:1: ( rule__SplineType__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:84:2: rule__SplineType__Group__0
            {
            pushFollow(FOLLOW_rule__SplineType__Group__0_in_ruleSplineType91);
            rule__SplineType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplineTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleSplineType"


    // $ANTLR start "entryRuleSpline"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:96:1: entryRuleSpline : ruleSpline EOF ;
    public final void entryRuleSpline() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:97:1: ( ruleSpline EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:98:1: ruleSpline EOF
            {
             before(grammarAccess.getSplineRule()); 
            pushFollow(FOLLOW_ruleSpline_in_entryRuleSpline118);
            ruleSpline();

            state._fsp--;

             after(grammarAccess.getSplineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpline125); 

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
    // $ANTLR end "entryRuleSpline"


    // $ANTLR start "ruleSpline"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:105:1: ruleSpline : ( ( rule__Spline__Group__0 ) ) ;
    public final void ruleSpline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:109:5: ( ( ( rule__Spline__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:110:1: ( ( rule__Spline__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:110:1: ( ( rule__Spline__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:111:1: ( rule__Spline__Group__0 )
            {
             before(grammarAccess.getSplineAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:112:1: ( rule__Spline__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:112:2: rule__Spline__Group__0
            {
            pushFollow(FOLLOW_rule__Spline__Group__0_in_ruleSpline155);
            rule__Spline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getGroup()); 

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
    // $ANTLR end "ruleSpline"


    // $ANTLR start "entryRulePoint"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:124:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:125:1: ( rulePoint EOF )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:126:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_rulePoint_in_entryRulePoint182);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoint189); 

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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:133:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:137:5: ( ( ( rule__Point__Group__0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:138:1: ( ( rule__Point__Group__0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:138:1: ( ( rule__Point__Group__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:139:1: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:140:1: ( rule__Point__Group__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:140:2: rule__Point__Group__0
            {
            pushFollow(FOLLOW_rule__Point__Group__0_in_rulePoint219);
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


    // $ANTLR start "rule__SplineType__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:154:1: rule__SplineType__Group__0 : rule__SplineType__Group__0__Impl rule__SplineType__Group__1 ;
    public final void rule__SplineType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:158:1: ( rule__SplineType__Group__0__Impl rule__SplineType__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:159:2: rule__SplineType__Group__0__Impl rule__SplineType__Group__1
            {
            pushFollow(FOLLOW_rule__SplineType__Group__0__Impl_in_rule__SplineType__Group__0253);
            rule__SplineType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplineType__Group__1_in_rule__SplineType__Group__0256);
            rule__SplineType__Group__1();

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
    // $ANTLR end "rule__SplineType__Group__0"


    // $ANTLR start "rule__SplineType__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:166:1: rule__SplineType__Group__0__Impl : ( ( rule__SplineType__SplinesAssignment_0 ) ) ;
    public final void rule__SplineType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:170:1: ( ( ( rule__SplineType__SplinesAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:171:1: ( ( rule__SplineType__SplinesAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:171:1: ( ( rule__SplineType__SplinesAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:172:1: ( rule__SplineType__SplinesAssignment_0 )
            {
             before(grammarAccess.getSplineTypeAccess().getSplinesAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:173:1: ( rule__SplineType__SplinesAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:173:2: rule__SplineType__SplinesAssignment_0
            {
            pushFollow(FOLLOW_rule__SplineType__SplinesAssignment_0_in_rule__SplineType__Group__0__Impl283);
            rule__SplineType__SplinesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSplineTypeAccess().getSplinesAssignment_0()); 

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
    // $ANTLR end "rule__SplineType__Group__0__Impl"


    // $ANTLR start "rule__SplineType__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:183:1: rule__SplineType__Group__1 : rule__SplineType__Group__1__Impl ;
    public final void rule__SplineType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:187:1: ( rule__SplineType__Group__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:188:2: rule__SplineType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SplineType__Group__1__Impl_in_rule__SplineType__Group__1313);
            rule__SplineType__Group__1__Impl();

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
    // $ANTLR end "rule__SplineType__Group__1"


    // $ANTLR start "rule__SplineType__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:194:1: rule__SplineType__Group__1__Impl : ( ( rule__SplineType__Group_1__0 )* ) ;
    public final void rule__SplineType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:198:1: ( ( ( rule__SplineType__Group_1__0 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:199:1: ( ( rule__SplineType__Group_1__0 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:199:1: ( ( rule__SplineType__Group_1__0 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:200:1: ( rule__SplineType__Group_1__0 )*
            {
             before(grammarAccess.getSplineTypeAccess().getGroup_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:201:1: ( rule__SplineType__Group_1__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Semicolon) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:201:2: rule__SplineType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SplineType__Group_1__0_in_rule__SplineType__Group__1__Impl340);
            	    rule__SplineType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSplineTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SplineType__Group__1__Impl"


    // $ANTLR start "rule__SplineType__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:215:1: rule__SplineType__Group_1__0 : rule__SplineType__Group_1__0__Impl rule__SplineType__Group_1__1 ;
    public final void rule__SplineType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:219:1: ( rule__SplineType__Group_1__0__Impl rule__SplineType__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:220:2: rule__SplineType__Group_1__0__Impl rule__SplineType__Group_1__1
            {
            pushFollow(FOLLOW_rule__SplineType__Group_1__0__Impl_in_rule__SplineType__Group_1__0375);
            rule__SplineType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SplineType__Group_1__1_in_rule__SplineType__Group_1__0378);
            rule__SplineType__Group_1__1();

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
    // $ANTLR end "rule__SplineType__Group_1__0"


    // $ANTLR start "rule__SplineType__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:227:1: rule__SplineType__Group_1__0__Impl : ( Semicolon ) ;
    public final void rule__SplineType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:231:1: ( ( Semicolon ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:232:1: ( Semicolon )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:232:1: ( Semicolon )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:233:1: Semicolon
            {
             before(grammarAccess.getSplineTypeAccess().getSemicolonKeyword_1_0()); 
            match(input,Semicolon,FOLLOW_Semicolon_in_rule__SplineType__Group_1__0__Impl406); 
             after(grammarAccess.getSplineTypeAccess().getSemicolonKeyword_1_0()); 

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
    // $ANTLR end "rule__SplineType__Group_1__0__Impl"


    // $ANTLR start "rule__SplineType__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:246:1: rule__SplineType__Group_1__1 : rule__SplineType__Group_1__1__Impl ;
    public final void rule__SplineType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:250:1: ( rule__SplineType__Group_1__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:251:2: rule__SplineType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SplineType__Group_1__1__Impl_in_rule__SplineType__Group_1__1437);
            rule__SplineType__Group_1__1__Impl();

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
    // $ANTLR end "rule__SplineType__Group_1__1"


    // $ANTLR start "rule__SplineType__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:257:1: rule__SplineType__Group_1__1__Impl : ( ( rule__SplineType__SplinesAssignment_1_1 ) ) ;
    public final void rule__SplineType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:261:1: ( ( ( rule__SplineType__SplinesAssignment_1_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:262:1: ( ( rule__SplineType__SplinesAssignment_1_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:262:1: ( ( rule__SplineType__SplinesAssignment_1_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:263:1: ( rule__SplineType__SplinesAssignment_1_1 )
            {
             before(grammarAccess.getSplineTypeAccess().getSplinesAssignment_1_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:264:1: ( rule__SplineType__SplinesAssignment_1_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:264:2: rule__SplineType__SplinesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SplineType__SplinesAssignment_1_1_in_rule__SplineType__Group_1__1__Impl464);
            rule__SplineType__SplinesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSplineTypeAccess().getSplinesAssignment_1_1()); 

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
    // $ANTLR end "rule__SplineType__Group_1__1__Impl"


    // $ANTLR start "rule__Spline__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:278:1: rule__Spline__Group__0 : rule__Spline__Group__0__Impl rule__Spline__Group__1 ;
    public final void rule__Spline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:282:1: ( rule__Spline__Group__0__Impl rule__Spline__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:283:2: rule__Spline__Group__0__Impl rule__Spline__Group__1
            {
            pushFollow(FOLLOW_rule__Spline__Group__0__Impl_in_rule__Spline__Group__0498);
            rule__Spline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group__1_in_rule__Spline__Group__0501);
            rule__Spline__Group__1();

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
    // $ANTLR end "rule__Spline__Group__0"


    // $ANTLR start "rule__Spline__Group__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:290:1: rule__Spline__Group__0__Impl : ( ( rule__Spline__Group_0__0 )? ) ;
    public final void rule__Spline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:294:1: ( ( ( rule__Spline__Group_0__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:295:1: ( ( rule__Spline__Group_0__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:295:1: ( ( rule__Spline__Group_0__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:296:1: ( rule__Spline__Group_0__0 )?
            {
             before(grammarAccess.getSplineAccess().getGroup_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:297:1: ( rule__Spline__Group_0__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==S) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:297:2: rule__Spline__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Spline__Group_0__0_in_rule__Spline__Group__0__Impl528);
                    rule__Spline__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplineAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Spline__Group__0__Impl"


    // $ANTLR start "rule__Spline__Group__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:307:1: rule__Spline__Group__1 : rule__Spline__Group__1__Impl rule__Spline__Group__2 ;
    public final void rule__Spline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:311:1: ( rule__Spline__Group__1__Impl rule__Spline__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:312:2: rule__Spline__Group__1__Impl rule__Spline__Group__2
            {
            pushFollow(FOLLOW_rule__Spline__Group__1__Impl_in_rule__Spline__Group__1559);
            rule__Spline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group__2_in_rule__Spline__Group__1562);
            rule__Spline__Group__2();

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
    // $ANTLR end "rule__Spline__Group__1"


    // $ANTLR start "rule__Spline__Group__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:319:1: rule__Spline__Group__1__Impl : ( ( rule__Spline__Group_1__0 )? ) ;
    public final void rule__Spline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:323:1: ( ( ( rule__Spline__Group_1__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:324:1: ( ( rule__Spline__Group_1__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:324:1: ( ( rule__Spline__Group_1__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:325:1: ( rule__Spline__Group_1__0 )?
            {
             before(grammarAccess.getSplineAccess().getGroup_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:326:1: ( rule__Spline__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==E) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:326:2: rule__Spline__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Spline__Group_1__0_in_rule__Spline__Group__1__Impl589);
                    rule__Spline__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSplineAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Spline__Group__1__Impl"


    // $ANTLR start "rule__Spline__Group__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:336:1: rule__Spline__Group__2 : rule__Spline__Group__2__Impl rule__Spline__Group__3 ;
    public final void rule__Spline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:340:1: ( rule__Spline__Group__2__Impl rule__Spline__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:341:2: rule__Spline__Group__2__Impl rule__Spline__Group__3
            {
            pushFollow(FOLLOW_rule__Spline__Group__2__Impl_in_rule__Spline__Group__2620);
            rule__Spline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group__3_in_rule__Spline__Group__2623);
            rule__Spline__Group__3();

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
    // $ANTLR end "rule__Spline__Group__2"


    // $ANTLR start "rule__Spline__Group__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:348:1: rule__Spline__Group__2__Impl : ( ( rule__Spline__ControlPointsAssignment_2 ) ) ;
    public final void rule__Spline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:352:1: ( ( ( rule__Spline__ControlPointsAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:353:1: ( ( rule__Spline__ControlPointsAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:353:1: ( ( rule__Spline__ControlPointsAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:354:1: ( rule__Spline__ControlPointsAssignment_2 )
            {
             before(grammarAccess.getSplineAccess().getControlPointsAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:355:1: ( rule__Spline__ControlPointsAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:355:2: rule__Spline__ControlPointsAssignment_2
            {
            pushFollow(FOLLOW_rule__Spline__ControlPointsAssignment_2_in_rule__Spline__Group__2__Impl650);
            rule__Spline__ControlPointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getControlPointsAssignment_2()); 

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
    // $ANTLR end "rule__Spline__Group__2__Impl"


    // $ANTLR start "rule__Spline__Group__3"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:365:1: rule__Spline__Group__3 : rule__Spline__Group__3__Impl ;
    public final void rule__Spline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:369:1: ( rule__Spline__Group__3__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:370:2: rule__Spline__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Spline__Group__3__Impl_in_rule__Spline__Group__3680);
            rule__Spline__Group__3__Impl();

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
    // $ANTLR end "rule__Spline__Group__3"


    // $ANTLR start "rule__Spline__Group__3__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:376:1: rule__Spline__Group__3__Impl : ( ( ( rule__Spline__Group_3__0 ) ) ( ( rule__Spline__Group_3__0 )* ) ) ;
    public final void rule__Spline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:380:1: ( ( ( ( rule__Spline__Group_3__0 ) ) ( ( rule__Spline__Group_3__0 )* ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:381:1: ( ( ( rule__Spline__Group_3__0 ) ) ( ( rule__Spline__Group_3__0 )* ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:381:1: ( ( ( rule__Spline__Group_3__0 ) ) ( ( rule__Spline__Group_3__0 )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:382:1: ( ( rule__Spline__Group_3__0 ) ) ( ( rule__Spline__Group_3__0 )* )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:382:1: ( ( rule__Spline__Group_3__0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:383:1: ( rule__Spline__Group_3__0 )
            {
             before(grammarAccess.getSplineAccess().getGroup_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:384:1: ( rule__Spline__Group_3__0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:384:2: rule__Spline__Group_3__0
            {
            pushFollow(FOLLOW_rule__Spline__Group_3__0_in_rule__Spline__Group__3__Impl709);
            rule__Spline__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getGroup_3()); 

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:387:1: ( ( rule__Spline__Group_3__0 )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:388:1: ( rule__Spline__Group_3__0 )*
            {
             before(grammarAccess.getSplineAccess().getGroup_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:389:1: ( rule__Spline__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOUBLE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:389:2: rule__Spline__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Spline__Group_3__0_in_rule__Spline__Group__3__Impl721);
            	    rule__Spline__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSplineAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Spline__Group__3__Impl"


    // $ANTLR start "rule__Spline__Group_0__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:408:1: rule__Spline__Group_0__0 : rule__Spline__Group_0__0__Impl rule__Spline__Group_0__1 ;
    public final void rule__Spline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:412:1: ( rule__Spline__Group_0__0__Impl rule__Spline__Group_0__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:413:2: rule__Spline__Group_0__0__Impl rule__Spline__Group_0__1
            {
            pushFollow(FOLLOW_rule__Spline__Group_0__0__Impl_in_rule__Spline__Group_0__0762);
            rule__Spline__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_0__1_in_rule__Spline__Group_0__0765);
            rule__Spline__Group_0__1();

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
    // $ANTLR end "rule__Spline__Group_0__0"


    // $ANTLR start "rule__Spline__Group_0__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:420:1: rule__Spline__Group_0__0__Impl : ( S ) ;
    public final void rule__Spline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:424:1: ( ( S ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:425:1: ( S )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:425:1: ( S )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:426:1: S
            {
             before(grammarAccess.getSplineAccess().getSKeyword_0_0()); 
            match(input,S,FOLLOW_S_in_rule__Spline__Group_0__0__Impl793); 
             after(grammarAccess.getSplineAccess().getSKeyword_0_0()); 

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
    // $ANTLR end "rule__Spline__Group_0__0__Impl"


    // $ANTLR start "rule__Spline__Group_0__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:439:1: rule__Spline__Group_0__1 : rule__Spline__Group_0__1__Impl rule__Spline__Group_0__2 ;
    public final void rule__Spline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:443:1: ( rule__Spline__Group_0__1__Impl rule__Spline__Group_0__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:444:2: rule__Spline__Group_0__1__Impl rule__Spline__Group_0__2
            {
            pushFollow(FOLLOW_rule__Spline__Group_0__1__Impl_in_rule__Spline__Group_0__1824);
            rule__Spline__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_0__2_in_rule__Spline__Group_0__1827);
            rule__Spline__Group_0__2();

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
    // $ANTLR end "rule__Spline__Group_0__1"


    // $ANTLR start "rule__Spline__Group_0__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:451:1: rule__Spline__Group_0__1__Impl : ( Comma ) ;
    public final void rule__Spline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:455:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:456:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:456:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:457:1: Comma
            {
             before(grammarAccess.getSplineAccess().getCommaKeyword_0_1()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Spline__Group_0__1__Impl855); 
             after(grammarAccess.getSplineAccess().getCommaKeyword_0_1()); 

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
    // $ANTLR end "rule__Spline__Group_0__1__Impl"


    // $ANTLR start "rule__Spline__Group_0__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:470:1: rule__Spline__Group_0__2 : rule__Spline__Group_0__2__Impl ;
    public final void rule__Spline__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:474:1: ( rule__Spline__Group_0__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:475:2: rule__Spline__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Spline__Group_0__2__Impl_in_rule__Spline__Group_0__2886);
            rule__Spline__Group_0__2__Impl();

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
    // $ANTLR end "rule__Spline__Group_0__2"


    // $ANTLR start "rule__Spline__Group_0__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:481:1: rule__Spline__Group_0__2__Impl : ( ( rule__Spline__StartpAssignment_0_2 ) ) ;
    public final void rule__Spline__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:485:1: ( ( ( rule__Spline__StartpAssignment_0_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:486:1: ( ( rule__Spline__StartpAssignment_0_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:486:1: ( ( rule__Spline__StartpAssignment_0_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:487:1: ( rule__Spline__StartpAssignment_0_2 )
            {
             before(grammarAccess.getSplineAccess().getStartpAssignment_0_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:488:1: ( rule__Spline__StartpAssignment_0_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:488:2: rule__Spline__StartpAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Spline__StartpAssignment_0_2_in_rule__Spline__Group_0__2__Impl913);
            rule__Spline__StartpAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getStartpAssignment_0_2()); 

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
    // $ANTLR end "rule__Spline__Group_0__2__Impl"


    // $ANTLR start "rule__Spline__Group_1__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:504:1: rule__Spline__Group_1__0 : rule__Spline__Group_1__0__Impl rule__Spline__Group_1__1 ;
    public final void rule__Spline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:508:1: ( rule__Spline__Group_1__0__Impl rule__Spline__Group_1__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:509:2: rule__Spline__Group_1__0__Impl rule__Spline__Group_1__1
            {
            pushFollow(FOLLOW_rule__Spline__Group_1__0__Impl_in_rule__Spline__Group_1__0949);
            rule__Spline__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_1__1_in_rule__Spline__Group_1__0952);
            rule__Spline__Group_1__1();

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
    // $ANTLR end "rule__Spline__Group_1__0"


    // $ANTLR start "rule__Spline__Group_1__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:516:1: rule__Spline__Group_1__0__Impl : ( E ) ;
    public final void rule__Spline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:520:1: ( ( E ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:521:1: ( E )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:521:1: ( E )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:522:1: E
            {
             before(grammarAccess.getSplineAccess().getEKeyword_1_0()); 
            match(input,E,FOLLOW_E_in_rule__Spline__Group_1__0__Impl980); 
             after(grammarAccess.getSplineAccess().getEKeyword_1_0()); 

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
    // $ANTLR end "rule__Spline__Group_1__0__Impl"


    // $ANTLR start "rule__Spline__Group_1__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:535:1: rule__Spline__Group_1__1 : rule__Spline__Group_1__1__Impl rule__Spline__Group_1__2 ;
    public final void rule__Spline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:539:1: ( rule__Spline__Group_1__1__Impl rule__Spline__Group_1__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:540:2: rule__Spline__Group_1__1__Impl rule__Spline__Group_1__2
            {
            pushFollow(FOLLOW_rule__Spline__Group_1__1__Impl_in_rule__Spline__Group_1__11011);
            rule__Spline__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_1__2_in_rule__Spline__Group_1__11014);
            rule__Spline__Group_1__2();

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
    // $ANTLR end "rule__Spline__Group_1__1"


    // $ANTLR start "rule__Spline__Group_1__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:547:1: rule__Spline__Group_1__1__Impl : ( Comma ) ;
    public final void rule__Spline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:551:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:552:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:552:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:553:1: Comma
            {
             before(grammarAccess.getSplineAccess().getCommaKeyword_1_1()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Spline__Group_1__1__Impl1042); 
             after(grammarAccess.getSplineAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__Spline__Group_1__1__Impl"


    // $ANTLR start "rule__Spline__Group_1__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:566:1: rule__Spline__Group_1__2 : rule__Spline__Group_1__2__Impl ;
    public final void rule__Spline__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:570:1: ( rule__Spline__Group_1__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:571:2: rule__Spline__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Spline__Group_1__2__Impl_in_rule__Spline__Group_1__21073);
            rule__Spline__Group_1__2__Impl();

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
    // $ANTLR end "rule__Spline__Group_1__2"


    // $ANTLR start "rule__Spline__Group_1__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:577:1: rule__Spline__Group_1__2__Impl : ( ( rule__Spline__EndpAssignment_1_2 ) ) ;
    public final void rule__Spline__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:581:1: ( ( ( rule__Spline__EndpAssignment_1_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:582:1: ( ( rule__Spline__EndpAssignment_1_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:582:1: ( ( rule__Spline__EndpAssignment_1_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:583:1: ( rule__Spline__EndpAssignment_1_2 )
            {
             before(grammarAccess.getSplineAccess().getEndpAssignment_1_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:584:1: ( rule__Spline__EndpAssignment_1_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:584:2: rule__Spline__EndpAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Spline__EndpAssignment_1_2_in_rule__Spline__Group_1__2__Impl1100);
            rule__Spline__EndpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getEndpAssignment_1_2()); 

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
    // $ANTLR end "rule__Spline__Group_1__2__Impl"


    // $ANTLR start "rule__Spline__Group_3__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:600:1: rule__Spline__Group_3__0 : rule__Spline__Group_3__0__Impl rule__Spline__Group_3__1 ;
    public final void rule__Spline__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:604:1: ( rule__Spline__Group_3__0__Impl rule__Spline__Group_3__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:605:2: rule__Spline__Group_3__0__Impl rule__Spline__Group_3__1
            {
            pushFollow(FOLLOW_rule__Spline__Group_3__0__Impl_in_rule__Spline__Group_3__01136);
            rule__Spline__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_3__1_in_rule__Spline__Group_3__01139);
            rule__Spline__Group_3__1();

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
    // $ANTLR end "rule__Spline__Group_3__0"


    // $ANTLR start "rule__Spline__Group_3__0__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:612:1: rule__Spline__Group_3__0__Impl : ( ( rule__Spline__ControlPointsAssignment_3_0 ) ) ;
    public final void rule__Spline__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:616:1: ( ( ( rule__Spline__ControlPointsAssignment_3_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:617:1: ( ( rule__Spline__ControlPointsAssignment_3_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:617:1: ( ( rule__Spline__ControlPointsAssignment_3_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:618:1: ( rule__Spline__ControlPointsAssignment_3_0 )
            {
             before(grammarAccess.getSplineAccess().getControlPointsAssignment_3_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:619:1: ( rule__Spline__ControlPointsAssignment_3_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:619:2: rule__Spline__ControlPointsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Spline__ControlPointsAssignment_3_0_in_rule__Spline__Group_3__0__Impl1166);
            rule__Spline__ControlPointsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getControlPointsAssignment_3_0()); 

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
    // $ANTLR end "rule__Spline__Group_3__0__Impl"


    // $ANTLR start "rule__Spline__Group_3__1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:629:1: rule__Spline__Group_3__1 : rule__Spline__Group_3__1__Impl rule__Spline__Group_3__2 ;
    public final void rule__Spline__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:633:1: ( rule__Spline__Group_3__1__Impl rule__Spline__Group_3__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:634:2: rule__Spline__Group_3__1__Impl rule__Spline__Group_3__2
            {
            pushFollow(FOLLOW_rule__Spline__Group_3__1__Impl_in_rule__Spline__Group_3__11196);
            rule__Spline__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Spline__Group_3__2_in_rule__Spline__Group_3__11199);
            rule__Spline__Group_3__2();

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
    // $ANTLR end "rule__Spline__Group_3__1"


    // $ANTLR start "rule__Spline__Group_3__1__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:641:1: rule__Spline__Group_3__1__Impl : ( ( rule__Spline__ControlPointsAssignment_3_1 ) ) ;
    public final void rule__Spline__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:645:1: ( ( ( rule__Spline__ControlPointsAssignment_3_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:646:1: ( ( rule__Spline__ControlPointsAssignment_3_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:646:1: ( ( rule__Spline__ControlPointsAssignment_3_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:647:1: ( rule__Spline__ControlPointsAssignment_3_1 )
            {
             before(grammarAccess.getSplineAccess().getControlPointsAssignment_3_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:648:1: ( rule__Spline__ControlPointsAssignment_3_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:648:2: rule__Spline__ControlPointsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Spline__ControlPointsAssignment_3_1_in_rule__Spline__Group_3__1__Impl1226);
            rule__Spline__ControlPointsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getControlPointsAssignment_3_1()); 

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
    // $ANTLR end "rule__Spline__Group_3__1__Impl"


    // $ANTLR start "rule__Spline__Group_3__2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:658:1: rule__Spline__Group_3__2 : rule__Spline__Group_3__2__Impl ;
    public final void rule__Spline__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:662:1: ( rule__Spline__Group_3__2__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:663:2: rule__Spline__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Spline__Group_3__2__Impl_in_rule__Spline__Group_3__21256);
            rule__Spline__Group_3__2__Impl();

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
    // $ANTLR end "rule__Spline__Group_3__2"


    // $ANTLR start "rule__Spline__Group_3__2__Impl"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:669:1: rule__Spline__Group_3__2__Impl : ( ( rule__Spline__ControlPointsAssignment_3_2 ) ) ;
    public final void rule__Spline__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:673:1: ( ( ( rule__Spline__ControlPointsAssignment_3_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:674:1: ( ( rule__Spline__ControlPointsAssignment_3_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:674:1: ( ( rule__Spline__ControlPointsAssignment_3_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:675:1: ( rule__Spline__ControlPointsAssignment_3_2 )
            {
             before(grammarAccess.getSplineAccess().getControlPointsAssignment_3_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:676:1: ( rule__Spline__ControlPointsAssignment_3_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:676:2: rule__Spline__ControlPointsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Spline__ControlPointsAssignment_3_2_in_rule__Spline__Group_3__2__Impl1283);
            rule__Spline__ControlPointsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSplineAccess().getControlPointsAssignment_3_2()); 

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
    // $ANTLR end "rule__Spline__Group_3__2__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:692:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:696:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:697:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__01319);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__1_in_rule__Point__Group__01322);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:704:1: rule__Point__Group__0__Impl : ( ( rule__Point__XAssignment_0 ) ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:708:1: ( ( ( rule__Point__XAssignment_0 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:709:1: ( ( rule__Point__XAssignment_0 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:709:1: ( ( rule__Point__XAssignment_0 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:710:1: ( rule__Point__XAssignment_0 )
            {
             before(grammarAccess.getPointAccess().getXAssignment_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:711:1: ( rule__Point__XAssignment_0 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:711:2: rule__Point__XAssignment_0
            {
            pushFollow(FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl1349);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:721:1: rule__Point__Group__1 : rule__Point__Group__1__Impl rule__Point__Group__2 ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:725:1: ( rule__Point__Group__1__Impl rule__Point__Group__2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:726:2: rule__Point__Group__1__Impl rule__Point__Group__2
            {
            pushFollow(FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__11379);
            rule__Point__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__2_in_rule__Point__Group__11382);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:733:1: rule__Point__Group__1__Impl : ( Comma ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:737:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:738:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:738:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:739:1: Comma
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_1()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Point__Group__1__Impl1410); 
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:752:1: rule__Point__Group__2 : rule__Point__Group__2__Impl rule__Point__Group__3 ;
    public final void rule__Point__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:756:1: ( rule__Point__Group__2__Impl rule__Point__Group__3 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:757:2: rule__Point__Group__2__Impl rule__Point__Group__3
            {
            pushFollow(FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__21441);
            rule__Point__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__3_in_rule__Point__Group__21444);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:764:1: rule__Point__Group__2__Impl : ( ( rule__Point__YAssignment_2 ) ) ;
    public final void rule__Point__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:768:1: ( ( ( rule__Point__YAssignment_2 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:769:1: ( ( rule__Point__YAssignment_2 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:769:1: ( ( rule__Point__YAssignment_2 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:770:1: ( rule__Point__YAssignment_2 )
            {
             before(grammarAccess.getPointAccess().getYAssignment_2()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:771:1: ( rule__Point__YAssignment_2 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:771:2: rule__Point__YAssignment_2
            {
            pushFollow(FOLLOW_rule__Point__YAssignment_2_in_rule__Point__Group__2__Impl1471);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:781:1: rule__Point__Group__3 : rule__Point__Group__3__Impl rule__Point__Group__4 ;
    public final void rule__Point__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:785:1: ( rule__Point__Group__3__Impl rule__Point__Group__4 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:786:2: rule__Point__Group__3__Impl rule__Point__Group__4
            {
            pushFollow(FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__31501);
            rule__Point__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group__4_in_rule__Point__Group__31504);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:793:1: rule__Point__Group__3__Impl : ( ( rule__Point__Group_3__0 )? ) ;
    public final void rule__Point__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:797:1: ( ( ( rule__Point__Group_3__0 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:798:1: ( ( rule__Point__Group_3__0 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:798:1: ( ( rule__Point__Group_3__0 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:799:1: ( rule__Point__Group_3__0 )?
            {
             before(grammarAccess.getPointAccess().getGroup_3()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:800:1: ( rule__Point__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Comma) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:800:2: rule__Point__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Point__Group_3__0_in_rule__Point__Group__3__Impl1531);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:810:1: rule__Point__Group__4 : rule__Point__Group__4__Impl ;
    public final void rule__Point__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:814:1: ( rule__Point__Group__4__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:815:2: rule__Point__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__41562);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:821:1: rule__Point__Group__4__Impl : ( ( rule__Point__InputOnlyAssignment_4 )? ) ;
    public final void rule__Point__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:825:1: ( ( ( rule__Point__InputOnlyAssignment_4 )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:826:1: ( ( rule__Point__InputOnlyAssignment_4 )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:826:1: ( ( rule__Point__InputOnlyAssignment_4 )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:827:1: ( rule__Point__InputOnlyAssignment_4 )?
            {
             before(grammarAccess.getPointAccess().getInputOnlyAssignment_4()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:828:1: ( rule__Point__InputOnlyAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ExclamationMark) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:828:2: rule__Point__InputOnlyAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Point__InputOnlyAssignment_4_in_rule__Point__Group__4__Impl1589);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:848:1: rule__Point__Group_3__0 : rule__Point__Group_3__0__Impl rule__Point__Group_3__1 ;
    public final void rule__Point__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:852:1: ( rule__Point__Group_3__0__Impl rule__Point__Group_3__1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:853:2: rule__Point__Group_3__0__Impl rule__Point__Group_3__1
            {
            pushFollow(FOLLOW_rule__Point__Group_3__0__Impl_in_rule__Point__Group_3__01630);
            rule__Point__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Point__Group_3__1_in_rule__Point__Group_3__01633);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:860:1: rule__Point__Group_3__0__Impl : ( Comma ) ;
    public final void rule__Point__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:864:1: ( ( Comma ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:865:1: ( Comma )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:865:1: ( Comma )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:866:1: Comma
            {
             before(grammarAccess.getPointAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_Comma_in_rule__Point__Group_3__0__Impl1661); 
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:879:1: rule__Point__Group_3__1 : rule__Point__Group_3__1__Impl ;
    public final void rule__Point__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:883:1: ( rule__Point__Group_3__1__Impl )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:884:2: rule__Point__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Point__Group_3__1__Impl_in_rule__Point__Group_3__11692);
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:890:1: rule__Point__Group_3__1__Impl : ( ( rule__Point__ZAssignment_3_1 ) ) ;
    public final void rule__Point__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:894:1: ( ( ( rule__Point__ZAssignment_3_1 ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:895:1: ( ( rule__Point__ZAssignment_3_1 ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:895:1: ( ( rule__Point__ZAssignment_3_1 ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:896:1: ( rule__Point__ZAssignment_3_1 )
            {
             before(grammarAccess.getPointAccess().getZAssignment_3_1()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:897:1: ( rule__Point__ZAssignment_3_1 )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:897:2: rule__Point__ZAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Point__ZAssignment_3_1_in_rule__Point__Group_3__1__Impl1719);
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


    // $ANTLR start "rule__SplineType__SplinesAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:912:1: rule__SplineType__SplinesAssignment_0 : ( ruleSpline ) ;
    public final void rule__SplineType__SplinesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:916:1: ( ( ruleSpline ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:917:1: ( ruleSpline )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:917:1: ( ruleSpline )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:918:1: ruleSpline
            {
             before(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSpline_in_rule__SplineType__SplinesAssignment_01758);
            ruleSpline();

            state._fsp--;

             after(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SplineType__SplinesAssignment_0"


    // $ANTLR start "rule__SplineType__SplinesAssignment_1_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:927:1: rule__SplineType__SplinesAssignment_1_1 : ( ruleSpline ) ;
    public final void rule__SplineType__SplinesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:931:1: ( ( ruleSpline ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:932:1: ( ruleSpline )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:932:1: ( ruleSpline )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:933:1: ruleSpline
            {
             before(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSpline_in_rule__SplineType__SplinesAssignment_1_11789);
            ruleSpline();

            state._fsp--;

             after(grammarAccess.getSplineTypeAccess().getSplinesSplineParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SplineType__SplinesAssignment_1_1"


    // $ANTLR start "rule__Spline__StartpAssignment_0_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:942:1: rule__Spline__StartpAssignment_0_2 : ( rulePoint ) ;
    public final void rule__Spline__StartpAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:946:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:947:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:947:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:948:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getStartpPointParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__StartpAssignment_0_21820);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getStartpPointParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Spline__StartpAssignment_0_2"


    // $ANTLR start "rule__Spline__EndpAssignment_1_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:957:1: rule__Spline__EndpAssignment_1_2 : ( rulePoint ) ;
    public final void rule__Spline__EndpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:961:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:962:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:962:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:963:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getEndpPointParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__EndpAssignment_1_21851);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getEndpPointParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Spline__EndpAssignment_1_2"


    // $ANTLR start "rule__Spline__ControlPointsAssignment_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:972:1: rule__Spline__ControlPointsAssignment_2 : ( rulePoint ) ;
    public final void rule__Spline__ControlPointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:976:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:977:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:977:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:978:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_21882);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Spline__ControlPointsAssignment_2"


    // $ANTLR start "rule__Spline__ControlPointsAssignment_3_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:987:1: rule__Spline__ControlPointsAssignment_3_0 : ( rulePoint ) ;
    public final void rule__Spline__ControlPointsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:991:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:992:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:992:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:993:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_01913);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Spline__ControlPointsAssignment_3_0"


    // $ANTLR start "rule__Spline__ControlPointsAssignment_3_1"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1002:1: rule__Spline__ControlPointsAssignment_3_1 : ( rulePoint ) ;
    public final void rule__Spline__ControlPointsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1006:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1007:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1007:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1008:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_11944);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Spline__ControlPointsAssignment_3_1"


    // $ANTLR start "rule__Spline__ControlPointsAssignment_3_2"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1017:1: rule__Spline__ControlPointsAssignment_3_2 : ( rulePoint ) ;
    public final void rule__Spline__ControlPointsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1021:1: ( ( rulePoint ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1022:1: ( rulePoint )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1022:1: ( rulePoint )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1023:1: rulePoint
            {
             before(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_21975);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getSplineAccess().getControlPointsPointParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Spline__ControlPointsAssignment_3_2"


    // $ANTLR start "rule__Point__XAssignment_0"
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1032:1: rule__Point__XAssignment_0 : ( RULE_DOUBLE ) ;
    public final void rule__Point__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1036:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1037:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1037:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1038:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getXDOUBLETerminalRuleCall_0_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__XAssignment_02006); 
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1047:1: rule__Point__YAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__Point__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1051:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1052:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1052:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1053:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getYDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__YAssignment_22037); 
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1062:1: rule__Point__ZAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Point__ZAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1066:1: ( ( RULE_DOUBLE ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1067:1: ( RULE_DOUBLE )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1067:1: ( RULE_DOUBLE )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1068:1: RULE_DOUBLE
            {
             before(grammarAccess.getPointAccess().getZDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Point__ZAssignment_3_12068); 
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
    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1077:1: rule__Point__InputOnlyAssignment_4 : ( ( ExclamationMark ) ) ;
    public final void rule__Point__InputOnlyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1081:1: ( ( ( ExclamationMark ) ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1082:1: ( ( ExclamationMark ) )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1082:1: ( ( ExclamationMark ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1083:1: ( ExclamationMark )
            {
             before(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1084:1: ( ExclamationMark )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/internal/InternalDotSplineTypeParser.g:1085:1: ExclamationMark
            {
             before(grammarAccess.getPointAccess().getInputOnlyExclamationMarkKeyword_4_0()); 
            match(input,ExclamationMark,FOLLOW_ExclamationMark_in_rule__Point__InputOnlyAssignment_42104); 
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


 

    public static final BitSet FOLLOW_ruleSplineType_in_entryRuleSplineType54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplineType61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__Group__0_in_ruleSplineType91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpline_in_entryRuleSpline118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpline125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group__0_in_ruleSpline155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_entryRulePoint182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoint189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__0_in_rulePoint219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__Group__0__Impl_in_rule__SplineType__Group__0253 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SplineType__Group__1_in_rule__SplineType__Group__0256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__SplinesAssignment_0_in_rule__SplineType__Group__0__Impl283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__Group__1__Impl_in_rule__SplineType__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__Group_1__0_in_rule__SplineType__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__SplineType__Group_1__0__Impl_in_rule__SplineType__Group_1__0375 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__SplineType__Group_1__1_in_rule__SplineType__Group_1__0378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rule__SplineType__Group_1__0__Impl406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__Group_1__1__Impl_in_rule__SplineType__Group_1__1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplineType__SplinesAssignment_1_1_in_rule__SplineType__Group_1__1__Impl464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group__0__Impl_in_rule__Spline__Group__0498 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group__1_in_rule__Spline__Group__0501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__0_in_rule__Spline__Group__0__Impl528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group__1__Impl_in_rule__Spline__Group__1559 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group__2_in_rule__Spline__Group__1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__0_in_rule__Spline__Group__1__Impl589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group__2__Impl_in_rule__Spline__Group__2620 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group__3_in_rule__Spline__Group__2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__ControlPointsAssignment_2_in_rule__Spline__Group__2__Impl650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group__3__Impl_in_rule__Spline__Group__3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__0_in_rule__Spline__Group__3__Impl709 = new BitSet(new long[]{0x0000000000000382L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__0_in_rule__Spline__Group__3__Impl721 = new BitSet(new long[]{0x0000000000000382L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__0__Impl_in_rule__Spline__Group_0__0762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__1_in_rule__Spline__Group_0__0765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_rule__Spline__Group_0__0__Impl793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__1__Impl_in_rule__Spline__Group_0__1824 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__2_in_rule__Spline__Group_0__1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Spline__Group_0__1__Impl855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_0__2__Impl_in_rule__Spline__Group_0__2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__StartpAssignment_0_2_in_rule__Spline__Group_0__2__Impl913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__0__Impl_in_rule__Spline__Group_1__0949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__1_in_rule__Spline__Group_1__0952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_E_in_rule__Spline__Group_1__0__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__1__Impl_in_rule__Spline__Group_1__11011 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__2_in_rule__Spline__Group_1__11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Spline__Group_1__1__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_1__2__Impl_in_rule__Spline__Group_1__21073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__EndpAssignment_1_2_in_rule__Spline__Group_1__2__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__0__Impl_in_rule__Spline__Group_3__01136 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__1_in_rule__Spline__Group_3__01139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__ControlPointsAssignment_3_0_in_rule__Spline__Group_3__0__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__1__Impl_in_rule__Spline__Group_3__11196 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__2_in_rule__Spline__Group_3__11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__ControlPointsAssignment_3_1_in_rule__Spline__Group_3__1__Impl1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__Group_3__2__Impl_in_rule__Spline__Group_3__21256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Spline__ControlPointsAssignment_3_2_in_rule__Spline__Group_3__2__Impl1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__0__Impl_in_rule__Point__Group__01319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Point__Group__1_in_rule__Point__Group__01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__XAssignment_0_in_rule__Point__Group__0__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__1__Impl_in_rule__Point__Group__11379 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Point__Group__2_in_rule__Point__Group__11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Point__Group__1__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__2__Impl_in_rule__Point__Group__21441 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Point__Group__3_in_rule__Point__Group__21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__YAssignment_2_in_rule__Point__Group__2__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__3__Impl_in_rule__Point__Group__31501 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Point__Group__4_in_rule__Point__Group__31504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__0_in_rule__Point__Group__3__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group__4__Impl_in_rule__Point__Group__41562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__InputOnlyAssignment_4_in_rule__Point__Group__4__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__0__Impl_in_rule__Point__Group_3__01630 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Point__Group_3__1_in_rule__Point__Group_3__01633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Point__Group_3__0__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__Group_3__1__Impl_in_rule__Point__Group_3__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Point__ZAssignment_3_1_in_rule__Point__Group_3__1__Impl1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpline_in_rule__SplineType__SplinesAssignment_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpline_in_rule__SplineType__SplinesAssignment_1_11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__StartpAssignment_0_21820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__EndpAssignment_1_21851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_21882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_01913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoint_in_rule__Spline__ControlPointsAssignment_3_21975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__XAssignment_02006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__YAssignment_22037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Point__ZAssignment_3_12068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ExclamationMark_in_rule__Point__InputOnlyAssignment_42104 = new BitSet(new long[]{0x0000000000000002L});

}