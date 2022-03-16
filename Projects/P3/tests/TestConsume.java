import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,11));
		assertTrue(pac.consume() == null);
	}
}
