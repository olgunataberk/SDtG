package textUtilities;

import java.util.ArrayList;

public class TextEncoder extends TextCryption {

    /**
     * Currently only converts text to a list of characters, so RLE part is a
     * lie.
     * 
     * @param textToEncode
     *            Sentence(s) to run RLE on.
     * @return Run Length Encoding of the given string as an ArrayList of
     *         Integers.
     */
    public ArrayList<Character> encodeText(ArrayList<String> textToEncode)
    {
        ArrayList<Character> returnedList = new ArrayList<Character>();
        for (String str : textToEncode)
        {
            for (char c : str.toCharArray())
                returnedList.add(c);
            returnedList.add(DELIMITER);
        }
        return returnedList;
    }
}
