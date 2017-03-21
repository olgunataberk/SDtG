package textUsage;

import preferences.Config;

public class PlayerTextLine extends TextLine {

    public PlayerTextLine(String line)
    {
        this.subject = Config.PlayerConfig.playerName;
        this.line = line;
    }
}
