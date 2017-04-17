package mainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import parsing.GameParser;
import threading.runnables.GameRunnable;
import threading.threads.BaseThread;

public class SdtgMain {

    public static void main(String[] args) throws Exception
    {
        String expFileName = "Example.txt";
        FileInputStream fis = new FileInputStream(expFileName);
        GameRunnable mainGame = new GameRunnable(0);
        GameParser gp = new GameParser();
        gp.parse(fis, mainGame);
        BaseThread gameCapsule = new BaseThread(mainGame);
        gameCapsule.start();
    }

}
