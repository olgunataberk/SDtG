package generalUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import textUsage.TextLine;
import textUsage.TextLineParser;

/**
 * Utility for turning text into text.
 *
 */
public class ScriptToGameText {
	
	private TextLineParser tlp;
	
	public ScriptToGameText(TextLineParser tlp)
	{
		this.tlp = tlp;
	}
	
	/**
	 * 
	 * @param chunk string to be tokenized and converted
	 * @return equivalent TextLine objects in a list.
	 */
	public ArrayList<TextLine> convert(String chunk)
	{
		String[] tokens = chunk.split("\n");
		ArrayList<String> lines = new ArrayList<>();
		for(int i = 0 ; i < tokens.length ; i++)
			lines.add(tokens[i]);
		return this.convert(lines);
	}
	
	/**
	 * Converts given strings into a list of TextLine objects.
	 * @param lines
	 * @return
	 */
	public ArrayList<TextLine> convert(ArrayList<String> lines)
	{
		if(lines == null)
			return null;
		ArrayList<TextLine> toReturn = new ArrayList<>();
		for(String s : lines)
		{
			TextLine tl = tlp.parseLine(s);
			if(tl != null)
				toReturn.add(tl);
		}
		return toReturn;
	}
	
	/**
	 * Converts the content of a file into a list of TextLine objects.
	 * @param path path to file
	 * @return
	 */
	public ArrayList<TextLine> convertFromFile(String path)
	{
		FileInputStream fos = null;
		Scanner sc = null;
		ArrayList<String> lines = null;
		try
		{
			fos = new FileInputStream(path);
			sc = new Scanner(fos);
			lines = new ArrayList<>();
			while(sc.hasNextLine())
				lines.add(sc.nextLine());
		} 
		catch(IOException e){e.printStackTrace();}
		finally
		{
			if(fos != null)
			{
				try {fos.close();} catch (IOException e) {}
			}
			if(sc != null)
			{
				sc.close();
			}
		}
		return convert(lines);
	}
}
