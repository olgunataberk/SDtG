package textUtilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TextEncoderTest {

    TextEncoder testObj;

    @Before
    public void setUp()
    {
        testObj = new TextEncoder();
    }

    @Test
    public void testSampleInput()
    {
        ArrayList<String> smpIn = new ArrayList<>();
        smpIn.add("abc");
        smpIn.add("def");
        ArrayList<Character> smpOut = testObj.encodeText(smpIn);
        assertTrue(smpOut.get(2) == 'c' && smpOut.get(5) == 'e');
    }

}
