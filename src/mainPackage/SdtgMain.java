package mainPackage;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import parsing.GameParser;
import threading.runnables.GameRunnable;
import threading.threads.BaseThread;
import utilities.ExecutableCreator;

public class SdtgMain {
    
    public static void main(String[] args) throws Exception
    {
        Logger.getGlobal().log(Level.INFO,"Working directory: "+System.getProperty("user.dir"));
        String expFileName = "Example.txt";
        FileInputStream fis = new FileInputStream(expFileName);
        GameRunnable mainGame = new GameRunnable(0);
        GameParser gp = new GameParser();
        gp.parse(fis, mainGame);
        ExecutableCreator ec = new ExecutableCreator();
        ec.createExecutable(mainGame);
        /*
        BaseThread gameCapsule = new BaseThread(mainGame);
        gameCapsule.start();
        */
    }

}
