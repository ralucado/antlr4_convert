// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
package MidSL;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MidSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, VERSOIN_PROFILE=17, 
		SMPBUFFER=18, TXBUFFER=19, STRUCT=20, CBUFFER=21, INBUFFER=22, OUTBUFFER=23, 
		INOUTBUFFER=24, IF=25, ELSE=26, QUESTION=27, FOR=28, DO=29, WHILE=30, 
		CONTINUE=31, BREAK=32, RETURN=33, SWITCH=34, CASE=35, DEFUALT=36, LEFT_PAREN=37, 
		RIGHT_PAREN=38, LEFT_BRACE=39, RIGHT_BRACE=40, LEFT_BRACKET=41, RIGHT_BRACKET=42, 
		DOT=43, COLON=44, SEMICOLON=45, COMMA=46, SHARP=47, SEMANTICS=48, FUNC_KEYWORD=49, 
		DECIMAL=50, OCTAL=51, HEX=52, FLOAT_NUM=53, SCALA=54, VECTOR=55, MATRIX=56, 
		FLOAT_OPAQUE=57, INT_OPAQUE=58, U_INT_OPAQUE=59, BASIC_OPAQUE_TYPE=60, 
		INCREAMENT_OP=61, UNARY_OP=62, MULDIV_OP=63, ADDDIV_OP=64, SHIFT_OP=65, 
		COMPARE_OP=66, EQUAL_OP=67, BITWISE_OP=68, LOGIC_OP=69, ASSIGNMENT_OP=70, 
		ARITHMETIC_ASSIGNMENT_OP=71, IDENTIFIER=72, COMMENT=73, WS=74, LINE_COMMENT=75;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "VERSOIN_PROFILE", 
		"SMPBUFFER", "TXBUFFER", "STRUCT", "CBUFFER", "INBUFFER", "OUTBUFFER", 
		"INOUTBUFFER", "IF", "ELSE", "QUESTION", "FOR", "DO", "WHILE", "CONTINUE", 
		"BREAK", "RETURN", "SWITCH", "CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", 
		"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", 
		"SEMICOLON", "COMMA", "SHARP", "SEMANTICS", "FUNC_KEYWORD", "DECIMAL", 
		"OCTAL", "HEX", "FLOAT_NUM", "SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", 
		"INT_OPAQUE", "U_INT_OPAQUE", "BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", 
		"MULDIV_OP", "ADDDIV_OP", "SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", 
		"LOGIC_OP", "ASSIGNMENT_OP", "ARITHMETIC_ASSIGNMENT_OP", "DIGIT", "HEX_DIGIT", 
		"OCTAL_DIGIT", "INTEGER_SUFFIX", "EXPONENT", "FLOAT_SUFFIX", "LETTER", 
		"IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'version'", "'static'", "'uniform'", "'extern'", "'volatile'", 
		"'shared'", "'groupshared'", "'nointerpolation'", "'precise'", "'const'", 
		"'row_major'", "'column_major'", "'true'", "'false'", "'void'", "'|'", 
		null, "'SMPBUFFER'", "'TEXBUFFER'", "'struct'", "'cbuffer'", "'inbuffer'", 
		"'outbuffer'", "'inoutbuffer'", "'if'", "'else'", "'?'", "'for'", "'do'", 
		"'while'", "'continue'", "'break'", "'return'", "'switch'", "'case'", 
		"'defualt'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "':'", "';'", 
		"','", "'#'", null, "'dot'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "VERSOIN_PROFILE", "SMPBUFFER", "TXBUFFER", 
		"STRUCT", "CBUFFER", "INBUFFER", "OUTBUFFER", "INOUTBUFFER", "IF", "ELSE", 
		"QUESTION", "FOR", "DO", "WHILE", "CONTINUE", "BREAK", "RETURN", "SWITCH", 
		"CASE", "DEFUALT", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "DOT", "COLON", "SEMICOLON", "COMMA", 
		"SHARP", "SEMANTICS", "FUNC_KEYWORD", "DECIMAL", "OCTAL", "HEX", "FLOAT_NUM", 
		"SCALA", "VECTOR", "MATRIX", "FLOAT_OPAQUE", "INT_OPAQUE", "U_INT_OPAQUE", 
		"BASIC_OPAQUE_TYPE", "INCREAMENT_OP", "UNARY_OP", "MULDIV_OP", "ADDDIV_OP", 
		"SHIFT_OP", "COMPARE_OP", "EQUAL_OP", "BITWISE_OP", "LOGIC_OP", "ASSIGNMENT_OP", 
		"ARITHMETIC_ASSIGNMENT_OP", "IDENTIFIER", "COMMENT", "WS", "LINE_COMMENT"
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


	public MidSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MidSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2M\u03b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u013c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u01d9\n\61\3\62\3"+
		"\62\3\62\3\62\3\63\6\63\u01e0\n\63\r\63\16\63\u01e1\3\63\5\63\u01e5\n"+
		"\63\3\64\3\64\7\64\u01e9\n\64\f\64\16\64\u01ec\13\64\3\64\5\64\u01ef\n"+
		"\64\3\65\3\65\3\65\3\65\6\65\u01f5\n\65\r\65\16\65\u01f6\3\65\5\65\u01fa"+
		"\n\65\3\66\6\66\u01fd\n\66\r\66\16\66\u01fe\3\66\3\66\7\66\u0203\n\66"+
		"\f\66\16\66\u0206\13\66\3\66\5\66\u0209\n\66\3\66\5\66\u020c\n\66\3\66"+
		"\3\66\6\66\u0210\n\66\r\66\16\66\u0211\3\66\5\66\u0215\n\66\3\66\5\66"+
		"\u0218\n\66\3\66\6\66\u021b\n\66\r\66\16\66\u021c\3\66\3\66\5\66\u0221"+
		"\n\66\5\66\u0223\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u023b"+
		"\n\67\38\38\38\38\38\38\38\38\38\58\u0246\n8\39\39\39\39\59\u024c\n9\3"+
		"9\39\39\39\39\39\59\u0254\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\5:\u02d7\n:\5:\u02d9\n:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\5<\u02eb\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02f9\n=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0335\n=\3>\3>\3>\3>\5>\u033b\n>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3B\3B\5B\u0347\nB\3C\3C\3C\3C\3C\5C\u034e\nC\3"+
		"D\3D\3D\3D\5D\u0354\nD\3E\3E\3F\3F\3F\3F\3F\3F\5F\u035e\nF\3G\3G\3H\3"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u036e\nH\3I\3I\3J\5J\u0373\nJ\3K\3"+
		"K\3L\3L\3M\3M\5M\u037b\nM\3M\6M\u037e\nM\rM\16M\u037f\3N\3N\3O\5O\u0385"+
		"\nO\3P\3P\3P\7P\u038a\nP\fP\16P\u038d\13P\3Q\3Q\3Q\3Q\7Q\u0393\nQ\fQ\16"+
		"Q\u0396\13Q\3Q\3Q\3Q\3Q\3Q\3R\6R\u039e\nR\rR\16R\u039f\3R\3R\3S\3S\3S"+
		"\3S\7S\u03a8\nS\fS\16S\u03ab\13S\3S\5S\u03ae\nS\3S\3S\3S\3S\3\u0394\2"+
		"T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		"J\u00a1K\u00a3L\u00a5M\3\2\21\3\2\64\66\4\2##\u0080\u0080\5\2\'\',,\61"+
		"\61\4\2--//\4\2>>@@\5\2((``~~\3\2\62;\5\2\62;CHch\3\2\629\4\2WWww\4\2"+
		"GGgg\4\2HHhh\4\2C\\c|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u03eb\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\3\u00a7\3\2\2\2\5\u00af\3\2\2\2\7\u00b6\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c5\3\2\2\2\r\u00ce\3\2\2\2\17\u00d5\3\2\2\2\21\u00e1\3\2\2\2\23\u00f1"+
		"\3\2\2\2\25\u00f9\3\2\2\2\27\u00ff\3\2\2\2\31\u0109\3\2\2\2\33\u0116\3"+
		"\2\2\2\35\u011b\3\2\2\2\37\u0121\3\2\2\2!\u0126\3\2\2\2#\u013b\3\2\2\2"+
		"%\u013d\3\2\2\2\'\u0147\3\2\2\2)\u0151\3\2\2\2+\u0158\3\2\2\2-\u0160\3"+
		"\2\2\2/\u0169\3\2\2\2\61\u0173\3\2\2\2\63\u017f\3\2\2\2\65\u0182\3\2\2"+
		"\2\67\u0187\3\2\2\29\u0189\3\2\2\2;\u018d\3\2\2\2=\u0190\3\2\2\2?\u0196"+
		"\3\2\2\2A\u019f\3\2\2\2C\u01a5\3\2\2\2E\u01ac\3\2\2\2G\u01b3\3\2\2\2I"+
		"\u01b8\3\2\2\2K\u01c0\3\2\2\2M\u01c2\3\2\2\2O\u01c4\3\2\2\2Q\u01c6\3\2"+
		"\2\2S\u01c8\3\2\2\2U\u01ca\3\2\2\2W\u01cc\3\2\2\2Y\u01ce\3\2\2\2[\u01d0"+
		"\3\2\2\2]\u01d2\3\2\2\2_\u01d4\3\2\2\2a\u01d6\3\2\2\2c\u01da\3\2\2\2e"+
		"\u01df\3\2\2\2g\u01e6\3\2\2\2i\u01f0\3\2\2\2k\u0222\3\2\2\2m\u023a\3\2"+
		"\2\2o\u0245\3\2\2\2q\u0253\3\2\2\2s\u02d8\3\2\2\2u\u02da\3\2\2\2w\u02ea"+
		"\3\2\2\2y\u02f8\3\2\2\2{\u033a\3\2\2\2}\u033c\3\2\2\2\177\u033e\3\2\2"+
		"\2\u0081\u0340\3\2\2\2\u0083\u0346\3\2\2\2\u0085\u034d\3\2\2\2\u0087\u0353"+
		"\3\2\2\2\u0089\u0355\3\2\2\2\u008b\u035d\3\2\2\2\u008d\u035f\3\2\2\2\u008f"+
		"\u036d\3\2\2\2\u0091\u036f\3\2\2\2\u0093\u0372\3\2\2\2\u0095\u0374\3\2"+
		"\2\2\u0097\u0376\3\2\2\2\u0099\u0378\3\2\2\2\u009b\u0381\3\2\2\2\u009d"+
		"\u0384\3\2\2\2\u009f\u0386\3\2\2\2\u00a1\u038e\3\2\2\2\u00a3\u039d\3\2"+
		"\2\2\u00a5\u03a3\3\2\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7t\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7q\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\4\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7e\2\2"+
		"\u00b5\6\3\2\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7k"+
		"\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7o\2\2\u00bd\b\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7z\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\n\3\2\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7c\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7n\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\f\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7j"+
		"\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\16\3\2\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8"+
		"\7q\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7u\2\2\u00db"+
		"\u00dc\7j\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\7f\2\2\u00e0\20\3\2\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7"+
		"q\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7k\2\2"+
		"\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0\22\3\2\2\2\u00f1\u00f2\7"+
		"r\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6"+
		"\7k\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7g\2\2\u00f8\24\3\2\2\2\u00f9\u00fa"+
		"\7e\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7u\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\26\3\2\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7y\2\2\u0102\u0103\7a\2\2\u0103\u0104\7o\2\2\u0104\u0105\7c\2\2"+
		"\u0105\u0106\7l\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108\30\3\2"+
		"\2\2\u0109\u010a\7e\2\2\u010a\u010b\7q\2\2\u010b\u010c\7n\2\2\u010c\u010d"+
		"\7w\2\2\u010d\u010e\7o\2\2\u010e\u010f\7p\2\2\u010f\u0110\7a\2\2\u0110"+
		"\u0111\7o\2\2\u0111\u0112\7c\2\2\u0112\u0113\7l\2\2\u0113\u0114\7q\2\2"+
		"\u0114\u0115\7t\2\2\u0115\32\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7"+
		"t\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011a\34\3\2\2\2\u011b\u011c"+
		"\7h\2\2\u011c\u011d\7c\2\2\u011d\u011e\7n\2\2\u011e\u011f\7u\2\2\u011f"+
		"\u0120\7g\2\2\u0120\36\3\2\2\2\u0121\u0122\7x\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7k\2\2\u0124\u0125\7f\2\2\u0125 \3\2\2\2\u0126\u0127\7~\2\2\u0127"+
		"\"\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7q\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u013c\7g\2\2\u012c\u012d\7e\2\2\u012d\u012e\7q\2\2\u012e\u012f\7o\2\2"+
		"\u012f\u0130\7r\2\2\u0130\u0131\7c\2\2\u0131\u0132\7v\2\2\u0132\u0133"+
		"\7k\2\2\u0133\u0134\7d\2\2\u0134\u0135\7k\2\2\u0135\u0136\7n\2\2\u0136"+
		"\u0137\7k\2\2\u0137\u0138\7v\2\2\u0138\u013c\7{\2\2\u0139\u013a\7g\2\2"+
		"\u013a\u013c\7u\2\2\u013b\u0128\3\2\2\2\u013b\u012c\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c$\3\2\2\2\u013d\u013e\7U\2\2\u013e\u013f\7O\2\2\u013f\u0140"+
		"\7R\2\2\u0140\u0141\7D\2\2\u0141\u0142\7W\2\2\u0142\u0143\7H\2\2\u0143"+
		"\u0144\7H\2\2\u0144\u0145\7G\2\2\u0145\u0146\7T\2\2\u0146&\3\2\2\2\u0147"+
		"\u0148\7V\2\2\u0148\u0149\7G\2\2\u0149\u014a\7Z\2\2\u014a\u014b\7D\2\2"+
		"\u014b\u014c\7W\2\2\u014c\u014d\7H\2\2\u014d\u014e\7H\2\2\u014e\u014f"+
		"\7G\2\2\u014f\u0150\7T\2\2\u0150(\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153"+
		"\7v\2\2\u0153\u0154\7t\2\2\u0154\u0155\7w\2\2\u0155\u0156\7e\2\2\u0156"+
		"\u0157\7v\2\2\u0157*\3\2\2\2\u0158\u0159\7e\2\2\u0159\u015a\7d\2\2\u015a"+
		"\u015b\7w\2\2\u015b\u015c\7h\2\2\u015c\u015d\7h\2\2\u015d\u015e\7g\2\2"+
		"\u015e\u015f\7t\2\2\u015f,\3\2\2\2\u0160\u0161\7k\2\2\u0161\u0162\7p\2"+
		"\2\u0162\u0163\7d\2\2\u0163\u0164\7w\2\2\u0164\u0165\7h\2\2\u0165\u0166"+
		"\7h\2\2\u0166\u0167\7g\2\2\u0167\u0168\7t\2\2\u0168.\3\2\2\2\u0169\u016a"+
		"\7q\2\2\u016a\u016b\7w\2\2\u016b\u016c\7v\2\2\u016c\u016d\7d\2\2\u016d"+
		"\u016e\7w\2\2\u016e\u016f\7h\2\2\u016f\u0170\7h\2\2\u0170\u0171\7g\2\2"+
		"\u0171\u0172\7t\2\2\u0172\60\3\2\2\2\u0173\u0174\7k\2\2\u0174\u0175\7"+
		"p\2\2\u0175\u0176\7q\2\2\u0176\u0177\7w\2\2\u0177\u0178\7v\2\2\u0178\u0179"+
		"\7d\2\2\u0179\u017a\7w\2\2\u017a\u017b\7h\2\2\u017b\u017c\7h\2\2\u017c"+
		"\u017d\7g\2\2\u017d\u017e\7t\2\2\u017e\62\3\2\2\2\u017f\u0180\7k\2\2\u0180"+
		"\u0181\7h\2\2\u0181\64\3\2\2\2\u0182\u0183\7g\2\2\u0183\u0184\7n\2\2\u0184"+
		"\u0185\7u\2\2\u0185\u0186\7g\2\2\u0186\66\3\2\2\2\u0187\u0188\7A\2\2\u0188"+
		"8\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7q\2\2\u018b\u018c\7t\2\2\u018c"+
		":\3\2\2\2\u018d\u018e\7f\2\2\u018e\u018f\7q\2\2\u018f<\3\2\2\2\u0190\u0191"+
		"\7y\2\2\u0191\u0192\7j\2\2\u0192\u0193\7k\2\2\u0193\u0194\7n\2\2\u0194"+
		"\u0195\7g\2\2\u0195>\3\2\2\2\u0196\u0197\7e\2\2\u0197\u0198\7q\2\2\u0198"+
		"\u0199\7p\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2\u019b\u019c\7p\2\2"+
		"\u019c\u019d\7w\2\2\u019d\u019e\7g\2\2\u019e@\3\2\2\2\u019f\u01a0\7d\2"+
		"\2\u01a0\u01a1\7t\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4"+
		"\7m\2\2\u01a4B\3\2\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8"+
		"\7v\2\2\u01a8\u01a9\7w\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7p\2\2\u01ab"+
		"D\3\2\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7y\2\2\u01ae\u01af\7k\2\2\u01af"+
		"\u01b0\7v\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7j\2\2\u01b2F\3\2\2\2\u01b3"+
		"\u01b4\7e\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7u\2\2\u01b6\u01b7\7g\2\2"+
		"\u01b7H\3\2\2\2\u01b8\u01b9\7f\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7h\2"+
		"\2\u01bb\u01bc\7w\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7n\2\2\u01be\u01bf"+
		"\7v\2\2\u01bfJ\3\2\2\2\u01c0\u01c1\7*\2\2\u01c1L\3\2\2\2\u01c2\u01c3\7"+
		"+\2\2\u01c3N\3\2\2\2\u01c4\u01c5\7}\2\2\u01c5P\3\2\2\2\u01c6\u01c7\7\177"+
		"\2\2\u01c7R\3\2\2\2\u01c8\u01c9\7]\2\2\u01c9T\3\2\2\2\u01ca\u01cb\7_\2"+
		"\2\u01cbV\3\2\2\2\u01cc\u01cd\7\60\2\2\u01cdX\3\2\2\2\u01ce\u01cf\7<\2"+
		"\2\u01cfZ\3\2\2\2\u01d0\u01d1\7=\2\2\u01d1\\\3\2\2\2\u01d2\u01d3\7.\2"+
		"\2\u01d3^\3\2\2\2\u01d4\u01d5\7%\2\2\u01d5`\3\2\2\2\u01d6\u01d8\5\u009f"+
		"P\2\u01d7\u01d9\5e\63\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"b\3\2\2\2\u01da\u01db\7f\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7v\2\2\u01dd"+
		"d\3\2\2\2\u01de\u01e0\5\u0091I\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2"+
		"\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5"+
		"\5\u0097L\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5f\3\2\2\2\u01e6"+
		"\u01ea\7^\2\2\u01e7\u01e9\5\u0095K\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3"+
		"\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ef\5\u0097L\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01efh\3\2\2\2\u01f0\u01f1\7^\2\2\u01f1\u01f2\7z\2\2\u01f2\u01f4"+
		"\3\2\2\2\u01f3\u01f5\5\u0093J\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa"+
		"\5\u0097L\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faj\3\2\2\2\u01fb"+
		"\u01fd\5\u0091I\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\5W,\2\u0201"+
		"\u0203\5\u0091I\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u0209\5\u0099M\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b"+
		"\3\2\2\2\u020a\u020c\5\u009bN\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2"+
		"\2\u020c\u0223\3\2\2\2\u020d\u020f\5W,\2\u020e\u0210\5\u0091I\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5\u0099M\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\5\u009bN\2\u0217\u0216"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0223\3\2\2\2\u0219\u021b\5\u0091I"+
		"\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\5\u0099M\2\u021f\u0221\5\u009b"+
		"N\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222"+
		"\u01fc\3\2\2\2\u0222\u020d\3\2\2\2\u0222\u021a\3\2\2\2\u0223l\3\2\2\2"+
		"\u0224\u0225\7d\2\2\u0225\u0226\7q\2\2\u0226\u0227\7q\2\2\u0227\u023b"+
		"\7n\2\2\u0228\u0229\7k\2\2\u0229\u022a\7p\2\2\u022a\u023b\7v\2\2\u022b"+
		"\u022c\7j\2\2\u022c\u022d\7c\2\2\u022d\u022e\7n\2\2\u022e\u023b\7h\2\2"+
		"\u022f\u0230\7h\2\2\u0230\u0231\7n\2\2\u0231\u0232\7q\2\2\u0232\u0233"+
		"\7c\2\2\u0233\u023b\7v\2\2\u0234\u0235\7f\2\2\u0235\u0236\7q\2\2\u0236"+
		"\u0237\7w\2\2\u0237\u0238\7d\2\2\u0238\u0239\7n\2\2\u0239\u023b\7g\2\2"+
		"\u023a\u0224\3\2\2\2\u023a\u0228\3\2\2\2\u023a\u022b\3\2\2\2\u023a\u022f"+
		"\3\2\2\2\u023a\u0234\3\2\2\2\u023bn\3\2\2\2\u023c\u023d\5m\67\2\u023d"+
		"\u023e\t\2\2\2\u023e\u0246\3\2\2\2\u023f\u0240\7x\2\2\u0240\u0241\7g\2"+
		"\2\u0241\u0242\7e\2\2\u0242\u0243\7v\2\2\u0243\u0244\7q\2\2\u0244\u0246"+
		"\7t\2\2\u0245\u023c\3\2\2\2\u0245\u023f\3\2\2\2\u0246p\3\2\2\2\u0247\u0248"+
		"\5m\67\2\u0248\u024b\t\2\2\2\u0249\u024a\7z\2\2\u024a\u024c\t\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u0254\3\2\2\2\u024d\u024e\7o"+
		"\2\2\u024e\u024f\7c\2\2\u024f\u0250\7v\2\2\u0250\u0251\7t\2\2\u0251\u0252"+
		"\7k\2\2\u0252\u0254\7z\2\2\u0253\u0247\3\2\2\2\u0253\u024d\3\2\2\2\u0254"+
		"r\3\2\2\2\u0255\u02d9\5y=\2\u0256\u0257\7u\2\2\u0257\u0258\7c\2\2\u0258"+
		"\u0259\7o\2\2\u0259\u025a\7r\2\2\u025a\u025b\7n\2\2\u025b\u025c\7g\2\2"+
		"\u025c\u025d\7t\2\2\u025d\u025e\7\63\2\2\u025e\u025f\7F\2\2\u025f\u0260"+
		"\7U\2\2\u0260\u0261\7j\2\2\u0261\u0262\7c\2\2\u0262\u0263\7f\2\2\u0263"+
		"\u0264\7q\2\2\u0264\u02d7\7y\2\2\u0265\u0266\7u\2\2\u0266\u0267\7c\2\2"+
		"\u0267\u0268\7o\2\2\u0268\u0269\7r\2\2\u0269\u026a\7n\2\2\u026a\u026b"+
		"\7g\2\2\u026b\u026c\7t\2\2\u026c\u026d\7\64\2\2\u026d\u026e\7F\2\2\u026e"+
		"\u026f\7U\2\2\u026f\u0270\7j\2\2\u0270\u0271\7c\2\2\u0271\u0272\7f\2\2"+
		"\u0272\u0273\7q\2\2\u0273\u02d7\7y\2\2\u0274\u0275\7u\2\2\u0275\u0276"+
		"\7c\2\2\u0276\u0277\7o\2\2\u0277\u0278\7r\2\2\u0278\u0279\7n\2\2\u0279"+
		"\u027a\7g\2\2\u027a\u027b\7t\2\2\u027b\u027c\7\64\2\2\u027c\u027d\7F\2"+
		"\2\u027d\u027e\7T\2\2\u027e\u027f\7g\2\2\u027f\u0280\7e\2\2\u0280\u0281"+
		"\7v\2\2\u0281\u0282\7U\2\2\u0282\u0283\7j\2\2\u0283\u0284\7c\2\2\u0284"+
		"\u0285\7f\2\2\u0285\u0286\7q\2\2\u0286\u02d7\7y\2\2\u0287\u0288\7u\2\2"+
		"\u0288\u0289\7c\2\2\u0289\u028a\7o\2\2\u028a\u028b\7r\2\2\u028b\u028c"+
		"\7n\2\2\u028c\u028d\7g\2\2\u028d\u028e\7t\2\2\u028e\u028f\7\63\2\2\u028f"+
		"\u0290\7F\2\2\u0290\u0291\7C\2\2\u0291\u0292\7t\2\2\u0292\u0293\7t\2\2"+
		"\u0293\u0294\7c\2\2\u0294\u0295\7{\2\2\u0295\u0296\7U\2\2\u0296\u0297"+
		"\7j\2\2\u0297\u0298\7c\2\2\u0298\u0299\7f\2\2\u0299\u029a\7q\2\2\u029a"+
		"\u02d7\7y\2\2\u029b\u029c\7u\2\2\u029c\u029d\7c\2\2\u029d\u029e\7o\2\2"+
		"\u029e\u029f\7r\2\2\u029f\u02a0\7n\2\2\u02a0\u02a1\7g\2\2\u02a1\u02a2"+
		"\7t\2\2\u02a2\u02a3\7\64\2\2\u02a3\u02a4\7F\2\2\u02a4\u02a5\7C\2\2\u02a5"+
		"\u02a6\7t\2\2\u02a6\u02a7\7t\2\2\u02a7\u02a8\7c\2\2\u02a8\u02a9\7{\2\2"+
		"\u02a9\u02aa\7U\2\2\u02aa\u02ab\7j\2\2\u02ab\u02ac\7c\2\2\u02ac\u02ad"+
		"\7f\2\2\u02ad\u02ae\7q\2\2\u02ae\u02d7\7y\2\2\u02af\u02b0\7u\2\2\u02b0"+
		"\u02b1\7c\2\2\u02b1\u02b2\7o\2\2\u02b2\u02b3\7r\2\2\u02b3\u02b4\7n\2\2"+
		"\u02b4\u02b5\7g\2\2\u02b5\u02b6\7t\2\2\u02b6\u02b7\7E\2\2\u02b7\u02b8"+
		"\7w\2\2\u02b8\u02b9\7d\2\2\u02b9\u02ba\7g\2\2\u02ba\u02bb\7U\2\2\u02bb"+
		"\u02bc\7j\2\2\u02bc\u02bd\7c\2\2\u02bd\u02be\7f\2\2\u02be\u02bf\7q\2\2"+
		"\u02bf\u02d7\7y\2\2\u02c0\u02c1\7u\2\2\u02c1\u02c2\7c\2\2\u02c2\u02c3"+
		"\7o\2\2\u02c3\u02c4\7r\2\2\u02c4\u02c5\7n\2\2\u02c5\u02c6\7g\2\2\u02c6"+
		"\u02c7\7t\2\2\u02c7\u02c8\7E\2\2\u02c8\u02c9\7w\2\2\u02c9\u02ca\7d\2\2"+
		"\u02ca\u02cb\7g\2\2\u02cb\u02cc\7C\2\2\u02cc\u02cd\7t\2\2\u02cd\u02ce"+
		"\7t\2\2\u02ce\u02cf\7c\2\2\u02cf\u02d0\7{\2\2\u02d0\u02d1\7U\2\2\u02d1"+
		"\u02d2\7j\2\2\u02d2\u02d3\7c\2\2\u02d3\u02d4\7f\2\2\u02d4\u02d5\7q\2\2"+
		"\u02d5\u02d7\7y\2\2\u02d6\u0256\3\2\2\2\u02d6\u0265\3\2\2\2\u02d6\u0274"+
		"\3\2\2\2\u02d6\u0287\3\2\2\2\u02d6\u029b\3\2\2\2\u02d6\u02af\3\2\2\2\u02d6"+
		"\u02c0\3\2\2\2\u02d7\u02d9\3\2\2\2\u02d8\u0255\3\2\2\2\u02d8\u02d6\3\2"+
		"\2\2\u02d9t\3\2\2\2\u02da\u02db\7k\2\2\u02db\u02dc\5y=\2\u02dcv\3\2\2"+
		"\2\u02dd\u02de\7w\2\2\u02de\u02eb\5y=\2\u02df\u02e0\7c\2\2\u02e0\u02e1"+
		"\7v\2\2\u02e1\u02e2\7q\2\2\u02e2\u02e3\7o\2\2\u02e3\u02e4\7k\2\2\u02e4"+
		"\u02e5\7e\2\2\u02e5\u02e6\7a\2\2\u02e6\u02e7\7w\2\2\u02e7\u02e8\7k\2\2"+
		"\u02e8\u02e9\7p\2\2\u02e9\u02eb\7v\2\2\u02ea\u02dd\3\2\2\2\u02ea\u02df"+
		"\3\2\2\2\u02ebx\3\2\2\2\u02ec\u02ed\7u\2\2\u02ed\u02ee\7c\2\2\u02ee\u02ef"+
		"\7o\2\2\u02ef\u02f0\7r\2\2\u02f0\u02f1\7n\2\2\u02f1\u02f2\7g\2\2\u02f2"+
		"\u02f9\7t\2\2\u02f3\u02f4\7k\2\2\u02f4\u02f5\7o\2\2\u02f5\u02f6\7c\2\2"+
		"\u02f6\u02f7\7i\2\2\u02f7\u02f9\7g\2\2\u02f8\u02ec\3\2\2\2\u02f8\u02f3"+
		"\3\2\2\2\u02f9\u0334\3\2\2\2\u02fa\u02fb\7\63\2\2\u02fb\u0335\7F\2\2\u02fc"+
		"\u02fd\7\64\2\2\u02fd\u0335\7F\2\2\u02fe\u02ff\7\65\2\2\u02ff\u0335\7"+
		"F\2\2\u0300\u0301\7E\2\2\u0301\u0302\7w\2\2\u0302\u0303\7d\2\2\u0303\u0335"+
		"\7g\2\2\u0304\u0305\7\64\2\2\u0305\u0306\7F\2\2\u0306\u0307\7T\2\2\u0307"+
		"\u0308\7g\2\2\u0308\u0309\7e\2\2\u0309\u0335\7v\2\2\u030a\u030b\7\63\2"+
		"\2\u030b\u030c\7F\2\2\u030c\u030d\7C\2\2\u030d\u030e\7t\2\2\u030e\u030f"+
		"\7t\2\2\u030f\u0310\7c\2\2\u0310\u0335\7{\2\2\u0311\u0312\7\64\2\2\u0312"+
		"\u0313\7F\2\2\u0313\u0314\7C\2\2\u0314\u0315\7t\2\2\u0315\u0316\7t\2\2"+
		"\u0316\u0317\7c\2\2\u0317\u0335\7{\2\2\u0318\u0319\7D\2\2\u0319\u031a"+
		"\7w\2\2\u031a\u031b\7h\2\2\u031b\u031c\7h\2\2\u031c\u031d\7g\2\2\u031d"+
		"\u0335\7t\2\2\u031e\u031f\7\64\2\2\u031f\u0320\7F\2\2\u0320\u0321\7O\2"+
		"\2\u0321\u0335\7U\2\2\u0322\u0323\7\64\2\2\u0323\u0324\7F\2\2\u0324\u0325"+
		"\7O\2\2\u0325\u0326\7U\2\2\u0326\u0327\7C\2\2\u0327\u0328\7t\2\2\u0328"+
		"\u0329\7t\2\2\u0329\u032a\7c\2\2\u032a\u0335\7{\2\2\u032b\u032c\7E\2\2"+
		"\u032c\u032d\7w\2\2\u032d\u032e\7d\2\2\u032e\u032f\7g\2\2\u032f\u0330"+
		"\7C\2\2\u0330\u0331\7t\2\2\u0331\u0332\7t\2\2\u0332\u0333\7c\2\2\u0333"+
		"\u0335\7{\2\2\u0334\u02fa\3\2\2\2\u0334\u02fc\3\2\2\2\u0334\u02fe\3\2"+
		"\2\2\u0334\u0300\3\2\2\2\u0334\u0304\3\2\2\2\u0334\u030a\3\2\2\2\u0334"+
		"\u0311\3\2\2\2\u0334\u0318\3\2\2\2\u0334\u031e\3\2\2\2\u0334\u0322\3\2"+
		"\2\2\u0334\u032b\3\2\2\2\u0335z\3\2\2\2\u0336\u0337\7-\2\2\u0337\u033b"+
		"\7-\2\2\u0338\u0339\7/\2\2\u0339\u033b\7/\2\2\u033a\u0336\3\2\2\2\u033a"+
		"\u0338\3\2\2\2\u033b|\3\2\2\2\u033c\u033d\t\3\2\2\u033d~\3\2\2\2\u033e"+
		"\u033f\t\4\2\2\u033f\u0080\3\2\2\2\u0340\u0341\t\5\2\2\u0341\u0082\3\2"+
		"\2\2\u0342\u0343\7>\2\2\u0343\u0347\7>\2\2\u0344\u0345\7@\2\2\u0345\u0347"+
		"\7@\2\2\u0346\u0342\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0084\3\2\2\2\u0348"+
		"\u034e\t\6\2\2\u0349\u034a\7>\2\2\u034a\u034e\7?\2\2\u034b\u034c\7@\2"+
		"\2\u034c\u034e\7?\2\2\u034d\u0348\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034b"+
		"\3\2\2\2\u034e\u0086\3\2\2\2\u034f\u0350\7?\2\2\u0350\u0354\7?\2\2\u0351"+
		"\u0352\7#\2\2\u0352\u0354\7?\2\2\u0353\u034f\3\2\2\2\u0353\u0351\3\2\2"+
		"\2\u0354\u0088\3\2\2\2\u0355\u0356\t\7\2\2\u0356\u008a\3\2\2\2\u0357\u0358"+
		"\7(\2\2\u0358\u035e\7(\2\2\u0359\u035a\7`\2\2\u035a\u035e\7`\2\2\u035b"+
		"\u035c\7~\2\2\u035c\u035e\7~\2\2\u035d\u0357\3\2\2\2\u035d\u0359\3\2\2"+
		"\2\u035d\u035b\3\2\2\2\u035e\u008c\3\2\2\2\u035f\u0360\7?\2\2\u0360\u008e"+
		"\3\2\2\2\u0361\u0362\5\177@\2\u0362\u0363\5\u008dG\2\u0363\u036e\3\2\2"+
		"\2\u0364\u0365\5\u0081A\2\u0365\u0366\5\u008dG\2\u0366\u036e\3\2\2\2\u0367"+
		"\u0368\5\u0083B\2\u0368\u0369\5\u008dG\2\u0369\u036e\3\2\2\2\u036a\u036b"+
		"\5\u0089E\2\u036b\u036c\5\u008dG\2\u036c\u036e\3\2\2\2\u036d\u0361\3\2"+
		"\2\2\u036d\u0364\3\2\2\2\u036d\u0367\3\2\2\2\u036d\u036a\3\2\2\2\u036e"+
		"\u0090\3\2\2\2\u036f\u0370\t\b\2\2\u0370\u0092\3\2\2\2\u0371\u0373\t\t"+
		"\2\2\u0372\u0371\3\2\2\2\u0373\u0094\3\2\2\2\u0374\u0375\t\n\2\2\u0375"+
		"\u0096\3\2\2\2\u0376\u0377\t\13\2\2\u0377\u0098\3\2\2\2\u0378\u037a\t"+
		"\f\2\2\u0379\u037b\5\u0081A\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2"+
		"\u037b\u037d\3\2\2\2\u037c\u037e\4\62;\2\u037d\u037c\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u009a\3\2\2\2\u0381"+
		"\u0382\t\r\2\2\u0382\u009c\3\2\2\2\u0383\u0385\t\16\2\2\u0384\u0383\3"+
		"\2\2\2\u0385\u009e\3\2\2\2\u0386\u038b\5\u009dO\2\u0387\u038a\5\u009d"+
		"O\2\u0388\u038a\5\u0091I\2\u0389\u0387\3\2\2\2\u0389\u0388\3\2\2\2\u038a"+
		"\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u00a0\3\2"+
		"\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7\61\2\2\u038f\u0390\7,\2\2\u0390"+
		"\u0394\3\2\2\2\u0391\u0393\13\2\2\2\u0392\u0391\3\2\2\2\u0393\u0396\3"+
		"\2\2\2\u0394\u0395\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0397\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0398\7,\2\2\u0398\u0399\7\61\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u039b\bQ\2\2\u039b\u00a2\3\2\2\2\u039c\u039e\t\17\2\2\u039d"+
		"\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\bR\2\2\u03a2\u00a4\3\2\2\2\u03a3"+
		"\u03a4\7\61\2\2\u03a4\u03a5\7\61\2\2\u03a5\u03a9\3\2\2\2\u03a6\u03a8\n"+
		"\20\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03ae\7\17"+
		"\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b0\7\f\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\bS\2\2\u03b2\u00a6\3\2"+
		"\2\2.\2\u013b\u01d8\u01e1\u01e4\u01ea\u01ee\u01f6\u01f9\u01fe\u0204\u0208"+
		"\u020b\u0211\u0214\u0217\u021c\u0220\u0222\u023a\u0245\u024b\u0253\u02d6"+
		"\u02d8\u02ea\u02f8\u0334\u033a\u0346\u034d\u0353\u035d\u036d\u0372\u037a"+
		"\u037f\u0384\u0389\u038b\u0394\u039f\u03a9\u03ad\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}