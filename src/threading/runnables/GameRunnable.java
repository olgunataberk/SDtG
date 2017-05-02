package threading.runnables;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import gameObjects.ChoiceTextLine;
import gameObjects.TextLine;
import karmaComputation.EvaluationTree;
import karmaComputation.KarmaOperation;
import memory.Memory;
import threading.threads.BaseThread;

/**
 * Holds all the information needed to run the game.
 * 
 */
public class GameRunnable extends RunnableConfiguration implements Runnable,Serializable {
    
    private static final long serialVersionUID = 8174824646889410516L;
    private LinkedList<String> outputList;
    private ArrayList<TextLine> textSequence;
    private Memory lookUp;

    private BaseThread oThread;
    private TextOutputRunnable toRunnable;

    /**
     * Instantiate a GameRunnable with the default severity value.
     */
    public GameRunnable()
    {
        super();
        textSequence = new ArrayList<>();
        oThread = null;
        toRunnable = null;
        outputList = new LinkedList<String>();
    }
    
    /**
     * Instantiate a GameRunnable with a specific severity value.
     * @param severity
     *            How important the execution of this thread is. (0: Not so
     *            important, 1: Meh, 2: Very important).
     */
    public GameRunnable(int severity)
    {
        super(severity);
        textSequence = new ArrayList<>();
        oThread = null;
        toRunnable = null;
        outputList = new LinkedList<String>();
    }

    /**
     * Append a TextLine object to the text sequence of this game.
     * @param tl
     *      TextLine object to append
     */
    public void addTextLine(TextLine tl)
    {
        textSequence.add(tl);
    }

    /**
     * Set the memory for this instance.
     * @param mem
     *      Memory object to set.
     */
    public void setMemory(Memory mem)
    {
        lookUp = mem;
    }

    /**
     * Starting the thread runs the game.
     * Currently does not terminate.
     */
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

    /**
     * For each TextLine, evaluate their conditions and print(queue) them when satisfied.
     * @throws InterruptedException
     */
    private void doWork() throws InterruptedException
    {
        while (!textSequence.isEmpty())
        {
            TextLine curr = textSequence.remove(0);
            ArrayList<EvaluationTree> evtList = curr.getEvaluationTreeList();
            boolean isValid = true;
            //Check conditions using the memory of this instance.
            for (EvaluationTree evt : evtList)
                if (!evt.evaluate(lookUp)) isValid = false;
            if (isValid || evtList.isEmpty())
            {
                outputList.add(curr.speak());
                if (curr.getType() == TextLine.CHOICE_TEXTLINE)
                {
                    outputList.add(((ChoiceTextLine) curr).getChoiceIdentifiers());
                    //Wait for user input.
                    ArrayList<KarmaOperation> kop = ((ChoiceTextLine) curr).choose();
                    for (KarmaOperation k : kop)
                        k.evaluate(lookUp);
                }
            }
        }
    }

}
