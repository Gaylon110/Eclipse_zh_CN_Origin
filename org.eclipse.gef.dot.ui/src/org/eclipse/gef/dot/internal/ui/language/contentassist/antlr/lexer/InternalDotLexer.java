package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLexer extends Lexer {
    public static final int HyphenMinusHyphenMinus=10;
    public static final int Node=9;
    public static final int RULE_STRING=22;
    public static final int RULE_NUMERAL=20;
    public static final int RULE_SL_COMMENT=29;
    public static final int Comma=12;
    public static final int EqualsSign=15;
    public static final int RULE_QUOTED_STRING=23;
    public static final int Strict=6;
    public static final int Colon=13;
    public static final int RightCurlyBracket=19;
    public static final int EOF=-1;
    public static final int RightSquareBracket=17;
    public static final int RULE_HTML_TAG_OPEN=24;
    public static final int RULE_WS=30;
    public static final int LeftCurlyBracket=18;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_COMPASS_PT=21;
    public static final int RULE_HTML_TAG_CLOSE=25;
    public static final int Semicolon=14;
    public static final int Graph=7;
    public static final int Subgraph=4;
    public static final int RULE_HTML_STRING=27;
    public static final int RULE_ML_COMMENT=28;
    public static final int LeftSquareBracket=16;
    public static final int Digraph=5;
    public static final int HyphenMinusGreaterThanSign=11;
    public static final int RULE_HTML_CHARS=26;
    public static final int Edge=8;

    // delegates
    // delegators

    public InternalDotLexer() {;} 
    public InternalDotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g"; }

    // $ANTLR start "Subgraph"
    public final void mSubgraph() throws RecognitionException {
        try {
            int _type = Subgraph;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:19:10: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:19:12: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "Subgraph"

    // $ANTLR start "Digraph"
    public final void mDigraph() throws RecognitionException {
        try {
            int _type = Digraph;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:21:9: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:21:11: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "Digraph"

    // $ANTLR start "Strict"
    public final void mStrict() throws RecognitionException {
        try {
            int _type = Strict;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:23:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:23:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "Strict"

    // $ANTLR start "Graph"
    public final void mGraph() throws RecognitionException {
        try {
            int _type = Graph;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:25:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:25:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "Graph"

    // $ANTLR start "Edge"
    public final void mEdge() throws RecognitionException {
        try {
            int _type = Edge;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:27:6: ( ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:27:8: ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "Edge"

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:29:6: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:29:8: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "Node"

    // $ANTLR start "HyphenMinusHyphenMinus"
    public final void mHyphenMinusHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinusHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:31:24: ( '-' '-' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:31:26: '-' '-'
            {
            match('-'); 
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusHyphenMinus"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:33:28: ( '-' '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:33:30: '-' '>'
            {
            match('-'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:35:7: ( ',' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:35:9: ','
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

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:37:7: ( ':' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:37:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:39:11: ( ';' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:39:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:41:12: ( '=' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:41:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:43:19: ( '[' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:43:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:45:20: ( ']' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:45:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:47:18: ( '{' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:47:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:49:19: ( '}' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:49:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_NUMERAL"
    public final void mRULE_NUMERAL() throws RecognitionException {
        try {
            int _type = RULE_NUMERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:14: ( ( ( '-' )? '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:16: ( ( '-' )? '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:16: ( ( '-' )? '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='-' && LA6_0<='.')) ) {
                alt6=1;
            }
            else if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:17: ( '-' )? '.' ( '0' .. '9' )+
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:17: ( '-' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:17: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    match('.'); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:26: ( '0' .. '9' )+
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
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:38: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:38: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:50: ( '.' ( '0' .. '9' )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:51: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:55: ( '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:53:56: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
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
    // $ANTLR end "RULE_NUMERAL"

    // $ANTLR start "RULE_COMPASS_PT"
    public final void mRULE_COMPASS_PT() throws RecognitionException {
        try {
            int _type = RULE_COMPASS_PT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:17: ( ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:19: ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:19: ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:20: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:24: 'ne'
                    {
                    match("ne"); 


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:29: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:33: 'se'
                    {
                    match("se"); 


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:38: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:42: 'sw'
                    {
                    match("sw"); 


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:47: 'w'
                    {
                    match('w'); 

                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:51: 'nw'
                    {
                    match("nw"); 


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:56: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:55:60: '_'
                    {
                    match('_'); 

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
    // $ANTLR end "RULE_COMPASS_PT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:57:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:57:15: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:57:58: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')||(LA8_0>='\u0080' && LA8_0<='\u00FF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_QUOTED_STRING"
    public final void mRULE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:59:20: ( '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* '\"' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:59:22: '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:59:26: ( '\\\\' '\"' | ~ ( '\"' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2=='\"') ) {
                        int LA9_4 = input.LA(3);

                        if ( ((LA9_4>='\u0000' && LA9_4<='\uFFFF')) ) {
                            alt9=1;
                        }

                        else {
                            alt9=2;
                        }

                    }
                    else if ( ((LA9_2>='\u0000' && LA9_2<='!')||(LA9_2>='#' && LA9_2<='\uFFFF')) ) {
                        alt9=2;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:59:27: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:59:36: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUOTED_STRING"

    // $ANTLR start "RULE_HTML_STRING"
    public final void mRULE_HTML_STRING() throws RecognitionException {
        try {
            int _type = RULE_HTML_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:18: ( '<' ( RULE_HTML_TAG_OPEN | RULE_HTML_TAG_CLOSE | RULE_HTML_CHARS )* '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:20: '<' ( RULE_HTML_TAG_OPEN | RULE_HTML_TAG_CLOSE | RULE_HTML_CHARS )* '>'
            {
            match('<'); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:24: ( RULE_HTML_TAG_OPEN | RULE_HTML_TAG_CLOSE | RULE_HTML_CHARS )*
            loop10:
            do {
                int alt10=4;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='>') ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>='\u0000' && LA10_1<='\uFFFF')) ) {
                        alt10=2;
                    }


                }
                else if ( (LA10_0=='<') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=';')||LA10_0=='='||(LA10_0>='?' && LA10_0<='\uFFFF')) ) {
                    alt10=3;
                }


                switch (alt10) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:25: RULE_HTML_TAG_OPEN
            	    {
            	    mRULE_HTML_TAG_OPEN(); 

            	    }
            	    break;
            	case 2 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:44: RULE_HTML_TAG_CLOSE
            	    {
            	    mRULE_HTML_TAG_CLOSE(); 

            	    }
            	    break;
            	case 3 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:61:64: RULE_HTML_CHARS
            	    {
            	    mRULE_HTML_CHARS(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_STRING"

    // $ANTLR start "RULE_HTML_TAG_OPEN"
    public final void mRULE_HTML_TAG_OPEN() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:63:29: ( '<' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:63:31: '<'
            {
            match('<'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_TAG_OPEN"

    // $ANTLR start "RULE_HTML_TAG_CLOSE"
    public final void mRULE_HTML_TAG_CLOSE() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:65:30: ( '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:65:32: '>'
            {
            match('>'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_TAG_CLOSE"

    // $ANTLR start "RULE_HTML_CHARS"
    public final void mRULE_HTML_CHARS() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:67:26: ( (~ ( ( '<' | '>' ) ) )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:67:28: (~ ( ( '<' | '>' ) ) )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:67:28: (~ ( ( '<' | '>' ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<=';')||LA11_0=='='||(LA11_0>='?' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:67:28: ~ ( ( '<' | '>' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_CHARS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:69:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:69:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:69:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:69:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:17: ( ( '//' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:19: ( '//' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:19: ( '//' | '#' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                alt13=1;
            }
            else if ( (LA13_0=='#') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:25: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:46: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:47: ( '\\r' )? '\\n'
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:47: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:71:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:73:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:73:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:73:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||(LA17_0>='\f' && LA17_0<='\r')||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:75:16: ( . )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:75:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:8: ( Subgraph | Digraph | Strict | Graph | Edge | Node | HyphenMinusHyphenMinus | HyphenMinusGreaterThanSign | Comma | Colon | Semicolon | EqualsSign | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_NUMERAL | RULE_COMPASS_PT | RULE_STRING | RULE_QUOTED_STRING | RULE_HTML_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=25;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:10: Subgraph
                {
                mSubgraph(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:19: Digraph
                {
                mDigraph(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:27: Strict
                {
                mStrict(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:34: Graph
                {
                mGraph(); 

                }
                break;
            case 5 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:40: Edge
                {
                mEdge(); 

                }
                break;
            case 6 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:45: Node
                {
                mNode(); 

                }
                break;
            case 7 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:50: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 8 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:73: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 9 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:100: Comma
                {
                mComma(); 

                }
                break;
            case 10 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:106: Colon
                {
                mColon(); 

                }
                break;
            case 11 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:112: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 12 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:122: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 13 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:133: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 14 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:151: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 15 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:170: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 16 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:187: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 17 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:205: RULE_NUMERAL
                {
                mRULE_NUMERAL(); 

                }
                break;
            case 18 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:218: RULE_COMPASS_PT
                {
                mRULE_COMPASS_PT(); 

                }
                break;
            case 19 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:234: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:246: RULE_QUOTED_STRING
                {
                mRULE_QUOTED_STRING(); 

                }
                break;
            case 21 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:265: RULE_HTML_STRING
                {
                mRULE_HTML_STRING(); 

                }
                break;
            case 22 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:282: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:298: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:314: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotLexer.g:1:322: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA7_eotS =
        "\1\uffff\1\11\1\uffff\1\14\11\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\137\1\145\1\uffff\1\145\11\uffff";
    static final String DFA7_maxS =
        "\2\167\1\uffff\1\167\11\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\3\1\uffff\1\7\1\11\1\12\1\2\1\10\1\1\1\4\1\6\1\5";
    static final String DFA7_specialS =
        "\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\3\uffff\1\5\1\uffff\1\2\10\uffff\1\1\4\uffff\1\3\3\uffff\1\4",
            "\1\7\21\uffff\1\10",
            "",
            "\1\12\21\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "55:19: ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\42\2\43\2\42\1\35\10\uffff\1\35\1\uffff\3\43\3\42\1\uffff\3\35\3\uffff\2\43\2\42\2\uffff\4\43\2\42\20\uffff\12\43\1\112\1\113\3\43\1\117\2\uffff\1\43\1\121\1\43\1\uffff\1\43\1\uffff\1\124\1\125\2\uffff";
    static final String DFA18_eofS =
        "\126\uffff";
    static final String DFA18_minS =
        "\1\0\1\60\1\111\1\122\2\60\1\55\10\uffff\1\60\1\uffff\1\117\1\104\1\124\3\60\1\uffff\2\0\1\52\3\uffff\1\102\1\122\2\60\2\uffff\1\107\1\101\1\107\1\104\2\60\20\uffff\1\107\1\111\1\122\1\120\2\105\1\122\1\103\1\101\1\110\2\60\1\101\1\124\1\120\1\60\2\uffff\1\120\1\60\1\110\1\uffff\1\110\1\uffff\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\u00ff\1\151\1\162\2\u00ff\1\76\10\uffff\1\71\1\uffff\1\157\1\144\1\165\3\u00ff\1\uffff\2\uffff\1\57\3\uffff\1\142\1\162\2\u00ff\2\uffff\1\147\1\141\1\147\1\144\2\u00ff\20\uffff\1\147\1\151\1\162\1\160\2\145\1\162\1\143\1\141\1\150\2\u00ff\1\141\1\164\1\160\1\u00ff\2\uffff\1\160\1\u00ff\1\150\1\uffff\1\150\1\uffff\2\u00ff\2\uffff";
    static final String DFA18_acceptS =
        "\7\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\21\6\uffff\1\23\3\uffff\1\27\1\30\1\31\4\uffff\1\22\1\23\6\uffff\1\7\1\10\1\21\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\24\1\25\1\26\1\27\1\30\20\uffff\1\5\1\6\3\uffff\1\4\1\uffff\1\3\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\1\2\27\uffff\1\1\1\0\74\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\35\2\34\1\35\2\34\22\35\1\34\1\35\1\30\1\33\10\35\1\7\1\6\1\17\1\32\12\20\1\10\1\11\1\31\1\12\3\35\3\27\1\2\1\22\1\27\1\3\6\27\1\21\4\27\1\23\7\27\1\13\1\35\1\14\1\35\1\26\1\35\2\27\1\25\1\2\1\4\1\27\1\3\6\27\1\5\4\27\1\1\3\27\1\24\3\27\1\15\1\35\1\16\2\35\u0080\27\uff00\35",
            "\12\43\7\uffff\23\43\1\37\1\36\5\43\4\uffff\1\43\1\uffff\4\43\1\40\16\43\1\37\1\36\1\43\1\41\3\43\5\uffff\u0080\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\12\43\7\uffff\3\43\1\46\26\43\4\uffff\1\43\1\uffff\3\43\1\46\26\43\5\uffff\u0080\43",
            "\12\43\7\uffff\16\43\1\47\13\43\4\uffff\1\43\1\uffff\4\43\1\50\11\43\1\47\7\43\1\51\3\43\5\uffff\u0080\43",
            "\1\52\1\54\17\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\54",
            "",
            "\1\47\37\uffff\1\47",
            "\1\46\37\uffff\1\46",
            "\1\37\1\36\36\uffff\1\37\1\36",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "",
            "\0\65",
            "\0\66",
            "\1\67\4\uffff\1\70",
            "",
            "",
            "",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "",
            "",
            "\1\74\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\110\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "",
            "",
            "\1\120\37\uffff\1\120",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\1\122\37\uffff\1\122",
            "",
            "\1\123\37\uffff\1\123",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080\43",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Subgraph | Digraph | Strict | Graph | Edge | Node | HyphenMinusHyphenMinus | HyphenMinusGreaterThanSign | Comma | Colon | Semicolon | EqualsSign | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_NUMERAL | RULE_COMPASS_PT | RULE_STRING | RULE_QUOTED_STRING | RULE_HTML_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_25 = input.LA(1);

                        s = -1;
                        if ( ((LA18_25>='\u0000' && LA18_25<='\uFFFF')) ) {s = 54;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_24 = input.LA(1);

                        s = -1;
                        if ( ((LA18_24>='\u0000' && LA18_24<='\uFFFF')) ) {s = 53;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='s') ) {s = 1;}

                        else if ( (LA18_0=='D'||LA18_0=='d') ) {s = 2;}

                        else if ( (LA18_0=='G'||LA18_0=='g') ) {s = 3;}

                        else if ( (LA18_0=='e') ) {s = 4;}

                        else if ( (LA18_0=='n') ) {s = 5;}

                        else if ( (LA18_0=='-') ) {s = 6;}

                        else if ( (LA18_0==',') ) {s = 7;}

                        else if ( (LA18_0==':') ) {s = 8;}

                        else if ( (LA18_0==';') ) {s = 9;}

                        else if ( (LA18_0=='=') ) {s = 10;}

                        else if ( (LA18_0=='[') ) {s = 11;}

                        else if ( (LA18_0==']') ) {s = 12;}

                        else if ( (LA18_0=='{') ) {s = 13;}

                        else if ( (LA18_0=='}') ) {s = 14;}

                        else if ( (LA18_0=='.') ) {s = 15;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 16;}

                        else if ( (LA18_0=='N') ) {s = 17;}

                        else if ( (LA18_0=='E') ) {s = 18;}

                        else if ( (LA18_0=='S') ) {s = 19;}

                        else if ( (LA18_0=='w') ) {s = 20;}

                        else if ( (LA18_0=='c') ) {s = 21;}

                        else if ( (LA18_0=='_') ) {s = 22;}

                        else if ( ((LA18_0>='A' && LA18_0<='C')||LA18_0=='F'||(LA18_0>='H' && LA18_0<='M')||(LA18_0>='O' && LA18_0<='R')||(LA18_0>='T' && LA18_0<='Z')||(LA18_0>='a' && LA18_0<='b')||LA18_0=='f'||(LA18_0>='h' && LA18_0<='m')||(LA18_0>='o' && LA18_0<='r')||(LA18_0>='t' && LA18_0<='v')||(LA18_0>='x' && LA18_0<='z')||(LA18_0>='\u0080' && LA18_0<='\u00FF')) ) {s = 23;}

                        else if ( (LA18_0=='\"') ) {s = 24;}

                        else if ( (LA18_0=='<') ) {s = 25;}

                        else if ( (LA18_0=='/') ) {s = 26;}

                        else if ( (LA18_0=='#') ) {s = 27;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||(LA18_0>='\f' && LA18_0<='\r')||LA18_0==' ') ) {s = 28;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||LA18_0=='\u000B'||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='+')||(LA18_0>='>' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='^'||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\u007F')||(LA18_0>='\u0100' && LA18_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}