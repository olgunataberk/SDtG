package textUsage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TextLineParser {
	
	/**
	 * given a line return a TextLine Object
	 * @param line
	 * @return TextLine object specified by the given string.
	 */
	public TextLine parseLine(String line)
	{
		TextLine toReturn = null;
		if(checkFormat(line))
		{
			String subj = line.substring(0,line.indexOf(":"));
			String ln = line.substring(line.indexOf(":") + 1).trim();
			if(subj.equalsIgnoreCase("player"))
				toReturn = new PlayerTextLine(ln);
			else
				toReturn = new NpcTextLine(subj, ln);
		}
		else
			Logger.getGlobal().log(Level.WARNING, "Syntax Error on line: " + line);
		return toReturn;
	}
	
	/**
	 * TODO obviously needs improvement.
	 * if it has ":" somewhere along the line (haha) it is ok.
	 * @param line line to apply check on.
	 * @return if line is parseable or not.
	 */
	private boolean checkFormat(String line)
	{
		return line.contains(":");
	}
	
}
