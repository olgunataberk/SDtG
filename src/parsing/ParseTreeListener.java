package parsing;

import antlr.SdtgBaseListener;
import antlr.SdtgParser;
import antlr.SdtgParser.ChoiceExpressionContext;
import antlr.SdtgParser.KarmaOperationContext;
import gameObjects.ChoicePrompt;
import gameObjects.Game;
import gameObjects.NpcTextLine;
import gameObjects.PlayerTextLine;
import gameObjects.TextLine;
import karmaComputation.EvaluationTree;
import karmaComputation.KarmaOperation;

public class ParseTreeListener extends SdtgBaseListener {

    private boolean initialExpression;
    private boolean choicePromptTrigger;

    private EvaluationTree evalTree;
    private EvaluationTree.Node pNode;
    private TextLine textLine;
    private ChoicePrompt.Choice choice;
    private String subject;
    private Game game;

    public ParseTreeListener(Game game)
    {
        super();
        initialExpression = false;
        evalTree = null;
        this.game = game;
    }

    @Override
    public void exitGame(SdtgParser.GameContext ctx)
    {

    }

    @Override
    public void enterConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
        evalTree = new EvaluationTree();
        subject = ctx.getChild(3).getText();
    }

    @Override
    public void exitConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
        textLine.setEvaluationTree(evalTree);
        game.addTextLine(textLine);
    }

    @Override
    public void enterRegularTextLine(SdtgParser.RegularTextLineContext ctx)
    {
        subject = ctx.getChild(0).getText();
    }

    @Override
    public void exitRegularTextLine(SdtgParser.RegularTextLineContext ctx)
    {
        game.addTextLine(textLine);
    }

    @Override
    public void enterLine(SdtgParser.LineContext ctx)
    {

        if (!ctx.getText().startsWith("\"")) // a choice-prompt
            choicePromptTrigger = true;
        else
            choicePromptTrigger = false;
    }

    @Override
    public void exitLine(SdtgParser.LineContext ctx)
    {
        if (!choicePromptTrigger)
        {
            if(subject.equals("Player"))
                textLine = new PlayerTextLine(ctx.getText());
            else
                textLine = new NpcTextLine(subject,ctx.getText());
        }
    }

    @Override
    public void enterChoicePrompt(SdtgParser.ChoicePromptContext ctx)
    {
        textLine = new ChoicePrompt(subject,ctx.getChild(1).getText());
    }

    @Override
    public void enterChoiceExpression(ChoiceExpressionContext ctx)
    {
        choice = ((ChoicePrompt)textLine).new Choice(ctx.getChild(0).getText());
    }
    
    @Override
    public void exitChoiceExpression(ChoiceExpressionContext ctx)
    {
        ((ChoicePrompt)textLine).addChoice(choice);
    }
    
    @Override
    public void enterKarmaOperation(KarmaOperationContext ctx)
    {
        choice.addKarmaExpression(new KarmaOperation(
                ctx.getChild(1).getText(),
                ctx.getChild(2).getText().charAt(0),
                Integer.parseInt(ctx.getChild(3).getText())
                ));
    }
    
    @Override
    public void enterKarmaExpression(SdtgParser.KarmaExpressionContext ctx)
    {
        if (!initialExpression)
        {
            initialExpression = true;
            pNode = evalTree.getRoot();
        }
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0), pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaExpression(SdtgParser.KarmaExpressionContext ctx)
    {
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString())) pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaTerm(SdtgParser.KarmaTermContext ctx)
    {
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0), pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaTerm(SdtgParser.KarmaTermContext ctx)
    {
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString())) pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaFactor(SdtgParser.KarmaFactorContext ctx)
    {
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0), pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaFactor(SdtgParser.KarmaFactorContext ctx)
    {
        if (ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString())) pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx)
    {
        if (ctx.getChildCount() == 2)
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(0).toString().charAt(0), pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx)
    {
        if (ctx.getChildCount() == 2) pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaPredicate(SdtgParser.KarmaPredicateContext ctx)
    {
        EvaluationTree.Node tempNode = evalTree.new Node(ctx.getText(), pNode);
        pNode.addChild(tempNode);
        pNode = tempNode;
    }

    @Override
    public void exitKarmaPredicate(SdtgParser.KarmaPredicateContext ctx)
    {
        pNode = pNode.getParent();
    }

    private boolean isBooleanOperator(String s)
    {
        return s.equals("&") | s.equals("!") | s.equals("|");
    }

}