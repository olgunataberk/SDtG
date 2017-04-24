package gameObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import karmaComputation.KarmaOperation;

/**
 * 
 * 
 *
 */
public class ChoicePrompt extends TextLine{

    /**
     * 
     */
    private static final long serialVersionUID = 5238068510038205703L;

    public class Choice implements Serializable{
        /**
         * 
         */
        private static final long serialVersionUID = -3124120028332110196L;
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

        private ArrayList<KarmaOperation> returnProcess()
        {
            return kexp;
        }
    }

    private ArrayList<Choice> choiceList = new ArrayList<>();

    public ChoicePrompt(String sub, String line)
    {
        this.type = CHOICE_TEXTLINE;
        this.subject = sub;
        this.line = line;
    }

    public void addChoice(Choice c)
    {
        choiceList.add(c);
    }

    public String getChoiceIdentifiers()
    {
        String ret = "";
        for (int i = 0; i < choiceList.size(); i++)
            ret += choiceList.get(i).prompt + "|";
        return ret.substring(0, ret.length() - 1);
    }

    public ArrayList<KarmaOperation> choose()
    {
        Scanner k = new Scanner(System.in);
        do
        {
            String in = k.nextLine();
            in = "\"" + in + "\"";
            for (int i = 0; i < choiceList.size(); i++)
            {
                if (choiceList.get(i).prompt.equalsIgnoreCase(in))
                {
                    ArrayList<KarmaOperation> tmp = choiceList.get(i).returnProcess();
                    k.close();
                    return tmp;
                }
            }
            System.out.println("Wrong input!");
        } while (true);
    }

}
