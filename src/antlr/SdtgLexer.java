// Generated from Sdtg.g4 by ANTLR 4.6

package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SdtgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Whitespace=3, String=4, DeclarationStart=5, End=6, ScriptStart=7, 
		Identifier=8, ChoiceStart=9, ChoiceEnd=10, Operator=11, RelationalOperator=12, 
		Integer=13, Or=14, And=15, Not=16, LP=17, RP=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Whitespace", "String", "DeclarationStart", "End", "ScriptStart", 
		"Identifier", "ChoiceStart", "ChoiceEnd", "Operator", "RelationalOperator", 
		"Integer", "Or", "And", "Not", "LP", "RP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'", null, null, "'initialize'", "'end'", "'script'", null, 
		"'['", "']'", null, null, null, "'|'", "'&'", "'!'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Whitespace", "String", "DeclarationStart", "End", "ScriptStart", 
		"Identifier", "ChoiceStart", "ChoiceEnd", "Operator", "RelationalOperator", 
		"Integer", "Or", "And", "Not", "LP", "RP"
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


	public SdtgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sdtg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\7\5"+
		"\65\n\5\f\5\16\58\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tT\n\t\f\t"+
		"\16\tW\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\rh\n\r\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\n\5\2\13"+
		"\f\17\17\"\"\3\2$$\4\2C\\c|\5\2\62;C\\c|\5\2,-//\61\61\4\2>>@@\3\2\63"+
		";\3\2\62;\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7,\3\2\2\2\t\62\3"+
		"\2\2\2\13;\3\2\2\2\rF\3\2\2\2\17J\3\2\2\2\21Q\3\2\2\2\23X\3\2\2\2\25Z"+
		"\3\2\2\2\27\\\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2"+
		"!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'(\7.\2\2(\4\3\2\2\2)*\7<\2\2*\6\3\2\2"+
		"\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61"+
		"\b\4\2\2\61\b\3\2\2\2\62\66\7$\2\2\63\65\n\3\2\2\64\63\3\2\2\2\658\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7$\2\2:\n\3"+
		"\2\2\2;<\7k\2\2<=\7p\2\2=>\7k\2\2>?\7v\2\2?@\7k\2\2@A\7c\2\2AB\7n\2\2"+
		"BC\7k\2\2CD\7|\2\2DE\7g\2\2E\f\3\2\2\2FG\7g\2\2GH\7p\2\2HI\7f\2\2I\16"+
		"\3\2\2\2JK\7u\2\2KL\7e\2\2LM\7t\2\2MN\7k\2\2NO\7r\2\2OP\7v\2\2P\20\3\2"+
		"\2\2QU\t\4\2\2RT\t\5\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\22\3"+
		"\2\2\2WU\3\2\2\2XY\7]\2\2Y\24\3\2\2\2Z[\7_\2\2[\26\3\2\2\2\\]\t\6\2\2"+
		"]\30\3\2\2\2^_\7>\2\2_h\7?\2\2`a\7@\2\2ah\7?\2\2bh\t\7\2\2cd\7?\2\2dh"+
		"\7?\2\2ef\7#\2\2fh\7?\2\2g^\3\2\2\2g`\3\2\2\2gb\3\2\2\2gc\3\2\2\2ge\3"+
		"\2\2\2h\32\3\2\2\2im\t\b\2\2jl\t\t\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2m"+
		"n\3\2\2\2n\34\3\2\2\2om\3\2\2\2pq\7~\2\2q\36\3\2\2\2rs\7(\2\2s \3\2\2"+
		"\2tu\7#\2\2u\"\3\2\2\2vw\7*\2\2w$\3\2\2\2xy\7+\2\2y&\3\2\2\2\b\2.\66U"+
		"gm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}