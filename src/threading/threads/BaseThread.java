package threading.threads;

/**
 * Thread handling lots of stuff.
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
