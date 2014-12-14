// $ANTLR 3.5.1 D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g 2014-12-14 21:38:08
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AntieLexer extends Lexer {

    public static final int EOF = -1;
    public static final int T__7 = 7;
    public static final int T__8 = 8;
    public static final int T__9 = 9;
    public static final int T__10 = 10;
    public static final int T__11 = 11;
    public static final int T__12 = 12;
    public static final int T__13 = 13;
    public static final int T__14 = 14;
    public static final int T__15 = 15;
    public static final int ID = 4;
    public static final int P = 5;
    public static final int S = 6;

    public String output = "";
    public String error = "";
    public boolean errorFlag = false;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public boolean isErrorFlag() {
        return errorFlag;
    }

    public String getError() {
        return error;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public void reportError(RecognitionException e) {
        error += "\nlex error at " + e.line + " " + e.charPositionInLine;
        System.out.println(e.getMessage() + " lex");
        errorFlag = true;
    }

    public AntieLexer() {
    }

    public AntieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public AntieLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g";
    }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:2:6: ( '\"' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:2:8: '\"'
            {
                match('\"');
                output+= "\nLex: \" - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:3:6: ( '\"hashCode\"' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:3:8: '\"hashCode\"'
            {
                match("\"hashCode\"");
                output+= "\"hashCode\" - ok";

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:4:6: ( '\"object\"' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:4:8: '\"object\"'
            {
                match("\"object\"");
                output+= "\"object\" - ok";

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:5:7: ( '\"type\"' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:5:9: '\"type\"'
            {
                match("\"type\"");
                output+= "\"type\" - ok";

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:6:7: ( 'con' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:6:9: 'con'
            {
                match("con");
                output+= "\"con\" - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:7: ( 'dev' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:9: 'dev'
            {
                match("dev");
                output+= "\"dev\" - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:8:7: ( 'mes' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:8:9: 'mes'
            {
                match("mes");
                output+= "\"mes\" - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:7: ( '{' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:9: '{'
            {
                match('{');
                output+= " ( - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:10:7: ( '}' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:10:9: '}'
            {
                match('}');
                output+= " ) - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__15"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            int _type = P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:4: ( ',' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:6: ','
            {
                match(',');
                output+= " , - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "P"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:10:4: ( ':' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:10:6: ':'
            {
                match(':');
                output+= " : - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "S"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:11:5: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '@' ) | ( '.' ) | ( '+' ) | '0' .. '9' )+ )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:11:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '@' ) | ( '.' ) | ( '+' ) | '0' .. '9' )+
            {
                // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:11:7: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '@' ) | ( '.' ) | ( '+' ) | '0' .. '9' )+
                int cnt1 = 0;
                loop1:
                while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == '+' || LA1_0 == '.' || (LA1_0 >= '0' && LA1_0 <= '9') || (LA1_0 >= '@' && LA1_0 <= 'Z') || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                        case 1: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:
                        {
                            if (input.LA(1) == '+' || input.LA(1) == '.' || (input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= '@' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt1 >= 1) {
                                break loop1;
                            }
                            EarlyExitException eee = new EarlyExitException(1, input);
                            throw eee;
                    }
                    cnt1++;
                }
                output+= " ID - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    @Override
    public void mTokens() throws RecognitionException {
        // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | P | S | ID )
        int alt2 = 12;
        switch (input.LA(1)) {
            case '\"': {
                switch (input.LA(2)) {
                    case 'h': {
                        alt2 = 2;
                    }
                    break;
                    case 'o': {
                        alt2 = 3;
                    }
                    break;
                    case 't': {
                        alt2 = 4;
                    }
                    break;
                    default:
                        alt2 = 1;
                }
            }
            break;
            case 'c': {
                int LA2_2 = input.LA(2);
                if ((LA2_2 == 'o')) {
                    int LA2_14 = input.LA(3);
                    if ((LA2_14 == 'n')) {
                        int LA2_17 = input.LA(4);
                        if ((LA2_17 == '+' || LA2_17 == '.' || (LA2_17 >= '0' && LA2_17 <= '9') || (LA2_17 >= '@' && LA2_17 <= 'Z') || (LA2_17 >= 'a' && LA2_17 <= 'z'))) {
                            alt2 = 12;
                        } else {
                            alt2 = 5;
                        }

                    } else {
                        alt2 = 12;
                    }

                } else {
                    alt2 = 12;
                }

            }
            break;
            case 'd': {
                int LA2_3 = input.LA(2);
                if ((LA2_3 == 'e')) {
                    int LA2_15 = input.LA(3);
                    if ((LA2_15 == 'v')) {
                        int LA2_18 = input.LA(4);
                        if ((LA2_18 == '+' || LA2_18 == '.' || (LA2_18 >= '0' && LA2_18 <= '9') || (LA2_18 >= '@' && LA2_18 <= 'Z') || (LA2_18 >= 'a' && LA2_18 <= 'z'))) {
                            alt2 = 12;
                        } else {
                            alt2 = 6;
                        }

                    } else {
                        alt2 = 12;
                    }

                } else {
                    alt2 = 12;
                }

            }
            break;
            case 'm': {
                int LA2_4 = input.LA(2);
                if ((LA2_4 == 'e')) {
                    int LA2_16 = input.LA(3);
                    if ((LA2_16 == 's')) {
                        int LA2_19 = input.LA(4);
                        if ((LA2_19 == '+' || LA2_19 == '.' || (LA2_19 >= '0' && LA2_19 <= '9') || (LA2_19 >= '@' && LA2_19 <= 'Z') || (LA2_19 >= 'a' && LA2_19 <= 'z'))) {
                            alt2 = 12;
                        } else {
                            alt2 = 7;
                        }

                    } else {
                        alt2 = 12;
                    }

                } else {
                    alt2 = 12;
                }

            }
            break;
            case '{': {
                alt2 = 8;
            }
            break;
            case '}': {
                alt2 = 9;
            }
            break;
            case ',': {
                alt2 = 10;
            }
            break;
            case ':': {
                alt2 = 11;
            }
            break;
            case '+':
            case '.':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z': {
                alt2 = 12;
            }
            break;
            default:
                NoViableAltException nvae
                        = new NoViableAltException("", 2, 0, input);
                throw nvae;
        }
        switch (alt2) {
            case 1: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:10: T__7
            {
                mT__7();

            }
            break;
            case 2: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:15: T__8
            {
                mT__8();

            }
            break;
            case 3: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:20: T__9
            {
                mT__9();

            }
            break;
            case 4: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:25: T__10
            {
                mT__10();

            }
            break;
            case 5: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:31: T__11
            {
                mT__11();

            }
            break;
            case 6: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:37: T__12
            {
                mT__12();

            }
            break;
            case 7: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:43: T__13
            {
                mT__13();

            }
            break;
            case 8: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:49: T__14
            {
                mT__14();

            }
            break;
            case 9: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:55: T__15
            {
                mT__15();

            }
            break;
            case 10: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:61: P
            {
                mP();

            }
            break;
            case 11: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:63: S
            {
                mS();

            }
            break;
            case 12: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:65: ID
            {
                mID();

            }
            break;

        }
    }

}
