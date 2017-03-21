package textUtilities;

import java.util.ArrayList;

public class TextDecoder extends TextCryption {

    /**
     * @param textToDecode
     *            byte data to apply decoding on.
     * @return String representation of the data as an ArrayList.
     */
    public ArrayList<String> decodeText(ArrayList<Character> textToDecode)
    {
        ArrayList<String> returnedList = new ArrayList<String>();
        String buffer = "";
        for (Character c : textToDecode)
        {
            if (c == DELIMITER)
            {
                returnedList.add(buffer);
                buffer = "";
            }
            else
                buffer += c;
        }
        return returnedList;
    }

}
