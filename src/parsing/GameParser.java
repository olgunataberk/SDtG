package parsing;

import antlr.SdtgLexer;
import antlr.SdtgParser;
import gameObjects.Game;

import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Turn text input into rich TextLine objects.
 */
public class GameParser {

    public GameParser()
    {
        
    }

    public void parse(InputStream inputStream,Game game) throws Exception
    {
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        SdtgLexer lexer = new SdtgLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SdtgParser parser = new SdtgParser(tokens);
        ParseTree tree = parser.game();
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new ParseTreeListener(game);
        walker.walk(listener, tree);

    }

}
