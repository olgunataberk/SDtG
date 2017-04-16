// Generated from Sdtg.g4 by ANTLR 4.6
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SdtgParser}.
 */
public interface SdtgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SdtgParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(SdtgParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(SdtgParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSection(SdtgParser.DeclarationSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#declarationSection}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSection(SdtgParser.DeclarationSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SdtgParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SdtgParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#scriptSection}.
	 * @param ctx the parse tree
	 */
	void enterScriptSection(SdtgParser.ScriptSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#scriptSection}.
	 * @param ctx the parse tree
	 */
	void exitScriptSection(SdtgParser.ScriptSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#textLineList}.
	 * @param ctx the parse tree
	 */
	void enterTextLineList(SdtgParser.TextLineListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#textLineList}.
	 * @param ctx the parse tree
	 */
	void exitTextLineList(SdtgParser.TextLineListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalTextLine}
	 * labeled alternative in {@link SdtgParser#textLine}.
	 * @param ctx the parse tree
	 */
	void enterConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalTextLine}
	 * labeled alternative in {@link SdtgParser#textLine}.
	 * @param ctx the parse tree
	 */
	void exitConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularTextLine}
	 * labeled alternative in {@link SdtgParser#textLine}.
	 * @param ctx the parse tree
	 */
	void enterRegularTextLine(SdtgParser.RegularTextLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularTextLine}
	 * labeled alternative in {@link SdtgParser#textLine}.
	 * @param ctx the parse tree
	 */
	void exitRegularTextLine(SdtgParser.RegularTextLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#textBlock}.
	 * @param ctx the parse tree
	 */
	void enterTextBlock(SdtgParser.TextBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#textBlock}.
	 * @param ctx the parse tree
	 */
	void exitTextBlock(SdtgParser.TextBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SdtgParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SdtgParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#choicePrompt}.
	 * @param ctx the parse tree
	 */
	void enterChoicePrompt(SdtgParser.ChoicePromptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#choicePrompt}.
	 * @param ctx the parse tree
	 */
	void exitChoicePrompt(SdtgParser.ChoicePromptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#choiceList}.
	 * @param ctx the parse tree
	 */
	void enterChoiceList(SdtgParser.ChoiceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#choiceList}.
	 * @param ctx the parse tree
	 */
	void exitChoiceList(SdtgParser.ChoiceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#choiceExpression}.
	 * @param ctx the parse tree
	 */
	void enterChoiceExpression(SdtgParser.ChoiceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#choiceExpression}.
	 * @param ctx the parse tree
	 */
	void exitChoiceExpression(SdtgParser.ChoiceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaOperationList}.
	 * @param ctx the parse tree
	 */
	void enterKarmaOperationList(SdtgParser.KarmaOperationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaOperationList}.
	 * @param ctx the parse tree
	 */
	void exitKarmaOperationList(SdtgParser.KarmaOperationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaOperation}.
	 * @param ctx the parse tree
	 */
	void enterKarmaOperation(SdtgParser.KarmaOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaOperation}.
	 * @param ctx the parse tree
	 */
	void exitKarmaOperation(SdtgParser.KarmaOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaExpression}.
	 * @param ctx the parse tree
	 */
	void enterKarmaExpression(SdtgParser.KarmaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaExpression}.
	 * @param ctx the parse tree
	 */
	void exitKarmaExpression(SdtgParser.KarmaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaTerm}.
	 * @param ctx the parse tree
	 */
	void enterKarmaTerm(SdtgParser.KarmaTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaTerm}.
	 * @param ctx the parse tree
	 */
	void exitKarmaTerm(SdtgParser.KarmaTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaFactor}.
	 * @param ctx the parse tree
	 */
	void enterKarmaFactor(SdtgParser.KarmaFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaFactor}.
	 * @param ctx the parse tree
	 */
	void exitKarmaFactor(SdtgParser.KarmaFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SdtgParser#karmaPredicate}.
	 * @param ctx the parse tree
	 */
	void enterKarmaPredicate(SdtgParser.KarmaPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SdtgParser#karmaPredicate}.
	 * @param ctx the parse tree
	 */
	void exitKarmaPredicate(SdtgParser.KarmaPredicateContext ctx);
}