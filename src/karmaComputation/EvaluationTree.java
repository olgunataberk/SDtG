package karmaComputation;

import java.util.ArrayList;

import memory.Memory;

public class EvaluationTree{
    
    public class Node{
        
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
        
        public Node(String cond,Node parent)
        {
            this();
            condition = cond;
            type = CONDITION;
        }
        
        public Node(char op,Node parent)
        {
            this();
            operator = op;
            type = OPERATOR;
        }
        
        public Node getChild(int i)
        {
            return children.get(i);
        }
        
        public Node getParent()
        {
            return this.parent;
        }
        
        public void addChild(Node n)
        {
            this.children.add(n);
        }
        
    }
    
    private static Memory lookUp;
    private Node root;
    
    public EvaluationTree()
    {
        root = new Node();
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    /**
     * set the variable scope of computation.
     * @param mem Memory instance
     */
    public static void setMemory(Memory mem)
    {
        lookUp = mem;
    }
    
    public boolean evaluate()
    {
        
        return false;
    }
    
}
