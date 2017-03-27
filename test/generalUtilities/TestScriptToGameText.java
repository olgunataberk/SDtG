package generalUtilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import gameObjects.TextLine;
import parsing.GameParser;

public class TestScriptToGameText {

    ScriptToGameText testObj;
    GameParser helperObj;

    @Before
    public void setUp()
    {
        helperObj = new GameParser();
        testObj = new ScriptToGameText(helperObj);
    }

    @Test
    public void testSimpleLine()
    {
        String aLine = testObj.convert("MehmetTan: Testing 101.").get(0).speak();
        assertTrue(aLine.equals("MehmetTan: Testing 101."));
    }

    @Test
    public void testMultipleLines()
    {
        ArrayList<TextLine> txtLn = testObj.convert("MehmetTan: Testing 101.\nOsmanAbul: Di mi?");
        assertTrue(txtLn.get(0).speak().equals("MehmetTan: Testing 101.")
                && txtLn.get(1).speak().equals("OsmanAbul: Di mi?"));
    }

    @Test
    public void testFileInput()
    {
        ArrayList<TextLine> txtLn = testObj.convertFromFile("WrittenStuff\\GameScript.txt");
        for (TextLine txt : txtLn)
            System.out.println(txt.speak());
        assertTrue(txtLn.size() > 10);
    }

    @Test
    public void testWrongInput()
    {
        assertTrue(testObj.convert("MehmetTan Testing 101").size() == 0);
    }

}
