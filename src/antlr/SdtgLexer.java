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

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SdtgLexer extends Lexer {
    static
    {
        RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, Whitespace = 5, String = 6, DeclarationStart = 7,
            End = 8, ScriptStart = 9, Identifier = 10, ChoiceStart = 11, ChoiceEnd = 12, Operator = 13,
            RelationalOperator = 14, Integer = 15, Or = 16, And = 17, Not = 18, LP = 19, RP = 20;
    public static String[] modeNames = { "DEFAULT_MODE" };

    public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "Whitespace", "String",
            "DeclarationStart", "End", "ScriptStart", "Identifier", "ChoiceStart", "ChoiceEnd", "Operator",
            "RelationalOperator", "Integer", "Or", "And", "Not", "LP", "RP" };

    private static final String[] _LITERAL_NAMES = { null, "','", "':'", "'{'", "'}'", null, null, "'initialize'",
            "'end'", "'script'", null, "'['", "']'", null, null, null, "'|'", "'&'", "'!'", "'('", "')'" };
    private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, "Whitespace", "String",
            "DeclarationStart", "End", "ScriptStart", "Identifier", "ChoiceStart", "ChoiceEnd", "Operator",
            "RelationalOperator", "Integer", "Or", "And", "Not", "LP", "RP" };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    static
    {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++)
        {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null)
            {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null)
            {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    public SdtgLexer(CharStream input)
    {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName()
    {
        return "Sdtg.g4";
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames()
    {
        return modeNames;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0082\b\1\4\2"
            + "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
            + "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
            + "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"
            + "\6\6\6\65\n\6\r\6\16\6\66\3\6\3\6\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7"
            + "\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"
            + "\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13\3\f\3\f"
            + "\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17p"
            + "\n\17\3\20\3\20\7\20t\n\20\f\20\16\20w\13\20\3\21\3\21\3\22\3\22\3\23"
            + "\3\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"
            + "\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\n\5\2\13"
            + "\f\17\17\"\"\3\2$$\4\2C\\c|\5\2\62;C\\c|\5\2,-//\61\61\4\2>>@@\3\2\63"
            + ";\3\2\62;\u0089\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"
            + "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"
            + "\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"
            + "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2"
            + "\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\64\3\2\2\2\r:\3\2\2\2\17C\3\2\2\2\21N"
            + "\3\2\2\2\23R\3\2\2\2\25Y\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35"
            + "o\3\2\2\2\37q\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0080"
            + "\3\2\2\2+,\7.\2\2,\4\3\2\2\2-.\7<\2\2.\6\3\2\2\2/\60\7}\2\2\60\b\3\2\2"
            + "\2\61\62\7\177\2\2\62\n\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2"
            + "\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\b\6\2\29\f\3\2\2\2:>\7"
            + "$\2\2;=\n\3\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"
            + "\2\2\2AB\7$\2\2B\16\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7k\2\2FG\7v\2\2GH\7k\2"
            + "\2HI\7c\2\2IJ\7n\2\2JK\7k\2\2KL\7|\2\2LM\7g\2\2M\20\3\2\2\2NO\7g\2\2O"
            + "P\7p\2\2PQ\7f\2\2Q\22\3\2\2\2RS\7u\2\2ST\7e\2\2TU\7t\2\2UV\7k\2\2VW\7"
            + "r\2\2WX\7v\2\2X\24\3\2\2\2Y]\t\4\2\2Z\\\t\5\2\2[Z\3\2\2\2\\_\3\2\2\2]"
            + "[\3\2\2\2]^\3\2\2\2^\26\3\2\2\2_]\3\2\2\2`a\7]\2\2a\30\3\2\2\2bc\7_\2"
            + "\2c\32\3\2\2\2de\t\6\2\2e\34\3\2\2\2fg\7>\2\2gp\7?\2\2hi\7@\2\2ip\7?\2"
            + "\2jp\t\7\2\2kl\7?\2\2lp\7?\2\2mn\7#\2\2np\7?\2\2of\3\2\2\2oh\3\2\2\2o"
            + "j\3\2\2\2ok\3\2\2\2om\3\2\2\2p\36\3\2\2\2qu\t\b\2\2rt\t\t\2\2sr\3\2\2"
            + "\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v \3\2\2\2wu\3\2\2\2xy\7~\2\2y\"\3\2\2"
            + "\2z{\7(\2\2{$\3\2\2\2|}\7#\2\2}&\3\2\2\2~\177\7*\2\2\177(\3\2\2\2\u0080"
            + "\u0081\7+\2\2\u0081*\3\2\2\2\b\2\66>]ou\3\b\2\2";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}