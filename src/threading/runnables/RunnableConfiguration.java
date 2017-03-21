package threading.runnables;

public class RunnableConfiguration {

    protected static final int SLEEP_IDLE = 50;
    protected int UPDATE_DELAY;
    
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
