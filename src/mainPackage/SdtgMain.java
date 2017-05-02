package mainPackage;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import parsing.GameParser;
import threading.runnables.GameRunnable;
import utilities.ExecutableCreator;

public class SdtgMain {
    
    public static void main(String[] args) throws Exception
    {
        Logger.getGlobal().log(Level.INFO,"Working directory: "+System.getProperty("user.dir"));
        //File containing the script.
        String expFileName = "Example.txt";
        FileInputStream fis = new FileInputStream(expFileName);
        //Initialize a game instance.
        GameRunnable mainGame = new GameRunnable(0);
        //Parse script.
        GameParser gp = new GameParser();
        gp.parse(fis, mainGame);
        //Create an executable using parsed script.
        ExecutableCreator ec = new ExecutableCreator();
        ec.createExecutable(mainGame);
    }

}
