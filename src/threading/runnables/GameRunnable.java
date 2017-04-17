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
import threading.threads.BaseThread;

public class GameRunnable extends RunnableConfiguration implements Runnable {

    private LinkedList<String> outputList;
    private ArrayList<TextLine> textSequence;
    private Memory lookUp;

    private BaseThread oThread;
    private TextOutputRunnable toRunnable;

    public GameRunnable(int severity)
    {
        super(severity);
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
        Logger.getGlobal().log(Level.INFO, "Game started with " + textSequence.size() + " lines of lines.");
        toRunnable = new TextOutputRunnable(2, outputList);
        oThread = new BaseThread(toRunnable);
        oThread.start();
        try
        {
            while (true)
            {
                doWork();
                Thread.sleep(SLEEP_IDLE);
            }
        }
        catch (InterruptedException exc)
        {
            Logger.getGlobal().log(Level.SEVERE, exc.getMessage());
        }
    }

    private void doWork() throws InterruptedException
    {
        while (!textSequence.isEmpty())
        {
            TextLine curr = textSequence.remove(0);
            ArrayList<EvaluationTree> evtList = curr.getEvaluationTreeList();
            boolean isValid = true;
            for (EvaluationTree evt : evtList)
                if (!evt.evaluate(lookUp)) isValid = false;
            if (isValid || evtList.isEmpty())
            {
                outputList.add(curr.speak());
                if (curr.getType() == TextLine.CHOICE_TEXTLINE)
                {
                    outputList.add(((ChoicePrompt) curr).getChoiceIdentifiers());
                    ArrayList<KarmaOperation> kop = ((ChoicePrompt) curr).choose();
                    for (KarmaOperation k : kop)
                        k.evaluate(lookUp);
                }
            }
        }
    }

}
