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
 *     Alexander Nyßen (itemis AG) - initial API and implementation
 *     
 *******************************************************************************/
@SuppressWarnings("all")
public class CustomHighlightingInternalDotLexer extends Lexer {
    public static final int HyphenMinusHyphenMinus=10;
    public static final int HTML_TAG_OPEN=24;
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
    public static final int HTML_TAG_CLOSE=25;
    public static final int RULE_WS=30;
    public static final int LeftCurlyBracket=18;
    public static final int RULE_ANY_OTHER=31;
    public static final int RULE_COMPASS_PT=21;
    public static final int Semicolon=14;
    public static final int Graph=7;
    public static final int HTML_CHARS=26;
    public static final int Subgraph=4;
    public static final int RULE_HTML_STRING=27;
    public static final int RULE_ML_COMMENT=28;
    public static final int LeftSquareBracket=16;
    public static final int Digraph=5;
    public static final int HyphenMinusGreaterThanSign=11;
    public static final int Edge=8;

        boolean htmlMode = false;
        int htmlTags = 0;


    // delegates
    // delegators

    public CustomHighlightingInternalDotLexer() {;} 
    public CustomHighlightingInternalDotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomHighlightingInternalDotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "//opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g"; }

    // $ANTLR start "Subgraph"
    public final void mSubgraph() throws RecognitionException {
        try {
            int _type = Subgraph;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:28:10: ({...}? => ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:28:12: {...}? => ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Subgraph", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:30:9: ({...}? => ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:30:11: {...}? => ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Digraph", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:32:8: ({...}? => ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:32:10: {...}? => ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Strict", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:34:7: ({...}? => ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:34:9: {...}? => ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Graph", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:36:6: ({...}? => ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:36:8: {...}? => ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Edge", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:38:6: ({...}? => ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:38:8: {...}? => ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Node", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:40:24: ({...}? => '-' '-' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:40:26: {...}? => '-' '-'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "HyphenMinusHyphenMinus", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:42:28: ({...}? => '-' '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:42:30: {...}? => '-' '>'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "HyphenMinusGreaterThanSign", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:44:7: ({...}? => ',' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:44:9: {...}? => ','
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Comma", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:46:7: ({...}? => ':' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:46:9: {...}? => ':'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Colon", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:48:11: ({...}? => ';' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:48:13: {...}? => ';'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "Semicolon", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:50:12: ({...}? => '=' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:50:14: {...}? => '='
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "EqualsSign", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:52:19: ({...}? => '[' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:52:21: {...}? => '['
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "LeftSquareBracket", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:54:20: ({...}? => ']' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:54:22: {...}? => ']'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RightSquareBracket", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:56:18: ({...}? => '{' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:56:20: {...}? => '{'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "LeftCurlyBracket", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:58:19: ({...}? => '}' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:58:21: {...}? => '}'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RightCurlyBracket", " !htmlMode ");
            }
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:14: ({...}? => ( '-' )? ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:16: {...}? => ( '-' )? ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_NUMERAL", " !htmlMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:33: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:33: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:38: ( '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:39: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:43: ( '0' .. '9' )+
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
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:44: '0' .. '9'
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:57: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* )?
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:57: ( '0' .. '9' )+
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
                    	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:58: '0' .. '9'
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

                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:69: ( '.' ( '0' .. '9' )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:70: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:74: ( '0' .. '9' )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:60:75: '0' .. '9'
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:17: ({...}? => ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' ) )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:19: {...}? => ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_COMPASS_PT", " !htmlMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:36: ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )
            int alt7=10;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:37: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:41: 'ne'
                    {
                    match("ne"); 


                    }
                    break;
                case 3 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:46: 'e'
                    {
                    match('e'); 

                    }
                    break;
                case 4 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:50: 'se'
                    {
                    match("se"); 


                    }
                    break;
                case 5 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:55: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 6 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:59: 'sw'
                    {
                    match("sw"); 


                    }
                    break;
                case 7 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:64: 'w'
                    {
                    match('w'); 

                    }
                    break;
                case 8 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:68: 'nw'
                    {
                    match("nw"); 


                    }
                    break;
                case 9 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:73: 'c'
                    {
                    match('c'); 

                    }
                    break;
                case 10 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:62:77: '_'
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:64:13: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )* )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:64:15: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )*
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_STRING", " !htmlMode ");
            }
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u0080' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:64:75: ( 'a' .. 'z' | 'A' .. 'Z' | '\\u0080' .. '\\u00FF' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')||(LA8_0>='\u0080' && LA8_0<='\u00FF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:66:20: ({...}? => '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* '\"' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:66:22: {...}? => '\"' ( '\\\\' '\"' | ~ ( '\"' ) )* '\"'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_QUOTED_STRING", " !htmlMode ");
            }
            match('\"'); 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:66:43: ( '\\\\' '\"' | ~ ( '\"' ) )*
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
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:66:44: '\\\\' '\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:66:53: ~ ( '\"' )
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:18: ({...}? => '<' ( HTML_TAG_OPEN | HTML_TAG_CLOSE | HTML_CHARS )* '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:20: {...}? => '<' ( HTML_TAG_OPEN | HTML_TAG_CLOSE | HTML_CHARS )* '>'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_HTML_STRING", " !htmlMode ");
            }
            match('<'); 
             htmlMode = true; 
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:62: ( HTML_TAG_OPEN | HTML_TAG_CLOSE | HTML_CHARS )*
            loop10:
            do {
                int alt10=4;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='>') ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>='\u0000' && LA10_1<='\uFFFF')) && (( htmlMode && htmlTags > 0 ))) {
                        alt10=2;
                    }


                }
                else if ( (LA10_0=='<') && (( htmlMode ))) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=';')||LA10_0=='='||(LA10_0>='?' && LA10_0<='\uFFFF')) && (( htmlMode ))) {
                    alt10=3;
                }


                switch (alt10) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:63: HTML_TAG_OPEN
            	    {
            	    mHTML_TAG_OPEN(); 

            	    }
            	    break;
            	case 2 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:79: HTML_TAG_CLOSE
            	    {
            	    mHTML_TAG_CLOSE(); 

            	    }
            	    break;
            	case 3 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:68:96: HTML_CHARS
            	    {
            	    mHTML_CHARS(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('>'); 
             htmlMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HTML_STRING"

    // $ANTLR start "HTML_TAG_OPEN"
    public final void mHTML_TAG_OPEN() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:70:24: ({...}? => '<' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:70:26: {...}? => '<'
            {
            if ( !(( htmlMode )) ) {
                throw new FailedPredicateException(input, "HTML_TAG_OPEN", " htmlMode ");
            }
            match('<'); 
             htmlTags++; 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HTML_TAG_OPEN"

    // $ANTLR start "HTML_TAG_CLOSE"
    public final void mHTML_TAG_CLOSE() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:72:25: ({...}? => '>' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:72:27: {...}? => '>'
            {
            if ( !(( htmlMode && htmlTags > 0 )) ) {
                throw new FailedPredicateException(input, "HTML_TAG_CLOSE", " htmlMode && htmlTags > 0 ");
            }
            match('>'); 
             htmlTags--; 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HTML_TAG_CLOSE"

    // $ANTLR start "HTML_CHARS"
    public final void mHTML_CHARS() throws RecognitionException {
        try {
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:74:21: ({...}? => (~ ( '<' | '>' ) )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:74:23: {...}? => (~ ( '<' | '>' ) )+
            {
            if ( !(( htmlMode )) ) {
                throw new FailedPredicateException(input, "HTML_CHARS", " htmlMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:74:39: (~ ( '<' | '>' ) )+
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
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:74:40: ~ ( '<' | '>' )
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
    // $ANTLR end "HTML_CHARS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:76:17: ({...}? => '/*' ( options {greedy=false; } : . )* '*/' )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:76:19: {...}? => '/*' ( options {greedy=false; } : . )* '*/'
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", " !htmlMode ");
            }
            match("/*"); 

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:76:41: ( options {greedy=false; } : . )*
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
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:76:69: .
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:17: ({...}? => ( '//' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:19: {...}? => ( '//' | '#' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", " !htmlMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:36: ( '//' | '#' )
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
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:37: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:42: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:47: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:47: ~ ( ( '\\n' | '\\r' ) )
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

            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:63: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:64: ( '\\r' )? '\\n'
                    {
                    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:64: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:78:64: '\\r'
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:80:9: ({...}? => ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:80:11: {...}? => ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            if ( !(( !htmlMode )) ) {
                throw new FailedPredicateException(input, "RULE_WS", " !htmlMode ");
            }
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:80:28: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
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
            	    // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:
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
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:82:16: ( . )
            // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:82:18: .
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
        // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:8: ( Subgraph | Digraph | Strict | Graph | Edge | Node | HyphenMinusHyphenMinus | HyphenMinusGreaterThanSign | Comma | Colon | Semicolon | EqualsSign | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_NUMERAL | RULE_COMPASS_PT | RULE_STRING | RULE_QUOTED_STRING | RULE_HTML_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=25;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:10: Subgraph
                {
                mSubgraph(); 

                }
                break;
            case 2 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:19: Digraph
                {
                mDigraph(); 

                }
                break;
            case 3 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:27: Strict
                {
                mStrict(); 

                }
                break;
            case 4 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:34: Graph
                {
                mGraph(); 

                }
                break;
            case 5 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:40: Edge
                {
                mEdge(); 

                }
                break;
            case 6 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:45: Node
                {
                mNode(); 

                }
                break;
            case 7 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:50: HyphenMinusHyphenMinus
                {
                mHyphenMinusHyphenMinus(); 

                }
                break;
            case 8 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:73: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 9 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:100: Comma
                {
                mComma(); 

                }
                break;
            case 10 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:106: Colon
                {
                mColon(); 

                }
                break;
            case 11 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:112: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 12 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:122: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 13 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:133: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 14 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:151: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 15 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:170: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 16 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:187: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 17 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:205: RULE_NUMERAL
                {
                mRULE_NUMERAL(); 

                }
                break;
            case 18 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:218: RULE_COMPASS_PT
                {
                mRULE_COMPASS_PT(); 

                }
                break;
            case 19 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:234: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:246: RULE_QUOTED_STRING
                {
                mRULE_QUOTED_STRING(); 

                }
                break;
            case 21 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:265: RULE_HTML_STRING
                {
                mRULE_HTML_STRING(); 

                }
                break;
            case 22 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:282: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:298: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:314: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // //opt/users/genie.gef/workspace/gef-master/gef/org.eclipse.gef.dot.ui/src/org/eclipse/gef/dot/internal/ui/language/highlighting/antlr/lexer/CustomHighlightingInternalDotLexer.g:1:322: RULE_ANY_OTHER
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
            "\1\6\3\uffff\1\5\1\uffff\1\2\10\uffff\1\1\4\uffff\1\3\3\uffff"+
            "\1\4",
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
            return "62:36: ( 'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_' )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\42\2\45\2\42\1\35\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
        "\1\65\1\35\1\66\3\45\3\42\1\45\3\35\1\73\1\74\1\uffff\2\43\2\100"+
        "\2\uffff\1\43\1\uffff\3\43\2\100\23\uffff\2\43\2\uffff\4\43\10\uffff"+
        "\4\43\1\130\1\131\3\43\1\135\2\uffff\1\43\1\141\1\43\3\uffff\1\43"+
        "\1\uffff\1\146\1\uffff\1\147\5\uffff";
    static final String DFA18_eofS =
        "\152\uffff";
    static final String DFA18_minS =
        "\1\0\5\60\1\55\10\0\1\60\1\56\7\60\2\0\1\52\1\0\1\11\1\uffff\1\102"+
        "\1\122\2\60\1\0\1\uffff\1\107\1\0\1\101\1\107\1\104\2\60\3\uffff"+
        "\11\0\4\uffff\2\0\1\uffff\1\107\1\111\1\0\1\uffff\1\122\1\120\2"+
        "\105\10\uffff\1\122\1\103\1\101\1\110\2\60\1\101\1\124\1\120\1\60"+
        "\2\0\1\120\1\60\1\110\1\0\2\uffff\1\110\1\0\1\60\1\uffff\1\60\1"+
        "\uffff\2\0\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\5\u00ff\1\76\10\0\2\71\7\u00ff\2\uffff\1\57\1\uffff\1\40"+
        "\1\uffff\1\142\1\162\2\u00ff\1\0\1\uffff\1\147\1\0\1\141\1\147\1"+
        "\144\2\u00ff\3\uffff\11\0\4\uffff\2\0\1\uffff\1\147\1\151\1\0\1"+
        "\uffff\1\162\1\160\2\145\10\uffff\1\162\1\143\1\141\1\150\2\u00ff"+
        "\1\141\1\164\1\160\1\u00ff\2\0\1\160\1\u00ff\1\150\1\0\2\uffff\1"+
        "\150\1\0\1\u00ff\1\uffff\1\u00ff\1\uffff\2\0\2\uffff";
    static final String DFA18_acceptS =
        "\35\uffff\1\31\5\uffff\1\23\7\uffff\1\7\1\10\1\21\11\uffff\1\24"+
        "\1\25\1\26\1\27\2\uffff\1\30\3\uffff\1\22\4\uffff\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\1\20\20\uffff\1\5\1\6\3\uffff\1\4\1\uffff\1"+
        "\3\2\uffff\1\2\1\1";
    static final String DFA18_specialS =
        "\1\102\1\24\1\70\1\74\1\107\1\0\1\71\10\uffff\1\77\1\72\1\101\1"+
        "\76\1\103\1\65\1\66\1\67\1\46\1\105\1\73\1\10\1\75\1\5\1\uffff\1"+
        "\2\1\51\1\3\1\7\1\55\1\uffff\1\25\1\45\1\56\1\61\1\63\1\1\1\17\3"+
        "\uffff\1\26\1\27\1\31\1\32\1\35\1\36\1\40\1\42\1\44\4\uffff\1\47"+
        "\1\50\1\uffff\1\4\1\52\1\33\1\uffff\1\30\1\57\1\62\1\64\10\uffff"+
        "\1\6\1\53\1\34\1\60\1\12\1\41\1\11\1\54\1\37\1\110\1\22\1\23\1\14"+
        "\1\106\1\43\1\20\2\uffff\1\21\1\16\1\104\1\uffff\1\100\1\uffff\1"+
        "\15\1\13\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\35\2\34\1\35\2\34\22\35\1\34\1\35\1\30\1\33\10\35\1\7\1"+
            "\6\1\17\1\32\12\20\1\10\1\11\1\31\1\12\3\35\3\27\1\2\1\22\1"+
            "\27\1\3\6\27\1\21\4\27\1\23\7\27\1\13\1\35\1\14\1\35\1\26\1"+
            "\35\2\27\1\25\1\2\1\4\1\27\1\3\6\27\1\5\4\27\1\1\3\27\1\24\3"+
            "\27\1\15\1\35\1\16\2\35\u0080\27\uff00\35",
            "\12\43\7\uffff\23\43\1\37\1\36\5\43\4\uffff\1\43\1\uffff\4"+
            "\43\1\40\16\43\1\37\1\36\1\43\1\41\3\43\5\uffff\u0080\43",
            "\12\43\7\uffff\10\43\1\44\21\43\4\uffff\1\43\1\uffff\10\43"+
            "\1\44\21\43\5\uffff\u0080\43",
            "\12\43\7\uffff\21\43\1\46\10\43\4\uffff\1\43\1\uffff\21\43"+
            "\1\46\10\43\5\uffff\u0080\43",
            "\12\43\7\uffff\3\43\1\47\26\43\4\uffff\1\43\1\uffff\3\43\1"+
            "\47\26\43\5\uffff\u0080\43",
            "\12\43\7\uffff\16\43\1\50\13\43\4\uffff\1\43\1\uffff\4\43\1"+
            "\51\11\43\1\50\7\43\1\52\3\43\5\uffff\u0080\43",
            "\1\53\1\55\1\uffff\12\55\4\uffff\1\54",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\55",
            "\1\55\1\uffff\12\55",
            "\12\43\7\uffff\16\43\1\50\13\43\4\uffff\1\43\1\uffff\16\43"+
            "\1\50\13\43\5\uffff\u0080\43",
            "\12\43\7\uffff\3\43\1\47\26\43\4\uffff\1\43\1\uffff\3\43\1"+
            "\47\26\43\5\uffff\u0080\43",
            "\12\43\7\uffff\23\43\1\37\1\36\5\43\4\uffff\1\43\1\uffff\23"+
            "\43\1\37\1\36\5\43\5\uffff\u0080\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\0\67",
            "\0\70",
            "\1\71\4\uffff\1\72",
            "\0\72",
            "\2\75\1\uffff\2\75\22\uffff\1\75",
            "",
            "\1\76\37\uffff\1\76",
            "\1\77\37\uffff\1\77",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\1\uffff",
            "",
            "\1\102\37\uffff\1\102",
            "\1\uffff",
            "\1\103\37\uffff\1\103",
            "\1\104\37\uffff\1\104",
            "\1\105\37\uffff\1\105",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\uffff",
            "",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "\1\123\37\uffff\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124\37\uffff\1\124",
            "\1\125\37\uffff\1\125",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\1\uffff",
            "\1\uffff",
            "\1\140\37\uffff\1\140",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "\1\142\37\uffff\1\142",
            "\1\uffff",
            "",
            "",
            "\1\144\37\uffff\1\144",
            "\1\uffff",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\5\uffff\u0080"+
            "\43",
            "",
            "\1\uffff",
            "\1\uffff",
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
                        int LA18_5 = input.LA(1);

                         
                        int index18_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_5=='O'||LA18_5=='o') && (( !htmlMode ))) {s = 40;}

                        else if ( (LA18_5=='e') && (( !htmlMode ))) {s = 41;}

                        else if ( (LA18_5=='w') && (( !htmlMode ))) {s = 42;}

                        else if ( ((LA18_5>='0' && LA18_5<='9')||(LA18_5>='A' && LA18_5<='N')||(LA18_5>='P' && LA18_5<='Z')||LA18_5=='_'||(LA18_5>='a' && LA18_5<='d')||(LA18_5>='f' && LA18_5<='n')||(LA18_5>='p' && LA18_5<='v')||(LA18_5>='x' && LA18_5<='z')||(LA18_5>='\u0080' && LA18_5<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_41 = input.LA(1);

                         
                        int index18_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_41>='0' && LA18_41<='9')||(LA18_41>='A' && LA18_41<='Z')||LA18_41=='_'||(LA18_41>='a' && LA18_41<='z')||(LA18_41>='\u0080' && LA18_41<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 64;

                         
                        input.seek(index18_41);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_30=='B'||LA18_30=='b') && (( !htmlMode ))) {s = 62;}

                        else s = 35;

                         
                        input.seek(index18_30);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_32 = input.LA(1);

                         
                        int index18_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_32>='0' && LA18_32<='9')||(LA18_32>='A' && LA18_32<='Z')||LA18_32=='_'||(LA18_32>='a' && LA18_32<='z')||(LA18_32>='\u0080' && LA18_32<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 64;

                         
                        input.seek(index18_32);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_62 = input.LA(1);

                         
                        int index18_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_62=='G'||LA18_62=='g') && (( !htmlMode ))) {s = 78;}

                        else s = 35;

                         
                        input.seek(index18_62);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_28 = input.LA(1);

                         
                        int index18_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_28>='\t' && LA18_28<='\n')||(LA18_28>='\f' && LA18_28<='\r')||LA18_28==' ') && (( !htmlMode ))) {s = 61;}

                        else s = 60;

                         
                        input.seek(index18_28);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_78 = input.LA(1);

                         
                        int index18_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_78=='R'||LA18_78=='r') && (( !htmlMode ))) {s = 84;}

                        else s = 35;

                         
                        input.seek(index18_78);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_33 = input.LA(1);

                         
                        int index18_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_33>='0' && LA18_33<='9')||(LA18_33>='A' && LA18_33<='Z')||LA18_33=='_'||(LA18_33>='a' && LA18_33<='z')||(LA18_33>='\u0080' && LA18_33<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 64;

                         
                        input.seek(index18_33);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_26 = input.LA(1);

                         
                        int index18_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_26=='*') && (( !htmlMode ))) {s = 57;}

                        else if ( (LA18_26=='/') && (( !htmlMode ))) {s = 58;}

                        else s = 29;

                         
                        input.seek(index18_26);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_84 = input.LA(1);

                         
                        int index18_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_84=='A'||LA18_84=='a') && (( !htmlMode ))) {s = 90;}

                        else s = 35;

                         
                        input.seek(index18_84);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_82 = input.LA(1);

                         
                        int index18_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_82>='0' && LA18_82<='9')||(LA18_82>='A' && LA18_82<='Z')||LA18_82=='_'||(LA18_82>='a' && LA18_82<='z')||(LA18_82>='\u0080' && LA18_82<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 88;

                         
                        input.seek(index18_82);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_103 = input.LA(1);

                         
                        int index18_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 105;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_103);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_90 = input.LA(1);

                         
                        int index18_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_90=='P'||LA18_90=='p') && (( !htmlMode ))) {s = 96;}

                        else s = 35;

                         
                        input.seek(index18_90);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_102 = input.LA(1);

                         
                        int index18_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 104;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_102);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_97 = input.LA(1);

                         
                        int index18_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 101;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_97);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_42 = input.LA(1);

                         
                        int index18_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_42>='0' && LA18_42<='9')||(LA18_42>='A' && LA18_42<='Z')||LA18_42=='_'||(LA18_42>='a' && LA18_42<='z')||(LA18_42>='\u0080' && LA18_42<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 64;

                         
                        input.seek(index18_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_93 = input.LA(1);

                         
                        int index18_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 99;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_93);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA18_96 = input.LA(1);

                         
                        int index18_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_96=='H'||LA18_96=='h') && (( !htmlMode ))) {s = 100;}

                        else s = 35;

                         
                        input.seek(index18_96);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA18_88 = input.LA(1);

                         
                        int index18_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 94;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_88);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA18_89 = input.LA(1);

                         
                        int index18_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 95;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_89);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_1=='U'||LA18_1=='u') && (( !htmlMode ))) {s = 30;}

                        else if ( (LA18_1=='T'||LA18_1=='t') && (( !htmlMode ))) {s = 31;}

                        else if ( (LA18_1=='e') && (( !htmlMode ))) {s = 32;}

                        else if ( (LA18_1=='w') && (( !htmlMode ))) {s = 33;}

                        else if ( ((LA18_1>='0' && LA18_1<='9')||(LA18_1>='A' && LA18_1<='S')||(LA18_1>='V' && LA18_1<='Z')||LA18_1=='_'||(LA18_1>='a' && LA18_1<='d')||(LA18_1>='f' && LA18_1<='s')||LA18_1=='v'||(LA18_1>='x' && LA18_1<='z')||(LA18_1>='\u0080' && LA18_1<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA18_36 = input.LA(1);

                         
                        int index18_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_36=='G'||LA18_36=='g') && (( !htmlMode ))) {s = 66;}

                        else s = 35;

                         
                        input.seek(index18_36);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA18_46 = input.LA(1);

                         
                        int index18_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 70;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_46);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA18_47 = input.LA(1);

                         
                        int index18_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 71;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_47);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA18_66 = input.LA(1);

                         
                        int index18_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_66=='R'||LA18_66=='r') && (( !htmlMode ))) {s = 80;}

                        else s = 35;

                         
                        input.seek(index18_66);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA18_48 = input.LA(1);

                         
                        int index18_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 72;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_48);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA18_49 = input.LA(1);

                         
                        int index18_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 73;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_49);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA18_64 = input.LA(1);

                         
                        int index18_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 65;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                         
                        input.seek(index18_64);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA18_80 = input.LA(1);

                         
                        int index18_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_80=='A'||LA18_80=='a') && (( !htmlMode ))) {s = 86;}

                        else s = 35;

                         
                        input.seek(index18_80);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA18_50 = input.LA(1);

                         
                        int index18_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 74;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_50);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA18_51 = input.LA(1);

                         
                        int index18_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 75;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA18_86 = input.LA(1);

                         
                        int index18_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_86=='P'||LA18_86=='p') && (( !htmlMode ))) {s = 92;}

                        else s = 35;

                         
                        input.seek(index18_86);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA18_52 = input.LA(1);

                         
                        int index18_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 76;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_52);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA18_83 = input.LA(1);

                         
                        int index18_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_83>='0' && LA18_83<='9')||(LA18_83>='A' && LA18_83<='Z')||LA18_83=='_'||(LA18_83>='a' && LA18_83<='z')||(LA18_83>='\u0080' && LA18_83<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 89;

                         
                        input.seek(index18_83);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA18_53 = input.LA(1);

                         
                        int index18_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 77;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_53);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA18_92 = input.LA(1);

                         
                        int index18_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_92=='H'||LA18_92=='h') && (( !htmlMode ))) {s = 98;}

                        else s = 35;

                         
                        input.seek(index18_92);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA18_54 = input.LA(1);

                         
                        int index18_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 45;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_54);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA18_37 = input.LA(1);

                         
                        int index18_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 35;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_37);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_23>='0' && LA18_23<='9')||(LA18_23>='A' && LA18_23<='Z')||LA18_23=='_'||(LA18_23>='a' && LA18_23<='z')||(LA18_23>='\u0080' && LA18_23<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_23);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA18_59 = input.LA(1);

                         
                        int index18_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 58;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_59);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA18_60 = input.LA(1);

                         
                        int index18_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 61;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_60);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA18_31 = input.LA(1);

                         
                        int index18_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_31=='R'||LA18_31=='r') && (( !htmlMode ))) {s = 63;}

                        else s = 35;

                         
                        input.seek(index18_31);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA18_63 = input.LA(1);

                         
                        int index18_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_63=='I'||LA18_63=='i') && (( !htmlMode ))) {s = 79;}

                        else s = 35;

                         
                        input.seek(index18_63);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA18_79 = input.LA(1);

                         
                        int index18_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_79=='C'||LA18_79=='c') && (( !htmlMode ))) {s = 85;}

                        else s = 35;

                         
                        input.seek(index18_79);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA18_85 = input.LA(1);

                         
                        int index18_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_85=='T'||LA18_85=='t') && (( !htmlMode ))) {s = 91;}

                        else s = 35;

                         
                        input.seek(index18_85);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA18_34 = input.LA(1);

                         
                        int index18_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !htmlMode )) ) {s = 65;}

                        else if ( (( !htmlMode )) ) {s = 35;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index18_34);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA18_38 = input.LA(1);

                         
                        int index18_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_38=='A'||LA18_38=='a') && (( !htmlMode ))) {s = 67;}

                        else s = 35;

                         
                        input.seek(index18_38);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA18_67 = input.LA(1);

                         
                        int index18_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_67=='P'||LA18_67=='p') && (( !htmlMode ))) {s = 81;}

                        else s = 35;

                         
                        input.seek(index18_67);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA18_81 = input.LA(1);

                         
                        int index18_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_81=='H'||LA18_81=='h') && (( !htmlMode ))) {s = 87;}

                        else s = 35;

                         
                        input.seek(index18_81);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA18_39 = input.LA(1);

                         
                        int index18_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_39=='G'||LA18_39=='g') && (( !htmlMode ))) {s = 68;}

                        else s = 35;

                         
                        input.seek(index18_39);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA18_68 = input.LA(1);

                         
                        int index18_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_68=='E'||LA18_68=='e') && (( !htmlMode ))) {s = 82;}

                        else s = 35;

                         
                        input.seek(index18_68);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA18_40 = input.LA(1);

                         
                        int index18_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_40=='D'||LA18_40=='d') && (( !htmlMode ))) {s = 69;}

                        else s = 35;

                         
                        input.seek(index18_40);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA18_69 = input.LA(1);

                         
                        int index18_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_69=='E'||LA18_69=='e') && (( !htmlMode ))) {s = 83;}

                        else s = 35;

                         
                        input.seek(index18_69);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA18_20 = input.LA(1);

                         
                        int index18_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_20>='0' && LA18_20<='9')||(LA18_20>='A' && LA18_20<='Z')||LA18_20=='_'||(LA18_20>='a' && LA18_20<='z')||(LA18_20>='\u0080' && LA18_20<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_20);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_21>='0' && LA18_21<='9')||(LA18_21>='A' && LA18_21<='Z')||LA18_21=='_'||(LA18_21>='a' && LA18_21<='z')||(LA18_21>='\u0080' && LA18_21<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_21);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA18_22 = input.LA(1);

                         
                        int index18_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_22>='0' && LA18_22<='9')||(LA18_22>='A' && LA18_22<='Z')||LA18_22=='_'||(LA18_22>='a' && LA18_22<='z')||(LA18_22>='\u0080' && LA18_22<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_22);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_2=='I'||LA18_2=='i') && (( !htmlMode ))) {s = 36;}

                        else if ( ((LA18_2>='0' && LA18_2<='9')||(LA18_2>='A' && LA18_2<='H')||(LA18_2>='J' && LA18_2<='Z')||LA18_2=='_'||(LA18_2>='a' && LA18_2<='h')||(LA18_2>='j' && LA18_2<='z')||(LA18_2>='\u0080' && LA18_2<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA18_6 = input.LA(1);

                         
                        int index18_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_6=='-') && (( !htmlMode ))) {s = 43;}

                        else if ( (LA18_6=='>') && (( !htmlMode ))) {s = 44;}

                        else if ( (LA18_6=='.'||(LA18_6>='0' && LA18_6<='9')) && (( !htmlMode ))) {s = 45;}

                        else s = 29;

                         
                        input.seek(index18_6);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA18_16 = input.LA(1);

                         
                        int index18_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_16=='.'||(LA18_16>='0' && LA18_16<='9')) && (( !htmlMode ))) {s = 45;}

                        else s = 54;

                         
                        input.seek(index18_16);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_25>='\u0000' && LA18_25<='\uFFFF')) && (( !htmlMode ))) {s = 56;}

                        else s = 29;

                         
                        input.seek(index18_25);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_3=='R'||LA18_3=='r') && (( !htmlMode ))) {s = 38;}

                        else if ( ((LA18_3>='0' && LA18_3<='9')||(LA18_3>='A' && LA18_3<='Q')||(LA18_3>='S' && LA18_3<='Z')||LA18_3=='_'||(LA18_3>='a' && LA18_3<='q')||(LA18_3>='s' && LA18_3<='z')||(LA18_3>='\u0080' && LA18_3<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA18_27 = input.LA(1);

                         
                        int index18_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_27>='\u0000' && LA18_27<='\uFFFF')) && (( !htmlMode ))) {s = 58;}

                        else s = 59;

                         
                        input.seek(index18_27);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA18_18 = input.LA(1);

                         
                        int index18_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_18=='D'||LA18_18=='d') && (( !htmlMode ))) {s = 39;}

                        else if ( ((LA18_18>='0' && LA18_18<='9')||(LA18_18>='A' && LA18_18<='C')||(LA18_18>='E' && LA18_18<='Z')||LA18_18=='_'||(LA18_18>='a' && LA18_18<='c')||(LA18_18>='e' && LA18_18<='z')||(LA18_18>='\u0080' && LA18_18<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_18);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_15>='0' && LA18_15<='9')) && (( !htmlMode ))) {s = 45;}

                        else s = 29;

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA18_100 = input.LA(1);

                         
                        int index18_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_100>='0' && LA18_100<='9')||(LA18_100>='A' && LA18_100<='Z')||LA18_100=='_'||(LA18_100>='a' && LA18_100<='z')||(LA18_100>='\u0080' && LA18_100<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 103;

                         
                        input.seek(index18_100);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA18_17 = input.LA(1);

                         
                        int index18_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_17=='O'||LA18_17=='o') && (( !htmlMode ))) {s = 40;}

                        else if ( ((LA18_17>='0' && LA18_17<='9')||(LA18_17>='A' && LA18_17<='N')||(LA18_17>='P' && LA18_17<='Z')||LA18_17=='_'||(LA18_17>='a' && LA18_17<='n')||(LA18_17>='p' && LA18_17<='z')||(LA18_17>='\u0080' && LA18_17<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_17);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
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
                    case 67 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_19=='U'||LA18_19=='u') && (( !htmlMode ))) {s = 30;}

                        else if ( (LA18_19=='T'||LA18_19=='t') && (( !htmlMode ))) {s = 31;}

                        else if ( ((LA18_19>='0' && LA18_19<='9')||(LA18_19>='A' && LA18_19<='S')||(LA18_19>='V' && LA18_19<='Z')||LA18_19=='_'||(LA18_19>='a' && LA18_19<='s')||(LA18_19>='v' && LA18_19<='z')||(LA18_19>='\u0080' && LA18_19<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 37;

                         
                        input.seek(index18_19);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA18_98 = input.LA(1);

                         
                        int index18_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_98>='0' && LA18_98<='9')||(LA18_98>='A' && LA18_98<='Z')||LA18_98=='_'||(LA18_98>='a' && LA18_98<='z')||(LA18_98>='\u0080' && LA18_98<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 102;

                         
                        input.seek(index18_98);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA18_24 = input.LA(1);

                         
                        int index18_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_24>='\u0000' && LA18_24<='\uFFFF')) && (( !htmlMode ))) {s = 55;}

                        else s = 29;

                         
                        input.seek(index18_24);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA18_91 = input.LA(1);

                         
                        int index18_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_91>='0' && LA18_91<='9')||(LA18_91>='A' && LA18_91<='Z')||LA18_91=='_'||(LA18_91>='a' && LA18_91<='z')||(LA18_91>='\u0080' && LA18_91<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 97;

                         
                        input.seek(index18_91);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_4=='D'||LA18_4=='d') && (( !htmlMode ))) {s = 39;}

                        else if ( ((LA18_4>='0' && LA18_4<='9')||(LA18_4>='A' && LA18_4<='C')||(LA18_4>='E' && LA18_4<='Z')||LA18_4=='_'||(LA18_4>='a' && LA18_4<='c')||(LA18_4>='e' && LA18_4<='z')||(LA18_4>='\u0080' && LA18_4<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 34;

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA18_87 = input.LA(1);

                         
                        int index18_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA18_87>='0' && LA18_87<='9')||(LA18_87>='A' && LA18_87<='Z')||LA18_87=='_'||(LA18_87>='a' && LA18_87<='z')||(LA18_87>='\u0080' && LA18_87<='\u00FF')) && (( !htmlMode ))) {s = 35;}

                        else s = 93;

                         
                        input.seek(index18_87);
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