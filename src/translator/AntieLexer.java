package translator;

// $ANTLR 3.5.1 D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g 2014-12-14 18:23:01
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

    public AntieLexer() {
    }

    public AntieLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    
    @Override
        public void reportError(RecognitionException e) {
         error += "\nlex error at "+e.line +" "+e.charPositionInLine;
            System.out.println(e.getMessage()+" lex");
         errorFlag = true;
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
                output+= "\nLex: \"hashCode\" - ok";
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
                output+= "\nLex: \"object\" - ok";

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
                output+= "\nLex: type - ok";
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
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:6:7: ( '{' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:6:9: '{'
            {
                match('{');
                output+= "\nLex: { - ok";
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
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:7: ( '}' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:9: '}'
            {
                match('}');
                output+= "\nLex: } - ok";
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__12"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            int _type = P;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:4: ( ',' )
            // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:9:6: ','
            {
                match(',');
                output+= "\nLex: , - ok";
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
                output+= "\nLex: : - ok";
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
                output+= "\nLex: ID - ok";
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
        // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | P | S | ID )
        int alt2 = 9;
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
            case '{': {
                alt2 = 5;
            }
            break;
            case '}': {
                alt2 = 6;
            }
            break;
            case ',': {
                alt2 = 7;
            }
            break;
            case ':': {
                alt2 = 8;
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
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
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
                alt2 = 9;
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
            case 7: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:43: P
            {
                mP();

            }
            break;
            case 8: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:45: S
            {
                mS();

            }
            break;
            case 9: // D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:1:47: ID
            {
                mID();

            }
            break;

        }
    }

}
