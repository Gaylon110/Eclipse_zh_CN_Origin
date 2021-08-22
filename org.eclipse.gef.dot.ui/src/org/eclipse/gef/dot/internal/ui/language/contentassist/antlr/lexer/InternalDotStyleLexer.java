package org.eclipse.gef.dot.internal.ui.language.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotStyleLexer extends Lexer {
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

    public InternalDotStyleLexer() {;} 
    public InternalDotStyleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotStyleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g"; }

    // $ANTLR start "Diagonals"
    public final void mDiagonals() throws RecognitionException {
        try {
            int _type = Diagonals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:19:11: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:19:13: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' )
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

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
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

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "Diagonals"

    // $ANTLR start "Rounded"
    public final void mRounded() throws RecognitionException {
        try {
            int _type = Rounded;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:21:9: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:21:11: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "Rounded"

    // $ANTLR start "Striped"
    public final void mStriped() throws RecognitionException {
        try {
            int _type = Striped;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:23:9: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:23:11: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'D' | 'd' )
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

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "Striped"

    // $ANTLR start "Tapered"
    public final void mTapered() throws RecognitionException {
        try {
            int _type = Tapered;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:25:9: ( ( 'T' | 't' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:25:11: ( 'T' | 't' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tapered"

    // $ANTLR start "Dashed"
    public final void mDashed() throws RecognitionException {
        try {
            int _type = Dashed;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:27:8: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:27:10: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dashed"

    // $ANTLR start "Dotted"
    public final void mDotted() throws RecognitionException {
        try {
            int _type = Dotted;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:29:8: ( ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:29:10: ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dotted"

    // $ANTLR start "Filled"
    public final void mFilled() throws RecognitionException {
        try {
            int _type = Filled;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:31:8: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:31:10: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "Filled"

    // $ANTLR start "Radial"
    public final void mRadial() throws RecognitionException {
        try {
            int _type = Radial;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:33:8: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:33:10: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
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

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "Radial"

    // $ANTLR start "Wedged"
    public final void mWedged() throws RecognitionException {
        try {
            int _type = Wedged;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:35:8: ( ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:35:10: ( 'W' | 'w' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "Wedged"

    // $ANTLR start "Invis"
    public final void mInvis() throws RecognitionException {
        try {
            int _type = Invis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:37:7: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:37:9: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
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

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "Invis"

    // $ANTLR start "Solid"
    public final void mSolid() throws RecognitionException {
        try {
            int _type = Solid;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:39:7: ( ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:39:9: ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "Solid"

    // $ANTLR start "Bold"
    public final void mBold() throws RecognitionException {
        try {
            int _type = Bold;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:41:6: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:41:8: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
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

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bold"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:43:17: ( '(' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:43:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:45:18: ( ')' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:45:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:47:7: ( ',' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:47:9: ','
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:51:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:51:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:53:11: ( (~ ( ( RULE_WS | '(' | ')' | ',' ) ) )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:53:13: (~ ( ( RULE_WS | '(' | ')' | ',' ) ) )*
            {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:53:13: (~ ( ( RULE_WS | '(' | ')' | ',' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\'')||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='-' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:53:13: ~ ( ( RULE_WS | '(' | ')' | ',' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFF') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    public void mTokens() throws RecognitionException {
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:8: ( Diagonals | Rounded | Striped | Tapered | Dashed | Dotted | Filled | Radial | Wedged | Invis | Solid | Bold | LeftParenthesis | RightParenthesis | Comma | RULE_WS | RULE_NAME )
        int alt2=17;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:10: Diagonals
                {
                mDiagonals(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:20: Rounded
                {
                mRounded(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:28: Striped
                {
                mStriped(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:36: Tapered
                {
                mTapered(); 

                }
                break;
            case 5 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:44: Dashed
                {
                mDashed(); 

                }
                break;
            case 6 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:51: Dotted
                {
                mDotted(); 

                }
                break;
            case 7 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:58: Filled
                {
                mFilled(); 

                }
                break;
            case 8 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:65: Radial
                {
                mRadial(); 

                }
                break;
            case 9 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:72: Wedged
                {
                mWedged(); 

                }
                break;
            case 10 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:79: Invis
                {
                mInvis(); 

                }
                break;
            case 11 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:85: Solid
                {
                mSolid(); 

                }
                break;
            case 12 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:91: Bold
                {
                mBold(); 

                }
                break;
            case 13 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:96: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 14 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:112: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 15 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:129: Comma
                {
                mComma(); 

                }
                break;
            case 16 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src-gen/org/eclipse/gef/dot/internal/ui/language/contentassist/antlr/lexer/InternalDotStyleLexer.g:1:143: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\11\15\5\uffff\43\15\1\75\6\15\1\104\3\15\1\110\1\uffff\1\15\1\112\1\113\1\15\1\115\1\15\1\uffff\1\15\1\120\1\121\1\uffff\1\15\2\uffff\1\123\1\uffff\1\124\1\125\2\uffff\1\15\3\uffff\1\127\1\uffff";
    static final String DFA2_eofS =
        "\130\uffff";
    static final String DFA2_minS =
        "\1\11\2\101\1\117\1\101\1\111\1\105\1\116\1\117\5\uffff\1\101\1\123\1\124\1\125\1\104\1\122\1\114\1\120\1\114\1\104\1\126\1\114\1\107\1\110\1\124\1\116\3\111\1\105\1\114\1\107\1\111\1\104\1\117\2\105\1\104\1\101\1\120\1\104\1\122\2\105\1\123\1\0\1\116\2\104\1\105\1\114\1\105\1\0\1\105\2\104\1\0\1\uffff\1\101\2\0\1\104\1\0\1\104\1\uffff\1\104\2\0\1\uffff\1\114\2\uffff\1\0\1\uffff\2\0\2\uffff\1\123\3\uffff\1\0\1\uffff";
    static final String DFA2_maxS =
        "\1\167\2\157\1\164\1\141\1\151\1\145\1\156\1\157\5\uffff\1\141\1\163\1\164\1\165\1\144\1\162\1\154\1\160\1\154\1\144\1\166\1\154\1\147\1\150\1\164\1\156\3\151\1\145\1\154\1\147\1\151\1\144\1\157\2\145\1\144\1\141\1\160\1\144\1\162\2\145\1\163\1\uffff\1\156\2\144\1\145\1\154\1\145\1\uffff\1\145\2\144\1\uffff\1\uffff\1\141\2\uffff\1\144\1\uffff\1\144\1\uffff\1\144\2\uffff\1\uffff\1\154\2\uffff\1\uffff\1\uffff\2\uffff\2\uffff\1\163\3\uffff\1\uffff\1\uffff";
    static final String DFA2_acceptS =
        "\11\uffff\1\15\1\16\1\17\1\20\1\21\57\uffff\1\14\6\uffff\1\13\3\uffff\1\12\1\uffff\1\5\1\6\1\uffff\1\10\2\uffff\1\7\1\11\1\uffff\1\2\1\3\1\4\1\uffff\1\1";
    static final String DFA2_specialS =
        "\61\uffff\1\7\6\uffff\1\5\3\uffff\1\4\2\uffff\1\6\1\10\1\uffff\1\0\3\uffff\1\12\1\2\4\uffff\1\13\1\uffff\1\1\1\3\6\uffff\1\11\1\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\7\uffff\1\11\1\12\2\uffff\1\13\25\uffff\1\10\1\uffff\1\1\1\uffff\1\5\2\uffff\1\7\10\uffff\1\2\1\3\1\4\2\uffff\1\6\12\uffff\1\10\1\uffff\1\1\1\uffff\1\5\2\uffff\1\7\10\uffff\1\2\1\3\1\4\2\uffff\1\6",
            "\1\17\7\uffff\1\16\5\uffff\1\20\21\uffff\1\17\7\uffff\1\16\5\uffff\1\20",
            "\1\22\15\uffff\1\21\21\uffff\1\22\15\uffff\1\21",
            "\1\24\4\uffff\1\23\32\uffff\1\24\4\uffff\1\23",
            "\1\25\37\uffff\1\25",
            "\1\26\37\uffff\1\26",
            "\1\27\37\uffff\1\27",
            "\1\30\37\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "\1\32\37\uffff\1\32",
            "\1\33\37\uffff\1\33",
            "\1\34\37\uffff\1\34",
            "\1\35\37\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "\1\37\37\uffff\1\37",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54\37\uffff\1\54",
            "\1\55\37\uffff\1\55",
            "\1\56\37\uffff\1\56",
            "\1\57\37\uffff\1\57",
            "\1\60\37\uffff\1\60",
            "\1\61\37\uffff\1\61",
            "\1\62\37\uffff\1\62",
            "\1\63\37\uffff\1\63",
            "\1\64\37\uffff\1\64",
            "\1\65\37\uffff\1\65",
            "\1\66\37\uffff\1\66",
            "\1\67\37\uffff\1\67",
            "\1\70\37\uffff\1\70",
            "\1\71\37\uffff\1\71",
            "\1\72\37\uffff\1\72",
            "\1\73\37\uffff\1\73",
            "\1\74\37\uffff\1\74",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\1\100\37\uffff\1\100",
            "\1\101\37\uffff\1\101",
            "\1\102\37\uffff\1\102",
            "\1\103\37\uffff\1\103",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\1\105\37\uffff\1\105",
            "\1\106\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "",
            "\1\111\37\uffff\1\111",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\1\114\37\uffff\1\114",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\1\116\37\uffff\1\116",
            "",
            "\1\117\37\uffff\1\117",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "",
            "\1\122\37\uffff\1\122",
            "",
            "",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            "",
            "",
            "\1\126\37\uffff\1\126",
            "",
            "",
            "",
            "\11\15\2\uffff\2\15\1\uffff\22\15\1\uffff\7\15\2\uffff\2\15\1\uffff\uffd3\15",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Diagonals | Rounded | Striped | Tapered | Dashed | Dotted | Filled | Radial | Wedged | Invis | Solid | Bold | LeftParenthesis | RightParenthesis | Comma | RULE_WS | RULE_NAME );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_66 = input.LA(1);

                        s = -1;
                        if ( ((LA2_66>='\u0000' && LA2_66<='\b')||(LA2_66>='\u000B' && LA2_66<='\f')||(LA2_66>='\u000E' && LA2_66<='\u001F')||(LA2_66>='!' && LA2_66<='\'')||(LA2_66>='*' && LA2_66<='+')||(LA2_66>='-' && LA2_66<='\uFFFF')) ) {s = 13;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_78 = input.LA(1);

                        s = -1;
                        if ( ((LA2_78>='\u0000' && LA2_78<='\b')||(LA2_78>='\u000B' && LA2_78<='\f')||(LA2_78>='\u000E' && LA2_78<='\u001F')||(LA2_78>='!' && LA2_78<='\'')||(LA2_78>='*' && LA2_78<='+')||(LA2_78>='-' && LA2_78<='\uFFFF')) ) {s = 13;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_71 = input.LA(1);

                        s = -1;
                        if ( ((LA2_71>='\u0000' && LA2_71<='\b')||(LA2_71>='\u000B' && LA2_71<='\f')||(LA2_71>='\u000E' && LA2_71<='\u001F')||(LA2_71>='!' && LA2_71<='\'')||(LA2_71>='*' && LA2_71<='+')||(LA2_71>='-' && LA2_71<='\uFFFF')) ) {s = 13;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_79 = input.LA(1);

                        s = -1;
                        if ( ((LA2_79>='\u0000' && LA2_79<='\b')||(LA2_79>='\u000B' && LA2_79<='\f')||(LA2_79>='\u000E' && LA2_79<='\u001F')||(LA2_79>='!' && LA2_79<='\'')||(LA2_79>='*' && LA2_79<='+')||(LA2_79>='-' && LA2_79<='\uFFFF')) ) {s = 13;}

                        else s = 85;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA2_60 = input.LA(1);

                        s = -1;
                        if ( ((LA2_60>='\u0000' && LA2_60<='\b')||(LA2_60>='\u000B' && LA2_60<='\f')||(LA2_60>='\u000E' && LA2_60<='\u001F')||(LA2_60>='!' && LA2_60<='\'')||(LA2_60>='*' && LA2_60<='+')||(LA2_60>='-' && LA2_60<='\uFFFF')) ) {s = 13;}

                        else s = 72;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA2_56 = input.LA(1);

                        s = -1;
                        if ( ((LA2_56>='\u0000' && LA2_56<='\b')||(LA2_56>='\u000B' && LA2_56<='\f')||(LA2_56>='\u000E' && LA2_56<='\u001F')||(LA2_56>='!' && LA2_56<='\'')||(LA2_56>='*' && LA2_56<='+')||(LA2_56>='-' && LA2_56<='\uFFFF')) ) {s = 13;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA2_63 = input.LA(1);

                        s = -1;
                        if ( ((LA2_63>='\u0000' && LA2_63<='\b')||(LA2_63>='\u000B' && LA2_63<='\f')||(LA2_63>='\u000E' && LA2_63<='\u001F')||(LA2_63>='!' && LA2_63<='\'')||(LA2_63>='*' && LA2_63<='+')||(LA2_63>='-' && LA2_63<='\uFFFF')) ) {s = 13;}

                        else s = 74;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA2_49 = input.LA(1);

                        s = -1;
                        if ( ((LA2_49>='\u0000' && LA2_49<='\b')||(LA2_49>='\u000B' && LA2_49<='\f')||(LA2_49>='\u000E' && LA2_49<='\u001F')||(LA2_49>='!' && LA2_49<='\'')||(LA2_49>='*' && LA2_49<='+')||(LA2_49>='-' && LA2_49<='\uFFFF')) ) {s = 13;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA2_64 = input.LA(1);

                        s = -1;
                        if ( ((LA2_64>='\u0000' && LA2_64<='\b')||(LA2_64>='\u000B' && LA2_64<='\f')||(LA2_64>='\u000E' && LA2_64<='\u001F')||(LA2_64>='!' && LA2_64<='\'')||(LA2_64>='*' && LA2_64<='+')||(LA2_64>='-' && LA2_64<='\uFFFF')) ) {s = 13;}

                        else s = 75;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA2_86 = input.LA(1);

                        s = -1;
                        if ( ((LA2_86>='\u0000' && LA2_86<='\b')||(LA2_86>='\u000B' && LA2_86<='\f')||(LA2_86>='\u000E' && LA2_86<='\u001F')||(LA2_86>='!' && LA2_86<='\'')||(LA2_86>='*' && LA2_86<='+')||(LA2_86>='-' && LA2_86<='\uFFFF')) ) {s = 13;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA2_70 = input.LA(1);

                        s = -1;
                        if ( ((LA2_70>='\u0000' && LA2_70<='\b')||(LA2_70>='\u000B' && LA2_70<='\f')||(LA2_70>='\u000E' && LA2_70<='\u001F')||(LA2_70>='!' && LA2_70<='\'')||(LA2_70>='*' && LA2_70<='+')||(LA2_70>='-' && LA2_70<='\uFFFF')) ) {s = 13;}

                        else s = 80;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA2_76 = input.LA(1);

                        s = -1;
                        if ( ((LA2_76>='\u0000' && LA2_76<='\b')||(LA2_76>='\u000B' && LA2_76<='\f')||(LA2_76>='\u000E' && LA2_76<='\u001F')||(LA2_76>='!' && LA2_76<='\'')||(LA2_76>='*' && LA2_76<='+')||(LA2_76>='-' && LA2_76<='\uFFFF')) ) {s = 13;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}