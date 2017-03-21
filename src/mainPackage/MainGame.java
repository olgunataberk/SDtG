package mainPackage;

import java.util.LinkedList;

import threading.runnables.TextOutputRunnable;
import threading.threads.OutputThread;

public class MainGame {

    public static void main(String[] args) throws InterruptedException
    {
        LinkedList<String> txtqueue = new LinkedList<String>();
        TextOutputRunnable runobj = new TextOutputRunnable(2, txtqueue);
        OutputThread opthrd = new OutputThread(runobj);
        opthrd.start();
        txtqueue.add("Testing cool output");
        txtqueue.add("Still testing cool output");
        while (true)
        {
            Thread.sleep(5000);
            txtqueue.add("Surprise still testing, Actually testing long long output just so I can judge better with my eyes.");
        }
    }

}
