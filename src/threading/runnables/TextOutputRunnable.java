package threading.runnables;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextOutputRunnable extends RunnableConfiguration implements Runnable {

    private static final int SLEEP_INTERPRINT = 40;
    private static final char DELIMITER = '\n';

    // TODO try and make a write only(from outside) linked list.
    private LinkedList<String> outputQueue;

    public TextOutputRunnable(int severity, LinkedList<String> outQue)
    {
        super(severity);
        outputQueue = outQue;
    }

    @Override
    public void run()
    {
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
        if (outputQueue.size() > 0)
        {
            String str = outputQueue.removeFirst();
            long lastWork = System.currentTimeMillis();
            for (int i = 0; i < str.length(); i++)
            {
                while(System.currentTimeMillis() - lastWork < SLEEP_INTERPRINT)
                {
                    Thread.sleep(UPDATE_DELAY);
                }
                outputChar(str.charAt(i));
                lastWork = System.currentTimeMillis();
            }
            outputChar(DELIMITER);
        }
    }

    private void outputChar(char c)
    {
        System.out.print(c);
    }

}
