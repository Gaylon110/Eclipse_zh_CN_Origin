package org.eclipse.gef.dot.internal.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotArrowTypeLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;
    public static final int T__4=4;
    public static final int T__22=22;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDotArrowTypeLexer() {;} 
    public InternalDotArrowTypeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotArrowTypeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDotArrowType__.g"; }

    // $ANTLR start "T__4"
    public final void mT__4() throws RecognitionException {
        try {
            int _type = T__4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:11:6: ( 'o' )
            // InternalDotArrowType__.g:11:8: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__4"

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:12:6: ( 'l' )
            // InternalDotArrowType__.g:12:8: 'l'
            {
            match('l'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:13:6: ( 'r' )
            // InternalDotArrowType__.g:13:8: 'r'
            {
            match('r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:14:6: ( 'ediamond' )
            // InternalDotArrowType__.g:14:8: 'ediamond'
            {
            match("ediamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:15:6: ( 'open' )
            // InternalDotArrowType__.g:15:8: 'open'
            {
            match("open"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:16:6: ( 'halfopen' )
            // InternalDotArrowType__.g:16:8: 'halfopen'
            {
            match("halfopen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:17:7: ( 'empty' )
            // InternalDotArrowType__.g:17:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:18:7: ( 'invempty' )
            // InternalDotArrowType__.g:18:9: 'invempty'
            {
            match("invempty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:19:7: ( 'box' )
            // InternalDotArrowType__.g:19:9: 'box'
            {
            match("box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:20:7: ( 'crow' )
            // InternalDotArrowType__.g:20:9: 'crow'
            {
            match("crow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:21:7: ( 'curve' )
            // InternalDotArrowType__.g:21:9: 'curve'
            {
            match("curve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:22:7: ( 'icurve' )
            // InternalDotArrowType__.g:22:9: 'icurve'
            {
            match("icurve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:23:7: ( 'diamond' )
            // InternalDotArrowType__.g:23:9: 'diamond'
            {
            match("diamond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:24:7: ( 'dot' )
            // InternalDotArrowType__.g:24:9: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:25:7: ( 'inv' )
            // InternalDotArrowType__.g:25:9: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:26:7: ( 'none' )
            // InternalDotArrowType__.g:26:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:27:7: ( 'normal' )
            // InternalDotArrowType__.g:27:9: 'normal'
            {
            match("normal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:28:7: ( 'tee' )
            // InternalDotArrowType__.g:28:9: 'tee'
            {
            match("tee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotArrowType__.g:29:7: ( 'vee' )
            // InternalDotArrowType__.g:29:9: 'vee'
            {
            match("vee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    public void mTokens() throws RecognitionException {
        // InternalDotArrowType__.g:1:8: ( T__4 | T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 )
        int alt1=19;
        alt1 = dfa1.predict(input);
        switch (alt1) {
            case 1 :
                // InternalDotArrowType__.g:1:10: T__4
                {
                mT__4(); 

                }
                break;
            case 2 :
                // InternalDotArrowType__.g:1:15: T__5
                {
                mT__5(); 

                }
                break;
            case 3 :
                // InternalDotArrowType__.g:1:20: T__6
                {
                mT__6(); 

                }
                break;
            case 4 :
                // InternalDotArrowType__.g:1:25: T__7
                {
                mT__7(); 

                }
                break;
            case 5 :
                // InternalDotArrowType__.g:1:30: T__8
                {
                mT__8(); 

                }
                break;
            case 6 :
                // InternalDotArrowType__.g:1:35: T__9
                {
                mT__9(); 

                }
                break;
            case 7 :
                // InternalDotArrowType__.g:1:40: T__10
                {
                mT__10(); 

                }
                break;
            case 8 :
                // InternalDotArrowType__.g:1:46: T__11
                {
                mT__11(); 

                }
                break;
            case 9 :
                // InternalDotArrowType__.g:1:52: T__12
                {
                mT__12(); 

                }
                break;
            case 10 :
                // InternalDotArrowType__.g:1:58: T__13
                {
                mT__13(); 

                }
                break;
            case 11 :
                // InternalDotArrowType__.g:1:64: T__14
                {
                mT__14(); 

                }
                break;
            case 12 :
                // InternalDotArrowType__.g:1:70: T__15
                {
                mT__15(); 

                }
                break;
            case 13 :
                // InternalDotArrowType__.g:1:76: T__16
                {
                mT__16(); 

                }
                break;
            case 14 :
                // InternalDotArrowType__.g:1:82: T__17
                {
                mT__17(); 

                }
                break;
            case 15 :
                // InternalDotArrowType__.g:1:88: T__18
                {
                mT__18(); 

                }
                break;
            case 16 :
                // InternalDotArrowType__.g:1:94: T__19
                {
                mT__19(); 

                }
                break;
            case 17 :
                // InternalDotArrowType__.g:1:100: T__20
                {
                mT__20(); 

                }
                break;
            case 18 :
                // InternalDotArrowType__.g:1:106: T__21
                {
                mT__21(); 

                }
                break;
            case 19 :
                // InternalDotArrowType__.g:1:112: T__22
                {
                mT__22(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\1\uffff\1\16\26\uffff\1\34\4\uffff";
    static final String DFA1_eofS =
        "\35\uffff";
    static final String DFA1_minS =
        "\1\142\1\160\2\uffff\1\144\1\uffff\1\143\1\uffff\1\162\1\151\1\157\6\uffff\1\166\5\uffff\1\156\1\145\4\uffff";
    static final String DFA1_maxS =
        "\1\166\1\160\2\uffff\1\155\1\uffff\1\156\1\uffff\1\165\2\157\6\uffff\1\166\5\uffff\1\162\1\145\4\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\11\3\uffff\1\22\1\23\1\5\1\1\1\4\1\7\1\uffff\1\14\1\12\1\13\1\15\1\16\2\uffff\1\20\1\21\1\10\1\17";
    static final String DFA1_specialS =
        "\35\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\1\10\1\11\1\4\2\uffff\1\5\1\6\2\uffff\1\2\1\uffff\1\12\1\1\2\uffff\1\3\1\uffff\1\13\1\uffff\1\14",
            "\1\15",
            "",
            "",
            "\1\17\10\uffff\1\20",
            "",
            "\1\22\12\uffff\1\21",
            "",
            "\1\23\2\uffff\1\24",
            "\1\25\5\uffff\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "\1\31\3\uffff\1\32",
            "\1\33",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__4 | T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 );";
        }
    }
 

}