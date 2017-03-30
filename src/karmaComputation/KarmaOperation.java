package karmaComputation;

import memory.Memory;

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
    
    public void evaluate(Memory mem)
    {
        int tmp;
        switch(operator)
        {
            case '+':
                tmp = mem.getValue(id);
                mem.setValue(id, tmp + literal);
                break;
            case '-':
                tmp = mem.getValue(id);
                mem.setValue(id, tmp - literal);
                break;
            case '/':
                tmp = mem.getValue(id);
                mem.setValue(id, tmp / literal);
                break;
            case '*':
                tmp = mem.getValue(id);
                mem.setValue(id, tmp * literal);
                break;
        }
    }
    
}
