// Generated from D:/antlr4/ShaderParser/src/HLSL\HLSL.g4 by ANTLR 4.5.1
package HLSL.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HLSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, VERSOIN_PROFILE=16, 
		CBUFFER=17, STRUCT=18, IF=19, ELSE=20, QUESTION=21, FOR=22, DO=23, WHILE=24, 
		CONTINUE=25, BREAK=26, RETURN=27, SWITCH=28, CASE=29, DEFUALT=30, LEFT_PAREN=31, 
		RIGHT_PAREN=32, LEFT_BRACE=33, RIGHT_BRACE=34, LEFT_BRACKET=35, RIGHT_BRACKET=36, 
		DOT=37, COLON=38, SEMICOLON=39, COMMA=40, SHARP=41, SEMANTICS=42, SHADER_SEMANTICS=43, 
		SV_SEMANTICS=44, FUNC_KEYWORD=45, DECIMAL=46, OCTAL=47, HEX=48, FLOAT_NUM=49, 
		SCALA=50, VECTOR=51, MATRIX=52, FLOAT_OPAQUE=53, INT_OPAQUE=54, U_INT_OPAQUE=55, 
		BASIC_OPAQUE_TYPE=56, INCREAMENT_OP=57, UNARY_OP=58, MULDIV_OP=59, ADDDIV_OP=60, 
		SHIFT_OP=61, COMPARE_OP=62, EQUAL_OP=63, BITWISE_OP=64, LOGIC_OP=65, ASSIGNMENT_OP=66, 
		ARITHMETIC_ASSIGNMENT_OP=67, IDENTIFIER=68, COMMENT=69, WS=70, LINE_COMMENT=71;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "VERSOIN_PROFILE", 
		"CBUFFER", "STRUCT", "IF", "ELSE", "QUESTION", "FOR", "DO", "WHILE", "CONTINUE", 
		"BREAK", "RETURN", "SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", 
		"SEMICOLON", "COMMA", "SHARP", "SEMANTICS", "SHADER_SEMANTICS", "SV_SEMANTICS", 
		"FUNC_KEYWORD", "DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", 
		"MATRIX", "FLOAT_OPAQUE", "INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", 
		"INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", 
		"EQUAL_OP", "BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", 
		"DIGIT", "HEX_DIGIT", "OCTAL_DIGIT", "INTEGER_SUFFIX", "EXPONENT", "FLOAT_SUFFIX", 
		"LETTER", "IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", null, 
		"'cbuffer'", "'struct'", "'if'", "'else'", "'?'", "'for'", "'do'", "'while'", 
		"'continue'", "'break'", "'return'", "'switch'", "'case'", "'defualt'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", "','", 
		"'#'", null, null, null, "'dot'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "VERSOIN_PROFILE", "CBUFFER", "STRUCT", "IF", 
		"ELSE", "QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", 
		"SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", 
		"COMMA", "SHARP", "SEMANTICS", "SHADER_SEMANTICS", "SV_SEMANTICS", "FUNC_KEYWORD", 
		"DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", 
		"INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", 
		"MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", 
		"LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", "IDENTIFIER", 
		"COMMENT", "WS", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HLSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HLSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2I\u03bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0132\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\5+\u019c\n+\3,\3,\3,\3,\3,\3,\3,"+
		"\5,\u01a5\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01b1\n,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u01bd\n,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01c7\n,\5,\u01c9"+
		"\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u01e1\n-\5-\u01e3\n-\3.\3.\3.\3.\3/\6/\u01ea\n/\r/\16/\u01eb\3/\5"+
		"/\u01ef\n/\3\60\3\60\7\60\u01f3\n\60\f\60\16\60\u01f6\13\60\3\60\5\60"+
		"\u01f9\n\60\3\61\3\61\3\61\3\61\6\61\u01ff\n\61\r\61\16\61\u0200\3\61"+
		"\5\61\u0204\n\61\3\62\6\62\u0207\n\62\r\62\16\62\u0208\3\62\3\62\7\62"+
		"\u020d\n\62\f\62\16\62\u0210\13\62\3\62\5\62\u0213\n\62\3\62\5\62\u0216"+
		"\n\62\3\62\3\62\6\62\u021a\n\62\r\62\16\62\u021b\3\62\5\62\u021f\n\62"+
		"\3\62\5\62\u0222\n\62\3\62\6\62\u0225\n\62\r\62\16\62\u0226\3\62\3\62"+
		"\5\62\u022b\n\62\5\62\u022d\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\5\63\u0245\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0250\n\64\3\65\3\65\3\65\3\65\5\65\u0256\n\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\5\65\u025e\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02e1\n\66\5\66\u02e3\n"+
		"\66\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02f5\n8"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\59\u0303\n9\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\59\u033f\n9\3:\3:\3:\3:\5:\u0345\n:\3;\3;\3<\3<\3=\3="+
		"\3>\3>\3>\3>\5>\u0351\n>\3?\3?\3?\3?\3?\5?\u0358\n?\3@\3@\3@\3@\5@\u035e"+
		"\n@\3A\3A\3B\3B\3B\3B\3B\3B\5B\u0368\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\5D\u0378\nD\3E\3E\3F\5F\u037d\nF\3G\3G\3H\3H\3I\3I\5I\u0385"+
		"\nI\3I\6I\u0388\nI\rI\16I\u0389\3J\3J\3K\5K\u038f\nK\3L\3L\3L\7L\u0394"+
		"\nL\fL\16L\u0397\13L\3M\3M\3M\3M\7M\u039d\nM\fM\16M\u03a0\13M\3M\3M\3"+
		"M\3M\3M\3N\6N\u03a8\nN\rN\16N\u03a9\3N\3N\3O\3O\3O\3O\7O\u03b2\nO\fO\16"+
		"O\u03b5\13O\3O\5O\u03b8\nO\3O\3O\3O\3O\3\u039e\2P\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2"+
		"\u0095\2\u0097F\u0099G\u009bH\u009dI\3\2\21\3\2\64\66\4\2##\u0080\u0080"+
		"\5\2\'\',,\61\61\4\2--//\4\2>>@@\5\2((``~~\3\2\62;\5\2\62;CHch\3\2\62"+
		"9\6\2NNWWnnww\4\2GGgg\6\2HHJJhhjj\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f"+
		"\17\17\u03fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u009f\3\2\2\2\5\u00a7\3\2\2\2\7\u00ae"+
		"\3\2\2\2\t\u00b6\3\2\2\2\13\u00bd\3\2\2\2\r\u00c6\3\2\2\2\17\u00cd\3\2"+
		"\2\2\21\u00d9\3\2\2\2\23\u00e9\3\2\2\2\25\u00f1\3\2\2\2\27\u00f7\3\2\2"+
		"\2\31\u0101\3\2\2\2\33\u010e\3\2\2\2\35\u0113\3\2\2\2\37\u0119\3\2\2\2"+
		"!\u0131\3\2\2\2#\u0133\3\2\2\2%\u013b\3\2\2\2\'\u0142\3\2\2\2)\u0145\3"+
		"\2\2\2+\u014a\3\2\2\2-\u014c\3\2\2\2/\u0150\3\2\2\2\61\u0153\3\2\2\2\63"+
		"\u0159\3\2\2\2\65\u0162\3\2\2\2\67\u0168\3\2\2\29\u016f\3\2\2\2;\u0176"+
		"\3\2\2\2=\u017b\3\2\2\2?\u0183\3\2\2\2A\u0185\3\2\2\2C\u0187\3\2\2\2E"+
		"\u0189\3\2\2\2G\u018b\3\2\2\2I\u018d\3\2\2\2K\u018f\3\2\2\2M\u0191\3\2"+
		"\2\2O\u0193\3\2\2\2Q\u0195\3\2\2\2S\u0197\3\2\2\2U\u019b\3\2\2\2W\u01c8"+
		"\3\2\2\2Y\u01e2\3\2\2\2[\u01e4\3\2\2\2]\u01e9\3\2\2\2_\u01f0\3\2\2\2a"+
		"\u01fa\3\2\2\2c\u022c\3\2\2\2e\u0244\3\2\2\2g\u024f\3\2\2\2i\u025d\3\2"+
		"\2\2k\u02e2\3\2\2\2m\u02e4\3\2\2\2o\u02f4\3\2\2\2q\u0302\3\2\2\2s\u0344"+
		"\3\2\2\2u\u0346\3\2\2\2w\u0348\3\2\2\2y\u034a\3\2\2\2{\u0350\3\2\2\2}"+
		"\u0357\3\2\2\2\177\u035d\3\2\2\2\u0081\u035f\3\2\2\2\u0083\u0367\3\2\2"+
		"\2\u0085\u0369\3\2\2\2\u0087\u0377\3\2\2\2\u0089\u0379\3\2\2\2\u008b\u037c"+
		"\3\2\2\2\u008d\u037e\3\2\2\2\u008f\u0380\3\2\2\2\u0091\u0382\3\2\2\2\u0093"+
		"\u038b\3\2\2\2\u0095\u038e\3\2\2\2\u0097\u0390\3\2\2\2\u0099\u0398\3\2"+
		"\2\2\u009b\u03a7\3\2\2\2\u009d\u03ad\3\2\2\2\u009f\u00a0\7x\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7q\2\2\u00a5\u00a6\7p\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7u"+
		"\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7e\2\2\u00ad\6\3\2\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7o\2\2\u00b5\b\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7z\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2"+
		"\u00bb\u00bc\7p\2\2\u00bc\n\3\2\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7q"+
		"\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\f\3\2\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7f\2\2\u00cc\16\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7r\2\2"+
		"\u00d2\u00d3\7u\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7f\2\2\u00d8\20\3\2\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7r\2\2"+
		"\u00e1\u00e2\7q\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\22\3\2\2\2\u00e9\u00ea\7r\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\24\3\2\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7"+
		"p\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7v\2\2\u00f6\26\3\2\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7a\2\2\u00fb"+
		"\u00fc\7o\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7l\2\2\u00fe\u00ff\7q\2\2"+
		"\u00ff\u0100\7t\2\2\u0100\30\3\2\2\2\u0101\u0102\7e\2\2\u0102\u0103\7"+
		"q\2\2\u0103\u0104\7n\2\2\u0104\u0105\7w\2\2\u0105\u0106\7o\2\2\u0106\u0107"+
		"\7p\2\2\u0107\u0108\7a\2\2\u0108\u0109\7o\2\2\u0109\u010a\7c\2\2\u010a"+
		"\u010b\7l\2\2\u010b\u010c\7q\2\2\u010c\u010d\7t\2\2\u010d\32\3\2\2\2\u010e"+
		"\u010f\7v\2\2\u010f\u0110\7t\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2"+
		"\u0112\34\3\2\2\2\u0113\u0114\7h\2\2\u0114\u0115\7c\2\2\u0115\u0116\7"+
		"n\2\2\u0116\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118\36\3\2\2\2\u0119\u011a"+
		"\7x\2\2\u011a\u011b\7q\2\2\u011b\u011c\7k\2\2\u011c\u011d\7f\2\2\u011d"+
		" \3\2\2\2\u011e\u011f\7e\2\2\u011f\u0120\7q\2\2\u0120\u0121\7t\2\2\u0121"+
		"\u0132\7g\2\2\u0122\u0123\7e\2\2\u0123\u0124\7q\2\2\u0124\u0125\7o\2\2"+
		"\u0125\u0126\7r\2\2\u0126\u0127\7c\2\2\u0127\u0128\7v\2\2\u0128\u0129"+
		"\7k\2\2\u0129\u012a\7d\2\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7k\2\2\u012d\u012e\7v\2\2\u012e\u0132\7{\2\2\u012f\u0130\7g\2\2"+
		"\u0130\u0132\7u\2\2\u0131\u011e\3\2\2\2\u0131\u0122\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\"\3\2\2\2\u0133\u0134\7e\2\2\u0134\u0135\7d\2\2\u0135\u0136"+
		"\7w\2\2\u0136\u0137\7h\2\2\u0137\u0138\7h\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7t\2\2\u013a$\3\2\2\2\u013b\u013c\7u\2\2\u013c\u013d\7v\2\2\u013d"+
		"\u013e\7t\2\2\u013e\u013f\7w\2\2\u013f\u0140\7e\2\2\u0140\u0141\7v\2\2"+
		"\u0141&\3\2\2\2\u0142\u0143\7k\2\2\u0143\u0144\7h\2\2\u0144(\3\2\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7n\2\2\u0147\u0148\7u\2\2\u0148\u0149\7g\2\2"+
		"\u0149*\3\2\2\2\u014a\u014b\7A\2\2\u014b,\3\2\2\2\u014c\u014d\7h\2\2\u014d"+
		"\u014e\7q\2\2\u014e\u014f\7t\2\2\u014f.\3\2\2\2\u0150\u0151\7f\2\2\u0151"+
		"\u0152\7q\2\2\u0152\60\3\2\2\2\u0153\u0154\7y\2\2\u0154\u0155\7j\2\2\u0155"+
		"\u0156\7k\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2\u0158\62\3\2\2\2\u0159"+
		"\u015a\7e\2\2\u015a\u015b\7q\2\2\u015b\u015c\7p\2\2\u015c\u015d\7v\2\2"+
		"\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2\u015f\u0160\7w\2\2\u0160\u0161"+
		"\7g\2\2\u0161\64\3\2\2\2\u0162\u0163\7d\2\2\u0163\u0164\7t\2\2\u0164\u0165"+
		"\7g\2\2\u0165\u0166\7c\2\2\u0166\u0167\7m\2\2\u0167\66\3\2\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\7g\2\2\u016a\u016b\7v\2\2\u016b\u016c\7w\2\2\u016c"+
		"\u016d\7t\2\2\u016d\u016e\7p\2\2\u016e8\3\2\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7y\2\2\u0171\u0172\7k\2\2\u0172\u0173\7v\2\2\u0173\u0174\7e\2\2"+
		"\u0174\u0175\7j\2\2\u0175:\3\2\2\2\u0176\u0177\7e\2\2\u0177\u0178\7c\2"+
		"\2\u0178\u0179\7u\2\2\u0179\u017a\7g\2\2\u017a<\3\2\2\2\u017b\u017c\7"+
		"f\2\2\u017c\u017d\7g\2\2\u017d\u017e\7h\2\2\u017e\u017f\7w\2\2\u017f\u0180"+
		"\7c\2\2\u0180\u0181\7n\2\2\u0181\u0182\7v\2\2\u0182>\3\2\2\2\u0183\u0184"+
		"\7*\2\2\u0184@\3\2\2\2\u0185\u0186\7+\2\2\u0186B\3\2\2\2\u0187\u0188\7"+
		"}\2\2\u0188D\3\2\2\2\u0189\u018a\7\177\2\2\u018aF\3\2\2\2\u018b\u018c"+
		"\7]\2\2\u018cH\3\2\2\2\u018d\u018e\7_\2\2\u018eJ\3\2\2\2\u018f\u0190\7"+
		"\60\2\2\u0190L\3\2\2\2\u0191\u0192\7<\2\2\u0192N\3\2\2\2\u0193\u0194\7"+
		"=\2\2\u0194P\3\2\2\2\u0195\u0196\7.\2\2\u0196R\3\2\2\2\u0197\u0198\7%"+
		"\2\2\u0198T\3\2\2\2\u0199\u019c\5W,\2\u019a\u019c\5Y-\2\u019b\u0199\3"+
		"\2\2\2\u019b\u019a\3\2\2\2\u019cV\3\2\2\2\u019d\u019e\7E\2\2\u019e\u019f"+
		"\7Q\2\2\u019f\u01a0\7N\2\2\u01a0\u01a1\7Q\2\2\u01a1\u01a2\7T\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\5]/\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\u01c9\3\2\2\2\u01a6\u01a7\7R\2\2\u01a7\u01a8\7Q\2\2\u01a8\u01a9"+
		"\7U\2\2\u01a9\u01aa\7K\2\2\u01aa\u01ab\7V\2\2\u01ab\u01ac\7K\2\2\u01ac"+
		"\u01ad\7Q\2\2\u01ad\u01ae\7P\2\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\5]/\2"+
		"\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01c9\3\2\2\2\u01b2\u01b3"+
		"\7V\2\2\u01b3\u01b4\7G\2\2\u01b4\u01b5\7Z\2\2\u01b5\u01b6\7E\2\2\u01b6"+
		"\u01b7\7Q\2\2\u01b7\u01b8\7Q\2\2\u01b8\u01b9\7T\2\2\u01b9\u01ba\7F\2\2"+
		"\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5]/\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01c9\3\2\2\2\u01be\u01bf\7P\2\2\u01bf\u01c0\7Q\2\2\u01c0"+
		"\u01c1\7T\2\2\u01c1\u01c2\7O\2\2\u01c2\u01c3\7C\2\2\u01c3\u01c4\7N\2\2"+
		"\u01c4\u01c6\3\2\2\2\u01c5\u01c7\5]/\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u019d\3\2\2\2\u01c8\u01a6\3\2\2\2\u01c8"+
		"\u01b2\3\2\2\2\u01c8\u01be\3\2\2\2\u01c9X\3\2\2\2\u01ca\u01cb\7U\2\2\u01cb"+
		"\u01cc\7X\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7R\2\2\u01ce\u01cf\7Q\2\2"+
		"\u01cf\u01d0\7U\2\2\u01d0\u01d1\7K\2\2\u01d1\u01d2\7V\2\2\u01d2\u01d3"+
		"\7K\2\2\u01d3\u01d4\7Q\2\2\u01d4\u01e3\7P\2\2\u01d5\u01d6\7U\2\2\u01d6"+
		"\u01d7\7X\2\2\u01d7\u01d8\7a\2\2\u01d8\u01d9\7V\2\2\u01d9\u01da\7C\2\2"+
		"\u01da\u01db\7T\2\2\u01db\u01dc\7I\2\2\u01dc\u01dd\7G\2\2\u01dd\u01de"+
		"\7V\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5\u008dG\2\u01e0\u01df\3\2\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01ca\3\2\2\2\u01e2\u01d5"+
		"\3\2\2\2\u01e3Z\3\2\2\2\u01e4\u01e5\7f\2\2\u01e5\u01e6\7q\2\2\u01e6\u01e7"+
		"\7v\2\2\u01e7\\\3\2\2\2\u01e8\u01ea\5\u0089E\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01ef\5\u008fH\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"^\3\2\2\2\u01f0\u01f4\7^\2\2\u01f1\u01f3\5\u008dG\2\u01f2\u01f1\3\2\2"+
		"\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f8"+
		"\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\5\u008fH\2\u01f8\u01f7\3\2\2"+
		"\2\u01f8\u01f9\3\2\2\2\u01f9`\3\2\2\2\u01fa\u01fb\7^\2\2\u01fb\u01fc\7"+
		"z\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5\u008bF\2\u01fe\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2"+
		"\2\2\u0202\u0204\5\u008fH\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"b\3\2\2\2\u0205\u0207\5\u0089E\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020e"+
		"\5K&\2\u020b\u020d\5\u0089E\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2"+
		"\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e"+
		"\3\2\2\2\u0211\u0213\5\u0091I\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2"+
		"\2\u0213\u0215\3\2\2\2\u0214\u0216\5\u0093J\2\u0215\u0214\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u022d\3\2\2\2\u0217\u0219\5K&\2\u0218\u021a\5\u0089"+
		"E\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021f\5\u0091I\2\u021e\u021d"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u0222\5\u0093J"+
		"\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u022d\3\2\2\2\u0223\u0225"+
		"\5\u0089E\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\5\u0091I\2\u0229"+
		"\u022b\5\u0093J\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d"+
		"\3\2\2\2\u022c\u0206\3\2\2\2\u022c\u0217\3\2\2\2\u022c\u0224\3\2\2\2\u022d"+
		"d\3\2\2\2\u022e\u022f\7d\2\2\u022f\u0230\7q\2\2\u0230\u0231\7q\2\2\u0231"+
		"\u0245\7n\2\2\u0232\u0233\7k\2\2\u0233\u0234\7p\2\2\u0234\u0245\7v\2\2"+
		"\u0235\u0236\7j\2\2\u0236\u0237\7c\2\2\u0237\u0238\7n\2\2\u0238\u0245"+
		"\7h\2\2\u0239\u023a\7h\2\2\u023a\u023b\7n\2\2\u023b\u023c\7q\2\2\u023c"+
		"\u023d\7c\2\2\u023d\u0245\7v\2\2\u023e\u023f\7f\2\2\u023f\u0240\7q\2\2"+
		"\u0240\u0241\7w\2\2\u0241\u0242\7d\2\2\u0242\u0243\7n\2\2\u0243\u0245"+
		"\7g\2\2\u0244\u022e\3\2\2\2\u0244\u0232\3\2\2\2\u0244\u0235\3\2\2\2\u0244"+
		"\u0239\3\2\2\2\u0244\u023e\3\2\2\2\u0245f\3\2\2\2\u0246\u0247\5e\63\2"+
		"\u0247\u0248\t\2\2\2\u0248\u0250\3\2\2\2\u0249\u024a\7x\2\2\u024a\u024b"+
		"\7g\2\2\u024b\u024c\7e\2\2\u024c\u024d\7v\2\2\u024d\u024e\7q\2\2\u024e"+
		"\u0250\7t\2\2\u024f\u0246\3\2\2\2\u024f\u0249\3\2\2\2\u0250h\3\2\2\2\u0251"+
		"\u0252\5e\63\2\u0252\u0255\t\2\2\2\u0253\u0254\7z\2\2\u0254\u0256\t\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025e\3\2\2\2\u0257"+
		"\u0258\7o\2\2\u0258\u0259\7c\2\2\u0259\u025a\7v\2\2\u025a\u025b\7t\2\2"+
		"\u025b\u025c\7k\2\2\u025c\u025e\7z\2\2\u025d\u0251\3\2\2\2\u025d\u0257"+
		"\3\2\2\2\u025ej\3\2\2\2\u025f\u02e3\5q9\2\u0260\u0261\7u\2\2\u0261\u0262"+
		"\7c\2\2\u0262\u0263\7o\2\2\u0263\u0264\7r\2\2\u0264\u0265\7n\2\2\u0265"+
		"\u0266\7g\2\2\u0266\u0267\7t\2\2\u0267\u0268\7\63\2\2\u0268\u0269\7F\2"+
		"\2\u0269\u026a\7U\2\2\u026a\u026b\7j\2\2\u026b\u026c\7c\2\2\u026c\u026d"+
		"\7f\2\2\u026d\u026e\7q\2\2\u026e\u02e1\7y\2\2\u026f\u0270\7u\2\2\u0270"+
		"\u0271\7c\2\2\u0271\u0272\7o\2\2\u0272\u0273\7r\2\2\u0273\u0274\7n\2\2"+
		"\u0274\u0275\7g\2\2\u0275\u0276\7t\2\2\u0276\u0277\7\64\2\2\u0277\u0278"+
		"\7F\2\2\u0278\u0279\7U\2\2\u0279\u027a\7j\2\2\u027a\u027b\7c\2\2\u027b"+
		"\u027c\7f\2\2\u027c\u027d\7q\2\2\u027d\u02e1\7y\2\2\u027e\u027f\7u\2\2"+
		"\u027f\u0280\7c\2\2\u0280\u0281\7o\2\2\u0281\u0282\7r\2\2\u0282\u0283"+
		"\7n\2\2\u0283\u0284\7g\2\2\u0284\u0285\7t\2\2\u0285\u0286\7\64\2\2\u0286"+
		"\u0287\7F\2\2\u0287\u0288\7T\2\2\u0288\u0289\7g\2\2\u0289\u028a\7e\2\2"+
		"\u028a\u028b\7v\2\2\u028b\u028c\7U\2\2\u028c\u028d\7j\2\2\u028d\u028e"+
		"\7c\2\2\u028e\u028f\7f\2\2\u028f\u0290\7q\2\2\u0290\u02e1\7y\2\2\u0291"+
		"\u0292\7u\2\2\u0292\u0293\7c\2\2\u0293\u0294\7o\2\2\u0294\u0295\7r\2\2"+
		"\u0295\u0296\7n\2\2\u0296\u0297\7g\2\2\u0297\u0298\7t\2\2\u0298\u0299"+
		"\7\63\2\2\u0299\u029a\7F\2\2\u029a\u029b\7C\2\2\u029b\u029c\7t\2\2\u029c"+
		"\u029d\7t\2\2\u029d\u029e\7c\2\2\u029e\u029f\7{\2\2\u029f\u02a0\7U\2\2"+
		"\u02a0\u02a1\7j\2\2\u02a1\u02a2\7c\2\2\u02a2\u02a3\7f\2\2\u02a3\u02a4"+
		"\7q\2\2\u02a4\u02e1\7y\2\2\u02a5\u02a6\7u\2\2\u02a6\u02a7\7c\2\2\u02a7"+
		"\u02a8\7o\2\2\u02a8\u02a9\7r\2\2\u02a9\u02aa\7n\2\2\u02aa\u02ab\7g\2\2"+
		"\u02ab\u02ac\7t\2\2\u02ac\u02ad\7\64\2\2\u02ad\u02ae\7F\2\2\u02ae\u02af"+
		"\7C\2\2\u02af\u02b0\7t\2\2\u02b0\u02b1\7t\2\2\u02b1\u02b2\7c\2\2\u02b2"+
		"\u02b3\7{\2\2\u02b3\u02b4\7U\2\2\u02b4\u02b5\7j\2\2\u02b5\u02b6\7c\2\2"+
		"\u02b6\u02b7\7f\2\2\u02b7\u02b8\7q\2\2\u02b8\u02e1\7y\2\2\u02b9\u02ba"+
		"\7u\2\2\u02ba\u02bb\7c\2\2\u02bb\u02bc\7o\2\2\u02bc\u02bd\7r\2\2\u02bd"+
		"\u02be\7n\2\2\u02be\u02bf\7g\2\2\u02bf\u02c0\7t\2\2\u02c0\u02c1\7E\2\2"+
		"\u02c1\u02c2\7w\2\2\u02c2\u02c3\7d\2\2\u02c3\u02c4\7g\2\2\u02c4\u02c5"+
		"\7U\2\2\u02c5\u02c6\7j\2\2\u02c6\u02c7\7c\2\2\u02c7\u02c8\7f\2\2\u02c8"+
		"\u02c9\7q\2\2\u02c9\u02e1\7y\2\2\u02ca\u02cb\7u\2\2\u02cb\u02cc\7c\2\2"+
		"\u02cc\u02cd\7o\2\2\u02cd\u02ce\7r\2\2\u02ce\u02cf\7n\2\2\u02cf\u02d0"+
		"\7g\2\2\u02d0\u02d1\7t\2\2\u02d1\u02d2\7E\2\2\u02d2\u02d3\7w\2\2\u02d3"+
		"\u02d4\7d\2\2\u02d4\u02d5\7g\2\2\u02d5\u02d6\7C\2\2\u02d6\u02d7\7t\2\2"+
		"\u02d7\u02d8\7t\2\2\u02d8\u02d9\7c\2\2\u02d9\u02da\7{\2\2\u02da\u02db"+
		"\7U\2\2\u02db\u02dc\7j\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7f\2\2\u02de"+
		"\u02df\7q\2\2\u02df\u02e1\7y\2\2\u02e0\u0260\3\2\2\2\u02e0\u026f\3\2\2"+
		"\2\u02e0\u027e\3\2\2\2\u02e0\u0291\3\2\2\2\u02e0\u02a5\3\2\2\2\u02e0\u02b9"+
		"\3\2\2\2\u02e0\u02ca\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u025f\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e3l\3\2\2\2\u02e4\u02e5\7k\2\2\u02e5\u02e6\5q9\2\u02e6"+
		"n\3\2\2\2\u02e7\u02e8\7w\2\2\u02e8\u02f5\5q9\2\u02e9\u02ea\7c\2\2\u02ea"+
		"\u02eb\7v\2\2\u02eb\u02ec\7q\2\2\u02ec\u02ed\7o\2\2\u02ed\u02ee\7k\2\2"+
		"\u02ee\u02ef\7e\2\2\u02ef\u02f0\7a\2\2\u02f0\u02f1\7w\2\2\u02f1\u02f2"+
		"\7k\2\2\u02f2\u02f3\7p\2\2\u02f3\u02f5\7v\2\2\u02f4\u02e7\3\2\2\2\u02f4"+
		"\u02e9\3\2\2\2\u02f5p\3\2\2\2\u02f6\u02f7\7u\2\2\u02f7\u02f8\7c\2\2\u02f8"+
		"\u02f9\7o\2\2\u02f9\u02fa\7r\2\2\u02fa\u02fb\7n\2\2\u02fb\u02fc\7g\2\2"+
		"\u02fc\u0303\7t\2\2\u02fd\u02fe\7k\2\2\u02fe\u02ff\7o\2\2\u02ff\u0300"+
		"\7c\2\2\u0300\u0301\7i\2\2\u0301\u0303\7g\2\2\u0302\u02f6\3\2\2\2\u0302"+
		"\u02fd\3\2\2\2\u0303\u033e\3\2\2\2\u0304\u0305\7\63\2\2\u0305\u033f\7"+
		"F\2\2\u0306\u0307\7\64\2\2\u0307\u033f\7F\2\2\u0308\u0309\7\65\2\2\u0309"+
		"\u033f\7F\2\2\u030a\u030b\7E\2\2\u030b\u030c\7w\2\2\u030c\u030d\7d\2\2"+
		"\u030d\u033f\7g\2\2\u030e\u030f\7\64\2\2\u030f\u0310\7F\2\2\u0310\u0311"+
		"\7T\2\2\u0311\u0312\7g\2\2\u0312\u0313\7e\2\2\u0313\u033f\7v\2\2\u0314"+
		"\u0315\7\63\2\2\u0315\u0316\7F\2\2\u0316\u0317\7C\2\2\u0317\u0318\7t\2"+
		"\2\u0318\u0319\7t\2\2\u0319\u031a\7c\2\2\u031a\u033f\7{\2\2\u031b\u031c"+
		"\7\64\2\2\u031c\u031d\7F\2\2\u031d\u031e\7C\2\2\u031e\u031f\7t\2\2\u031f"+
		"\u0320\7t\2\2\u0320\u0321\7c\2\2\u0321\u033f\7{\2\2\u0322\u0323\7D\2\2"+
		"\u0323\u0324\7w\2\2\u0324\u0325\7h\2\2\u0325\u0326\7h\2\2\u0326\u0327"+
		"\7g\2\2\u0327\u033f\7t\2\2\u0328\u0329\7\64\2\2\u0329\u032a\7F\2\2\u032a"+
		"\u032b\7O\2\2\u032b\u033f\7U\2\2\u032c\u032d\7\64\2\2\u032d\u032e\7F\2"+
		"\2\u032e\u032f\7O\2\2\u032f\u0330\7U\2\2\u0330\u0331\7C\2\2\u0331\u0332"+
		"\7t\2\2\u0332\u0333\7t\2\2\u0333\u0334\7c\2\2\u0334\u033f\7{\2\2\u0335"+
		"\u0336\7E\2\2\u0336\u0337\7w\2\2\u0337\u0338\7d\2\2\u0338\u0339\7g\2\2"+
		"\u0339\u033a\7C\2\2\u033a\u033b\7t\2\2\u033b\u033c\7t\2\2\u033c\u033d"+
		"\7c\2\2\u033d\u033f\7{\2\2\u033e\u0304\3\2\2\2\u033e\u0306\3\2\2\2\u033e"+
		"\u0308\3\2\2\2\u033e\u030a\3\2\2\2\u033e\u030e\3\2\2\2\u033e\u0314\3\2"+
		"\2\2\u033e\u031b\3\2\2\2\u033e\u0322\3\2\2\2\u033e\u0328\3\2\2\2\u033e"+
		"\u032c\3\2\2\2\u033e\u0335\3\2\2\2\u033fr\3\2\2\2\u0340\u0341\7-\2\2\u0341"+
		"\u0345\7-\2\2\u0342\u0343\7/\2\2\u0343\u0345\7/\2\2\u0344\u0340\3\2\2"+
		"\2\u0344\u0342\3\2\2\2\u0345t\3\2\2\2\u0346\u0347\t\3\2\2\u0347v\3\2\2"+
		"\2\u0348\u0349\t\4\2\2\u0349x\3\2\2\2\u034a\u034b\t\5\2\2\u034bz\3\2\2"+
		"\2\u034c\u034d\7>\2\2\u034d\u0351\7>\2\2\u034e\u034f\7@\2\2\u034f\u0351"+
		"\7@\2\2\u0350\u034c\3\2\2\2\u0350\u034e\3\2\2\2\u0351|\3\2\2\2\u0352\u0358"+
		"\t\6\2\2\u0353\u0354\7>\2\2\u0354\u0358\7?\2\2\u0355\u0356\7@\2\2\u0356"+
		"\u0358\7?\2\2\u0357\u0352\3\2\2\2\u0357\u0353\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358~\3\2\2\2\u0359\u035a\7?\2\2\u035a\u035e\7?\2\2\u035b\u035c"+
		"\7#\2\2\u035c\u035e\7?\2\2\u035d\u0359\3\2\2\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0080\3\2\2\2\u035f\u0360\t\7\2\2\u0360\u0082\3\2\2\2\u0361\u0362\7("+
		"\2\2\u0362\u0368\7(\2\2\u0363\u0364\7`\2\2\u0364\u0368\7`\2\2\u0365\u0366"+
		"\7~\2\2\u0366\u0368\7~\2\2\u0367\u0361\3\2\2\2\u0367\u0363\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0368\u0084\3\2\2\2\u0369\u036a\7?\2\2\u036a\u0086\3\2"+
		"\2\2\u036b\u036c\5w<\2\u036c\u036d\5\u0085C\2\u036d\u0378\3\2\2\2\u036e"+
		"\u036f\5y=\2\u036f\u0370\5\u0085C\2\u0370\u0378\3\2\2\2\u0371\u0372\5"+
		"{>\2\u0372\u0373\5\u0085C\2\u0373\u0378\3\2\2\2\u0374\u0375\5\u0081A\2"+
		"\u0375\u0376\5\u0085C\2\u0376\u0378\3\2\2\2\u0377\u036b\3\2\2\2\u0377"+
		"\u036e\3\2\2\2\u0377\u0371\3\2\2\2\u0377\u0374\3\2\2\2\u0378\u0088\3\2"+
		"\2\2\u0379\u037a\t\b\2\2\u037a\u008a\3\2\2\2\u037b\u037d\t\t\2\2\u037c"+
		"\u037b\3\2\2\2\u037d\u008c\3\2\2\2\u037e\u037f\t\n\2\2\u037f\u008e\3\2"+
		"\2\2\u0380\u0381\t\13\2\2\u0381\u0090\3\2\2\2\u0382\u0384\t\f\2\2\u0383"+
		"\u0385\5y=\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2"+
		"\2\u0386\u0388\4\62;\2\u0387\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0387"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0092\3\2\2\2\u038b\u038c\t\r\2\2\u038c"+
		"\u0094\3\2\2\2\u038d\u038f\t\16\2\2\u038e\u038d\3\2\2\2\u038f\u0096\3"+
		"\2\2\2\u0390\u0395\5\u0095K\2\u0391\u0394\5\u0095K\2\u0392\u0394\5\u0089"+
		"E\2\u0393\u0391\3\2\2\2\u0393\u0392\3\2\2\2\u0394\u0397\3\2\2\2\u0395"+
		"\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0098\3\2\2\2\u0397\u0395\3\2"+
		"\2\2\u0398\u0399\7\61\2\2\u0399\u039a\7,\2\2\u039a\u039e\3\2\2\2\u039b"+
		"\u039d\13\2\2\2\u039c\u039b\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039f\3"+
		"\2\2\2\u039e\u039c\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1"+
		"\u03a2\7,\2\2\u03a2\u03a3\7\61\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\bM"+
		"\2\2\u03a5\u009a\3\2\2\2\u03a6\u03a8\t\17\2\2\u03a7\u03a6\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\bN\2\2\u03ac\u009c\3\2\2\2\u03ad\u03ae\7\61\2\2\u03ae"+
		"\u03af\7\61\2\2\u03af\u03b3\3\2\2\2\u03b0\u03b2\n\20\2\2\u03b1\u03b0\3"+
		"\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b8\7\17\2\2\u03b7\u03b6\3"+
		"\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\7\f\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bc\bO\2\2\u03bc\u009e\3\2\2\2\65\2\u0131\u019b"+
		"\u01a4\u01b0\u01bc\u01c6\u01c8\u01e0\u01e2\u01eb\u01ee\u01f4\u01f8\u0200"+
		"\u0203\u0208\u020e\u0212\u0215\u021b\u021e\u0221\u0226\u022a\u022c\u0244"+
		"\u024f\u0255\u025d\u02e0\u02e2\u02f4\u0302\u033e\u0344\u0350\u0357\u035d"+
		"\u0367\u0377\u037c\u0384\u0389\u038e\u0393\u0395\u039e\u03a9\u03b3\u03b7"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}