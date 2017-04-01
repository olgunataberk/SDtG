package threading.runnables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import gameObjects.ChoicePrompt;
import gameObjects.TextLine;
import karmaComputation.EvaluationTree;
import karmaComputation.KarmaOperation;
import memory.Memory;
import threading.threads.GeneralThread;

public class GameRunnable implements Runnable{

    private LinkedList<String> outputList;
    private ArrayList<TextLine> textSequence;
    private Memory lookUp;
    
    private GeneralThread oThread;
    private TextOutputRunnable toRunnable;
    
    public GameRunnable()
    {
        textSequence = new ArrayList<>();
        oThread = null;
        toRunnable = null;
        outputList = new LinkedList<String>();
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
        Logger.getGlobal().log(Level.INFO, "Game started with "+textSequence.size()+" lines of lines.");
        toRunnable = new TextOutputRunnable(2, outputList);
        oThread = new GeneralThread(toRunnable);
        oThread.start();
        
        while(!textSequence.isEmpty())
        {
            TextLine curr = textSequence.remove(0);
            Logger.getGlobal().log(Level.INFO, curr.speak());
            EvaluationTree evt = curr.getEvaluationTree();
            if(evt.evaluate(lookUp))
                outputList.add(curr.speak());
            if(curr.getType() == TextLine.CHOICE_TEXTLINE)
            {
                outputList.add(((ChoicePrompt)curr).getChoiceIdentifiers());
                ArrayList<KarmaOperation> kop = ((ChoicePrompt)curr).choose();
                for(KarmaOperation k : kop)
                    k.evaluate(lookUp);
            }
        }
        try
        {
            oThread.join();
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
