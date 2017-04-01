package mainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import parsing.GameParser;
import threading.runnables.GameRunnable;
import threading.threads.GeneralThread;

public class SdtgMain {

    public static void main(String[] args) throws Exception
    {
        String expFileName = "Example.txt";
        FileInputStream fis = new FileInputStream(expFileName);
        GameRunnable mainGame = new GameRunnable();
        GameParser gp = new GameParser();
        gp.parse(fis, mainGame);
        GeneralThread gameCapsule = new GeneralThread(mainGame);
        gameCapsule.start();
    }

}
