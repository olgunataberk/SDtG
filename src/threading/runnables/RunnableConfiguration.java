package threading.runnables;

/**
 * Contains information on how a runnable should run.
 * @author ataberk
 *
 */
public class RunnableConfiguration {

    protected static final int SLEEP_IDLE = 50;
    protected int UPDATE_DELAY;
    
    /**
     * 
     * @param SEVERITY How important the execution of this thread is. (0: Not so important, 1: Meh, 2: Very important).
     */
    public RunnableConfiguration(int SEVERITY)
    {
        switch(SEVERITY){
            case 0:
                UPDATE_DELAY = 5;
            case 1:    
                UPDATE_DELAY = 3;
            case 2:
                UPDATE_DELAY = 1;
            default:
                UPDATE_DELAY = 5;
        }
    }
}
