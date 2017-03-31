package gameObjects;

import java.util.ArrayList;

import memory.Memory;

public class Game {

    private ArrayList<TextLine> textSequence = new ArrayList<>();
    private Memory lookUp;
    
    public Game()
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
    
}
