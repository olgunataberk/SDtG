package gameObjects;

import karmaComputation.EvaluationTree;

/**
 * Contains various information about a line of text to be processed and displayed on screen.
 * 
 */
public class TextLine {

    public static final int REGULAR_TEXTLINE = 1;
    public static final int CHOICE_TEXTLINE = 2;
    
    protected EvaluationTree karmaTrigger;
    protected String subject;
    protected String line;
    
    protected int type;
    
    public TextLine()
    {
        type = 0;
        karmaTrigger = new EvaluationTree();
    }
    
    public String speak()
    {
        return this.subject + ": " + this.line;
    }
    
    public void setEvaluationTree(EvaluationTree et)
    {
        karmaTrigger = et;
    }
    
    public EvaluationTree getEvaluationTree()
    {
        return karmaTrigger;
    }
    
    public int getType()
    {
        return type;
    }
}
