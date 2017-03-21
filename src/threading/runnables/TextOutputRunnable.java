package threading.runnables;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextOutputRunnable implements Runnable {

	private static final int SLEEP_IDLE = 50;
	private static final int SLEEP_INTERPRINT = 40;
	private static final char DELIMITER = '\n';
	
	// TODO try and make a write only(from outside) linked list.
	private LinkedList<String> outputQueue;
	
	public TextOutputRunnable() 
	{
		outputQueue = new LinkedList<String>();
	}

	@Override
	public void run() 
	{
		try
		{
			while(true)
			{
				if(outputQueue.size()>0)
				{
					String str = outputQueue.removeFirst();
					for(int i = 0 ; i < str.length() ; i++)
					{
						outputChar(str.charAt(i));
						Thread.sleep(SLEEP_INTERPRINT);
					}
					outputChar(DELIMITER);
				}
				Thread.sleep(SLEEP_IDLE);
			}
		}
		catch(InterruptedException exc){
			Logger.getGlobal().log(Level.SEVERE, exc.getMessage());
		}
	}
	
	public LinkedList<String> getOutputQueue()
	{
		return outputQueue;
	}
	
	private void outputChar(char c){
		System.out.print(c);
	}

}
