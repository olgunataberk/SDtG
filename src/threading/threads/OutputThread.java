package threading.threads;

public class OutputThread extends Thread {

    private Runnable currentRunnable;

    public OutputThread(Runnable robj)
    {
        super(robj);
        currentRunnable = robj;
    }

}