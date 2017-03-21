package mainPackage;

import java.util.LinkedList;

import threading.runnables.TextOutputRunnable;
import threading.threads.OutputThread;

public class MainGame {

	public static void main(String[] args) throws InterruptedException 
	{
		TextOutputRunnable runobj = new TextOutputRunnable();
		LinkedList<String> txtqueue = runobj.getOutputQueue();
		OutputThread opthrd = new OutputThread(runobj);
		opthrd.start();
		txtqueue.add("Testing cool output");
		txtqueue.add("Still testing cool output");
		while(true)
		{
			Thread.sleep(1000);
			txtqueue.add("Surprise still testing");
		}
	}

}
