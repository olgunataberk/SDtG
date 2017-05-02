package gameObjects;

import java.io.Serializable;
import java.util.ArrayList;

import karmaComputation.EvaluationTree;

/**
 * Contains various information about a line of text to be processed and
 * displayed on screen.
 * 
 */
public class TextLine implements Serializable {

    private static final long serialVersionUID = 2090617981394191041L;
    public static final int REGULAR_TEXTLINE = 1;
    public static final int CHOICE_TEXTLINE = 2;

    protected ArrayList<EvaluationTree> karmaTriggerList;
    protected String subject;
    protected String line;

    protected int type;

    /**
     * Instantiate a TextLine object with no conditions required.
     */
    public TextLine()
    {
        type = 0;
        karmaTriggerList = new ArrayList<EvaluationTree>();
    }

    /**
     * @return a string formed by appending Subject and Line of this TextLine.
     */
    public String speak()
    {
        return this.subject + ": " + this.line;
    }

    /**
     * @param et conditions required to print this TextLine.
     */
    public void setEvaluationTreeList(ArrayList<EvaluationTree> et)
    {
        karmaTriggerList = et;
    }

    /**
     * @return conditions required to print this TextLine. 
     */
    public ArrayList<EvaluationTree> getEvaluationTreeList()
    {
        return karmaTriggerList;
    }

    /**
     * @return a value denoting the type of this TextLine(currently ChoicePrompt,RegularTextLine).
     */
    public int getType()
    {
        return type;
    }
}
