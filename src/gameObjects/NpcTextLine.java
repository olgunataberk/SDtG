package gameObjects;

public class NpcTextLine extends TextLine {

    public NpcTextLine(String sub, String line)
    {
        this.type = REGULAR_TEXTLINE;
        this.subject = sub;
        this.line = line;
    }
}
