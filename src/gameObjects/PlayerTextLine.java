package gameObjects;

import preferences.Config;

public class PlayerTextLine extends TextLine {

    /**
     * 
     */
    private static final long serialVersionUID = 5129815107062105661L;

    public PlayerTextLine(String line)
    {
        this.type = REGULAR_TEXTLINE;
        this.subject = Config.PlayerConfig.playerName;
        this.line = line;
    }
}
