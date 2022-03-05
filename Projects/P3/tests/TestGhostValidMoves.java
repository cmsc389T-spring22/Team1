
import junit.framework.*;
import java.awt.Color;
import java.io.*;
public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Ghost gh = frame.addGhost(new Location(9,11), "Hi", Color.BLACK);
		Map map = frame.getMap();
		ArrayList<Location> s = new ArrayList();
		assertTrue(gh.get_valid_moves().contains(new Location(9,12)));
		assertTrue(gh.get_valid_moves().contains(new Location(10,11)));
	}
}
