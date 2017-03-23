package parsing;

import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lexer {

    private Scanner scn;
    
    public String read_text;
    
    public Lexer(InputStream fis)
    {
        scn = new Scanner(fis);
    }

    public boolean read_karma_start_token()
    {
        String read = scn.next();
        if(read.equals("KARMA_DECLARATIONS"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_karma_end_token()
    {
        String read = scn.next();
        if(read.equals("END_KARMA_DECLARATIONS"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_newline_token()
    {
        String read = scn.next();
        if(read.equals("\n"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_identifier()
    {
        String read = scn.next();
        if(reserved_check(read))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    //TODO fill.
    private boolean reserved_check(String str)
    {
        return true;
    }
    
    public boolean read_script_start_token()
    {
        String read = scn.next();
        if(read.equals("SCRIPT"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    public boolean read_script_end_token()
    {
        String read = scn.next();
        if(read.equals("END_SCRIPT"))
        {
            read_text = read;
            return true;
        }
        return false;
    }

    public boolean read_string_token()
    {
        int limit = 100000;
        String read = scn.next();
        if(read.startsWith("\""))
        {
            do
            {
                read += " " + scn.next();
            } while (read.endsWith("\"") && (limit--)>0);
            
            if(limit>0)
            {
                read_text = read;
                return true;
            }
            Logger.getGlobal().log(Level.INFO, 
                    "Line is too long: " + read.substring(20) + "...");
        }
        return false;
    }
    
    public boolean read_choice_start_token()
    {
        String read = scn.next();
        if(read.equals("<"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_choice_end_token()
    {
        String read = scn.next();
        if(read.equals(">"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_operator_token()
    {
        String read = scn.next();
        if(isOperator(read))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    private boolean isOperator(String str)
    {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    
    public boolean read_integer_token()
    {
        String read = scn.next();
        for(int i = 0 ; i < read.length() ; i++)
        {
            if(!Character.isDigit(read.charAt(i)))
                    return false;
        }
        read_text = read;
        return true;
    }
    
    public boolean read_or_token()
    {
        String read = scn.next();
        if(read.equals("|"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_and_token()
    {
        String read = scn.next();
        if(read.equals("&"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_not_token()
    {
        String read = scn.next();
        if(read.equals("!"))
        {
            read_text = read;
            return true;
        }
        return false;
    }
    
    public boolean read_relational_operator_token()
    {
        String read = scn.next();
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
    
    public boolean read_basic_token(char match)
    {
        char read = scn.next(".").charAt(0);
        if(read == match)
            return true;
        return false;
    }
}
