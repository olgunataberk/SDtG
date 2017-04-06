package parsing;

import java.util.logging.Level;
import java.util.logging.Logger;

import antlr.SdtgBaseListener;
import antlr.SdtgParser;
import antlr.SdtgParser.ChoiceExpressionContext;
import antlr.SdtgParser.DeclarationSectionContext;
import antlr.SdtgParser.IdentifierListContext;
import antlr.SdtgParser.KarmaOperationContext;
import antlr.SdtgParser.TextBlockContext;
import antlr.SdtgParser.TextListContext;
import gameObjects.ChoicePrompt;
import gameObjects.NpcTextLine;
import gameObjects.PlayerTextLine;
import gameObjects.TextLine;
import karmaComputation.EvaluationTree;
import karmaComputation.KarmaOperation;
import memory.Memory;
import threading.runnables.GameRunnable;

/**
 * Fills a given empty "game" object according to the script input.
 */
public class ParseTreeListener extends SdtgBaseListener {

    private boolean choicePromptTrigger;
    private boolean textBlockTrigger;
    
    private EvaluationTree evalTree;
    private EvaluationTree.Node pNode;
    private TextLine textLine;
    private ChoicePrompt.Choice choice;
    private String subject;
    private GameRunnable game;
    private Memory memo;
    
    public ParseTreeListener(GameRunnable game)
    {
        super();
        evalTree = null;
        this.game = game;
        memo = new Memory();
        textBlockTrigger = false;
    }

    @Override
    public void enterIdentifierList(IdentifierListContext ctx)
    {
        memo.addVariable(ctx.getChild(0).getText());
    }
    
    @Override
    public void exitGame(SdtgParser.GameContext ctx)
    {
        game.setMemory(memo);
        Logger.getGlobal().log(Level.INFO,"ParseTreeListener finished it's job.");
    }

    @Override
    public void enterConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
        if(textBlockTrigger)
        {
               
        }
        else
        {
            evalTree = new EvaluationTree();
            pNode = evalTree.getRoot();
            subject = ctx.getChild(3).getText();
        }
    }

    @Override
    public void exitConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
        if(textBlockTrigger)
        {
               
        }
        else
        {
            textLine.setEvaluationTree(evalTree);
            game.addTextLine(textLine);
        }
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
    public void enterTextBlock(TextBlockContext ctx)
    {
        textBlockTrigger = true;
    }
    
    @Override
    public void exitTextBlock(TextBlockContext ctx)
    {
        textBlockTrigger = false;
    }
    
    @Override
    public void enterTextList(TextListContext ctx)
    {
        // TODO Auto-generated method stub
        super.enterTextList(ctx);
    }
    
    @Override
    public void exitTextList(TextListContext ctx)
    {
        // TODO Auto-generated method stub
        super.exitTextList(ctx);
    }
    
    @Override
    public void enterKarmaExpression(SdtgParser.KarmaExpressionContext ctx)
    {
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
            if(pNode == null)
                System.out.println("wat");
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
