package parsing;

import antlr.SdtgLexer;
import gameObjects.NpcTextLine;
import gameObjects.PlayerTextLine;
import gameObjects.TextLine;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Turn text input into rich TextLine objects.
 *
 */
public class GameParser {

    /*
    public static void run(InputStream inputStream) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        SdtgLexer lexer = new SdtgLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SdtgParser parser = new SdtgParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ParseTreeListener();
        walker.walk(listener, tree);

    }
    */
    /**
     * given a line return a TextLine Object
     * 
     * @param line
     * @return TextLine object specified by the given string.
     */
    public TextLine parseLine(String line)
    {
        TextLine toReturn = null;
        if (checkFormat(line))
        {
            String subj = line.substring(0, line.indexOf(":"));
            String ln = line.substring(line.indexOf(":") + 1).trim();
            if (subj.equalsIgnoreCase("player"))
                toReturn = new PlayerTextLine(ln);
            else
                toReturn = new NpcTextLine(subj, ln);
        }
        else
            Logger.getGlobal().log(Level.WARNING, "Syntax Error on line: " + line);
        return toReturn;
    }

    /**
     * TODO obviously needs improvement. if it has ":" somewhere along the line
     * (haha) it is ok.
     * 
     * @param line
     *            line to apply check on.
     * @return if line is parseable or not.
     */
    private boolean checkFormat(String line)
    {
        return line.contains(":");
    }

}
