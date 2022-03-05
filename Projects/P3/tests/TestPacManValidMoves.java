import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		Pacman gh = frame.addPacman(new Location(9,11));
		Map map = frame.getMap();
		ArrayList<Location> s = new ArrayList();
		assertTrue(gh.get_valid_moves().contains(new Location(9,12)));
		assertTrue(gh.get_valid_moves().contains(new Location(10,11)));
	}
}
