package parsing;

import antlr.SdtgBaseListener;
import antlr.SdtgParser;
import gameObjects.ChoicePrompt;
import karmaComputation.EvaluationTree;

public class ParseTreeListener extends SdtgBaseListener {

    private boolean initialExpression;
    private EvaluationTree evalTree;
    private EvaluationTree.Node pNode;
    private ChoicePrompt choicePrompt;
    
    public ParseTreeListener()
    {
        super();
        initialExpression = false;
        evalTree = null;
    }

    @Override
    public void enterConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
        evalTree = new EvaluationTree();
    }

    @Override
    public void exitConditionalTextLine(SdtgParser.ConditionalTextLineContext ctx)
    {
    }

    @Override
    public void enterRegularTextLine(SdtgParser.RegularTextLineContext ctx)
    {
    }

    @Override
    public void exitRegularTextLine(SdtgParser.RegularTextLineContext ctx)
    {
    }

    @Override public void enterLine(SdtgParser.LineContext ctx) {
        
        if(ctx.getText().startsWith("\"")) //not a choice-prompt
        {
            
        }
    }

    @Override public void exitLine(SdtgParser.LineContext ctx) { }
    
    @Override
    public void enterKarmaExpression(SdtgParser.KarmaExpressionContext ctx)
    {
        if (!initialExpression)
        {
            initialExpression = true;
            pNode = evalTree.getRoot();
        }
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0),pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaExpression(SdtgParser.KarmaExpressionContext ctx)
    {
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
            pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaTerm(SdtgParser.KarmaTermContext ctx)
    {
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0),pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaTerm(SdtgParser.KarmaTermContext ctx)
    {
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
            pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaFactor(SdtgParser.KarmaFactorContext ctx)
    {
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(1).toString().charAt(0),pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaFactor(SdtgParser.KarmaFactorContext ctx)
    {
        if(ctx.getChildCount() == 3 && isBooleanOperator(ctx.getChild(1).toString()))
            pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx)
    {
        if(ctx.getChildCount() == 2)
        {
            EvaluationTree.Node tempNode = evalTree.new Node(ctx.getChild(0).toString().charAt(0),pNode);
            pNode.addChild(tempNode);
            pNode = tempNode;
        }
    }

    @Override
    public void exitKarmaPrimary(SdtgParser.KarmaPrimaryContext ctx)
    {
        if(ctx.getChildCount() == 2)
            pNode = pNode.getParent();
    }

    @Override
    public void enterKarmaPredicate(SdtgParser.KarmaPredicateContext ctx)
    {
        EvaluationTree.Node tempNode = evalTree.new Node(ctx.getText(),pNode);
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
        return s.equals("&")|s.equals("!")|s.equals("|");
    }
    
}
