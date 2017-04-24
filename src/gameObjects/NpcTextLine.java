package gameObjects;

public class NpcTextLine extends TextLine {

    /**
     * 
     */
    private static final long serialVersionUID = -8646192798971575506L;

    public NpcTextLine(String sub, String line)
    {
        this.type = REGULAR_TEXTLINE;
        this.subject = sub;
        this.line = line;
    }
}
