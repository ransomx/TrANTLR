// $ANTLR 3.5.1 D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g 2014-12-14 21:38:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AntieParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "P", "S", "'\"'", "'\"hashCode\"'", 
		"'\"object\"'", "'\"type\"'", "'con'", "'dev'", "'mes'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int ID=4;
	public static final int P=5;
	public static final int S=6;

        public String output = "";
    public String error = "";
    public boolean errorFlag = false;

    public boolean isErrorFlag() {
        return errorFlag;
    }

    public String getError() {
        return error;
    }

    public String getOutput() {
        return output;
    }
        
	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators

        public void reportError(RecognitionException e, String pravidlo) {
        error += "\nsyntax error in " + pravidlo+ " at " +e.line +" " + e.charPositionInLine;
        System.out.println(e.getMessage() + pravidlo + " parser");
        errorFlag = true;
    }

	public AntieParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AntieParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AntieParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g"; }



	// $ANTLR start "eval"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:3:1: eval : mainrule ;
	public final void eval() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:3:6: ( mainrule )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:3:8: mainrule
			{
			pushFollow(FOLLOW_mainrule_in_eval10);
			mainrule();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re,"eval");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eval"



	// $ANTLR start "mainrule"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:5:1: mainrule : command '{' subrule '}' ;
	public final void mainrule() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:5:9: ( command '{' subrule '}' )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:5:11: command '{' subrule '}'
			{
			pushFollow(FOLLOW_command_in_mainrule17);
			command();
			state._fsp--;

			match(input,14,FOLLOW_14_in_mainrule18); 
			pushFollow(FOLLOW_subrule_in_mainrule19);
			subrule();
			state._fsp--;

			match(input,15,FOLLOW_15_in_mainrule20); 
			}

		}
		catch (RecognitionException re) {
			reportError(re,"mainrule");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mainrule"



	// $ANTLR start "subrule"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:1: subrule : type P obj P hash ;
	public final void subrule() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:9: ( type P obj P hash )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:7:11: type P obj P hash
			{
			pushFollow(FOLLOW_type_in_subrule28);
			type();
			state._fsp--;

			match(input,P,FOLLOW_P_in_subrule30); 
			pushFollow(FOLLOW_obj_in_subrule32);
			obj();
			state._fsp--;

			match(input,P,FOLLOW_P_in_subrule34); 
			pushFollow(FOLLOW_hash_in_subrule36);
			hash();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re,"subrule");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subrule"



	// $ANTLR start "command"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:13:1: command : ( 'con' | 'dev' | 'mes' );
	public final void command() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:13:9: ( 'con' | 'dev' | 'mes' )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:
			{
			if ( (input.LA(1) >= 11 && input.LA(1) <= 13) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re,"command");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command"



	// $ANTLR start "type"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:15:1: type : '\"type\"' S str ;
	public final void type() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:15:7: ( '\"type\"' S str )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:15:9: '\"type\"' S str
			{
			match(input,10,FOLLOW_10_in_type121); 
			match(input,S,FOLLOW_S_in_type123); 
			pushFollow(FOLLOW_str_in_type125);
			str();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re,"type");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "obj"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:17:1: obj : '\"object\"' S object ;
	public final void obj() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:17:6: ( '\"object\"' S object )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:17:8: '\"object\"' S object
			{
			match(input,9,FOLLOW_9_in_obj134); 
			match(input,S,FOLLOW_S_in_obj136); 
			pushFollow(FOLLOW_object_in_obj138);
			object();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re,"obj");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "obj"



	// $ANTLR start "hash"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:19:1: hash : '\"hashCode\"' S str ;
	public final void hash() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:19:6: ( '\"hashCode\"' S str )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:19:8: '\"hashCode\"' S str
			{
			match(input,8,FOLLOW_8_in_hash146); 
			match(input,S,FOLLOW_S_in_hash148); 
			pushFollow(FOLLOW_str_in_hash150);
			str();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re,"hash");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "hash"



	// $ANTLR start "str"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:21:1: str : '\"' ID '\"' ;
	public final void str() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:21:6: ( '\"' ID '\"' )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:21:8: '\"' ID '\"'
			{
			match(input,7,FOLLOW_7_in_str159); 
			match(input,ID,FOLLOW_ID_in_str161); 
			match(input,7,FOLLOW_7_in_str163); 
			}

		}
		catch (RecognitionException re) {
			reportError(re,"str");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "str"



	// $ANTLR start "object"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:23:1: object : '{' subobject '}' ;
	public final void object() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:23:8: ( '{' subobject '}' )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:23:10: '{' subobject '}'
			{
			match(input,14,FOLLOW_14_in_object171); 
			pushFollow(FOLLOW_subobject_in_object173);
			subobject();
			state._fsp--;

			match(input,15,FOLLOW_15_in_object175); 
			}

		}
		catch (RecognitionException re) {
			reportError(re,"object");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "object"



	// $ANTLR start "subobject"
	// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:25:1: subobject : str S ( str | object ) ( options {greedy=true; } : ( P subobject ) )* ;
	public final void subobject() throws RecognitionException {
		try {
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:2: ( str S ( str | object ) ( options {greedy=true; } : ( P subobject ) )* )
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:4: str S ( str | object ) ( options {greedy=true; } : ( P subobject ) )*
			{
			pushFollow(FOLLOW_str_in_subobject185);
			str();
			state._fsp--;

			match(input,S,FOLLOW_S_in_subobject187); 
			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:10: ( str | object )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==7) ) {
				alt1=1;
			}
			else if ( (LA1_0==14) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:11: str
					{
					pushFollow(FOLLOW_str_in_subobject190);
					str();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:15: object
					{
					pushFollow(FOLLOW_object_in_subobject192);
					object();
					state._fsp--;

					}
					break;

			}

			// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:23: ( options {greedy=true; } : ( P subobject ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==P) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:46: ( P subobject )
					{
					// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:46: ( P subobject )
					// D:\\Work\\GitHub\\Realvision\\Translator\\src\\translator\\antie.g:26:47: P subobject
					{
					match(input,P,FOLLOW_P_in_subobject204); 
					pushFollow(FOLLOW_subobject_in_subobject206);
					subobject();
					state._fsp--;

					}

					}
					break;

				default :
					break loop2;
				}
			}

			}
                        
		}
		catch (RecognitionException re) {
			reportError(re,"subobject");
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subobject"

	// Delegated rules



	public static final BitSet FOLLOW_mainrule_in_eval10 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_mainrule17 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_mainrule18 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_subrule_in_mainrule19 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_mainrule20 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_subrule28 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_P_in_subrule30 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_obj_in_subrule32 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_P_in_subrule34 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_hash_in_subrule36 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_type121 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_S_in_type123 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_str_in_type125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_obj134 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_S_in_obj136 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_object_in_obj138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_hash146 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_S_in_hash148 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_str_in_hash150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_str159 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_str161 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_str163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_object171 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_subobject_in_object173 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_object175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_str_in_subobject185 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_S_in_subobject187 = new BitSet(new long[]{0x0000000000004080L});
	public static final BitSet FOLLOW_str_in_subobject190 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_object_in_subobject192 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_P_in_subobject204 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_subobject_in_subobject206 = new BitSet(new long[]{0x0000000000000022L});
}
