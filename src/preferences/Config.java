package preferences;

import java.io.Serializable;

/**
 * Holds information about user's preferences.
 *
 */
public class Config implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1689231895214889424L;

    /**
     * Holds information regarding player's preferences.
     *
     */
    public static class PlayerConfig {
        public static String playerName;
    }

}
