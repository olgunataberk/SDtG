package mainPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import parsing.GameParser;
import threading.runnables.GameRunnable;
import utilities.ExecutableCreator;

public class SdtgMain {
    
    public static void main(String[] args)
    {
        Logger.getGlobal().log(Level.INFO,"Working directory: "+System.getProperty("user.dir"));
        //File containing the script.
        System.out.println("Please enter the path for your script...");
        Scanner keyb = new Scanner(System.in);
        String expFileName = keyb.nextLine();
        try
        {
            FileInputStream fis = new FileInputStream(expFileName);
            //Initialize a game instance.
            GameRunnable mainGame = new GameRunnable(0);
            //Parse script.
            GameParser gp = new GameParser();
            gp.parse(fis, mainGame);
            //Create an executable using parsed script.
            ExecutableCreator ec = new ExecutableCreator();
            if(ec.createExecutable(mainGame))
                Logger.getGlobal().log(Level.INFO, "Successfully created executable.");
        }
        catch(IOException ioe)
        {
            Logger.getGlobal().log(Level.SEVERE, "Invalid path or you might not have permissions. Exception: ");
            Logger.getGlobal().log(Level.SEVERE, ioe.getMessage());
        }
    }

}
