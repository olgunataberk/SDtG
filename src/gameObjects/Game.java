package gameObjects;

import java.util.ArrayList;

public class Game {

    private ArrayList<TextLine> textSequence = new ArrayList<>();
    
    public Game()
    {
        textSequence = new ArrayList<>();
    }
    
    public void addTextLine(TextLine tl)
    {
        textSequence.add(tl);
    }
}
