package gameObjects;

import preferences.Config;

public class PlayerTextLine extends TextLine {

    //TODO this is not used yet.
    private static final long serialVersionUID = 5129815107062105661L;

    /**
     * Instantiate a regular textline with the subject's name specified elsewhere(Config).
     * @param line What player has to say.
     */
    public PlayerTextLine(String line)
    {
        this.type = REGULAR_TEXTLINE;
        this.subject = Config.PlayerConfig.playerName;
        this.line = line;
    }
}
