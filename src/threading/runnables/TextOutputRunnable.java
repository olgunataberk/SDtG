package threading.runnables;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Runnable to be used for printing output to console.
 *
 */
public class TextOutputRunnable extends RunnableConfiguration implements Runnable {

    private static final long serialVersionUID = 8092209390290703303L;
    
    // TODO Fetch this information from somewhere else, as this might be changed
    // on runtime.
    private static final int SLEEP_INTERPRINT = 60;
    private static final char DELIMITER = '\n';

    // TODO try and make a write only(from outside) linked list.
    private LinkedList<String> outputQueue;

    /**
     * 
     * @param severity
     *            How important the execution of this thread is (Not important:
     *            0-1-2 :Very important).
     * @param outQue
     *            Queue to fetch strings from.
     */
    public TextOutputRunnable(int severity, LinkedList<String> outQue)
    {
        super(severity);
        outputQueue = outQue;
    }

    /**
     * Try outputting the first string on queue to console.
     */
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

    /**
     * Print the output line by line.
     * By changing the value of SLEEP_INTERPRINT, text output speed can be adjusted.
     * @throws InterruptedException
     */
    private void doWork() throws InterruptedException
    {
        if (!outputQueue.isEmpty())
        {
            String str = outputQueue.removeFirst();
            long lastWork = System.currentTimeMillis();
            for (int i = 0; i < str.length(); i++)
            {
                while (System.currentTimeMillis() - lastWork < SLEEP_INTERPRINT)
                {
                    Thread.sleep(UPDATE_DELAY);
                }
                System.out.print(str.charAt(i));
                lastWork = System.currentTimeMillis();
            }
            System.out.print(DELIMITER);
        }
    }

}
