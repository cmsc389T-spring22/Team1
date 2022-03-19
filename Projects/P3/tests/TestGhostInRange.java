import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,12));
		Ghost ghost = frame.addGhost(new Location(10,12), "Test", Color.black);
		assertTrue(pac.is_ghost_in_range());
	}
}
