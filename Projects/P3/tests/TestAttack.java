import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost gh = frame.addGhost(new Location(9,11), "Ghost", Color.red);
		PacMan pac = frame.addPacMan(new Location(9,12));
		assertTrue(gh.attack());
	}
}
