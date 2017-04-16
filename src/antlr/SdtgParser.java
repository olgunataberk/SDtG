// Generated from Sdtg.g4 by ANTLR 4.6
package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SdtgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, Whitespace=5, String=6, DeclarationStart=7, 
		End=8, ScriptStart=9, Identifier=10, ChoiceStart=11, ChoiceEnd=12, Operator=13, 
		RelationalOperator=14, Integer=15, Or=16, And=17, Not=18, LP=19, RP=20;
	public static final int
		RULE_game = 0, RULE_declarationSection = 1, RULE_identifierList = 2, RULE_scriptSection = 3, 
		RULE_textLineList = 4, RULE_textLine = 5, RULE_textBlock = 6, RULE_line = 7, 
		RULE_choicePrompt = 8, RULE_choiceList = 9, RULE_choiceExpression = 10, 
		RULE_karmaOperationList = 11, RULE_karmaOperation = 12, RULE_karmaExpression = 13, 
		RULE_karmaTerm = 14, RULE_karmaFactor = 15, RULE_karmaPrimary = 16, RULE_karmaPredicate = 17;
	public static final String[] ruleNames = {
		"game", "declarationSection", "identifierList", "scriptSection", "textLineList", 
		"textLine", "textBlock", "line", "choicePrompt", "choiceList", "choiceExpression", 
		"karmaOperationList", "karmaOperation", "karmaExpression", "karmaTerm", 
		"karmaFactor", "karmaPrimary", "karmaPredicate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "':'", "'{'", "'}'", null, null, "'initialize'", "'end'", 
		"'script'", null, "'['", "']'", null, null, null, "'|'", "'&'", "'!'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "Whitespace", "String", "DeclarationStart", 
		"End", "ScriptStart", "Identifier", "ChoiceStart", "ChoiceEnd", "Operator", 
		"RelationalOperator", "Integer", "Or", "And", "Not", "LP", "RP"
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

	@Override
	public String getGrammarFileName() { return "Sdtg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SdtgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GameContext extends ParserRuleContext {
		public DeclarationSectionContext declarationSection() {
			return getRuleContext(DeclarationSectionContext.class,0);
		}
		public ScriptSectionContext scriptSection() {
			return getRuleContext(ScriptSectionContext.class,0);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			declarationSection();
			setState(37);
			scriptSection();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSectionContext extends ParserRuleContext {
		public TerminalNode DeclarationStart() { return getToken(SdtgParser.DeclarationStart, 0); }
		public TerminalNode LP() { return getToken(SdtgParser.LP, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RP() { return getToken(SdtgParser.RP, 0); }
		public TerminalNode End() { return getToken(SdtgParser.End, 0); }
		public DeclarationSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterDeclarationSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitDeclarationSection(this);
		}
	}

	public final DeclarationSectionContext declarationSection() throws RecognitionException {
		DeclarationSectionContext _localctx = new DeclarationSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DeclarationStart);
			setState(40);
			match(LP);
			setState(41);
			identifierList();
			setState(42);
			match(RP);
			setState(43);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SdtgParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifierList);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(Identifier);
				setState(46);
				match(T__0);
				setState(47);
				identifierList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptSectionContext extends ParserRuleContext {
		public TerminalNode ScriptStart() { return getToken(SdtgParser.ScriptStart, 0); }
		public TextLineListContext textLineList() {
			return getRuleContext(TextLineListContext.class,0);
		}
		public TerminalNode End() { return getToken(SdtgParser.End, 0); }
		public ScriptSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterScriptSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitScriptSection(this);
		}
	}

	public final ScriptSectionContext scriptSection() throws RecognitionException {
		ScriptSectionContext _localctx = new ScriptSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scriptSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ScriptStart);
			setState(52);
			textLineList();
			setState(53);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextLineListContext extends ParserRuleContext {
		public TextLineContext textLine() {
			return getRuleContext(TextLineContext.class,0);
		}
		public TextLineListContext textLineList() {
			return getRuleContext(TextLineListContext.class,0);
		}
		public TextBlockContext textBlock() {
			return getRuleContext(TextBlockContext.class,0);
		}
		public TextLineListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLineList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterTextLineList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitTextLineList(this);
		}
	}

	public final TextLineListContext textLineList() throws RecognitionException {
		TextLineListContext _localctx = new TextLineListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textLineList);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				textLine();
				setState(56);
				textLineList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				textLine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				textBlock();
				setState(60);
				textLineList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				textBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextLineContext extends ParserRuleContext {
		public TextLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLine; }
	 
		public TextLineContext() { }
		public void copyFrom(TextLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularTextLineContext extends TextLineContext {
		public TerminalNode Identifier() { return getToken(SdtgParser.Identifier, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public RegularTextLineContext(TextLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterRegularTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitRegularTextLine(this);
		}
	}
	public static class ConditionalTextLineContext extends TextLineContext {
		public TerminalNode LP() { return getToken(SdtgParser.LP, 0); }
		public KarmaExpressionContext karmaExpression() {
			return getRuleContext(KarmaExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(SdtgParser.RP, 0); }
		public TerminalNode Identifier() { return getToken(SdtgParser.Identifier, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ConditionalTextLineContext(TextLineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterConditionalTextLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitConditionalTextLine(this);
		}
	}

	public final TextLineContext textLine() throws RecognitionException {
		TextLineContext _localctx = new TextLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textLine);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new ConditionalTextLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(LP);
				setState(66);
				karmaExpression(0);
				setState(67);
				match(RP);
				setState(68);
				match(Identifier);
				setState(69);
				match(T__1);
				setState(70);
				line();
				}
				break;
			case Identifier:
				_localctx = new RegularTextLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(Identifier);
				setState(73);
				match(T__1);
				setState(74);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextBlockContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SdtgParser.LP, 0); }
		public KarmaExpressionContext karmaExpression() {
			return getRuleContext(KarmaExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(SdtgParser.RP, 0); }
		public TextLineListContext textLineList() {
			return getRuleContext(TextLineListContext.class,0);
		}
		public TextBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterTextBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitTextBlock(this);
		}
	}

	public final TextBlockContext textBlock() throws RecognitionException {
		TextBlockContext _localctx = new TextBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_textBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LP);
			setState(78);
			karmaExpression(0);
			setState(79);
			match(RP);
			setState(80);
			match(T__2);
			setState(81);
			textLineList();
			setState(82);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ChoicePromptContext choicePrompt() {
			return getRuleContext(ChoicePromptContext.class,0);
		}
		public TerminalNode String() { return getToken(SdtgParser.String, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ChoiceStart:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				choicePrompt();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(String);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoicePromptContext extends ParserRuleContext {
		public TerminalNode ChoiceStart() { return getToken(SdtgParser.ChoiceStart, 0); }
		public TerminalNode String() { return getToken(SdtgParser.String, 0); }
		public ChoiceListContext choiceList() {
			return getRuleContext(ChoiceListContext.class,0);
		}
		public TerminalNode ChoiceEnd() { return getToken(SdtgParser.ChoiceEnd, 0); }
		public ChoicePromptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choicePrompt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterChoicePrompt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitChoicePrompt(this);
		}
	}

	public final ChoicePromptContext choicePrompt() throws RecognitionException {
		ChoicePromptContext _localctx = new ChoicePromptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choicePrompt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ChoiceStart);
			setState(89);
			match(String);
			setState(90);
			choiceList();
			setState(91);
			match(ChoiceEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceListContext extends ParserRuleContext {
		public ChoiceExpressionContext choiceExpression() {
			return getRuleContext(ChoiceExpressionContext.class,0);
		}
		public ChoiceListContext choiceList() {
			return getRuleContext(ChoiceListContext.class,0);
		}
		public ChoiceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterChoiceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitChoiceList(this);
		}
	}

	public final ChoiceListContext choiceList() throws RecognitionException {
		ChoiceListContext _localctx = new ChoiceListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choiceList);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				choiceExpression();
				setState(94);
				match(T__0);
				setState(95);
				choiceList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				choiceExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceExpressionContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(SdtgParser.String, 0); }
		public KarmaOperationListContext karmaOperationList() {
			return getRuleContext(KarmaOperationListContext.class,0);
		}
		public ChoiceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterChoiceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitChoiceExpression(this);
		}
	}

	public final ChoiceExpressionContext choiceExpression() throws RecognitionException {
		ChoiceExpressionContext _localctx = new ChoiceExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_choiceExpression);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(String);
				setState(101);
				match(T__1);
				setState(102);
				karmaOperationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(String);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmaOperationListContext extends ParserRuleContext {
		public KarmaOperationContext karmaOperation() {
			return getRuleContext(KarmaOperationContext.class,0);
		}
		public KarmaOperationListContext karmaOperationList() {
			return getRuleContext(KarmaOperationListContext.class,0);
		}
		public KarmaOperationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaOperationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaOperationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaOperationList(this);
		}
	}

	public final KarmaOperationListContext karmaOperationList() throws RecognitionException {
		KarmaOperationListContext _localctx = new KarmaOperationListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_karmaOperationList);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				karmaOperation();
				setState(107);
				karmaOperationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				karmaOperation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmaOperationContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(SdtgParser.LP, 0); }
		public TerminalNode Identifier() { return getToken(SdtgParser.Identifier, 0); }
		public TerminalNode Operator() { return getToken(SdtgParser.Operator, 0); }
		public TerminalNode Integer() { return getToken(SdtgParser.Integer, 0); }
		public TerminalNode RP() { return getToken(SdtgParser.RP, 0); }
		public KarmaOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaOperation(this);
		}
	}

	public final KarmaOperationContext karmaOperation() throws RecognitionException {
		KarmaOperationContext _localctx = new KarmaOperationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_karmaOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LP);
			setState(113);
			match(Identifier);
			setState(114);
			match(Operator);
			setState(115);
			match(Integer);
			setState(116);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmaExpressionContext extends ParserRuleContext {
		public KarmaTermContext karmaTerm() {
			return getRuleContext(KarmaTermContext.class,0);
		}
		public KarmaExpressionContext karmaExpression() {
			return getRuleContext(KarmaExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(SdtgParser.Or, 0); }
		public KarmaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaExpression(this);
		}
	}

	public final KarmaExpressionContext karmaExpression() throws RecognitionException {
		return karmaExpression(0);
	}

	private KarmaExpressionContext karmaExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		KarmaExpressionContext _localctx = new KarmaExpressionContext(_ctx, _parentState);
		KarmaExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_karmaExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			karmaTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KarmaExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_karmaExpression);
					setState(121);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(122);
					match(Or);
					setState(123);
					karmaTerm(0);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KarmaTermContext extends ParserRuleContext {
		public KarmaFactorContext karmaFactor() {
			return getRuleContext(KarmaFactorContext.class,0);
		}
		public KarmaTermContext karmaTerm() {
			return getRuleContext(KarmaTermContext.class,0);
		}
		public TerminalNode And() { return getToken(SdtgParser.And, 0); }
		public KarmaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaTerm(this);
		}
	}

	public final KarmaTermContext karmaTerm() throws RecognitionException {
		return karmaTerm(0);
	}

	private KarmaTermContext karmaTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		KarmaTermContext _localctx = new KarmaTermContext(_ctx, _parentState);
		KarmaTermContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_karmaTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			karmaFactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KarmaTermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_karmaTerm);
					setState(132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(133);
					match(And);
					setState(134);
					karmaFactor();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KarmaFactorContext extends ParserRuleContext {
		public KarmaPrimaryContext karmaPrimary() {
			return getRuleContext(KarmaPrimaryContext.class,0);
		}
		public TerminalNode Not() { return getToken(SdtgParser.Not, 0); }
		public KarmaFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaFactor(this);
		}
	}

	public final KarmaFactorContext karmaFactor() throws RecognitionException {
		KarmaFactorContext _localctx = new KarmaFactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_karmaFactor);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				karmaPrimary();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Not);
				setState(142);
				karmaPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmaPrimaryContext extends ParserRuleContext {
		public KarmaPredicateContext karmaPredicate() {
			return getRuleContext(KarmaPredicateContext.class,0);
		}
		public TerminalNode LP() { return getToken(SdtgParser.LP, 0); }
		public KarmaExpressionContext karmaExpression() {
			return getRuleContext(KarmaExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(SdtgParser.RP, 0); }
		public KarmaPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaPrimary(this);
		}
	}

	public final KarmaPrimaryContext karmaPrimary() throws RecognitionException {
		KarmaPrimaryContext _localctx = new KarmaPrimaryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_karmaPrimary);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				karmaPredicate();
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(LP);
				setState(147);
				karmaExpression(0);
				setState(148);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KarmaPredicateContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SdtgParser.Identifier, 0); }
		public TerminalNode RelationalOperator() { return getToken(SdtgParser.RelationalOperator, 0); }
		public TerminalNode Integer() { return getToken(SdtgParser.Integer, 0); }
		public KarmaPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karmaPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).enterKarmaPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SdtgListener ) ((SdtgListener)listener).exitKarmaPredicate(this);
		}
	}

	public final KarmaPredicateContext karmaPredicate() throws RecognitionException {
		KarmaPredicateContext _localctx = new KarmaPredicateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_karmaPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Identifier);
			setState(153);
			match(RelationalOperator);
			setState(154);
			match(Integer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return karmaExpression_sempred((KarmaExpressionContext)_localctx, predIndex);
		case 14:
			return karmaTerm_sempred((KarmaTermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean karmaExpression_sempred(KarmaExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean karmaTerm_sempred(KarmaTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13e\n"+
		"\13\3\f\3\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\5\rq\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\177\n\17\f\17\16\17\u0082"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u008a\n\20\f\20\16\20\u008d"+
		"\13\20\3\21\3\21\3\21\5\21\u0092\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u0099"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\2\4\34\36\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\2\u0099\2&\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\b\65\3\2"+
		"\2\2\nA\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2\24d\3\2"+
		"\2\2\26j\3\2\2\2\30p\3\2\2\2\32r\3\2\2\2\34x\3\2\2\2\36\u0083\3\2\2\2"+
		" \u0091\3\2\2\2\"\u0098\3\2\2\2$\u009a\3\2\2\2&\'\5\4\3\2\'(\5\b\5\2("+
		"\3\3\2\2\2)*\7\t\2\2*+\7\25\2\2+,\5\6\4\2,-\7\26\2\2-.\7\n\2\2.\5\3\2"+
		"\2\2/\60\7\f\2\2\60\61\7\3\2\2\61\64\5\6\4\2\62\64\7\f\2\2\63/\3\2\2\2"+
		"\63\62\3\2\2\2\64\7\3\2\2\2\65\66\7\13\2\2\66\67\5\n\6\2\678\7\n\2\28"+
		"\t\3\2\2\29:\5\f\7\2:;\5\n\6\2;B\3\2\2\2<B\5\f\7\2=>\5\16\b\2>?\5\n\6"+
		"\2?B\3\2\2\2@B\5\16\b\2A9\3\2\2\2A<\3\2\2\2A=\3\2\2\2A@\3\2\2\2B\13\3"+
		"\2\2\2CD\7\25\2\2DE\5\34\17\2EF\7\26\2\2FG\7\f\2\2GH\7\4\2\2HI\5\20\t"+
		"\2IN\3\2\2\2JK\7\f\2\2KL\7\4\2\2LN\5\20\t\2MC\3\2\2\2MJ\3\2\2\2N\r\3\2"+
		"\2\2OP\7\25\2\2PQ\5\34\17\2QR\7\26\2\2RS\7\5\2\2ST\5\n\6\2TU\7\6\2\2U"+
		"\17\3\2\2\2VY\5\22\n\2WY\7\b\2\2XV\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\7\r"+
		"\2\2[\\\7\b\2\2\\]\5\24\13\2]^\7\16\2\2^\23\3\2\2\2_`\5\26\f\2`a\7\3\2"+
		"\2ab\5\24\13\2be\3\2\2\2ce\5\26\f\2d_\3\2\2\2dc\3\2\2\2e\25\3\2\2\2fg"+
		"\7\b\2\2gh\7\4\2\2hk\5\30\r\2ik\7\b\2\2jf\3\2\2\2ji\3\2\2\2k\27\3\2\2"+
		"\2lm\5\32\16\2mn\5\30\r\2nq\3\2\2\2oq\5\32\16\2pl\3\2\2\2po\3\2\2\2q\31"+
		"\3\2\2\2rs\7\25\2\2st\7\f\2\2tu\7\17\2\2uv\7\21\2\2vw\7\26\2\2w\33\3\2"+
		"\2\2xy\b\17\1\2yz\5\36\20\2z\u0080\3\2\2\2{|\f\3\2\2|}\7\22\2\2}\177\5"+
		"\36\20\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\35\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\20\1\2\u0084\u0085"+
		"\5 \21\2\u0085\u008b\3\2\2\2\u0086\u0087\f\3\2\2\u0087\u0088\7\23\2\2"+
		"\u0088\u008a\5 \21\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\37\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0092\5\"\22\2\u008f\u0090\7\24\2\2\u0090\u0092\5\"\22\2\u0091\u008e"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092!\3\2\2\2\u0093\u0099\5$\23\2\u0094"+
		"\u0095\7\25\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\26\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0099#\3\2\2\2\u009a"+
		"\u009b\7\f\2\2\u009b\u009c\7\20\2\2\u009c\u009d\7\21\2\2\u009d%\3\2\2"+
		"\2\r\63AMXdjp\u0080\u008b\u0091\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}