package org.eclipse.gef.dot.internal.ui.language.highlighting.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2016 itemis AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tamas Miklossy (itemis AG) - initial API and implementation (bug #461506)
 *     
 *******************************************************************************/
@SuppressWarnings("all")
public class CustomHighlightingInternalDotColorLexer extends Lexer {
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

      private boolean isHexValue = false;


    // delegates
    // delegators

    public CustomHighlightingInternalDotColorLexer() {;} 
    public CustomHighlightingInternalDotColorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomHighlightingInternalDotColorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g"; }

    // $ANTLR start "NumberSign"
    public final void mNumberSign() throws RecognitionException {
        try {
            int _type = NumberSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:27:12: ( '#' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:27:14: '#'
            {
            match('#'); 
            isHexValue = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NumberSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:29:7: ( ',' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:31:9: ( '/' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:31:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "RULE_COLOR_NUMBER"
    public final void mRULE_COLOR_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_COLOR_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:19: ({...}? => ( '.' ( RULE_DIGITS )+ | RULE_ZERO_OR_ONE ( '.' ( RULE_DIGITS )+ )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:21: {...}? => ( '.' ( RULE_DIGITS )+ | RULE_ZERO_OR_ONE ( '.' ( RULE_DIGITS )+ )? )
            {
            if ( !((!isHexValue)) ) {
                throw new FailedPredicateException(input, "RULE_COLOR_NUMBER", "!isHexValue");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:37: ( '.' ( RULE_DIGITS )+ | RULE_ZERO_OR_ONE ( '.' ( RULE_DIGITS )+ )? )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='0' && LA4_0<='1')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:38: '.' ( RULE_DIGITS )+
                    {
                    match('.'); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:42: ( RULE_DIGITS )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:42: RULE_DIGITS
                    	    {
                    	    mRULE_DIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:55: RULE_ZERO_OR_ONE ( '.' ( RULE_DIGITS )+ )?
                    {
                    mRULE_ZERO_OR_ONE(); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:72: ( '.' ( RULE_DIGITS )+ )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='.') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:73: '.' ( RULE_DIGITS )+
                            {
                            match('.'); 
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:77: ( RULE_DIGITS )+
                            int cnt2=0;
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:33:77: RULE_DIGITS
                            	    {
                            	    mRULE_DIGITS(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt2 >= 1 ) break loop2;
                                        EarlyExitException eee =
                                            new EarlyExitException(2, input);
                                        throw eee;
                                }
                                cnt2++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLOR_NUMBER"

    // $ANTLR start "RULE_HEXADECIMAL_DIGIT"
    public final void mRULE_HEXADECIMAL_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMAL_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:35:24: ( ( RULE_DIGITS | 'a' .. 'f' | 'A' .. 'F' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:35:26: ( RULE_DIGITS | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_DIGIT"

    // $ANTLR start "RULE_COLOR_STRING"
    public final void mRULE_COLOR_STRING() throws RecognitionException {
        try {
            int _type = RULE_COLOR_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:37:19: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | RULE_DIGITS )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:37:21: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | RULE_DIGITS )+
            {
            if ( !((!isHexValue)) ) {
                throw new FailedPredicateException(input, "RULE_COLOR_STRING", "!isHexValue");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:37:37: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_DIGITS )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLOR_STRING"

    // $ANTLR start "RULE_ZERO_OR_ONE"
    public final void mRULE_ZERO_OR_ONE() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:39:27: ( ( '0' | '1' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:39:29: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZERO_OR_ONE"

    // $ANTLR start "RULE_DIGITS"
    public final void mRULE_DIGITS() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:41:22: ( ( RULE_ZERO_OR_ONE | '2' .. '9' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:41:24: ( RULE_ZERO_OR_ONE | '2' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGITS"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:43:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:43:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:43:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:8: ( NumberSign | Comma | Solidus | RULE_COLOR_NUMBER | RULE_HEXADECIMAL_DIGIT | RULE_COLOR_STRING | RULE_WS )
        int alt7=7;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:10: NumberSign
                {
                mNumberSign(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:21: Comma
                {
                mComma(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:27: Solidus
                {
                mSolidus(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:35: RULE_COLOR_NUMBER
                {
                mRULE_COLOR_NUMBER(); 

                }
                break;
            case 5 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:53: RULE_HEXADECIMAL_DIGIT
                {
                mRULE_HEXADECIMAL_DIGIT(); 

                }
                break;
            case 6 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:76: RULE_COLOR_STRING
                {
                mRULE_COLOR_STRING(); 

                }
                break;
            case 7 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotColorLexer.g:1:94: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\5\uffff\1\11\1\12\5\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\1\56\1\60\2\uffff\2\0\1\uffff";
    static final String DFA7_maxS =
        "\1\172\4\uffff\2\172\2\uffff\2\0\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\6\1\7\2\uffff\1\5";
    static final String DFA7_specialS =
        "\1\0\4\uffff\1\1\1\4\2\uffff\1\2\1\3\1\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\10\2\uffff\1\10\22\uffff\1\10\2\uffff\1\1\10\uffff\1\2\1"+
            "\uffff\1\4\1\3\2\5\10\6\7\uffff\6\6\24\7\6\uffff\6\6\24\7",
            "",
            "",
            "",
            "",
            "\1\4\1\uffff\12\7\7\uffff\32\7\6\uffff\32\7",
            "\12\7\7\uffff\32\7\6\uffff\32\7",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NumberSign | Comma | Solidus | RULE_COLOR_NUMBER | RULE_HEXADECIMAL_DIGIT | RULE_COLOR_STRING | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0=='#') ) {s = 1;}

                        else if ( (LA7_0==',') ) {s = 2;}

                        else if ( (LA7_0=='/') ) {s = 3;}

                        else if ( (LA7_0=='.') && ((!isHexValue))) {s = 4;}

                        else if ( ((LA7_0>='0' && LA7_0<='1')) ) {s = 5;}

                        else if ( ((LA7_0>='2' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {s = 6;}

                        else if ( ((LA7_0>='G' && LA7_0<='Z')||(LA7_0>='g' && LA7_0<='z')) && ((!isHexValue))) {s = 7;}

                        else if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {s = 8;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_5=='.') && ((!isHexValue))) {s = 4;}

                        else if ( ((LA7_5>='0' && LA7_5<='9')||(LA7_5>='A' && LA7_5<='Z')||(LA7_5>='a' && LA7_5<='z')) && ((!isHexValue))) {s = 7;}

                        else s = 9;

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!isHexValue)) ) {s = 4;}

                        else if ( (!(((!isHexValue)))) ) {s = 11;}

                        else if ( ((!isHexValue)) ) {s = 7;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!(((!isHexValue)))) ) {s = 11;}

                        else if ( ((!isHexValue)) ) {s = 7;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA7_6>='0' && LA7_6<='9')||(LA7_6>='A' && LA7_6<='Z')||(LA7_6>='a' && LA7_6<='z')) && ((!isHexValue))) {s = 7;}

                        else s = 10;

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}