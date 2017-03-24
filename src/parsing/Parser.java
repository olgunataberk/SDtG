package parsing;

public class Parser {

    private Lexer lexer;
    
    public Parser(Lexer lxr)
    {
        this.lexer = lexer;
    }
    
    public void parse()
    {
        KARMA_DECLARATION_SECTION();
        SCRIPT_SECTION();
    }

    private void KARMA_DECLARATION_SECTION()
    {
        lexer.read_karma_start_token();
        lexer.read_newline_token();
        lexer.read_basic_token('(');
        IDENTIFIER_LIST();
        lexer.read_basic_token(')');
        lexer.read_karma_end_token();
    }
    
    private void IDENTIFIER_LIST()
    {
        lexer.read_identifier();
        //Do something here
        if(lexer.read_basic_token(','))
            IDENTIFIER_LIST();
    }
  
    private void SCRIPT_SECTION()
    {
    
    }
    
}
