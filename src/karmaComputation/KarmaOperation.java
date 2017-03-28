package karmaComputation;

public class KarmaOperation {

    private String id;
    private int literal;
    private char operator;
    
    public KarmaOperation(String varName,char op ,int operand)
    {
        this.id = varName;
        this.operator = op;
        this.literal = operand;
    }
    
}
