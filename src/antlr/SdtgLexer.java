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
		T__0=1, T__1=2, T__2=3, Whitespace=4, DeclarationStart=5, DeclarationEnd=6, 
		Identifier=7, ScriptStart=8, ScriptEnd=9, ChoiceStart=10, ChoiceEnd=11, 
		Operator=12, RelationalOperator=13, Integer=14, String=15, Or=16, And=17, 
		Not=18, LP=19, RP=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Whitespace", "DeclarationStart", "DeclarationEnd", 
		"Identifier", "ScriptStart", "ScriptEnd", "ChoiceStart", "ChoiceEnd", 
		"Operator", "RelationalOperator", "Integer", "String", "Or", "And", "Not", 
		"LP", "RP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'\n'", "':'", null, null, null, null, null, null, "'<'", 
		"'>'", null, null, null, null, "'|'", "'&'", "'!'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Whitespace", "DeclarationStart", "DeclarationEnd", 
		"Identifier", "ScriptStart", "ScriptEnd", "ChoiceStart", "ChoiceEnd", 
		"Operator", "RelationalOperator", "Integer", "String", "Or", "And", "Not", 
		"LP", "RP"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5\63"+
		"\n\5\r\5\16\5\64\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\6\bK\n\b\r\b\16\bL\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16k\n\16\3\17\3\17\7\17o\n\17\f\17\16"+
		"\17r\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b\4\2\13\13\"\"\4\2C\\"+
		"c|\5\2,-//\61\61\4\2>>@@\3\2\63;\3\2\62;\u0087\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\138\3\2"+
		"\2\2\rE\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23W\3\2\2\2\25[\3\2\2\2\27]\3"+
		"\2\2\2\31_\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37s\3\2\2\2!w\3\2\2\2#y\3\2"+
		"\2\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+,\7.\2\2,\4\3\2\2\2-.\7\f\2\2."+
		"\6\3\2\2\2/\60\7<\2\2\60\b\3\2\2\2\61\63\t\2\2\2\62\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\b\5\2\2\67\n\3"+
		"\2\2\289\7k\2\29:\7p\2\2:;\7k\2\2;<\7v\2\2<=\7k\2\2=>\7c\2\2>?\7n\2\2"+
		"?@\7k\2\2@A\7|\2\2AB\7g\2\2BC\3\2\2\2CD\7\f\2\2D\f\3\2\2\2EF\7g\2\2FG"+
		"\7p\2\2GH\7f\2\2H\16\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2L"+
		"M\3\2\2\2M\20\3\2\2\2NO\7u\2\2OP\7e\2\2PQ\7t\2\2QR\7k\2\2RS\7r\2\2ST\7"+
		"v\2\2TU\3\2\2\2UV\7\f\2\2V\22\3\2\2\2WX\7g\2\2XY\7p\2\2YZ\7f\2\2Z\24\3"+
		"\2\2\2[\\\7>\2\2\\\26\3\2\2\2]^\7@\2\2^\30\3\2\2\2_`\t\4\2\2`\32\3\2\2"+
		"\2ab\7>\2\2bk\7?\2\2cd\7@\2\2dk\7?\2\2ek\t\5\2\2fg\7?\2\2gk\7?\2\2hi\7"+
		"#\2\2ik\7?\2\2ja\3\2\2\2jc\3\2\2\2je\3\2\2\2jf\3\2\2\2jh\3\2\2\2k\34\3"+
		"\2\2\2lp\t\6\2\2mo\t\7\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\36"+
		"\3\2\2\2rp\3\2\2\2st\7$\2\2tu\13\2\2\2uv\7$\2\2v \3\2\2\2wx\7~\2\2x\""+
		"\3\2\2\2yz\7(\2\2z$\3\2\2\2{|\7#\2\2|&\3\2\2\2}~\7*\2\2~(\3\2\2\2\177"+
		"\u0080\7+\2\2\u0080*\3\2\2\2\7\2\64Ljp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}