import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame2 = new NoFrame();
		Ghost ghost = frame2.addGhost(new Location(5,5), "g1", Color.black);
		assertTrue(ghost.move());
	}
}
