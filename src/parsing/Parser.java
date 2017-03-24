package parsing;

public class Parser {

    private Lexer lexer;
    
    public Parser(Lexer lxr)
    {
        this.lexer = lxr;
    }
    
    public void parse()
    {
        KARMA_DECLARATION_SECTION();
        SCRIPT_SECTION();
    }

    private boolean KARMA_DECLARATION_SECTION()
    {
        lexer.lex();
        if(lexer.read_text.equals(Tokens.KARMA_START_TOKEN))
        {
            lexer.lex();
            if(lexer.read_text.equals(Tokens.NEWLINE_TOKEN))
            {
                lexer.lex();
                if(lexer.read_text.equals(Tokens.LEFT_PARANTHESIS))
                {
                    IDENTIFIER_LIST();
                    lexer.lex();
                    if(lexer.read_text.equals(Tokens.RIGHT_PARANTHESIS))
                    {
                        lexer.lex();
                        if(lexer.read_text.equals(Tokens.KARMA_END_TOKEN))
                            return true;
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
    
    //TODO somehow peek at a token without lexer consuming it.
    private boolean IDENTIFIER_LIST()
    {
        lexer.lex();
        if(lexer.read_type.equals("identifier"))
        {
            //TODO fill.
            lexer.lex();
            if(lexer.read_text.equals(Tokens.COMMA))
                return IDENTIFIER_LIST();
            //TODO return the consumed string back to buffer.
            return true;
        }
        return false;
    }
  
    private void SCRIPT_SECTION()
    {
    
    }
    
    private void TEXT_LINE_LIST()
    {
        
    }
    
    private void TEXT_LINE()
    {
        
    }
    
    private void LINE()
    {
        
    }
    
    private void CHOICE_PROMPT()
    {
        
    }
    
    private void CHOICE_LIST()
    {
        
    }
    
    private void CHOICE_EXPRESSION()
    {
        
    }
    
    private void KARMA_OPERATION_LIST()
    {
    
    }
    
    private void KARMA_OPERATION()
    {
        
    }
    
    private void KARMA_EXPRESSION()
    {
        
    }
    
    private void KARMA_TERM()
    {
    
    }
    
    private void KARMA_FACTOR()
    {
        
    }
    
    private void KARMA_PRIMARY()
    {
        
    }
    
    private void KARMA_PREDICATE()
    {
        
    }
}
    
    
