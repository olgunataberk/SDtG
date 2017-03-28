package gameObjects;

import java.util.ArrayList;

import karmaComputation.KarmaOperation;

public class ChoicePrompt extends TextLine{

    public class Choice
    {
        private String prompt;
        private ArrayList<KarmaOperation> kexp;
        
        public Choice(String p)
        {
            this.prompt = p;
            kexp = new ArrayList<>();
        }
        
        public void addKarmaExpression(KarmaOperation ke)
        {
            this.kexp.add(ke);
        }
    }
    
    private ArrayList<Choice> choiceList = new ArrayList<>();
    
    public ChoicePrompt(String sub, String line)
    {
        this.subject = sub;
        this.line = line;
    }
    
    public void addChoice(Choice c)
    {
        choiceList.add(c);
    }

}
