package karmaComputation;

import java.io.Serializable;
import java.util.ArrayList;

import memory.Memory;

/**
 * Tree representing a boolean expression.
 * 
 */
public class EvaluationTree implements Serializable{

    private static final long serialVersionUID = 8447252879168619273L;

    public class Node implements Serializable{

        private static final long serialVersionUID = -9218852452364269112L;
        
        private static final int CONDITION = 0;
        private static final int OPERATOR = 1;

        private String condition;
        private char operator;
        int type;

        private Node parent;
        private ArrayList<Node> children;

        private Node()
        {
            children = new ArrayList<Node>();
        }
        
        /**
         * Create a node that represents a condition
         * @param cond a boolean expression with 2 operands.
         * @parent parent of the instantiated node.
         */
        public Node(String cond, Node parent)
        {
            this();
            condition = cond;
            type = CONDITION;
            this.parent = parent;
        }

        /**
         * Create a node that represents an operator.
         * @param op a boolean operator.
         * @param parent parent of the instantiated node.
         */
        public Node(char op, Node parent)
        {
            this();
            operator = op;
            type = OPERATOR;
            this.parent = parent;
        }

        public Node getChild(int i)
        {
            return children.get(i);
        }

        public Node getParent()
        {
            //Logger.getGlobal().log(Level.INFO, "getParentCalled on node: " + (type == 1 ? operator : condition));
            return this.parent;
        }

        public void addChild(Node n)
        {
            //Logger.getGlobal().log(Level.INFO, "addChildCalled on node: " + (type == 1 ? operator : condition));
            this.children.add(n);
        }

    }

    private Memory memRef;
    private Node root;

    /**
     * Instantiate a tree with only one node.
     */
    public EvaluationTree()
    {
        root = new Node();
        memRef = null;
    }

    public Node getRoot()
    {
        return root;
    }

    /**
     * Evaluate the expression by traversing the tree.
     * @param mem memory instance to use when looking-up karma variables.
     * @return the result of a boolean expression.
     */
    public boolean evaluate(Memory mem)
    {
        if (root.children.size() == 0) return true;
        memRef = mem;
        boolean temp = evaluateTree(root.children.get(0));
        memRef = null;
        return temp;
    }

    private boolean evaluateTree(Node v)
    {
        if (v.type == Node.OPERATOR && v.children.size() > 1)
            return evaluateExpression(evaluateTree(v.children.get(0)), evaluateTree(v.children.get(1)), v.operator);
        else if (v.type == Node.OPERATOR)
            return evaluateExpression(evaluateTree(v.children.get(0)), false, '!');
        else
            return evaluateRelationalExpression(v.condition);

    }

    /**
     * Evaluate a conditional operation at a leaf node.
     */
    private boolean evaluateRelationalExpression(String exp)
    {
        if (exp.contains("<="))
        {
            String[] id = exp.split("<=");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 <= v2;
        }
        if (exp.contains("<"))
        {
            String[] id = exp.split("<");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 < v2;
        }
        if (exp.contains(">="))
        {
            String[] id = exp.split(">=");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 >= v2;
        }
        if (exp.contains(">"))
        {
            String[] id = exp.split(">");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 > v2;
        }
        if (exp.contains("=="))
        {
            String[] id = exp.split("==");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 == v2;
        }
        if (exp.contains("!="))
        {
            String[] id = exp.split("!=");
            int v1 = memRef.getValue(id[0]);
            int v2 = Integer.parseInt(id[1]);
            return v1 != v2;
        }
        return false;
    }

    private boolean evaluateExpression(boolean val1, boolean val2, char op)
    {
        if (op == '|') return val1 | val2;
        if (op == '!')
            return !val1;
        else
            return val1 & val2;
    }

}
