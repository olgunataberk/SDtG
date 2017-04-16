package gameObjects;

import java.util.ArrayList;

import karmaComputation.EvaluationTree;

/**
 * Contains various information about a line of text to be processed and displayed on screen.
 * 
 */
public class TextLine {

    public static final int REGULAR_TEXTLINE = 1;
    public static final int CHOICE_TEXTLINE = 2;
    
    protected ArrayList<EvaluationTree> karmaTriggerList;
    protected String subject;
    protected String line;
    
    protected int type;
    
    public TextLine()
    {
        type = 0;
        karmaTriggerList = new ArrayList<EvaluationTree>();
    }
    
    public String speak()
    {
        return this.subject + ": " + this.line;
    }
    
    public void setEvaluationTreeList(ArrayList<EvaluationTree> et)
    {
        karmaTriggerList = et;
    }
    
    public ArrayList<EvaluationTree> getEvaluationTreeList()
    {
        return karmaTriggerList;
    }
    
    public int getType()
    {
        return type;
    }
}
