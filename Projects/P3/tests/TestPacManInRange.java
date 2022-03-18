import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,12));
		Ghost ghost = frame.addGhost(new Location(10,12), "Test", Color.black);
		assertFalse(ghost.is_pacman_in_range() == true);
	}
}
