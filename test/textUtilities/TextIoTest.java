package textUtilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TextIoTest {

	TextWriter tw;
	TextReader tr;
	
	@Before
	public void setUp() throws Exception {
		tw = new TextWriter();
		tr = new TextReader();				
	}

	@Test
	public void testInputOutput() {
		ArrayList<Character> smpIn = new ArrayList<>();
		smpIn.add('e'); smpIn.add('b');
		tw.writeObject(smpIn);
		assertTrue(tr.readObject().get(0) == 'e');
	}

}
