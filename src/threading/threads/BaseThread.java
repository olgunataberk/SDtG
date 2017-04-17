package threading.threads;

/**
 * Thread handling various types of output.
 *
 */
public class BaseThread extends Thread {

    private Runnable currentRunnable;

    public BaseThread(Runnable robj)
    {
        super(robj);
        currentRunnable = robj;
    }

}
