package threading.runnables;

import java.util.ArrayList;

import gameObjects.TextLine;
import memory.Memory;

public class GameRunnable implements Runnable{

    private ArrayList<TextLine> textSequence = new ArrayList<>();
    private Memory lookUp;
    
    public GameRunnable()
    {
        textSequence = new ArrayList<>();
    }
    
    public void addTextLine(TextLine tl)
    {
        textSequence.add(tl);
    }
    
    public void setMemory(Memory mem)
    {
        lookUp = mem;
    }

    @Override
    public void run()
    {
        
        // TODO Auto-generated method stub
        
    }
    
}
