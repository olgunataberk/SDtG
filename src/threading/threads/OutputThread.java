package threading.threads;

/**
 * Thread class that handles various types of output.
 * @author ataberk
 *
 */
public class OutputThread extends Thread {

    private Runnable currentRunnable;

    public OutputThread(Runnable robj)
    {
        super(robj);
        currentRunnable = robj;
    }

}
