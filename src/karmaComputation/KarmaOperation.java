package karmaComputation;

import java.io.Serializable;

import memory.Memory;

/**
 * Specifies the change in karma variables(when a choice is made).
 * 
 */
public class KarmaOperation implements Serializable{

    private static final long serialVersionUID = 7131594369292280764L;
    
    private String id;
    private int literal;
    private char operator;

    /**
     * @param varName karma variable to be changed.
     * @param op arithmetic operator.
     * @param operand an integer.
     */
    public KarmaOperation(String varName, char op, int operand)
    {
        this.id = varName;
        this.operator = op;
        this.literal = operand;
    }

    /**
     * Evaluate the expression.
     * @param mem Memory instance to use when evaluating.
     */
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
