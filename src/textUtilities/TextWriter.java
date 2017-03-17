package textUtilities;

import java.util.ArrayList;
import java.io.*;

public class TextWriter extends TextIo{
	
	/**
	 * TODO bind parameter's type to a smaller scope.
	 * @param dataToWrite data to write as arrayList
	 */
	public void writeObject(ArrayList<?> dataToWrite)
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try
		{
			fos = new FileOutputStream(pathToFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dataToWrite);
		} 
		catch (IOException e) { e.printStackTrace();} 
		finally {
			if(oos != null){
				try{ oos.close();}
				catch (Exception e) {}
			}
			if(fos != null){
				try{ fos.close();}
				catch (Exception e) {}
			}
		}
	}
}
