package memory;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Holds key(karma variables)-value(integers) pairs.
 * 
 */
public class Memory implements Serializable{
    
    private static final long serialVersionUID = 626136876688978317L;
    
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
