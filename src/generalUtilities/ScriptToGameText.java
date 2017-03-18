package generalUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import textUsage.TextLine;

public class ScriptToGameText {
	/**
	 * 
	 * @param chunk
	 * @return
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
	 * 
	 * @param lines
	 * @return
	 */
	public ArrayList<TextLine> convert(ArrayList<String> lines)
	{
		if(lines == null)
			return null;
		
		ArrayList<TextLine> toReturn = null;
		return toReturn;
	}
	
	/**
	 * 
	 * @param fileName
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
