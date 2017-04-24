package karmaComputation;

import java.io.Serializable;

import memory.Memory;

public class KarmaOperation implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 7131594369292280764L;
    private String id;
    private int literal;
    private char operator;

    public KarmaOperation(String varName, char op, int operand)
    {
        this.id = varName;
        this.operator = op;
        this.literal = operand;
    }

    public void evaluate(Memory mem)
    {
        int tmp;
        switch (operator) {
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
