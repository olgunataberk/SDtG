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

    private void KARMA_DECLARATION_SECTION()
    {
        
    }
    
    private void IDENTIFIER_LIST()
    {
        
    }
  
    private void SCRIPT_SECTION()
    {
    
    }
    
}
