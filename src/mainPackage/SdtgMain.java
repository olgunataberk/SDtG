package mainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import gameObjects.Game;
import parsing.GameParser;

public class SdtgMain {

    public static void main(String[] args) throws Exception
    {
        String expFileName = "Example.txt";
        FileInputStream fis = new FileInputStream(expFileName);
        Game mainGame = new Game();
        GameParser gp = new GameParser();
        gp.parse(fis, mainGame);
    }

}
