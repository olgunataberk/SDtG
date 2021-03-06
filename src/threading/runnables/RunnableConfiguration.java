package threading.runnables;

import java.io.Serializable;

/**
 * Contains information on how a runnable should run.
 *
 */
public class RunnableConfiguration implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 7147017697994564546L;
    protected static final int SLEEP_IDLE = 50;
    protected int UPDATE_DELAY;

    
    public RunnableConfiguration()
    {
        UPDATE_DELAY = 5;
    }
    /**
     * 
     * @param SEVERITY
     *            How important the execution of this thread is. (0: Not so
     *            important, 1: Meh, 2: Very important).
     */
    public RunnableConfiguration(int SEVERITY)
    {
        switch (SEVERITY) {
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
