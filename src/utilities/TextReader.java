package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TextReader extends TextIo {

    /**
     * TODO bind return type of this function to a bigger scope.
     * 
     * @return the read object as an ArrayList.
     */
    @SuppressWarnings("unchecked")
    public ArrayList<Character> readObject()
    {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Character> toReturn = null;
        try
        {
            fis = new FileInputStream(pathToFile);
            ois = new ObjectInputStream(fis);
            toReturn = (ArrayList<Character>) ois.readObject();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (ois != null)
            {
                try
                {
                    ois.close();
                }
                catch (Exception e)
                {
                }
            }
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (Exception e)
                {
                }
            }
        }
        return toReturn;
    }

}
