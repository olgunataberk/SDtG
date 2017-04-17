package gameObjects;

import preferences.Config;

public class PlayerTextLine extends TextLine {

    public PlayerTextLine(String line)
    {
        this.type = REGULAR_TEXTLINE;
        this.subject = Config.PlayerConfig.playerName;
        this.line = line;
    }
}
