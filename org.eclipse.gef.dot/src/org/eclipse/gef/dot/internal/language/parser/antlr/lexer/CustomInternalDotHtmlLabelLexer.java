package org.eclipse.gef.dot.internal.language.parser.antlr.lexer;

    // Hack: Use our own Lexer superclass by means of import.
    // Currently there is no other way to specify the superclass for the lexer.
    import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2017 itemis AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Matthias Wienand (itemis AG) - initial API and implementation
 *    
 *******************************************************************************/
@SuppressWarnings("all")
public class CustomInternalDotHtmlLabelLexer extends Lexer {
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

        boolean tagMode = false;


    // delegates
    // delegators

    public CustomInternalDotHtmlLabelLexer() {;} 
    public CustomInternalDotHtmlLabelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomInternalDotHtmlLabelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g"; }

    // $ANTLR start "RULE_HTML_COMMENT"
    public final void mRULE_HTML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_HTML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:18: ({...}? => ( '<!--' (~ ( '-' ) | '-' ~ ( '-' ) | '-' '-' ~ ( '>' ) )* '-->' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:20: {...}? => ( '<!--' (~ ( '-' ) | '-' ~ ( '-' ) | '-' '-' ~ ( '>' ) )* '-->' )
            {
            if ( !(( !tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_HTML_COMMENT", " !tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:36: ( '<!--' (~ ( '-' ) | '-' ~ ( '-' ) | '-' '-' ~ ( '>' ) )* '-->' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:38: '<!--' (~ ( '-' ) | '-' ~ ( '-' ) | '-' '-' ~ ( '>' ) )* '-->'
            {
            match("<!--"); 

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:45: (~ ( '-' ) | '-' ~ ( '-' ) | '-' '-' ~ ( '>' ) )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='-') ) {
                        int LA1_3 = input.LA(3);

                        if ( ((LA1_3>='\u0000' && LA1_3<='=')||(LA1_3>='?' && LA1_3<='\uFFFF')) ) {
                            alt1=3;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<=',')||(LA1_1>='.' && LA1_1<='\uFFFF')) ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=',')||(LA1_0>='.' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:46: ~ ( '-' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:53: '-' ~ ( '-' )
            	    {
            	    match('-'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=',')||(input.LA(1)>='.' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 3 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:27:64: '-' '-' ~ ( '>' )
            	    {
            	    match('-'); 
            	    match('-'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("-->"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_COMMENT"

    // $ANTLR start "RULE_TAG_START_CLOSE"
    public final void mRULE_TAG_START_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_TAG_START_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:29:21: ({...}? => ( '</' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:29:23: {...}? => ( '</' )
            {
            if ( !(( !tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_TAG_START_CLOSE", " !tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:29:39: ( '</' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:29:41: '</'
            {
            match("</"); 


            }

             tagMode = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_START_CLOSE"

    // $ANTLR start "RULE_TAG_START"
    public final void mRULE_TAG_START() throws RecognitionException {
        try {
            int _type = RULE_TAG_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:30:21: ({...}? => ( '<' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:30:23: {...}? => ( '<' )
            {
            if ( !(( !tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_TAG_START", " !tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:30:39: ( '<' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:30:41: '<'
            {
            match('<'); 

            }

             tagMode = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_START"

    // $ANTLR start "RULE_TAG_END"
    public final void mRULE_TAG_END() throws RecognitionException {
        try {
            int _type = RULE_TAG_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:31:21: ({...}? => ( '>' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:31:23: {...}? => ( '>' )
            {
            if ( !((  tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_TAG_END", "  tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:31:39: ( '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:31:41: '>'
            {
            match('>'); 

            }

             tagMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_END"

    // $ANTLR start "RULE_TAG_END_CLOSE"
    public final void mRULE_TAG_END_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_TAG_END_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:32:21: ({...}? => ( '/>' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:32:23: {...}? => ( '/>' )
            {
            if ( !((  tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_TAG_END_CLOSE", "  tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:32:39: ( '/>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:32:41: '/>'
            {
            match("/>"); 


            }

             tagMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_END_CLOSE"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:34:16: ({...}? => ( '=' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:34:18: {...}? => ( '=' )
            {
            if ( !(( tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_ASSIGN", " tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:34:33: ( '=' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:34:35: '='
            {
            match('='); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_ATTR_VALUE"
    public final void mRULE_ATTR_VALUE() throws RecognitionException {
        try {
            int _type = RULE_ATTR_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:16: ({...}? => ( '\"' ( options {greedy=false; } : . )* '\"' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:18: {...}? => ( '\"' ( options {greedy=false; } : . )* '\"' )
            {
            if ( !(( tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_ATTR_VALUE", " tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:33: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:35: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:39: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:35:67: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATTR_VALUE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:36:16: ({...}? => ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:36:18: {...}? => ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            {
            if ( !(( tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_ID", " tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:36:33: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:36:35: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:36:59: ( '_' | '-' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:37:16: ({...}? => ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:37:18: {...}? => ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            {
            if ( !(( tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_WS", " tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:37:33: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:37:35: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:37:35: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||(LA4_0>='\f' && LA4_0<='\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:10: ({...}? => ( (~ ( ( '<' | '\"' ) ) )+ ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:12: {...}? => ( (~ ( ( '<' | '\"' ) ) )+ )
            {
            if ( !(( !tagMode )) ) {
                throw new FailedPredicateException(input, "RULE_TEXT", " !tagMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:28: ( (~ ( ( '<' | '\"' ) ) )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:30: (~ ( ( '<' | '\"' ) ) )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:30: (~ ( ( '<' | '\"' ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<=';')||(LA5_0>='=' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:39:30: ~ ( ( '<' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<=';')||(input.LA(1)>='=' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    public void mTokens() throws RecognitionException {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:8: ( RULE_HTML_COMMENT | RULE_TAG_START_CLOSE | RULE_TAG_START | RULE_TAG_END | RULE_TAG_END_CLOSE | RULE_ASSIGN | RULE_ATTR_VALUE | RULE_ID | RULE_WS | RULE_TEXT )
        int alt6=10;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:10: RULE_HTML_COMMENT
                {
                mRULE_HTML_COMMENT(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:28: RULE_TAG_START_CLOSE
                {
                mRULE_TAG_START_CLOSE(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:49: RULE_TAG_START
                {
                mRULE_TAG_START(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:64: RULE_TAG_END
                {
                mRULE_TAG_END(); 

                }
                break;
            case 5 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:77: RULE_TAG_END_CLOSE
                {
                mRULE_TAG_END_CLOSE(); 

                }
                break;
            case 6 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:96: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 7 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:108: RULE_ATTR_VALUE
                {
                mRULE_ATTR_VALUE(); 

                }
                break;
            case 8 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:132: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot/src/org/eclipse/gef/dot/internal/language/parser/antlr/lexer/CustomInternalDotHtmlLabelLexer.g:1:140: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\13\1\14\1\10\1\16\1\uffff\1\17\1\21\5\uffff\1\23\2\uffff"+
        "\1\17\7\uffff";
    static final String DFA6_eofS =
        "\30\uffff";
    static final String DFA6_minS =
        "\1\0\1\41\1\0\1\76\1\0\1\uffff\2\0\4\uffff\6\0\1\uffff\1\0\4\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\57\1\uffff\1\76\1\uffff\1\uffff\2\uffff\4\uffff\1\0\1"+
        "\uffff\2\0\1\uffff\1\0\1\uffff\1\0\4\uffff";
    static final String DFA6_acceptS =
        "\5\uffff\1\7\2\uffff\1\12\1\1\1\2\1\3\6\uffff\1\4\1\uffff\1\6\1"+
        "\10\1\11\1\5";
    static final String DFA6_specialS =
        "\1\7\1\13\1\14\1\15\1\1\1\uffff\1\11\1\0\4\uffff\1\2\1\12\1\4\1"+
        "\5\1\10\1\6\1\uffff\1\3\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\10\2\7\1\10\2\7\22\10\1\7\1\10\1\5\14\10\1\3\14\10\1\1\1"+
            "\4\1\2\2\10\32\6\4\10\1\6\1\10\32\6\uff85\10",
            "\1\11\15\uffff\1\12",
            "\42\10\1\uffff\31\10\1\uffff\uffc3\10",
            "\1\15",
            "\42\10\1\uffff\31\10\1\uffff\uffc3\10",
            "",
            "\42\10\1\uffff\12\10\1\20\2\10\12\20\2\10\1\uffff\4\10\32\20"+
            "\4\10\1\20\1\10\32\20\uff85\10",
            "\11\10\2\7\1\10\2\7\22\10\1\7\1\10\1\uffff\31\10\1\uffff\uffc3"+
            "\10",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\42\10\1\uffff\31\10\1\uffff\uffc3\10",
            "\1\uffff",
            "\1\uffff",
            "\42\10\1\uffff\12\10\1\20\2\10\12\20\2\10\1\uffff\4\10\32\20"+
            "\4\10\1\20\1\10\32\20\uff85\10",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_HTML_COMMENT | RULE_TAG_START_CLOSE | RULE_TAG_START | RULE_TAG_END | RULE_TAG_END_CLOSE | RULE_ASSIGN | RULE_ATTR_VALUE | RULE_ID | RULE_WS | RULE_TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_7 = input.LA(1);

                         
                        int index6_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_7>='\t' && LA6_7<='\n')||(LA6_7>='\f' && LA6_7<='\r')||LA6_7==' ') && ((( tagMode )||( !tagMode )))) {s = 7;}

                        else if ( ((LA6_7>='\u0000' && LA6_7<='\b')||LA6_7=='\u000B'||(LA6_7>='\u000E' && LA6_7<='\u001F')||LA6_7=='!'||(LA6_7>='#' && LA6_7<=';')||(LA6_7>='=' && LA6_7<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 17;

                         
                        input.seek(index6_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_4 = input.LA(1);

                         
                        int index6_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_4>='\u0000' && LA6_4<='!')||(LA6_4>='#' && LA6_4<=';')||(LA6_4>='=' && LA6_4<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 14;

                         
                        input.seek(index6_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((  tagMode )) ) {s = 18;}

                        else if ( (( !tagMode )) ) {s = 8;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_19 = input.LA(1);

                         
                        int index6_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((  tagMode )) ) {s = 23;}

                        else if ( (( !tagMode )) ) {s = 8;}

                         
                        input.seek(index6_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_14 = input.LA(1);

                         
                        int index6_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( tagMode )) ) {s = 20;}

                        else if ( (( !tagMode )) ) {s = 8;}

                         
                        input.seek(index6_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_15 = input.LA(1);

                         
                        int index6_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( tagMode )) ) {s = 21;}

                        else if ( (( !tagMode )) ) {s = 8;}

                         
                        input.seek(index6_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_17 = input.LA(1);

                         
                        int index6_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( tagMode )) ) {s = 22;}

                        else if ( (( !tagMode )) ) {s = 8;}

                         
                        input.seek(index6_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0=='<') && (( !tagMode ))) {s = 1;}

                        else if ( (LA6_0=='>') && (((  tagMode )||( !tagMode )))) {s = 2;}

                        else if ( (LA6_0=='/') && (((  tagMode )||( !tagMode )))) {s = 3;}

                        else if ( (LA6_0=='=') && ((( tagMode )||( !tagMode )))) {s = 4;}

                        else if ( (LA6_0=='\"') && (( tagMode ))) {s = 5;}

                        else if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) && ((( tagMode )||( !tagMode )))) {s = 6;}

                        else if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') && ((( tagMode )||( !tagMode )))) {s = 7;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||LA6_0=='\u000B'||(LA6_0>='\u000E' && LA6_0<='\u001F')||LA6_0=='!'||(LA6_0>='#' && LA6_0<='.')||(LA6_0>='0' && LA6_0<=';')||(LA6_0>='?' && LA6_0<='@')||(LA6_0>='[' && LA6_0<='^')||LA6_0=='`'||(LA6_0>='{' && LA6_0<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_16 = input.LA(1);

                         
                        int index6_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_16=='-'||(LA6_16>='0' && LA6_16<='9')||(LA6_16>='A' && LA6_16<='Z')||LA6_16=='_'||(LA6_16>='a' && LA6_16<='z')) && ((( tagMode )||( !tagMode )))) {s = 16;}

                        else if ( ((LA6_16>='\u0000' && LA6_16<='!')||(LA6_16>='#' && LA6_16<=',')||(LA6_16>='.' && LA6_16<='/')||(LA6_16>=':' && LA6_16<=';')||(LA6_16>='=' && LA6_16<='@')||(LA6_16>='[' && LA6_16<='^')||LA6_16=='`'||(LA6_16>='{' && LA6_16<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 15;

                         
                        input.seek(index6_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_6 = input.LA(1);

                         
                        int index6_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_6=='-'||(LA6_6>='0' && LA6_6<='9')||(LA6_6>='A' && LA6_6<='Z')||LA6_6=='_'||(LA6_6>='a' && LA6_6<='z')) && ((( tagMode )||( !tagMode )))) {s = 16;}

                        else if ( ((LA6_6>='\u0000' && LA6_6<='!')||(LA6_6>='#' && LA6_6<=',')||(LA6_6>='.' && LA6_6<='/')||(LA6_6>=':' && LA6_6<=';')||(LA6_6>='=' && LA6_6<='@')||(LA6_6>='[' && LA6_6<='^')||LA6_6=='`'||(LA6_6>='{' && LA6_6<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 15;

                         
                        input.seek(index6_6);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_13 = input.LA(1);

                         
                        int index6_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_13>='\u0000' && LA6_13<='!')||(LA6_13>='#' && LA6_13<=';')||(LA6_13>='=' && LA6_13<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 19;

                         
                        input.seek(index6_13);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_1=='!') && (( !tagMode ))) {s = 9;}

                        else if ( (LA6_1=='/') && (( !tagMode ))) {s = 10;}

                        else s = 11;

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_2>='\u0000' && LA6_2<='!')||(LA6_2>='#' && LA6_2<=';')||(LA6_2>='=' && LA6_2<='\uFFFF')) && (( !tagMode ))) {s = 8;}

                        else s = 12;

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_3=='>') && (((  tagMode )||( !tagMode )))) {s = 13;}

                        else s = 8;

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}