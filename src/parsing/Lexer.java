package parsing;

import java.io.InputStream;
import java.util.Scanner;

public class Lexer {

    private Scanner scn;
    
    //TODO might want to reduce the size of this string.
    private String buffer;
    //Points to buffer's active location.
    private int pointer;
    //Holds lexeme of a token after it is read.
    public String read_text;
    public String read_type;
    
    public Lexer(InputStream fis)
    {
        pointer = 0;
        buffer = "";
        scn = new Scanner(fis);
        while(scn.hasNextLine())
            buffer += scn.nextLine() + "\n";
        buffer = buffer.trim();
        scn.close();
    }

    public boolean lex()
    {
        if(buffer.charAt(pointer) == '\"')
            read_string_token();
        else if(buffer.startsWith(Tokens.KARMA_START_TOKEN,pointer))
            read_karma_start_token();
        else if(buffer.startsWith(Tokens.KARMA_END_TOKEN,pointer))
            read_karma_end_token();
        else if(buffer.startsWith(Tokens.AND_TOKEN,pointer))
            read_and_token();
        else if(buffer.startsWith(Tokens.OR_TOKEN,pointer))
            read_or_token();
        else if(buffer.startsWith(Tokens.NOT_TOKEN,pointer))
            read_not_token();
        else if(buffer.startsWith(Tokens.NEWLINE_TOKEN,pointer))
            read_newline_token();
        else if(buffer.startsWith(Tokens.SCRIPT_START_TOKEN,pointer))
            read_script_start_token();
        else if(buffer.startsWith(Tokens.SCRIPT_END_TOKEN,pointer))
            read_script_end_token();
        else if(buffer.startsWith(Tokens.CHOICE_START_TOKEN,pointer))
            read_choice_start_token();
        else if(buffer.startsWith(Tokens.CHOICE_END_TOKEN,pointer))
            read_choice_end_token();
        else if(is_operator(buffer.substring(pointer,pointer + 1))) //TODO not enough
            read_operator_token();
        else if(is_relational_operator(buffer.substring(pointer,pointer + 1))) //TODO not enough
            read_choice_start_token();
        else if(buffer.startsWith("[0-9]",pointer))
            read_integer_token();
        else if(buffer.startsWith("[a-zA-Z]",pointer))
            read_identifier_token();
        else
            return false;
        return true;
    }
    
    public void unlex(int length)
    {
        pointer--;
        while(buffer.charAt(pointer)==' ')
            pointer--;
        pointer -= (length-1);
    }
    
    private String next_one_of(String[] read_these)
    {
        for(int i = 0 ; i < read_these.length ; i++)
            if(buffer.startsWith(read_these[i],pointer))
            {
                pointer += read_these[i].length();
                skip_whitespace();
                return read_these[i];
            }
        return "Token_Mismatch: " + buffer.substring(pointer, pointer + 15);
    }
    
    private String next(String read_this)
    {
        String temp = buffer.substring(pointer, pointer + read_this.length());
        pointer += (read_this.length() + 1);
        skip_whitespace();
        return temp;
    }
    
    private String next_delimiter(String delimiter)
    {
        String temp = buffer.substring(pointer, buffer.indexOf("delimiter",pointer + 1));
        pointer += temp.length();
        skip_whitespace();
        return temp;
    }
    
    private void skip_whitespace()
    {
        while(buffer.charAt(pointer) == '\t' || buffer.charAt(pointer) == ' ')
            pointer++;
    }
    
    private void read_karma_start_token()
    {
        String read = next(Tokens.KARMA_START_TOKEN);
        read_text = read;
    }
    
    private void read_karma_end_token()
    {
        String read = next(Tokens.KARMA_END_TOKEN);
        read_text = read;
    }
    
    private void read_newline_token()
    {
        String read = next(Tokens.NEWLINE_TOKEN);
        read_text = read;
    }
    
    //TODO delimiter is too specific
    private void read_identifier_token()
    {
        String read = next_delimiter(" ");
        read_text = read;
        read_type = "identifier";
    }
    
    private void read_script_start_token()
    {
        String read = next(Tokens.SCRIPT_START_TOKEN);
        read_text = read;
    }
    private void read_script_end_token()
    {
        String read = next(Tokens.SCRIPT_END_TOKEN);
        read_text = read;
    }

    private void read_string_token()
    {
        String read = next_delimiter("\"");
        read_text = read;
        read_type = "string";
    }
    
    private void read_choice_start_token()
    {
        String read = next(Tokens.CHOICE_START_TOKEN);
        read_text = read;
    }
    
    private void read_choice_end_token()
    {
        String read = next(Tokens.CHOICE_END_TOKEN);
        read_text = read;
    }
    
    private void read_operator_token()
    {
        String read = next_one_of(new String[]{"+","-","/","*"});
        read_text = read;
    }
    
    private boolean is_operator(String str)
    {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    
    //TODO delimiter is too specific
    private void read_integer_token()
    {
        String read = next_delimiter(" ");
        read_text = read;
        read_type = "integer";
    }
    
    private void read_or_token()
    {
        String read = next(Tokens.OR_TOKEN);
        read_text = read;
    }
    
    private void read_and_token()
    {
        String read = next(Tokens.AND_TOKEN);
        read_text = read;
    }
    
    private void read_not_token()
    {
        String read = next(Tokens.NOT_TOKEN);
        read_text = read;
    }
    
    public boolean read_relational_operator_token()
    {
        String read = next_one_of(new String[]{"<","<=",">",">=","=","!="});
        if(is_relational_operator(read))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    private boolean is_relational_operator(String str)
    {
        return str.equals("<") || str.equals("<=") || str.equals(">") || str.equals(">=")
                    || str.equals("=") || str.equals("!=");
    }
    
}
