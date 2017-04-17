package memory;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Memory {

    private Hashtable<String, Integer> lookUp;

    public Memory()
    {
        lookUp = new Hashtable<String, Integer>();
    }

    public void addVariable(String key)
    {
        lookUp.put(key, 0);
    }

    public int getValue(String key)
    {
        return lookUp.get(key);
    }

    public void setValue(String key, int value)
    {
        lookUp.put(key, value);
    }

}
