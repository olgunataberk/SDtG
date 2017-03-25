package textUsage;

/**
 * Contains various information about a line of text to be processed and displayed on screen.
 * 
 */
public class TextLine {

    protected int karmaTrigger;
    protected String subject;
    protected String line;

    public String speak()
    {
        return this.subject + ": " + this.line;
    }
}
