package textUsage;

/**
 * Contains information regarding a line of text.
 * 
 */
public class TextLine {
	
	protected String subject;
	protected String line;
	
	public String speak()
	{
		return this.subject + ": "+this.line;
	}
}
