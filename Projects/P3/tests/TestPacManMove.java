import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		PacMan pac = frame.addPacMan(new Location(9,11));
		Ghost ghost = frame.addGhost(new Location(9,12), "g1", Color.black);
		Ghost ghost2 = frame.addGhost(new Location(8,11), "g2", Color.black);
		Ghost ghost3 = frame.addGhost(new Location(10,11), "g3", Color.black);
		Ghost ghost4 = frame.addGhost(new Location(9,10), "g4", Color.black);
		assertTrue(pac.move() == false);

	}
}
