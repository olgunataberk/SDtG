package threading.threads;

/**
 * Thread handling various types of output.
 *
 */
public class GeneralThread extends Thread {

    private Runnable currentRunnable;

    public GeneralThread(Runnable robj)
    {
        super(robj);
        currentRunnable = robj;
    }

}
