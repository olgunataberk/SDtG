package gameObjects;

import karmaComputation.EvaluationTree;

/**
 * Contains various information about a line of text to be processed and displayed on screen.
 * 
 */
public class TextLine {

    protected EvaluationTree karmaTrigger;
    protected String subject;
    protected String line;
    
    public TextLine()
    {
        karmaTrigger = null;
    }
    
    public String speak()
    {
        return this.subject + ": " + this.line;
    }
    
    public void setEvaluationTree(EvaluationTree et)
    {
        karmaTrigger = et;
    }
}
