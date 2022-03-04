import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,12));
		Ghost ghost = frame.addGhost(new Location(10,12), "Test", Color.black);
		assertTrue(frame.getMap().attack("Test") == true);
	}
}
