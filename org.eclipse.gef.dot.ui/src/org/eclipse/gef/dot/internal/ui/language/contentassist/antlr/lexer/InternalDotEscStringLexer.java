package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotEscStringLexer extends Lexer {
    public static final int L=4;
    public static final int N=5;
    public static final int R=6;
    public static final int RULE_CHAR=7;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalDotEscStringLexer() {;} 
    public InternalDotEscStringLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotEscStringLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g"; }

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            int _type = L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:19:3: ( '\\\\l' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:19:5: '\\\\l'
            {
            match("\\l"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:21:3: ( '\\\\n' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:21:5: '\\\\n'
            {
            match("\\n"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            int _type = R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:23:3: ( '\\\\r' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:23:5: '\\\\r'
            {
            match("\\r"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:27:11: ( . )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:27:13: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    public void mTokens() throws RecognitionException {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:1:8: ( L | N | R | RULE_CHAR )
        int alt1=4;
        int LA1_0 = input.LA(1);

        if ( (LA1_0=='\\') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                alt1=1;
                }
                break;
            case 'n':
                {
                alt1=2;
                }
                break;
            case 'r':
                {
                alt1=3;
                }
                break;
            default:
                alt1=4;}

        }
        else if ( ((LA1_0>='\u0000' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
            alt1=4;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;
        }
        switch (alt1) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:1:10: L
                {
                mL(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:1:12: N
                {
                mN(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:1:14: R
                {
                mR(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotEscStringLexer.g:1:16: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;

        }

    }


 

}