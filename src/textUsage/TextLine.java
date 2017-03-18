package textUsage;

public class TextLine {
	
	protected String subject;
	protected String line;
	
	public String speak()
	{
		return this.line + ": "+subject;
	}
}
